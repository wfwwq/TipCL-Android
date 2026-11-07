.class final Lcom/pymcl/android/data/AiBridge$addRule$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "AiBridge.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/AiBridge;->addRule(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
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
    c = "com.pymcl.android.data.AiBridge$addRule$2"
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
.field final synthetic $behavior:Ljava/lang/String;

.field final synthetic $content:Ljava/lang/String;

.field final synthetic $global:Z

.field final synthetic $tool:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/AiBridge;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiBridge;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/AiBridge$addRule$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    iput-object p2, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$tool:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$behavior:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$content:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$global:Z

    const/4 v0, 0x1

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/data/AiBridge$addRule$2;

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    iget-object v2, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$tool:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$behavior:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$content:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$global:Z

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/data/AiBridge$addRule$2;-><init>(Lcom/pymcl/android/data/AiBridge;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$addRule$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/AiBridge$addRule$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiBridge$addRule$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/AiBridge$addRule$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 98
    iget v0, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->this$0:Lcom/pymcl/android/data/AiBridge;

    invoke-static {v0}, Lcom/pymcl/android/data/AiBridge;->access$getService(Lcom/pymcl/android/data/AiBridge;)Lcom/pymcl/ai/AiService;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$tool:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$behavior:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$content:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/pymcl/android/data/AiBridge$addRule$2;->$global:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/pymcl/ai/AiService;->addRule(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
