.class Lorg/libsdl/app/SDLJoystickHandler;
.super Ljava/lang/Object;
.source "SDLControllerManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;,
        Lorg/libsdl/app/SDLJoystickHandler$RangeComparator;
    }
.end annotation


# instance fields
.field private final mJoysticks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 230
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 232
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    .line 233
    return-void
.end method


# virtual methods
.method getAxisMask(Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/InputDevice$MotionRange;",
            ">;)I"
        }
    .end annotation

    .line 408
    .local p1, "ranges":Ljava/util/List;, "Ljava/util/List<Landroid/view/InputDevice$MotionRange;>;"
    const/4 v0, 0x0

    .line 409
    .local v0, "axis_mask":I
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_0

    .line 411
    or-int/lit8 v0, v0, 0x3

    .line 413
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x4

    if-lt v1, v2, :cond_1

    .line 415
    or-int/lit8 v0, v0, 0xc

    .line 417
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x6

    if-lt v1, v2, :cond_2

    .line 419
    or-int/lit8 v0, v0, 0x30

    .line 423
    :cond_2
    const/4 v1, 0x0

    .line 424
    .local v1, "have_z":Z
    const/4 v2, 0x0

    .line 425
    .local v2, "have_past_z_before_rz":Z
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/InputDevice$MotionRange;

    .line 426
    .local v4, "range":Landroid/view/InputDevice$MotionRange;
    invoke-virtual {v4}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v5

    .line 427
    .local v5, "axis":I
    const/16 v6, 0xb

    if-ne v5, v6, :cond_3

    .line 428
    const/4 v1, 0x1

    goto :goto_1

    .line 429
    :cond_3
    if-le v5, v6, :cond_4

    const/16 v6, 0xe

    if-ge v5, v6, :cond_4

    .line 430
    const/4 v2, 0x1

    .line 432
    .end local v4    # "range":Landroid/view/InputDevice$MotionRange;
    .end local v5    # "axis":I
    :cond_4
    :goto_1
    goto :goto_0

    .line 433
    :cond_5
    if-eqz v1, :cond_6

    if-eqz v2, :cond_6

    .line 436
    const v3, 0x8000

    or-int/2addr v0, v3

    .line 438
    :cond_6
    return v0
.end method

