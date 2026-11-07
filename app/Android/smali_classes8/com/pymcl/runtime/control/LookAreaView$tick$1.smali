.class public final Lcom/pymcl/runtime/control/LookAreaView$tick$1;
.super Ljava/lang/Object;
.source "ControlViews.kt"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/control/LookAreaView;-><init>(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)V
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
        "com/pymcl/runtime/control/LookAreaView$tick$1",
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
.field final synthetic this$0:Lcom/pymcl/runtime/control/LookAreaView;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/control/LookAreaView;)V
    .locals 0
    .param p1, "$receiver"    # Lcom/pymcl/runtime/control/LookAreaView;

    iput-object p1, p0, Lcom/pymcl/runtime/control/LookAreaView$tick$1;->this$0:Lcom/pymcl/runtime/control/LookAreaView;

    .line 177
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 177
    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView$tick$1;->this$0:Lcom/pymcl/runtime/control/LookAreaView;

    invoke-static {v0}, Lcom/pymcl/runtime/control/LookAreaView;->access$getGesture$p(Lcom/pymcl/runtime/control/LookAreaView;)Lcom/pymcl/runtime/input/LookGesture;

    move-result-object v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/runtime/input/LookGesture;->checkLongPress(J)V

    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView$tick$1;->this$0:Lcom/pymcl/runtime/control/LookAreaView;

    invoke-static {v0}, Lcom/pymcl/runtime/control/LookAreaView;->access$getGesture$p(Lcom/pymcl/runtime/control/LookAreaView;)Lcom/pymcl/runtime/input/LookGesture;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LookGesture;->getActive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/control/LookAreaView$tick$1;->this$0:Lcom/pymcl/runtime/control/LookAreaView;

    move-object v1, p0

    check-cast v1, Ljava/lang/Runnable;

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Lcom/pymcl/runtime/control/LookAreaView;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
