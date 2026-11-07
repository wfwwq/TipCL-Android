.class public final Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
.super Ljava/lang/Object;
.source "LauncherProxyClient.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;,
        Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;,
        Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u000389:B!\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0006\u0010\"\u001a\u00020#J\u001e\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(J\u000e\u0010*\u001a\u00020#2\u0006\u0010%\u001a\u00020&J\u0006\u0010+\u001a\u00020#J\u001e\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(J\u0008\u00101\u001a\u00020#H\u0002J\u0016\u00102\u001a\u00020#2\u000c\u00103\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u00104\u001a\u00020#2\u0006\u00105\u001a\u000206J\u0008\u00107\u001a\u00020#H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u000c\u0012\n \u000e*\u0004\u0018\u00010\u00060\u00060\rj\u0002`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006;"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;",
        "Ljava/lang/AutoCloseable;",
        "transport",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "capabilities",
        "",
        "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;)V",
        "running",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "messageClient",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;",
        "Ljava/util/HashSet;",
        "kotlin.jvm.PlatformType",
        "Lkotlin/collections/HashSet;",
        "vibrationHandler",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;",
        "getVibrationHandler",
        "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;",
        "setVibrationHandler",
        "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;)V",
        "inputHandler",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;",
        "getInputHandler",
        "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;",
        "setInputHandler",
        "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;)V",
        "keyboardShowHandler",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;",
        "getKeyboardShowHandler",
        "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;",
        "setKeyboardShowHandler",
        "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;)V",
        "run",
        "",
        "addPointer",
        "index",
        "",
        "x",
        "",
        "y",
        "removePointer",
        "clearPointer",
        "moveView",
        "screenBased",
        "",
        "deltaPitch",
        "deltaYaw",
        "sendCapabilities",
        "updateCapabilities",
        "newCapabilities",
        "updateTextInputState",
        "newState",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "close",
        "VibrationHandler",
        "InputHandler",
        "KeyboardShowHandler",
        "TouchController-Proxy-Client"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private capabilities:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
            ">;"
        }
    .end annotation
.end field

.field private inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

.field private keyboardShowHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

.field private final messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

.field private final running:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private vibrationHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;


# direct methods
.method public static synthetic $r8$lambda$kIlZ4IoOK1ucaz_KdAWszTNOcO4(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V
    .locals 0

    invoke-static {p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->run$lambda$0(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V

    return-void
.end method

.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;)V
    .locals 2
    .param p1, "transport"    # Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    const-string/jumbo v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    return-void
.end method

.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;)V
    .locals 2
    .param p1, "transport"    # Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .param p2, "capabilities"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
            "Ljava/util/Set<",
            "+",
            "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
            ">;)V"
        }
    .end annotation

    const-string/jumbo v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capabilities"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    .line 20
    new-instance v0, Ljava/util/HashSet;

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 14
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 16
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;Ljava/util/Set;)V

    .line 17
    return-void
.end method

