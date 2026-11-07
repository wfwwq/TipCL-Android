package com.pymcl.android.ui.dialogs;

import com.pymcl.runtime.process.JavaProcessService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SavesStrings.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\u0010\rJC\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0010\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f¢\u0006\u0002\u0010\u0015R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/pymcl/android/ui/dialogs/SavesStrings;", "", "<init>", "()V", "EN", "", "", "getEN", "()Ljava/util/Map;", "fill", "base", JavaProcessService.EXTRA_ARGS, "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "resolve", "key", "en", "", "packHas", "packValue", "Lkotlin/Function0;", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;[Ljava/lang/Object;)Ljava/lang/String;", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class SavesStrings {
    public static final int $stable = 0;
    public static final SavesStrings INSTANCE = new SavesStrings();
    private static final Map<String, String> EN = MapsKt.linkedMapOf(TuplesKt.to("导入", "Import"), TuplesKt.to("从 zip 导入…", "Import from zip…"), TuplesKt.to("从文件夹导入…", "Import from folder…"), TuplesKt.to("导入存档：选 zip 或文件夹，里面要有 level.dat；重名会自动加后缀。", "Import a world: pick a zip or folder that contains level.dat. Name clashes get a numeric suffix."), TuplesKt.to("也可以把 zip 拖到这个窗口里（分屏时从文件管理器拖）。", "You can also drag a zip onto this window (from a file manager in split screen)."), TuplesKt.to("正在导入…", "Importing…"), TuplesKt.to("已导入", "Imported"), TuplesKt.to("导入失败", "Import failed"), TuplesKt.to("与现有存档重名，已改名为「{0}」", "A world with that name already exists; imported as \"{0}\""), TuplesKt.to("{0} 个文件", "{0} files"), TuplesKt.to("记住导出位置", "Remember export location"), TuplesKt.to("下次导出时直接打开上次保存的目录", "Open the last-used folder next time you export"), TuplesKt.to("上次：{0}", "Last: {0}"), TuplesKt.to("上次的位置（路径无法显示）", "Last location (path not shown)"), TuplesKt.to("忘记", "Forget"), TuplesKt.to("已忘记导出位置", "Export location forgotten"), TuplesKt.to("松手导入存档", "Drop to import the world"), TuplesKt.to("拖进来的不是文件", "The dropped item is not a file"), TuplesKt.to("没能获得拖放文件的读取权限", "No permission to read the dropped file"), TuplesKt.to("正在导入：已处理 {0}/{1} 个文件", "Importing: {0}/{1} files processed"), TuplesKt.to("取消导入", "Cancel import"), TuplesKt.to("已取消导入", "Import cancelled"));

    private SavesStrings() {
    }

    public final Map<String, String> getEN() {
        return EN;
    }

    public final String fill(String base, Object[] args) {
        String string;
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(args, "args");
        int i = 0;
        int length = args.length;
        int i2 = 0;
        String strReplace$default = base;
        while (i2 < length) {
            Object obj = args[i2];
            int i3 = i + 1;
            String str = "{" + i + "}";
            if (obj == null || (string = obj.toString()) == null) {
                string = "";
            }
            strReplace$default = StringsKt.replace$default(strReplace$default, str, string, false, 4, (Object) null);
            i2++;
            i = i3;
        }
        return strReplace$default;
    }

    public final String resolve(String key, boolean en, boolean packHas, Function0<String> packValue, Object[] args) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(packValue, "packValue");
        Intrinsics.checkNotNullParameter(args, "args");
        if (packHas) {
            return packValue.invoke();
        }
        if (!en) {
            return fill(key, args);
        }
        String str = EN.get(key);
        if (str == null) {
            str = key;
        }
        return fill(str, args);
    }
}
