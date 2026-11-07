.class public final Lcom/pymcl/ai/CheckpointStore;
.super Ljava/lang/Object;
.source "Checkpoint.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/CheckpointStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCheckpoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkpoint.kt\ncom/pymcl/ai/CheckpointStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,124:1\n1#2:125\n1#2:181\n1739#3:126\n1814#3,3:127\n1849#3,8:130\n2068#3,2:138\n777#3:140\n873#3,2:141\n1960#3,3:143\n777#3:146\n873#3,2:147\n777#3:149\n873#3,2:150\n1233#3:152\n1939#3,3:153\n1373#3,2:156\n1402#3,4:158\n2945#3,3:163\n1544#3:167\n1633#3,2:168\n1795#3,10:170\n2068#3:180\n2069#3:182\n1805#3:183\n1635#3,3:184\n1233#3:192\n2068#3,2:193\n1505#4:162\n1506#4:166\n15101#5,2:187\n3938#5:189\n4474#5,2:190\n*S KotlinDebug\n*F\n+ 1 Checkpoint.kt\ncom/pymcl/ai/CheckpointStore\n*L\n114#1:181\n37#1:126\n37#1:127,3\n37#1:130,8\n42#1:138,2\n45#1:140\n45#1:141,2\n66#1:143,3\n71#1:146\n71#1:147,2\n72#1:149\n72#1:150,2\n72#1:152\n73#1:153,3\n79#1:156,2\n79#1:158,4\n85#1:163,3\n114#1:167\n114#1:168,2\n114#1:170,10\n114#1:180\n114#1:182\n114#1:183\n114#1:184,3\n120#1:192\n121#1:193,2\n83#1:162\n83#1:166\n115#1:187,2\n120#1:189\n120#1:190,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\r2\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J.\u0010\u000e\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fj\u0002`\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J,\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00082\u0006\u0010\u0017\u001a\u00020\u00082\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0008J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0008J\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0008J*\u0010\u001f\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00082\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cj\u0002`\rH\u0002J\u0006\u0010!\u001a\u00020 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"
    }
    d2 = {
        "Lcom/pymcl/ai/CheckpointStore;",
        "",
        "root",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "dir",
        "chat",
        "",
        "journalFile",
        "blobs",
        "loadJ",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "entries",
        "",
        "Lcom/pymcl/core/util/JArr;",
        "j",
        "chatBytes",
        "",
        "snapshot",
        "Lcom/pymcl/ai/SnapshotResult;",
        "turnId",
        "tool",
        "paths",
        "",
        "hasEntries",
        "",
        "rollback",
        "Lcom/pymcl/ai/RollbackResult;",
        "deleteChat",
        "pruneBlobs",
        "",
        "gc",
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
.field public static final Companion:Lcom/pymcl/ai/CheckpointStore$Companion;

.field public static final KEEP_CHATS:I = 0x14

.field public static final MAX_CHAT_BYTES:J = 0x40000000L

.field public static final MAX_DIR_FILES:I = 0x4e20

.field public static final MAX_SNAPSHOT_BYTES:J = 0x20000000L


# instance fields
.field private final root:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$0AR4zlJNLDgelT7qfYH-K-hoWKA(JLjava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/ai/CheckpointStore;->rollback$lambda$0$9(JLjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$HOmx8TMXK8eqWpdbcccs9mVXoZQ(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/ai/CheckpointStore;->snapshot$lambda$0$2(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/CheckpointStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/CheckpointStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/CheckpointStore;->Companion:Lcom/pymcl/ai/CheckpointStore$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "root"    # Ljava/io/File;

    const-string v0, "root"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/CheckpointStore;->root:Ljava/io/File;

    return-void
.end method

.method private final blobs(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "chat"    # Ljava/lang/String;

    .line 26
    new-instance v0, Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/pymcl/ai/CheckpointStore;->dir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "files"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final chatBytes(Ljava/lang/String;)J
    .locals 7
    .param p1, "chat"    # Ljava/lang/String;

    .line 29
    invoke-direct {p0, p1}, Lcom/pymcl/ai/CheckpointStore;->blobs(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v0, v4

    .line 125
    nop

    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 29
    .local v6, "$i$a$-sumOfLong-CheckpointStore$chatBytes$1":I
    invoke-virtual {v5}, Ljava/io/File;->length()J

    move-result-wide v5

    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-sumOfLong-CheckpointStore$chatBytes$1":I
    add-long/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    return-wide v1
.end method

.method private final dir(Ljava/lang/String;)Ljava/io/File;
    .locals 5
    .param p1, "chat"    # Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/ai/CheckpointStore;->root:Ljava/io/File;

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v3, Lkotlin/text/Regex;

    const-string v4, "[^A-Za-z0-9_.-]"

    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v4, "_"

    invoke-virtual {v3, v2, v4}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final entries(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .param p1, "j"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 28
    const-string v0, "entries"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    move-object v2, v1

    .line 125
    .local v2, "it":Ljava/util/List;
    const/4 v3, 0x0

    .line 28
    .local v3, "$i$a$-also-CheckpointStore$entries$1":I
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v2    # "it":Ljava/util/List;
    .end local v3    # "$i$a$-also-CheckpointStore$entries$1":I
    :cond_0
    return-object v1
.end method

.method private final journalFile(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "chat"    # Ljava/lang/String;

    .line 25
    new-instance v0, Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/pymcl/ai/CheckpointStore;->dir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "journal.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final loadJ(Ljava/lang/String;)Ljava/util/Map;
    .locals 4
    .param p1, "chat"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 27
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/ai/CheckpointStore;

    .line 125
    .local v0, "$this$loadJ_u24lambda_u240":Lcom/pymcl/ai/CheckpointStore;
    const/4 v1, 0x0

    .line 27
    .local v1, "$i$a$-runCatching-CheckpointStore$loadJ$1":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-direct {v0, p1}, Lcom/pymcl/ai/CheckpointStore;->journalFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$loadJ_u24lambda_u240":Lcom/pymcl/ai/CheckpointStore;
    .end local v1    # "$i$a$-runCatching-CheckpointStore$loadJ$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Ljava/util/Map;

    if-nez v0, :cond_1

    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    const-wide/16 v1, 0x1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "version"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "chat_id"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "entries"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final pruneBlobs(Ljava/lang/String;Ljava/util/Map;)V
    .locals 28
    .param p1, "chat"    # Ljava/lang/String;
    .param p2, "j"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 114
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 167
    .local v3, "$i$f$flatMap":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 168
    .local v6, "$i$f$flatMapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 169
    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v8

    check-cast v10, Ljava/util/Map;

    .local v10, "e":Ljava/util/Map;
    const/4 v11, 0x0

    .line 114
    .local v11, "$i$a$-flatMap-CheckpointStore$pruneBlobs$used$1":I
    const-string v12, "paths"

    invoke-static {v10, v12}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 170
    .local v13, "$i$f$mapNotNull":I
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    check-cast v14, Ljava/util/Collection;

    .local v14, "destination$iv$iv":Ljava/util/Collection;
    move-object v15, v12

    .local v15, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 179
    .local v16, "$i$f$mapNotNullTo":I
    move-object/from16 v17, v15

    .local v17, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 180
    .local v18, "$i$f$forEach":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_1
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_3

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .local v20, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v20

    .local v21, "element$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 179
    .local v22, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v9, v21

    check-cast v9, Ljava/util/Map;

    .local v9, "it":Ljava/util/Map;
    const/16 v23, 0x0

    .line 114
    .local v23, "$i$a$-mapNotNull-CheckpointStore$pruneBlobs$used$1$1":I
    const-string v0, "sha256"

    invoke-static {v9, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v24, 0x0

    if-eqz v0, :cond_1

    move-object/from16 v25, v0

    .line 125
    .local v25, "s":Ljava/lang/String;
    const/16 v26, 0x0

    .line 114
    .local v26, "$i$a$-takeIf-CheckpointStore$pruneBlobs$used$1$1$1":I
    move-object/from16 v27, v25

    check-cast v27, Ljava/lang/CharSequence;

    invoke-interface/range {v27 .. v27}, Ljava/lang/CharSequence;->length()I

    move-result v27

    if-lez v27, :cond_0

    const/16 v27, 0x1

    goto :goto_2

    :cond_0
    const/16 v27, 0x0

    .end local v25    # "s":Ljava/lang/String;
    .end local v26    # "$i$a$-takeIf-CheckpointStore$pruneBlobs$used$1$1$1":I
    :goto_2
    if-eqz v27, :cond_1

    goto :goto_3

    :cond_1
    move-object/from16 v0, v24

    .line 179
    .end local v9    # "it":Ljava/util/Map;
    .end local v23    # "$i$a$-mapNotNull-CheckpointStore$pruneBlobs$used$1$1":I
    :goto_3
    if-eqz v0, :cond_2

    .line 181
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 179
    .local v9, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v14, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 180
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v21    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_2
    move-object/from16 v0, p0

    .end local v20    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_1

    .line 182
    :cond_3
    nop

    .line 183
    .end local v17    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$forEach":I
    nop

    .end local v14    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$mapNotNullTo":I
    move-object v0, v14

    check-cast v0, Ljava/util/List;

    .line 170
    nop

    .end local v12    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapNotNull":I
    check-cast v0, Ljava/lang/Iterable;

    .line 114
    nop

    .line 169
    .end local v10    # "e":Ljava/util/Map;
    .end local v11    # "$i$a$-flatMap-CheckpointStore$pruneBlobs$used$1":I
    nop

    .line 184
    .local v0, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v0, p0

    goto :goto_0

    .line 186
    .end local v0    # "list$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$flatMapTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 167
    nop

    .end local v2    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$flatMap":I
    check-cast v0, Ljava/lang/Iterable;

    .line 114
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    .line 115
    .local v0, "used":Ljava/util/Set;
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->blobs(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_7

    .local v2, "$this$forEach$iv":[Ljava/lang/Object;
    const/4 v3, 0x0

    .line 187
    .local v3, "$i$f$forEach":I
    array-length v4, v2

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v4, :cond_6

    aget-object v5, v2, v9

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    .local v6, "it":Ljava/io/File;
    const/4 v7, 0x0

    .line 115
    .local v7, "$i$a$-forEach-CheckpointStore$pruneBlobs$1":I
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v10, "getName(...)"

    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, ".bin"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 187
    .end local v6    # "it":Ljava/io/File;
    .end local v7    # "$i$a$-forEach-CheckpointStore$pruneBlobs$1":I
    :cond_5
    nop

    .end local v5    # "element$iv":Ljava/lang/Object;
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    .line 188
    :cond_6
    nop

    .line 116
    .end local v2    # "$this$forEach$iv":[Ljava/lang/Object;
    .end local v3    # "$i$f$forEach":I
    :cond_7
    return-void
.end method

.method private static final rollback$lambda$0$9(JLjava/lang/Object;)Z
    .locals 2
    .param p0, "$first"    # J
    .param p2, "o"    # Ljava/lang/Object;

    .line 105
    invoke-static {p2}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "seq"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    cmp-long v0, v0, p0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private static final snapshot$lambda$0$2(Ljava/io/File;)Z
    .locals 1
    .param p0, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final deleteChat(Ljava/lang/String;)Z
    .locals 2
    .param p1, "chat"    # Ljava/lang/String;

    const-string v0, "chat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    monitor-enter p0

    .line 125
    const/4 v0, 0x0

    .line 111
    .local v0, "$i$a$-synchronized-CheckpointStore$deleteChat$1":I
    :try_start_0
    invoke-direct {p0, p1}, Lcom/pymcl/ai/CheckpointStore;->dir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-CheckpointStore$deleteChat$1":I
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final gc()V
    .locals 10

    .line 120
    iget-object v0, p0, Lcom/pymcl/ai/CheckpointStore;->root:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_4

    .local v0, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 189
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 190
    .local v4, "$i$f$filterTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v3, v6

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 120
    .local v9, "$i$a$-filter-CheckpointStore$gc$ds$1":I
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    move-result v8

    .line 190
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-filter-CheckpointStore$gc$ds$1":I
    if-eqz v8, :cond_0

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 191
    :cond_1
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 189
    nop

    .line 120
    .end local v0    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$filter":I
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 192
    .local v1, "$i$f$sortedByDescending":I
    new-instance v2, Lcom/pymcl/ai/CheckpointStore$gc$$inlined$sortedByDescending$1;

    invoke-direct {v2}, Lcom/pymcl/ai/CheckpointStore$gc$$inlined$sortedByDescending$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 120
    .end local v0    # "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedByDescending":I
    if-nez v0, :cond_2

    goto :goto_2

    .line 121
    .local v0, "ds":Ljava/util/List;
    :cond_2
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const/16 v2, 0x14

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 193
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/io/File;

    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 121
    .local v6, "$i$a$-forEach-CheckpointStore$gc$1":I
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v5}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 193
    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-forEach-CheckpointStore$gc$1":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 194
    :cond_3
    nop

    .line 122
    .end local v1    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    return-void

    .line 120
    .end local v0    # "ds":Ljava/util/List;
    :cond_4
    :goto_2
    return-void
.end method

.method public final hasEntries(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 9
    .param p1, "chat"    # Ljava/lang/String;
    .param p2, "turnId"    # Ljava/lang/String;

    const-string v0, "chat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    monitor-enter p0

    .line 125
    const/4 v0, 0x0

    .line 66
    .local v0, "$i$a$-synchronized-CheckpointStore$hasEntries$1":I
    :try_start_0
    invoke-direct {p0, p1}, Lcom/pymcl/ai/CheckpointStore;->loadJ(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 143
    .local v2, "$i$f$any":I
    instance-of v3, v1, Ljava/util/Collection;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 144
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/util/Map;

    .local v6, "it":Ljava/util/Map;
    const/4 v7, 0x0

    .line 66
    .local v7, "$i$a$-any-CheckpointStore$hasEntries$1$1":I
    const-string v8, "turn_id"

    invoke-static {v6, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 144
    .end local v6    # "it":Ljava/util/Map;
    .end local v7    # "$i$a$-any-CheckpointStore$hasEntries$1$1":I
    if-eqz v8, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    .line 145
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_2
    nop

    .line 66
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any":I
    :goto_0
    nop

    .end local v0    # "$i$a$-synchronized-CheckpointStore$hasEntries$1":I
    monitor-exit p0

    return v4

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final rollback(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/RollbackResult;
    .locals 39
    .param p1, "chat"    # Ljava/lang/String;
    .param p2, "turnId"    # Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "chat"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    monitor-enter p0

    const/4 v4, 0x0

    .line 70
    .local v4, "$i$a$-synchronized-CheckpointStore$rollback$1":I
    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->loadJ(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    move-object v5, v0

    .local v5, "j":Ljava/util/Map;
    invoke-direct {v1, v5}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object v6, v0

    .line 71
    .local v6, "all":Ljava/util/List;
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 146
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v0

    .local v9, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 147
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_0
    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 71
    .local v14, "$i$a$-filter-CheckpointStore$rollback$1$first$1":I
    const-string v15, "turn_id"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    .line 147
    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-filter-CheckpointStore$rollback$1$first$1":I
    if-eqz v15, :cond_0

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 148
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    check-cast v8, Ljava/util/List;

    .line 146
    nop

    .line 71
    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter":I
    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_2

    const/4 v7, 0x0

    goto :goto_4

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    .line 125
    .local v7, "it":Ljava/util/Map;
    const/4 v11, 0x0

    .line 71
    .local v11, "$i$a$-minOfOrNull-CheckpointStore$rollback$1$first$2":I
    const-string v12, "seq"

    invoke-static {v7, v12}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    goto :goto_1

    :cond_3
    const-wide/16 v12, 0x0

    .end local v7    # "it":Ljava/util/Map;
    .end local v11    # "$i$a$-minOfOrNull-CheckpointStore$rollback$1$first$2":I
    :goto_1
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    check-cast v7, Ljava/lang/Comparable;

    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    .line 125
    .local v11, "it":Ljava/util/Map;
    const/4 v12, 0x0

    .line 71
    .local v12, "$i$a$-minOfOrNull-CheckpointStore$rollback$1$first$2":I
    const-string v13, "seq"

    invoke-static {v11, v13}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v13

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    goto :goto_3

    :cond_5
    const-wide/16 v13, 0x0

    .end local v11    # "it":Ljava/util/Map;
    .end local v12    # "$i$a$-minOfOrNull-CheckpointStore$rollback$1$first$2":I
    :goto_3
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    check-cast v11, Ljava/lang/Comparable;

    invoke-interface {v7, v11}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v12

    if-lez v12, :cond_4

    move-object v7, v11

    goto :goto_2

    :cond_6
    :goto_4
    check-cast v7, Ljava/lang/Long;

    if-eqz v7, :cond_31

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    .line 69
    nop

    .line 72
    .local v13, "first":J
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 149
    .local v7, "$i$f$filter":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    check-cast v15, Ljava/util/Collection;

    .local v15, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v16, v0

    .local v16, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 150
    .local v17, "$i$f$filterTo":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_5
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_a

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    .local v20, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v20

    check-cast v19, Ljava/util/Map;

    move-object/from16 v21, v19

    .local v21, "it":Ljava/util/Map;
    const/16 v19, 0x0

    .line 72
    .local v19, "$i$a$-filter-CheckpointStore$rollback$1$undo$1":I
    const-wide/16 v22, 0x0

    const-string v9, "seq"

    move-object/from16 v10, v21

    .end local v21    # "it":Ljava/util/Map;
    .local v10, "it":Ljava/util/Map;
    invoke-static {v10, v9}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v24

    goto :goto_6

    :cond_7
    move-wide/from16 v24, v22

    :goto_6
    cmp-long v9, v24, v13

    if-ltz v9, :cond_8

    const/4 v9, 0x1

    goto :goto_7

    :cond_8
    const/4 v9, 0x0

    .line 150
    .end local v10    # "it":Ljava/util/Map;
    .end local v19    # "$i$a$-filter-CheckpointStore$rollback$1$undo$1":I
    :goto_7
    if-eqz v9, :cond_9

    move-object/from16 v9, v20

    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .local v9, "element$iv$iv":Ljava/lang/Object;
    invoke-interface {v15, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .restart local v20    # "element$iv$iv":Ljava/lang/Object;
    :cond_9
    move-object/from16 v9, v20

    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .restart local v9    # "element$iv$iv":Ljava/lang/Object;
    goto :goto_5

    .line 151
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_a
    const-wide/16 v22, 0x0

    .end local v15    # "destination$iv$iv":Ljava/util/Collection;
    .end local v16    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$filterTo":I
    move-object v9, v15

    check-cast v9, Ljava/util/List;

    .line 149
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter":I
    check-cast v9, Ljava/lang/Iterable;

    .line 72
    nop

    .local v9, "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 152
    .local v0, "$i$f$sortedByDescending":I
    new-instance v7, Lcom/pymcl/ai/CheckpointStore$rollback$lambda$0$$inlined$sortedByDescending$1;

    invoke-direct {v7}, Lcom/pymcl/ai/CheckpointStore$rollback$lambda$0$$inlined$sortedByDescending$1;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v7

    .line 72
    .end local v0    # "$i$f$sortedByDescending":I
    .end local v9    # "$this$sortedByDescending$iv":Ljava/lang/Iterable;
    nop

    .line 73
    .local v7, "undo":Ljava/util/List;
    move-object v0, v7

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 153
    .local v9, "$i$f$all":I
    instance-of v10, v0, Ljava/util/Collection;

    if-eqz v10, :cond_b

    move-object v10, v0

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_b

    const/4 v12, 0x1

    const/16 v17, 0x1

    const/16 v19, 0x0

    goto :goto_8

    .line 154
    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Ljava/util/Map;

    move-object/from16 v17, v16

    .local v17, "it":Ljava/util/Map;
    const/16 v16, 0x0

    .line 73
    .local v16, "$i$a$-all-CheckpointStore$rollback$1$rewindable$1":I
    const-string v8, "rewindable"

    move-object/from16 v11, v17

    const/16 v19, 0x0

    .end local v17    # "it":Ljava/util/Map;
    .restart local v11    # "it":Ljava/util/Map;
    invoke-static {v11, v8}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v8

    const/16 v17, 0x1

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 154
    .end local v11    # "it":Ljava/util/Map;
    .end local v16    # "$i$a$-all-CheckpointStore$rollback$1$rewindable$1":I
    if-eqz v8, :cond_c

    move/from16 v12, v19

    goto :goto_8

    .line 155
    .end local v15    # "element$iv":Ljava/lang/Object;
    :cond_d
    const/16 v17, 0x1

    const/16 v19, 0x0

    move/from16 v12, v17

    .line 73
    .end local v0    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$all":I
    :goto_8
    nop

    .line 74
    .local v12, "rewindable":Z
    const/4 v8, 0x0

    .local v8, "restored":I
    const/4 v0, 0x0

    .line 75
    .local v0, "failed":I
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->blobs(Ljava/lang/String;)Ljava/io/File;

    move-result-object v9

    .line 76
    .local v9, "bd":Ljava/io/File;
    new-instance v10, Ljava/util/HashSet;

    invoke-direct {v10}, Ljava/util/HashSet;-><init>()V

    .line 77
    .local v10, "changed":Ljava/util/HashSet;
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_30

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map;

    .line 78
    .local v15, "e":Ljava/util/Map;
    const-string v3, "rewindable"

    invoke-static {v15, v3}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v3

    move/from16 v16, v4

    .end local v4    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .local v16, "$i$a$-synchronized-CheckpointStore$rollback$1":I
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2f

    .line 79
    const-string v3, "paths"

    invoke-static {v15, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 156
    .local v4, "$i$f$associateBy":I
    move/from16 v20, v4

    .end local v4    # "$i$f$associateBy":I
    .local v20, "$i$f$associateBy":I
    const/16 v4, 0xa

    invoke-static {v3, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v4

    move-object/from16 v21, v3

    .end local v3    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .local v21, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/16 v3, 0x10

    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    .line 157
    .local v3, "capacity$iv":I
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v4, Ljava/util/Map;

    .local v4, "destination$iv$iv":Ljava/util/Map;
    move-object/from16 v24, v21

    .local v24, "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    const/16 v25, 0x0

    .line 158
    .local v25, "$i$f$associateByTo":I
    invoke-interface/range {v24 .. v24}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_a
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_f

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    move-object/from16 v28, v27

    .line 159
    .local v28, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v27, v28

    check-cast v27, Ljava/util/Map;

    move-object/from16 v29, v27

    .local v29, "it":Ljava/util/Map;
    const/16 v27, 0x0

    .line 79
    .local v27, "$i$a$-associateBy-CheckpointStore$rollback$1$known$1":I
    move/from16 v30, v3

    .end local v3    # "capacity$iv":I
    .local v30, "capacity$iv":I
    const-string v3, "path"

    move-object/from16 v31, v6

    move-object/from16 v6, v29

    .end local v29    # "it":Ljava/util/Map;
    .local v6, "it":Ljava/util/Map;
    .local v31, "all":Ljava/util/List;
    invoke-static {v6, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_e

    const-string v3, ""

    .line 159
    .end local v6    # "it":Ljava/util/Map;
    .end local v27    # "$i$a$-associateBy-CheckpointStore$rollback$1$known$1":I
    :cond_e
    move-object/from16 v6, v28

    .end local v28    # "element$iv$iv":Ljava/lang/Object;
    .local v6, "element$iv$iv":Ljava/lang/Object;
    invoke-interface {v4, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v3, v30

    move-object/from16 v6, v31

    goto :goto_a

    .line 161
    .end local v30    # "capacity$iv":I
    .end local v31    # "all":Ljava/util/List;
    .restart local v3    # "capacity$iv":I
    .local v6, "all":Ljava/util/List;
    :cond_f
    move/from16 v30, v3

    move-object/from16 v31, v6

    .line 157
    .end local v3    # "capacity$iv":I
    .end local v4    # "destination$iv$iv":Ljava/util/Map;
    .end local v6    # "all":Ljava/util/List;
    .end local v24    # "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    .end local v25    # "$i$f$associateByTo":I
    .restart local v30    # "capacity$iv":I
    .restart local v31    # "all":Ljava/util/List;
    nop

    .line 79
    .end local v20    # "$i$f$associateBy":I
    .end local v21    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .end local v30    # "capacity$iv":I
    nop

    .line 81
    .local v4, "known":Ljava/util/Map;
    const-string v3, "roots"

    invoke-static {v15, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_20

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map;

    .line 82
    .local v6, "r":Ljava/util/Map;
    move/from16 v20, v0

    .end local v0    # "failed":I
    .local v20, "failed":I
    const-string v0, "path"

    invoke-static {v6, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    move-object/from16 v21, v3

    move-object/from16 v30, v4

    move-object/from16 v35, v7

    const/4 v6, 0x0

    goto/16 :goto_14

    :cond_10
    move-object/from16 v21, v3

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 83
    .local v3, "rp":Ljava/io/File;
    const-string v0, "dir"

    invoke-static {v6, v0}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v24, v6

    .end local v6    # "r":Ljava/util/Map;
    .local v24, "r":Ljava/util/Map;
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {v3}, Lkotlin/io/FilesKt;->walkBottomUp(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    .local v0, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v6, 0x0

    .line 162
    .local v6, "$i$f$forEach":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v25

    :goto_c
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_1e

    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    .local v26, "element$iv":Ljava/lang/Object;
    move-object/from16 v27, v26

    check-cast v27, Ljava/io/File;

    move-object/from16 v28, v27

    .local v28, "f":Ljava/io/File;
    const/16 v27, 0x0

    .line 84
    .local v27, "$i$a$-forEach-CheckpointStore$rollback$1$1":I
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->isFile()Z

    move-result v29

    if-eqz v29, :cond_13

    move-object/from16 v29, v0

    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .local v29, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_11

    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v30, v4

    .end local v4    # "known":Ljava/util/Map;
    .local v30, "known":Ljava/util/Map;
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .end local v30    # "known":Ljava/util/Map;
    .restart local v4    # "known":Ljava/util/Map;
    :cond_11
    move-object/from16 v30, v4

    .end local v4    # "known":Ljava/util/Map;
    .restart local v30    # "known":Ljava/util/Map;
    add-int/lit8 v20, v20, 0x1

    :goto_d
    move/from16 v18, v6

    move-object/from16 v35, v7

    move-object/from16 v32, v28

    const/4 v6, 0x0

    move-object/from16 v28, v3

    goto/16 :goto_13

    .end local v30    # "known":Ljava/util/Map;
    .restart local v4    # "known":Ljava/util/Map;
    :cond_12
    move-object/from16 v30, v4

    .end local v4    # "known":Ljava/util/Map;
    .restart local v30    # "known":Ljava/util/Map;
    goto :goto_e

    .end local v29    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v30    # "known":Ljava/util/Map;
    .restart local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v4    # "known":Ljava/util/Map;
    :cond_13
    move-object/from16 v29, v0

    move-object/from16 v30, v4

    .line 85
    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v4    # "known":Ljava/util/Map;
    .restart local v29    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v30    # "known":Ljava/util/Map;
    :goto_e
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1c

    move-object/from16 v0, v28

    .end local v28    # "f":Ljava/io/File;
    .local v0, "f":Ljava/io/File;
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_15

    array-length v4, v4

    if-nez v4, :cond_14

    move/from16 v4, v17

    goto :goto_f

    :cond_14
    move/from16 v4, v19

    :goto_f
    move-object/from16 v28, v3

    move/from16 v3, v17

    .end local v3    # "rp":Ljava/io/File;
    .local v28, "rp":Ljava/io/File;
    if-ne v4, v3, :cond_16

    const/4 v3, 0x1

    goto :goto_10

    .end local v28    # "rp":Ljava/io/File;
    .restart local v3    # "rp":Ljava/io/File;
    :cond_15
    move-object/from16 v28, v3

    .end local v3    # "rp":Ljava/io/File;
    .restart local v28    # "rp":Ljava/io/File;
    :cond_16
    move/from16 v3, v19

    :goto_10
    if-eqz v3, :cond_1a

    invoke-interface/range {v30 .. v30}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 163
    .local v4, "$i$f$none":I
    move-object/from16 v32, v0

    .end local v0    # "f":Ljava/io/File;
    .local v32, "f":Ljava/io/File;
    instance-of v0, v3, Ljava/util/Collection;

    if-eqz v0, :cond_17

    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_17

    move/from16 v18, v6

    move-object/from16 v35, v7

    const/4 v0, 0x1

    const/4 v6, 0x0

    goto :goto_12

    .line 164
    :cond_17
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    .local v33, "element$iv":Ljava/lang/Object;
    move-object/from16 v34, v33

    check-cast v34, Ljava/lang/String;

    move-object/from16 v35, v34

    .local v35, "it":Ljava/lang/String;
    const/16 v34, 0x0

    .line 85
    .local v34, "$i$a$-none-CheckpointStore$rollback$1$1$1":I
    move-object/from16 v36, v0

    invoke-virtual/range {v32 .. v32}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v37, v3

    .end local v3    # "$this$none$iv":Ljava/lang/Iterable;
    .local v37, "$this$none$iv":Ljava/lang/Iterable;
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    move/from16 v38, v4

    .end local v4    # "$i$f$none":I
    .local v38, "$i$f$none":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x2

    move/from16 v18, v6

    move-object/from16 v4, v35

    const/4 v6, 0x0

    move-object/from16 v35, v7

    move/from16 v7, v19

    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .local v4, "it":Ljava/lang/String;
    .local v18, "$i$f$forEach":I
    .local v35, "undo":Ljava/util/List;
    invoke-static {v4, v0, v7, v3, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 164
    .end local v4    # "it":Ljava/lang/String;
    .end local v34    # "$i$a$-none-CheckpointStore$rollback$1$1$1":I
    if-eqz v0, :cond_18

    const/4 v0, 0x0

    goto :goto_12

    :cond_18
    move/from16 v6, v18

    move-object/from16 v7, v35

    move-object/from16 v0, v36

    move-object/from16 v3, v37

    move/from16 v4, v38

    const/16 v19, 0x0

    goto :goto_11

    .line 165
    .end local v18    # "$i$f$forEach":I
    .end local v33    # "element$iv":Ljava/lang/Object;
    .end local v35    # "undo":Ljava/util/List;
    .end local v37    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v38    # "$i$f$none":I
    .restart local v3    # "$this$none$iv":Ljava/lang/Iterable;
    .local v4, "$i$f$none":I
    .restart local v6    # "$i$f$forEach":I
    .restart local v7    # "undo":Ljava/util/List;
    :cond_19
    move-object/from16 v37, v3

    move/from16 v38, v4

    move/from16 v18, v6

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .end local v3    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$none":I
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .restart local v18    # "$i$f$forEach":I
    .restart local v35    # "undo":Ljava/util/List;
    .restart local v37    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local v38    # "$i$f$none":I
    const/4 v0, 0x1

    .line 85
    .end local v37    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v38    # "$i$f$none":I
    :goto_12
    if-eqz v0, :cond_1d

    invoke-virtual/range {v32 .. v32}, Ljava/io/File;->delete()Z

    goto :goto_13

    .end local v18    # "$i$f$forEach":I
    .end local v32    # "f":Ljava/io/File;
    .end local v35    # "undo":Ljava/util/List;
    .restart local v0    # "f":Ljava/io/File;
    .restart local v6    # "$i$f$forEach":I
    .restart local v7    # "undo":Ljava/util/List;
    :cond_1a
    move-object/from16 v32, v0

    move/from16 v18, v6

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .end local v0    # "f":Ljava/io/File;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .restart local v18    # "$i$f$forEach":I
    .restart local v32    # "f":Ljava/io/File;
    .restart local v35    # "undo":Ljava/util/List;
    goto :goto_13

    .end local v18    # "$i$f$forEach":I
    .end local v28    # "rp":Ljava/io/File;
    .end local v32    # "f":Ljava/io/File;
    .end local v35    # "undo":Ljava/util/List;
    .restart local v0    # "f":Ljava/io/File;
    .local v3, "rp":Ljava/io/File;
    .restart local v6    # "$i$f$forEach":I
    .restart local v7    # "undo":Ljava/util/List;
    :cond_1b
    move-object/from16 v32, v0

    move-object/from16 v28, v3

    move/from16 v18, v6

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .end local v0    # "f":Ljava/io/File;
    .end local v3    # "rp":Ljava/io/File;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .restart local v18    # "$i$f$forEach":I
    .restart local v28    # "rp":Ljava/io/File;
    .restart local v32    # "f":Ljava/io/File;
    .restart local v35    # "undo":Ljava/util/List;
    goto :goto_13

    .end local v18    # "$i$f$forEach":I
    .end local v32    # "f":Ljava/io/File;
    .end local v35    # "undo":Ljava/util/List;
    .restart local v3    # "rp":Ljava/io/File;
    .restart local v6    # "$i$f$forEach":I
    .restart local v7    # "undo":Ljava/util/List;
    .local v28, "f":Ljava/io/File;
    :cond_1c
    move/from16 v18, v6

    move-object/from16 v35, v7

    move-object/from16 v32, v28

    const/4 v6, 0x0

    move-object/from16 v28, v3

    .line 86
    .end local v3    # "rp":Ljava/io/File;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .restart local v18    # "$i$f$forEach":I
    .local v28, "rp":Ljava/io/File;
    .restart local v32    # "f":Ljava/io/File;
    .restart local v35    # "undo":Ljava/util/List;
    :cond_1d
    :goto_13
    nop

    .line 162
    .end local v27    # "$i$a$-forEach-CheckpointStore$rollback$1$1":I
    .end local v32    # "f":Ljava/io/File;
    move/from16 v6, v18

    move-object/from16 v3, v28

    move-object/from16 v0, v29

    move-object/from16 v4, v30

    move-object/from16 v7, v35

    const/16 v17, 0x1

    const/16 v19, 0x0

    .end local v26    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_c

    .line 166
    .end local v18    # "$i$f$forEach":I
    .end local v28    # "rp":Ljava/io/File;
    .end local v29    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v30    # "known":Ljava/util/Map;
    .end local v35    # "undo":Ljava/util/List;
    .local v0, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v3    # "rp":Ljava/io/File;
    .local v4, "known":Ljava/util/Map;
    .restart local v6    # "$i$f$forEach":I
    .restart local v7    # "undo":Ljava/util/List;
    :cond_1e
    move-object/from16 v29, v0

    move-object/from16 v28, v3

    move-object/from16 v30, v4

    move/from16 v18, v6

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v3    # "rp":Ljava/io/File;
    .end local v4    # "known":Ljava/util/Map;
    .end local v6    # "$i$f$forEach":I
    .end local v7    # "undo":Ljava/util/List;
    .restart local v18    # "$i$f$forEach":I
    .restart local v28    # "rp":Ljava/io/File;
    .restart local v29    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v30    # "known":Ljava/util/Map;
    .restart local v35    # "undo":Ljava/util/List;
    move/from16 v0, v20

    move-object/from16 v3, v21

    const/16 v17, 0x1

    const/16 v19, 0x0

    .end local v18    # "$i$f$forEach":I
    .end local v24    # "r":Ljava/util/Map;
    .end local v28    # "rp":Ljava/io/File;
    .end local v29    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    goto/16 :goto_b

    .line 83
    .end local v30    # "known":Ljava/util/Map;
    .end local v35    # "undo":Ljava/util/List;
    .restart local v3    # "rp":Ljava/io/File;
    .restart local v4    # "known":Ljava/util/Map;
    .restart local v7    # "undo":Ljava/util/List;
    .restart local v24    # "r":Ljava/util/Map;
    :cond_1f
    move-object/from16 v28, v3

    move-object/from16 v30, v4

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .line 81
    .end local v3    # "rp":Ljava/io/File;
    .end local v24    # "r":Ljava/util/Map;
    :goto_14
    move/from16 v0, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v30

    move-object/from16 v7, v35

    const/16 v17, 0x1

    const/16 v19, 0x0

    .end local v4    # "known":Ljava/util/Map;
    .end local v7    # "undo":Ljava/util/List;
    .restart local v30    # "known":Ljava/util/Map;
    .restart local v35    # "undo":Ljava/util/List;
    goto/16 :goto_b

    .line 88
    .end local v20    # "failed":I
    .end local v30    # "known":Ljava/util/Map;
    .end local v35    # "undo":Ljava/util/List;
    .local v0, "failed":I
    .restart local v4    # "known":Ljava/util/Map;
    .restart local v7    # "undo":Ljava/util/List;
    :cond_20
    move/from16 v20, v0

    move-object/from16 v30, v4

    move-object/from16 v35, v7

    const/4 v6, 0x0

    .end local v0    # "failed":I
    .end local v4    # "known":Ljava/util/Map;
    .end local v7    # "undo":Ljava/util/List;
    .restart local v20    # "failed":I
    .restart local v30    # "known":Ljava/util/Map;
    .restart local v35    # "undo":Ljava/util/List;
    invoke-interface/range {v30 .. v30}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "path":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    move-object v7, v0

    .line 89
    .local v7, "s":Ljava/util/Map;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v25, v0

    .local v25, "f":Ljava/io/File;
    const-string v0, "sha256"

    invoke-static {v7, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_21

    const-string v0, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_21
    move-object/from16 v18, v0

    .line 90
    .local v18, "sha":Ljava/lang/String;
    nop

    .line 91
    :try_start_1
    move-object/from16 v0, v18

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_c
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_22

    const/4 v0, 0x1

    goto :goto_16

    :cond_22
    const/4 v0, 0x0

    :goto_16
    if-eqz v0, :cond_25

    :try_start_2
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_23

    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_17

    :cond_23
    add-int/lit8 v20, v20, 0x1

    goto :goto_15

    :cond_24
    :goto_17
    move-object/from16 v32, v3

    goto/16 :goto_1e

    .line 101
    :catch_0
    move-exception v0

    move-object/from16 v32, v3

    move-object/from16 v24, v4

    move-object/from16 v33, v18

    move-object/from16 v6, v25

    goto/16 :goto_1f

    .line 93
    :cond_25
    :try_start_3
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->isFile()Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_26

    :try_start_4
    sget-object v0, Lcom/pymcl/ai/CheckpointStore;->Companion:Lcom/pymcl/ai/CheckpointStore$Companion;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v6, v25

    .end local v25    # "f":Ljava/io/File;
    .local v6, "f":Ljava/io/File;
    :try_start_5
    invoke-virtual {v0, v6}, Lcom/pymcl/ai/CheckpointStore$Companion;->sha256(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_18

    .line 101
    :catch_1
    move-exception v0

    move-object/from16 v32, v3

    move-object/from16 v24, v4

    move-object/from16 v33, v18

    goto/16 :goto_1f

    .end local v6    # "f":Ljava/io/File;
    .restart local v25    # "f":Ljava/io/File;
    :catch_2
    move-exception v0

    move-object/from16 v6, v25

    move-object/from16 v32, v3

    move-object/from16 v24, v4

    move-object/from16 v33, v18

    .end local v25    # "f":Ljava/io/File;
    .restart local v6    # "f":Ljava/io/File;
    goto/16 :goto_1f

    .line 93
    .end local v6    # "f":Ljava/io/File;
    .restart local v25    # "f":Ljava/io/File;
    :cond_26
    move-object/from16 v6, v25

    .end local v25    # "f":Ljava/io/File;
    .restart local v6    # "f":Ljava/io/File;
    :try_start_6
    const-string v0, ""
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_b
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 94
    .local v0, "cur":Ljava/lang/String;
    :goto_18
    move-object/from16 v32, v3

    move-object/from16 v3, v18

    .end local v18    # "sha":Ljava/lang/String;
    .local v3, "sha":Ljava/lang/String;
    :try_start_7
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v18
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_a
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-nez v18, :cond_29

    .line 95
    move-object/from16 v18, v0

    .end local v0    # "cur":Ljava/lang/String;
    .local v18, "cur":Ljava/lang/String;
    :try_start_8
    new-instance v0, Ljava/io/File;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    move-object/from16 v25, v6

    .end local v6    # "f":Ljava/io/File;
    .restart local v25    # "f":Ljava/io/File;
    :try_start_9
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move-object/from16 v33, v3

    .end local v3    # "sha":Ljava/lang/String;
    .local v33, "sha":Ljava/lang/String;
    :try_start_a
    const-string v3, ".bin"

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v9, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v24, v0

    .line 96
    .local v24, "blob":Ljava/io/File;
    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_27

    add-int/lit8 v20, v20, 0x1

    move-object/from16 v3, v32

    const/4 v6, 0x0

    goto/16 :goto_15

    .line 97
    :cond_27
    invoke-virtual/range {v25 .. v25}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-eqz v0, :cond_28

    :try_start_b
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto :goto_19

    .line 101
    .end local v18    # "cur":Ljava/lang/String;
    .end local v24    # "blob":Ljava/io/File;
    :catch_3
    move-exception v0

    move-object/from16 v24, v4

    move-object/from16 v6, v25

    goto/16 :goto_1f

    .line 97
    .restart local v18    # "cur":Ljava/lang/String;
    .restart local v24    # "blob":Ljava/io/File;
    :cond_28
    :goto_19
    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x0

    :try_start_c
    invoke-static/range {v24 .. v29}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    move-object/from16 v6, v25

    .end local v25    # "f":Ljava/io/File;
    .restart local v6    # "f":Ljava/io/File;
    :try_start_d
    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_7
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    goto :goto_1a

    .line 101
    .end local v6    # "f":Ljava/io/File;
    .end local v18    # "cur":Ljava/lang/String;
    .end local v24    # "blob":Ljava/io/File;
    .restart local v25    # "f":Ljava/io/File;
    :catch_4
    move-exception v0

    move-object/from16 v6, v25

    move-object/from16 v24, v4

    .end local v25    # "f":Ljava/io/File;
    .restart local v6    # "f":Ljava/io/File;
    goto/16 :goto_1f

    .end local v6    # "f":Ljava/io/File;
    .end local v33    # "sha":Ljava/lang/String;
    .restart local v3    # "sha":Ljava/lang/String;
    .restart local v25    # "f":Ljava/io/File;
    :catch_5
    move-exception v0

    move-object/from16 v33, v3

    move-object/from16 v6, v25

    move-object/from16 v24, v4

    .end local v3    # "sha":Ljava/lang/String;
    .end local v25    # "f":Ljava/io/File;
    .restart local v6    # "f":Ljava/io/File;
    .restart local v33    # "sha":Ljava/lang/String;
    goto/16 :goto_1f

    .end local v33    # "sha":Ljava/lang/String;
    .restart local v3    # "sha":Ljava/lang/String;
    :catch_6
    move-exception v0

    move-object/from16 v33, v3

    move-object/from16 v24, v4

    .end local v3    # "sha":Ljava/lang/String;
    .restart local v33    # "sha":Ljava/lang/String;
    goto/16 :goto_1f

    .line 94
    .end local v33    # "sha":Ljava/lang/String;
    .restart local v0    # "cur":Ljava/lang/String;
    .restart local v3    # "sha":Ljava/lang/String;
    :cond_29
    move-object/from16 v18, v0

    move-object/from16 v33, v3

    .line 99
    .end local v0    # "cur":Ljava/lang/String;
    .end local v3    # "sha":Ljava/lang/String;
    .restart local v18    # "cur":Ljava/lang/String;
    .restart local v33    # "sha":Ljava/lang/String;
    :goto_1a
    :try_start_e
    const-string v0, "mtime"

    invoke-static {v7, v0}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_9
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    if-eqz v0, :cond_2a

    :try_start_f
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v24
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_7
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    goto :goto_1b

    .line 101
    .end local v18    # "cur":Ljava/lang/String;
    :catch_7
    move-exception v0

    move-object/from16 v24, v4

    goto :goto_1f

    .line 99
    .restart local v18    # "cur":Ljava/lang/String;
    :cond_2a
    move-wide/from16 v24, v22

    :goto_1b
    :try_start_10
    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v24

    .line 125
    .local v24, "it":J
    const/4 v3, 0x0

    .line 99
    .local v3, "$i$a$-takeIf-CheckpointStore$rollback$1$2":I
    cmp-long v26, v24, v22

    if-lez v26, :cond_2b

    const/4 v3, 0x1

    goto :goto_1c

    :cond_2b
    const/4 v3, 0x0

    .end local v3    # "$i$a$-takeIf-CheckpointStore$rollback$1$2":I
    .end local v24    # "it":J
    :goto_1c
    if-eqz v3, :cond_2c

    goto :goto_1d

    :cond_2c
    const/4 v0, 0x0

    :goto_1d
    if-eqz v0, :cond_2d

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v24
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_9
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    move-wide/from16 v26, v24

    .line 125
    .local v26, "it":J
    const/4 v0, 0x0

    .line 99
    .local v0, "$i$a$-let-CheckpointStore$rollback$1$3":I
    move-object/from16 v24, v4

    move-wide/from16 v3, v26

    .end local v4    # "path":Ljava/lang/String;
    .end local v26    # "it":J
    .local v3, "it":J
    .local v24, "path":Ljava/lang/String;
    :try_start_11
    invoke-virtual {v6, v3, v4}, Ljava/io/File;->setLastModified(J)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_8
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .end local v0    # "$i$a$-let-CheckpointStore$rollback$1$3":I
    .end local v3    # "it":J
    goto :goto_1e

    .line 101
    .end local v18    # "cur":Ljava/lang/String;
    :catch_8
    move-exception v0

    goto :goto_1f

    .line 99
    .end local v24    # "path":Ljava/lang/String;
    .restart local v4    # "path":Ljava/lang/String;
    .restart local v18    # "cur":Ljava/lang/String;
    :cond_2d
    move-object/from16 v24, v4

    .line 88
    .end local v4    # "path":Ljava/lang/String;
    .end local v6    # "f":Ljava/io/File;
    .end local v7    # "s":Ljava/util/Map;
    .end local v18    # "cur":Ljava/lang/String;
    .end local v33    # "sha":Ljava/lang/String;
    :goto_1e
    move-object/from16 v3, v32

    const/4 v6, 0x0

    goto/16 :goto_15

    .line 101
    .restart local v4    # "path":Ljava/lang/String;
    .restart local v6    # "f":Ljava/io/File;
    .restart local v7    # "s":Ljava/util/Map;
    .restart local v33    # "sha":Ljava/lang/String;
    :catch_9
    move-exception v0

    move-object/from16 v24, v4

    .end local v4    # "path":Ljava/lang/String;
    .restart local v24    # "path":Ljava/lang/String;
    goto :goto_1f

    .end local v24    # "path":Ljava/lang/String;
    .end local v33    # "sha":Ljava/lang/String;
    .local v3, "sha":Ljava/lang/String;
    .restart local v4    # "path":Ljava/lang/String;
    :catch_a
    move-exception v0

    move-object/from16 v33, v3

    move-object/from16 v24, v4

    .end local v3    # "sha":Ljava/lang/String;
    .end local v4    # "path":Ljava/lang/String;
    .restart local v24    # "path":Ljava/lang/String;
    .restart local v33    # "sha":Ljava/lang/String;
    goto :goto_1f

    .end local v24    # "path":Ljava/lang/String;
    .end local v33    # "sha":Ljava/lang/String;
    .restart local v4    # "path":Ljava/lang/String;
    .local v18, "sha":Ljava/lang/String;
    :catch_b
    move-exception v0

    move-object/from16 v32, v3

    move-object/from16 v24, v4

    move-object/from16 v33, v18

    .end local v4    # "path":Ljava/lang/String;
    .end local v18    # "sha":Ljava/lang/String;
    .restart local v24    # "path":Ljava/lang/String;
    .restart local v33    # "sha":Ljava/lang/String;
    goto :goto_1f

    .end local v6    # "f":Ljava/io/File;
    .end local v24    # "path":Ljava/lang/String;
    .end local v33    # "sha":Ljava/lang/String;
    .restart local v4    # "path":Ljava/lang/String;
    .restart local v18    # "sha":Ljava/lang/String;
    .restart local v25    # "f":Ljava/io/File;
    :catch_c
    move-exception v0

    move-object/from16 v32, v3

    move-object/from16 v24, v4

    move-object/from16 v33, v18

    move-object/from16 v6, v25

    .end local v4    # "path":Ljava/lang/String;
    .end local v18    # "sha":Ljava/lang/String;
    .end local v25    # "f":Ljava/io/File;
    .local v0, "<unused var>":Ljava/lang/Exception;
    .restart local v6    # "f":Ljava/io/File;
    .restart local v24    # "path":Ljava/lang/String;
    .restart local v33    # "sha":Ljava/lang/String;
    :goto_1f
    add-int/lit8 v20, v20, 0x1

    move-object/from16 v3, v32

    const/4 v6, 0x0

    .end local v0    # "<unused var>":Ljava/lang/Exception;
    .end local v6    # "f":Ljava/io/File;
    .end local v7    # "s":Ljava/util/Map;
    .end local v24    # "path":Ljava/lang/String;
    .end local v33    # "sha":Ljava/lang/String;
    goto/16 :goto_15

    .line 88
    :cond_2e
    move-object/from16 v3, p2

    move/from16 v4, v16

    move/from16 v0, v20

    move-object/from16 v6, v31

    move-object/from16 v7, v35

    const/16 v17, 0x1

    const/16 v19, 0x0

    goto/16 :goto_9

    .line 78
    .end local v20    # "failed":I
    .end local v30    # "known":Ljava/util/Map;
    .end local v31    # "all":Ljava/util/List;
    .end local v35    # "undo":Ljava/util/List;
    .local v0, "failed":I
    .local v6, "all":Ljava/util/List;
    .local v7, "undo":Ljava/util/List;
    :cond_2f
    move-object/from16 v31, v6

    move-object/from16 v35, v7

    .end local v6    # "all":Ljava/util/List;
    .end local v7    # "undo":Ljava/util/List;
    .restart local v31    # "all":Ljava/util/List;
    .restart local v35    # "undo":Ljava/util/List;
    move-object/from16 v3, p2

    move/from16 v4, v16

    const/16 v17, 0x1

    const/16 v19, 0x0

    goto/16 :goto_9

    .line 104
    .end local v15    # "e":Ljava/util/Map;
    .end local v16    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .end local v31    # "all":Ljava/util/List;
    .end local v35    # "undo":Ljava/util/List;
    .local v4, "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .restart local v6    # "all":Ljava/util/List;
    .restart local v7    # "undo":Ljava/util/List;
    :cond_30
    move/from16 v16, v4

    move-object/from16 v31, v6

    move-object/from16 v35, v7

    .end local v4    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .end local v6    # "all":Ljava/util/List;
    .end local v7    # "undo":Ljava/util/List;
    .restart local v16    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .restart local v31    # "all":Ljava/util/List;
    .restart local v35    # "undo":Ljava/util/List;
    :try_start_12
    invoke-virtual {v10}, Ljava/util/HashSet;->size()I

    move-result v3

    .line 105
    .end local v8    # "restored":I
    .local v3, "restored":I
    invoke-direct {v1, v5}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lcom/pymcl/ai/CheckpointStore$$ExternalSyntheticLambda0;

    invoke-direct {v6, v13, v14}, Lcom/pymcl/ai/CheckpointStore$$ExternalSyntheticLambda0;-><init>(J)V

    invoke-static {v4, v6}, Lkotlin/collections/CollectionsKt;->removeAll(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z

    .line 106
    sget-object v4, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->journalFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v4, v6, v5}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 107
    invoke-direct {v1, v2, v5}, Lcom/pymcl/ai/CheckpointStore;->pruneBlobs(Ljava/lang/String;Ljava/util/Map;)V

    .line 108
    new-instance v4, Lcom/pymcl/ai/RollbackResult;

    const/4 v6, 0x1

    invoke-direct {v4, v3, v0, v6, v12}, Lcom/pymcl/ai/RollbackResult;-><init>(IIZZ)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    .line 69
    .end local v0    # "failed":I
    .end local v3    # "restored":I
    .end local v5    # "j":Ljava/util/Map;
    .end local v9    # "bd":Ljava/io/File;
    .end local v10    # "changed":Ljava/util/HashSet;
    .end local v12    # "rewindable":Z
    .end local v13    # "first":J
    .end local v16    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .end local v31    # "all":Ljava/util/List;
    .end local v35    # "undo":Ljava/util/List;
    monitor-exit p0

    .line 109
    return-object v4

    .line 71
    .restart local v4    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .restart local v5    # "j":Ljava/util/Map;
    .restart local v6    # "all":Ljava/util/List;
    :cond_31
    move/from16 v16, v4

    move-object/from16 v31, v6

    .end local v4    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .end local v6    # "all":Ljava/util/List;
    .restart local v16    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .restart local v31    # "all":Ljava/util/List;
    :try_start_13
    new-instance v0, Lcom/pymcl/ai/RollbackResult;

    const/4 v3, 0x1

    const/4 v7, 0x0

    invoke-direct {v0, v7, v7, v7, v3}, Lcom/pymcl/ai/RollbackResult;-><init>(IIZZ)V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    .line 69
    .end local v5    # "j":Ljava/util/Map;
    .end local v16    # "$i$a$-synchronized-CheckpointStore$rollback$1":I
    .end local v31    # "all":Ljava/util/List;
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final snapshot(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/pymcl/ai/SnapshotResult;
    .locals 31
    .param p1, "chat"    # Ljava/lang/String;
    .param p2, "turnId"    # Ljava/lang/String;
    .param p3, "tool"    # Ljava/lang/String;
    .param p4, "paths"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Lcom/pymcl/ai/SnapshotResult;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v0, "chat"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tool"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paths"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    monitor-enter p0

    const/4 v0, 0x0

    .line 33
    .local v0, "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    :try_start_0
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->loadJ(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 34
    .local v6, "j":Ljava/util/Map;
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .local v7, "files":Ljava/util/LinkedHashMap;
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/List;

    .line 36
    .local v8, "roots":Ljava/util/List;
    const/4 v9, 0x0

    .line 37
    .local v9, "warn":Ljava/lang/String;
    move-object v10, v4

    check-cast v10, Ljava/lang/Iterable;

    .local v10, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 126
    .local v11, "$i$f$map":I
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v10, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v10

    .local v13, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 127
    .local v14, "$i$f$mapTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_0
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_0

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 128
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v16

    check-cast v17, Ljava/io/File;

    .local v17, "it":Ljava/io/File;
    const/16 v18, 0x0

    .line 37
    .local v18, "$i$a$-map-CheckpointStore$snapshot$1$1":I
    move/from16 v19, v0

    .end local v0    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    .local v19, "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v0

    .line 128
    .end local v17    # "it":Ljava/io/File;
    .end local v18    # "$i$a$-map-CheckpointStore$snapshot$1$1":I
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v0, v19

    goto :goto_0

    .line 129
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    .restart local v0    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    :cond_0
    move/from16 v19, v0

    .end local v0    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapTo":I
    .restart local v19    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 126
    nop

    .end local v10    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$map":I
    check-cast v0, Ljava/lang/Iterable;

    .line 37
    nop

    .local v0, "$this$distinctBy$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 130
    .local v10, "$i$f$distinctBy":I
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 131
    .local v11, "set$iv":Ljava/util/HashSet;
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .local v12, "list$iv":Ljava/util/ArrayList;
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_1
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 133
    .local v14, "e$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/io/File;

    .local v15, "it":Ljava/io/File;
    const/16 v16, 0x0

    .line 37
    .local v16, "$i$a$-distinctBy-CheckpointStore$snapshot$1$2":I
    invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v17

    .line 133
    .end local v15    # "it":Ljava/io/File;
    .end local v16    # "$i$a$-distinctBy-CheckpointStore$snapshot$1$2":I
    move-object/from16 v15, v17

    .line 134
    .local v15, "key$iv":Ljava/lang/Object;
    invoke-virtual {v11, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1

    .line 135
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 137
    .end local v14    # "e$iv":Ljava/lang/Object;
    .end local v15    # "key$iv":Ljava/lang/Object;
    :cond_2
    move-object v13, v12

    check-cast v13, Ljava/util/List;

    .line 37
    .end local v0    # "$this$distinctBy$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$distinctBy":I
    .end local v11    # "set$iv":Ljava/util/HashSet;
    .end local v12    # "list$iv":Ljava/util/ArrayList;
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x2

    const/4 v13, 0x0

    if-eqz v10, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/io/File;

    .line 38
    .local v10, "p":Ljava/io/File;
    move-object v14, v8

    check-cast v14, Ljava/util/Collection;

    new-array v15, v11, [Lkotlin/Pair;

    move/from16 v16, v11

    const-string v11, "path"

    const/16 v17, 0x1

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v15, v13

    const-string v11, "dir"

    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    move-result v12

    if-nez v12, :cond_5

    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v12

    if-nez v12, :cond_4

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v10}, Lkotlin/io/FilesKt;->getExtension(Ljava/io/File;)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_3

    move/from16 v12, v17

    goto :goto_3

    :cond_3
    move v12, v13

    :goto_3
    if-eqz v12, :cond_4

    goto :goto_4

    :cond_4
    move v12, v13

    goto :goto_5

    :cond_5
    :goto_4
    move/from16 v12, v17

    :goto_5
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v15, v17

    invoke-static {v15}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v11

    invoke-interface {v14, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    move-result v11

    if-eqz v11, :cond_8

    .line 40
    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v10}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v11

    check-cast v11, Lkotlin/sequences/Sequence;

    new-instance v12, Lcom/pymcl/ai/CheckpointStore$$ExternalSyntheticLambda1;

    invoke-direct {v12}, Lcom/pymcl/ai/CheckpointStore$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v11, v12}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v11

    const/16 v12, 0x4e21

    invoke-static {v11, v12}, Lkotlin/sequences/SequencesKt;->take(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    move-result-object v11

    invoke-static {v11}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v11

    .line 41
    .local v11, "list":Ljava/util/List;
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v12

    const/16 v14, 0x4e20

    if-le v12, v14, :cond_6

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "\u76ee\u5f55 "

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, " \u8d85\u8fc7 20000 \u4e2a\u6587\u4ef6\uff0c\u672c\u8f6e\u6539\u52a8\u65e0\u6cd5\u81ea\u52a8\u64a4\u56de"

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    goto :goto_7

    .line 42
    :cond_6
    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    .local v12, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 138
    .local v13, "$i$f$forEach":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Ljava/io/File;

    move-object/from16 v17, v16

    .restart local v17    # "it":Ljava/io/File;
    const/16 v16, 0x0

    .line 42
    .local v16, "$i$a$-forEach-CheckpointStore$snapshot$1$3":I
    move-object/from16 v18, v0

    move-object v0, v7

    check-cast v0, Ljava/util/Map;

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v17

    .end local v17    # "it":Ljava/io/File;
    .local v5, "it":Ljava/io/File;
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .end local v5    # "it":Ljava/io/File;
    .end local v16    # "$i$a$-forEach-CheckpointStore$snapshot$1$3":I
    move-object/from16 v5, p1

    move-object/from16 v4, p4

    move-object/from16 v0, v18

    .end local v15    # "element$iv":Ljava/lang/Object;
    goto :goto_6

    .line 139
    :cond_7
    move-object/from16 v18, v0

    move-object/from16 v5, p1

    move-object/from16 v4, p4

    .end local v11    # "list":Ljava/util/List;
    .end local v12    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach":I
    goto/16 :goto_2

    .line 43
    :cond_8
    move-object/from16 v18, v0

    move-object v0, v7

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v10}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, p1

    move-object/from16 v4, p4

    move-object/from16 v0, v18

    goto/16 :goto_2

    .line 37
    .end local v10    # "p":Ljava/io/File;
    :cond_9
    move/from16 v16, v11

    const/16 v17, 0x1

    .line 45
    :goto_7
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v4, "<get-values>(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 140
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v0

    .local v10, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 141
    .local v11, "$i$f$filterTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_a
    :goto_8
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/io/File;

    .local v15, "it":Ljava/io/File;
    const/16 v18, 0x0

    .line 45
    .local v18, "$i$a$-filter-CheckpointStore$snapshot$1$total$1":I
    invoke-virtual {v15}, Ljava/io/File;->isFile()Z

    move-result v20

    .line 141
    .end local v15    # "it":Ljava/io/File;
    .end local v18    # "$i$a$-filter-CheckpointStore$snapshot$1$total$1":I
    if-eqz v20, :cond_a

    invoke-interface {v5, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_8

    .line 142
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    :cond_b
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 140
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    check-cast v5, Ljava/lang/Iterable;

    .line 45
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v10, 0x0

    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/io/File;

    .line 125
    nop

    .local v12, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 45
    .local v14, "$i$a$-sumOfLong-CheckpointStore$snapshot$1$total$2":I
    invoke-virtual {v12}, Ljava/io/File;->length()J

    move-result-wide v20

    .end local v12    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-sumOfLong-CheckpointStore$snapshot$1$total$2":I
    add-long v10, v10, v20

    goto :goto_9

    .line 46
    .local v10, "total":J
    :cond_c
    if-nez v9, :cond_d

    const-wide/32 v14, 0x20000000

    cmp-long v0, v10, v14

    if-lez v0, :cond_d

    const-string v0, "\u5feb\u7167\u8d85\u8fc7 512 MiB\uff0c\u672c\u8f6e\u6539\u52a8\u65e0\u6cd5\u81ea\u52a8\u64a4\u56de"

    move-object v9, v0

    .line 47
    :cond_d
    if-nez v9, :cond_e

    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->chatBytes(Ljava/lang/String;)J

    move-result-wide v14

    add-long/2addr v14, v10

    const-wide/32 v20, 0x40000000

    cmp-long v0, v14, v20

    if-lez v0, :cond_e

    const-string v0, "\u672c\u5bf9\u8bdd\u68c0\u67e5\u70b9\u8d85\u8fc7 1 GiB\uff0c\u672c\u8f6e\u6539\u52a8\u65e0\u6cd5\u81ea\u52a8\u64a4\u56de"

    move-object v9, v0

    .line 48
    :cond_e
    invoke-direct {v1, v6}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-nez v12, :cond_f

    const/4 v0, 0x0

    const-wide/16 v20, 0x0

    goto :goto_d

    :cond_f
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map;

    .line 125
    .local v12, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 48
    .local v14, "$i$a$-maxOfOrNull-CheckpointStore$snapshot$1$seq$1":I
    const-string v15, "seq"

    invoke-static {v12, v15}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v15

    if-eqz v15, :cond_10

    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    move-result-wide v20

    goto :goto_a

    :cond_10
    const-wide/16 v20, 0x0

    .end local v12    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-maxOfOrNull-CheckpointStore$snapshot$1$seq$1":I
    :goto_a
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    check-cast v12, Ljava/lang/Comparable;

    :cond_11
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/util/Map;

    .line 125
    .local v14, "it":Ljava/util/Map;
    const/4 v15, 0x0

    .line 48
    .local v15, "$i$a$-maxOfOrNull-CheckpointStore$snapshot$1$seq$1":I
    const-wide/16 v20, 0x0

    const-string v4, "seq"

    invoke-static {v14, v4}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_c

    :cond_12
    move-wide/from16 v4, v20

    .end local v14    # "it":Ljava/util/Map;
    .end local v15    # "$i$a$-maxOfOrNull-CheckpointStore$snapshot$1$seq$1":I
    :goto_c
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    invoke-interface {v12, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_11

    move-object v12, v4

    goto :goto_b

    :cond_13
    const-wide/16 v20, 0x0

    move-object v0, v12

    :goto_d
    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_e

    :cond_14
    move-wide/from16 v4, v20

    :goto_e
    const-wide/16 v14, 0x1

    add-long/2addr v4, v14

    .line 49
    .local v4, "seq":J
    const/4 v0, 0x7

    new-array v0, v0, [Lkotlin/Pair;

    const-string v12, "seq"

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v0, v13

    const-string v12, "turn_id"

    invoke-static {v12, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v0, v17

    const-string v12, "tool"

    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v0, v16

    const-string v12, "time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    move/from16 v18, v13

    const/16 v13, 0x3e8

    int-to-long v2, v13

    div-long/2addr v14, v2

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v12, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const-string v2, "rewindable"

    if-nez v9, :cond_15

    move/from16 v12, v17

    goto :goto_f

    :cond_15
    move/from16 v12, v18

    :goto_f
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v2, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v12, 0x4

    aput-object v2, v0, v12

    const-string v2, "roots"

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v13, 0x5

    aput-object v2, v0, v13

    const-string v2, "paths"

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/List;

    invoke-static {v2, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v13, 0x6

    aput-object v2, v0, v13

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 50
    .local v0, "e":Ljava/util/Map;
    if-nez v9, :cond_19

    .line 51
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->blobs(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    move-object v13, v2

    .line 125
    .local v13, "it":Ljava/io/File;
    const/4 v14, 0x0

    .line 51
    .local v14, "$i$a$-also-CheckpointStore$snapshot$1$bd$1":I
    invoke-virtual {v13}, Ljava/io/File;->mkdirs()Z

    .line 52
    .end local v13    # "it":Ljava/io/File;
    .end local v14    # "$i$a$-also-CheckpointStore$snapshot$1$bd$1":I
    .local v2, "bd":Ljava/io/File;
    const-string v13, "paths"

    invoke-static {v0, v13}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 53
    .local v13, "ps":Ljava/util/List;
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_10
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_18

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move/from16 v22, v3

    const-string v3, "next(...)"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Ljava/io/File;

    .line 54
    .local v15, "f":Ljava/io/File;
    invoke-virtual {v15}, Ljava/io/File;->isFile()Z

    move-result v3

    if-nez v3, :cond_16

    move-object v3, v13

    check-cast v3, Ljava/util/Collection;

    move-wide/from16 v29, v4

    .end local v4    # "seq":J
    .local v29, "seq":J
    new-array v4, v12, [Lkotlin/Pair;

    const-string v5, "path"

    invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v18

    const-string v5, "sha256"

    const-string v12, ""

    invoke-static {v5, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v17

    const-string v5, "size"

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v16

    const-string v5, "mtime"

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v4, v22

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v3, v22

    move-wide/from16 v4, v29

    const/4 v12, 0x4

    goto :goto_10

    .line 55
    .end local v29    # "seq":J
    .restart local v4    # "seq":J
    :cond_16
    move-wide/from16 v29, v4

    .end local v4    # "seq":J
    .restart local v29    # "seq":J
    sget-object v3, Lcom/pymcl/ai/CheckpointStore;->Companion:Lcom/pymcl/ai/CheckpointStore$Companion;

    invoke-virtual {v3, v15}, Lcom/pymcl/ai/CheckpointStore$Companion;->sha256(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    .line 56
    .local v3, "h":Ljava/lang/String;
    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v12, ".bin"

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v24, v4

    .local v24, "blob":Ljava/io/File;
    invoke-virtual/range {v24 .. v24}, Ljava/io/File;->isFile()Z

    move-result v4

    if-nez v4, :cond_17

    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x0

    move-object/from16 v23, v15

    .end local v15    # "f":Ljava/io/File;
    .local v23, "f":Ljava/io/File;
    invoke-static/range {v23 .. v28}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    goto :goto_11

    .end local v23    # "f":Ljava/io/File;
    .restart local v15    # "f":Ljava/io/File;
    :cond_17
    move-object/from16 v23, v15

    .line 57
    .end local v15    # "f":Ljava/io/File;
    .restart local v23    # "f":Ljava/io/File;
    :goto_11
    move-object v4, v13

    check-cast v4, Ljava/util/Collection;

    const/4 v5, 0x4

    new-array v12, v5, [Lkotlin/Pair;

    const-string v15, "path"

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v15, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v12, v18

    const-string v5, "sha256"

    invoke-static {v5, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v12, v17

    const-string v5, "size"

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->length()J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-static {v5, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v12, v16

    const-string v5, "mtime"

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->lastModified()J

    move-result-wide v25

    invoke-static/range {v25 .. v26}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-static {v5, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v12, v22

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v3, v22

    move-wide/from16 v4, v29

    const/4 v12, 0x4

    goto/16 :goto_10

    .line 53
    .end local v3    # "h":Ljava/lang/String;
    .end local v23    # "f":Ljava/io/File;
    .end local v24    # "blob":Ljava/io/File;
    .end local v29    # "seq":J
    .restart local v4    # "seq":J
    :cond_18
    move-wide/from16 v29, v4

    .end local v4    # "seq":J
    .restart local v29    # "seq":J
    goto :goto_12

    .line 50
    .end local v2    # "bd":Ljava/io/File;
    .end local v13    # "ps":Ljava/util/List;
    .end local v29    # "seq":J
    .restart local v4    # "seq":J
    :cond_19
    move-wide/from16 v29, v4

    .line 60
    .end local v4    # "seq":J
    .restart local v29    # "seq":J
    :goto_12
    invoke-direct {v1, v6}, Lcom/pymcl/ai/CheckpointStore;->entries(Ljava/util/Map;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 61
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-direct/range {p0 .. p1}, Lcom/pymcl/ai/CheckpointStore;->journalFile(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3, v6}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {v1}, Lcom/pymcl/ai/CheckpointStore;->gc()V

    .line 63
    new-instance v2, Lcom/pymcl/ai/SnapshotResult;

    if-nez v9, :cond_1a

    move/from16 v12, v17

    goto :goto_13

    :cond_1a
    move/from16 v12, v18

    :goto_13
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    invoke-direct {v2, v12, v3, v9}, Lcom/pymcl/ai/SnapshotResult;-><init>(ZILjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .end local v0    # "e":Ljava/util/Map;
    .end local v6    # "j":Ljava/util/Map;
    .end local v7    # "files":Ljava/util/LinkedHashMap;
    .end local v8    # "roots":Ljava/util/List;
    .end local v9    # "warn":Ljava/lang/String;
    .end local v10    # "total":J
    .end local v19    # "$i$a$-synchronized-CheckpointStore$snapshot$1":I
    .end local v29    # "seq":J
    monitor-exit p0

    .line 64
    return-object v2

    .line 32
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
