.class public final Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;
.super Ljava/lang/Object;
.source "TouchControllerBridge.kt"

# interfaces
.implements Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/keyboard/TouchControllerBridge;-><init>(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTouchControllerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchControllerBridge.kt\ncom/pymcl/runtime/keyboard/TouchControllerBridge$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/pymcl/runtime/keyboard/TouchControllerBridge$1",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;",
        "vibrate",
        "",
        "kind",
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
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
.field final synthetic $vib:Landroid/os/Vibrator;


# direct methods
.method constructor <init>(Landroid/os/Vibrator;)V
    .locals 0
    .param p1, "$vib"    # Landroid/os/Vibrator;

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;->$vib:Landroid/os/Vibrator;

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public vibrate(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V
    .locals 6
    .param p1, "kind"    # Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;->$vib:Landroid/os/Vibrator;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;

    .line 77
    .local v1, "$this$vibrate_u24lambda_u240":Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;
    const/4 v2, 0x0

    .line 51
    .local v2, "$i$a$-runCatching-TouchControllerBridge$1$vibrate$1":I
    if-eqz v0, :cond_0

    const-wide/16 v3, 0x64

    const/4 v5, -0x1

    invoke-static {v3, v4, v5}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .end local v1    # "$this$vibrate_u24lambda_u240":Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;
    .end local v2    # "$i$a$-runCatching-TouchControllerBridge$1$vibrate$1":I
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method
