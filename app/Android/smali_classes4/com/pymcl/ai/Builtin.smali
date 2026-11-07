.class public final Lcom/pymcl/ai/Builtin;
.super Ljava/lang/Object;
.source "Builtin.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0010\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0008J\u000e\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0008R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000c\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00088FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u000eR\u000e\u0010\u0016\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/pymcl/ai/Builtin;",
        "",
        "<init>",
        "()V",
        "GW",
        "",
        "KEY",
        "dec",
        "",
        "a",
        "x",
        "",
        "gatewayUrl",
        "getGatewayUrl",
        "()Ljava/lang/String;",
        "gatewayUrl$delegate",
        "Lkotlin/Lazy;",
        "apiBase",
        "getApiBase",
        "apiKey",
        "getApiKey",
        "apiKey$delegate",
        "DEFAULT_MODEL",
        "CLIENT_HEADER",
        "scrubKey",
        "v",
        "scrubUrl",
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
.field public static final CLIENT_HEADER:Ljava/lang/String; = "PyMCL/1.0.1"

.field public static final DEFAULT_MODEL:Ljava/lang/String; = "deepseek-v4-flash"

.field private static final GW:[I

.field public static final INSTANCE:Lcom/pymcl/ai/Builtin;

.field private static final KEY:[I

.field private static final apiKey$delegate:Lkotlin/Lazy;

.field private static final gatewayUrl$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$O360acwD6Vr4nFde5Qmef8OznEA()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/Builtin;->apiKey_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$Z3oQDfBR4VXXawxK4AvDpSAEBr4()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/Builtin;->gatewayUrl_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/Builtin;

    invoke-direct {v0}, Lcom/pymcl/ai/Builtin;-><init>()V

    sput-object v0, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    .line 8
    const/16 v0, 0x13

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/pymcl/ai/Builtin;->GW:[I

    .line 9
    const/16 v0, 0x33

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/pymcl/ai/Builtin;->KEY:[I

    .line 11
    new-instance v0, Lcom/pymcl/ai/Builtin$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/ai/Builtin$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/Builtin;->gatewayUrl$delegate:Lkotlin/Lazy;

    .line 13
    new-instance v0, Lcom/pymcl/ai/Builtin$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/pymcl/ai/Builtin$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/Builtin;->apiKey$delegate:Lkotlin/Lazy;

    return-void

    :array_0
    .array-data 4
        0x32
        0x2e
        0x2e
        0x2a
        0x29
        0x60
        0x75
        0x75
        0x34
        0x3f
        0x2d
        0x74
        0x69
        0x2b
        0x74
        0x32
        0x3b
        0x33
        0x28
    .end array-data

    :array_1
    .array-data 4
        0x44
        0x5c
        0x1a
        0x40
        0x74
        0x0
        0x7
        0x6e
        0x56
        0x3
        0x7d
        0x62
        0x62
        0x5e
        0x64
        0x5d
        0x47
        0x61
        0x7b
        0x5c
        0x79
        0x71
        0x71
        0x53
        0x78
        0x6
        0x61
        0x55
        0x63
        0x41
        0x5b
        0x59
        0x7b
        0x7c
        0x55
        0x6
        0x58
        0x60
        0x5e
        0x7f
        0x7d
        0x70
        0x45
        0x61
        0x60
        0x6
        0x0
        0x2
        0x7f
        0x55
        0x42
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final apiKey_delegate$lambda$0()Ljava/lang/String;
    .locals 3

    .line 13
    sget-object v0, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    sget-object v1, Lcom/pymcl/ai/Builtin;->KEY:[I

    const/16 v2, 0x37

    invoke-direct {v0, v1, v2}, Lcom/pymcl/ai/Builtin;->dec([II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final dec([II)Ljava/lang/String;
    .locals 4
    .param p1, "a"    # [I
    .param p2, "x"    # I

    .line 10
    array-length v0, p1

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget v3, p1, v2

    xor-int/2addr v3, p2

    int-to-char v3, v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method

.method private static final gatewayUrl_delegate$lambda$0()Ljava/lang/String;
    .locals 3

    .line 11
    sget-object v0, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    sget-object v1, Lcom/pymcl/ai/Builtin;->GW:[I

    const/16 v2, 0x5a

    invoke-direct {v0, v1, v2}, Lcom/pymcl/ai/Builtin;->dec([II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final getApiBase()Ljava/lang/String;
    .locals 2

    .line 12
    invoke-virtual {p0}, Lcom/pymcl/ai/Builtin;->getGatewayUrl()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/v1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getApiKey()Ljava/lang/String;
    .locals 1

    .line 13
    sget-object v0, Lcom/pymcl/ai/Builtin;->apiKey$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getGatewayUrl()Ljava/lang/String;
    .locals 1

    .line 11
    sget-object v0, Lcom/pymcl/ai/Builtin;->gatewayUrl$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final scrubKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "v"    # Ljava/lang/String;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0}, Lcom/pymcl/ai/Builtin;->getApiKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public final scrubUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "v"    # Ljava/lang/String;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    const/4 v0, 0x1

    new-array v1, v0, [C

    const/4 v2, 0x0

    const/16 v3, 0x2f

    aput-char v3, v1, v2

    invoke-static {p1, v1}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/pymcl/ai/Builtin;->getGatewayUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    new-array v0, v0, [C

    aput-char v3, v0, v2

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/ai/Builtin;->getApiBase()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_1

    :cond_1
    :goto_0
    const-string v0, ""

    :goto_1
    return-object v0
.end method
