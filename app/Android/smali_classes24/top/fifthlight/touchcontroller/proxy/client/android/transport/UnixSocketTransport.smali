.class final Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;
.super Ljava/lang/Object;
.source "UnixSocketTransport.kt"

# interfaces
.implements Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u000c\u001a\u00020\tH\u0002J\u0008\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "serverSocket",
        "Landroid/net/LocalServerSocket;",
        "<init>",
        "(Landroid/net/LocalServerSocket;)V",
        "closed",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "clientSocket",
        "Landroid/net/LocalSocket;",
        "clientLock",
        "Ljava/util/concurrent/locks/ReentrantLock;",
        "acceptClientSocket",
        "close",
        "",
        "send",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "receive",
        "",
        "proxy-client-android_release"
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
.field private final clientLock:Ljava/util/concurrent/locks/ReentrantLock;

.field private clientSocket:Landroid/net/LocalSocket;

.field private final closed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final serverSocket:Landroid/net/LocalServerSocket;


# direct methods
.method public constructor <init>(Landroid/net/LocalServerSocket;)V
    .locals 2
    .param p1, "serverSocket"    # Landroid/net/LocalServerSocket;

    const-string/jumbo v0, "serverSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->serverSocket:Landroid/net/LocalServerSocket;

    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientLock:Ljava/util/concurrent/locks/ReentrantLock;

    .line 15
    return-void
.end method

.method private final acceptClientSocket()Landroid/net/LocalSocket;
    .locals 7

    .line 23
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientLock:Ljava/util/concurrent/locks/ReentrantLock;

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    const/4 v1, 0x0

    .line 24
    .local v1, "$i$a$-withLock-UnixSocketTransport$acceptClientSocket$1":I
    :try_start_0
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    if-nez v2, :cond_0

    move-object v2, p0

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;

    .local v2, "$this$acceptClientSocket_u24lambda_u242_u24lambda_u241":Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;
    const/4 v3, 0x0

    .line 25
    .local v3, "$i$a$-run-UnixSocketTransport$acceptClientSocket$1$1":I
    iget-object v4, v2, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->serverSocket:Landroid/net/LocalServerSocket;

    invoke-virtual {v4}, Landroid/net/LocalServerSocket;->accept()Landroid/net/LocalSocket;

    move-result-object v4

    move-object v5, v4

    .local v5, "$this$acceptClientSocket_u24lambda_u242_u24lambda_u241_u24lambda_u240":Landroid/net/LocalSocket;
    const/4 v6, 0x0

    .line 26
    .local v6, "$i$a$-apply-UnixSocketTransport$acceptClientSocket$1$1$1":I
    iput-object v5, v2, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    nop

    .line 25
    .end local v5    # "$this$acceptClientSocket_u24lambda_u242_u24lambda_u241_u24lambda_u240":Landroid/net/LocalSocket;
    .end local v6    # "$i$a$-apply-UnixSocketTransport$acceptClientSocket$1$1$1":I
    nop

    .line 27
    nop

    .line 24
    .end local v2    # "$this$acceptClientSocket_u24lambda_u242_u24lambda_u241":Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;
    .end local v3    # "$i$a$-run-UnixSocketTransport$acceptClientSocket$1$1":I
    move-object v2, v4

    .line 28
    :cond_0
    nop

    .line 23
    .end local v1    # "$i$a$-withLock-UnixSocketTransport$acceptClientSocket$1":I
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    const-string/jumbo v0, "withLock(...)"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    return-object v2

    .line 23
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw v1
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 32
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->closed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 33
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/LocalSocket;->close()V

    .line 34
    :cond_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->serverSocket:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V

    .line 36
    :cond_1
    return-void
.end method

