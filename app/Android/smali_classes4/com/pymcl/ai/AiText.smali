.class public final Lcom/pymcl/ai/AiText;
.super Ljava/lang/Object;
.source "AiText.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiText.kt\ncom/pymcl/ai/AiText\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n15166#2,3:49\n1#3:52\n1358#4,2:53\n1435#4,4:55\n*S KotlinDebug\n*F\n+ 1 AiText.kt\ncom/pymcl/ai/AiText\n*L\n27#1:49,3\n21#1:53,2\n21#1:55,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0002\u0008\t\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0010\u0010\u0014\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u0015\u00a2\u0006\u0002\u0010\u0016J+\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0016\u0010\u0014\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0016J3\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\r2\u0016\u0010\u0014\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010\u00010\u0015\"\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u0006R \u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\'\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000c8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/pymcl/ai/AiText;",
        "",
        "<init>",
        "()V",
        "english",
        "Lkotlin/Function0;",
        "",
        "getEnglish",
        "()Lkotlin/jvm/functions/Function0;",
        "setEnglish",
        "(Lkotlin/jvm/functions/Function0;)V",
        "EN",
        "",
        "",
        "getEN",
        "()Ljava/util/Map;",
        "EN$delegate",
        "Lkotlin/Lazy;",
        "format",
        "base",
        "args",
        "",
        "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
        "t",
        "zh",
        "tIn",
        "en",
        "(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;",
        "display",
        "stored",
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
.field private static final EN$delegate:Lkotlin/Lazy;

.field public static final INSTANCE:Lcom/pymcl/ai/AiText;

