.class public final Lcom/pymcl/ai/ToolSchemas;
.super Ljava/lang/Object;
.source "AiAgent.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiAgent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiAgent.kt\ncom/pymcl/ai/ToolSchemas\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,409:1\n777#2:410\n873#2,2:411\n1795#2,10:414\n2068#2:424\n2069#2:426\n1805#2:427\n1#3:413\n1#3:425\n*S KotlinDebug\n*F\n+ 1 AiAgent.kt\ncom/pymcl/ai/ToolSchemas\n*L\n23#1:410\n23#1:411,2\n22#1:414,10\n22#1:424\n22#1:426\n22#1:427\n22#1:425\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\u0010R#\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R!\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000c\u0010\u0007R#\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\t\u001a\u0004\u0008\u0013\u0010\u0007\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/ai/ToolSchemas;",
        "",
        "<init>",
        "()V",
        "ALL",
        "",
        "getALL",
        "()Ljava/util/List;",
        "ALL$delegate",
        "Lkotlin/Lazy;",
        "NAMES",
        "",
        "getNAMES",
        "NAMES$delegate",
        "subset",
        "pred",
        "Lkotlin/Function1;",
        "",
        "SUBAGENT",
        "getSUBAGENT",
        "SUBAGENT$delegate",
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
.field private static final ALL$delegate:Lkotlin/Lazy;

.field public static final INSTANCE:Lcom/pymcl/ai/ToolSchemas;

.field private static final NAMES$delegate:Lkotlin/Lazy;

.field private static final SUBAGENT$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$PqgqvLjarRXM1fTGlBrz9Hk4eRQ()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/ToolSchemas;->ALL_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$ZmQ6xJCg8gABQXsVYxA13C965hU()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/ToolSchemas;->SUBAGENT_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$xw9Mgws5B3HOkiIgPSm1vdSVGwQ()Ljava/util/List;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/ToolSchemas;->NAMES_delegate$lambda$0()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$zWDNuH-q9q8qWXH8ojl4xUxrc04(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/ToolSchemas;->SUBAGENT_delegate$lambda$0$0(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/ToolSchemas;

    invoke-direct {v0}, Lcom/pymcl/ai/ToolSchemas;-><init>()V

    sput-object v0, Lcom/pymcl/ai/ToolSchemas;->INSTANCE:Lcom/pymcl/ai/ToolSchemas;

    .line 18
    new-instance v0, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/ToolSchemas;->ALL$delegate:Lkotlin/Lazy;

    .line 22
    new-instance v0, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/ToolSchemas;->NAMES$delegate:Lkotlin/Lazy;

    .line 25
    new-instance v0, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda3;

    invoke-direct {v0}, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/ToolSchemas;->SUBAGENT$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final ALL_delegate$lambda$0()Ljava/util/List;
    .locals 6

    .line 19
    const-class v0, Lcom/pymcl/ai/ToolSchemas;

    const-string v1, "/pymcl_ai/tool_schemas.json"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/InputStream;

    .line 413
    .local v1, "it":Ljava/io/InputStream;
    const/4 v2, 0x0

    .local v2, "$i$a$-use-ToolSchemas$ALL$2$txt$1":I
    new-instance v3, Ljava/lang/String;

    .line 19
    invoke-static {v1}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v4

    sget-object v5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v4, v5}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v1    # "it":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-ToolSchemas$ALL$2$txt$1":I
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 20
    .local v3, "txt":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/List;

    return-object v0

    .line 19
    .end local v3    # "txt":Ljava/lang/String;
    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private static final NAMES_delegate$lambda$0()Ljava/util/List;
    .locals 15

    .line 22
    sget-object v0, Lcom/pymcl/ai/ToolSchemas;->INSTANCE:Lcom/pymcl/ai/ToolSchemas;

    invoke-virtual {v0}, Lcom/pymcl/ai/ToolSchemas;->getALL()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 414
    .local v1, "$i$f$mapNotNull":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 423
    .local v4, "$i$f$mapNotNullTo":I
    move-object v5, v3

    .local v5, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 424
    .local v6, "$i$f$forEach":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "element$iv$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 423
    .local v10, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v11, v9

    .local v11, "it":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 22
    .local v12, "$i$a$-mapNotNull-ToolSchemas$NAMES$2$1":I
    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v13

    const-string v14, "function"

    invoke-static {v13, v14}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const-string v14, "name"

    invoke-static {v13, v14}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 423
    .end local v11    # "it":Ljava/lang/Object;
    .end local v12    # "$i$a$-mapNotNull-ToolSchemas$NAMES$2$1":I
    if-eqz v11, :cond_0

    .line 425
    .local v11, "it$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 423
    .local v12, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 424
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v11    # "it$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_0
    nop

    .end local v8    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 426
    :cond_1
    nop

    .line 427
    .end local v5    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEach":I
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNullTo":I
    check-cast v2, Ljava/util/List;

    .line 414
    nop

    .line 22
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull":I
    return-object v2
.end method

.method private static final SUBAGENT_delegate$lambda$0()Ljava/util/List;
    .locals 2

    .line 25
    sget-object v0, Lcom/pymcl/ai/ToolSchemas;->INSTANCE:Lcom/pymcl/ai/ToolSchemas;

    new-instance v1, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/pymcl/ai/ToolSchemas$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/ToolSchemas;->subset(Lkotlin/jvm/functions/Function1;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final SUBAGENT_delegate$lambda$0$0(Ljava/lang/String;)Z
    .locals 5
    .param p0, "n"    # Ljava/lang/String;

    const-string v0, "n"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget-object v0, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    invoke-virtual {v0, p0}, Lcom/pymcl/ai/ToolMetas;->of(Ljava/lang/String;)Lcom/pymcl/ai/ToolMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/ToolMeta;->getReadonly()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "ask_user"

    aput-object v2, v0, v1

    const-string v2, "update_plan"

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    const-string v4, "dispatch_subagent"

    aput-object v4, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    move v1, v3

    :cond_0
    return v1
.end method


# virtual methods
.method public final getALL()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 18
    sget-object v0, Lcom/pymcl/ai/ToolSchemas;->ALL$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getNAMES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 22
    sget-object v0, Lcom/pymcl/ai/ToolSchemas;->NAMES$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final getSUBAGENT()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 25
    sget-object v0, Lcom/pymcl/ai/ToolSchemas;->SUBAGENT$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method public final subset(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 11
    .param p1, "pred"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "pred"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p0}, Lcom/pymcl/ai/ToolSchemas;->getALL()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 410
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 411
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    .local v7, "it":Ljava/lang/Object;
    const/4 v8, 0x0

    .line 23
    .local v8, "$i$a$-filter-ToolSchemas$subset$1":I
    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    const-string v10, "function"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    const-string v10, "name"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    const-string v9, ""

    :cond_1
    invoke-interface {p1, v9}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    .line 411
    .end local v7    # "it":Ljava/lang/Object;
    .end local v8    # "$i$a$-filter-ToolSchemas$subset$1":I
    if-eqz v7, :cond_0

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 412
    .end local v6    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 410
    nop

    .line 23
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    return-object v2
.end method
