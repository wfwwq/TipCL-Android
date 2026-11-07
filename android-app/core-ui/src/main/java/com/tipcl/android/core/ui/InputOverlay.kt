package com.tipcl.android.core.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.changedToDown
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.input.pointer.positionChange
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.tipcl.android.core.input.InputPointerEvent
import kotlin.math.hypot
import kotlin.math.roundToInt

/**
 * 全屏透明输入覆盖层。层级：游戏 Surface 之上。
 *
 * - 游戏手势层（根 Box 的 pointerInput）：把触点流转换为
 *   core-input 的 InputPointerEvent 喂给 pipeline（区域解析在 pipeline）。
 * - 覆盖控件（摇杆绘制/虚拟按键/快捷栏指示）：纯绘制 + 观测 pipeline 状态，
 *   触控本身仍走手势层的区域解析，保证与 core-input 的触点绑定契约一致。
 * - 菜单抽屉与编辑模式打开时，游戏手势层停止分发，避免误触。
 */
@Composable
fun InputOverlay(
    pipeline: OverlayInputPipeline,
    onBackToLauncher: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val density = LocalDensity.current
    var menuOpen by remember { mutableStateOf(false) }
    var editMode by remember { mutableStateOf(false) }
    var canvasSize by remember { mutableStateOf(IntSize.Zero) }

    Box(
        modifier = modifier
            .fillMaxSize()
            .onSizeChanged {
                canvasSize = it
                pipeline.setMetrics(it.width, it.height, density.density)
            }
            .gameGestureLayer(pipeline, blocked = menuOpen || editMode || pipeline.textInputActive)
    ) {
        if (canvasSize.width > 0) {
            JoystickCanvas(pipeline, editMode, Modifier.fillMaxSize())
            HotbarStrip(pipeline, Modifier.fillMaxSize())
            if (!editMode) {
                VirtualButtonLayer(pipeline, Modifier.fillMaxSize())
            } else {
                ButtonLayoutEditor(
                    pipeline = pipeline,
                    onDone = { editMode = false },
                    modifier = Modifier.fillMaxSize(),
                )
            }
        }

        // 聊天输入条：屏幕上方 1/3 处，MC 聊天栏样式；激活期间独占输入通道。
        if (pipeline.textInputActive && canvasSize.width > 0) {
            ChatInputBar(
                pipeline = pipeline,
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(top = with(density) { (canvasSize.height * 0.30f).toDp() })
                    .fillMaxWidth(0.92f),
            )
        }

        // 菜单入口（常驻右上角，半透明）。
        Text(
            text = "☰",
            color = Color.White.copy(alpha = 0.6f),
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(12.dp)
                .clickable { menuOpen = true }
                .padding(4.dp),
        )

        GameMenuPanel(
            pipeline = pipeline,
            visible = menuOpen,
            editMode = editMode,
            onEditChange = { editMode = it },
            onDismiss = { menuOpen = false },
            onPause = { pipeline.sendPause() },
            onBackToLauncher = onBackToLauncher,
            modifier = Modifier.fillMaxSize(),
        )
    }
}

/**
 * 根手势层：多触点 MotionEvent → InputPointerEvent。
 * 子控件（菜单等）已消费的事件不再分发，防止面板操作注入游戏。
 */
private fun Modifier.gameGestureLayer(pipeline: OverlayInputPipeline, blocked: Boolean): Modifier =
    pointerInput(pipeline, blocked) {
        if (blocked) return@pointerInput
        awaitEachGesture {
            awaitFirstDown(requireUnconsumed = false)
            // DOWN 自身也要走一次完整分发（含子控件消费检查）。
            var allUp = false
            while (!allUp) {
                val event = awaitPointerEvent(PointerEventPass.Main)
                if (event.changes.any { it.isConsumed }) continue
                for (change in event.changes) {
                    val action = when {
                        change.changedToDown() -> InputPointerEvent.Action.DOWN
                        change.pressed -> InputPointerEvent.Action.MOVE
                        else -> InputPointerEvent.Action.UP
                    }
                    val dispatched = pipeline.dispatch(
                        InputPointerEvent(
                            pointerId = change.id.value.toInt(),
                            action = action,
                            x = change.position.x,
                            y = change.position.y,
                            timestampMs = change.uptimeMillis,
                        )
                    )
                    if (dispatched) change.consume()
                }
                allUp = event.changes.all { !it.pressed }
            }
        }
    }

