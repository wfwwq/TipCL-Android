package com.tipcl.android.manage

import android.content.Context
import android.net.Uri
import android.provider.OpenableColumns
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.tipcl.android.R
import com.tipcl.android.core.launch.LaunchException
import com.tipcl.android.core.launch.SavesManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.time.Instant
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.zip.ZipError
import java.util.zip.ZipException
import java.util.zip.ZipFile

/**
 * M4 单实例管理页：存档管理（SavesManager）+ 资源包管理（gameDir/resourcepacks）。
 *
 * - SavesManager 为阻塞文件 API，全部调用包在 withContext(Dispatchers.IO)；
 *   进度为不确定式（世界级忙碌指示），锁冲突（LaunchException）转 UI 提示。
 * - 资源包仅做文件级管理（导入/删除/损坏检测），激活由游戏内"资源包"设置完成。
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InstanceManageScreen(
    instanceId: String,
    instancesRoot: File,
    appDataDir: File,
    onBack: () -> Unit,
) {
    var tab by remember { mutableStateOf(0) }
    val savesManager = remember(instancesRoot, appDataDir) {
        SavesManager(instancesRoot.toPath(), appDataDir.toPath())
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(strManageTitle(instanceId)) },
                navigationIcon = { TextButton(onClick = onBack) { Text(strBack()) } },
            )
        },
    ) { padding ->
        Column(Modifier.padding(padding).fillMaxSize()) {
            TabRow(selectedTabIndex = tab) {
                Tab(selected = tab == 0, onClick = { tab = 0 }, text = { Text(strTabSaves()) })
                Tab(selected = tab == 1, onClick = { tab = 1 }, text = { Text(strTabResourcepacks()) })
            }
            when (tab) {
                0 -> SavesTab(instanceId, savesManager, Modifier.fillMaxSize())
                else -> ResourcepacksTab(instancesRoot, Modifier.fillMaxSize())
            }
        }
    }
}

// ---------------------------------------------------------------- 存档管理

@Composable
private fun SavesTab(instanceId: String, savesManager: SavesManager, modifier: Modifier) {
    val scope = rememberCoroutineScope()
    var worlds by remember { mutableStateOf<List<SavesManager.WorldInfo>?>(null) }
    var expandedWorld by remember { mutableStateOf<String?>(null) }
    var backups by remember { mutableStateOf<List<SavesManager.BackupInfo>>(emptyList()) }
    var backupsLoading by remember { mutableStateOf(false) }
    var stats by remember { mutableStateOf<SavesManager.BackupStats?>(null) }
    var busyWorld by remember { mutableStateOf<String?>(null) } // 备份/还原中的世界（不确定式进度）
    var banner by remember { mutableStateOf<String?>(null) }
    var noteForWorld by remember { mutableStateOf<String?>(null) } // 弹备份备注输入框
    var pendingRestore by remember { mutableStateOf<SavesManager.BackupInfo?>(null) }
    var pendingBackupDelete by remember { mutableStateOf<SavesManager.BackupInfo?>(null) }

    suspend fun refresh() {
        worlds = withContext(Dispatchers.IO) { savesManager.listWorlds(instanceId) }
        stats = withContext(Dispatchers.IO) { savesManager.backupStats() }
        expandedWorld?.let { w ->
            backups = withContext(Dispatchers.IO) { savesManager.listBackups(instanceId, w) }
        }
    }

    LaunchedEffect(instanceId) { refresh() }

    val ctx = LocalContext.current
    fun onError(e: Exception) {
        banner = if (e is LaunchException && e.message?.contains("进行中") == true) {
            strWorldBusyHint(ctx)
        } else {
            strOpFailed(ctx, e.message ?: e.javaClass.simpleName)
        }
    }

    Column(modifier.padding(16.dp).verticalScroll(rememberScrollState())) {
        Text(
            strSavesHint(),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        banner?.let {
            Text(
                it,
                style = MaterialTheme.typography.bodySmall,
                color = if (it.startsWith(strOpFailedPrefix())) MaterialTheme.colorScheme.error
                else MaterialTheme.colorScheme.primary,
            )
        }
        Spacer(Modifier.size(8.dp))

        val list = worlds
        when {
            list == null -> Box(Modifier.fillMaxWidth().padding(24.dp), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
            list.isEmpty() -> Text(strNoWorlds(), color = MaterialTheme.colorScheme.onSurfaceVariant)
            else -> list.forEach { world ->
                WorldCard(
                    world = world,
                    busy = busyWorld == world.dirName,
                    expanded = expandedWorld == world.dirName,
                    backups = if (expandedWorld == world.dirName) backups else emptyList(),
                    backupsLoading = backupsLoading,
                    onToggle = {
                        val target = if (expandedWorld == world.dirName) null else world.dirName
                        expandedWorld = target
                        if (target != null) {
                            backupsLoading = true
                            scope.launch {
                                try {
                                    backups = withContext(Dispatchers.IO) {
                                        savesManager.listBackups(instanceId, target)
                                    }
                                } finally {
                                    backupsLoading = false
                                }
                            }
                        }
                    },
                    onBackup = { noteForWorld = world.dirName },
                    onRestore = { pendingRestore = it },
                    onDeleteBackup = { pendingBackupDelete = it },
                )
            }
        }

        stats?.let {
            Spacer(Modifier.size(12.dp))
            Text(
                strStatsLine(it.backupCount, formatBytes(it.totalBytes)),
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
    }

    // 备份备注输入
    noteForWorld?.let { world ->
        var note by remember(world) { mutableStateOf("") }
        AlertDialog(
            onDismissRequest = { noteForWorld = null },
            title = { Text(strBackupTitle(world)) },
            text = {
                Column {
                    Text(strBackupNoteHint())
                    OutlinedTextField(
                        value = note,
                        onValueChange = { note = it },
                        label = { Text(strBackupNoteLabel()) },
                        singleLine = true,
                    )
                }
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        noteForWorld = null
                        busyWorld = world
                        banner = null
                        scope.launch {
                            try {
                                val path = withContext(Dispatchers.IO) {
                                    savesManager.backupWorld(instanceId, world, note)
                                }
                                banner = ctx.getString(R.string.backup_done, path.fileName.toString())
                            } catch (e: Exception) {
                                onError(e)
                            } finally {
                                busyWorld = null
                                refresh()
                            }
                        }
                    },
                ) { Text(strBackupStart()) }
            },
            dismissButton = { TextButton(onClick = { noteForWorld = null }) { Text(strCancel()) } },
        )
    }

    // 还原二次确认（说明安全网行为）
    pendingRestore?.let { backup ->
        AlertDialog(
            onDismissRequest = { pendingRestore = null },
            title = { Text(strRestoreTitle(backup.world)) },
            text = { Text(strRestoreConfirm(backup.world)) },
            confirmButton = {
                TextButton(
                    onClick = {
                        pendingRestore = null
                        busyWorld = backup.world
                        banner = null
                        scope.launch {
                            try {
                                withContext(Dispatchers.IO) {
                                    savesManager.restoreWorld(instanceId, backup.world, backup.path)
                                }
                                banner = ctx.getString(R.string.restore_done, backup.world)
                            } catch (e: Exception) {
                                onError(e)
                            } finally {
                                busyWorld = null
                                refresh()
                            }
                        }
                    },
                ) { Text(strRestoreGo()) }
            },
            dismissButton = { TextButton(onClick = { pendingRestore = null }) { Text(strCancel()) } },
        )
    }

    // 备份删除确认
    pendingBackupDelete?.let { backup ->
        AlertDialog(
            onDismissRequest = { pendingBackupDelete = null },
            title = { Text(strDeleteBackupTitle()) },
            text = { Text(strDeleteBackupConfirm(backup.fileName)) },
            confirmButton = {
                TextButton(
                    onClick = {
                        pendingBackupDelete = null
                        scope.launch {
                            withContext(Dispatchers.IO) {
                                savesManager.deleteBackup(backup.world, backup.fileName)
                            }
                            refresh()
                        }
                    },
                ) { Text(strDelete()) }
            },
            dismissButton = { TextButton(onClick = { pendingBackupDelete = null }) { Text(strCancel()) } },
        )
    }
}

@Composable
private fun WorldCard(
    world: SavesManager.WorldInfo,
    busy: Boolean,
    expanded: Boolean,
    backups: List<SavesManager.BackupInfo>,
    backupsLoading: Boolean,
    onToggle: () -> Unit,
    onBackup: () -> Unit,
    onRestore: (SavesManager.BackupInfo) -> Unit,
    onDeleteBackup: (SavesManager.BackupInfo) -> Unit,
) {
    Card(Modifier.fillMaxWidth()) {
        Column(Modifier.padding(12.dp)) {
            Row(
                Modifier.fillMaxWidth().clickable(onClick = onToggle),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Column(Modifier.weight(1f)) {
                    Text(world.name, style = MaterialTheme.typography.titleSmall)
                    Text(
                        strWorldMeta(formatBytes(world.sizeBytes), world.fileCount, formatTime(world.lastModified)),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
                if (busy) {
                    CircularProgressIndicator(Modifier.size(20.dp), strokeWidth = 2.dp)
                    Spacer(Modifier.width(8.dp))
                }
                Text(
                    if (expanded) strCollapse() else strExpandBackups(),
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.primary,
                )
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(top = 8.dp)) {
                OutlinedButton(onClick = onBackup, enabled = !busy) { Text(strBackupButton()) }
            }
            if (expanded) {
                Spacer(Modifier.size(8.dp))
                when {
                    backupsLoading -> Text(strBackupsLoading(), style = MaterialTheme.typography.bodySmall)
                    backups.isEmpty() -> Text(
                        strNoBackups(),
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    else -> backups.forEach { backup ->
                        BackupRow(
                            backup = backup,
                            enabled = !busy,
                            onRestore = { onRestore(backup) },
                            onDelete = { onDeleteBackup(backup) },
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun BackupRow(
    backup: SavesManager.BackupInfo,
    enabled: Boolean,
    onRestore: () -> Unit,
    onDelete: () -> Unit,
) {
    Row(
        Modifier.fillMaxWidth().padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(backup.fileName, style = MaterialTheme.typography.bodySmall)
            Text(
                strBackupMeta(formatBytes(backup.sizeBytes), formatTime(backup.lastModified), backup.manifest?.note),
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        TextButton(onClick = onRestore, enabled = enabled) { Text(strRestoreButton()) }
        TextButton(onClick = onDelete, enabled = enabled) { Text(strDelete()) }
    }
}

// ---------------------------------------------------------------- 资源包管理

/** gameDir/resourcepacks 下一个资源包条目。 */
data class ResourcepackInfo(
    val fileName: String,
    val file: File,
    val sizeBytes: Long,
    val lastModified: Long,
    /** true = Central Directory 读不到（损坏/非 zip），列表中标红。 */
    val corrupted: Boolean,
)