.method public receive(Ljava/nio/ByteBuffer;)Z
    .locals 9
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "UnixSocketTransport"

    const-string v1, "buffer"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    :goto_0
    nop

    .line 83
    nop

    .line 84
    :try_start_0
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->acceptClientSocket()Landroid/net/LocalSocket;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 83
    nop

    .line 89
    .local v1, "client":Landroid/net/LocalSocket;
    nop

    .line 90
    :try_start_1
    invoke-virtual {v1}, Landroid/net/LocalSocket;->getInputStream()Ljava/io/InputStream;

    move-result-object v2

    .line 93
    .local v2, "stream":Ljava/io/InputStream;
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v3

    .line 94
    .local v3, "length":I
    const/4 v4, -0x1

    if-ne v3, v4, :cond_0

    .line 96
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    .line 97
    goto :goto_0

    .line 100
    :cond_0
    if-nez v3, :cond_1

    .line 101
    const-string v4, "Ignore empty packet"

    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    goto :goto_0

    .line 105
    :cond_1
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    if-lt v5, v3, :cond_7

    .line 109
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 111
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    .line 112
    .local v5, "array":[B
    const/4 v6, 0x0

    .line 113
    .local v6, "readLen":I
    :goto_1
    if-ge v6, v3, :cond_3

    .line 115
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v7

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v8

    add-int/2addr v7, v8

    add-int/2addr v7, v6

    sub-int v8, v3, v6

    invoke-virtual {v2, v5, v7, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    .line 114
    nop

    .line 116
    .local v7, "len":I
    if-ne v7, v4, :cond_2

    .line 118
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    .line 119
    goto :goto_0

    .line 121
    :cond_2
    add-int/2addr v6, v7

    .end local v7    # "len":I
    goto :goto_1

    .line 123
    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v4

    add-int/2addr v4, v6

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .end local v5    # "array":[B
    .end local v6    # "readLen":I
    goto :goto_3

    .line 126
    :cond_4
    new-array v5, v3, [B

    .line 127
    .local v5, "dataBuffer":[B
    const/4 v6, 0x0

    .line 128
    .restart local v6    # "readLen":I
    :goto_2
    if-ge v6, v3, :cond_6

    .line 129
    sub-int v7, v3, v6

    invoke-virtual {v2, v5, v6, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    .line 130
    .restart local v7    # "len":I
    if-ne v7, v4, :cond_5

    .line 132
    invoke-virtual {v1}, Landroid/net/LocalSocket;->close()V

    .line 133
    goto :goto_0

    .line 135
    :cond_5
    add-int/2addr v6, v7

    .end local v7    # "len":I
    goto :goto_2

    .line 137
    :cond_6
    invoke-virtual {p1, v5}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    move-result-object v4

    .end local v5    # "dataBuffer":[B
    .end local v6    # "readLen":I
    check-cast v4, Ljava/nio/Buffer;

    .line 140
    :goto_3
    const/4 v0, 0x1

    return v0

    .line 106
    :cond_7
    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Buffer overflow: packet length is "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", but the buffer only have "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .end local v1    # "client":Landroid/net/LocalSocket;
    .end local p1    # "buffer":Ljava/nio/ByteBuffer;
    throw v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 141
    .end local v2    # "stream":Ljava/io/InputStream;
    .end local v3    # "length":I
    .restart local v1    # "client":Landroid/net/LocalSocket;
    .restart local p1    # "buffer":Ljava/nio/ByteBuffer;
    :catch_0
    move-exception v2

    .line 142
    .local v2, "ex":Ljava/io/IOException;
    const-string v3, "Send message failed: "

    move-object v4, v2

    check-cast v4, Ljava/lang/Throwable;

    invoke-static {v0, v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 143
    nop

    .line 144
    :try_start_2
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Landroid/net/LocalSocket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    .line 145
    :catch_1
    move-exception v3

    .line 147
    :cond_8
    :goto_4
    const/4 v3, 0x0

    iput-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    .end local v1    # "client":Landroid/net/LocalSocket;
    .end local v2    # "ex":Ljava/io/IOException;
    goto/16 :goto_0

    .line 85
    :catch_2
    move-exception v0

    .line 86
    .local v0, "ex":Ljava/io/IOException;
    nop

    .line 150
    .end local v0    # "ex":Ljava/io/IOException;
    const/4 v0, 0x0

    return v0
.end method

.method public send(Ljava/nio/ByteBuffer;)V
    .locals 5
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    :goto_0
    nop

    .line 40
    nop

    .line 41
    :try_start_0
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->acceptClientSocket()Landroid/net/LocalSocket;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    .line 40
    nop

    .line 46
    .local v0, "client":Landroid/net/LocalSocket;
    nop

    .line 47
    :try_start_1
    invoke-virtual {v0}, Landroid/net/LocalSocket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    .line 49
    .local v1, "stream":Ljava/io/OutputStream;
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    const/16 v3, 0xff

    if-gt v2, v3, :cond_2

    .line 52
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 56
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write(I)V

    .line 58
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isReadOnly()Z

    move-result v2

    if-nez v2, :cond_0

    .line 60
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    .line 61
    .local v2, "array":[B
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    invoke-virtual {v1, v2, v3, v4}, Ljava/io/OutputStream;->write([BII)V

    .line 62
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->position()I

    move-result v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_1

    .line 65
    .end local v2    # "array":[B
    :cond_0
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    new-array v2, v2, [B

    .line 66
    .restart local v2    # "array":[B
    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 67
    invoke-virtual {v1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 69
    .end local v2    # "array":[B
    :goto_1
    goto :goto_3

    .line 53
    :cond_1
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Empty message"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .end local v0    # "client":Landroid/net/LocalSocket;
    .end local p1    # "buffer":Ljava/nio/ByteBuffer;
    throw v2

    .line 51
    .restart local v0    # "client":Landroid/net/LocalSocket;
    .restart local p1    # "buffer":Ljava/nio/ByteBuffer;
    :cond_2
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Message too big: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v0    # "client":Landroid/net/LocalSocket;
    .end local p1    # "buffer":Ljava/nio/ByteBuffer;
    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 70
    .end local v1    # "stream":Ljava/io/OutputStream;
    .restart local v0    # "client":Landroid/net/LocalSocket;
    .restart local p1    # "buffer":Ljava/nio/ByteBuffer;
    :catch_0
    move-exception v1

    .line 71
    .local v1, "ex":Ljava/io/IOException;
    const-string v2, "Send message failed: "

    move-object v3, v1

    check-cast v3, Ljava/lang/Throwable;

    const-string v4, "UnixSocketTransport"

    invoke-static {v4, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    nop

    .line 73
    :try_start_2
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/net/LocalSocket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2

    .line 74
    :catch_1
    move-exception v2

    .line 76
    :cond_3
    :goto_2
    const/4 v2, 0x0

    iput-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;->clientSocket:Landroid/net/LocalSocket;

    .end local v0    # "client":Landroid/net/LocalSocket;
    .end local v1    # "ex":Ljava/io/IOException;
    goto/16 :goto_0

    .line 42
    :catch_2
    move-exception v0

    .line 43
    .local v0, "ex":Ljava/io/IOException;
    nop

    .line 79
    .end local v0    # "ex":Ljava/io/IOException;
    :goto_3
    return-void
.end method
