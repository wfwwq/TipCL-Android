package com.tipcl.android

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.annotation.StringRes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.lifecycleScope
import com.tipcl.android.core.launch.InstanceManager
import com.tipcl.android.core.launch.LaunchOptions
import com.tipcl.android.download.DownloadPhase
import com.tipcl.android.download.InstanceDownloadService
import com.tipcl.android.download.InstallState
import com.tipcl.android.download.VersionListItem
import com.tipcl.android.download.VersionRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.nio.file.Path
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter

/**
 * M4 启动页：实例列表（卡片）+ 新建实例向导 + 设置页。
 *
 * 导航结构（单 Activity，Compose 内部状态机路由）：
 * ```
 * LauncherActivity
 *  ├─ InstanceListScreen    实例卡片列表（长按删除，卡片"启动"→ GameHostActivity）
 *  ├─ NewInstanceWizard     选版本（联网清单）→ 选 loader → 命名 → 下载进度页（真数据）
 *  └─ SettingsScreen        内存 / JVM 参数 / 灵敏度 / 启用声音
 * ```
 *
 * 版本清单经 [VersionRepository] 联网拉取（内存 + 磁盘双缓存，失败回退缓存）；
 * 创建实例由 [InstanceDownloadService] 执行真实下载管线，UI 只订阅其 StateFlow。
 */
class LauncherActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        CrashReporter.install(this)
        // M6 巡检：debug 构建主线程 StrictMode（磁盘/网络违规 → logcat 报警）。
        StrictModeCompat.install(this)
        // 冷启动预热：在 IO 线程提前读完设置文件，主线程 load() 全走内存缓存。
        lifecycleScope.launch {
            TipCLSettingsStore.preload(applicationContext)
        }
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                TipCLApp()
            }
        }
    }
}

/** 路由目标。 */
private sealed interface Screen {
    data object InstanceList : Screen
    data object NewInstanceWizard : Screen
    data object Settings : Screen
    /** 单实例管理页（存档 / 资源包）。 */
    data class InstanceManage(val instanceId: String) : Screen
}

@Composable
private fun TipCLApp() {
    val context = LocalContext.current
    val store = remember { TipCLInstanceStore(context) }
    var screen by remember { mutableStateOf<Screen>(Screen.InstanceList) }
    var refreshKey by remember { mutableStateOf(0) }

    when (screen) {
        Screen.InstanceList -> InstanceListScreen(
            store = store,
            refreshKey = refreshKey,
            onNewInstance = { screen = Screen.NewInstanceWizard },
            onOpenSettings = { screen = Screen.Settings },
            onDeleted = { refreshKey++ },
            onManage = { screen = Screen.InstanceManage(it) },
        )
        is Screen.InstanceManage -> com.tipcl.android.manage.InstanceManageScreen(
            instanceId = (screen as Screen.InstanceManage).instanceId,
            instancesRoot = store.instancesRoot,
            appDataDir = context.filesDir,
            onBack = {
                refreshKey++
                screen = Screen.InstanceList
            },
        )
        Screen.NewInstanceWizard -> NewInstanceWizardScreen(
            store = store,
            onDone = {
                refreshKey++
                screen = Screen.InstanceList
            },
            onCancel = { screen = Screen.InstanceList },
        )
        Screen.Settings -> SettingsScreen(
            onBack = { screen = Screen.InstanceList },
        )
    }
}

