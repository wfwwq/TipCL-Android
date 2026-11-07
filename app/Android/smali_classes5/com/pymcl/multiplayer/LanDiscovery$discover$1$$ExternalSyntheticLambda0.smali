.class public final synthetic Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ljava/net/MulticastSocket;

.field public final synthetic f$1:Lkotlinx/coroutines/channels/ProducerScope;


# direct methods
.method public synthetic constructor <init>(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;->f$0:Ljava/net/MulticastSocket;

    iput-object p2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;->f$1:Lkotlinx/coroutines/channels/ProducerScope;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;->f$0:Ljava/net/MulticastSocket;

    iget-object v1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;->f$1:Lkotlinx/coroutines/channels/ProducerScope;

    invoke-static {v0, v1}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->$r8$lambda$LvOE8fxAuToeWVAo9cSrs6mr9kg(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V

    return-void
.end method
