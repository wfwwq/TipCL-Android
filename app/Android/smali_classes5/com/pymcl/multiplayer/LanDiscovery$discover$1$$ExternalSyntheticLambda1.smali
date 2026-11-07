.class public final synthetic Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/channels/ProducerScope;

.field public final synthetic f$1:Ljava/lang/Thread;

.field public final synthetic f$2:Ljava/net/MulticastSocket;

.field public final synthetic f$3:Landroid/net/wifi/WifiManager$MulticastLock;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$0:Lkotlinx/coroutines/channels/ProducerScope;

    iput-object p2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$1:Ljava/lang/Thread;

    iput-object p3, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$2:Ljava/net/MulticastSocket;

    iput-object p4, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$3:Landroid/net/wifi/WifiManager$MulticastLock;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$0:Lkotlinx/coroutines/channels/ProducerScope;

    iget-object v1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$1:Ljava/lang/Thread;

    iget-object v2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$2:Ljava/net/MulticastSocket;

    iget-object v3, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;->f$3:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-static {v0, v1, v2, v3}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->$r8$lambda$KiZ35asL9GVaDMfQk7KklR8qhsM(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
