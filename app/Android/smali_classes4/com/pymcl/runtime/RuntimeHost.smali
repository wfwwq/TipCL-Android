.class public final Lcom/pymcl/runtime/RuntimeHost;
.super Ljava/lang/Object;
.source "RuntimeHost.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0007b\u0002\u0008\nJ\u001c\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007b\u0002\u0008\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/runtime/RuntimeHost;",
        "",
        "<init>",
        "()V",
        "initialized",
        "",
        "init",
        "",
        "context",
        "Landroid/content/Context;",
        "Lkotlin/jvm/JvmStatic;",
        "openFolder",
        "activity",
        "Landroid/app/Activity;",
        "path",
        "",
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


# static fields
.field public static final INSTANCE:Lcom/pymcl/runtime/RuntimeHost;

.field private static volatile initialized:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/RuntimeHost;

    invoke-direct {v0}, Lcom/pymcl/runtime/RuntimeHost;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/RuntimeHost;->INSTANCE:Lcom/pymcl/runtime/RuntimeHost;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final init(Landroid/content/Context;)V
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    sget-boolean v0, Lcom/pymcl/runtime/RuntimeHost;->initialized:Z

    if-eqz v0, :cond_0

    return-void

    .line 17
    :cond_0
    invoke-static {p0}, Lcom/tungsten/fcl/FCLApp;->init(Landroid/content/Context;)V

    .line 18
    invoke-static {p0}, Lcom/tungsten/fclauncher/utils/FCLPath;->loadPaths(Landroid/content/Context;)V

    .line 19
    invoke-static {p0}, Lcom/mio/plugin/DriverPlugin;->init(Landroid/content/Context;)V

    .line 20
    const/4 v0, 0x1

    sput-boolean v0, Lcom/pymcl/runtime/RuntimeHost;->initialized:Z

    .line 21
    return-void
.end method

.method public static final openFolder(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 3
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "path"    # Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 27
    return-void
.end method
