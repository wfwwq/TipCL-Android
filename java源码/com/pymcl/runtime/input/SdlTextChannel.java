package com.pymcl.runtime.input;

import com.pymcl.multiplayer.TerracottaVpnService;
import kotlin.Metadata;

/* compiled from: SdlTextInput.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/pymcl/runtime/input/SdlTextChannel;", "", "available", "", "commit", TerracottaVpnService.EXTRA_TEXT, "", "controlChar", "c", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SdlTextChannel {
    boolean available();

    boolean commit(String text);

    boolean controlChar(char c);
}
