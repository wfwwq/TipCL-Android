.class public final Lcom/pymcl/core/instance/PlaytimeStore;
.super Ljava/lang/Object;
.source "Playtime.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlaytime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Playtime.kt\ncom/pymcl/core/instance/PlaytimeStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0008J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/core/instance/PlaytimeStore;",
        "",
        "paths",
        "Lcom/pymcl/core/config/LauncherPaths;",
        "<init>",
        "(Lcom/pymcl/core/config/LauncherPaths;)V",
        "all",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "total",
        "",
        "inst",
        "record",
        "",
        "version",
        "startSec",
        "durationSec",
        "PyMCL-Android:core"
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
.field private final paths:Lcom/pymcl/core/config/LauncherPaths;


# direct methods
.method public constructor <init>(Lcom/pymcl/core/config/LauncherPaths;)V
    .locals 1
    .param p1, "paths"    # Lcom/pymcl/core/config/LauncherPaths;

    const-string v0, "paths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/PlaytimeStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    return-void
.end method


# virtual methods
.method public final all()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v1, p0, Lcom/pymcl/core/instance/PlaytimeStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v1}, Lcom/pymcl/core/config/LauncherPaths;->getPlaytimeFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "instances"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public final declared-synchronized record(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 16
    .param p1, "inst"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "startSec"    # J
    .param p5, "durationSec"    # J

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    monitor-enter p0

    :try_start_0
    const-string v3, "inst"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "version"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    sget-object v3, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v4, v1, Lcom/pymcl/core/instance/PlaytimeStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v4}, Lcom/pymcl/core/config/LauncherPaths;->getPlaytimeFile()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    new-array v3, v4, [Lkotlin/Pair;

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 13
    .end local p0    # "this":Lcom/pymcl/core/instance/PlaytimeStore;
    .local v3, "root":Ljava/util/Map;
    :cond_0
    const-string v5, "instances"

    invoke-static {v3, v5}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_1

    new-array v5, v4, [Lkotlin/Pair;

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    move-object v6, v5

    .line 72
    .local v6, "it":Ljava/util/Map;
    const/4 v7, 0x0

    .line 13
    .local v7, "$i$a$-also-PlaytimeStore$record$insts$1":I
    const-string v8, "instances"

    invoke-interface {v3, v8, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .end local v6    # "it":Ljava/util/Map;
    .end local v7    # "$i$a$-also-PlaytimeStore$record$insts$1":I
    .local v5, "insts":Ljava/util/Map;
    :cond_1
    invoke-static {v5, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x3

    const-wide/16 v10, 0x0

    if-nez v6, :cond_2

    new-array v6, v9, [Lkotlin/Pair;

    const-string v12, "total"

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v6, v4

    const-string v12, "versions"

    new-array v13, v4, [Lkotlin/Pair;

    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v6, v8

    const-string v12, "sessions"

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/List;

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v6, v7

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    move-object v12, v6

    .line 72
    .local v12, "it":Ljava/util/Map;
    const/4 v13, 0x0

    .line 14
    .local v13, "$i$a$-also-PlaytimeStore$record$e$1":I
    invoke-interface {v5, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .end local v12    # "it":Ljava/util/Map;
    .end local v13    # "$i$a$-also-PlaytimeStore$record$e$1":I
    .local v6, "e":Ljava/util/Map;
    :cond_2
    const-string v12, "total"

    const-string v13, "total"

    invoke-static {v6, v13}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v13

    if-eqz v13, :cond_3

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    goto :goto_0

    :cond_3
    move-wide v13, v10

    :goto_0
    add-long v13, v13, p5

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-interface {v6, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    const-string v12, "versions"

    invoke-static {v6, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v12

    if-nez v12, :cond_4

    new-array v12, v4, [Lkotlin/Pair;

    invoke-static {v12}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    move-object v13, v12

    .line 72
    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 16
    .local v14, "$i$a$-also-PlaytimeStore$record$v$1":I
    const-string v15, "versions"

    invoke-interface {v6, v15, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-also-PlaytimeStore$record$v$1":I
    .local v12, "v":Ljava/util/Map;
    :cond_4
    invoke-static {v12, v2}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v13

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    :cond_5
    add-long v10, v10, p5

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-interface {v12, v2, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    const-string v10, "sessions"

    invoke-static {v6, v10}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    if-nez v10, :cond_6

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/List;

    move-object v11, v10

    .line 72
    .local v11, "it":Ljava/util/List;
    const/4 v13, 0x0

    .line 17
    .local v13, "$i$a$-also-PlaytimeStore$record$s$1":I
    const-string v14, "sessions"

    invoke-interface {v6, v14, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .end local v11    # "it":Ljava/util/List;
    .end local v13    # "$i$a$-also-PlaytimeStore$record$s$1":I
    .local v10, "s":Ljava/util/List;
    :cond_6
    new-array v9, v9, [Lkotlin/Pair;

    const-string v11, "start"

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v9, v4

    const-string v4, "duration"

    invoke-static/range {p5 .. p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-static {v4, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v9, v8

    const-string v4, "version"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v9, v7

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v10, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 19
    sget-object v4, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v7, v1, Lcom/pymcl/core/instance/PlaytimeStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v7}, Lcom/pymcl/core/config/LauncherPaths;->getPlaytimeFile()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v4, v7, v3}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    monitor-exit p0

    return-void

    .line 11
    .end local v3    # "root":Ljava/util/Map;
    .end local v5    # "insts":Ljava/util/Map;
    .end local v6    # "e":Ljava/util/Map;
    .end local v10    # "s":Ljava/util/List;
    .end local v12    # "v":Ljava/util/Map;
    .end local p1    # "inst":Ljava/lang/String;
    .end local p2    # "version":Ljava/lang/String;
    .end local p3    # "startSec":J
    .end local p5    # "durationSec":J
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final total(Ljava/lang/String;)J
    .locals 2
    .param p1, "inst"    # Ljava/lang/String;

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Lcom/pymcl/core/instance/PlaytimeStore;->all()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "total"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method
