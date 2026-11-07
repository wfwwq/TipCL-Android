.class Lorg/libsdl/app/SDLHapticHandler_API31;
.super Lorg/libsdl/app/SDLHapticHandler;
.source "SDLControllerManager.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 579
    invoke-direct {p0}, Lorg/libsdl/app/SDLHapticHandler;-><init>()V

    return-void
.end method

.method private vibrate(Landroid/os/Vibrator;FI)V
    .locals 4
    .param p1, "vibrator"    # Landroid/os/Vibrator;
    .param p2, "intensity"    # F
    .param p3, "length"    # I

    .line 613
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    .line 615
    return-void

    .line 618
    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, p2, v0

    if-nez v0, :cond_1

    .line 619
    invoke-virtual {p1}, Landroid/os/Vibrator;->cancel()V

    .line 620
    return-void

    .line 623
    :cond_1
    const/high16 v0, 0x437f0000    # 255.0f

    mul-float/2addr v0, p2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 624
    .local v0, "value":I
    const/16 v1, 0xff

    if-le v0, v1, :cond_2

    .line 625
    const/16 v0, 0xff

    .line 627
    :cond_2
    const/4 v1, 0x1

    if-ge v0, v1, :cond_3

    .line 628
    invoke-virtual {p1}, Landroid/os/Vibrator;->cancel()V

    .line 629
    return-void

    .line 632
    :cond_3
    int-to-long v1, p3

    :try_start_0
    invoke-static {v1, v2, v0}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 638
    goto :goto_0

    .line 634
    :catch_0
    move-exception v1

    .line 637
    .local v1, "e":Ljava/lang/Exception;
    int-to-long v2, p3

    invoke-virtual {p1, v2, v3}, Landroid/os/Vibrator;->vibrate(J)V

    .line 639
    .end local v1    # "e":Ljava/lang/Exception;
    :goto_0
    return-void
.end method


# virtual methods
.method rumble(IFFI)V
    .locals 7
    .param p1, "device_id"    # I
    .param p2, "low_frequency_intensity"    # F
    .param p3, "high_frequency_intensity"    # F
    .param p4, "length"    # I

    .line 590
    invoke-static {p1}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    .line 591
    .local v0, "device":Landroid/view/InputDevice;
    if-nez v0, :cond_0

    .line 592
    return-void

    .line 595
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-ge v1, v2, :cond_1

    .line 597
    return-void

    .line 600
    :cond_1
    invoke-virtual {v0}, Landroid/view/InputDevice;->getVibratorManager()Landroid/os/VibratorManager;

    move-result-object v1

    .line 601
    .local v1, "manager":Landroid/os/VibratorManager;
    invoke-virtual {v1}, Landroid/os/VibratorManager;->getVibratorIds()[I

    move-result-object v2

    .line 602
    .local v2, "vibrators":[I
    array-length v3, v2

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-lt v3, v4, :cond_2

    .line 603
    aget v3, v2, v5

    invoke-virtual {v1, v3}, Landroid/os/VibratorManager;->getVibrator(I)Landroid/os/Vibrator;

    move-result-object v3

    invoke-direct {p0, v3, p2, p4}, Lorg/libsdl/app/SDLHapticHandler_API31;->vibrate(Landroid/os/Vibrator;FI)V

    .line 604
    aget v3, v2, v6

    invoke-virtual {v1, v3}, Landroid/os/VibratorManager;->getVibrator(I)Landroid/os/Vibrator;

    move-result-object v3

    invoke-direct {p0, v3, p3, p4}, Lorg/libsdl/app/SDLHapticHandler_API31;->vibrate(Landroid/os/Vibrator;FI)V

    goto :goto_0

    .line 605
    :cond_2
    array-length v3, v2

    if-ne v3, v6, :cond_3

    .line 606
    const v3, 0x3f19999a    # 0.6f

    mul-float/2addr v3, p2

    const v4, 0x3ecccccd    # 0.4f

    mul-float/2addr v4, p3

    add-float/2addr v3, v4

    .line 607
    .local v3, "intensity":F
    aget v4, v2, v5

    invoke-virtual {v1, v4}, Landroid/os/VibratorManager;->getVibrator(I)Landroid/os/Vibrator;

    move-result-object v4

    invoke-direct {p0, v4, v3, p4}, Lorg/libsdl/app/SDLHapticHandler_API31;->vibrate(Landroid/os/Vibrator;FI)V

    .line 609
    .end local v3    # "intensity":F
    :cond_3
    :goto_0
    return-void
.end method

.method run(IFI)V
    .locals 2
    .param p1, "device_id"    # I
    .param p2, "intensity"    # F
    .param p3, "length"    # I

    .line 582
    invoke-virtual {p0, p1}, Lorg/libsdl/app/SDLHapticHandler_API31;->getHaptic(I)Lorg/libsdl/app/SDLHapticHandler$SDLHaptic;

    move-result-object v0

    .line 583
    .local v0, "haptic":Lorg/libsdl/app/SDLHapticHandler$SDLHaptic;
    if-eqz v0, :cond_0

    .line 584
    iget-object v1, v0, Lorg/libsdl/app/SDLHapticHandler$SDLHaptic;->vib:Landroid/os/Vibrator;

    invoke-direct {p0, v1, p2, p3}, Lorg/libsdl/app/SDLHapticHandler_API31;->vibrate(Landroid/os/Vibrator;FI)V

    .line 586
    :cond_0
    return-void
.end method
