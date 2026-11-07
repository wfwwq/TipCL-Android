.class public final Lcom/pymcl/core/instance/ServersStore;
.super Ljava/lang/Object;
.source "Playtime.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/instance/ServersStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlaytime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Playtime.kt\ncom/pymcl/core/instance/ServersStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1#2:72\n1739#3:73\n1814#3,3:74\n1739#3:77\n1814#3,3:78\n777#3:81\n873#3,2:82\n*S KotlinDebug\n*F\n+ 1 Playtime.kt\ncom/pymcl/core/instance/ServersStore\n*L\n51#1:73\n51#1:74,3\n54#1:77\n54#1:78,3\n55#1:81\n55#1:82,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cJ\u0014\u0010\u000e\u001a\u00020\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\t\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/core/instance/ServersStore;",
        "",
        "gameDir",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "json",
        "getJson",
        "()Ljava/io/File;",
        "dir",
        "getDir",
        "list",
        "",
        "Lcom/pymcl/core/instance/ServerEntry;",
        "save",
        "",
        "l",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/pymcl/core/instance/ServersStore$Companion;


# instance fields
.field private final gameDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/core/instance/ServersStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/instance/ServersStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/instance/ServersStore;->Companion:Lcom/pymcl/core/instance/ServersStore$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "gameDir"    # Ljava/io/File;

    const-string v0, "gameDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/ServersStore;->gameDir:Ljava/io/File;

    return-void
.end method

.method private final getJson()Ljava/io/File;
    .locals 3

    .line 48
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/ServersStore;->gameDir:Ljava/io/File;

    const-string v2, "servers.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final getDir()Ljava/io/File;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/pymcl/core/instance/ServersStore;->gameDir:Ljava/io/File;

    return-object v0
.end method

.method public final list()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;"
        }
    .end annotation

    .line 51
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/instance/ServersStore;

    .line 72
    .local v0, "$this$list_u24lambda_u240":Lcom/pymcl/core/instance/ServersStore;
    const/4 v1, 0x0

    .line 51
    .local v1, "$i$a$-runCatching-ServersStore$list$1":I
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-direct {v0}, Lcom/pymcl/core/instance/ServersStore;->getJson()Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    .end local v0    # "$this$list_u24lambda_u240":Lcom/pymcl/core/instance/ServersStore;
    .end local v1    # "$i$a$-runCatching-ServersStore$list$1":I
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
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 73
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 74
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 75
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/util/Map;

    .local v7, "it":Ljava/util/Map;
    const/4 v8, 0x0

    .line 52
    .local v8, "$i$a$-map-ServersStore$list$2":I
    new-instance v9, Lcom/pymcl/core/instance/ServerEntry;

    const-string v10, "name"

    invoke-static {v7, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v11, ""

    if-nez v10, :cond_1

    move-object v10, v11

    :cond_1
    const-string v12, "ip"

    invoke-static {v7, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_2

    move-object v12, v11

    :cond_2
    const-string v13, "port"

    invoke-static {v7, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_3

    move-object v13, v11

    :cond_3
    const-string v14, "icon"

    invoke-static {v7, v14}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_4

    move-object v14, v11

    :cond_4
    const-string v15, "description"

    invoke-static {v7, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_5

    goto :goto_2

    :cond_5
    move-object v11, v15

    :goto_2
    const-string v15, "hidden"

    invoke-static {v7, v15}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v15

    if-eqz v15, :cond_6

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    goto :goto_3

    :cond_6
    const/4 v15, 0x0

    :goto_3
    move-object/from16 v16, v14

    move-object v14, v11

    move-object v11, v12

    move-object v12, v13

    move-object/from16 v13, v16

    invoke-direct/range {v9 .. v15}, Lcom/pymcl/core/instance/ServerEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    .end local v7    # "it":Ljava/util/Map;
    .end local v8    # "$i$a$-map-ServersStore$list$2":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 76
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_7
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 73
    nop

    .line 52
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method

.method public final save(Ljava/util/List;)V
    .locals 14
    .param p1, "l"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;)V"
        }
    .end annotation

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-direct {p0}, Lcom/pymcl/core/instance/ServersStore;->getJson()Ljava/io/File;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 77
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 78
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 79
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/core/instance/ServerEntry;

    .local v9, "it":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v10, 0x0

    .line 54
    .local v10, "$i$a$-map-ServersStore$save$1":I
    const/4 v11, 0x6

    new-array v11, v11, [Lkotlin/Pair;

    const-string v12, "name"

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x0

    aput-object v12, v11, v13

    const-string v12, "ip"

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getIp()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x1

    aput-object v12, v11, v13

    const-string v12, "port"

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getPort()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x2

    aput-object v12, v11, v13

    const-string v12, "icon"

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getIcon()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x3

    aput-object v12, v11, v13

    const-string v12, "description"

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getDescription()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x4

    aput-object v12, v11, v13

    invoke-virtual {v9}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    const-string v13, "hidden"

    invoke-static {v13, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x5

    aput-object v12, v11, v13

    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    .line 79
    .end local v9    # "it":Lcom/pymcl/core/instance/ServerEntry;
    .end local v10    # "$i$a$-map-ServersStore$save$1":I
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 80
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 77
    nop

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    .line 54
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 55
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/pymcl/core/instance/ServersStore;->gameDir:Ljava/io/File;

    const-string v3, "servers.dat"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object v2, Lcom/pymcl/core/instance/Nbt;->INSTANCE:Lcom/pymcl/core/instance/Nbt;

    move-object v3, p1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 81
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 82
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/core/instance/ServerEntry;

    .local v10, "it":Lcom/pymcl/core/instance/ServerEntry;
    const/4 v11, 0x0

    .line 55
    .local v11, "$i$a$-filter-ServersStore$save$2":I
    invoke-virtual {v10}, Lcom/pymcl/core/instance/ServerEntry;->getHidden()Z

    move-result v12

    .line 82
    .end local v10    # "it":Lcom/pymcl/core/instance/ServerEntry;
    .end local v11    # "$i$a$-filter-ServersStore$save$2":I
    if-nez v12, :cond_1

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 83
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 81
    nop

    .line 55
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    invoke-virtual {v2, v5}, Lcom/pymcl/core/instance/Nbt;->serversDat(Ljava/util/List;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/util/FileUtil;->writeAtomic(Ljava/io/File;[B)Z

    .line 56
    return-void
.end method
