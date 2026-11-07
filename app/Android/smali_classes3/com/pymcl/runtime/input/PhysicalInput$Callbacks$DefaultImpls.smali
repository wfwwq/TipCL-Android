.class public final Lcom/pymcl/runtime/input/PhysicalInput$Callbacks$DefaultImpls;
.super Ljava/lang/Object;
.source "PhysicalInput.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static forwardGamepadKey(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/KeyEvent;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
    .param p1, "e"    # Landroid/view/KeyEvent;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-static {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->access$forwardGamepadKey$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public static forwardGamepadMotion(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/MotionEvent;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
    .param p1, "e"    # Landroid/view/MotionEvent;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    invoke-static {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->access$forwardGamepadMotion$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public static gamepadRoute(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 24
    invoke-static {p0}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->access$gamepadRoute$jd(Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;)Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v0

    return-object v0
.end method
