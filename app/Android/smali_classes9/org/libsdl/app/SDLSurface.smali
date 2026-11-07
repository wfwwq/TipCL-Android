.class public Lorg/libsdl/app/SDLSurface;
.super Landroid/view/SurfaceView;
.source "SDLSurface.java"

# interfaces
.implements Landroid/view/SurfaceHolder$Callback;
.implements Landroid/view/View$OnApplyWindowInsetsListener;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/hardware/SensorEventListener;
.implements Landroid/view/ScaleGestureDetector$OnScaleGestureListener;


# static fields
.field static mNativeSurface:Landroid/view/Surface;


# instance fields
.field protected mDisplay:Landroid/view/Display;

.field protected mHeight:F

.field protected mIsSurfaceReady:Z

.field protected mSensorManager:Landroid/hardware/SensorManager;

.field protected mWidth:F

.field private final scaleGestureDetector:Landroid/view/ScaleGestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    .line 63
    invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    .line 64
    invoke-virtual {p0}, Lorg/libsdl/app/SDLSurface;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v0

    invoke-interface {v0, p0}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    .line 66
    new-instance v0, Landroid/view/ScaleGestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object v0, p0, Lorg/libsdl/app/SDLSurface;->scaleGestureDetector:Landroid/view/ScaleGestureDetector;

    .line 68
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->setFocusable(Z)V

    .line 69
    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->setFocusableInTouchMode(Z)V

    .line 70
    invoke-virtual {p0}, Lorg/libsdl/app/SDLSurface;->requestFocus()Z

    .line 71
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 72
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 73
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 75
    const-string v0, "window"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    iput-object v0, p0, Lorg/libsdl/app/SDLSurface;->mDisplay:Landroid/view/Display;

    .line 76
    const-string v0, "sensor"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lorg/libsdl/app/SDLSurface;->mSensorManager:Landroid/hardware/SensorManager;

    .line 78
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getMotionListener()Lorg/libsdl/app/SDLGenericMotionListener_API14;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->setOnGenericMotionListener(Landroid/view/View$OnGenericMotionListener;)V

    .line 86
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    int-to-float v0, v0

    iput v0, p0, Lorg/libsdl/app/SDLSurface;->mWidth:F

    .line 87
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    int-to-float v0, v0

    iput v0, p0, Lorg/libsdl/app/SDLSurface;->mHeight:F

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/libsdl/app/SDLSurface;->mIsSurfaceReady:Z

    .line 90
    return-void
.end method

.method public static clearNativeSurface()V
    .locals 1

    .line 121
    const/4 v0, 0x0

    sput-object v0, Lorg/libsdl/app/SDLSurface;->mNativeSurface:Landroid/view/Surface;

    .line 122
    return-void
.end method

.method public static getNativeSurface()Landroid/view/Surface;
    .locals 1

    .line 107
    sget-object v0, Lorg/libsdl/app/SDLSurface;->mNativeSurface:Landroid/view/Surface;

    return-object v0
.end method

.method private getNormalizedX(F)F
    .locals 2
    .param p1, "x"    # F

    .line 272
    iget v0, p0, Lorg/libsdl/app/SDLSurface;->mWidth:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 273
    const/high16 v0, 0x3f000000    # 0.5f

    return v0

    .line 275
    :cond_0
    iget v0, p0, Lorg/libsdl/app/SDLSurface;->mWidth:F

    sub-float/2addr v0, v1

    div-float v0, p1, v0

    return v0
.end method

.method private getNormalizedY(F)F
    .locals 2
    .param p1, "y"    # F

    .line 281
    iget v0, p0, Lorg/libsdl/app/SDLSurface;->mHeight:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_0

    .line 282
    const/high16 v0, 0x3f000000    # 0.5f

    return v0

    .line 284
    :cond_0
    iget v0, p0, Lorg/libsdl/app/SDLSurface;->mHeight:F

    sub-float/2addr v0, v1

    div-float v0, p1, v0

    return v0
