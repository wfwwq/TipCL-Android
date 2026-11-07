.class public final Lcom/pymcl/ai/McpManager;
.super Ljava/lang/Object;
.source "Mcp.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/McpManager$Companion;,
        Lcom/pymcl/ai/McpManager$Conn;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMcp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,552:1\n1#2:553\n1739#3:554\n1814#3,3:555\n2068#3,2:558\n1739#3:560\n1814#3,3:561\n1739#3:564\n1814#3,3:565\n1544#3:568\n1633#3,5:569\n1739#3:574\n1814#3,3:575\n296#3,2:578\n2068#3,2:587\n460#4,7:580\n*S KotlinDebug\n*F\n+ 1 Mcp.kt\ncom/pymcl/ai/McpManager\n*L\n476#1:554\n476#1:555,3\n479#1:558,2\n503#1:560\n503#1:561,3\n517#1:564\n517#1:565,3\n525#1:568\n525#1:569,5\n526#1:574\n526#1:575,3\n527#1:578,2\n550#1:587,2\n538#1:580,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 52\u00020\u0001:\u000256B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0015J\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0015J$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160$H\u0002J\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0015J\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\n0\'2\u0006\u0010(\u001a\u00020\nJ\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020*0\u0015J\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\u0010\u0010,\u001a\u0004\u0018\u00010*2\u0006\u0010-\u001a\u00020\nJ(\u0010.\u001a\u00020/2\u0006\u0010-\u001a\u00020\n2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`2J\u0006\u00103\u001a\u00020!J\u0006\u00104\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010\u0008\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tj\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b`\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000RJ\u0010\r\u001a>\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000ej\u0008\u0012\u0004\u0012\u00020\n`\u000f0\tj\u001e\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000ej\u0008\u0012\u0004\u0012\u00020\n`\u000f`\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u00067"
    }
    d2 = {
        "Lcom/pymcl/ai/McpManager;",
        "",
        "configFile",
        "Ljava/io/File;",
        "http",
        "Lcom/pymcl/ai/McpHttp;",
        "<init>",
        "(Ljava/io/File;Lcom/pymcl/ai/McpHttp;)V",
        "conns",
        "Ljava/util/LinkedHashMap;",
        "",
        "Lcom/pymcl/ai/McpManager$Conn;",
        "Lkotlin/collections/LinkedHashMap;",
        "subs",
        "Ljava/util/LinkedHashSet;",
        "Lkotlin/collections/LinkedHashSet;",
        "modelNotes",
        "",
        "loadedMtime",
        "",
        "value",
        "",
        "Lcom/pymcl/ai/McpServerStatus;",
        "statuses",
        "getStatuses",
        "()Ljava/util/List;",
        "configured",
        "",
        "getConfigured",
        "()Z",
        "ensure",
        "applyChanges",
        "updateStatus",
        "",
        "name",
        "f",
        "Lkotlin/Function1;",
        "takeModelNotes",
        "subscriptions",
        "",
        "server",
        "tools",
        "Lcom/pymcl/ai/McpTool;",
        "schemas",
        "find",
        "fullName",
        "call",
        "Lcom/pymcl/ai/ToolOutput;",
        "args",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "invalidate",
        "closeAll",
        "Companion",
        "Conn",
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
.field public static final Companion:Lcom/pymcl/ai/McpManager$Companion;


# instance fields
.field private final configFile:Ljava/io/File;

.field private final conns:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/McpManager$Conn;",
            ">;"
        }
    .end annotation
.end field

.field private final http:Lcom/pymcl/ai/McpHttp;

.field private volatile loadedMtime:J

.field private final modelNotes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private volatile statuses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;"
        }
    .end annotation
.end field

.field private final subs:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/util/LinkedHashSet<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$rGelQjB49qFaqUvFi-SCk-SoD74(Ljava/util/List;Lcom/pymcl/ai/McpServerStatus;)Lcom/pymcl/ai/McpServerStatus;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/ai/McpManager;->applyChanges$lambda$1$1(Ljava/util/List;Lcom/pymcl/ai/McpServerStatus;)Lcom/pymcl/ai/McpServerStatus;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/ai/McpManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/ai/McpManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/ai/McpManager;->Companion:Lcom/pymcl/ai/McpManager$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lcom/pymcl/ai/McpHttp;)V
    .locals 2
    .param p1, "configFile"    # Ljava/io/File;
    .param p2, "http"    # Lcom/pymcl/ai/McpHttp;

    const-string v0, "configFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/McpManager;->configFile:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/ai/McpManager;->http:Lcom/pymcl/ai/McpHttp;

    .line 443
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    .line 445
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/ai/McpManager;->subs:Ljava/util/LinkedHashMap;

    .line 447
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    .line 448
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/pymcl/ai/McpManager;->loadedMtime:J

    .line 449
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    .line 422
    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lcom/pymcl/ai/McpHttp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 422
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/pymcl/ai/UrlConnectionMcpHttp;

    invoke-direct {p2}, Lcom/pymcl/ai/UrlConnectionMcpHttp;-><init>()V

    check-cast p2, Lcom/pymcl/ai/McpHttp;

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/ai/McpManager;-><init>(Ljava/io/File;Lcom/pymcl/ai/McpHttp;)V

    return-void
.end method

.method private static final applyChanges$lambda$1$1(Ljava/util/List;Lcom/pymcl/ai/McpServerStatus;)Lcom/pymcl/ai/McpServerStatus;
    .locals 9
    .param p0, "$t"    # Ljava/util/List;
    .param p1, "it"    # Lcom/pymcl/ai/McpServerStatus;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v6

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    .end local p1    # "it":Lcom/pymcl/ai/McpServerStatus;
    .local v1, "it":Lcom/pymcl/ai/McpServerStatus;
    invoke-static/range {v1 .. v8}, Lcom/pymcl/ai/McpServerStatus;->copy$default(Lcom/pymcl/ai/McpServerStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;IILjava/lang/Object;)Lcom/pymcl/ai/McpServerStatus;

    move-result-object p1

    return-object p1
.end method

