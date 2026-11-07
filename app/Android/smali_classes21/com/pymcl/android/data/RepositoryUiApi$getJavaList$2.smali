.class final Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApi;->getJavaList(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lcom/pymcl/android/ui/state/JavaRow;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getJavaList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1795#2,10:495\n2068#2:505\n2069#2:508\n1805#2:509\n1#3:506\n1#3:507\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi$getJavaList$2\n*L\n206#1:495,10\n206#1:505\n206#1:508\n206#1:509\n206#1:507\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/pymcl/android/ui/state/JavaRow;"
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
    c = "com.pymcl.android.data.RepositoryUiApi$getJavaList$2"
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
.field label:I

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    const/4 v0, 0x1

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-direct {v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->invoke(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/pymcl/android/ui/state/JavaRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 204
    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->label:I

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 205
    new-instance v1, Lcom/pymcl/runtime/RuntimeInstaller;

    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;->this$0:Lcom/pymcl/android/data/RepositoryUiApi;

    invoke-virtual {v2}, Lcom/pymcl/android/data/RepositoryUiApi;->getCtx$PyMCL_Android_app_debug()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/RuntimeInstaller;-><init>(Landroid/content/Context;)V

    .line 206
    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Integer;

    const/16 v2, 0x8

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/16 v2, 0x11

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const/4 v2, 0x2

    const/16 v5, 0x15

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v1, v2

    const/16 v2, 0x19

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v6, 0x3

    aput-object v2, v1, v6

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$mapNotNull\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 495
    .local v2, "$i$f$mapNotNull\\1\\206":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\2":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 504
    .local v8, "$i$f$mapNotNullTo\\2\\495":I
    move-object v9, v7

    .local v9, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 505
    .local v10, "$i$f$forEach\\3\\504":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\3":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element\\4":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 504
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\505\\2":I
    move-object v15, v13

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    .local v15, "m\\6":I
    const/16 v22, 0x0

    .line 207
    .local v22, "$i$a$-mapNotNull-RepositoryUiApi$getJavaList$2$1\\6\\504\\0":I
    new-instance v3, Ljava/io/File;

    sget-object v5, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "jre"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .local v3, "dir\\6":Ljava/io/File;
    new-instance v0, Ljava/io/File;

    const-string v4, "version"

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v4, v0

    .line 506
    .local v4, "it\\7":Ljava/io/File;
    const/4 v5, 0x0

    .line 208
    .local v5, "$i$a$-takeIf-RepositoryUiApi$getJavaList$2$1$ver$1\\7\\208\\6":I
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    .end local v4    # "it\\7":Ljava/io/File;
    .end local v5    # "$i$a$-takeIf-RepositoryUiApi$getJavaList$2$1$ver$1\\7\\208\\6":I
    const/4 v5, 0x0

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v5

    :goto_1
    if-eqz v0, :cond_4

    const/4 v4, 0x1

    invoke-static {v0, v5, v4, v5}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v18

    if-nez v18, :cond_1

    move/from16 v17, v15

    const/16 v23, 0x15

    goto :goto_4

    .line 209
    .local v18, "ver\\6":Ljava/lang/String;
    :cond_1
    new-instance v16, Lcom/pymcl/android/ui/state/JavaRow;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v5, "getAbsolutePath(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v5, 0x15

    if-ne v15, v5, :cond_2

    move/from16 v21, v4

    goto :goto_2

    :cond_2
    const/16 v21, 0x0

    :goto_2
    const-string v19, "PyMCL \u5185\u7f6e (FCL)"

    move-object/from16 v20, v0

    move/from16 v17, v15

    .end local v15    # "m\\6":I
    .local v17, "m\\6":I
    invoke-direct/range {v16 .. v21}, Lcom/pymcl/android/ui/state/JavaRow;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    move/from16 v23, v5

    move-object/from16 v5, v16

    goto :goto_4

    .line 208
    .end local v17    # "m\\6":I
    .end local v18    # "ver\\6":Ljava/lang/String;
    .restart local v15    # "m\\6":I
    :cond_3
    move/from16 v17, v15

    goto :goto_3

    :cond_4
    move/from16 v17, v15

    const/4 v4, 0x1

    :goto_3
    const/16 v23, 0x15

    .line 504
    .end local v3    # "dir\\6":Ljava/io/File;
    .end local v15    # "m\\6":I
    .end local v22    # "$i$a$-mapNotNull-RepositoryUiApi$getJavaList$2$1\\6\\504\\0":I
    :goto_4
    if-eqz v5, :cond_5

    .line 507
    .local v5, "it\\4":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 504
    .local v0, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\507\\4":I
    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 505
    .end local v0    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\507\\4":I
    .end local v5    # "it\\4":Ljava/lang/Object;
    .end local v13    # "element\\4":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\505\\2":I
    :cond_5
    const/4 v3, 0x0

    move-object/from16 v0, p0

    move/from16 v5, v23

    .end local v12    # "element\\3":Ljava/lang/Object;
    goto/16 :goto_0

    .line 508
    :cond_6
    nop

    .line 509
    .end local v9    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach\\3\\504":I
    nop

    .end local v6    # "destination\\2":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo\\2\\495":I
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 495
    nop

    .line 210
    .end local v1    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$mapNotNull\\1\\206":I
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
