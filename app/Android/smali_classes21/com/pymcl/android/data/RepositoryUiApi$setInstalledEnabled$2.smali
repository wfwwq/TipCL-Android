.class final Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
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
    c = "com.pymcl.android.data.RepositoryUiApi$setInstalledEnabled$2"
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
.field final synthetic $enabled:Z

.field final synthetic $filename:Ljava/lang/String;

.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $kind:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$kind:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$instance:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$version:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$enabled:Z

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$kind:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$version:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$enabled:Z

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 257
    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 258
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-static {v0}, Lcom/pymcl/android/data/RepositoryUiApi;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$kind:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$version:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lcom/pymcl/android/data/RepositoryUiApi;->access$gameDirOf(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .local v0, "dir":Ljava/io/File;
    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/pymcl/core/util/FileUtil;->safeChild(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .line 259
    .local v1, "f":Ljava/io/File;
    iget-boolean v2, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$enabled:Z

    const-string v3, ".disabled"

    if-eqz v2, :cond_0

    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v4, v3}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    move-object v5, v3

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 260
    .local v2, "to":Ljava/io/File;
    :goto_0
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v3, Ljava/io/IOException;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;->$filename:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u91cd\u547d\u540d\u5931\u8d25\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 261
    :cond_2
    :goto_1
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
