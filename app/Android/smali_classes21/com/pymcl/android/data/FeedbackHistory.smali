.class public final Lcom/pymcl/android/data/FeedbackHistory;
.super Ljava/lang/Object;
.source "FeedbackSubmit.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/FeedbackHistory$Entry;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFeedbackSubmit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackSubmit.kt\ncom/pymcl/android/data/FeedbackHistory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1795#2,10:137\n2068#2:147\n2069#2:149\n1805#2:150\n1739#2:151\n1814#2,3:152\n1739#2:155\n1814#2,3:156\n1#3:148\n*S KotlinDebug\n*F\n+ 1 FeedbackSubmit.kt\ncom/pymcl/android/data/FeedbackHistory\n*L\n110#1:137,10\n110#1:147\n110#1:149\n110#1:150\n124#1:151\n124#1:152,3\n131#1:155\n131#1:156,3\n110#1:148\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000cJ\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\nJ\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00100\t2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/android/data/FeedbackHistory;",
        "",
        "<init>",
        "()V",
        "FILE",
        "",
        "MAX",
        "",
        "load",
        "",
        "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
        "root",
        "Ljava/io/File;",
        "append",
        "e",
        "toRows",
        "Lcom/pymcl/android/ui/state/FeedbackRecord;",
        "entries",
        "Entry",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I = 0x0

.field public static final FILE:Ljava/lang/String; = "feedback_history.json"

.field public static final INSTANCE:Lcom/pymcl/android/data/FeedbackHistory;