// ---------------- 摇杆 ----------------

@Composable
private fun JoystickCanvas(
    pipeline: OverlayInputPipeline,
    editMode: Boolean,
    modifier: Modifier = Modifier,
) {
    val visual = pipeline.stickVisual
    val radius = pipeline.stickRadiusPx()
    // 浮动摇杆运行态：隐藏固定底座，按点动态绘制（编辑态仍显示固定占位框供调节）。
    val floatingRuntime = pipeline.layout.joystick.floating && !editMode
    Canvas(modifier) {
        if (floatingRuntime) {
            if (visual.active) {
                // 底座中心钳制在屏幕内（圆不出边），滑块偏移保持不变。
                val baseX = visual.centerX.coerceIn(radius, size.width - radius)
                val baseY = visual.centerY.coerceIn(radius, size.height - radius)
                val knobOffset = Offset(visual.knobX - visual.centerX, visual.knobY - visual.centerY)
                drawJoystick(
                    base = Offset(baseX, baseY),
                    knob = Offset(baseX, baseY) + knobOffset,
                    radius = radius,
                    active = true,
                    sector = visual.sector,
                )
            }
            return@Canvas
        }
        val base: Offset
        val knob: Offset
        if (visual.active) {
            base = Offset(visual.centerX, visual.centerY)
            knob = Offset(visual.knobX, visual.knobY)
        } else {
            val (cx, cy) = pipeline.idleStickCenter()
            base = Offset(cx, cy)
            knob = base
        }
        drawJoystick(base = base, knob = knob, radius = radius, active = visual.active, sector = visual.sector)
    }
}

/** 摇杆绘制：底座双圈 + 8 向标记（活动扇区高亮）+ 滑块。 */
private fun DrawScope.drawJoystick(base: Offset, knob: Offset, radius: Float, active: Boolean, sector: Int) {
    // 底座
    drawCircle(
        color = Color.White.copy(alpha = 0.15f),
        radius = radius,
        center = base,
        style = Stroke(width = radius * 0.06f),
    )
    drawCircle(
        color = Color.White.copy(alpha = 0.06f),
        radius = radius,
        center = base,
    )
    // 8 向标记：活动扇区高亮。
    for (s in 0 until 8) {
        val angle = Math.toRadians((s * 45.0 - 90.0))
        val marker = base + Offset(
            (radius * 0.8 * kotlin.math.cos(angle)).toFloat(),
            (radius * 0.8 * kotlin.math.sin(angle)).toFloat(),
        )
        drawCircle(
            color = if (active && sector == s) Color.White.copy(alpha = 0.9f)
            else Color.White.copy(alpha = 0.25f),
            radius = radius * (if (active && sector == s) 0.07f else 0.05f),
            center = marker,
        )
    }
    // 滑块
    drawCircle(
        color = Color.White.copy(alpha = if (active) 0.55f else 0.35f),
        radius = radius * 0.32f,
        center = knob,
    )
}

// ---------------- 虚拟按键 ----------------

@Composable
private fun VirtualButtonLayer(pipeline: OverlayInputPipeline, modifier: Modifier = Modifier) {
    val pressed = pipeline.pressedButtonNames
    val dens = LocalDensity.current
    Box(modifier) {
        pipeline.layout.buttons.forEach { spec ->
            val isPressed = spec.name in pressed
            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(
                        x = with(dens) {
                            (spec.anchorXF * pipeline.screenWidthPx - spec.sizeDp * dens.density / 2f).toDp()
                        },
                        y = with(dens) {
                            (spec.anchorYF * pipeline.screenHeightPx - spec.sizeDp * dens.density / 2f).toDp()
                        },
                    )
                    .size(with(dens) { (spec.sizeDp * dens.density).toDp() })
                    .background(
                        color = Color.White.copy(
                            alpha = (spec.alpha * pipeline.layout.globalAlpha) *
                                (if (isPressed) 0.9f else 0.45f)
                        ),
                        shape = CircleShape,
                    )
                    .border(
                        width = 2.dp,
                        color = Color.White.copy(alpha = if (isPressed) 0.95f else 0.6f),
                        shape = CircleShape,
                    ),
                contentAlignment = Alignment.Center,
            ) {
                Text(text = spec.name, color = Color.White)
            }
        }
    }
}

