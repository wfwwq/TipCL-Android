.class final Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
.super Ljava/lang/Object;
.source "AiBridge.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiBridge$sendAsItems$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nAiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$sendAsItems$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n2068#2,2:220\n*S KotlinDebug\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$sendAsItems$1$1\n*L\n113#1:220,2\n*E\n"
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
.field final synthetic $$this$flow:Lkotlinx/coroutines/flow/FlowCollector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $r:Lcom/pymcl/android/data/AiItemReducer;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiItemReducer;Lkotlinx/coroutines/flow/FlowCollector;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiItemReducer;",
            "Lkotlinx/coroutines/flow/FlowCollector<",
            "-",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;->$r:Lcom/pymcl/android/data/AiItemReducer;

    iput-object p2, p0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;->$$this$flow:Lkotlinx/coroutines/flow/FlowCollector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/ai/AiEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p2, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;-><init>(Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 113
    iget v3, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    .end local p0    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    .restart local p0    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    :pswitch_0
    const/4 v3, 0x0

    .local v3, "$i$f$forEach\\1\\113":I
    const/4 v4, 0x0

    .local v4, "$i$a$-forEach-AiBridge$sendAsItems$1$1$1\\2\\220\\0":I
    iget-object v5, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/android/ui/state/AiItem;

    .local v5, "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    iget-object v6, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$4:Ljava/lang/Object;

    .local v6, "element\\1":Ljava/lang/Object;
    iget-object v7, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lkotlinx/coroutines/flow/FlowCollector;

    iget-object v9, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-object v10, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$0:Ljava/lang/Object;

    move-object p1, v10

    check-cast p1, Lcom/pymcl/ai/AiEvent;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v5

    move-object v5, p0

    goto :goto_2

    .end local v3    # "$i$f$forEach\\1\\113":I
    .end local v4    # "$i$a$-forEach-AiBridge$sendAsItems$1$1$1\\2\\220\\0":I
    .end local v5    # "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    .end local v6    # "element\\1":Ljava/lang/Object;
    .end local v9    # "$this$forEach\\1":Ljava/lang/Iterable;
    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;->$r:Lcom/pymcl/android/data/AiItemReducer;

    invoke-virtual {v3, p1}, Lcom/pymcl/android/data/AiItemReducer;->reduce(Lcom/pymcl/ai/AiEvent;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEach\\1":Ljava/lang/Iterable;
    iget-object v4, p0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;->$$this$flow:Lkotlinx/coroutines/flow/FlowCollector;

    const/4 v5, 0x0

    .line 220
    .local v5, "$i$f$forEach\\1\\113":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v9, v3

    move-object v8, v4

    move v3, v5

    move-object v7, v6

    move-object v4, p0

    .end local v5    # "$i$f$forEach\\1\\113":I
    .end local p0    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .local v3, "$i$f$forEach\\1\\113":I
    .local v4, "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .restart local v9    # "$this$forEach\\1":Ljava/lang/Iterable;
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .restart local v6    # "element\\1":Ljava/lang/Object;
    move-object v5, v6

    check-cast v5, Lcom/pymcl/android/ui/state/AiItem;

    .local v5, "it\\2":Lcom/pymcl/android/ui/state/AiItem;
    const/4 v10, 0x0

    .line 113
    .local v10, "$i$a$-forEach-AiBridge$sendAsItems$1$1$1\\2\\220\\0":I
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$0:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v8, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$3:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$4:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->L$5:Ljava/lang/Object;

    const/4 v11, 0x1

    iput v11, v0, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1$emit$1;->label:I

    invoke-interface {v8, v5, v0}, Lkotlinx/coroutines/flow/FlowCollector;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v2, :cond_1

    return-object v2

    :cond_1
    move-object v12, v5

    move-object v5, v4

    move v4, v10

    move-object v10, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v6

    move-object v6, v12

    .line 220
    .end local v4    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .end local v6    # "element\\1":Ljava/lang/Object;
    .end local v9    # "$this$forEach\\1":Ljava/lang/Iterable;
    .local v5, "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .local v10, "$this$forEach\\1":Ljava/lang/Iterable;
    :goto_2
    move-object v4, v5

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    goto :goto_1

    .line 221
    .end local v5    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .end local v10    # "$this$forEach\\1":Ljava/lang/Iterable;
    .restart local v4    # "this":Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;
    .restart local v9    # "$this$forEach\\1":Ljava/lang/Iterable;
    :cond_2
    nop

    .line 113
    .end local v3    # "$i$f$forEach\\1\\113":I
    .end local v9    # "$this$forEach\\1":Ljava/lang/Iterable;
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 113
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/AiEvent;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/data/AiBridge$sendAsItems$1$1;->emit(Lcom/pymcl/ai/AiEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
