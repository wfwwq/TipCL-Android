package com.tungsten.fcl.game.sdl;

import android.app.Activity;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class SdlBridge$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ Activity f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ SdlBridge$$ExternalSyntheticLambda0(Activity activity, String str) {
        this.f$0 = activity;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SdlBridge.lambda$openUrl$0(this.f$0, this.f$1);
    }
}