/** 资源包目录（gameDir/resourcepacks）的文件级管理：列表 / 导入 / 删除 / 损坏检测。 */
class ResourcepackManager(private val gameDir: File) {

    val resourcepacksDir: File get() = File(gameDir, "resourcepacks")

    /** 列出全部 zip（按文件名排序）；Central Directory 读不到标记 corrupted。IO 阻塞，调用方自行切线程。 */
    fun list(): List<ResourcepackInfo> {
        val dir = resourcepacksDir
        if (!dir.isDirectory) return emptyList()
        return dir.listFiles { f -> f.isFile && f.name.endsWith(".zip", ignoreCase = true) }
            ?.sortedBy { it.name }
            ?.map { f ->
                ResourcepackInfo(
                    fileName = f.name,
                    file = f,
                    sizeBytes = f.length(),
                    lastModified = f.lastModified(),
                    corrupted = !isReadableZip(f),
                )
            }
            ?: emptyList()
    }

    /** 损坏检测：ZipFile 按 Central Directory 解析，打开成功即视为可读。 */
    private fun isReadableZip(file: File): Boolean = try {
        ZipFile(file).use { true }
    } catch (_: ZipException) {
        false
    } catch (_: ZipError) {
        false
    } catch (_: SecurityException) {
        false
    }

