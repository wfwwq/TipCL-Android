.class final Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->exportModpack(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n777#2:175\n873#2,2:176\n1#3:178\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2\n*L\n111#1:175\n111#1:176,2\n*E\n"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$exportModpack$2"
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
.field final synthetic $include:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $instance:Ljava/lang/String;

.field final synthetic $name:Ljava/lang/String;

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

.field final synthetic $packVersion:Ljava/lang/String;

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method public static synthetic $r8$lambda$cJrrvDqxbAP3Ovg8B5E0mRSeaf4(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->invokeSuspend$lambda$5(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$instance:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$name:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$packVersion:Ljava/lang/String;

    iput-object p7, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$include:Ljava/util/List;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$5(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p"    # F
    .param p2, "d"    # Ljava/lang/String;

    .line 118
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p0, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$instance:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$name:Ljava/lang/String;

    iget-object v6, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$packVersion:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$include:Ljava/util/List;

    move-object v8, p1

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 106
    iget v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 107
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 108
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$instance:Ljava/lang/String;

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    .local v5, "gd":Ljava/io/File;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$instance:Ljava/lang/String;

    iget-object v3, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$resolved(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v0

    if-eqz v0, :cond_7

    move-object v2, v0

    .line 109
    .local v2, "v":Lcom/pymcl/core/version/ResolvedVersion;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v3, 0x0

    const-string v4, "\u8bc6\u522b\u53ef\u5728\u7ebf\u4e0b\u8f7d\u7684\u6587\u4ef6"

    invoke-interface {v0, v3, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    move-object v3, v0

    .line 111
    .local v3, "remote":Ljava/util/HashMap;
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v6, "mods"

    aput-object v6, v0, v4

    const/4 v4, 0x1

    const-string v7, "resourcepacks"

    aput-object v7, v0, v4

    const/4 v4, 0x2

    const-string v7, "shaderpacks"

    aput-object v7, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\1":Ljava/lang/Iterable;
    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$include:Ljava/util/List;

    const/4 v7, 0x0

    .line 175
    .local v7, "$i$f$filter\\1\\111":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\2":Ljava/util/Collection;
    move-object v9, v0

    .local v9, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 176
    .local v10, "$i$f$filterTo\\2\\175":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\2":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it\\3":Ljava/lang/String;
    const/4 v14, 0x0

    .line 111
    .local v14, "$i$a$-filter-RepositoryUiApiExt$exportModpack$2$1\\3\\176\\0":I
    invoke-interface {v4, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v13

    .line 176
    .end local v13    # "it\\3":Ljava/lang/String;
    .end local v14    # "$i$a$-filter-RepositoryUiApiExt$exportModpack$2$1\\3\\176\\0":I
    if-eqz v13, :cond_0

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 177
    .end local v12    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .end local v8    # "destination\\2":Ljava/util/Collection;
    .end local v9    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo\\2\\175":I
    move-object v4, v8

    check-cast v4, Ljava/util/List;

    .line 175
    nop

    .line 111
    .end local v0    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter\\1\\111":I
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 112
    .local v7, "sub":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v9, v0

    .line 113
    .local v9, "dir":Ljava/io/File;
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    :try_start_0
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 178
    .local v0, "$this$invokeSuspend_u24lambda_u241\\4":Lcom/pymcl/android/data/RepositoryUiApiExt;
    const/4 v14, 0x0

    .line 113
    .local v14, "$i$a$-runCatching-RepositoryUiApiExt$exportModpack$2$ids$1\\4\\113\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/RepositoryUiApiExt;->getTools()Lcom/pymcl/core/mods/ModTools;

    move-result-object v8

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/pymcl/core/mods/ModTools;->identifyDir$default(Lcom/pymcl/core/mods/ModTools;Ljava/io/File;ZZILjava/lang/Object;)Ljava/util/Map;

    move-result-object v8

    .end local v0    # "$this$invokeSuspend_u24lambda_u241\\4":Lcom/pymcl/android/data/RepositoryUiApiExt;
    .end local v14    # "$i$a$-runCatching-RepositoryUiApiExt$exportModpack$2$ids$1\\4\\113\\0":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v8

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v0, v8

    :cond_2
    check-cast v0, Ljava/util/Map;

    .line 114
    .local v0, "ids":Ljava/util/Map;
    move-object v8, v3

    check-cast v8, Ljava/util/Map;

    sget-object v10, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    invoke-virtual {v10, v7, v0, v9}, Lcom/pymcl/core/mods/ModpackExport;->remoteFrom(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/util/Map;

    move-result-object v10

    invoke-interface {v8, v10}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .end local v0    # "ids":Ljava/util/Map;
    .end local v7    # "sub":Ljava/lang/String;
    .end local v9    # "dir":Ljava/io/File;
    goto :goto_1

    .line 116
    :cond_3
    iget-object v0, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$name:Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v6, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$instance:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 178
    const/4 v0, 0x0

    .line 116
    .local v0, "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$safeName$1\\5\\116\\0":I
    invoke-static {v4, v6}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$inst(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$safeName$1\\5\\116\\0":I
    :cond_4
    check-cast v0, Ljava/lang/CharSequence;

    new-instance v4, Lkotlin/text/Regex;

    const-string v6, "[\\\\/:*?\"<>|]"

    invoke-direct {v4, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v6, "_"

    invoke-virtual {v4, v0, v6}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    .local v0, "safeName":Ljava/lang/String;
    new-instance v6, Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v4}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getPaths()Lcom/pymcl/core/config/LauncherPaths;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/core/config/LauncherPaths;->getRoot()Ljava/io/File;

    move-result-object v4

    iget-object v7, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$packVersion:Ljava/lang/String;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "exports/"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "-"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ".mrpack"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v4, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 118
    .local v6, "out":Ljava/io/File;
    sget-object v4, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    iget-object v7, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$name:Ljava/lang/String;

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 178
    const/4 v7, 0x0

    .line 118
    .local v7, "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$2\\6\\118\\0":I
    move-object v7, v0

    .end local v7    # "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$2\\6\\118\\0":I
    :cond_5
    check-cast v7, Ljava/lang/String;

    iget-object v8, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$packVersion:Ljava/lang/String;

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 178
    const/4 v8, 0x0

    .line 118
    .local v8, "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$3\\7\\118\\0":I
    nop

    .end local v8    # "$i$a$-ifBlank-RepositoryUiApiExt$exportModpack$2$3\\7\\118\\0":I
    const-string v8, "1.0.0"

    :cond_6
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lcom/pymcl/core/mods/LoaderDetect;->INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;

    invoke-virtual {v10, v2}, Lcom/pymcl/core/mods/LoaderDetect;->detect(Lcom/pymcl/core/version/ResolvedVersion;)Lkotlin/Pair;

    move-result-object v10

    iget-object v11, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$include:Ljava/util/List;

    move-object v12, v3

    check-cast v12, Ljava/util/Map;

    iget-object v13, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    new-instance v14, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2$$ExternalSyntheticLambda0;

    invoke-direct {v14, v13}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;)V

    const/16 v15, 0x100

    const/16 v16, 0x0

    const/4 v13, 0x0

    invoke-static/range {v4 .. v16}, Lcom/pymcl/core/mods/ModpackExport;->export$default(Lcom/pymcl/core/mods/ModpackExport;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .local v7, "nf":I
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 119
    .local v4, "no":I
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "mrpack exported: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " files="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " overrides="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "PyMCL"

    invoke-static {v9, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 120
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    return-object v8

    .line 108
    .end local v0    # "safeName":Ljava/lang/String;
    .end local v2    # "v":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v3    # "remote":Ljava/util/HashMap;
    .end local v4    # "no":I
    .end local v6    # "out":Ljava/io/File;
    .end local v7    # "nf":I
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApiExt$exportModpack$2;->$version:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u7248\u672c "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " \u4e0d\u5b58\u5728"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    .end local v5    # "gd":Ljava/io/File;
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "\u8bf7\u5148\u9009\u62e9\u8981\u5bfc\u51fa\u7684\u7248\u672c"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
