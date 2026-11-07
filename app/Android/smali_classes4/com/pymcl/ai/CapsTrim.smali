.class public final Lcom/pymcl/ai/CapsTrim;
.super Ljava/lang/Object;
.source "ModelRules.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModelRules.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelRules.kt\ncom/pymcl/ai/CapsTrim\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n2945#2,3:85\n1#3:88\n*S KotlinDebug\n*F\n+ 1 ModelRules.kt\ncom/pymcl/ai/CapsTrim\n*L\n79#1:85,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ:\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\u000e2\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/ai/CapsTrim;",
        "",
        "<init>",
        "()V",
        "contextWindow",
        "",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "caps",
        "Lcom/pymcl/ai/ModelCaps;",
        "maxTokens",
        "stripImages",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "msg",
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
.field public static final INSTANCE:Lcom/pymcl/ai/CapsTrim;


# direct methods
.method public static synthetic $r8$lambda$65TPYaU6HCBN4qkbM1hRFJ4j7Yw(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/CapsTrim;->stripImages$lambda$1(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/CapsTrim;

    invoke-direct {v0}, Lcom/pymcl/ai/CapsTrim;-><init>()V

    sput-object v0, Lcom/pymcl/ai/CapsTrim;->INSTANCE:Lcom/pymcl/ai/CapsTrim;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final stripImages$lambda$1(Ljava/lang/Object;)Ljava/lang/CharSequence;
    .locals 3
    .param p0, "p"    # Ljava/lang/Object;

    .line 80
    invoke-static {p0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    .local v0, "o":Ljava/util/Map;
    if-eqz v0, :cond_0

    const-string v1, "type"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "image_url"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "[\u56fe\u7247\u5df2\u7701\u7565\uff1a\u5f53\u524d\u6a21\u578b\u4e0d\u652f\u6301\u56fe\u7247]"

    :cond_1
    :goto_1
    check-cast v1, Ljava/lang/CharSequence;

    goto :goto_2

    :cond_2
    if-eqz v0, :cond_3

    const-string v1, "text"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_3
    const-string v1, ""

    goto :goto_1

    :goto_2
    return-object v1
.end method


# virtual methods
.method public final contextWindow(Lcom/pymcl/ai/AiSettings;Lcom/pymcl/ai/ModelCaps;)I
    .locals 2
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "caps"    # Lcom/pymcl/ai/ModelCaps;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "caps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getContextWindow()I

    move-result v0

    invoke-virtual {p2}, Lcom/pymcl/ai/ModelCaps;->getContextWindow()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/16 v1, 0xfa0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    return v0
.end method

.method public final maxTokens(Lcom/pymcl/ai/AiSettings;Lcom/pymcl/ai/ModelCaps;)I
    .locals 2
    .param p1, "st"    # Lcom/pymcl/ai/AiSettings;
    .param p2, "caps"    # Lcom/pymcl/ai/ModelCaps;

    const-string v0, "st"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "caps"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p1}, Lcom/pymcl/ai/AiSettings;->getMaxTokens()I

    move-result v0

    invoke-virtual {p2}, Lcom/pymcl/ai/ModelCaps;->getMaxOutput()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0
.end method

.method public final stripImages(Ljava/util/Map;Lcom/pymcl/ai/ModelCaps;)Ljava/util/Map;
    .locals 18
    .param p1, "msg"    # Ljava/util/Map;
    .param p2, "caps"    # Lcom/pymcl/ai/ModelCaps;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/pymcl/ai/ModelCaps;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "msg"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "caps"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {v2}, Lcom/pymcl/ai/ModelCaps;->getSupportsImages()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 78
    :cond_0
    const-string v1, "content"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/util/List;

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    check-cast v3, Ljava/util/List;

    goto :goto_0

    :cond_1
    move-object v3, v5

    :goto_0
    if-nez v3, :cond_2

    return-object v0

    .line 79
    .local v3, "parts":Ljava/util/List;
    :cond_2
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 85
    .local v6, "$i$f$none":I
    instance-of v7, v4, Ljava/util/Collection;

    const/4 v8, 0x1

    if-eqz v7, :cond_3

    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_3

    .line 86
    :cond_3
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 79
    .local v11, "$i$a$-none-CapsTrim$stripImages$1":I
    instance-of v12, v10, Ljava/util/Map;

    if-eqz v12, :cond_5

    move-object v12, v10

    check-cast v12, Ljava/util/Map;

    goto :goto_1

    :cond_5
    move-object v12, v5

    :goto_1
    if-eqz v12, :cond_6

    const-string v13, "type"

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    goto :goto_2

    :cond_6
    move-object v12, v5

    :goto_2
    const-string v13, "image_url"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 86
    .end local v10    # "it":Ljava/lang/Object;
    .end local v11    # "$i$a$-none-CapsTrim$stripImages$1":I
    if-eqz v10, :cond_4

    const/4 v8, 0x0

    goto :goto_3

    .line 87
    .end local v9    # "element$iv":Ljava/lang/Object;
    :cond_7
    nop

    .line 79
    .end local v4    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$none":I
    :goto_3
    if-eqz v8, :cond_8

    return-object v0

    .line 80
    :cond_8
    move-object v9, v3

    check-cast v9, Ljava/lang/Iterable;

    const-string v4, "\n"

    move-object v10, v4

    check-cast v10, Ljava/lang/CharSequence;

    new-instance v15, Lcom/pymcl/ai/CapsTrim$$ExternalSyntheticLambda0;

    invoke-direct {v15}, Lcom/pymcl/ai/CapsTrim$$ExternalSyntheticLambda0;-><init>()V

    const/16 v16, 0x1e

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 81
    .local v4, "text":Ljava/lang/String;
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    move-object v6, v5

    .line 88
    .local v6, "it":Ljava/util/LinkedHashMap;
    const/4 v7, 0x0

    .line 81
    .local v7, "$i$a$-also-CapsTrim$stripImages$2":I
    move-object v8, v6

    check-cast v8, Ljava/util/Map;

    invoke-interface {v8, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v6    # "it":Ljava/util/LinkedHashMap;
    .end local v7    # "$i$a$-also-CapsTrim$stripImages$2":I
    check-cast v5, Ljava/util/Map;

    return-object v5
.end method
