.class public final Lcom/pymcl/android/data/CrashScenes;
.super Ljava/lang/Object;
.source "MiscLogic.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/android/data/CrashScenes;",
        "",
        "<init>",
        "()V",
        "LAUNCH_FAIL_SECONDS",
        "",
        "ofGameExit",
        "Lcom/pymcl/android/ui/state/CrashScene;",
        "durationSec",
        "ofTaskKind",
        "kind",
        "",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/pymcl/android/data/CrashScenes;

.field public static final LAUNCH_FAIL_SECONDS:J = 0x1eL


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/CrashScenes;

    invoke-direct {v0}, Lcom/pymcl/android/data/CrashScenes;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/CrashScenes;->INSTANCE:Lcom/pymcl/android/data/CrashScenes;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ofGameExit(J)Lcom/pymcl/android/ui/state/CrashScene;
    .locals 4
    .param p1, "durationSec"    # J

    .line 165
    const-wide/16 v0, 0x0

    cmp-long v0, v0, p1

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    const-wide/16 v2, 0x1e

    cmp-long v0, p1, v2

    if-gez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    sget-object v0, Lcom/pymcl/android/ui/state/CrashScene;->LAUNCH:Lcom/pymcl/android/ui/state/CrashScene;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/pymcl/android/ui/state/CrashScene;->GAME_RUN:Lcom/pymcl/android/ui/state/CrashScene;

    :goto_0
    return-object v0
.end method

.method public final ofTaskKind(Ljava/lang/String;)Lcom/pymcl/android/ui/state/CrashScene;
    .locals 1
    .param p1, "kind"    # Ljava/lang/String;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    const-string v0, "launch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pymcl/android/ui/state/CrashScene;->LAUNCH:Lcom/pymcl/android/ui/state/CrashScene;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/android/ui/state/CrashScene;->TASK:Lcom/pymcl/android/ui/state/CrashScene;

    :goto_0
    return-object v0
.end method
