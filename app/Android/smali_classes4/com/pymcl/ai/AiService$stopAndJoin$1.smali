.class final Lcom/pymcl/ai/AiService$stopAndJoin$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "AiService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/AiService;->stopAndJoin(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.pymcl.ai.AiService"
    f = "AiService.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x6e
    }
    m = "stopAndJoin"
    n = {
        "j",
        "$this$stopAndJoin_u24lambda_u240"
    }
    nl = {
        0x6e
    }
    s = {
        "L$0",
        "L$1"
    }
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/ai/AiService;


# direct methods
.method constructor <init>(Lcom/pymcl/ai/AiService;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiService;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiService$stopAndJoin$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/ai/AiService$stopAndJoin$1;->this$0:Lcom/pymcl/ai/AiService;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/pymcl/ai/AiService$stopAndJoin$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/ai/AiService$stopAndJoin$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/ai/AiService$stopAndJoin$1;->label:I

    iget-object v0, p0, Lcom/pymcl/ai/AiService$stopAndJoin$1;->this$0:Lcom/pymcl/ai/AiService;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiService;->stopAndJoin(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
