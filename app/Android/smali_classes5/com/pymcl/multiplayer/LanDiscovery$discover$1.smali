.class final Lcom/pymcl/multiplayer/LanDiscovery$discover$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "LanDiscovery.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/multiplayer/LanDiscovery;->discover(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/channels/ProducerScope<",
        "-",
        "Lcom/pymcl/multiplayer/LanWorld;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanDiscovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanDiscovery.kt\ncom/pymcl/multiplayer/LanDiscovery$discover$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n1#2:56\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/channels/ProducerScope;",
        "Lcom/pymcl/multiplayer/LanWorld;"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.multiplayer.LanDiscovery$discover$1"
    f = "LanDiscovery.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x28
    }
    m = "invokeSuspend"
    n = {
        "$this$callbackFlow",
        "wifi",
        "lock",
        "sock",
        "t"
    }
    nl = {
        0x29
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4"
    }
    v = 0x2
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field private synthetic L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I


# direct methods
.method public static synthetic $r8$lambda$KiZ35asL9GVaDMfQk7KklR8qhsM(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->invokeSuspend$lambda$4(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LvOE8fxAuToeWVAo9cSrs6mr9kg(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->invokeSuspend$lambda$2(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/multiplayer/LanDiscovery$discover$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->$context:Landroid/content/Context;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$2(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V
    .locals 8
    .param p0, "$sock"    # Ljava/net/MulticastSocket;
    .param p1, "$$this$callbackFlow"    # Lkotlinx/coroutines/channels/ProducerScope;

    .line 33
    const/16 v0, 0x400

    new-array v0, v0, [B

    .line 34
    .local v0, "buf":[B
    :goto_0
    invoke-virtual {p0}, Ljava/net/MulticastSocket;->isClosed()Z

    move-result v1

    if-nez v1, :cond_2

    .line 35
    :try_start_0
    new-instance v1, Ljava/net/DatagramPacket;

    array-length v2, v0

    invoke-direct {v1, v0, v2}, Ljava/net/DatagramPacket;-><init>([BI)V

    .local v1, "p":Ljava/net/DatagramPacket;
    invoke-virtual {p0, v1}, Ljava/net/MulticastSocket;->receive(Ljava/net/DatagramPacket;)V

    .line 36
    sget-object v2, Lcom/pymcl/multiplayer/LanDiscovery;->INSTANCE:Lcom/pymcl/multiplayer/LanDiscovery;

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object v3

    const-string v4, "getData(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getLength()I

    move-result v4

    sget-object v5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v6, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v7, v4, v5}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v1}, Ljava/net/DatagramPacket;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    :goto_1
    goto :goto_0

    :cond_0
    invoke-virtual {v2, v6, v3}, Lcom/pymcl/multiplayer/LanDiscovery;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/multiplayer/LanWorld;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 56
    .local v2, "it":Lcom/pymcl/multiplayer/LanWorld;
    const/4 v3, 0x0

    .line 36
    .local v3, "$i$a$-let-LanDiscovery$discover$1$t$1$1":I
    invoke-interface {p1, v2}, Lkotlinx/coroutines/channels/ProducerScope;->trySend-JP2dKIU(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .end local v2    # "it":Lcom/pymcl/multiplayer/LanWorld;
    .end local v3    # "$i$a$-let-LanDiscovery$discover$1$t$1$1":I
    invoke-static {v4}, Lkotlinx/coroutines/channels/ChannelResult;->box-impl(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ChannelResult;
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .end local v1    # "p":Ljava/net/DatagramPacket;
    :cond_1
    goto :goto_0

    .line 37
    :catch_0
    move-exception v1

    .local v1, "<unused var>":Ljava/lang/Exception;
    goto :goto_2

    .end local v1    # "<unused var>":Ljava/lang/Exception;
    :catch_1
    move-exception v1

    goto :goto_0

    .line 39
    :cond_2
    :goto_2
    return-void
.end method

.method private static final invokeSuspend$lambda$4(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)Lkotlin/Unit;
    .locals 2
    .param p0, "$$this$callbackFlow"    # Lkotlinx/coroutines/channels/ProducerScope;
    .param p1, "$t"    # Ljava/lang/Thread;
    .param p2, "$sock"    # Ljava/net/MulticastSocket;
    .param p3, "$lock"    # Landroid/net/wifi/WifiManager$MulticastLock;

    .line 40
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 56
    .local v0, "$this$invokeSuspend_u24lambda_u244_u240":Lkotlinx/coroutines/channels/ProducerScope;
    const/4 v1, 0x0

    .line 40
    .local v1, "$i$a$-runCatching-LanDiscovery$discover$1$1$1":I
    invoke-virtual {p2}, Ljava/net/MulticastSocket;->close()V

    .end local v0    # "$this$invokeSuspend_u24lambda_u244_u240":Lkotlinx/coroutines/channels/ProducerScope;
    .end local v1    # "$i$a$-runCatching-LanDiscovery$discover$1$1$1":I
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

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    .line 56
    .local v0, "$this$invokeSuspend_u24lambda_u244_u241":Lkotlinx/coroutines/channels/ProducerScope;
    const/4 v1, 0x0

    .line 40
    .local v1, "$i$a$-runCatching-LanDiscovery$discover$1$1$2":I
    invoke-virtual {p3}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .end local v0    # "$this$invokeSuspend_u24lambda_u244_u241":Lkotlinx/coroutines/channels/ProducerScope;
    .end local v1    # "$i$a$-runCatching-LanDiscovery$discover$1$1$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;

    iget-object v1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->$context:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/channels/ProducerScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/channels/ProducerScope<",
            "-",
            "Lcom/pymcl/multiplayer/LanWorld;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1, "$result"    # Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/channels/ProducerScope;

    .local v0, "$this$callbackFlow":Lkotlinx/coroutines/channels/ProducerScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 27
    iget v2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->label:I

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Thread;

    .local v1, "t":Ljava/lang/Thread;
    iget-object v2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$3:Ljava/lang/Object;

    check-cast v2, Ljava/net/MulticastSocket;

    .local v2, "sock":Ljava/net/MulticastSocket;
    iget-object v3, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$2:Ljava/lang/Object;

    check-cast v3, Landroid/net/wifi/WifiManager$MulticastLock;

    .local v3, "lock":Landroid/net/wifi/WifiManager$MulticastLock;
    iget-object v4, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$1:Ljava/lang/Object;

    check-cast v4, Landroid/net/wifi/WifiManager;

    .local v4, "wifi":Landroid/net/wifi/WifiManager;
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_0

    .end local v1    # "t":Ljava/lang/Thread;
    .end local v2    # "sock":Ljava/net/MulticastSocket;
    .end local v3    # "lock":Landroid/net/wifi/WifiManager$MulticastLock;
    .end local v4    # "wifi":Landroid/net/wifi/WifiManager;
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 28
    iget-object v2, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->$context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "wifi"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.net.wifi.WifiManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, v2

    check-cast v4, Landroid/net/wifi/WifiManager;

    .line 29
    .restart local v4    # "wifi":Landroid/net/wifi/WifiManager;
    const-string v2, "pymcl-lan"

    invoke-virtual {v4, v2}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v2

    move-object v3, v2

    .line 56
    .local v3, "$this$invokeSuspend_u24lambda_u240":Landroid/net/wifi/WifiManager$MulticastLock;
    const/4 v5, 0x0

    .line 29
    .local v5, "$i$a$-apply-LanDiscovery$discover$1$lock$1":I
    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Landroid/net/wifi/WifiManager$MulticastLock;->setReferenceCounted(Z)V

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    .line 30
    .end local v5    # "$i$a$-apply-LanDiscovery$discover$1$lock$1":I
    .local v3, "lock":Landroid/net/wifi/WifiManager$MulticastLock;
    new-instance v2, Ljava/net/MulticastSocket;

    const/16 v5, 0x115d

    invoke-direct {v2, v5}, Ljava/net/MulticastSocket;-><init>(I)V

    move-object v5, v2

    .line 56
    .local v5, "$this$invokeSuspend_u24lambda_u241":Ljava/net/MulticastSocket;
    const/4 v6, 0x0

    .line 30
    .local v6, "$i$a$-apply-LanDiscovery$discover$1$sock$1":I
    const/16 v7, 0x3e8

    invoke-virtual {v5, v7}, Ljava/net/MulticastSocket;->setSoTimeout(I)V

    .line 31
    .end local v5    # "$this$invokeSuspend_u24lambda_u241":Ljava/net/MulticastSocket;
    .end local v6    # "$i$a$-apply-LanDiscovery$discover$1$sock$1":I
    .restart local v2    # "sock":Ljava/net/MulticastSocket;
    const-string v5, "224.0.2.60"

    invoke-static {v5}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/net/MulticastSocket;->joinGroup(Ljava/net/InetAddress;)V

    .line 32
    new-instance v5, Ljava/lang/Thread;

    new-instance v6, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;

    invoke-direct {v6, v2, v0}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda0;-><init>(Ljava/net/MulticastSocket;Lkotlinx/coroutines/channels/ProducerScope;)V

    invoke-direct {v5, v6}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 39
    move-object v6, v5

    .line 56
    .local v6, "$this$invokeSuspend_u24lambda_u243":Ljava/lang/Thread;
    const/4 v7, 0x0

    .line 39
    .local v7, "$i$a$-apply-LanDiscovery$discover$1$t$2":I
    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 32
    .end local v6    # "$this$invokeSuspend_u24lambda_u243":Ljava/lang/Thread;
    .end local v7    # "$i$a$-apply-LanDiscovery$discover$1$t$2":I
    nop

    .line 40
    .local v5, "t":Ljava/lang/Thread;
    new-instance v6, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;

    invoke-direct {v6, v0, v5, v2, v3}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1$$ExternalSyntheticLambda1;-><init>(Lkotlinx/coroutines/channels/ProducerScope;Ljava/lang/Thread;Ljava/net/MulticastSocket;Landroid/net/wifi/WifiManager$MulticastLock;)V

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$0:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$2:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$3:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->L$4:Ljava/lang/Object;

    iput v8, p0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;->label:I

    invoke-static {v0, v6, v7}, Lkotlinx/coroutines/channels/ProduceKt;->awaitClose(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_0

    .line 27
    return-object v1

    .line 40
    :cond_0
    move-object v1, v5

    .line 41
    .end local v5    # "t":Ljava/lang/Thread;
    .restart local v1    # "t":Ljava/lang/Thread;
    :goto_0
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v5

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
