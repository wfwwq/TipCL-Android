.class public final synthetic Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/StreamAccumulator;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/StreamAccumulator;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/ai/StreamAccumulator;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/ai/StreamAccumulator;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/pymcl/ai/AiClient;->$r8$lambda$OVAcViIJlplJNia3f1qtVRMzMmI(Lcom/pymcl/ai/StreamAccumulator;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
