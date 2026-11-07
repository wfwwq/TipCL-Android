.class public final synthetic Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic f$0:Ljava/util/HashMap;

.field public final synthetic f$1:Lcom/mio/data/Renderer;


# direct methods
.method public synthetic constructor <init>(Ljava/util/HashMap;Lcom/mio/data/Renderer;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;->f$0:Ljava/util/HashMap;

    iput-object p2, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;->f$1:Lcom/mio/data/Renderer;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;->f$0:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda2;->f$1:Lcom/mio/data/Renderer;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/tungsten/fclauncher/FCLauncher;->lambda$addRendererEnvInner$0(Ljava/util/HashMap;Lcom/mio/data/Renderer;Ljava/lang/String;)V

    return-void
.end method
