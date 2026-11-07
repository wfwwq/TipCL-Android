package com.pymcl.runtime.input;

import android.util.Log;
import com.pymcl.multiplayer.TerracottaVpnService;
import com.tungsten.fcl.game.sdl.SdlBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.libsdl.app.PyMclSdlText;

/* compiled from: SdlTextInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/pymcl/runtime/input/NativeSdlTextChannel;", "Lcom/pymcl/runtime/input/SdlTextChannel;", "<init>", "()V", "TAG", "", "broken", "", "available", "commit", TerracottaVpnService.EXTRA_TEXT, "controlChar", "c", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NativeSdlTextChannel implements SdlTextChannel {
    public static final NativeSdlTextChannel INSTANCE = new NativeSdlTextChannel();
    private static final String TAG = "PyMCL-SdlText";
    private static volatile boolean broken;

    private NativeSdlTextChannel() {
    }

    @Override // com.pymcl.runtime.input.SdlTextChannel
    public boolean available() {
        return !broken && SdlBridge.safeIsSdlRenderActive();
    }

    @Override // com.pymcl.runtime.input.SdlTextChannel
    public boolean commit(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (broken) {
            return false;
        }
        if (!SdlBridge.safeIsNativeTextInputActive() && !SdlBridge.safeSetNativeTextInputActive(true)) {
            Log.w(TAG, "native text input unavailable");
            return false;
        }
        try {
            PyMclSdlText.commitText(text);
            return true;
        } catch (Throwable e) {
            broken = true;
            Log.w(TAG, "nativeCommitText failed", e);
            return false;
        }
    }

    @Override // com.pymcl.runtime.input.SdlTextChannel
    public boolean controlChar(char c) {
        if (broken) {
            return false;
        }
        try {
            PyMclSdlText.controlChar(c);
            return true;
        } catch (Throwable e) {
            broken = true;
            Log.w(TAG, "nativeGenerateScancodeForUnichar failed", e);
            return false;
        }
    }
}
