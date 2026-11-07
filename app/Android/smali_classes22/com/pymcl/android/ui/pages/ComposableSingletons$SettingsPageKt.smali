.class public final Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;
.super Ljava/lang/Object;
.source "SettingsPage.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsPage.kt\ncom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,308:1\n113#2:309\n99#3:310\n95#3,10:311\n106#3:359\n79#4,6:321\n86#4,3:336\n89#4,2:345\n93#4:358\n347#5,9:327\n356#5:347\n357#5,2:356\n4206#6,6:339\n2068#7:348\n2069#7:355\n1247#8,6:349\n*S KotlinDebug\n*F\n+ 1 SettingsPage.kt\ncom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt\n*L\n129#1:309\n129#1:310\n129#1:311,10\n129#1:359\n129#1:321,6\n129#1:336,3\n129#1:345,2\n129#1:358\n129#1:327,9\n129#1:347\n129#1:356,2\n129#1:339,6\n129#1:348\n129#1:355\n129#1:349,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;

.field private static lambda$-1010814294:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$nR_v8IYq3SFjH3MLO5DZv_zYEOU(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;->lambda__1010814294$lambda$0(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vaIndG7Yh72G5muCpW2fEDdHFak()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;->lambda__1010814294$lambda$0$0$0$0$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;

    invoke-direct {v0}, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;->INSTANCE:Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;

    .line 128
    new-instance v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda0;-><init>()V

    const v1, -0x3c3fcd56

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function3;

    sput-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;->lambda$-1010814294:Lkotlin/jvm/functions/Function3;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final lambda__1010814294$lambda$0(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 41
    .param p0, "$this$Group"    # Landroidx/compose/foundation/layout/ColumnScope;
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "$this$Group"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "C128@9806L156:SettingsPage.kt#vz4689"

    invoke-static {v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x11

    const/16 v4, 0x10

    const/4 v6, 0x0

    if-eq v2, v4, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v6

    :goto_0
    and-int/lit8 v4, v1, 0x1

    invoke-interface {v0, v2, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, -0x1

    const-string v4, "com.pymcl.android.ui.pages.ComposableSingletons$SettingsPageKt.lambda$-1010814294.<anonymous> (SettingsPage.kt:128)"

    const v7, -0x3c3fcd56

    invoke-static {v7, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 129
    :cond_1
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    const/16 v4, 0x8

    .local v4, "$this$dp\\1":I
    const/4 v7, 0x0

    .line 309
    .local v7, "$i$f$getDp\\1\\129":I
    int-to-float v8, v4

    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 129
    .end local v4    # "$this$dp\\1":I
    .end local v7    # "$i$f$getDp\\1\\129":I
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .local v2, "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    const/16 v4, 0x30

    .local v4, "$changed\\2":I
    move-object/from16 v7, p1

    .local v7, "$composer\\2":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 310
    .local v8, "$i$f$Row\\2\\129":I
    const v9, 0x2952b718

    const-string v10, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo"

    invoke-static {v7, v9, v10}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 311
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v9, Landroidx/compose/ui/Modifier;

    .line 313
    .local v9, "modifier\\2":Landroidx/compose/ui/Modifier;
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v10

    .line 316
    .local v10, "verticalAlignment\\2":Landroidx/compose/ui/Alignment$Vertical;
    shr-int/lit8 v11, v4, 0x3

    and-int/lit8 v11, v11, 0xe

    shr-int/lit8 v12, v4, 0x3

    and-int/lit8 v12, v12, 0x70

    or-int/2addr v11, v12

    invoke-static {v2, v10, v7, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 320
    .local v11, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v12, v4, 0x3

    and-int/lit8 v12, v12, 0x70

    .line 317
    nop

    .local v12, "$changed\\3":I
    move-object v13, v9

    .local v13, "modifier\\3":Landroidx/compose/ui/Modifier;
    const/4 v14, 0x0

    .line 321
    .local v14, "$i$f$Layout\\3\\317":I
    const v15, -0x4ee9b9da

    const/16 v16, 0x1

    const-string v5, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh"

    invoke-static {v7, v15, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 322
    invoke-static {v7, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 323
    .local v5, "compositeKeyHash\\3":I
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 324
    .local v15, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    move/from16 v17, v6

    invoke-static {v7, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 326
    .local v6, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v18, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v18

    shl-int/lit8 v0, v12, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    .line 325
    move-object/from16 v19, v18

    .local v0, "$changed\\4":I
    .local v19, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v18, 0x0

    .line 327
    .local v18, "$i$f$ReusableComposeNode\\4\\325":I
    move/from16 v20, v0

    .end local v0    # "$changed\\4":I
    .local v20, "$changed\\4":I
    const v0, -0x2942ffcf

    const-string v1, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp"

    invoke-static {v7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 328
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 329
    :cond_2
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 330
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 331
    move-object/from16 v0, v19

    .end local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 333
    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_3
    move-object/from16 v0, v19

    .end local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 335
    :goto_1
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .local v1, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 336
    .local v19, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\335\\3":I
    sget-object v21, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v22, v0

    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v22, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v11, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 337
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v15, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 338
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v21, 0x0

    .line 339
    .local v21, "$i$f$set-impl\\6\\338":I
    move-object/from16 v23, v1

    .local v23, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 340
    .local v24, "$i$a$-with-Updater$set$1\\7\\339\\6":I
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v25

    if-nez v25, :cond_5

    move-object/from16 v25, v2

    .end local v2    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .local v25, "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v3, v23

    goto :goto_3

    .end local v25    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v2    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :cond_5
    move-object/from16 v25, v2

    .line 341
    .end local v2    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    .restart local v25    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v23

    .end local v23    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 342
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 344
    :goto_3
    nop

    .line 339
    .end local v3    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$a$-with-Updater$set$1\\7\\339\\6":I
    nop

    .line 344
    nop

    .line 345
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v21    # "$i$f$set-impl\\6\\338":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 346
    nop

    .line 335
    .end local v1    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\335\\3":I
    nop

    .line 347
    shr-int/lit8 v0, v20, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object v1, v7

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 318
    .local v2, "$i$a$-Layout-RowKt$Row$1\\8\\347\\2":I
    const v3, -0x184d8b46

    move/from16 v19, v0

    .end local v0    # "$changed\\8":I
    .local v19, "$changed\\8":I
    const-string v0, "C101@5232L9:Row.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    shr-int/lit8 v3, v4, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/RowScope;

    .local v0, "$this$lambda__1010814294_u24lambda_u240_u240\\9":Landroidx/compose/foundation/layout/RowScope;
    move-object/from16 v34, v1

    .local v34, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 129
    .local v21, "$i$a$-Row-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1\\9\\318\\0":I
    move-object/from16 v23, v0

    .end local v0    # "$this$lambda__1010814294_u24lambda_u240_u240\\9":Landroidx/compose/foundation/layout/RowScope;
    .local v23, "$this$lambda__1010814294_u24lambda_u240_u240\\9":Landroidx/compose/foundation/layout/RowScope;
    const v0, -0x426f3f6b

    move-object/from16 v24, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v24, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C:SettingsPage.kt#vz4689"

    move/from16 v37, v2

    move-object/from16 v2, v34

    .end local v34    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v37, "$i$a$-Layout-RowKt$Row$1\\8\\347\\2":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const v0, 0x3febea25

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "*128@9956L2,128@9915L43"

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u4fdd\u5b58\u4e3a\u4e3b\u9898\u5305"

    aput-object v1, v0, v17

    const-string v1, "\u52a0\u8f7d"

    aput-object v1, v0, v16

    const/4 v1, 0x2

    const-string v16, "\u5220\u9664"

    aput-object v16, v0, v1

    const-string v1, "\u5bfc\u5165"

    const/16 v16, 0x3

    aput-object v1, v0, v16

    const/4 v1, 0x4

    const-string v16, "\u5bfc\u51fa"

    aput-object v16, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\10":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 348
    .local v1, "$i$f$forEach\\10\\129":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .local v17, "element\\10":Ljava/lang/Object;
    move-object/from16 v26, v17

    check-cast v26, Ljava/lang/String;

    .local v26, "it\\11":Ljava/lang/String;
    const/16 v38, 0x0

    .line 129
    .local v38, "$i$a$-forEach-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1$1\\11\\348\\9":I
    sget-object v27, Lcom/pymcl/android/ui/components/BtnKind;->Normal:Lcom/pymcl/android/ui/components/BtnKind;

    move-object/from16 v39, v0

    .end local v0    # "$this$forEach\\10":Ljava/lang/Iterable;
    .local v39, "$this$forEach\\10":Ljava/lang/Iterable;
    const v0, 0x51a5ce40

    move/from16 v40, v1

    .end local v1    # "$i$f$forEach\\10\\129":I
    .local v40, "$i$f$forEach\\10\\129":I
    const-string v1, "CC(remember):SettingsPage.kt#9igjgp"

    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/4 v0, 0x0

    .local v0, "invalid\\12":Z
    move-object v1, v2

    .local v1, "$this$cache\\12":Landroidx/compose/runtime/Composer;
    const/16 v28, 0x0

    .line 349
    .local v28, "$i$f$cache\\12\\129":I
    move/from16 v29, v0

    .end local v0    # "invalid\\12":Z
    .local v29, "invalid\\12":Z
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\12":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 350
    .local v30, "$i$a$-let-ComposerKt$cache$1\\13\\349\\12":I
    sget-object v31, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v34, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v34    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_6

    .line 351
    const/4 v2, 0x0

    .line 129
    .local v2, "$i$a$-cache-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1$1$1\\14\\351\\11":I
    new-instance v31, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda1;

    invoke-direct/range {v31 .. v31}, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt$$ExternalSyntheticLambda1;-><init>()V

    .line 351
    .end local v2    # "$i$a$-cache-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1$1$1\\14\\351\\11":I
    move-object/from16 v2, v31

    .line 352
    .local v2, "value\\13":Ljava/lang/Object;
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 353
    move-object v0, v2

    .end local v2    # "value\\13":Ljava/lang/Object;
    goto :goto_5

    .line 354
    :cond_6
    nop

    .line 349
    .end local v0    # "it\\12":Ljava/lang/Object;
    .end local v30    # "$i$a$-let-ComposerKt$cache$1\\13\\349\\12":I
    :goto_5
    nop

    .line 129
    .end local v1    # "$this$cache\\12":Landroidx/compose/runtime/Composer;
    .end local v28    # "$i$f$cache\\12\\129":I
    .end local v29    # "invalid\\12":Z
    move-object/from16 v33, v0

    check-cast v33, Lkotlin/jvm/functions/Function0;

    invoke-static/range {v34 .. v34}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    const v35, 0xc00c30

    const/16 v36, 0x74

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v26 .. v36}, Lcom/pymcl/android/ui/components/UiKt;->Btn(Ljava/lang/String;Lcom/pymcl/android/ui/components/BtnKind;Landroidx/compose/ui/graphics/vector/ImageVector;ZZLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 348
    .end local v26    # "it\\11":Ljava/lang/String;
    .end local v38    # "$i$a$-forEach-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1$1\\11\\348\\9":I
    move-object/from16 v2, v34

    move-object/from16 v0, v39

    move/from16 v1, v40

    .end local v17    # "element\\10":Ljava/lang/Object;
    goto :goto_4

    .line 355
    .end local v34    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v39    # "$this$forEach\\10":Ljava/lang/Iterable;
    .end local v40    # "$i$f$forEach\\10\\129":I
    .local v0, "$this$forEach\\10":Ljava/lang/Iterable;
    .local v1, "$i$f$forEach\\10\\129":I
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    :cond_7
    move-object/from16 v39, v0

    move/from16 v40, v1

    move-object/from16 v34, v2

    .line 129
    .end local v0    # "$this$forEach\\10":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\10\\129":I
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v34    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-interface/range {v34 .. v34}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    invoke-static/range {v34 .. v34}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 318
    .end local v3    # "$changed\\9":I
    .end local v21    # "$i$a$-Row-ComposableSingletons$SettingsPageKt$lambda$-1010814294$1$1\\9\\318\\0":I
    .end local v23    # "$this$lambda__1010814294_u24lambda_u240_u240\\9":Landroidx/compose/foundation/layout/RowScope;
    .end local v34    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v24 .. v24}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 347
    .end local v19    # "$changed\\8":I
    .end local v24    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v37    # "$i$a$-Layout-RowKt$Row$1\\8\\347\\2":I
    nop

    .line 356
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 327
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 357
    nop

    .line 321
    .end local v18    # "$i$f$ReusableComposeNode\\4\\325":I
    .end local v20    # "$changed\\4":I
    .end local v22    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 358
    nop

    .line 310
    .end local v5    # "compositeKeyHash\\3":I
    .end local v6    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .end local v12    # "$changed\\3":I
    .end local v13    # "modifier\\3":Landroidx/compose/ui/Modifier;
    .end local v14    # "$i$f$Layout\\3\\317":I
    .end local v15    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v7}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 359
    nop

    .end local v4    # "$changed\\2":I
    .end local v7    # "$composer\\2":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$Row\\2\\129":I
    .end local v9    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .end local v10    # "verticalAlignment\\2":Landroidx/compose/ui/Alignment$Vertical;
    .end local v11    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v25    # "horizontalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Horizontal;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_6

    .line 128
    :cond_8
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 130
    :cond_9
    :goto_6
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final lambda__1010814294$lambda$0$0$0$0$0()Lkotlin/Unit;
    .locals 1

    .line 129
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final getLambda$-1010814294$PyMCL_Android_app_debug()Lkotlin/jvm/functions/Function3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/runtime/Composer;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/pages/ComposableSingletons$SettingsPageKt;->lambda$-1010814294:Lkotlin/jvm/functions/Function3;

    return-object v0
.end method
