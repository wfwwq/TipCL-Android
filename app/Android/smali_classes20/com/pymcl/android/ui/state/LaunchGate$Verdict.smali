.class public final Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
.super Ljava/lang/Object;
.source "LaunchGate.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/LaunchGate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Verdict"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003JO\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005H\u00c6\u0001J\u0014\u0010$\u001a\u00020\u00072\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\'H\u00d6\u0081\u0004J\n\u0010(\u001a\u00020\u0005H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0012R\u0011\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0012R\u0011\u0010\u001a\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u0014\u00ca\u0001\u000c\u0008*\u0012\u0008\u0008+\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
        "",
        "reason",
        "Lcom/pymcl/android/ui/state/LaunchGate$Reason;",
        "buttonText",
        "",
        "enabled",
        "",
        "action",
        "Lcom/pymcl/android/ui/state/LaunchGate$Action;",
        "status",
        "detail",
        "version",
        "<init>",
        "(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getReason",
        "()Lcom/pymcl/android/ui/state/LaunchGate$Reason;",
        "getButtonText",
        "()Ljava/lang/String;",
        "getEnabled",
        "()Z",
        "getAction",
        "()Lcom/pymcl/android/ui/state/LaunchGate$Action;",
        "getStatus",
        "getDetail",
        "getVersion",
        "canLaunch",
        "getCanLaunch",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

.field private final buttonText:Ljava/lang/String;

.field private final detail:Ljava/lang/String;

.field private final enabled:Z

.field private final reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field private final status:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "reason"    # Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .param p2, "buttonText"    # Ljava/lang/String;
    .param p3, "enabled"    # Z
    .param p4, "action"    # Lcom/pymcl/android/ui/state/LaunchGate$Action;
    .param p5, "status"    # Ljava/lang/String;
    .param p6, "detail"    # Ljava/lang/String;
    .param p7, "version"    # Ljava/lang/String;

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detail"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    .line 41
    iput-object p2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    .line 43
    iput-boolean p3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    .line 44
    iput-object p4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    .line 46
    iput-object p5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    .line 48
    iput-object p6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    .line 50
    iput-object p7, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 38
    and-int/lit8 p9, p8, 0x20

    const-string v0, ""

    if-eqz p9, :cond_0

    .line 48
    move-object p6, v0

    .line 38
    :cond_0
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_1

    .line 50
    move-object p8, v0

    goto :goto_0

    .line 38
    :cond_1
    move-object p8, p7

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p8}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/LaunchGate$Verdict;Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->copy(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    return v0
.end method

.method public final component4()Lcom/pymcl/android/ui/state/LaunchGate$Action;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    .locals 9

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonText"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "detail"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    return v2

    :cond_7
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getAction()Lcom/pymcl/android/ui/state/LaunchGate$Action;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    return-object v0
.end method

.method public final getButtonText()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    return-object v0
.end method

.method public final getCanLaunch()Z
    .locals 2

    .line 52
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v1, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Ok:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getDetail()Ljava/lang/String;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    return v0
.end method

.method public final getReason()Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/LaunchGate$Action;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->reason:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->buttonText:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->enabled:Z

    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->action:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    iget-object v4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->status:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->detail:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->version:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Verdict(reason="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", buttonText="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", action="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", detail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
