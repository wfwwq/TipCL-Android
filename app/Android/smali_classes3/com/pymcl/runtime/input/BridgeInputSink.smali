.class public final Lcom/pymcl/runtime/input/BridgeInputSink;
.super Ljava/lang/Object;
.source "InputSink.kt"

# interfaces
.implements Lcom/pymcl/runtime/input/InputSink;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0005\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u001aH\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/BridgeInputSink;",
        "Lcom/pymcl/runtime/input/InputSink;",
        "bridge",
        "Lkotlin/Function0;",
        "Lcom/tungsten/fclauncher/bridge/FCLBridge;",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;)V",
        "pressedMouse",
        "",
        "key",
        "",
        "fclKeycode",
        "",
        "press",
        "",
        "char",
        "c",
        "",
        "mouseButton",
        "button",
        "releaseAll",
        "scroll",
        "dy",
        "",
        "cursorPos",
        "x",
        "",
        "y",
        "lookDelta",
        "dx",
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
.field private final bridge:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lcom/tungsten/fclauncher/bridge/FCLBridge;",
            ">;"
        }
    .end annotation
.end field

.field private final pressedMouse:[Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "bridge"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Lcom/tungsten/fclauncher/bridge/FCLBridge;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bridge"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->bridge:Lkotlin/jvm/functions/Function0;

    .line 34
    const/16 v0, 0x8

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    .line 33
    return-void
.end method


# virtual methods
.method public char(C)V
    .locals 1
    .param p1, "c"    # C

    .line 43
    iget-object v0, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->bridge:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventChar(C)V

    :cond_0
    return-void
.end method

.method public bridge click(I)V
    .locals 0
    .param p1, "button"    # I

    .line 33
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->click(I)V

    return-void
.end method

.method public cursorPos(FF)V
    .locals 1
    .param p1, "x"    # F
    .param p2, "y"    # F

    .line 61
    iget-object v0, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->bridge:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventPointer(FF)V

    :cond_0
    return-void
.end method

.method public key(IZ)V
    .locals 3
    .param p1, "fclKeycode"    # I
    .param p2, "press"    # Z

    .line 37
    iget-object v0, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->bridge:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-nez v0, :cond_0

    return-void

    .line 38
    .local v0, "b":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    :cond_0
    invoke-static {p1}, Lcom/tungsten/fclauncher/keycodes/LwjglKeycodeMap;->convertKeycode(I)I

    move-result v1

    .line 39
    .local v1, "glfw":I
    if-ltz v1, :cond_1

    invoke-static {v1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->setModifiers(IZ)V

    .line 40
    :cond_1
    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2, p2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventKey(IIZ)V

    .line 41
    return-void
.end method

.method public lookDelta(FF)V
    .locals 0
    .param p1, "dx"    # F
    .param p2, "dy"    # F

    .line 62
    invoke-static {p1, p2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventLookDelta(FF)V

    return-void
.end method

.method public mouseButton(IZ)V
    .locals 3
    .param p1, "button"    # I
    .param p2, "press"    # Z

    .line 46
    iget-object v0, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->bridge:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tungsten/fclauncher/bridge/FCLBridge;

    if-nez v0, :cond_0

    return-void

    .line 48
    .local v0, "b":Lcom/tungsten/fclauncher/bridge/FCLBridge;
    :cond_0
    const/4 v1, 0x0

    if-ltz p1, :cond_1

    iget-object v2, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    array-length v2, v2

    if-ge p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-eqz v1, :cond_3

    .line 49
    iget-object v1, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    aget-boolean v1, v1, p1

    if-ne v1, p2, :cond_2

    return-void

    .line 50
    :cond_2
    iget-object v1, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    aput-boolean p2, v1, p1

    .line 52
    :cond_3
    invoke-virtual {v0, p1, p2}, Lcom/tungsten/fclauncher/bridge/FCLBridge;->pushEventMouseButton(IZ)V

    .line 53
    return-void
.end method

.method public final releaseAll()V
    .locals 3

    .line 57
    const/4 v0, 0x0

    .local v0, "i":I
    iget-object v1, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_1

    iget-object v2, p0, Lcom/pymcl/runtime/input/BridgeInputSink;->pressedMouse:[Z

    aget-boolean v2, v2, v0

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/pymcl/runtime/input/BridgeInputSink;->mouseButton(IZ)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 58
    .end local v0    # "i":I
    :cond_1
    return-void
.end method

.method public scroll(D)V
    .locals 2
    .param p1, "dy"    # D

    .line 60
    const-wide/16 v0, 0x0

    invoke-static {v0, v1, p1, p2}, Lorg/lwjgl/glfw/CallbackBridge;->sendScroll(DD)V

    return-void
.end method

.method public bridge tapKey(I)V
    .locals 0
    .param p1, "fclKeycode"    # I

    .line 33
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->tapKey(I)V

    return-void
.end method

.method public bridge text(Ljava/lang/String;)V
    .locals 0
    .param p1, "s"    # Ljava/lang/String;

    .line 33
    invoke-super {p0, p1}, Lcom/pymcl/runtime/input/InputSink;->text(Ljava/lang/String;)V

    return-void
.end method
