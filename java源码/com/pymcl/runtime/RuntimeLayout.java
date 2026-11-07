package com.pymcl.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RuntimeLayout.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/pymcl/runtime/RuntimeLayout;", "", "<init>", "()V", "ASSET_ROOT", "", "BUNDLED_JRE", "", "", "getBUNDLED_JRE", "()Ljava/util/List;", "COPY_COMPONENTS", "getCOPY_COMPONENTS", "archName", "abi", "jreArchives", "major", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RuntimeLayout {
    public static final String ASSET_ROOT = "app_runtime";
    public static final RuntimeLayout INSTANCE = new RuntimeLayout();
    private static final List<Integer> BUNDLED_JRE = CollectionsKt.listOf((Object[]) new Integer[]{17, 21});
    private static final List<String> COPY_COMPONENTS = CollectionsKt.listOf((Object[]) new String[]{"lwjgl", "jna", "caciocavallo", "caciocavallo17"});

    private RuntimeLayout() {
    }

    public final List<Integer> getBUNDLED_JRE() {
        return BUNDLED_JRE;
    }

    public final List<String> getCOPY_COMPONENTS() {
        return COPY_COMPONENTS;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public final String archName(String abi) {
        Intrinsics.checkNotNullParameter(abi, "abi");
        switch (abi.hashCode()) {
            case -806050265:
                if (abi.equals("x86_64")) {
                    return "x86_64";
                }
                break;
            case 117110:
                if (abi.equals("x86")) {
                    return "x86";
                }
                break;
            case 145444210:
                if (abi.equals("armeabi-v7a")) {
                    return "arm";
                }
                break;
            case 1431565292:
                if (abi.equals("arm64-v8a")) {
                    return "arm64";
                }
                break;
        }
        throw new IllegalStateException(("unsupported ABI " + abi).toString());
    }

    public final List<String> jreArchives(int major, String abi) {
        Intrinsics.checkNotNullParameter(abi, "abi");
        Iterable $this$map$iv = CollectionsKt.listOf((Object[]) new String[]{"universal.tar.xz", "bin-" + archName(abi) + ".tar.xz"});
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            String it = (String) item$iv$iv;
            destination$iv$iv.add("app_runtime/java/jre" + major + "/" + it);
        }
        return (List) destination$iv$iv;
    }
}