// ---------------------------------------------------------------- 实例列表

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun InstanceListScreen(
    store: TipCLInstanceStore,
    refreshKey: Int,
    onNewInstance: () -> Unit,
    onOpenSettings: () -> Unit,
    onDeleted: () -> Unit,
    onManage: (String) -> Unit,
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    // M6：实例元数据改为异步加载（IO 线程读 SharedPreferences），首帧前显示骨架态。
    var metas by remember(refreshKey) { mutableStateOf<List<InstanceMeta>?>(null) }
    LaunchedEffect(refreshKey) {
        metas = withContext(Dispatchers.IO) { store.list() }
    }
    var pendingDelete by remember { mutableStateOf<InstanceMeta?>(null) }
    var longPressed by remember { mutableStateOf<InstanceMeta?>(null) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(strInstanceListTitle()) },
                actions = { TextButton(onClick = onOpenSettings) { Text(strSettings()) } },
            )
        },
    ) { padding ->
        Column(
            Modifier.padding(padding).fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Box(Modifier.weight(1f)) {
                when (val loaded = metas) {
                    null -> Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator()
                    }
                    else -> if (loaded.isEmpty()) {
                        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                            Text(strEmptyHint(), color = MaterialTheme.colorScheme.onSurfaceVariant)
                        }
                    } else {
                        LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            items(loaded, key = { it.id }) { meta ->
                                InstanceCard(
                                    meta = meta,
                                    onLaunch = { launchInstance(context, store, meta.id) },
                                    onLongPress = { longPressed = meta },
                                )
                            }
                        }
                    }
                }
            }
            Button(onClick = onNewInstance, modifier = Modifier.fillMaxWidth()) {
                Text(strNewInstance())
            }
        }
    }

    // 长按菜单：管理（存档/资源包）或删除实例
    longPressed?.let { meta ->
        AlertDialog(
            onDismissRequest = { longPressed = null },
            title = { Text(meta.id) },
            text = { Text(strLongPressMenuHint()) },
            confirmButton = {
                TextButton(onClick = {
                    longPressed = null
                    onManage(meta.id)
                }) { Text(strManage()) }
            },
            dismissButton = {
                TextButton(onClick = {
                    longPressed = null
                    pendingDelete = meta
                }) { Text(strDelete()) }

            },
        )
    }

    pendingDelete?.let { meta ->
        AlertDialog(
            onDismissRequest = { pendingDelete = null },
            title = { Text(strDeleteTitle()) },
            text = { Text(strDeleteMessage(meta.id)) },
            confirmButton = {
                TextButton(onClick = {
                    pendingDelete = null
                    // 目录删除（core-launch 阻塞文件 API）+ 元数据落盘移到 IO 线程。
                    scope.launch {
                        withContext(Dispatchers.IO) {
                            runCatching {
                                InstanceManager(Path.of(store.instancesRoot.absolutePath)).deleteInstance(meta.id)
                            }
                            store.remove(meta.id)
                        }
                        onDeleted()
                    }
                }) { Text(strDelete()) }
            },
            dismissButton = {
                TextButton(onClick = { pendingDelete = null }) { Text(strCancel()) }
            },
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun InstanceCard(meta: InstanceMeta, onLaunch: () -> Unit, onLongPress: () -> Unit) {
    Card(
        modifier = Modifier.fillMaxWidth().combinedClickable(
            onClick = onLaunch,
            onLongClick = onLongPress,
        ),
    ) {
        Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            // 图标占位：按 loader 着色的圆形色块，正式图标资源后续接入。
            Box(
                Modifier.size(44.dp).background(loaderColor(meta.loader), CircleShape),
                contentAlignment = Alignment.Center,
            ) {
                Text(meta.loader.take(1).uppercase(), color = Color.White, fontSize = 18.sp)
            }
            Spacer(Modifier.width(12.dp))
            Column(Modifier.weight(1f)) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(meta.id, style = MaterialTheme.typography.titleMedium)
                    // loader 徽标：按 loader 着色的小标签，Forge 额外标注实验性。
                    Text(
                        text = if (meta.loader == "forge") strBadgeExperimental(meta.loader) else meta.loader,
                        style = MaterialTheme.typography.labelSmall,
                        color = Color.White,
                        modifier = Modifier
                            .background(loaderColor(meta.loader), RoundedCornerShape(4.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp),
                    )
                }
                Text(
                    "MC ${meta.mcVersion} · ${meta.loader}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                Text(
                    if (meta.lastPlayedAt > 0) strLastPlayed(formatTime(meta.lastPlayedAt)) else strNeverPlayed(),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
            Button(onClick = onLaunch) { Text(strLaunch()) }
        }
    }
}

private fun loaderColor(loader: String): Color = when (loader) {
    "forge" -> Color(0xFFC87A4B)
    "quilt" -> Color(0xFF9C6BD8)
    "fabric" -> Color(0xFFB8A15C)
    else -> Color(0xFF5C8A4E)
}

private fun formatTime(epochMs: Long): String =
    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        .withZone(ZoneId.systemDefault())
        .format(Instant.ofEpochMilli(epochMs))

/** 组装 LaunchOptions 摘要并进入 GameHostActivity（真实启动链路由 TipCLLaunchCoordinator 完成）。 */
private fun launchInstance(context: Context, store: TipCLInstanceStore, instanceId: String) {
    // 设置读取与 markPlayed 落盘都放 IO 线程，主线程只做跳转。
    val activity = context as? ComponentActivity ?: return
    activity.lifecycleScope.launch {
        val settings = withContext(Dispatchers.IO) { TipCLSettingsStore(context).load() }
        withContext(Dispatchers.IO) { store.markPlayed(instanceId) }
        val options = LaunchOptions(
            javaExecutable = "", // 运行时由 TipCLRuntimeProvisioner 按版本需求供给。
            minMemoryMb = settings.minMemoryMb,
            maxMemoryMb = settings.maxMemoryMb,
            extraJvmArgs = settings.extraJvmArgs.split(" ").filter { it.isNotBlank() },
            gameDirectory = store.instancesRoot.absolutePath,
            playerName = "Player",
        )
        val intent = Intent(context, GameHostActivity::class.java)
            .putExtra(GameHostActivity.EXTRA_INSTANCE_ID, instanceId)
            .putExtra(GameHostActivity.EXTRA_MIN_MEMORY_MB, options.minMemoryMb ?: -1)
            .putExtra(GameHostActivity.EXTRA_MAX_MEMORY_MB, options.maxMemoryMb ?: -1)
            .putExtra(GameHostActivity.EXTRA_JVM_ARGS, options.extraJvmArgs.toTypedArray())
            .putExtra(GameHostActivity.EXTRA_GAME_DIR, options.gameDirectory)
            .putExtra(GameHostActivity.EXTRA_PLAYER_NAME, options.playerName)
            .putExtra(GameHostActivity.EXTRA_SOUND_ENABLED, settings.soundEnabled)
        context.startActivity(intent)
    }
}

// ---------------------------------------------------------------- 新建向导

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun NewInstanceWizardScreen(store: TipCLInstanceStore, onDone: () -> Unit, onCancel: () -> Unit) {
    var step by remember { mutableStateOf(0) }
    var mcVersion by remember { mutableStateOf("") }
    var loader by remember { mutableStateOf("vanilla") }
    var loaderVersion by remember { mutableStateOf("") }
    var instanceName by remember { mutableStateOf("") }

    val context = LocalContext.current
    val downloadService = remember {
        val metaDir = java.io.File(store.instancesRoot, "meta").apply { mkdirs() }
        InstanceDownloadService(
            store.instancesRoot,
            metaDir,
            javaLocator = com.tipcl.android.download.ProvisionedJavaLocator(context.filesDir.toPath()),
            appContext = context.applicationContext,
        )
    }
    // 离开向导（取消/返回）时若任务仍在跑则兜底取消，避免后台孤儿下载。
    DisposableEffect(downloadService) {
        onDispose { downloadService.cancelIfRunning() }
    }
    val installState by downloadService.state.collectAsState()
    // 安装完成：写实例元数据，列表卡片即刷新为可启动态。
    LaunchedEffect(installState) {
        val done = installState as? InstallState.Completed ?: return@LaunchedEffect
        store.upsert(InstanceMeta(done.instanceId, mcVersion, loader, System.currentTimeMillis()))
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(strWizardTitle(step + 1)) },
                navigationIcon = { TextButton(onClick = onCancel) { Text(strCancel()) } },
            )
        },
    ) { padding ->
        when (step) {
            0 -> VersionPickStep(
                selected = mcVersion,
                onSelect = { mcVersion = it },
                onNext = { step = 1 },
            )
            1 -> LoaderPickStep(
                loader = loader,
                loaderVersion = loaderVersion,
                onLoaderChange = { loader = it },
                onLoaderVersionChange = { loaderVersion = it },
                onBack = { step = 0 },
                onNext = { step = 2 },
            )
            2 -> NamingStep(
                instanceName = instanceName,
                onNameChange = { instanceName = it },
                onBack = { step = 1 },
                onCreate = {
                    step = 3
                    downloadService.start(mcVersion, loader, loaderVersion, instanceName)
                },
            )
            3 -> DownloadProgressStep(
                store = store,
                service = downloadService,
                installState = installState,
                onDone = onDone,
                onBackToList = onCancel,
                onRetry = { downloadService.start(mcVersion, loader, loaderVersion, instanceName) },
            )
        }
    }
}

