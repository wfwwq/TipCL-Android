.class public Lorg/libsdl/app/SDLControllerManager;
.super Ljava/lang/Object;
.source "SDLControllerManager.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "SDLControllerManager"

.field protected static mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

.field protected static mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static handleJoystickMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p0, "event"    # Landroid/view/MotionEvent;

    .line 80
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    invoke-virtual {v0, p0}, Lorg/libsdl/app/SDLJoystickHandler;->handleMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method static hapticRumble(IFFI)V
    .locals 1
    .param p0, "device_id"    # I
    .param p1, "low_frequency_intensity"    # F
    .param p2, "high_frequency_intensity"    # F
    .param p3, "length"    # I

    .line 122
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    invoke-virtual {v0, p0, p1, p2, p3}, Lorg/libsdl/app/SDLHapticHandler;->rumble(IFFI)V

    .line 123
    return-void
.end method

.method static hapticRun(IFI)V
    .locals 1
    .param p0, "device_id"    # I
    .param p1, "intensity"    # F
    .param p2, "length"    # I

    .line 115
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    invoke-virtual {v0, p0, p1, p2}, Lorg/libsdl/app/SDLHapticHandler;->run(IFI)V

    .line 116
    return-void
.end method

.method static hapticStop(I)V
    .locals 1
    .param p0, "device_id"    # I

    .line 130
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    invoke-virtual {v0, p0}, Lorg/libsdl/app/SDLHapticHandler;->stop(I)V

    .line 131
    return-void
.end method

.method static initialize()V
    .locals 2

    .line 63
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    if-nez v0, :cond_0

    .line 64
    new-instance v0, Lorg/libsdl/app/SDLJoystickHandler;

    invoke-direct {v0}, Lorg/libsdl/app/SDLJoystickHandler;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    .line 67
    :cond_0
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    if-nez v0, :cond_2

    .line 68
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    .line 69
    new-instance v0, Lorg/libsdl/app/SDLHapticHandler_API31;

    invoke-direct {v0}, Lorg/libsdl/app/SDLHapticHandler_API31;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    goto :goto_0

    .line 70
    :cond_1
    nop

    .line 71
    new-instance v0, Lorg/libsdl/app/SDLHapticHandler_API26;

    invoke-direct {v0}, Lorg/libsdl/app/SDLHapticHandler_API26;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    .line 76
    :cond_2
    :goto_0
    return-void
.end method

.method public static isDeviceSDLJoystick(I)Z
    .locals 5
    .param p0, "deviceId"    # I

    .line 135
    invoke-static {p0}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v0

    .line 138
    .local v0, "device":Landroid/view/InputDevice;
    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-gez p0, :cond_0

    goto :goto_0

    .line 141
    :cond_0
    invoke-virtual {v0}, Landroid/view/InputDevice;->getSources()I

    move-result v2

    .line 156
    .local v2, "sources":I
    and-int/lit8 v3, v2, 0x10

    if-nez v3, :cond_1

    and-int/lit16 v3, v2, 0x201

    const/16 v4, 0x201

    if-eq v3, v4, :cond_1

    and-int/lit16 v3, v2, 0x401

    const/16 v4, 0x401

    if-ne v3, v4, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1

    .line 139
    .end local v2    # "sources":I
    :cond_3
    :goto_0
    return v1
.end method

.method static joystickSetLED(IIII)V
    .locals 1
    .param p0, "device_id"    # I
    .param p1, "red"    # I
    .param p2, "green"    # I
    .param p3, "blue"    # I

    .line 94
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    invoke-virtual {v0, p0, p1, p2, p3}, Lorg/libsdl/app/SDLJoystickHandler;->setLED(IIII)V

    .line 95
    return-void
.end method

.method static joystickSetSensorsEnabled(IZ)V
    .locals 1
    .param p0, "device_id"    # I
    .param p1, "enabled"    # Z

    .line 101
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    invoke-virtual {v0, p0, p1}, Lorg/libsdl/app/SDLJoystickHandler;->setSensorsEnabled(IZ)V

    .line 102
    return-void
.end method

.method static native nativeAddHaptic(ILjava/lang/String;)V
.end method

.method static native nativeAddJoystick(ILjava/lang/String;Ljava/lang/String;IIIIIIZZZZ)V
.end method

.method static native nativeRemoveHaptic(I)V
.end method

.method static native nativeRemoveJoystick(I)V
.end method

.method static native nativeSetupJNI()V
.end method

.method static native onNativeHat(IIII)V
.end method

.method static native onNativeJoy(IIF)V
.end method

.method static native onNativeJoySensor(IIJFFF)V
.end method

.method public static native onNativePadDown(III)Z
.end method

.method public static native onNativePadUp(III)Z
.end method

.method static pollHapticDevices()V
    .locals 1

    .line 108
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mHapticHandler:Lorg/libsdl/app/SDLHapticHandler;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLHapticHandler;->pollHapticDevices()V

    .line 109
    return-void
.end method

.method static pollInputDevices()V
    .locals 1

    .line 87
    sget-object v0, Lorg/libsdl/app/SDLControllerManager;->mJoystickHandler:Lorg/libsdl/app/SDLJoystickHandler;

    invoke-virtual {v0}, Lorg/libsdl/app/SDLJoystickHandler;->pollInputDevices()V

    .line 88
    return-void
.end method
