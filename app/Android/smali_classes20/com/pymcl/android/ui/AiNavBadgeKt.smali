.class public final Lcom/pymcl/android/ui/AiNavBadgeKt;
.super Ljava/lang/Object;
.source "AiNavBadge.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiNavBadge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNavBadge.kt\ncom/pymcl/android/ui/AiNavBadgeKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,42:1\n1247#2,6:43\n1247#2,6:49\n1247#2,6:55\n78#3:61\n107#3,2:62\n*S KotlinDebug\n*F\n+ 1 AiNavBadge.kt\ncom/pymcl/android/ui/AiNavBadgeKt\n*L\n26#1:43,6\n27#1:49,6\n28#1:55,6\n27#1:61\n27#1:62,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001b\u0002\u0008\u0005\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0006\u00b2\u0006\n\u0010\u0007\u001a\u00020\u0001X\u008a\u008e\u0002"
    }
    d2 = {
        "rememberAiRunningTasks",
        "",
        "state",
        "Lcom/pymcl/android/ui/state/AppState;",
        "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)I",
        "Landroidx/compose/runtime/Composable;",
        "PyMCL-Android:app_debug",
        "count"
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
.method public static final synthetic access$rememberAiRunningTasks$lambda$2(Landroidx/compose/runtime/MutableIntState;)I
    .locals 1
    .param p0, "$count$delegate"    # Landroidx/compose/runtime/MutableIntState;

    .line 1
    invoke-static {p0}, Lcom/pymcl/android/ui/AiNavBadgeKt;->rememberAiRunningTasks$lambda$2(Landroidx/compose/runtime/MutableIntState;)I

    move-result v0

    return v0
.end method

.method public static final synthetic access$rememberAiRunningTasks$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 0
    .param p0, "$count$delegate"    # Landroidx/compose/runtime/MutableIntState;
    .param p1, "<set-?>"    # I

    .line 1
    invoke-static {p0, p1}, Lcom/pymcl/android/ui/AiNavBadgeKt;->rememberAiRunningTasks$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V

    return-void
.end method

.method public static final rememberAiRunningTasks(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)I
    .locals 11
    .param p0, "state"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    const v0, -0xf388c98

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "C(rememberAiRunningTasks)25@915L36,26@981L33,27@1038L599,27@1019L618:AiNavBadge.kt#n2hyjj"

    invoke-static {p1, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.pymcl.android.ui.rememberAiRunningTasks (AiNavBadge.kt:24)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 26
    :cond_0
    const v0, -0x2347be74

    const-string v1, "CC(remember):AiNavBadge.kt#9igjgp"

    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    and-int/lit8 v0, p2, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le v0, v2, :cond_1

    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, p2, 0x6

    if-ne v0, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    move v0, v3

    .local v0, "invalid\\1":Z
    :goto_0
    move-object v2, p1

    .local v2, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 43
    .local v4, "$i$f$cache\\1\\26":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 44
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\43\\1":I
    if-nez v0, :cond_5

    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_4

    goto :goto_1

    .line 48
    :cond_4
    goto :goto_2

    .line 45
    :cond_5
    :goto_1
    const/4 v7, 0x0

    .line 26
    .local v7, "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$ai$1\\3\\45\\0":I
    invoke-static {p0}, Lcom/pymcl/android/ui/pages/AiPageKt;->aiExtras(Lcom/pymcl/android/ui/state/AppState;)Lcom/pymcl/android/data/AiUiExtras;

    move-result-object v7

    .line 45
    .end local v7    # "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$ai$1\\3\\45\\0":I
    nop

    .line 46
    .local v7, "value\\2":Ljava/lang/Object;
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 47
    move-object v5, v7

    .line 43
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\43\\1":I
    .end local v7    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 26
    .end local v0    # "invalid\\1":Z
    .end local v2    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\1\\26":I
    check-cast v5, Lcom/pymcl/android/data/AiUiExtras;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    if-nez v5, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 41
    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 26
    return v3

    .line 27
    .local v5, "ai":Lcom/pymcl/android/data/AiUiExtras;
    :cond_7
    const v0, -0x2347b637

    invoke-static {p1, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\4":Z
    move-object v2, p1

    .local v2, "$this$cache\\4":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 49
    .local v4, "$i$f$cache\\4\\27":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\4":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 50
    .local v7, "$i$a$-let-ComposerKt$cache$1\\5\\49\\4":I
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_8

    .line 51
    const/4 v8, 0x0

    .line 27
    .local v8, "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$count$2\\6\\51\\0":I
    invoke-static {v3}, Landroidx/compose/runtime/SnapshotIntStateKt;->mutableIntStateOf(I)Landroidx/compose/runtime/MutableIntState;

    move-result-object v8

    .line 51
    .end local v8    # "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$count$2\\6\\51\\0":I
    nop

    .line 52
    .local v8, "value\\5":Ljava/lang/Object;
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 53
    move-object v6, v8

    .end local v8    # "value\\5":Ljava/lang/Object;
    goto :goto_3

    .line 54
    :cond_8
    nop

    .line 49
    .end local v6    # "it\\4":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\5\\49\\4":I
    :goto_3
    nop

    .line 27
    .end local v0    # "invalid\\4":Z
    .end local v2    # "$this$cache\\4":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\4\\27":I
    move-object v0, v6

    check-cast v0, Landroidx/compose/runtime/MutableIntState;

    .local v0, "count$delegate":Landroidx/compose/runtime/MutableIntState;
    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 28
    const v2, -0x2347ace1

    invoke-static {p1, v2, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    .local v1, "invalid\\7":Z
    move-object v2, p1

    .local v2, "$this$cache\\7":Landroidx/compose/runtime/Composer;
    const/4 v4, 0x0

    .line 55
    .local v4, "$i$f$cache\\7\\28":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    .local v6, "it\\7":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 56
    .local v7, "$i$a$-let-ComposerKt$cache$1\\8\\55\\7":I
    if-nez v1, :cond_a

    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_9

    goto :goto_4

    .line 60
    :cond_9
    goto :goto_5

    .line 57
    :cond_a
    :goto_4
    const/4 v8, 0x0

    .line 28
    .local v8, "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$1\\9\\57\\0":I
    new-instance v9, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;

    const/4 v10, 0x0

    invoke-direct {v9, v5, v0, v10}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableIntState;Lkotlin/coroutines/Continuation;)V

    check-cast v9, Lkotlin/jvm/functions/Function2;

    .line 57
    .end local v8    # "$i$a$-cache-AiNavBadgeKt$rememberAiRunningTasks$1\\9\\57\\0":I
    nop

    .line 58
    .local v9, "value\\8":Ljava/lang/Object;
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 59
    move-object v6, v9

    .line 55
    .end local v6    # "it\\7":Ljava/lang/Object;
    .end local v7    # "$i$a$-let-ComposerKt$cache$1\\8\\55\\7":I
    .end local v9    # "value\\8":Ljava/lang/Object;
    :goto_5
    nop

    .line 28
    .end local v1    # "invalid\\7":Z
    .end local v2    # "$this$cache\\7":Landroidx/compose/runtime/Composer;
    .end local v4    # "$i$f$cache\\7\\28":I
    check-cast v6, Lkotlin/jvm/functions/Function2;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v5, v6, p1, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 40
    invoke-static {v0}, Lcom/pymcl/android/ui/AiNavBadgeKt;->rememberAiRunningTasks$lambda$2(Landroidx/compose/runtime/MutableIntState;)I

    move-result v1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 41
    :cond_b
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 40
    return v1
.end method

.method private static final rememberAiRunningTasks$lambda$2(Landroidx/compose/runtime/MutableIntState;)I
    .locals 4
    .param p0, "$count$delegate"    # Landroidx/compose/runtime/MutableIntState;

    .line 27
    move-object v0, p0

    check-cast v0, Landroidx/compose/runtime/IntState;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/IntState;
    const/4 v1, 0x0

    .local v1, "this_\\1":Ljava/lang/Object;
    const/4 v2, 0x0

    .local v2, "property\\1":Lkotlin/reflect/KProperty;
    const/4 v3, 0x0

    .line 61
    .local v3, "$i$f$getValue\\1\\27":I
    invoke-interface {v0}, Landroidx/compose/runtime/IntState;->getIntValue()I

    move-result v0

    .line 27
    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/IntState;
    .end local v1    # "this_\\1":Ljava/lang/Object;
    .end local v2    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v3    # "$i$f$getValue\\1\\27":I
    return v0
.end method

.method private static final rememberAiRunningTasks$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V
    .locals 5
    .param p0, "$count$delegate"    # Landroidx/compose/runtime/MutableIntState;
    .param p1, "<set-?>"    # I

    .line 27
    const/4 v0, 0x0

    .local v0, "this_\\1":Ljava/lang/Object;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move v2, p1

    .local v2, "value\\1":I
    move-object v3, p0

    .local v3, "$this$setValue\\1":Landroidx/compose/runtime/MutableIntState;
    const/4 v4, 0x0

    .line 62
    .local v4, "$i$f$setValue\\1\\27":I
    invoke-interface {v3, v2}, Landroidx/compose/runtime/MutableIntState;->setIntValue(I)V

    .line 63
    nop

    .line 27
    .end local v0    # "this_\\1":Ljava/lang/Object;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":I
    .end local v3    # "$this$setValue\\1":Landroidx/compose/runtime/MutableIntState;
    .end local v4    # "$i$f$setValue\\1\\27":I
    return-void
.end method
