.class public final Lcom/pymcl/ai/AiSettings$Companion;
.super Ljava/lang/Object;
.source "AiSettings.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/ai/AiSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSettings.kt\ncom/pymcl/ai/AiSettings$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n1358#3,2:181\n1435#3,4:183\n*S KotlinDebug\n*F\n+ 1 AiSettings.kt\ncom/pymcl/ai/AiSettings$Companion\n*L\n44#1:181,2\n44#1:183,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\u000b2\u0014\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0008R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/ai/AiSettings$Companion;",
        "",
        "<init>",
        "()V",
        "FALLBACK_KEY",
        "",
        "GATEWAY_KEY",
        "MIN_CONTEXT",
        "",
        "MAX_CONTEXT",
        "from",
        "Lcom/pymcl/ai/AiSettings;",
        "cfg",
        "",
        "normalizeMode",
        "m",
        "clampContext",
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

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/ai/AiSettings$Companion;-><init>()V

    return-void
.end method

.method private static final from$i(Ljava/util/Map;Ljava/lang/String;I)I
    .locals 10
    .param p0, "$cfg"    # Ljava/util/Map;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "d"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "I)I"
        }
    .end annotation

    .line 35
    nop

    .line 36
    nop

    .line 35
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 180
    .local v0, "it":Ljava/lang/Number;
    const/4 v1, 0x0

    .line 35
    .local v1, "$i$a$-let-AiSettings$Companion$from$i$1":I
    instance-of v2, v0, Ljava/lang/Double;

    if-nez v2, :cond_2

    instance-of v2, v0, Ljava/lang/Float;

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    const-wide/high16 v6, -0x3e20000000000000L    # -2.147483648E9

    const-wide v8, 0x41dfffffffc00000L    # 2.147483647E9

    invoke-static/range {v4 .. v9}, Lkotlin/ranges/RangesKt;->coerceIn(DDD)D

    move-result-wide v2

    double-to-long v2, v2

    .end local v0    # "it":Ljava/lang/Number;
    .end local v1    # "$i$a$-let-AiSettings$Companion$from$i$1":I
    :goto_2
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_4

    .line 36
    :cond_3
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_4

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    :cond_4
    move-object v0, v2

    :goto_3
    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    .line 35
    :cond_5
    :goto_4
    nop

    .line 36
    if-eqz v2, :cond_6

    .line 35
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    .line 36
    const-wide/32 v5, -0x80000000

    const-wide/32 v7, 0x7fffffff

    invoke-static/range {v3 .. v8}, Lkotlin/ranges/RangesKt;->coerceIn(JJJ)J

    move-result-wide v0

    .line 35
    nop

    .line 36
    long-to-int v0, v0

    .line 35
    goto :goto_5

    .line 36
    :cond_6
    move v0, p2

    :goto_5
    return v0
.end method

.method private static final from$s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p0, "$cfg"    # Ljava/util/Map;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "d"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 34
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    move-object v0, p2

    :cond_1
    return-object v0
.end method

.method static synthetic from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 34
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/AiSettings$Companion;->from$s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final clampContext(I)I
    .locals 2
    .param p1, "v"    # I

    .line 49
    const/16 v0, 0xfa0

    const v1, 0x989680

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    return v0
.end method

