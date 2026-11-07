.class public final Lcom/pymcl/runtime/input/Keys;
.super Ljava/lang/Object;
.source "Keys.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/Keys$Action;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nKeys.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Keys.kt\ncom/pymcl/runtime/input/Keys\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1#2:57\n3938#3:58\n4474#3,2:59\n1358#4,2:61\n1435#4,4:63\n1358#4,2:67\n1435#4,4:69\n*S KotlinDebug\n*F\n+ 1 Keys.kt\ncom/pymcl/runtime/input/Keys\n*L\n29#1:58\n29#1:59,2\n30#1:61,2\n30#1:63,4\n32#1:67,2\n32#1:69,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010$\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u000cJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0005J \u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000c0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\r\u0010\u000eR\'\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00050\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/Keys;",
        "",
        "<init>",
        "()V",
        "MOUSE_LEFT",
        "",
        "MOUSE_RIGHT",
        "MOUSE_MIDDLE",
        "SCROLL_UP",
        "SCROLL_DOWN",
        "table",
        "",
        "",
        "getTable",
        "()Ljava/util/Map;",
        "table$delegate",
        "Lkotlin/Lazy;",
        "reverse",
        "getReverse",
        "reverse$delegate",
        "code",
        "name",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "isValid",
        "",
        "MOUSE_NAMES",
        "",
        "dispatch",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "press",
        "Action",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/Keys;

.field public static final MOUSE_LEFT:Ljava/lang/String; = "MOUSE_LEFT"

.field public static final MOUSE_MIDDLE:Ljava/lang/String; = "MOUSE_MIDDLE"

.field private static final MOUSE_NAMES:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MOUSE_RIGHT:Ljava/lang/String; = "MOUSE_RIGHT"

.field public static final SCROLL_DOWN:Ljava/lang/String; = "SCROLL_DOWN"

.field public static final SCROLL_UP:Ljava/lang/String; = "SCROLL_UP"

.field private static final reverse$delegate:Lkotlin/Lazy;

.field private static final table$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$QDbvni9BCzqlSZas1BEOnxtFjng()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/pymcl/runtime/input/Keys;->table_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$m83DETaZlWV_-r2DmG9F-IS2eeE()Ljava/util/Map;
    .locals 1

    invoke-static {}, Lcom/pymcl/runtime/input/Keys;->reverse_delegate$lambda$0()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/runtime/input/Keys;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/Keys;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    .line 27
    new-instance v0, Lcom/pymcl/runtime/input/Keys$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/Keys$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/Keys;->table$delegate:Lkotlin/Lazy;

    .line 32
    new-instance v0, Lcom/pymcl/runtime/input/Keys$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/Keys$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/Keys;->reverse$delegate:Lkotlin/Lazy;

    .line 38
    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "MOUSE_LEFT"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "MOUSE_RIGHT"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "MOUSE_MIDDLE"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "SCROLL_UP"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "SCROLL_DOWN"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/Keys;->MOUSE_NAMES:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getReverse()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 32
    sget-object v0, Lcom/pymcl/runtime/input/Keys;->reverse$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private final getTable()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 27
    sget-object v0, Lcom/pymcl/runtime/input/Keys;->table$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method private static final reverse_delegate$lambda$0()Ljava/util/Map;
    .locals 12

    .line 32
    sget-object v0, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/Keys;->getTable()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 67
    .local v1, "$i$f$associate":I
    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 68
    .local v2, "capacity$iv":I
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v3, Ljava/util/Map;

    .local v3, "destination$iv$iv":Ljava/util/Map;
    move-object v4, v0

    .local v4, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 69
    .local v5, "$i$f$associateTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 70
    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/util/Map$Entry;

    .local v8, "it":Ljava/util/Map$Entry;
    const/4 v9, 0x0

    .line 32
    .local v9, "$i$a$-associate-Keys$reverse$2$1":I
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 70
    .end local v8    # "it":Ljava/util/Map$Entry;
    .end local v9    # "$i$a$-associate-Keys$reverse$2$1":I
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v3, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 72
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .line 68
    .end local v3    # "destination$iv$iv":Ljava/util/Map;
    .end local v4    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$associateTo":I
    nop

    .line 32
    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$associate":I
    .end local v2    # "capacity$iv":I
    return-object v3
.end method