// ---------------- 快捷栏 ----------------

@Composable
private fun HotbarStrip(pipeline: OverlayInputPipeline, modifier: Modifier = Modifier) {
    val flash = pipeline.hotbarFlashSlot
    val region = pipeline.hotbarRegionPx() ?: return
    val hPx = region.bottom - region.top
    Canvas(modifier) {
        drawRect(
            color = Color.Black.copy(alpha = 0.18f),
            topLeft = Offset(0f, size.height - hPx),
            size = androidx.compose.ui.geometry.Size(size.width, hPx),
        )
        val cell = size.width / com.tipcl.android.core.input.HotbarTap.SLOT_COUNT
        for (i in 0 until com.tipcl.android.core.input.HotbarTap.SLOT_COUNT) {
            val slot = i + 1
            val selected = flash == slot
            drawRoundRect(
                color = if (selected) Color.White.copy(alpha = 0.55f) else Color.White.copy(alpha = 0.2f),
                topLeft = Offset(i * cell + 4f, size.height - hPx + 12f),
                size = androidx.compose.ui.geometry.Size(cell - 8f, hPx - 24f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(12f, 12f),
            )
        }
    }
}

// ---------------- 布局编辑模式 ----------------

/**
 * 按键布局编辑器。交互：
 * - 拖动按键重定位（吸附 8px 网格）；选中后拖右下角手柄改大小；
 * - 选中键：大小/透明度滑条、删除；支持添加预设键位（字母/数字/方向/功能键）；
 * - 摇杆：底座可拖动（同样吸附网格），半径/死区滑条调节，死区以虚线圈可视化；
 * - 重叠的按键红色描边；完成时若有重叠弹确认（允许带重叠保存）；
 * - 全局透明度滑条；恢复默认布局（二次确认）。
 * 编辑结果实时写入 OverlaySettingsStore（手势结束/滑条松手即 commit）。
 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ButtonLayoutEditor(
    pipeline: OverlayInputPipeline,
    onDone: () -> Unit,
    modifier: Modifier = Modifier,
) {
    var layout by remember { mutableStateOf(pipeline.layout) }
    var selectedName by remember { mutableStateOf<String?>(null) }
    var showAddDialog by remember { mutableStateOf(false) }
    var showResetConfirm by remember { mutableStateOf(false) }
    var showOverlapConfirm by remember { mutableStateOf(false) }

    val density = LocalDensity.current
    val wPx = pipeline.screenWidthPx
    val hPx = pipeline.screenHeightPx

    fun commit() = pipeline.updateLayout(layout)
    fun updateLayout(next: OverlayLayout) { layout = next }
    fun updateButton(spec: ButtonSpec) {
        updateLayout(layout.copy(buttons = layout.buttons.map { if (it.name == spec.name) spec else it }))
    }

    fun finish() {
        if (OverlayGeometry.overlappingPairCount(layout, wPx, hPx, density.density) > 0) {
            showOverlapConfirm = true
        } else {
            commit()
            onDone()
        }
    }

    Box(modifier) {
        // 摇杆编辑可视化：底座圈 + 死区虚线圈 + 可拖动底座。
        EditorJoystick(
            pipeline = pipeline,
            joystickProvider = { layout.joystick },
            onMove = { cx, cy ->
                updateLayout(
                    layout.copy(
                        joystick = layout.joystick.copy(
                            centerXF = OverlayGeometry.snapAnchorF(cx, wPx),
                            centerYF = OverlayGeometry.snapAnchorF(cy, hPx),
                        )
                    )
                )
            },
            onMoveEnd = { commit() },
            modifier = Modifier.fillMaxSize(),
        )

        layout.buttons.forEach { spec ->
            val key = spec.name
            EditorButton(
                pipeline = pipeline,
                spec = spec,
                specProvider = { layout.button(key) ?: spec },
                isSelected = key == selectedName,
                isConflicting = key in OverlayGeometry.overlappingNames(
                    layout, wPx, hPx, density.density,
                ),
                onSelect = { selectedName = key },
                onMove = { nx, ny ->
                    layout.button(key)?.let { cur ->
                        updateButton(
                            cur.copy(
                                anchorXF = OverlayGeometry.snapAnchorF(nx, wPx).coerceIn(0.04f, 0.96f),
                                anchorYF = OverlayGeometry.snapAnchorF(ny, hPx).coerceIn(0.04f, 0.96f),
                            )
                        )
                    }
                },
                onMoveEnd = { commit() },
                onResize = { newSizeDp ->
                    layout.button(key)?.let { cur ->
                        updateButton(cur.copy(sizeDp = (newSizeDp * 2).roundToInt() / 2f))
                    }
                },
                onResizeEnd = { commit() },
            )
        }

        // 底部编辑栏（可滚动）：动作按钮 + 选中键调节 + 全局/摇杆参数。
        Surface(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp)
                .fillMaxWidth(0.96f),
            shape = RoundedCornerShape(12.dp),
            color = Color(0xCC202020),
        ) {
            Column(
                Modifier
                    .padding(horizontal = 12.dp, vertical = 8.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.spacedBy(4.dp),
            ) {
                val overlapCount = OverlayGeometry.overlappingPairCount(layout, wPx, hPx, density.density)
                if (overlapCount > 0) {
                    Text(
                        stringResource(R.string.overlay_overlap_warning, overlapCount),
                        color = Color(0xFFFF5555),
                        style = MaterialTheme.typography.labelMedium,
                    )
                }

                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    OutlinedButton(onClick = { showAddDialog = true }) { Text(stringResource(R.string.overlay_add_button), color = Color.White) }
                    OutlinedButton(onClick = { showResetConfirm = true }) { Text(stringResource(R.string.overlay_reset_default), color = Color.White) }
                    Button(onClick = { finish() }, modifier = Modifier.weight(1f)) { Text(stringResource(R.string.overlay_finish)) }
                }

                val spec = layout.button(selectedName ?: "")
                if (spec != null) {
                    Text(stringResource(R.string.overlay_button_size, spec.name, selectedKeyLabel(spec.key)), color = Color.White)
                    Slider(
                        value = spec.sizeDp,
                        onValueChange = { v -> updateButton(spec.copy(sizeDp = (v * 2).roundToInt() / 2f)) },
                        onValueChangeFinished = { commit() },
                        valueRange = 40f..160f,
                    )
                    Text(stringResource(R.string.overlay_button_opacity, spec.name), color = Color.White)
                    Slider(
                        value = spec.alpha,
                        onValueChange = { v -> updateButton(spec.copy(alpha = (v * 20).roundToInt() / 20f)) },
                        onValueChangeFinished = { commit() },
                        valueRange = 0.1f..1f,
                    )
                    OutlinedButton(
                        onClick = {
                            updateLayout(layout.copy(buttons = layout.buttons.filterNot { it.name == spec.name }))
                            selectedName = null
                            commit()
                        },
                        modifier = Modifier.fillMaxWidth(),
                    ) { Text(stringResource(R.string.overlay_delete_button, spec.name), color = Color(0xFFFF6666)) }
                }

                Text(stringResource(R.string.overlay_global_opacity), color = Color.White.copy(alpha = 0.8f))
                Slider(
                    value = layout.globalAlpha,
                    onValueChange = { v -> updateLayout(layout.copy(globalAlpha = (v * 20).roundToInt() / 20f)) },
                    onValueChangeFinished = { commit() },
                    valueRange = 0.1f..1f,
                )

                Text(
                    stringResource(R.string.overlay_joystick_radius, layout.joystick.radiusF * wPx / density.density),
                    color = Color.White.copy(alpha = 0.8f),
                )
                Slider(
                    value = layout.joystick.radiusF,
                    onValueChange = { v ->
                        updateLayout(layout.copy(joystick = layout.joystick.copy(radiusF = v)))
                    },
                    onValueChangeFinished = { commit() },
                    valueRange = 0.06f..0.22f,
                )
                Text(stringResource(R.string.overlay_joystick_deadzone, layout.joystick.deadZoneF * 100), color = Color.White.copy(alpha = 0.8f))
                Slider(
                    value = layout.joystick.deadZoneF,
                    onValueChange = { v ->
                        updateLayout(layout.copy(joystick = layout.joystick.copy(deadZoneF = v)))
                    },
                    onValueChangeFinished = { commit() },
                    valueRange = 0f..0.5f,
                )
                Row(
                    Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        stringResource(R.string.overlay_joystick_floating),
                        color = Color.White.copy(alpha = 0.8f),
                    )
                    Switch(
                        checked = layout.joystick.floating,
                        onCheckedChange = {
                            updateLayout(layout.copy(joystick = layout.joystick.copy(floating = it)))
                            commit()
                        },
                    )
                }
            }
        }

        if (showAddDialog) {
            AddKeyDialog(
                layout = layout,
                onDismiss = { showAddDialog = false },
                onAdd = { preset ->
                    val name = OverlayGeometry.uniqueName(layout, preset.label)
                    val slot = layout.buttons.size % 8
                    val newSpec = ButtonSpec(
                        name = name,
                        key = preset.code,
                        behavior = "TAP",
                        anchorXF = OverlayGeometry.snapAnchorF(0.5f + 0.05f * (slot - 4), wPx),
                        anchorYF = OverlayGeometry.snapAnchorF(0.38f + 0.05f * (slot % 4), hPx),
                        sizeDp = 56f,
                        alpha = 0.5f,
                    )
                    updateLayout(layout.copy(buttons = layout.buttons + newSpec))
                    selectedName = name
                    commit()
                    showAddDialog = false
                },
            )
        }

        if (showResetConfirm) {
            AlertDialog(
                onDismissRequest = { showResetConfirm = false },
                title = { Text(stringResource(R.string.overlay_reset_layout_title)) },
                text = { Text(stringResource(R.string.overlay_reset_layout_text)) },
                confirmButton = {
                    Button(onClick = {
                        updateLayout(OverlayLayout.default())
                        selectedName = null
                        commit()
                        showResetConfirm = false
                    }) { Text(stringResource(R.string.overlay_reset_default)) }
                },
                dismissButton = {
                    OutlinedButton(onClick = { showResetConfirm = false }) { Text(stringResource(R.string.overlay_cancel)) }
                },
            )
        }

        if (showOverlapConfirm) {
            AlertDialog(
                onDismissRequest = { showOverlapConfirm = false },
                title = { Text(stringResource(R.string.overlay_overlap_title)) },
                text = { Text(stringResource(R.string.overlay_overlap_text)) },
                confirmButton = {
                    Button(onClick = {
                        commit()
                        showOverlapConfirm = false
                        onDone()
                    }) { Text(stringResource(R.string.overlay_save_anyway)) }
                },
                dismissButton = {
                    OutlinedButton(onClick = { showOverlapConfirm = false }) { Text(stringResource(R.string.overlay_back_to_edit)) }
                },
            )
        }
    }
}

/** 选中键的 GLFW 码展示标签（无映射时退回码值）。 */
@Composable
private fun selectedKeyLabel(code: Int): String =
    KeyPresets.ALL.firstOrNull { it.code == code }?.label ?: stringResource(R.string.overlay_keycode_label, code)

/** 编辑态摇杆：底座圈 + 死区虚线可视化 + 可拖动底座（吸附网格）。 */
@Composable
private fun EditorJoystick(
    pipeline: OverlayInputPipeline,
    joystickProvider: () -> JoystickSpec,
    onMove: (Float, Float) -> Unit,
    onMoveEnd: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val dens = LocalDensity.current
    val wPx = pipeline.screenWidthPx.toFloat()
    val hPx = pipeline.screenHeightPx.toFloat()
    val joystick = joystickProvider()
    val cx = joystick.centerXF * wPx
    val cy = joystick.centerYF * hPx
    val radius = (joystick.radiusF * wPx).coerceAtLeast(48f)

    Canvas(modifier) {
        drawCircle(
            color = Color(0xFF66CCFF).copy(alpha = 0.35f),
            radius = radius,
            center = Offset(cx, cy),
            style = Stroke(width = 3f),
        )
        drawCircle(
            color = Color(0xFF66CCFF).copy(alpha = 0.12f),
            radius = radius,
            center = Offset(cx, cy),
        )
        // 死区：中心虚线感内圈（用细描边模拟）。
        drawCircle(
            color = Color(0xFFFFAA33).copy(alpha = 0.55f),
            radius = radius * joystick.deadZoneF,
            center = Offset(cx, cy),
            style = Stroke(width = 2f),
        )
    }
    // 底座拖动把手。
    val handleSize = with(dens) { 56.dp.toPx() }
    Box(
        modifier = Modifier
            .offset(
                x = with(dens) { (cx - handleSize / 2f).toDp() },
                y = with(dens) { (cy - handleSize / 2f).toDp() },
            )
            .size(with(dens) { handleSize.toDp() })
            .background(Color(0xFF66CCFF).copy(alpha = 0.35f), CircleShape)
            .pointerInput(Unit) {
                detectDragGestures(
                    onDragEnd = onMoveEnd,
                    onDragCancel = onMoveEnd,
                ) { change, dragAmount ->
                    change.consume()
                    val cur = joystickProvider()
                    val nx = cur.centerXF + dragAmount.x / wPx
                    val ny = cur.centerYF + dragAmount.y / hPx
                    onMove(nx.coerceIn(0.06f, 0.94f), ny.coerceIn(0.06f, 0.94f))
                }
            },
        contentAlignment = Alignment.Center,
    ) { Text(stringResource(R.string.overlay_joystick_label), color = Color.White, style = MaterialTheme.typography.labelSmall) }
}

/** 编辑态单个按键：拖动重定位、点选、右下角手柄缩放、重叠红描边。 */
@Composable
private fun EditorButton(
    pipeline: OverlayInputPipeline,
    spec: ButtonSpec,
    specProvider: () -> ButtonSpec,
    isSelected: Boolean,
    isConflicting: Boolean,
    onSelect: () -> Unit,
    onMove: (Float, Float) -> Unit,
    onMoveEnd: () -> Unit,
    onResize: (Float) -> Unit,
    onResizeEnd: () -> Unit,
) {
    val dens = LocalDensity.current
    val wPx = pipeline.screenWidthPx.toFloat()
    val hPx = pipeline.screenHeightPx.toFloat()
    val sizePx = spec.sizeDp * dens.density
    val borderColor = when {
        isConflicting -> Color(0xFFFF3333)
        isSelected -> Color(0xFF66CCFF)
        else -> Color.White
    }
    Box(
        modifier = Modifier
            .offset(
                x = with(dens) { (spec.anchorXF * wPx - sizePx / 2f).toDp() },
                y = with(dens) { (spec.anchorYF * hPx - sizePx / 2f).toDp() },
            )
            .size(with(dens) { sizePx.toDp() })
            .background(Color.White.copy(alpha = spec.alpha * 0.5f), CircleShape)
            .border(width = if (isSelected || isConflicting) 3.dp else 2.dp, color = borderColor, shape = CircleShape)
            .pointerInput(spec.name) {
                detectDragGestures(
                    onDragStart = { onSelect() },
                    onDragEnd = onMoveEnd,
                    onDragCancel = onMoveEnd,
                ) { change, dragAmount ->
                    change.consume()
                    val cur = specProvider()
                    val nx = cur.anchorXF + dragAmount.x / wPx
                    val ny = cur.anchorYF + dragAmount.y / hPx
                    onMove(nx, ny)
                }
            }
            .clickable { onSelect() },
        contentAlignment = Alignment.Center,
    ) {
        Text(text = spec.name, color = Color.White)
        if (isSelected) {
            // 右下角缩放手柄：沿对角拖动改直径（40..160dp），投影累积避免闭包过期。
            val handleDp = 22.dp
            val handleSize = with(dens) { handleDp.toPx() }
            Box(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(
                        x = with(dens) { (handleSize / 4f).toDp() },
                        y = with(dens) { (handleSize / 4f).toDp() },
                    )
                    .size(handleDp)
                    .background(Color(0xFF66CCFF), CircleShape)
                    .border(2.dp, Color.White, CircleShape)
                    .pointerInput("resize-${spec.name}") {
                        var accumulatedDp = 0f
                        detectDragGestures(
                            onDragStart = { accumulatedDp = 0f },
                            onDragEnd = onResizeEnd,
                            onDragCancel = onResizeEnd,
                        ) { change, dragAmount ->
                            change.consume()
                            // 拖动量投影到外对角方向（右下 45°）。
                            accumulatedDp += (dragAmount.x + dragAmount.y) * 0.7071f / dens.density
                            val cur = specProvider()
                            onResize((cur.sizeDp + accumulatedDp).coerceIn(40f, 160f))
                        }
                    },
            )
        }
    }
}

/** 添加按键对话框：按分组（字母/数字/方向键/功能键）展示预设。 */
@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun AddKeyDialog(
    layout: OverlayLayout,
    onDismiss: () -> Unit,
    onAdd: (KeyPreset) -> Unit,
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(stringResource(R.string.overlay_add_button)) },
        text = {
            Column(Modifier.verticalScroll(rememberScrollState())) {
                KeyPresets.ALL.groupBy { it.group }.forEach { (group, presets) ->
                    Text(group, style = MaterialTheme.typography.titleSmall)
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                    ) {
                        presets.forEach { preset ->
                            val label = if (layout.button(preset.label) != null) "${preset.label}+" else preset.label
                            OutlinedButton(
                                onClick = { onAdd(preset) },
                                contentPadding = PaddingValues(horizontal = 10.dp, vertical = 2.dp),
                            ) { Text(label) }
                        }
                    }
                }
            }
        },
        confirmButton = {
            OutlinedButton(onClick = onDismiss) { Text(stringResource(R.string.overlay_cancel)) }
        },
    )
}

