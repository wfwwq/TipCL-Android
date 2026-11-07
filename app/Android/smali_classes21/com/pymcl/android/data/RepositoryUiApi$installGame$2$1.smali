.class final Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$installGame$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,494:1\n1#2:495\n296#3,2:496\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$installGame$2$1\n*L\n165#1:496,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$installGame$2$1"
    f = "RepositoryUiApi.kt"
    i = {
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x9d,
        0xa0,
        0xa9,
        0xaa
    }
    m = "invokeSuspend"
    n = {
        "t",
        "t",
        "lv",
        "d",
        "forgeId",
        "mods",
        "t",
        "lv"
    }
    nl = {
        0x9e,
        0xa1,
        0xaa,
        0xab
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $i:Lcom/pymcl/core/instance/Instance;

.field final synthetic $loader:Ljava/lang/String;

.field final synthetic $loaderVersion:Ljava/lang/String;

.field final synthetic $onProgress:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $version:Ljava/lang/String;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loader:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loaderVersion:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loader:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loaderVersion:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$onProgress:Lkotlin/jvm/functions/Function2;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 156
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "lv":Ljava/lang/String;
    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/core/loader/LoaderType;

    .local v2, "t":Lcom/pymcl/core/loader/LoaderType;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v0

    move-object/from16 v0, p1

    goto/16 :goto_9

    .end local v0    # "lv":Ljava/lang/String;
    .end local v2    # "t":Lcom/pymcl/core/loader/LoaderType;
    :pswitch_1
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$4:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    .local v0, "mods":Ljava/io/File;
    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .local v2, "forgeId":Ljava/lang/String;
    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lcom/pymcl/core/version/GameDirs;

    .local v3, "d":Lcom/pymcl/core/version/GameDirs;
    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .local v4, "lv":Ljava/lang/String;
    iget-object v5, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/core/loader/LoaderType;

    .local v5, "t":Lcom/pymcl/core/loader/LoaderType;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_8

    .end local v0    # "mods":Ljava/io/File;
    .end local v2    # "forgeId":Ljava/lang/String;
    .end local v3    # "d":Lcom/pymcl/core/version/GameDirs;
    .end local v4    # "lv":Ljava/lang/String;
    .end local v5    # "t":Lcom/pymcl/core/loader/LoaderType;
    :pswitch_2
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/pymcl/core/loader/LoaderType;

    .local v0, "t":Lcom/pymcl/core/loader/LoaderType;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_2

    .end local v0    # "t":Lcom/pymcl/core/loader/LoaderType;
    :pswitch_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 157
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    iget-object v7, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->label:I

    invoke-virtual {v0, v6, v7, v8}, Lcom/pymcl/android/data/LauncherRepository;->installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_0

    .line 156
    return-object v2

    .line 158
    :cond_0
    :goto_0
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loader:Ljava/lang/String;

    invoke-static {v0, v6}, Lcom/pymcl/android/data/RepositoryUiApi;->access$loaderType(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;

    move-result-object v0

    .line 159
    .restart local v0    # "t":Lcom/pymcl/core/loader/LoaderType;
    if-nez v0, :cond_1

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    goto/16 :goto_a

    .line 160
    :cond_1
    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loaderVersion:Ljava/lang/String;

    if-eqz v6, :cond_3

    move-object v7, v6

    .line 495
    .local v7, "it\\1":Ljava/lang/String;
    const/4 v8, 0x0

    .line 160
    .local v8, "$i$a$-takeIf-RepositoryUiApi$installGame$2$1$lv$1\\1\\160\\0":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    .end local v7    # "it\\1":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-RepositoryUiApi$installGame$2$1$lv$1\\1\\160\\0":I
    if-nez v9, :cond_2

    goto :goto_1

    :cond_2
    move-object v6, v5

    :goto_1
    if-nez v6, :cond_5

    :cond_3
    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v6}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v6

    iget-object v7, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    move-object v8, v1

    check-cast v8, Lkotlin/coroutines/Continuation;

    iput-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    iput v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->label:I

    invoke-virtual {v6, v0, v7, v8}, Lcom/pymcl/android/data/LauncherRepository;->loaderVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_4

    .line 156
    return-object v2

    .line 160
    :cond_4
    :goto_2
    check-cast v6, Ljava/util/List;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/core/loader/LoaderVersion;

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Lcom/pymcl/core/loader/LoaderVersion;->getVersion()Ljava/lang/String;

    move-result-object v6

    :cond_5
    move-object v8, v0

    move-object v10, v6

    .line 162
    .end local v0    # "t":Lcom/pymcl/core/loader/LoaderType;
    .local v8, "t":Lcom/pymcl/core/loader/LoaderType;
    .local v10, "lv":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$onProgress:Lkotlin/jvm/functions/Function2;

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loader:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u5b89\u88c5 "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v5, v6}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    if-ne v8, v0, :cond_e

    const-string v0, "\uff08Forge \u6a21\u7ec4\uff09"

    const/4 v6, 0x0

    invoke-static {v10, v0, v6, v3, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 164
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v0, v3}, Lcom/pymcl/android/data/LauncherRepository;->dirsFor(Lcom/pymcl/core/instance/Instance;)Lcom/pymcl/core/version/GameDirs;

    move-result-object v3

    .line 165
    .restart local v3    # "d":Lcom/pymcl/core/version/GameDirs;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v0}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$firstOrNull\\2":Ljava/lang/Iterable;
    iget-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v11, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    const/4 v12, 0x0

    .line 496
    .local v12, "$i$f$firstOrNull\\2\\165":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element\\2":Ljava/lang/Object;
    move-object/from16 v17, v14

    check-cast v17, Ljava/lang/String;

    .local v17, "id\\3":Ljava/lang/String;
    const/16 v21, 0x0

    .line 166
    .local v21, "$i$a$-firstOrNull-RepositoryUiApi$installGame$2$1$forgeId$1\\3\\496\\0":I
    nop

    .line 165
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v9

    .line 495
    .local v0, "$this$invokeSuspend_u24lambda_u241_u240\\4":Lcom/pymcl/android/data/RepositoryUiApi;
    const/16 v22, 0x0

    .line 165
    .local v22, "$i$a$-runCatching-RepositoryUiApi$installGame$2$1$forgeId$1$1\\4\\165\\3":I
    sget-object v15, Lcom/pymcl/core/version/ResolvedVersion;->Companion:Lcom/pymcl/core/version/ResolvedVersion$Companion;

    invoke-virtual {v3}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v16

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lcom/pymcl/core/version/ResolvedVersion$Companion;->load$default(Lcom/pymcl/core/version/ResolvedVersion$Companion;Ljava/io/File;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v15

    .end local v0    # "$this$invokeSuspend_u24lambda_u241_u240\\4":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v22    # "$i$a$-runCatching-RepositoryUiApi$installGame$2$1$forgeId$1$1\\4\\165\\3":I
    invoke-static {v15}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v15, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    move-object v0, v5

    :cond_6
    check-cast v0, Lcom/pymcl/core/version/ResolvedVersion;

    .line 166
    if-eqz v0, :cond_8

    .line 165
    nop

    .line 166
    nop

    .line 495
    .local v0, "it\\5":Lcom/pymcl/core/version/ResolvedVersion;
    const/4 v15, 0x0

    .line 166
    .local v15, "$i$a$-let-RepositoryUiApi$installGame$2$1$forgeId$1$2\\5\\166\\3":I
    invoke-virtual {v0}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-static {v9, v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$loaderOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/version/ResolvedVersion;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "Forge"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move v0, v4

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    .line 165
    .end local v0    # "it\\5":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v15    # "$i$a$-let-RepositoryUiApi$installGame$2$1$forgeId$1$2\\5\\166\\3":I
    :goto_5
    if-ne v0, v4, :cond_9

    move v0, v4

    goto :goto_6

    :cond_8
    nop

    :cond_9
    const/4 v0, 0x0

    .line 166
    :goto_6
    nop

    .line 496
    .end local v17    # "id\\3":Ljava/lang/String;
    .end local v21    # "$i$a$-firstOrNull-RepositoryUiApi$installGame$2$1$forgeId$1\\3\\496\\0":I
    if-eqz v0, :cond_a

    move-object v5, v14

    goto :goto_7

    :cond_a
    const/4 v5, 0x0

    const/4 v6, 0x0

    goto :goto_3

    .line 497
    .end local v14    # "element\\2":Ljava/lang/Object;
    :cond_b
    const/4 v5, 0x0

    .line 165
    .end local v7    # "$this$firstOrNull\\2":Ljava/lang/Iterable;
    .end local v12    # "$i$f$firstOrNull\\2\\165":I
    :goto_7
    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_d

    .line 168
    .local v5, "forgeId":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v6}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v4

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    invoke-virtual {v6}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v4, v6}, Lcom/pymcl/core/instance/VersionSettings;->applyIsolation(Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    const-string v6, "mods"

    invoke-direct {v0, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 169
    .local v0, "mods":Ljava/io/File;
    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v4

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    move-object v7, v1

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$2:Ljava/lang/Object;

    iput-object v5, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$3:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$4:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->label:I

    invoke-virtual {v4, v0, v6, v10, v7}, Lcom/pymcl/core/loader/LoaderInstaller;->installOptiFineAsMod(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_c

    .line 156
    return-object v2

    .line 169
    :cond_c
    move-object v2, v5

    move-object v5, v8

    move-object v4, v10

    .end local v8    # "t":Lcom/pymcl/core/loader/LoaderType;
    .end local v10    # "lv":Ljava/lang/String;
    .restart local v2    # "forgeId":Ljava/lang/String;
    .restart local v4    # "lv":Ljava/lang/String;
    .local v5, "t":Lcom/pymcl/core/loader/LoaderType;
    :goto_8
    move-object v0, v5

    .end local v0    # "mods":Ljava/io/File;
    .end local v2    # "forgeId":Ljava/lang/String;
    .end local v3    # "d":Lcom/pymcl/core/version/GameDirs;
    goto :goto_a

    .line 167
    .end local v4    # "lv":Ljava/lang/String;
    .end local v5    # "t":Lcom/pymcl/core/loader/LoaderType;
    .restart local v3    # "d":Lcom/pymcl/core/version/GameDirs;
    .restart local v8    # "t":Lcom/pymcl/core/loader/LoaderType;
    .restart local v10    # "lv":Ljava/lang/String;
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5b9e\u4f8b\u4e2d\u6ca1\u6709 Forge "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " \u7248\u672c\uff0c\u8bf7\u5148\u5b89\u88c5 Forge \u518d\u4ee5\u6a21\u7ec4\u65b9\u5f0f\u5b89\u88c5 OptiFine"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    .end local v3    # "d":Lcom/pymcl/core/version/GameDirs;
    :cond_e
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v7

    iget-object v9, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    iget-object v11, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$i:Lcom/pymcl/core/instance/Instance;

    move-object v12, v1

    check-cast v12, Lkotlin/coroutines/Continuation;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->L$1:Ljava/lang/Object;

    const/4 v0, 0x4

    iput v0, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->label:I

    invoke-virtual/range {v7 .. v12}, Lcom/pymcl/android/data/LauncherRepository;->installLoader(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_f

    .line 156
    return-object v2

    .line 170
    :cond_f
    move-object v2, v8

    .line 156
    .end local v8    # "t":Lcom/pymcl/core/loader/LoaderType;
    .local v2, "t":Lcom/pymcl/core/loader/LoaderType;
    :goto_9
    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v2

    move-object v2, v0

    move-object/from16 v0, v23

    .line 171
    .end local v2    # "t":Lcom/pymcl/core/loader/LoaderType;
    .end local v10    # "lv":Ljava/lang/String;
    .local v0, "t":Lcom/pymcl/core/loader/LoaderType;
    :goto_a
    return-object v2

    .line 161
    :cond_10
    new-instance v2, Ljava/lang/IllegalStateException;

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$loader:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2$1;->$version:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " \u6ca1\u6709\u9002\u7528\u4e8e "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " \u7684\u7248\u672c"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

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
