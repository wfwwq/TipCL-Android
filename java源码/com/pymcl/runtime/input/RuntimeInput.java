package com.pymcl.runtime.input;

import android.content.Context;
import com.pymcl.runtime.control.ControlLayoutStore;
import com.pymcl.runtime.keyboard.QuickInputStore;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimeInput.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0014"}, d2 = {"Lcom/pymcl/runtime/input/RuntimeInput;", "", "<init>", "()V", "controlDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "layoutStore", "Lcom/pymcl/runtime/control/ControlLayoutStore;", "settingsFile", "loadSettings", "Lcom/pymcl/runtime/input/InputSettings;", "saveSettings", "", "s", "gamepadMapping", "Lcom/pymcl/runtime/input/GamepadMappingStore;", "quickInput", "Lcom/pymcl/runtime/keyboard/QuickInputStore;", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RuntimeInput {
    public static final RuntimeInput INSTANCE = new RuntimeInput();

    private RuntimeInput() {
    }

    public final File controlDir(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File $this$controlDir_u24lambda_u240 = new File(context.getFilesDir(), "control");
        $this$controlDir_u24lambda_u240.mkdirs();
        return $this$controlDir_u24lambda_u240;
    }

    public final ControlLayoutStore layoutStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ControlLayoutStore(controlDir(context));
    }

    public final File settingsFile(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new File(controlDir(context), "input_settings.json");
    }

    public final InputSettings loadSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return InputSettings.INSTANCE.load(settingsFile(context));
    }

    public final void saveSettings(Context context, InputSettings s) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(s, "s");
        s.save(settingsFile(context));
    }

    public final GamepadMappingStore gamepadMapping(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new GamepadMappingStore(new File(controlDir(context), GamepadMapping.FILE_NAME));
    }

    public final QuickInputStore quickInput(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new QuickInputStore(new File(controlDir(context), "quick_input.json"));
    }
}
