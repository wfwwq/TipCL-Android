package com.tungsten.fclauncher;

import android.content.Context;
import com.mio.data.Renderer;
import com.pymcl.runtime.process.JavaProcessService;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FCLConfig.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001)B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/tungsten/fclauncher/FCLConfig;", "Ljava/io/Serializable;", "context", "Landroid/content/Context;", "logDir", "", "javaPath", "workingDir", "renderer", "Lcom/mio/data/Renderer;", JavaProcessService.EXTRA_ARGS, "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mio/data/Renderer;[Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getLogDir", "()Ljava/lang/String;", "getJavaPath", "getWorkingDir", "getRenderer", "()Lcom/mio/data/Renderer;", "getArgs", "()[Ljava/lang/String;", "[Ljava/lang/String;", "useVKDriverSystem", "", "getUseVKDriverSystem", "()Z", "setUseVKDriverSystem", "(Z)V", "installedModLoaders", "Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;", "getInstalledModLoaders", "()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;", "setInstalledModLoaders", "(Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;)V", "lwjglVersion", "getLwjglVersion", "setLwjglVersion", "(Ljava/lang/String;)V", "InstalledModLoaders", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FCLConfig implements Serializable {
    private final String[] args;
    private final Context context;
    private InstalledModLoaders installedModLoaders;
    private final String javaPath;
    private final String logDir;
    private String lwjglVersion;
    private final Renderer renderer;
    private boolean useVKDriverSystem;
    private final String workingDir;

    public FCLConfig(Context context, String logDir, String javaPath, String workingDir, Renderer renderer, String[] args) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logDir, "logDir");
        Intrinsics.checkNotNullParameter(javaPath, "javaPath");
        Intrinsics.checkNotNullParameter(workingDir, "workingDir");
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(args, "args");
        this.context = context;
        this.logDir = logDir;
        this.javaPath = javaPath;
        this.workingDir = workingDir;
        this.renderer = renderer;
        this.args = args;
        this.lwjglVersion = "3.3.3";
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getLogDir() {
        return this.logDir;
    }

    public final String getJavaPath() {
        return this.javaPath;
    }

    public final String getWorkingDir() {
        return this.workingDir;
    }

    public final Renderer getRenderer() {
        return this.renderer;
    }

    public final String[] getArgs() {
        return this.args;
    }

    public final boolean getUseVKDriverSystem() {
        return this.useVKDriverSystem;
    }

    public final void setUseVKDriverSystem(boolean z) {
        this.useVKDriverSystem = z;
    }

    public final InstalledModLoaders getInstalledModLoaders() {
        return this.installedModLoaders;
    }

    public final void setInstalledModLoaders(InstalledModLoaders installedModLoaders) {
        this.installedModLoaders = installedModLoaders;
    }

    public final String getLwjglVersion() {
        return this.lwjglVersion;
    }

    public final void setLwjglVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lwjglVersion = str;
    }

    /* compiled from: FCLConfig.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, d2 = {"Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;", "", "installForge", "", "installCleanroom", "installNeoForge", "installOptiFine", "installLiteLoader", "installFabric", "installQuilt", "<init>", "(ZZZZZZZ)V", "getInstallForge", "()Z", "getInstallCleanroom", "getInstallNeoForge", "getInstallOptiFine", "getInstallLiteLoader", "getInstallFabric", "getInstallQuilt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InstalledModLoaders {
        private final boolean installCleanroom;
        private final boolean installFabric;
        private final boolean installForge;
        private final boolean installLiteLoader;
        private final boolean installNeoForge;
        private final boolean installOptiFine;
        private final boolean installQuilt;

        public static /* synthetic */ InstalledModLoaders copy$default(InstalledModLoaders installedModLoaders, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
            if ((i & 1) != 0) {
                z = installedModLoaders.installForge;
            }
            if ((i & 2) != 0) {
                z2 = installedModLoaders.installCleanroom;
            }
            if ((i & 4) != 0) {
                z3 = installedModLoaders.installNeoForge;
            }
            if ((i & 8) != 0) {
                z4 = installedModLoaders.installOptiFine;
            }
            if ((i & 16) != 0) {
                z5 = installedModLoaders.installLiteLoader;
            }
            if ((i & 32) != 0) {
                z6 = installedModLoaders.installFabric;
            }
            if ((i & 64) != 0) {
                z7 = installedModLoaders.installQuilt;
            }
            boolean z8 = z6;
            boolean z9 = z7;
            boolean z10 = z5;
            boolean z11 = z3;
            return installedModLoaders.copy(z, z2, z11, z4, z10, z8, z9);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getInstallForge() {
            return this.installForge;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInstallCleanroom() {
            return this.installCleanroom;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInstallNeoForge() {
            return this.installNeoForge;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getInstallOptiFine() {
            return this.installOptiFine;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getInstallLiteLoader() {
            return this.installLiteLoader;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getInstallFabric() {
            return this.installFabric;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getInstallQuilt() {
            return this.installQuilt;
        }

        public final InstalledModLoaders copy(boolean installForge, boolean installCleanroom, boolean installNeoForge, boolean installOptiFine, boolean installLiteLoader, boolean installFabric, boolean installQuilt) {
            return new InstalledModLoaders(installForge, installCleanroom, installNeoForge, installOptiFine, installLiteLoader, installFabric, installQuilt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstalledModLoaders)) {
                return false;
            }
            InstalledModLoaders installedModLoaders = (InstalledModLoaders) other;
            return this.installForge == installedModLoaders.installForge && this.installCleanroom == installedModLoaders.installCleanroom && this.installNeoForge == installedModLoaders.installNeoForge && this.installOptiFine == installedModLoaders.installOptiFine && this.installLiteLoader == installedModLoaders.installLiteLoader && this.installFabric == installedModLoaders.installFabric && this.installQuilt == installedModLoaders.installQuilt;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ??, still in use, count: 2, list:
              (r0v1 ?? I:int) from 0x0006: ARITH (r1v0 ?? I:int) = (r0v1 ?? I:int) * (31 int)
              (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory) from 0x000a: INVOKE (r2v1 ?? I:void) = (r2v0 ?? I:java.awt.Label), (r0v1 ?? I:com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory) STATIC call: com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(java.awt.Label, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory):void A[MD:(java.awt.Label, com.github.caciocavallosilano.cacio.peer.PlatformWindowFactory):void (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public int hashCode() {
            /*
                r3 = this;
                boolean r0 = r3.installForge
                void r0 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r0, r0)
                int r1 = r0 * 31
                boolean r2 = r3.installCleanroom
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r1 = r1 + r2
                int r0 = r1 * 31
                boolean r2 = r3.installNeoForge
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r0 = r0 + r2
                int r1 = r0 * 31
                boolean r2 = r3.installOptiFine
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r1 = r1 + r2
                int r0 = r1 * 31
                boolean r2 = r3.installLiteLoader
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r0 = r0 + r2
                int r1 = r0 * 31
                boolean r2 = r3.installFabric
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r1 = r1 + r2
                int r0 = r1 * 31
                boolean r2 = r3.installQuilt
                void r2 = com.github.caciocavallosilano.cacio.peer.CacioLabelPeer.<init>(r2, r0)
                int r0 = r0 + r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tungsten.fclauncher.FCLConfig.InstalledModLoaders.hashCode():int");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v14 ??, still in use, count: 1, list:
              (r0v14 ?? I:java.awt.MenuBar) from CONSTRUCTOR (r0v14 ?? I:java.awt.MenuBar) call: com.github.caciocavallosilano.cacio.peer.CacioMenuBarPeer.<init>(java.awt.MenuBar):void type: CONSTRUCTOR
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1130)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1168)
            	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:243)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:93)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public java.lang.String toString() {
            /*
                r9 = this;
                boolean r0 = r9.installForge
                boolean r1 = r9.installCleanroom
                boolean r2 = r9.installNeoForge
                boolean r3 = r9.installOptiFine
                boolean r4 = r9.installLiteLoader
                boolean r5 = r9.installFabric
                boolean r6 = r9.installQuilt
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "InstalledModLoaders(installForge="
                java.lang.StringBuilder r7 = r7.append(r8)
                java.lang.StringBuilder r0 = r7.append(r0)
                java.lang.String r7 = ", installCleanroom="
                java.lang.StringBuilder r0 = r0.append(r7)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", installNeoForge="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r1 = ", installOptiFine="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r1 = ", installLiteLoader="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r4)
                java.lang.String r1 = ", installFabric="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r1 = ", installQuilt="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.StringBuilder r0 = r0.append(r6)
                java.lang.String r1 = ")"
                java.lang.StringBuilder r0 = r0.append(r1)
                void r0 = r0.<init>(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tungsten.fclauncher.FCLConfig.InstalledModLoaders.toString():java.lang.String");
        }

        public InstalledModLoaders(boolean installForge, boolean installCleanroom, boolean installNeoForge, boolean installOptiFine, boolean installLiteLoader, boolean installFabric, boolean installQuilt) {
            this.installForge = installForge;
            this.installCleanroom = installCleanroom;
            this.installNeoForge = installNeoForge;
            this.installOptiFine = installOptiFine;
            this.installLiteLoader = installLiteLoader;
            this.installFabric = installFabric;
            this.installQuilt = installQuilt;
        }

        public final boolean getInstallForge() {
            return this.installForge;
        }

        public final boolean getInstallCleanroom() {
            return this.installCleanroom;
        }

        public final boolean getInstallNeoForge() {
            return this.installNeoForge;
        }

        public final boolean getInstallOptiFine() {
            return this.installOptiFine;
        }

        public final boolean getInstallLiteLoader() {
            return this.installLiteLoader;
        }

        public final boolean getInstallFabric() {
            return this.installFabric;
        }

        public final boolean getInstallQuilt() {
            return this.installQuilt;
        }
    }
}
