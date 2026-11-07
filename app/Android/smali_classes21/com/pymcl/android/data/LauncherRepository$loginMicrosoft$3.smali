.class final Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->loginMicrosoft(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$loginMicrosoft$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
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
    c = "com.pymcl.android.data.LauncherRepository$loginMicrosoft$3"
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
.field final synthetic $cancelled:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onCode:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/core/auth/DeviceCode;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/auth/DeviceCode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$onCode:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$cancelled:Lkotlin/jvm/functions/Function0;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$onCode:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$cancelled:Lkotlin/jvm/functions/Function0;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 107
    iget v0, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getMicrosoft()Lcom/pymcl/core/auth/MicrosoftAuth;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$onCode:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->$cancelled:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/auth/MicrosoftAuth;->login(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/pymcl/core/account/Account;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loginMicrosoft$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    move-object v2, v0

    .line 207
    .local v2, "it\\1":Lcom/pymcl/core/account/Account;
    const/4 v3, 0x0

    .line 107
    .local v3, "$i$a$-also-LauncherRepository$loginMicrosoft$3$1\\1\\107\\0":I
    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v1, v2, v6, v4, v5}, Lcom/pymcl/core/account/AccountStore;->upsert$default(Lcom/pymcl/core/account/AccountStore;Lcom/pymcl/core/account/Account;ZILjava/lang/Object;)V

    .end local v2    # "it\\1":Lcom/pymcl/core/account/Account;
    .end local v3    # "$i$a$-also-LauncherRepository$loginMicrosoft$3$1\\1\\107\\0":I
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
