.class final Lcom/pymcl/android/data/LauncherRepository$importModpack$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LauncherRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/LauncherRepository;->importModpack(Ljava/io/File;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Pair;",
        "",
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
    c = "com.pymcl.android.data.LauncherRepository$importModpack$3"
    f = "LauncherRepository.kt"
    i = {
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x45,
        0x49,
        0x4c
    }
    m = "invokeSuspend"
    n = {
        "info",
        "inst",
        "info",
        "inst",
        "lt",
        "lv",
        "info",
        "inst",
        "lt",
        "lv",
        "vid",
        "gameDir"
    }
    nl = {
        0x46,
        0x4a,
        0x4d
    }
    s = {
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5"
    }
    v = 0x2
.end annotation


# instance fields
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

.field final synthetic $zip:Ljava/io/File;

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/LauncherRepository;


# direct methods
.method public static synthetic $r8$lambda$P1TDkRU_OBPouc6bFe6J0gEe8M0(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->invokeSuspend$lambda$0(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/io/File;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/pymcl/android/data/LauncherRepository;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/LauncherRepository$importModpack$3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$zip:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iput-object p3, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p"    # F
    .param p2, "d"    # Ljava/lang/String;

    .line 76
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p0, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
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

    new-instance v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;

    iget-object v1, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$zip:Ljava/io/File;

    iget-object v2, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    iget-object v3, p0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$onProgress:Lkotlin/jvm/functions/Function2;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;-><init>(Ljava/io/File;Lcom/pymcl/android/data/LauncherRepository;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 65
    iget v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->label:I

    const/4 v3, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$5:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    .local v1, "gameDir":Ljava/io/File;
    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .local v2, "vid":Ljava/lang/String;
    iget-object v7, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$3:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "lv":Ljava/lang/String;
    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$2:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/loader/LoaderType;

    .local v8, "lt":Lcom/pymcl/core/loader/LoaderType;
    iget-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/core/instance/Instance;

    .local v9, "inst":Lcom/pymcl/core/instance/Instance;
    iget-object v10, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/pymcl/core/mods/PackInfo;

    .local v10, "info":Lcom/pymcl/core/mods/PackInfo;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v19, v5

    const/16 v18, 0x0

    goto/16 :goto_5

    .end local v1    # "gameDir":Ljava/io/File;
    .end local v2    # "vid":Ljava/lang/String;
    .end local v7    # "lv":Ljava/lang/String;
    .end local v8    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .end local v9    # "inst":Lcom/pymcl/core/instance/Instance;
    .end local v10    # "info":Lcom/pymcl/core/mods/PackInfo;
    :pswitch_1
    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    .local v2, "lv":Ljava/lang/String;
    iget-object v7, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$2:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/loader/LoaderType;

    .local v7, "lt":Lcom/pymcl/core/loader/LoaderType;
    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/instance/Instance;

    .local v8, "inst":Lcom/pymcl/core/instance/Instance;
    iget-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/core/mods/PackInfo;

    .local v9, "info":Lcom/pymcl/core/mods/PackInfo;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v13, v2

    move-object/from16 v2, p1

    goto/16 :goto_3

    .end local v2    # "lv":Ljava/lang/String;
    .end local v7    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .end local v8    # "inst":Lcom/pymcl/core/instance/Instance;
    .end local v9    # "info":Lcom/pymcl/core/mods/PackInfo;
    :pswitch_2
    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/core/instance/Instance;

    .local v2, "inst":Lcom/pymcl/core/instance/Instance;
    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/mods/PackInfo;

    .local v8, "info":Lcom/pymcl/core/mods/PackInfo;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v2

    move-object v9, v8

    goto :goto_0

    .end local v2    # "inst":Lcom/pymcl/core/instance/Instance;
    .end local v8    # "info":Lcom/pymcl/core/mods/PackInfo;
    :pswitch_3
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    sget-object v2, Lcom/pymcl/core/mods/Modpack;->INSTANCE:Lcom/pymcl/core/mods/Modpack;

    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$zip:Ljava/io/File;

    invoke-virtual {v2, v8}, Lcom/pymcl/core/mods/Modpack;->read(Ljava/io/File;)Lcom/pymcl/core/mods/PackInfo;

    move-result-object v2

    .line 67
    .local v2, "info":Lcom/pymcl/core/mods/PackInfo;
    iget-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v8}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v8

    invoke-virtual {v2}, Lcom/pymcl/core/mods/PackInfo;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9, v7, v6, v7}, Lcom/pymcl/core/instance/InstanceManager;->createUnique$default(Lcom/pymcl/core/instance/InstanceManager;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/instance/Instance;

    move-result-object v8

    .line 68
    .local v8, "inst":Lcom/pymcl/core/instance/Instance;
    iget-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$onProgress:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v2}, Lcom/pymcl/core/mods/PackInfo;->getMcVersion()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u5b89\u88c5 Minecraft "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v9, v7, v10}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    iget-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/core/mods/PackInfo;->getMcVersion()Ljava/lang/String;

    move-result-object v10

    move-object v11, v0

    check-cast v11, Lkotlin/coroutines/Continuation;

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->label:I

    invoke-virtual {v9, v10, v8, v11}, Lcom/pymcl/android/data/LauncherRepository;->installVanilla(Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v1, :cond_0

    .line 65
    return-object v1

    .line 69
    :cond_0
    move-object v9, v2

    move-object v14, v8

    .line 70
    .end local v2    # "info":Lcom/pymcl/core/mods/PackInfo;
    .end local v8    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v9    # "info":Lcom/pymcl/core/mods/PackInfo;
    .local v14, "inst":Lcom/pymcl/core/instance/Instance;
    :goto_0
    invoke-virtual {v9}, Lcom/pymcl/core/mods/PackInfo;->getLoader()Lcom/pymcl/core/loader/LoaderType;

    move-result-object v11

    .local v11, "lt":Lcom/pymcl/core/loader/LoaderType;
    invoke-virtual {v9}, Lcom/pymcl/core/mods/PackInfo;->getLoaderVersion()Ljava/lang/String;

    move-result-object v13

    .line 71
    .local v13, "lv":Ljava/lang/String;
    if-eqz v11, :cond_4

    move-object v2, v13

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v5

    :goto_2
    if-nez v2, :cond_4

    .line 72
    iget-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$onProgress:Lkotlin/jvm/functions/Function2;

    invoke-virtual {v11}, Lcom/pymcl/core/loader/LoaderType;->name()Ljava/lang/String;

    move-result-object v8

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "toLowerCase(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u5b89\u88c5 "

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v10, " "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v7, v8}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    iget-object v10, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v9}, Lcom/pymcl/core/mods/PackInfo;->getMcVersion()Ljava/lang/String;

    move-result-object v12

    move-object v15, v0

    check-cast v15, Lkotlin/coroutines/Continuation;

    iput-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    iput-object v14, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$2:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$3:Ljava/lang/Object;

    iput v6, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->label:I

    invoke-virtual/range {v10 .. v15}, Lcom/pymcl/android/data/LauncherRepository;->installLoader(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/instance/Instance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_3

    .line 65
    return-object v1

    .line 73
    :cond_3
    move-object v7, v11

    move-object v8, v14

    .end local v11    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .end local v14    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v7    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .restart local v8    # "inst":Lcom/pymcl/core/instance/Instance;
    :goto_3
    check-cast v2, Ljava/lang/String;

    move-object v11, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v13

    goto :goto_4

    .line 74
    .end local v7    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .end local v8    # "inst":Lcom/pymcl/core/instance/Instance;
    .restart local v11    # "lt":Lcom/pymcl/core/loader/LoaderType;
    .restart local v14    # "inst":Lcom/pymcl/core/instance/Instance;
    :cond_4
    invoke-virtual {v9}, Lcom/pymcl/core/mods/PackInfo;->getMcVersion()Ljava/lang/String;

    move-result-object v2

    move-object v8, v11

    move-object v11, v9

    move-object v9, v14

    move-object v7, v13

    .line 71
    .end local v13    # "lv":Ljava/lang/String;
    .end local v14    # "inst":Lcom/pymcl/core/instance/Instance;
    .local v7, "lv":Ljava/lang/String;
    .local v8, "lt":Lcom/pymcl/core/loader/LoaderType;
    .local v9, "inst":Lcom/pymcl/core/instance/Instance;
    .local v11, "info":Lcom/pymcl/core/mods/PackInfo;
    :goto_4
    nop

    .line 75
    .local v2, "vid":Ljava/lang/String;
    iget-object v10, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v10}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v10

    invoke-virtual {v9, v2, v10}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v10

    invoke-virtual {v9}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v12

    invoke-virtual {v10, v12}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v13

    .line 76
    .local v13, "gameDir":Ljava/io/File;
    sget-object v10, Lcom/pymcl/core/mods/Modpack;->INSTANCE:Lcom/pymcl/core/mods/Modpack;

    iget-object v12, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$zip:Ljava/io/File;

    iget-object v14, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v14}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v14

    iget-object v15, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->this$0:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v15}, Lcom/pymcl/android/data/LauncherRepository;->getDownloads()Lcom/pymcl/core/download/DownloadManager;

    move-result-object v15

    const/16 v18, 0x0

    iget-object v4, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->$onProgress:Lkotlin/jvm/functions/Function2;

    move/from16 v19, v5

    new-instance v5, Lcom/pymcl/android/data/LauncherRepository$importModpack$3$$ExternalSyntheticLambda0;

    invoke-direct {v5, v4}, Lcom/pymcl/android/data/LauncherRepository$importModpack$3$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/coroutines/Continuation;

    iput-object v11, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$0:Ljava/lang/Object;

    iput-object v9, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$1:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$2:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$4:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->L$5:Ljava/lang/Object;

    iput v3, v0, Lcom/pymcl/android/data/LauncherRepository$importModpack$3;->label:I

    move-object/from16 v16, v5

    invoke-virtual/range {v10 .. v17}, Lcom/pymcl/core/mods/Modpack;->installFiles(Lcom/pymcl/core/mods/PackInfo;Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_5

    .line 65
    return-object v1

    .line 76
    :cond_5
    move-object v10, v11

    move-object v1, v13

    .line 77
    .end local v11    # "info":Lcom/pymcl/core/mods/PackInfo;
    .end local v13    # "gameDir":Ljava/io/File;
    .restart local v1    # "gameDir":Ljava/io/File;
    .restart local v10    # "info":Lcom/pymcl/core/mods/PackInfo;
    :goto_5
    const-string v4, "mc_version"

    invoke-virtual {v9, v4, v2}, Lcom/pymcl/core/instance/Instance;->setMeta(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    const/4 v4, 0x4

    new-array v4, v4, [Lkotlin/Pair;

    const-string v5, "name"

    invoke-virtual {v10}, Lcom/pymcl/core/mods/PackInfo;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v18

    const-string v5, "version"

    invoke-virtual {v10}, Lcom/pymcl/core/mods/PackInfo;->getVersion()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v19

    const-string v5, "format"

    invoke-virtual {v10}, Lcom/pymcl/core/mods/PackInfo;->getFormat()Ljava/lang/String;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v6

    const-string v5, "version_id"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "modpack"

    invoke-virtual {v9, v4, v3}, Lcom/pymcl/core/instance/Instance;->setMeta(Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    invoke-virtual {v9}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
