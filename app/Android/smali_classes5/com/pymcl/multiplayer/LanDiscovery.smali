.class public final Lcom/pymcl/multiplayer/LanDiscovery;
.super Ljava/lang/Object;
.source "LanDiscovery.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLanDiscovery.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LanDiscovery.kt\ncom/pymcl/multiplayer/LanDiscovery\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,55:1\n1#2:56\n1123#3,3:57\n*S KotlinDebug\n*F\n+ 1 LanDiscovery.kt\ncom/pymcl/multiplayer/LanDiscovery\n*L\n48#1:57,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005J\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/LanDiscovery;",
        "",
        "<init>",
        "()V",
        "GROUP",
        "",
        "PORT",
        "",
        "RE",
        "Lkotlin/text/Regex;",
        "parse",
        "Lcom/pymcl/multiplayer/LanWorld;",
        "payload",
        "host",
        "discover",
        "Lkotlinx/coroutines/flow/Flow;",
        "context",
        "Landroid/content/Context;",
        "normalizeDirect",
        "input",
        "PyMCL-Android:multiplayer_debug"
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
.field public static final GROUP:Ljava/lang/String; = "224.0.2.60"

.field public static final INSTANCE:Lcom/pymcl/multiplayer/LanDiscovery;

.field public static final PORT:I = 0x115d

