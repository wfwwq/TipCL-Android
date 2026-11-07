.class public final Lcom/pymcl/android/data/MpLogic;
.super Ljava/lang/Object;
.source "MiscLogic.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b\u00ca\u0001\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/MpLogic;",
        "",
        "<init>",
        "()V",
        "canDisconnect",
        "",
        "p",
        "Lcom/pymcl/android/ui/state/MpPhase;",
        "kernelRunning",
        "codeHint",
        "Lkotlin/Pair;",
        "",
        "code",
        "kind",
        "canEnter",
        "serverUrl",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/pymcl/android/data/MpLogic;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/MpLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/MpLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/MpLogic;->INSTANCE:Lcom/pymcl/android/data/MpLogic;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final canDisconnect(Lcom/pymcl/android/ui/state/MpPhase;)Z
    .locals 1
    .param p1, "p"    # Lcom/pymcl/android/ui/state/MpPhase;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->HostScanning:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->Hosting:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->GuestJoining:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->GuestReady:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_1

    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->Error:Lcom/pymcl/android/ui/state/MpPhase;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final canEnter(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;)Z
    .locals 1
    .param p1, "p"    # Lcom/pymcl/android/ui/state/MpPhase;
    .param p2, "serverUrl"    # Ljava/lang/String;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->GuestReady:Lcom/pymcl/android/ui/state/MpPhase;

    if-ne p1, v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final codeHint(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;
    .locals 3
    .param p1, "code"    # Ljava/lang/String;
    .param p2, "kind"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    nop

    .line 52
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v0, :cond_0

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    goto :goto_0

    .line 53
    :cond_0
    const-string v0, "TERRACOTTA"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    goto :goto_0

    .line 54
    :cond_1
    const-string v0, "LEGACY_PCL"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "\u8fd9\u662f\u65e7\u7248 PCL \u8054\u673a\u623f\u95f4\u53f7\uff0c\u4e0e\u9676\u74e6\u8054\u673a\u4e0d\u4e92\u901a"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    goto :goto_0

    .line 55
    :cond_2
    const-string v0, "\u9080\u8bf7\u7801\u683c\u5f0f\u4e0d\u6b63\u786e\uff08\u5e94\u4e3a U/XXXX-XXXX-XXXX-XXXX\uff09"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 56
    :goto_0
    return-object v0
.end method

.method public final kernelRunning(Lcom/pymcl/android/ui/state/MpPhase;)Z
    .locals 1
    .param p1, "p"    # Lcom/pymcl/android/ui/state/MpPhase;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->Stopped:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/pymcl/android/ui/state/MpPhase;->NotInstalled:Lcom/pymcl/android/ui/state/MpPhase;

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
