.class public final Lcom/pymcl/runtime/control/ButtonView;
.super Lcom/pymcl/runtime/control/ControlElementView;
.source "ControlViews.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlViews.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlViews.kt\ncom/pymcl/runtime/control/ButtonView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0008\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ButtonView;",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "context",
        "Landroid/content/Context;",
        "element",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "host",
        "Lcom/pymcl/runtime/control/ControlHost;",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V",
        "toggled",
        "",
        "onGameTouch",
        "e",
        "Landroid/view/MotionEvent;",
        "send",
        "",
        "press",
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
.field private slipped:Z

.field private slipX:F

.field private slipY:F

.field private toggled:Z


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

    .line 104
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/runtime/control/ControlElementView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V

    return-void
.end method

.method private final send(Z)V
    .locals 5
    .param p1, "press"    # Z

    .line 116
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/control/ButtonView;->setPressedState(Z)V

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->invalidate()V

    .line 117
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElement;->getKeys()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "k":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v3

    invoke-interface {v3}, Lcom/pymcl/runtime/control/ControlHost;->getSink()Lcom/pymcl/runtime/input/InputSink;

    move-result-object v3

    invoke-virtual {v2, v3, v1, p1}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 199
    .local v2, "it":Lcom/pymcl/runtime/input/Keys$Action;
    const/4 v3, 0x0

    .line 117
    .local v3, "$i$a$-let-ButtonView$send$1":I
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getHost()Lcom/pymcl/runtime/control/ControlHost;

    move-result-object v4

    invoke-interface {v4, v2}, Lcom/pymcl/runtime/control/ControlHost;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_0

    .end local v1    # "k":Ljava/lang/String;
    .end local v2    # "it":Lcom/pymcl/runtime/input/Keys$Action;
    .end local v3    # "$i$a$-let-ButtonView$send$1":I
    :cond_1
    goto :goto_0

    .line 118
    :cond_2
    return-void
.end method


# virtual methods
.method protected onGameTouch(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    # ACTION_UP / ACTION_CANCEL / ACTION_POINTER_UP: release and reset slip tracking
    :pswitch_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipped:Z

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElement;->getToggle()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ButtonView;->send(Z)V

    goto :goto_0

    # ACTION_MOVE: release the key once the finger slides well off the button
    :pswitch_2
    iget-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipped:Z

    if-nez v0, :goto_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iget v1, p0, Lcom/pymcl/runtime/control/ButtonView;->slipX:F

    sub-float/2addr v0, v1

    mul-float/2addr v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v1

    iget v2, p0, Lcom/pymcl/runtime/control/ButtonView;->slipY:F

    sub-float/2addr v1, v2

    mul-float/2addr v1, v1

    add-float/2addr v0, v1

    const/high16 v1, 0x44c80000    # 1600.0f (40px)^2

    cmpl-float v0, v0, v1

    if-lez v0, :goto_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipped:Z

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElement;->getToggle()Z

    move-result v0

    if-nez v0, :goto_0

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ButtonView;->send(Z)V

    goto :goto_0

    # ACTION_DOWN: remember start position for slip detection
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result v0

    iput v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result v0

    iput v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipY:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->slipped:Z

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElement;->getToggle()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->toggled:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->toggled:Z

    iget-boolean v0, p0, Lcom/pymcl/runtime/control/ButtonView;->toggled:Z

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ButtonView;->send(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ButtonView;->send(Z)V

    .line 113
    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public releaseAll()V
    .locals 2

    .line 119
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ButtonView;->getPressedState()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lcom/pymcl/runtime/control/ButtonView;->send(Z)V

    :cond_0
    iput-boolean v1, p0, Lcom/pymcl/runtime/control/ButtonView;->toggled:Z

    return-void
.end method
