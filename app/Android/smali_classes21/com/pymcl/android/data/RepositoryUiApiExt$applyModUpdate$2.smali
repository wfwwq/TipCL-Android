.class final Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->applyModUpdate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "kotlin.jvm.PlatformType"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$applyModUpdate$2"
    f = "RepositoryUiApiExt.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x62
    }
    m = "invokeSuspend"
    n = {
        "nf",
        "dir"
    }
    nl = {
        0x63
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $filename:Ljava/lang/String;

.field final synthetic $instance:Ljava/lang/String;

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

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method public static synthetic $r8$lambda$KbQwaTw0jD6F1t2mMvq68URtF1g(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/mods/ModFile;F)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->invokeSuspend$lambda$1(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/mods/ModFile;F)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
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
            "Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$1(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/mods/ModFile;F)Lkotlin/Unit;
    .locals 2
    .param p0, "$onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p1, "$nf"    # Lcom/pymcl/core/mods/ModFile;
    .param p2, "it"    # F

    .line 98
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 93
    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->L$1:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    .local v0, "dir":Ljava/io/File;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/core/mods/ModFile;

    .local v1, "nf":Lcom/pymcl/core/mods/ModFile;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, p1

    move-object v5, v1

    move-object v1, v0

    goto/16 :goto_2

    .end local v0    # "dir":Ljava/io/File;
    .end local v1    # "nf":Lcom/pymcl/core/mods/ModFile;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getLastUpdates$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Ljava/util/HashMap;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    monitor-enter v1

    .line 175
    const/4 v6, 0x0

    .line 94
    .local v6, "$i$a$-synchronized-RepositoryUiApiExt$applyModUpdate$2$nf$1\\1\\94\\0":I
    :try_start_0
    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getLastUpdates$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Ljava/util/HashMap;

    move-result-object v2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_0

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/pymcl/core/mods/ModFile;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .end local v6    # "$i$a$-synchronized-RepositoryUiApiExt$applyModUpdate$2$nf$1\\1\\94\\0":I
    :goto_0
    monitor-exit v1

    if-nez v2, :cond_2

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/android/data/RepositoryUiApiExt;->checkUpdates(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/pymcl/core/mods/ModFile;

    if-eqz v2, :cond_1

    goto :goto_1

    .line 95
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6ca1\u6709\u627e\u5230\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d\u7684\u66f4\u65b0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_2
    :goto_1
    move-object v5, v2

    .line 96
    .local v5, "nf":Lcom/pymcl/core/mods/ModFile;
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$requireInstance(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    .line 97
    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    invoke-static {v3, v4, v6}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 98
    .local v1, "dir":Ljava/io/File;
    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-virtual {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->getTools()Lcom/pymcl/core/mods/ModTools;

    move-result-object v3

    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    invoke-virtual {v2, v1, v4}, Lcom/pymcl/core/util/FileUtil;->safeChild(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getDownloads()Lcom/pymcl/core/download/DownloadManager;

    move-result-object v6

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    new-instance v7, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2$$ExternalSyntheticLambda0;

    invoke-direct {v7, v2, v5}, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/mods/ModFile;)V

    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->L$0:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->L$1:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->label:I

    invoke-virtual/range {v3 .. v8}, Lcom/pymcl/core/mods/ModTools;->applyUpdate(Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    .line 93
    return-object v0

    .line 98
    :cond_3
    :goto_2
    check-cast v2, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$version:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$applyModUpdate$2;->$filename:Ljava/lang/String;

    .line 99
    move-object v7, v0

    .line 175
    .local v7, "it\\2":Ljava/lang/String;
    const/4 v8, 0x0

    .line 99
    .local v8, "$i$a$-also-RepositoryUiApiExt$applyModUpdate$2$2\\2\\99\\0":I
    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getLastUpdates$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Ljava/util/HashMap;

    move-result-object v9

    monitor-enter v9

    .line 175
    const/4 v10, 0x0

    .line 99
    .local v10, "$i$a$-synchronized-RepositoryUiApiExt$applyModUpdate$2$2$1\\3\\99\\2":I
    :try_start_1
    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getLastUpdates$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Ljava/util/HashMap;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "/"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getLastUpdates$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Ljava/util/HashMap;

    move-result-object v2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v13, "/"

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    :cond_4
    invoke-static {v2, v6}, Lkotlin/collections/MapsKt;->minus(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v11, v12, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v10    # "$i$a$-synchronized-RepositoryUiApiExt$applyModUpdate$2$2$1\\3\\99\\2":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v9

    .end local v7    # "it\\2":Ljava/lang/String;
    .end local v8    # "$i$a$-also-RepositoryUiApiExt$applyModUpdate$2$2\\2\\99\\0":I
    return-object v0

    .restart local v7    # "it\\2":Ljava/lang/String;
    .restart local v8    # "$i$a$-also-RepositoryUiApiExt$applyModUpdate$2$2\\2\\99\\0":I
    :catchall_0
    move-exception v0

    monitor-exit v9

    throw v0

    .line 94
    .end local v1    # "dir":Ljava/io/File;
    .end local v5    # "nf":Lcom/pymcl/core/mods/ModFile;
    .end local v7    # "it\\2":Ljava/lang/String;
    .end local v8    # "$i$a$-also-RepositoryUiApiExt$applyModUpdate$2$2\\2\\99\\0":I
    :catchall_1
    move-exception v0

    monitor-exit v1

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
