.class public final synthetic Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/BackgroundTasks;

.field public final synthetic f$1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/ai/BackgroundTasks;

    iput-object p2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/ai/BackgroundTasks;

    iget-object v1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda0;->f$1:Ljava/lang/String;

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$r8$lambda$eix_qB2VY_Z14zJUY3dWfPjvrwU(Lcom/pymcl/ai/BackgroundTasks;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
