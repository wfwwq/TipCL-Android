.class public final synthetic Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/ai/McpHttp$Resp;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/ai/McpHttp$Resp;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/McpHttp$Resp;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/McpClient$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/ai/McpHttp$Resp;

    invoke-static {v0}, Lcom/pymcl/ai/McpClient;->$r8$lambda$M30yybyAfTsFpq_FZQyBT5mXPec(Lcom/pymcl/ai/McpHttp$Resp;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
