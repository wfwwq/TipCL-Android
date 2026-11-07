.class Lorg/libsdl/app/SDLSensorManager;
.super Ljava/lang/Object;
.source "SDLSensorManager.java"


# static fields
.field static final RETRY_COUNT:I = 0x3

.field private static mManager:Lorg/libsdl/app/SDLSensorManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    new-instance v0, Lorg/libsdl/app/SDLSensorManager;

    invoke-direct {v0}, Lorg/libsdl/app/SDLSensorManager;-><init>()V

    sput-object v0, Lorg/libsdl/app/SDLSensorManager;->mManager:Lorg/libsdl/app/SDLSensorManager;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private declared-synchronized RegisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V
    .locals 5
    .param p1, "manager"    # Landroid/hardware/SensorManager;
    .param p2, "listener"    # Landroid/hardware/SensorEventListener;
    .param p3, "sensor"    # Landroid/hardware/Sensor;
    .param p4, "samplingPeriodUs"    # I

    monitor-enter p0

    .line 33
    const/4 v0, 0x0

    .line 34
    .local v0, "retries":I
    const/4 v1, 0x0

    .line 35
    .local v1, "complete":Z
    :goto_0
    if-nez v1, :cond_1

    .line 37
    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p1, p2, p3, p4, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;ILandroid/os/Handler;)Z
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    const/4 v1, 0x1

    .line 51
    goto :goto_0

    .line 32
    .end local v0    # "retries":I
    .end local v1    # "complete":Z
    .end local p0    # "this":Lorg/libsdl/app/SDLSensorManager;
    .end local p1    # "manager":Landroid/hardware/SensorManager;
    .end local p2    # "listener":Landroid/hardware/SensorEventListener;
    .end local p3    # "sensor":Landroid/hardware/Sensor;
    .end local p4    # "samplingPeriodUs":I
    :catchall_0
    move-exception p1

    goto :goto_3

    .line 39
    .restart local v0    # "retries":I
    .restart local v1    # "complete":Z
    .restart local p1    # "manager":Landroid/hardware/SensorManager;
    .restart local p2    # "listener":Landroid/hardware/SensorEventListener;
    .restart local p3    # "sensor":Landroid/hardware/Sensor;
    .restart local p4    # "samplingPeriodUs":I
    :catch_0
    move-exception v2

    .line 40
    .local v2, "e":Ljava/util/ConcurrentModificationException;
    add-int/lit8 v0, v0, 0x1

    .line 41
    const/4 v3, 0x3

    if-gt v0, v3, :cond_0

    .line 44
    const-wide/16 v3, 0x1

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    :goto_1
    goto :goto_2

    .line 45
    :catch_1
    move-exception v3

    goto :goto_1

    .line 48
    :cond_0
    :try_start_2
    const-string v3, "SDL"

    const-string v4, "Multiple ConcurrentModificationException caught while registering sensor listener, canceling operation"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    const/4 v1, 0x1

    .line 51
    .end local v2    # "e":Ljava/util/ConcurrentModificationException;
    :goto_2
    goto :goto_0

    .line 32
    .end local v0    # "retries":I
    .end local v1    # "complete":Z
    .end local p1    # "manager":Landroid/hardware/SensorManager;
    .end local p2    # "listener":Landroid/hardware/SensorEventListener;
    .end local p3    # "sensor":Landroid/hardware/Sensor;
    .end local p4    # "samplingPeriodUs":I
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 53
    .restart local v0    # "retries":I
    .restart local v1    # "complete":Z
    .restart local p1    # "manager":Landroid/hardware/SensorManager;
    .restart local p2    # "listener":Landroid/hardware/SensorEventListener;
    .restart local p3    # "sensor":Landroid/hardware/Sensor;
    .restart local p4    # "samplingPeriodUs":I
    :cond_1
    monitor-exit p0

    return-void
.end method

