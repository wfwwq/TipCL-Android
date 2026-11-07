.class public final Lcom/pymcl/runtime/keyboard/StickyModifiers;
.super Ljava/lang/Object;
.source "PcKeyboardView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/StickyModifiers$State;,
        Lcom/pymcl/runtime/keyboard/StickyModifiers$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPcKeyboardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/StickyModifiers\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n651#2,7:117\n651#2,7:127\n2068#3:124\n2069#3:126\n2068#3,2:134\n1#4:125\n*S KotlinDebug\n*F\n+ 1 PcKeyboardView.kt\ncom/pymcl/runtime/keyboard/StickyModifiers\n*L\n54#1:117,7\n59#1:127,7\n54#1:124\n54#1:126\n59#1:134,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0008J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t`\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/StickyModifiers;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;)V",
        "states",
        "Ljava/util/HashMap;",
        "",
        "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
        "Lkotlin/collections/HashMap;",
        "getStates",
        "()Ljava/util/HashMap;",
        "tapModifier",
        "",
        "key",
        "normal",
        "press",
        "",
        "releaseAll",
        "State",
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


# instance fields
.field private final sink:Lcom/pymcl/runtime/input/InputSink;

.field private final states:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;)V
    .locals 1
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 40
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    .line 38
    return-void
.end method


# virtual methods
.method public final getStates()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    return-object v0
.end method

.method public final normal(Ljava/lang/String;Z)V
    .locals 10
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "press"    # Z

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    sget-object v0, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {v0, v1, p1, p2}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    .line 54
    if-nez p2, :cond_5

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .local v0, "$this$filterValues$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 117
    .local v1, "$i$f$filterValues":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 118
    .local v2, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 119
    .local v4, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    .local v6, "it":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    const/4 v7, 0x0

    .line 54
    .local v7, "$i$a$-filterValues-StickyModifiers$normal$1":I
    sget-object v8, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ONCE:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    if-ne v6, v8, :cond_1

    const/4 v5, 0x1

    .line 119
    .end local v6    # "it":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    .end local v7    # "$i$a$-filterValues-StickyModifiers$normal$1":I
    :cond_1
    if-eqz v5, :cond_0

    .line 120
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 123
    .end local v4    # "entry$iv":Ljava/util/Map$Entry;
    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/util/Map;

    .line 54
    .end local v0    # "$this$filterValues$iv":Ljava/util/Map;
    .end local v1    # "$i$f$filterValues":I
    .end local v2    # "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 124
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .local v4, "k":Ljava/lang/String;
    const/4 v6, 0x0

    .line 55
    .local v6, "$i$a$-forEach-StickyModifiers$normal$2":I
    iget-object v7, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v7, Ljava/util/Map;

    sget-object v8, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-interface {v7, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v7, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v7, v4}, Lcom/pymcl/runtime/input/Keys;->code(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 125
    .local v7, "it":I
    const/4 v8, 0x0

    .line 55
    .local v8, "$i$a$-let-StickyModifiers$normal$2$1":I
    iget-object v9, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v9, v7, v5}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 56
    .end local v7    # "it":I
    .end local v8    # "$i$a$-let-StickyModifiers$normal$2$1":I
    :cond_3
    nop

    .line 124
    .end local v4    # "k":Ljava/lang/String;
    .end local v6    # "$i$a$-forEach-StickyModifiers$normal$2":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 126
    :cond_4
    nop

    .line 57
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    :cond_5
    return-void
.end method

.method public final releaseAll()V
    .locals 10

    .line 59
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v0, Ljava/util/Map;

    .local v0, "$this$filterValues$iv":Ljava/util/Map;
    const/4 v1, 0x0

    .line 127
    .local v1, "$i$f$filterValues":I
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 128
    .local v2, "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 129
    .local v4, "entry$iv":Ljava/util/Map$Entry;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    .local v6, "it":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    const/4 v7, 0x0

    .line 59
    .local v7, "$i$a$-filterValues-StickyModifiers$releaseAll$1":I
    sget-object v8, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    if-eq v6, v8, :cond_1

    const/4 v5, 0x1

    .line 129
    .end local v6    # "it":Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    .end local v7    # "$i$a$-filterValues-StickyModifiers$releaseAll$1":I
    :cond_1
    if-eqz v5, :cond_0

    .line 130
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 133
    .end local v4    # "entry$iv":Ljava/util/Map$Entry;
    :cond_2
    move-object v0, v2

    check-cast v0, Ljava/util/Map;

    .line 59
    .end local v0    # "$this$filterValues$iv":Ljava/util/Map;
    .end local v1    # "$i$f$filterValues":I
    .end local v2    # "result$iv":Ljava/util/LinkedHashMap;
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 134
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .local v4, "k":Ljava/lang/String;
    const/4 v6, 0x0

    .line 59
    .local v6, "$i$a$-forEach-StickyModifiers$releaseAll$2":I
    sget-object v7, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v7, v4}, Lcom/pymcl/runtime/input/Keys;->code(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    .line 125
    .local v7, "it":I
    const/4 v8, 0x0

    .line 59
    .local v8, "$i$a$-let-StickyModifiers$releaseAll$2$1":I
    iget-object v9, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v9, v7, v5}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 134
    .end local v4    # "k":Ljava/lang/String;
    .end local v6    # "$i$a$-forEach-StickyModifiers$releaseAll$2":I
    .end local v7    # "it":I
    .end local v8    # "$i$a$-let-StickyModifiers$releaseAll$2$1":I
    :cond_3
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 135
    :cond_4
    nop

    .line 59
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public final tapModifier(Ljava/lang/String;)V
    .locals 3
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/Keys;->code(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 44
    .local v0, "code":I
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    if-nez v1, :cond_0

    sget-object v1, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    :cond_0
    sget-object v2, Lcom/pymcl/runtime/keyboard/StickyModifiers$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ordinal()I

    move-result v1

    aget v1, v2, v1

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 47
    :pswitch_0
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    goto :goto_0

    .line 46
    :pswitch_1
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->LOCKED:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 45
    :pswitch_2
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->states:Ljava/util/HashMap;

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ONCE:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-interface {v1, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/StickyModifiers;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 49
    :goto_0
    return-void

    .line 43
    .end local v0    # "code":I
    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
