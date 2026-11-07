.class public final Lcom/pymcl/runtime/GameActivity;
.super Landroid/app/Activity;
.source "GameActivity.kt"

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/GameActivity$Companion;,
        Lcom/pymcl/runtime/GameActivity$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameActivity.kt\ncom/pymcl/runtime/GameActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1#2:464\n37#3,2:465\n37#3,2:467\n363#4,7:469\n*S KotlinDebug\n*F\n+ 1 GameActivity.kt\ncom/pymcl/runtime/GameActivity\n*L\n184#1:465,2\n321#1:467,2\n341#1:469,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e9\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014*\u0001[\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0012\u00102\u001a\u00020+2\u0008\u00103\u001a\u0004\u0018\u000104H\u0014J\u0008\u00105\u001a\u00020+H\u0002J \u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0016J \u0010<\u001a\u00020+2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020-2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020:H\u0016JU\u0010@\u001a\u00020:2\u0006\u0010A\u001a\u00020:2\u0008\u0010B\u001a\u0004\u0018\u00010C2\u0008\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020C0I2\u0008\u0010J\u001a\u0004\u0018\u00010FH\u0007b\u0002\u0008L\u00a2\u0006\u0002\u0010KJ\u0010\u0010M\u001a\u00020+2\u0006\u00107\u001a\u000208H\u0016J\u0010\u0010N\u001a\u00020+2\u0006\u0010O\u001a\u00020-H\u0002J\u0008\u0010P\u001a\u00020+H\u0002J\u0008\u0010Q\u001a\u00020+H\u0002J\u0010\u0010R\u001a\u00020+2\u0006\u0010S\u001a\u00020TH\u0002J\u0008\u0010U\u001a\u00020+H\u0002J\u0008\u0010V\u001a\u00020+H\u0002J\u0018\u0010W\u001a\u00020+2\u0006\u0010X\u001a\u00020:2\u0006\u0010Y\u001a\u00020:H\u0002J\u0010\u0010]\u001a\u00020-2\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020-2\u0006\u0010a\u001a\u00020bH\u0016J\u0010\u0010c\u001a\u00020-2\u0006\u0010d\u001a\u00020_H\u0016J\u0008\u0010f\u001a\u00020+H\u0002J\u0010\u0010g\u001a\u00020+2\u0006\u0010h\u001a\u00020-H\u0016J-\u0010i\u001a\u00020+2\u0006\u0010j\u001a\u00020:2\u000e\u0010k\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020C0I2\u0006\u0010l\u001a\u00020FH\u0016\u00a2\u0006\u0002\u0010mJ\u0008\u0010n\u001a\u00020+H\u0014J\u0008\u0010o\u001a\u00020+H\u0014J\u0008\u0010p\u001a\u00020+H\u0014J\u0008\u0010q\u001a\u00020+H\u0014J\u0008\u0010s\u001a\u00020+H\u0014J\u0008\u0010t\u001a\u00020+H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u00020[X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\\R\u000e\u0010e\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020-X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006v"
    }
    d2 = {
        "Lcom/pymcl/runtime/GameActivity;",
        "Landroid/app/Activity;",
        "Landroid/view/TextureView$SurfaceTextureListener;",
        "<init>",
        "()V",
        "bridge",
        "Lcom/tungsten/fclauncher/bridge/FCLBridge;",
        "request",
        "Lcom/pymcl/runtime/GameLaunchRequest;",
        "settings",
        "Lcom/pymcl/runtime/input/InputSettings;",
        "sink",
        "Lcom/pymcl/runtime/input/TextRoutingInputSink;",
        "handler",
        "Landroid/os/Handler;",
        "gameView",
        "Landroid/view/TextureView;",
        "overlay",
        "Lcom/pymcl/runtime/control/ControlOverlay;",
        "cursorView",
        "Lcom/pymcl/runtime/input/CursorView;",
        "pcKeyboard",
        "Lcom/pymcl/runtime/keyboard/PcKeyboardView;",
        "charInput",
        "Lcom/pymcl/runtime/keyboard/TouchCharInput;",
        "touchController",
        "Lcom/pymcl/runtime/keyboard/TouchControllerBridge;",
        "physical",
        "Lcom/pymcl/runtime/input/PhysicalInput;",
        "look",
        "Lcom/pymcl/runtime/input/LookGesture;",
        "cursor",
        "Lcom/pymcl/runtime/input/CursorGesture;",
        "textSender",
        "Lcom/pymcl/runtime/keyboard/GameTextSender;",
        "menuButton",
        "Landroid/widget/TextView;",
        "launcherPrefs",
        "Lcom/pymcl/runtime/input/LauncherPrefs;",
        "gamepadMode",
        "Lcom/pymcl/runtime/input/GamepadModeController;",
        "removePrefsListener",
        "Lkotlin/Function0;",
        "",
        "grabbed",
        "",
        "gameSurface",
        "Landroid/view/Surface;",
        "sdlPrepared",
        "mouseCaptureWanted",
        "onCreate",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "buildViews",
        "onSurfaceTextureAvailable",
        "st",
        "Landroid/graphics/SurfaceTexture;",
        "width",
        "",
        "height",
        "onSurfaceTextureSizeChanged",
        "onSurfaceTextureDestroyed",
        "setRequestedOrientation",
        "requestedOrientation",
        "messageboxShowMessageBox",
        "flags",
        "title",
        "",
        "message",
        "buttonFlags",
        "",
        "buttonIds",
        "buttonTexts",
        "",
        "colors",
        "(ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I",
        "Landroidx/annotation/Keep;",
        "onSurfaceTextureUpdated",
        "onGrabChanged",
        "g",
        "applyPointerCapture",
        "restoreGameFocus",
        "onAction",
        "a",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "showGameMenu",
        "showQuickInput",
        "writeWindowSizeOverride",
        "w",
        "h",
        "lookTick",
        "com/pymcl/runtime/GameActivity$lookTick$1",
        "Lcom/pymcl/runtime/GameActivity$lookTick$1;",
        "onBackgroundTouch",
        "e",
        "Landroid/view/MotionEvent;",
        "dispatchKeyEvent",
        "event",
        "Landroid/view/KeyEvent;",
        "dispatchGenericMotionEvent",
        "ev",
        "gamepadTicking",
        "scheduleGamepadTick",
        "onWindowFocusChanged",
        "hasFocus",
        "onRequestPermissionsResult",
        "requestCode",
        "permissions",
        "grantResults",
        "(I[Ljava/lang/String;[I)V",
        "onResume",
        "onPause",
        "onStart",
        "onStop",
        "exited",
        "onDestroy",
        "releaseInputs",
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
.field public static final Companion:Lcom/pymcl/runtime/GameActivity$Companion;

.field public static final EXTRA_REQUEST:Ljava/lang/String; = "pymcl.launch_request"

.field private static final TAG:Ljava/lang/String; = "PyMCL-Game"


# instance fields
.field private bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

.field private charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

.field private cursor:Lcom/pymcl/runtime/input/CursorGesture;

.field private cursorView:Lcom/pymcl/runtime/input/CursorView;

.field private volatile exited:Z

.field private gameSurface:Landroid/view/Surface;

.field private gameView:Landroid/view/TextureView;

.field private gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

.field private gamepadTicking:Z

.field private volatile grabbed:Z

.field private final handler:Landroid/os/Handler;

.field private launcherPrefs:Lcom/pymcl/runtime/input/LauncherPrefs;

.field private look:Lcom/pymcl/runtime/input/LookGesture;

.field private final lookTick:Lcom/pymcl/runtime/GameActivity$lookTick$1;

.field private menuButton:Landroid/widget/TextView;

.field private hbDown:Z

.field private hbT:J

.field private hbX:F

.field private hbY:F

.field private mouseCaptureWanted:Z

.field private overlay:Lcom/pymcl/runtime/control/ControlOverlay;

.field private pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

.field private physical:Lcom/pymcl/runtime/input/PhysicalInput;

.field private removePrefsListener:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private request:Lcom/pymcl/runtime/GameLaunchRequest;

.field private sdlPrepared:Z

.field private settings:Lcom/pymcl/runtime/input/InputSettings;

.field private final sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

.field private textSender:Lcom/pymcl/runtime/keyboard/GameTextSender;

.field private touchController:Lcom/pymcl/runtime/keyboard/TouchControllerBridge;


# direct methods
.method public static synthetic $r8$lambda$-pCMy_P80mDbe2VRc4MMyxCsj7M()V
    .locals 0

    invoke-static {}, Lcom/pymcl/runtime/GameActivity;->onDestroy$lambda$1()V

    return-void
.end method

.method public static synthetic $r8$lambda$1M7yjN5Rfkna1Rqg7PCs7amwHUg(Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameActivity;->showGameMenu$lambda$0(Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$2dQS4uZTkvPHRKGk5L2hD1aZnUs(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/control/ControlLayout;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$6(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/control/ControlLayout;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$3XPyihatoWtyyX_-mg-H4LKfTek(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$1(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$5GvVy9YAYJpCFyBswQ7OyynkwN0(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/pymcl/runtime/GameActivity;->showQuickInput$lambda$0$0(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$8z9Rt5jtdS3jal0joZaRUzpgXVk(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$0$1(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$BrwtIzT_0Ys8h1BVLoXihtMjDK8(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$4$0(Lcom/pymcl/runtime/GameActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$D7Rqv_YaVCSVkETWJDgQHSD3JTY(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$0$2(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$DD9CnhuaedIRghNq3msl9qPY5No(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$5(Lcom/pymcl/runtime/GameActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$Dsjhnjrrj2qzQ7JSoIRRLuEuZBk(Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameActivity;->showQuickInput$lambda$1(Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$Ezug_7i2tkBUaXV99Ja8l5czXAs(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$2(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$FuKRiUm4vyDDIXOZ1b4Qbqp2SoA(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$8$0(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V

    return-void
.end method

.method public static synthetic $r8$lambda$JPsnr4YloDe9G-8CBrsYcbJo6KQ(Lcom/pymcl/runtime/GameActivity;)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->sink$lambda$0(Lcom/pymcl/runtime/GameActivity;)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Jr-yErg6flc5GYS-1Vz6COUBbXY(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/GamepadMapping;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->showGameMenu$lambda$0$0(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/GamepadMapping;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TWnE9F1kfGNv0S93xVaVDuv95ZU(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$3(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V

    return-void
.end method

.method public static synthetic $r8$lambda$UdtYr1ek2N4HX2vGqWc0V9i3iqQ(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$0$0(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$YADM36OiN5ukR_P6EHfho5UIU-Y(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$3(Lcom/pymcl/runtime/GameActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$bMg0aiogVYJDJcdL1zAwM236cNY(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$1(Lcom/pymcl/runtime/GameActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$c6dpmocwDCLI9GnSj_IJGZkc8Kg(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/GameActivity;->showQuickInput$lambda$0(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$f_7oiTXGAQ8yH4SYOqVzVClExFc(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$5$0(Lcom/pymcl/runtime/GameActivity;)V

    return-void
.end method

.method public static synthetic $r8$lambda$iN5y2m2EXo7bNmJmiFNRmyDRv_M(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$4(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$lCx5isPpldBeNsL20bvRg7Ck9BY(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$9$0(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$vfrE9O5667rwjQoMpT4FEoXKTlg(Lcom/pymcl/runtime/GameActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onCreate$lambda$4(Lcom/pymcl/runtime/GameActivity;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$vkhCEPxZTxIlsiGALxHbpa_wz2E(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$13(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method public static synthetic $r8$lambda$zBdtTBaPmGVxtoZvBOxA1-6KBlQ(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameActivity;->buildViews$lambda$8(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/GameActivity$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/GameActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/GameActivity;->Companion:Lcom/pymcl/runtime/GameActivity$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 49
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 59
    new-instance v0, Lcom/pymcl/runtime/input/TextRoutingInputSink;

    new-instance v1, Lcom/pymcl/runtime/input/BridgeInputSink;

    new-instance v2, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda7;

    invoke-direct {v2, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda7;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/input/BridgeInputSink;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lcom/pymcl/runtime/input/InputSink;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/runtime/input/TextRoutingInputSink;-><init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/SdlTextChannel;Lcom/pymcl/runtime/input/TextRoute;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    .line 60
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    .line 349
    new-instance v0, Lcom/pymcl/runtime/GameActivity$lookTick$1;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/GameActivity$lookTick$1;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->lookTick:Lcom/pymcl/runtime/GameActivity$lookTick$1;

    .line 49
    return-void
.end method

.method public static final synthetic access$applyPointerCapture(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->applyPointerCapture()V

    return-void
.end method

.method public static final synthetic access$getCharInput$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/keyboard/TouchCharInput;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    return-object v0
.end method

.method public static final synthetic access$getGamepadMode$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/input/GamepadModeController;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    return-object v0
.end method

.method public static final synthetic access$getGrabbed$p(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    return v0
.end method

.method public static final synthetic access$getHandler$p(Lcom/pymcl/runtime/GameActivity;)Landroid/os/Handler;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    return-object v0
.end method

.method public static final synthetic access$getLook$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/input/LookGesture;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    return-object v0
.end method

.method public static final synthetic access$getMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->mouseCaptureWanted:Z

    return v0
.end method

.method public static final synthetic access$getPhysical$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/input/PhysicalInput;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    return-object v0
.end method

.method public static final synthetic access$onAction(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "a"    # Lcom/pymcl/runtime/input/Keys$Action;

    .line 49
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    return-void
.end method

.method public static final synthetic access$onGrabChanged(Lcom/pymcl/runtime/GameActivity;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "g"    # Z

    .line 49
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onGrabChanged(Z)V

    return-void
.end method

.method public static final synthetic access$setExited$p(Lcom/pymcl/runtime/GameActivity;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "<set-?>"    # Z

    .line 49
    iput-boolean p1, p0, Lcom/pymcl/runtime/GameActivity;->exited:Z

    return-void
.end method

.method public static final synthetic access$setGamepadTicking$p(Lcom/pymcl/runtime/GameActivity;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "<set-?>"    # Z

    .line 49
    iput-boolean p1, p0, Lcom/pymcl/runtime/GameActivity;->gamepadTicking:Z

    return-void
.end method

.method public static final synthetic access$setMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "<set-?>"    # Z

    .line 49
    iput-boolean p1, p0, Lcom/pymcl/runtime/GameActivity;->mouseCaptureWanted:Z

    return-void
.end method

.method private final applyPointerCapture()V
    .locals 3

    .line 270
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    const/4 v1, 0x0

    const-string v2, "gameView"

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->mouseCaptureWanted:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->hasWindowFocus()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Landroid/view/TextureView;->requestPointerCapture()V

    goto :goto_2

    .line 271
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Landroid/view/TextureView;->hasPointerCapture()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v1, v0

    :goto_1
    invoke-virtual {v1}, Landroid/view/TextureView;->releasePointerCapture()V

    .line 272
    :cond_4
    :goto_2
    return-void
.end method

.method private final buildViews()V
    .locals 20

    .line 118
    move-object/from16 v0, p0

    new-instance v1, Landroid/widget/FrameLayout;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 119
    .local v1, "root":Landroid/widget/FrameLayout;
    new-instance v2, Landroid/view/TextureView;

    move-object v3, v0

    check-cast v3, Landroid/content/Context;

    invoke-direct {v2, v3}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    move-object v3, v2

    .local v3, "$this$buildViews_u24lambda_u240":Landroid/view/TextureView;
    const/4 v4, 0x0

    .line 120
    .local v4, "$i$a$-apply-GameActivity$buildViews$1":I
    move-object v5, v0

    check-cast v5, Landroid/view/TextureView$SurfaceTextureListener;

    invoke-virtual {v3, v5}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    .line 121
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Landroid/view/TextureView;->setFocusable(Z)V

    invoke-virtual {v3, v5}, Landroid/view/TextureView;->setFocusableInTouchMode(Z)V

    .line 122
    new-instance v6, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda20;

    invoke-direct {v6, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda20;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v3, v6}, Landroid/view/TextureView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 123
    new-instance v6, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda21;

    invoke-direct {v6, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda21;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v3, v6}, Landroid/view/TextureView;->setOnCapturedPointerListener(Landroid/view/View$OnCapturedPointerListener;)V

    .line 124
    new-instance v6, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda22;

    invoke-direct {v6, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda22;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v3, v6}, Landroid/view/TextureView;->setOnGenericMotionListener(Landroid/view/View$OnGenericMotionListener;)V

    .line 125
    nop

    .line 119
    .end local v3    # "$this$buildViews_u24lambda_u240":Landroid/view/TextureView;
    .end local v4    # "$i$a$-apply-GameActivity$buildViews$1":I
    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    .line 126
    new-instance v7, Lcom/pymcl/runtime/input/LookGesture;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    move-object v8, v2

    check-cast v8, Lcom/pymcl/runtime/input/InputSink;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    const-string v3, "settings"

    const/4 v4, 0x0

    if-nez v2, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_0
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->getLookSensitivity()F

    move-result v9

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v2, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->getLongPressMs()J

    move-result-wide v10

    const/16 v15, 0x18

    const/16 v16, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Lcom/pymcl/runtime/input/LookGesture;-><init>(Lcom/pymcl/runtime/input/InputSink;FJJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v7, v0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    .line 127
    new-instance v8, Lcom/pymcl/runtime/input/CursorGesture;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    move-object v9, v2

    check-cast v9, Lcom/pymcl/runtime/input/InputSink;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v2, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_2
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/InputSettings;->getVirtualMouse()Z

    move-result v10

    const/16 v18, 0x7c

    const/16 v19, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lcom/pymcl/runtime/input/CursorGesture;-><init>(Lcom/pymcl/runtime/input/InputSink;ZFJFJFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    .line 128
    new-instance v2, Lcom/pymcl/runtime/keyboard/TouchCharInput;

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    check-cast v7, Lcom/pymcl/runtime/input/InputSink;

    new-instance v8, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda23;

    invoke-direct {v8, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda23;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-direct {v2, v6, v7, v8}, Lcom/pymcl/runtime/keyboard/TouchCharInput;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V

    .line 464
    move-object v6, v2

    .local v6, "$this$buildViews_u24lambda_u242":Lcom/pymcl/runtime/keyboard/TouchCharInput;
    const/4 v7, 0x0

    .line 128
    .local v7, "$i$a$-apply-GameActivity$buildViews$3":I
    iget-object v8, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v8, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v4

    :cond_3
    invoke-virtual {v8}, Lcom/pymcl/runtime/input/InputSettings;->getImeNoFullscreen()Z

    move-result v8

    invoke-virtual {v6, v8}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->setNoFullscreen(Z)V

    .end local v6    # "$this$buildViews_u24lambda_u242":Lcom/pymcl/runtime/keyboard/TouchCharInput;
    .end local v7    # "$i$a$-apply-GameActivity$buildViews$3":I
    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    .line 129
    new-instance v9, Lcom/pymcl/runtime/keyboard/GameTextSender;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    move-object v10, v2

    check-cast v10, Lcom/pymcl/runtime/input/InputSink;

    new-instance v11, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda24;

    invoke-direct {v11, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda24;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    const/16 v16, 0x1c

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    invoke-direct/range {v9 .. v17}, Lcom/pymcl/runtime/keyboard/GameTextSender;-><init>(Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v9, v0, Lcom/pymcl/runtime/GameActivity;->textSender:Lcom/pymcl/runtime/keyboard/GameTextSender;

    .line 130
    new-instance v2, Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    check-cast v7, Lcom/pymcl/runtime/input/InputSink;

    new-instance v8, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda1;

    invoke-direct {v8, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-direct {v2, v6, v7, v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lkotlin/jvm/functions/Function0;)V

    .line 464
    move-object v6, v2

    .local v6, "$this$buildViews_u24lambda_u245":Lcom/pymcl/runtime/keyboard/PcKeyboardView;
    const/4 v7, 0x0

    .line 130
    .local v7, "$i$a$-apply-GameActivity$buildViews$6":I
    const/16 v8, 0x8

    invoke-virtual {v6, v8}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setVisibility(I)V

    .end local v6    # "$this$buildViews_u24lambda_u245":Lcom/pymcl/runtime/keyboard/PcKeyboardView;
    .end local v7    # "$i$a$-apply-GameActivity$buildViews$6":I
    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    .line 131
    new-instance v9, Lcom/pymcl/runtime/control/ControlOverlay;

    move-object v10, v0

    check-cast v10, Landroid/content/Context;

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    move-object v11, v2

    check-cast v11, Lcom/pymcl/runtime/input/InputSink;

    sget-object v2, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v2, v6}, Lcom/pymcl/runtime/input/RuntimeInput;->layoutStore(Landroid/content/Context;)Lcom/pymcl/runtime/control/ControlLayoutStore;

    move-result-object v12

    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v2, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v13, v4

    goto :goto_0

    :cond_4
    move-object v13, v2

    :goto_0
    new-instance v2, Lcom/pymcl/runtime/GameActivity$buildViews$7;

    invoke-direct {v2, v0}, Lcom/pymcl/runtime/GameActivity$buildViews$7;-><init>(Ljava/lang/Object;)V

    move-object v14, v2

    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-direct/range {v9 .. v14}, Lcom/pymcl/runtime/control/ControlOverlay;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/control/ControlLayoutStore;Lcom/pymcl/runtime/input/InputSettings;Lkotlin/jvm/functions/Function1;)V

    iput-object v9, v0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    .line 132
    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    const-string v6, "overlay"

    if-nez v2, :cond_5

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_5
    new-instance v7, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda2;

    invoke-direct {v7, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v2, v7}, Lcom/pymcl/runtime/control/ControlOverlay;->setOnLayoutChanged(Lkotlin/jvm/functions/Function1;)V

    .line 133
    new-instance v2, Lcom/pymcl/runtime/input/CursorView;

    move-object v7, v0

    check-cast v7, Landroid/content/Context;

    invoke-direct {v2, v7}, Lcom/pymcl/runtime/input/CursorView;-><init>(Landroid/content/Context;)V

    .line 464
    move-object v7, v2

    .local v7, "$this$buildViews_u24lambda_u247":Lcom/pymcl/runtime/input/CursorView;
    const/4 v9, 0x0

    .line 133
    .local v9, "$i$a$-apply-GameActivity$buildViews$9":I
    invoke-virtual {v7, v8}, Lcom/pymcl/runtime/input/CursorView;->setVisibility(I)V

    .end local v7    # "$this$buildViews_u24lambda_u247":Lcom/pymcl/runtime/input/CursorView;
    .end local v9    # "$i$a$-apply-GameActivity$buildViews$9":I
    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->cursorView:Lcom/pymcl/runtime/input/CursorView;

    .line 134
    new-instance v2, Lcom/pymcl/runtime/input/PhysicalInput;

    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    check-cast v7, Lcom/pymcl/runtime/input/InputSink;

    iget-object v8, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v8, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v4

    :cond_6
    new-instance v9, Lcom/pymcl/runtime/GameActivity$buildViews$10;

    invoke-direct {v9, v0}, Lcom/pymcl/runtime/GameActivity$buildViews$10;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    check-cast v9, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    invoke-direct {v2, v7, v8, v9}, Lcom/pymcl/runtime/input/PhysicalInput;-><init>(Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/input/InputSettings;Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)V

    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    .line 142
    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    const-string v7, "physical"

    if-nez v2, :cond_7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_7
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/PhysicalInput;->getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;

    move-result-object v2

    sget-object v8, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v9, v0

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v8, v9}, Lcom/pymcl/runtime/input/RuntimeInput;->gamepadMapping(Landroid/content/Context;)Lcom/pymcl/runtime/input/GamepadMappingStore;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/runtime/input/GamepadMappingStore;->load()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v8

    invoke-virtual {v2, v8}, Lcom/pymcl/runtime/input/GamepadMapper;->setMapping(Lcom/pymcl/runtime/input/GamepadMapping;)V

    .line 143
    iget-object v2, v0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez v2, :cond_8

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v4

    :cond_8
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/PhysicalInput;->getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;

    move-result-object v2

    new-instance v7, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda3;

    invoke-direct {v7, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v2, v7}, Lcom/pymcl/runtime/input/GamepadMapper;->setOnAction(Lkotlin/jvm/functions/Function1;)V

    .line 145
    new-instance v2, Landroid/widget/TextView;

    move-object v7, v0

    check-cast v7, Landroid/content/Context;

    invoke-direct {v2, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v7, v2

    .local v7, "$this$buildViews_u24lambda_u249":Landroid/widget/TextView;
    const/4 v8, 0x0

    .line 146
    .local v8, "$i$a$-apply-GameActivity$buildViews$12":I
    const-string v9, "\u2261"

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v9, 0x41900000    # 18.0f

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v9, 0x11

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 147
    const v9, -0x22000001

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v9, 0x55000000

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setBackgroundColor(I)V

    .line 148
    const v9, 0x3f333333    # 0.7f

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setAlpha(F)V

    .line 149
    new-instance v9, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda4;

    invoke-direct {v9, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda4;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    nop

    .line 145
    .end local v7    # "$this$buildViews_u24lambda_u249":Landroid/widget/TextView;
    .end local v8    # "$i$a$-apply-GameActivity$buildViews$12":I
    iput-object v2, v0, Lcom/pymcl/runtime/GameActivity;->menuButton:Landroid/widget/TextView;

    .line 151
    const/4 v2, -0x1

    .line 152
    .local v2, "match":I
    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    if-nez v7, :cond_9

    const-string v7, "charInput"

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v7, v4

    :cond_9
    check-cast v7, Landroid/view/View;

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v8, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v8, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v7, v8}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->touchController:Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    if-eqz v7, :cond_b

    .line 464
    .local v7, "tc":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    const/4 v8, 0x0

    .line 154
    .local v8, "$i$a$-let-GameActivity$buildViews$13":I
    new-instance v9, Lcom/pymcl/runtime/keyboard/TextFieldInputView;

    move-object v10, v0

    check-cast v10, Landroid/content/Context;

    move-object v11, v7

    check-cast v11, Lcom/pymcl/runtime/keyboard/TextFieldChannel;

    invoke-direct {v9, v10, v11}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/keyboard/TextFieldChannel;)V

    .line 464
    move-object v10, v9

    .local v10, "$this$buildViews_u24lambda_u2410_u240":Lcom/pymcl/runtime/keyboard/TextFieldInputView;
    const/4 v11, 0x0

    .line 154
    .local v11, "$i$a$-apply-GameActivity$buildViews$13$1":I
    iget-object v12, v0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v12, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v12, v4

    :cond_a
    invoke-virtual {v12}, Lcom/pymcl/runtime/input/InputSettings;->getImeNoFullscreen()Z

    move-result v3

    invoke-virtual {v10, v3}, Lcom/pymcl/runtime/keyboard/TextFieldInputView;->setNoFullscreen(Z)V

    .end local v10    # "$this$buildViews_u24lambda_u2410_u240":Lcom/pymcl/runtime/keyboard/TextFieldInputView;
    .end local v11    # "$i$a$-apply-GameActivity$buildViews$13$1":I
    check-cast v9, Landroid/view/View;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v3, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v9, v3}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    .end local v7    # "tc":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    .end local v8    # "$i$a$-let-GameActivity$buildViews$13":I
    :cond_b
    iget-object v3, v0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v3, :cond_c

    const-string v3, "gameView"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_c
    check-cast v3, Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 156
    iget-object v3, v0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v3, :cond_d

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_d
    check-cast v3, Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 157
    iget-object v3, v0, Lcom/pymcl/runtime/GameActivity;->cursorView:Lcom/pymcl/runtime/input/CursorView;

    if-nez v3, :cond_e

    const-string v3, "cursorView"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_e
    check-cast v3, Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 158
    iget-object v3, v0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    if-nez v3, :cond_f

    const-string v3, "pcKeyboard"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v3, v4

    :cond_f
    check-cast v3, Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v6, 0x0

    invoke-direct {v5, v2, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 464
    move-object v7, v5

    .local v7, "$this$buildViews_u24lambda_u2411":Landroid/widget/FrameLayout$LayoutParams;
    const/4 v8, 0x0

    .line 158
    .local v8, "$i$a$-apply-GameActivity$buildViews$14":I
    const/16 v9, 0x50

    iput v9, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .end local v7    # "$this$buildViews_u24lambda_u2411":Landroid/widget/FrameLayout$LayoutParams;
    .end local v8    # "$i$a$-apply-GameActivity$buildViews$14":I
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v3, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 159
    invoke-virtual {v0}, Lcom/pymcl/runtime/GameActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 160
    .local v3, "d":F
    iget-object v5, v0, Lcom/pymcl/runtime/GameActivity;->menuButton:Landroid/widget/TextView;

    if-nez v5, :cond_10

    const-string v5, "menuButton"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_10
    move-object v4, v5

    :goto_1
    check-cast v4, Landroid/view/View;

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v7, 0x28

    int-to-float v7, v7

    mul-float/2addr v7, v3

    float-to-int v7, v7

    const/16 v8, 0x1c

    int-to-float v8, v8

    mul-float/2addr v8, v3

    float-to-int v8, v8

    invoke-direct {v5, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 464
    move-object v7, v5

    .local v7, "$this$buildViews_u24lambda_u2412":Landroid/widget/FrameLayout$LayoutParams;
    const/4 v8, 0x0

    .line 160
    .local v8, "$i$a$-apply-GameActivity$buildViews$15":I
    const/16 v9, 0x31

    iput v9, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .end local v7    # "$this$buildViews_u24lambda_u2412":Landroid/widget/FrameLayout$LayoutParams;
    .end local v8    # "$i$a$-apply-GameActivity$buildViews$15":I
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1, v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 161
    new-instance v4, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda5;

    invoke-direct {v4, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda5;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 166
    move-object v4, v1

    check-cast v4, Landroid/view/View;

    invoke-virtual {v0, v4}, Lcom/pymcl/runtime/GameActivity;->setContentView(Landroid/view/View;)V

    .line 167
    invoke-direct {v0, v6}, Lcom/pymcl/runtime/GameActivity;->onGrabChanged(Z)V

    .line 168
    return-void
.end method

.method private static final buildViews$lambda$0$0(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p2, "e"    # Landroid/view/MotionEvent;

    .line 122
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lcom/pymcl/runtime/GameActivity;->onBackgroundTouch(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method private static final buildViews$lambda$0$1(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p2, "e"    # Landroid/view/MotionEvent;

    .line 123
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez p1, :cond_0

    const-string p1, "physical"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/pymcl/runtime/input/PhysicalInput;->onCapturedPointer(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method private static final buildViews$lambda$0$2(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p2, "e"    # Landroid/view/MotionEvent;

    .line 124
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez p1, :cond_0

    const-string p1, "physical"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lcom/pymcl/runtime/input/PhysicalInput;->onGenericMotion(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method private static final buildViews$lambda$1(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 128
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->restoreGameFocus()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final buildViews$lambda$13(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;IIIIIIII)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p4, "r"    # I
    .param p5, "b"    # I

    .line 162
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    const-string p2, "pcKeyboard"

    const/4 p3, 0x0

    if-nez p1, :cond_0

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, p3

    :cond_0
    iget-object p6, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    if-nez p6, :cond_1

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p6, p3

    :cond_1
    invoke-virtual {p6}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    const-string p6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"

    invoke-static {p2, p6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 464
    move-object p6, p2

    .local p6, "$this$buildViews_u24lambda_u2413_u240":Landroid/widget/FrameLayout$LayoutParams;
    const/4 p7, 0x0

    .line 162
    .local p7, "$i$a$-apply-GameActivity$buildViews$16$1":I
    int-to-float p8, p5

    const p9, 0x3ef5c28f    # 0.48f

    mul-float/2addr p8, p9

    float-to-int p8, p8

    iput p8, p6, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .end local p6    # "$this$buildViews_u24lambda_u2413_u240":Landroid/widget/FrameLayout$LayoutParams;
    .end local p7    # "$i$a$-apply-GameActivity$buildViews$16$1":I
    check-cast p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {p1, p2}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    const-string p2, "cursor"

    if-nez p1, :cond_2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p1, p3

    :cond_2
    int-to-float p6, p4

    invoke-virtual {p1, p6}, Lcom/pymcl/runtime/input/CursorGesture;->setScreenW(F)V

    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez p1, :cond_3

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object p3, p1

    :goto_0
    int-to-float p1, p5

    invoke-virtual {p3, p1}, Lcom/pymcl/runtime/input/CursorGesture;->setScreenH(F)V

    .line 164
    iget-object p1, p0, Lcom/pymcl/runtime/GameActivity;->touchController:Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    if-eqz p1, :cond_4

    .line 464
    .local p1, "it":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    const/4 p2, 0x0

    .line 164
    .local p2, "$i$a$-let-GameActivity$buildViews$16$2":I
    const/4 p3, 0x1

    invoke-static {p4, p3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p6

    invoke-virtual {p1, p6}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->setWidth(I)V

    invoke-static {p5, p3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p3

    invoke-virtual {p1, p3}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->setHeight(I)V

    .line 165
    .end local p1    # "it":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    .end local p2    # "$i$a$-let-GameActivity$buildViews$16$2":I
    :cond_4
    return-void
.end method

.method private static final buildViews$lambda$3(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 129
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static final buildViews$lambda$4(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 130
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    if-nez v0, :cond_0

    const-string v0, "pcKeyboard"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setVisibility(I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final buildViews$lambda$6(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/control/ControlLayout;)Lkotlin/Unit;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "it"    # Lcom/pymcl/runtime/control/ControlLayout;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    sget-object v0, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v2, :cond_0

    const-string v2, "settings"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v2, 0x0

    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/pymcl/runtime/input/RuntimeInput;->saveSettings(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSettings;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final buildViews$lambda$8(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "a"    # Lcom/pymcl/runtime/input/Keys$Action;

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    new-instance v0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0, p1}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;-><init>(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final buildViews$lambda$8$0(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "$a"    # Lcom/pymcl/runtime/input/Keys$Action;

    .line 143
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    return-void
.end method

.method private static final buildViews$lambda$9$0(Lcom/pymcl/runtime/GameActivity;Landroid/view/View;)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "it"    # Landroid/view/View;

    .line 149
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->showGameMenu()V

    return-void
.end method

.method private final onAction(Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 5
    .param p1, "a"    # Lcom/pymcl/runtime/input/Keys$Action;

    .line 277
    sget-object v0, Lcom/pymcl/runtime/GameActivity$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/pymcl/runtime/input/Keys$Action;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 287
    :pswitch_0
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->showGameMenu()V

    goto/16 :goto_5

    .line 286
    :pswitch_1
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->tapKey(I)V

    goto/16 :goto_5

    .line 285
    :pswitch_2
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v0, :cond_0

    const-string v0, "overlay"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    invoke-virtual {v2, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->setEditing(Z)V

    goto/16 :goto_5

    .line 282
    :pswitch_3
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    const-string v3, "cursor"

    if-nez v0, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_1
    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v4, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_2
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v4

    xor-int/2addr v1, v4

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/CursorGesture;->setVirtualMouse(Z)V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    const-string v1, "settings"

    if-nez v0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_3
    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v4, :cond_4

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v2

    :cond_4
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v3

    invoke-virtual {v0, v3}, Lcom/pymcl/runtime/input/InputSettings;->setVirtualMouse(Z)V

    .line 283
    sget-object v0, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v4, :cond_5

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v2, v4

    :goto_1
    invoke-virtual {v0, v3, v2}, Lcom/pymcl/runtime/input/RuntimeInput;->saveSettings(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSettings;)V

    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/GameActivity;->onGrabChanged(Z)V

    goto :goto_5

    .line 280
    :pswitch_4
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->showQuickInput()V

    goto :goto_5

    .line 279
    :pswitch_5
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    const-string v1, "pcKeyboard"

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    iget-object v3, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    if-nez v3, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_7
    move-object v2, v3

    :goto_2
    invoke-virtual {v2}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_8

    const/16 v1, 0x8

    goto :goto_3

    :cond_8
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->setVisibility(I)V

    goto :goto_5

    .line 278
    :pswitch_6
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    if-nez v0, :cond_9

    const-string v0, "charInput"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    move-object v2, v0

    :goto_4
    invoke-virtual {v2}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->toggle()V

    .line 289
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final hbZone(FF)Z
    .locals 4
    .param p1, "x"    # F
    .param p2, "y"    # F

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-eqz v0, :hbzone_no

    invoke-virtual {v0}, Landroid/view/TextureView;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0}, Landroid/view/TextureView;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const v2, 0x3f59999a    # 0.85f

    mul-float/2addr v0, v2

    cmpl-float v2, p2, v0

    if-lez v2, :hbzone_no

    const v2, 0x3eae147b    # 0.34f

    mul-float v3, v1, v2

    cmpl-float v2, p1, v3

    if-ltz v2, :hbzone_no

    const v2, 0x3f28f5c3    # 0.66f

    mul-float/2addr v1, v2

    cmpl-float v2, p1, v1

    if-gtz v2, :hbzone_no

    const/4 v0, 0x1

    return v0

    :hbzone_no
    const/4 v0, 0x0

    return v0
.end method

.method private final hbSlot(F)I
    .locals 3
    .param p1, "x"    # F

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-eqz v0, :hbslot_mid

    invoke-virtual {v0}, Landroid/view/TextureView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float v1, p1, v0

    const v2, 0x3eae147b    # 0.34f

    sub-float/2addr v1, v2

    const v2, 0x3ea3d70a    # 0.32f

    div-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    const v2, 0x41100000    # 9.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    const/16 v2, 0x8

    if-le v1, v2, :hbslot_ret

    const/16 v1, 0x8

    :hbslot_ret
    return v1

    :hbslot_mid
    const/4 v1, 0x4

    return v1
.end method

.method private final onBackgroundTouch(Landroid/view/MotionEvent;)Z
    .locals 12
    .param p1, "e"    # Landroid/view/MotionEvent;

    .line 354
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "overlay"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getEditing()Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    .line 355
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    .line 357
    .local v3, "t":J
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->touchController:Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    .line 358
    .local v0, "tc":Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    iget-boolean v5, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    if-eqz v5, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->onTouch(Landroid/view/MotionEvent;)V

    return v2

    .line 359
    :cond_2
    iget-boolean v5, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    const/4 v6, 0x0

    if-eqz v5, :cond_b

    .line 360
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    const-string v7, "look"

    if-nez v5, :cond_3

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_3
    iget-object v8, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    const-string v9, "settings"

    if-nez v8, :cond_4

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v1

    :cond_4
    invoke-virtual {v8}, Lcom/pymcl/runtime/input/InputSettings;->getLookSensitivity()F

    move-result v8

    invoke-virtual {v5, v8}, Lcom/pymcl/runtime/input/LookGesture;->setSensitivity(F)V

    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v5, :cond_5

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_5
    iget-object v8, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v8, :cond_6

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v8, v1

    :cond_6
    invoke-virtual {v8}, Lcom/pymcl/runtime/input/InputSettings;->getLongPressMs()J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Lcom/pymcl/runtime/input/LookGesture;->setLongPressMs(J)V

    .line 361
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto :goto_4

    .line 365
    :pswitch_0
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v5, :cond_7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_7
    move-object v1, v5

    :goto_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/pymcl/runtime/GameActivity;->hbDown:Z

    goto :goto_4

    .line 363
    :pswitch_1
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v5, :cond_8

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_8
    move-object v1, v5

    :goto_1
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v5

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-virtual {v1, v5, v6, v3, v4}, Lcom/pymcl/runtime/input/LookGesture;->move(FFJ)V

    goto/16 :goto_7

    .line 364
    :pswitch_2
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v5, :cond_9

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    move-object v1, v5

    :goto_2
    iget-boolean v5, p0, Lcom/pymcl/runtime/GameActivity;->hbDown:Z

    if-eqz v5, :cond_hb_normup

    const/4 v5, 0x0

    iput-boolean v5, p0, Lcom/pymcl/runtime/GameActivity;->hbDown:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    iget v7, p0, Lcom/pymcl/runtime/GameActivity;->hbX:F

    sub-float v7, v5, v7

    mul-float/2addr v7, v7

    iget v8, p0, Lcom/pymcl/runtime/GameActivity;->hbY:F

    sub-float v8, v6, v8

    mul-float/2addr v8, v8

    add-float/2addr v7, v8

    const v8, 0x44100000    # 576.0f

    cmpl-float v7, v7, v8

    if-lez v7, :cond_hb_quick

    goto/16 :cond_hb_normup

    :cond_hb_quick
    iget-wide v7, p0, Lcom/pymcl/runtime/GameActivity;->hbT:J

    sub-long v7, v3, v7

    const-wide/16 v10, 0xdc

    cmp-long v5, v7, v10

    if-lez v5, :cond_hb_send

    goto/16 :cond_hb_normup

    :cond_hb_send
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-direct {p0, v5}, Lcom/pymcl/runtime/GameActivity;->hbSlot(F)I

    move-result v5

    add-int/lit8 v5, v5, 0x2

    iget-object v6, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    if-nez v6, :cond_hb_sink

    const-string v6, "sink"

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v6, 0x0

    :cond_hb_sink
    invoke-interface {v6, v5}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    goto/16 :goto_7

    :cond_hb_normup
    invoke-virtual {v1, v3, v4}, Lcom/pymcl/runtime/input/LookGesture;->up(J)V

    goto/16 :goto_7

    .line 362
    :pswitch_3
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v5, :cond_a

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    move-object v1, v5

    :goto_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    invoke-virtual {v1, v5, v6, v3, v4}, Lcom/pymcl/runtime/input/LookGesture;->down(FFJ)V

    invoke-direct {p0, v5, v6}, Lcom/pymcl/runtime/GameActivity;->hbZone(FF)Z

    move-result v7

    iput-boolean v7, p0, Lcom/pymcl/runtime/GameActivity;->hbDown:Z

    if-eqz v7, :cond_hb_down

    iput v5, p0, Lcom/pymcl/runtime/GameActivity;->hbX:F

    iput v6, p0, Lcom/pymcl/runtime/GameActivity;->hbY:F

    iput-wide v3, p0, Lcom/pymcl/runtime/GameActivity;->hbT:J

    :cond_hb_down
    if-nez v7, :cond_hb_nopost

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->lookTick:Lcom/pymcl/runtime/GameActivity$lookTick$1;

    check-cast v5, Ljava/lang/Runnable;

    const-wide/16 v6, 0x32

    invoke-virtual {v1, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_hb_nopost
    goto/16 :goto_7

    .line 365
    :goto_4
    goto/16 :goto_7

    .line 368
    :cond_b
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v5

    const-string v7, "cursor"

    packed-switch v5, :pswitch_data_1

    :pswitch_4
    goto :goto_5

    .line 371
    :pswitch_5
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v5, :cond_c

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_c
    invoke-virtual {v5}, Lcom/pymcl/runtime/input/CursorGesture;->secondaryTap()V

    goto :goto_5

    .line 370
    :pswitch_6
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v5, :cond_d

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_d
    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F

    move-result v8

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F

    move-result v6

    invoke-virtual {v5, v8, v6, v3, v4}, Lcom/pymcl/runtime/input/CursorGesture;->move(FFJ)V

    goto :goto_5

    .line 372
    :pswitch_7
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v5, :cond_e

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_e
    invoke-virtual {v5, v3, v4}, Lcom/pymcl/runtime/input/CursorGesture;->up(J)V

    goto :goto_5

    .line 369
    :pswitch_8
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v5, :cond_f

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_f
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    invoke-virtual {v5, v6, v8, v3, v4}, Lcom/pymcl/runtime/input/CursorGesture;->down(FFJ)V

    .line 374
    :goto_5
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v5, :cond_10

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_10
    invoke-virtual {v5}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v5

    if-eqz v5, :cond_14

    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursorView:Lcom/pymcl/runtime/input/CursorView;

    if-nez v5, :cond_11

    const-string v5, "cursorView"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_11
    iget-object v6, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v6, :cond_12

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v1

    :cond_12
    invoke-virtual {v6}, Lcom/pymcl/runtime/input/CursorGesture;->getCursorX()F

    move-result v6

    iget-object v8, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v8, :cond_13

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_6

    :cond_13
    move-object v1, v8

    :goto_6
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/CursorGesture;->getCursorY()F

    move-result v1

    invoke-virtual {v5, v6, v1}, Lcom/pymcl/runtime/input/CursorView;->moveTo(FF)V

    .line 376
    :cond_14
    :goto_7
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :goto_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static final onCreate$lambda$1(Lcom/pymcl/runtime/GameActivity;)Z
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 101
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->getRoute()Lcom/pymcl/runtime/input/TextRoute;

    move-result-object v0

    sget-object v1, Lcom/pymcl/runtime/input/TextRoute;->SDL:Lcom/pymcl/runtime/input/TextRoute;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static final onCreate$lambda$2(Lcom/pymcl/runtime/GameActivity;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 102
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez v0, :cond_0

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/PhysicalInput;->getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapper;->releaseAll()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onCreate$lambda$3(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    .locals 0
    .param p0, "$xp"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    .line 105
    invoke-virtual {p0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->preload()Z

    return-void
.end method

.method private static final onCreate$lambda$4(Lcom/pymcl/runtime/GameActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "key"    # Ljava/lang/String;

    .line 107
    if-eqz p1, :cond_0

    const-string v0, "gamepad_mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda19;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda19;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 109
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final onCreate$lambda$4$0(Lcom/pymcl/runtime/GameActivity;)V
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 108
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-nez v0, :cond_0

    const-string v0, "gamepadMode"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModeController;->onPrefChangedExternally()Z

    :cond_1
    return-void
.end method

.method private static final onCreate$lambda$5(Lcom/pymcl/runtime/GameActivity;)V
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 114
    new-instance v0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/GameActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final onCreate$lambda$5$0(Lcom/pymcl/runtime/GameActivity;)V
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 114
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    const/4 v1, 0x0

    const-string v2, "charInput"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->hide()V

    :cond_2
    return-void
.end method

.method private static final onDestroy$lambda$1()V
    .locals 1

    .line 456
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method private final onGrabChanged(Z)V
    .locals 7
    .param p1, "g"    # Z

    .line 262
    iput-boolean p1, p0, Lcom/pymcl/runtime/GameActivity;->grabbed:Z

    .line 263
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "look"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v0, :cond_1

    const-string v0, "overlay"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/control/ControlOverlay;->setGrabbed(Z)V

    .line 264
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->cursorView:Lcom/pymcl/runtime/input/CursorView;

    const-string v2, "cursorView"

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    const-string v3, "cursor"

    if-nez p1, :cond_4

    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v4, :cond_3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_3
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v4, 0x0

    goto :goto_0

    :cond_4
    const/16 v4, 0x8

    :goto_0
    invoke-virtual {v0, v4}, Lcom/pymcl/runtime/input/CursorView;->setVisibility(I)V

    .line 265
    if-nez p1, :cond_c

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v0, :cond_5

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v0, :cond_6

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v4, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v1

    :cond_7
    invoke-virtual {v4}, Lcom/pymcl/runtime/input/CursorGesture;->getScreenW()F

    move-result v4

    const/4 v5, 0x2

    int-to-float v5, v5

    div-float/2addr v4, v5

    iget-object v6, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v6, :cond_8

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v1

    :cond_8
    invoke-virtual {v6}, Lcom/pymcl/runtime/input/CursorGesture;->getScreenH()F

    move-result v6

    div-float/2addr v6, v5

    invoke-virtual {v0, v4, v6}, Lcom/pymcl/runtime/input/CursorGesture;->place(FF)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 464
    .local v0, "it":Lkotlin/Unit;
    const/4 v4, 0x0

    .line 265
    .local v4, "$i$a$-also-GameActivity$onGrabChanged$1":I
    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->cursorView:Lcom/pymcl/runtime/input/CursorView;

    if-nez v5, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v5, v1

    :cond_9
    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v2, :cond_a

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v1

    :cond_a
    invoke-virtual {v2}, Lcom/pymcl/runtime/input/CursorGesture;->getCursorX()F

    move-result v2

    iget-object v6, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    if-nez v6, :cond_b

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_b
    move-object v1, v6

    :goto_1
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/CursorGesture;->getCursorY()F

    move-result v1

    invoke-virtual {v5, v2, v1}, Lcom/pymcl/runtime/input/CursorView;->moveTo(FF)V

    .line 266
    .end local v0    # "it":Lkotlin/Unit;
    .end local v4    # "$i$a$-also-GameActivity$onGrabChanged$1":I
    :cond_c
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->applyPointerCapture()V

    .line 267
    return-void
.end method

.method private final releaseInputs()V
    .locals 2

    .line 460
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "overlay"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->releaseAll()V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->look:Lcom/pymcl/runtime/input/LookGesture;

    if-nez v0, :cond_1

    const-string v0, "look"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LookGesture;->cancel()V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez v0, :cond_2

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/PhysicalInput;->reset()V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->releaseAll()V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->pcKeyboard:Lcom/pymcl/runtime/keyboard/PcKeyboardView;

    if-nez v0, :cond_3

    const-string v0, "pcKeyboard"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v1, v0

    :goto_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/keyboard/PcKeyboardView;->getSticky()Lcom/pymcl/runtime/keyboard/StickyModifiers;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/StickyModifiers;->releaseAll()V

    .line 461
    return-void
.end method

.method private final restoreGameFocus()V
    .locals 1

    .line 274
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v0, :cond_0

    const-string v0, "gameView"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Landroid/view/TextureView;->requestFocus()Z

    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->applyPointerCapture()V

    return-void
.end method

.method private final scheduleGamepadTick()V
    .locals 2

    .line 394
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadTicking:Z

    if-eqz v0, :cond_0

    return-void

    .line 395
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadTicking:Z

    .line 396
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    check-cast v1, Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 404
    return-void
.end method

.method private final showGameMenu()V
    .locals 5

    .line 293
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->releaseInputs()V

    .line 294
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u624b\u67c4\u6620\u5c04"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "\u7f16\u8f91\u63a7\u5236\u5e03\u5c40"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "\u547c\u51fa\u8f93\u5165\u6cd5"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "PC \u952e\u76d8"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "\u5feb\u6377\u8f93\u5165"

    aput-object v2, v0, v1

    .line 295
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->cursor:Lcom/pymcl/runtime/input/CursorGesture;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const-string v1, "cursor"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/CursorGesture;->getVirtualMouse()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "\u5173\u95ed\u865a\u62df\u9f20\u6807"

    goto :goto_0

    :cond_1
    const-string v1, "\u5f00\u542f\u865a\u62df\u9f20\u6807"

    :goto_0
    const/4 v3, 0x5

    aput-object v1, v0, v3

    .line 294
    nop

    .line 296
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v1, :cond_2

    const-string v1, "overlay"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_2
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlOverlay;->getVisibility()I

    move-result v1

    if-nez v1, :cond_3

    const-string v1, "\u9690\u85cf\u865a\u62df\u6309\u952e"

    goto :goto_1

    :cond_3
    const-string v1, "\u663e\u793a\u865a\u62df\u6309\u952e"

    :goto_1
    const/4 v3, 0x6

    aput-object v1, v0, v3

    .line 294
    nop

    .line 297
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-nez v1, :cond_4

    const-string v1, "gamepadMode"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_4
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadModeController;->menuLabel()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    .line 294
    nop

    .line 298
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->launcherPrefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    if-nez v1, :cond_5

    const-string v1, "launcherPrefs"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_5
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/LauncherPrefs;->getSdlAutoShowIme()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "\u5f00"

    goto :goto_2

    :cond_6
    const-string v1, "\u5173"

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SDL \u81ea\u52a8\u5f39\u51fa\u8f93\u5165\u6cd5\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x8

    aput-object v1, v0, v3

    .line 294
    nop

    .line 299
    .local v0, "items":[Ljava/lang/String;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    move-object v3, p0

    check-cast v3, Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v3, "\u6e38\u620f\u83dc\u5355"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    move-object v3, v0

    check-cast v3, [Ljava/lang/CharSequence;

    new-instance v4, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda14;

    invoke-direct {v4, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda14;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v1, v3, v4}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 315
    const-string v3, "\u5173\u95ed"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 316
    return-void
.end method

.method private static final showGameMenu$lambda$0(Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p2, "i"    # I

    .line 300
    const/4 p1, 0x0

    const/4 v0, 0x0

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_5

    .line 312
    :pswitch_0
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->launcherPrefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    if-nez v2, :cond_0

    const-string v2, "launcherPrefs"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->toggleSdlAutoShowIme()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "\u5f00"

    goto :goto_1

    :cond_1
    const-string v0, "\u5173"

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SDL \u81ea\u52a8\u5f39\u51fa\u8f93\u5165\u6cd5\uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 313
    nop

    .line 312
    invoke-static {v1, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    .line 313
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto/16 :goto_5

    .line 308
    :pswitch_1
    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-nez v2, :cond_2

    const-string v2, "gamepadMode"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModeController;->cyclePref()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModePref;->getLabel()Ljava/lang/String;

    move-result-object v0

    .line 309
    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->getRoute()Lcom/pymcl/runtime/input/TextRoute;

    move-result-object v2

    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->SDL:Lcom/pymcl/runtime/input/TextRoute;

    if-eq v2, v3, :cond_3

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "\uff08\u672c\u5b9e\u4f8b\u672a\u4f7f\u7528 SDL\uff0c\u4ecd\u4e3a\u6620\u5c04\uff09"

    goto :goto_3

    :cond_3
    const-string v2, ""

    :goto_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 310
    nop

    .line 308
    invoke-static {v1, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    .line 310
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_5

    .line 307
    :pswitch_2
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    const-string v2, "overlay"

    if-nez v1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_4
    iget-object v3, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v3, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_5
    move-object v0, v3

    :goto_4
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getVisibility()I

    move-result v0

    if-nez v0, :cond_6

    const/16 p1, 0x8

    :cond_6
    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/control/ControlOverlay;->setVisibility(I)V

    goto :goto_5

    .line 306
    :pswitch_3
    sget-object p1, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_5

    .line 305
    :pswitch_4
    sget-object p1, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_5

    .line 304
    :pswitch_5
    sget-object p1, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_5

    .line 303
    :pswitch_6
    sget-object p1, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_5

    .line 302
    :pswitch_7
    sget-object p1, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/GameActivity;->onAction(Lcom/pymcl/runtime/input/Keys$Action;)V

    goto :goto_5

    .line 301
    :pswitch_8
    new-instance p1, Lcom/pymcl/runtime/control/GamepadMapDialog;

    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/RuntimeInput;->gamepadMapping(Landroid/content/Context;)Lcom/pymcl/runtime/input/GamepadMappingStore;

    move-result-object v1

    new-instance v2, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda11;

    invoke-direct {v2, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda11;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-direct {p1, v0, v1, v2}, Lcom/pymcl/runtime/control/GamepadMapDialog;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/input/GamepadMappingStore;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1}, Lcom/pymcl/runtime/control/GamepadMapDialog;->show()V

    .line 315
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final showGameMenu$lambda$0$0(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/GamepadMapping;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p1, "m"    # Lcom/pymcl/runtime/input/GamepadMapping;

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez v0, :cond_0

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/PhysicalInput;->getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/GamepadMapper;->setMapping(Lcom/pymcl/runtime/input/GamepadMapping;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final showQuickInput()V
    .locals 6

    .line 319
    sget-object v0, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/RuntimeInput;->quickInput(Landroid/content/Context;)Lcom/pymcl/runtime/keyboard/QuickInputStore;

    move-result-object v0

    .line 320
    .local v0, "store":Lcom/pymcl/runtime/keyboard/QuickInputStore;
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/QuickInputStore;->load()Ljava/util/List;

    move-result-object v1

    .line 321
    .local v1, "items":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    const-string v3, "\uff0b \u65b0\u589e\u5e38\u7528\u8bed\u2026"

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    .local v2, "$this$toTypedArray$iv":Ljava/util/Collection;
    const/4 v3, 0x0

    .line 467
    .local v3, "$i$f$toTypedArray":I
    move-object v4, v2

    .line 468
    .local v4, "thisCollection$iv":Ljava/util/Collection;
    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/String;

    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    .line 321
    .end local v2    # "$this$toTypedArray$iv":Ljava/util/Collection;
    .end local v3    # "$i$f$toTypedArray":I
    .end local v4    # "thisCollection$iv":Ljava/util/Collection;
    check-cast v2, [Ljava/lang/String;

    .line 322
    .local v2, "labels":[Ljava/lang/String;
    new-instance v3, Landroid/app/AlertDialog$Builder;

    move-object v4, p0

    check-cast v4, Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v4, "\u5feb\u6377\u8f93\u5165"

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    move-object v4, v2

    check-cast v4, [Ljava/lang/CharSequence;

    new-instance v5, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;

    invoke-direct {v5, v1, p0, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;-><init>(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;)V

    invoke-virtual {v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    .line 330
    const-string v4, "\u6e05\u7a7a"

    check-cast v4, Ljava/lang/CharSequence;

    new-instance v5, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda18;

    invoke-direct {v5, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda18;-><init>(Lcom/pymcl/runtime/keyboard/QuickInputStore;)V

    invoke-virtual {v3, v4, v5}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 331
    return-void
.end method

.method private static final showQuickInput$lambda$0(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V
    .locals 4
    .param p0, "$items"    # Ljava/util/List;
    .param p1, "this$0"    # Lcom/pymcl/runtime/GameActivity;
    .param p2, "$store"    # Lcom/pymcl/runtime/keyboard/QuickInputStore;
    .param p4, "i"    # I

    .line 323
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p3

    const/4 v0, 0x0

    if-ge p4, p3, :cond_1

    iget-object p3, p1, Lcom/pymcl/runtime/GameActivity;->textSender:Lcom/pymcl/runtime/keyboard/GameTextSender;

    if-nez p3, :cond_0

    const-string p3, "textSender"

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p3, v0

    :cond_0
    invoke-interface {p0, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p3, v1, v2, v3, v0}, Lcom/pymcl/runtime/keyboard/GameTextSender;->send$default(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    .line 324
    :cond_1
    new-instance p3, Landroid/widget/EditText;

    move-object v1, p1

    check-cast v1, Landroid/content/Context;

    invoke-direct {p3, v1}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    .line 325
    .local p3, "et":Landroid/widget/EditText;
    new-instance v1, Landroid/app/AlertDialog$Builder;

    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u65b0\u589e\u5e38\u7528\u8bed"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    move-object v2, p3

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 326
    const-string v2, "\u4fdd\u5b58\u5e76\u53d1\u9001"

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;

    invoke-direct {v3, p3, p0, p2, p1}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;-><init>(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 328
    const-string v2, "\u53d6\u6d88"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 330
    .end local p3    # "et":Landroid/widget/EditText;
    :goto_0
    return-void
.end method

.method private static final showQuickInput$lambda$0$0(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V
    .locals 3
    .param p0, "$et"    # Landroid/widget/EditText;
    .param p1, "$items"    # Ljava/util/List;
    .param p2, "$store"    # Lcom/pymcl/runtime/keyboard/QuickInputStore;
    .param p3, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 327
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    .local p4, "t":Ljava/lang/String;
    move-object p5, p4

    check-cast p5, Ljava/lang/CharSequence;

    invoke-static {p5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p5

    if-nez p5, :cond_1

    invoke-interface {p1, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2, p1}, Lcom/pymcl/runtime/keyboard/QuickInputStore;->save(Ljava/util/List;)V

    iget-object p5, p3, Lcom/pymcl/runtime/GameActivity;->textSender:Lcom/pymcl/runtime/keyboard/GameTextSender;

    const/4 v0, 0x0

    if-nez p5, :cond_0

    const-string p5, "textSender"

    invoke-static {p5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p5, v0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p5, p4, v1, v2, v0}, Lcom/pymcl/runtime/keyboard/GameTextSender;->send$default(Lcom/pymcl/runtime/keyboard/GameTextSender;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 328
    :cond_1
    return-void
.end method

.method private static final showQuickInput$lambda$1(Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "$store"    # Lcom/pymcl/runtime/keyboard/QuickInputStore;

    .line 330
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/keyboard/QuickInputStore;->save(Ljava/util/List;)V

    return-void
.end method

.method private static final sink$lambda$0(Lcom/pymcl/runtime/GameActivity;)Lcom/tungsten/fclauncher/bridge/FCLBridge;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/GameActivity;

    .line 59
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    return-object v0
.end method

.method private final writeWindowSizeOverride(II)V
    .locals 21
    .param p1, "w"    # I
    .param p2, "h"    # I

    .line 335
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/GameActivity;

    .local v0, "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    const/4 v1, 0x0

    .line 336
    .local v1, "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v2

    .line 337
    .local v2, "LF":Ljava/lang/String;
    new-instance v3, Ljava/io/File;

    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    const-string v4, "request"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v5

    :cond_0
    invoke-virtual {v4}, Lcom/pymcl/runtime/GameLaunchRequest;->getWorkingDir()Ljava/lang/String;

    move-result-object v4

    const-string v6, "options.txt"

    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 338
    .local v3, "f":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_1

    invoke-static {v3, v5, v6, v5}, Lkotlin/io/FilesKt;->readLines$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 339
    .local v4, "lines":Ljava/util/List;
    :goto_0
    const/4 v7, 0x3

    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "fullscreen"

    const-string v9, "false"

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v9, 0x0

    aput-object v8, v7, v9

    const-string v8, "overrideWidth"

    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v6

    const-string v6, "overrideHeight"

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/4 v8, 0x2

    aput-object v6, v7, v8

    invoke-static {v7}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v6

    .line 340
    .local v6, "keys":Ljava/util/LinkedHashMap;
    move-object v7, v6

    check-cast v7, Ljava/util/Map;

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .local v11, "k":Ljava/lang/String;
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 341
    .local v10, "v":Ljava/lang/String;
    move-object v12, v4

    .local v12, "$this$indexOfFirst$iv":Ljava/util/List;
    const/4 v13, 0x0

    .line 469
    .local v13, "$i$f$indexOfFirst":I
    const/4 v14, 0x0

    .line 470
    .local v14, "index$iv":I
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, ":"

    if-eqz v16, :cond_3

    :try_start_1
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 471
    .local v16, "item$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    check-cast v17, Ljava/lang/String;

    move-object/from16 v18, v17

    .local v18, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 341
    .local v17, "$i$a$-indexOfFirst-GameActivity$writeWindowSizeOverride$1$i$1":I
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v19, v0

    move-object/from16 v20, v6

    move-object/from16 v0, v18

    const/4 v6, 0x0

    move/from16 v18, v1

    const/4 v1, 0x2

    .end local v1    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v6    # "keys":Ljava/util/LinkedHashMap;
    .local v0, "it":Ljava/lang/String;
    .local v18, "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .local v19, "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .local v20, "keys":Ljava/util/LinkedHashMap;
    invoke-static {v0, v8, v9, v1, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    .line 471
    .end local v0    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-indexOfFirst-GameActivity$writeWindowSizeOverride$1$i$1":I
    if-eqz v8, :cond_2

    .line 472
    goto :goto_3

    .line 473
    :cond_2
    nop

    .end local v16    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v14, v14, 0x1

    move/from16 v1, v18

    move-object/from16 v0, v19

    move-object/from16 v6, v20

    const/4 v5, 0x0

    const/4 v8, 0x2

    goto :goto_2

    .line 475
    .end local v18    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v19    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v20    # "keys":Ljava/util/LinkedHashMap;
    .local v0, "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .restart local v1    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .restart local v6    # "keys":Ljava/util/LinkedHashMap;
    :cond_3
    move-object/from16 v19, v0

    move/from16 v18, v1

    move-object/from16 v20, v6

    .end local v0    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v1    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v6    # "keys":Ljava/util/LinkedHashMap;
    .restart local v18    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .restart local v19    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .restart local v20    # "keys":Ljava/util/LinkedHashMap;
    const/4 v0, -0x1

    move v14, v0

    .line 341
    .end local v12    # "$this$indexOfFirst$iv":Ljava/util/List;
    .end local v13    # "$i$f$indexOfFirst":I
    .end local v14    # "index$iv":I
    :goto_3
    nop

    .line 342
    .local v14, "i":I
    if-ltz v14, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v14, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_4
    move/from16 v1, v18

    move-object/from16 v0, v19

    move-object/from16 v6, v20

    const/4 v5, 0x0

    const/4 v8, 0x2

    goto/16 :goto_1

    .line 344
    .end local v10    # "v":Ljava/lang/String;
    .end local v11    # "k":Ljava/lang/String;
    .end local v14    # "i":I
    .end local v18    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v19    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v20    # "keys":Ljava/util/LinkedHashMap;
    .restart local v0    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .restart local v1    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .restart local v6    # "keys":Ljava/util/LinkedHashMap;
    :cond_5
    move-object/from16 v19, v0

    move/from16 v18, v1

    move-object/from16 v20, v6

    .end local v0    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v1    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v6    # "keys":Ljava/util/LinkedHashMap;
    .restart local v18    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .restart local v19    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .restart local v20    # "keys":Ljava/util/LinkedHashMap;
    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v6, v2

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v6, 0x0

    invoke-static {v3, v0, v6, v1, v6}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 345
    nop

    .end local v2    # "LF":Ljava/lang/String;
    .end local v3    # "f":Ljava/io/File;
    .end local v4    # "lines":Ljava/util/List;
    .end local v18    # "$i$a$-runCatching-GameActivity$writeWindowSizeOverride$1":I
    .end local v19    # "$this$writeWindowSizeOverride_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v20    # "keys":Ljava/util/LinkedHashMap;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 335
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 345
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 464
    .local v0, "it":Ljava/lang/Throwable;
    const/4 v1, 0x0

    .line 345
    .local v1, "$i$a$-onFailure-GameActivity$writeWindowSizeOverride$2":I
    const-string v2, "PyMCL-Game"

    const-string v3, "writeWindowSizeOverride"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 346
    .end local v0    # "it":Ljava/lang/Throwable;
    .end local v1    # "$i$a$-onFailure-GameActivity$writeWindowSizeOverride$2":I
    :cond_6
    return-void
.end method


# virtual methods
.method public dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1, "ev"    # Landroid/view/MotionEvent;

    const-string v0, "ev"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 390
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/PhysicalInput;->onGenericMotion(Landroid/view/MotionEvent;)Z

    move-result v0

    move v2, v0

    .line 464
    .local v2, "it":Z
    const/4 v3, 0x0

    .line 390
    .local v3, "$i$a$-also-GameActivity$dispatchGenericMotionEvent$1":I
    if-eqz v2, :cond_2

    iget-object v4, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    if-nez v4, :cond_1

    const-string v4, "settings"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v1, v4

    :goto_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/input/InputSettings;->getGamepadEnabled()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->scheduleGamepadTick()V

    .end local v2    # "it":Z
    .end local v3    # "$i$a$-also-GameActivity$dispatchGenericMotionEvent$1":I
    :cond_2
    if-nez v0, :cond_4

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    return v0
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "event"    # Landroid/view/KeyEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    const-string v1, "charInput"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/PhysicalInput;->Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Companion;->isSoftKeyboard(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0

    .line 382
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    if-nez v0, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_2
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing()Z

    move-result v0

    const/4 v3, 0x4

    const/4 v4, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-ne v0, v3, :cond_5

    sget-object v0, Lcom/pymcl/runtime/input/PhysicalInput;->Companion:Lcom/pymcl/runtime/input/PhysicalInput$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Companion;->isMouseOriginated(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 383
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v4, :cond_4

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->charInput:Lcom/pymcl/runtime/keyboard/TouchCharInput;

    if-nez v0, :cond_3

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    move-object v2, v0

    :goto_0
    invoke-virtual {v2}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->hide()V

    :cond_4
    return v4

    .line 385
    :cond_5
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    const-string v1, "overlay"

    if-nez v0, :cond_6

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v2

    :cond_6
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getEditing()Z

    move-result v0

    const/4 v5, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-ne v0, v3, :cond_9

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v4, :cond_8

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->overlay:Lcom/pymcl/runtime/control/ControlOverlay;

    if-nez v0, :cond_7

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    move-object v2, v0

    :goto_1
    invoke-virtual {v2, v5}, Lcom/pymcl/runtime/control/ControlOverlay;->setEditing(Z)V

    :cond_8
    return v4

    .line 386
    :cond_9
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->physical:Lcom/pymcl/runtime/input/PhysicalInput;

    if-nez v0, :cond_a

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_a
    move-object v2, v0

    :goto_2
    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/PhysicalInput;->onKey(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_c

    invoke-super {p0, p1}, Landroid/app/Activity;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    :cond_b
    move v4, v5

    :cond_c
    :goto_3
    return v4
.end method

.method public final messageboxShowMessageBox(ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I
    .locals 9
    .param p1, "flags"    # I
    .param p2, "title"    # Ljava/lang/String;
    .param p3, "message"    # Ljava/lang/String;
    .param p4, "buttonFlags"    # [I
    .param p5, "buttonIds"    # [I
    .param p6, "buttonTexts"    # [Ljava/lang/String;
    .param p7, "colors"    # [I

    const-string v0, "buttonFlags"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonIds"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonTexts"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-static/range {v1 .. v8}, Lorg/libsdl/app/SDLActivity;->messageboxShowMessageBox(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;[I)I

    move-result v0

    return v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .line 87
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 88
    move-object v0, p0

    check-cast v0, Landroid/content/Context;

    invoke-static {v0}, Lcom/pymcl/runtime/RuntimeHost;->init(Landroid/content/Context;)V

    .line 89
    move-object v0, p0

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/tungsten/fcl/FCLApp;->setActivity(Landroid/app/Activity;)V

    .line 91
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    const-string v2, "pymcl.launch_request"

    const/4 v3, 0x0

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-class v1, Lcom/pymcl/runtime/GameLaunchRequest;

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/GameLaunchRequest;

    goto :goto_0

    .line 92
    :cond_0
    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    instance-of v1, v0, Lcom/pymcl/runtime/GameLaunchRequest;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/pymcl/runtime/GameLaunchRequest;

    goto :goto_0

    :cond_1
    move-object v0, v3

    .line 91
    :goto_0
    if-nez v0, :cond_2

    .line 92
    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/GameActivity;

    .line 464
    nop

    .local v0, "$this$onCreate_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    const/4 v1, 0x0

    .line 92
    .local v1, "$i$a$-run-GameActivity$onCreate$1":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/GameActivity;->finish()V

    return-void

    .line 91
    .end local v0    # "$this$onCreate_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v1    # "$i$a$-run-GameActivity$onCreate$1":I
    :cond_2
    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    .line 93
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    sget-object v1, Lcom/pymcl/runtime/input/TextRoutes;->INSTANCE:Lcom/pymcl/runtime/input/TextRoutes;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    const-string v4, "request"

    if-nez v2, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_3
    invoke-virtual {v2}, Lcom/pymcl/runtime/GameLaunchRequest;->getMcVersion()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/TextRoutes;->forMcVersion(Ljava/lang/String;)Lcom/pymcl/runtime/input/TextRoute;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->setRoute(Lcom/pymcl/runtime/input/TextRoute;)V

    .line 94
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->getRoute()Lcom/pymcl/runtime/input/TextRoute;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v1, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_4
    invoke-virtual {v1}, Lcom/pymcl/runtime/GameLaunchRequest;->getMcVersion()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "text input route="

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " mc="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PyMCL-Game"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 95
    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x80

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 97
    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 98
    sget-object v0, Lcom/pymcl/runtime/input/RuntimeInput;->INSTANCE:Lcom/pymcl/runtime/input/RuntimeInput;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/RuntimeInput;->loadSettings(Landroid/content/Context;)Lcom/pymcl/runtime/input/InputSettings;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->settings:Lcom/pymcl/runtime/input/InputSettings;

    .line 99
    sget-object v0, Lcom/pymcl/runtime/input/AndroidPrefIO;->Companion:Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/AndroidPrefIO$Companion;->launcherPrefs(Landroid/content/Context;)Lcom/pymcl/runtime/input/LauncherPrefs;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->launcherPrefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    .line 100
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeController;

    move-object v1, p0

    check-cast v1, Landroid/app/Activity;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->launcherPrefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    if-nez v2, :cond_5

    const-string v2, "launcherPrefs"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v3

    :cond_5
    new-instance v5, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda8;

    invoke-direct {v5, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda8;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    new-instance v6, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda9;

    invoke-direct {v6, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda9;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-direct {v0, v1, v2, v5, v6}, Lcom/pymcl/runtime/input/GamepadModeController;-><init>(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    .line 104
    sget-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v0

    .line 105
    .local v0, "xp":Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda10;

    invoke-direct {v2, v0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda10;-><init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V

    const-string v5, "PyMCL-prefs-preload"

    invoke-direct {v1, v2, v5}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 106
    new-instance v1, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda12;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda12;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->addListener(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/runtime/GameActivity;->removePrefsListener:Lkotlin/jvm/functions/Function0;

    .line 111
    sget-object v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v2, :cond_6

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    move-object v3, v2

    :goto_1
    invoke-virtual {v3}, Lcom/pymcl/runtime/GameLaunchRequest;->getWorkingDir()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;->modPresent(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    sget-object v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    move-object v2, p0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;->create(Landroid/content/Context;)Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/runtime/GameActivity;->touchController:Lcom/pymcl/runtime/keyboard/TouchControllerBridge;

    .line 112
    :cond_7
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->buildViews()V

    .line 114
    new-instance v1, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda13;

    invoke-direct {v1, p0}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda13;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    sput-object v1, Lcom/tungsten/fcl/game/sdl/SdlBridge;->onGameImeTakeover:Ljava/lang/Runnable;

    .line 115
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 449
    const/4 v0, 0x0

    sput-object v0, Lcom/tungsten/fcl/game/sdl/SdlBridge;->onGameImeTakeover:Ljava/lang/Runnable;

    .line 450
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->removePrefsListener:Lkotlin/jvm/functions/Function0;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    :cond_0
    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->removePrefsListener:Lkotlin/jvm/functions/Function0;

    .line 451
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->gamepadMode:Lcom/pymcl/runtime/input/GamepadModeController;

    if-nez v1, :cond_1

    const-string v1, "gamepadMode"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModeController;->dismiss()V

    .line 452
    :cond_2
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/SdlHid;->release()V

    .line 453
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/GameActivity;

    .line 464
    .local v0, "$this$onDestroy_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    const/4 v1, 0x0

    .line 453
    .local v1, "$i$a$-runCatching-GameActivity$onDestroy$1":I
    iget-boolean v2, v0, Lcom/pymcl/runtime/GameActivity;->sdlPrepared:Z

    if-eqz v2, :cond_3

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->reset()V

    .end local v0    # "$this$onDestroy_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v1    # "$i$a$-runCatching-GameActivity$onDestroy$1":I
    :cond_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    :goto_1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 456
    iget-boolean v0, p0, Lcom/pymcl/runtime/GameActivity;->exited:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/pymcl/runtime/GameActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->handler:Landroid/os/Handler;

    new-instance v1, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda16;

    invoke-direct {v1}, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda16;-><init>()V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 457
    :cond_4
    return-void
.end method

.method protected onPause()V
    .locals 2

    .line 429
    const v0, 0x20001

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 430
    const v0, 0x2000b

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 431
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->releaseInputs()V

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 432
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p1, "requestCode"    # I
    .param p2, "permissions"    # [Ljava/lang/String;
    .param p3, "grantResults"    # [I

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "grantResults"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 416
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 417
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    invoke-virtual {v0, p1, p3}, Lcom/pymcl/runtime/input/SdlHid;->onRequestPermissionsResult(I[I)V

    .line 418
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 422
    const v0, 0x20001

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 423
    const v0, 0x2000b

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 424
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 425
    return-void
.end method

.method protected onStart()V
    .locals 2

    .line 436
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 437
    const v0, 0x20004

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 438
    return-void
.end method

.method protected onStop()V
    .locals 2

    .line 442
    const v0, 0x20004

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 443
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 444
    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 17
    .param p1, "st"    # Landroid/graphics/SurfaceTexture;
    .param p2, "width"    # I
    .param p3, "height"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    const-string v4, "st"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    const-string v5, "gameView"

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-string v8, "request"

    if-eqz v4, :cond_9

    .line 173
    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz v4, :cond_0

    invoke-virtual {v4, v6}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setSurfaceDestroyed(Z)V

    .line 174
    :cond_0
    iget-boolean v4, v0, Lcom/pymcl/runtime/GameActivity;->sdlPrepared:Z

    if-eqz v4, :cond_5

    .line 175
    new-instance v4, Landroid/view/Surface;

    invoke-direct {v4, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .local v4, "ns":Landroid/view/Surface;
    iput-object v4, v0, Lcom/pymcl/runtime/GameActivity;->gameSurface:Landroid/view/Surface;

    .line 176
    int-to-float v6, v2

    iget-object v10, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v10, :cond_1

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_1
    invoke-virtual {v10}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v10

    mul-float/2addr v6, v10

    float-to-int v6, v6

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    sput v6, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    int-to-float v6, v3

    iget-object v10, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v10, :cond_2

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_2
    invoke-virtual {v10}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v10

    mul-float/2addr v6, v10

    float-to-int v6, v6

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    sput v6, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    .line 177
    move-object v6, v0

    check-cast v6, Landroid/app/Activity;

    iget-object v10, v0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v10, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v10, 0x0

    :cond_3
    invoke-virtual {v10}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v10, v5, Landroid/view/ViewGroup;

    if-eqz v10, :cond_4

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    :goto_0
    invoke-static {v6, v4, v5, v0}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->safePrepareSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    .line 178
    invoke-static/range {p2 .. p3}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->syncResolution(II)V

    .line 180
    .end local v4    # "ns":Landroid/view/Surface;
    :cond_5
    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz v4, :cond_8

    int-to-float v5, v2

    iget-object v6, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v6, :cond_6

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v6, 0x0

    :cond_6
    invoke-virtual {v6}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-static {v5, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    int-to-float v6, v3

    iget-object v10, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v10, :cond_7

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v9, 0x0

    goto :goto_1

    :cond_7
    move-object v9, v10

    :goto_1
    invoke-virtual {v9}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v8

    mul-float/2addr v6, v8

    float-to-int v6, v6

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventWindow(II)V

    :cond_8
    return-void

    .line 182
    :cond_9
    new-instance v10, Lcom/tungsten/fclauncher/FCLConfig;

    .line 183
    move-object v11, v0

    check-cast v11, Landroid/content/Context;

    sget-object v12, Lcom/tungsten/fclauncher/utils/FCLPath;->LOG_DIR:Ljava/lang/String;

    const-string v4, "LOG_DIR"

    invoke-static {v12, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/io/File;

    sget-object v13, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    iget-object v14, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v14, :cond_a

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v14, 0x0

    :cond_a
    invoke-virtual {v14}, Lcom/pymcl/runtime/GameLaunchRequest;->getJavaMajor()I

    move-result v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "jre"

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v4, v13, v9}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    const-string v4, "getAbsolutePath(...)"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v4, :cond_b

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_b
    invoke-virtual {v4}, Lcom/pymcl/runtime/GameLaunchRequest;->getWorkingDir()Ljava/lang/String;

    move-result-object v14

    sget-object v4, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    iget-object v9, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v9, :cond_c

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v9, 0x0

    :cond_c
    invoke-virtual {v9}, Lcom/pymcl/runtime/GameLaunchRequest;->getRendererId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Lcom/pymcl/runtime/Renderers;->byId(Ljava/lang/String;)Lcom/mio/data/Renderer;

    move-result-object v15

    iget-object v4, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v4, :cond_d

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v4, 0x0

    :cond_d
    invoke-virtual {v4}, Lcom/pymcl/runtime/GameLaunchRequest;->getArgs()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    .local v4, "$this$toTypedArray$iv":Ljava/util/Collection;
    const/4 v9, 0x0

    .line 465
    .local v9, "$i$f$toTypedArray":I
    move-object/from16 v16, v4

    .line 466
    .local v16, "thisCollection$iv":Ljava/util/Collection;
    new-array v6, v6, [Ljava/lang/String;

    move-object/from16 v7, v16

    .end local v16    # "thisCollection$iv":Ljava/util/Collection;
    .local v7, "thisCollection$iv":Ljava/util/Collection;
    invoke-interface {v7, v6}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    .end local v4    # "$this$toTypedArray$iv":Ljava/util/Collection;
    .end local v7    # "thisCollection$iv":Ljava/util/Collection;
    .end local v9    # "$i$f$toTypedArray":I
    move-object/from16 v16, v4

    check-cast v16, [Ljava/lang/String;

    .line 182
    invoke-direct/range {v10 .. v16}, Lcom/tungsten/fclauncher/FCLConfig;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mio/data/Renderer;[Ljava/lang/String;)V

    .line 185
    move-object v4, v10

    .line 464
    .local v4, "$this$onSurfaceTextureAvailable_u24lambda_u240":Lcom/tungsten/fclauncher/FCLConfig;
    const/4 v6, 0x0

    .line 185
    .local v6, "$i$a$-apply-GameActivity$onSurfaceTextureAvailable$config$1":I
    iget-object v7, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v7, :cond_e

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v7, 0x0

    :cond_e
    invoke-virtual {v7}, Lcom/pymcl/runtime/GameLaunchRequest;->getLwjglVersion()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/tungsten/fclauncher/FCLConfig;->setLwjglVersion(Ljava/lang/String;)V

    .line 182
    .end local v4    # "$this$onSurfaceTextureAvailable_u24lambda_u240":Lcom/tungsten/fclauncher/FCLConfig;
    .end local v6    # "$i$a$-apply-GameActivity$onSurfaceTextureAvailable$config$1":I
    nop

    .line 186
    .local v10, "config":Lcom/tungsten/fclauncher/FCLConfig;
    invoke-static {v10}, Lcom/tungsten/fclauncher/FCLauncher;->launchMinecraft(Lcom/tungsten/fclauncher/FCLConfig;)Lcom/tungsten/fclauncher/bridge/FCLBridge;

    move-result-object v4

    .line 187
    .local v4, "b":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    iput-object v4, v0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    .line 188
    new-instance v6, Landroid/view/Surface;

    invoke-direct {v6, v1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 189
    .local v6, "nativeSurface":Landroid/view/Surface;
    iput-object v6, v0, Lcom/pymcl/runtime/GameActivity;->gameSurface:Landroid/view/Surface;

    .line 195
    int-to-float v7, v2

    iget-object v9, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v9, :cond_f

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v9, 0x0

    :cond_f
    invoke-virtual {v9}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v9

    mul-float/2addr v7, v9

    float-to-int v7, v7

    const/4 v9, 0x1

    invoke-static {v7, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    .line 196
    .local v7, "sw":I
    int-to-float v9, v3

    iget-object v11, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v11, :cond_10

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v11, 0x0

    :cond_10
    invoke-virtual {v11}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v11

    mul-float/2addr v9, v11

    float-to-int v9, v9

    const/4 v11, 0x1

    invoke-static {v9, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v9

    .line 201
    .local v9, "sh":I
    invoke-direct {v0, v7, v9}, Lcom/pymcl/runtime/GameActivity;->writeWindowSizeOverride(II)V

    .line 202
    invoke-virtual {v1, v7, v9}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 203
    sput v7, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    sput v9, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    .line 204
    move-object v11, v0

    check-cast v11, Landroid/app/Activity;

    iget-object v12, v0, Lcom/pymcl/runtime/GameActivity;->gameView:Landroid/view/TextureView;

    if-nez v12, :cond_11

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v12, 0x0

    :cond_11
    invoke-virtual {v12}, Landroid/view/TextureView;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v12, v5, Landroid/view/ViewGroup;

    if-eqz v12, :cond_12

    check-cast v5, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_12
    const/4 v5, 0x0

    :goto_2
    invoke-static {v11, v6, v5, v0}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->safePrepareSurface(Landroid/app/Activity;Landroid/view/Surface;Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    move-result v5

    iput-boolean v5, v0, Lcom/pymcl/runtime/GameActivity;->sdlPrepared:Z

    .line 205
    iget-boolean v5, v0, Lcom/pymcl/runtime/GameActivity;->sdlPrepared:Z

    iget-object v11, v0, Lcom/pymcl/runtime/GameActivity;->sink:Lcom/pymcl/runtime/input/TextRoutingInputSink;

    invoke-virtual {v11}, Lcom/pymcl/runtime/input/TextRoutingInputSink;->getRoute()Lcom/pymcl/runtime/input/TextRoute;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "SDL surface prepared="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v12, " route="

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v11, "PyMCL-Game"

    invoke-static {v11, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    iget-object v5, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v5, :cond_13

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_13
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v5

    float-to-double v11, v5

    invoke-virtual {v4, v11, v12}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setScaleFactor(D)V

    .line 214
    iget-object v5, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v5, :cond_14

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_14
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameLaunchRequest;->getWorkingDir()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setGameDir(Ljava/lang/String;)V

    .line 215
    iget-object v5, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v5, :cond_15

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_15
    invoke-virtual {v5}, Lcom/pymcl/runtime/GameLaunchRequest;->getJavaMajor()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setJava(Ljava/lang/String;)V

    .line 216
    sget-object v5, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    iget-object v11, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v11, :cond_16

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v11, 0x0

    :cond_16
    invoke-virtual {v11}, Lcom/pymcl/runtime/GameLaunchRequest;->getRendererId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v11}, Lcom/pymcl/runtime/Renderers;->byId(Ljava/lang/String;)Lcom/mio/data/Renderer;

    move-result-object v5

    invoke-virtual {v5}, Lcom/mio/data/Renderer;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setRenderer(Ljava/lang/String;)V

    .line 217
    new-instance v5, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;

    invoke-direct {v5, v0}, Lcom/pymcl/runtime/GameActivity$onSurfaceTextureAvailable$1;-><init>(Lcom/pymcl/runtime/GameActivity;)V

    check-cast v5, Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;

    invoke-virtual {v4, v6, v5}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->execute(Landroid/view/Surface;Lcom/tungsten/fclauncher/bridge/FCLBridgeCallback;)V

    .line 228
    invoke-virtual {v4, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setSurfaceTexture(Landroid/graphics/SurfaceTexture;)V

    .line 229
    int-to-float v5, v2

    iget-object v11, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v11, :cond_17

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v11, 0x0

    :cond_17
    invoke-virtual {v11}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v11

    mul-float/2addr v5, v11

    float-to-int v5, v5

    const/4 v11, 0x1

    invoke-static {v5, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    int-to-float v11, v3

    iget-object v12, v0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v12, :cond_18

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v12, 0x0

    :cond_18
    invoke-virtual {v12}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v8

    mul-float/2addr v11, v8

    float-to-int v8, v11

    const/4 v11, 0x1

    invoke-static {v8, v11}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    invoke-virtual {v4, v5, v8}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventWindow(II)V

    .line 230
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 5
    .param p1, "st"    # Landroid/graphics/SurfaceTexture;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->setSurfaceDestroyed(Z)V

    .line 242
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pymcl/runtime/GameActivity;->gameSurface:Landroid/view/Surface;

    .line 243
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/GameActivity;

    .line 464
    .local v0, "$this$onSurfaceTextureDestroyed_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    const/4 v2, 0x0

    .line 243
    .local v2, "$i$a$-runCatching-GameActivity$onSurfaceTextureDestroyed$1":I
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-static {}, Lorg/libsdl/app/SDLActivity;->getSDLSurface()Lorg/libsdl/app/SDLSurface;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lorg/libsdl/app/SDLSurface;->surfaceDestroyed()V

    .end local v0    # "$this$onSurfaceTextureDestroyed_u24lambda_u240":Lcom/pymcl/runtime/GameActivity;
    .end local v2    # "$i$a$-runCatching-GameActivity$onSurfaceTextureDestroyed$1":I
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 464
    .local v0, "it":Ljava/lang/Throwable;
    const/4 v2, 0x0

    .line 243
    .local v2, "$i$a$-onFailure-GameActivity$onSurfaceTextureDestroyed$2":I
    const-string v3, "PyMCL-Game"

    const-string v4, "SDL surfaceDestroyed"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 244
    .end local v0    # "it":Ljava/lang/Throwable;
    .end local v2    # "$i$a$-onFailure-GameActivity$onSurfaceTextureDestroyed$2":I
    :cond_2
    return v1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 6
    .param p1, "st"    # Landroid/graphics/SurfaceTexture;
    .param p2, "width"    # I
    .param p3, "height"    # I

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    int-to-float v0, p2

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    const/4 v2, 0x0

    const-string v3, "request"

    if-nez v1, :cond_0

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_0
    invoke-virtual {v1}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v1

    mul-float/2addr v0, v1

    float-to-int v0, v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 234
    .local v0, "sw":I
    int-to-float v4, p3

    iget-object v5, p0, Lcom/pymcl/runtime/GameActivity;->request:Lcom/pymcl/runtime/GameLaunchRequest;

    if-nez v5, :cond_1

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object v2, v5

    :goto_0
    invoke-virtual {v2}, Lcom/pymcl/runtime/GameLaunchRequest;->getWindowScale()F

    move-result v2

    mul-float/2addr v4, v2

    float-to-int v2, v4

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    .line 235
    .local v1, "sh":I
    invoke-virtual {p1, v0, v1}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    .line 236
    sput v0, Lorg/lwjgl/glfw/CallbackBridge;->windowWidth:I

    sput v1, Lorg/lwjgl/glfw/CallbackBridge;->windowHeight:I

    .line 237
    invoke-static {v0, v1}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->syncResolution(II)V

    .line 238
    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity;->bridge:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0, v1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventWindow(II)V

    .line 239
    :cond_2
    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 1
    .param p1, "st"    # Landroid/graphics/SurfaceTexture;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 2
    .param p1, "hasFocus"    # Z

    .line 407
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 409
    const v0, 0x20001

    invoke-static {v0, p1}, Lorg/lwjgl/glfw/CallbackBridge;->nativeSetWindowAttrib(II)V

    .line 410
    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->applyPointerCapture()V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/pymcl/runtime/GameActivity;->releaseInputs()V

    invoke-static {}, Lorg/lwjgl/glfw/CallbackBridge;->resetInputState()V

    .line 411
    :goto_0
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    xor-int/lit8 v1, p1, 0x1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/SdlHid;->setFrozen(Z)V

    .line 412
    return-void
.end method

.method public setRequestedOrientation(I)V
    .locals 1
    .param p1, "requestedOrientation"    # I

    .line 250
    const/4 v0, 0x6

    invoke-super {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 251
    return-void
.end method