    /**
     * 从 SAF Uri 导入：读 Display_Name 决定落盘文件名（保证 .zip 后缀、去非法字符、重名追加时间戳），
     * 流式拷入 resourcepacks/。IO 阻塞，调用方自行切线程。
     */
    fun import(context: Context, uri: Uri): File {
        val name = queryDisplayName(context, uri) ?: "imported-${System.currentTimeMillis()}.zip"
        val cleaned = name.replace(Regex("[\\\\/:*?\"<>|]+"), "_").trim()
        val withExt = if (cleaned.endsWith(".zip", ignoreCase = true)) cleaned else "$cleaned.zip"
        Files.createDirectories(resourcepacksDir.toPath())
        var target: File = File(resourcepacksDir, withExt)
        if (target.exists()) {
            val base = withExt.removeSuffix(".zip")
            target = File(resourcepacksDir, "$base-${importTimestamp()}.zip")
        }
        context.contentResolver.openInputStream(uri)?.use { input ->
            target.outputStream().use { output -> input.copyTo(output) }
        } ?: throw LaunchException(context.getString(R.string.import_read_failed))
        return target
    }

    /** 删除资源包文件；不存在返回 false。 */
    fun delete(fileName: String): Boolean {
        val f = File(resourcepacksDir, fileName)
        return f.isFile && f.delete()
    }

