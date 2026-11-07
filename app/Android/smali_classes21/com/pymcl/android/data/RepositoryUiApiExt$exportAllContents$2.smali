.class final Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApiExt.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->exportAllContents(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/pymcl/android/ui/state/ContentExportResult;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApiExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n3938#2:175\n4474#2,2:176\n1221#3:178\n1739#3:179\n1814#3,3:180\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApiExt.kt\ncom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2\n*L\n157#1:175\n157#1:176,2\n161#1:178\n161#1:179\n161#1:180,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/pymcl/android/ui/state/ContentExportResult;"
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
    c = "com.pymcl.android.data.RepositoryUiApiExt$exportAllContents$2"
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

.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method public static synthetic $r8$lambda$_NiW9laYy-I1n6nuAp90mbuv30g(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->invokeSuspend$lambda$3(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$kind:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$version:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$instance:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$3(Lkotlin/jvm/functions/Function2;FLjava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p1, "p"    # F
    .param p2, "n"    # Ljava/lang/String;

    .line 164
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p0, v0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$kind:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$version:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$instance:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/ContentExportResult;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 152
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 153
    sget-object v1, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$kind:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/pymcl/core/mods/ResKind$Companion;->of(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;

    move-result-object v1

    .line 154
    .local v1, "k":Lcom/pymcl/core/mods/ResKind;
    sget-object v2, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    if-eq v1, v2, :cond_a

    .line 155
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$version:Ljava/lang/String;

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "\u8bf7\u5148\u5728\u542f\u52a8\u9875\u9009\u62e9\u4e00\u4e2a\u5df2\u5b89\u88c5\u7684\u7248\u672c"

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 156
    :cond_1
    :goto_0
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v2

    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$instance:Ljava/lang/String;

    iget-object v5, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$version:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$gameDir(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    .line 157
    .local v2, "dir":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    new-array v3, v4, [Ljava/io/File;

    .local v3, "$this$filter\\1":[Ljava/lang/Object;
    :cond_2
    const/4 v5, 0x0

    .line 175
    .local v5, "$i$f$filter\\1\\157":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\2":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$filterTo\\2":[Ljava/lang/Object;
    const/4 v8, 0x0

    .line 176
    .local v8, "$i$f$filterTo\\2\\175":I
    array-length v9, v7

    move v10, v4

    :goto_1
    if-ge v10, v9, :cond_7

    aget-object v11, v7, v10

    .local v11, "element\\2":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "f\\3":Ljava/io/File;
    const/4 v13, 0x0

    .line 157
    .local v13, "$i$a$-filter-RepositoryUiApiExt$exportAllContents$2$names$1\\3\\176\\0":I
    sget-object v14, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/core/mods/ResKind;->ordinal()I

    move-result v15

    aget v14, v14, v15

    packed-switch v14, :pswitch_data_1

    .line 160
    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v14

    if-nez v14, :cond_4

    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    move-result v14

    if-eqz v14, :cond_3

    goto :goto_2

    .line 159
    :pswitch_1
    sget-object v14, Lcom/pymcl/core/mods/ModTools;->Companion:Lcom/pymcl/core/mods/ModTools$Companion;

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v14, v12}, Lcom/pymcl/core/mods/ModTools$Companion;->isModFile(Ljava/io/File;)Z

    move-result v14

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    goto :goto_4

    .line 158
    :pswitch_2
    invoke-virtual {v12}, Ljava/io/File;->isDirectory()Z

    move-result v14

    move-object/from16 v16, v1

    move-object/from16 v17, v3

    goto :goto_4

    .line 160
    :cond_3
    move-object/from16 v16, v1

    move-object/from16 v17, v3

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    const-string v15, "getName(...)"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x2

    move-object/from16 v16, v1

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .local v16, "k":Lcom/pymcl/core/mods/ResKind;
    const/4 v1, 0x0

    move-object/from16 v17, v3

    .end local v3    # "$this$filter\\1":[Ljava/lang/Object;
    .local v17, "$this$filter\\1":[Ljava/lang/Object;
    const-string v3, "."

    invoke-static {v14, v3, v4, v15, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    const/4 v14, 0x1

    goto :goto_4

    :cond_5
    :goto_3
    move v14, v4

    .line 161
    :goto_4
    nop

    .line 176
    .end local v12    # "f\\3":Ljava/io/File;
    .end local v13    # "$i$a$-filter-RepositoryUiApiExt$exportAllContents$2$names$1\\3\\176\\0":I
    if-eqz v14, :cond_6

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v11    # "element\\2":Ljava/lang/Object;
    :cond_6
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    goto :goto_1

    .line 177
    .end local v16    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v17    # "$this$filter\\1":[Ljava/lang/Object;
    .restart local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v3    # "$this$filter\\1":[Ljava/lang/Object;
    :cond_7
    move-object/from16 v16, v1

    move-object/from16 v17, v3

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v3    # "$this$filter\\1":[Ljava/lang/Object;
    .end local v6    # "destination\\2":Ljava/util/Collection;
    .end local v7    # "$this$filterTo\\2":[Ljava/lang/Object;
    .end local v8    # "$i$f$filterTo\\2\\175":I
    .restart local v16    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v17    # "$this$filter\\1":[Ljava/lang/Object;
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 175
    nop

    .end local v5    # "$i$f$filter\\1\\157":I
    .end local v17    # "$this$filter\\1":[Ljava/lang/Object;
    check-cast v1, Ljava/lang/Iterable;

    .line 161
    nop

    .local v1, "$this$sortedBy\\4":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 178
    .local v3, "$i$f$sortedBy\\4\\161":I
    new-instance v4, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$invokeSuspend$$inlined$sortedBy$1;

    invoke-direct {v4}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$invokeSuspend$$inlined$sortedBy$1;-><init>()V

    check-cast v4, Ljava/util/Comparator;

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .end local v1    # "$this$sortedBy\\4":Ljava/lang/Iterable;
    .end local v3    # "$i$f$sortedBy\\4\\161":I
    check-cast v1, Ljava/lang/Iterable;

    .line 161
    nop

    .local v1, "$this$map\\5":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 179
    .local v3, "$i$f$map\\5\\161":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\6":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo\\6":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 180
    .local v6, "$i$f$mapTo\\6\\179":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 181
    .local v8, "item\\6":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/io/File;

    .local v9, "it\\7":Ljava/io/File;
    const/4 v10, 0x0

    .line 161
    .local v10, "$i$a$-map-RepositoryUiApiExt$exportAllContents$2$names$3\\7\\181\\0":I
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    .line 181
    .end local v9    # "it\\7":Ljava/io/File;
    .end local v10    # "$i$a$-map-RepositoryUiApiExt$exportAllContents$2$names$3\\7\\181\\0":I
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 182
    .end local v8    # "item\\6":Ljava/lang/Object;
    :cond_8
    nop

    .end local v4    # "destination\\6":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\6":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\6\\179":I
    check-cast v4, Ljava/util/List;

    .line 179
    nop

    .line 161
    .end local v1    # "$this$map\\5":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\5\\161":I
    nop

    .line 157
    nop

    .line 162
    .local v4, "names":Ljava/util/List;
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 163
    new-instance v1, Ljava/io/File;

    iget-object v3, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-static {v3}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApiExt;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/android/data/LauncherRepository;->getPaths()Lcom/pymcl/core/config/LauncherPaths;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/core/config/LauncherPaths;->getExportsDir()Ljava/io/File;

    move-result-object v3

    sget-object v5, Lcom/pymcl/core/mods/ContentExport;->INSTANCE:Lcom/pymcl/core/mods/ContentExport;

    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/core/mods/ResKind;->name()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "toLowerCase(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    iget-object v8, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$instance:Ljava/lang/String;

    invoke-static {v7, v8}, Lcom/pymcl/android/data/RepositoryUiApiExt;->access$inst(Lcom/pymcl/android/data/RepositoryUiApiExt;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v7

    invoke-virtual {v7}, Lcom/pymcl/core/instance/Instance;->getName()Ljava/lang/String;

    move-result-object v7

    iget-object v8, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$version:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Lcom/pymcl/core/mods/ContentExport;->defaultName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v3, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 164
    .local v1, "out":Ljava/io/File;
    sget-object v3, Lcom/pymcl/core/mods/ContentExport;->INSTANCE:Lcom/pymcl/core/mods/ContentExport;

    iget-object v5, v0, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2;->$onProgress:Lkotlin/jvm/functions/Function2;

    new-instance v6, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$$ExternalSyntheticLambda0;

    invoke-direct {v6, v5}, Lcom/pymcl/android/data/RepositoryUiApiExt$exportAllContents$2$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v3, v2, v4, v1, v6}, Lcom/pymcl/core/mods/ContentExport;->exportZip(Ljava/io/File;Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function2;)Lcom/pymcl/core/mods/ContentExport$Result;

    move-result-object v3

    .line 165
    .local v3, "r":Lcom/pymcl/core/mods/ContentExport$Result;
    new-instance v5, Lcom/pymcl/android/ui/state/ContentExportResult;

    invoke-virtual {v3}, Lcom/pymcl/core/mods/ContentExport$Result;->getOut()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string v7, "getAbsolutePath(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/pymcl/core/mods/ContentExport$Result;->getOk()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v3}, Lcom/pymcl/core/mods/ContentExport$Result;->getFailed()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    sget-object v9, Lcom/pymcl/core/mods/ContentExport;->INSTANCE:Lcom/pymcl/core/mods/ContentExport;

    invoke-virtual {v9, v3}, Lcom/pymcl/core/mods/ContentExport;->summary(Lcom/pymcl/core/mods/ContentExport$Result;)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v5, v6, v7, v8, v9}, Lcom/pymcl/android/ui/state/ContentExportResult;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    return-object v5

    .line 162
    .end local v1    # "out":Ljava/io/File;
    .end local v3    # "r":Lcom/pymcl/core/mods/ContentExport$Result;
    :cond_9
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "\u8fd9\u4e2a\u5b9e\u4f8b\u91cc\u8fd8\u6ca1\u6709\u53ef\u5bfc\u51fa\u7684\u5185\u5bb9"

    invoke-direct {v1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 154
    .end local v2    # "dir":Ljava/io/File;
    .end local v4    # "names":Ljava/util/List;
    .end local v16    # "k":Lcom/pymcl/core/mods/ResKind;
    .local v1, "k":Lcom/pymcl/core/mods/ResKind;
    :cond_a
    move-object/from16 v16, v1

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .restart local v16    # "k":Lcom/pymcl/core/mods/ResKind;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "\u6574\u5408\u5305\u6ca1\u6709\u53ef\u5bfc\u51fa\u7684\u5df2\u88c5\u6587\u4ef6\uff0c\u8bf7\u5728\u5b9e\u4f8b\u9875\u7528\u300c\u5bfc\u51fa\u4e3a\u6574\u5408\u5305\u300d"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
