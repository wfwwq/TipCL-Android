.class public final Lcom/pymcl/ai/ModelRules;
.super Ljava/lang/Object;
.source "ModelRules.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/ModelRules$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModelRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelRules.kt\ncom/pymcl/ai/ModelRules\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1#2:85\n777#3:86\n873#3,2:87\n2068#3,2:89\n777#3:91\n873#3,2:92\n2068#3,2:94\n296#3,2:96\n777#3:98\n873#3,2:99\n2068#3,2:101\n296#3,2:103\n*S KotlinDebug\n*F\n+ 1 ModelRules.kt\ncom/pymcl/ai/ModelRules\n*L\n58#1:86\n58#1:87,2\n58#1:89,2\n59#1:91\n59#1:92,2\n59#1:94,2\n60#1:96,2\n64#1:98\n64#1:99,2\n65#1:101,2\n66#1:103,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\'\u0012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00060\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u001c\u0010\u000c\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\u0006\u0010\r\u001a\u00020\u0005H\u0002J0\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0016\u0008\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012R&\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004j\u0002`\u00060\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/ModelRules;",
        "",
        "tables",
        "",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "<init>",
        "(Ljava/util/List;)V",
        "apply",
        "Lcom/pymcl/ai/ModelCaps;",
        "c",
        "o",
        "tag",
        "resolve",
        "model",
        "endpointUrl",
        "overrides",
        "",
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
.field private static final BUILTIN_JSON$delegate:Lkotlin/Lazy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Lazy<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/pymcl/ai/ModelRules$Companion;


# instance fields
.field private final tables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$0ogD0PMJPfJsu00A5opS4Ppx7g8()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/ModelRules;->BUILTIN_JSON_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/ModelRules$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/ModelRules$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    .line 27
    new-instance v0, Lcom/pymcl/ai/ModelRules$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/ai/ModelRules$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/ModelRules;->BUILTIN_JSON$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1, "tables"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    const-string v0, "tables"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/ModelRules;->tables:Ljava/util/List;

    return-void
.end method

.method private static final BUILTIN_JSON_delegate$lambda$0()Ljava/util/Map;
    .locals 7

    .line 28
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const-class v1, Lcom/pymcl/ai/ModelRules;

    const-string v2, "/pymcl_ai/model_rules.json"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v2, v1

    check-cast v2, Ljava/io/InputStream;

    .line 85
    .local v2, "it":Ljava/io/InputStream;
    const/4 v3, 0x0

    .local v3, "$i$a$-use-ModelRules$Companion$BUILTIN_JSON$2$1":I
    new-instance v4, Ljava/lang/String;

    .line 28
    invoke-static {v2}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v5

    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v4, v5, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v2    # "it":Ljava/io/InputStream;
    .end local v3    # "$i$a$-use-ModelRules$Companion$BUILTIN_JSON$2$1":I
    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v4}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static final synthetic access$getBUILTIN_JSON$delegate$cp()Lkotlin/Lazy;
    .locals 1

    .line 25
    sget-object v0, Lcom/pymcl/ai/ModelRules;->BUILTIN_JSON$delegate:Lkotlin/Lazy;

    return-object v0
.end method