    private fun queryDisplayName(context: Context, uri: Uri): String? =
        context.contentResolver.query(uri, null, null, null, null)?.use { cursor ->
            val idx = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME)
            if (idx >= 0 && cursor.moveToFirst()) cursor.getString(idx) else null
        }
}

@Composable
private fun ResourcepacksTab(instancesRoot: File, modifier: Modifier) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val manager = remember(instancesRoot) { ResourcepackManager(instancesRoot) }
    var packs by remember { mutableStateOf<List<ResourcepackInfo>?>(null) }
    var importing by remember { mutableStateOf(false) }
    var banner by remember { mutableStateOf<String?>(null) }
    var pendingDelete by remember { mutableStateOf<ResourcepackInfo?>(null) }

    fun refresh() {
        scope.launch { packs = withContext(Dispatchers.IO) { manager.list() } }
    }
    LaunchedEffect(instancesRoot) { refresh() }

    val importLauncher = rememberLauncherForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri == null) return@rememberLauncherForActivityResult
        importing = true
        banner = null
        scope.launch {
            try {
                val file = withContext(Dispatchers.IO) { manager.import(context, uri) }
                banner = context.getString(R.string.import_done, file.name)
            } catch (e: Exception) {
                banner = context.getString(R.string.op_failed, e.message ?: e.javaClass.simpleName)
            } finally {
                importing = false
                refresh()
            }
        }
    }

    Column(modifier.padding(16.dp).verticalScroll(rememberScrollState())) {
        Text(
            strPacksHint(),
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Spacer(Modifier.size(4.dp))
        Button(onClick = { importLauncher.launch(arrayOf("application/zip", "application/x-zip-compressed", "application/octet-stream")) }, enabled = !importing) {
            Text(if (importing) strImporting() else strImport())
        }
        banner?.let {
            Text(
                it,
                style = MaterialTheme.typography.bodySmall,
                color = if (it.startsWith(strOpFailedPrefix())) MaterialTheme.colorScheme.error
                else MaterialTheme.colorScheme.primary,
            )
        }
        Spacer(Modifier.size(8.dp))

        val list = packs
        when {
            list == null -> Box(Modifier.fillMaxWidth().padding(24.dp), contentAlignment = Alignment.Center) {
                CircularProgressIndicator()
            }
            list.isEmpty() -> Text(strNoPacks(), color = MaterialTheme.colorScheme.onSurfaceVariant)
            else -> list.forEach { pack ->
                PackRow(
                    pack = pack,
                    onDelete = { pendingDelete = pack },
                )
            }
        }
    }

    pendingDelete?.let { pack ->
        AlertDialog(
            onDismissRequest = { pendingDelete = null },
            title = { Text(strDeletePackTitle()) },
            text = { Text(strDeletePackConfirm(pack.fileName)) },
            confirmButton = {
                TextButton(
                    onClick = {
                        pendingDelete = null
                        scope.launch {
                            withContext(Dispatchers.IO) { manager.delete(pack.fileName) }
                            refresh()
                        }
                    },
                ) { Text(strDelete()) }
            },
            dismissButton = { TextButton(onClick = { pendingDelete = null }) { Text(strCancel()) } },
        )
    }
}

@Composable
private fun PackRow(pack: ResourcepackInfo, onDelete: () -> Unit) {
    Row(
        Modifier.fillMaxWidth().padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(Modifier.weight(1f)) {
            Text(
                pack.fileName,
                style = MaterialTheme.typography.bodyMedium,
                color = if (pack.corrupted) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface,
            )
            Text(
                if (pack.corrupted) strCorruptedZip()
                else strPackMeta(formatBytes(pack.sizeBytes), formatTime(pack.lastModified)),
                style = MaterialTheme.typography.labelSmall,
                color = if (pack.corrupted) MaterialTheme.colorScheme.error
                else MaterialTheme.colorScheme.onSurfaceVariant,
            )
        }
        TextButton(onClick = onDelete) { Text(strDelete()) }
    }
}

// ---------------------------------------------------------------- 公共小工具

private val TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")

