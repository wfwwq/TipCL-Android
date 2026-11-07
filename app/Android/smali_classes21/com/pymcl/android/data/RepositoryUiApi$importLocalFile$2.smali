.class final Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$importLocalFile$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$importLocalFile$2"
    f = "RepositoryUiApi.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x113
    }
    m = "invokeSuspend"
    n = {
        "src",
        "k",
        "isPack"
    }
    nl = {
        0x114
    }
    s = {
        "L$0",
        "L$1",
        "I$0"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $kind:Ljava/lang/String;

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

.field final synthetic $path:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$path:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$kind:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$version:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$instance:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$path:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$kind:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$version:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$instance:Ljava/lang/String;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 272
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->I$0:I

    .local v0, "isPack":Z
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/core/mods/ResKind;

    .local v1, "k":Lcom/pymcl/core/mods/ResKind;
    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    .local v2, "src":Ljava/io/File;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v4, p1

    goto/16 :goto_5

    .end local v0    # "isPack":Z
    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v2    # "src":Ljava/io/File;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 273
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$path:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    .local v3, "src":Ljava/io/File;
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$kind:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v2

    .line 274
    .local v2, "k":Lcom/pymcl/core/mods/ResKind;
    sget-object v0, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v9, "getName(...)"

    const/4 v7, 0x0

    if-eq v2, v0, :cond_4

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, ".mrpack"

    invoke-static {v0, v8, v7, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    :try_start_0
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v0

    .line 495
    .local v8, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v10, 0x0

    .line 274
    .local v10, "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    new-instance v0, Ljava/util/zip/ZipFile;

    invoke-direct {v0, v3}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    move-object v11, v0

    check-cast v11, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v0, v11

    check-cast v0, Ljava/util/zip/ZipFile;

    .line 495
    .local v0, "z\\2":Ljava/util/zip/ZipFile;
    const/4 v12, 0x0

    .line 274
    .local v12, "$i$a$-use-RepositoryUiApi$importLocalFile$2$isPack$1$1\\2\\274\\1":I
    const-string v13, "modrinth.index.json"

    invoke-virtual {v0, v13}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v13

    if-nez v13, :cond_1

    const-string v13, "manifest.json"

    invoke-virtual {v0, v13}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v13

    if-eqz v13, :cond_0

    const-string v13, "overrides/"

    invoke-virtual {v0, v13}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v13
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v13, :cond_0

    goto :goto_0

    :cond_0
    move v0, v7

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v6

    .end local v0    # "z\\2":Ljava/util/zip/ZipFile;
    .end local v12    # "$i$a$-use-RepositoryUiApi$importLocalFile$2$isPack$1$1\\2\\274\\1":I
    :goto_1
    :try_start_2
    invoke-static {v11, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v10    # "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    .restart local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .restart local v10    # "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    :catchall_0
    move-exception v0

    move-object v12, v0

    .end local v2    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v3    # "src":Ljava/io/File;
    .end local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v10    # "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    .end local p1    # "$result":Ljava/lang/Object;
    :try_start_3
    throw v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v2    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v3    # "src":Ljava/io/File;
    .restart local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .restart local v10    # "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v11, v12}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v3    # "src":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v8    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v10    # "$i$a$-runCatching-RepositoryUiApi$importLocalFile$2$isPack$1\\1\\274\\0":I
    .restart local v2    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v3    # "src":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v0, v8

    :cond_2
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v0, v7

    goto :goto_4

    :cond_4
    :goto_3
    move v0, v6

    .line 275
    .local v0, "isPack":Z
    :goto_4
    if-eqz v0, :cond_6

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->L$1:Ljava/lang/Object;

    iput v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->I$0:I

    iput v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->label:I

    invoke-virtual {v4, v3, v5, v7}, Lcom/pymcl/android/data/LauncherRepository;->importModpack(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_5

    .line 272
    return-object v1

    .line 275
    :cond_5
    move-object v1, v2

    move-object v2, v3

    .end local v3    # "src":Ljava/io/File;
    .restart local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .local v2, "src":Ljava/io/File;
    :goto_5
    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "n":Ljava/lang/String;
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "v":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5

    .line 276
    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v4    # "v":Ljava/lang/String;
    .local v2, "k":Lcom/pymcl/core/mods/ResKind;
    .local v3, "src":Ljava/io/File;
    :cond_6
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$version:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    .line 277
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$instance:Ljava/lang/String;

    iget-object v8, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->$version:Ljava/lang/String;

    invoke-static {v1, v6, v8}, Lcom/pymcl/android/data/RepositoryUiApi;->access$gameDirOf(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 278
    .local v1, "gd":Ljava/io/File;
    sget-object v6, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-ne v2, v6, :cond_7

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    const-string v6, "saves"

    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4, v3, v5}, Lcom/pymcl/core/mods/ModCatalog;->unzipWorld(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    .line 279
    :cond_7
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, ".jar"

    invoke-static {v6, v8, v7, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v4, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    goto :goto_6

    :cond_8
    move-object v4, v2

    :goto_6
    move-object v10, v4

    .line 280
    .local v10, "kk":Lcom/pymcl/core/mods/ResKind;
    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v4

    invoke-virtual {v4, v10, v1}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v4

    move-object v5, v4

    .line 495
    .local v5, "it\\3":Ljava/io/File;
    const/4 v6, 0x0

    .line 280
    .local v6, "$i$a$-also-RepositoryUiApi$importLocalFile$2$dest$1\\3\\280\\0":I
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .end local v5    # "it\\3":Ljava/io/File;
    .end local v6    # "$i$a$-also-RepositoryUiApi$importLocalFile$2$dest$1\\3\\280\\0":I
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v4, v6

    .local v4, "dest":Ljava/io/File;
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v5

    .line 276
    .end local v1    # "gd":Ljava/io/File;
    .end local v4    # "dest":Ljava/io/File;
    .end local v10    # "kk":Lcom/pymcl/core/mods/ResKind;
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v4, "\u8bf7\u5148\u5728\u542f\u52a8\u9875\u9009\u62e9\u4e00\u4e2a\u5df2\u5b89\u88c5\u7684\u7248\u672c"

    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
