.class final Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiNavBadge.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/AiNavBadgeKt;->rememberAiRunningTasks(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiNavBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNavBadge.kt\ncom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
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
    c = "com.pymcl.android.ui.AiNavBadgeKt$rememberAiRunningTasks$1$1"
    f = "AiNavBadge.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3
    }
    l = {
        0x20,
        0x22,
        0x24,
        0x25
    }
    m = "invokeSuspend"
    n = {
        "$this$LaunchedEffect",
        "ids",
        "$this$LaunchedEffect",
        "ids",
        "events",
        "$this$LaunchedEffect",
        "ids",
        "events",
        "$this$LaunchedEffect",
        "ids",
        "events"
    }
    nl = {
        0x21,
        0x23,
        0x2b,
        -0x1
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $count$delegate:Landroidx/compose/runtime/MutableIntState;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/MutableIntState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static final synthetic access$invokeSuspend$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    invoke-static {p0, p1}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->invokeSuspend$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final invokeSuspend$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p0, "ai"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 31
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$snapshot$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$snapshot$2;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p1}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .local v1, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 28
    iget v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->label:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    :pswitch_0
    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .local v2, "events":Lkotlinx/coroutines/flow/Flow;
    iget-object v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .local v3, "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p0

    goto/16 :goto_4

    .end local v2    # "events":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :pswitch_1
    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .restart local v2    # "events":Lkotlinx/coroutines/flow/Flow;
    iget-object v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .restart local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, p0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, p1

    goto/16 :goto_3

    .end local v2    # "events":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :pswitch_2
    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .restart local v2    # "events":Lkotlinx/coroutines/flow/Flow;
    iget-object v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .restart local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_1

    .end local v2    # "events":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :pswitch_3
    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .local v2, "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    move-object v7, v2

    goto :goto_0

    .end local v2    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :pswitch_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    sget-object v2, Lcom/pymcl/android/data/AiLang;->INSTANCE:Lcom/pymcl/android/data/AiLang;

    invoke-virtual {v2}, Lcom/pymcl/android/data/AiLang;->install()V

    .line 30
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .restart local v2    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v4

    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 32
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v4

    check-cast v4, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1;

    iget-object v6, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    invoke-direct {v5, v6, v3}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$events$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    iput-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->label:I

    invoke-static {v4, v5, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_0

    .line 28
    return-object v0

    .line 32
    :cond_0
    move-object v7, v2

    .end local v2    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v7, "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :goto_0
    check-cast v4, Lkotlinx/coroutines/flow/Flow;

    if-nez v4, :cond_1

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object v8, v4

    .line 33
    .local v8, "events":Lkotlinx/coroutines/flow/Flow;
    new-instance v2, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1;

    iget-object v4, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-direct {v2, v8, v7, v4, v3}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 34
    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    iput-object v7, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->label:I

    invoke-static {v2}, Lkotlinx/coroutines/YieldKt;->yield(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    .line 28
    return-object v0

    .line 34
    :cond_2
    move-object v3, v7

    move-object v2, v8

    .line 35
    .end local v7    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v8    # "events":Lkotlinx/coroutines/flow/Flow;
    .local v2, "events":Lkotlinx/coroutines/flow/Flow;
    .restart local v3    # "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    :goto_1
    move-object v4, p0

    .line 36
    .end local p0    # "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    .local v4, "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    :goto_2
    iget-object v5, v4, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    move-object v6, v4

    check-cast v6, Lkotlin/coroutines/Continuation;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    iput-object v3, v4, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v4, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v4, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->label:I

    invoke-static {v5, v6}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->invokeSuspend$snapshot(Lcom/pymcl/android/data/AiUiExtras;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_3

    .line 28
    return-object v0

    .line 36
    :cond_3
    move-object v9, v0

    move-object v0, p1

    move-object p1, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v9

    .end local v1    # "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "$result":Ljava/lang/Object;
    .local v2, "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    .local v3, "events":Lkotlinx/coroutines/flow/Flow;
    .local v4, "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v5, "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    :goto_3
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_4

    iget-object v6, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    .line 43
    .local p1, "it\\1":Ljava/util/List;
    const/4 v7, 0x0

    .line 36
    .local v7, "$i$a$-let-AiNavBadgeKt$rememberAiRunningTasks$1$1$2\\1\\36\\0":I
    sget-object v8, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    invoke-virtual {v8, p1}, Lcom/pymcl/android/data/AiTaskCenter;->runningIds(Ljava/util/List;)Ljava/util/Set;

    move-result-object v8

    iput-object v8, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v8, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v8, Ljava/util/Set;

    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v8

    invoke-static {v6, v8}, Lcom/pymcl/android/ui/AiNavBadgeKt;->access$rememberAiRunningTasks$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V

    .line 37
    .end local v7    # "$i$a$-let-AiNavBadgeKt$rememberAiRunningTasks$1$1$2\\1\\36\\0":I
    .end local p1    # "it\\1":Ljava/util/List;
    :cond_4
    sget-object p1, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v6, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    invoke-static {v6}, Lcom/pymcl/android/ui/AiNavBadgeKt;->access$rememberAiRunningTasks$lambda$2(Landroidx/compose/runtime/MutableIntState;)I

    move-result v6

    invoke-virtual {p1, v6}, Lcom/pymcl/android/data/AiTaskCenter;->badgePollMs(I)J

    move-result-wide v6

    move-object p1, v5

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$0:Ljava/lang/Object;

    iput-object v4, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->L$2:Ljava/lang/Object;

    const/4 v8, 0x4

    iput v8, v5, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;->label:I

    invoke-static {v6, v7, p1}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    .line 28
    return-object v1

    .line 37
    :cond_5
    move-object p1, v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object v4, v5

    .end local v0    # "$result":Ljava/lang/Object;
    .end local v5    # "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    .restart local v1    # "$this$LaunchedEffect":Lkotlinx/coroutines/CoroutineScope;
    .local v2, "events":Lkotlinx/coroutines/flow/Flow;
    .local v3, "ids":Lkotlin/jvm/internal/Ref$ObjectRef;
    .local v4, "this":Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;
    .local p1, "$result":Ljava/lang/Object;
    :goto_4
    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
