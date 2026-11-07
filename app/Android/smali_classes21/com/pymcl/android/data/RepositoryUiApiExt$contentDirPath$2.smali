.class final Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->contentDirPath(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$contentDirPath$2"
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
.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $kind:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$kind:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$version:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$kind:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$version:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 126
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$instance:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$instanceExists(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_2

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$kind:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$contentDirPath$2;->$version:Ljava/lang/String;

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 175
    .local v0, "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v5, 0x0

    .line 129
    .local v5, "$i$a$-runCatching-RepositoryUiApiExt$contentDirPath$2$1\\1\\129\\0":I
    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v6

    sget-object v7, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    invoke-virtual {v7, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v2

    invoke-static {v0, v3, v4}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v6, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    move-object v3, v2

    .line 175
    .local v3, "it\\2":Ljava/io/File;
    const/4 v4, 0x0

    .line 129
    .local v4, "$i$a$-also-RepositoryUiApiExt$contentDirPath$2$1$1\\2\\129\\1":I
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .end local v3    # "it\\2":Ljava/io/File;
    .end local v4    # "$i$a$-also-RepositoryUiApiExt$contentDirPath$2$1$1\\2\\129\\1":I
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .end local v0    # "$this$invokeSuspend_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v5    # "$i$a$-runCatching-RepositoryUiApiExt$contentDirPath$2$1\\1\\129\\0":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    check-cast v1, Ljava/lang/String;

    :goto_2
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
