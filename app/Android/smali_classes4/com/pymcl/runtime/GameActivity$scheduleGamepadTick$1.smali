.class public final Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;
.super Ljava/lang/Object;
.source "GameActivity.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/GameActivity;->scheduleGamepadTick()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004"
    }
    d2 = {
        "com/pymcl/runtime/GameActivity$scheduleGamepadTick$1",
        "Ljava/lang/Runnable;",
        "run",
        "",
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

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    .line 396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 398
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v0}, Lcom/pymcl/runtime/GameActivity;->access$getPhysical$p(Lcom/pymcl/runtime/GameActivity;)Lcom/pymcl/runtime/input/PhysicalInput;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "physical"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/PhysicalInput;->getGamepad()Lcom/pymcl/runtime/input/GamepadMapper;

    move-result-object v0

    .line 399
    .local v0, "g":Lcom/pymcl/runtime/input/GamepadMapper;
    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapper;->getLookX()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v4

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapper;->getLookY()F

    move-result v1

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    if-eqz v3, :cond_3

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v1, v4}, Lcom/pymcl/runtime/GameActivity;->access$setGamepadTicking$p(Lcom/pymcl/runtime/GameActivity;Z)V

    return-void

    .line 400
    :cond_3
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v1}, Lcom/pymcl/runtime/GameActivity;->access$getGrabbed$p(Lcom/pymcl/runtime/GameActivity;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapper;->tick()V

    .line 401
    :cond_4
    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$scheduleGamepadTick$1;->this$0:Lcom/pymcl/runtime/GameActivity;

    invoke-static {v1}, Lcom/pymcl/runtime/GameActivity;->access$getHandler$p(Lcom/pymcl/runtime/GameActivity;)Landroid/os/Handler;

    move-result-object v1

    move-object v2, p0

    check-cast v2, Ljava/lang/Runnable;

    const-wide/16 v3, 0x10

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 402
    return-void
.end method
