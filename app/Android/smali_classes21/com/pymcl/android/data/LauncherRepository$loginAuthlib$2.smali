.class final Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->loginAuthlib(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lcom/pymcl/core/account/Account;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$loginAuthlib$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n2955#2:207\n1#3:208\n*S KotlinDebug\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$loginAuthlib$2\n*L\n108#1:207\n108#1:208\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/core/account/Account;",
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
    c = "com.pymcl.android.data.LauncherRepository$loginAuthlib$2"
    f = "LauncherRepository.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $api:Ljava/lang/String;

.field final synthetic $pass:Ljava/lang/String;

.field final synthetic $user:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$api:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$user:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$pass:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$api:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$user:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$pass:Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;-><init>(Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/pymcl/core/account/Account;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 108
    iget v0, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getAgents()Lcom/pymcl/core/auth/AgentJars;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$api:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/auth/AgentJars;->prefetch(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getYggdrasil()Lcom/pymcl/core/auth/YggdrasilAuth;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$api:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$user:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->$pass:Ljava/lang/String;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/pymcl/core/auth/YggdrasilAuth;->authenticate$default(Lcom/pymcl/core/auth/YggdrasilAuth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$onEach\\1":Ljava/lang/Iterable;
    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginAuthlib$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    const/4 v2, 0x0

    .line 207
    .local v2, "$i$f$onEach\\1\\108":I
    move-object v3, v0

    .line 208
    .local v3, "$this$onEach_u24lambda_u240\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 207
    .local v4, "$i$a$-apply-CollectionsKt___CollectionsKt$onEach$1\\2\\208\\1":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element\\2":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/account/Account;

    .local v7, "it\\3":Lcom/pymcl/core/account/Account;
    const/4 v8, 0x0

    .line 108
    .local v8, "$i$a$-onEach-LauncherRepository$loginAuthlib$2$1\\3\\207\\0":I
    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v9, v7, v12, v10, v11}, Lcom/pymcl/core/account/AccountStore;->upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V

    .line 207
    .end local v6    # "element\\2":Ljava/lang/Object;
    .end local v7    # "it\\3":Lcom/pymcl/core/account/Account;
    .end local v8    # "$i$a$-onEach-LauncherRepository$loginAuthlib$2$1\\3\\207\\0":I
    goto :goto_0

    .line 108
    .end local v0    # "$this$onEach\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$onEach\\1\\108":I
    .end local v3    # "$this$onEach_u24lambda_u240\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$a$-apply-CollectionsKt___CollectionsKt$onEach$1\\2\\208\\1":I
    :cond_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
