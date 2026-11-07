package org.lwjgl.glfw;

import android.view.Choreographer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallbackBridge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Choreographer.FrameCallback f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ CallbackBridge$$ExternalSyntheticLambda0(Choreographer.FrameCallback frameCallback, long j) {
        this.f$0 = frameCallback;
        this.f$1 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CallbackBridge.lambda$postFrameCallbackDelayed$0(this.f$0, this.f$1);
    }
}
