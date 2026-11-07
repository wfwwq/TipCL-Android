.class final Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;
.super Ljava/lang/Object;
.source "LaunchPage.kt"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/LaunchPageKt;->DashCanvas-3GLzNTs(Lcom/pymcl/android/ui/state/AppState;Ljava/util/List;ZZFFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchPage.kt\ncom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,474:1\n1739#2:475\n1814#2,2:476\n1816#2:484\n65#3:478\n69#3:481\n60#4:479\n70#4:482\n22#5:480\n22#5:483\n*S KotlinDebug\n*F\n+ 1 LaunchPage.kt\ncom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1\n*L\n122#1:475\n122#1:476,2\n122#1:484\n124#1:478\n125#1:481\n124#1:479\n125#1:482\n124#1:480\n125#1:483\n*E\n"
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


# instance fields
.field final synthetic $cards:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/pages/DashCardSpec;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $density:Landroidx/compose/ui/unit/Density;

.field final synthetic $mh:I

.field final synthetic $mw:I

.field final synthetic $onChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/pages/DashCardSpec;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $pxH:F

.field final synthetic $pxW:F

.field final synthetic $spec:Lcom/pymcl/android/ui/pages/DashCardSpec;


# direct methods
.method public static synthetic $r8$lambda$VDriYIXMMQ7MBIjak0zgUkmomX8(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FILandroidx/compose/ui/unit/Density;FILandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FILandroidx/compose/ui/unit/Density;FILandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FILandroidx/compose/ui/unit/Density;FI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/pages/DashCardSpec;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/pages/DashCardSpec;",
            ">;",
            "Lcom/pymcl/android/ui/pages/DashCardSpec;",
            "FI",
            "Landroidx/compose/ui/unit/Density;",
            "FI)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$onChange:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$cards:Ljava/util/List;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$spec:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iput p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$pxW:F

    iput p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$mw:I

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iput p7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$pxH:F

    iput p8, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$mh:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FILandroidx/compose/ui/unit/Density;FILandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 23
    .param p0, "$onChange"    # Lkotlin/jvm/functions/Function1;
    .param p1, "$cards"    # Ljava/util/List;
    .param p2, "$spec"    # Lcom/pymcl/android/ui/pages/DashCardSpec;
    .param p3, "$pxW"    # F
    .param p4, "$mw"    # I
    .param p5, "$density"    # Landroidx/compose/ui/unit/Density;
    .param p6, "$pxH"    # F
    .param p7, "$mh"    # I
    .param p8, "change"    # Landroidx/compose/ui/input/pointer/PointerInputChange;
    .param p9, "d"    # Landroidx/compose/ui/geometry/Offset;

    const-string v0, "change"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 122
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 475
    .local v2, "$i$f$map\\1\\122":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 476
    .local v5, "$i$f$mapTo\\2\\475":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 477
    .local v7, "item\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/android/ui/pages/DashCardSpec;

    .local v8, "it\\3":Lcom/pymcl/android/ui/pages/DashCardSpec;
    const/16 v18, 0x0

    .line 123
    .local v18, "$i$a$-map-LaunchPageKt$DashCanvas$1$2$4$2$1$1$1\\3\\477\\0":I
    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    move-object/from16 v19, v0

    move-object v1, v8

    move/from16 v0, p4

    goto/16 :goto_1

    .line 124
    :cond_0
    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getW()F

    move-result v9

    mul-float v9, v9, p3

    invoke-virtual/range {p9 .. p9}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v10

    .local v10, "arg0\\4":J
    const/4 v12, 0x0

    .line 478
    .local v12, "$i$f$getX-impl\\4\\124":I
    move-wide v13, v10

    .local v13, "value\\5":J
    const/4 v15, 0x0

    .line 479
    .local v15, "$i$f$unpackFloat1\\5\\478":I
    const/16 v16, 0x20

    move-object/from16 v19, v0

    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .local v19, "$this$map\\1":Ljava/lang/Iterable;
    shr-long v0, v13, v16

    long-to-int v0, v0

    .local v0, "bits\\6":I
    const/4 v1, 0x0

    .line 480
    .local v1, "$i$f$floatFromBits\\6\\479":I
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    .line 479
    .end local v0    # "bits\\6":I
    .end local v1    # "$i$f$floatFromBits\\6\\479":I
    nop

    .line 478
    .end local v13    # "value\\5":J
    .end local v15    # "$i$f$unpackFloat1\\5\\478":I
    nop

    .line 124
    .end local v10    # "arg0\\4":J
    .end local v12    # "$i$f$getX-impl\\4\\124":I
    add-float/2addr v9, v0

    div-float v9, v9, p3

    move/from16 v0, p4

    int-to-float v1, v0

    invoke-interface/range {p5 .. p5}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v10

    mul-float/2addr v1, v10

    div-float v1, v1, p3

    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getX()F

    move-result v10

    const/high16 v11, 0x3f800000    # 1.0f

    sub-float v10, v11, v10

    invoke-static {v9, v1, v10}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v13

    .line 125
    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getH()F

    move-result v1

    mul-float v1, v1, p6

    invoke-virtual/range {p9 .. p9}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v9

    .local v9, "arg0\\7":J
    const/4 v12, 0x0

    .line 481
    .local v12, "$i$f$getY-impl\\7\\125":I
    move-wide v14, v9

    .local v14, "value\\8":J
    const/16 v16, 0x0

    .line 482
    .local v16, "$i$f$unpackFloat2\\8\\481":I
    const-wide v20, 0xffffffffL

    move/from16 v17, v11

    move/from16 v22, v12

    .end local v12    # "$i$f$getY-impl\\7\\125":I
    .local v22, "$i$f$getY-impl\\7\\125":I
    and-long v11, v14, v20

    long-to-int v11, v11

    .local v11, "bits\\9":I
    const/4 v12, 0x0

    .line 483
    .local v12, "$i$f$floatFromBits\\9\\482":I
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    .line 482
    .end local v11    # "bits\\9":I
    .end local v12    # "$i$f$floatFromBits\\9\\482":I
    nop

    .line 481
    .end local v14    # "value\\8":J
    .end local v16    # "$i$f$unpackFloat2\\8\\481":I
    nop

    .line 125
    .end local v9    # "arg0\\7":J
    .end local v22    # "$i$f$getY-impl\\7\\125":I
    add-float/2addr v1, v11

    div-float v1, v1, p6

    move/from16 v9, p7

    int-to-float v10, v9

    invoke-interface/range {p5 .. p5}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v11

    mul-float/2addr v10, v11

    div-float v10, v10, p6

    invoke-virtual {v8}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getY()F

    move-result v11

    sub-float v11, v17, v11

    invoke-static {v1, v10, v11}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v14

    .line 123
    const/16 v16, 0x4f

    const/16 v17, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lcom/pymcl/android/ui/pages/DashCardSpec;->copy$default(Lcom/pymcl/android/ui/pages/DashCardSpec;Ljava/lang/String;Ljava/lang/String;FFFFIILjava/lang/Object;)Lcom/pymcl/android/ui/pages/DashCardSpec;

    move-result-object v1

    .line 126
    :goto_1
    nop

    .line 477
    .end local v8    # "it\\3":Lcom/pymcl/android/ui/pages/DashCardSpec;
    .end local v18    # "$i$a$-map-LaunchPageKt$DashCanvas$1$2$4$2$1$1$1\\3\\477\\0":I
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p8

    move-object/from16 v0, v19

    goto/16 :goto_0

    .line 484
    .end local v7    # "item\\2":Ljava/lang/Object;
    .end local v19    # "$this$map\\1":Ljava/lang/Iterable;
    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    :cond_1
    nop

    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\2\\475":I
    move-object v1, v3

    check-cast v1, Ljava/util/List;

    .line 475
    nop

    .line 122
    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map\\1\\122":I
    move-object/from16 v2, p0

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .param p1, "$this$invoke"    # Landroidx/compose/ui/input/pointer/PointerInputScope;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 120
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$onChange:Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$cards:Ljava/util/List;

    iget-object v4, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$spec:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iget v5, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$pxW:F

    iget v6, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$mw:I

    iget-object v7, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$density:Landroidx/compose/ui/unit/Density;

    iget v8, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$pxH:F

    iget v9, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1;->$mh:I

    new-instance v14, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1$$ExternalSyntheticLambda0;

    move-object v1, v14

    invoke-direct/range {v1 .. v9}, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$4$2$1$$ExternalSyntheticLambda0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FILandroidx/compose/ui/unit/Density;FI)V

    const/16 v16, 0x7

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, p1

    move-object/from16 v15, p2

    invoke-static/range {v10 .. v17}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 129
    return-object v1
.end method
