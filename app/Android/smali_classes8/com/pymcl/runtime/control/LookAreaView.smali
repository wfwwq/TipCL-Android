.class public final Lcom/pymcl/runtime/control/LookAreaView;
.super Lcom/pymcl/runtime/control/ControlElementView;
.source "ControlViews.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlViews.kt\ncom/pymcl/runtime/control/LookAreaView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0014J\u0008\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000e\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/LookAreaView;",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "context",
        "Landroid/content/Context;",
        "element",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "host",
        "Lcom/pymcl/runtime/control/ControlHost;",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V",
        "gesture",
        "Lcom/pymcl/runtime/input/LookGesture;",
        "tick",
        "com/pymcl/runtime/control/LookAreaView$tick$1",
        "Lcom/pymcl/runtime/control/LookAreaView$tick$1;",
        "onDraw",
        "",
        "c",
        "Landroid/graphics/Canvas;",
        "onGameTouch",
        "",
        "e",
        "Landroid/view/MotionEvent;",
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
.field private final gesture:Lcom/pymcl/runtime/input/LookGesture;

.field private final tick:Lcom/pymcl/runtime/control/LookAreaView$tick$1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V
    .locals 11
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "element"    # Lcom/pymcl/runtime/control/ControlElement;
    .param p3, "host"    # Lcom/pymcl/runtime/control/ControlHost;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/runtime/control/ControlElementView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    .line 176
    new-instance v1, Lcom/pymcl/runtime/input/LookGesture;

    invoke-interface {p3}, Lcom/pymcl/runtime/control/ControlHost;->getSink()Lcom/pymcl/runtime/input/InputSink;

    move-result-object v2

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/runtime/input/LookGesture;-><init>(Lcom/pymcl/runtime/input/InputSink;FJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    .line 177
    new-instance v0, Lcom/pymcl/runtime/control/LookAreaView$tick$1;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/LookAreaView$tick$1;-><init>(Lcom/pymcl/runtime/control/LookAreaView;)V

    iput-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView;->tick:Lcom/pymcl/runtime/control/LookAreaView$tick$1;

    .line 175
    return-void
.end method

.method public static final synthetic access$getGesture$p(Lcom/pymcl/runtime/control/LookAreaView;)Lcom/pymcl/runtime/input/LookGesture;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/control/LookAreaView;

    .line 175
    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    return-object v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 4
    .param p1, "c"    # Landroid/graphics/Canvas;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v0

    invoke-interface {v0}, Lcom/pymcl/runtime/control/ControlHost;->getEditing()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/control/LookAreaView;->drawBackground(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v0

    const/high16 v1, 0x41e00000    # 28.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElement;->getText()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 199
    const/4 v0, 0x0

    .line 178
    .local v0, "$i$a$-ifEmpty-LookAreaView$onDraw$1":I
    nop

    .end local v0    # "$i$a$-ifEmpty-LookAreaView$onDraw$1":I
    const-string v0, "\u89c6\u89d2\u533a"

    :cond_1
    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getTextPaint()Landroid/graphics/Paint;

    move-result-object v2

    invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method protected onGameTouch(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v1

    invoke-interface {v1}, Lcom/pymcl/runtime/control/ControlHost;->lookSensitivity()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/LookGesture;->setSensitivity(F)V

    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/LookAreaView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v1

    invoke-interface {v1}, Lcom/pymcl/runtime/control/ControlHost;->longPressMs()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/runtime/input/LookGesture;->setLongPressMs(J)V

    .line 181
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 182
    .local v0, "t":J
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 186
    :pswitch_0
    iget-object v2, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    goto :goto_0

    .line 184
    :pswitch_1
    iget-object v2, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/pymcl/runtime/input/LookGesture;->move(FFJ)V

    goto :goto_0

    .line 185
    :pswitch_2
    iget-object v2, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {v2, v0, v1}, Lcom/pymcl/runtime/input/LookGesture;->up(J)V

    goto :goto_0

    .line 183
    :pswitch_3
    iget-object v2, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v4

    invoke-virtual {v2, v3, v4, v0, v1}, Lcom/pymcl/runtime/input/LookGesture;->down(FFJ)V

    iget-object v2, p0, Lcom/pymcl/runtime/control/LookAreaView;->tick:Lcom/pymcl/runtime/control/LookAreaView$tick$1;

    check-cast v2, Ljava/lang/Runnable;

    const-wide/16 v3, 0x32

    invoke-virtual {p0, v2, v3, v4}, Lcom/pymcl/runtime/control/LookAreaView;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 188
    :goto_0
    const/4 v2, 0x1

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public releaseAll()V
    .locals 1

    .line 190
    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView;->gesture:Lcom/pymcl/runtime/input/LookGesture;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    return-void
.end method
