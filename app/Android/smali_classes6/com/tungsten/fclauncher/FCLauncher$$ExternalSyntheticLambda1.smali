.class public final synthetic Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic f$0:Lcom/tungsten/fclauncher/bridge/FCLBridge;

.field public final synthetic f$1:Lcom/tungsten/fclauncher/FCLConfig;


# direct methods
.method public synthetic constructor <init>(Lcom/tungsten/fclauncher/bridge/FCLBridge;Lcom/tungsten/fclauncher/FCLConfig;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    iput-object p2, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;->f$1:Lcom/tungsten/fclauncher/FCLConfig;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;->f$0:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    iget-object v1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda1;->f$1:Lcom/tungsten/fclauncher/FCLConfig;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/tungsten/fclauncher/FCLauncher;->lambda$setupGraphicAndSoundEngine$1(Lcom/tungsten/fclauncher/bridge/FCLBridge;Lcom/tungsten/fclauncher/FCLConfig;Ljava/lang/String;)V

    return-void
.end method
