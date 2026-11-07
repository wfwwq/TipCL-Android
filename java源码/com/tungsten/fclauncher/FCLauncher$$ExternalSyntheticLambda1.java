package com.tungsten.fclauncher;

import com.tungsten.fclauncher.bridge.FCLBridge;
import java.util.function.Consumer;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class FCLauncher$$ExternalSyntheticLambda1 implements Consumer {
    public final /* synthetic */ FCLBridge f$0;
    public final /* synthetic */ FCLConfig f$1;

    public /* synthetic */ FCLauncher$$ExternalSyntheticLambda1(FCLBridge fCLBridge, FCLConfig fCLConfig) {
        this.f$0 = fCLBridge;
        this.f$1 = fCLConfig;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        FCLauncher.lambda$setupGraphicAndSoundEngine$1(this.f$0, this.f$1, (String) obj);
    }
}