// ---------------------------------------------------------------- 步骤 0：联网选版本

private enum class VersionFilter(@StringRes val labelRes: Int) {
    ALL(R.string.filter_all), RELEASE(R.string.filter_release), SNAPSHOT(R.string.filter_snapshot),
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun VersionPickStep(selected: String, onSelect: (String) -> Unit, onNext: () -> Unit) {
    val context = LocalContext.current
    val repository = remember {
        val metaDir = java.io.File(java.io.File(context.filesDir, "instances"), "meta").apply { mkdirs() }
        VersionRepository(metaDir, appContext = context.applicationContext)
    }
    var versions by remember { mutableStateOf<List<VersionListItem>>(emptyList()) }
    var loading by remember { mutableStateOf(true) }
    var refreshing by remember { mutableStateOf(false) }
    var banner by remember { mutableStateOf<String?>(null) }
    var filter by remember { mutableStateOf(VersionFilter.ALL) }
    var query by remember { mutableStateOf("") }
    val scope = androidx.compose.runtime.rememberCoroutineScope()

    suspend fun load(forceRefresh: Boolean) {
        val result = repository.list(forceRefresh)
        versions = result.versions
        banner = result.error
        loading = false
        refreshing = false
    }
    LaunchedEffect(Unit) { load(false) }

    val filtered = versions.filter { v ->
        val typeOk = when (filter) {
            VersionFilter.ALL -> true
            VersionFilter.RELEASE -> v.type == "release"
            VersionFilter.SNAPSHOT -> v.type == "snapshot"
        }
        typeOk && (query.isBlank() || v.id.contains(query, ignoreCase = true))
    }

    Column(Modifier.fillMaxSize().padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(strWizardPickVersion())
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            VersionFilter.entries.forEach { f ->
                FilterChip(selected = filter == f, onClick = { filter = f }, label = { Text(stringResource(f.labelRes)) })
            }
        }
        OutlinedTextField(
            value = query,
            onValueChange = { query = it },
            label = { Text(strWizardVersionHint()) },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
        )
        banner?.let {
            Text(it, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.error)
        }
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(
                if (loading) strWizardLoadingList()
                else if (refreshing) strWizardRefreshing()
                else strWizardListCount(filtered.size),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                modifier = Modifier.weight(1f),
            )
            TextButton(
                enabled = !loading && !refreshing,
                onClick = {
                    refreshing = true
                    scope.launch { load(true) }
                },
            ) { Text(strWizardRefresh()) }
        }
        Box(Modifier.weight(1f).fillMaxWidth()) {
            if (loading) {
                Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(strWizardLoadingList())
                }
            } else {
                LazyColumn(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    if (filtered.isEmpty() && query.isNotBlank()) {
                        item {
                            Text(
                                strWizardManualFallback(query),
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                        }
                    }
                    items(filtered, key = { it.id }) { v ->
                        VersionRow(
                            item = v,
                            selected = selected == v.id,
                            onClick = { onSelect(v.id) },
                        )
                    }
                }
            }
        }
        // 清单为空（无网络且无缓存）时允许按输入的文本直接创建。
        Button(
            onClick = {
                if (selected.isBlank() && query.isNotBlank()) onSelect(query.trim())
                onNext()
            },
            enabled = selected.isNotBlank() || query.isNotBlank(),
            modifier = Modifier.fillMaxWidth(),
        ) { Text(strNext()) }
    }
}

