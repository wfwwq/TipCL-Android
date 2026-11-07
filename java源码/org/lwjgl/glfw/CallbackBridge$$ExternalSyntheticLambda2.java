package org.lwjgl.glfw;

import android.view.Choreographer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class CallbackBridge$$ExternalSyntheticLambda2 implements Choreographer.FrameCallback {
    public final /* synthetic */ int f$0;
    public final /* synthetic */ float f$1;
    public final /* synthetic */ float f$2;

    public /* synthetic */ CallbackBridge$$ExternalSyntheticLambda2(int i, float f, float f2) {
        this.f$0 = i;
        this.f$1 = f;
        this.f$2 = f2;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        CallbackBridge.lambda$putMouseEventWithCoords$1(this.f$0, this.f$1, this.f$2, j);
    }
}
