.class public final Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
.super Ljava/lang/Object;
.source "SaveDropTarget.kt"

# interfaces
.implements Landroidx/compose/ui/draganddrop/DragAndDropTarget;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt;->saveDropTarget(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1#2:59\n1#2:71\n1795#3,10:60\n2068#3:70\n2069#3:72\n1805#3:73\n1960#3,3:74\n*S KotlinDebug\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1\n*L\n47#1:71\n47#1:60,10\n47#1:70\n47#1:72\n47#1:73\n50#1:74,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1",
        "Landroidx/compose/ui/draganddrop/DragAndDropTarget;",
        "onEntered",
        "",
        "event",
        "Landroidx/compose/ui/draganddrop/DragAndDropEvent;",
        "onExited",
        "onEnded",
        "onDrop",
        "",
        "PyMCL-Android:app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $err:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $hover:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $uris:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/content/Context;)V
    .locals 0
    .param p1, "$hover"    # Landroidx/compose/runtime/State;
    .param p2, "$err"    # Landroidx/compose/runtime/State;
    .param p3, "$uris"    # Landroidx/compose/runtime/State;
    .param p4, "$ctx"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lkotlin/Unit;",
            ">;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$hover:Landroidx/compose/runtime/State;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$err:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$uris:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$ctx:Landroid/content/Context;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge onChanged(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    .line 38
    invoke-super {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropTarget;->onChanged(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    return-void
.end method

.method public onDrop(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z
    .locals 20
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    move-object/from16 v1, p0

    const-string v0, "event"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$hover:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    invoke-static {v2}, Landroidx/compose/ui/draganddrop/DragAndDrop_androidKt;->toAndroidDragEvent(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Landroid/view/DragEvent;

    move-result-object v4

    .line 45
    .local v4, "de":Landroid/view/DragEvent;
    invoke-virtual {v4}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    move-result-object v0

    const-string v5, "\u62d6\u8fdb\u6765\u7684\u4e0d\u662f\u6587\u4ef6"

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$err:Landroidx/compose/runtime/State;

    move-object v6, v1

    check-cast v6, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;

    .line 59
    .local v6, "$this$onDrop_u24lambda_u240\\1":Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
    const/4 v7, 0x0

    .line 45
    .local v7, "$i$a$-run-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$clip$1\\1\\45\\0":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v5, v8}, Lcom/pymcl/android/ui/dialogs/SavesStringsKt;->st(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v3

    .end local v6    # "$this$onDrop_u24lambda_u240\\1":Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
    .end local v7    # "$i$a$-run-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$clip$1\\1\\45\\0":I
    :cond_0
    move-object v6, v0

    .line 46
    .local v6, "clip":Landroid/content/ClipData;
    iget-object v0, v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$ctx:Landroid/content/Context;

    const/4 v7, 0x0

    :try_start_0
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, v1

    check-cast v8, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;

    .line 59
    .local v8, "$this$onDrop_u24lambda_u241\\2":Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
    const/4 v9, 0x0

    .line 46
    .local v9, "$i$a$-runCatching-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$perms$1\\2\\46\\0":I
    invoke-static {v0}, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt;->access$findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v4}, Landroid/app/Activity;->requestDragAndDropPermissions(Landroid/view/DragEvent;)Landroid/view/DragAndDropPermissions;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v7

    .end local v8    # "$this$onDrop_u24lambda_u241\\2":Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
    .end local v9    # "$i$a$-runCatching-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$perms$1\\2\\46\\0":I
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_2

    :cond_2
    move-object v7, v0

    :goto_2
    move-object v0, v7

    check-cast v0, Landroid/view/DragAndDropPermissions;

    .line 47
    .local v0, "perms":Landroid/view/DragAndDropPermissions;
    invoke-virtual {v6}, Landroid/content/ClipData;->getItemCount()I

    move-result v7

    invoke-static {v3, v7}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$mapNotNull\\3":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 60
    .local v8, "$i$f$mapNotNull\\3\\47":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination\\4":Ljava/util/Collection;
    move-object v10, v7

    .local v10, "$this$mapNotNullTo\\4":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 69
    .local v11, "$i$f$mapNotNullTo\\4\\60":I
    move-object v12, v10

    .local v12, "$this$forEach\\5":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 70
    .local v13, "$i$f$forEach\\5\\69":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_3
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_4

    move-object v15, v14

    check-cast v15, Lkotlin/collections/IntIterator;

    invoke-virtual {v15}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v15

    .local v15, "element\\5":I
    move/from16 v16, v15

    .local v16, "element\\6":I
    const/16 v17, 0x0

    .line 69
    .local v17, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\6\\70\\4":I
    move/from16 v18, v16

    .local v18, "it\\8":I
    const/16 v19, 0x0

    .line 47
    .local v19, "$i$a$-mapNotNull-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$list$1\\8\\69\\0":I
    move/from16 v3, v18

    .end local v18    # "it\\8":I
    .local v3, "it\\8":I
    invoke-virtual {v6, v3}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v3

    .line 69
    .end local v3    # "it\\8":I
    .end local v19    # "$i$a$-mapNotNull-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$list$1\\8\\69\\0":I
    if-eqz v3, :cond_3

    .line 71
    .local v3, "it\\6":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 69
    .local v18, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\71\\6":I
    invoke-interface {v9, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .end local v3    # "it\\6":Ljava/lang/Object;
    .end local v16    # "element\\6":I
    .end local v17    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\6\\70\\4":I
    .end local v18    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\71\\6":I
    :cond_3
    const/4 v3, 0x0

    .end local v15    # "element\\5":I
    goto :goto_3

    .line 72
    :cond_4
    nop

    .line 73
    .end local v12    # "$this$forEach\\5":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach\\5\\69":I
    nop

    .end local v9    # "destination\\4":Ljava/util/Collection;
    .end local v10    # "$this$mapNotNullTo\\4":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapNotNullTo\\4\\60":I
    move-object v3, v9

    check-cast v3, Ljava/util/List;

    .line 60
    nop

    .line 47
    .end local v7    # "$this$mapNotNull\\3":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNull\\3\\47":I
    nop

    .line 48
    .local v3, "list":Ljava/util/List;
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_5

    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$err:Landroidx/compose/runtime/State;

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    new-array v9, v8, [Ljava/lang/Object;

    invoke-static {v5, v9}, Lcom/pymcl/android/ui/dialogs/SavesStringsKt;->st(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v7, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return v8

    .line 50
    :cond_5
    const/4 v8, 0x0

    const/4 v5, 0x1

    if-nez v0, :cond_9

    move-object v7, v3

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$any\\9":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 74
    .local v9, "$i$f$any\\9\\50":I
    instance-of v10, v7, Ljava/util/Collection;

    if-eqz v10, :cond_6

    move-object v10, v7

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_6

    goto :goto_4

    .line 75
    :cond_6
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element\\9":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Landroid/net/Uri;

    .local v12, "it\\10":Landroid/net/Uri;
    const/4 v13, 0x0

    .line 50
    .local v13, "$i$a$-any-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$1\\10\\75\\0":I
    invoke-virtual {v12}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v14

    const-string v15, "content"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    .line 75
    .end local v12    # "it\\10":Landroid/net/Uri;
    .end local v13    # "$i$a$-any-SaveDropTargetKt$saveDropTarget$target$1$1$onDrop$1\\10\\75\\0":I
    if-eqz v12, :cond_7

    move v8, v5

    goto :goto_4

    .line 76
    .end local v11    # "element\\9":Ljava/lang/Object;
    :cond_8
    nop

    .line 50
    .end local v7    # "$this$any\\9":Ljava/lang/Iterable;
    .end local v9    # "$i$f$any\\9\\50":I
    :goto_4
    if-eqz v8, :cond_9

    const-string v7, "PyMCL"

    const-string v8, "drag-and-drop permission not granted"

    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    :cond_9
    iget-object v7, v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$uris:Landroidx/compose/runtime/State;

    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-interface {v7, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    return v5
.end method

.method public onEnded(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 2
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$hover:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onEntered(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 2
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$hover:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onExited(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 2
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;->$hover:Landroidx/compose/runtime/State;

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge onMoved(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    .line 38
    invoke-super {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropTarget;->onMoved(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    return-void
.end method

.method public bridge onStarted(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V
    .locals 0
    .param p1, "event"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    .line 38
    invoke-super {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropTarget;->onStarted(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)V

    return-void
.end method
