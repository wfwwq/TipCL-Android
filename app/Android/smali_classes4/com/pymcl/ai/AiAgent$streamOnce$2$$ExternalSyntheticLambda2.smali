.class public final synthetic Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/AiAgent;

.field public final synthetic f$1:Lcom/pymcl/ai/AiSettings;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/util/List;

.field public final synthetic f$4:Ljava/util/List;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/ai/AiAgent;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$1:Lcom/pymcl/ai/AiSettings;

    iput-object p3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$3:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$4:Ljava/util/List;

    iput-object p6, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$5:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/ai/AiAgent;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$1:Lcom/pymcl/ai/AiSettings;

    iget-object v2, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$3:Ljava/util/List;

    iget-object v4, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$4:Ljava/util/List;

    iget-object v5, p0, Lcom/pymcl/ai/AiAgent$streamOnce$2$$ExternalSyntheticLambda2;->f$5:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/pymcl/ai/AiAgent$streamOnce$2;->$r8$lambda$fgzoYpDNu5Mvuei_rlm56DeMOBs(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/AiSettings;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/ai/AssistantTurn;

    move-result-object v0

    return-object v0
.end method
