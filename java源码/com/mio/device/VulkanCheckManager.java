package com.mio.device;

import kotlin.Metadata;

/* compiled from: VulkanCheckManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/mio/device/VulkanCheckManager;", "", "<init>", "()V", "needsVulkanShim", "", "getNeedsVulkanShim", "()Z", "setNeedsVulkanShim", "(Z)V", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VulkanCheckManager {
    public static final VulkanCheckManager INSTANCE = new VulkanCheckManager();
    private static boolean needsVulkanShim;

    private VulkanCheckManager() {
    }

    public final boolean getNeedsVulkanShim() {
        return needsVulkanShim;
    }

    public final void setNeedsVulkanShim(boolean z) {
        needsVulkanShim = z;
    }
}
