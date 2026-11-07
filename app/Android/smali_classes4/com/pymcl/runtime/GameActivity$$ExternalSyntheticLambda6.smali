.class public final synthetic Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/GameActivity;

.field public final synthetic f$1:Lcom/pymcl/runtime/input/Keys$Action;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/runtime/GameActivity;

    iput-object p2, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;->f$1:Lcom/pymcl/runtime/input/Keys$Action;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/runtime/GameActivity;

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda6;->f$1:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-static {v0, v1}, Lcom/pymcl/runtime/GameActivity;->$r8$lambda$FuKRiUm4vyDDIXOZ1b4Qbqp2SoA(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/Keys$Action;)V

    return-void
.end method
