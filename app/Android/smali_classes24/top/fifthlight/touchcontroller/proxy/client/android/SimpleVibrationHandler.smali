.class public final Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandler;
.super Ljava/lang/Object;
.source "SimpleVibrationHandler.kt"

# interfaces
.implements Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandler;",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;",
        "service",
        "Landroid/os/Vibrator;",
        "<init>",
        "(Landroid/os/Vibrator;)V",
        "vibrate",
        "",
        "kind",
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
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
.field private final service:Landroid/os/Vibrator;


# direct methods
.method public constructor <init>(Landroid/os/Vibrator;)V
    .locals 1
    .param p1, "service"    # Landroid/os/Vibrator;

    const-string/jumbo v0, "service"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandler;->service:Landroid/os/Vibrator;

    return-void
.end method


# virtual methods
.method public vibrate(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V
    .locals 4
    .param p1, "kind"    # Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    nop

    .line 19
    :try_start_0
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandler;->service:Landroid/os/Vibrator;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 20
    :catch_0
    move-exception v0

    .line 21
    .local v0, "ex":Ljava/lang/Exception;
    invoke-static {}, Ltop/fifthlight/touchcontroller/proxy/client/android/SimpleVibrationHandlerKt;->access$getTAG$p()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Failed to trigger vibration"

    move-object v3, v0

    check-cast v3, Ljava/lang/Throwable;

    invoke-static {v1, v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 23
    .end local v0    # "ex":Ljava/lang/Exception;
    :goto_0
    return-void
.end method
