.class public final synthetic Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda4;->f$0:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/BackgroundTasks$$ExternalSyntheticLambda4;->f$0:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lcom/pymcl/ai/BgTaskInfo;

    invoke-static {v0, p1, p2}, Lcom/pymcl/ai/BackgroundTasks;->$r8$lambda$hhUru8YFD9r4gT9cww8PKgU30hs(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/ai/BgTaskInfo;

    move-result-object p1

    return-object p1
.end method
