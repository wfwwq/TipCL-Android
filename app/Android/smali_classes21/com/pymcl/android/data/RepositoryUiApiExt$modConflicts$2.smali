.class final Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->modConflicts(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/util/List<",
        "+",
        "Lcom/pymcl/android/ui/state/ConflictRow;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1#2:175\n1739#3:176\n1814#3,3:177\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2\n*L\n171#1:176\n171#1:177,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/ConflictRow;"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$modConflicts$2"
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

.field final synthetic $version:Ljava/lang/String;

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$instance:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$version:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$instance:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$version:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ConflictRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 168
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 169
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v1}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$instance:Ljava/lang/String;

    iget-object v5, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$version:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 170
    .local v1, "dir":Ljava/io/File;
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$instance:Ljava/lang/String;

    iget-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$modConflicts$2;->$version:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$resolved(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v2

    .local v2, "v":Lcom/pymcl/core/version/ResolvedVersion;
    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v4, v2

    .line 175
    .local v4, "it\\1":Lcom/pymcl/core/version/ResolvedVersion;
    const/4 v5, 0x0

    .line 170
    .local v5, "$i$a$-let-RepositoryUiApiExt$modConflicts$2$lt$1\\1\\170\\0":I
    sget-object v6, Lcom/pymcl/core/mods/LoaderDetect;->INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;

    invoke-virtual {v6, v4}, Lcom/pymcl/core/mods/LoaderDetect;->detect(Lcom/pymcl/core/version/ResolvedVersion;)Lkotlin/Pair;

    move-result-object v4

    .end local v4    # "it\\1":Lcom/pymcl/core/version/ResolvedVersion;
    .end local v5    # "$i$a$-let-RepositoryUiApiExt$modConflicts$2$lt$1\\1\\170\\0":I
    goto :goto_0

    :cond_0
    move-object v4, v3

    .line 171
    .local v4, "lt":Lkotlin/Pair;
    :goto_0
    sget-object v5, Lcom/pymcl/core/mods/ModConflicts;->INSTANCE:Lcom/pymcl/core/mods/ModConflicts;

    const-string v6, ""

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/pymcl/core/version/ResolvedVersion;->getMcVersion()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    :cond_1
    move-object v7, v6

    :cond_2
    sget-object v8, Lcom/pymcl/core/mods/LoaderDetect;->INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pymcl/core/loader/LoaderType;

    :cond_3
    invoke-virtual {v8, v3}, Lcom/pymcl/core/mods/LoaderDetect;->catalogName(Lcom/pymcl/core/loader/LoaderType;)Ljava/lang/String;

    move-result-object v3

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_4

    goto :goto_1

    :cond_4
    move-object v6, v8

    :cond_5
    :goto_1
    invoke-virtual {v5, v1, v7, v3, v6}, Lcom/pymcl/core/mods/ModConflicts;->scanDir(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/mods/ConflictReport;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/core/mods/ConflictReport;->getIssues()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 176
    .local v5, "$i$f$map\\2\\171":I
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\3":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 177
    .local v8, "$i$f$mapTo\\3\\176":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 178
    .local v10, "item\\3":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/mods/ConflictIssue;

    .local v11, "it\\4":Lcom/pymcl/core/mods/ConflictIssue;
    const/4 v12, 0x0

    .line 171
    .local v12, "$i$a$-map-RepositoryUiApiExt$modConflicts$2$1\\4\\178\\0":I
    new-instance v13, Lcom/pymcl/android/ui/state/ConflictRow;

    invoke-virtual {v11}, Lcom/pymcl/core/mods/ConflictIssue;->getType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Lcom/pymcl/core/mods/ConflictIssue;->getFile()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v11}, Lcom/pymcl/core/mods/ConflictIssue;->getDetail()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v13, v14, v15, v0}, Lcom/pymcl/android/ui/state/ConflictRow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    .end local v11    # "it\\4":Lcom/pymcl/core/mods/ConflictIssue;
    .end local v12    # "$i$a$-map-RepositoryUiApiExt$modConflicts$2$1\\4\\178\\0":I
    invoke-interface {v6, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto :goto_2

    .line 179
    .end local v10    # "item\\3":Ljava/lang/Object;
    :cond_6
    nop

    .end local v6    # "destination\\3":Ljava/util/Collection;
    .end local v7    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo\\3\\176":I
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 176
    nop

    .line 171
    .end local v3    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$map\\2\\171":I
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
