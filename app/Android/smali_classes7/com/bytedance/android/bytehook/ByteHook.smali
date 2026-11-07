.class public final Lcom/bytedance/android/bytehook/ByteHook;
.super Ljava/lang/Object;
.source "ByteHook.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bytedance/android/bytehook/ByteHook$Config;,
        Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;,
        Lcom/bytedance/android/bytehook/ByteHook$Mode;,
        Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    }
.end annotation


# static fields
.field public static final ERRNO_INIT_EXCEPTION:I = 0x65

.field public static final ERRNO_LOAD_LIBRARY_EXCEPTION:I = 0x64

.field public static final ERRNO_OK:I = 0x0

.field public static final ERRNO_UNINIT:I = 0x1

.field private static final RECORD_ITEM_ALL:I = 0xff

.field private static final RECORD_ITEM_CALLER_LIB_NAME:I = 0x2

.field private static final RECORD_ITEM_ERRNO:I = 0x40

.field private static final RECORD_ITEM_LIB_NAME:I = 0x8

.field private static final RECORD_ITEM_NEW_ADDR:I = 0x20

.field private static final RECORD_ITEM_OP:I = 0x4

.field private static final RECORD_ITEM_STUB:I = 0x80

.field private static final RECORD_ITEM_SYM_NAME:I = 0x10

.field private static final RECORD_ITEM_TIMESTAMP:I = 0x1

.field private static final defaultDebug:Z = false

.field private static final defaultLibLoader:Lcom/bytedance/android/bytehook/ILibLoader;

.field private static final defaultMode:I = 0x0

.field private static final defaultRecordable:Z = false

.field private static initCostMs:J = 0x0L

.field private static initStatus:I = 0x0

.field private static inited:Z = false

.field private static final libName:Ljava/lang/String; = "bytehook"


