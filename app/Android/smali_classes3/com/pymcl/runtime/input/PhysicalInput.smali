.class public final Lcom/pymcl/runtime/input/PhysicalInput;
.super Ljava/lang/Object;
.source "PhysicalInput.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;,
        Lcom/pymcl/runtime/input/PhysicalInput$Companion;,
        Lcom/pymcl/runtime/input/PhysicalInput$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0006\u0010\u001a\u001a\u00020\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/PhysicalInput;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "settings",
        "Lcom/pymcl/runtime/input/InputSettings;",
        "callbacks",
        "Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/InputSettings;Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)V",
        "gamepad",
        "Lcom/pymcl/runtime/input/GamepadMapper;",
        "getGamepad",
        "()Lcom/pymcl/runtime/input/GamepadMapper;",
        "lastButtons",
        "",
        "onKey",
        "",
        "e",
        "Landroid/view/KeyEvent;",
        "onGenericMotion",
        "Landroid/view/MotionEvent;",
        "onCapturedPointer",
        "syncButtons",
        "",
        "state",
        "reset",
        "Callbacks",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;


# instance fields
.field private final callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

.field private final gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

.field private lastButtons:I

.field private final settings:Lcom/pymcl/runtime/input/InputSettings;

.field private final sink:Lcom/pymcl/runtime/input/InputSink;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/PhysicalInput$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/PhysicalInput;->Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/InputSettings;Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)V
    .locals 8
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "settings"    # Lcom/pymcl/runtime/input/InputSettings;
    .param p3, "callbacks"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callbacks"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 14
    iput-object p2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    .line 15
    iput-object p3, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    .line 29
    new-instance v1, Lcom/pymcl/runtime/input/GamepadMapper;

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/InputSettings;->getGamepadDeadzone()F

    move-result v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/runtime/input/GamepadMapper;-><init>(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/pymcl/runtime/input/PhysicalInput;->gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

    .line 12
    return-void
.end method

.method private final syncButtons(I)V
    .locals 3
    .param p1, "state"    # I

    .line 111
    iget v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->lastButtons:I

    xor-int/2addr v0, p1

    .line 113
    .local v0, "changed":I
    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p0, p1, v2, v1}, Lcom/pymcl/runtime/input/PhysicalInput;->syncButtons$chk(ILcom/pymcl/runtime/input/PhysicalInput;III)V

    .line 114
    const/4 v1, 0x2

    invoke-static {v0, p0, p1, v1, v2}, Lcom/pymcl/runtime/input/PhysicalInput;->syncButtons$chk(ILcom/pymcl/runtime/input/PhysicalInput;III)V

    .line 115
    const/4 v2, 0x4

    invoke-static {v0, p0, p1, v2, v1}, Lcom/pymcl/runtime/input/PhysicalInput;->syncButtons$chk(ILcom/pymcl/runtime/input/PhysicalInput;III)V

    .line 116
    iput p1, p0, Lcom/pymcl/runtime/input/PhysicalInput;->lastButtons:I

    .line 117
    return-void
.end method

.method private static final syncButtons$chk(ILcom/pymcl/runtime/input/PhysicalInput;III)V
    .locals 2
    .param p0, "changed"    # I
    .param p1, "this$0"    # Lcom/pymcl/runtime/input/PhysicalInput;
    .param p2, "$state"    # I
    .param p3, "mask"    # I
    .param p4, "btn"    # I

    .line 112
    and-int v0, p0, p3

    if-eqz v0, :cond_1

    iget-object v0, p1, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    and-int v1, p2, p3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, p4, v1}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

    return-object v0
.end method

