.class public Lorg/lwjgl/glfw/CallbackBridge;
.super Ljava/lang/Object;
.source "CallbackBridge.java"


# static fields
.field public static final ACTION_INIT_LAUNCHER_INTEGRATION:I = 0x0

.field public static final ACTION_SEND_TEXTBOX_RECT:I = 0x1

.field public static final CLIPBOARD_COPY:I = 0x7d0

.field public static final CLIPBOARD_OPEN:I = 0x7d2

.field public static final CLIPBOARD_PASTE:I = 0x7d1

.field public static final INIT:I

.field private static final MAIN_HANDLER:Landroid/os/Handler;

.field public static final NOTIF_TYPE_SDL:I

.field public static final SDL:I

.field private static volatile cleanroomActive:Z

.field public static deltaX:F

.field public static deltaY:F

.field private static fclBridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

.field private static final grabLock:Ljava/lang/Object;

.field public static volatile holdingAlt:Z

.field public static volatile holdingCapslock:Z

.field public static volatile holdingCtrl:Z

.field public static volatile holdingNumlock:Z

.field public static volatile holdingShift:Z

.field private static volatile isGrabbing:Z

.field public static mouseX:F

.field public static mouseY:F

.field public static volatile physicalHeight:I

.field public static volatile physicalWidth:I

.field private static final sChoreographer:Landroid/view/Choreographer;

.field private static sDirectGamepadEnableHandler:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;",
            ">;"
        }
    .end annotation
.end field

.field public static final sGamepadAxisBuffer:Ljava/nio/FloatBuffer;

.field public static final sGamepadButtonBuffer:Ljava/nio/ByteBuffer;

.field public static sGamepadDirectInput:Z

.field private static final sKeyCharacterMap:Landroid/view/KeyCharacterMap;

.field private static sMouseButtonState:I

.field public static volatile windowHeight:I

