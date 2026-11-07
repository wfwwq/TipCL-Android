.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->ModsSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Mods;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "Ljava/lang/Float;",
        "-",
        "Ljava/lang/String;",
        "+",
        "Lkotlin/Unit;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/lang/String;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1739#2:307\n1814#2,3:308\n2077#2,3:312\n1#3:311\n*S KotlinDebug\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2\n*L\n107#1:307\n107#1:308,3\n109#1:312,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "p",
        "Lkotlin/Function2;",
        "",
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$picker$1$1$2"
    f = "ModsDialogs.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x6a,
        0x6f
    }
    m = "invokeSuspend"
    n = {
        "p",
        "p",
        "files",
        "out",
        "$this$forEachIndexed\\6",
        "item\\6",
        "f\\7",
        "index\\6",
        "i\\7"
    }
    nl = {
        0x6b,
        0x70
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$8",
        "L$9",
        "I$0",
        "I$1"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $uris:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $v:Ljava/lang/String;

.field I$0:I

.field I$1:I

.field synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$inst:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$v:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$inst:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$v:Ljava/lang/String;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;-><init>(Ljava/util/List;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/functions/Function2;

    .local v1, "p":Lkotlin/jvm/functions/Function2;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 105
    iget v3, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->label:I

    const/4 v4, 0x0

    packed-switch v3, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    :pswitch_0
    const/4 v3, 0x0

    .local v3, "$i$f$forEachIndexed\\6\\109":I
    const/4 v4, 0x0

    .local v4, "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    iget v5, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->I$1:I

    .local v5, "i\\7":I
    iget v6, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->I$0:I

    .local v6, "index\\6":I
    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$10:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$9:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    .local v8, "f\\7":Ljava/io/File;
    iget-object v9, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$8:Ljava/lang/Object;

    .local v9, "item\\6":Ljava/lang/Object;
    iget-object v10, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$7:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    iget-object v13, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$4:Ljava/lang/Object;

    check-cast v13, Lcom/pymcl/android/ui/state/AppState;

    iget-object v14, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$3:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    iget-object v15, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$2:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    move/from16 v16, v3

    .end local v3    # "$i$f$forEachIndexed\\6\\109":I
    .local v15, "out":Ljava/util/List;
    .local v16, "$i$f$forEachIndexed\\6\\109":I
    iget-object v3, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    .local v3, "files":Ljava/util/List;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v22, v6

    move-object v6, v10

    move-object/from16 v17, v11

    move-object/from16 v10, p1

    move-object v11, v0

    move-object v0, v3

    move-object v3, v2

    move-object v2, v1

    move-object v1, v10

    goto/16 :goto_3

    .end local v3    # "files":Ljava/util/List;
    .end local v4    # "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    .end local v5    # "i\\7":I
    .end local v6    # "index\\6":I
    .end local v8    # "f\\7":Ljava/io/File;
    .end local v9    # "item\\6":Ljava/lang/Object;
    .end local v14    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .end local v15    # "out":Ljava/util/List;
    .end local v16    # "$i$f$forEachIndexed\\6\\109":I
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v3

    check-cast v3, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2$files$1;

    iget-object v6, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    invoke-direct {v5, v6, v7, v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2$files$1;-><init>(Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput-object v1, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->label:I

    invoke-static {v3, v5, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_0

    .line 105
    return-object v2

    :cond_0
    :goto_0
    check-cast v3, Ljava/util/List;

    .line 107
    .restart local v3    # "files":Ljava/util/List;
    sget-object v5, Lcom/pymcl/android/ui/state/CatalogRules;->INSTANCE:Lcom/pymcl/android/ui/state/CatalogRules;

    move-object v6, v3

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 307
    .local v7, "$i$f$map\\1\\107":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\2":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 308
    .local v10, "$i$f$mapTo\\2\\307":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 309
    .local v12, "item\\2":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/io/File;

    .local v13, "it\\3":Ljava/io/File;
    const/4 v14, 0x0

    .line 107
    .local v14, "$i$a$-map-ModsDialogsKt$ModsSheet$picker$1$1$2$1\\3\\309\\0":I
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    .line 309
    .end local v13    # "it\\3":Ljava/io/File;
    .end local v14    # "$i$a$-map-ModsDialogsKt$ModsSheet$picker$1$1$2$1\\3\\309\\0":I
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 310
    .end local v12    # "item\\2":Ljava/lang/Object;
    :cond_1
    nop

    .end local v8    # "destination\\2":Ljava/util/Collection;
    .end local v9    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo\\2\\307":I
    check-cast v8, Ljava/util/List;

    .line 307
    nop

    .line 107
    .end local v6    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\1\\107":I
    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v5, v8}, Lcom/pymcl/android/ui/state/CatalogRules;->nonJars(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    .line 311
    .local v6, "it\\4":Ljava/util/List;
    const/4 v7, 0x0

    .line 107
    .local v7, "$i$a$-takeIf-ModsDialogsKt$ModsSheet$picker$1$1$2$2\\4\\107\\0":I
    move-object v8, v6

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    .end local v6    # "it\\4":Ljava/util/List;
    .end local v7    # "$i$a$-takeIf-ModsDialogsKt$ModsSheet$picker$1$1$2$2\\4\\107\\0":I
    if-nez v8, :cond_2

    move-object v4, v5

    :cond_2
    if-nez v4, :cond_6

    .line 108
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 109
    .local v4, "out":Ljava/util/List;
    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    iget-object v6, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$inst:Ljava/lang/String;

    iget-object v8, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->$v:Ljava/lang/String;

    const/4 v9, 0x0

    .line 312
    .local v9, "$i$f$forEachIndexed\\6\\109":I
    const/4 v10, 0x0

    .line 313
    .local v10, "index\\6":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move-object v12, v7

    move-object v13, v8

    move-object v8, v4

    move-object v7, v5

    move-object v5, v11

    move-object v11, v0

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v3    # "files":Ljava/util/List;
    .end local v5    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v2, "p":Lkotlin/jvm/functions/Function2;
    .local v4, "files":Ljava/util/List;
    .local v7, "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .local v8, "out":Ljava/util/List;
    .local v11, "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "item\\6":Ljava/lang/Object;
    add-int/lit8 v14, v10, 0x1

    .end local v10    # "index\\6":I
    .local v14, "index\\6":I
    if-gez v10, :cond_3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_3
    move-object/from16 v20, v19

    check-cast v20, Ljava/io/File;

    .local v10, "i\\7":I
    .local v20, "f\\7":Ljava/io/File;
    const/16 v21, 0x0

    .line 110
    .local v21, "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    int-to-float v15, v10

    .restart local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v15, v0

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/Boxing;->boxFloat(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    move-object/from16 p1, v1

    .end local v1    # "$result":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    const-string v1, "getName(...)"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v0, v15}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    move-object v0, v8

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v15

    move-object/from16 v16, v1

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    iput-object v4, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$1:Ljava/lang/Object;

    iput-object v8, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$2:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$3:Ljava/lang/Object;

    iput-object v6, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$4:Ljava/lang/Object;

    iput-object v12, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$5:Ljava/lang/Object;

    iput-object v13, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$6:Ljava/lang/Object;

    iput-object v5, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$7:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$8:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$9:Ljava/lang/Object;

    iput-object v0, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->L$10:Ljava/lang/Object;

    iput v14, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->I$0:I

    iput v10, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->I$1:I

    const/4 v1, 0x2

    iput v1, v11, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;->label:I

    move v1, v10

    move-object/from16 v10, v16

    move-object/from16 v16, v11

    .end local v10    # "i\\7":I
    .end local v11    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    .local v1, "i\\7":I
    .local v16, "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    const-string v11, "mod"

    move/from16 v17, v14

    move-object v14, v15

    .end local v14    # "index\\6":I
    .local v17, "index\\6":I
    const/4 v15, 0x0

    move/from16 v18, v17

    .end local v17    # "index\\6":I
    .local v18, "index\\6":I
    const/16 v17, 0x10

    move/from16 v22, v18

    .end local v18    # "index\\6":I
    .local v22, "index\\6":I
    const/16 v18, 0x0

    invoke-static/range {v10 .. v18}, Lcom/pymcl/android/ui/state/LauncherUiApi;->importLocalFile$default(Lcom/pymcl/android/ui/state/LauncherUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_4

    .line 105
    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    return-object v3

    .line 111
    :cond_4
    move-object v14, v7

    move-object v15, v8

    move-object/from16 v17, v13

    move-object/from16 v11, v16

    move-object/from16 v8, v20

    move-object v7, v0

    move-object v0, v4

    move-object v13, v6

    move/from16 v16, v9

    move-object/from16 v9, v19

    move/from16 v4, v21

    move-object v6, v5

    move v5, v1

    move-object/from16 v1, p1

    .end local v7    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .end local v19    # "item\\6":Ljava/lang/Object;
    .end local v20    # "f\\7":Ljava/io/File;
    .end local v21    # "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    .end local p1    # "$result":Ljava/lang/Object;
    .local v0, "files":Ljava/util/List;
    .local v1, "$result":Ljava/lang/Object;
    .local v4, "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    .local v5, "i\\7":I
    .local v8, "f\\7":Ljava/io/File;
    .local v9, "item\\6":Ljava/lang/Object;
    .restart local v11    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    .local v14, "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .restart local v15    # "out":Ljava/util/List;
    .local v16, "$i$f$forEachIndexed\\6\\109":I
    :goto_3
    invoke-interface {v7, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 112
    nop

    .line 313
    .end local v4    # "$i$a$-forEachIndexed-ModsDialogsKt$ModsSheet$picker$1$1$2$4\\7\\313\\0":I
    .end local v5    # "i\\7":I
    .end local v8    # "f\\7":Ljava/io/File;
    .end local v9    # "item\\6":Ljava/lang/Object;
    move-object v4, v0

    move-object v5, v6

    move-object v6, v13

    move-object v7, v14

    move-object v8, v15

    move/from16 v9, v16

    move-object/from16 v13, v17

    move/from16 v10, v22

    move-object/from16 v0, p0

    goto/16 :goto_2

    .line 314
    .end local v0    # "files":Ljava/util/List;
    .end local v14    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .end local v15    # "out":Ljava/util/List;
    .end local v16    # "$i$f$forEachIndexed\\6\\109":I
    .end local v22    # "index\\6":I
    .local v4, "files":Ljava/util/List;
    .restart local v7    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .local v8, "out":Ljava/util/List;
    .local v9, "$i$f$forEachIndexed\\6\\109":I
    .local v10, "index\\6":I
    :cond_5
    move-object/from16 p1, v1

    .line 113
    .end local v1    # "$result":Ljava/lang/Object;
    .end local v7    # "$this$forEachIndexed\\6":Ljava/lang/Iterable;
    .end local v9    # "$i$f$forEachIndexed\\6\\109":I
    .end local v10    # "index\\6":I
    .restart local p1    # "$result":Ljava/lang/Object;
    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "{0} \u4e2a\u6a21\u7ec4"

    invoke-static {v1, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 311
    .end local v2    # "p":Lkotlin/jvm/functions/Function2;
    .end local v8    # "out":Ljava/util/List;
    .end local v11    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$picker$1$1$2;
    .local v1, "p":Lkotlin/jvm/functions/Function2;
    .restart local v3    # "files":Ljava/util/List;
    .local v4, "it\\5":Ljava/util/List;
    :cond_6
    const/4 v0, 0x0

    .line 107
    .local v0, "$i$a$-let-ModsDialogsKt$ModsSheet$picker$1$1$2$3\\5\\107\\0":I
    new-instance v2, Ljava/lang/IllegalArgumentException;

    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    const-string v6, "\u3001"

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "\u53ea\u80fd\u5bfc\u5165 .jar \u6a21\u7ec4\uff1a{0}"

    invoke-static {v6, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
