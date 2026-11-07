.class public interface abstract Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
.super Ljava/lang/Object;
.source "PhysicalInput.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/PhysicalInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Callbacks"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/PhysicalInput$Callbacks$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H&J\u0008\u0010\u0004\u001a\u00020\u0005H&J\u0008\u0010\u0006\u001a\u00020\u0003H&J\u0008\u0010\u0007\u001a\u00020\u0005H&J\u0008\u0010\u0008\u001a\u00020\u0005H&J\u0008\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000fH\u0016\u00a8\u0006\u0010\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;",
        "",
        "isGrabbed",
        "",
        "toggleIme",
        "",
        "imeShowing",
        "togglePointerCapture",
        "onExternalMouseUsed",
        "gamepadRoute",
        "Lcom/pymcl/runtime/input/GamepadRoute;",
        "forwardGamepadKey",
        "e",
        "Landroid/view/KeyEvent;",
        "forwardGamepadMotion",
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


# direct methods
.method public static synthetic access$forwardGamepadKey$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/KeyEvent;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
    .param p1, "e"    # Landroid/view/KeyEvent;

    .line 17
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadKey(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$forwardGamepadMotion$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
    .param p1, "e"    # Landroid/view/MotionEvent;

    .line 17
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadMotion(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$gamepadRoute$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;

    .line 17
    invoke-super {p0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->gamepadRoute()Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public forwardGamepadKey(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/KeyEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget-object v0, Lcom/pymcl/runtime/input/SdlDirectGamepad;->INSTANCE:Lcom/pymcl/runtime/input/SdlDirectGamepad;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/SdlDirectGamepad;->forwardKey(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public forwardGamepadMotion(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/pymcl/runtime/input/SdlDirectGamepad;->INSTANCE:Lcom/pymcl/runtime/input/SdlDirectGamepad;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/SdlDirectGamepad;->forwardMotion(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public gamepadRoute()Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 1

    .line 24
    sget-object v0, Lcom/pymcl/runtime/input/GamepadRoute;->MAPPING:Lcom/pymcl/runtime/input/GamepadRoute;

    return-object v0
.end method

.method public abstract imeShowing()Z
.end method

.method public abstract isGrabbed()Z
.end method

.method public abstract onExternalMouseUsed()V
.end method

.method public abstract toggleIme()V
.end method

.method public abstract togglePointerCapture()V
.end method
