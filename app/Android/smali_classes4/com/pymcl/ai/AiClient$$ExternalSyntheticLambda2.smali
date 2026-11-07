.class public final synthetic Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/AiClient;

.field public final synthetic f$1:Lcom/pymcl/ai/AiEndpoint;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/ai/AiClient;

    iput-object p2, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;->f$1:Lcom/pymcl/ai/AiEndpoint;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/ai/AiClient;

    iget-object v1, p0, Lcom/pymcl/ai/AiClient$$ExternalSyntheticLambda2;->f$1:Lcom/pymcl/ai/AiEndpoint;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/pymcl/ai/AiClient;->$r8$lambda$SB5-6PsHftG6xbTkJvsvgKSz2Fk(Lcom/pymcl/ai/AiClient;Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
