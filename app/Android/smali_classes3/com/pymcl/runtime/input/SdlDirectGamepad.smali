.class public final Lcom/pymcl/runtime/input/SdlDirectGamepad;
.super Ljava/lang/Object;
.source "SdlGamepad.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/SdlDirectGamepad;",
        "",
        "<init>",
        "()V",
        "forwardKey",
        "",
        "e",
        "Landroid/view/KeyEvent;",
        "forwardMotion",
        "Landroid/view/MotionEvent;",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/SdlDirectGamepad;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/SdlDirectGamepad;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/SdlDirectGamepad;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/SdlDirectGamepad;->INSTANCE:Lcom/pymcl/runtime/input/SdlDirectGamepad;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final forwardKey(Landroid/view/KeyEvent;)Z
    .locals 4
    .param p1, "e"    # Landroid/view/KeyEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 46
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0, p1, v2}, Lorg/libsdl/app/SDLActivity;->handleKeyEvent(Landroid/view/View;ILandroid/view/KeyEvent;Landroid/view/inputmethod/InputConnection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-SDLPad"

    const-string v3, "forwardKey"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 46
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return v1
.end method

.method public final forwardMotion(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 52
    :cond_0
    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0, p1}, Lorg/libsdl/app/SDLActivity;->forwardGenericMotionToSDL(Landroid/view/View;Landroid/view/MotionEvent;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 53
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-SDLPad"

    const-string v3, "forwardMotion"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return v1
.end method
