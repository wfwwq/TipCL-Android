.class public final synthetic Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/McpHttp$Resp;

.field public final synthetic f$1:Ljava/lang/StringBuilder;

.field public final synthetic f$2:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f$3:Ljava/util/concurrent/CompletableFuture;

.field public final synthetic f$4:Lcom/pymcl/ai/McpClient;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$0:Lcom/pymcl/ai/McpHttp$Resp;

    iput-object p2, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$1:Ljava/lang/StringBuilder;

    iput-object p3, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p4, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$3:Ljava/util/concurrent/CompletableFuture;

    iput-object p5, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$4:Lcom/pymcl/ai/McpClient;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$0:Lcom/pymcl/ai/McpHttp$Resp;

    iget-object v1, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$1:Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v3, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$3:Ljava/util/concurrent/CompletableFuture;

    iget-object v4, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda5;->f$4:Lcom/pymcl/ai/McpClient;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/pymcl/ai/McpClient;->$r8$lambda$lqwGxD9ohtd_jYUFzP7Tee7sGC8(Lcom/pymcl/ai/McpHttp$Resp;Ljava/lang/StringBuilder;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/CompletableFuture;Lcom/pymcl/ai/McpClient;)V

    return-void
.end method