@Composable
private fun VersionRow(item: VersionListItem, selected: Boolean, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 8.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            versionTypeLabel(item.type),
            modifier = Modifier
                .background(
                    when (item.type) {
                        "release" -> MaterialTheme.colorScheme.primaryContainer
                        else -> MaterialTheme.colorScheme.surfaceVariant
                    },
                    RoundedCornerShape(4.dp),
                )
                .padding(horizontal = 6.dp, vertical = 2.dp),
            style = MaterialTheme.typography.labelSmall,
        )
        Column(Modifier.weight(1f)) {
            Text(item.id, style = MaterialTheme.typography.bodyMedium)
            Text(
                stringResource(R.string.release_time, item.releaseTime.take(10)),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        if (selected) Text(strWizardSelected(), color = MaterialTheme.colorScheme.primary)
    }
}

// ---------------------------------------------------------------- 步骤 1：选 loader

@Composable
private fun LoaderPickStep(
    loader: String,
    loaderVersion: String,
    onLoaderChange: (String) -> Unit,
    onLoaderVersionChange: (String) -> Unit,
    onBack: () -> Unit,
    onNext: () -> Unit,
) {
    Column(
        Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(strWizardPickLoader())
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            listOf("vanilla", "fabric", "quilt", "forge").forEach { l ->
                FilterChip(
                    selected = loader == l,
                    onClick = { onLoaderChange(l) },
                    label = { Text(if (l == "forge") strLoaderLabelExperimental(l) else l) },
                )
            }
        }
        when (loader) {
            "forge" -> {
                Text(
                    strWizardForgeRisk(),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.error,
                )
            }
            else -> Text(
                strWizardLoaderHint(),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        if (loader != "vanilla") {
            OutlinedTextField(
                value = loaderVersion,
                onValueChange = { onLoaderVersionChange(it) },
                label = { Text(strWizardLoaderVersionHint(loader)) },
                modifier = Modifier.fillMaxWidth(),
            )
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = onBack) { Text(strBack()) }
            Button(onClick = onNext, enabled = loader == "vanilla" || loaderVersion.isNotBlank()) {
                Text(strNext())
            }
        }
    }
}

