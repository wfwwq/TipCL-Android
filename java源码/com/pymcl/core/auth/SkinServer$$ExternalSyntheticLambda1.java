package com.pymcl.core.auth;

import java.util.concurrent.ThreadFactory;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class SkinServer$$ExternalSyntheticLambda1 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return SkinServer.start$lambda$0(runnable);
    }
}