.field public static volatile windowWidth:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 39
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->MAIN_HANDLER:Landroid/os/Handler;

    .line 40
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sChoreographer:Landroid/view/Choreographer;

    .line 41
    const/4 v0, 0x0

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->fclBridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 43
    const/4 v0, 0x0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->isGrabbing:Z

    .line 45
    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lorg/lwjgl/glfw/CallbackBridge;->grabLock:Ljava/lang/Object;

    .line 47
    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->cleanroomActive:Z

    .line 143
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    .line 150
    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->sGamepadDirectInput:Z

    .line 237
    const/4 v0, -0x1

    invoke-static {v0}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v0

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sKeyCharacterMap:Landroid/view/KeyCharacterMap;

    .line 506
    const-string v0, "pojavexec"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 507
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->nativeCreateGamepadButtonBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sGamepadButtonBuffer:Ljava/nio/ByteBuffer;

    .line 508
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->nativeCreateGamepadAxisBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sGamepadAxisBuffer:Ljava/nio/FloatBuffer;

    .line 509
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static accessAndroidClipboard(ILjava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "type"    # I
    .param p1, "copy"    # Ljava/lang/String;

    .line 345
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v0

    .line 346
    .local v0, "activity":Landroid/app/Activity;
    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/ClipboardManager;

    .line 347
    .local v1, "clipboard":Landroid/content/ClipboardManager;
    const/4 v2, 0x0

    .line 348
    .local v2, "result":Ljava/lang/String;
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 361
    :pswitch_0
    invoke-static {p1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->openLink(Ljava/lang/String;)V

    goto :goto_0

    .line 354
    :pswitch_1
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->hasPrimaryClip()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClipDescription()Landroid/content/ClipDescription;

    move-result-object v3

    const-string v4, "text/plain"

    invoke-virtual {v3, v4}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 355
    invoke-virtual {v1}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 357
    :cond_0
    const-string v2, ""

    .line 359
    goto :goto_0

    .line 350
    :pswitch_2
    const-string v3, "FCL Clipboard"

    invoke-static {v3, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v3

    .line 351
    .local v3, "clip":Landroid/content/ClipData;
    invoke-virtual {v1, v3}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 352
    nop

    .line 364
    .end local v3    # "clip":Landroid/content/ClipData;
    :goto_0
    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x7d0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static clearSdlBridgeState()V
    .locals 2

    .line 421
    const/4 v0, 0x0

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->sGamepadDirectInput:Z

    .line 422
    const/4 v1, 0x0

    sput-object v1, Lorg/lwjgl/glfw/CallbackBridge;->sDirectGamepadEnableHandler:Ljava/lang/ref/WeakReference;

    .line 423
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    .line 424
    const/4 v0, 0x0

    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaX:F

    .line 425
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaY:F

    .line 426
    return-void
.end method

.method public static getCurrentMods()I
    .locals 2

    .line 369
    const/4 v0, 0x0

    .line 370
    .local v0, "currMods":I
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingAlt:Z

    if-eqz v1, :cond_0

    .line 371
    or-int/lit8 v0, v0, 0x4

    .line 373
    :cond_0
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCapslock:Z

    if-eqz v1, :cond_1

    .line 374
    or-int/lit8 v0, v0, 0x10

    .line 376
    :cond_1
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCtrl:Z

    if-eqz v1, :cond_2

    .line 377
    or-int/lit8 v0, v0, 0x2

    .line 379
    :cond_2
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingNumlock:Z

    if-eqz v1, :cond_3

    .line 380
    or-int/lit8 v0, v0, 0x20

    .line 382
    :cond_3
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingShift:Z

    if-eqz v1, :cond_4

    .line 383
    or-int/lit8 v0, v0, 0x1

    .line 385
    :cond_4
    return v0
.end method

.method public static native getFps()I
.end method

.method private static getUnicodeChar(II)C
    .locals 3
    .param p0, "androidKeycode"    # I
    .param p1, "glfwMods"    # I

    .line 241
    const/4 v0, 0x0

    .line 242
    .local v0, "meta":I
    and-int/lit8 v1, p1, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 243
    :cond_0
    and-int/lit8 v1, p1, 0x4

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x2

    .line 244
    :cond_1
    and-int/lit8 v1, p1, 0x2

    if-eqz v1, :cond_2

    or-int/lit16 v0, v0, 0x1000

    .line 245
    :cond_2
    sget-object v1, Lorg/lwjgl/glfw/CallbackBridge;->sKeyCharacterMap:Landroid/view/KeyCharacterMap;

    invoke-virtual {v1, p0, v0}, Landroid/view/KeyCharacterMap;->get(II)I

    move-result v1

    .line 246
    .local v1, "unicode":I
    if-lez v1, :cond_3

    const/high16 v2, 0x10000

    if-ge v1, v2, :cond_3

    int-to-char v2, v1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public static isCleanroomActive()Z
    .locals 1

    .line 54
    sget-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->cleanroomActive:Z

    return v0
.end method

.method public static isGrabbing()Z
    .locals 1

    .line 324
    sget-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->isGrabbing:Z

    return v0
.end method

.method static synthetic lambda$onGrabStateChanged$2(ZJ)V
    .locals 4
    .param p0, "grabbing"    # Z
    .param p1, "time"    # J

    .line 450
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->grabLock:Ljava/lang/Object;

    monitor-enter v0

    .line 452
    :try_start_0
    sget-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->isGrabbing:Z

    if-ne v1, p0, :cond_4

    sget-object v1, Lorg/lwjgl/glfw/CallbackBridge;->fclBridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-nez v1, :cond_0

    goto :goto_2

    .line 456
    :cond_0
    invoke-static {}, Lcom/tungsten/fcl/FCLApp;->getActivity()Landroid/app/Activity;

    move-result-object v1

    .line 457
    .local v1, "activity":Landroid/app/Activity;
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 460
    :cond_1
    sget-object v2, Lorg/lwjgl/glfw/CallbackBridge;->fclBridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz p0, :cond_2

    const/4 v3, 0x0

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    :goto_0
    invoke-virtual {v2, v3}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setCursorMode(I)V

    .line 461
    .end local v1    # "activity":Landroid/app/Activity;
    monitor-exit v0

    .line 462
    return-void

    .line 458
    .restart local v1    # "activity":Landroid/app/Activity;
    :cond_3
    :goto_1
    monitor-exit v0

    return-void

    .line 453
    .end local v1    # "activity":Landroid/app/Activity;
    :cond_4
    :goto_2
    monitor-exit v0

    return-void

    .line 461
    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic lambda$postFrameCallbackDelayed$0(Landroid/view/Choreographer$FrameCallback;J)V
    .locals 1
    .param p0, "callback"    # Landroid/view/Choreographer$FrameCallback;
    .param p1, "delayMillis"    # J

    .line 58
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Landroid/view/Choreographer;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method

.method static synthetic lambda$putMouseEventWithCoords$1(IFFJ)V
    .locals 1
    .param p0, "button"    # I
    .param p1, "x"    # F
    .param p2, "y"    # F
    .param p3, "l"    # J

    .line 156
    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->putMouseEventWithCoords(IZFF)V

    return-void
.end method

.method private static native nativeCreateGamepadAxisBuffer()Ljava/nio/ByteBuffer;
.end method

.method private static native nativeCreateGamepadButtonBuffer()Ljava/nio/ByteBuffer;
.end method

.method public static varargs nativeNotifyLauncher(I[I)V
    .locals 0
    .param p0, "type"    # I
    .param p1, "action"    # [I

    .line 137
    invoke-static {p0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->notifyLauncher(I[I)Z

    .line 138
    return-void
.end method

.method private static native nativeResetInputState()V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendChar(C)Z
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendCharMods(CI)Z
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendCursorPos(FF)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendKey(IIII)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendMouseButton(III)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendScreenSize(II)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method private static native nativeSendScroll(DD)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method public static native nativeSetGrabbing(Z)V
.end method

.method public static native nativeSetUseInputStackQueue(Z)V
    .annotation build Ldalvik/annotation/optimization/CriticalNative;
    .end annotation
.end method

.method public static native nativeSetWindowAttrib(II)V
.end method

.method public static varargs notifyLauncher(I[I)Z
    .locals 6
    .param p0, "type"    # I
    .param p1, "action"    # [I

    .line 85
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    array-length v1, p1

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 89
    :cond_0
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 91
    :pswitch_0
    aget v1, p1, v0

    if-nez v1, :cond_4

    .line 92
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->markSdlInitialized()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    .line 93
    return v2

    .line 96
    :cond_1
    :try_start_0
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v4, "FCL: loading SDL3"

    invoke-virtual {v1, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 97
    const-string v1, "SDL3"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 98
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v4, "FCL: loading SDL2"

    invoke-virtual {v1, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 99
    const-string v1, "SDL2"

    invoke-static {v1}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 100
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v4, "FCL: setting up SDL JNI"

    invoke-virtual {v1, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 101
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setupJNI()Z

    .line 103
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->ensureHostContext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 106
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v4, "FCL: binding SDL surface"

    invoke-virtual {v1, v3, v4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 107
    invoke-static {v2}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setSdlEnabled(Z)V

    .line 108
    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getSDLSurface()Lorg/libsdl/app/SDLSurface;

    move-result-object v1

    .line 109
    .local v1, "surface":Lorg/libsdl/app/SDLSurface;
    if-eqz v1, :cond_2

    .line 110
    invoke-virtual {v1}, Lorg/libsdl/app/SDLSurface;->surfaceChanged()V

    .line 111
    sget v3, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    if-lez v3, :cond_2

    sget v3, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    if-lez v3, :cond_2

    .line 112
    sget v3, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    sget v4, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    invoke-virtual {v1, v3, v4}, Lorg/libsdl/app/SDLSurface;->nativeResize(II)V

    .line 115
    :cond_2
    sget-object v3, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v5, "FCL: SDL support enabled!"

    invoke-virtual {v3, v4, v5}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 116
    return v2

    .line 104
    .end local v1    # "surface":Lorg/libsdl/app/SDLSurface;
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "SDL host context unavailable"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .end local p0    # "type":I
    .end local p1    # "action":[I
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .restart local p0    # "type":I
    .restart local p1    # "action":[I
    :catchall_0
    move-exception v1

    .line 118
    .local v1, "e":Ljava/lang/Throwable;
    invoke-static {v0}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->setSdlEnabled(Z)V

    .line 119
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->clearSdlInitialized()V

    .line 120
    sget-object v2, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v4, "FCL: SDL launcher integration is unavailable"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .end local v1    # "e":Ljava/lang/Throwable;
    :cond_4
    aget v1, p1, v0

    .line 127
    :goto_0
    return v0

    .line 86
    :cond_5
    :goto_1
    sget-object v1, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v3, "FCL: SDL notification has no action"

    invoke-virtual {v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 87
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method private static onDirectInputEnable()V
    .locals 3

    .line 432
    sget-object v0, Lcom/tungsten/fclcore/util/Logging;->LOG:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v2, "FCL: Direct gamepad input enabled"

    invoke-virtual {v0, v1, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    .line 433
    const/4 v0, 0x1

    sput-boolean v0, Lorg/lwjgl/glfw/CallbackBridge;->sGamepadDirectInput:Z

    .line 435
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sDirectGamepadEnableHandler:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sDirectGamepadEnableHandler:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;

    .line 436
    .local v0, "enableHandler":Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;
    :goto_0
    if-eqz v0, :cond_1

    .line 437
    invoke-interface {v0}, Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;->onDirectGamepadEnabled()V

    .line 439
    :cond_1
    return-void
.end method

.method private static onGrabStateChanged(Z)V
    .locals 4
    .param p0, "grabbing"    # Z

    .line 444
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->grabLock:Ljava/lang/Object;

    monitor-enter v0

    .line 445
    :try_start_0
    sput-boolean p0, Lorg/lwjgl/glfw/CallbackBridge;->isGrabbing:Z

    .line 446
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 447
    const/4 v0, 0x0

    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaX:F

    .line 448
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaY:F

    .line 449
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sChoreographer:Landroid/view/Choreographer;

    new-instance v1, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda1;-><init>(Z)V

    const-wide/16 v2, 0x10

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/Choreographer;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    .line 463
    return-void

    .line 446
    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private static postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V
    .locals 2
    .param p0, "callback"    # Landroid/view/Choreographer$FrameCallback;
    .param p1, "delayMillis"    # J

    .line 58
    sget-object v0, Lorg/lwjgl/glfw/CallbackBridge;->MAIN_HANDLER:Landroid/os/Handler;

    new-instance v1, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;-><init>(Landroid/view/Choreographer$FrameCallback;J)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 59
    return-void
.end method

.method public static putMouseEventWithCoords(IFF)V
    .locals 3
    .param p0, "button"    # I
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 155
    const/4 v0, 0x1

    invoke-static {p0, v0, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->putMouseEventWithCoords(IZFF)V

    .line 156
    new-instance v0, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda2;-><init>(IFF)V

    const-wide/16 v1, 0x21

    invoke-static {v0, v1, v2}, Lorg/lwjgl/glfw/CallbackBridge;->postFrameCallbackDelayed(Landroid/view/Choreographer$FrameCallback;J)V

    .line 157
    return-void
.end method

.method public static putMouseEventWithCoords(IZFF)V
    .locals 1
    .param p0, "button"    # I
    .param p1, "isDown"    # Z
    .param p2, "x"    # F
    .param p3, "y"    # F

    .line 160
    invoke-static {p2, p3}, Lorg/lwjgl/glfw/CallbackBridge;->sendCursorPos(FF)V

    .line 161
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    invoke-static {p0, v0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->sendMouseKeycode(IIZ)V

    .line 162
    return-void
.end method

.method public static resetInputState()V
    .locals 4

    .line 328
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->nativeResetInputState()V

    .line 329
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    if-eqz v0, :cond_0

    .line 330
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    sget v2, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    const/4 v3, 0x1

    invoke-static {v1, v3, v0, v2, v1}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 332
    :cond_0
    const/4 v0, 0x0

    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaX:F

    .line 333
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaY:F

    .line 334
    sput v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    .line 335
    sput-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingAlt:Z

    .line 336
    sput-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCapslock:Z

    .line 337
    sput-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCtrl:Z

    .line 338
    sput-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingNumlock:Z

    .line 339
    sput-boolean v1, Lorg/lwjgl/glfw/CallbackBridge;->holdingShift:Z

    .line 340
    return-void
.end method

.method public static sendChar(CI)V
    .locals 1
    .param p0, "keychar"    # C
    .param p1, "modifiers"    # I

    .line 230
    invoke-static {p0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendCharMods(CI)Z

    .line 231
    invoke-static {p0}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendChar(C)Z

    .line 232
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 233
    :cond_0
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getAndroidKeycode(C)I

    move-result v0

    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->onNativeKeyDown(I)V

    .line 234
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getAndroidKeycode(C)I

    move-result v0

    invoke-static {v0}, Lorg/libsdl/app/SDLActivity;->onNativeKeyUp(I)V

    .line 235
    return-void
.end method

.method public static sendCursorDelta(FF)V
    .locals 3
    .param p0, "x"    # F
    .param p1, "y"    # F

    .line 183
    sput p0, Lorg/lwjgl/glfw/CallbackBridge;->deltaX:F

    .line 184
    sput p1, Lorg/lwjgl/glfw/CallbackBridge;->deltaY:F

    .line 185
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    add-float/2addr v0, p0

    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    .line 186
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    add-float/2addr v0, p1

    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    .line 187
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendCursorPos(FF)V

    .line 188
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 189
    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, p0, p1, v1}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 190
    return-void
.end method

.method public static sendCursorPos(FF)V
    .locals 5
    .param p0, "x"    # F
    .param p1, "y"    # F

    .line 166
    sget v0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    sub-float v0, p0, v0

    .line 167
    .local v0, "dx":F
    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    sub-float v1, p1, v1

    .line 168
    .local v1, "dy":F
    sput p0, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    .line 169
    sput p1, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    .line 170
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->deltaX:F

    .line 171
    sput v1, Lorg/lwjgl/glfw/CallbackBridge;->deltaY:F

    .line 172
    sget v2, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    sget v3, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    invoke-static {v2, v3}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendCursorPos(FF)V

    .line 173
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    .line 174
    :cond_0
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->isGrabbing()Z

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    .line 176
    const/4 v2, 0x1

    invoke-static {v4, v3, v0, v1, v2}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    goto :goto_0

    .line 178
    :cond_1
    invoke-static {v4, v3, p0, p1, v4}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 180
    :goto_0
    return-void
.end method

.method public static sendKeyPress(I)V
    .locals 2
    .param p0, "keyCode"    # I

    .line 262
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(IIZ)V

    .line 263
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(IIZ)V

    .line 264
    return-void
.end method

.method public static sendKeyPress(ICIIZ)V
    .locals 0
    .param p0, "keyCode"    # I
    .param p1, "keyChar"    # C
    .param p2, "scancode"    # I
    .param p3, "modifiers"    # I
    .param p4, "status"    # Z

    .line 258
    invoke-static {p0, p1, p2, p3, p4}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeycode(ICIIZ)V

    .line 259
    return-void
.end method

.method public static sendKeyPress(IIIZ)V
    .locals 1
    .param p0, "keyCode"    # I
    .param p1, "scancode"    # I
    .param p2, "modifiers"    # I
    .param p3, "status"    # Z

    .line 254
    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2, p3}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(ICIIZ)V

    .line 255
    return-void
.end method

.method public static sendKeyPress(IIZ)V
    .locals 1
    .param p0, "keyCode"    # I
    .param p1, "modifiers"    # I
    .param p2, "status"    # Z

    .line 250
    const/4 v0, 0x0

    invoke-static {p0, v0, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->sendKeyPress(IIIZ)V

    .line 251
    return-void
.end method

.method public static sendKeycode(ICIIZ)V
    .locals 4
    .param p0, "keycode"    # I
    .param p1, "keychar"    # C
    .param p2, "scancode"    # I
    .param p3, "modifiers"    # I
    .param p4, "isDown"    # Z

    .line 194
    if-eqz p0, :cond_6

    .line 195
    invoke-static {p0}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->convertKeycode(I)I

    move-result v0

    .line 196
    .local v0, "code":I
    if-gtz v0, :cond_0

    .line 197
    return-void

    .line 199
    :cond_0
    invoke-static {v0, p2, p4, p3}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendKey(IIII)V

    .line 205
    move v1, p1

    .line 206
    .local v1, "charToSend":C
    if-eqz p4, :cond_1

    if-nez v1, :cond_1

    sget-boolean v2, Lorg/lwjgl/glfw/CallbackBridge;->cleanroomActive:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    if-le v0, v2, :cond_1

    const/16 v2, 0x60

    if-gt v0, v2, :cond_1

    .line 208
    invoke-static {v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getAndroidKeycode(I)I

    move-result v2

    invoke-static {v2, p3}, Lorg/lwjgl/glfw/CallbackBridge;->getUnicodeChar(II)C

    move-result v1

    .line 210
    :cond_1
    if-eqz p4, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isISOControl(C)Z

    move-result v2

    if-nez v2, :cond_2

    .line 211
    invoke-static {v1, p3}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendCharMods(CI)Z

    .line 212
    invoke-static {v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendChar(C)Z

    .line 215
    :cond_2
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v2

    if-nez v2, :cond_3

    return-void

    .line 216
    :cond_3
    invoke-static {v0}, Lcom/tungsten/fclauncher/keycodes/EfficientAndroidLWJGLKeycode;->getSdlAndroidKeycode(I)I

    move-result v2

    .line 217
    .local v2, "androidKeycode":I
    if-nez v2, :cond_4

    return-void

    .line 219
    :cond_4
    if-eqz p4, :cond_5

    .line 220
    :try_start_0
    invoke-static {v2}, Lorg/libsdl/app/SDLActivity;->onNativeKeyDown(I)V

    goto :goto_0

    .line 222
    :cond_5
    invoke-static {v2}, Lorg/libsdl/app/SDLActivity;->onNativeKeyUp(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :goto_0
    goto :goto_1

    .line 224
    :catchall_0
    move-exception v3

    .line 227
    .end local v0    # "code":I
    .end local v1    # "charToSend":C
    .end local v2    # "androidKeycode":I
    :cond_6
    :goto_1
    return-void
.end method

.method public static sendMouseButton(IZ)V
    .locals 1
    .param p0, "button"    # I
    .param p1, "status"    # Z

    .line 267
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    invoke-static {p0, v0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->sendMouseKeycode(IIZ)V

    .line 268
    return-void
.end method

.method public static sendMouseKeycode(I)V
    .locals 2
    .param p0, "keycode"    # I

    .line 305
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->sendMouseKeycode(IIZ)V

    .line 306
    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->getCurrentMods()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->sendMouseKeycode(IIZ)V

    .line 307
    return-void
.end method

.method public static sendMouseKeycode(IIZ)V
    .locals 6
    .param p0, "button"    # I
    .param p1, "modifiers"    # I
    .param p2, "isDown"    # Z

    .line 272
    invoke-static {p0, p2, p1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendMouseButton(III)V

    .line 274
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 275
    :cond_0
    const/4 v0, -0x1

    .line 276
    .local v0, "aKey":I
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 288
    :pswitch_0
    const/16 v0, 0x8

    .line 289
    goto :goto_0

    .line 291
    :pswitch_1
    const/16 v0, 0x10

    goto :goto_0

    .line 284
    :pswitch_2
    const/4 v0, 0x4

    .line 285
    goto :goto_0

    .line 281
    :pswitch_3
    const/4 v0, 0x2

    .line 282
    goto :goto_0

    .line 278
    :pswitch_4
    const/4 v0, 0x1

    .line 279
    nop

    .line 294
    :goto_0
    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 295
    if-eqz p2, :cond_1

    .line 296
    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    or-int/2addr v1, v0

    sput v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    goto :goto_1

    .line 298
    :cond_1
    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    not-int v2, v0

    and-int/2addr v1, v2

    sput v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    .line 300
    :goto_1
    sget v1, Lorg/lwjgl/glfw/CallbackBridge;->sMouseButtonState:I

    xor-int/lit8 v2, p2, 0x1

    sget v3, Lorg/lwjgl/glfw/CallbackBridge;->mouseX:F

    sget v4, Lorg/lwjgl/glfw/CallbackBridge;->mouseY:F

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 302
    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static sendScroll(DD)V
    .locals 4
    .param p0, "xoffset"    # D
    .param p2, "yoffset"    # D

    .line 310
    invoke-static {p0, p1, p2, p3}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendScroll(DD)V

    .line 312
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 313
    :cond_0
    double-to-float v0, p0

    double-to-float v1, p2

    const/4 v2, 0x0

    const/16 v3, 0x8

    invoke-static {v2, v3, v0, v1, v2}, Lorg/libsdl/app/SDLActivity;->onNativeMouse(IIFFZ)V

    .line 314
    return-void
.end method

.method public static sendUpdateWindowSize(II)V
    .locals 0
    .param p0, "w"    # I
    .param p1, "h"    # I

    .line 317
    sput p0, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    .line 318
    sput p1, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    .line 319
    invoke-static {p0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSendScreenSize(II)V

    .line 320
    return-void
.end method

.method public static setCleanroomActive(Z)V
    .locals 0
    .param p0, "active"    # Z

    .line 50
    sput-boolean p0, Lorg/lwjgl/glfw/CallbackBridge;->cleanroomActive:Z

    .line 51
    return-void
.end method

.method public static setDirectGamepadEnableHandler(Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;)V
    .locals 1
    .param p0, "handler"    # Lcom/tungsten/fcl/game/sdl/DirectGamepadEnableHandler;

    .line 417
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lorg/lwjgl/glfw/CallbackBridge;->sDirectGamepadEnableHandler:Ljava/lang/ref/WeakReference;

    .line 418
    return-void
.end method

.method public static setFCLBridge(Lcom/tungsten/fclauncher/bridge/FCLBridge;)V
    .locals 0
    .param p0, "fclBridge"    # Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 413
    sput-object p0, Lorg/lwjgl/glfw/CallbackBridge;->fclBridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 414
    return-void
.end method

.method public static setModifiers(IZ)V
    .locals 0
    .param p0, "keyCode"    # I
    .param p1, "isDown"    # Z

    .line 389
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 399
    :sswitch_0
    sput-boolean p1, Lorg/lwjgl/glfw/CallbackBridge;->holdingAlt:Z

    .line 400
    goto :goto_0

    .line 395
    :sswitch_1
    sput-boolean p1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCtrl:Z

    .line 396
    goto :goto_0

    .line 391
    :sswitch_2
    sput-boolean p1, Lorg/lwjgl/glfw/CallbackBridge;->holdingShift:Z

    .line 392
    goto :goto_0

    .line 407
    :sswitch_3
    sput-boolean p1, Lorg/lwjgl/glfw/CallbackBridge;->holdingNumlock:Z

    goto :goto_0

    .line 403
    :sswitch_4
    sput-boolean p1, Lorg/lwjgl/glfw/CallbackBridge;->holdingCapslock:Z

    .line 404
    nop

    .line 410
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x118 -> :sswitch_4
        0x11a -> :sswitch_3
        0x154 -> :sswitch_2
        0x155 -> :sswitch_1
        0x156 -> :sswitch_0
    .end sparse-switch
.end method

.method public static native setupBridgeWindow(Ljava/lang/Object;)V
.end method
