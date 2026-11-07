.class final Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->loaderVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/pymcl/core/loader/LoaderVersion;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/core/loader/LoaderVersion;",
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
    c = "com.pymcl.android.data.LauncherRepository$loaderVersions$2"
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
.field final synthetic $mc:Ljava/lang/String;

.field final synthetic $type:Lcom/pymcl/core/loader/LoaderType;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method constructor <init>(Lcom/pymcl/core/loader/LoaderType;Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;-><init>(Lcom/pymcl/core/loader/LoaderType;Lcom/pymcl/android/data/LauncherRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 100
    iget v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 101
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$type:Lcom/pymcl/core/loader/LoaderType;

    sget-object v1, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/pymcl/core/loader/LoaderType;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_1

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 103
    :pswitch_1
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->liteloaderVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_2
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->optifineVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 102
    :pswitch_3
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->neoforgeVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_4
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->forgeVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    .line 101
    :pswitch_5
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->quiltVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :pswitch_6
    iget-object v0, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getLoaders()Lcom/pymcl/core/loader/LoaderInstaller;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$loaderVersions$2;->$mc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->fabricVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 103
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
