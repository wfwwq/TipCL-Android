.class public final Lcom/pymcl/ai/McpChangeSet;
.super Ljava/lang/Object;
.source "McpNotify.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcpNotify.kt\nKotlin\n*S Kotlin\n*F\n+ 1 McpNotify.kt\ncom/pymcl/ai/McpChangeSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u001c\u0010\u0011\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0012j\u0004\u0018\u0001`\u0013J\u0006\u0010\u0014\u001a\u00020\u000fJ\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0016J\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0018J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/pymcl/ai/McpChangeSet;",
        "",
        "<init>",
        "()V",
        "dirty",
        "Ljava/util/LinkedHashSet;",
        "",
        "Lkotlin/collections/LinkedHashSet;",
        "updated",
        "value",
        "",
        "received",
        "getReceived",
        "()I",
        "apply",
        "",
        "method",
        "params",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "hasPending",
        "takeDirty",
        "",
        "takeUpdated",
        "",
        "clearUpdated",
        "",
        "uri",
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


# instance fields
.field private final dirty:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile received:I

.field private final updated:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    .line 62
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    .line 60
    return-void
.end method


# virtual methods
.method public final declared-synchronized apply(Ljava/lang/String;Ljava/util/Map;)Z
    .locals 5
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "params"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    sparse-switch v0, :sswitch_data_0

    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :cond_0
    :goto_0
    goto/16 :goto_2

    .restart local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :sswitch_0
    const-string v0, "notifications/resources/updated"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    .line 71
    :cond_1
    const-string v0, "uri"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    move-object v2, v0

    .line 87
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 71
    .local v3, "$i$a$-takeIf-McpChangeSet$apply$known$4":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-McpChangeSet$apply$known$4":I
    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    .line 87
    .local v0, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 71
    .local v2, "$i$a$-let-McpChangeSet$apply$known$5":I
    iget-object v3, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    invoke-virtual {v3, v0}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    .end local v0    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-let-McpChangeSet$apply$known$5":I
    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :cond_3
    move v0, v1

    goto :goto_3

    .line 67
    :sswitch_1
    const-string v0, "notifications/resources/list_changed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 69
    :cond_4
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    const-string v2, "resources"

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 87
    .local v0, "it":Z
    const/4 v2, 0x0

    .line 69
    .local v2, "$i$a$-let-McpChangeSet$apply$known$2":I
    move v0, v1

    .end local v0    # "it":Z
    .end local v2    # "$i$a$-let-McpChangeSet$apply$known$2":I
    goto :goto_3

    .line 67
    :sswitch_2
    const-string v0, "notifications/tools/list_changed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    const-string v2, "tools"

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 87
    .restart local v0    # "it":Z
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$a$-let-McpChangeSet$apply$known$1":I
    move v0, v1

    .end local v0    # "it":Z
    .end local v2    # "$i$a$-let-McpChangeSet$apply$known$1":I
    goto :goto_3

    .line 67
    :sswitch_3
    const-string v0, "notifications/prompts/list_changed"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    .line 70
    :cond_5
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    const-string v2, "prompts"

    invoke-virtual {v0, v2}, Ljava/util/LinkedHashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    .line 87
    .restart local v0    # "it":Z
    const/4 v2, 0x0

    .line 70
    .local v2, "$i$a$-let-McpChangeSet$apply$known$3":I
    move v0, v1

    .end local v0    # "it":Z
    .end local v2    # "$i$a$-let-McpChangeSet$apply$known$3":I
    goto :goto_3

    .line 72
    :goto_2
    const/4 v0, 0x0

    .line 67
    :goto_3
    nop

    .line 74
    .local v0, "known":Z
    if-eqz v0, :cond_6

    iget v2, p0, Lcom/pymcl/ai/McpChangeSet;->received:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/pymcl/ai/McpChangeSet;->received:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    :cond_6
    monitor-exit p0

    return v0

    .line 66
    .end local v0    # "known":Z
    .end local p1    # "method":Ljava/lang/String;
    .end local p2    # "params":Ljava/util/Map;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x3c9d395a -> :sswitch_3
        0x3de6e44e -> :sswitch_2
        0x6c561cc4 -> :sswitch_1
        0x767b956a -> :sswitch_0
    .end sparse-switch
.end method

.method public final declared-synchronized clearUpdated(Ljava/lang/String;)V
    .locals 1
    .param p1, "uri"    # Ljava/lang/String;

    monitor-enter p0

    :try_start_0
    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    .line 84
    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    .end local p1    # "uri":Ljava/lang/String;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final getReceived()I
    .locals 1

    .line 63
    iget v0, p0, Lcom/pymcl/ai/McpChangeSet;->received:I

    return v0
.end method

.method public final declared-synchronized hasPending()Z
    .locals 1

    monitor-enter p0

    .line 78
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    monitor-exit p0

    return v0

    .line 78
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized takeDirty()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 80
    :try_start_0
    new-instance v0, Ljava/util/LinkedHashSet;

    iget-object v1, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v0, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    move-object v1, v0

    .line 87
    .local v1, "it":Ljava/util/LinkedHashSet;
    const/4 v2, 0x0

    .line 80
    .local v2, "$i$a$-also-McpChangeSet$takeDirty$1":I
    iget-object v3, p0, Lcom/pymcl/ai/McpChangeSet;->dirty:Ljava/util/LinkedHashSet;

    invoke-virtual {v3}, Ljava/util/LinkedHashSet;->clear()V

    .end local v1    # "it":Ljava/util/LinkedHashSet;
    .end local v2    # "$i$a$-also-McpChangeSet$takeDirty$1":I
    check-cast v0, Ljava/util/Set;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    .line 79
    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized takeUpdated()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    .line 82
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    .line 87
    .local v1, "it":Ljava/util/List;
    const/4 v2, 0x0

    .line 82
    .local v2, "$i$a$-also-McpChangeSet$takeUpdated$1":I
    iget-object v3, p0, Lcom/pymcl/ai/McpChangeSet;->updated:Ljava/util/LinkedHashSet;

    invoke-virtual {v3}, Ljava/util/LinkedHashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v1    # "it":Ljava/util/List;
    .end local v2    # "$i$a$-also-McpChangeSet$takeUpdated$1":I
    monitor-exit p0

    return-object v0

    .line 81
    .end local p0    # "this":Lcom/pymcl/ai/McpChangeSet;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
