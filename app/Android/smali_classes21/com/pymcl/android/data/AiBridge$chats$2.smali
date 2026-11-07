.class final Lcom/pymcl/android/data/AiBridge$chats$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiBridge.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiBridge;->chats(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/ChatSummary;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$chats$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,219:1\n1739#2:220\n1814#2,3:221\n*S KotlinDebug\n*F\n+ 1 AiBridge.kt\ncom/pymcl/android/data/AiBridge$chats$2\n*L\n85#1:220\n85#1:221,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/ChatSummary;"
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
    c = "com.pymcl.android.data.AiBridge$chats$2"
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
            "Lcom/pymcl/android/data/AiBridge$chats$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/AiBridge$chats$2;->this$0:Lcom/pymcl/android/data/AiBridge;

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

    new-instance v0, Lcom/pymcl/android/data/AiBridge$chats$2;

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge$chats$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/AiBridge$chats$2;-><init>(Lcom/pymcl/android/data/AiBridge;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$chats$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$chats$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiBridge$chats$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/AiBridge$chats$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 85
    iget v1, v0, Lcom/pymcl/android/data/AiBridge$chats$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v1, v0, Lcom/pymcl/android/data/AiBridge$chats$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    invoke-static {v1}, Lcom/pymcl/android/data/AiBridge;->access$getService(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/ai/AiService;->listChats()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\1":Ljava/lang/Iterable;
    iget-object v2, v0, Lcom/pymcl/android/data/AiBridge$chats$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    const/4 v3, 0x0

    .line 220
    .local v3, "$i$f$map\\1\\85":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\2":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 221
    .local v6, "$i$f$mapTo\\2\\220":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 222
    .local v8, "item\\2":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/ai/ChatInfo;

    .local v9, "it\\3":Lcom/pymcl/ai/ChatInfo;
    const/4 v10, 0x0

    .line 85
    .local v10, "$i$a$-map-AiBridge$chats$2$1\\3\\222\\0":I
    new-instance v11, Lcom/pymcl/android/ui/state/ChatSummary;

    invoke-virtual {v9}, Lcom/pymcl/ai/ChatInfo;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lcom/pymcl/ai/ChatInfo;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-static {v2}, Lcom/pymcl/android/data/AiBridge;->access$getFmt$p(Lcom/pymcl/android/data/AiBridge;)Ljava/text/SimpleDateFormat;

    move-result-object v14

    new-instance v15, Ljava/util/Date;

    invoke-virtual {v9}, Lcom/pymcl/ai/ChatInfo;->getUpdated()J

    move-result-wide v16

    const/16 v0, 0x3e8

    move-object/from16 v18, v1

    .end local v1    # "$this$map\\1":Ljava/lang/Iterable;
    .local v18, "$this$map\\1":Ljava/lang/Iterable;
    int-to-long v0, v0

    mul-long v0, v0, v16

    invoke-direct {v15, v0, v1}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v14, v15}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v12, v13, v0}, Lcom/pymcl/android/ui/state/ChatSummary;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 222
    .end local v9    # "it\\3":Lcom/pymcl/ai/ChatInfo;
    .end local v10    # "$i$a$-map-AiBridge$chats$2$1\\3\\222\\0":I
    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, v18

    goto :goto_0

    .line 223
    .end local v8    # "item\\2":Ljava/lang/Object;
    .end local v18    # "$this$map\\1":Ljava/lang/Iterable;
    .restart local v1    # "$this$map\\1":Ljava/lang/Iterable;
    :cond_0
    nop

    .end local v4    # "destination\\2":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\2\\220":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 220
    nop

    .line 85
    .end local v1    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\1\\85":I
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
