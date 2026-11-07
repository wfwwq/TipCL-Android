.class public final synthetic Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/AiAgent;

.field public final synthetic f$1:Lcom/pymcl/ai/ToolCall;

.field public final synthetic f$2:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$1:Lcom/pymcl/ai/ToolCall;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$2:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/AiAgent;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$1:Lcom/pymcl/ai/ToolCall;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda1;->f$2:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lcom/pymcl/ai/AiAgent;->$r8$lambda$ZXY3WoJtBG2EnTGzpZDejO2l33o(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0
.end method
