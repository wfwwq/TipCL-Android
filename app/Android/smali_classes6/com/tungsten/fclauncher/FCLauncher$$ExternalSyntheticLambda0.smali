.class public final synthetic Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/tungsten/fclauncher/FCLConfig;

.field public final synthetic f$1:Lcom/tungsten/fclauncher/bridge/FCLBridge;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z


# direct methods
.method public synthetic constructor <init>(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;ZZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/tungsten/fclauncher/FCLConfig;

    iput-object p2, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$1:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    iput-object p3, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$3:Z

    iput-boolean p5, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$4:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/tungsten/fclauncher/FCLConfig;

    iget-object v1, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$1:Lcom/tungsten/fclauncher/bridge/FCLBridge;

    iget-object v2, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$3:Z

    iget-boolean v4, p0, Lcom/tungsten/fclauncher/FCLauncher$$ExternalSyntheticLambda0;->f$4:Z

    invoke-static {v0, v1, v2, v3, v4}, Lcom/tungsten/fclauncher/FCLauncher;->lambda$launchProcess$2(Lcom/tungsten/fclauncher/FCLConfig;Lcom/tungsten/fclauncher/bridge/FCLBridge;Ljava/lang/String;ZZ)V

    return-void
.end method
