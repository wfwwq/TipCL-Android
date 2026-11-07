.class public final Lcom/pymcl/runtime/GameActivity$buildViews$10;
.super Ljava/lang/Object;
.source "GameActivity.kt"

# interfaces
.implements Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/GameActivity;->buildViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016J\u0008\u0010\u0006\u001a\u00020\u0003H\u0016J\u0008\u0010\u0007\u001a\u00020\u0005H\u0016J\u0008\u0010\u0008\u001a\u00020\u0005H\u0016J\u0008\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/pymcl/runtime/GameActivity$buildViews$10",
        "Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;",
        "isGrabbed",
        "",
        "toggleIme",
        "",
        "imeShowing",
        "togglePointerCapture",
        "onExternalMouseUsed",
        "gamepadRoute",
        "Lcom/pymcl/runtime/input/GamepadRoute;",
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


# instance fields
.field final synthetic this$0:Lcom/pymcl/runtime/GameActivity;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/pymcl/runtime/GameActivity;

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge forwardGamepadKey(Landroid/view/KeyEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/KeyEvent;

    .line 134
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadKey(Landroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public bridge forwardGamepadMotion(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "e"    # Landroid/view/MotionEvent;

    .line 134
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/PhysicalInput$Callbacks;->forwardGamepadMotion(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public gamepadRoute()Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 1

    .line 140
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getGamepadMode$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/input/GamepadModeController;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "gamepadMode"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModeController;->route()Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v0

    return-object v0
.end method

.method public imeShowing()Z
    .locals 1

    .line 137
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getCharInput$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/keyboard/TouchCharInput;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "charInput"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->isShowing()Z

    move-result v0

    return v0
.end method

.method public isGrabbed()Z
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getGrabbed$p(Lcom/pymcl/runtime/GameActivity;)Z

    move-result v0

    return v0
.end method

.method public onExternalMouseUsed()V
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getGrabbed$p(Lcom/pymcl/runtime/GameActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/pymcl/runtime/GameActivity;->access$setMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;Z)V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$applyPointerCapture(Lcom/pymcl/runtime/GameActivity;)V

    :cond_0
    return-void
.end method

.method public toggleIme()V
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getCharInput$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/keyboard/TouchCharInput;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "charInput"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/keyboard/TouchCharInput;->toggle()V

    return-void
.end method

.method public togglePointerCapture()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v1}, Lcom/pymcl/runtime/GameActivity;->access$getMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/pymcl/runtime/GameActivity;->access$setMouseCaptureWanted$p(Lcom/pymcl/runtime/GameActivity;Z)V

    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$buildViews$10;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$applyPointerCapture(Lcom/pymcl/runtime/GameActivity;)V

    return-void
.end method
