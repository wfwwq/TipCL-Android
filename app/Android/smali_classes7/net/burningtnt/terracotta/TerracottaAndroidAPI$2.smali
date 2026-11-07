.class Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;
.super Ljava/lang/Object;
.source "TerracottaAndroidAPI.java"

# interfaces
.implements Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceRequest;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/burningtnt/terracotta/TerracottaAndroidAPI;->onVpnServiceStateChanged(BBBBSLjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$address:Ljava/net/InetAddress;

.field final synthetic val$cidr:Ljava/lang/String;

.field final synthetic val$fd:Ljava/util/concurrent/atomic/AtomicLong;

.field final synthetic val$network_length:S


# direct methods
.method constructor <init>(Ljava/net/InetAddress;SLjava/lang/String;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 399
    iput-object p1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$address:Ljava/net/InetAddress;

    iput-short p2, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$network_length:S

    iput-object p3, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$cidr:Ljava/lang/String;

    iput-object p4, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$fd:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public reject()V
    .locals 3

    .line 427
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$fd:Ljava/util/concurrent/atomic/AtomicLong;

    const-wide v1, 0x80000001L

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 428
    return-void
.end method

.method public startVpnService(Landroid/net/VpnService$Builder;)Landroid/os/ParcelFileDescriptor;
    .locals 8
    .param p1, "builder"    # Landroid/net/VpnService$Builder;

    .line 402
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$address:Ljava/net/InetAddress;

    iget-short v1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$network_length:S

    invoke-virtual {p1, v0, v1}, Landroid/net/VpnService$Builder;->addAddress(Ljava/net/InetAddress;I)Landroid/net/VpnService$Builder;

    move-result-object v0

    .line 403
    const-string v1, "223.5.5.5"

    invoke-virtual {v0, v1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    move-result-object v0

    .line 404
    const-string v1, "114.114.114.114"

    invoke-virtual {v0, v1}, Landroid/net/VpnService$Builder;->addDnsServer(Ljava/lang/String;)Landroid/net/VpnService$Builder;

    .line 406
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$cidr:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 407
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$cidr:Ljava/lang/String;

    const-string v1, "\u0000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 408
    .local v4, "part":Ljava/lang/String;
    const-string v5, "/"

    const/4 v6, 0x3

    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v5

    .line 409
    .local v5, "parts":[Ljava/lang/String;
    array-length v6, v5

    const/4 v7, 0x2

    if-ne v6, v7, :cond_0

    .line 412
    aget-object v6, v5, v2

    const/4 v7, 0x1

    aget-object v7, v5, v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {p1, v6, v7}, Landroid/net/VpnService$Builder;->addRoute(Ljava/lang/String;I)Landroid/net/VpnService$Builder;

    .line 407
    .end local v4    # "part":Ljava/lang/String;
    .end local v5    # "parts":[Ljava/lang/String;
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 410
    .restart local v4    # "part":Ljava/lang/String;
    .restart local v5    # "parts":[Ljava/lang/String;
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Illegal CIDR: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v5}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 416
    .end local v4    # "part":Ljava/lang/String;
    .end local v5    # "parts":[Ljava/lang/String;
    :cond_1
    invoke-virtual {p1}, Landroid/net/VpnService$Builder;->establish()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    .line 417
    .local v0, "connection":Landroid/os/ParcelFileDescriptor;
    if-eqz v0, :cond_2

    .line 421
    iget-object v1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$2;->val$fd:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFd()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 422
    return-object v0

    .line 418
    :cond_2
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Cannot establish a VPN connection."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
