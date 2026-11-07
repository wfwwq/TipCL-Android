.class public final Lcom/pymcl/runtime/input/TextRoutes;
.super Ljava/lang/Object;
.source "SdlTextInput.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdlTextInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdlTextInput.kt\ncom/pymcl/runtime/input/TextRoutes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/TextRoutes;",
        "",
        "<init>",
        "()V",
        "forMcVersion",
        "Lcom/pymcl/runtime/input/TextRoute;",
        "mc",
        "",
        "PyMCL-Android:runtime_debug"
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/TextRoutes;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/TextRoutes;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/TextRoutes;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/TextRoutes;->INSTANCE:Lcom/pymcl/runtime/input/TextRoutes;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final forMcVersion(Ljava/lang/String;)Lcom/pymcl/runtime/input/TextRoute;
    .locals 7
    .param p1, "mc"    # Ljava/lang/String;

    .line 21
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, ""

    .line 22
    .local v1, "v":Ljava/lang/String;
    :cond_1
    new-instance v2, Lkotlin/text/Regex;

    const-string v3, "^(\\d{2})w\\d{2}[a-z]$"

    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v2, v3, v4, v5, v0}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    .line 99
    .local v2, "it":Lkotlin/text/MatchResult;
    const/4 v0, 0x0

    .line 22
    .local v0, "$i$a$-let-TextRoutes$forMcVersion$1":I
    invoke-interface {v2}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x1b

    if-lt v3, v4, :cond_2

    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->SDL:Lcom/pymcl/runtime/input/TextRoute;

    goto :goto_1

    :cond_2
    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->GLFW:Lcom/pymcl/runtime/input/TextRoute;

    :goto_1
    return-object v3

    .line 23
    .end local v0    # "$i$a$-let-TextRoutes$forMcVersion$1":I
    .end local v2    # "it":Lkotlin/text/MatchResult;
    :cond_3
    new-instance v2, Lkotlin/text/Regex;

    const-string v6, "^(\\d+)\\.(\\d+)"

    invoke-direct {v2, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v6, v1

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v2, v6, v4, v5, v0}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/pymcl/runtime/input/TextRoute;->GLFW:Lcom/pymcl/runtime/input/TextRoute;

    return-object v0

    .line 24
    .local v0, "m":Lkotlin/text/MatchResult;
    :cond_4
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .local v2, "major":I
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 25
    .local v4, "minor":I
    if-ne v2, v3, :cond_5

    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->GLFW:Lcom/pymcl/runtime/input/TextRoute;

    return-object v3

    .line 26
    :cond_5
    const/16 v3, 0x1a

    if-gt v2, v3, :cond_7

    if-ne v2, v3, :cond_6

    const/4 v3, 0x3

    if-lt v4, v3, :cond_6

    goto :goto_2

    :cond_6
    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->GLFW:Lcom/pymcl/runtime/input/TextRoute;

    goto :goto_3

    :cond_7
    :goto_2
    sget-object v3, Lcom/pymcl/runtime/input/TextRoute;->SDL:Lcom/pymcl/runtime/input/TextRoute;

    :goto_3
    return-object v3
.end method
