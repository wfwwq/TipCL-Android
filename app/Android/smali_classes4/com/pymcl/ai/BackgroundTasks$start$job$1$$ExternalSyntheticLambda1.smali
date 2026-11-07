.class public final synthetic Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/ToolOutput;

.field public final synthetic f$1:Z


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/ToolOutput;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/ToolOutput;

    iput-boolean p2, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;->f$1:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/ToolOutput;

    iget-boolean v1, p0, Lcom/pymcl/ai/BackgroundTasks$start$job$1$$ExternalSyntheticLambda1;->f$1:Z

    check-cast p1, Lcom/pymcl/ai/BgTaskInfo;

    invoke-static {v0, v1, p1}, Lcom/pymcl/ai/BackgroundTasks$start$job$1;->$r8$lambda$eqazYCB2mo8qqGsuBCyQIhL_1I0(Lcom/pymcl/ai/ToolOutput;ZLcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p1

    return-object p1
.end method
