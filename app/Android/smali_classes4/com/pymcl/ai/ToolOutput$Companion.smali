.class public final Lcom/pymcl/ai/ToolOutput$Companion;
.super Ljava/lang/Object;
.source "AiToolHost.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/ToolOutput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/pymcl/ai/ToolOutput$Companion;",
        "",
        "<init>",
        "()V",
        "ok",
        "Lcom/pymcl/ai/ToolOutput;",
        "text",
        "",
        "network",
        "",
        "err",
        "json",
        "v",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/ai/ToolOutput$Companion;-><init>()V

    return-void
.end method

.method public static synthetic json$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/Object;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;
    .locals 0

    .line 11
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/ToolOutput$Companion;->json(Ljava/lang/Object;Z)Lcom/pymcl/ai/ToolOutput;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ok$default(Lcom/pymcl/ai/ToolOutput$Companion;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/ai/ToolOutput;
    .locals 0

    .line 9
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/ToolOutput$Companion;->ok(Ljava/lang/String;Z)Lcom/pymcl/ai/ToolOutput;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;
    .locals 7
    .param p1, "text"    # Ljava/lang/String;

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v1, Lcom/pymcl/ai/ToolOutput;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v3, p1

    .end local p1    # "text":Ljava/lang/String;
    .local v3, "text":Ljava/lang/String;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final json(Ljava/lang/Object;Z)Lcom/pymcl/ai/ToolOutput;
    .locals 5
    .param p1, "v"    # Ljava/lang/Object;
    .param p2, "network"    # Z

    .line 11
    new-instance v0, Lcom/pymcl/ai/ToolOutput;

    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, p1, v4, v2, v3}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p2}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method

.method public final ok(Ljava/lang/String;Z)Lcom/pymcl/ai/ToolOutput;
    .locals 2
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "network"    # Z

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    new-instance v0, Lcom/pymcl/ai/ToolOutput;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1, p2}, Lcom/pymcl/ai/ToolOutput;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method