.method private static final table_delegate$lambda$0()Ljava/util/Map;
    .locals 15

    .line 28
    const-class v0, Lcom/tungsten/fclauncher/keycodes/FCLKeycodes;

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const-string v1, "getFields(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .line 29
    nop

    .local v0, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 58
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 59
    .local v4, "$i$f$filterTo":I
    array-length v5, v3

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v5, :cond_2

    aget-object v9, v3, v7

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/reflect/Field;

    .local v10, "it":Ljava/lang/reflect/Field;
    const/4 v11, 0x0

    .line 29
    .local v11, "$i$a$-filter-Keys$table$2$1":I
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getName(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, "KEY_"

    const/4 v14, 0x2

    invoke-static {v12, v13, v6, v14, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x1

    goto :goto_1

    :cond_0
    move v8, v6

    .line 59
    .end local v10    # "it":Ljava/lang/reflect/Field;
    .end local v11    # "$i$a$-filter-Keys$table$2$1":I
    :goto_1
    if-eqz v8, :cond_1

    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 60
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 58
    nop

    .end local v0    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$filter":I
    check-cast v2, Ljava/lang/Iterable;

    .line 30
    nop

    .local v2, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 61
    .local v0, "$i$f$associate":I
    const/16 v1, 0xa

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    const/16 v3, 0x10

    invoke-static {v1, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    .line 62
    .local v1, "capacity$iv":I
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v3, Ljava/util/Map;

    .local v3, "destination$iv$iv":Ljava/util/Map;
    move-object v4, v2

    .local v4, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 63
    .local v5, "$i$f$associateTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 64
    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v7

    check-cast v9, Ljava/lang/reflect/Field;

    .local v9, "it":Ljava/lang/reflect/Field;
    const/4 v10, 0x0

    .line 30
    .local v10, "$i$a$-associate-Keys$table$2$2":I
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v8}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 64
    .end local v9    # "it":Ljava/lang/reflect/Field;
    .end local v10    # "$i$a$-associate-Keys$table$2$2":I
    invoke-virtual {v9}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 66
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .line 62
    .end local v3    # "destination$iv$iv":Ljava/util/Map;
    .end local v4    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$associateTo":I
    nop

    .line 30
    .end local v0    # "$i$f$associate":I
    .end local v1    # "capacity$iv":I
    .end local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    return-object v3
.end method


# virtual methods
.method public final code(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Lcom/pymcl/runtime/input/Keys;->getTable()Ljava/util/Map;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toUpperCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public final dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;
    .locals 2
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "press"    # Z

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    goto :goto_1

    :sswitch_0
    const-string v0, "MOUSE_LEFT"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0, p3}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    goto :goto_2

    .line 42
    :sswitch_1
    const-string v0, "SCROLL_DOWN"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 47
    :cond_1
    if-eqz p3, :cond_6

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    invoke-interface {p1, v0, v1}, Lcom/pymcl/runtime/input/InputSink;->scroll(D)V

    goto :goto_2

    .line 42
    :sswitch_2
    const-string v0, "MOUSE_RIGHT"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x1

    invoke-interface {p1, v0, p3}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    goto :goto_2

    .line 42
    :sswitch_3
    const-string v0, "SCROLL_UP"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 46
    :cond_3
    if-eqz p3, :cond_6

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-interface {p1, v0, v1}, Lcom/pymcl/runtime/input/InputSink;->scroll(D)V

    goto :goto_2

    .line 42
    :sswitch_4
    const-string v0, "MOUSE_MIDDLE"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 45
    :cond_4
    const/4 v0, 0x2

    invoke-interface {p1, v0, p3}, Lcom/pymcl/runtime/input/InputSink;->mouseButton(IZ)V

    goto :goto_2

    .line 49
    :goto_1
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->Companion:Lcom/pymcl/runtime/input/Keys$Action$Companion;

    invoke-virtual {v0, p2}, Lcom/pymcl/runtime/input/Keys$Action$Companion;->of(Ljava/lang/String;)Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 57
    .local v0, "it":Lcom/pymcl/runtime/input/Keys$Action;
    const/4 v1, 0x0

    .line 49
    .local v1, "$i$a$-let-Keys$dispatch$1":I
    return-object v0

    .line 50
    .end local v0    # "it":Lcom/pymcl/runtime/input/Keys$Action;
    .end local v1    # "$i$a$-let-Keys$dispatch$1":I
    :cond_5
    invoke-virtual {p0, p2}, Lcom/pymcl/runtime/input/Keys;->code(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 57
    .local v0, "it":I
    const/4 v1, 0x0

    .line 50
    .local v1, "$i$a$-let-Keys$dispatch$2":I
    invoke-interface {p1, v0, p3}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 53
    .end local v0    # "it":I
    .end local v1    # "$i$a$-let-Keys$dispatch$2":I
    :cond_6
    :goto_2
    const/4 v0, 0x0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x65c0a971 -> :sswitch_4
        -0x41007ab3 -> :sswitch_3
        -0x301c63e -> :sswitch_2
        -0x2d44d2c -> :sswitch_1
        0x5abb1781 -> :sswitch_0
    .end sparse-switch
.end method

.method public final isValid(Ljava/lang/String;)Z
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/input/Keys;->code(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/Keys;->MOUSE_NAMES:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->Companion:Lcom/pymcl/runtime/input/Keys$Action$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/Keys$Action$Companion;->of(Ljava/lang/String;)Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final name(I)Ljava/lang/String;
    .locals 2
    .param p1, "code"    # I

    .line 36
    invoke-direct {p0}, Lcom/pymcl/runtime/input/Keys;->getReverse()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