.field public static final MAX:I = 0xc8


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/FeedbackHistory;

    invoke-direct {v0}, Lcom/pymcl/android/data/FeedbackHistory;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/FeedbackHistory;->INSTANCE:Lcom/pymcl/android/data/FeedbackHistory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final append(Ljava/io/File;Lcom/pymcl/android/data/FeedbackHistory$Entry;)Ljava/util/List;
    .locals 26
    .param p1, "root"    # Ljava/io/File;
    .param p2, "e"    # Lcom/pymcl/android/data/FeedbackHistory$Entry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "root"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "e"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/android/data/FeedbackHistory;->load(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v3, 0xc8

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    .line 121
    .local v3, "list":Ljava/util/List;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/android/data/FeedbackHistory;

    .local v0, "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    const/4 v4, 0x0

    .line 122
    .local v4, "$i$a$-runCatching-FeedbackHistory$append$1\\1\\121\\0":I
    new-instance v5, Ljava/io/File;

    const-string v6, "feedback_history.json"

    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v5, "f\\1":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 123
    :cond_0
    new-instance v6, Ljava/io/File;

    const-string v7, "feedback_history.json.tmp"

    invoke-direct {v6, v1, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 124
    .local v6, "tmp\\1":Ljava/io/File;
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v8, 0x1

    new-array v9, v8, [Lkotlin/Pair;

    const-string v10, "items"

    move-object v11, v3

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 151
    .local v12, "$i$f$map\\2\\124":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v11, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\3":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 152
    .local v15, "$i$f$mapTo\\3\\151":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    move/from16 v18, v8

    const/16 v19, 0x0

    if-eqz v17, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 153
    .local v17, "item\\3":Ljava/lang/Object;
    move-object/from16 v20, v17

    check-cast v20, Lcom/pymcl/android/data/FeedbackHistory$Entry;

    .local v20, "it\\4":Lcom/pymcl/android/data/FeedbackHistory$Entry;
    const/16 v21, 0x0

    .line 124
    .local v21, "$i$a$-map-FeedbackHistory$append$1$1\\4\\153\\1":I
    const/16 v22, 0x2

    const/4 v8, 0x5

    new-array v8, v8, [Lkotlin/Pair;

    move-object/from16 v23, v0

    .end local v0    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .local v23, "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    const-string v0, "id"

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v8, v19

    const-string v0, "time"

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getTime()J

    move-result-wide v24

    invoke-static/range {v24 .. v25}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v8, v18

    const-string v0, "category"

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getCategory()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v8, v22

    const-string v0, "title"

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v8, v1

    const-string v0, "ok"

    invoke-virtual/range {v20 .. v20}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getOk()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v8, v1

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 153
    .end local v20    # "it\\4":Lcom/pymcl/android/data/FeedbackHistory$Entry;
    .end local v21    # "$i$a$-map-FeedbackHistory$append$1$1\\4\\153\\1":I
    invoke-interface {v13, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move/from16 v8, v18

    move-object/from16 v0, v23

    goto :goto_0

    .line 154
    .end local v17    # "item\\3":Ljava/lang/Object;
    .end local v23    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .restart local v0    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    :cond_1
    move-object/from16 v23, v0

    const/16 v22, 0x2

    .end local v0    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .end local v13    # "destination\\3":Ljava/util/Collection;
    .end local v14    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo\\3\\151":I
    .restart local v23    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    .line 151
    nop

    .line 124
    .end local v11    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map\\2\\124":I
    invoke-static {v10, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v9, v19

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    move/from16 v8, v19

    move/from16 v9, v22

    invoke-static {v7, v0, v8, v9, v1}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0, v1, v9, v1}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 125
    invoke-virtual {v6, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_2

    move/from16 v0, v18

    invoke-static {v6, v1, v0, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v1, v9, v1}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 126
    :cond_2
    nop

    .end local v4    # "$i$a$-runCatching-FeedbackHistory$append$1\\1\\121\\0":I
    .end local v5    # "f\\1":Ljava/io/File;
    .end local v6    # "tmp\\1":Ljava/io/File;
    .end local v23    # "$this$append_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    :goto_1
    return-object v3
.end method

.method public final load(Ljava/io/File;)Ljava/util/List;
    .locals 30
    .param p1, "root"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "root"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    new-instance v0, Ljava/io/File;

    const-string v2, "feedback_history.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v0

    .line 108
    .local v2, "f":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 109
    :cond_0
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/android/data/FeedbackHistory;

    .local v0, "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    const/4 v3, 0x0

    .line 110
    .local v3, "$i$a$-runCatching-FeedbackHistory$load$1\\1\\109\\0":I
    sget-object v4, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v2, v6, v5, v6}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    const-string v7, "items"

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v7, v4, Ljava/util/List;

    if-eqz v7, :cond_1

    check-cast v4, Ljava/util/List;

    goto :goto_0

    :cond_1
    move-object v4, v6

    :goto_0
    if-eqz v4, :cond_e

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$mapNotNull\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 137
    .local v7, "$i$f$mapNotNull\\2\\110":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination\\3":Ljava/util/Collection;
    move-object v9, v4

    .local v9, "$this$mapNotNullTo\\3":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 146
    .local v10, "$i$f$mapNotNullTo\\3\\137":I
    move-object v11, v9

    .local v11, "$this$forEach\\4":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 147
    .local v12, "$i$f$forEach\\4\\146":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element\\4":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "element\\5":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 146
    .local v16, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\5\\147\\3":I
    move-object/from16 v17, v15

    .local v17, "e\\6":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 111
    .local v18, "$i$a$-mapNotNull-FeedbackHistory$load$1$1\\6\\146\\1":I
    move/from16 v19, v5

    move-object/from16 v5, v17

    .end local v17    # "e\\6":Ljava/lang/Object;
    .local v5, "e\\6":Ljava/lang/Object;
    instance-of v6, v5, Ljava/util/Map;

    if-eqz v6, :cond_2

    move-object v6, v5

    check-cast v6, Ljava/util/Map;

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-nez v6, :cond_3

    move-object/from16 v27, v0

    const/16 v20, 0x0

    goto/16 :goto_7

    .line 112
    .local v6, "m\\6":Ljava/util/Map;
    :cond_3
    new-instance v20, Lcom/pymcl/android/data/FeedbackHistory$Entry;

    move-object/from16 v27, v0

    .end local v0    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .local v27, "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    const-string v0, "id"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v21, ""

    if-eqz v0, :cond_4

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    :cond_4
    move-object/from16 v0, v21

    :cond_5
    move-object/from16 v22, v0

    const-string v0, "time"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_6

    check-cast v0, Ljava/lang/Number;

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    goto :goto_4

    :cond_7
    const-wide/16 v0, 0x0

    .line 113
    :goto_4
    move-wide/from16 v23, v0

    const-string v0, "category"

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_9

    :cond_8
    const-string v0, "other"

    :cond_9
    const-string v1, "title"

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    goto :goto_5

    :cond_a
    move-object/from16 v25, v1

    goto :goto_6

    :cond_b
    :goto_5
    move-object/from16 v25, v21

    :goto_6
    const-string v1, "ok"

    invoke-interface {v6, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v21, v0

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v26

    .line 112
    move-wide/from16 v28, v23

    move-object/from16 v24, v21

    move-object/from16 v21, v22

    move-wide/from16 v22, v28

    invoke-direct/range {v20 .. v26}, Lcom/pymcl/android/data/FeedbackHistory$Entry;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Z)V

    .line 113
    nop

    .line 146
    .end local v5    # "e\\6":Ljava/lang/Object;
    .end local v6    # "m\\6":Ljava/util/Map;
    .end local v18    # "$i$a$-mapNotNull-FeedbackHistory$load$1$1\\6\\146\\1":I
    :goto_7
    if-eqz v20, :cond_c

    move-object/from16 v0, v20

    .line 148
    .local v0, "it\\5":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 146
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\148\\5":I
    invoke-interface {v8, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    .end local v0    # "it\\5":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\148\\5":I
    .end local v15    # "element\\5":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\5\\147\\3":I
    :cond_c
    move-object/from16 v1, p1

    move/from16 v5, v19

    move-object/from16 v0, v27

    const/4 v6, 0x0

    .end local v14    # "element\\4":Ljava/lang/Object;
    goto/16 :goto_1

    .line 149
    .end local v27    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .local v0, "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    :cond_d
    move-object/from16 v27, v0

    .line 150
    .end local v0    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .end local v11    # "$this$forEach\\4":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEach\\4\\146":I
    .restart local v27    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    nop

    .end local v8    # "destination\\3":Ljava/util/Collection;
    .end local v9    # "$this$mapNotNullTo\\3":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapNotNullTo\\3\\137":I
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 137
    nop

    .line 110
    .end local v4    # "$this$mapNotNull\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapNotNull\\2\\110":I
    goto :goto_8

    .line 114
    .end local v27    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .restart local v0    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    :cond_e
    move-object/from16 v27, v0

    .end local v0    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    .restart local v27    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 109
    .end local v3    # "$i$a$-runCatching-FeedbackHistory$load$1\\1\\109\\0":I
    .end local v27    # "$this$load_u24lambda_u240\\1":Lcom/pymcl/android/data/FeedbackHistory;
    :goto_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 115
    :goto_9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    move-object v0, v1

    :cond_f
    check-cast v0, Ljava/util/List;

    .line 109
    return-object v0
.end method

.method public final toRows(Ljava/util/List;)Ljava/util/List;
    .locals 20
    .param p1, "entries"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/android/data/FeedbackHistory$Entry;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/FeedbackRecord;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "entries"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 155
    .local v2, "$i$f$map\\1\\131":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 156
    .local v5, "$i$f$mapTo\\2\\155":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 157
    .local v7, "item\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/android/data/FeedbackHistory$Entry;

    .local v8, "it\\3":Lcom/pymcl/android/data/FeedbackHistory$Entry;
    const/4 v9, 0x0

    .line 132
    .local v9, "$i$a$-map-FeedbackHistory$toRows$1\\3\\157\\0":I
    sget-object v10, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v10}, Lcom/pymcl/android/data/FeedbackLogic;->getKINDS()Ljava/util/List;

    move-result-object v10

    sget-object v11, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v11}, Lcom/pymcl/android/data/FeedbackLogic;->getCATEGORY()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getCategory()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v11

    invoke-static {v10, v11}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    if-nez v10, :cond_0

    sget-object v10, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v10}, Lcom/pymcl/android/data/FeedbackLogic;->getKINDS()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 133
    .local v10, "kind\\3":Ljava/lang/String;
    :cond_0
    new-instance v11, Lcom/pymcl/android/ui/state/FeedbackRecord;

    invoke-virtual {v8}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getOk()Z

    move-result v13

    if-eqz v13, :cond_1

    const-string v13, "\u5df2\u63d0\u4ea4"

    goto :goto_1

    :cond_1
    const-string v13, "\u63d0\u4ea4\u5931\u8d25"

    :goto_1
    sget-object v14, Lcom/pymcl/android/data/FeedbackLogic;->INSTANCE:Lcom/pymcl/android/data/FeedbackLogic;

    invoke-virtual {v8}, Lcom/pymcl/android/data/FeedbackHistory$Entry;->getTime()J

    move-result-wide v15

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Lcom/pymcl/android/data/FeedbackLogic;->dateText$default(Lcom/pymcl/android/data/FeedbackLogic;JLjava/util/TimeZone;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v11, v12, v10, v13, v14}, Lcom/pymcl/android/ui/state/FeedbackRecord;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .end local v8    # "it\\3":Lcom/pymcl/android/data/FeedbackHistory$Entry;
    .end local v9    # "$i$a$-map-FeedbackHistory$toRows$1\\3\\157\\0":I
    .end local v10    # "kind\\3":Ljava/lang/String;
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 158
    .end local v7    # "item\\2":Ljava/lang/Object;
    :cond_2
    nop

    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\2\\155":I
    check-cast v3, Ljava/util/List;

    .line 155
    nop

    .line 134
    .end local v1    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map\\1\\131":I
    return-object v3
.end method
