.class public final synthetic Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Ljava/net/ServerSocket;

.field public final synthetic f$1:Ljava/util/concurrent/ExecutorService;

.field public final synthetic f$2:Lcom/pymcl/core/auth/SkinServer;


# direct methods
.method public synthetic constructor <init>(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$0:Ljava/net/ServerSocket;

    iput-object p2, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$1:Ljava/util/concurrent/ExecutorService;

    iput-object p3, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$2:Lcom/pymcl/core/auth/SkinServer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$0:Ljava/net/ServerSocket;

    iget-object v1, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$1:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;->f$2:Lcom/pymcl/core/auth/SkinServer;

    invoke-static {v0, v1, v2}, Lcom/pymcl/core/auth/SkinServer;->$r8$lambda$fuRb-r_7jsk84jS_DOtBWiAb3ok(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V

    return-void
.end method
