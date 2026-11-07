.class final Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->refreshIfNeeded(Lcom/pymcl/core/account/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/core/account/Account;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
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
    c = "com.pymcl.android.data.LauncherRepository$refreshIfNeeded$2"
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
.field final synthetic $a:Lcom/pymcl/core/account/Account;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/core/account/Account;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/account/Account;",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;-><init>(Lcom/pymcl/core/account/Account;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/core/account/Account;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 110
    iget v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 111
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/core/account/Account;->needsRefresh$default(Lcom/pymcl/core/account/Account;JILjava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getMicrosoft()Lcom/pymcl/core/auth/MicrosoftAuth;

    move-result-object v0

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/auth/MicrosoftAuth;->refresh(Lcom/pymcl/core/account/Account;)Lcom/pymcl/core/account/Account;

    move-result-object v0

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    move-object v5, v0

    .line 207
    .local v5, "it\\1":Lcom/pymcl/core/account/Account;
    const/4 v6, 0x0

    .line 111
    .local v6, "$i$a$-also-LauncherRepository$refreshIfNeeded$2$1\\1\\111\\0":I
    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v3

    invoke-static {v3, v5, v2, v1, v4}, Lcom/pymcl/core/account/AccountStore;->upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V

    .end local v5    # "it\\1":Lcom/pymcl/core/account/Account;
    .end local v6    # "$i$a$-also-LauncherRepository$refreshIfNeeded$2$1\\1\\111\\0":I
    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v3, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v3, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v3, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    if-ne v0, v3, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getYggdrasil()Lcom/pymcl/core/auth/YggdrasilAuth;

    move-result-object v0

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/auth/YggdrasilAuth;->validate(Lcom/pymcl/core/account/Account;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getYggdrasil()Lcom/pymcl/core/auth/YggdrasilAuth;

    move-result-object v0

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/auth/YggdrasilAuth;->refresh(Lcom/pymcl/core/account/Account;)Lcom/pymcl/core/account/Account;

    move-result-object v0

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    move-object v5, v0

    .line 207
    .local v5, "it\\2":Lcom/pymcl/core/account/Account;
    const/4 v6, 0x0

    .line 112
    .local v6, "$i$a$-also-LauncherRepository$refreshIfNeeded$2$2\\2\\112\\0":I
    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v3

    invoke-static {v3, v5, v2, v1, v4}, Lcom/pymcl/core/account/AccountStore;->upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V

    .end local v5    # "it\\2":Lcom/pymcl/core/account/Account;
    .end local v6    # "$i$a$-also-LauncherRepository$refreshIfNeeded$2$2\\2\\112\\0":I
    goto :goto_0

    .line 113
    :cond_2
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$refreshIfNeeded$2;->$a:Lcom/pymcl/core/account/Account;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
