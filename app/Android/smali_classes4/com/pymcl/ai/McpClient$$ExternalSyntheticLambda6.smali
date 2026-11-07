.class public final synthetic Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/McpClient;

.field public final synthetic f$1:Lkotlin/jvm/internal/Ref$BooleanRef;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/ai/McpClient;

    iput-object p2, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/internal/Ref$BooleanRef;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/ai/McpClient;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/internal/Ref$BooleanRef;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/pymcl/ai/McpClient;->$r8$lambda$ECpq03nYJK82qBHLA3MolFVbHmc(Lcom/pymcl/ai/McpClient;Lkotlin/jvm/internal/Ref$BooleanRef;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
