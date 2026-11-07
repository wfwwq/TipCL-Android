.class public final Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;
.super Ljava/lang/Object;
.source "LauncherProxyMessageClient.kt"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u0008\u0010\u0013\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;",
        "Ljava/lang/AutoCloseable;",
        "transport",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;)V",
        "sendQueue",
        "Ljava/util/concurrent/LinkedBlockingQueue;",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;",
        "receiveQueue",
        "running",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "closed",
        "run",
        "",
        "send",
        "message",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "receive",
        "close",
        "MessageItem",
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
.field private closed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;",
            ">;"
        }
    .end annotation
.end field

.field private running:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final sendQueue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;",
            ">;"
        }
    .end annotation
.end field

.field private final transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;


# direct methods
.method public static synthetic $r8$lambda$Y0vJmcSilxBU2F5F6TeSgKnhSmI(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V
    .locals 0

    invoke-static {p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->run$lambda$0(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V

    return-void
.end method

.method public static synthetic $r8$lambda$m3BlcsHrn87ibwfqZKsydpG91y4(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V
    .locals 0

    invoke-static {p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->run$lambda$1(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V

    return-void
.end method

.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;)V
    .locals 2
    .param p1, "transport"    # Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    const-string/jumbo v0, "transport"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    .line 25
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    const/16 v1, 0x800

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->sendQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 26
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    return-void
.end method

.method private static final run$lambda$0(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V
    .locals 8
    .param p0, "this$0"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    .line 39
    const/high16 v0, 0x10000

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 40
    .local v0, "encodeBuffer":Ljava/nio/ByteBuffer;
    const/16 v1, 0x100

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 41
    .local v1, "sendBuffer":Ljava/nio/ByteBuffer;
    :cond_0
    :goto_0
    nop

    .line 42
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->sendQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;

    .line 43
    .local v2, "item":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    instance-of v3, v2, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;

    if-nez v3, :cond_3

    .line 44
    instance-of v3, v2, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    if-eqz v3, :cond_2

    .line 45
    move-object v3, v2

    check-cast v3, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->getMessage()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v3

    .line 46
    .local v3, "message":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 47
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 48
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 49
    invoke-virtual {v3}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->getWrapInLargeMessage()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 51
    :goto_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    const/16 v5, 0xf0

    invoke-static {v4, v5}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v4

    .line 53
    .local v4, "length":I
    new-array v5, v4, [B

    .line 54
    .local v5, "payload":[B
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 55
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 56
    new-instance v6, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    .line 57
    nop

    .line 58
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v7

    .line 56
    xor-int/lit8 v7, v7, 0x1

    invoke-direct {v6, v5, v7}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;-><init>([BZ)V

    .line 60
    .local v6, "wrappedMessage":Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v6, v1}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 61
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 62
    iget-object v7, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    invoke-interface {v7, v1}, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;->send(Ljava/nio/ByteBuffer;)V

    .end local v4    # "length":I
    .end local v5    # "payload":[B
    .end local v6    # "wrappedMessage":Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;
    goto :goto_1

    .line 65
    :cond_1
    iget-object v4, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    invoke-interface {v4, v0}, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;->send(Ljava/nio/ByteBuffer;)V

    .end local v3    # "message":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    goto :goto_0

    .line 42
    :cond_2
    new-instance v3, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v3}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v3

    .line 70
    .end local v2    # "item":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    :cond_3
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    invoke-interface {v2}, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;->close()V

    .line 71
    return-void
.end method

.method private static final run$lambda$1(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V
    .locals 8
    .param p0, "this$0"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;

    .line 74
    const/16 v0, 0x100

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 75
    .local v0, "receiveBuffer":Ljava/nio/ByteBuffer;
    const/high16 v1, 0x10000

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 76
    .local v1, "decodeBuffer":Ljava/nio/ByteBuffer;
    :goto_0
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->transport:Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v2, v0}, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;->receive(Ljava/nio/ByteBuffer;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 77
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 79
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    const/4 v3, 0x4

    if-ge v2, v3, :cond_0

    .line 81
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 82
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v2

    .line 85
    .local v2, "type":I
    nop

    .line 86
    :try_start_0
    sget-object v4, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;

    invoke-virtual {v4, v2, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;->decode(ILjava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v4
    :try_end_0
    .catch Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 87
    :catch_0
    move-exception v4

    .line 89
    .local v4, "ex":Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;
    const/4 v5, 0x0

    move-object v4, v5

    .line 85
    .end local v4    # "ex":Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;
    :goto_1
    nop

    .line 91
    .local v4, "message":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    if-eqz v4, :cond_3

    .line 92
    instance-of v5, v4, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    if-eqz v5, :cond_2

    .line 93
    move-object v5, v4

    check-cast v5, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->getPayload()[B

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 94
    move-object v5, v4

    check-cast v5, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;

    invoke-virtual {v5}, Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;->getEnd()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 95
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 96
    nop

    .line 97
    :try_start_1
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    if-lt v5, v3, :cond_1

    .line 98
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    .line 99
    .local v3, "wrappedType":I
    sget-object v5, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v5, v3, v1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;->decode(ILjava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v5

    .line 100
    .local v5, "wrappedMessage":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    iget-object v6, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v7, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-direct {v7, v5}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    invoke-virtual {v6, v7}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException; {:try_start_1 .. :try_end_1} :catch_1

    .end local v3    # "wrappedType":I
    .end local v5    # "wrappedMessage":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    goto :goto_2

    .line 102
    :catch_1
    move-exception v3

    .line 104
    .local v3, "ex":Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;
    nop

    .line 106
    .end local v3    # "ex":Ltop/fifthlight/touchcontroller/proxy/message/MessageDecodeException;
    :cond_1
    :goto_2
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_3

    .line 109
    :cond_2
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v5, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-direct {v5, v4}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    invoke-virtual {v3, v5}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 113
    :cond_3
    :goto_3
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    goto :goto_0

    .line 115
    .end local v2    # "type":I
    .end local v4    # "message":Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    :cond_4
    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 148
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 149
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->sendQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 150
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 152
    :cond_0
    return-void
.end method

.method public final receive()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 3

    .line 135
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 136
    return-object v1

    .line 138
    :cond_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->receiveQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;

    if-nez v0, :cond_1

    return-object v1

    .line 139
    .local v0, "item":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    :cond_1
    instance-of v2, v0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    if-eqz v2, :cond_2

    move-object v1, v0

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-virtual {v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->getMessage()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    move-result-object v1

    goto :goto_0

    .line 140
    :cond_2
    sget-object v2, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Close;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 138
    .end local v0    # "item":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    :goto_0
    return-object v1

    .restart local v0    # "item":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
    :cond_3
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final run()V
    .locals 3

    .line 34
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->running:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    .line 35
    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    .line 71
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$$ExternalSyntheticLambda0;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V

    .line 37
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 71
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 72
    new-instance v0, Ljava/lang/Thread;

    .line 115
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$$ExternalSyntheticLambda1;-><init>(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;)V

    .line 72
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 115
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 116
    return-void
.end method

.method public final send(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V
    .locals 2
    .param p1, "message"    # Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 125
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient;->sendQueue:Ljava/util/concurrent/LinkedBlockingQueue;

    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-direct {v1, p1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    .line 127
    :cond_0
    return-void
.end method
