.class public final Lnet/burningtnt/terracotta/TerracottaAndroidAPI;
.super Ljava/lang/Object;
.source "TerracottaAndroidAPI.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;,
        Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;,
        Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;,
        Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;,
        Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    }
.end annotation


# static fields
.field private static final FD_PENDING:J = 0x80000000L

.field private static final FD_REJECT:J = 0x80000001L

.field private static volatile pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

.field private static volatile runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;


# direct methods
.method static bridge synthetic -$$Nest$smfinishExportLogs0(J)V
    .locals 0

    invoke-static {p0, p1}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->finishExportLogs0(J)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 133
    const-class v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const-string v1, "net.burningtnt.terracotta.native_location"

    invoke-static {v1, v0}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    const-string v0, "terracotta"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 137
    const/4 v0, 0x0

    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    .line 150
    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static assertStarted()V
    .locals 2

    .line 457
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    if-eqz v0, :cond_0

    .line 460
    return-void

    .line 458
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Terracotta Android hasn\'t started yet."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static collectLogs()Ljava/io/Reader;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 315
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 317
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->prepareExportLogs0()J

    move-result-wide v0

    .line 318
    .local v0, "ptr":J
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    .line 322
    sget-object v4, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    invoke-static {v4}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->-$$Nest$fgetlogging(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;)Ljava/io/RandomAccessFile;

    move-result-object v4

    .line 323
    .local v4, "file":Ljava/io/RandomAccessFile;
    invoke-virtual {v4, v2, v3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 325
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    new-instance v5, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;

    invoke-direct {v5, v4, v0, v1}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$1;-><init>(Ljava/io/RandomAccessFile;J)V

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v5, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    return-object v2

    .line 319
    .end local v4    # "file":Ljava/io/RandomAccessFile;
    :cond_0
    new-instance v2, Ljava/lang/RuntimeException;

    const-string v3, "Cannot export logs from Terracotta Android."

    invoke-direct {v2, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method private static native finishExportLogs0(J)V
.end method

.method private static native getMetadata0()Ljava/lang/String;
.end method

.method public static getPendingVpnServiceRequest()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;
    .locals 3

    .line 159
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    .line 160
    .local v0, "handle":Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;
    if-eqz v0, :cond_0

    .line 163
    return-object v0

    .line 161
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "There\'s no pending VpnService request."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static getState()Ljava/lang/String;
    .locals 1

    .line 220
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 221
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getState0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static native getState0()Ljava/lang/String;
.end method

.method public static declared-synchronized initialize(Landroid/content/Context;Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;
    .locals 12
    .param p0, "context"    # Landroid/content/Context;
    .param p1, "callback"    # Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;

    const-class v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;

    monitor-enter v0

    .line 173
    :try_start_0
    const-string v1, "context"

    invoke-static {p0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 174
    const-string v1, "callback"

    invoke-static {p1, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 176
    sget-object v1, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    if-nez v1, :cond_3

    .line 180
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "net.burningtnt.terracotta"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 182
    .local v1, "root":Ljava/io/File;
    new-instance v2, Ljava/io/File;

    const-string v3, "rs"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 183
    .local v2, "base":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 184
    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    .line 191
    :try_start_1
    new-instance v3, Ljava/io/RandomAccessFile;

    new-instance v4, Ljava/io/File;

    const-string v5, "application.log"

    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const-string v5, "rw"

    invoke-direct {v3, v4, v5}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 192
    .local v3, "logging":Ljava/io/RandomAccessFile;
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-static {v4}, Landroid/os/ParcelFileDescriptor;->dup(Ljava/io/FileDescriptor;)Landroid/os/ParcelFileDescriptor;

    move-result-object v4

    invoke-virtual {v4}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    .local v4, "fd":I
    nop

    .line 197
    :try_start_2
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->start0(Ljava/lang/String;I)I

    move-result v5

    .line 198
    .local v5, "code":I
    if-nez v5, :cond_1

    .line 202
    new-instance v6, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    invoke-direct {v6, p1, v3}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;-><init>(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;Ljava/io/RandomAccessFile;)V

    sput-object v6, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    .line 204
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getMetadata0()Ljava/lang/String;

    move-result-object v6

    const-string v7, "\u0000"

    const/4 v8, 0x4

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    .line 205
    .local v6, "parts":[Ljava/lang/String;
    array-length v7, v6

    const/4 v8, 0x3

    if-ne v7, v8, :cond_0

    .line 208
    new-instance v7, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;

    const/4 v8, 0x0

    aget-object v8, v6, v8

    const/4 v9, 0x1

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    const/4 v11, 0x2

    aget-object v11, v6, v11

    invoke-direct {v7, v8, v9, v10, v11}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;-><init>(Ljava/lang/String;JLjava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v7

    .line 206
    :cond_0
    :try_start_3
    new-instance v7, Ljava/lang/AssertionError;

    const-string v8, "Should NOT be here."

    invoke-direct {v7, v8}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v7

    .line 199
    .end local v6    # "parts":[Ljava/lang/String;
    :cond_1
    new-instance v6, Ljava/lang/RuntimeException;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Cannot start Terracotta Android: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v6

    .line 193
    .end local v3    # "logging":Ljava/io/RandomAccessFile;
    .end local v4    # "fd":I
    .end local v5    # "code":I
    :catch_0
    move-exception v3

    .line 194
    .local v3, "e":Ljava/io/IOException;
    new-instance v4, Ljava/lang/RuntimeException;

    invoke-direct {v4, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v4

    .line 185
    .end local v3    # "e":Ljava/io/IOException;
    :cond_2
    new-instance v3, Ljava/lang/RuntimeException;

    const-string v4, "Cannot create net.burningtnt.terracotta/rs directory."

    invoke-direct {v3, v4}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 177
    .end local v1    # "root":Ljava/io/File;
    .end local v2    # "base":Ljava/io/File;
    :cond_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Terracotta Android has already started."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 172
    .end local p0    # "context":Landroid/content/Context;
    .end local p1    # "callback":Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;
    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private static onVpnServiceStateChanged(BBBBSLjava/lang/String;)I
    .locals 16
    .param p0, "ip1"    # B
    .param p1, "ip2"    # B
    .param p2, "ip3"    # B
    .param p3, "ip4"    # B
    .param p4, "network_length"    # S
    .param p5, "cidr"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 392
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    const-string v1, "Should NOT be here."

    if-nez v0, :cond_4

    .line 396
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v2, 0x80000000L

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 397
    .local v0, "fd":Ljava/util/concurrent/atomic/AtomicLong;
    const/4 v4, 0x4

    new-array v4, v4, [B

    const/4 v5, 0x0

    aput-byte p0, v4, v5

    const/4 v5, 0x1

    aput-byte p1, v4, v5

    const/4 v5, 0x2

    aput-byte p2, v4, v5

    const/4 v5, 0x3

    aput-byte p3, v4, v5

    invoke-static {v4}, Ljava/net/InetAddress;->getByAddress([B)Ljava/net/InetAddress;

    move-result-object v4

    .line 399
    .local v4, "address":Ljava/net/InetAddress;
    new-instance v5, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;

    move/from16 v6, p4

    move-object/from16 v7, p5

    invoke-direct {v5, v4, v6, v7, v0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;-><init>(Ljava/net/InetAddress;SLjava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V

    sput-object v5, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    .line 431
    sget-object v5, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->runtimeContext:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;

    invoke-static {v5}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->-$$Nest$fgetvpnServiceCallback(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;

    move-result-object v5

    invoke-interface {v5}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;->onStartVpnService()V

    .line 433
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 435
    .local v8, "timestamp":J
    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v10

    .line 436
    .local v10, "value":J
    cmp-long v5, v10, v2

    if-nez v5, :cond_1

    .line 437
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v12

    sub-long/2addr v12, v8

    const-wide/16 v14, 0x7530

    cmp-long v5, v12, v14

    if-gez v5, :cond_0

    .line 441
    invoke-static {}, Ljava/lang/Thread;->yield()V

    .line 453
    .end local v10    # "value":J
    goto :goto_0

    .line 438
    .restart local v10    # "value":J
    :cond_0
    const-string v1, "TerracottaAndroidAPI"

    const-string v2, "VpnService Request hasn\'t been fulfilled in 30s."

    invoke-static {v1, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    .line 439
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 442
    :cond_1
    const-wide v2, 0x80000001L

    cmp-long v2, v10, v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    .line 446
    sput-object v3, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    .line 448
    long-to-int v2, v10

    int-to-long v2, v2

    cmp-long v2, v2, v10

    if-nez v2, :cond_2

    .line 451
    long-to-int v1, v10

    return v1

    .line 449
    :cond_2
    new-instance v2, Ljava/lang/AssertionError;

    invoke-direct {v2, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v2

    .line 443
    :cond_3
    sput-object v3, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->pendingRequest:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    .line 444
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    .line 393
    .end local v0    # "fd":Ljava/util/concurrent/atomic/AtomicLong;
    .end local v4    # "address":Ljava/net/InetAddress;
    .end local v8    # "timestamp":J
    .end local v10    # "value":J
    :cond_4
    move/from16 v6, p4

    move-object/from16 v7, p5

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public static panic()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 383
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->panic0()V

    .line 384
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Should NOT be here: A RuntimeException should be thrown in panic0"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method private static native panic0()V
.end method

.method public static parseRoomCode(Ljava/lang/String;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    .locals 2
    .param p0, "room"    # Ljava/lang/String;

    .line 288
    const-string v0, "room"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 290
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 291
    invoke-static {p0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->verifyRoomCode0(Ljava/lang/String;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 301
    :pswitch_0
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Should NOT be here."

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    .line 299
    :pswitch_1
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->SCAFFOLDING:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-object v0

    .line 297
    :pswitch_2
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->PCL2CE:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-object v0

    .line 295
    :pswitch_3
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->TERRACOTTA_LEGACY:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-object v0

    .line 293
    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static native prepareExportLogs0()J
.end method

.method public static setGuesting(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .param p0, "room"    # Ljava/lang/String;
    .param p1, "player"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 264
    .local p2, "extraNodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const-string v0, "room"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 266
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 267
    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "\u0000"

    invoke-static {v0, p2}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p0, p1, v0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setGuesting0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static native setGuesting0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
.end method

.method public static setScanning(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p0, "room"    # Ljava/lang/String;
    .param p1, "player"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 247
    .local p2, "extraNodes":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 248
    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "\u0000"

    invoke-static {v0, p2}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {p0, p1, v0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setScanning0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    return-void
.end method

.method private static native setScanning0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public static setWaiting()V
    .locals 0

    .line 232
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->assertStarted()V

    .line 233
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setWaiting0()V

    .line 234
    return-void
.end method

.method private static native setWaiting0()V
.end method

.method private static native start0(Ljava/lang/String;I)I
.end method

.method private static native verifyRoomCode0(Ljava/lang/String;)I
.end method
