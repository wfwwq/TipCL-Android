.class public final Lcom/pymcl/ai/HookRunner;
.super Ljava/lang/Object;
.source "Hooks.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/HookRunner$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hooks.kt\ncom/pymcl/ai/HookRunner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1#2:133\n777#3:134\n873#3,2:135\n1544#3:137\n1633#3,5:138\n1960#3,3:143\n1358#3,2:146\n1435#3,4:148\n*S KotlinDebug\n*F\n+ 1 Hooks.kt\ncom/pymcl/ai/HookRunner\n*L\n91#1:134\n91#1:135,2\n94#1:137\n94#1:138,5\n97#1:143,3\n114#1:146,2\n114#1:148,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001a\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\rH\u0002J0\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r0\u00102\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000cH\u0002JD\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u000c2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r2\u0006\u0010\u001a\u001a\u00020\u000c2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R.\u0010\u0008\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bj\u0002`\r\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/pymcl/ai/HookRunner;",
        "",
        "configFile",
        "Ljava/io/File;",
        "http",
        "Lcom/pymcl/ai/HookHttp;",
        "<init>",
        "(Ljava/io/File;Lcom/pymcl/ai/HookHttp;)V",
        "cached",
        "Lkotlin/Pair;",
        "",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "config",
        "entriesFor",
        "",
        "event",
        "tool",
        "hasAny",
        "",
        "getHasAny",
        "()Z",
        "run",
        "Lcom/pymcl/ai/HookOutcome;",
        "args",
        "chatId",
        "response",
        "Companion",
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
.field public static final Companion:Lcom/pymcl/ai/HookRunner$Companion;

.field private static final SUPPORTED_EVENTS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private volatile cached:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/Long;",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final configFile:Ljava/io/File;

.field private final http:Lcom/pymcl/ai/HookHttp;


