.class public final Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;
.super Ljava/lang/Object;
.source "TerracottaVpnService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/multiplayer/TerracottaVpnService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;",
        "",
        "<init>",
        "()V",
        "CHANNEL",
        "",
        "NID",
        "",
        "ACTION_START",
        "ACTION_STOP",
        "ACTION_UPDATE",
        "EXTRA_TEXT",
        "value",
        "",
        "running",
        "getRunning",
        "()Z",
        "start",
        "Landroid/content/ComponentName;",
        "c",
        "Landroid/content/Context;",
        "stop",
        "",
        "updateText",
        "s",
        "Lcom/pymcl/multiplayer/MultiplayerState;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getRunning()Z
    .locals 1

    .line 23
    invoke-static {}, Lcom/pymcl/multiplayer/TerracottaVpnService;->access$getRunning$cp()Z

    move-result v0

    return v0
.end method

.method public final start(Landroid/content/Context;)Landroid/content/ComponentName;
    .locals 2
    .param p1, "c"    # Landroid/content/Context;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pymcl/multiplayer/TerracottaVpnService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.pymcl.multiplayer.START"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move-result-object v0

    return-object v0
.end method

.method public final stop(Landroid/content/Context;)V
    .locals 2
    .param p1, "c"    # Landroid/content/Context;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-virtual {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/pymcl/multiplayer/TerracottaVpnService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "com.pymcl.multiplayer.STOP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_0
    return-void
.end method

.method public final updateText(Landroid/content/Context;Lcom/pymcl/multiplayer/MultiplayerState;)V
    .locals 3
    .param p1, "c"    # Landroid/content/Context;
    .param p2, "s"    # Lcom/pymcl/multiplayer/MultiplayerState;

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "s"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    invoke-virtual {p0}, Lcom/pymcl/multiplayer/TerracottaVpnService$Companion;->getRunning()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 28
    :cond_0
    instance-of v0, p2, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;->getRoom()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u542f\u52a8\u623f\u95f4 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    if-eqz v0, :cond_2

    const-string v0, "\u5df2\u52a0\u5165\u623f\u95f4"

    goto :goto_0

    .line 29
    :cond_2
    instance-of v0, p2, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    if-eqz v0, :cond_3

    move-object v0, p2

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Error;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    .line 28
    :goto_0
    nop

    .line 30
    .local v0, "t":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/pymcl/multiplayer/TerracottaVpnService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "com.pymcl.multiplayer.UPDATE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const-string v2, "text"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 31
    return-void
.end method