.end method

.method public static setNativeSurface(Landroid/view/Surface;)V
    .locals 2
    .param p0, "nativeSurface"    # Landroid/view/Surface;

    .line 112
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/Surface;->isValid()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 115
    :cond_0
    sput-object p0, Lorg/libsdl/app/SDLSurface;->mNativeSurface:Landroid/view/Surface;

    .line 116
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getSDLSurface()Lorg/libsdl/app/SDLSurface;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/libsdl/app/SDLSurface;->surfaceCreated(Landroid/view/SurfaceHolder;)V

    .line 117
    return-void

    .line 113
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method protected enableSensor(IZ)V
    .locals 3
    .param p1, "sensortype"    # I
    .param p2, "enabled"    # Z

    .line 365
    if-eqz p2, :cond_0

    .line 366
    iget-object v0, p0, Lorg/libsdl/app/SDLSurface;->mSensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lorg/libsdl/app/SDLSurface;->mSensorManager:Landroid/hardware/SensorManager;

    .line 367
    invoke-virtual {v1, p1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    .line 366
    const/4 v2, 0x1

    invoke-static {v0, p0, v1, v2}, Lorg/libsdl/app/SDLSensorManager;->registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V

    goto :goto_0

    .line 370
    :cond_0
    iget-object v0, p0, Lorg/libsdl/app/SDLSurface;->mSensorManager:Landroid/hardware/SensorManager;

    iget-object v1, p0, Lorg/libsdl/app/SDLSurface;->mSensorManager:Landroid/hardware/SensorManager;

    .line 371
    invoke-virtual {v1, p1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v1

    .line 370
    invoke-static {v0, p0, v1}, Lorg/libsdl/app/SDLSensorManager;->unregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 373
    :goto_0
    return-void
.end method

.method protected handlePause()V
    .locals 2

    .line 93
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lorg/libsdl/app/SDLSurface;->enableSensor(IZ)V

    .line 94
    return-void
.end method

.method protected handleResume()V
    .locals 1

    .line 97
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->setFocusable(Z)V

    .line 98
    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->setFocusableInTouchMode(Z)V

    .line 99
    invoke-virtual {p0}, Lorg/libsdl/app/SDLSurface;->requestFocus()Z

    .line 100
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnApplyWindowInsetsListener(Landroid/view/View$OnApplyWindowInsetsListener;)V

    .line 101
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 102
    invoke-virtual {p0, p0}, Lorg/libsdl/app/SDLSurface;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 103
    invoke-virtual {p0, v0, v0}, Lorg/libsdl/app/SDLSurface;->enableSensor(IZ)V

    .line 104
    return-void
.end method

.method public nativeResize(II)V
    .locals 9
    .param p1, "w"    # I
    .param p2, "h"    # I

    .line 239
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 240
    .local v0, "realMetrics":Landroid/util/DisplayMetrics;
    iget-object v1, p0, Lorg/libsdl/app/SDLSurface;->mDisplay:Landroid/view/Display;

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 241
    iget v1, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    const/high16 v2, 0x43200000    # 160.0f

    div-float v7, v1, v2

    iget-object v1, p0, Lorg/libsdl/app/SDLSurface;->mDisplay:Landroid/view/Display;

    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    move-result v8

    move v5, p1

    move v6, p2

    move v3, p1

    move v4, p2

    .end local p1    # "w":I
    .end local p2    # "h":I
    .local v3, "w":I
    .local v4, "h":I
    invoke-static/range {v3 .. v8}, Lorg/libsdl/app/SDLActivity;->nativeSetScreenResolution(IIIIFF)V

    .line 242
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeResize()V

    .line 243
    return-void
.end method

.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0
    .param p1, "sensor"    # Landroid/hardware/Sensor;
    .param p2, "accuracy"    # I

    .line 378
    return-void
.end method

.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5
    .param p1, "v"    # Landroid/view/View;
    .param p2, "insets"    # Landroid/view/WindowInsets;

    .line 248
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 249
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemBars()I

    move-result v0

    .line 250
    invoke-static {}, Landroid/view/WindowInsets$Type;->systemGestures()I

    move-result v1

    or-int/2addr v0, v1

    .line 251
    invoke-static {}, Landroid/view/WindowInsets$Type;->mandatorySystemGestures()I

    move-result v1

    or-int/2addr v0, v1

    .line 252
    invoke-static {}, Landroid/view/WindowInsets$Type;->tappableElement()I

    move-result v1

    or-int/2addr v0, v1

    .line 253
    invoke-static {}, Landroid/view/WindowInsets$Type;->displayCutout()I

    move-result v1

    or-int/2addr v0, v1

    .line 249
    invoke-virtual {p2, v0}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object v0

    .line 255
    .local v0, "combined":Landroid/graphics/Insets;
    iget v1, v0, Landroid/graphics/Insets;->left:I

    iget v2, v0, Landroid/graphics/Insets;->right:I

    iget v3, v0, Landroid/graphics/Insets;->top:I

    iget v4, v0, Landroid/graphics/Insets;->bottom:I

    invoke-static {v1, v2, v3, v4}, Lorg/libsdl/app/SDLActivity;->onNativeInsetsChanged(IIII)V

    .line 257
    invoke-static {}, Landroid/view/WindowInsets$Type;->ime()I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/WindowInsets;->isVisible(I)Z

    move-result v1

    invoke-static {v1}, Lorg/libsdl/app/SdlImeController;->notifyVisibilityChanged(Z)V

    .line 261
    .end local v0    # "combined":Landroid/graphics/Insets;
    :cond_0
    return-object p2
.end method

.method public onCapturedPointerEvent(Landroid/view/MotionEvent;)Z
    .locals 7
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 440
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 441
    .local v0, "action":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    .line 443
    .local v1, "pointerCount":I
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_1

    .line 445
    const/4 v4, 0x1

    sparse-switch v0, :sswitch_data_0

    .line 443
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 463
    :sswitch_0
    const/16 v3, 0xb

    if-ne v0, v3, :cond_0

    .line 464
    const/4 v0, 0x0

    goto :goto_1

    .line 466
    :cond_0
    const/4 v0, 0x1

    .line 469
    :goto_1
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    .line 470
    .local v3, "x":F
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    .line 471
    .local v5, "y":F
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getButtonState()I

    move-result v6

    .line 473
    .local v6, "button":I
    invoke-static {v6, v0, v3, v5, v4}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 474
    return v4

    .line 447
    .end local v3    # "x":F
    .end local v5    # "y":F
    .end local v6    # "button":I
    :sswitch_1
    const/16 v5, 0xa

    invoke-virtual {p1, v5, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v5

    .line 448
    .local v5, "x":F
    const/16 v6, 0x9

    invoke-virtual {p1, v6, v2}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v6

    .line 449
    .local v6, "y":F
    invoke-static {v3, v0, v5, v6, v3}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 450
    return v4

    .line 454
    .end local v5    # "x":F
    .end local v6    # "y":F
    :sswitch_2
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    .line 455
    .restart local v5    # "x":F
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    .line 456
    .restart local v6    # "y":F
    invoke-static {v3, v0, v5, v6, v4}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 457
    return v4

    .line 478
    .end local v2    # "i":I
    .end local v5    # "x":F
    .end local v6    # "y":F
    :cond_1
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x7 -> :sswitch_2
        0x8 -> :sswitch_1
        0xb -> :sswitch_0
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "keyCode"    # I
    .param p3, "event"    # Landroid/view/KeyEvent;

    .line 267
    const/4 v0, 0x0

    invoke-static {p1, p2, p3, v0}, Lorg/libsdl/app/SDLActivity;->handleKeyEvent(Landroid/view/View;ILandroid/view/KeyEvent;Landroid/view/inputmethod/InputConnection;)Z

    move-result v0

    return v0
.end method

.method public onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;
    .locals 2
    .param p1, "event"    # Landroid/view/MotionEvent;
    .param p2, "pointerIndex"    # I

    .line 430
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/view/SurfaceView;->onResolvePointerIcon(Landroid/view/MotionEvent;I)Landroid/view/PointerIcon;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 431
    :catch_0
    move-exception v0

    .line 432
    .local v0, "e":Ljava/lang/NullPointerException;
    const/4 v1, 0x0

    return-object v1
.end method

.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 2
    .param p1, "detector"    # Landroid/view/ScaleGestureDetector;

    .line 483
    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result v0

    .line 484
    .local v0, "scale":F
    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->onNativePinchUpdate(F)V

    .line 485
    const/4 v1, 0x1

    return v1
.end method

.method public onScaleBegin(Landroid/view/ScaleGestureDetector;)Z
    .locals 1
    .param p1, "detector"    # Landroid/view/ScaleGestureDetector;

    .line 490
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativePinchStart()V

    .line 491
    const/4 v0, 0x1

    return v0
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0
    .param p1, "detector"    # Landroid/view/ScaleGestureDetector;

    .line 496
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativePinchEnd()V

    .line 497
    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 8
    .param p1, "event"    # Landroid/hardware/SensorEvent;

    .line 382
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 389
    iget-object v0, p0, Lorg/libsdl/app/SDLSurface;->mDisplay:Landroid/view/Display;

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    .line 392
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v2

    .line 393
    .local v0, "x":F
    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v2, v1

    .line 394
    .local v1, "y":F
    const/4 v2, 0x0

    .line 395
    .local v2, "newRotation":I
    goto :goto_0

    .line 407
    .end local v0    # "x":F
    .end local v1    # "y":F
    .end local v2    # "newRotation":I
    :pswitch_0
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v1

    .line 408
    .restart local v0    # "x":F
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v2

    neg-float v1, v1

    .line 409
    .restart local v1    # "y":F
    const/16 v2, 0x10e

    .restart local v2    # "newRotation":I
    goto :goto_0

    .line 402
    .end local v0    # "x":F
    .end local v1    # "y":F
    .end local v2    # "newRotation":I
    :pswitch_1
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v2

    neg-float v0, v0

    .line 403
    .restart local v0    # "x":F
    iget-object v2, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v2, v1

    neg-float v1, v1

    .line 404
    .restart local v1    # "y":F
    const/16 v2, 0xb4

    .line 405
    .restart local v2    # "newRotation":I
    goto :goto_0

    .line 397
    .end local v0    # "x":F
    .end local v1    # "y":F
    .end local v2    # "newRotation":I
    :pswitch_2
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v0, v0, v1

    neg-float v0, v0

    .line 398
    .restart local v0    # "x":F
    iget-object v1, p1, Landroid/hardware/SensorEvent;->values:[F

    aget v1, v1, v2

    .line 399
    .restart local v1    # "y":F
    const/16 v2, 0x5a

    .line 400
    .restart local v2    # "newRotation":I
    nop

    .line 413
    :goto_0
    sget v3, Lorg/libsdl/app/SDLActivity;->mCurrentRotation:I

    if-eq v2, v3, :cond_0

    .line 414
    sput v2, Lorg/libsdl/app/SDLActivity;->mCurrentRotation:I

    .line 415
    invoke-static {v2}, Lorg/libsdl/app/SDLActivity;->onNativeRotationChanged(I)V

    .line 418
    :cond_0
    neg-float v3, v0

    const v4, 0x411ce80a

    div-float/2addr v3, v4

    div-float v5, v1, v4

    iget-object v6, p1, Landroid/hardware/SensorEvent;->values:[F

    const/4 v7, 0x2

    aget v6, v6, v7

    div-float/2addr v6, v4

    invoke-static {v3, v5, v6}, Lorg/libsdl/app/SDLActivity;->onNativeAccel(FFF)V

    .line 424
    .end local v0    # "x":F
    .end local v1    # "y":F
    .end local v2    # "newRotation":I
    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .line 359
    const/4 v0, 0x0

    return v0
.end method

.method public surfaceChanged()V
    .locals 4

    .line 153
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v0, v1}, Lorg/libsdl/app/SDLSurface;->surfaceChanged(Landroid/view/SurfaceHolder;III)V

    .line 154
    return-void
.end method

.method public surfaceChanged(Landroid/view/SurfaceHolder;III)V
    .locals 17
    .param p1, "holder"    # Landroid/view/SurfaceHolder;
    .param p2, "format"    # I
    .param p3, "width"    # I
    .param p4, "height"    # I

    .line 160
    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v3, p4

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 161
    :cond_0
    const-string v0, "SDL"

    const-string v4, "surfaceChanged()"

    invoke-static {v0, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 163
    sget-object v0, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    if-nez v0, :cond_1

    .line 164
    return-void

    .line 167
    :cond_1
    int-to-float v0, v2

    iput v0, v1, Lorg/libsdl/app/SDLSurface;->mWidth:F

    .line 168
    int-to-float v0, v3

    iput v0, v1, Lorg/libsdl/app/SDLSurface;->mHeight:F

    .line 169
    move/from16 v4, p3

    .line 170
    .local v4, "nDeviceWidth":I
    move/from16 v5, p4

    .line 171
    .local v5, "nDeviceHeight":I
    const/high16 v6, 0x3f800000    # 1.0f

    .line 174
    .local v6, "density":F
    :try_start_0
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 175
    .local v0, "realMetrics":Landroid/util/DisplayMetrics;
    iget-object v7, v1, Lorg/libsdl/app/SDLSurface;->mDisplay:Landroid/view/Display;

    invoke-virtual {v7, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    .line 176
    iget v7, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    move v4, v7

    .line 177
    iget v7, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    move v5, v7

    .line 179
    iget v7, v0, Landroid/util/DisplayMetrics;->densityDpi:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    int-to-float v7, v7

    const/high16 v8, 0x43200000    # 160.0f

    div-float v6, v7, v8

    .line 181
    .end local v0    # "realMetrics":Landroid/util/DisplayMetrics;
    goto :goto_0

    .line 180
    :catch_0
    move-exception v0

    .line 183
    :goto_0
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v7

    monitor-enter v7

    .line 185
    :try_start_1
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    .line 186
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 187
    const-string v0, "SDL"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Window size: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "x"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    const-string v0, "SDL"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Device size: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "x"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 191
    const/4 v0, 0x0

    .line 192
    .local v0, "skip":Z
    sget-object v7, Lorg/libsdl/app/SDLActivity;->mSingleton:Landroid/app/Activity;

    invoke-virtual {v7}, Landroid/app/Activity;->getRequestedOrientation()I

    move-result v7

    .line 194
    .local v7, "requestedOrientation":I
    const/4 v8, 0x1

    if-eq v7, v8, :cond_4

    const/4 v9, 0x7

    if-ne v7, v9, :cond_2

    goto :goto_1

    .line 198
    :cond_2
    if-eqz v7, :cond_3

    const/4 v9, 0x6

    if-ne v7, v9, :cond_5

    .line 199
    :cond_3
    iget v9, v1, Lorg/libsdl/app/SDLSurface;->mWidth:F

    iget v10, v1, Lorg/libsdl/app/SDLSurface;->mHeight:F

    cmpg-float v9, v9, v10

    if-gez v9, :cond_5

    .line 200
    const/4 v0, 0x1

    goto :goto_2

    .line 195
    :cond_4
    :goto_1
    iget v9, v1, Lorg/libsdl/app/SDLSurface;->mWidth:F

    iget v10, v1, Lorg/libsdl/app/SDLSurface;->mHeight:F

    cmpl-float v9, v9, v10

    if-lez v9, :cond_5

    .line 196
    const/4 v0, 0x1

    .line 205
    :cond_5
    :goto_2
    if-eqz v0, :cond_6

    .line 206
    iget v9, v1, Lorg/libsdl/app/SDLSurface;->mWidth:F

    iget v10, v1, Lorg/libsdl/app/SDLSurface;->mHeight:F

    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    move-result v9

    float-to-double v9, v9

    .line 207
    .local v9, "min":D
    iget v11, v1, Lorg/libsdl/app/SDLSurface;->mWidth:F

    iget v12, v1, Lorg/libsdl/app/SDLSurface;->mHeight:F

    invoke-static {v11, v12}, Ljava/lang/Math;->max(FF)F

    move-result v11

    float-to-double v11, v11

    .line 209
    .local v11, "max":D
    div-double v13, v11, v9

    const-wide v15, 0x3ff3333333333333L    # 1.2

    cmpg-double v13, v13, v15

    if-gez v13, :cond_6

    .line 210
    const-string v13, "SDL"

    const-string v14, "Don\'t skip on such aspect-ratio. Could be a square resolution."

    invoke-static {v13, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    const/4 v0, 0x0

    .line 216
    .end local v9    # "min":D
    .end local v11    # "max":D
    :cond_6
    if-eqz v0, :cond_7

    .line 217
    nop

    .line 218
    const/4 v0, 0x0

    .line 222
    :cond_7
    if-eqz v0, :cond_8

    .line 223
    const-string v8, "SDL"

    const-string v9, "Skip .. Surface is not ready."

    invoke-static {v8, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    const/4 v8, 0x0

    iput-boolean v8, v1, Lorg/libsdl/app/SDLSurface;->mIsSurfaceReady:Z

    .line 225
    return-void

    .line 229
    :cond_8
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeSurfaceChanged()V

    .line 232
    iput-boolean v8, v1, Lorg/libsdl/app/SDLSurface;->mIsSurfaceReady:Z

    .line 234
    sget-object v8, Lorg/libsdl/app/SDLActivity$NativeState;->RESUMED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v8, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 235
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 236
    return-void

    .line 186
    .end local v0    # "skip":Z
    .end local v7    # "requestedOrientation":I
    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public surfaceCreated(Landroid/view/SurfaceHolder;)V
    .locals 2
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .line 127
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 128
    :cond_0
    const-string v0, "SDL"

    const-string v1, "surfaceCreated()"

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeSurfaceCreated()V

    .line 130
    return-void
.end method

.method public surfaceDestroyed()V
    .locals 1

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lorg/libsdl/app/SDLSurface;->surfaceDestroyed(Landroid/view/SurfaceHolder;)V

    .line 135
    return-void
.end method

.method public surfaceDestroyed(Landroid/view/SurfaceHolder;)V
    .locals 1
    .param p1, "holder"    # Landroid/view/SurfaceHolder;

    .line 138
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 140
    sget-object v0, Lorg/libsdl/app/SDLActivity$NativeState;->PAUSED:Lorg/libsdl/app/SDLActivity$NativeState;

    sput-object v0, Lorg/libsdl/app/SDLActivity;->mNextNativeState:Lorg/libsdl/app/SDLActivity$NativeState;

    .line 141
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->handleNativeState()V

    .line 143
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/libsdl/app/SDLSurface;->mIsSurfaceReady:Z

    .line 144
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->onNativeSurfaceDestroyed()V

    .line 147
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lorg/libsdl/app/SDLSurface;->mNativeSurface:Landroid/view/Surface;

    .line 148
    return-void
.end method
