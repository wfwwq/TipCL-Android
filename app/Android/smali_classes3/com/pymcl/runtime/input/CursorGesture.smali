.class public final Lcom/pymcl/runtime/input/CursorGesture;
.super Ljava/lang/Object;
.source "TouchGestures.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008#\n\u0002\u0010\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u0007J\u001e\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tJ\u001e\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tJ\u000e\u00103\u001a\u00020-2\u0006\u00101\u001a\u00020\tJ \u00104\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tH\u0002J \u00105\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tH\u0002J\u0006\u00106\u001a\u00020-R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0014R\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0014R\u001a\u0010\u001c\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001d\u0010\u0014\"\u0004\u0008\u001e\u0010\u0016R\u001a\u0010\u001f\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008 \u0010\u0014\"\u0004\u0008!\u0010\u0016R\u000e\u0010\"\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/CursorGesture;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "virtualMouse",
        "",
        "sensitivity",
        "",
        "tapMs",
        "",
        "slopPx",
        "doubleTapMs",
        "doubleTapSlackPx",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;ZFJFJF)V",
        "getVirtualMouse",
        "()Z",
        "setVirtualMouse",
        "(Z)V",
        "getSensitivity",
        "()F",
        "setSensitivity",
        "(F)V",
        "value",
        "cursorX",
        "getCursorX",
        "cursorY",
        "getCursorY",
        "screenW",
        "getScreenW",
        "setScreenW",
        "screenH",
        "getScreenH",
        "setScreenH",
        "lastX",
        "lastY",
        "downX",
        "downY",
        "downT",
        "moved",
        "dragging",
        "lastTapUpT",
        "lastTapX",
        "lastTapY",
        "place",
        "",
        "x",
        "y",
        "down",
        "t",
        "move",
        "up",
        "isDoubleTap",
        "rememberTap",
        "secondaryTap",
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
.field private cursorX:F

.field private cursorY:F

.field private final doubleTapMs:J

.field private final doubleTapSlackPx:F

.field private downT:J

.field private downX:F

.field private downY:F

.field private dragging:Z

.field private lastTapUpT:J

.field private lastTapX:F

.field private lastTapY:F

.field private lastX:F

.field private lastY:F

.field private moved:Z

.field private screenH:F

.field private screenW:F

.field private sensitivity:F

.field private final sink:Lcom/pymcl/runtime/input/InputSink;

.field private final slopPx:F

.field private final tapMs:J

.field private virtualMouse:Z


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;ZFJFJF)V
    .locals 1
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "virtualMouse"    # Z
    .param p3, "sensitivity"    # F
    .param p4, "tapMs"    # J
    .param p6, "slopPx"    # F
    .param p7, "doubleTapMs"    # J
    .param p9, "doubleTapSlackPx"    # F

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    iput-boolean p2, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    iput p3, p0, Lcom/pymcl/runtime/input/CursorGesture;->sensitivity:F

    .line 64
    iput-wide p4, p0, Lcom/pymcl/runtime/input/CursorGesture;->tapMs:J

    iput p6, p0, Lcom/pymcl/runtime/input/CursorGesture;->slopPx:F

    .line 65
    iput-wide p7, p0, Lcom/pymcl/runtime/input/CursorGesture;->doubleTapMs:J

    iput p9, p0, Lcom/pymcl/runtime/input/CursorGesture;->doubleTapSlackPx:F

    .line 68
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenW:F

    iput v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenH:F

    .line 63
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/InputSink;ZFJFJFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    .line 63
    and-int/lit8 v0, p10, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    and-int/lit8 v1, p10, 0x4

    if-eqz v1, :cond_1

    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p10, 0x8

    if-eqz v2, :cond_2

    .line 64
    const-wide/16 v2, 0xdc

    goto :goto_2

    .line 63
    :cond_2
    move-wide v2, p4

    :goto_2
    and-int/lit8 v4, p10, 0x10

    if-eqz v4, :cond_3

    .line 64
    const/high16 v4, 0x41200000    # 10.0f

    goto :goto_3

    .line 63
    :cond_3
    move v4, p6

    :goto_3
    and-int/lit8 v5, p10, 0x20

    if-eqz v5, :cond_4

    .line 65
    const-wide/16 v5, 0x118

    goto :goto_4

    .line 63
    :cond_4
    move-wide v5, p7

    :goto_4
    and-int/lit8 v7, p10, 0x40

    if-eqz v7, :cond_5

    .line 65
    const/high16 v7, 0x42400000    # 48.0f

    goto :goto_5

    .line 63
    :cond_5
    move/from16 v7, p9

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move p4, v0

    move p5, v1

    move-wide p6, v2

    move/from16 p8, v4

    move-wide/from16 p9, v5

    move/from16 p11, v7

    invoke-direct/range {p2 .. p11}, Lcom/pymcl/runtime/input/CursorGesture;-><init>(Lcom/pymcl/runtime/input/InputSink;ZFJFJF)V

    .line 65
    return-void
.end method

.method private final isDoubleTap(FFJ)Z
    .locals 4
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 114
    iget-wide v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapUpT:J

    sub-long v0, p3, v0

    iget-wide v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->doubleTapMs:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapX:F

    sub-float v0, p1, v0

    float-to-double v0, v0

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapY:F

    sub-float v2, p2, v2

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->doubleTapSlackPx:F

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final rememberTap(FFJ)V
    .locals 0
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 116
    iput-wide p3, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapUpT:J

    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapX:F

    iput p2, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastTapY:F

    return-void
