.class Lorg/libsdl/app/SDLGenericMotionListener_API14;
.super Ljava/lang/Object;
.source "SDLControllerManager.java"

# interfaces
.implements Landroid/view/View$OnGenericMotionListener;


# static fields
.field protected static final SDL_PEN_DEVICE_TYPE_DIRECT:I = 0x1

.field protected static final SDL_PEN_DEVICE_TYPE_INDIRECT:I = 0x2

.field protected static final SDL_PEN_DEVICE_TYPE_UNKNOWN:I


# direct methods
.method constructor <init>()V
    .locals 0

    .line 769
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method checkRelativeEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 855
    invoke-virtual {p0}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->inRelativeMode()Z

    move-result v0

    return v0
.end method

.method getEventX(Landroid/view/MotionEvent;I)F
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;
    .param p2, "pointerIndex"    # I

    .line 859
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    return v0
.end method

.method getEventY(Landroid/view/MotionEvent;I)F
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;
    .param p2, "pointerIndex"    # I

    .line 863
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    return v0
.end method

.method getPenDeviceType(Landroid/view/InputDevice;)I
    .locals 1
    .param p1, "penDevice"    # Landroid/view/InputDevice;

    .line 867
    const/4 v0, 0x0

    return v0
.end method

.method inRelativeMode()Z
    .locals 1

    .line 843
    const/4 v0, 0x0

    return v0
.end method

.method public onGenericMotion(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 12
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .line 777
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    const v1, 0x1000010

    if-ne v0, v1, :cond_0

    .line 778
    invoke-static {p2}, Lorg/libsdl/app/SDLControllerManager;->handleJoystickMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0

    .line 781
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v4

    .line 782
    .local v4, "action":I
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 783
    .local v0, "pointerCount":I
    const/4 v1, 0x0

    .line 785
    .local v1, "consumed":Z
    const/4 v2, 0x0

    move v8, v1

    move v9, v2

    .end local v1    # "consumed":Z
    .local v8, "consumed":Z
    .local v9, "i":I
    :goto_0
    if-ge v9, v0, :cond_7

    .line 786
    invoke-virtual {p2, v9}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result v10

    .line 788
    .local v10, "toolType":I
    const/4 v1, 0x3

    const/4 v2, 0x0

    if-ne v10, v1, :cond_1

    .line 789
    packed-switch v4, :pswitch_data_0

    .line 806
    goto/16 :goto_3

    .line 791
    :pswitch_0
    const/16 v1, 0xa

    invoke-virtual {p2, v1, v9}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v1

    .line 792
    .local v1, "x":F
    const/16 v3, 0x9

    invoke-virtual {p2, v3, v9}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v3

    .line 793
    .local v3, "y":F
    invoke-static {v2, v4, v1, v3, v2}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 794
    const/4 v2, 0x1

    .line 795
    .end local v8    # "consumed":Z
    .local v2, "consumed":Z
    move v8, v2

    goto :goto_3

    .line 798
    .end local v1    # "x":F
    .end local v2    # "consumed":Z
    .end local v3    # "y":F
    .restart local v8    # "consumed":Z
    :pswitch_1
    invoke-virtual {p0, p2, v9}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->getEventX(Landroid/view/MotionEvent;I)F

    move-result v1

    .line 799
    .restart local v1    # "x":F
    invoke-virtual {p0, p2, v9}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->getEventY(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 801
    .restart local v3    # "y":F
    invoke-virtual {p0, p2}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->checkRelativeEvent(Landroid/view/MotionEvent;)Z

    move-result v5

    invoke-static {v2, v4, v1, v3, v5}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 802
    const/4 v2, 0x1

    .line 803
    .end local v8    # "consumed":Z
    .restart local v2    # "consumed":Z
    move v8, v2

    goto :goto_3

    .line 808
    .end local v1    # "x":F
    .end local v2    # "consumed":Z
    .end local v3    # "y":F
    .restart local v8    # "consumed":Z
    :cond_1
    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eq v10, v1, :cond_2

    if-ne v10, v3, :cond_6

    .line 809
    :cond_2
    packed-switch v4, :pswitch_data_1

    :pswitch_2
    goto :goto_3

    .line 813
    :pswitch_3
    invoke-virtual {p2, v9}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    .line 814
    .local v5, "x":F
    invoke-virtual {p2, v9}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    .line 815
    .local v6, "y":F
    invoke-virtual {p2, v9}, Landroid/view/MotionEvent;->getPressure(I)F

    move-result v7

    .line 816
    .local v7, "p":F
    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v11, v7, v11

    if-lez v11, :cond_3

    .line 819
    const/high16 v7, 0x3f800000    # 1.0f

    .line 823
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v11

    shr-int/2addr v11, v3

    if-ne v10, v1, :cond_4

    goto :goto_1

    :cond_4
    const/16 v2, 0x1e

    :goto_1
    const/4 v1, 0x1

    shl-int/2addr v1, v2

    or-int/2addr v1, v11

    .line 824
    .local v1, "buttons":I
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v2

    and-int/2addr v2, v3

    if-eqz v2, :cond_5

    .line 825
    or-int/lit8 v1, v1, 0x8

    move v3, v1

    goto :goto_2

    .line 824
    :cond_5
    move v3, v1

    .line 828
    .end local v1    # "buttons":I
    .local v3, "buttons":I
    :goto_2
    invoke-virtual {p2, v9}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/libsdl/app/SDLGenericMotionListener_API14;->getPenDeviceType(Landroid/view/InputDevice;)I

    move-result v2

    invoke-static/range {v1 .. v7}, Lorg/libsdl/app/SDLActivity;->onNativePen(IIIIFFF)V

    .line 829
    const/4 v1, 0x1

    move v8, v1

    .line 785
    .end local v3    # "buttons":I
    .end local v5    # "x":F
    .end local v6    # "y":F
    .end local v7    # "p":F
    .end local v10    # "toolType":I
    :cond_6
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 835
    .end local v9    # "i":I
    :cond_7
    return v8

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method reclaimRelativeMouseModeIfNeeded()V
    .locals 0

    .line 852
    return-void
.end method

.method setRelativeMouseEnabled(Z)Z
    .locals 1
    .param p1, "enabled"    # Z

    .line 847
    const/4 v0, 0x0

    return v0
.end method

.method supportsRelativeMouse()Z
    .locals 1

    .line 839
    const/4 v0, 0x0

    return v0
.end method
