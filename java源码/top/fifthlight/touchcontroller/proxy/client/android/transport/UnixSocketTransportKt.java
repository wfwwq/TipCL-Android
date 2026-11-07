package top.fifthlight.touchcontroller.proxy.client.android.transport;

import android.net.LocalServerSocket;
import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.MessageTransport;

/* compiled from: UnixSocketTransport.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"TAG", "", UnixSocketTransportKt.TAG, "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", HintConstants.AUTOFILL_HINT_NAME, "proxy-client-android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class UnixSocketTransportKt {
    private static final String TAG = "UnixSocketTransport";

    public static final MessageTransport UnixSocketTransport(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new UnixSocketTransport(new LocalServerSocket(name));
    }
}
