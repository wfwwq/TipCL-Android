.class public final synthetic Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$1:Lcom/pymcl/ai/ToolCall;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/ai/ToolCall;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$runTool$out$2$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/ai/ToolCall;

    check-cast p1, Ljava/lang/Float;

    check-cast p2, Ljava/lang/String;

    invoke-static {v0, v1, p1, p2}, Lcom/pymcl/ai/AiAgent$runTool$out$2;->$r8$lambda$CiJXk9hNHWDhWZGUNH4KxttwHKw(Lkotlin/jvm/functions/Function1;Lcom/pymcl/ai/ToolCall;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
