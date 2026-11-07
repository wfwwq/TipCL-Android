.class public final Lcom/pymcl/runtime/input/LookGesture;
.super Ljava/lang/Object;
.source "TouchGestures.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u001e\u0010\'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010(\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010)\u001a\u00020#2\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010*\u001a\u00020#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0008\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011\"\u0004\u0008\u0015\u0010\u0013R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!\u00a8\u0006+"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/LookGesture;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "sensitivity",
        "",
        "longPressMs",
        "",
        "tapMs",
        "slopPx",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;FJJF)V",
        "getSensitivity",
        "()F",
        "setSensitivity",
        "(F)V",
        "getLongPressMs",
        "()J",
        "setLongPressMs",
        "(J)V",
        "getTapMs",
        "setTapMs",
        "downX",
        "downY",
        "lastX",
        "lastY",
        "downT",
        "moved",
        "",
        "breaking",
        "value",
        "active",
        "getActive",
        "()Z",
        "down",
        "",
        "x",
        "y",
        "t",
        "move",
        "checkLongPress",
        "up",
        "cancel",
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
.field private active:Z

.field private breaking:Z

.field private downT:J

.field private downX:F

.field private downY:F

.field private lastX:F

.field private lastY:F

.field private longPressMs:J

.field private moved:Z

.field private sensitivity:F

.field private final sink:Lcom/pymcl/runtime/input/InputSink;

.field private final slopPx:F

.field private tapMs:J


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;FJJF)V
    .locals 1
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "sensitivity"    # F
    .param p3, "longPressMs"    # J
    .param p5, "tapMs"    # J
    .param p7, "slopPx"    # F

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 12
    iput p2, p0, Lcom/pymcl/runtime/input/LookGesture;->sensitivity:F

    .line 13
    iput-wide p3, p0, Lcom/pymcl/runtime/input/LookGesture;->longPressMs:J

    .line 14
    iput-wide p5, p0, Lcom/pymcl/runtime/input/LookGesture;->tapMs:J

    .line 15
    iput p7, p0, Lcom/pymcl/runtime/input/LookGesture;->slopPx:F

    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/InputSink;FJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    .line 10
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    goto :goto_0

    .line 10
    :cond_0
    move v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    .line 13
    const-wide/16 v1, 0x12c

    goto :goto_1

    .line 10
    :cond_1
    move-wide v1, p3

    :goto_1
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_2

    .line 14
    const-wide/16 v3, 0xc8

    goto :goto_2

    .line 10
    :cond_2
    move-wide v3, p5

    :goto_2
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_3

    .line 15
    const/high16 v5, 0x41c00000    # 24.0f

    goto :goto_3

    .line 10
    :cond_3
    move v5, p7

    :goto_3
    move-object p2, p0

    move-object p3, p1

    move p4, v0

    move-wide p5, v1

    move-wide p7, v3

    move p9, v5

    invoke-direct/range {p2 .. p9}, Lcom/pymcl/runtime/input/LookGesture;-><init>(Lcom/pymcl/runtime/input/InputSink;FJJF)V

    .line 16
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    .line 53
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v0, v1, v1}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    :cond_0
    iput-boolean v1, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    iput-boolean v1, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    return-void
.end method

.method public final checkLongPress(J)V
    .locals 4
    .param p1, "t"    # J

    .line 38
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/pymcl/runtime/input/LookGesture;->downT:J

    sub-long v0, p1, v0

    iget-wide v2, p0, Lcom/pymcl/runtime/input/LookGesture;->longPressMs:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 39
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    iget-object v1, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    .line 41
    :cond_0
    return-void
.end method

.method public final down(FFJ)V
    .locals 1
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 24
    iput p1, p0, Lcom/pymcl/runtime/input/LookGesture;->downX:F

    iput p2, p0, Lcom/pymcl/runtime/input/LookGesture;->downY:F

    iput p1, p0, Lcom/pymcl/runtime/input/LookGesture;->lastX:F

    iput p2, p0, Lcom/pymcl/runtime/input/LookGesture;->lastY:F

    iput-wide p3, p0, Lcom/pymcl/runtime/input/LookGesture;->downT:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    .line 25
    return-void
.end method

.method public final getActive()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    return v0
.end method

