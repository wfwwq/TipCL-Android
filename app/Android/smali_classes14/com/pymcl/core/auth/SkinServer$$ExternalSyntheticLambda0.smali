.class public final synthetic Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/auth/SkinServer;

.field public final synthetic f$1:Ljava/net/Socket;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/core/auth/SkinServer;

    iput-object p2, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;->f$1:Ljava/net/Socket;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/core/auth/SkinServer;

    iget-object v1, p0, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;->f$1:Ljava/net/Socket;

    invoke-static {v0, v1}, Lcom/pymcl/core/auth/SkinServer;->$r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8-g(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V

    return-void
.end method
