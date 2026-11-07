package com.pymcl.runtime.control;

import androidx.autofill.HintConstants;
import com.pymcl.runtime.input.Keys;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GamepadMapDialog.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/pymcl/runtime/control/KeyChoices;", "", "<init>", "()V", "common", "", "", "getCommon", "()Ljava/util/List;", "all", "allKeyNames", "", "label", HintConstants.AUTOFILL_HINT_NAME, "HINTS", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class KeyChoices {
    public static final KeyChoices INSTANCE = new KeyChoices();
    private static final List<String> common = CollectionsKt.listOf((Object[]) new String[]{"", Keys.MOUSE_LEFT, Keys.MOUSE_RIGHT, Keys.MOUSE_MIDDLE, Keys.SCROLL_UP, Keys.SCROLL_DOWN, "KEY_SPACE", "KEY_LEFTSHIFT", "KEY_LEFTCTRL", "KEY_ESC", "KEY_E", "KEY_Q", "KEY_F", "KEY_TAB", "KEY_T", "KEY_SLASH", "KEY_F1", "KEY_F2", "KEY_F3", "KEY_F5", "KEY_W", "KEY_A", "KEY_S", "KEY_D", "KEY_1", "KEY_2", "KEY_3", "KEY_4", "KEY_5", "KEY_6", "KEY_7", "KEY_8", "KEY_9", "KEY_ENTER", Keys.Action.GAME_MENU.getId(), Keys.Action.TOGGLE_IME.getId(), Keys.Action.PC_KEYBOARD.getId(), Keys.Action.QUICK_INPUT.getId(), Keys.Action.TOGGLE_CURSOR.getId()});
    private static final Map<String, String> HINTS = MapsKt.mapOf(TuplesKt.to("KEY_SPACE", "跳跃"), TuplesKt.to("KEY_LEFTSHIFT", "潜行"), TuplesKt.to("KEY_LEFTCTRL", "疾跑"), TuplesKt.to("KEY_ESC", "暂停"), TuplesKt.to("KEY_E", "物品栏"), TuplesKt.to("KEY_Q", "丢弃"), TuplesKt.to("KEY_F", "副手"), TuplesKt.to("KEY_TAB", "玩家列表"), TuplesKt.to("KEY_T", "聊天"), TuplesKt.to("KEY_SLASH", "命令"), TuplesKt.to("KEY_F1", "隐藏界面"), TuplesKt.to("KEY_F2", "截图"), TuplesKt.to("KEY_F3", "调试"), TuplesKt.to("KEY_F5", "切换视角"), TuplesKt.to("KEY_W", "前"), TuplesKt.to("KEY_A", "左"), TuplesKt.to("KEY_S", "后"), TuplesKt.to("KEY_D", "右"));

    private KeyChoices() {
    }

    public final List<String> getCommon() {
        return common;
    }

    public final List<String> all(Collection<String> allKeyNames) {
        Intrinsics.checkNotNullParameter(allKeyNames, "allKeyNames");
        List<String> list = common;
        Collection<String> $this$filter$iv = allKeyNames;
        Collection destination$iv$iv = new ArrayList();
        for (Object element$iv$iv : $this$filter$iv) {
            String it = (String) element$iv$iv;
            boolean z = false;
            if (StringsKt.startsWith$default(it, "KEY_", false, 2, (Object) null) && !Intrinsics.areEqual(it, "KEY_UNKNOWN") && !Intrinsics.areEqual(it, "KEY_RESERVED")) {
                z = true;
            }
            if (z) {
                destination$iv$iv.add(element$iv$iv);
            }
        }
        return CollectionsKt.distinct(CollectionsKt.plus((Collection) list, (Iterable) CollectionsKt.sorted((List) destination$iv$iv)));
    }

    public final String label(String name) {
        String it;
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, "")) {
            return "（不映射）";
        }
        if (Intrinsics.areEqual(name, Keys.MOUSE_LEFT)) {
            return "鼠标左键（攻击/破坏）";
        }
        if (Intrinsics.areEqual(name, Keys.MOUSE_RIGHT)) {
            return "鼠标右键（使用/放置）";
        }
        if (Intrinsics.areEqual(name, Keys.MOUSE_MIDDLE)) {
            return "鼠标中键（选取方块）";
        }
        if (Intrinsics.areEqual(name, Keys.SCROLL_UP)) {
            return "滚轮上（上一格物品）";
        }
        if (Intrinsics.areEqual(name, Keys.SCROLL_DOWN)) {
            return "滚轮下（下一格物品）";
        }
        if (Intrinsics.areEqual(name, Keys.Action.GAME_MENU.getId())) {
            return "打开游戏菜单";
        }
        if (Intrinsics.areEqual(name, Keys.Action.TOGGLE_IME.getId())) {
            return "呼出输入法";
        }
        if (Intrinsics.areEqual(name, Keys.Action.PC_KEYBOARD.getId())) {
            return "PC 键盘";
        }
        if (Intrinsics.areEqual(name, Keys.Action.QUICK_INPUT.getId())) {
            return "快捷输入";
        }
        if (Intrinsics.areEqual(name, Keys.Action.TOGGLE_CURSOR.getId())) {
            return "切换虚拟鼠标";
        }
        if (Intrinsics.areEqual(name, Keys.Action.EDIT_LAYOUT.getId())) {
            return "编辑布局";
        }
        if (Intrinsics.areEqual(name, Keys.Action.MENU.getId())) {
            return "Esc（菜单）";
        }
        String k = StringsKt.removePrefix(name, (CharSequence) "KEY_");
        String it2 = HINTS.get(name);
        return (it2 == null || (it = new StringBuilder().append(k).append("（").append(it2).append("）").toString()) == null) ? k : it;
    }
}
