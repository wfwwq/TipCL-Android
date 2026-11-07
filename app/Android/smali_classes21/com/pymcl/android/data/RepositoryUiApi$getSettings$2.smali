.class final Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/UiSettings;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getSettings$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/android/ui/state/UiSettings;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getSettings$2"
    f = "RepositoryUiApi.kt"
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

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/UiSettings;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 61
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 458
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 459
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v1

    .line 461
    .local v1, "c":Lcom/pymcl/core/config/ConfigStore;
    const-string v2, "ui_dark"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v4

    const-string v2, "ui_motion"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v11

    const-string v2, "ui_fly_animation"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v12

    const-string v2, "ui_fly_duration_ms"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v13

    .line 462
    const-string v2, "ui_nav_style"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "compact"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    .line 463
    const-string v2, "ui_background"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v2, "ui_background_folder"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v2, "ui_background_shuffle"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v18

    .line 464
    const-string v2, "ui_background_interval"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v19

    const-string v2, "ui_background_blur"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v20

    const-string v2, "ui_background_dim"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v21

    .line 465
    const-string v2, "download_threads"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v23

    const-string v2, "download_segments"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v24

    .line 466
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getSources$p(Lcom/pymcl/android/data/RepositoryUiApi;)Ljava/util/List;

    move-result-object v2

    const-string v3, "download_source"

    invoke-virtual {v1, v3}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v25

    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getSources$p(Lcom/pymcl/android/data/RepositoryUiApi;)Ljava/util/List;

    move-result-object v2

    const-string v5, "community_source"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v26

    .line 467
    const-string v2, "use_system_proxy"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v27

    const-string v2, "download_limit_kbps"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v28

    const-string v2, "curseforge_api_key"

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    .line 468
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getPaths()Lcom/pymcl/core/config/LauncherPaths;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/config/LauncherPaths;->getInstancesDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v5, "getAbsolutePath(...)"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "memory_mb"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v31

    const-string v5, "width"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v32

    const-string v5, "height"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v33

    .line 469
    const-string v5, "default_instance"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    iget-object v6, v0, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-nez v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    move v7, v3

    :goto_0
    if-eqz v7, :cond_1

    .line 495
    const/4 v5, 0x0

    .line 469
    .local v5, "$i$a$-ifEmpty-RepositoryUiApi$getSettings$2$1\\1\\469\\0":I
    invoke-static {v6}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/core/instance/InstanceManager;->getRootName()Ljava/lang/String;

    move-result-object v5

    .end local v5    # "$i$a$-ifEmpty-RepositoryUiApi$getSettings$2$1\\1\\469\\0":I
    :cond_1
    const-string v6, "ifEmpty(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v34, v5

    check-cast v34, Ljava/lang/String;

    const-string v5, "default_jvm_args"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v38

    .line 470
    const-string v5, "allow_multi_instance"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v39

    const-string v5, "shared_libraries"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v40

    const-string v5, "shared_assets"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v41

    .line 471
    const-string v5, "ai_gateway_url"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v43

    const-string v5, "ai_base_url"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v44

    const-string v5, "ai_model"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v46

    const-string v5, "ai_context_window"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->int(Ljava/lang/String;)I

    move-result v47

    .line 472
    const-string v5, "auto_check_update"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v53

    const-string v5, "update_url"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v54

    const-string v5, "microsoft_client_id"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v55

    .line 473
    const-string v5, "custom_homepage"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v52

    const-string v5, "language"

    invoke-virtual {v1, v5}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    const-string v8, "en"

    invoke-static {v5, v8, v3, v6, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v56

    const-string v3, "first_run"

    invoke-virtual {v1, v3}, Lcom/pymcl/core/config/ConfigStore;->bool(Ljava/lang/String;)Z

    move-result v57

    .line 460
    new-instance v3, Lcom/pymcl/android/ui/state/UiSettings;

    .line 461
    nop

    .line 460
    nop

    .line 461
    nop

    .line 460
    nop

    .line 462
    nop

    .line 463
    nop

    .line 464
    nop

    .line 460
    nop

    .line 465
    nop

    .line 466
    nop

    .line 467
    nop

    .line 468
    nop

    .line 469
    nop

    .line 460
    nop

    .line 469
    nop

    .line 470
    nop

    .line 460
    nop

    .line 471
    nop

    .line 460
    nop

    .line 471
    nop

    .line 460
    nop

    .line 473
    nop

    .line 472
    nop

    .line 473
    nop

    .line 460
    const v59, 0xf243

    const/16 v60, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v58, -0x7ffbfb82

    move-object/from16 v30, v2

    invoke-direct/range {v3 .. v60}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 474
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
