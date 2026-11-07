.class public final Lcom/pymcl/android/ui/state/LaunchGate$Input;
.super Ljava/lang/Object;
.source "LaunchGate.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/LaunchGate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Input"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u001f\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bs\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0004H\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0004H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\tH\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\t\u0010\'\u001a\u00020\tH\u00c6\u0003J\u000f\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000eH\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\u007f\u0010*\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\tH\u00c6\u0001J\u0014\u0010+\u001a\u00020\t2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010-\u001a\u00020.H\u00d6\u0081\u0004J\n\u0010/\u001a\u00020\u0004H\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0015R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0019R\u0011\u0010\u000c\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0019R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0019\u00ca\u0001\u000c\u00081\u0012\u0008\u00082\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u00060"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LaunchGate$Input;",
        "",
        "instances",
        "",
        "",
        "selectedInstance",
        "versions",
        "selectedVersion",
        "hasAccount",
        "",
        "gameRunning",
        "launching",
        "installing",
        "incomplete",
        "",
        "loading",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V",
        "getInstances",
        "()Ljava/util/List;",
        "getSelectedInstance",
        "()Ljava/lang/String;",
        "getVersions",
        "getSelectedVersion",
        "getHasAccount",
        "()Z",
        "getGameRunning",
        "getLaunching",
        "getInstalling",
        "getIncomplete",
        "()Ljava/util/Set;",
        "getLoading",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
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
.field private final gameRunning:Z

.field private final hasAccount:Z

.field private final incomplete:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final installing:Z

.field private final instances:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final launching:Z

.field private final loading:Z

.field private final selectedInstance:Ljava/lang/String;

.field private final selectedVersion:Ljava/lang/String;

.field private final versions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V
    .locals 1
    .param p1, "instances"    # Ljava/util/List;
    .param p2, "selectedInstance"    # Ljava/lang/String;
    .param p3, "versions"    # Ljava/util/List;
    .param p4, "selectedVersion"    # Ljava/lang/String;
    .param p5, "hasAccount"    # Z
    .param p6, "gameRunning"    # Z
    .param p7, "launching"    # Z
    .param p8, "installing"    # Z
    .param p9, "incomplete"    # Ljava/util/Set;
    .param p10, "loading"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "instances"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedVersion"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomplete"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    .line 22
    iput-object p2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    .line 26
    iput-object p4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    .line 27
    iput-boolean p5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    .line 28
    iput-boolean p6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    .line 29
    iput-boolean p7, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    .line 31
    iput-boolean p8, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    .line 33
    iput-object p9, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    .line 35
    iput-boolean p10, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    .line 20
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    .line 20
    and-int/lit8 p12, p11, 0x20

    const/4 v0, 0x0

    if-eqz p12, :cond_0

    .line 28
    move p6, v0

    .line 20
    :cond_0
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_1

    .line 29
    move p7, v0

    .line 20
    :cond_1
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_2

    .line 31
    move p8, v0

    .line 20
    :cond_2
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_3

    .line 33
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p9

    .line 20
    :cond_3
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_4

    .line 35
    move p11, v0

    goto :goto_0

    .line 20
    :cond_4
    move p11, p10

    :goto_0
    move-object p10, p9

    move p9, p8

    move p8, p7

    move p7, p6

    move p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p11}, Lcom/pymcl/android/ui/state/LaunchGate$Input;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V

    .line 36
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/android/ui/state/LaunchGate$Input;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;ZILjava/lang/Object;)Lcom/pymcl/android/ui/state/LaunchGate$Input;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-boolean p5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-boolean p6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-boolean p7, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-object p9, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    :cond_9
    move-object p11, p9

    move p12, p10

    move p9, p7

    move p10, p8

    move p7, p5

    move p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->copy(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)Lcom/pymcl/android/ui/state/LaunchGate$Input;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    return v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    return v0
.end method

.method public final component9()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)Lcom/pymcl/android/ui/state/LaunchGate$Input;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "ZZZZ",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)",
            "Lcom/pymcl/android/ui/state/LaunchGate$Input;"
        }
    .end annotation

    const-string v0, "instances"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedInstance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versions"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedVersion"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "incomplete"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lcom/pymcl/android/ui/state/LaunchGate$Input;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/android/ui/state/LaunchGate$Input;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    if-eq v3, v4, :cond_8

    return v2

    :cond_8
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    iget-boolean v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    if-eq v3, v4, :cond_9

    return v2

    :cond_9
    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    iget-object v4, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    return v2

    :cond_a
    iget-boolean v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    iget-boolean v1, v1, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    if-eq v3, v1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final getGameRunning()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    return v0
.end method

.method public final getHasAccount()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    return v0
.end method

.method public final getIncomplete()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    return-object v0
.end method

.method public final getInstalling()Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    return v0
.end method

.method public final getInstances()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 21
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    return-object v0
.end method

.method public final getLaunching()Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    return v0
.end method

.method public final getLoading()Z
    .locals 1

    .line 35
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    return v0
.end method

.method public final getSelectedInstance()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedVersion()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->instances:Ljava/util/List;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedInstance:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->versions:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->selectedVersion:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->hasAccount:Z

    iget-boolean v5, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->gameRunning:Z

    iget-boolean v6, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->launching:Z

    iget-boolean v7, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->installing:Z

    iget-object v8, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->incomplete:Ljava/util/Set;

    iget-boolean v9, p0, Lcom/pymcl/android/ui/state/LaunchGate$Input;->loading:Z

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Input(instances="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, ", selectedInstance="

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", selectedVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hasAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gameRunning="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", launching="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", installing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", incomplete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", loading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