// ---------------- 游戏内菜单面板 ----------------

@Composable
private fun GameMenuPanel(
    pipeline: OverlayInputPipeline,
    visible: Boolean,
    editMode: Boolean,
    onEditChange: (Boolean) -> Unit,
    onDismiss: () -> Unit,
    onPause: () -> Unit,
    onBackToLauncher: () -> Unit,
    modifier: Modifier = Modifier,
) {
    if (!visible) return
    Box(
        modifier
            .background(Color.Black.copy(alpha = 0.4f))
            .clickable(onClick = onDismiss)
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = slideInHorizontally(initialOffsetX = { -it }),
            exit = slideOutHorizontally(targetOffsetX = { -it }),
            modifier = Modifier.align(Alignment.CenterStart),
        ) {
            Surface(
                shape = RoundedCornerShape(topEnd = 16.dp, bottomEnd = 16.dp),
                color = Color(0xF0101010),
                modifier = Modifier
                    .fillMaxHeight()
                    .width(280.dp)
                    .clickable(enabled = false) {}, // 阻断透传到 scrim
            ) {
                Column(Modifier.padding(20.dp), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Text(stringResource(R.string.overlay_menu_title), color = Color.White, style = MaterialTheme.typography.titleLarge)

                    Button(onClick = onPause, modifier = Modifier.fillMaxWidth()) { Text(stringResource(R.string.overlay_pause)) }
                    OutlinedButton(onClick = onBackToLauncher, modifier = Modifier.fillMaxWidth()) {
                        Text(stringResource(R.string.overlay_main_menu), color = Color.White)
                    }

                    Column {
                        Text(
                            stringResource(R.string.overlay_look_sensitivity, pipeline.sensitivity),
                            color = Color.White,
                        )
                        Slider(
                            value = pipeline.sensitivity,
                            onValueChange = { pipeline.updateSensitivity((it * 100).roundToInt() / 100f) },
                            valueRange = 0.1f..2.0f,
                        )
                    }

                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(stringResource(R.string.overlay_edit_layout), color = Color.White)
                        Switch(checked = editMode, onCheckedChange = {
                            onEditChange(it)
                            if (it) onDismiss()
                        })
                    }
                }
            }
        }
    }
}