.method private final apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;
    .locals 9
    .param p1, "c"    # Lcom/pymcl/ai/ModelCaps;
    .param p2, "o"    # Ljava/util/Map;
    .param p3, "tag"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/ModelCaps;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/pymcl/ai/ModelCaps;"
        }
    .end annotation

    .line 40
    if-nez p2, :cond_0

    return-object p1

    .line 41
    :cond_0
    nop

    .line 42
    const-string v0, "contextWindow"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_1
    move v2, v0

    goto :goto_2

    :cond_1
    const-string v0, "context_window"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getContextWindow()I

    move-result v0

    goto :goto_1

    .line 43
    :goto_2
    const-string v0, "maxOutput"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_4
    move v3, v0

    goto :goto_5

    :cond_3
    const-string v0, "max_output"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    const-string v0, "maxTokens"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getMaxOutput()I

    move-result v0

    goto :goto_4

    .line 44
    :goto_5
    const-string v0, "supportsTools"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_6

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_7
    move v4, v0

    goto :goto_8

    :cond_6
    const-string v0, "tools"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getSupportsTools()Z

    move-result v0

    goto :goto_7

    .line 45
    :goto_8
    const-string v0, "supportsImages"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_8

    :goto_9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_a
    move v5, v0

    goto :goto_b

    :cond_8
    const-string v0, "vision"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    const-string v0, "images"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_a

    goto :goto_9

    :cond_a
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getSupportsImages()Z

    move-result v0

    goto :goto_a

    .line 46
    :goto_b
    const-string v0, "supportsReasoning"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_b

    :goto_c
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_d
    move v6, v0

    goto :goto_e

    :cond_b
    const-string v0, "reasoning"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_c

    goto :goto_c

    :cond_c
    const-string v0, "thinking"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_d

    goto :goto_c

    :cond_d
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getSupportsReasoning()Z

    move-result v0

    goto :goto_d

    .line 47
    :goto_e
    const-string v0, "supportsTemperature"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_e

    :goto_f
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_10
    move v7, v0

    goto :goto_11

    :cond_e
    const-string v0, "temperature"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_f

    goto :goto_f

    :cond_f
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getSupportsTemperature()Z

    move-result v0

    goto :goto_10

    .line 48
    :goto_11
    invoke-virtual {p1}, Lcom/pymcl/ai/ModelCaps;->getMatched()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0, p3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 41
    move-object v1, p1

    .end local p1    # "c":Lcom/pymcl/ai/ModelCaps;
    .local v1, "c":Lcom/pymcl/ai/ModelCaps;
    invoke-virtual/range {v1 .. v8}, Lcom/pymcl/ai/ModelCaps;->copy(IIZZZZLjava/util/List;)Lcom/pymcl/ai/ModelCaps;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic resolve$default(Lcom/pymcl/ai/ModelRules;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/ai/ModelCaps;
    .locals 0

    .line 52
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/ai/ModelRules;->resolve(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ModelCaps;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final resolve(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ModelCaps;
    .locals 23
    .param p1, "model"    # Ljava/lang/String;
    .param p2, "endpointUrl"    # Ljava/lang/String;
    .param p3, "overrides"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/ai/ModelCaps;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v4, ""

    const-string v0, "model"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endpointUrl"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "overrides"

    move-object/from16 v5, p3

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x0

    .local v0, "c":Ljava/lang/Object;
    new-instance v6, Lcom/pymcl/ai/ModelCaps;

    const/16 v14, 0x7f

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lcom/pymcl/ai/ModelCaps;-><init>(IIZZZZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 54
    .end local v0    # "c":Ljava/lang/Object;
    .local v6, "c":Ljava/lang/Object;
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x2

    const/16 v8, 0x2f

    const/4 v9, 0x0

    invoke-static {v0, v8, v9, v7, v9}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 55
    .local v7, "m":Ljava/lang/String;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/ModelRules;

    .line 85
    .local v0, "$this$resolve_u24lambda_u240":Lcom/pymcl/ai/ModelRules;
    const/4 v8, 0x0

    .line 55
    .local v8, "$i$a$-runCatching-ModelRules$resolve$host$1":I
    new-instance v10, Ljava/net/URI;

    invoke-direct {v10, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 85
    .local v10, "u":Ljava/net/URI;
    const/4 v11, 0x0

    .line 55
    .local v11, "$i$a$-let-ModelRules$resolve$host$1$1":I
    invoke-virtual {v10}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_0

    move-object v12, v4

    :cond_0
    invoke-virtual {v10}, Ljava/net/URI;->getPort()I

    move-result v13

    if-lez v13, :cond_1

    invoke-virtual {v10}, Ljava/net/URI;->getPort()I

    move-result v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, ":"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_0

    :cond_1
    move-object v13, v4

    :goto_0
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .end local v0    # "$this$resolve_u24lambda_u240":Lcom/pymcl/ai/ModelRules;
    .end local v8    # "$i$a$-runCatching-ModelRules$resolve$host$1":I
    .end local v10    # "u":Ljava/net/URI;
    .end local v11    # "$i$a$-let-ModelRules$resolve$host$1$1":I
    invoke-static {v12}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v0, v4

    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 56
    .local v0, "host":Ljava/lang/String;
    iget-object v8, v1, Lcom/pymcl/ai/ModelRules;->tables:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    .line 57
    .local v10, "t":Ljava/util/Map;
    const-string v13, "defaults"

    invoke-static {v10, v13}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    invoke-direct {v1, v6, v14, v13}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    .line 58
    const-string v13, "providerSiteRules"

    invoke-static {v10, v13}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 86
    .local v14, "$i$f$filter":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    check-cast v15, Ljava/util/Collection;

    .local v15, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v16, v13

    .local v16, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 87
    .local v17, "$i$f$filterTo":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    const-string v9, "pattern"

    if-eqz v19, :cond_9

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "r":Ljava/util/Map;
    const/16 v20, 0x0

    .line 58
    .local v20, "$i$a$-filter-ModelRules$resolve$1":I
    move-object/from16 v21, v0

    check-cast v21, Ljava/lang/CharSequence;

    invoke-interface/range {v21 .. v21}, Ljava/lang/CharSequence;->length()I

    move-result v21

    if-lez v21, :cond_3

    const/16 v21, 0x1

    goto :goto_4

    :cond_3
    const/16 v21, 0x0

    :goto_4
    if-eqz v21, :cond_6

    move-object/from16 v21, v0

    .end local v0    # "host":Ljava/lang/String;
    .local v21, "host":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-static {v12, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_4

    move-object v9, v4

    :cond_4
    invoke-static {v0, v9}, Lcom/pymcl/ai/ModelRules$Companion;->access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v0

    if-eqz v0, :cond_5

    move-object/from16 v9, v21

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v0, v9}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v9, 0x1

    if-ne v0, v9, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    if-eqz v0, :cond_7

    const/4 v0, 0x1

    goto :goto_6

    .end local v21    # "host":Ljava/lang/String;
    .restart local v0    # "host":Ljava/lang/String;
    :cond_6
    move-object/from16 v21, v0

    .end local v0    # "host":Ljava/lang/String;
    .restart local v21    # "host":Ljava/lang/String;
    :cond_7
    const/4 v0, 0x0

    .line 87
    .end local v12    # "r":Ljava/util/Map;
    .end local v20    # "$i$a$-filter-ModelRules$resolve$1":I
    :goto_6
    if-eqz v0, :cond_8

    invoke-interface {v15, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_8
    move-object/from16 v0, v21

    const/4 v9, 0x0

    goto :goto_3

    .line 88
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "host":Ljava/lang/String;
    .restart local v0    # "host":Ljava/lang/String;
    :cond_9
    move-object/from16 v21, v0

    .end local v0    # "host":Ljava/lang/String;
    .end local v15    # "destination$iv$iv":Ljava/util/Collection;
    .end local v16    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$filterTo":I
    .restart local v21    # "host":Ljava/lang/String;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 86
    nop

    .end local v13    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 58
    nop

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 89
    .local v11, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_7
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_a

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/util/Map;

    .local v14, "it":Ljava/util/Map;
    const/4 v15, 0x0

    .line 58
    .local v15, "$i$a$-forEach-ModelRules$resolve$2":I
    move-object/from16 v16, v0

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .local v16, "$this$forEach$iv":Ljava/lang/Iterable;
    invoke-static {v14, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v4

    const-string v4, "site:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v6, v14, v0}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    .line 89
    .end local v14    # "it":Ljava/util/Map;
    .end local v15    # "$i$a$-forEach-ModelRules$resolve$2":I
    move-object/from16 v3, p2

    move-object/from16 v0, v16

    move-object/from16 v4, v17

    .end local v13    # "element$iv":Ljava/lang/Object;
    goto :goto_7

    .line 90
    .end local v16    # "$this$forEach$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    :cond_a
    move-object/from16 v16, v0

    move-object/from16 v17, v4

    .line 59
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$forEach":I
    const-string v0, "modelApiRules"

    invoke-static {v10, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 91
    .local v3, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v0

    .local v11, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 92
    .local v12, "$i$f$filterTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_11

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/util/Map;

    .local v15, "r":Ljava/util/Map;
    const/16 v16, 0x0

    .line 59
    .local v16, "$i$a$-filter-ModelRules$resolve$3":I
    move-object/from16 v18, p2

    check-cast v18, Ljava/lang/CharSequence;

    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-lez v18, :cond_b

    const/16 v18, 0x1

    goto :goto_9

    :cond_b
    const/16 v18, 0x0

    :goto_9
    if-eqz v18, :cond_e

    move-object/from16 v18, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v18, "$this$filter$iv":Ljava/lang/Iterable;
    sget-object v0, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-static {v15, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    move/from16 v22, v3

    if-nez v20, :cond_c

    move-object/from16 v3, v17

    goto :goto_a

    :cond_c
    move-object/from16 v3, v20

    .end local v3    # "$i$f$filter":I
    .local v22, "$i$f$filter":I
    :goto_a
    invoke-static {v0, v3}, Lcom/pymcl/ai/ModelRules$Companion;->access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v0

    if-eqz v0, :cond_d

    move-object/from16 v3, p2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v0, v3}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v3, 0x1

    if-ne v0, v3, :cond_d

    const/4 v0, 0x1

    goto :goto_b

    :cond_d
    const/4 v0, 0x0

    :goto_b
    if-eqz v0, :cond_f

    const/4 v0, 0x1

    goto :goto_c

    .end local v18    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v22    # "$i$f$filter":I
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$filter":I
    :cond_e
    move-object/from16 v18, v0

    move/from16 v22, v3

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    .restart local v18    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v22    # "$i$f$filter":I
    :cond_f
    const/4 v0, 0x0

    .line 92
    .end local v15    # "r":Ljava/util/Map;
    .end local v16    # "$i$a$-filter-ModelRules$resolve$3":I
    :goto_c
    if-eqz v0, :cond_10

    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_10
    move-object/from16 v0, v18

    move/from16 v3, v22

    goto :goto_8

    .line 93
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    .end local v18    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v22    # "$i$f$filter":I
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$filter":I
    :cond_11
    move-object/from16 v18, v0

    move/from16 v22, v3

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$filterTo":I
    .restart local v18    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v22    # "$i$f$filter":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 91
    nop

    .end local v18    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v22    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 59
    nop

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 94
    .local v3, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_12

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "it":Ljava/util/Map;
    const/4 v13, 0x0

    .line 59
    .local v13, "$i$a$-forEach-ModelRules$resolve$4":I
    invoke-static {v12, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v0

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .local v16, "$this$forEach$iv":Ljava/lang/Iterable;
    const-string v0, "api:"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v6, v12, v0}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    .line 94
    .end local v12    # "it":Ljava/util/Map;
    .end local v13    # "$i$a$-forEach-ModelRules$resolve$4":I
    move-object/from16 v0, v16

    .end local v11    # "element$iv":Ljava/lang/Object;
    goto :goto_d

    .line 95
    .end local v16    # "$this$forEach$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    :cond_12
    move-object/from16 v16, v0

    .line 61
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    nop

    .line 60
    const-string v0, "modelRules"

    invoke-static {v10, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 96
    .local v3, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .restart local v11    # "element$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "r":Ljava/util/Map;
    const/4 v13, 0x0

    .line 60
    .local v13, "$i$a$-firstOrNull-ModelRules$resolve$5":I
    sget-object v14, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-static {v12, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_14

    move-object/from16 v15, v17

    :cond_14
    invoke-static {v14, v15}, Lcom/pymcl/ai/ModelRules$Companion;->access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v14

    if-eqz v14, :cond_15

    move-object v15, v7

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v14, v15}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_15

    const/4 v14, 0x1

    goto :goto_e

    :cond_15
    const/4 v14, 0x0

    :goto_e
    if-nez v14, :cond_19

    sget-object v14, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-static {v12, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_16

    move-object/from16 v15, v17

    :cond_16
    invoke-static {v14, v15}, Lcom/pymcl/ai/ModelRules$Companion;->access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v14

    if-eqz v14, :cond_17

    move-object v15, v2

    check-cast v15, Ljava/lang/CharSequence;

    invoke-virtual {v14, v15}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v14

    const/4 v15, 0x1

    if-ne v14, v15, :cond_17

    const/4 v14, 0x1

    goto :goto_f

    :cond_17
    const/4 v14, 0x0

    :goto_f
    if-eqz v14, :cond_18

    goto :goto_10

    :cond_18
    const/4 v12, 0x0

    goto :goto_11

    :cond_19
    :goto_10
    const/4 v12, 0x1

    .line 96
    .end local v12    # "r":Ljava/util/Map;
    .end local v13    # "$i$a$-firstOrNull-ModelRules$resolve$5":I
    :goto_11
    if-eqz v12, :cond_13

    goto :goto_12

    .line 97
    .end local v11    # "element$iv":Ljava/lang/Object;
    :cond_1a
    const/4 v11, 0x0

    .line 60
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull":I
    :goto_12
    check-cast v11, Ljava/util/Map;

    .line 61
    if-eqz v11, :cond_1b

    .line 60
    nop

    .line 61
    nop

    .line 85
    .local v11, "it":Ljava/util/Map;
    const/4 v0, 0x0

    .line 61
    .local v0, "$i$a$-let-ModelRules$resolve$6":I
    invoke-static {v11, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "model:"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v6, v11, v3}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    move-object/from16 v3, p2

    move-object/from16 v4, v17

    move-object/from16 v0, v21

    const/4 v9, 0x0

    .end local v0    # "$i$a$-let-ModelRules$resolve$6":I
    .end local v11    # "it":Ljava/util/Map;
    goto/16 :goto_2

    :cond_1b
    move-object/from16 v3, p2

    move-object/from16 v4, v17

    move-object/from16 v0, v21

    const/4 v9, 0x0

    .end local v10    # "t":Ljava/util/Map;
    goto/16 :goto_2

    .line 64
    .end local v21    # "host":Ljava/lang/String;
    .local v0, "host":Ljava/lang/String;
    :cond_1c
    move-object/from16 v21, v0

    .end local v0    # "host":Ljava/lang/String;
    .restart local v21    # "host":Ljava/lang/String;
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 98
    .local v3, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v0

    .local v8, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 99
    .local v9, "$i$f$filterTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_13
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_24

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map$Entry;

    const/4 v13, 0x0

    .local v13, "$i$a$-filter-ModelRules$resolve$ov$1":I
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    .line 64
    .local v12, "v":Ljava/lang/Object;
    instance-of v15, v12, Ljava/util/Map;

    if-eqz v15, :cond_21

    const/4 v15, 0x1

    invoke-static {v14, v2, v15}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v16

    if-nez v16, :cond_21

    sget-object v15, Lcom/pymcl/ai/ModelRules;->Companion:Lcom/pymcl/ai/ModelRules$Companion;

    invoke-static {v15, v14}, Lcom/pymcl/ai/ModelRules$Companion;->access$rx(Lcom/pymcl/ai/ModelRules$Companion;Ljava/lang/String;)Lkotlin/text/Regex;

    move-result-object v15

    if-eqz v15, :cond_1f

    .line 85
    .local v15, "r":Lkotlin/text/Regex;
    const/16 v16, 0x0

    .line 64
    .local v16, "$i$a$-let-ModelRules$resolve$ov$1$1":I
    move-object/from16 v17, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v17, "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v15, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1e

    move-object v0, v7

    check-cast v0, Ljava/lang/CharSequence;

    invoke-virtual {v15, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_14

    :cond_1d
    const/4 v0, 0x0

    goto :goto_15

    :cond_1e
    :goto_14
    const/4 v0, 0x1

    .end local v15    # "r":Lkotlin/text/Regex;
    .end local v16    # "$i$a$-let-ModelRules$resolve$ov$1$1":I
    :goto_15
    const/4 v15, 0x1

    if-ne v0, v15, :cond_20

    const/4 v0, 0x1

    goto :goto_16

    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_1f
    move-object/from16 v17, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_20
    const/4 v0, 0x0

    :goto_16
    if-eqz v0, :cond_22

    const/4 v0, 0x1

    goto :goto_17

    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_21
    move-object/from16 v17, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_22
    const/4 v0, 0x0

    .line 99
    .end local v12    # "v":Ljava/lang/Object;
    .end local v13    # "$i$a$-filter-ModelRules$resolve$ov$1":I
    .end local v14    # "k":Ljava/lang/String;
    :goto_17
    if-eqz v0, :cond_23

    invoke-interface {v4, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_23
    move-object/from16 v0, v17

    goto :goto_13

    .line 100
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_24
    move-object/from16 v17, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo":I
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 98
    nop

    .line 64
    .end local v3    # "$i$f$filter":I
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .line 65
    .local v0, "ov":Ljava/util/List;
    move-object v3, v0

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 101
    .local v4, "$i$f$forEach":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_18
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "override:"

    if-eqz v9, :cond_25

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Ljava/util/Map$Entry;

    const/4 v12, 0x0

    .local v12, "$i$a$-forEach-ModelRules$resolve$7":I
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "k":Ljava/lang/String;
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    .line 65
    .local v11, "v":Ljava/lang/Object;
    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v14

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v6, v14, v10}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    .line 101
    .end local v11    # "v":Ljava/lang/Object;
    .end local v12    # "$i$a$-forEach-ModelRules$resolve$7":I
    .end local v13    # "k":Ljava/lang/String;
    nop

    .end local v9    # "element$iv":Ljava/lang/Object;
    goto :goto_18

    .line 102
    :cond_25
    nop

    .line 66
    .end local v3    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEach":I
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 103
    .local v4, "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_26
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .restart local v9    # "element$iv":Ljava/lang/Object;
    move-object v11, v9

    check-cast v11, Ljava/util/Map$Entry;

    const/4 v12, 0x0

    .local v12, "$i$a$-firstOrNull-ModelRules$resolve$8":I
    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .restart local v13    # "k":Ljava/lang/String;
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    .line 66
    .restart local v11    # "v":Ljava/lang/Object;
    instance-of v14, v11, Ljava/util/Map;

    if-eqz v14, :cond_27

    const/4 v15, 0x1

    invoke-static {v13, v2, v15}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v14

    if-eqz v14, :cond_28

    move v11, v15

    goto :goto_19

    :cond_27
    const/4 v15, 0x1

    :cond_28
    const/4 v11, 0x0

    .line 103
    .end local v11    # "v":Ljava/lang/Object;
    .end local v12    # "$i$a$-firstOrNull-ModelRules$resolve$8":I
    .end local v13    # "k":Ljava/lang/String;
    :goto_19
    if-eqz v11, :cond_26

    goto :goto_1a

    .line 104
    .end local v9    # "element$iv":Ljava/lang/Object;
    :cond_29
    const/4 v9, 0x0

    .line 66
    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$firstOrNull":I
    :goto_1a
    check-cast v9, Ljava/util/Map$Entry;

    if-eqz v9, :cond_2a

    .line 85
    const/4 v3, 0x0

    .local v3, "$i$a$-let-ModelRules$resolve$9":I
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "k":Ljava/lang/String;
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    .line 66
    .local v8, "v":Ljava/lang/Object;
    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v6, v9, v10}, Lcom/pymcl/ai/ModelRules;->apply(Lcom/pymcl/ai/ModelCaps;Ljava/util/Map;Ljava/lang/String;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v6

    move-object v8, v6

    .end local v3    # "$i$a$-let-ModelRules$resolve$9":I
    .end local v4    # "k":Ljava/lang/String;
    .end local v8    # "v":Ljava/lang/Object;
    goto :goto_1b

    :cond_2a
    move-object v8, v6

    .line 67
    .end local v6    # "c":Ljava/lang/Object;
    .local v8, "c":Ljava/lang/Object;
    :goto_1b
    invoke-virtual {v8}, Lcom/pymcl/ai/ModelCaps;->getContextWindow()I

    move-result v3

    const/16 v4, 0x7d0

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v9

    invoke-virtual {v8}, Lcom/pymcl/ai/ModelCaps;->getMaxOutput()I

    move-result v3

    const/16 v4, 0x40

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v10

    const/16 v16, 0x7c

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v8 .. v17}, Lcom/pymcl/ai/ModelCaps;->copy$default(Lcom/pymcl/ai/ModelCaps;IIZZZZLjava/util/List;ILjava/lang/Object;)Lcom/pymcl/ai/ModelCaps;

    move-result-object v3

    return-object v3
.end method