# direct methods
.method public static synthetic $r8$lambda$QokEzWaOEH32cyjFzj0-PQok85w(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/ai/HookRunner;->_init_$lambda$0(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/ai/HookRunner$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/HookRunner$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/HookRunner;->Companion:Lcom/pymcl/ai/HookRunner$Companion;

    .line 70
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "PreToolUse"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "PostToolUse"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/HookRunner;->SUPPORTED_EVENTS:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lcom/pymcl/ai/HookHttp;)V
    .locals 1
    .param p1, "configFile"    # Ljava/io/File;
    .param p2, "http"    # Lcom/pymcl/ai/HookHttp;

    const-string v0, "configFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/HookRunner;->configFile:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/ai/HookRunner;->http:Lcom/pymcl/ai/HookHttp;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lcom/pymcl/ai/HookHttp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 68
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/pymcl/ai/HookRunner$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/pymcl/ai/HookRunner$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/HookRunner;-><init>(Ljava/io/File;Lcom/pymcl/ai/HookHttp;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;
    .locals 1
    .param p0, "u"    # Ljava/lang/String;
    .param p1, "h"    # Ljava/util/Map;
    .param p2, "b"    # Ljava/lang/String;
    .param p3, "t"    # I

    const-string v0, "u"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "b"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lcom/pymcl/ai/HookRunner;->Companion:Lcom/pymcl/ai/HookRunner$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/pymcl/ai/HookRunner$Companion;->defaultPost(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getSUPPORTED_EVENTS$cp()Ljava/util/Set;
    .locals 1

    .line 68
    sget-object v0, Lcom/pymcl/ai/HookRunner;->SUPPORTED_EVENTS:Ljava/util/Set;

    return-object v0
.end method

.method private final config()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/pymcl/ai/HookRunner;->configFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-array v0, v1, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 83
    :cond_0
    iget-object v0, p0, Lcom/pymcl/ai/HookRunner;->configFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 84
    .local v2, "m":J
    iget-object v0, p0, Lcom/pymcl/ai/HookRunner;->cached:Lkotlin/Pair;

    if-eqz v0, :cond_1

    .line 133
    .local v0, "it":Lkotlin/Pair;
    const/4 v4, 0x0

    .line 84
    .local v4, "$i$a$-let-HookRunner$config$1":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    cmp-long v5, v5, v2

    if-nez v5, :cond_1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    return-object v1

    .line 85
    .end local v0    # "it":Lkotlin/Pair;
    .end local v4    # "$i$a$-let-HookRunner$config$1":I
    :cond_1
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/HookRunner;

    .line 133
    .local v0, "$this$config_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    const/4 v4, 0x0

    .line 85
    .local v4, "$i$a$-runCatching-HookRunner$config$o$1":I
    sget-object v5, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v6, v0, Lcom/pymcl/ai/HookRunner;->configFile:Ljava/io/File;

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v6, v8, v7, v8}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .end local v0    # "$this$config_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    .end local v4    # "$i$a$-runCatching-HookRunner$config$o$1":I
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    new-array v1, v1, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object v0, v1

    :cond_2
    check-cast v0, Ljava/util/Map;

    .line 86
    .local v0, "o":Ljava/util/Map;
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    iput-object v1, p0, Lcom/pymcl/ai/HookRunner;->cached:Lkotlin/Pair;

    return-object v0
.end method

.method private final entriesFor(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p1, "event"    # Ljava/lang/String;
    .param p2, "tool"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 90
    move-object/from16 v1, p2

    invoke-direct/range {p0 .. p0}, Lcom/pymcl/ai/HookRunner;->config()Ljava/util/Map;

    move-result-object v0

    const-string v2, "hooks"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct/range {p0 .. p0}, Lcom/pymcl/ai/HookRunner;->config()Ljava/util/Map;

    move-result-object v0

    :cond_0
    move-object v3, v0

    .line 91
    .local v3, "root":Ljava/util/Map;
    move-object/from16 v4, p1

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 134
    .local v6, "$i$f$filter":I
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v5

    .local v7, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    move-object v8, v0

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .local v8, "destination$iv$iv":Ljava/util/Collection;
    const/4 v9, 0x0

    .line 135
    .local v9, "$i$f$filterTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "e":Ljava/util/Map;
    const/4 v13, 0x0

    .line 92
    .local v13, "$i$a$-filter-HookRunner$entriesFor$1":I
    const-string v0, "matcher"

    invoke-static {v12, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    move-object v14, v0

    .line 93
    .local v14, "mt":Ljava/lang/String;
    move-object v0, v14

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "*"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const/16 v16, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/ai/HookRunner;

    .line 133
    .local v0, "$this$entriesFor_u24lambda_u240_u240":Lcom/pymcl/ai/HookRunner;
    const/16 v17, 0x0

    .line 93
    .local v17, "$i$a$-runCatching-HookRunner$entriesFor$1$1":I
    new-instance v15, Lkotlin/text/Regex;

    invoke-direct {v15, v14}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object/from16 v18, v0

    .end local v0    # "$this$entriesFor_u24lambda_u240_u240":Lcom/pymcl/ai/HookRunner;
    .local v18, "$this$entriesFor_u24lambda_u240_u240":Lcom/pymcl/ai/HookRunner;
    move-object v0, v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v15, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Lkotlin/text/Regex;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v19, v3

    .end local v3    # "root":Ljava/util/Map;
    .local v19, "root":Ljava/util/Map;
    :try_start_1
    const-string v3, "^(?:"

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v15, ")$"

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v0, v16

    goto :goto_2

    .end local v19    # "root":Ljava/util/Map;
    .restart local v3    # "root":Ljava/util/Map;
    :cond_3
    move-object/from16 v19, v3

    .end local v3    # "root":Ljava/util/Map;
    .restart local v19    # "root":Ljava/util/Map;
    :goto_1
    const/4 v0, 0x1

    .end local v17    # "$i$a$-runCatching-HookRunner$entriesFor$1$1":I
    .end local v18    # "$this$entriesFor_u24lambda_u240_u240":Lcom/pymcl/ai/HookRunner;
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    .end local v19    # "root":Ljava/util/Map;
    .restart local v3    # "root":Ljava/util/Map;
    :catchall_1
    move-exception v0

    move-object/from16 v19, v3

    .end local v3    # "root":Ljava/util/Map;
    .restart local v19    # "root":Ljava/util/Map;
    :goto_3
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v14, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    move-object v0, v3

    :cond_4
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v15, v16

    goto :goto_6

    .end local v19    # "root":Ljava/util/Map;
    .restart local v3    # "root":Ljava/util/Map;
    :cond_6
    move-object/from16 v19, v3

    .end local v3    # "root":Ljava/util/Map;
    .restart local v19    # "root":Ljava/util/Map;
    :goto_5
    const/4 v15, 0x1

    .line 135
    .end local v12    # "e":Ljava/util/Map;
    .end local v13    # "$i$a$-filter-HookRunner$entriesFor$1":I
    .end local v14    # "mt":Ljava/lang/String;
    :goto_6
    if-eqz v15, :cond_7

    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_7
    move-object/from16 v3, v19

    goto/16 :goto_0

    .line 136
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v19    # "root":Ljava/util/Map;
    .restart local v3    # "root":Ljava/util/Map;
    :cond_8
    move-object/from16 v19, v3

    .end local v3    # "root":Ljava/util/Map;
    .end local v7    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$i$f$filterTo":I
    .restart local v19    # "root":Ljava/util/Map;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 134
    nop

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 94
    nop

    .local v0, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 137
    .local v3, "$i$f$flatMap":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 138
    .local v7, "$i$f$flatMapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 139
    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map;

    .local v10, "it":Ljava/util/Map;
    const/4 v11, 0x0

    .line 94
    .local v11, "$i$a$-flatMap-HookRunner$entriesFor$2":I
    invoke-static {v10, v2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    .line 139
    .end local v10    # "it":Ljava/util/Map;
    .end local v11    # "$i$a$-flatMap-HookRunner$entriesFor$2":I
    nop

    .line 140
    .local v12, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v5, v12}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_7

    .line 142
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v12    # "list$iv$iv":Ljava/lang/Iterable;
    :cond_9
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$flatMapTo":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 137
    nop

    .line 91
    .end local v0    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$flatMap":I
    return-object v2
.end method

.method public static synthetic run$default(Lcom/pymcl/ai/HookRunner;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;
    .locals 6

    .line 100
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/ai/HookRunner;->run(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/HookOutcome;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getHasAny()Z
    .locals 9

    .line 97
    sget-object v0, Lcom/pymcl/ai/HookRunner;->SUPPORTED_EVENTS:Ljava/util/Set;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 143
    .local v1, "$i$f$any":I
    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "e":Ljava/lang/String;
    const/4 v6, 0x0

    .line 97
    .local v6, "$i$a$-any-HookRunner$hasAny$1":I
    invoke-direct {p0}, Lcom/pymcl/ai/HookRunner;->config()Ljava/util/Map;

    move-result-object v7

    const-string v8, "hooks"

    invoke-static {v7, v8}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    if-nez v7, :cond_2

    invoke-direct {p0}, Lcom/pymcl/ai/HookRunner;->config()Ljava/util/Map;

    move-result-object v7

    :cond_2
    invoke-static {v7, v5}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    .line 144
    .end local v5    # "e":Ljava/lang/String;
    .end local v6    # "$i$a$-any-HookRunner$hasAny$1":I
    if-nez v7, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    .line 145
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_3
    nop

    .line 97
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any":I
    :goto_0
    return v3
.end method

.method public final run(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/HookOutcome;
    .locals 33
    .param p1, "event"    # Ljava/lang/String;
    .param p2, "tool"    # Ljava/lang/String;
    .param p3, "args"    # Ljava/util/Map;
    .param p4, "chatId"    # Ljava/lang/String;
    .param p5, "response"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/pymcl/ai/HookOutcome;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v0, "event"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tool"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatId"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    sget-object v0, Lcom/pymcl/ai/HookRunner;->SUPPORTED_EVENTS:Ljava/util/Set;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v6, Lcom/pymcl/ai/HookOutcome;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/pymcl/ai/HookOutcome;-><init>(ZLjava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    .line 102
    :cond_0
    new-instance v7, Lcom/pymcl/ai/HookOutcome;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/pymcl/ai/HookOutcome;-><init>(ZLjava/lang/String;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 103
    .local v7, "out":Lcom/pymcl/ai/HookOutcome;
    invoke-direct/range {p0 .. p2}, Lcom/pymcl/ai/HookRunner;->entriesFor(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v8, v7

    .end local v7    # "out":Lcom/pymcl/ai/HookOutcome;
    .local v8, "out":Lcom/pymcl/ai/HookOutcome;
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    .line 104
    .local v7, "h":Ljava/util/Map;
    const-string v0, "type"

    invoke-static {v7, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v9, "toLowerCase(...)"

    const-string v10, "command"

    if-eqz v0, :cond_1

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v0, :cond_2

    :cond_1
    move-object v0, v10

    :cond_2
    move-object v15, v0

    .line 105
    .local v15, "type":Ljava/lang/String;
    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v11, "\u88ab hook \u963b\u6b62"

    const-string v12, "reason"

    const-string v13, "block"

    const-string v14, "deny"

    move-object/from16 v16, v6

    const-string v6, "ask"

    const-string v17, ""

    move-object/from16 v18, v8

    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .local v18, "out":Lcom/pymcl/ai/HookOutcome;
    const-string v8, "PreToolUse"

    sparse-switch v0, :sswitch_data_0

    move-object v2, v15

    move-object/from16 v8, v18

    .end local v15    # "type":Ljava/lang/String;
    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .local v2, "type":Ljava/lang/String;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    goto/16 :goto_12

    .end local v2    # "type":Ljava/lang/String;
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v15    # "type":Ljava/lang/String;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :sswitch_0
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 106
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v7, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    const/16 v8, 0x3c

    invoke-static {v6, v8}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_4

    :cond_3
    move-object/from16 v6, v17

    :cond_4
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "skipped: command \u7c7b\u578b\u5728\u5b89\u5353\u4e0d\u53ef\u6267\u884c\uff08"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v8, "\uff09"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 105
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :cond_5
    :goto_1
    move-object v2, v15

    move-object/from16 v8, v18

    goto/16 :goto_12

    :sswitch_1
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    move-object/from16 v19, v11

    move-object v2, v15

    goto/16 :goto_e

    :sswitch_2
    const-string v0, "http"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    .line 110
    :cond_7
    const-string v0, "url"

    invoke-static {v7, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    move-object/from16 v0, v17

    :cond_8
    move-object v10, v0

    .line 111
    .local v10, "url":Ljava/lang/String;
    const-string v0, "http://"

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v20, v15

    .end local v15    # "type":Ljava/lang/String;
    .local v20, "type":Ljava/lang/String;
    const/4 v15, 0x2

    move-object/from16 v21, v6

    const/4 v6, 0x0

    invoke-static {v10, v0, v11, v15, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "https://"

    invoke-static {v10, v0, v11, v15, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v6, "http: url \u65e0\u6548"

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    move-object v6, v10

    .end local v10    # "url":Ljava/lang/String;
    .local v6, "url":Ljava/lang/String;
    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 112
    .end local v6    # "url":Ljava/lang/String;
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v10    # "url":Ljava/lang/String;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :cond_9
    const/4 v0, 0x5

    new-array v6, v0, [Lkotlin/Pair;

    const-string v0, "hook_event_name"

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v6, v11

    const-string v0, "tool_name"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v23, 0x1

    aput-object v0, v6, v23

    const-string v0, "tool_input"

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v6, v15

    const-string v0, "chat_id"

    invoke-static {v0, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v23, 0x3

    aput-object v0, v6, v23

    const-string v0, "client"

    const-string v11, "PyMCL-Android"

    invoke-static {v0, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v11, 0x4

    aput-object v0, v6, v11

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    .line 113
    .local v6, "payload":Ljava/util/Map;
    if-eqz v5, :cond_a

    const/16 v0, 0xfa0

    invoke-static {v5, v0}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    const-string v11, "tool_response"

    invoke-interface {v6, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    :cond_a
    const-string v0, "headers"

    invoke-static {v7, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    if-eqz v0, :cond_c

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 146
    .local v11, "$i$f$associate":I
    const/16 v15, 0xa

    invoke-static {v0, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-static {v15}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v15

    move-object/from16 v24, v0

    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .local v24, "$this$associate$iv":Ljava/lang/Iterable;
    const/16 v0, 0x10

    invoke-static {v15, v0}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 147
    .local v0, "capacity$iv":I
    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v15, Ljava/util/Map;

    .local v15, "destination$iv$iv":Ljava/util/Map;
    move-object/from16 v25, v24

    .local v25, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/16 v26, 0x0

    .line 148
    .local v26, "$i$f$associateTo":I
    invoke-interface/range {v25 .. v25}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v27

    :goto_2
    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->hasNext()Z

    move-result v28

    if-eqz v28, :cond_b

    invoke-interface/range {v27 .. v27}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v28

    .line 149
    .local v28, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v28

    check-cast v29, Ljava/util/Map$Entry;

    const/16 v30, 0x0

    .local v30, "$i$a$-associate-HookRunner$run$headers$1":I
    invoke-interface/range {v29 .. v29}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v31

    move/from16 v32, v0

    .end local v0    # "capacity$iv":I
    .local v32, "capacity$iv":I
    move-object/from16 v0, v31

    check-cast v0, Ljava/lang/String;

    .local v0, "k":Ljava/lang/String;
    invoke-interface/range {v29 .. v29}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v29

    .line 114
    .local v29, "v":Ljava/lang/Object;
    invoke-static/range {v29 .. v29}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 149
    .end local v0    # "k":Ljava/lang/String;
    .end local v29    # "v":Ljava/lang/Object;
    .end local v30    # "$i$a$-associate-HookRunner$run$headers$1":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v15, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p2

    move/from16 v0, v32

    goto :goto_2

    .line 151
    .end local v28    # "element$iv$iv":Ljava/lang/Object;
    .end local v32    # "capacity$iv":I
    .local v0, "capacity$iv":I
    :cond_b
    move/from16 v32, v0

    .line 147
    .end local v0    # "capacity$iv":I
    .end local v15    # "destination$iv$iv":Ljava/util/Map;
    .end local v25    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v26    # "$i$f$associateTo":I
    .restart local v32    # "capacity$iv":I
    nop

    .line 114
    .end local v11    # "$i$f$associate":I
    .end local v24    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v32    # "capacity$iv":I
    goto :goto_3

    :cond_c
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v15

    .line 115
    .local v15, "headers":Ljava/util/Map;
    :goto_3
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/ai/HookRunner;

    .line 133
    .local v0, "$this$run_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    const/4 v2, 0x0

    .line 115
    .local v2, "$i$a$-runCatching-HookRunner$run$r$1":I
    iget-object v11, v0, Lcom/pymcl/ai/HookRunner;->http:Lcom/pymcl/ai/HookHttp;

    move-object/from16 v24, v0

    .end local v0    # "$this$run_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    .local v24, "$this$run_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move/from16 v25, v2

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .end local v2    # "$i$a$-runCatching-HookRunner$run$r$1":I
    .local v25, "$i$a$-runCatching-HookRunner$run$r$1":I
    invoke-static {v0, v6, v3, v2, v4}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "timeout"

    invoke-static {v7, v2}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_4

    :cond_d
    const/4 v2, 0x5

    :goto_4
    mul-int/lit16 v2, v2, 0x3e8

    const/16 v3, 0x1f4

    const/16 v4, 0x7530

    invoke-static {v2, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    invoke-interface {v11, v10, v15, v0, v2}, Lcom/pymcl/ai/HookHttp;->post(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    .end local v24    # "$this$run_u24lambda_u241":Lcom/pymcl/ai/HookRunner;
    .end local v25    # "$i$a$-runCatching-HookRunner$run$r$1":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    move-object v2, v0

    .line 116
    .local v2, "r":Ljava/lang/Object;
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_e

    const/16 v4, 0x50

    invoke-static {v3, v4}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_e
    const/4 v3, 0x0

    :goto_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "http: \u5931\u8d25 "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    move-object v3, v10

    .end local v10    # "url":Ljava/lang/String;
    .local v3, "url":Ljava/lang/String;
    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 117
    .end local v3    # "url":Ljava/lang/String;
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v10    # "url":Ljava/lang/String;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :cond_f
    move-object v3, v10

    .end local v10    # "url":Ljava/lang/String;
    .restart local v3    # "url":Ljava/lang/String;
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x0

    goto :goto_7

    :cond_10
    move-object v0, v2

    :goto_7
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_11

    move-object/from16 v0, v17

    :cond_11
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 118
    .local v4, "body":Ljava/lang/String;
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/ai/HookRunner;

    .line 133
    .local v0, "$this$run_u24lambda_u242":Lcom/pymcl/ai/HookRunner;
    const/4 v10, 0x0

    .line 118
    .local v10, "$i$a$-runCatching-HookRunner$run$o$1":I
    sget-object v11, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v11, v4}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v11

    .end local v0    # "$this$run_u24lambda_u242":Lcom/pymcl/ai/HookRunner;
    .end local v10    # "$i$a$-runCatching-HookRunner$run$o$1":I
    invoke-static {v11}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_12

    const/4 v0, 0x0

    :cond_12
    check-cast v0, Ljava/util/Map;

    .line 119
    .local v0, "o":Ljava/util/Map;
    const-string v10, "decision"

    invoke-static {v0, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "hookSpecificOutput"

    if-nez v10, :cond_13

    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    move-object/from16 v22, v2

    .end local v2    # "r":Ljava/lang/Object;
    .local v22, "r":Ljava/lang/Object;
    const-string v2, "permissionDecision"

    invoke-static {v10, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    goto :goto_9

    .end local v22    # "r":Ljava/lang/Object;
    .restart local v2    # "r":Ljava/lang/Object;
    :cond_13
    move-object/from16 v22, v2

    .end local v2    # "r":Ljava/lang/Object;
    .restart local v22    # "r":Ljava/lang/Object;
    :goto_9
    if-eqz v10, :cond_14

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_a

    :cond_14
    const/4 v2, 0x0

    .line 120
    .local v2, "decision":Ljava/lang/String;
    :goto_a
    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    const-string v10, "permissionDecisionReason"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    const-string v9, "stopReason"

    invoke-static {v0, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    goto :goto_b

    :cond_15
    move-object/from16 v17, v9

    .line 121
    .local v17, "reason":Ljava/lang/String;
    :goto_b
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_18

    invoke-static {v2, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    const-string v9, "continue"

    invoke-static {v0, v9}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    const/16 v23, 0x0

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_18

    .line 122
    :cond_16
    move-object/from16 v8, v17

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_17

    .line 133
    const/4 v8, 0x0

    .line 122
    .local v8, "$i$a$-ifBlank-HookRunner$run$1":I
    move-object/from16 v11, v19

    .end local v8    # "$i$a$-ifBlank-HookRunner$run$1":I
    goto :goto_c

    :cond_17
    move-object v11, v8

    :goto_c
    move-object v10, v11

    check-cast v10, Ljava/lang/String;

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    const-string v9, "http: \u963b\u6b62"

    invoke-static {v8, v9}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .local v8, "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v9

    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    return-object v9

    .line 123
    :cond_18
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    move-object/from16 v9, v21

    invoke-static {v2, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    const/16 v13, 0xb

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    goto :goto_d

    .line 124
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :cond_19
    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    :goto_d
    invoke-virtual {v8}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    const-string v10, "http: ok"

    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v16

    .end local v0    # "o":Ljava/util/Map;
    .end local v2    # "decision":Ljava/lang/String;
    .end local v3    # "url":Ljava/lang/String;
    .end local v4    # "body":Ljava/lang/String;
    .end local v6    # "payload":Ljava/util/Map;
    .end local v15    # "headers":Ljava/util/Map;
    .end local v17    # "reason":Ljava/lang/String;
    .end local v22    # "r":Ljava/lang/Object;
    goto/16 :goto_0

    .line 105
    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .end local v20    # "type":Ljava/lang/String;
    .local v15, "type":Ljava/lang/String;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :sswitch_3
    move-object/from16 v19, v11

    move-object/from16 v20, v15

    .end local v15    # "type":Ljava/lang/String;
    .restart local v20    # "type":Ljava/lang/String;
    move-object/from16 v2, v20

    .end local v20    # "type":Ljava/lang/String;
    .local v2, "type":Ljava/lang/String;
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_10

    .line 107
    :cond_1a
    :goto_e
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-static {v7, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1b

    move-object/from16 v10, v19

    goto :goto_f

    :cond_1b
    move-object v10, v0

    :goto_f
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ": \u963b\u6b62"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v0

    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    return-object v0

    :cond_1c
    move-object/from16 v8, v18

    goto :goto_11

    .line 105
    .end local v2    # "type":Ljava/lang/String;
    .restart local v15    # "type":Ljava/lang/String;
    :sswitch_4
    move-object v9, v6

    move-object v2, v15

    .end local v15    # "type":Ljava/lang/String;
    .restart local v2    # "type":Ljava/lang/String;
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :goto_10
    move-object/from16 v8, v18

    goto :goto_12

    .line 108
    :cond_1d
    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v3, "ask: \u5f3a\u5236\u786e\u8ba4"

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    move-object/from16 v8, v18

    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v16

    goto/16 :goto_0

    .end local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    :cond_1e
    move-object/from16 v8, v18

    .line 103
    .end local v2    # "type":Ljava/lang/String;
    .end local v7    # "h":Ljava/util/Map;
    .end local v18    # "out":Lcom/pymcl/ai/HookOutcome;
    .restart local v8    # "out":Lcom/pymcl/ai/HookOutcome;
    :goto_11
    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v16

    goto/16 :goto_0

    .line 126
    .restart local v2    # "type":Ljava/lang/String;
    .restart local v7    # "h":Ljava/util/Map;
    :goto_12
    invoke-virtual {v8}, Lcom/pymcl/ai/HookOutcome;->getNotes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "skipped: \u672a\u77e5\u7c7b\u578b "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lcom/pymcl/ai/HookOutcome;->copy$default(Lcom/pymcl/ai/HookOutcome;ZLjava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/HookOutcome;

    move-result-object v8

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v6, v16

    .end local v2    # "type":Ljava/lang/String;
    .end local v7    # "h":Ljava/util/Map;
    goto/16 :goto_0

    .line 129
    :cond_1f
    return-object v8

    nop

    :sswitch_data_0
    .sparse-switch
        0x17a79 -> :sswitch_4
        0x2efe0c -> :sswitch_3
        0x310888 -> :sswitch_2
        0x597c48d -> :sswitch_1
        0x38a5df4b -> :sswitch_0
    .end sparse-switch
.end method