.method public final onCapturedPointer(Landroid/view/MotionEvent;)Z
    .locals 13
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 97
    const/16 v1, 0x8

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/16 v1, 0x9

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    float-to-double v3, v1

    invoke-interface {v0, v3, v4}, Lcom/pymcl/runtime/input/InputSink;->scroll(D)V

    return v2

    .line 99
    :cond_0
    const/16 v0, 0x1b

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    .local v1, "dx":F
    const/16 v3, 0x1c

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v4

    .line 100
    .local v4, "dy":F
    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    const/4 v7, 0x0

    if-nez v6, :cond_1

    move v6, v2

    goto :goto_0

    :cond_1
    move v6, v7

    :goto_0
    if-eqz v6, :cond_3

    cmpg-float v6, v4, v5

    if-nez v6, :cond_2

    move v6, v2

    goto :goto_1

    :cond_2
    move v6, v7

    :goto_1
    if-eqz v6, :cond_3

    const v6, 0x100008

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->isFromSource(I)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    .line 101
    :cond_3
    const/4 v6, 0x0

    .local v6, "i":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result v8

    :goto_2
    if-ge v6, v8, :cond_4

    .line 102
    iget-object v9, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {p1, v0, v6}, Landroid/view/MotionEvent;->getHistoricalAxisValue(II)F

    move-result v10

    iget-object v11, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v11}, Lcom/pymcl/runtime/input/InputSettings;->getMouseSensitivity()F

    move-result v11

    mul-float/2addr v10, v11

    .line 103
    invoke-virtual {p1, v3, v6}, Landroid/view/MotionEvent;->getHistoricalAxisValue(II)F

    move-result v11

    iget-object v12, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v12}, Lcom/pymcl/runtime/input/InputSettings;->getMouseSensitivity()F

    move-result v12

    mul-float/2addr v11, v12

    .line 102
    invoke-interface {v9, v10, v11}, Lcom/pymcl/runtime/input/InputSink;->lookDelta(FF)V

    .line 101
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 105
    .end local v6    # "i":I
    :cond_4
    cmpg-float v0, v1, v5

    if-nez v0, :cond_5

    move v0, v2

    goto :goto_3

    :cond_5
    move v0, v7

    :goto_3
    if-eqz v0, :cond_7

    cmpg-float v0, v4, v5

    if-nez v0, :cond_6

    move v7, v2

    :cond_6
    if-nez v7, :cond_8

    :cond_7
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget-object v3, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v3}, Lcom/pymcl/runtime/input/InputSettings;->getMouseSensitivity()F

    move-result v3

    mul-float/2addr v3, v1

    iget-object v5, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v5}, Lcom/pymcl/runtime/input/InputSettings;->getMouseSensitivity()F

    move-result v5

    mul-float/2addr v5, v4

    invoke-interface {v0, v3, v5}, Lcom/pymcl/runtime/input/InputSink;->lookDelta(FF)V

    .line 106
    :cond_8
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/input/PhysicalInput;->syncButtons(I)V

    .line 107
    return v2
.end method