.field private static final RE:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/multiplayer/LanDiscovery;

    invoke-direct {v0}, Lcom/pymcl/multiplayer/LanDiscovery;-><init>()V

    sput-object v0, Lcom/pymcl/multiplayer/LanDiscovery;->INSTANCE:Lcom/pymcl/multiplayer/LanDiscovery;

    .line 21
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\[MOTD](.*?)\\[/MOTD]\\[AD](\\d{1,5})\\[/AD]"

    sget-object v2, Lkotlin/text/RegexOption;->DOT_MATCHES_ALL:Lkotlin/text/RegexOption;

    invoke-direct {v0, v1, v2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    sput-object v0, Lcom/pymcl/multiplayer/LanDiscovery;->RE:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final discover(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/multiplayer/LanWorld;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    new-instance v0, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/pymcl/multiplayer/LanDiscovery$discover$1;-><init>(Landroid/content/Context;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->callbackFlow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 41
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    check-cast v1, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->flowOn(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public final normalizeDirect(Ljava/lang/String;)Ljava/lang/String;
    .locals 18
    .param p1, "input"    # Ljava/lang/String;

    move-object/from16 v0, p1

    const-string v1, "input"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "minecraft://"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    .local v1, "s":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    const/4 v5, 0x0

    if-eqz v2, :cond_1

    return-object v5

    .line 46
    :cond_1
    const/4 v2, 0x0

    .local v2, "host":Ljava/lang/String;
    const/4 v6, 0x0

    .line 47
    .local v6, "port":I
    const-string v7, "["

    const/4 v8, 0x2

    invoke-static {v1, v7, v3, v8, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    const-string v10, ":"

    const/16 v11, 0x3a

    if-eqz v9, :cond_6

    move-object v12, v1

    check-cast v12, Ljava/lang/CharSequence;

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/16 v13, 0x5d

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v9

    .local v9, "e":I
    if-gez v9, :cond_2

    return-object v5

    :cond_2
    invoke-virtual {v1, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v12

    const-string v13, "substring(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .end local v2    # "host":Ljava/lang/String;
    .local v12, "host":Ljava/lang/String;
    add-int/lit8 v2, v9, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v10

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v2, v13}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_3

    move v13, v4

    goto :goto_1

    :cond_3
    move v13, v3

    :goto_1
    if-eqz v13, :cond_4

    .line 56
    const/4 v2, 0x0

    .line 47
    .local v2, "$i$a$-ifEmpty-LanDiscovery$normalizeDirect$1":I
    nop

    .end local v2    # "$i$a$-ifEmpty-LanDiscovery$normalizeDirect$1":I
    const-string v2, "25565"

    :cond_4
    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .end local v6    # "port":I
    .end local v9    # "e":I
    .local v2, "port":I
    goto :goto_4

    .end local v2    # "port":I
    .restart local v6    # "port":I
    .restart local v9    # "e":I
    :cond_5
    return-object v5

    .line 48
    .end local v9    # "e":I
    .end local v12    # "host":Ljava/lang/String;
    .local v2, "host":Ljava/lang/String;
    :cond_6
    move-object v9, v1

    check-cast v9, Ljava/lang/CharSequence;

    .local v9, "$this$count$iv":Ljava/lang/CharSequence;
    const/4 v12, 0x0

    .line 57
    .local v12, "$i$f$count":I
    const/4 v13, 0x0

    .line 58
    .local v13, "count$iv":I
    move v14, v3

    :goto_2
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v15

    if-ge v14, v15, :cond_9

    invoke-interface {v9, v14}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    .local v15, "element$iv":C
    move/from16 v16, v15

    .local v16, "it":C
    const/16 v17, 0x0

    .line 48
    .local v17, "$i$a$-count-LanDiscovery$normalizeDirect$2":I
    move/from16 v3, v16

    .end local v16    # "it":C
    .local v3, "it":C
    if-ne v3, v11, :cond_7

    move v3, v4

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    .line 58
    .end local v3    # "it":C
    .end local v17    # "$i$a$-count-LanDiscovery$normalizeDirect$2":I
    :goto_3
    if-eqz v3, :cond_8

    add-int/lit8 v13, v13, 0x1

    .end local v15    # "element$iv":C
    :cond_8
    add-int/lit8 v14, v14, 0x1

    const/4 v3, 0x0

    goto :goto_2

    .line 59
    :cond_9
    nop

    .line 48
    .end local v9    # "$this$count$iv":Ljava/lang/CharSequence;
    .end local v12    # "$i$f$count":I
    .end local v13    # "count$iv":I
    if-ne v13, v4, :cond_b

    invoke-static {v1, v11, v5, v8, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .end local v2    # "host":Ljava/lang/String;
    .local v12, "host":Ljava/lang/String;
    invoke-static {v1, v11, v5, v8, v5}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .end local v6    # "port":I
    .local v2, "port":I
    goto :goto_4

    .end local v2    # "port":I
    .restart local v6    # "port":I
    :cond_a
    return-object v5

    .line 49
    .end local v12    # "host":Ljava/lang/String;
    .local v2, "host":Ljava/lang/String;
    :cond_b
    move-object v12, v1

    .end local v2    # "host":Ljava/lang/String;
    .restart local v12    # "host":Ljava/lang/String;
    const/16 v2, 0x63dd

    .line 50
    .end local v6    # "port":I
    .local v2, "port":I
    :goto_4
    if-gt v4, v2, :cond_c

    const/high16 v3, 0x10000

    if-ge v2, v3, :cond_c

    move v3, v4

    goto :goto_5

    :cond_c
    const/4 v3, 0x0

    :goto_5
    if-eqz v3, :cond_11

    move-object v3, v12

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_8

    .line 51
    :cond_d
    const-string v3, "localhost"

    invoke-static {v12, v3, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "127."

    const/4 v4, 0x0

    invoke-static {v12, v3, v4, v8, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    const-string v3, "::1"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    .line 52
    :cond_e
    move-object v3, v12

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3, v11, v4, v8, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "]:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    goto :goto_6

    :cond_f
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    :goto_6
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 51
    :cond_10
    :goto_7
    return-object v5

    .line 50
    :cond_11
    :goto_8
    return-object v5
.end method

.method public final parse(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/multiplayer/LanWorld;
    .locals 9
    .param p1, "payload"    # Ljava/lang/String;
    .param p2, "host"    # Ljava/lang/String;

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lcom/pymcl/multiplayer/LanDiscovery;->RE:Lkotlin/text/Regex;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_2

    .local v0, "m":Lkotlin/text/MatchResult;
    const/4 v1, 0x0

    .line 24
    .local v1, "$i$a$-let-LanDiscovery$parse$1":I
    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2

    move-object v5, v3

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 56
    .local v5, "it":I
    const/4 v6, 0x0

    .line 24
    .local v6, "$i$a$-takeIf-LanDiscovery$parse$1$1":I
    const/4 v7, 0x1

    if-gt v7, v5, :cond_0

    const/high16 v8, 0x10000

    if-ge v5, v8, :cond_0

    move v2, v7

    .end local v5    # "it":I
    .end local v6    # "$i$a$-takeIf-LanDiscovery$parse$1$1":I
    :cond_0
    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 56
    .local v2, "it":I
    const/4 v3, 0x0

    .line 24
    .local v3, "$i$a$-let-LanDiscovery$parse$1$2":I
    new-instance v4, Lcom/pymcl/multiplayer/LanWorld;

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-direct {v4, v5, p2, v2}, Lcom/pymcl/multiplayer/LanWorld;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 23
    .end local v0    # "m":Lkotlin/text/MatchResult;
    .end local v1    # "$i$a$-let-LanDiscovery$parse$1":I
    .end local v2    # "it":I
    .end local v3    # "$i$a$-let-LanDiscovery$parse$1$2":I
    :cond_2
    nop

    .line 24
    return-object v4
.end method
