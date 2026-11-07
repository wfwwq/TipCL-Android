.class public final Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;
.super Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
.source "LauncherProxyMessageClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Message"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;",
        "message",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V",
        "getMessage",
        "()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;


# direct methods
.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V
    .locals 1
    .param p1, "message"    # Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-void
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;ILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    :cond_0
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->copy(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method

.method public final copy(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    invoke-direct {v0, p1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    iget-object v1, v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMessage()Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1

    .line 21
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Message(message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyMessageClient$MessageItem$Message;->message:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
