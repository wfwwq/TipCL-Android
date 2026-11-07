.class public final Lcom/pymcl/ai/AuditLog;
.super Ljava/lang/Object;
.source "Hooks.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/AuditLog$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHooks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Hooks.kt\ncom/pymcl/ai/AuditLog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n1#2:133\n1#2:145\n1795#3,10:134\n2068#3:144\n2069#3:146\n1805#3:147\n*S KotlinDebug\n*F\n+ 1 Hooks.kt\ncom/pymcl/ai/AuditLog\n*L\n45#1:145\n45#1:134,10\n45#1:144\n45#1:146\n45#1:147\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J-\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\u000e0\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/AuditLog;",
        "",
        "file",
        "Ljava/io/File;",
        "maxBytes",
        "",
        "<init>",
        "(Ljava/io/File;J)V",
        "append",
        "Lkotlin/Result;",
        "",
        "entry",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "append-IoAF18A",
        "(Ljava/util/Map;)Ljava/lang/Object;",
        "read",
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
.field public static final Companion:Lcom/pymcl/ai/AuditLog$Companion;

.field private static final SECRET_KEY:Lkotlin/text/Regex;


# instance fields
.field private final file:Ljava/io/File;

.field private final maxBytes:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/AuditLog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/AuditLog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/AuditLog;->Companion:Lcom/pymcl/ai/AuditLog$Companion;

    .line 18
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)(key|token|password|passwd|secret|authorization|cookie)"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/ai/AuditLog;->SECRET_KEY:Lkotlin/text/Regex;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;J)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;
    .param p2, "maxBytes"    # J

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    iput-wide p2, p0, Lcom/pymcl/ai/AuditLog;->maxBytes:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 16
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/32 p2, 0x500000

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/ai/AuditLog;-><init>(Ljava/io/File;J)V

    return-void
.end method

.method public static final synthetic access$getSECRET_KEY$cp()Lkotlin/text/Regex;
    .locals 1

    .line 16
    sget-object v0, Lcom/pymcl/ai/AuditLog;->SECRET_KEY:Lkotlin/text/Regex;

    return-object v0
.end method


