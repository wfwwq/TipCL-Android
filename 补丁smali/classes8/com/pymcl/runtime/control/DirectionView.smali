.class public final Lcom/pymcl/runtime/control/DirectionView;
.super Lcom/pymcl/runtime/control/ControlElementView;
.source "ControlViews.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlViews.kt\ncom/pymcl/runtime/control/DirectionView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0008\u0010\u001a\u001a\u00020\u0012H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/DirectionView;",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "context",
        "Landroid/content/Context;",
        "element",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "host",
        "Lcom/pymcl/runtime/control/ControlHost;",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V",
        "state",
        "",
        "knobX",
        "",
        "knobY",
        "sprinting",
        "",
        "onDraw",
        "",
        "c",
        "Landroid/graphics/Canvas;",
        "onGameTouch",
        "e",
        "Landroid/view/MotionEvent;",
        "apply",
        "next",
        "releaseAll",
        "PyMCL-Android:runtime_debug"
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
.field private knobX:F

.field private knobY:F

.field private sprinting:Z

.field private state:[Z

.field private touchId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "element"    # Lcom/pymcl/runtime/control/ControlElement;
    .param p3, "host"    # Lcom/pymcl/runtime/control/ControlHost;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/runtime/control/ControlElementView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    .line 124
    const/4 v0, 0x4

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/pymcl/runtime/control/DirectionView;->state:[Z

    const/4 v0, -1

    iput v0, p0, Lcom/pymcl/runtime/control/DirectionView;->touchId:I

    .line 123
    return-void
.end method

.method private final apply([Z)V
    .locals 6
    .param p1, "next"    # [Z

    .line 164
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    aget-boolean v1, p1, v0

    iget-object v2, p0, Lcom/pymcl/runtime/control/DirectionView;->state:[Z

    aget-boolean v2, v2, v0

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlElement;->getKeys()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 199
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 164
    .local v2, "$i$a$-let-DirectionView$apply$1":I
    sget-object v3, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v4

    invoke-interface {v4}, Lcom/pymcl/runtime/control/ControlHost;->getSink()Lcom/pymcl/runtime/input/InputSink;

    move-result-object v4

    aget-boolean v5, p1, v0

    invoke-virtual {v3, v4, v1, v5}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-DirectionView$apply$1":I
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 165
    .end local v0    # "i":I
    :cond_1
    iput-object p1, p0, Lcom/pymcl/runtime/control/DirectionView;->state:[Z

    .line 166
    return-void
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 18
    .param p1, "c"    # Landroid/graphics/Canvas;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "c"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .local v2, "cx":F
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getHeight()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v3

    .local v4, "cy":F
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getHeight()I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v3

    const/high16 v3, 0x40800000    # 4.0f

    sub-float/2addr v5, v3

    .line 130
    .local v5, "r":F
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getFill()Landroid/graphics/Paint;

    move-result-object v3

    const/16 v6, 0x6e

    const/16 v7, 0x1e

    invoke-static {v6, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getFill()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 131
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getStroke()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getEditSelected()Z

    move-result v6

    const/16 v7, 0xc8

    if-eqz v6, :cond_0

    const/16 v6, -0x100

    goto :goto_0

    :cond_0
    const/16 v6, 0xff

    invoke-static {v7, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    :goto_0
    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getStroke()Landroid/graphics/Paint;

    move-result-object v3

    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 132
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getType()Lcom/pymcl/runtime/control/ElementType;

    move-result-object v3

    sget-object v6, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    const v8, 0x3f19999a    # 0.6f

    if-ne v3, v6, :cond_1

    .line 133
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getFill()Landroid/graphics/Paint;

    move-result-object v3

    const/16 v6, 0xdc

    invoke-static {v7, v6, v6, v6}, Landroid/graphics/Color;->argb(IIII)I

    move-result v6

    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setColor(I)V

    iget v3, v0, Lcom/pymcl/runtime/control/DirectionView;->knobX:F

    mul-float/2addr v3, v5

    mul-float/2addr v3, v8

    add-float/2addr v3, v2

    iget v6, v0, Lcom/pymcl/runtime/control/DirectionView;->knobY:F

    mul-float/2addr v6, v5

    mul-float/2addr v6, v8

    add-float/2addr v6, v4

    const v7, 0x3ec28f5c    # 0.38f

    mul-float/2addr v7, v5

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getFill()Landroid/graphics/Paint;

    move-result-object v8

    invoke-virtual {v1, v3, v6, v7, v8}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    goto/16 :goto_3

    .line 135
    :cond_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v3

    const v6, 0x3eb33333    # 0.35f

    mul-float/2addr v6, v5

    invoke-virtual {v3, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 136
    const/4 v3, 0x4

    new-array v6, v3, [Ljava/lang/String;

    const-string v9, "\u25b2"

    const/4 v10, 0x0

    aput-object v9, v6, v10

    const-string v9, "\u25bc"

    const/4 v11, 0x1

    aput-object v9, v6, v11

    const-string v9, "\u25c0"

    const/4 v12, 0x2

    aput-object v9, v6, v12

    const-string v9, "\u25b6"

    const/4 v13, 0x3

    aput-object v9, v6, v13

    .local v6, "labels":[Ljava/lang/String;
    new-array v9, v3, [Lkotlin/Pair;

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    const v16, -0x40e66666    # -0.6f

    move/from16 v17, v8

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v9, v10

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v9, v11

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v9, v12

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v14}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v9, v13

    .line 137
    .local v9, "pos":[Lkotlin/Pair;
    const/4 v8, 0x0

    .local v8, "i":I
    :goto_1
    if-ge v8, v3, :cond_3

    .line 138
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v10

    iget-object v11, v0, Lcom/pymcl/runtime/control/DirectionView;->state:[Z

    aget-boolean v11, v11, v8

    if-eqz v11, :cond_2

    const/16 v11, 0x2e

    const/16 v12, 0x78

    invoke-static {v11, v7, v12}, Landroid/graphics/Color;->rgb(III)I

    move-result v11

    goto :goto_2

    :cond_2
    const/4 v11, -0x1

    :goto_2
    invoke-virtual {v10, v11}, Landroid/graphics/Paint;->setColor(I)V

    .line 139
    aget-object v10, v6, v8

    aget-object v11, v9, v8

    invoke-virtual {v11}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->floatValue()F

    move-result v11

    mul-float/2addr v11, v5

    add-float/2addr v11, v2

    aget-object v12, v9, v8

    invoke-virtual {v12}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v12

    mul-float/2addr v12, v5

    add-float/2addr v12, v4

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v14

    invoke-virtual {v14}, Landroid/graphics/Paint;->getTextSize()F

    move-result v14

    int-to-float v15, v13

    div-float/2addr v14, v15

    add-float/2addr v12, v14

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DirectionView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v14

    invoke-virtual {v1, v10, v11, v12, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 137
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 142
    .end local v6    # "labels":[Ljava/lang/String;
    .end local v8    # "i":I
    .end local v9    # "pos":[Lkotlin/Pair;
    :cond_3
    :goto_3
    return-void
.end method

.method protected onGameTouch(Landroid/view/MotionEvent;)Z
    .locals 12
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    # UP / CANCEL: release keys and forget the tracked pointer
    :pswitch_0
    const/4 v0, -1

    iput v0, p0, Lcom/pymcl/runtime/control/DirectionView;->touchId:I

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->releaseAll()V

    goto/16 :goto_1

    # DOWN: remember which pointer owns the joystick
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lcom/pymcl/runtime/control/DirectionView;->touchId:I

    move v11, v2

    goto/16 :goto_2

    # MOVE: only follow the tracked pointer
    :pswitch_1
    iget v0, p0, Lcom/pymcl/runtime/control/DirectionView;->touchId:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndexById(I)I

    move-result v11

    if-gez v11, :goto_2

    goto/16 :goto_1

    :goto_2
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-virtual {p1, v11}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v4, v2

    sub-float/2addr v3, v4

    div-float/2addr v3, v0

    invoke-virtual {p1, v11}, Landroid/view/MotionEvent;->getY(I)F

    move-result v4

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getHeight()I

    move-result v5

    int-to-float v5, v5

    div-float/2addr v5, v2

    sub-float/2addr v4, v5

    div-float/2addr v4, v0

    float-to-double v5, v3

    float-to-double v7, v4

    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v2, v5

    const/high16 v5, 0x3f800000    # 1.0f

    cmpl-float v5, v2, v5

    if-lez v5, :cond_0

    div-float/2addr v3, v2

    div-float/2addr v4, v2

    :cond_0
    move v6, v3

    move v7, v4

    iput v6, p0, Lcom/pymcl/runtime/control/DirectionView;->knobX:F

    iput v7, p0, Lcom/pymcl/runtime/control/DirectionView;->knobY:F

    sget-object v5, Lcom/pymcl/runtime/control/DirectionMath;->INSTANCE:Lcom/pymcl/runtime/control/DirectionMath;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/pymcl/runtime/control/DirectionMath;->directions$default(Lcom/pymcl/runtime/control/DirectionMath;FFFILjava/lang/Object;)[Z

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/pymcl/runtime/control/DirectionView;->apply([Z)V

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getSprintKey()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/pymcl/runtime/control/ControlElement;->getSprintThreshold()F

    move-result v4

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_1

    const/4 v4, 0x0

    cmpg-float v4, v7, v4

    if-gez v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    iget-boolean v5, p0, Lcom/pymcl/runtime/control/DirectionView;->sprinting:Z

    if-eq v4, v5, :cond_2

    iput-boolean v4, p0, Lcom/pymcl/runtime/control/DirectionView;->sprinting:Z

    sget-object v5, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v8

    invoke-interface {v8}, Lcom/pymcl/runtime/control/ControlHost;->getSink()Lcom/pymcl/runtime/input/InputSink;

    move-result-object v8

    invoke-virtual {v5, v8, v3, v4}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->invalidate()V

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public releaseAll()V
    .locals 5

    .line 169
    const/4 v0, 0x4

    new-array v0, v0, [Z

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/DirectionView;->apply([Z)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/pymcl/runtime/control/DirectionView;->knobX:F

    iput v0, p0, Lcom/pymcl/runtime/control/DirectionView;->knobY:F

    .line 170
    iget-boolean v0, p0, Lcom/pymcl/runtime/control/DirectionView;->sprinting:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/DirectionView;->sprinting:Z

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlElement;->getSprintKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 199
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 170
    .local v2, "$i$a$-let-DirectionView$releaseAll$1":I
    sget-object v3, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v4

    invoke-interface {v4}, Lcom/pymcl/runtime/control/ControlHost;->getSink()Lcom/pymcl/runtime/input/InputSink;

    move-result-object v4

    invoke-virtual {v3, v4, v1, v0}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    .line 171
    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-DirectionView$releaseAll$1":I
    :cond_0
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/DirectionView;->invalidate()V

    .line 172
    return-void
.end method
