package top.fifthlight.touchcontroller.proxy.client.android;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.LauncherProxyClient;

/* compiled from: TouchControllerLayout.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "client", "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;", "getClient", "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;", "setClient", "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V", "pointerIdMap", "Landroid/util/SparseIntArray;", "nextPointerId", "", "getOffsetX", "", "Landroid/view/MotionEvent;", "index", "getOffsetY", "handleTouchEvent", "", NotificationCompat.CATEGORY_EVENT, "dispatchTouchEvent", "", "proxy-client-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class TouchControllerLayout extends FrameLayout {
    private LauncherProxyClient client;
    private int nextPointerId;
    private final SparseIntArray pointerIdMap;

    public /* synthetic */ TouchControllerLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TouchControllerLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchControllerLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        this.pointerIdMap = new SparseIntArray();
        this.nextPointerId = 1;
    }

    public final LauncherProxyClient getClient() {
        return this.client;
    }

    public final void setClient(LauncherProxyClient launcherProxyClient) {
        this.client = launcherProxyClient;
    }

    private final float getOffsetX(MotionEvent $this$getOffsetX, int index) {
        return $this$getOffsetX.getX(index) / getWidth();
    }

    private final float getOffsetY(MotionEvent $this$getOffsetY, int index) {
        return $this$getOffsetY.getY(index) / getHeight();
    }

    private final void handleTouchEvent(MotionEvent event) {
        LauncherProxyClient client = this.client;
        if (client == null) {
        }
        switch (event.getActionMasked()) {
            case 0:
                int pointerId = this.nextPointerId;
                this.nextPointerId = pointerId + 1;
                this.pointerIdMap.put(event.getPointerId(0), pointerId);
                client.addPointer(pointerId, getOffsetX(event, 0), getOffsetY(event, 0));
                break;
            case 1:
            case 3:
                client.clearPointer();
                this.pointerIdMap.clear();
                break;
            case 2:
                int pointerCount = event.getPointerCount();
                for (int i = 0; i < pointerCount; i++) {
                    client.addPointer(this.pointerIdMap.get(event.getPointerId(i)), getOffsetX(event, i), getOffsetY(event, i));
                }
                break;
            case 5:
                int i2 = this.nextPointerId;
                this.nextPointerId = i2 + 1;
                int i3 = event.getActionIndex();
                this.pointerIdMap.put(event.getPointerId(i3), i2);
                client.addPointer(i2, getOffsetX(event, i3), getOffsetY(event, i3));
                break;
            case 6:
                int i4 = event.getActionIndex();
                int pointerId2 = this.pointerIdMap.get(event.getPointerId(i4));
                if (pointerId2 != 0) {
                    this.pointerIdMap.delete(pointerId2);
                    client.removePointer(pointerId2);
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        handleTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }
}
