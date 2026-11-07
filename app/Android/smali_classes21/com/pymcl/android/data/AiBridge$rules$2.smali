.class final Lcom/pymcl/android/data/AiBridge$rules$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiBridge.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiBridge;->rules(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/pymcl/android/ui/state/PermissionRule;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$rules$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1739#2:220\n1814#2,3:221\n*S KotlinDebug\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$rules$2\n*L\n97#1:220\n97#1:221,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/PermissionRule;"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.android.data.AiBridge$rules$2"
    f = "AiBridge.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/AiBridge;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiBridge;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/AiBridge$rules$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/AiBridge$rules$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/data/AiBridge$rules$2;

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge$rules$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/AiBridge$rules$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$rules$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$rules$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiBridge$rules$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/AiBridge$rules$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 97
    iget v0, p0, Lcom/pymcl/android/data/AiBridge$rules$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/data/AiBridge$rules$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    invoke-static {v0}, Lcom/pymcl/android/data/AiBridge;->access$getService(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/AiService;->permissionRules()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 220
    .local v1, "$i$f$map\\1\\97":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\2":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 221
    .local v4, "$i$f$mapTo\\2\\220":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 222
    .local v6, "item\\2":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/PermissionRule;

    .local v7, "it\\3":Lcom/pymcl/ai/PermissionRule;
    const/4 v8, 0x0

    .line 97
    .local v8, "$i$a$-map-AiBridge$rules$2$1\\3\\222\\0":I
    new-instance v9, Lcom/pymcl/android/ui/state/PermissionRule;

    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getToolName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getBehavior()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getScope()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, Lcom/pymcl/ai/PermissionRule;->getRuleContent()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v9, v10, v11, v12, v13}, Lcom/pymcl/android/ui/state/PermissionRule;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .end local v7    # "it\\3":Lcom/pymcl/ai/PermissionRule;
    .end local v8    # "$i$a$-map-AiBridge$rules$2$1\\3\\222\\0":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 223
    .end local v6    # "item\\2":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination\\2":Ljava/util/Collection;
    .end local v3    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo\\2\\220":I
    check-cast v2, Ljava/util/List;

    .line 220
    nop

    .line 97
    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map\\1\\97":I
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
