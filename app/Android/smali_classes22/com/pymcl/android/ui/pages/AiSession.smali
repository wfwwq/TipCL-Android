.class public final Lcom/pymcl/android/ui/pages/AiSession;
.super Ljava/lang/Object;
.source "AiPage.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiSession\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,517:1\n85#2:518\n113#2,2:519\n85#2:521\n113#2,2:522\n85#2:524\n113#2,2:525\n363#3,7:527\n*S KotlinDebug\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiSession\n*L\n51#1:518\n51#1:519,2\n52#1:521\n52#1:522,2\n56#1:524\n56#1:525,2\n59#1:527,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0006R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR/\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0010\t\u001a\u0004\u0018\u00010\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0011\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001a\u0010\r\"\u0004\u0008\u001b\u0010\u000fR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R+\u0010!\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00128F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u0011\u001a\u0004\u0008\"\u0010\u0015\"\u0004\u0008#\u0010\u0017\u00ca\u0001\u000c\u0008)\u0012\u0008\u0008*\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006("
    }
    d2 = {
        "Lcom/pymcl/android/ui/pages/AiSession;",
        "",
        "<init>",
        "()V",
        "items",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "getItems",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "<set-?>",
        "",
        "running",
        "getRunning",
        "()Z",
        "setRunning",
        "(Z)V",
        "running$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "",
        "activeChat",
        "getActiveChat",
        "()Ljava/lang/String;",
        "setActiveChat",
        "(Ljava/lang/String;)V",
        "activeChat$delegate",
        "loaded",
        "getLoaded",
        "setLoaded",
        "asks",
        "Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "Lcom/pymcl/ai/AiEvent$Ask;",
        "getAsks",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;",
        "usage",
        "getUsage",
        "setUsage",
        "usage$delegate",
        "upsert",
        "",
        "it",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/pages/AiSession;

.field private static final activeChat$delegate:Landroidx/compose/runtime/MutableState;

.field private static final asks:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/AiEvent$Ask;",
            ">;"
        }
    .end annotation
.end field

.field private static final items:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field private static loaded:Z

.field private static final running$delegate:Landroidx/compose/runtime/MutableState;

.field private static final usage$delegate:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/pages/AiSession;

    invoke-direct {v0}, Lcom/pymcl/android/ui/pages/AiSession;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->INSTANCE:Lcom/pymcl/android/ui/pages/AiSession;

    .line 50
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 51
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->running$delegate:Landroidx/compose/runtime/MutableState;

    .line 52
    invoke-static {v1, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->activeChat$delegate:Landroidx/compose/runtime/MutableState;

    .line 55
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateMapOf()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->asks:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .line 56
    const-string v0, ""

    invoke-static {v0, v1, v2, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/pages/AiSession;->usage$delegate:Landroidx/compose/runtime/MutableState;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getActiveChat()Ljava/lang/String;
    .locals 4

    .line 52
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->activeChat$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 521
    .local v3, "$i$f$getValue\\1\\52":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\52":I
    check-cast v0, Ljava/lang/String;

    .line 52
    return-object v0
.end method

.method public final getAsks()Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/AiEvent$Ask;",
            ">;"
        }
    .end annotation

    .line 55
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->asks:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    return-object v0
.end method

.method public final getItems()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation

    .line 50
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getLoaded()Z
    .locals 1

    .line 53
    sget-boolean v0, Lcom/pymcl/android/ui/pages/AiSession;->loaded:Z

    return v0
.end method

.method public final getRunning()Z
    .locals 4

    .line 51
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->running$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 518
    .local v3, "$i$f$getValue\\1\\51":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\51":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 51
    return v0
.end method

.method public final getUsage()Ljava/lang/String;
    .locals 4

    .line 56
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->usage$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 524
    .local v3, "$i$f$getValue\\1\\56":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\56":I
    check-cast v0, Ljava/lang/String;

    .line 56
    return-object v0
.end method

.method public final setActiveChat(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    .line 52
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->activeChat$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 522
    .local v4, "$i$f$setValue\\1\\52":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 523
    nop

    .line 52
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\52":I
    return-void
.end method

.method public final setLoaded(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 53
    sput-boolean p1, Lcom/pymcl/android/ui/pages/AiSession;->loaded:Z

    return-void
.end method

.method public final setRunning(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 51
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->running$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 519
    .local v4, "$i$f$setValue\\1\\51":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 520
    nop

    .line 51
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\51":I
    return-void
.end method

.method public final setUsage(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->usage$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 525
    .local v4, "$i$f$setValue\\1\\56":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 526
    nop

    .line 56
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\56":I
    return-void
.end method

.method public final upsert(Lcom/pymcl/android/ui/state/AiItem;)V
    .locals 9
    .param p1, "it"    # Lcom/pymcl/android/ui/state/AiItem;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    .local v0, "$this$indexOfFirst\\1":Ljava/util/List;
    const/4 v1, 0x0

    .line 527
    .local v1, "$i$f$indexOfFirst\\1\\59":I
    const/4 v2, 0x0

    .line 528
    .local v2, "index\\1":I
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 529
    .local v4, "item\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/android/ui/state/AiItem;

    .local v5, "x\\2":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v6, 0x0

    .line 59
    .local v6, "$i$a$-indexOfFirst-AiSession$upsert$idx$1\\2\\529\\0":I
    invoke-interface {v5}, Lcom/pymcl/android/ui/state/AiItem;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1}, Lcom/pymcl/android/ui/state/AiItem;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v7, v8, :cond_0

    const/4 v7, 0x1

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    .line 529
    .end local v5    # "x\\2":Lcom/pymcl/android/ui/state/AiItem;
    .end local v6    # "$i$a$-indexOfFirst-AiSession$upsert$idx$1\\2\\529\\0":I
    :goto_1
    if-eqz v7, :cond_1

    .line 530
    goto :goto_2

    .line 531
    :cond_1
    nop

    .end local v4    # "item\\1":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 533
    :cond_2
    const/4 v3, -0x1

    move v2, v3

    .line 59
    .end local v0    # "$this$indexOfFirst\\1":Ljava/util/List;
    .end local v1    # "$i$f$indexOfFirst\\1\\59":I
    .end local v2    # "index\\1":I
    :goto_2
    nop

    .line 61
    .local v2, "idx":I
    sget-object v0, Lcom/pymcl/android/data/AiItemReducer;->Companion:Lcom/pymcl/android/data/AiItemReducer$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiItemReducer$Companion;->isDiscarded(Lcom/pymcl/android/ui/state/AiItem;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-ltz v2, :cond_3

    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(I)Ljava/lang/Object;

    :cond_3
    return-void

    .line 62
    :cond_4
    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    if-ltz v2, :cond_5

    invoke-virtual {v0, v2, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_5
    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 63
    :goto_3
    return-void
.end method