.method private declared-synchronized UnregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    .locals 5
    .param p1, "manager"    # Landroid/hardware/SensorManager;
    .param p2, "listener"    # Landroid/hardware/SensorEventListener;
    .param p3, "sensor"    # Landroid/hardware/Sensor;

    monitor-enter p0

    .line 56
    const/4 v0, 0x0

    .line 57
    .local v0, "retries":I
    const/4 v1, 0x0

    .line 58
    .local v1, "complete":Z
    :goto_0
    if-nez v1, :cond_1

    .line 60
    :try_start_0
    invoke-virtual {p1, p2, p3}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    :try_end_0
    .catch Ljava/util/ConcurrentModificationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    const/4 v1, 0x1

    .line 74
    goto :goto_0

    .line 55
    .end local v0    # "retries":I
    .end local v1    # "complete":Z
    .end local p0    # "this":Lorg/libsdl/app/SDLSensorManager;
    .end local p1    # "manager":Landroid/hardware/SensorManager;
    .end local p2    # "listener":Landroid/hardware/SensorEventListener;
    .end local p3    # "sensor":Landroid/hardware/Sensor;
    :catchall_0
    move-exception p1

    goto :goto_3

    .line 62
    .restart local v0    # "retries":I
    .restart local v1    # "complete":Z
    .restart local p1    # "manager":Landroid/hardware/SensorManager;
    .restart local p2    # "listener":Landroid/hardware/SensorEventListener;
    .restart local p3    # "sensor":Landroid/hardware/Sensor;
    :catch_0
    move-exception v2

    .line 63
    .local v2, "e":Ljava/util/ConcurrentModificationException;
    add-int/lit8 v0, v0, 0x1

    .line 64
    const/4 v3, 0x3

    if-gt v0, v3, :cond_0

    .line 67
    const-wide/16 v3, 0x1

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :goto_1
    goto :goto_2

    .line 68
    :catch_1
    move-exception v3

    goto :goto_1

    .line 71
    :cond_0
    :try_start_2
    const-string v3, "SDL"

    const-string v4, "Multiple ConcurrentModificationException caught while unregistering sensor listener, canceling operation"

    invoke-static {v3, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    const/4 v1, 0x1

    .line 74
    .end local v2    # "e":Ljava/util/ConcurrentModificationException;
    :goto_2
    goto :goto_0

    .line 55
    .end local v0    # "retries":I
    .end local v1    # "complete":Z
    .end local p1    # "manager":Landroid/hardware/SensorManager;
    .end local p2    # "listener":Landroid/hardware/SensorEventListener;
    .end local p3    # "sensor":Landroid/hardware/Sensor;
    :goto_3
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    .line 76
    .restart local v0    # "retries":I
    .restart local v1    # "complete":Z
    .restart local p1    # "manager":Landroid/hardware/SensorManager;
    .restart local p2    # "listener":Landroid/hardware/SensorEventListener;
    .restart local p3    # "sensor":Landroid/hardware/Sensor;
    :cond_1
    monitor-exit p0

    return-void
.end method

.method public static registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V
    .locals 1
    .param p0, "manager"    # Landroid/hardware/SensorManager;
    .param p1, "listener"    # Landroid/hardware/SensorEventListener;
    .param p2, "sensor"    # Landroid/hardware/Sensor;
    .param p3, "samplingPeriodUs"    # I

    .line 25
    sget-object v0, Lorg/libsdl/app/SDLSensorManager;->mManager:Lorg/libsdl/app/SDLSensorManager;

    invoke-direct {v0, p0, p1, p2, p3}, Lorg/libsdl/app/SDLSensorManager;->RegisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)V

    .line 26
    return-void
.end method

.method public static unregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
    .locals 1
    .param p0, "manager"    # Landroid/hardware/SensorManager;
    .param p1, "listener"    # Landroid/hardware/SensorEventListener;
    .param p2, "sensor"    # Landroid/hardware/Sensor;

    .line 29
    sget-object v0, Lorg/libsdl/app/SDLSensorManager;->mManager:Lorg/libsdl/app/SDLSensorManager;

    invoke-direct {v0, p0, p1, p2}, Lorg/libsdl/app/SDLSensorManager;->UnregisterListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V

    .line 30
    return-void
.end method
