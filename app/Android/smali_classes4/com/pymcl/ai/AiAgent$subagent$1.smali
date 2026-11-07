.class final Lcom/pymcl/ai/AiAgent$subagent$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "AiAgent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiAgent;->subagent(Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.ai.AiAgent"
    f = "AiAgent.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x2,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x3,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x4,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5,
        0x5
    }
    l = {
        0x152,
        0x15b,
        0x15c,
        0x165,
        0x165,
        0x16d
    }
    m = "subagent"
    n = {
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "msgs",
        "answer",
        "subTools",
        "r",
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "msgs",
        "answer",
        "subTools",
        "e",
        "r",
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "msgs",
        "answer",
        "subTools",
        "turn",
        "c",
        "meta",
        "args",
        "$this$subagent_u24lambda_u244",
        "r",
        "s0",
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "msgs",
        "answer",
        "subTools",
        "turn",
        "c",
        "meta",
        "args",
        "$this$subagent_u24lambda_u244",
        "r",
        "s0",
        "tc",
        "a",
        "st",
        "emit",
        "task",
        "msgs",
        "answer"
    }
    nl = {
        0x154,
        0x15c,
        0x15b,
        0x165,
        0x165,
        0x16e
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "I$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$10",
        "L$11",
        "L$12",
        "L$13",
        "I$0",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$10",
        "L$11",
        "L$12",
        "L$13",
        "I$0",
        "J$0",
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6"
    }
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field J$0:J

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$10:Ljava/lang/Object;

.field L$11:Ljava/lang/Object;

.field L$12:Ljava/lang/Object;

.field L$13:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field L$6:Ljava/lang/Object;

.field L$7:Ljava/lang/Object;

.field L$8:Ljava/lang/Object;

.field L$9:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/ai/AiAgent;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiAgent;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiAgent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiAgent$subagent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$subagent$1;->this$0:Lcom/pymcl/ai/AiAgent;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$subagent$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/ai/AiAgent$subagent$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/ai/AiAgent$subagent$1;->label:I

    iget-object v1, p0, Lcom/pymcl/ai/AiAgent$subagent$1;->this$0:Lcom/pymcl/ai/AiAgent;

    const/4 v5, 0x0

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/pymcl/ai/AiAgent;->access$subagent(Lcom/pymcl/ai/AiAgent;Lcom/pymcl/ai/ToolCall;Ljava/util/Map;Lcom/pymcl/ai/AiSettings;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
