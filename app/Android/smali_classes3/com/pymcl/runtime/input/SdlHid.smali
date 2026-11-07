.class public final Lcom/pymcl/runtime/input/SdlHid;
.super Ljava/lang/Object;
.source "SdlGamepad.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdlGamepad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdlGamepad.kt\ncom/pymcl/runtime/input/SdlHid\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/SdlHid;",
        "",
        "<init>",
        "()V",
        "REQUEST_BLUETOOTH_CONNECT",
        "",
        "manager",
        "Lorg/libsdl/app/HIDDeviceManager;",
        "btRequested",
        "",
        "ensureAcquired",
        "",
        "ctx",
        "Landroid/content/Context;",
        "release",
        "setFrozen",
        "frozen",
        "requestBluetoothIfNeeded",
        "activity",
        "Landroid/app/Activity;",
        "onRequestPermissionsResult",
        "requestCode",
        "grantResults",
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


# static fields
.field public static final INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

.field public static final REQUEST_BLUETOOTH_CONNECT:I = 0x5d1b

.field private static btRequested:Z

.field private static manager:Lorg/libsdl/app/HIDDeviceManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/SdlHid;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/SdlHid;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized ensureAcquired(Landroid/content/Context;)V
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;

    monitor-enter p0

    :try_start_0
    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->manager:Lorg/libsdl/app/HIDDeviceManager;

    if-nez v0, :cond_1

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    goto :goto_1

    .line 79
    :cond_0
    :try_start_1
    invoke-static {p1}, Lorg/libsdl/app/HIDDeviceManager;->acquire(Landroid/content/Context;)Lorg/libsdl/app/HIDDeviceManager;

    move-result-object v0

    move-object v1, v0

    .line 216
    .local v1, "it":Lorg/libsdl/app/HIDDeviceManager;
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-also-SdlHid$ensureAcquired$1":I
    const-string v3, "PyMCL-SDLPad"

    const-string v4, "HIDDeviceManager acquired"

    invoke-static {v3, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v1    # "it":Lorg/libsdl/app/HIDDeviceManager;
    .end local v2    # "$i$a$-also-SdlHid$ensureAcquired$1":I
    goto :goto_0

    .line 80
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    :try_start_2
    const-string v1, "PyMCL-SDLPad"

    const-string v2, "HIDDeviceManager unavailable"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v1, 0x0

    move-object v0, v1

    .line 79
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    sput-object v0, Lcom/pymcl/runtime/input/SdlHid;->manager:Lorg/libsdl/app/HIDDeviceManager;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    monitor-exit p0

    return-void

    .line 78
    .end local p0    # "this":Lcom/pymcl/runtime/input/SdlHid;
    :cond_1
    :goto_1
    monitor-exit p0

    return-void

    .line 77
    .end local p1    # "ctx":Landroid/content/Context;
    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final onRequestPermissionsResult(I[I)V
    .locals 4
    .param p1, "requestCode"    # I
    .param p2, "grantResults"    # [I

    const-string v0, "grantResults"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    array-length v0, p2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    aget v0, p2, v2

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    .line 105
    .local v1, "granted":Z
    :goto_1
    const/16 v0, 0x5d1b

    const-string v2, "PyMCL-SDLPad"

    if-ne p1, v0, :cond_2

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BLUETOOTH_CONNECT granted="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "\uff08BLE Steam \u624b\u67c4\u5728 SDL \u4e0b\u6b21\u521d\u59cb\u5316 HIDAPI \u65f6\u751f\u6548\uff09"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 107
    return-void

    .line 109
    :cond_2
    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v0

    if-nez v0, :cond_3

    return-void

    .line 110
    :cond_3
    :try_start_0
    invoke-static {p1, v1}, Lorg/libsdl/app/SDLActivity;->nativePermissionResult(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v3, "nativePermissionResult"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 111
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_2
    return-void
.end method

.method public final declared-synchronized release()V
    .locals 4

    monitor-enter p0

    .line 85
    :try_start_0
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->manager:Lorg/libsdl/app/HIDDeviceManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    .line 86
    .local v0, "m":Lorg/libsdl/app/HIDDeviceManager;
    :cond_0
    const/4 v1, 0x0

    :try_start_1
    sput-object v1, Lcom/pymcl/runtime/input/SdlHid;->manager:Lorg/libsdl/app/HIDDeviceManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 87
    :try_start_2
    invoke-static {v0}, Lorg/libsdl/app/HIDDeviceManager;->release(Lorg/libsdl/app/HIDDeviceManager;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .local v1, "t":Ljava/lang/Throwable;
    :try_start_3
    const-string v2, "PyMCL-SDLPad"

    const-string v3, "HIDDeviceManager release"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .end local v1    # "t":Ljava/lang/Throwable;
    :goto_0
    monitor-exit p0

    return-void

    .line 84
    .end local v0    # "m":Lorg/libsdl/app/HIDDeviceManager;
    .end local p0    # "this":Lcom/pymcl/runtime/input/SdlHid;
    :catchall_1
    move-exception v0

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method public final requestBluetoothIfNeeded(Landroid/app/Activity;)V
    .locals 3
    .param p1, "activity"    # Landroid/app/Activity;

    const-string v0, "android.permission.BLUETOOTH_CONNECT"

    const-string v1, "activity"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_2

    sget-boolean v1, Lcom/pymcl/runtime/input/SdlHid;->btRequested:Z

    if-eqz v1, :cond_0

    goto :goto_1

    .line 95
    :cond_0
    nop

    .line 96
    :try_start_0
    invoke-virtual {p1, v0}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 97
    :cond_1
    const/4 v1, 0x1

    sput-boolean v1, Lcom/pymcl/runtime/input/SdlHid;->btRequested:Z

    .line 98
    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/16 v0, 0x5d1b

    invoke-virtual {p1, v1, v0}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 99
    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v1, "PyMCL-SDLPad"

    const-string v2, "request BLUETOOTH_CONNECT"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 100
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_0
    return-void

    .line 94
    :cond_2
    :goto_1
    return-void
.end method

.method public final setFrozen(Z)V
    .locals 1
    .param p1, "frozen"    # Z

    .line 90
    :try_start_0
    sget-object v0, Lcom/pymcl/runtime/input/SdlHid;->manager:Lorg/libsdl/app/HIDDeviceManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lorg/libsdl/app/HIDDeviceManager;->setFrozen(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_0
    :goto_0
    return-void
.end method