.method public final from(Ljava/util/Map;)Lcom/pymcl/ai/AiSettings;
    .locals 26
    .param p1, "cfg"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/ai/AiSettings;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "cfg"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v1, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    const-string v2, "ai_mode"

    const-string v3, "custom"

    invoke-static {v0, v2, v3}, Lcom/pymcl/ai/AiSettings$Companion;->from$s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "ai_base_url"

    const/4 v4, 0x0

    const/4 v5, 0x4

    invoke-static {v0, v3, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v6, "ai_api_key"

    invoke-static {v0, v6, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "ai_gateway_url"

    invoke-static {v0, v8, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v2, v3, v7, v8}, Lcom/pymcl/ai/AiMode;->migrate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AiMode$Migrated;

    move-result-object v1

    .line 38
    .local v1, "m":Lcom/pymcl/ai/AiMode$Migrated;
    nop

    .line 39
    invoke-virtual {v1}, Lcom/pymcl/ai/AiMode$Migrated;->getMode()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/pymcl/ai/AiMode$Migrated;->getGatewayUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/pymcl/ai/AiMode$Migrated;->getBaseUrl()Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v6, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "ai_gateway_key"

    invoke-static {v0, v2, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    .line 40
    const-string v2, "ai_model"

    invoke-static {v0, v2, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 180
    const/4 v2, 0x0

    .line 40
    .local v2, "$i$a$-ifBlank-AiSettings$Companion$from$1":I
    nop

    .end local v2    # "$i$a$-ifBlank-AiSettings$Companion$from$1":I
    const-string v2, "deepseek-v4-flash"

    :cond_0
    move-object v13, v2

    check-cast v13, Ljava/lang/String;

    const-string v2, "ai_fallback_model"

    invoke-static {v0, v2, v4, v5, v4}, Lcom/pymcl/ai/AiSettings$Companion;->from$s$default(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v14

    .line 41
    const-string v2, "ai_context_window"

    const v3, 0x30d40

    invoke-static {v0, v2, v3}, Lcom/pymcl/ai/AiSettings$Companion;->from$i(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v2

    move-object/from16 v3, p0

    invoke-virtual {v3, v2}, Lcom/pymcl/ai/AiSettings$Companion;->clampContext(I)I

    move-result v15

    const-string v2, "ai_max_tokens"

    const/16 v5, 0x2000

    invoke-static {v0, v2, v5}, Lcom/pymcl/ai/AiSettings$Companion;->from$i(Ljava/util/Map;Ljava/lang/String;I)I

    move-result v2

    const/16 v5, 0x100

    const v6, 0x1f400

    invoke-static {v2, v5, v6}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v16

    .line 42
    sget-object v2, Lcom/pymcl/ai/Permission;->INSTANCE:Lcom/pymcl/ai/Permission;

    const-string v5, "ai_permission_mode"

    const-string v6, "default"

    invoke-static {v0, v5, v6}, Lcom/pymcl/ai/AiSettings$Companion;->from$s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ai_confirm_writes"

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Ljava/lang/Boolean;

    if-eqz v7, :cond_1

    check-cast v6, Ljava/lang/Boolean;

    goto :goto_0

    :cond_1
    move-object v6, v4

    :goto_0
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x1

    :goto_1
    invoke-virtual {v2, v5, v6}, Lcom/pymcl/ai/Permission;->migrateMode(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v17

    .line 38
    nop

    .line 43
    const-string v2, "language"

    const-string v5, "zh_CN"

    invoke-static {v0, v2, v5}, Lcom/pymcl/ai/AiSettings$Companion;->from$s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    .line 44
    const-string v2, "ai_model_caps_overrides"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_3

    move-object v4, v2

    check-cast v4, Ljava/util/Map;

    :cond_3
    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    if-eqz v2, :cond_5

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 181
    .local v4, "$i$f$associate":I
    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 182
    .local v5, "capacity$iv":I
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v6, Ljava/util/Map;

    .local v6, "destination$iv$iv":Ljava/util/Map;
    move-object v7, v2

    .local v7, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 183
    .local v18, "$i$f$associateTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_4

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 184
    .local v21, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v21

    check-cast v22, Ljava/util/Map$Entry;

    const/16 v23, 0x0

    .local v23, "$i$a$-associate-AiSettings$Companion$from$2":I
    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v24

    .local v24, "k":Ljava/lang/Object;
    invoke-interface/range {v22 .. v22}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 44
    .local v0, "v":Ljava/lang/Object;
    move-object/from16 v25, v1

    .end local v1    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    .local v25, "m":Lcom/pymcl/ai/AiMode$Migrated;
    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 184
    .end local v0    # "v":Ljava/lang/Object;
    .end local v23    # "$i$a$-associate-AiSettings$Companion$from$2":I
    .end local v24    # "k":Ljava/lang/Object;
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    move-object/from16 v1, v25

    goto :goto_2

    .line 186
    .end local v21    # "element$iv$iv":Ljava/lang/Object;
    .end local v25    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    .restart local v1    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    :cond_4
    move-object/from16 v25, v1

    .line 182
    .end local v1    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    .end local v6    # "destination$iv$iv":Ljava/util/Map;
    .end local v7    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$associateTo":I
    .restart local v25    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    nop

    .line 44
    .end local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$associate":I
    .end local v5    # "capacity$iv":I
    goto :goto_3

    .end local v25    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    .restart local v1    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    :cond_5
    move-object/from16 v25, v1

    .end local v1    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    .restart local v25    # "m":Lcom/pymcl/ai/AiMode$Migrated;
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v6

    :goto_3
    move-object/from16 v21, v6

    .line 38
    new-instance v7, Lcom/pymcl/ai/AiSettings;

    const-wide/16 v18, 0x0

    const/16 v22, 0x400

    const/16 v23, 0x0

    invoke-direct/range {v7 .. v23}, Lcom/pymcl/ai/AiSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;DLjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final normalizeMode(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "m"    # Ljava/lang/String;

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    sget-object v0, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    invoke-virtual {v0, p1}, Lcom/pymcl/ai/AiMode;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
