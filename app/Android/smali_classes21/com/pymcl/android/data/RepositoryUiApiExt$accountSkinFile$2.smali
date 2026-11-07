.class final Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->accountSkinFile(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1#2:175\n296#3,2:176\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2\n*L\n44#1:176,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$accountSkinFile$2"
    f = "RepositoryUiApiExt.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $name:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->$name:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->$name:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 43
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$accountSkinFile$2;->$name:Ljava/lang/String;

    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 175
    .local v0, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v3, 0x0

    .line 44
    .local v3, "$i$a$-runCatching-RepositoryUiApiExt$accountSkinFile$2$1\\1\\44\\0":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/account/AccountStore;->list()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$firstOrNull\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 176
    .local v5, "$i$f$firstOrNull\\2\\44":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/account/Account;

    .local v8, "it\\3":Lcom/pymcl/core/account/Account;
    const/4 v9, 0x0

    .line 44
    .local v9, "$i$a$-firstOrNull-RepositoryUiApiExt$accountSkinFile$2$1$1\\3\\176\\1":I
    invoke-virtual {v8}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 176
    .end local v8    # "it\\3":Lcom/pymcl/core/account/Account;
    .end local v9    # "$i$a$-firstOrNull-RepositoryUiApiExt$accountSkinFile$2$1$1\\3\\176\\1":I
    if-eqz v10, :cond_0

    goto :goto_0

    .line 177
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_1
    move-object v7, v2

    .line 44
    .end local v4    # "$this$firstOrNull\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$firstOrNull\\2\\44":I
    :goto_0
    check-cast v7, Lcom/pymcl/core/account/Account;

    if-eqz v7, :cond_3

    .line 175
    .local v7, "it\\4":Lcom/pymcl/core/account/Account;
    const/4 v1, 0x0

    .line 44
    .local v1, "$i$a$-let-RepositoryUiApiExt$accountSkinFile$2$1$2\\4\\44\\1":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4, v7}, Lcom/pymcl/android/data/LauncherRepository;->offlineSkinFile(Lcom/pymcl/core/account/Account;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v2

    goto :goto_1

    .end local v1    # "$i$a$-let-RepositoryUiApiExt$accountSkinFile$2$1$2\\4\\44\\1":I
    .end local v7    # "it\\4":Lcom/pymcl/core/account/Account;
    :cond_3
    move-object v4, v2

    .end local v0    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v3    # "$i$a$-runCatching-RepositoryUiApiExt$accountSkinFile$2$1\\1\\44\\0":I
    :goto_1
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v0

    :goto_3
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
