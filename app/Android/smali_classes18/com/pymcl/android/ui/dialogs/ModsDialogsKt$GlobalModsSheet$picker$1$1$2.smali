.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->GlobalModsSheet(Lcom/pymcl/android/ui/state/AppState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
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
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1739#2:307\n1814#2,3:308\n1739#2:312\n1814#2,3:313\n1#3:311\n*S KotlinDebug\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2\n*L\n215#1:307\n215#1:308,3\n216#1:312\n216#1:313,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "<unused var>",
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
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$GlobalModsSheet$picker$1$1$2"
    f = "ModsDialogs.kt"
    i = {
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1
    }
    l = {
        0xd6,
        0xd8
    }
    m = "invokeSuspend"
    n = {
        "files",
        "$this$map\\6",
        "$this$mapTo\\7",
        "destination\\7",
        "item\\7",
        "it\\8"
    }
    nl = {
        0xd7,
        0x13a
    }
    s = {
        "L$0",
        "L$1",
        "L$3",
        "L$4",
        "L$6",
        "L$7"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

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

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Ljava/util/List;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;",
            "Landroid/content/Context;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

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

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;-><init>(Ljava/util/List;Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->invoke(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v0, p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 213
    iget v2, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->label:I

    const-string v3, "\u3001"

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    :pswitch_0
    const/4 v2, 0x0

    .local v2, "$i$f$map\\6\\216":I
    const/4 v4, 0x0

    .local v4, "$i$f$mapTo\\7\\312":I
    const/4 v5, 0x0

    .local v5, "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$4\\8\\314\\0":I
    iget-object v6, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$8:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$7:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    .local v7, "it\\8":Ljava/io/File;
    iget-object v8, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$6:Ljava/lang/Object;

    .local v8, "item\\7":Ljava/lang/Object;
    iget-object v9, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$5:Ljava/lang/Object;

    check-cast v9, Ljava/util/Iterator;

    iget-object v10, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\7":Ljava/util/Collection;
    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$mapTo\\7":Ljava/lang/Iterable;
    iget-object v12, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$2:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/android/ui/state/AppState;

    iget-object v13, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$1:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$map\\6":Ljava/lang/Iterable;
    iget-object v14, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    check-cast v14, Ljava/util/List;

    .local v14, "files":Ljava/util/List;
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v3

    move-object v15, v14

    move-object v3, v0

    move-object v14, v13

    move-object/from16 v0, p1

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object v9, v8

    move-object v8, v10

    move-object v10, v7

    move v7, v2

    move-object v2, v1

    move-object v1, v0

    goto/16 :goto_3

    .end local v2    # "$i$f$map\\6\\216":I
    .end local v4    # "$i$f$mapTo\\7\\312":I
    .end local v5    # "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$4\\8\\314\\0":I
    .end local v7    # "it\\8":Ljava/io/File;
    .end local v8    # "item\\7":Ljava/lang/Object;
    .end local v10    # "destination\\7":Ljava/util/Collection;
    .end local v11    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v13    # "$this$map\\6":Ljava/lang/Iterable;
    .end local v14    # "files":Ljava/util/List;
    :pswitch_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_0

    :pswitch_2
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 214
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v2

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2$files$1;

    iget-object v6, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$uris:Ljava/util/List;

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$ctx:Landroid/content/Context;

    invoke-direct {v5, v6, v7, v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2$files$1;-><init>(Ljava/util/List;Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    move-object v6, v0

    check-cast v6, Lkotlin/coroutines/Continuation;

    const/4 v7, 0x1

    iput v7, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->label:I

    invoke-static {v2, v5, v6}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_0

    .line 213
    return-object v1

    :cond_0
    :goto_0
    check-cast v2, Ljava/util/List;

    .line 215
    .local v2, "files":Ljava/util/List;
    sget-object v5, Lcom/pymcl/android/ui/state/CatalogRules;->INSTANCE:Lcom/pymcl/android/ui/state/CatalogRules;

    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 307
    .local v7, "$i$f$map\\1\\215":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v6, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\2":Ljava/util/Collection;
    move-object v10, v6

    .local v10, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 308
    .local v11, "$i$f$mapTo\\2\\307":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 309
    .local v13, "item\\2":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/io/File;

    .local v14, "it\\3":Ljava/io/File;
    const/4 v15, 0x0

    .line 215
    .local v15, "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$1\\3\\309\\0":I
    invoke-virtual {v14}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    .line 309
    .end local v14    # "it\\3":Ljava/io/File;
    .end local v15    # "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$1\\3\\309\\0":I
    invoke-interface {v8, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 310
    .end local v13    # "item\\2":Ljava/lang/Object;
    :cond_1
    nop

    .end local v8    # "destination\\2":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo\\2\\307":I
    check-cast v8, Ljava/util/List;

    .line 307
    nop

    .line 215
    .end local v6    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map\\1\\215":I
    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v5, v8}, Lcom/pymcl/android/ui/state/CatalogRules;->nonJars(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    .line 311
    .local v6, "it\\4":Ljava/util/List;
    const/4 v7, 0x0

    .line 215
    .local v7, "$i$a$-takeIf-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$2\\4\\215\\0":I
    move-object v8, v6

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    .end local v6    # "it\\4":Ljava/util/List;
    .end local v7    # "$i$a$-takeIf-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$2\\4\\215\\0":I
    if-nez v8, :cond_2

    move-object v4, v5

    :cond_2
    if-nez v4, :cond_5

    .line 216
    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$map\\6":Ljava/lang/Iterable;
    iget-object v5, v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    const/4 v6, 0x0

    .line 312
    .local v6, "$i$f$map\\6\\216":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination\\7":Ljava/util/Collection;
    move-object v8, v4

    .local v8, "$this$mapTo\\7":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 313
    .local v9, "$i$f$mapTo\\7\\312":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v14, v2

    move-object v13, v4

    move-object v12, v5

    move-object v11, v8

    move v4, v9

    move-object v9, v10

    move-object v5, v0

    move-object v2, v1

    move-object/from16 v1, p1

    .end local v2    # "files":Ljava/util/List;
    .end local v8    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapTo\\7\\312":I
    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .end local p1    # "$result":Ljava/lang/Object;
    .local v1, "$result":Ljava/lang/Object;
    .local v4, "$i$f$mapTo\\7\\312":I
    .local v5, "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .local v11, "$this$mapTo\\7":Ljava/lang/Iterable;
    .local v13, "$this$map\\6":Ljava/lang/Iterable;
    .local v14, "files":Ljava/util/List;
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 314
    .local v8, "item\\7":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Ljava/io/File;

    .local v10, "it\\8":Ljava/io/File;
    const/4 v15, 0x0

    .line 216
    .local v15, "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$4\\8\\314\\0":I
    invoke-virtual {v12}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v16

    .restart local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    invoke-static/range {v16 .. v16}, Lcom/pymcl/android/ui/state/LauncherUiApiKt;->getExt8(Lcom/pymcl/android/ui/state/LauncherUiApi;)Lcom/pymcl/android/ui/state/LauncherUiApiExt8;

    move-result-object v0

    move-object/from16 p1, v1

    .end local v1    # "$result":Ljava/lang/Object;
    .restart local p1    # "$result":Ljava/lang/Object;
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v3

    const-string v3, "getAbsolutePath(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$0:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$1:Ljava/lang/Object;

    iput-object v12, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$2:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$3:Ljava/lang/Object;

    iput-object v7, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$4:Ljava/lang/Object;

    iput-object v9, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$5:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$6:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$7:Ljava/lang/Object;

    iput-object v7, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->L$8:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v5, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;->label:I

    invoke-interface {v0, v1, v5}, Lcom/pymcl/android/ui/state/LauncherUiApiExt8;->importGlobalMod(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    .line 213
    .end local p0    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    return-object v2

    .line 216
    :cond_3
    move-object/from16 v1, p1

    move-object v3, v5

    move v5, v15

    move-object v15, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v9

    move-object v9, v8

    move-object v8, v7

    move v7, v6

    move-object v6, v8

    .end local v6    # "$i$f$map\\6\\216":I
    .end local v11    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v13    # "$this$map\\6":Ljava/lang/Iterable;
    .end local p1    # "$result":Ljava/lang/Object;
    .restart local v1    # "$result":Ljava/lang/Object;
    .local v3, "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .local v5, "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$4\\8\\314\\0":I
    .local v7, "$i$f$map\\6\\216":I
    .local v8, "destination\\7":Ljava/util/Collection;
    .local v9, "item\\7":Ljava/lang/Object;
    .local v12, "$this$mapTo\\7":Ljava/lang/Iterable;
    .local v14, "$this$map\\6":Ljava/lang/Iterable;
    .local v15, "files":Ljava/util/List;
    :goto_3
    check-cast v0, Ljava/lang/String;

    .line 314
    .end local v5    # "$i$a$-map-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$4\\8\\314\\0":I
    .end local v10    # "it\\8":Ljava/io/File;
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object v5, v3

    move v6, v7

    move-object v7, v8

    move-object v9, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v3, v16

    goto :goto_2

    .line 315
    .end local v3    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .end local v8    # "destination\\7":Ljava/util/Collection;
    .end local v9    # "item\\7":Ljava/lang/Object;
    .end local v12    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .end local v15    # "files":Ljava/util/List;
    .local v5, "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .restart local v6    # "$i$f$map\\6\\216":I
    .local v7, "destination\\7":Ljava/util/Collection;
    .restart local v11    # "$this$mapTo\\7":Ljava/lang/Iterable;
    .restart local v13    # "$this$map\\6":Ljava/lang/Iterable;
    .local v14, "files":Ljava/util/List;
    :cond_4
    move-object/from16 v16, v3

    .end local v4    # "$i$f$mapTo\\7\\312":I
    .end local v7    # "destination\\7":Ljava/util/Collection;
    .end local v11    # "$this$mapTo\\7":Ljava/lang/Iterable;
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 312
    nop

    .end local v6    # "$i$f$map\\6\\216":I
    .end local v13    # "$this$map\\6":Ljava/lang/Iterable;
    move-object/from16 v17, v0

    check-cast v17, Ljava/lang/Iterable;

    .line 216
    move-object/from16 v18, v16

    check-cast v18, Ljava/lang/CharSequence;

    const/16 v24, 0x3e

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v17 .. v25}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 215
    .end local v1    # "$result":Ljava/lang/Object;
    .end local v5    # "this":Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$GlobalModsSheet$picker$1$1$2;
    .end local v14    # "files":Ljava/util/List;
    .restart local v2    # "files":Ljava/util/List;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_5
    move-object/from16 v16, v3

    .line 311
    .local v4, "it\\5":Ljava/util/List;
    const/4 v0, 0x0

    .line 215
    .local v0, "$i$a$-let-ModsDialogsKt$GlobalModsSheet$picker$1$1$2$3\\5\\215\\0":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    move-object/from16 v6, v16

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v5, "\u53ea\u80fd\u5bfc\u5165 .jar \u6a21\u7ec4\uff1a{0}"

    invoke-static {v5, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