# direct methods
.method static bridge synthetic -$$Nest$sfgetdefaultLibLoader()Lcom/bytedance/android/bytehook/ILibLoader;
    .locals 1

    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook;->defaultLibLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 2

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook;->defaultLibLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    .line 33
    const/4 v0, 0x0

    sput-boolean v0, Lcom/bytedance/android/bytehook/ByteHook;->inited:Z

    .line 34
    const/4 v0, 0x1

    sput v0, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I

    .line 35
    const-wide/16 v0, -0x1

    sput-wide v0, Lcom/bytedance/android/bytehook/ByteHook;->initCostMs:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addIgnore(Ljava/lang/String;)I
    .locals 1
    .param p0, "callerLibName"    # Ljava/lang/String;

    .line 79
    invoke-static {p0}, Lcom/bytedance/android/bytehook/ByteHook;->nativeAddIgnore(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static getArch()Ljava/lang/String;
    .locals 2

    .line 104
    :try_start_0
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetArch()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    .local v0, "e":Ljava/lang/Throwable;
    const-string v1, ""

    return-object v1
.end method

.method public static getDebug()Z
    .locals 1

    .line 87
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetDebug()Z

    move-result v0

    return v0
.end method

.method public static getInitCostMs()J
    .locals 2

    .line 144
    sget-wide v0, Lcom/bytedance/android/bytehook/ByteHook;->initCostMs:J

    return-wide v0
.end method

.method public static getInitErrno()I
    .locals 1

    .line 140
    sget v0, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I

    return v0
.end method

.method public static getMode()Lcom/bytedance/android/bytehook/ByteHook$Mode;
    .locals 2

    .line 99
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook$Mode;->values()[Lcom/bytedance/android/bytehook/ByteHook$Mode;

    move-result-object v0

    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetMode()I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method public static getRecordable()Z
    .locals 1

    .line 95
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetRecordable()Z

    move-result v0

    return v0
.end method

.method public static getRecords([Lcom/bytedance/android/bytehook/ByteHook$RecordItem;)Ljava/lang/String;
    .locals 6
    .param p0, "items"    # [Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 119
    if-nez p0, :cond_0

    .line 120
    const/4 v0, 0x0

    return-object v0

    .line 122
    :cond_0
    const/4 v0, 0x0

    .line 123
    .local v0, "flags":I
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    .line 124
    .local v3, "item":Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    sget-object v4, Lcom/bytedance/android/bytehook/ByteHook$1;->$SwitchMap$com$bytedance$android$bytehook$ByteHook$RecordItem:[I

    invoke-virtual {v3}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->ordinal()I

    move-result v5

    aget v4, v4, v5

    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 132
    :pswitch_0
    or-int/lit16 v0, v0, 0x80

    goto :goto_1

    .line 131
    :pswitch_1
    or-int/lit8 v0, v0, 0x40

    goto :goto_1

    .line 130
    :pswitch_2
    or-int/lit8 v0, v0, 0x20

    goto :goto_1

    .line 129
    :pswitch_3
    or-int/lit8 v0, v0, 0x10

    goto :goto_1

    .line 128
    :pswitch_4
    or-int/lit8 v0, v0, 0x8

    goto :goto_1

    .line 127
    :pswitch_5
    or-int/lit8 v0, v0, 0x4

    goto :goto_1

    .line 126
    :pswitch_6
    or-int/lit8 v0, v0, 0x2

    goto :goto_1

    .line 125
    :pswitch_7
    or-int/lit8 v0, v0, 0x1

    .line 123
    .end local v3    # "item":Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 136
    :cond_1
    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetRecords(I)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static getVersion()Ljava/lang/String;
    .locals 2

    .line 112
    :try_start_0
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->nativeGetVersion()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    .local v0, "e":Ljava/lang/Throwable;
    const-string v1, ""

    return-object v1
.end method

.method public static init()I
    .locals 1

    .line 40
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook;->init(Lcom/bytedance/android/bytehook/ByteHook$Config;)I

    move-result v0

    return v0
.end method

.method public static declared-synchronized init(Lcom/bytedance/android/bytehook/ByteHook$Config;)I
    .locals 8
    .param p0, "config"    # Lcom/bytedance/android/bytehook/ByteHook$Config;

    const-class v0, Lcom/bytedance/android/bytehook/ByteHook;

    monitor-enter v0

    .line 44
    :try_start_0
    sget-boolean v1, Lcom/bytedance/android/bytehook/ByteHook;->inited:Z

    if-eqz v1, :cond_0

    .line 45
    sget v1, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    monitor-exit v0

    return v1

    .line 47
    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lcom/bytedance/android/bytehook/ByteHook;->inited:Z

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 50
    .local v2, "ts":J
    if-nez p0, :cond_1

    .line 51
    :try_start_2
    new-instance v4, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-direct {v4}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->build()Lcom/bytedance/android/bytehook/ByteHook$Config;

    move-result-object v4

    move-object p0, v4

    .line 53
    :cond_1
    invoke-interface {p0}, Lcom/bytedance/android/bytehook/ByteHook$Config;->getLibLoader()Lcom/bytedance/android/bytehook/ILibLoader;

    move-result-object v4

    .line 54
    .local v4, "loader":Lcom/bytedance/android/bytehook/ILibLoader;
    if-nez v4, :cond_2

    .line 55
    const-string v5, "bytehook"

    invoke-static {v5}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    goto :goto_0

    .line 57
    :cond_2
    const-string v5, "bytehook"

    invoke-interface {v4, v5}, Lcom/bytedance/android/bytehook/ILibLoader;->loadLibrary(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 60
    :goto_0
    const/16 v5, 0x65

    :try_start_3
    invoke-interface {p0}, Lcom/bytedance/android/bytehook/ByteHook$Config;->getMode()I

    move-result v6

    invoke-interface {p0}, Lcom/bytedance/android/bytehook/ByteHook$Config;->getDebug()Z

    move-result v7

    invoke-static {v6, v7}, Lcom/bytedance/android/bytehook/ByteHook;->nativeInit(IZ)I

    move-result v6

    sput v6, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 63
    goto :goto_1

    .line 61
    :catchall_0
    move-exception v6

    .line 62
    .local v6, "e":Ljava/lang/Throwable;
    :try_start_4
    sput v5, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 65
    .end local v6    # "e":Ljava/lang/Throwable;
    :goto_1
    :try_start_5
    invoke-interface {p0}, Lcom/bytedance/android/bytehook/ByteHook$Config;->getRecordable()Z

    move-result v6

    if-eqz v6, :cond_3

    .line 66
    invoke-static {v1}, Lcom/bytedance/android/bytehook/ByteHook;->nativeSetRecordable(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 70
    :cond_3
    goto :goto_2

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    .local v1, "e":Ljava/lang/Throwable;
    :try_start_6
    sput v5, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 73
    .end local v1    # "e":Ljava/lang/Throwable;
    .end local v4    # "loader":Lcom/bytedance/android/bytehook/ILibLoader;
    :goto_2
    goto :goto_3

    .line 71
    :catchall_2
    move-exception v1

    .line 72
    .local v1, "t":Ljava/lang/Throwable;
    const/16 v4, 0x64

    :try_start_7
    sput v4, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I

    .line 74
    .end local v1    # "t":Ljava/lang/Throwable;
    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sub-long/2addr v4, v2

    sput-wide v4, Lcom/bytedance/android/bytehook/ByteHook;->initCostMs:J

    .line 75
    sget v1, Lcom/bytedance/android/bytehook/ByteHook;->initStatus:I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    monitor-exit v0

    return v1

    .line 43
    .end local v2    # "ts":J
    .end local p0    # "config":Lcom/bytedance/android/bytehook/ByteHook$Config;
    :catchall_3
    move-exception p0

    :try_start_8
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    throw p0
.end method

.method private static native nativeAddIgnore(Ljava/lang/String;)I
.end method

.method private static native nativeGetArch()Ljava/lang/String;
.end method

.method private static native nativeGetDebug()Z
.end method

.method private static native nativeGetMode()I
.end method

.method private static native nativeGetRecordable()Z
.end method

.method private static native nativeGetRecords(I)Ljava/lang/String;
.end method

.method private static native nativeGetVersion()Ljava/lang/String;
.end method

.method private static native nativeInit(IZ)I
.end method

.method private static native nativeSetDebug(Z)V
.end method

.method private static native nativeSetRecordable(Z)V
.end method

.method public static setDebug(Z)V
    .locals 0
    .param p0, "debug"    # Z

    .line 83
    invoke-static {p0}, Lcom/bytedance/android/bytehook/ByteHook;->nativeSetDebug(Z)V

    .line 84
    return-void
.end method

.method public static setRecordable(Z)V
    .locals 0
    .param p0, "recordable"    # Z

    .line 91
    invoke-static {p0}, Lcom/bytedance/android/bytehook/ByteHook;->nativeSetRecordable(Z)V

    .line 92
    return-void
.end method
