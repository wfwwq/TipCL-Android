.class public final Lcom/pymcl/ai/McpHttp$Resp;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/McpHttp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Resp"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/McpHttp$Resp;",
        "",
        "code",
        "",
        "headers",
        "",
        "",
        "contentType",
        "lines",
        "Lcom/pymcl/ai/AiLineStream;",
        "<init>",
        "(ILjava/util/Map;Ljava/lang/String;Lcom/pymcl/ai/AiLineStream;)V",
        "getCode",
        "()I",
        "getHeaders",
        "()Ljava/util/Map;",
        "getContentType",
        "()Ljava/lang/String;",
        "getLines",
        "()Lcom/pymcl/ai/AiLineStream;",
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
.field private final code:I

.field private final contentType:Ljava/lang/String;

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final lines:Lcom/pymcl/ai/AiLineStream;


# direct methods
.method public constructor <init>(ILjava/util/Map;Ljava/lang/String;Lcom/pymcl/ai/AiLineStream;)V
    .locals 1
    .param p1, "code"    # I
    .param p2, "headers"    # Ljava/util/Map;
    .param p3, "contentType"    # Ljava/lang/String;
    .param p4, "lines"    # Lcom/pymcl/ai/AiLineStream;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/AiLineStream;",
            ")V"
        }
    .end annotation

    const-string v0, "headers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lines"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/ai/McpHttp$Resp;->code:I

    iput-object p2, p0, Lcom/pymcl/ai/McpHttp$Resp;->headers:Ljava/util/Map;

    iput-object p3, p0, Lcom/pymcl/ai/McpHttp$Resp;->contentType:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/ai/McpHttp$Resp;->lines:Lcom/pymcl/ai/AiLineStream;

    return-void
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/pymcl/ai/McpHttp$Resp;->code:I

    return v0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/ai/McpHttp$Resp;->contentType:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/pymcl/ai/McpHttp$Resp;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public final getLines()Lcom/pymcl/ai/AiLineStream;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/ai/McpHttp$Resp;->lines:Lcom/pymcl/ai/AiLineStream;

    return-object v0
.end method