.method private static final run$lambda$0(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V
    .locals 3
    .param p0, "this$0"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    .line 73
    nop

    :cond_0
    :goto_0
    nop

    .line 74
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receive()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v0

    if-nez v0, :cond_1

    .line 103
    return-void

    .line 75
    .local v0, "message":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    :cond_1
    nop

    .line 76
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;

    if-eqz v1, :cond_2

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->vibrationHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->getKind()Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    move-result-object v2

    invoke-interface {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;->vibrate(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V

    goto :goto_0

    .line 77
    :cond_2
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/InitializeMessage;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->sendCapabilities()V

    goto :goto_0

    .line 78
    :cond_3
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    if-eqz v1, :cond_4

    .line 79
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;->getStatus()Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object v2

    invoke-interface {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;->updateState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    goto :goto_0

    .line 82
    :cond_4
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    if-eqz v1, :cond_5

    .line 83
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;->getCursorRect()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    move-result-object v2

    invoke-interface {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;->updateCursor(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V

    goto :goto_0

    .line 86
    :cond_5
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;

    if-eqz v1, :cond_6

    .line 87
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;

    invoke-virtual {v2}, Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;->getInputAreaRect()Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    move-result-object v2

    invoke-interface {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;->updateArea(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V

    goto :goto_0

    .line 90
    :cond_6
    instance-of v1, v0, Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;

    if-eqz v1, :cond_0

    .line 91
    move-object v1, v0

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;->getShow()Z

    move-result v1

    if-eqz v1, :cond_7

    .line 92
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->keyboardShowHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;->showKeyboard()V

    goto :goto_0

    .line 94
    :cond_7
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->keyboardShowHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;->hideKeyboard()V

    goto :goto_0
.end method

.method private final sendCapabilities()V
    .locals 6

    .line 146
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    .line 147
    .local v1, "capability":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;-><init>(Ljava/lang/String;Z)V

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v2, v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .end local v1    # "capability":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    goto :goto_0

    .line 149
    :cond_0
    return-void
.end method

.method private final updateCapabilities(Ljava/util/Set;)V
    .locals 6
    .param p1, "newCapabilities"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
            ">;)V"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    .line 153
    .local v1, "item":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    invoke-interface {p1, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 154
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;-><init>(Ljava/lang/String;Z)V

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v2, v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .end local v1    # "item":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    goto :goto_0

    .line 157
    :cond_1
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    .line 158
    .restart local v1    # "item":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 159
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v3, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    invoke-direct {v3, v4, v5}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;-><init>(Ljava/lang/String;Z)V

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v2, v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .end local v1    # "item":Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    goto :goto_1

    .line 162
    :cond_3
    new-instance v0, Ljava/util/HashSet;

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    .line 163
    return-void
.end method


# virtual methods
.method public final addPointer(IFF)V
    .locals 2
    .param p1, "index"    # I
    .param p2, "x"    # F
    .param p3, "y"    # F

    .line 115
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;

    invoke-direct {v1, p1, p2, p3}, Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;-><init>(IFF)V

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .line 116
    return-void
.end method

.method public final clearPointer()V
    .locals 2

    .line 131
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .line 132
    return-void
.end method

.method public close()V
    .locals 1

    .line 178
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->close()V

    .line 179
    return-void
.end method

.method public final getInputHandler()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;
    .locals 1

    .line 51
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    return-object v0
.end method

.method public final getKeyboardShowHandler()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;
    .locals 1

    .line 64
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->keyboardShowHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

    return-object v0
.end method

.method public final getVibrationHandler()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;
    .locals 1

    .line 37
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->vibrationHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;

    return-object v0
.end method

.method public final moveView(ZFF)V
    .locals 2
    .param p1, "screenBased"    # Z
    .param p2, "deltaPitch"    # F
    .param p3, "deltaYaw"    # F

    .line 142
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;

    invoke-direct {v1, p1, p2, p3}, Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;-><init>(ZFF)V

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .line 143
    return-void
.end method

.method public final removePointer(I)V
    .locals 2
    .param p1, "index"    # I

    .line 124
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;

    invoke-direct {v1, p1}, Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;-><init>(I)V

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .line 125
    return-void
.end method

.method public final run()V
    .locals 3

    .line 70
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 71
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->run()V

    .line 72
    new-instance v0, Ljava/lang/Thread;

    .line 103
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$$ExternalSyntheticLambda0;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V

    .line 72
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 103
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 105
    :cond_0
    return-void
.end method

.method public final setInputHandler(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;)V
    .locals 0
    .param p1, "<set-?>"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    .line 51
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->inputHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    return-void
.end method

.method public final setKeyboardShowHandler(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;)V
    .locals 0
    .param p1, "<set-?>"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

    .line 64
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->keyboardShowHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$KeyboardShowHandler;

    return-void
.end method

.method public final setVibrationHandler(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;)V
    .locals 0
    .param p1, "<set-?>"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;

    .line 37
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->vibrationHandler:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;

    return-void
.end method

.method public final updateTextInputState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V
    .locals 2
    .param p1, "newState"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->capabilities:Ljava/util/HashSet;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->TEXT_STATUS:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    return-void

    .line 174
    :cond_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->messageClient:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    invoke-direct {v1, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    .line 175
    return-void
.end method
