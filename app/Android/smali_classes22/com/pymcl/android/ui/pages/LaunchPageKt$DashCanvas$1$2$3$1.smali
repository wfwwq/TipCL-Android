.class final Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;
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
    value = "SMAP\nLaunchPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchPage.kt\ncom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,474:1\n1739#2:475\n1814#2,2:476\n1816#2:484\n65#3:478\n69#3:481\n60#4:479\n70#4:482\n22#5:480\n22#5:483\n*S KotlinDebug\n*F\n+ 1 LaunchPage.kt\ncom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1\n*L\n104#1:475\n104#1:476,2\n104#1:484\n106#1:478\n107#1:481\n106#1:479\n107#1:482\n106#1:480\n107#1:483\n*E\n"
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

.field final synthetic $snap:Z

.field final synthetic $spec:Lcom/pymcl/android/ui/pages/DashCardSpec;


# direct methods
.method public static synthetic $r8$lambda$PZbPy79Kro79Mz8vdlNEy5znVcU(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->invoke$lambda$0(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/unit/Density;",
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
            "FF)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$snap:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$density:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$onChange:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$cards:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$spec:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iput p6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$pxW:F

    iput p7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$pxH:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$0(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;
    .locals 23
    .param p0, "$snap"    # Z
    .param p1, "$density"    # Landroidx/compose/ui/unit/Density;
    .param p2, "$onChange"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$cards"    # Ljava/util/List;
    .param p4, "$spec"    # Lcom/pymcl/android/ui/pages/DashCardSpec;
    .param p5, "$pxW"    # F
    .param p6, "$pxH"    # F
    .param p7, "change"    # Landroidx/compose/ui/input/pointer/PointerInputChange;
    .param p8, "d"    # Landroidx/compose/ui/geometry/Offset;

    const-string v0, "change"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    invoke-virtual {v1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->consume()V

    .line 103
    if-eqz p0, :cond_0

    const/16 v2, 0x8

    int-to-float v2, v2

    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/unit/Density;->getDensity()F

    move-result v3

    mul-float/2addr v2, v3

    goto :goto_0

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    .line 104
    .local v2, "step":F
    :goto_0
    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 475
    .local v4, "$i$f$map\\1\\104":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\2":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 476
    .local v7, "$i$f$mapTo\\2\\475":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 477
    .local v9, "item\\2":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/android/ui/pages/DashCardSpec;

    .local v10, "it\\3":Lcom/pymcl/android/ui/pages/DashCardSpec;
    const/16 v20, 0x0

    .line 105
    .local v20, "$i$a$-map-LaunchPageKt$DashCanvas$1$2$3$1$1$1\\3\\477\\0":I
    invoke-virtual {v10}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p4 .. p4}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    move/from16 v22, v2

    move-object v2, v10

    const/high16 v21, 0x3f800000    # 1.0f

    goto/16 :goto_2

    .line 106
    :cond_1
    invoke-virtual {v10}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getX()F

    move-result v11

    mul-float v11, v11, p5

    invoke-virtual/range {p8 .. p8}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v12

    .local v12, "arg0\\4":J
    const/4 v14, 0x0

    .line 478
    .local v14, "$i$f$getX-impl\\4\\106":I
    move-wide v15, v12

    .local v15, "value\\5":J
    const/16 v17, 0x0

    .line 479
    .local v17, "$i$f$unpackFloat1\\5\\478":I
    const/16 v18, 0x20

    const/high16 v21, 0x3f800000    # 1.0f

    shr-long v0, v15, v18

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
    .end local v15    # "value\\5":J
    .end local v17    # "$i$f$unpackFloat1\\5\\478":I
    nop

    .line 106
    .end local v12    # "arg0\\4":J
    .end local v14    # "$i$f$getX-impl\\4\\106":I
    add-float/2addr v11, v0

    div-float/2addr v11, v2

    invoke-static {v11}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v2

    div-float v0, v0, p5

    .line 107
    .local v0, "nx\\3":F
    invoke-virtual {v10}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getY()F

    move-result v1

    mul-float v1, v1, p6

    invoke-virtual/range {p8 .. p8}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    move-result-wide v11

    .local v11, "arg0\\7":J
    const/4 v13, 0x0

    .line 481
    .local v13, "$i$f$getY-impl\\7\\107":I
    move-wide v14, v11

    .local v14, "value\\8":J
    const/16 v16, 0x0

    .line 482
    .local v16, "$i$f$unpackFloat2\\8\\481":I
    const-wide v17, 0xffffffffL

    move/from16 v19, v1

    move/from16 v22, v2

    .end local v2    # "step":F
    .local v22, "step":F
    and-long v1, v14, v17

    long-to-int v1, v1

    .local v1, "bits\\9":I
    const/4 v2, 0x0

    .line 483
    .local v2, "$i$f$floatFromBits\\9\\482":I
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    .line 482
    .end local v1    # "bits\\9":I
    .end local v2    # "$i$f$floatFromBits\\9\\482":I
    nop

    .line 481
    .end local v14    # "value\\8":J
    .end local v16    # "$i$f$unpackFloat2\\8\\481":I
    nop

    .line 107
    .end local v11    # "arg0\\7":J
    .end local v13    # "$i$f$getY-impl\\7\\107":I
    add-float v1, v19, v1

    div-float v1, v1, v22

    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, v22

    div-float v1, v1, p6

    .line 108
    .local v1, "ny\\3":F
    invoke-virtual {v10}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getW()F

    move-result v2

    sub-float v2, v21, v2

    const/4 v11, 0x0

    invoke-static {v0, v11, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v13

    invoke-virtual {v10}, Lcom/pymcl/android/ui/pages/DashCardSpec;->getH()F

    move-result v2

    sub-float v2, v21, v2

    invoke-static {v1, v11, v2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v14

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v17

    const/16 v18, 0x33

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v10 .. v19}, Lcom/pymcl/android/ui/pages/DashCardSpec;->copy$default(Lcom/pymcl/android/ui/pages/DashCardSpec;Ljava/lang/String;Ljava/lang/String;FFFFIILjava/lang/Object;)Lcom/pymcl/android/ui/pages/DashCardSpec;

    move-result-object v2

    .line 109
    .end local v0    # "nx\\3":F
    .end local v1    # "ny\\3":F
    :goto_2
    nop

    .line 477
    .end local v10    # "it\\3":Lcom/pymcl/android/ui/pages/DashCardSpec;
    .end local v20    # "$i$a$-map-LaunchPageKt$DashCanvas$1$2$3$1$1$1\\3\\477\\0":I
    invoke-interface {v5, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p7

    move/from16 v2, v22

    goto/16 :goto_1

    .line 484
    .end local v9    # "item\\2":Ljava/lang/Object;
    .end local v22    # "step":F
    .local v2, "step":F
    :cond_2
    nop

    .end local v5    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\2\\475":I
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 475
    nop

    .line 104
    .end local v3    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map\\1\\104":I
    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
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

    .line 101
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$snap:Z

    iget-object v3, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$density:Landroidx/compose/ui/unit/Density;

    iget-object v4, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$onChange:Lkotlin/jvm/functions/Function1;

    iget-object v5, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$cards:Ljava/util/List;

    iget-object v6, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$spec:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iget v7, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$pxW:F

    iget v8, v0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$pxH:F

    new-instance v13, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;

    move-object v1, v13

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;-><init>(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FF)V

    const/4 v15, 0x7

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v9, p1

    move-object/from16 v14, p2

    invoke-static/range {v9 .. v16}, Landroidx/compose/foundation/gestures/DragGestureDetectorKt;->detectDragGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    .line 112
    return-object v1
.end method
