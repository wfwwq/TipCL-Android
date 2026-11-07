.class public final Lcom/pymcl/android/ui/state/ModUpdateWatcher;
.super Ljava/lang/Object;
.source "ModUpdateWatcher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModUpdateWatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModUpdateWatcher.kt\ncom/pymcl/android/ui/state/ModUpdateWatcher\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,122:1\n85#2:123\n113#2,2:124\n85#2:126\n113#2,2:127\n1#3:129\n777#4:130\n873#4,2:131\n1739#4:133\n1814#4,3:134\n1739#4:137\n1814#4,3:138\n635#5,7:141\n*S KotlinDebug\n*F\n+ 1 ModUpdateWatcher.kt\ncom/pymcl/android/ui/state/ModUpdateWatcher\n*L\n53#1:123\n53#1:124,2\n55#1:126\n55#1:127,2\n95#1:130\n95#1:131,2\n95#1:133\n95#1:134,3\n109#1:137\n109#1:138,3\n119#1:141,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u001e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tJ\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\tJ\u000e\u0010\'\u001a\u00020#2\u0006\u0010(\u001a\u00020\rJ\u0008\u0010)\u001a\u00020#H\u0002J \u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001b2\u0008\u0008\u0002\u0010,\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020#2\u0006\u0010/\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u00100J$\u00101\u001a\u00020#2\u0006\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b2\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u001b03R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R+\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0014\u001a\u0004\u0008\u0016\u0010\u0010\"\u0004\u0008\u0017\u0010\u0012R\u001d\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR)\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0 0\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001e\u00ca\u0001\u000c\u00086\u0012\u0008\u00087\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u00065"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/ModUpdateWatcher;",
        "",
        "state",
        "Lcom/pymcl/android/ui/state/AppState;",
        "<init>",
        "(Lcom/pymcl/android/ui/state/AppState;)V",
        "prefs",
        "Lcom/pymcl/android/ui/state/ModWatchPrefs;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "loop",
        "Lkotlinx/coroutines/Job;",
        "<set-?>",
        "",
        "enabled",
        "getEnabled",
        "()Z",
        "setEnabled",
        "(Z)V",
        "enabled$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "checking",
        "getChecking",
        "setChecking",
        "checking$delegate",
        "counts",
        "Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "",
        "",
        "getCounts",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "details",
        "",
        "getDetails",
        "attach",
        "",
        "p",
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs;",
        "s",
        "switchTo",
        "on",
        "startLoop",
        "checkInstance",
        "instance",
        "version",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "checkAll",
        "notify",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "consumed",
        "files",
        "",
        "Companion",
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

.field public static final Companion:Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;

.field public static final MAX_VERSIONS:I = 0x3

.field public static final SUMMARY_ITEM:Ljava/lang/String; = "{0} {1} \u4e2a"


# instance fields
.field private final checking$delegate:Landroidx/compose/runtime/MutableState;

.field private final counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final enabled$delegate:Landroidx/compose/runtime/MutableState;

.field private loop:Lkotlinx/coroutines/Job;

.field private prefs:Lcom/pymcl/android/ui/state/ModWatchPrefs;

.field private scope:Lkotlinx/coroutines/CoroutineScope;

.field private final state:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->Companion:Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/AppState;)V
    .locals 4
    .param p1, "state"    # Lcom/pymcl/android/ui/state/AppState;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->state:Lcom/pymcl/android/ui/state/AppState;

    .line 53
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->enabled$delegate:Landroidx/compose/runtime/MutableState;

    .line 55
    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checking$delegate:Landroidx/compose/runtime/MutableState;

    .line 58
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .line 60
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .line 42
    return-void
.end method

.method public static final synthetic access$getPrefs$p(Lcom/pymcl/android/ui/state/ModUpdateWatcher;)Lcom/pymcl/android/ui/state/ModWatchPrefs;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .line 42
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->prefs:Lcom/pymcl/android/ui/state/ModWatchPrefs;

    return-object v0
.end method

