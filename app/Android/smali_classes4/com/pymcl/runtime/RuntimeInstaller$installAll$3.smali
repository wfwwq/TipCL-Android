.class final Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RuntimeInstaller.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/RuntimeInstaller;->installAll(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.pymcl.runtime.RuntimeInstaller$installAll$3"
    f = "RuntimeInstaller.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $onStage:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/pymcl/runtime/RuntimeInstaller;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/RuntimeInstaller;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/RuntimeInstaller;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    iput-object p2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->$onStage:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
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

    new-instance v0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;

    iget-object v1, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->$onStage:Lkotlin/jvm/functions/Function1;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 23
    iget v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v0}, Lcom/pymcl/runtime/RuntimeInstaller;->access$getContext$p(Lcom/pymcl/runtime/RuntimeInstaller;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/runtime/RuntimeHost;->init(Landroid/content/Context;)V

    .line 25
    sget-object v0, Lcom/pymcl/runtime/RuntimeLayout;->INSTANCE:Lcom/pymcl/runtime/RuntimeLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/RuntimeLayout;->getCOPY_COMPONENTS()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 26
    .local v1, "c":Ljava/lang/String;
    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->$onStage:Lkotlin/jvm/functions/Function1;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v2, v1}, Lcom/pymcl/runtime/RuntimeInstaller;->access$copyComponent(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/lang/String;)V

    .end local v1    # "c":Ljava/lang/String;
    goto :goto_0

    .line 28
    :cond_0
    sget-object v0, Lcom/pymcl/runtime/RuntimeLayout;->INSTANCE:Lcom/pymcl/runtime/RuntimeLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/RuntimeLayout;->getBUNDLED_JRE()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 29
    .local v1, "major":I
    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->$onStage:Lkotlin/jvm/functions/Function1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "jre"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v2, v1}, Lcom/pymcl/runtime/RuntimeInstaller;->access$installBundledJava(Lcom/pymcl/runtime/RuntimeInstaller;I)V

    .end local v1    # "major":I
    goto :goto_1

    .line 31
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->$onStage:Lkotlin/jvm/functions/Function1;

    const-string v1, "plugins"

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-virtual {v0}, Lcom/pymcl/runtime/RuntimeInstaller;->installPlugins()V

    .line 32
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
