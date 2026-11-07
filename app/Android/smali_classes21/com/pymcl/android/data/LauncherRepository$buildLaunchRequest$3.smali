.class final Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->buildLaunchRequest(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/runtime/GameLaunchRequest;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,206:1\n1#2:207\n37#3,2:208\n*S KotlinDebug\n*F\n+ 1 LauncherRepository.kt\ncom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3\n*L\n173#1:208,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/runtime/GameLaunchRequest;",
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
    c = "com.pymcl.android.data.LauncherRepository$buildLaunchRequest$3"
    f = "LauncherRepository.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x99
    }
    m = "invokeSuspend"
    n = {
        "$this$withContext",
        "acc0"
    }
    nl = {
        0x9a
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $inst:Lcom/pymcl/core/instance/Instance;

.field final synthetic $onNote:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $rendererId:Ljava/lang/String;

.field final synthetic $server:Ljava/lang/String;

.field final synthetic $versionId:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$versionId:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$rendererId:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$server:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$onNote:Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$versionId:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$rendererId:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$server:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$onNote:Lkotlin/jvm/functions/Function1;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;-><init>(Lcom/pymcl/android/data/LauncherRepository;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/runtime/GameLaunchRequest;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 151
    iget v3, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->label:I

    const/4 v4, 0x1

    packed-switch v3, :pswitch_data_0

    move-object/from16 v29, v2

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .local v29, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .end local v29    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :pswitch_0
    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->L$1:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/account/Account;

    .local v0, "acc0":Lcom/pymcl/core/account/Account;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    move-object v3, v0

    goto :goto_0

    .end local v0    # "acc0":Lcom/pymcl/core/account/Account;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 152
    iget-object v3, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/core/account/AccountStore;->active()Lcom/pymcl/core/account/Account;

    move-result-object v3

    if-eqz v3, :cond_24

    .line 153
    .local v3, "acc0":Lcom/pymcl/core/account/Account;
    iget-object v5, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    move-object v6, v1

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v2, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->L$1:Ljava/lang/Object;

    iput v4, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->label:I

    invoke-virtual {v5, v3, v6}, Lcom/pymcl/android/data/LauncherRepository;->refreshIfNeeded(Lcom/pymcl/core/account/Account;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_0

    .line 151
    return-object v0

    :cond_0
    :goto_0
    move-object v7, v5

    check-cast v7, Lcom/pymcl/core/account/Account;

    .line 154
    .local v7, "acc":Lcom/pymcl/core/account/Account;
    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    iget-object v5, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$versionId:Ljava/lang/String;

    iget-object v6, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v6}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v6

    invoke-virtual {v0, v5, v6}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v5

    .local v5, "vs":Lcom/pymcl/core/instance/VersionSettings;
    invoke-virtual {v5}, Lcom/pymcl/core/instance/VersionSettings;->load()Ljava/util/Map;

    move-result-object v6

    .line 155
    .local v6, "s":Ljava/util/Map;
    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/pymcl/core/instance/VersionSettings;->applyIsolation(Ljava/io/File;)Ljava/io/File;

    move-result-object v8

    .line 156
    .local v8, "gameDir":Ljava/io/File;
    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v9, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v0, v9}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v9

    .line 157
    .local v9, "d":Lcom/pymcl/core/version/GameDirs;
    sget-object v10, Lcom/pymcl/core/version/ResolvedVersion;->Companion:Lcom/pymcl/core/version/ResolvedVersion$Companion;

    invoke-virtual {v9}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v11

    iget-object v12, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$versionId:Ljava/lang/String;

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lcom/pymcl/core/version/ResolvedVersion$Companion;->load$default(Lcom/pymcl/core/version/ResolvedVersion$Companion;Ljava/io/File;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v10

    .line 159
    .local v10, "v":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-virtual {v7}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v11, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    const-string v12, "PyMCL"

    const/16 v27, 0x0

    if-ne v0, v11, :cond_4

    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    :try_start_0
    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v11, v2

    .line 207
    .local v11, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v13, 0x0

    .line 159
    .local v13, "$i$a$-runCatching-LauncherRepository$buildLaunchRequest$3$skin$1\\1\\159\\0":I
    invoke-virtual {v0, v7}, Lcom/pymcl/android/data/LauncherRepository;->prepareOfflineSkin(Lcom/pymcl/core/account/Account;)Lkotlin/Pair;

    move-result-object v14

    if-eqz v14, :cond_1

    move-object v15, v14

    .line 207
    .local v15, "it\\2":Lkotlin/Pair;
    const/16 v16, 0x0

    .line 159
    .local v16, "$i$a$-takeIf-LauncherRepository$buildLaunchRequest$3$skin$1$1\\2\\159\\1":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getAgents()Lcom/pymcl/core/auth/AgentJars;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/auth/AgentJars;->ensureAuthlibInjector()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    .end local v15    # "it\\2":Lkotlin/Pair;
    .end local v16    # "$i$a$-takeIf-LauncherRepository$buildLaunchRequest$3$skin$1$1\\2\\159\\1":I
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v14, v27

    .end local v11    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v13    # "$i$a$-runCatching-LauncherRepository$buildLaunchRequest$3$skin$1\\1\\159\\0":I
    :goto_1
    invoke-static {v14}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 160
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v11

    if-eqz v11, :cond_2

    .line 207
    .local v11, "it\\4":Ljava/lang/Throwable;
    const/4 v13, 0x0

    .line 160
    .local v13, "$i$a$-onFailure-LauncherRepository$buildLaunchRequest$3$skin$2\\4\\160\\0":I
    const-string v14, "offline skin server"

    invoke-static {v12, v14, v11}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .end local v11    # "it\\4":Ljava/lang/Throwable;
    .end local v13    # "$i$a$-onFailure-LauncherRepository$buildLaunchRequest$3$skin$2\\4\\160\\0":I
    :cond_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    move-object/from16 v0, v27

    :cond_3
    check-cast v0, Lkotlin/Pair;

    goto :goto_3

    :cond_4
    move-object/from16 v0, v27

    .line 159
    :goto_3
    move-object/from16 v28, v0

    .line 161
    .local v28, "skin":Lkotlin/Pair;
    invoke-virtual {v7}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v11, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    if-eq v0, v11, :cond_6

    if-eqz v28, :cond_5

    goto :goto_4

    :cond_5
    move-object/from16 v21, v27

    goto :goto_5

    :cond_6
    :goto_4
    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getAgents()Lcom/pymcl/core/auth/AgentJars;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/auth/AgentJars;->ensureAuthlibInjector()Ljava/io/File;

    move-result-object v0

    move-object/from16 v21, v0

    .line 162
    .local v21, "authlib":Ljava/io/File;
    :goto_5
    invoke-virtual {v7}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sget-object v11, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    if-ne v0, v11, :cond_7

    iget-object v0, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getAgents()Lcom/pymcl/core/auth/AgentJars;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/core/auth/AgentJars;->ensureNide8()Ljava/io/File;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_6

    :cond_7
    move-object/from16 v22, v27

    .line 163
    .local v22, "nide8":Ljava/io/File;
    :goto_6
    sget-object v0, Lcom/pymcl/core/launch/LaunchArgsBuilder;->INSTANCE:Lcom/pymcl/core/launch/LaunchArgsBuilder;

    .line 164
    const-string v11, "memory_mb"

    invoke-interface {v6, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Number;

    if-eqz v14, :cond_8

    check-cast v13, Ljava/lang/Number;

    goto :goto_7

    :cond_8
    move-object/from16 v13, v27

    :goto_7
    if-eqz v13, :cond_9

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v11

    goto :goto_8

    :cond_9
    iget-object v13, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v13}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v13

    invoke-virtual {v13, v11}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v11

    .line 165
    :goto_8
    const-string v13, "window_width"

    invoke-interface {v6, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/Number;

    if-eqz v14, :cond_a

    check-cast v13, Ljava/lang/Number;

    goto :goto_9

    :cond_a
    move-object/from16 v13, v27

    :goto_9
    if-eqz v13, :cond_b

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    goto :goto_a

    :cond_b
    iget-object v13, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v13}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v13

    const-string v14, "width"

    invoke-virtual {v13, v14}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v13

    :goto_a
    const-string v14, "window_height"

    invoke-interface {v6, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ljava/lang/Number;

    if-eqz v15, :cond_c

    check-cast v14, Ljava/lang/Number;

    goto :goto_b

    :cond_c
    move-object/from16 v14, v27

    :goto_b
    if-eqz v14, :cond_d

    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    move-result v14

    goto :goto_c

    :cond_d
    iget-object v14, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v14}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v14

    const-string v15, "height"

    invoke-virtual {v14, v15}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v14

    .line 166
    :goto_c
    const/4 v15, 0x2

    new-array v15, v15, [Ljava/lang/String;

    const-string v16, "maximize"

    move/from16 v17, v4

    const/4 v4, 0x0

    aput-object v16, v15, v4

    const-string v16, "fullscreen"

    aput-object v16, v15, v17

    invoke-static {v15}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v15

    const-string v4, "window_mode"

    move-object/from16 v29, v2

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v29    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v30, v3

    .end local v3    # "acc0":Lcom/pymcl/core/account/Account;
    .local v30, "acc0":Lcom/pymcl/core/account/Account;
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_e

    check-cast v2, Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 v2, v27

    :goto_d
    if-nez v2, :cond_f

    iget-object v2, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_f
    invoke-interface {v15, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    .line 167
    iget-object v3, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v3

    const-string v4, "default_jvm_args"

    invoke-virtual {v3, v4}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "jvm_args"

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v15, v4, Ljava/lang/String;

    if-eqz v15, :cond_10

    check-cast v4, Ljava/lang/String;

    goto :goto_e

    :cond_10
    move-object/from16 v4, v27

    :goto_e
    const-string v15, ""

    if-nez v4, :cond_11

    move-object v4, v15

    :cond_11
    move/from16 v16, v2

    const-string v2, "game_args"

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v3

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_12

    check-cast v2, Ljava/lang/String;

    goto :goto_f

    :cond_12
    move-object/from16 v2, v27

    :goto_f
    if-nez v2, :cond_13

    move-object v2, v15

    .line 168
    :cond_13
    const-string v3, "server"

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v19, v2

    instance-of v2, v3, Ljava/lang/String;

    if-eqz v2, :cond_14

    check-cast v3, Ljava/lang/String;

    goto :goto_10

    :cond_14
    move-object/from16 v3, v27

    :goto_10
    if-nez v3, :cond_15

    move-object v3, v15

    :cond_15
    const-string v2, "port"

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_16

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_17

    :cond_16
    move-object v2, v15

    :cond_17
    move-object/from16 v20, v2

    const-string v2, "gc"

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v23, v3

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_18

    check-cast v2, Ljava/lang/String;

    goto :goto_11

    :cond_18
    move-object/from16 v2, v27

    :goto_11
    if-nez v2, :cond_19

    goto :goto_12

    :cond_19
    move-object v15, v2

    :goto_12
    check-cast v15, Ljava/lang/CharSequence;

    iget-object v2, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-interface {v15}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1a

    goto :goto_13

    :cond_1a
    const/16 v17, 0x0

    :goto_13
    if-eqz v17, :cond_1b

    .line 207
    const/4 v3, 0x0

    .line 168
    .local v3, "$i$a$-ifEmpty-LauncherRepository$buildLaunchRequest$3$spec$1\\5\\168\\0":I
    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v2

    const-string v15, "gc_preset"

    invoke-virtual {v2, v15}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .end local v3    # "$i$a$-ifEmpty-LauncherRepository$buildLaunchRequest$3$spec$1\\5\\168\\0":I
    :cond_1b
    check-cast v15, Ljava/lang/String;

    .line 169
    iget-object v2, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/config/ConfigStore;->getMicrosoftClientId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7}, Lcom/pymcl/core/account/Account;->getType()Lcom/pymcl/core/account/AccountType;

    move-result-object v3

    move-object/from16 v17, v2

    sget-object v2, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    if-ne v3, v2, :cond_1c

    if-eqz v21, :cond_1c

    iget-object v2, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    .line 207
    move-object/from16 v3, v21

    .local v3, "it\\6":Ljava/io/File;
    const/16 v24, 0x0

    .line 169
    .local v24, "$i$a$-let-LauncherRepository$buildLaunchRequest$3$spec$2\\6\\169\\0":I
    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getAgents()Lcom/pymcl/core/auth/AgentJars;

    move-result-object v2

    move-object/from16 v25, v3

    .end local v3    # "it\\6":Ljava/io/File;
    .local v25, "it\\6":Ljava/io/File;
    invoke-virtual {v7}, Lcom/pymcl/core/account/Account;->getApi()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/auth/AgentJars;->prefetch(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .end local v24    # "$i$a$-let-LauncherRepository$buildLaunchRequest$3$spec$2\\6\\169\\0":I
    .end local v25    # "it\\6":Ljava/io/File;
    goto :goto_14

    :cond_1c
    move-object/from16 v2, v27

    :goto_14
    iget-object v3, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getRuleEnv()Lcom/pymcl/core/version/RuleEnv;

    move-result-object v24

    .line 170
    if-eqz v28, :cond_1d

    invoke-virtual/range {v28 .. v28}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v25, v3

    goto :goto_15

    :cond_1d
    move-object/from16 v25, v27

    :goto_15
    if-eqz v28, :cond_1e

    invoke-virtual/range {v28 .. v28}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object/from16 v26, v3

    goto :goto_16

    :cond_1e
    move-object/from16 v26, v27

    .line 163
    :goto_16
    move-object v3, v6

    .end local v6    # "s":Ljava/util/Map;
    .local v3, "s":Ljava/util/Map;
    new-instance v6, Lcom/pymcl/core/launch/LaunchOptions;

    move-object/from16 v31, v23

    move-object/from16 v23, v2

    move-object v2, v10

    move v10, v11

    move v11, v13

    move/from16 v13, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v15

    move-object v15, v4

    move-object v4, v12

    move v12, v14

    move-object/from16 v14, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v17

    move-object/from16 v17, v31

    .end local v10    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .local v2, "v":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-direct/range {v6 .. v26}, Lcom/pymcl/core/launch/LaunchOptions;-><init>(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v31, v9

    move-object v9, v6

    move-object/from16 v6, v31

    .end local v9    # "d":Lcom/pymcl/core/version/GameDirs;
    .local v6, "d":Lcom/pymcl/core/version/GameDirs;
    invoke-virtual {v0, v2, v9}, Lcom/pymcl/core/launch/LaunchArgsBuilder;->build(Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchOptions;)Lcom/pymcl/core/launch/LaunchSpec;

    move-result-object v10

    .line 172
    .local v10, "spec":Lcom/pymcl/core/launch/LaunchSpec;
    sget-object v9, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-virtual {v10}, Lcom/pymcl/core/launch/LaunchSpec;->getJavaMajor()I

    move-result v11

    const-string v0, "java"

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/String;

    if-eqz v13, :cond_1f

    check-cast v12, Ljava/lang/String;

    goto :goto_17

    :cond_1f
    move-object/from16 v12, v27

    :goto_17
    iget-object v13, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$inst:Lcom/pymcl/core/instance/Instance;

    :try_start_1
    sget-object v14, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v14, v29

    .line 207
    .local v14, "$this$invokeSuspend_u24lambda_u244\\7":Lkotlinx/coroutines/CoroutineScope;
    const/4 v15, 0x0

    .line 172
    .local v15, "$i$a$-runCatching-LauncherRepository$buildLaunchRequest$3$pick$1\\7\\172\\0":I
    invoke-virtual {v13}, Lcom/pymcl/core/instance/Instance;->meta()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v13, v0, Ljava/lang/String;

    if-eqz v13, :cond_20

    check-cast v0, Ljava/lang/String;

    goto :goto_18

    :cond_20
    move-object/from16 v0, v27

    .end local v14    # "$this$invokeSuspend_u24lambda_u244\\7":Lkotlinx/coroutines/CoroutineScope;
    .end local v15    # "$i$a$-runCatching-LauncherRepository$buildLaunchRequest$3$pick$1\\7\\172\\0":I
    :goto_18
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_19

    :catchall_1
    move-exception v0

    sget-object v13, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_19
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_21

    goto :goto_1a

    :cond_21
    move-object/from16 v27, v0

    :goto_1a
    move-object/from16 v0, v27

    check-cast v0, Ljava/lang/String;

    new-instance v13, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3$pick$2;

    iget-object v14, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-direct {v13, v14}, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3$pick$2;-><init>(Ljava/lang/Object;)V

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v11, v12, v0, v13}, Lcom/pymcl/android/data/LaunchConfigLogic;->resolveJava(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    move-result-object v0

    .line 173
    .local v0, "pick":Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;
    invoke-virtual {v0}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;->getNote()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_22

    iget-object v11, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$onNote:Lkotlin/jvm/functions/Function1;

    .line 207
    .local v9, "n\\8":Ljava/lang/String;
    const/4 v12, 0x0

    .line 173
    .local v12, "$i$a$-let-LauncherRepository$buildLaunchRequest$3$1\\8\\173\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;->getArgs()Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/util/Collection;

    .local v13, "$this$toTypedArray\\9":Ljava/util/Collection;
    const/4 v14, 0x0

    .line 208
    .local v14, "$i$f$toTypedArray\\9\\173":I
    move-object v15, v13

    .line 209
    .local v15, "this_\\9":Ljava/util/Collection;
    move-object/from16 v18, v2

    const/4 v2, 0x0

    .end local v2    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .local v18, "v":Lcom/pymcl/core/version/ResolvedVersion;
    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {v15, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 173
    .end local v13    # "$this$toTypedArray\\9":Ljava/util/Collection;
    .end local v14    # "$i$f$toTypedArray\\9\\173":I
    .end local v15    # "this_\\9":Ljava/util/Collection;
    array-length v13, v2

    invoke-static {v2, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .local v2, "msg\\8":Ljava/lang/String;
    invoke-static {v4, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v11, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v2    # "msg\\8":Ljava/lang/String;
    .end local v9    # "n\\8":Ljava/lang/String;
    .end local v12    # "$i$a$-let-LauncherRepository$buildLaunchRequest$3$1\\8\\173\\0":I
    goto :goto_1b

    .end local v18    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .local v2, "v":Lcom/pymcl/core/version/ResolvedVersion;
    :cond_22
    move-object/from16 v18, v2

    .line 174
    .end local v2    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .restart local v18    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    :goto_1b
    move-object v2, v8

    .end local v8    # "gameDir":Ljava/io/File;
    .local v2, "gameDir":Ljava/io/File;
    iget-object v8, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;->getMajor()I

    move-result v4

    invoke-virtual {v10}, Lcom/pymcl/core/launch/LaunchSpec;->getJavaMajor()I

    move-result v9

    if-ne v4, v9, :cond_23

    move-object v14, v10

    goto :goto_1c

    :cond_23
    invoke-virtual {v0}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;->getMajor()I

    move-result v11

    const/16 v16, 0x1e

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v10 .. v17}, Lcom/pymcl/core/launch/LaunchSpec;->copy$default(Lcom/pymcl/core/launch/LaunchSpec;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/pymcl/core/launch/LaunchSpec;

    move-result-object v4

    move-object v14, v10

    move-object v10, v4

    .end local v10    # "spec":Lcom/pymcl/core/launch/LaunchSpec;
    .local v14, "spec":Lcom/pymcl/core/launch/LaunchSpec;
    :goto_1c
    iget-object v12, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$rendererId:Ljava/lang/String;

    iget-object v13, v1, Lcom/pymcl/android/data/LauncherRepository$buildLaunchRequest$3;->$server:Ljava/lang/String;

    move-object v11, v2

    move-object/from16 v9, v18

    .end local v2    # "gameDir":Ljava/io/File;
    .end local v18    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .local v9, "v":Lcom/pymcl/core/version/ResolvedVersion;
    .local v11, "gameDir":Ljava/io/File;
    invoke-virtual/range {v8 .. v13}, Lcom/pymcl/android/data/LauncherRepository;->toFclRequest(Lcom/pymcl/core/version/ResolvedVersion;Lcom/pymcl/core/launch/LaunchSpec;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/runtime/GameLaunchRequest;

    move-result-object v2

    move-object v8, v11

    .end local v9    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v11    # "gameDir":Ljava/io/File;
    .restart local v8    # "gameDir":Ljava/io/File;
    .restart local v18    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    return-object v2

    .line 152
    .end local v0    # "pick":Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;
    .end local v3    # "s":Ljava/util/Map;
    .end local v5    # "vs":Lcom/pymcl/core/instance/VersionSettings;
    .end local v6    # "d":Lcom/pymcl/core/version/GameDirs;
    .end local v7    # "acc":Lcom/pymcl/core/account/Account;
    .end local v8    # "gameDir":Ljava/io/File;
    .end local v14    # "spec":Lcom/pymcl/core/launch/LaunchSpec;
    .end local v18    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v21    # "authlib":Ljava/io/File;
    .end local v22    # "nide8":Ljava/io/File;
    .end local v28    # "skin":Lkotlin/Pair;
    .end local v29    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v30    # "acc0":Lcom/pymcl/core/account/Account;
    .local v2, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    :cond_24
    move-object/from16 v29, v2

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v29    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "\u8bf7\u5148\u6dfb\u52a0\u8d26\u53f7"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