.end method


# virtual methods
.method public final down(FFJ)V
    .locals 3
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 79
    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastX:F

    iput p2, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastY:F

    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    iput p2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    iput-wide p3, p0, Lcom/pymcl/runtime/input/CursorGesture;->downT:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->dragging:Z

    .line 80
    iget-boolean v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->place(FF)V

    iget-object v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    .line 81
    :cond_0
    return-void
.end method

.method public final getCursorX()F
    .locals 1

    .line 66
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorX:F

    return v0
.end method

.method public final getCursorY()F
    .locals 1

    .line 67
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorY:F

    return v0
.end method

.method public final getScreenH()F
    .locals 1

    .line 68
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenH:F

    return v0
.end method

.method public final getScreenW()F
    .locals 1

    .line 68
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenW:F

    return v0
.end method

.method public final getSensitivity()F
    .locals 1

    .line 63
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sensitivity:F

    return v0
.end method

.method public final getVirtualMouse()Z
    .locals 1

    .line 63
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    return v0
.end method

.method public final move(FFJ)V
    .locals 6
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 84
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    sub-float v0, p1, v0

    float-to-double v2, v0

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    sub-float v0, p2, v0

    float-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v2

    double-to-float v0, v2

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->slopPx:F

    cmpl-float v0, v0, v2

    if-lez v0, :cond_0

    iput-boolean v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    .line 85
    :cond_0
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    if-eqz v0, :cond_3

    .line 86
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    if-nez v0, :cond_1

    return-void

    .line 88
    :cond_1
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->dragging:Z

    if-nez v0, :cond_2

    iget-wide v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downT:J

    sub-long v2, p3, v2

    const-wide/16 v4, 0x15e

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastX:F

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    sub-float/2addr v0, v2

    float-to-double v2, v0

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastY:F

    iget v4, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    sub-float/2addr v0, v4

    float-to-double v4, v0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v2

    double-to-float v0, v2

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->slopPx:F

    cmpg-float v0, v0, v2

    if-gez v0, :cond_2

    .line 89
    iput-boolean v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->dragging:Z

    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    .line 91
    :cond_2
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorX:F

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastX:F

    sub-float v1, p1, v1

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->sensitivity:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorY:F

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastY:F

    sub-float v2, p2, v2

    iget v3, p0, Lcom/pymcl/runtime/input/CursorGesture;->sensitivity:F

    mul-float/2addr v2, v3

    add-float/2addr v1, v2

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/runtime/input/CursorGesture;->place(FF)V

    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->place(FF)V

    .line 93
    :goto_0
    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastX:F

    iput p2, p0, Lcom/pymcl/runtime/input/CursorGesture;->lastY:F

    .line 94
    return-void
.end method

.method public final place(FF)V
    .locals 3
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 75
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenW:F

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    iput v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorX:F

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenH:F

    invoke-static {p2, v1, v0}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v0

    iput v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorY:F

    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorX:F

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->cursorY:F

    invoke-interface {v0, v1, v2}, Lcom/pymcl/runtime/input/InputSink;->cursorPos(FF)V

    .line 76
    return-void
.end method

.method public final secondaryTap()V
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    return-void
.end method

.method public final setScreenH(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 68
    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenH:F

    return-void
.end method

.method public final setScreenW(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 68
    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->screenW:F

    return-void
.end method

.method public final setSensitivity(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 63
    iput p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->sensitivity:F

    return-void
.end method

.method public final setVirtualMouse(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 63
    iput-boolean p1, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    return-void
.end method

.method public final up(J)V
    .locals 6
    .param p1, "t"    # J

    .line 97
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->virtualMouse:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    .line 98
    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, v1, v1}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    .line 99
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downT:J

    sub-long v0, p1, v0

    iget-wide v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->tapMs:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->isDoubleTap(FFJ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    .line 100
    :cond_0
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downT:J

    sub-long v0, p1, v0

    iget-wide v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->tapMs:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_1

    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    iget v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->rememberTap(FFJ)V

    .line 101
    :cond_1
    return-void

    .line 103
    :cond_2
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->dragging:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, v1, v1}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    goto :goto_0

    .line 104
    :cond_3
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->moved:Z

    if-nez v0, :cond_4

    iget-wide v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downT:J

    sub-long v2, p1, v2

    iget-wide v4, p0, Lcom/pymcl/runtime/input/CursorGesture;->tapMs:J

    cmp-long v0, v2, v4

    if-gtz v0, :cond_4

    .line 106
    iget-object v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    iget v3, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    invoke-direct {p0, v2, v3, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->isDoubleTap(FFJ)Z

    move-result v2

    invoke-interface {v0, v2}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    .line 107
    iget v0, p0, Lcom/pymcl/runtime/input/CursorGesture;->downX:F

    iget v2, p0, Lcom/pymcl/runtime/input/CursorGesture;->downY:F

    invoke-direct {p0, v0, v2, p1, p2}, Lcom/pymcl/runtime/input/CursorGesture;->rememberTap(FFJ)V

    .line 109
    :cond_4
    :goto_0
    iput-boolean v1, p0, Lcom/pymcl/runtime/input/CursorGesture;->dragging:Z

    .line 110
    return-void
.end method