.method public final getLongPressMs()J
    .locals 2

    .line 13
    iget-wide v0, p0, Lcom/pymcl/runtime/input/LookGesture;->longPressMs:J

    return-wide v0
.end method

.method public final getSensitivity()F
    .locals 1

    .line 12
    iget v0, p0, Lcom/pymcl/runtime/input/LookGesture;->sensitivity:F

    return v0
.end method

.method public final getTapMs()J
    .locals 2

    .line 14
    iget-wide v0, p0, Lcom/pymcl/runtime/input/LookGesture;->tapMs:J

    return-wide v0
.end method

.method public final move(FFJ)V
    .locals 5
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "t"    # J

    .line 28
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    if-nez v0, :cond_0

    return-void

    .line 29
    :cond_0
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    if-nez v0, :cond_1

    iget v0, p0, Lcom/pymcl/runtime/input/LookGesture;->downX:F

    sub-float v0, p1, v0

    float-to-double v0, v0

    iget v2, p0, Lcom/pymcl/runtime/input/LookGesture;->downY:F

    sub-float v2, p2, v2

    float-to-double v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v0

    double-to-float v0, v0

    iget v1, p0, Lcom/pymcl/runtime/input/LookGesture;->slopPx:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    .line 30
    :cond_1
    iget v0, p0, Lcom/pymcl/runtime/input/LookGesture;->lastX:F

    sub-float v0, p1, v0

    .local v0, "dx":F
    iget v1, p0, Lcom/pymcl/runtime/input/LookGesture;->lastY:F

    sub-float v1, p2, v1

    .line 31
    .local v1, "dy":F
    iput p1, p0, Lcom/pymcl/runtime/input/LookGesture;->lastX:F

    iput p2, p0, Lcom/pymcl/runtime/input/LookGesture;->lastY:F

    .line 32
    iget-boolean v2, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    if-eqz v2, :cond_3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-gtz v2, :cond_2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v2, v2, v3

    if-lez v2, :cond_3

    :cond_2
    iget-object v2, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget v3, p0, Lcom/pymcl/runtime/input/LookGesture;->sensitivity:F

    mul-float/2addr v3, v0

    iget v4, p0, Lcom/pymcl/runtime/input/LookGesture;->sensitivity:F

    mul-float/2addr v4, v1

    invoke-interface {v2, v3, v4}, Lcom/pymcl/runtime/input/InputSink;->lookDelta(FF)V

    .line 33
    :cond_3
    invoke-virtual {p0, p3, p4}, Lcom/pymcl/runtime/input/LookGesture;->checkLongPress(J)V

    .line 34
    return-void
.end method

.method public final setLongPressMs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 13
    iput-wide p1, p0, Lcom/pymcl/runtime/input/LookGesture;->longPressMs:J

    return-void
.end method

.method public final setSensitivity(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 12
    iput p1, p0, Lcom/pymcl/runtime/input/LookGesture;->sensitivity:F

    return-void
.end method

.method public final setTapMs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 14
    iput-wide p1, p0, Lcom/pymcl/runtime/input/LookGesture;->tapMs:J

    return-void
.end method

.method public final up(J)V
    .locals 7
    .param p1, "t"    # J

    .line 44
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    if-nez v0, :cond_0

    return-void

    .line 45
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->active:Z

    .line 46
    nop

    .line 47
    iget-boolean v1, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v1, v0, v0}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    goto :goto_0

    .line 48
    :cond_1
    iget-boolean v1, p0, Lcom/pymcl/runtime/input/LookGesture;->moved:Z

    if-nez v1, :cond_2

    iget-wide v1, p0, Lcom/pymcl/runtime/input/LookGesture;->downT:J

    sub-long v1, p1, v1

    iget-wide v3, p0, Lcom/pymcl/runtime/input/LookGesture;->tapMs:J

    iget-wide v5, p0, Lcom/pymcl/runtime/input/LookGesture;->longPressMs:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtMost(JJ)J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_2

    iget-object v1, p0, Lcom/pymcl/runtime/input/LookGesture;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    .line 50
    :cond_2
    :goto_0
    iput-boolean v0, p0, Lcom/pymcl/runtime/input/LookGesture;->breaking:Z

    .line 51
    return-void
.end method
