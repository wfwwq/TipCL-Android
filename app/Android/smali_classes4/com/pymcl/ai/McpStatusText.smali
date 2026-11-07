.class public final Lcom/pymcl/ai/McpStatusText;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpStatusText\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,552:1\n1#2:553\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/ai/McpStatusText;",
        "",
        "<init>",
        "()V",
        "capNote",
        "",
        "resources",
        "",
        "prompts",
        "subscribe",
        "en",
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


# static fields
.field public static final INSTANCE:Lcom/pymcl/ai/McpStatusText;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/McpStatusText;

    invoke-direct {v0}, Lcom/pymcl/ai/McpStatusText;-><init>()V

    sput-object v0, Lcom/pymcl/ai/McpStatusText;->INSTANCE:Lcom/pymcl/ai/McpStatusText;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 391
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic capNote$default(Lcom/pymcl/ai/McpStatusText;ZZZZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 392
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget-object p4, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {p4}, Lcom/pymcl/ai/AiText;->getEnglish()Lkotlin/jvm/functions/Function0;

    move-result-object p4

    invoke-interface {p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Boolean;

    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/ai/McpStatusText;->capNote(ZZZZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final capNote(ZZZZ)Ljava/lang/String;
    .locals 11
    .param p1, "resources"    # Z
    .param p2, "prompts"    # Z
    .param p3, "subscribe"    # Z
    .param p4, "en"    # Z

    .line 393
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v2, "\u8d44\u6e90"

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p4, v2, v4}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 553
    move-object v2, v1

    .local v2, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 393
    .local v4, "$i$a$-takeIf-McpStatusText$capNote$parts$1":I
    nop

    .end local v2    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-takeIf-McpStatusText$capNote$parts$1":I
    const/4 v2, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    aput-object v1, v0, v3

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u63d0\u793a\u8bcd"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p4, v4, v5}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 553
    move-object v4, v1

    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 393
    .local v5, "$i$a$-takeIf-McpStatusText$capNote$parts$2":I
    nop

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-McpStatusText$capNote$parts$2":I
    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    const/4 v4, 0x1

    aput-object v1, v0, v4

    sget-object v1, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v5, "\u53ef\u8ba2\u9605"

    new-array v6, v3, [Ljava/lang/Object;

    invoke-virtual {v1, p4, v5, v6}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 553
    move-object v5, v1

    .local v5, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 393
    .local v6, "$i$a$-takeIf-McpStatusText$capNote$parts$3":I
    if-eqz p1, :cond_2

    if-eqz p3, :cond_2

    move v3, v4

    .end local v5    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-McpStatusText$capNote$parts$3":I
    :cond_2
    if-eqz v3, :cond_3

    move-object v2, v1

    :cond_3
    const/4 v1, 0x2

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 394
    .local v0, "parts":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, ""

    return-object v1

    .line 395
    :cond_4
    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    if-eqz p4, :cond_5

    const-string v1, ", "

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const-string v1, " (with "

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    const-string v1, ")"

    goto :goto_2

    :cond_5
    const-string v1, "\u3001"

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const-string v1, "\uff08\u542b"

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    const-string v1, "\uff09"

    :goto_2
    move-object v5, v1

    check-cast v5, Ljava/lang/CharSequence;

    const/16 v9, 0x38

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method