# virtual methods
.method public final append-IoAF18A(Ljava/util/Map;)Ljava/lang/Object;
    .locals 11
    .param p1, "entry"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    monitor-enter p0

    const/4 v0, 0x0

    .line 35
    .local v0, "$i$a$-synchronized-AuditLog$append$1":I
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/AuditLog;

    .local v1, "$this$append_IoAF18A_u24lambda_u240_u240":Lcom/pymcl/ai/AuditLog;
    const/4 v2, 0x0

    .line 36
    .local v2, "$i$a$-runCatching-AuditLog$append$1$1":I
    iget-object v3, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 37
    :cond_0
    iget-object v3, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3

    iget-wide v5, v1, Lcom/pymcl/ai/AuditLog;->maxBytes:J

    cmp-long v3, v3, v5

    if-lez v3, :cond_1

    new-instance v3, Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    const-string v5, "audit.1.jsonl"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v3, "old":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    iget-object v4, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    invoke-virtual {v4, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 38
    .end local v3    # "old":Ljava/io/File;
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 39
    .local v3, "now":J
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v6, v5

    .line 133
    .local v6, "$this$append_IoAF18A_u24lambda_u240_u240_u240":Ljava/util/LinkedHashMap;
    const/4 v7, 0x0

    .line 39
    .local v7, "$i$a$-apply-AuditLog$append$1$1$line$1":I
    const-string v8, "ts"

    sget-object v9, Lcom/pymcl/ai/AuditLog;->Companion:Lcom/pymcl/ai/AuditLog$Companion;

    invoke-virtual {v9, v3, v4}, Lcom/pymcl/ai/AuditLog$Companion;->isoNow(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "time"

    const/16 v9, 0x3e8

    int-to-long v9, v9

    div-long v9, v3, v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v6, v8, v9}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v6, p1}, Ljava/util/LinkedHashMap;->putAll(Ljava/util/Map;)V

    .line 40
    .end local v6    # "$this$append_IoAF18A_u24lambda_u240_u240_u240":Ljava/util/LinkedHashMap;
    .end local v7    # "$i$a$-apply-AuditLog$append$1$1$line$1":I
    .local v5, "line":Ljava/util/LinkedHashMap;
    iget-object v6, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v7, v5, v8, v9, v10}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v10, v9, v10}, Lkotlin/io/FilesKt;->appendText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 41
    nop

    .end local v1    # "$this$append_IoAF18A_u24lambda_u240_u240":Lcom/pymcl/ai/AuditLog;
    .end local v2    # "$i$a$-runCatching-AuditLog$append$1$1":I
    .end local v3    # "now":J
    .end local v5    # "line":Ljava/util/LinkedHashMap;
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :goto_0
    nop

    .line 34
    .end local v0    # "$i$a$-synchronized-AuditLog$append$1":I
    monitor-exit p0

    .line 42
    return-object v1

    .line 34
    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final read()Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 44
    move-object/from16 v1, p0

    monitor-enter p0

    const/4 v2, 0x0

    .line 45
    .local v2, "$i$a$-synchronized-AuditLog$read$1":I
    :try_start_0
    iget-object v0, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move/from16 v20, v2

    goto/16 :goto_5

    :cond_0
    iget-object v0, v1, Lcom/pymcl/ai/AuditLog;->file:Ljava/io/File;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v4}, Lkotlin/io/FilesKt;->readLines$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    move-object v3, v0

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 134
    .local v5, "$i$f$mapNotNull":I
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    move-object v6, v0

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 143
    .local v8, "$i$f$mapNotNullTo":I
    move-object v9, v7

    .local v9, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 144
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    .local v12, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 143
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v0, v13

    check-cast v0, Ljava/lang/String;

    move-object v15, v0

    .local v15, "l":Ljava/lang/String;
    const/16 v16, 0x0

    .line 45
    .local v16, "$i$a$-mapNotNull-AuditLog$read$1$1":I
    nop

    .line 133
    .local v0, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 45
    .local v17, "$i$a$-takeIf-AuditLog$read$1$1$1":I
    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/CharSequence;

    invoke-static/range {v18 .. v18}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v18
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .end local v0    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-takeIf-AuditLog$read$1$1$1":I
    if-nez v18, :cond_1

    move-object v0, v15

    goto :goto_1

    :cond_1
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_3

    move-object/from16 v17, v0

    .line 133
    .local v17, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 45
    .local v18, "$i$a$-let-AuditLog$read$1$1$2":I
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/AuditLog;

    .line 133
    .local v0, "$this$read_u24lambda_u240_u240_u241_u240":Lcom/pymcl/ai/AuditLog;
    const/16 v19, 0x0

    .line 45
    .local v19, "$i$a$-runCatching-AuditLog$read$1$1$2$1":I
    sget-object v4, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v20, v2

    move-object/from16 v2, v17

    .end local v17    # "it":Ljava/lang/String;
    .local v2, "it":Ljava/lang/String;
    .local v20, "$i$a$-synchronized-AuditLog$read$1":I
    :try_start_2
    invoke-virtual {v4, v2}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .end local v0    # "$this$read_u24lambda_u240_u240_u241_u240":Lcom/pymcl/ai/AuditLog;
    .end local v19    # "$i$a$-runCatching-AuditLog$read$1$1$2$1":I
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    .end local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    .local v2, "$i$a$-synchronized-AuditLog$read$1":I
    .restart local v17    # "it":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move/from16 v20, v2

    move-object/from16 v2, v17

    .end local v17    # "it":Ljava/lang/String;
    .local v2, "it":Ljava/lang/String;
    .restart local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    :goto_2
    :try_start_3
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v0, 0x0

    :cond_2
    check-cast v0, Ljava/util/Map;

    .end local v2    # "it":Ljava/lang/String;
    .end local v18    # "$i$a$-let-AuditLog$read$1$1$2":I
    goto :goto_4

    .end local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    .local v2, "$i$a$-synchronized-AuditLog$read$1":I
    :cond_3
    move/from16 v20, v2

    .end local v2    # "$i$a$-synchronized-AuditLog$read$1":I
    .restart local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    const/4 v0, 0x0

    .line 143
    .end local v15    # "l":Ljava/lang/String;
    .end local v16    # "$i$a$-mapNotNull-AuditLog$read$1$1":I
    :goto_4
    if-eqz v0, :cond_4

    .line 145
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 143
    .local v2, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 144
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v2    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_4
    move/from16 v2, v20

    const/4 v4, 0x0

    .end local v12    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 146
    .end local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    .local v2, "$i$a$-synchronized-AuditLog$read$1":I
    :cond_5
    move/from16 v20, v2

    .line 147
    .end local v2    # "$i$a$-synchronized-AuditLog$read$1":I
    .end local v9    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach":I
    .restart local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo":I
    move-object v0, v6

    check-cast v0, Ljava/util/List;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 134
    nop

    .line 45
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNull":I
    :goto_5
    nop

    .line 44
    .end local v20    # "$i$a$-synchronized-AuditLog$read$1":I
    monitor-exit p0

    .line 46
    return-object v0

    .line 44
    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0
.end method
