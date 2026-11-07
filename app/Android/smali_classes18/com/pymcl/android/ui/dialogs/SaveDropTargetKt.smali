.class public final Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt;
.super Ljava/lang/Object;
.source "SaveDropTarget.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveDropTarget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropTargetKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,58:1\n75#2:59\n1247#3,6:60\n1247#3,6:66\n*S KotlinDebug\n*F\n+ 1 SaveDropTarget.kt\ncom/pymcl/android/ui/dialogs/SaveDropTargetKt\n*L\n35#1:59\n37#1:60,6\n56#1:66,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001aW\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0018\u0010\t\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u00080\u00062\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00080\u0006H\u0001b\u0002\u0008\u000f\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "findActivity",
        "Landroid/app/Activity;",
        "Landroid/content/Context;",
        "saveDropTarget",
        "Landroidx/compose/ui/Modifier;",
        "onHover",
        "Lkotlin/Function1;",
        "",
        "",
        "onUris",
        "",
        "Landroid/net/Uri;",
        "onError",
        "",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/runtime/Composable;",
        "PyMCL-Android:app_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic $r8$lambda$xCGre7JupBOj5szb_DwLwS3zhdQ(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt;->saveDropTarget$lambda$1$0(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$findActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1
    .param p0, "$receiver"    # Landroid/content/Context;

    .line 1
    invoke-static {p0}, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt;->findActivity(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method private static final findActivity(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2
    .param p0, "$this$findActivity"    # Landroid/content/Context;

    .line 30
    move-object v0, p0

    .local v0, "c":Landroid/content/Context;
    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    return-object v1

    :cond_0
    move-object v1, v0

    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    return-object v1
.end method

.method public static final saveDropTarget(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 17
    .param p0, "$this$saveDropTarget"    # Landroidx/compose/ui/Modifier;
    .param p1, "onHover"    # Lkotlin/jvm/functions/Function1;
    .param p2, "onUris"    # Lkotlin/jvm/functions/Function1;
    .param p3, "onError"    # Lkotlin/jvm/functions/Function1;
    .param p4, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p5, "$changed"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "+",
            "Landroid/net/Uri;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    const-string v6, "<this>"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onHover"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onUris"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onError"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    const v6, 0x7409ba99

    const-string v7, "C(saveDropTarget)P(1,2)34@1589L7,35@1613L29,35@1655L28,35@1695L29,36@1742L1123,55@2925L45:SaveDropTarget.kt#2dz5k2"

    invoke-static {v4, v6, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, -0x1

    const-string v8, "com.pymcl.android.ui.dialogs.saveDropTarget (SaveDropTarget.kt:33)"

    invoke-static {v6, v5, v7, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 35
    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v6

    check-cast v6, Landroidx/compose/runtime/CompositionLocal;

    .local v6, "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    const/4 v7, 0x0

    .local v7, "$changed\\1":I
    move-object/from16 v8, p4

    .local v8, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v9, 0x0

    .line 59
    .local v9, "$i$f$getCurrent\\1\\35":I
    const v10, 0x789c5f52

    const-string v11, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v8, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 35
    .end local v6    # "this_\\1":Landroidx/compose/runtime/CompositionLocal;
    .end local v7    # "$changed\\1":I
    .end local v8    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v9    # "$i$f$getCurrent\\1\\35":I
    move-object v6, v10

    check-cast v6, Landroid/content/Context;

    .line 36
    .local v6, "ctx":Landroid/content/Context;
    shr-int/lit8 v7, v5, 0x3

    and-int/lit8 v7, v7, 0xe

    invoke-static {v1, v4, v7}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v7

    .local v7, "hover":Landroidx/compose/runtime/State;
    shr-int/lit8 v8, v5, 0x6

    and-int/lit8 v8, v8, 0xe

    invoke-static {v2, v4, v8}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v8

    .local v8, "uris":Landroidx/compose/runtime/State;
    shr-int/lit8 v9, v5, 0x9

    and-int/lit8 v9, v9, 0xe

    invoke-static {v3, v4, v9}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v9

    .line 37
    .local v9, "err":Landroidx/compose/runtime/State;
    const v10, -0x677a5d44

    const-string v11, "CC(remember):SaveDropTarget.kt#9igjgp"

    invoke-static {v4, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v10, 0x0

    .local v10, "invalid\\2":Z
    move-object/from16 v12, p4

    .local v12, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 60
    .local v13, "$i$f$cache\\2\\37":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\2":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 61
    .local v15, "$i$a$-let-ComposerKt$cache$1\\3\\60\\2":I
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_1

    .line 62
    const/4 v1, 0x0

    .line 38
    .local v1, "$i$a$-cache-SaveDropTargetKt$saveDropTarget$target$1\\4\\62\\0":I
    move/from16 v16, v1

    .end local v1    # "$i$a$-cache-SaveDropTargetKt$saveDropTarget$target$1\\4\\62\\0":I
    .local v16, "$i$a$-cache-SaveDropTargetKt$saveDropTarget$target$1\\4\\62\\0":I
    new-instance v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;

    invoke-direct {v1, v7, v9, v8, v6}, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroid/content/Context;)V

    .line 54
    nop

    .line 62
    .end local v16    # "$i$a$-cache-SaveDropTargetKt$saveDropTarget$target$1\\4\\62\\0":I
    nop

    .line 63
    .local v1, "value\\3":Ljava/lang/Object;
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 64
    move-object v14, v1

    .end local v1    # "value\\3":Ljava/lang/Object;
    goto :goto_0

    .line 65
    :cond_1
    nop

    .line 60
    .end local v14    # "it\\2":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-ComposerKt$cache$1\\3\\60\\2":I
    :goto_0
    nop

    .line 37
    .end local v10    # "invalid\\2":Z
    .end local v12    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache\\2\\37":I
    move-object v1, v14

    check-cast v1, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;

    .local v1, "target":Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$saveDropTarget$target$1$1;
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 56
    const v10, -0x6779cd9a

    invoke-static {v4, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v10, 0x0

    .local v10, "invalid\\5":Z
    move-object/from16 v11, p4

    .local v11, "$this$cache\\5":Landroidx/compose/runtime/Composer;
    const/4 v12, 0x0

    .line 66
    .local v12, "$i$f$cache\\5\\56":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "it\\5":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 67
    .local v14, "$i$a$-let-ComposerKt$cache$1\\6\\66\\5":I
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v15

    if-ne v13, v15, :cond_2

    .line 68
    const/4 v15, 0x0

    .line 56
    .local v15, "$i$a$-cache-SaveDropTargetKt$saveDropTarget$1\\7\\68\\0":I
    new-instance v16, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$$ExternalSyntheticLambda0;

    invoke-direct/range {v16 .. v16}, Lcom/pymcl/android/ui/dialogs/SaveDropTargetKt$$ExternalSyntheticLambda0;-><init>()V

    .line 68
    .end local v15    # "$i$a$-cache-SaveDropTargetKt$saveDropTarget$1\\7\\68\\0":I
    move-object/from16 v15, v16

    .line 69
    .local v15, "value\\6":Ljava/lang/Object;
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 70
    move-object v13, v15

    .end local v15    # "value\\6":Ljava/lang/Object;
    goto :goto_1

    .line 71
    :cond_2
    nop

    .line 66
    .end local v13    # "it\\5":Ljava/lang/Object;
    .end local v14    # "$i$a$-let-ComposerKt$cache$1\\6\\66\\5":I
    :goto_1
    nop

    .line 56
    .end local v10    # "invalid\\5":Z
    .end local v11    # "$this$cache\\5":Landroidx/compose/runtime/Composer;
    .end local v12    # "$i$f$cache\\5\\56":I
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    move-object v10, v1

    check-cast v10, Landroidx/compose/ui/draganddrop/DragAndDropTarget;

    invoke-static {v0, v13, v10}, Landroidx/compose/foundation/draganddrop/DragAndDropTargetKt;->dragAndDropTarget(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/draganddrop/DragAndDropTarget;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 34
    :cond_3
    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 56
    return-object v10
.end method

.method private static final saveDropTarget$lambda$1$0(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Z
    .locals 2
    .param p0, "e"    # Landroidx/compose/ui/draganddrop/DragAndDropEvent;

    const-string v0, "e"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget-object v0, Lcom/pymcl/android/ui/dialogs/SaveDropRules;->INSTANCE:Lcom/pymcl/android/ui/dialogs/SaveDropRules;

    invoke-static {p0}, Landroidx/compose/ui/draganddrop/DragAndDrop_androidKt;->mimeTypes(Landroidx/compose/ui/draganddrop/DragAndDropEvent;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/SaveDropRules;->accepts(Ljava/util/Collection;)Z

    move-result v0

    return v0
.end method
