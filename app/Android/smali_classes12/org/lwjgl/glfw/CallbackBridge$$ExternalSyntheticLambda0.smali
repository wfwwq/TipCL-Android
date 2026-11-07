.class public final synthetic Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Landroid/view/Choreographer$FrameCallback;

.field public final synthetic f$1:J


# direct methods
.method public synthetic constructor <init>(Landroid/view/Choreographer$FrameCallback;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;->f$0:Landroid/view/Choreographer$FrameCallback;

    iput-wide p2, p0, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;->f$1:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;->f$0:Landroid/view/Choreographer$FrameCallback;

    iget-wide v1, p0, Lorg/lwjgl/glfw/CallbackBridge$$ExternalSyntheticLambda0;->f$1:J

    invoke-static {v0, v1, v2}, Lorg/lwjgl/glfw/CallbackBridge;->lambda$postFrameCallbackDelayed$0(Landroid/view/Choreographer$FrameCallback;J)V

    return-void
.end method