.method getButtonMask(Landroid/view/InputDevice;)I
    .locals 6
    .param p1, "joystickDevice"    # Landroid/view/InputDevice;

    .line 442
    const/4 v0, 0x0

    .line 443
    .local v0, "button_mask":I
    const/16 v1, 0x26

    new-array v2, v1, [I

    fill-array-data v2, :array_0

    .line 485
    .local v2, "keys":[I
    new-array v1, v1, [I

    fill-array-data v1, :array_1

    .line 526
    .local v1, "masks":[I
    invoke-virtual {p1, v2}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object v3

    .line 527
    .local v3, "has_keys":[Z
    const/4 v4, 0x0

    .local v4, "i":I
    :goto_0
    array-length v5, v2

    if-ge v4, v5, :cond_1

    .line 528
    aget-boolean v5, v3, v4

    if-eqz v5, :cond_0

    .line 529
    aget v5, v1, v4

    or-int/2addr v0, v5

    .line 527
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 532
    .end local v4    # "i":I
    :cond_1
    return v0

    :array_0
    .array-data 4
        0x60
        0x61
        0x63
        0x64
        0x4
        0x52
        0x6e
        0x6c
        0x6a
        0x6b
        0x66
        0x67
        0x13
        0x14
        0x15
        0x16
        0x6d
        0x17
        0x68
        0x69
        0x62
        0x65
        0xbc
        0xbd
        0xbe
        0xbf
        0xc0
        0xc1
        0xc2
        0xc3
        0xc4
        0xc5
        0xc6
        0xc7
        0xc8
        0xc9
        0xca
        0xcb
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x2
        0x4
        0x8
        0x10
        0x40
        0x20
        0x40
        0x80
        0x100
        0x200
        0x400
        0x800
        0x1000
        0x2000
        0x4000
        0x10
        0x1
        0x8000
        0x10000
        0x20000
        0x40000
        0x100000
        0x200000
        0x400000
        0x800000
        0x1000000
        0x2000000
        0x4000000
        0x8000000
        0x10000000
        0x20000000
        0x40000000    # 2.0f
        -0x80000000
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method protected declared-synchronized getJoystick(I)Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    .locals 3
    .param p1, "device_id"    # I

    monitor-enter p0

    .line 352
    :try_start_0
    iget-object v0, p0, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    .line 353
    .local v1, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    iget v2, v1, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v2, p1, :cond_0

    .line 354
    monitor-exit p0

    return-object v1

    .line 356
    .end local v1    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    :cond_0
    goto :goto_0

    .line 357
    .end local p0    # "this":Lorg/libsdl/app/SDLJoystickHandler;
    :cond_1
    monitor-exit p0

    const/4 v0, 0x0

    return-object v0

    .line 351
    .end local p1    # "device_id":I
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method getJoystickDescriptor(Landroid/view/InputDevice;)Ljava/lang/String;
    .locals 2
    .param p1, "joystickDevice"    # Landroid/view/InputDevice;

    .line 388
    invoke-virtual {p1}, Landroid/view/InputDevice;->getDescriptor()Ljava/lang/String;

    move-result-object v0

    .line 390
    .local v0, "desc":Ljava/lang/String;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 391
    return-object v0

    .line 394
    :cond_0
    invoke-virtual {p1}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method getProductId(Landroid/view/InputDevice;)I
    .locals 1
    .param p1, "joystickDevice"    # Landroid/view/InputDevice;

    .line 398
    invoke-virtual {p1}, Landroid/view/InputDevice;->getProductId()I

    move-result v0

    return v0
.end method

.method getVendorId(Landroid/view/InputDevice;)I
    .locals 1
    .param p1, "joystickDevice"    # Landroid/view/InputDevice;

    .line 402
    invoke-virtual {p1}, Landroid/view/InputDevice;->getVendorId()I

    move-result v0

    return v0
.end method

.method handleMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 366
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 367
    .local v0, "actionPointerIndex":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    .line 368
    .local v1, "action":I
    const/4 v2, 0x1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 369
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v4

    invoke-virtual {p0, v4}, Lorg/libsdl/app/SDLJoystickHandler;->getJoystick(I)Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    move-result-object v4

    .line 370
    .local v4, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    if-eqz v4, :cond_1

    .line 371
    const/4 v5, 0x0

    .local v5, "i":I
    :goto_0
    iget-object v6, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_0

    .line 372
    iget-object v6, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/InputDevice$MotionRange;

    .line 374
    .local v6, "range":Landroid/view/InputDevice$MotionRange;
    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v7

    invoke-virtual {p1, v7, v0}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v7

    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getMin()F

    move-result v8

    sub-float/2addr v7, v8

    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getRange()F

    move-result v8

    div-float/2addr v7, v8

    const/high16 v8, 0x40000000    # 2.0f

    mul-float/2addr v7, v8

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v7, v8

    .line 375
    .local v7, "value":F
    iget v8, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    invoke-static {v8, v5, v7}, Lorg/libsdl/app/SDLControllerManager;->onNativeJoy(IIF)V

    .line 371
    .end local v6    # "range":Landroid/view/InputDevice$MotionRange;
    .end local v7    # "value":F
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 377
    .end local v5    # "i":I
    :cond_0
    const/4 v5, 0x0

    .restart local v5    # "i":I
    :goto_1
    iget-object v6, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    div-int/2addr v6, v3

    if-ge v5, v6, :cond_1

    .line 378
    iget-object v6, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    mul-int/lit8 v7, v5, 0x2

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/InputDevice$MotionRange;

    invoke-virtual {v6}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v6

    invoke-virtual {p1, v6, v0}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    .line 379
    .local v6, "hatX":I
    iget-object v7, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    mul-int/lit8 v8, v5, 0x2

    add-int/2addr v8, v2

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/InputDevice$MotionRange;

    invoke-virtual {v7}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v7

    invoke-virtual {p1, v7, v0}, Landroid/view/MotionEvent;->getAxisValue(II)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 380
    .local v7, "hatY":I
    iget v8, v4, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    invoke-static {v8, v5, v6, v7}, Lorg/libsdl/app/SDLControllerManager;->onNativeHat(IIII)V

    .line 377
    .end local v6    # "hatX":I
    .end local v7    # "hatY":I
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 384
    .end local v4    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    .end local v5    # "i":I
    :cond_1
    return v2
.end method

.method declared-synchronized pollInputDevices()V
    .locals 34

    move-object/from16 v1, p0

    monitor-enter p0

    .line 239
    :try_start_0
    invoke-static {}, Landroid/view/InputDevice;->getDeviceIds()[I

    move-result-object v0

    move-object v2, v0

    .line 241
    .local v2, "deviceIds":[I
    array-length v0, v2

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x1f

    if-ge v3, v0, :cond_e

    aget v5, v2, v3

    .line 242
    .local v5, "device_id":I
    invoke-static {v5}, Lorg/libsdl/app/SDLControllerManager;->isDeviceSDLJoystick(I)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 243
    invoke-virtual {v1, v5}, Lorg/libsdl/app/SDLJoystickHandler;->getJoystick(I)Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    move-result-object v6

    .line 244
    .local v6, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    if-nez v6, :cond_c

    .line 245
    invoke-static {v5}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v7

    .line 246
    .local v7, "joystickDevice":Landroid/view/InputDevice;
    new-instance v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    invoke-direct {v8}, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;-><init>()V

    .line 247
    .end local v6    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    .local v8, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    iput v5, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    .line 248
    invoke-virtual {v7}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v6

    iput-object v6, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->name:Ljava/lang/String;

    .line 249
    invoke-virtual {v1, v7}, Lorg/libsdl/app/SDLJoystickHandler;->getJoystickDescriptor(Landroid/view/InputDevice;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->desc:Ljava/lang/String;

    .line 250
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    .line 251
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    .line 252
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 253
    .local v6, "axisStrsSet":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/Integer;>;"
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lights:Ljava/util/ArrayList;

    .line 255
    invoke-virtual {v7}, Landroid/view/InputDevice;->getMotionRanges()Ljava/util/List;

    move-result-object v9

    .line 256
    .local v9, "ranges":Ljava/util/List;, "Ljava/util/List<Landroid/view/InputDevice$MotionRange;>;"
    new-instance v10, Lorg/libsdl/app/SDLJoystickHandler$RangeComparator;

    invoke-direct {v10}, Lorg/libsdl/app/SDLJoystickHandler$RangeComparator;-><init>()V

    invoke-static {v9, v10}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 257
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/view/InputDevice$MotionRange;

    .line 258
    .local v11, "range":Landroid/view/InputDevice$MotionRange;
    invoke-virtual {v11}, Landroid/view/InputDevice$MotionRange;->getSource()I

    move-result v12

    const/16 v13, 0x10

    and-int/2addr v12, v13

    if-eqz v12, :cond_2

    invoke-virtual {v11}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-interface {v6, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 259
    invoke-virtual {v11}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v12

    const/16 v14, 0xf

    if-eq v12, v14, :cond_1

    invoke-virtual {v11}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v12

    if-ne v12, v13, :cond_0

    goto :goto_2

    .line 262
    :cond_0
    iget-object v12, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 260
    .end local p0    # "this":Lorg/libsdl/app/SDLJoystickHandler;
    :cond_1
    :goto_2
    iget-object v12, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .end local v11    # "range":Landroid/view/InputDevice$MotionRange;
    :cond_2
    :goto_3
    goto :goto_1

    .line 267
    :cond_3
    const/4 v10, 0x0

    .line 268
    .local v10, "can_rumble":Z
    const/4 v11, 0x0

    .line 269
    .local v11, "has_rgb_led":Z
    const/4 v12, 0x0

    .line 270
    .local v12, "has_accelerometer":Z
    const/4 v13, 0x0

    .line 271
    .local v13, "has_gyroscope":Z
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v14, v4, :cond_b

    .line 272
    invoke-virtual {v7}, Landroid/view/InputDevice;->getVibratorManager()Landroid/os/VibratorManager;

    move-result-object v4

    .line 273
    .local v4, "vibratorManager":Landroid/os/VibratorManager;
    invoke-virtual {v4}, Landroid/os/VibratorManager;->getVibratorIds()[I

    move-result-object v14

    .line 274
    .local v14, "vibrators":[I
    array-length v15, v14

    if-lez v15, :cond_4

    .line 275
    const/4 v10, 0x1

    .line 277
    :cond_4
    invoke-virtual {v7}, Landroid/view/InputDevice;->getLightsManager()Landroid/hardware/lights/LightsManager;

    move-result-object v15

    .line 278
    .local v15, "lightsManager":Landroid/hardware/lights/LightsManager;
    invoke-virtual {v15}, Landroid/hardware/lights/LightsManager;->getLights()Ljava/util/List;

    move-result-object v16

    .line 279
    .local v16, "lights":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/lights/Light;>;"
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Landroid/hardware/lights/Light;

    move-object/from16 v19, v18

    .line 280
    .local v19, "light":Landroid/hardware/lights/Light;
    invoke-virtual/range {v19 .. v19}, Landroid/hardware/lights/Light;->hasRgbControl()Z

    move-result v18

    if-eqz v18, :cond_5

    .line 281
    move/from16 v18, v0

    iget-object v0, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lights:Ljava/util/ArrayList;

    move/from16 v20, v3

    move-object/from16 v3, v19

    .end local v19    # "light":Landroid/hardware/lights/Light;
    .local v3, "light":Landroid/hardware/lights/Light;
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 280
    .end local v3    # "light":Landroid/hardware/lights/Light;
    .restart local v19    # "light":Landroid/hardware/lights/Light;
    :cond_5
    move/from16 v18, v0

    move/from16 v20, v3

    move-object/from16 v3, v19

    .line 283
    .end local v19    # "light":Landroid/hardware/lights/Light;
    :goto_5
    move/from16 v0, v18

    move/from16 v3, v20

    goto :goto_4

    .line 284
    :cond_6
    move/from16 v18, v0

    move/from16 v20, v3

    iget-object v0, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lights:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 285
    invoke-virtual {v15}, Landroid/hardware/lights/LightsManager;->openSession()Landroid/hardware/lights/LightsManager$LightsSession;

    move-result-object v0

    iput-object v0, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lightsSession:Landroid/hardware/lights/LightsManager$LightsSession;

    .line 286
    const/4 v11, 0x1

    .line 288
    :cond_7
    invoke-virtual {v7}, Landroid/view/InputDevice;->getSensorManager()Landroid/hardware/SensorManager;

    move-result-object v0

    .line 289
    .local v0, "sensorManager":Landroid/hardware/SensorManager;
    if-eqz v0, :cond_a

    .line 290
    iput-object v0, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    .line 291
    new-instance v3, Lorg/libsdl/app/SDLJoySensorListener;

    move-object/from16 v17, v4

    .end local v4    # "vibratorManager":Landroid/os/VibratorManager;
    .local v17, "vibratorManager":Landroid/os/VibratorManager;
    iget v4, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    invoke-direct {v3, v4}, Lorg/libsdl/app/SDLJoySensorListener;-><init>(I)V

    iput-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorListener:Lorg/libsdl/app/SDLJoySensorListener;

    .line 292
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    iput-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    .line 293
    iget-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    if-eqz v3, :cond_8

    .line 294
    const/4 v12, 0x1

    .line 296
    :cond_8
    const/4 v3, 0x4

    invoke-virtual {v0, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v3

    iput-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    .line 297
    iget-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    if-eqz v3, :cond_9

    .line 298
    const/4 v13, 0x1

    move/from16 v30, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move/from16 v33, v13

    goto :goto_6

    .line 297
    :cond_9
    move/from16 v30, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move/from16 v33, v13

    goto :goto_6

    .line 289
    .end local v17    # "vibratorManager":Landroid/os/VibratorManager;
    .restart local v4    # "vibratorManager":Landroid/os/VibratorManager;
    :cond_a
    move-object/from16 v17, v4

    .end local v4    # "vibratorManager":Landroid/os/VibratorManager;
    .restart local v17    # "vibratorManager":Landroid/os/VibratorManager;
    move/from16 v30, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move/from16 v33, v13

    goto :goto_6

    .line 271
    .end local v0    # "sensorManager":Landroid/hardware/SensorManager;
    .end local v14    # "vibrators":[I
    .end local v15    # "lightsManager":Landroid/hardware/lights/LightsManager;
    .end local v16    # "lights":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/lights/Light;>;"
    .end local v17    # "vibratorManager":Landroid/os/VibratorManager;
    :cond_b
    move/from16 v18, v0

    move/from16 v20, v3

    move/from16 v30, v10

    move/from16 v31, v11

    move/from16 v32, v12

    move/from16 v33, v13

    .line 303
    .end local v10    # "can_rumble":Z
    .end local v11    # "has_rgb_led":Z
    .end local v12    # "has_accelerometer":Z
    .end local v13    # "has_gyroscope":Z
    .local v30, "can_rumble":Z
    .local v31, "has_rgb_led":Z
    .local v32, "has_accelerometer":Z
    .local v33, "has_gyroscope":Z
    :goto_6
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    iget v0, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    iget-object v3, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->name:Ljava/lang/String;

    iget-object v4, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->desc:Ljava/lang/String;

    .line 305
    invoke-virtual {v1, v7}, Lorg/libsdl/app/SDLJoystickHandler;->getVendorId(Landroid/view/InputDevice;)I

    move-result v24

    invoke-virtual {v1, v7}, Lorg/libsdl/app/SDLJoystickHandler;->getProductId(Landroid/view/InputDevice;)I

    move-result v25

    .line 306
    invoke-virtual {v1, v7}, Lorg/libsdl/app/SDLJoystickHandler;->getButtonMask(Landroid/view/InputDevice;)I

    move-result v26

    iget-object v10, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v27

    iget-object v10, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->axes:Ljava/util/ArrayList;

    invoke-virtual {v1, v10}, Lorg/libsdl/app/SDLJoystickHandler;->getAxisMask(Ljava/util/List;)I

    move-result v28

    iget-object v10, v8, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->hats:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v10

    div-int/lit8 v29, v10, 0x2

    .line 304
    move/from16 v21, v0

    move-object/from16 v22, v3

    move-object/from16 v23, v4

    invoke-static/range {v21 .. v33}, Lorg/libsdl/app/SDLControllerManager;->nativeAddJoystick(ILjava/lang/String;Ljava/lang/String;IIIIIIZZZZ)V

    goto :goto_7

    .line 244
    .end local v7    # "joystickDevice":Landroid/view/InputDevice;
    .end local v8    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    .end local v9    # "ranges":Ljava/util/List;, "Ljava/util/List<Landroid/view/InputDevice$MotionRange;>;"
    .end local v30    # "can_rumble":Z
    .end local v31    # "has_rgb_led":Z
    .end local v32    # "has_accelerometer":Z
    .end local v33    # "has_gyroscope":Z
    .local v6, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    :cond_c
    move/from16 v18, v0

    move/from16 v20, v3

    goto :goto_7

    .line 242
    .end local v6    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    :cond_d
    move/from16 v18, v0

    move/from16 v20, v3

    .line 241
    .end local v5    # "device_id":I
    :goto_7
    add-int/lit8 v3, v20, 0x1

    move/from16 v0, v18

    goto/16 :goto_0

    .line 313
    :cond_e
    const/4 v0, 0x0

    .line 314
    .local v0, "removedDevices":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    iget-object v3, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v5, v0

    .end local v0    # "removedDevices":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    .local v5, "removedDevices":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    .line 315
    .local v0, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    iget v6, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    .line 317
    .local v6, "device_id":I
    const/4 v7, 0x0

    .local v7, "i":I
    :goto_9
    array-length v8, v2

    if-ge v7, v8, :cond_10

    .line 318
    aget v8, v2, v7

    if-ne v6, v8, :cond_f

    goto :goto_a

    .line 317
    :cond_f
    add-int/lit8 v7, v7, 0x1

    goto :goto_9

    .line 320
    :cond_10
    :goto_a
    array-length v8, v2

    if-ne v7, v8, :cond_12

    .line 321
    if-nez v5, :cond_11

    .line 322
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move-object v5, v8

    .line 324
    :cond_11
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 326
    .end local v0    # "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    .end local v6    # "device_id":I
    .end local v7    # "i":I
    :cond_12
    goto :goto_8

    .line 328
    :cond_13
    if-eqz v5, :cond_17

    .line 329
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v6, v0

    .line 330
    .restart local v6    # "device_id":I
    invoke-static {v6}, Lorg/libsdl/app/SDLControllerManager;->nativeRemoveJoystick(I)V

    .line 331
    const/4 v0, 0x0

    move v7, v0

    .restart local v7    # "i":I
    :goto_c
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_16

    .line 332
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    iget v0, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->device_id:I

    if-ne v0, v6, :cond_15

    .line 333
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_14

    .line 334
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    iget-object v0, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lightsSession:Landroid/hardware/lights/LightsManager$LightsSession;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_14

    .line 336
    :try_start_1
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    iget-object v0, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lightsSession:Landroid/hardware/lights/LightsManager$LightsSession;

    invoke-virtual {v0}, Landroid/hardware/lights/LightsManager$LightsSession;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 339
    goto :goto_d

    .line 337
    :catch_0
    move-exception v0

    .line 340
    :goto_d
    :try_start_2
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    const/4 v8, 0x0

    iput-object v8, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lightsSession:Landroid/hardware/lights/LightsManager$LightsSession;

    .line 343
    :cond_14
    iget-object v0, v1, Lorg/libsdl/app/SDLJoystickHandler;->mJoysticks:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 344
    goto :goto_e

    .line 331
    :cond_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_c

    .line 347
    .end local v6    # "device_id":I
    .end local v7    # "i":I
    :cond_16
    :goto_e
    goto :goto_b

    .line 349
    :cond_17
    monitor-exit p0

    return-void

    .line 238
    .end local v2    # "deviceIds":[I
    .end local v5    # "removedDevices":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Ljava/lang/Integer;>;"
    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method setLED(IIII)V
    .locals 6
    .param p1, "device_id"    # I
    .param p2, "red"    # I
    .param p3, "green"    # I
    .param p4, "blue"    # I

    .line 536
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    .line 537
    return-void

    .line 539
    :cond_0
    invoke-virtual {p0, p1}, Lorg/libsdl/app/SDLJoystickHandler;->getJoystick(I)Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    move-result-object v0

    .line 540
    .local v0, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    if-eqz v0, :cond_4

    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lights:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 543
    :cond_1
    new-instance v1, Landroid/hardware/lights/LightsRequest$Builder;

    invoke-direct {v1}, Landroid/hardware/lights/LightsRequest$Builder;-><init>()V

    .line 544
    .local v1, "lightsRequest":Landroid/hardware/lights/LightsRequest$Builder;
    new-instance v2, Landroid/hardware/lights/LightState$Builder;

    invoke-direct {v2}, Landroid/hardware/lights/LightState$Builder;-><init>()V

    invoke-static {p2, p3, p4}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/hardware/lights/LightState$Builder;->setColor(I)Landroid/hardware/lights/LightState$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/hardware/lights/LightState$Builder;->build()Landroid/hardware/lights/LightState;

    move-result-object v2

    .line 545
    .local v2, "lightState":Landroid/hardware/lights/LightState;
    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lights:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/hardware/lights/Light;

    .line 546
    .local v4, "light":Landroid/hardware/lights/Light;
    invoke-virtual {v4}, Landroid/hardware/lights/Light;->hasRgbControl()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 547
    invoke-virtual {v1, v4, v2}, Landroid/hardware/lights/LightsRequest$Builder;->addLight(Landroid/hardware/lights/Light;Landroid/hardware/lights/LightState;)Landroid/hardware/lights/LightsRequest$Builder;

    .line 549
    .end local v4    # "light":Landroid/hardware/lights/Light;
    :cond_2
    goto :goto_0

    .line 550
    :cond_3
    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->lightsSession:Landroid/hardware/lights/LightsManager$LightsSession;

    invoke-virtual {v1}, Landroid/hardware/lights/LightsRequest$Builder;->build()Landroid/hardware/lights/LightsRequest;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/hardware/lights/LightsManager$LightsSession;->requestLights(Landroid/hardware/lights/LightsRequest;)V

    .line 551
    return-void

    .line 541
    .end local v1    # "lightsRequest":Landroid/hardware/lights/LightsRequest$Builder;
    .end local v2    # "lightState":Landroid/hardware/lights/LightState;
    :cond_4
    :goto_1
    return-void
.end method

.method setSensorsEnabled(IZ)V
    .locals 5
    .param p1, "device_id"    # I
    .param p2, "enabled"    # Z

    .line 554
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    .line 555
    return-void

    .line 557
    :cond_0
    invoke-virtual {p0, p1}, Lorg/libsdl/app/SDLJoystickHandler;->getJoystick(I)Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;

    move-result-object v0

    .line 558
    .local v0, "joystick":Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;
    if-eqz v0, :cond_6

    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    if-nez v1, :cond_1

    goto :goto_1

    .line 561
    :cond_1
    if-eqz p2, :cond_3

    .line 562
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    .line 563
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorListener:Lorg/libsdl/app/SDLJoySensorListener;

    iget-object v4, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    invoke-static {v1, v3, v4, v2}, Lorg/libsdl/app/SDLSensorManager;->registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V

    .line 565
    :cond_2
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    if-eqz v1, :cond_5

    .line 566
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorListener:Lorg/libsdl/app/SDLJoySensorListener;

    iget-object v4, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    invoke-static {v1, v3, v4, v2}, Lorg/libsdl/app/SDLSensorManager;->registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V

    goto :goto_0

    .line 569
    :cond_3
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    if-eqz v1, :cond_4

    .line 570
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorListener:Lorg/libsdl/app/SDLJoySensorListener;

    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->accelerometerSensor:Landroid/hardware/Sensor;

    invoke-static {v1, v2, v3}, Lorg/libsdl/app/SDLSensorManager;->unregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 572
    :cond_4
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    if-eqz v1, :cond_5

    .line 573
    iget-object v1, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorManager:Landroid/hardware/SensorManager;

    iget-object v2, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->sensorListener:Lorg/libsdl/app/SDLJoySensorListener;

    iget-object v3, v0, Lorg/libsdl/app/SDLJoystickHandler$SDLJoystick;->gyroscopeSensor:Landroid/hardware/Sensor;

    invoke-static {v1, v2, v3}, Lorg/libsdl/app/SDLSensorManager;->unregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 576
    :cond_5
    :goto_0
    return-void

    .line 559
    :cond_6
    :goto_1
    return-void
.end method