// ---------------------------------------------------------------- 步骤 2：命名

@Composable
private fun NamingStep(
    instanceName: String,
    onNameChange: (String) -> Unit,
    onBack: () -> Unit,
    onCreate: () -> Unit,
) {
    Column(
        Modifier.fillMaxSize().padding(16.dp).verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(strWizardNaming())
        OutlinedTextField(
            value = instanceName,
            onValueChange = { onNameChange(it) },
            label = { Text(strWizardNameHint()) },
            modifier = Modifier.fillMaxWidth(),
        )
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedButton(onClick = onBack) { Text(strBack()) }
            Button(onClick = onCreate, enabled = instanceName.isNotBlank()) { Text(strCreate()) }
        }
    }
}

// ---------------------------------------------------------------- 步骤 3：下载进度（真数据）

@Composable
private fun DownloadProgressStep(
    store: TipCLInstanceStore,
    service: InstanceDownloadService,
    installState: InstallState,
    onDone: () -> Unit,
    onBackToList: () -> Unit,
    onRetry: () -> Unit,
) {
    Column(
        Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Text(strWizardDownloading())
        when (val st = installState) {
            is InstallState.Running -> {
                val p = st.progress
                val ratio = if (p.totalBytes > 0) {
                    (p.downloadedBytes.toFloat() / p.totalBytes).coerceIn(0f, 1f)
                } else 0f
                LinearProgressIndicator(progress = { ratio }, modifier = Modifier.fillMaxWidth())
                Text(
                    strWizardPhase(p.phase) +
                        if (p.totalBytes > 0) "  ${(p.downloadedBytes / (1024.0 * 1024)).format1()}/${(p.totalBytes / (1024.0 * 1024)).format1()} MB" else "",
                    style = MaterialTheme.typography.bodyMedium,
                )
                if (p.filesTotal > 0) {
                    Text(
                        strWizardFiles(p.filesDone, p.filesTotal),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                if (p.currentFile.isNotBlank()) {
                    Text(
                        p.currentFile,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                Text(
                    strWizardSpeed(p.speedBps / (1024.0 * 1024)),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
                p.message?.let {
                    Text(
                        it,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                Button(
                    onClick = {
                        service.cancel()
                        onBackToList()
                    },
                    modifier = Modifier.fillMaxWidth(),
                ) { Text(strCancel()) }
            }
            is InstallState.Completed -> {
                Text(strWizardDone(), color = MaterialTheme.colorScheme.primary)
                st.warning?.let {
                    Text(
                        it,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.error,
                    )
                }
                Button(onClick = onDone, modifier = Modifier.fillMaxWidth()) { Text(strDone()) }
            }
            is InstallState.Failed -> {
                Text(
                    strWizardFailed(st.message),
                    color = MaterialTheme.colorScheme.error,
                    style = MaterialTheme.typography.bodyMedium,
                )
                // 重试：以相同参数重跑安装。已完成的 processor 由 outputs 校验自动跳过（断点续跑）。
                Button(onClick = onRetry, modifier = Modifier.fillMaxWidth()) { Text(strRetry()) }
                Button(onClick = onBackToList, modifier = Modifier.fillMaxWidth()) { Text(strBack()) }
            }
            InstallState.Idle -> {
                Text(strWizardPreparing())
            }
        }
    }
}

private fun Double.format1(): String = "%.1f".format(this)

// ---------------------------------------------------------------- 设置页

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SettingsScreen(onBack: () -> Unit) {
    val context = LocalContext.current
    val store = remember { TipCLSettingsStore(context) }
    // M6：设置加载走 IO 线程（通常已被冷启动预热命中内存），未就绪前显示骨架态。
    var settings by remember { mutableStateOf<LaunchSettings?>(null) }
    LaunchedEffect(Unit) {
        settings = withContext(Dispatchers.IO) { store.load() }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(strSettingsTitle()) },
                navigationIcon = { TextButton(onClick = onBack) { Text(strBack()) } },
            )
        },
    ) { padding ->
        val current = settings
        if (current == null) {
            Box(Modifier.padding(padding).fillMaxSize(), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
            return@Scaffold
        }
        Column(
            Modifier.padding(padding).fillMaxSize().padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Text(strMaxMemory(current.maxMemoryMb))
            Slider(
                value = current.maxMemoryMb.toFloat(),
                onValueChange = { settings = current.copy(maxMemoryMb = it.toInt()) },
                valueRange = 1024f..8192f,
            )
            OutlinedTextField(
                value = current.extraJvmArgs,
                onValueChange = { settings = current.copy(extraJvmArgs = it) },
                label = { Text(strJvmArgsLabel()) },
                modifier = Modifier.fillMaxWidth(),
            )
            Text(strSensitivity(current.touchSensitivity))
            Slider(
                value = current.touchSensitivity,
                onValueChange = { settings = current.copy(touchSensitivity = it) },
                valueRange = 0.2f..3.0f,
            )
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(strSoundEnabled())
                Switch(
                    checked = current.soundEnabled,
                    onCheckedChange = { settings = current.copy(soundEnabled = it) },
                )
            }
            Button(
                onClick = {
                    store.save(current)
                    onBack()
                },
                modifier = Modifier.fillMaxWidth(),
            ) { Text(strSave()) }
        }
    }
}

// ---------------------------------------------------------------- 文案（strings.xml 资源引用，中文默认 + values-en 英文）

@Composable private fun versionTypeLabel(type: String) = when (type) {
    "release" -> stringResource(R.string.version_type_release)
    "snapshot" -> stringResource(R.string.version_type_snapshot)
    else -> type
}

@Composable private fun strInstanceListTitle() = stringResource(R.string.title_instances)
@Composable private fun strSettings() = stringResource(R.string.action_settings)
@Composable private fun strEmptyHint() = stringResource(R.string.hint_no_instances)
@Composable private fun strNewInstance() = stringResource(R.string.action_new_instance)
@Composable private fun strDeleteTitle() = stringResource(R.string.dialog_delete_instance_title)
@Composable private fun strDeleteMessage(id: String) = stringResource(R.string.dialog_delete_instance_message, id)
@Composable private fun strDelete() = stringResource(R.string.action_delete)
@Composable private fun strCancel() = stringResource(R.string.action_cancel)
@Composable private fun strLaunch() = stringResource(R.string.action_launch)
@Composable private fun strLastPlayed(t: String) = stringResource(R.string.last_played_at, t)
@Composable private fun strNeverPlayed() = stringResource(R.string.never_played)
@Composable private fun strWizardTitle(step: Int) = stringResource(R.string.wizard_title, step)
@Composable private fun strWizardPickVersion() = stringResource(R.string.wizard_pick_version)
@Composable private fun strWizardRefreshing() = stringResource(R.string.wizard_refreshing)
@Composable private fun strWizardRefresh() = stringResource(R.string.action_refresh)
@Composable private fun strWizardListCount(n: Int) = stringResource(R.string.wizard_version_count, n)
@Composable private fun strWizardVersionHint() = stringResource(R.string.wizard_version_hint)
@Composable private fun strWizardLoadingList() = stringResource(R.string.wizard_loading_manifest)
@Composable private fun strWizardManualFallback(q: String) = stringResource(R.string.wizard_manual_fallback, q)
@Composable private fun strWizardSelected() = stringResource(R.string.wizard_selected)
@Composable private fun strWizardPickLoader() = stringResource(R.string.wizard_pick_loader)
@Composable private fun strLoaderLabelExperimental(loader: String) = stringResource(R.string.loader_experimental, loader)
@Composable private fun strWizardLoaderHint() = stringResource(R.string.wizard_loader_hint)
@Composable private fun strWizardForgeRisk() = stringResource(R.string.wizard_forge_risk)
@Composable private fun strWizardLoaderVersionHint(loader: String) = when (loader) {
    "forge" -> stringResource(R.string.wizard_loader_version_forge)
    "quilt" -> stringResource(R.string.wizard_loader_version_quilt)
    else -> stringResource(R.string.wizard_loader_version_generic, loader)
}
@Composable private fun strWizardNaming() = stringResource(R.string.wizard_naming)
@Composable private fun strWizardNameHint() = stringResource(R.string.wizard_name_hint)
@Composable private fun strWizardDownloading() = stringResource(R.string.wizard_downloading)
@Composable private fun strWizardPreparing() = stringResource(R.string.wizard_preparing)
@Composable private fun strWizardPhase(p: DownloadPhase) = when (p) {
    DownloadPhase.VERSION_JSON -> stringResource(R.string.wizard_phase_version_json)
    DownloadPhase.CLIENT_JAR -> stringResource(R.string.wizard_phase_client_jar)
    DownloadPhase.LIBRARIES -> stringResource(R.string.wizard_phase_libraries)
    DownloadPhase.ASSET_INDEX -> stringResource(R.string.wizard_phase_asset_index)
    DownloadPhase.ASSETS -> stringResource(R.string.wizard_phase_assets)
    DownloadPhase.FORGE_SETUP -> stringResource(R.string.wizard_phase_forge_setup)
    DownloadPhase.FORGE_PROCESSORS -> stringResource(R.string.wizard_phase_forge_processors)
    else -> stringResource(R.string.wizard_phase_processing)
}
@Composable private fun strWizardFiles(done: Int, total: Int) = stringResource(R.string.wizard_files, done, total)
@Composable private fun strWizardSpeed(mb: Double) = stringResource(R.string.wizard_speed, mb)
@Composable private fun strWizardDone() = stringResource(R.string.wizard_done)
@Composable private fun strWizardFailed(msg: String) = stringResource(R.string.wizard_failed, msg)
@Composable private fun strRetry() = stringResource(R.string.action_retry)
@Composable private fun strBadgeExperimental(loader: String) = stringResource(R.string.badge_experimental, loader)
@Composable private fun strNext() = stringResource(R.string.action_next)
@Composable private fun strBack() = stringResource(R.string.action_back)
@Composable private fun strCreate() = stringResource(R.string.action_create)
@Composable private fun strDone() = stringResource(R.string.action_done)
@Composable private fun strSettingsTitle() = stringResource(R.string.settings_title)
@Composable private fun strMaxMemory(mb: Int) = stringResource(R.string.settings_max_memory, mb)
@Composable private fun strJvmArgsLabel() = stringResource(R.string.settings_jvm_args)
@Composable private fun strSensitivity(v: Float) = stringResource(R.string.settings_sensitivity, v)
@Composable private fun strSoundEnabled() = stringResource(R.string.settings_sound_enabled)
@Composable private fun strSave() = stringResource(R.string.action_save)
@Composable private fun strLongPressMenuHint() = stringResource(R.string.dialog_long_press_hint)
@Composable private fun strManage() = stringResource(R.string.action_manage)
