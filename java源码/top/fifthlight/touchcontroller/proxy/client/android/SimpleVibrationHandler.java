package top.fifthlight.touchcontroller.proxy.client.android;

import android.os.Vibrator;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient;
import top.fifthlight.touchcontroller.proxy.message.VibrateMessage;

/* compiled from: SimpleVibrationHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandler;", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;", NotificationCompat.CATEGORY_SERVICE, "Landroid/os/Vibrator;", "<init>", "(Landroid/os/Vibrator;)V", "vibrate", "", "kind", "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;", "proxy-client-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class SimpleVibrationHandler implements LauncherProxyClient.VibrationHandler {
    private final Vibrator service;

    public SimpleVibrationHandler(Vibrator service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    @Override // top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient.VibrationHandler
    public void vibrate(VibrateMessage.Kind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        try {
            this.service.vibrate(100L);
        } catch (Exception ex) {
            Log.w(SimpleVibrationHandlerKt.TAG, "Failed to trigger vibration", ex);
        }
    }
}