.method private final updateStatus(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "f"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/ai/McpServerStatus;",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;)V"
        }
    .end annotation

    .line 517
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 564
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

    .line 565
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 566
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/McpServerStatus;

    .local v7, "it":Lcom/pymcl/ai/McpServerStatus;
    const/4 v8, 0x0

    .line 517
    .local v8, "$i$a$-map-McpManager$updateStatus$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/McpServerStatus;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {p2, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/pymcl/ai/McpServerStatus;

    move-object v7, v9

    .line 566
    .end local v7    # "it":Lcom/pymcl/ai/McpServerStatus;
    .end local v8    # "$i$a$-map-McpManager$updateStatus$1":I
    :cond_0
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 567
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 564
    nop

    .line 517
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    iput-object v2, p0, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final declared-synchronized applyChanges()Ljava/util/List;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    .line 495
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v2, v0

    .line 496
    .local v2, "out":Ljava/util/List;
    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "name":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/McpManager$Conn;

    move-object v5, v0

    .line 497
    .local v5, "conn":Lcom/pymcl/ai/McpManager$Conn;
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    move-object v6, v0

    .line 498
    .local v6, "cl":Lcom/pymcl/ai/McpClient;
    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->getChanges()Lcom/pymcl/ai/McpChangeSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/McpChangeSet;->hasPending()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 499
    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->getChanges()Lcom/pymcl/ai/McpChangeSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/McpChangeSet;->takeDirty()Ljava/util/Set;

    move-result-object v0

    move-object v7, v0

    .line 500
    .local v7, "dirty":Ljava/util/Set;
    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->getChanges()Lcom/pymcl/ai/McpChangeSet;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/ai/McpChangeSet;->takeUpdated()Ljava/util/List;

    move-result-object v0

    move-object v8, v0

    .line 501
    .local v8, "upd":Ljava/util/List;
    sget-object v0, Lcom/pymcl/ai/McpRefresh;->INSTANCE:Lcom/pymcl/ai/McpRefresh;

    invoke-virtual {v0, v7, v8}, Lcom/pymcl/ai/McpRefresh;->plan(Ljava/util/Set;Ljava/util/List;)Lcom/pymcl/ai/McpRefresh$Plan;

    move-result-object v0

    move-object v9, v0

    .line 502
    .local v9, "r":Lcom/pymcl/ai/McpRefresh$Plan;
    invoke-virtual {v9}, Lcom/pymcl/ai/McpRefresh$Plan;->getTools()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_3

    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v0, "$this$applyChanges_u24lambda_u240":Lcom/pymcl/ai/McpManager;
    const/4 v10, 0x0

    .line 502
    .local v10, "$i$a$-runCatching-McpManager$applyChanges$1":I
    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->listTools()Ljava/util/List;

    move-result-object v11

    .end local v0    # "$this$applyChanges_u24lambda_u240":Lcom/pymcl/ai/McpManager;
    .end local v10    # "$i$a$-runCatching-McpManager$applyChanges$1":I
    invoke-static {v11}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_2
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .local v10, "t":Ljava/util/List;
    const/4 v11, 0x0

    .line 503
    .local v11, "$i$a$-onSuccess-McpManager$applyChanges$2":I
    move-object v12, v10

    check-cast v12, Ljava/util/Collection;

    sget-object v13, Lcom/pymcl/ai/McpBuiltins;->INSTANCE:Lcom/pymcl/ai/McpBuiltins;

    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->getCapabilities()Ljava/util/Map;

    move-result-object v14

    move-object v15, v10

    check-cast v15, Ljava/lang/Iterable;

    .local v15, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 560
    .local v16, "$i$f$map":I
    move-object/from16 v17, v0

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v18, v2

    .end local v2    # "out":Ljava/util/List;
    .local v18, "out":Ljava/util/List;
    const/16 v2, 0xa

    invoke-static {v15, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination$iv$iv":Ljava/util/Collection;
    move-object v2, v15

    .local v2, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 561
    .local v19, "$i$f$mapTo":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_0

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 562
    .local v21, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v21

    check-cast v22, Lcom/pymcl/ai/McpTool;

    .local v22, "it":Lcom/pymcl/ai/McpTool;
    const/16 v23, 0x0

    .line 503
    .local v23, "$i$a$-map-McpManager$applyChanges$2$1":I
    move-object/from16 v24, v2

    .end local v2    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v24, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    invoke-virtual/range {v22 .. v22}, Lcom/pymcl/ai/McpTool;->getName()Ljava/lang/String;

    move-result-object v2

    .line 562
    .end local v22    # "it":Lcom/pymcl/ai/McpTool;
    .end local v23    # "$i$a$-map-McpManager$applyChanges$2$1":I
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v24

    goto :goto_2

    .line 563
    .end local v21    # "item$iv$iv":Ljava/lang/Object;
    .end local v24    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local p0    # "this":Lcom/pymcl/ai/McpManager;
    .restart local v2    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_0
    move-object/from16 v24, v2

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .end local v2    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$mapTo":I
    check-cast v0, Ljava/util/List;

    .line 560
    nop

    .end local v15    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$map":I
    check-cast v0, Ljava/util/Collection;

    .line 503
    invoke-virtual {v13, v4, v14, v0}, Lcom/pymcl/ai/McpBuiltins;->forServer(Ljava/lang/String;Ljava/util/Map;Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v12, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/pymcl/ai/McpManager$Conn;->setTools(Ljava/util/List;)V

    .line 504
    move-object/from16 v0, v18

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v12, "MCP \u670d\u52a1\u5668 {0} \u7684\u5de5\u5177\u5217\u8868\u5df2\u66f4\u65b0\uff08{1} \u4e2a\uff09"

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    filled-new-array {v4, v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v2, v12, v13}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 505
    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "MCP \u670d\u52a1\u5668 "

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v12, " \u7684\u5de5\u5177\u5217\u8868\u5df2\u53d8\u5316\uff0c\u4ee5\u672c\u8f6e\u5de5\u5177\u5217\u8868\u4e3a\u51c6"

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 506
    new-instance v0, Lcom/pymcl/ai/McpManager$$ExternalSyntheticLambda0;

    invoke-direct {v0, v10}, Lcom/pymcl/ai/McpManager$$ExternalSyntheticLambda0;-><init>(Ljava/util/List;)V

    invoke-direct {v1, v4, v0}, Lcom/pymcl/ai/McpManager;->updateStatus(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 507
    goto :goto_3

    .line 502
    .end local v10    # "t":Ljava/util/List;
    .end local v11    # "$i$a$-onSuccess-McpManager$applyChanges$2":I
    .end local v18    # "out":Ljava/util/List;
    .local v2, "out":Ljava/util/List;
    :cond_1
    move-object/from16 v17, v0

    move-object/from16 v18, v2

    .end local v2    # "out":Ljava/util/List;
    .restart local v18    # "out":Ljava/util/List;
    :goto_3
    nop

    .line 507
    invoke-static/range {v17 .. v17}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 553
    .local v0, "e":Ljava/lang/Throwable;
    const/4 v2, 0x0

    .line 507
    .local v2, "$i$a$-onFailure-McpManager$applyChanges$3":I
    move-object/from16 v10, v18

    check-cast v10, Ljava/util/Collection;

    sget-object v11, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v12, "MCP \u670d\u52a1\u5668 {0} \u5237\u65b0\u5de5\u5177\u5217\u8868\u5931\u8d25\uff1a{1}"

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_2

    const-string v13, ""

    :cond_2
    filled-new-array {v4, v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v11, v12, v13}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v0    # "e":Ljava/lang/Throwable;
    .end local v2    # "$i$a$-onFailure-McpManager$applyChanges$3":I
    goto :goto_4

    .line 502
    .end local v18    # "out":Ljava/util/List;
    .local v2, "out":Ljava/util/List;
    :cond_3
    move-object/from16 v18, v2

    .line 508
    .end local v2    # "out":Ljava/util/List;
    .restart local v18    # "out":Ljava/util/List;
    :cond_4
    :goto_4
    invoke-virtual {v9}, Lcom/pymcl/ai/McpRefresh$Plan;->getResources()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->countResources()Ljava/lang/Integer;

    move-result-object v0

    .local v0, "n":Ljava/lang/Integer;
    iget-object v2, v1, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    if-eqz v0, :cond_5

    move-object v10, v0

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 553
    nop

    .local v10, "it":I
    const/4 v11, 0x0

    .line 508
    .local v11, "$i$a$-let-McpManager$applyChanges$4":I
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\uff08\u73b0\u6709 "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " \u4e2a\uff09"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .end local v10    # "it":I
    .end local v11    # "$i$a$-let-McpManager$applyChanges$4":I
    if-nez v12, :cond_6

    :cond_5
    const-string v12, ""

    :cond_6
    sget-object v10, Lcom/pymcl/ai/McpManager;->Companion:Lcom/pymcl/ai/McpManager$Companion;

    const-string v11, "mcp_list_resources"

    invoke-virtual {v10, v4, v11}, Lcom/pymcl/ai/McpManager$Companion;->fullName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "MCP \u670d\u52a1\u5668 "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v13, " \u7684\u8d44\u6e90\u5217\u8868\u5df2\u53d8\u5316"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\uff0c\u9700\u8981\u65f6\u7528 "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " \u91cd\u65b0\u67e5\u770b"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 509
    move-object/from16 v2, v18

    check-cast v2, Ljava/util/Collection;

    sget-object v10, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v11, "MCP \u670d\u52a1\u5668 {0} \u7684\u8d44\u6e90\u5217\u8868\u5df2\u66f4\u65b0"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 510
    .end local v0    # "n":Ljava/lang/Integer;
    :cond_7
    invoke-virtual {v9}, Lcom/pymcl/ai/McpRefresh$Plan;->getPrompts()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {v6}, Lcom/pymcl/ai/McpClient;->countPrompts()Ljava/lang/Integer;

    move-result-object v0

    .restart local v0    # "n":Ljava/lang/Integer;
    iget-object v2, v1, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    if-eqz v0, :cond_8

    move-object v10, v0

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    .line 553
    nop

    .restart local v10    # "it":I
    const/4 v11, 0x0

    .line 510
    .local v11, "$i$a$-let-McpManager$applyChanges$5":I
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\uff08\u73b0\u6709 "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, " \u4e2a\uff09"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .end local v10    # "it":I
    .end local v11    # "$i$a$-let-McpManager$applyChanges$5":I
    if-nez v12, :cond_9

    :cond_8
    const-string v12, ""

    :cond_9
    sget-object v10, Lcom/pymcl/ai/McpManager;->Companion:Lcom/pymcl/ai/McpManager$Companion;

    const-string v11, "mcp_list_prompts"

    invoke-virtual {v10, v4, v11}, Lcom/pymcl/ai/McpManager$Companion;->fullName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "MCP \u670d\u52a1\u5668 "

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v13, " \u7684\u63d0\u793a\u8bcd\u5217\u8868\u5df2\u53d8\u5316"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "\uff0c\u9700\u8981\u65f6\u7528 "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, " \u91cd\u65b0\u67e5\u770b"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 511
    move-object/from16 v2, v18

    check-cast v2, Ljava/util/Collection;

    sget-object v10, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v11, "MCP \u670d\u52a1\u5668 {0} \u7684\u63d0\u793a\u8bcd\u5217\u8868\u5df2\u66f4\u65b0"

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v11, v12}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 512
    .end local v0    # "n":Ljava/lang/Integer;
    :cond_a
    move-object v0, v8

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    sget-object v2, Lcom/pymcl/ai/McpRefresh;->INSTANCE:Lcom/pymcl/ai/McpRefresh;

    invoke-virtual {v2, v4, v8}, Lcom/pymcl/ai/McpRefresh;->updatedNote(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_b
    move-object/from16 v2, v18

    goto/16 :goto_0

    .line 498
    .end local v7    # "dirty":Ljava/util/Set;
    .end local v8    # "upd":Ljava/util/List;
    .end local v9    # "r":Lcom/pymcl/ai/McpRefresh$Plan;
    .end local v18    # "out":Ljava/util/List;
    .restart local v2    # "out":Ljava/util/List;
    :cond_c
    move-object/from16 v18, v2

    .end local v2    # "out":Ljava/util/List;
    .restart local v18    # "out":Ljava/util/List;
    goto/16 :goto_0

    .line 514
    .end local v4    # "name":Ljava/lang/String;
    .end local v5    # "conn":Lcom/pymcl/ai/McpManager$Conn;
    .end local v6    # "cl":Lcom/pymcl/ai/McpClient;
    .end local v18    # "out":Ljava/util/List;
    .restart local v2    # "out":Ljava/util/List;
    :cond_d
    move-object/from16 v18, v2

    .end local v2    # "out":Ljava/util/List;
    .restart local v18    # "out":Ljava/util/List;
    monitor-exit p0

    return-object v18

    .line 494
    .end local v18    # "out":Ljava/util/List;
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final call(Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;
    .locals 18
    .param p1, "fullName"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/ai/ToolOutput;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "fullName"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 530
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/ai/McpManager;->find(Ljava/lang/String;)Lcom/pymcl/ai/McpTool;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u6ca1\u6709\u540d\u4e3a "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " \u7684 MCP \u5de5\u5177"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    :cond_0
    move-object v4, v0

    .line 531
    .local v4, "t":Lcom/pymcl/ai/McpTool;
    monitor-enter p0

    .line 553
    const/4 v0, 0x0

    .line 531
    .local v0, "$i$a$-synchronized-McpManager$call$c$1":I
    :try_start_0
    iget-object v5, v1, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getServer()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/pymcl/ai/McpManager$Conn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .end local v0    # "$i$a$-synchronized-McpManager$call$c$1":I
    monitor-exit p0

    if-nez v5, :cond_1

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getServer()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "MCP \u670d\u52a1\u5668 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " \u672a\u8fde\u63a5"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    return-object v0

    .line 532
    .local v5, "c":Lcom/pymcl/ai/McpManager$Conn;
    :cond_1
    nop

    .line 533
    :try_start_1
    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getKind()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_0
    goto/16 :goto_6

    :sswitch_0
    const-string v7, "get_prompt"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 537
    :cond_2
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    const-string v7, "name"

    invoke-static {v3, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    const-string v7, ""

    :cond_3
    const-string v8, "arguments"

    invoke-static {v3, v8}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v0, v7, v8}, Lcom/pymcl/ai/McpClient;->getPrompt(Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    goto/16 :goto_7

    .line 533
    :sswitch_1
    const-string v7, "list_resources"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    .line 534
    :cond_4
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    const-string v7, "cursor"

    invoke-static {v3, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    .line 553
    move-object v8, v7

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 534
    .local v9, "$i$a$-takeIf-McpManager$call$1":I
    move-object v10, v8

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v10

    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-takeIf-McpManager$call$1":I
    if-nez v10, :cond_5

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v0, v7}, Lcom/pymcl/ai/McpClient;->listResources(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    goto/16 :goto_7

    .line 533
    :sswitch_2
    const-string v7, "unsubscribe_resource"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    .line 539
    :cond_6
    const-string v0, "uri"

    invoke-static {v3, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    const-string v0, ""

    :cond_7
    move-object v7, v0

    .line 553
    .local v7, "u":Ljava/lang/String;
    const/4 v8, 0x0

    .line 539
    .local v8, "$i$a$-let-McpManager$call$4":I
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/pymcl/ai/McpClient;->unsubscribe(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object v9, v0

    .line 553
    .local v9, "o":Lcom/pymcl/ai/ToolOutput;
    const/4 v10, 0x0

    .line 539
    .local v10, "$i$a$-also-McpManager$call$4$1":I
    invoke-virtual {v9}, Lcom/pymcl/ai/ToolOutput;->getOk()Z

    move-result v11

    if-eqz v11, :cond_9

    monitor-enter p0
    :try_end_1
    .catch Lcom/pymcl/ai/McpException; {:try_start_1 .. :try_end_1} :catch_0

    .line 553
    const/4 v11, 0x0

    .line 539
    .local v11, "$i$a$-synchronized-McpManager$call$4$1$1":I
    :try_start_2
    iget-object v12, v1, Lcom/pymcl/ai/McpManager;->subs:Ljava/util/LinkedHashMap;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getServer()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/LinkedHashSet;

    if-eqz v12, :cond_8

    invoke-virtual {v12, v7}, Ljava/util/LinkedHashSet;->remove(Ljava/lang/Object;)Z

    .end local v11    # "$i$a$-synchronized-McpManager$call$4$1$1":I
    :cond_8
    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit p0

    .end local v4    # "t":Lcom/pymcl/ai/McpTool;
    .end local v5    # "c":Lcom/pymcl/ai/McpManager$Conn;
    .end local p1    # "fullName":Ljava/lang/String;
    .end local p2    # "args":Ljava/util/Map;
    throw v0

    .end local v7    # "u":Ljava/lang/String;
    .end local v8    # "$i$a$-let-McpManager$call$4":I
    .end local v9    # "o":Lcom/pymcl/ai/ToolOutput;
    .end local v10    # "$i$a$-also-McpManager$call$4$1":I
    .restart local v4    # "t":Lcom/pymcl/ai/McpTool;
    .restart local v5    # "c":Lcom/pymcl/ai/McpManager$Conn;
    .restart local p1    # "fullName":Ljava/lang/String;
    .restart local p2    # "args":Ljava/util/Map;
    :cond_9
    :goto_2
    goto/16 :goto_7

    .line 533
    :sswitch_3
    const-string v7, "read_resource"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_0

    .line 535
    :cond_a
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    const-string v7, "uri"

    invoke-static {v3, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_b

    const-string v7, ""

    :cond_b
    invoke-virtual {v0, v7}, Lcom/pymcl/ai/McpClient;->readResource(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    goto/16 :goto_7

    .line 533
    :sswitch_4
    const-string v7, "subscribe_resource"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_0

    .line 538
    :cond_c
    const-string v0, "uri"

    invoke-static {v3, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d

    const-string v0, ""

    :cond_d
    move-object v7, v0

    .line 553
    .restart local v7    # "u":Ljava/lang/String;
    const/4 v8, 0x0

    .line 538
    .local v8, "$i$a$-let-McpManager$call$3":I
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/pymcl/ai/McpClient;->subscribe(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    move-object v9, v0

    .line 553
    .restart local v9    # "o":Lcom/pymcl/ai/ToolOutput;
    const/4 v10, 0x0

    .line 538
    .local v10, "$i$a$-also-McpManager$call$3$1":I
    invoke-virtual {v9}, Lcom/pymcl/ai/ToolOutput;->getOk()Z

    move-result v11

    if-eqz v11, :cond_f

    monitor-enter p0
    :try_end_3
    .catch Lcom/pymcl/ai/McpException; {:try_start_3 .. :try_end_3} :catch_0

    .line 553
    const/4 v11, 0x0

    .line 538
    .local v11, "$i$a$-synchronized-McpManager$call$3$1$1":I
    :try_start_4
    iget-object v12, v1, Lcom/pymcl/ai/McpManager;->subs:Ljava/util/LinkedHashMap;

    check-cast v12, Ljava/util/Map;

    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getServer()Ljava/lang/String;

    move-result-object v13

    .local v12, "$this$getOrPut$iv":Ljava/util/Map;
    .local v13, "key$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 580
    .local v14, "$i$f$getOrPut":I
    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    .line 581
    .local v15, "value$iv":Ljava/lang/Object;
    if-nez v15, :cond_e

    .line 582
    const/16 v16, 0x0

    .line 538
    .local v16, "$i$a$-getOrPut-McpManager$call$3$1$1$1":I
    new-instance v17, Ljava/util/LinkedHashSet;

    invoke-direct/range {v17 .. v17}, Ljava/util/LinkedHashSet;-><init>()V

    .line 582
    .end local v16    # "$i$a$-getOrPut-McpManager$call$3$1$1$1":I
    move-object/from16 v16, v17

    .line 583
    .local v16, "answer$iv":Ljava/lang/Object;
    move-object/from16 v6, v16

    .end local v16    # "answer$iv":Ljava/lang/Object;
    .local v6, "answer$iv":Ljava/lang/Object;
    invoke-interface {v12, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    move-object/from16 v16, v6

    .end local v6    # "answer$iv":Ljava/lang/Object;
    goto :goto_3

    .line 586
    :cond_e
    move-object/from16 v16, v15

    .line 581
    :goto_3
    nop

    .end local v12    # "$this$getOrPut$iv":Ljava/util/Map;
    .end local v13    # "key$iv":Ljava/lang/Object;
    .end local v14    # "$i$f$getOrPut":I
    .end local v15    # "value$iv":Ljava/lang/Object;
    move-object/from16 v6, v16

    check-cast v6, Ljava/util/Collection;

    .line 538
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v11    # "$i$a$-synchronized-McpManager$call$3$1$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit p0

    goto :goto_4

    :catchall_1
    move-exception v0

    monitor-exit p0

    .end local v4    # "t":Lcom/pymcl/ai/McpTool;
    .end local v5    # "c":Lcom/pymcl/ai/McpManager$Conn;
    .end local p1    # "fullName":Ljava/lang/String;
    .end local p2    # "args":Ljava/util/Map;
    throw v0

    .end local v7    # "u":Ljava/lang/String;
    .end local v8    # "$i$a$-let-McpManager$call$3":I
    .end local v9    # "o":Lcom/pymcl/ai/ToolOutput;
    .end local v10    # "$i$a$-also-McpManager$call$3$1":I
    .restart local v4    # "t":Lcom/pymcl/ai/McpTool;
    .restart local v5    # "c":Lcom/pymcl/ai/McpManager$Conn;
    .restart local p1    # "fullName":Ljava/lang/String;
    .restart local p2    # "args":Ljava/util/Map;
    :cond_f
    :goto_4
    goto :goto_7

    .line 533
    :sswitch_5
    const-string v6, "list_prompts"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_0

    .line 536
    :cond_10
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    const-string v6, "cursor"

    invoke-static {v3, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_11

    .line 553
    move-object v7, v6

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 536
    .local v8, "$i$a$-takeIf-McpManager$call$2":I
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {v9}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v9

    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-McpManager$call$2":I
    if-nez v9, :cond_11

    goto :goto_5

    :cond_11
    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v0, v6}, Lcom/pymcl/ai/McpClient;->listPrompts(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    goto :goto_7

    .line 540
    :goto_6
    invoke-virtual {v5}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v0

    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v3}, Lcom/pymcl/ai/McpClient;->callTool(Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0
    :try_end_5
    .catch Lcom/pymcl/ai/McpException; {:try_start_5 .. :try_end_5} :catch_0

    :goto_7
    goto :goto_9

    .line 542
    :catch_0
    move-exception v0

    move-object v6, v0

    .line 543
    .local v6, "e":Lcom/pymcl/ai/McpException;
    invoke-virtual {v6}, Lcom/pymcl/ai/McpException;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v7, 0x0

    if-eqz v0, :cond_12

    check-cast v0, Ljava/lang/CharSequence;

    const-string v8, "\u4f1a\u8bdd\u5df2\u5931\u6548"

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v0, v8, v7, v9, v10}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    const/4 v8, 0x1

    if-ne v0, v8, :cond_12

    move v7, v8

    :cond_12
    if-eqz v7, :cond_13

    monitor-enter p0

    .line 553
    const/4 v0, 0x0

    .line 543
    .local v0, "$i$a$-synchronized-McpManager$call$5":I
    const-wide/16 v7, -0x1

    :try_start_6
    iput-wide v7, v1, Lcom/pymcl/ai/McpManager;->loadedMtime:J

    .end local v0    # "$i$a$-synchronized-McpManager$call$5":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    monitor-exit p0

    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v6}, Lcom/pymcl/ai/McpException;->getMessage()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\uff0c\u4e0b\u4e00\u8f6e\u4f1a\u81ea\u52a8\u91cd\u8fde"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    goto :goto_8

    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_13
    sget-object v0, Lcom/pymcl/ai/ToolOutput;->Companion:Lcom/pymcl/ai/ToolOutput$Companion;

    invoke-virtual {v6}, Lcom/pymcl/ai/McpException;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_14

    const-string v7, "MCP \u8c03\u7528\u5931\u8d25"

    :cond_14
    :goto_8
    invoke-virtual {v0, v7}, Lcom/pymcl/ai/ToolOutput$Companion;->err(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v0

    .line 532
    .end local v6    # "e":Lcom/pymcl/ai/McpException;
    :goto_9
    return-object v0

    .line 531
    .end local v5    # "c":Lcom/pymcl/ai/McpManager$Conn;
    :catchall_3
    move-exception v0

    monitor-exit p0

    throw v0

    :sswitch_data_0
    .sparse-switch
        -0x491f5312 -> :sswitch_5
        -0x14db949d -> :sswitch_4
        0x7d80497 -> :sswitch_3
        0x275165bc -> :sswitch_2
        0x3acabbc4 -> :sswitch_1
        0x419dfa6d -> :sswitch_0
    .end sparse-switch
.end method

.method public final declared-synchronized closeAll()V
    .locals 9

    monitor-enter p0

    .line 550
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 587
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/ai/McpManager$Conn;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .local v4, "it":Lcom/pymcl/ai/McpManager$Conn;
    const/4 v5, 0x0

    .line 550
    .local v5, "$i$a$-forEach-McpManager$closeAll$1":I
    :try_start_1
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v6, p0

    check-cast v6, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v6, "$this$closeAll_u24lambda_u240_u240":Lcom/pymcl/ai/McpManager;
    const/4 v7, 0x0

    .line 550
    .local v7, "$i$a$-runCatching-McpManager$closeAll$1$1":I
    invoke-virtual {v4}, Lcom/pymcl/ai/McpManager$Conn;->getClient()Lcom/pymcl/ai/McpClient;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/ai/McpClient;->close()V

    .end local v6    # "$this$closeAll_u24lambda_u240_u240":Lcom/pymcl/ai/McpManager;
    .end local v7    # "$i$a$-runCatching-McpManager$closeAll$1$1":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v6

    :try_start_2
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v6}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 587
    .end local v4    # "it":Lcom/pymcl/ai/McpManager$Conn;
    .end local v5    # "$i$a$-forEach-McpManager$closeAll$1":I
    :goto_1
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 588
    .end local p0    # "this":Lcom/pymcl/ai/McpManager;
    :cond_0
    nop

    .line 550
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    .line 549
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final declared-synchronized ensure()Ljava/util/List;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    monitor-enter p0

    .line 458
    :try_start_0
    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->configFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->configFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    goto :goto_0

    .end local p0    # "this":Lcom/pymcl/ai/McpManager;
    :cond_0
    move-wide v4, v2

    .line 459
    .local v4, "m":J
    :goto_0
    iget-wide v6, v1, Lcom/pymcl/ai/McpManager;->loadedMtime:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lcom/pymcl/ai/McpManager;->applyChanges()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    monitor-exit p0

    return-object v0

    .line 460
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Lcom/pymcl/ai/McpManager;->closeAll()V

    iput-wide v4, v1, Lcom/pymcl/ai/McpManager;->loadedMtime:J

    .line 461
    cmp-long v0, v4, v2

    if-nez v0, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, v1, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    monitor-exit p0

    return-object v0

    .line 462
    :cond_2
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v0, "$this$ensure_u24lambda_u240":Lcom/pymcl/ai/McpManager;
    const/4 v2, 0x0

    .line 462
    .local v2, "$i$a$-runCatching-McpManager$ensure$cfgs$1":I
    sget-object v3, Lcom/pymcl/ai/McpManager;->Companion:Lcom/pymcl/ai/McpManager$Companion;

    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v7, v0, Lcom/pymcl/ai/McpManager;->configFile:Ljava/io/File;

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static {v7, v9, v8, v9}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v3, v6}, Lcom/pymcl/ai/McpManager$Companion;->parseConfig(Ljava/util/Map;)Ljava/util/List;

    move-result-object v3

    .end local v0    # "$this$ensure_u24lambda_u240":Lcom/pymcl/ai/McpManager;
    .end local v2    # "$i$a$-runCatching-McpManager$ensure$cfgs$1":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_10

    check-cast v0, Ljava/util/List;

    move-object v2, v0

    .line 463
    .local v2, "cfgs":Ljava/util/List;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v3, v0

    .local v3, "st":Ljava/util/List;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v6, v0

    .line 464
    .local v6, "errs":Ljava/util/List;
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/McpServerConfig;

    move-object v8, v0

    .line 465
    .local v8, "c":Lcom/pymcl/ai/McpServerConfig;
    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getEnabled()Z

    move-result v0

    const/4 v9, 0x0

    if-nez v0, :cond_3

    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/ai/McpServerStatus;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v14, "\u5df2\u505c\u7528"

    new-array v9, v9, [Ljava/lang/Object;

    invoke-virtual {v13, v14, v9}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 466
    :cond_3
    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    move-object/from16 v17, v2

    move-wide/from16 v18, v4

    .end local v2    # "cfgs":Ljava/util/List;
    .end local v4    # "m":J
    .local v17, "cfgs":Ljava/util/List;
    .local v18, "m":J
    goto/16 :goto_e

    .end local v17    # "cfgs":Ljava/util/List;
    .end local v18    # "m":J
    .restart local v2    # "cfgs":Ljava/util/List;
    .restart local v4    # "m":J
    :sswitch_0
    const-string v10, "stdio"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    .line 467
    :cond_4
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/ai/McpServerStatus;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v14, "\u5b89\u5353\u4e0d\u80fd\u542f\u52a8\u672c\u5730\u547d\u4ee4\uff08stdio\uff09\uff0c\u8bf7\u6539\u7528 http/sse \u5730\u5740"

    new-array v9, v9, [Ljava/lang/Object;

    invoke-virtual {v13, v14, v9}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 466
    :sswitch_1
    const-string v10, "http"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :sswitch_2
    const-string v10, "sse"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :goto_3
    move-object/from16 v17, v2

    move-wide/from16 v18, v4

    goto/16 :goto_e

    .line 471
    :cond_5
    new-instance v0, Lcom/pymcl/ai/McpClient;

    iget-object v9, v1, Lcom/pymcl/ai/McpManager;->http:Lcom/pymcl/ai/McpHttp;

    invoke-direct {v0, v8, v9}, Lcom/pymcl/ai/McpClient;-><init>(Lcom/pymcl/ai/McpServerConfig;Lcom/pymcl/ai/McpHttp;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    move-object v9, v0

    .line 472
    .local v9, "client":Lcom/pymcl/ai/McpClient;
    :try_start_4
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    move-object v10, v0

    .line 553
    .local v10, "$this$ensure_u24lambda_u242":Lcom/pymcl/ai/McpManager;
    const/4 v11, 0x0

    .line 472
    .local v11, "$i$a$-runCatching-McpManager$ensure$1":I
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->connect()V

    .line 474
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getCapabilities()Ljava/util/Map;

    move-result-object v0

    const-string v12, "tools"

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_8

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasResources()Z

    move-result v0

    if-nez v0, :cond_6

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasPrompts()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    :try_start_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v10

    .line 553
    .local v0, "$this$ensure_u24lambda_u242_u240":Lcom/pymcl/ai/McpManager;
    const/4 v12, 0x0

    .line 474
    .local v12, "$i$a$-runCatching-McpManager$ensure$1$1":I
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->listTools()Ljava/util/List;

    move-result-object v13

    .end local v0    # "$this$ensure_u24lambda_u242_u240":Lcom/pymcl/ai/McpManager;
    .end local v12    # "$i$a$-runCatching-McpManager$ensure$1$1":I
    invoke-static {v13}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    :try_start_6
    sget-object v12, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v12

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    move-object v0, v12

    :cond_7
    check-cast v0, Ljava/util/List;

    goto :goto_6

    :cond_8
    :goto_5
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->listTools()Ljava/util/List;

    move-result-object v0

    .line 472
    .end local v10    # "$this$ensure_u24lambda_u242":Lcom/pymcl/ai/McpManager;
    .end local v11    # "$i$a$-runCatching-McpManager$ensure$1":I
    :goto_6
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_7

    :catchall_2
    move-exception v0

    :try_start_7
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    move-object v10, v0

    .line 475
    invoke-static {v10}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    move-object v0, v10

    check-cast v0, Ljava/util/List;

    move-object v11, v0

    .local v11, "tools":Ljava/util/List;
    const/4 v12, 0x0

    .line 476
    .local v12, "$i$a$-onSuccess-McpManager$ensure$2":I
    sget-object v0, Lcom/pymcl/ai/McpBuiltins;->INSTANCE:Lcom/pymcl/ai/McpBuiltins;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getCapabilities()Ljava/util/Map;

    move-result-object v14

    move-object v15, v11

    check-cast v15, Ljava/lang/Iterable;

    .local v15, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 554
    .local v16, "$i$f$map":I
    move-object/from16 v17, v2

    .end local v2    # "cfgs":Ljava/util/List;
    .restart local v17    # "cfgs":Ljava/util/List;
    new-instance v2, Ljava/util/ArrayList;

    move-wide/from16 v18, v4

    .end local v4    # "m":J
    .restart local v18    # "m":J
    const/16 v4, 0xa

    invoke-static {v15, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v15

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 555
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_8
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_9

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 556
    .local v21, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v21

    check-cast v22, Lcom/pymcl/ai/McpTool;

    .local v22, "it":Lcom/pymcl/ai/McpTool;
    const/16 v23, 0x0

    .line 476
    .local v23, "$i$a$-map-McpManager$ensure$2$extra$1":I
    move-object/from16 v24, v4

    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .local v24, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    invoke-virtual/range {v22 .. v22}, Lcom/pymcl/ai/McpTool;->getName()Ljava/lang/String;

    move-result-object v4

    .line 556
    .end local v22    # "it":Lcom/pymcl/ai/McpTool;
    .end local v23    # "$i$a$-map-McpManager$ensure$2$extra$1":I
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, v24

    goto :goto_8

    .line 557
    .end local v21    # "item$iv$iv":Ljava/lang/Object;
    .end local v24    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_9
    move-object/from16 v24, v4

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 554
    nop

    .end local v15    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 476
    invoke-virtual {v0, v13, v14, v2}, Lcom/pymcl/ai/McpBuiltins;->forServer(Ljava/lang/String;Ljava/util/Map;Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    .line 477
    .local v2, "extra":Ljava/util/List;
    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lcom/pymcl/ai/McpManager$Conn;

    move-object v13, v11

    check-cast v13, Ljava/util/Collection;

    move-object v14, v2

    check-cast v14, Ljava/lang/Iterable;

    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v13

    invoke-direct {v5, v9, v13}, Lcom/pymcl/ai/McpManager$Conn;-><init>(Lcom/pymcl/ai/McpClient;Ljava/util/List;)V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 479
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasSubscribe()Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v1, Lcom/pymcl/ai/McpManager;->subs:Ljava/util/LinkedHashMap;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_b

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_b

    check-cast v0, Ljava/lang/Iterable;

    move-object v4, v0

    .local v4, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 558
    .local v5, "$i$f$forEach":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    .local v14, "element$iv":Ljava/lang/Object;
    move-object v0, v14

    check-cast v0, Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    move-object v15, v0

    .local v15, "u":Ljava/lang/String;
    const/16 v16, 0x0

    .line 479
    .local v16, "$i$a$-forEach-McpManager$ensure$2$1":I
    :try_start_8
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v0, "$this$ensure_u24lambda_u243_u241_u240":Lcom/pymcl/ai/McpManager;
    const/16 v20, 0x0

    .line 479
    .local v20, "$i$a$-runCatching-McpManager$ensure$2$1$1":I
    invoke-virtual {v9, v15}, Lcom/pymcl/ai/McpClient;->subscribe(Ljava/lang/String;)Lcom/pymcl/ai/ToolOutput;

    move-result-object v21

    .end local v0    # "$this$ensure_u24lambda_u243_u241_u240":Lcom/pymcl/ai/McpManager;
    .end local v20    # "$i$a$-runCatching-McpManager$ensure$2$1$1":I
    invoke-static/range {v21 .. v21}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_a

    :catchall_3
    move-exception v0

    :try_start_9
    sget-object v20, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 558
    .end local v15    # "u":Ljava/lang/String;
    .end local v16    # "$i$a$-forEach-McpManager$ensure$2$1":I
    :goto_a
    nop

    .end local v14    # "element$iv":Ljava/lang/Object;
    goto :goto_9

    .line 559
    :cond_a
    nop

    .line 480
    .end local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach":I
    :cond_b
    :try_start_a
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v0, "$this$ensure_u24lambda_u243_u242":Lcom/pymcl/ai/McpManager;
    const/4 v4, 0x0

    .line 480
    .local v4, "$i$a$-runCatching-McpManager$ensure$2$2":I
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->startListener()Z

    move-result v5

    .end local v0    # "$this$ensure_u24lambda_u243_u242":Lcom/pymcl/ai/McpManager;
    .end local v4    # "$i$a$-runCatching-McpManager$ensure$2$2":I
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    goto :goto_b

    :catchall_4
    move-exception v0

    :try_start_b
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 481
    :goto_b
    sget-object v20, Lcom/pymcl/ai/McpStatusText;->INSTANCE:Lcom/pymcl/ai/McpStatusText;

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasResources()Z

    move-result v21

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasPrompts()Z

    move-result v22

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getHasSubscribe()Z

    move-result v23

    const/16 v25, 0x8

    const/16 v26, 0x0

    const/16 v24, 0x0

    invoke-static/range {v20 .. v26}, Lcom/pymcl/ai/McpStatusText;->capNote$default(Lcom/pymcl/ai/McpStatusText;ZZZZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 482
    .local v0, "capNote":Ljava/lang/String;
    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    new-instance v20, Lcom/pymcl/ai/McpServerStatus;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v22

    sget-object v5, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v13, "\u5df2\u8fde\u63a5 {0}"

    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->getServerInfo()Ljava/lang/String;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v5, v13, v14}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v24

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v25

    const/16 v23, 0x1

    invoke-direct/range {v20 .. v25}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    move-object/from16 v5, v20

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 483
    goto :goto_c

    .line 475
    .end local v0    # "capNote":Ljava/lang/String;
    .end local v11    # "tools":Ljava/util/List;
    .end local v12    # "$i$a$-onSuccess-McpManager$ensure$2":I
    .end local v17    # "cfgs":Ljava/util/List;
    .end local v18    # "m":J
    .local v2, "cfgs":Ljava/util/List;
    .local v4, "m":J
    :cond_c
    move-object/from16 v17, v2

    move-wide/from16 v18, v4

    .end local v2    # "cfgs":Ljava/util/List;
    .end local v4    # "m":J
    .restart local v17    # "cfgs":Ljava/util/List;
    .restart local v18    # "m":J
    :goto_c
    nop

    .line 484
    invoke-static {v10}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    if-eqz v0, :cond_e

    move-object v2, v0

    .line 553
    .local v2, "e":Ljava/lang/Throwable;
    const/4 v4, 0x0

    .line 484
    .local v4, "$i$a$-onFailure-McpManager$ensure$3":I
    :try_start_c
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/ai/McpManager;

    .line 553
    .local v0, "$this$ensure_u24lambda_u244_u240":Lcom/pymcl/ai/McpManager;
    const/4 v5, 0x0

    .line 484
    .local v5, "$i$a$-runCatching-McpManager$ensure$3$1":I
    invoke-virtual {v9}, Lcom/pymcl/ai/McpClient;->close()V

    .end local v0    # "$this$ensure_u24lambda_u244_u240":Lcom/pymcl/ai/McpManager;
    .end local v5    # "$i$a$-runCatching-McpManager$ensure$3$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_d

    :catchall_5
    move-exception v0

    :try_start_d
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_d
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/ai/McpServerStatus;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_d

    invoke-virtual {v2}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_d
    move-object v14, v5

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v0, v6

    check-cast v0, Ljava/util/Collection;

    sget-object v5, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v10, "MCP \u670d\u52a1\u5668 {0} \u8fde\u63a5\u5931\u8d25\uff1a{1}"

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v12

    filled-new-array {v11, v12}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v5, v10, v11}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v17

    move-wide/from16 v4, v18

    .end local v2    # "e":Ljava/lang/Throwable;
    .end local v4    # "$i$a$-onFailure-McpManager$ensure$3":I
    goto/16 :goto_2

    :cond_e
    move-object/from16 v2, v17

    move-wide/from16 v4, v18

    goto/16 :goto_2

    .line 469
    .end local v9    # "client":Lcom/pymcl/ai/McpClient;
    :goto_e
    move-object v0, v3

    check-cast v0, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/ai/McpServerStatus;

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/ai/McpServerConfig;->getType()Ljava/lang/String;

    move-result-object v12

    sget-object v2, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u672a\u77e5\u4f20\u8f93\u7c7b\u578b"

    new-array v5, v9, [Ljava/lang/Object;

    invoke-virtual {v2, v4, v5}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v17

    move-wide/from16 v4, v18

    goto/16 :goto_2

    .line 486
    .end local v8    # "c":Lcom/pymcl/ai/McpServerConfig;
    .end local v17    # "cfgs":Ljava/util/List;
    .end local v18    # "m":J
    .local v2, "cfgs":Ljava/util/List;
    .local v4, "m":J
    :cond_f
    move-object/from16 v17, v2

    move-wide/from16 v18, v4

    .end local v2    # "cfgs":Ljava/util/List;
    .end local v4    # "m":J
    .restart local v17    # "cfgs":Ljava/util/List;
    .restart local v18    # "m":J
    iput-object v3, v1, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    .line 487
    monitor-exit p0

    return-object v6

    .line 462
    .end local v3    # "st":Ljava/util/List;
    .end local v6    # "errs":Ljava/util/List;
    .end local v17    # "cfgs":Ljava/util/List;
    .end local v18    # "m":J
    .restart local v4    # "m":J
    :cond_10
    move-wide/from16 v18, v4

    .line 553
    .end local v4    # "m":J
    .local v2, "it":Ljava/lang/Throwable;
    .restart local v18    # "m":J
    const/4 v0, 0x0

    .line 462
    .local v0, "$i$a$-getOrElse-McpManager$ensure$cfgs$2":I
    :try_start_e
    new-instance v3, Lcom/pymcl/ai/McpServerStatus;

    const-string v4, "ai_mcp.json"

    const-string v5, ""

    sget-object v6, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v7, "\u914d\u7f6e\u89e3\u6790\u5931\u8d25\uff1a{0}"

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/ai/McpServerStatus;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;I)V

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, v1, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "MCP \u914d\u7f6e\u89e3\u6790\u5931\u8d25\uff1a{0}"

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    monitor-exit p0

    return-object v3

    .line 457
    .end local v0    # "$i$a$-getOrElse-McpManager$ensure$cfgs$2":I
    .end local v2    # "it":Ljava/lang/Throwable;
    .end local v18    # "m":J
    :catchall_6
    move-exception v0

    :try_start_f
    monitor-exit p0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1be05 -> :sswitch_2
        0x310888 -> :sswitch_1
        0x68ace89 -> :sswitch_0
    .end sparse-switch
.end method

.method public final find(Ljava/lang/String;)Lcom/pymcl/ai/McpTool;
    .locals 7
    .param p1, "fullName"    # Ljava/lang/String;

    const-string v0, "fullName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    invoke-virtual {p0}, Lcom/pymcl/ai/McpManager;->tools()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 578
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/ai/McpTool;

    .local v4, "it":Lcom/pymcl/ai/McpTool;
    const/4 v5, 0x0

    .line 527
    .local v5, "$i$a$-firstOrNull-McpManager$find$1":I
    invoke-virtual {v4}, Lcom/pymcl/ai/McpTool;->getFullName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 578
    .end local v4    # "it":Lcom/pymcl/ai/McpTool;
    .end local v5    # "$i$a$-firstOrNull-McpManager$find$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 579
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/ai/McpTool;

    .line 527
    return-object v3
.end method

.method public final getConfigured()Z
    .locals 1

    .line 451
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->configFile:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public final getStatuses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;"
        }
    .end annotation

    .line 449
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->statuses:Ljava/util/List;

    return-object v0
.end method

.method public final invalidate()V
    .locals 3

    .line 548
    monitor-enter p0

    .line 553
    const/4 v0, 0x0

    .line 548
    .local v0, "$i$a$-synchronized-McpManager$invalidate$1":I
    const-wide/16 v1, -0x1

    :try_start_0
    iput-wide v1, p0, Lcom/pymcl/ai/McpManager;->loadedMtime:J

    .end local v0    # "$i$a$-synchronized-McpManager$invalidate$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final schemas()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 526
    invoke-virtual {p0}, Lcom/pymcl/ai/McpManager;->tools()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 574
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

    .line 575
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 576
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/ai/McpTool;

    .local v7, "it":Lcom/pymcl/ai/McpTool;
    const/4 v8, 0x0

    .line 526
    .local v8, "$i$a$-map-McpManager$schemas$1":I
    invoke-virtual {v7}, Lcom/pymcl/ai/McpTool;->schema()Ljava/util/Map;

    move-result-object v7

    .line 576
    .end local v7    # "it":Lcom/pymcl/ai/McpTool;
    .end local v8    # "$i$a$-map-McpManager$schemas$1":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 577
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 574
    nop

    .line 526
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method

.method public final declared-synchronized subscriptions(Ljava/lang/String;)Ljava/util/Set;
    .locals 1
    .param p1, "server"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    const-string v0, "server"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 523
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->subs:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/LinkedHashSet;

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_1

    .end local p0    # "this":Lcom/pymcl/ai/McpManager;
    :cond_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v0

    .line 523
    .end local p1    # "server":Ljava/lang/String;
    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized takeModelNotes()Ljava/util/List;
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

    .line 520
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    .line 553
    .local v1, "it":Ljava/util/List;
    const/4 v2, 0x0

    .line 520
    .local v2, "$i$a$-also-McpManager$takeModelNotes$1":I
    iget-object v3, p0, Lcom/pymcl/ai/McpManager;->modelNotes:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v1    # "it":Ljava/util/List;
    .end local v2    # "$i$a$-also-McpManager$takeModelNotes$1":I
    monitor-exit p0

    return-object v0

    .line 519
    .end local p0    # "this":Lcom/pymcl/ai/McpManager;
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final tools()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpTool;",
            ">;"
        }
    .end annotation

    .line 525
    monitor-enter p0

    .line 553
    const/4 v0, 0x0

    .line 525
    .local v0, "$i$a$-synchronized-McpManager$tools$1":I
    :try_start_0
    iget-object v1, p0, Lcom/pymcl/ai/McpManager;->conns:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    const-string v2, "<get-values>(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 568
    .local v2, "$i$f$flatMap":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 569
    .local v5, "$i$f$flatMapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 570
    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/ai/McpManager$Conn;

    .local v8, "it":Lcom/pymcl/ai/McpManager$Conn;
    const/4 v9, 0x0

    .line 525
    .local v9, "$i$a$-flatMap-McpManager$tools$1$1":I
    invoke-virtual {v8}, Lcom/pymcl/ai/McpManager$Conn;->getTools()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    .line 570
    .end local v8    # "it":Lcom/pymcl/ai/McpManager$Conn;
    .end local v9    # "$i$a$-flatMap-McpManager$tools$1$1":I
    nop

    .line 571
    .local v10, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v3, v10}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_0

    .line 573
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    .end local v10    # "list$iv$iv":Ljava/lang/Iterable;
    :cond_0
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$flatMapTo":I
    check-cast v3, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    nop

    .line 525
    .end local v1    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$flatMap":I
    nop

    .end local v0    # "$i$a$-synchronized-McpManager$tools$1":I
    monitor-exit p0

    return-object v3

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
