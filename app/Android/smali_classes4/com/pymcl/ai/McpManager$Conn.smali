.class final Lcom/pymcl/ai/McpManager$Conn;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/McpManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Conn"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/ai/McpManager$Conn;",
        "",
        "client",
        "Lcom/pymcl/ai/McpClient;",
        "tools",
        "",
        "Lcom/pymcl/ai/McpTool;",
        "<init>",
        "(Lcom/pymcl/ai/McpClient;Ljava/util/List;)V",
        "getClient",
        "()Lcom/pymcl/ai/McpClient;",
        "getTools",
        "()Ljava/util/List;",
        "setTools",
        "(Ljava/util/List;)V",
        "PyMCL-Android:ai"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final client:Lcom/pymcl/ai/McpClient;

.field private volatile tools:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/pymcl/ai/McpClient;Ljava/util/List;)V
    .locals 1
    .param p1, "client"    # Lcom/pymcl/ai/McpClient;
    .param p2, "tools"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/McpClient;",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;)V"
        }
    .end annotation

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tools"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpManager$Conn;->client:Lcom/pymcl/ai/McpClient;

    iput-object p2, p0, Lcom/pymcl/ai/McpManager$Conn;->tools:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getClient()Lcom/pymcl/ai/McpClient;
    .locals 1

    .line 442
    iget-object v0, p0, Lcom/pymcl/ai/McpManager$Conn;->client:Lcom/pymcl/ai/McpClient;

    return-object v0
.end method

.method public final getTools()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;"
        }
    .end annotation

    .line 442
    iget-object v0, p0, Lcom/pymcl/ai/McpManager$Conn;->tools:Ljava/util/List;

    return-object v0
.end method

.method public final setTools(Ljava/util/List;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    iput-object p1, p0, Lcom/pymcl/ai/McpManager$Conn;->tools:Ljava/util/List;

    return-void
.end method
