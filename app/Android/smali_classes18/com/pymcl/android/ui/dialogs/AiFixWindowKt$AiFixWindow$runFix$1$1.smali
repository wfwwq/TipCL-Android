.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;
.super Ljava/lang/Object;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiFixWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,147:1\n2068#2,2:148\n*S KotlinDebug\n*F\n+ 1 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1\n*L\n60#1:148,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $items:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $r:Lcom/pymcl/android/data/AiItemReducer;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiItemReducer;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiItemReducer;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;->$r:Lcom/pymcl/android/data/AiItemReducer;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/ai/AiEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "e"    # Lcom/pymcl/ai/AiEvent;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiEvent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 60
    instance-of v0, p1, Lcom/pymcl/ai/AiEvent$Ask;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pymcl/android/ui/pages/AiSession;->INSTANCE:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getAsks()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    move-object v1, p1

    check-cast v1, Lcom/pymcl/ai/AiEvent$Ask;

    invoke-virtual {v1}, Lcom/pymcl/ai/AiEvent$Ask;->getCallId()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ask-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;->$r:Lcom/pymcl/android/data/AiItemReducer;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiItemReducer;->reduce(Lcom/pymcl/ai/AiEvent;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    const/4 v2, 0x0

    .line 148
    .local v2, "$i$f$forEach\\1\\60":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/android/ui/state/AiItem;

    .local v5, "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v6, 0x0

    .line 60
    .local v6, "$i$a$-forEach-AiFixWindowKt$AiFixWindow$runFix$1$1$1\\2\\148\\0":I
    invoke-static {v1, v5}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$upsert(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/pymcl/android/ui/state/AiItem;)V

    .line 148
    .end local v4    # "element\\1":Ljava/lang/Object;
    .end local v5    # "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    .end local v6    # "$i$a$-forEach-AiFixWindowKt$AiFixWindow$runFix$1$1$1\\2\\148\\0":I
    goto :goto_0

    .line 149
    :cond_1
    nop

    .line 60
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach\\1\\60":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 60
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/AiEvent;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$runFix$1$1;->emit(Lcom/pymcl/ai/AiEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
