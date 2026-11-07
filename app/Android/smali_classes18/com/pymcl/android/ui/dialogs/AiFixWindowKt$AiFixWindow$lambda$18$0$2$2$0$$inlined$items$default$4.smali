.class public final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;
.super Lkotlin/jvm/internal/Lambda;
.source "LazyDsl.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->AiFixWindow(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CrashInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "Ljava/lang/Integer;",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$4\n+ 2 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n130#2:181\n1247#3,6:182\n*S KotlinDebug\n*F\n+ 1 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt\n*L\n130#1:182,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\u0008\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "<anonymous>",
        "",
        "T",
        "Landroidx/compose/foundation/lazy/LazyItemScope;",
        "it",
        "",
        "invoke",
        "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V",
        "androidx/compose/foundation/lazy/LazyDslKt$items$4"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $ai$inlined:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $chatId$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $info$inlined:Lcom/pymcl/android/ui/state/CrashInfo;

.field final synthetic $items:Ljava/util/List;

.field final synthetic $items$inlined:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field final synthetic $running$delegate$inlined:Landroidx/compose/runtime/MutableState;

.field final synthetic $state$inlined:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $visible$inlined:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$ai$inlined:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items$inlined:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$visible$inlined:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$info$inlined:Lcom/pymcl/android/ui/state/CrashInfo;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$running$delegate$inlined:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$chatId$delegate$inlined:Landroidx/compose/runtime/MutableState;

    const/4 p2, 0x4

    invoke-direct {p0, p2}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;
    .param p3, "p3"    # Ljava/lang/Object;
    .param p4, "p4"    # Ljava/lang/Object;

    .line 178
    move-object v0, p1

    check-cast v0, Landroidx/compose/foundation/lazy/LazyItemScope;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    move-object v2, p3

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object v3, p4

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V
    .locals 26
    .param p1, "$this$items"    # Landroidx/compose/foundation/lazy/LazyItemScope;
    .param p2, "it"    # I
    .param p3, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p4, "$changed"    # I

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "C178@8826L22:LazyDsl.kt#428nma"

    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    move/from16 v3, p4

    .local v3, "$dirty":I
    and-int/lit8 v4, p4, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p1

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move-object/from16 v4, p1

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    .line 179
    :cond_3
    and-int/lit16 v5, v3, 0x93

    const/16 v6, 0x92

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-interface {v2, v5, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)"

    const v7, -0x25b7f321

    invoke-static {v7, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5
    iget-object v5, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items:Ljava/util/List;

    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v6, v3, 0xe

    .local v6, "$changed\\1":I
    move-object v9, v5

    check-cast v9, Lcom/pymcl/android/ui/state/AiItem;

    .local v9, "item\\1":Lcom/pymcl/android/ui/state/AiItem;
    move-object/from16 v5, p1

    .local v5, "$this$AiFixWindow_u24lambda_u2418_u240_u242_u242_u240_u241\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    move-object/from16 v12, p3

    .local v12, "$composer\\1":Landroidx/compose/runtime/Composer;
    const/4 v15, 0x0

    .line 181
    .local v15, "$i$a$-items$default-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2\\1\\179\\0":I
    const v7, 0x4a2e2da1    # 2853736.2f

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v7, "C*129@6281L76,129@6248L125:AiFixWindow.kt#2dz5k2"

    invoke-static {v12, v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v7, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    iget-object v8, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$ai$inlined:Lcom/pymcl/android/data/AiUiExtras;

    const v10, 0xaa6aa91

    const-string v11, "CC(remember):AiFixWindow.kt#9igjgp"

    invoke-static {v12, v10, v11}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v10, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$ai$inlined:Lcom/pymcl/android/data/AiUiExtras;

    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items$inlined:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$visible$inlined:Ljava/lang/String;

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    iget-object v11, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$info$inlined:Lcom/pymcl/android/ui/state/CrashInfo;

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    .local v10, "invalid\\2":Z
    move-object v11, v12

    .local v11, "$this$cache\\2":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 182
    .local v13, "$i$f$cache\\2\\181":I
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v14

    .local v14, "it\\2":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 183
    .local v16, "$i$a$-let-ComposerKt$cache$1\\3\\182\\2":I
    if-nez v10, :cond_7

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v14, v1, :cond_6

    goto :goto_4

    .line 187
    :cond_6
    goto :goto_5

    .line 184
    :cond_7
    :goto_4
    const/4 v1, 0x0

    .line 181
    .local v1, "$i$a$-cache-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1\\4\\184\\1":I
    new-instance v17, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;

    move/from16 v25, v1

    .end local v1    # "$i$a$-cache-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1\\4\\184\\1":I
    .local v25, "$i$a$-cache-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1\\4\\184\\1":I
    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$ai$inlined:Lcom/pymcl/android/data/AiUiExtras;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$visible$inlined:Ljava/lang/String;

    move-object/from16 v19, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$info$inlined:Lcom/pymcl/android/ui/state/CrashInfo;

    move-object/from16 v20, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$running$delegate$inlined:Landroidx/compose/runtime/MutableState;

    move-object/from16 v21, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$chatId$delegate$inlined:Landroidx/compose/runtime/MutableState;

    move-object/from16 v22, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$state$inlined:Lcom/pymcl/android/ui/state/AppState;

    move-object/from16 v23, v1

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items$inlined:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object/from16 v24, v1

    invoke-direct/range {v17 .. v24}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;-><init>(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 184
    .end local v25    # "$i$a$-cache-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1\\4\\184\\1":I
    move-object/from16 v1, v17

    .line 185
    .local v1, "value\\3":Ljava/lang/Object;
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 186
    move-object v14, v1

    .line 182
    .end local v1    # "value\\3":Ljava/lang/Object;
    .end local v14    # "it\\2":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-ComposerKt$cache$1\\3\\182\\2":I
    :goto_5
    nop

    .line 181
    .end local v10    # "invalid\\2":Z
    .end local v11    # "$this$cache\\2":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache\\2\\181":I
    move-object v10, v14

    check-cast v10, Lkotlin/jvm/functions/Function0;

    invoke-static {v12}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    iget-object v1, v0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$lambda$18$0$2$2$0$$inlined$items$default$4;->$items$inlined:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-object v11, v1

    check-cast v11, Ljava/util/List;

    sget v1, Lcom/pymcl/android/ui/state/AppState;->$stable:I

    shl-int/lit8 v13, v6, 0x3

    and-int/lit16 v13, v13, 0x380

    or-int/2addr v13, v1

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lcom/pymcl/android/ui/pages/AiPageKt;->AiRow(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem;Lkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 179
    .end local v5    # "$this$AiFixWindow_u24lambda_u2418_u240_u242_u242_u240_u241\\1":Landroidx/compose/foundation/lazy/LazyItemScope;
    .end local v6    # "$changed\\1":I
    .end local v9    # "item\\1":Lcom/pymcl/android/ui/state/AiItem;
    .end local v12    # "$composer\\1":Landroidx/compose/runtime/Composer;
    .end local v15    # "$i$a$-items$default-AiFixWindowKt$AiFixWindow$3$1$3$3$1$2\\1\\179\\0":I
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_6

    :cond_8
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 180
    :cond_9
    :goto_6
    return-void
.end method
