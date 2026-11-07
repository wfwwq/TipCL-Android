.class public final synthetic Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/AiAgent;

.field public final synthetic f$1:Lcom/pymcl/ai/AiSettings;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$1:Lcom/pymcl/ai/AiSettings;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$2:Ljava/util/List;

    iput-object p4, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$3:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/ai/AiAgent;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$1:Lcom/pymcl/ai/AiSettings;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$2:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda11;->f$3:Ljava/util/List;

    invoke-static {v0, v1, v2, v3}, Lcom/pymcl/ai/AiAgent;->$r8$lambda$o8y8_v5ri2jU2SKxZ7xGEQl0Fis(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/util/List;Ljava/util/List;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object v0

    return-object v0
.end method
