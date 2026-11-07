.class public final Lcom/pymcl/multiplayer/TerracottaVpnService;
.super Landroid/net/VpnService;
.source "TerracottaVpnService.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTerracottaVpnService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerracottaVpnService.kt\ncom/pymcl/multiplayer/TerracottaVpnService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0008\u0010\u000e\u001a\u00020\u000fH\u0002J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J\u0008\u0010\u0012\u001a\u00020\u0011H\u0016J\u0008\u0010\u0013\u001a\u00020\u0011H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/TerracottaVpnService;",
        "Landroid/net/VpnService;",
        "<init>",
        "()V",
        "tun",
        "Landroid/os/ParcelFileDescriptor;",
        "text",
        "",
        "onStartCommand",
        "",
        "intent",
        "Landroid/content/Intent;",
        "flags",
        "startId",
        "notif",
        "Landroid/app/Notification;",
        "onRevoke",
        "",
        "onDestroy",
        "cleanup",
        "Companion",
        "PyMCL-Android:multiplayer_debug"
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
.field public static final ACTION_START:Ljava/lang/String; = "com.pymcl.multiplayer.START"

.field public static final ACTION_STOP:Ljava/lang/String; = "com.pymcl.multiplayer.STOP"

.field public static final ACTION_UPDATE:Ljava/lang/String; = "com.pymcl.multiplayer.UPDATE"

.field private static final CHANNEL:Ljava/lang/String; = "terracotta_vpn"

.field public static final Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

.field public static final EXTRA_TEXT:Ljava/lang/String; = "text"

.field private static final NID:I = 0x7e44

.field private static volatile running:Z


# instance fields
.field private text:Ljava/lang/String;

.field private tun:Landroid/os/ParcelFileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/multiplayer/TerracottaVpnService;->Companion:Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/net/VpnService;-><init>()V

    .line 34
    const-string v0, "\u6b63\u5728\u8fde\u63a5\u2026"

    iput-object v0, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->text:Ljava/lang/String;

    .line 18
    return-void
.end method

.method public static final synthetic access$getRunning$cp()Z
    .locals 1

    .line 18
    sget-boolean v0, Lcom/pymcl/multiplayer/TerracottaVpnService;->running:Z

    return v0
.end method

.method private final cleanup()V
    .locals 4

    .line 68
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/multiplayer/TerracottaVpnService;

    .line 73
    .local v0, "$this$cleanup_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaVpnService;
    const/4 v1, 0x0

    .line 68
    .local v1, "$i$a$-runCatching-TerracottaVpnService$cleanup$1":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->setWaiting()V

    .end local v0    # "$this$cleanup_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaVpnService;
    .end local v1    # "$i$a$-runCatching-TerracottaVpnService$cleanup$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :goto_0
    const/4 v0, 0x0

    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/multiplayer/TerracottaVpnService;

    .line 73
    .local v1, "$this$cleanup_u24lambda_u241":Lcom/pymcl/multiplayer/TerracottaVpnService;
    const/4 v2, 0x0

    .line 69
    .local v2, "$i$a$-runCatching-TerracottaVpnService$cleanup$2":I
    iget-object v3, v1, Lcom/pymcl/multiplayer/TerracottaVpnService;->tun:Landroid/os/ParcelFileDescriptor;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/os/ParcelFileDescriptor;->close()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_0
    move-object v3, v0

    .end local v1    # "$this$cleanup_u24lambda_u241":Lcom/pymcl/multiplayer/TerracottaVpnService;
    .end local v2    # "$i$a$-runCatching-TerracottaVpnService$cleanup$2":I
    :goto_1
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    iput-object v0, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->tun:Landroid/os/ParcelFileDescriptor;

    const/4 v0, 0x0

    sput-boolean v0, Lcom/pymcl/multiplayer/TerracottaVpnService;->running:Z

    .line 70
    return-void
.end method

.method private final notif()Landroid/app/Notification;
    .locals 3

    .line 61
    new-instance v0, Landroid/app/Notification$Builder;

    move-object v1, p0

    check-cast v1, Landroid/content/Context;

    const-string v2, "terracotta_vpn"

    invoke-direct {v0, v1, v2}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x1080088

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 62
    const-string v1, "\u9676\u74e6\u8054\u673a"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->text:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 63
    const-string v1, "service"

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public onDestroy()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->cleanup()V

    invoke-super {p0}, Landroid/net/VpnService;->onDestroy()V

    return-void
.end method