internal fun formatTime(epochMs: Long): String =
    TIME_FORMAT.withZone(ZoneId.systemDefault()).format(Instant.ofEpochMilli(epochMs))

internal fun formatBytes(bytes: Long): String = when {
    bytes >= 1L shl 20 -> "%.1f MB".format(bytes / (1024.0 * 1024))
    bytes >= 1L shl 10 -> "%.1f KB".format(bytes / 1024.0)
    else -> "$bytes B"
}

/** 重名导入文件的时间戳后缀（yyyyMMdd-HHmmss）。 */
private fun importTimestamp(): String =
    DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss").withZone(ZoneId.systemDefault())
        .format(Instant.ofEpochMilli(System.currentTimeMillis()))

// ---------------------------------------------------------------- 文案（strings.xml 资源引用，中文默认 + values-en 英文）

@Composable private fun strManageTitle(id: String) = stringResource(R.string.manage_title, id)
@Composable private fun strBack() = stringResource(R.string.action_back)
@Composable private fun strTabSaves() = stringResource(R.string.tab_worlds)
@Composable private fun strTabResourcepacks() = stringResource(R.string.tab_resource_packs)
@Composable private fun strCancel() = stringResource(R.string.action_cancel)
@Composable private fun strDelete() = stringResource(R.string.action_delete)
@Composable private fun strSavesHint() = stringResource(R.string.manage_saves_hint)
@Composable private fun strNoWorlds() = stringResource(R.string.manage_no_worlds)
private fun strWorldBusyHint(ctx: Context) = ctx.getString(R.string.manage_world_busy)
@Composable private fun strOpFailedPrefix() = stringResource(R.string.op_failed_prefix)
private fun strOpFailed(ctx: Context, msg: String) = ctx.getString(R.string.op_failed, msg)
@Composable private fun strWorldMeta(size: String, files: Int, time: String) =
    stringResource(R.string.world_meta, size, files, time)
@Composable private fun strExpandBackups() = stringResource(R.string.expand_backups)
@Composable private fun strCollapse() = stringResource(R.string.collapse)
@Composable private fun strBackupButton() = stringResource(R.string.action_backup)
@Composable private fun strBackupTitle(world: String) = stringResource(R.string.backup_title, world)
@Composable private fun strBackupNoteHint() = stringResource(R.string.backup_note_hint)
@Composable private fun strBackupNoteLabel() = stringResource(R.string.label_note)
@Composable private fun strBackupStart() = stringResource(R.string.action_backup_start)
@Composable private fun strBackupDone(file: String) = stringResource(R.string.backup_done, file)
@Composable private fun strBackupsLoading() = stringResource(R.string.backups_loading)
@Composable private fun strNoBackups() = stringResource(R.string.no_backups)
@Composable private fun strBackupMeta(size: String, time: String, note: String?): String {
    val base = "$size · $time"
    return if (note.isNullOrBlank()) base else stringResource(R.string.backup_meta_note, note).let { "$base · $it" }
}
@Composable private fun strRestoreButton() = stringResource(R.string.action_restore)
@Composable private fun strRestoreTitle(world: String) = stringResource(R.string.restore_title, world)
@Composable private fun strRestoreConfirm(world: String) = stringResource(R.string.restore_confirm, world)
@Composable private fun strRestoreGo() = stringResource(R.string.action_restore_confirm)
@Composable private fun strRestoreDone(world: String) = stringResource(R.string.restore_done, world)
@Composable private fun strDeleteBackupTitle() = stringResource(R.string.delete_backup_title)
@Composable private fun strDeleteBackupConfirm(file: String) = stringResource(R.string.delete_backup_confirm, file)
@Composable private fun strStatsLine(count: Int, size: String) = stringResource(R.string.backup_stats, count, size)
@Composable private fun strPacksHint() = stringResource(R.string.resource_packs_hint)
@Composable private fun strImport() = stringResource(R.string.action_import_pack)
@Composable private fun strImporting() = stringResource(R.string.importing)
@Composable private fun strImportDone(file: String) = stringResource(R.string.import_done, file)
@Composable private fun strNoPacks() = stringResource(R.string.no_packs)
@Composable private fun strCorruptedZip() = stringResource(R.string.corrupted_zip)
@Composable private fun strPackMeta(size: String, time: String) = stringResource(R.string.pack_meta, size, time)
@Composable private fun strDeletePackTitle() = stringResource(R.string.delete_pack_title)
@Composable private fun strDeletePackConfirm(file: String) = stringResource(R.string.delete_pack_confirm, file)