.field private static volatile english:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$y2lQ-OxUmoZnQXq4J7stCugq_Mc()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/AiText;->english$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$zkCX_9xf3Jg6TDdtI4XPWke3agE()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/pymcl/ai/AiText;->EN_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/ai/AiText;

    invoke-direct {v0}, Lcom/pymcl/ai/AiText;-><init>()V

    sput-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    .line 16
    new-instance v0, Lcom/pymcl/ai/AiText$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/ai/AiText$$ExternalSyntheticLambda0;-><init>()V

    sput-object v0, Lcom/pymcl/ai/AiText;->english:Lkotlin/jvm/functions/Function0;

    .line 18
    new-instance v0, Lcom/pymcl/ai/AiText$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/pymcl/ai/AiText$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/AiText;->EN$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final EN_delegate$lambda$0()Ljava/util/Map;
    .locals 16

    .line 19
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .local v0, "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    const/4 v1, 0x0

    .line 20
    .local v1, "$i$a$-runCatching-AiText$EN$2$1":I
    const-class v2, Lcom/pymcl/ai/AiText;

    const-string v3, "/pymcl_ai/strings_en.json"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v2, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v3, v2

    check-cast v3, Ljava/io/InputStream;

    .line 52
    .local v3, "it":Ljava/io/InputStream;
    const/4 v4, 0x0

    .local v4, "$i$a$-use-AiText$EN$2$1$txt$1":I
    new-instance v5, Ljava/lang/String;

    .line 20
    invoke-static {v3}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v6

    sget-object v7, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v5, v6, v7}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v3    # "it":Ljava/io/InputStream;
    .end local v4    # "$i$a$-use-AiText$EN$2$1$txt$1":I
    const/4 v3, 0x0

    :try_start_2
    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 21
    .local v5, "txt":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, v5}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 53
    .local v4, "$i$f$associate":I
    const/16 v6, 0xa

    invoke-static {v2, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v6

    const/16 v7, 0x10

    invoke-static {v6, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v6

    .line 54
    .local v6, "capacity$iv":I
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v7, Ljava/util/Map;

    .local v7, "destination$iv$iv":Ljava/util/Map;
    move-object v8, v2

    .local v8, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 55
    .local v9, "$i$f$associateTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 56
    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map$Entry;

    const/4 v13, 0x0

    .local v13, "$i$a$-associate-AiText$EN$2$1$1":I
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v12

    .line 21
    .local v12, "v":Ljava/lang/Object;
    instance-of v15, v12, Ljava/lang/String;

    if-eqz v15, :cond_0

    move-object v15, v12

    check-cast v15, Ljava/lang/String;

    goto :goto_1

    :cond_0
    move-object v15, v3

    :goto_1
    if-nez v15, :cond_1

    move-object v15, v14

    :cond_1
    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v15

    .line 56
    .end local v12    # "v":Ljava/lang/Object;
    .end local v13    # "$i$a$-associate-AiText$EN$2$1$1":I
    .end local v14    # "k":Ljava/lang/String;
    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v7, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 58
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .line 54
    .end local v7    # "destination$iv$iv":Ljava/util/Map;
    .end local v8    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$associateTo":I
    nop

    .line 21
    .end local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$associate":I
    .end local v6    # "capacity$iv":I
    nop

    .line 19
    .end local v0    # "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    .end local v1    # "$i$a$-runCatching-AiText$EN$2$1":I
    .end local v5    # "txt":Ljava/lang/String;
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    .line 20
    .restart local v0    # "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    .restart local v1    # "$i$a$-runCatching-AiText$EN$2$1":I
    :catchall_0
    move-exception v3

    .end local v0    # "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    .end local v1    # "$i$a$-runCatching-AiText$EN$2$1":I
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v0    # "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    .restart local v1    # "$i$a$-runCatching-AiText$EN$2$1":I
    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 19
    .end local v0    # "$this$EN_delegate_u24lambda_u240_u240":Lcom/pymcl/ai/AiText;
    .end local v1    # "$i$a$-runCatching-AiText$EN$2$1":I
    :catchall_2
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 22
    :goto_2
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    :cond_3
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic display$default(Lcom/pymcl/ai/AiText;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 40
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lcom/pymcl/ai/AiText;->english:Lkotlin/jvm/functions/Function0;

    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/AiText;->display(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final english$lambda$0()Z
    .locals 1

    .line 16
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final display(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 8
    .param p1, "stored"    # Ljava/lang/String;
    .param p2, "en"    # Z

    const-string v0, "stored"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    if-eqz p2, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p0}, Lcom/pymcl/ai/AiText;->getEN()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 52
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 42
    .local v1, "$i$a$-let-AiText$display$1":I
    return-object v0

    .line 43
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiText$display$1":I
    :cond_2
    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const v3, 0xff1a

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v0

    .line 44
    .local v0, "i":I
    if-lez v0, :cond_3

    invoke-virtual {p0}, Lcom/pymcl/ai/AiText;->getEN()Ljava/util/Map;

    move-result-object v2

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {p1, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v3, "substring(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 52
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 44
    .local v2, "$i$a$-let-AiText$display$2":I
    add-int/lit8 v4, v0, 0x1

    invoke-virtual {p1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3

    .line 45
    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-AiText$display$2":I
    :cond_3
    return-object p1

    .line 41
    .end local v0    # "i":I
    :cond_4
    :goto_1
    return-object p1
.end method

.method public final format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 17
    .param p1, "base"    # Ljava/lang/String;
    .param p2, "args"    # [Ljava/lang/Object;

    const-string v0, "base"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x0

    .local v0, "s":Ljava/lang/Object;
    move-object/from16 v0, p1

    .line 27
    move-object/from16 v3, p2

    .local v3, "$this$forEachIndexed$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 49
    .local v4, "$i$f$forEachIndexed":I
    const/4 v5, 0x0

    .line 50
    .local v5, "index$iv":I
    array-length v6, v3

    const/4 v7, 0x0

    move-object v8, v0

    .end local v0    # "s":Ljava/lang/Object;
    .local v8, "s":Ljava/lang/Object;
    :goto_0
    if-ge v7, v6, :cond_2

    aget-object v0, v3, v7

    .local v0, "item$iv":Ljava/lang/Object;
    add-int/lit8 v14, v5, 0x1

    .local v5, "i":I
    .local v14, "index$iv":I
    move-object v15, v0

    .local v15, "a":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 27
    .local v16, "$i$a$-forEachIndexed-AiText$format$1":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "{"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "}"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    if-eqz v15, :cond_0

    invoke-virtual {v15}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_1

    :cond_0
    const-string v10, ""

    :cond_1
    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 50
    .end local v5    # "i":I
    .end local v15    # "a":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-AiText$format$1":I
    nop

    .end local v0    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    move v5, v14

    goto :goto_0

    .line 51
    .end local v14    # "index$iv":I
    .local v5, "index$iv":I
    :cond_2
    nop

    .line 28
    .end local v3    # "$this$forEachIndexed$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$forEachIndexed":I
    .end local v5    # "index$iv":I
    return-object v8
.end method

.method public final getEN()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 18
    sget-object v0, Lcom/pymcl/ai/AiText;->EN$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final getEnglish()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 16
    sget-object v0, Lcom/pymcl/ai/AiText;->english:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final setEnglish(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    sput-object p1, Lcom/pymcl/ai/AiText;->english:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final varargs t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2
    .param p1, "zh"    # Ljava/lang/String;
    .param p2, "args"    # [Ljava/lang/Object;

    const-string v0, "zh"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    sget-object v0, Lcom/pymcl/ai/AiText;->english:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, p1, v1}, Lcom/pymcl/ai/AiText;->tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final varargs tIn(ZLjava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1
    .param p1, "en"    # Z
    .param p2, "zh"    # Ljava/lang/String;
    .param p3, "args"    # [Ljava/lang/Object;

    const-string v0, "zh"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/pymcl/ai/AiText;->getEN()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p2

    :cond_1
    invoke-virtual {p0, v0, p3}, Lcom/pymcl/ai/AiText;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