.method public final onGenericMotion(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/InputSettings;->getGamepadEnabled()Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lcom/pymcl/runtime/input/GamepadMapper;->Companion:Lcom/pymcl/runtime/input/GamepadMapper$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/GamepadMapper$Companion;->isGamepad(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->gamepadRoute()Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v0

    sget-object v1, Lcom/pymcl/runtime/input/PhysicalInput$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadRoute;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 81
    :pswitch_0
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/GamepadMapper;->onMotion(Landroid/view/MotionEvent;)Z

    move-result v2

    goto :goto_0

    .line 80
    :pswitch_1
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadMotion(Landroid/view/MotionEvent;)Z

    move-result v2

    goto :goto_0

    .line 79
    :pswitch_2
    nop

    .line 78
    :goto_0
    return v2

    .line 84
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->isFromSource(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    return v1

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->onExternalMouseUsed()V

    .line 86
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    .line 91
    :pswitch_3
    return v1

    .line 89
    :pswitch_4
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->isGrabbed()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-interface {v0, v1, v3}, Lcom/pymcl/runtime/input/InputSink;->cursorPos(FF)V

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/input/PhysicalInput;->syncButtons(I)V

    return v2

    .line 87
    :pswitch_5
    const/16 v0, 0x9

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v0

    .local v0, "v":F
    const/4 v3, 0x0

    cmpg-float v3, v0, v3

    if-nez v3, :cond_3

    move v1, v2

    :cond_3
    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    float-to-double v3, v0

    invoke-interface {v1, v3, v4}, Lcom/pymcl/runtime/input/InputSink;->scroll(D)V

    :cond_4
    return v2

    .line 88
    .end local v0    # "v":F
    :pswitch_6
    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->isGrabbed()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-interface {v0, v1, v3}, Lcom/pymcl/runtime/input/InputSink;->cursorPos(FF)V

    :cond_5
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_6
        :pswitch_5
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final onKey(Landroid/view/KeyEvent;)Z
    .locals 7
    .param p1, "e"    # Landroid/view/KeyEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_14

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto/16 :goto_3

    .line 45
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-eq v0, v2, :cond_13

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x19

    if-ne v0, v2, :cond_1

    goto/16 :goto_2

    .line 46
    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getFlags()I

    move-result v0

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_2

    return v1

    .line 47
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v3

    .line 48
    .local v0, "down":Z
    :goto_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    const/4 v4, 0x4

    if-ne v2, v4, :cond_4

    sget-object v2, Lcom/pymcl/runtime/input/PhysicalInput;->Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Companion;->isMouseOriginated(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 49
    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v2, v1, v0}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    return v1

    .line 52
    :cond_4
    sget-object v2, Lcom/pymcl/runtime/input/PhysicalInput;->Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Companion;->isSoftKeyboard(Landroid/view/KeyEvent;)Z

    move-result v2

    const/16 v5, 0x42

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    if-ne v2, v5, :cond_5

    goto :goto_1

    :cond_5
    move v1, v3

    :goto_1
    return v1

    .line 54
    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    iget-object v6, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v6}, Lcom/pymcl/runtime/input/InputSettings;->getImeHotkey()I

    move-result v6

    if-ne v2, v6, :cond_8

    if-nez v0, :cond_7

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->toggleIme()V

    :cond_7
    return v1

    .line 55
    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    iget-object v6, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v6}, Lcom/pymcl/runtime/input/InputSettings;->getCapturePointerHotkey()I

    move-result v6

    if-ne v2, v6, :cond_a

    if-nez v0, :cond_9

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->togglePointerCapture()V

    :cond_9
    return v1

    .line 56
    :cond_a
    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->getGamepadEnabled()Z

    move-result v2

    if-eqz v2, :cond_b

    sget-object v2, Lcom/pymcl/runtime/input/GamepadMapper;->Companion:Lcom/pymcl/runtime/input/GamepadMapper$Companion;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/GamepadMapper$Companion;->isGamepad(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 57
    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->gamepadRoute()Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v2

    sget-object v6, Lcom/pymcl/runtime/input/PhysicalInput$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadRoute;->ordinal()I

    move-result v2

    aget v2, v6, v2

    packed-switch v2, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 60
    :pswitch_0
    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/GamepadMapper;->onKey(Landroid/view/KeyEvent;)Z

    move-result v2

    if-eqz v2, :cond_b

    return v1

    .line 59
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v1, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadKey(Landroid/view/KeyEvent;)Z

    move-result v1

    return v1

    .line 58
    :pswitch_2
    return v1

    .line 63
    :cond_b
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    if-ne v2, v4, :cond_d

    if-nez v0, :cond_c

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v2, v1}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    :cond_c
    return v1

    .line 65
    :cond_d
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    if-eq v2, v5, :cond_e

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    const/16 v4, 0xa0

    if-ne v2, v4, :cond_10

    .line 66
    :cond_e
    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->getEnterOpensIme()Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->isGrabbed()Z

    move-result v2

    if-nez v2, :cond_10

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->imeShowing()Z

    move-result v2

    if-nez v2, :cond_10

    if-nez v0, :cond_f

    iget-object v2, p0, Lcom/pymcl/runtime/input/PhysicalInput;->callbacks:Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-interface {v2}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->toggleIme()V

    :cond_f
    return v1

    .line 68
    :cond_10
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-static {v2}, Lcom/tungsten/fclauncher/keycodes/AndroidKeycodeMap;->convertKeycode(I)I

    move-result v2

    .line 69
    .local v2, "code":I
    const/16 v4, 0xf0

    if-ne v2, v4, :cond_11

    return v3

    .line 70
    :cond_11
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v3

    if-nez v3, :cond_12

    iget-object v3, p0, Lcom/pymcl/runtime/input/PhysicalInput;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v3, v2, v0}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 72
    :cond_12
    return v1

    .line 45
    .end local v0    # "down":Z
    .end local v2    # "code":I
    :cond_13
    :goto_2
    return v3

    .line 44
    :cond_14
    :goto_3
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final reset()V
    .locals 1

    .line 119
    const/4 v0, 0x0

    iput v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->lastButtons:I

    iget-object v0, p0, Lcom/pymcl/runtime/input/PhysicalInput;->gamepad:Lcom/pymcl/runtime/input/GamepadMapper;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapper;->releaseAll()V

    return-void
.end method
