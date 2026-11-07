.class public final Lcom/pymcl/runtime/settings/SettingsServer;
.super Ljava/lang/Object;
.source "SettingsCore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/settings/SettingsServer$Result;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsCore.kt\ncom/pymcl/runtime/settings/SettingsServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J.\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/runtime/settings/SettingsServer;",
        "",
        "store",
        "Lcom/pymcl/runtime/settings/RawStore;",
        "<init>",
        "(Lcom/pymcl/runtime/settings/RawStore;)V",
        "handle",
        "Lcom/pymcl/runtime/settings/SettingsServer$Result;",
        "method",
        "",
        "arg",
        "extras",
        "",
        "Result",
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
.field private final store:Lcom/pymcl/runtime/settings/RawStore;


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/settings/RawStore;)V
    .locals 1
    .param p1, "store"    # Lcom/pymcl/runtime/settings/RawStore;

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/settings/SettingsServer;->store:Lcom/pymcl/runtime/settings/RawStore;

    return-void
.end method


# virtual methods
.method public final handle(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/runtime/settings/SettingsServer$Result;
    .locals 12
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "arg"    # Ljava/lang/String;
    .param p3, "extras"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/pymcl/runtime/settings/SettingsServer$Result;"
        }
    .end annotation

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "1"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const-string v4, "v"

    const-string v5, "0"

    const-string v6, "ok"

    const/4 v7, 0x2

    const/4 v8, 0x0

    sparse-switch v0, :sswitch_data_0

    :goto_0
    goto/16 :goto_8

    :sswitch_0
    const-string v0, "put"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    if-eqz v2, :cond_3

    new-instance v0, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_9

    .line 114
    :cond_3
    invoke-interface {p3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_1

    .line 117
    :cond_4
    sget-object v0, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    invoke-interface {p3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/settings/PrefCodec;->decode(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 118
    .local v0, "v":Ljava/lang/Object;
    if-nez v0, :cond_5

    new-instance v1, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-direct {v1, v2, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    goto/16 :goto_9

    .line 119
    :cond_5
    iget-object v2, p0, Lcom/pymcl/runtime/settings/SettingsServer;->store:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v2, p2, v0}, Lcom/pymcl/runtime/settings/RawStore;->write(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v2, v1, p2}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    move-object v0, v2

    .end local v0    # "v":Ljava/lang/Object;
    goto/16 :goto_9

    .line 115
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsServer;->store:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v0, p2, v8}, Lcom/pymcl/runtime/settings/RawStore;->write(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1, p2}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    goto/16 :goto_9

    .line 99
    :sswitch_1
    const-string v0, "get"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_0

    .line 101
    :cond_7
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    move v0, v2

    goto :goto_3

    :cond_9
    :goto_2
    move v0, v3

    :goto_3
    const-string v6, "exists"

    if-eqz v0, :cond_a

    new-instance v0, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_9

    .line 103
    :cond_a
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/settings/SettingsServer;

    .line 207
    .local v0, "$this$handle_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsServer;
    const/4 v9, 0x0

    .line 103
    .local v9, "$i$a$-runCatching-SettingsServer$handle$enc$1":I
    sget-object v10, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    iget-object v11, v0, Lcom/pymcl/runtime/settings/SettingsServer;->store:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v11, p2}, Lcom/pymcl/runtime/settings/RawStore;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/pymcl/runtime/settings/PrefCodec;->encode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .end local v0    # "$this$handle_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsServer;
    .end local v9    # "$i$a$-runCatching-SettingsServer$handle$enc$1":I
    invoke-static {v10}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v9, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    move-object v0, v8

    :cond_b
    check-cast v0, Ljava/lang/String;

    .line 104
    .local v0, "enc":Ljava/lang/String;
    new-instance v9, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    new-array v10, v7, [Lkotlin/Pair;

    if-eqz v0, :cond_c

    goto :goto_5

    :cond_c
    move-object v1, v5

    :goto_5
    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v10, v2

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v10, v3

    invoke-static {v10}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v9, v1, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v9

    .end local v0    # "enc":Ljava/lang/String;
    goto/16 :goto_9

    .line 99
    :sswitch_2
    const-string v0, "getAll"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_0

    .line 108
    :cond_d
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 109
    .local v0, "m":Ljava/util/LinkedHashMap;
    iget-object v1, p0, Lcom/pymcl/runtime/settings/SettingsServer;->store:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v1}, Lcom/pymcl/runtime/settings/RawStore;->readAll()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "k":Ljava/lang/String;
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .local v2, "v":Ljava/lang/Object;
    :try_start_1
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, p0

    check-cast v4, Lcom/pymcl/runtime/settings/SettingsServer;

    .line 207
    .local v4, "$this$handle_u24lambda_u241":Lcom/pymcl/runtime/settings/SettingsServer;
    const/4 v5, 0x0

    .line 109
    .local v5, "$i$a$-runCatching-SettingsServer$handle$1":I
    sget-object v6, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    invoke-virtual {v6, v2}, Lcom/pymcl/runtime/settings/PrefCodec;->encode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    .end local v4    # "$this$handle_u24lambda_u241":Lcom/pymcl/runtime/settings/SettingsServer;
    .end local v5    # "$i$a$-runCatching-SettingsServer$handle$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_7

    :catchall_1
    move-exception v4

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_7
    invoke-static {v4}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    move-object v4, v8

    :cond_e
    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_f

    .line 207
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 109
    .local v5, "$i$a$-let-SettingsServer$handle$2":I
    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "k:"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v6, v9, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-let-SettingsServer$handle$2":I
    goto :goto_6

    .end local v2    # "v":Ljava/lang/Object;
    .end local v3    # "k":Ljava/lang/String;
    :cond_f
    goto :goto_6

    .line 110
    :cond_10
    new-instance v1, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    move-object v2, v0

    check-cast v2, Ljava/util/Map;

    invoke-direct {v1, v2, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    .end local v0    # "m":Ljava/util/LinkedHashMap;
    goto :goto_9

    .line 122
    :goto_8
    new-instance v0, Lcom/pymcl/runtime/settings/SettingsServer$Result;

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1, v8, v7, v8}, Lcom/pymcl/runtime/settings/SettingsServer$Result;-><init>(Ljava/util/Map;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 123
    :goto_9
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x4a77d595 -> :sswitch_2
        0x18f56 -> :sswitch_1
        0x1b30f -> :sswitch_0
    .end sparse-switch
.end method