.method public onRevoke()V
    .locals 0

    .line 65
    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->cleanup()V

    invoke-virtual {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->stopSelf()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 7
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "flags"    # I
    .param p3, "startId"    # I

    .line 38
    const/4 v0, 0x2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->stopSelf()V

    return v0

    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x7e44

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "com.pymcl.multiplayer.UPDATE"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 41
    :cond_1
    const-string v0, "text"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->text:Ljava/lang/String;

    :cond_2
    iput-object v0, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->text:Ljava/lang/String;

    const-class v0, Landroid/app/NotificationManager;

    invoke-virtual {p0, v0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->notif()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return v3

    .line 39
    :sswitch_1
    const-string v4, "com.pymcl.multiplayer.STOP"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    .line 40
    :cond_3
    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->cleanup()V

    invoke-virtual {p0, v3}, Lcom/pymcl/multiplayer/TerracottaVpnService;->stopForeground(I)V

    invoke-virtual {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->stopSelf()V

    return v0

    .line 43
    :cond_4
    :goto_0
    sput-boolean v3, Lcom/pymcl/multiplayer/TerracottaVpnService;->running:Z

    .line 44
    const-class v1, Landroid/app/NotificationManager;

    invoke-virtual {p0, v1}, Lcom/pymcl/multiplayer/TerracottaVpnService;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/NotificationManager;

    new-instance v4, Landroid/app/NotificationChannel;

    const-string v5, "\u9676\u74e6\u8054\u673a"

    check-cast v5, Ljava/lang/CharSequence;

    const-string v6, "terracotta_vpn"

    invoke-direct {v4, v6, v5, v0}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    invoke-virtual {v1, v4}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_5

    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->notif()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {p0, v2, v0, v1}, Lcom/pymcl/multiplayer/TerracottaVpnService;->startForeground(ILandroid/app/Notification;I)V

    goto :goto_1

    :cond_5
    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->notif()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Lcom/pymcl/multiplayer/TerracottaVpnService;->startForeground(ILandroid/app/Notification;)V

    .line 46
    :goto_1
    nop

    .line 47
    :try_start_0
    new-instance v0, Landroid/net/VpnService$Builder;

    move-object v1, p0

    check-cast v1, Landroid/net/VpnService;

    invoke-direct {v0, v1}, Landroid/net/VpnService$Builder;-><init>(Landroid/net/VpnService;)V

    const-string v1, "Terracotta Connection"

    invoke-virtual {v0, v1}, Landroid/net/VpnService$Builder;->setSession(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object v0

    const-string v1, "setSession(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 48
    .local v0, "b":Landroid/net/VpnService$Builder;
    :try_start_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/multiplayer/TerracottaVpnService;

    .line 73
    .local v1, "$this$onStartCommand_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaVpnService;
    const/4 v2, 0x0

    .line 48
    .local v2, "$i$a$-runCatching-TerracottaVpnService$onStartCommand$1":I
    invoke-virtual {v1}, Lcom/pymcl/multiplayer/TerracottaVpnService;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/net/VpnService$Builder;->addDisallowedApplication(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object v4

    .end local v1    # "$this$onStartCommand_u24lambda_u240":Lcom/pymcl/multiplayer/TerracottaVpnService;
    .end local v2    # "$i$a$-runCatching-TerracottaVpnService$onStartCommand$1":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v1

    :try_start_2
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    :goto_2
    iget-object v1, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->tun:Landroid/os/ParcelFileDescriptor;

    .line 51
    .local v1, "old":Landroid/os/ParcelFileDescriptor;
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getPendingVpnServiceRequest()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    move-result-object v2

    invoke-interface {v2, v0}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;->startVpnService(Landroid/net/VpnService$Builder;)Landroid/os/ParcelFileDescriptor;

    move-result-object v2

    iput-object v2, p0, Lcom/pymcl/multiplayer/TerracottaVpnService;->tun:Landroid/os/ParcelFileDescriptor;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 52
    :try_start_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/multiplayer/TerracottaVpnService;

    .line 73
    .local v2, "$this$onStartCommand_u24lambda_u241":Lcom/pymcl/multiplayer/TerracottaVpnService;
    const/4 v4, 0x0

    .line 52
    .local v4, "$i$a$-runCatching-TerracottaVpnService$onStartCommand$2":I
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->close()V

    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    .end local v2    # "$this$onStartCommand_u24lambda_u241":Lcom/pymcl/multiplayer/TerracottaVpnService;
    .end local v4    # "$i$a$-runCatching-TerracottaVpnService$onStartCommand$2":I
    :goto_3
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v2

    :try_start_4
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v0    # "b":Landroid/net/VpnService$Builder;
    .end local v1    # "old":Landroid/os/ParcelFileDescriptor;
    goto :goto_4

    .line 53
    :catchall_2
    move-exception v0

    .line 54
    .local v0, "t":Ljava/lang/Throwable;
    const-string v1, "PyMCL-MP"

    const-string v2, "VPN establish failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    :try_start_5
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    .line 73
    .local v1, "$this$onStartCommand_u24lambda_u242":Lcom/pymcl/multiplayer/TerracottaVpnService;
    const/4 v2, 0x0

    .line 56
    .local v2, "$i$a$-runCatching-TerracottaVpnService$onStartCommand$3":I
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->getPendingVpnServiceRequest()Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;

    move-result-object v4

    invoke-interface {v4}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;->reject()V

    .end local v1    # "$this$onStartCommand_u24lambda_u242":Lcom/pymcl/multiplayer/TerracottaVpnService;
    .end local v2    # "$i$a$-runCatching-TerracottaVpnService$onStartCommand$3":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_4
    return v3

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3321ebfc -> :sswitch_1
        0x10d5484b -> :sswitch_0
    .end sparse-switch
.end method