.method public static synthetic checkInstance$default(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 93
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checkInstance(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final setChecking(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 55
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checking$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 127
    .local v4, "$i$f$setValue\\1\\55":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 128
    nop

    .line 55
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\55":I
    return-void
.end method

.method private final setEnabled(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 53
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->enabled$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 124
    .local v4, "$i$f$setValue\\1\\53":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 125
    nop

    .line 53
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\53":I
    return-void
.end method

.method private final startLoop()V
    .locals 7

    .line 78
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->scope:Lkotlinx/coroutines/CoroutineScope;

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v1, v0

    .line 79
    .local v1, "s":Lkotlinx/coroutines/CoroutineScope;
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->loop:Lkotlinx/coroutines/Job;

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->isActive()Z

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_1

    move v2, v3

    :cond_1
    if-eqz v2, :cond_2

    return-void

    .line 80
    :cond_2
    new-instance v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$startLoop$1;-><init>(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->loop:Lkotlinx/coroutines/Job;

    .line 90
    return-void
.end method


# virtual methods
.method public final attach(Lcom/pymcl/android/ui/state/ModWatchPrefs;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1
    .param p1, "p"    # Lcom/pymcl/android/ui/state/ModWatchPrefs;
    .param p2, "s"    # Lkotlinx/coroutines/CoroutineScope;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    iput-object p1, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->prefs:Lcom/pymcl/android/ui/state/ModWatchPrefs;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 67
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs;->getEnabled()Z

    move-result v0

    invoke-direct {p0, v0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->setEnabled(Z)V

    .line 68
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->startLoop()V

    .line 69
    :cond_0
    return-void
.end method

.method public final attach(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 1
    .param p1, "p"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .param p2, "s"    # Lkotlinx/coroutines/CoroutineScope;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    sget-object v0, Lcom/pymcl/android/ui/state/ModWatchPrefs;->Companion:Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs$Companion;->of(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)Lcom/pymcl/android/ui/state/ModWatchPrefs;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->attach(Lcom/pymcl/android/ui/state/ModWatchPrefs;Lkotlinx/coroutines/CoroutineScope;)V

    return-void
.end method

.method public final checkAll(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .param p1, "notify"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    instance-of v0, v2, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;

    iget v3, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;-><init>(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v3, v0

    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v4, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v5

    .line 105
    iget v0, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    packed-switch v0, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    move/from16 v10, p1

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    .restart local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :pswitch_0
    iget-boolean v7, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->Z$0:Z

    .end local p1    # "notify":Z
    .local v7, "notify":Z
    iget-object v0, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "i":Ljava/lang/String;
    iget-object v8, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    .local v9, "names":Ljava/util/List;
    :try_start_0
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v3

    move v10, v7

    move-object v11, v8

    move-object v12, v9

    move-object v3, v1

    move-object v9, v4

    goto/16 :goto_7

    .line 113
    .end local v0    # "i":Ljava/lang/String;
    .end local v9    # "names":Ljava/util/List;
    :catchall_0
    move-exception v0

    move-object v6, v3

    move-object v3, v1

    goto/16 :goto_8

    .line 105
    .end local v7    # "notify":Z
    .restart local p1    # "notify":Z
    :pswitch_1
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-ModUpdateWatcher$checkAll$names$1\\1\\109\\0":I
    iget-boolean v7, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->Z$0:Z

    .end local p1    # "notify":Z
    .restart local v7    # "notify":Z
    iget-object v8, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .local v8, "$this$checkAll_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :try_start_1
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v9, v8

    move v8, v0

    move-object v0, v4

    goto :goto_1

    .line 109
    .end local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkAll$names$1\\1\\109\\0":I
    .end local v8    # "$this$checkAll_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :catchall_1
    move-exception v0

    goto/16 :goto_4

    .line 105
    .end local v7    # "notify":Z
    .restart local p1    # "notify":Z
    :pswitch_2
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 106
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getChecking()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 107
    :cond_1
    const/4 v0, 0x1

    invoke-direct {v1, v0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->setChecking(Z)V

    .line 108
    nop

    .line 109
    :try_start_2
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v7, v1

    check-cast v7, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-object v8, v7

    .line 129
    .restart local v8    # "$this$checkAll_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    const/4 v7, 0x0

    .line 109
    .local v7, "$i$a$-runCatching-ModUpdateWatcher$checkAll$names$1\\1\\109\\0":I
    iget-object v9, v8, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v9}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v9

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$0:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move/from16 v10, p1

    :try_start_3
    iput-boolean v10, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->Z$0:Z

    iput v0, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    invoke-interface {v9, v3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v0, v5, :cond_2

    .line 105
    return-object v5

    .line 109
    :cond_2
    move-object v9, v8

    move v8, v7

    move v7, v10

    .line 105
    .end local p1    # "notify":Z
    .local v7, "notify":Z
    .local v8, "$i$a$-runCatching-ModUpdateWatcher$checkAll$names$1\\1\\109\\0":I
    .local v9, "$this$checkAll_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :goto_1
    :try_start_4
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 137
    .local v10, "$i$f$map\\2\\109":I
    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v0, v12}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination\\3":Ljava/util/Collection;
    move-object v12, v0

    .local v12, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 138
    .local v13, "$i$f$mapTo\\3\\137":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 139
    .local v15, "item\\3":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/InstanceRow;

    .local v16, "it\\4":Lcom/pymcl/android/ui/state/InstanceRow;
    const/16 v17, 0x0

    .line 109
    .local v17, "$i$a$-map-ModUpdateWatcher$checkAll$names$1$1\\4\\139\\1":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v6

    .line 139
    .end local v16    # "it\\4":Lcom/pymcl/android/ui/state/InstanceRow;
    .end local v17    # "$i$a$-map-ModUpdateWatcher$checkAll$names$1$1\\4\\139\\1":I
    invoke-interface {v11, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 140
    .end local v15    # "item\\3":Ljava/lang/Object;
    :cond_3
    nop

    .end local v11    # "destination\\3":Ljava/util/Collection;
    .end local v12    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapTo\\3\\137":I
    move-object v6, v11

    check-cast v6, Ljava/util/List;

    .line 137
    nop

    .line 109
    .end local v0    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v10    # "$i$f$map\\2\\109":I
    nop

    .end local v8    # "$i$a$-runCatching-ModUpdateWatcher$checkAll$names$1\\1\\109\\0":I
    .end local v9    # "$this$checkAll_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_5

    .end local v7    # "notify":Z
    .restart local p1    # "notify":Z
    :catchall_2
    move-exception v0

    goto :goto_3

    :catchall_3
    move-exception v0

    move/from16 v10, p1

    :goto_3
    move v7, v10

    .end local p1    # "notify":Z
    .restart local v7    # "notify":Z
    :goto_4
    :try_start_5
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v6

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object v0, v6

    :cond_4
    check-cast v0, Ljava/util/List;

    .line 110
    .local v0, "names":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object v12, v0

    move-object v9, v4

    move-object v11, v6

    move v10, v7

    move-object v6, v3

    move-object v3, v1

    move-object v0, v5

    .end local v0    # "names":Ljava/util/List;
    .end local v4    # "$result":Ljava/lang/Object;
    .end local v7    # "notify":Z
    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .end local p2    # "$completion":Lkotlin/coroutines/Continuation;
    .local v2, "$completion":Lkotlin/coroutines/Continuation;
    .local v3, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .local v6, "$continuation":Lkotlin/coroutines/Continuation;
    .local v9, "$result":Ljava/lang/Object;
    .local v10, "notify":Z
    .local v12, "names":Ljava/util/List;
    :goto_6
    :try_start_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "i":Ljava/lang/String;
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$0:Ljava/lang/Object;

    iput-object v11, v6, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->L$2:Ljava/lang/Object;

    iput-boolean v10, v6, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->Z$0:Z

    const/4 v5, 0x2

    iput v5, v6, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkAll$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checkInstance$default(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_5

    .line 105
    return-object v0

    .line 110
    :cond_5
    move-object v5, v0

    move-object v0, v4

    .end local v4    # "i":Ljava/lang/String;
    .local v0, "i":Ljava/lang/String;
    :goto_7
    move-object v0, v5

    goto :goto_6

    .line 111
    .end local v0    # "i":Ljava/lang/String;
    :cond_6
    iget-object v0, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sumOfInt(Ljava/lang/Iterable;)I

    move-result v0

    .line 112
    .local v0, "total":I
    if-eqz v10, :cond_7

    if-lez v0, :cond_7

    iget-object v4, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->state:Lcom/pymcl/android/ui/state/AppState;

    const-string v5, "{0} \u4e2a\u6a21\u7ec4\u6709\u66f4\u65b0"

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->Companion:Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;

    iget-object v8, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v8, Ljava/util/Map;

    invoke-virtual {v7, v8}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$Companion;->summarize(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "\uff1b"

    const/4 v11, 0x0

    new-array v13, v11, [Ljava/lang/Object;

    invoke-static {v8, v13}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v13, "\u5728\u5b9e\u4f8b\u9875\u300c\u6311\u7740\u66f4\u65b0\u6a21\u7ec4\u2026\u300d\u91cc\u66f4\u65b0"

    new-array v14, v11, [Ljava/lang/Object;

    invoke-static {v13, v14}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "info"

    invoke-virtual {v4, v5, v7, v8}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 113
    .end local v0    # "total":I
    .end local v12    # "names":Ljava/util/List;
    :cond_7
    const/4 v11, 0x0

    invoke-direct {v3, v11}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->setChecking(Z)V

    .line 114
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 113
    :catchall_4
    move-exception v0

    move-object v4, v9

    move v7, v10

    goto :goto_8

    .end local v2    # "$completion":Lkotlin/coroutines/Continuation;
    .end local v6    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v9    # "$result":Ljava/lang/Object;
    .end local v10    # "notify":Z
    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    .local v4, "$result":Ljava/lang/Object;
    .restart local v7    # "notify":Z
    .restart local p2    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_5
    move-exception v0

    move-object v6, v3

    move-object v3, v1

    .end local p2    # "$completion":Lkotlin/coroutines/Continuation;
    .restart local v2    # "$completion":Lkotlin/coroutines/Continuation;
    .local v3, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .restart local v6    # "$continuation":Lkotlin/coroutines/Continuation;
    :goto_8
    const/4 v11, 0x0

    invoke-direct {v3, v11}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->setChecking(Z)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final checkInstance(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p3

    instance-of v0, v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;

    if-eqz v0, :cond_0

    move-object v0, v3

    check-cast v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;

    iget v4, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;

    invoke-direct {v0, v1, v3}, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;-><init>(Lcom/pymcl/android/ui/state/ModUpdateWatcher;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v4, v0

    .local v4, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v5, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->result:Ljava/lang/Object;

    .local v5, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 93
    iget v0, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    packed-switch v0, :pswitch_data_0

    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$result":Ljava/lang/Object;
    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v5    # "$result":Ljava/lang/Object;
    .restart local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-ModUpdateWatcher$checkInstance$u$1\\8\\98\\0":I
    iget v7, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->I$0:I

    .local v7, "n":I
    iget-object v8, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$5:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .local v8, "$this$checkInstance_u24lambda_u243\\8":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    iget-object v9, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .local v9, "v":Ljava/lang/String;
    iget-object v10, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    .local v11, "versions":Ljava/util/List;
    iget-object v12, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    .end local p2    # "version":Ljava/lang/String;
    .local v12, "version":Ljava/lang/String;
    iget-object v13, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$0:Ljava/lang/Object;

    move-object v2, v13

    check-cast v2, Ljava/lang/String;

    .end local p1    # "instance":Ljava/lang/String;
    .local v2, "instance":Ljava/lang/String;
    :try_start_0
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v11

    move-object v14, v12

    move-object v11, v9

    move-object v12, v10

    move-object v10, v1

    move-object v9, v8

    move v8, v7

    move-object v7, v6

    move-object v6, v5

    goto/16 :goto_a

    .line 98
    .end local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkInstance$u$1\\8\\98\\0":I
    .end local v8    # "$this$checkInstance_u24lambda_u243\\8":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :catchall_0
    move-exception v0

    move-object v8, v1

    goto/16 :goto_b

    .line 93
    .end local v2    # "instance":Ljava/lang/String;
    .end local v7    # "n":I
    .end local v9    # "v":Ljava/lang/String;
    .end local v11    # "versions":Ljava/util/List;
    .end local v12    # "version":Ljava/lang/String;
    .restart local p1    # "instance":Ljava/lang/String;
    .restart local p2    # "version":Ljava/lang/String;
    :pswitch_1
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-ModUpdateWatcher$checkInstance$versions$1\\1\\95\\0":I
    iget-object v9, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$2:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .local v9, "$this$checkInstance_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    iget-object v10, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    .end local p2    # "version":Ljava/lang/String;
    .local v10, "version":Ljava/lang/String;
    iget-object v11, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$0:Ljava/lang/Object;

    move-object v2, v11

    check-cast v2, Ljava/lang/String;

    .end local p1    # "instance":Ljava/lang/String;
    .restart local v2    # "instance":Ljava/lang/String;
    :try_start_1
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v11, v5

    goto :goto_2

    .line 95
    .end local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkInstance$versions$1\\1\\95\\0":I
    .end local v9    # "$this$checkInstance_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 93
    .end local v2    # "instance":Ljava/lang/String;
    .end local v10    # "version":Ljava/lang/String;
    .restart local p1    # "instance":Ljava/lang/String;
    .restart local p2    # "version":Ljava/lang/String;
    :pswitch_2
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    move v0, v8

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    if-eqz v0, :cond_2

    invoke-static/range {p2 .. p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v10, p2

    goto/16 :goto_8

    .line 95
    :cond_2
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-object v9, v0

    .line 129
    .restart local v9    # "$this$checkInstance_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    const/4 v0, 0x0

    .line 95
    .restart local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkInstance$versions$1\\1\\95\\0":I
    iget-object v10, v9, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v10

    iput-object v2, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$2:Ljava/lang/Object;

    iput v8, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    invoke-interface {v10, v2, v4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-ne v10, v6, :cond_3

    .line 93
    return-object v6

    .line 95
    :cond_3
    move-object v11, v10

    move-object/from16 v10, p2

    .end local p1    # "instance":Ljava/lang/String;
    .end local p2    # "version":Ljava/lang/String;
    .restart local v2    # "instance":Ljava/lang/String;
    .restart local v10    # "version":Ljava/lang/String;
    :goto_2
    :try_start_3
    check-cast v11, Ljava/util/List;

    .end local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkInstance$versions$1\\1\\95\\0":I
    .end local v9    # "$this$checkInstance_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    invoke-static {v11}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    .end local v2    # "instance":Ljava/lang/String;
    .end local v10    # "version":Ljava/lang/String;
    .restart local p1    # "instance":Ljava/lang/String;
    .restart local p2    # "version":Ljava/lang/String;
    :catchall_2
    move-exception v0

    move-object/from16 v10, p2

    .end local p1    # "instance":Ljava/lang/String;
    .end local p2    # "version":Ljava/lang/String;
    .restart local v2    # "instance":Ljava/lang/String;
    .restart local v10    # "version":Ljava/lang/String;
    :goto_3
    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v9

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move-object v0, v9

    :cond_4
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\2":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 130
    .local v9, "$i$f$filter\\2\\95":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination\\3":Ljava/util/Collection;
    move-object v12, v0

    .local v12, "$this$filterTo\\3":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 131
    .local v13, "$i$f$filterTo\\3\\130":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_5
    :goto_5
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element\\3":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v16, "it\\4":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/16 v17, 0x0

    .line 95
    .local v17, "$i$a$-filter-ModUpdateWatcher$checkInstance$versions$2\\4\\131\\0":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstalledVersion;->getLoader()Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_6

    move/from16 v16, v8

    goto :goto_6

    :cond_6
    move/from16 v16, v7

    .line 131
    .end local v16    # "it\\4":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v17    # "$i$a$-filter-ModUpdateWatcher$checkInstance$versions$2\\4\\131\\0":I
    :goto_6
    if-eqz v16, :cond_5

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 132
    .end local v15    # "element\\3":Ljava/lang/Object;
    :cond_7
    nop

    .end local v11    # "destination\\3":Ljava/util/Collection;
    .end local v12    # "$this$filterTo\\3":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo\\3\\130":I
    move-object v7, v11

    check-cast v7, Ljava/util/List;

    .line 130
    nop

    .end local v0    # "$this$filter\\2":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filter\\2\\95":I
    check-cast v7, Ljava/lang/Iterable;

    .line 95
    const/4 v0, 0x3

    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\5":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 133
    .local v7, "$i$f$map\\5\\95":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\6":Ljava/util/Collection;
    move-object v9, v0

    .local v9, "$this$mapTo\\6":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 134
    .local v11, "$i$f$mapTo\\6\\133":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 135
    .local v13, "item\\6":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v14, "it\\7":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/4 v15, 0x0

    .line 95
    .local v15, "$i$a$-map-ModUpdateWatcher$checkInstance$versions$3\\7\\135\\0":I
    invoke-virtual {v14}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v14

    .line 135
    .end local v14    # "it\\7":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v15    # "$i$a$-map-ModUpdateWatcher$checkInstance$versions$3\\7\\135\\0":I
    invoke-interface {v8, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 136
    .end local v13    # "item\\6":Ljava/lang/Object;
    :cond_8
    nop

    .end local v8    # "destination\\6":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\6":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo\\6\\133":I
    check-cast v8, Ljava/util/List;

    .line 133
    move-object v0, v8

    .line 94
    .end local v0    # "$this$map\\5":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\5\\95":I
    :goto_8
    nop

    .line 96
    .local v0, "versions":Ljava/util/List;
    const/4 v7, 0x0

    .line 97
    .local v7, "n":I
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v11, v0

    move-object v12, v10

    move-object v10, v8

    move-object v8, v1

    .end local v0    # "versions":Ljava/util/List;
    .end local v10    # "version":Ljava/lang/String;
    .end local p0    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .end local p3    # "$completion":Lkotlin/coroutines/Continuation;
    .local v3, "$completion":Lkotlin/coroutines/Continuation;
    .local v8, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .local v11, "versions":Ljava/util/List;
    .local v12, "version":Ljava/lang/String;
    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/lang/String;

    .line 98
    .local v9, "v":Ljava/lang/String;
    :try_start_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v8

    check-cast v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .line 129
    .local v0, "$this$checkInstance_u24lambda_u243\\8":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    const/4 v13, 0x0

    .line 98
    .local v13, "$i$a$-runCatching-ModUpdateWatcher$checkInstance$u$1\\8\\98\\0":I
    iget-object v14, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v14}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v14

    iput-object v2, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$2:Ljava/lang/Object;

    iput-object v10, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$3:Ljava/lang/Object;

    iput-object v9, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$4:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->L$5:Ljava/lang/Object;

    iput v7, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->I$0:I

    const/4 v15, 0x2

    iput v15, v4, Lcom/pymcl/android/ui/state/ModUpdateWatcher$checkInstance$1;->label:I

    invoke-interface {v14, v2, v9, v4}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v14
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v14, v6, :cond_9

    .line 93
    return-object v6

    .line 98
    :cond_9
    move-object/from16 v19, v9

    move-object v9, v0

    move v0, v13

    move-object v13, v11

    move-object/from16 v11, v19

    move-object/from16 v19, v6

    move-object v6, v5

    move-object v5, v14

    move-object v14, v12

    move-object v12, v10

    move-object v10, v8

    move v8, v7

    move-object/from16 v7, v19

    .end local v5    # "$result":Ljava/lang/Object;
    .end local v7    # "n":I
    .end local v12    # "version":Ljava/lang/String;
    .local v0, "$i$a$-runCatching-ModUpdateWatcher$checkInstance$u$1\\8\\98\\0":I
    .local v6, "$result":Ljava/lang/Object;
    .local v8, "n":I
    .local v9, "$this$checkInstance_u24lambda_u243\\8":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .local v10, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .local v11, "v":Ljava/lang/String;
    .local v13, "versions":Ljava/util/List;
    .local v14, "version":Ljava/lang/String;
    :goto_a
    :try_start_5
    check-cast v5, Ljava/util/Map;

    .end local v0    # "$i$a$-runCatching-ModUpdateWatcher$checkInstance$u$1\\8\\98\\0":I
    .end local v9    # "$this$checkInstance_u24lambda_u243\\8":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    move-object v10, v12

    move-object v12, v14

    goto :goto_c

    :catchall_3
    move-exception v0

    move-object v5, v6

    move-object v6, v7

    move v7, v8

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object v11, v13

    move-object v12, v14

    goto :goto_b

    .end local v6    # "$result":Ljava/lang/Object;
    .end local v10    # "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .end local v13    # "versions":Ljava/util/List;
    .end local v14    # "version":Ljava/lang/String;
    .restart local v5    # "$result":Ljava/lang/Object;
    .restart local v7    # "n":I
    .local v8, "this":Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .local v9, "v":Ljava/lang/String;
    .local v11, "versions":Ljava/util/List;
    .restart local v12    # "version":Ljava/lang/String;
    :catchall_4
    move-exception v0

    :goto_b
    sget-object v13, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v11

    move-object v11, v9

    .end local v9    # "v":Ljava/lang/String;
    .local v11, "v":Ljava/lang/String;
    .restart local v13    # "versions":Ljava/util/List;
    :goto_c
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/4 v0, 0x0

    :cond_a
    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_b

    move-object v11, v13

    goto :goto_9

    .line 99
    .local v0, "u":Ljava/util/Map;
    :cond_b
    iget-object v9, v8, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v9, Ljava/util/Map;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v9, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v9

    add-int/2addr v7, v9

    move-object v11, v13

    .end local v0    # "u":Ljava/util/Map;
    .end local v11    # "v":Ljava/lang/String;
    goto/16 :goto_9

    .line 101
    .end local v13    # "versions":Ljava/util/List;
    .local v11, "versions":Ljava/util/List;
    :cond_c
    iget-object v0, v8, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v0, Ljava/util/Map;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final consumed(Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;)V
    .locals 16
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "files"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "instance"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "version"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "files"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .local v4, "k":Ljava/lang/String;
    iget-object v6, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v6, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    if-eqz v6, :cond_0

    .line 129
    .local v6, "it\\1":Ljava/util/Map;
    const/4 v7, 0x0

    .line 118
    .local v7, "$i$a$-let-ModUpdateWatcher$consumed$1\\1\\118\\0":I
    iget-object v8, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v8, Ljava/util/Map;

    move-object v9, v3

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {v6, v9}, Lkotlin/collections/MapsKt;->minus(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v9

    invoke-interface {v8, v4, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .end local v6    # "it\\1":Ljava/util/Map;
    .end local v7    # "$i$a$-let-ModUpdateWatcher$consumed$1\\1\\118\\0":I
    :cond_0
    iget-object v6, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v6, Ljava/util/Map;

    iget-object v7, v0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    check-cast v7, Ljava/util/Map;

    .local v7, "$this$filterKeys\\2":Ljava/util/Map;
    const/4 v8, 0x0

    .line 141
    .local v8, "$i$f$filterKeys\\2\\119":I
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 142
    .local v9, "result\\2":Ljava/util/LinkedHashMap;
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x0

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    .line 143
    .local v11, "entry\\2":Ljava/util/Map$Entry;
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "it\\3":Ljava/lang/String;
    const/4 v14, 0x0

    .line 119
    .local v14, "$i$a$-filterKeys-ModUpdateWatcher$consumed$2\\3\\143\\0":I
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {v13, v15, v12, v0, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 143
    .end local v13    # "it\\3":Ljava/lang/String;
    .end local v14    # "$i$a$-filterKeys-ModUpdateWatcher$consumed$2\\3\\143\\0":I
    if-eqz v0, :cond_1

    .line 144
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v9, v0, v2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    goto :goto_0

    .line 143
    :cond_1
    move-object/from16 v0, p0

    move-object/from16 v2, p2

    goto :goto_0

    .line 147
    .end local v11    # "entry\\2":Ljava/util/Map$Entry;
    :cond_2
    move-object v0, v9

    check-cast v0, Ljava/util/Map;

    .line 119
    .end local v7    # "$this$filterKeys\\2":Ljava/util/Map;
    .end local v8    # "$i$f$filterKeys\\2\\119":I
    .end local v9    # "result\\2":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    .line 129
    nop

    .local v2, "it\\4":Ljava/util/Map;
    const/4 v5, 0x0

    .line 119
    .local v5, "$i$a$-sumOfInt-ModUpdateWatcher$consumed$3\\4\\119\\0":I
    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    .end local v2    # "it\\4":Ljava/util/Map;
    .end local v5    # "$i$a$-sumOfInt-ModUpdateWatcher$consumed$3\\4\\119\\0":I
    add-int/2addr v12, v2

    goto :goto_1

    :cond_3
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    return-void
.end method

.method public final getChecking()Z
    .locals 4

    .line 55
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->checking$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 126
    .local v3, "$i$f$getValue\\1\\55":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\55":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 55
    return v0
.end method

.method public final getCounts()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->counts:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    return-object v0
.end method

.method public final getDetails()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->details:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->enabled$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 123
    .local v3, "$i$f$getValue\\1\\53":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\53":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 53
    return v0
.end method

.method public final switchTo(Z)V
    .locals 3
    .param p1, "on"    # Z

    .line 72
    invoke-direct {p0, p1}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->setEnabled(Z)V

    .line 73
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->prefs:Lcom/pymcl/android/ui/state/ModWatchPrefs;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/pymcl/android/ui/state/ModWatchPrefs;->setEnabled(Z)V

    .line 74
    :cond_0
    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->startLoop()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->loop:Lkotlinx/coroutines/Job;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/Job$DefaultImpls;->cancel$default(Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_2
    iput-object v1, p0, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->loop:Lkotlinx/coroutines/Job;

    .line 75
    :goto_0
    return-void
.end method
