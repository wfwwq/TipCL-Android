.class public final Lcom/tungsten/fclauncher/FCLConfig;
.super Ljava/lang/Object;
.source "FCLConfig.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001:\u0001)B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000b\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\u0011\"\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/tungsten/fclauncher/FCLConfig;",
        "Ljava/io/Serializable;",
        "context",
        "Landroid/content/Context;",
        "logDir",
        "",
        "javaPath",
        "workingDir",
        "renderer",
        "Lcom/mio/data/Renderer;",
        "args",
        "",
        "<init>",
        "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mio/data/Renderer;[Ljava/lang/String;)V",
        "getContext",
        "()Landroid/content/Context;",
        "getLogDir",
        "()Ljava/lang/String;",
        "getJavaPath",
        "getWorkingDir",
        "getRenderer",
        "()Lcom/mio/data/Renderer;",
        "getArgs",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "useVKDriverSystem",
        "",
        "getUseVKDriverSystem",
        "()Z",
        "setUseVKDriverSystem",
        "(Z)V",
        "installedModLoaders",
        "Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;",
        "getInstalledModLoaders",
        "()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;",
        "setInstalledModLoaders",
        "(Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;)V",
        "lwjglVersion",
        "getLwjglVersion",
        "setLwjglVersion",
        "(Ljava/lang/String;)V",
        "InstalledModLoaders",
        "PyMCL-Android:runtime_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final args:[Ljava/lang/String;

.field private final context:Landroid/content/Context;

.field private installedModLoaders:Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

.field private final javaPath:Ljava/lang/String;

.field private final logDir:Ljava/lang/String;

.field private lwjglVersion:Ljava/lang/String;

.field private final renderer:Lcom/mio/data/Renderer;

.field private useVKDriverSystem:Z

.field private final workingDir:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mio/data/Renderer;[Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "logDir"    # Ljava/lang/String;
    .param p3, "javaPath"    # Ljava/lang/String;
    .param p4, "workingDir"    # Ljava/lang/String;
    .param p5, "renderer"    # Lcom/mio/data/Renderer;
    .param p6, "args"    # [Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPath"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workingDir"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderer"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLConfig;->context:Landroid/content/Context;

    .line 12
    iput-object p2, p0, Lcom/tungsten/fclauncher/FCLConfig;->logDir:Ljava/lang/String;

    .line 13
    iput-object p3, p0, Lcom/tungsten/fclauncher/FCLConfig;->javaPath:Ljava/lang/String;

    .line 14
    iput-object p4, p0, Lcom/tungsten/fclauncher/FCLConfig;->workingDir:Ljava/lang/String;

    .line 15
    iput-object p5, p0, Lcom/tungsten/fclauncher/FCLConfig;->renderer:Lcom/mio/data/Renderer;

    .line 16
    iput-object p6, p0, Lcom/tungsten/fclauncher/FCLConfig;->args:[Ljava/lang/String;

    .line 23
    const-string v0, "3.3.3"

    iput-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->lwjglVersion:Ljava/lang/String;

    .line 10
    return-void
.end method


# virtual methods
.method public final getArgs()[Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->args:[Ljava/lang/String;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getInstalledModLoaders()Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->installedModLoaders:Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    return-object v0
.end method

.method public final getJavaPath()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->javaPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getLogDir()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->logDir:Ljava/lang/String;

    return-object v0
.end method

.method public final getLwjglVersion()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->lwjglVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getRenderer()Lcom/mio/data/Renderer;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->renderer:Lcom/mio/data/Renderer;

    return-object v0
.end method

.method public final getUseVKDriverSystem()Z
    .locals 1

    .line 19
    iget-boolean v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->useVKDriverSystem:Z

    return v0
.end method

.method public final getWorkingDir()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLConfig;->workingDir:Ljava/lang/String;

    return-object v0
.end method

.method public final setInstalledModLoaders(Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;)V
    .locals 0
    .param p1, "<set-?>"    # Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    .line 21
    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLConfig;->installedModLoaders:Lcom/tungsten/fclauncher/FCLConfig$InstalledModLoaders;

    return-void
.end method

.method public final setLwjglVersion(Ljava/lang/String;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLConfig;->lwjglVersion:Ljava/lang/String;

    return-void
.end method

.method public final setUseVKDriverSystem(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 19
    iput-boolean p1, p0, Lcom/tungsten/fclauncher/FCLConfig;->useVKDriverSystem:Z

    return-void
.end method
