.class public final Lcom/pymcl/core/auth/SkinServer;
.super Ljava/lang/Object;
.source "SkinServer.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/auth/SkinServer$Companion;,
        Lcom/pymcl/core/auth/SkinServer$Profile;,
        Lcom/pymcl/core/auth/SkinServer$Response;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSkinServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkinServer.kt\ncom/pymcl/core/auth/SkinServer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1#2:221\n1#2:244\n1#2:258\n296#3,2:222\n777#3:224\n873#3,2:225\n1358#3,2:227\n1435#3,4:229\n1795#3,10:233\n2068#3:243\n2069#3:245\n1805#3:246\n1795#3,10:247\n2068#3:257\n2069#3:259\n1805#3:260\n*S KotlinDebug\n*F\n+ 1 SkinServer.kt\ncom/pymcl/core/auth/SkinServer\n*L\n153#1:244\n154#1:258\n133#1:222,2\n140#1:224\n140#1:225,2\n141#1:227,2\n141#1:229,4\n153#1:233,10\n153#1:243\n153#1:245\n153#1:246\n154#1:247,10\n154#1:257\n154#1:259\n154#1:260\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 O2\u00020\u0001:\u0003MNOB\u001b\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0010J\u000e\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020\'J\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100,J\u0010\u0010-\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020\'J\u0006\u0010/\u001a\u00020\u0005J\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`2J\u0010\u00103\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002J*\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000101j\u0002`22\u0006\u0010(\u001a\u00020\u00102\u0008\u0008\u0002\u00105\u001a\u00020!J\u001a\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00182\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u0002J\u0008\u0010:\u001a\u000207H\u0002J\u0008\u0010;\u001a\u000207H\u0002J\u0014\u0010<\u001a\u0004\u0018\u00010\u00102\u0008\u0010=\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020\u00052\u0006\u0010@\u001a\u00020\u00052\u0008\u0008\u0002\u0010A\u001a\u00020\u0012J\u0010\u0010B\u001a\u00020\'2\u0006\u0010C\u001a\u00020DH\u0002J\u0012\u0010E\u001a\u0004\u0018\u00010\u00052\u0006\u0010F\u001a\u00020GH\u0002J \u0010H\u001a\u00020\'2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u0002072\u0006\u0010L\u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u001d\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#R\u0011\u0010$\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010\t\u00a8\u0006P"
    }
    d2 = {
        "Lcom/pymcl/core/auth/SkinServer;",
        "",
        "keyPair",
        "Ljava/security/KeyPair;",
        "serverName",
        "",
        "<init>",
        "(Ljava/security/KeyPair;Ljava/lang/String;)V",
        "getServerName",
        "()Ljava/lang/String;",
        "publicKey",
        "Ljava/security/PublicKey;",
        "getPublicKey",
        "()Ljava/security/PublicKey;",
        "profiles",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lcom/pymcl/core/auth/SkinServer$Profile;",
        "textures",
        "",
        "socket",
        "Ljava/net/ServerSocket;",
        "pool",
        "Ljava/util/concurrent/ExecutorService;",
        "value",
        "",
        "port",
        "getPort",
        "()I",
        "requestLog",
        "",
        "getRequestLog",
        "()Ljava/util/List;",
        "running",
        "",
        "getRunning",
        "()Z",
        "apiRoot",
        "getApiRoot",
        "put",
        "",
        "p",
        "remove",
        "uuid",
        "clear",
        "",
        "start",
        "stop",
        "prefetched",
        "metadata",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "sign",
        "profileJson",
        "signed",
        "json",
        "Lcom/pymcl/core/auth/SkinServer$Response;",
        "code",
        "v",
        "noContent",
        "notFound",
        "byName",
        "n",
        "handle",
        "method",
        "path",
        "body",
        "serve",
        "c",
        "Ljava/net/Socket;",
        "readLine",
        "ins",
        "Ljava/io/InputStream;",
        "write",
        "out",
        "Ljava/io/OutputStream;",
        "r",
        "head",
        "Profile",
        "Response",
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
.field public static final Companion:Lcom/pymcl/core/auth/SkinServer$Companion;


# instance fields
.field private final keyPair:Ljava/security/KeyPair;

.field private pool:Ljava/util/concurrent/ExecutorService;

.field private volatile port:I

.field private final profiles:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/auth/SkinServer$Profile;",
            ">;"
        }
    .end annotation
.end field

.field private final requestLog:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final serverName:Ljava/lang/String;

.field private socket:Ljava/net/ServerSocket;

.field private final textures:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$39r-eO6BwfIwCvS19SYov0ay11M(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/auth/SkinServer;->start$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$N7YC7kW3dVKWAEKgm71W2HQL8-g(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/SkinServer;->start$lambda$1$0(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fuRb-r_7jsk84jS_DOtBWiAb3ok(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/core/auth/SkinServer;->start$lambda$1(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V

    return-void
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/core/auth/SkinServer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/auth/SkinServer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Lcom/pymcl/core/auth/SkinServer;-><init>(Ljava/security/KeyPair;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/KeyPair;Ljava/lang/String;)V
    .locals 2
    .param p1, "keyPair"    # Ljava/security/KeyPair;
    .param p2, "serverName"    # Ljava/lang/String;

    const-string v0, "keyPair"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serverName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/SkinServer;->keyPair:Ljava/security/KeyPair;

    iput-object p2, p0, Lcom/pymcl/core/auth/SkinServer;->serverName:Ljava/lang/String;

    .line 61
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->textures:Ljava/util/concurrent/ConcurrentHashMap;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    const-string v1, "synchronizedList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    .line 34
    return-void
.end method

.method public synthetic constructor <init>(Ljava/security/KeyPair;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 34
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    sget-object p1, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Companion;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const-string p2, "PyMCL \u672c\u5730\u76ae\u80a4"

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/auth/SkinServer;-><init>(Ljava/security/KeyPair;Ljava/lang/String;)V

    return-void
.end method

.method private final byName(Ljava/lang/String;)Lcom/pymcl/core/auth/SkinServer$Profile;
    .locals 8
    .param p1, "n"    # Ljava/lang/String;

    .line 133
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 222
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

    check-cast v4, Lcom/pymcl/core/auth/SkinServer$Profile;

    .local v4, "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    const/4 v5, 0x0

    .line 133
    .local v5, "$i$a$-firstOrNull-SkinServer$byName$1":I
    invoke-virtual {v4}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v6, p1, v7}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    .line 222
    .end local v4    # "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v5    # "$i$a$-firstOrNull-SkinServer$byName$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 223
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/core/auth/SkinServer$Profile;

    .line 133
    return-object v3
.end method

.method public static synthetic handle$default(Lcom/pymcl/core/auth/SkinServer;Ljava/lang/String;Ljava/lang/String;[BILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;
    .locals 0

    .line 136
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    new-array p3, p3, [B

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/auth/SkinServer;->handle(Ljava/lang/String;Ljava/lang/String;[B)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object p0

    return-object p0
.end method

.method private final json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;
    .locals 5
    .param p1, "code"    # I
    .param p2, "v"    # Ljava/lang/Object;

    .line 130
    new-instance v0, Lcom/pymcl/core/auth/SkinServer$Response;

    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, p2, v4, v2, v3}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "application/json; charset=utf-8"

    invoke-direct {v0, p1, v2, v1}, Lcom/pymcl/core/auth/SkinServer$Response;-><init>(ILjava/lang/String;[B)V

    return-object v0
.end method

.method private final noContent()Lcom/pymcl/core/auth/SkinServer$Response;
    .locals 4

    .line 131
    new-instance v0, Lcom/pymcl/core/auth/SkinServer$Response;

    const/4 v1, 0x0

    new-array v1, v1, [B

    const/16 v2, 0xcc

    const-string v3, "text/plain"

    invoke-direct {v0, v2, v3, v1}, Lcom/pymcl/core/auth/SkinServer$Response;-><init>(ILjava/lang/String;[B)V

    return-object v0
.end method

.method private final notFound()Lcom/pymcl/core/auth/SkinServer$Response;
    .locals 4

    .line 132
    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "error"

    const-string v2, "Not Found"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "errorMessage"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/16 v1, 0x194

    invoke-direct {p0, v1, v0}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic profileJson$default(Lcom/pymcl/core/auth/SkinServer;Lcom/pymcl/core/auth/SkinServer$Profile;ZILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 118
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/auth/SkinServer;->profileJson(Lcom/pymcl/core/auth/SkinServer$Profile;Z)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final readLine(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 5
    .param p1, "ins"    # Ljava/io/InputStream;

    .line 195
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 196
    .local v0, "b":Ljava/io/ByteArrayOutputStream;
    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v1

    .local v1, "c":I
    const-string v2, "UTF-8"

    if-gez v1, :cond_2

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    if-nez v3, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    return-object v2

    .line 197
    :cond_2
    const/16 v3, 0xa

    if-eq v1, v3, :cond_4

    const/16 v3, 0xd

    if-eq v1, v3, :cond_3

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :cond_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v3

    const/16 v4, 0x4000

    if-le v3, v4, :cond_0

    .line 198
    .end local v1    # "c":I
    :cond_4
    invoke-virtual {v0, v2}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

.method private final serve(Ljava/net/Socket;)V
    .locals 17
    .param p1, "c"    # Ljava/net/Socket;

    .line 178
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/net/Socket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, v0

    .local v3, "s":Ljava/net/Socket;
    const/4 v4, 0x0

    .line 179
    .local v4, "$i$a$-use-SkinServer$serve$1":I
    nop

    .line 180
    const/16 v0, 0x3a98

    const/4 v5, 0x0

    :try_start_1
    invoke-virtual {v3, v0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 181
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {v3}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v6

    invoke-direct {v0, v6}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .local v6, "ins":Ljava/io/BufferedInputStream;
    invoke-virtual {v3}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v7, v0

    .line 182
    .local v7, "out":Ljava/io/OutputStream;
    move-object v0, v6

    check-cast v0, Ljava/io/InputStream;

    invoke-direct {v1, v0}, Lcom/pymcl/core/auth/SkinServer;->readLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    .line 178
    nop

    .end local v3    # "s":Ljava/net/Socket;
    .end local v4    # "$i$a$-use-SkinServer$serve$1":I
    .end local v6    # "ins":Ljava/io/BufferedInputStream;
    .end local v7    # "out":Ljava/io/OutputStream;
    :goto_0
    invoke-static {v2, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    .restart local v3    # "s":Ljava/net/Socket;
    .restart local v4    # "$i$a$-use-SkinServer$serve$1":I
    .restart local v6    # "ins":Ljava/io/BufferedInputStream;
    .restart local v7    # "out":Ljava/io/OutputStream;
    :cond_0
    move-object v8, v0

    .line 183
    .local v8, "line":Ljava/lang/String;
    :try_start_2
    move-object v9, v8

    check-cast v9, Ljava/lang/CharSequence;

    const/4 v15, 0x1

    new-array v10, v15, [C

    const/4 v11, 0x0

    const/16 v0, 0x20

    aput-char v0, v10, v11

    const/4 v13, 0x6

    const/4 v14, 0x0

    move v12, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v9, v0

    .line 184
    .local v9, "parts":Ljava/util/List;
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    const/4 v10, 0x2

    if-ge v0, v10, :cond_1

    .line 178
    .end local v3    # "s":Ljava/net/Socket;
    .end local v4    # "$i$a$-use-SkinServer$serve$1":I
    .end local v6    # "ins":Ljava/io/BufferedInputStream;
    .end local v7    # "out":Ljava/io/OutputStream;
    .end local v8    # "line":Ljava/lang/String;
    .end local v9    # "parts":Ljava/util/List;
    goto :goto_0

    .line 185
    .restart local v3    # "s":Ljava/net/Socket;
    .restart local v4    # "$i$a$-use-SkinServer$serve$1":I
    .restart local v6    # "ins":Ljava/io/BufferedInputStream;
    .restart local v7    # "out":Ljava/io/OutputStream;
    .restart local v8    # "line":Ljava/lang/String;
    .restart local v9    # "parts":Ljava/util/List;
    :cond_1
    const/4 v0, 0x0

    move v11, v0

    .line 186
    .local v11, "len":I
    :cond_2
    :goto_1
    move-object v0, v6

    check-cast v0, Ljava/io/InputStream;

    invoke-direct {v1, v0}, Lcom/pymcl/core/auth/SkinServer;->readLine(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_4

    .local v0, "h":Ljava/lang/String;
    :cond_3
    move-object v12, v0

    check-cast v12, Ljava/lang/CharSequence;

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_4

    move v12, v15

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    if-nez v12, :cond_6

    .line 187
    const/16 v12, 0x3a

    invoke-static {v0, v12, v5, v10, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v13}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    const-string v14, "Content-Length"

    invoke-static {v13, v14, v15}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v13

    if-eqz v13, :cond_2

    invoke-static {v0, v12, v5, v10, v5}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_5

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    goto :goto_3

    :cond_5
    const/4 v12, 0x0

    :goto_3
    move v11, v12

    .end local v0    # "h":Ljava/lang/String;
    goto :goto_1

    .line 188
    :cond_6
    :goto_4
    if-lez v11, :cond_8

    const/high16 v0, 0x100000

    invoke-static {v11, v0}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v0

    new-array v0, v0, [B

    move-object v12, v0

    .line 221
    .local v12, "b":[B
    const/4 v13, 0x0

    .line 188
    .local v13, "$i$a$-also-SkinServer$serve$1$body$1":I
    const/4 v14, 0x0

    .local v14, "r":I
    :goto_5
    array-length v5, v12

    if-ge v14, v5, :cond_7

    array-length v5, v12

    sub-int/2addr v5, v14

    invoke-virtual {v6, v12, v14, v5}, Ljava/io/BufferedInputStream;->read([BII)I

    move-result v5

    .local v5, "n":I
    if-ltz v5, :cond_7

    add-int/2addr v14, v5

    const/4 v5, 0x0

    .end local v5    # "n":I
    goto :goto_5

    .end local v12    # "b":[B
    .end local v13    # "$i$a$-also-SkinServer$serve$1$body$1":I
    .end local v14    # "r":I
    :cond_7
    const/4 v12, 0x0

    goto :goto_6

    :cond_8
    const/4 v12, 0x0

    new-array v0, v12, [B
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_6
    move-object v5, v0

    .line 189
    .local v5, "body":[B
    :try_start_3
    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sget-object v13, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v13}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v13, "toUpperCase(...)"

    invoke-static {v0, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-virtual {v1, v0, v13, v5}, Lcom/pymcl/core/auth/SkinServer;->handle(Ljava/lang/String;Ljava/lang/String;[B)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_7

    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    :try_start_4
    new-array v10, v10, [Lkotlin/Pair;

    const-string v13, "error"

    const-string v14, "InternalError"

    invoke-static {v13, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    aput-object v13, v10, v12

    const-string v13, "errorMessage"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_9

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v14

    :cond_9
    invoke-static {v13, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    aput-object v13, v10, v15

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const/16 v13, 0x1f4

    invoke-direct {v1, v13, v10}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v10

    move-object v0, v10

    .line 190
    .local v0, "resp":Lcom/pymcl/core/auth/SkinServer$Response;
    :goto_7
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const-string v12, "HEAD"

    invoke-static {v10, v12, v15}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    invoke-direct {v1, v7, v0, v10}, Lcom/pymcl/core/auth/SkinServer;->write(Ljava/io/OutputStream;Lcom/pymcl/core/auth/SkinServer$Response;Z)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .end local v0    # "resp":Lcom/pymcl/core/auth/SkinServer$Response;
    .end local v5    # "body":[B
    .end local v6    # "ins":Ljava/io/BufferedInputStream;
    .end local v7    # "out":Ljava/io/OutputStream;
    .end local v8    # "line":Ljava/lang/String;
    .end local v9    # "parts":Ljava/util/List;
    .end local v11    # "len":I
    goto :goto_8

    .line 191
    :catch_1
    move-exception v0

    .line 192
    :goto_8
    nop

    .end local v3    # "s":Ljava/net/Socket;
    .end local v4    # "$i$a$-use-SkinServer$serve$1":I
    :try_start_5
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 178
    const/4 v3, 0x0

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 192
    return-void

    .line 178
    :catchall_0
    move-exception v0

    move-object v3, v0

    .end local p1    # "c":Ljava/net/Socket;
    :try_start_6
    throw v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .restart local p1    # "c":Ljava/net/Socket;
    :catchall_1
    move-exception v0

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private final sign(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "value"    # Ljava/lang/String;

    .line 114
    const-string v0, "SHA1withRSA"

    invoke-static {v0}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .local v0, "$this$sign_u24lambda_u240":Ljava/security/Signature;
    const/4 v1, 0x0

    .line 115
    .local v1, "$i$a$-run-SkinServer$sign$1":I
    iget-object v2, p0, Lcom/pymcl/core/auth/SkinServer;->keyPair:Ljava/security/KeyPair;

    invoke-virtual {v2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/security/Signature;->initSign(Ljava/security/PrivateKey;)V

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "getBytes(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/security/Signature;->update([B)V

    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v2

    invoke-virtual {v0}, Ljava/security/Signature;->sign()[B

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v0

    .line 114
    .end local v0    # "$this$sign_u24lambda_u240":Ljava/security/Signature;
    .end local v1    # "$i$a$-run-SkinServer$sign$1":I
    const-string v1, "run(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    return-object v0
.end method

.method public static synthetic start$default(Lcom/pymcl/core/auth/SkinServer;IILjava/lang/Object;)I
    .locals 0

    .line 82
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/core/auth/SkinServer;->start(I)I

    move-result p0

    return p0
.end method

.method private static final start$lambda$0(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 4
    .param p0, "r"    # Ljava/lang/Runnable;

    .line 88
    new-instance v0, Ljava/lang/Thread;

    const-string v1, "PyMCL-SkinServer"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    move-object v1, v0

    .line 221
    .local v1, "$this$start_u24lambda_u240_u240":Ljava/lang/Thread;
    const/4 v2, 0x0

    .line 88
    .local v2, "$i$a$-apply-SkinServer$start$p$1$1":I
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/Thread;->setDaemon(Z)V

    .end local v1    # "$this$start_u24lambda_u240_u240":Ljava/lang/Thread;
    .end local v2    # "$i$a$-apply-SkinServer$start$p$1$1":I
    return-object v0
.end method

.method private static final start$lambda$1(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V
    .locals 2
    .param p0, "$ss"    # Ljava/net/ServerSocket;
    .param p1, "$p"    # Ljava/util/concurrent/ExecutorService;
    .param p2, "this$0"    # Lcom/pymcl/core/auth/SkinServer;

    .line 91
    nop

    :goto_0
    invoke-virtual {p0}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    :try_start_0
    invoke-virtual {p0}, Ljava/net/ServerSocket;->accept()Ljava/net/Socket;

    move-result-object v0
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .local v0, "c":Ljava/net/Socket;
    new-instance v1, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;

    invoke-direct {v1, p2, v0}, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .end local v0    # "c":Ljava/net/Socket;
    goto :goto_0

    .line 92
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    goto :goto_0

    .end local v0    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v0

    .line 95
    :cond_0
    return-void
.end method

.method private static final start$lambda$1$0(Lcom/pymcl/core/auth/SkinServer;Ljava/net/Socket;)V
    .locals 0
    .param p0, "this$0"    # Lcom/pymcl/core/auth/SkinServer;
    .param p1, "$c"    # Ljava/net/Socket;

    .line 93
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/pymcl/core/auth/SkinServer;->serve(Ljava/net/Socket;)V

    return-void
.end method

.method private final write(Ljava/io/OutputStream;Lcom/pymcl/core/auth/SkinServer$Response;Z)V
    .locals 8
    .param p1, "out"    # Ljava/io/OutputStream;
    .param p2, "r"    # Lcom/pymcl/core/auth/SkinServer$Response;
    .param p3, "head"    # Z

    .line 202
    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const-string v0, "Error"

    goto :goto_0

    :sswitch_0
    const-string v0, "Not Found"

    goto :goto_0

    :sswitch_1
    const-string v0, "Forbidden"

    goto :goto_0

    :sswitch_2
    const-string v0, "No Content"

    goto :goto_0

    :sswitch_3
    const-string v0, "OK"

    .line 203
    .local v0, "reason":Ljava/lang/String;
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getCode()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "HTTP/1.1 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\r\n"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .local v1, "h":Ljava/lang/StringBuilder;
    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getContentType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getCode()I

    move-result v4

    const/16 v5, 0xcc

    if-ne v4, v5, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getBody()[B

    move-result-object v4

    array-length v4, v4

    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Content-Type: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, "\r\nContent-Length: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    const-string v2, "X-Authlib-Injector-API-Location: /\r\nConnection: close\r\n\r\n"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    const-string v3, "getBytes(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 207
    if-nez p3, :cond_1

    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getCode()I

    move-result v2

    if-eq v2, v5, :cond_1

    invoke-virtual {p2}, Lcom/pymcl/core/auth/SkinServer$Response;->getBody()[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 208
    :cond_1
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    .line 209
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_3
        0xcc -> :sswitch_2
        0x193 -> :sswitch_1
        0x194 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->textures:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method

.method public final getApiRoot()Ljava/lang/String;
    .locals 3

    .line 70
    iget v0, p0, Lcom/pymcl/core/auth/SkinServer;->port:I

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http://127.0.0.1:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPort()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/pymcl/core/auth/SkinServer;->port:I

    return v0
.end method

.method public final getPublicKey()Ljava/security/PublicKey;
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->keyPair:Ljava/security/KeyPair;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    const-string v1, "getPublic(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getRequestLog()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    return-object v0
.end method

.method public final getRunning()Z
    .locals 2

    .line 69
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->socket:Ljava/net/ServerSocket;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/ServerSocket;->isClosed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final getServerName()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->serverName:Ljava/lang/String;

    return-object v0
.end method

.method public final handle(Ljava/lang/String;Ljava/lang/String;[B)Lcom/pymcl/core/auth/SkinServer$Response;
    .locals 30
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "path"    # Ljava/lang/String;
    .param p3, "body"    # [B

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v0, "method"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    iget-object v5, v1, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    monitor-enter v5

    .line 221
    const/4 v0, 0x0

    .line 138
    .local v0, "$i$a$-synchronized-SkinServer$handle$1":I
    :try_start_0
    iget-object v6, v1, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    check-cast v6, Ljava/util/Collection;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v6, v1, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    const/16 v7, 0xc8

    const/4 v8, 0x0

    if-le v6, v7, :cond_0

    iget-object v6, v1, Lcom/pymcl/core/auth/SkinServer;->requestLog:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .end local v0    # "$i$a$-synchronized-SkinServer$handle$1":I
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v5

    .line 139
    const/16 v0, 0x3f

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v3, v0, v5, v6, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    new-array v11, v10, [C

    const/16 v12, 0x2f

    aput-char v12, v11, v8

    invoke-static {v9, v11}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_1

    move v11, v10

    goto :goto_1

    :cond_1
    move v11, v8

    :goto_1
    if-eqz v11, :cond_2

    .line 221
    const/4 v9, 0x0

    .line 139
    .local v9, "$i$a$-ifEmpty-SkinServer$handle$p$1":I
    const-string v9, "/"

    .end local v9    # "$i$a$-ifEmpty-SkinServer$handle$p$1":I
    :cond_2
    check-cast v9, Ljava/lang/String;

    .line 140
    .local v9, "p":Ljava/lang/String;
    const-string v11, ""

    invoke-static {v3, v0, v11}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/CharSequence;

    new-array v14, v10, [C

    const/16 v0, 0x26

    aput-char v0, v14, v8

    const/16 v17, 0x6

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 224
    .local v11, "$i$f$filter":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v0

    .local v14, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 225
    .local v15, "$i$f$filterTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    move/from16 v18, v10

    const/16 v10, 0x3d

    if-eqz v17, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v12

    check-cast v19, Ljava/lang/String;

    .local v19, "it":Ljava/lang/String;
    const/16 v20, 0x0

    .line 140
    .local v20, "$i$a$-filter-SkinServer$handle$q$1":I
    move-object/from16 v7, v19

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v7, v10, v8, v6, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v7

    .line 225
    .end local v19    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-filter-SkinServer$handle$q$1":I
    if-eqz v7, :cond_3

    invoke-interface {v13, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    move/from16 v10, v18

    const/16 v7, 0xc8

    const/16 v12, 0x2f

    goto :goto_2

    .line 226
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$filterTo":I
    move-object v7, v13

    check-cast v7, Ljava/util/List;

    .line 224
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filter":I
    check-cast v7, Ljava/lang/Iterable;

    .line 141
    nop

    .local v7, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v0, 0x0

    .line 227
    .local v0, "$i$f$associate":I
    const/16 v11, 0xa

    invoke-static {v7, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-static {v11}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v11

    const/16 v12, 0x10

    invoke-static {v11, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v11

    .line 228
    .local v11, "capacity$iv":I
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12, v11}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v12, Ljava/util/Map;

    .local v12, "destination$iv$iv":Ljava/util/Map;
    move-object v13, v7

    .local v13, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 229
    .local v14, "$i$f$associateTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 230
    .local v16, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v8, v16

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/16 v20, 0x0

    .line 141
    .local v20, "$i$a$-associate-SkinServer$handle$q$2":I
    move/from16 v21, v0

    .end local v0    # "$i$f$associate":I
    .local v21, "$i$f$associate":I
    invoke-static {v8, v10, v5, v6, v5}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "UTF-8"

    invoke-static {v0, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v10, v5, v6, v5}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v10, "UTF-8"

    invoke-static {v2, v10}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 230
    .end local v8    # "it":Ljava/lang/String;
    .end local v20    # "$i$a$-associate-SkinServer$handle$q$2":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v12, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p1

    move/from16 v0, v21

    const/4 v8, 0x0

    const/16 v10, 0x3d

    goto :goto_3

    .line 232
    .end local v16    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$f$associate":I
    .restart local v0    # "$i$f$associate":I
    :cond_5
    move/from16 v21, v0

    .line 228
    .end local v0    # "$i$f$associate":I
    .end local v12    # "destination$iv$iv":Ljava/util/Map;
    .end local v13    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$associateTo":I
    .restart local v21    # "$i$f$associate":I
    nop

    .line 141
    .end local v7    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v11    # "capacity$iv":I
    .end local v21    # "$i$f$associate":I
    nop

    .line 140
    nop

    .local v12, "q":Ljava/util/Map;
    new-instance v0, Ljava/lang/String;

    .line 142
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v0, v4, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v2, v0

    .line 143
    .local v2, "bodyText":Ljava/lang/String;
    nop

    .line 144
    const-string v0, "/"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    const-string v0, "/status"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v8, 0xc8

    goto/16 :goto_d

    .line 145
    :cond_6
    const-string v0, "/textures/"

    const/4 v7, 0x0

    invoke-static {v9, v0, v7, v6, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v1, Lcom/pymcl/core/auth/SkinServer;->textures:Ljava/util/concurrent/ConcurrentHashMap;

    const-string v5, "/textures/"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v9, v5}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    if-eqz v0, :cond_7

    .line 221
    .local v0, "it":[B
    const/4 v5, 0x0

    .line 145
    .local v5, "$i$a$-let-SkinServer$handle$2":I
    new-instance v6, Lcom/pymcl/core/auth/SkinServer$Response;

    const-string v7, "image/png"

    const/16 v8, 0xc8

    invoke-direct {v6, v8, v7, v0}, Lcom/pymcl/core/auth/SkinServer$Response;-><init>(ILjava/lang/String;[B)V

    .end local v0    # "it":[B
    .end local v5    # "$i$a$-let-SkinServer$handle$2":I
    goto/16 :goto_e

    :cond_7
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->notFound()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 146
    :cond_8
    const-string v0, "/sessionserver/session/minecraft/profile/"

    const/4 v7, 0x0

    invoke-static {v9, v0, v7, v6, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 147
    const/16 v0, 0x2f

    invoke-static {v9, v0, v5, v6, v5}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const-string v22, "-"

    const-string v23, ""

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v5, "toLowerCase(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .local v0, "id":Ljava/lang/String;
    iget-object v5, v1, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v5, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/pymcl/core/auth/SkinServer$Profile;

    if-eqz v5, :cond_9

    .line 221
    .local v5, "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    const/4 v6, 0x0

    .line 148
    .local v6, "$i$a$-let-SkinServer$handle$3":I
    const-string v7, "unsigned"

    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "true"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    invoke-virtual {v1, v5, v7}, Lcom/pymcl/core/auth/SkinServer;->profileJson(Lcom/pymcl/core/auth/SkinServer$Profile;Z)Ljava/util/Map;

    move-result-object v7

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v7}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v5    # "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v6    # "$i$a$-let-SkinServer$handle$3":I
    if-nez v6, :cond_25

    :cond_9
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->noContent()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v0    # "id":Ljava/lang/String;
    goto/16 :goto_e

    .line 150
    :cond_a
    const-string v0, "/sessionserver/session/minecraft/hasJoined"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "username"

    invoke-interface {v12, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v1, v0}, Lcom/pymcl/core/auth/SkinServer;->byName(Ljava/lang/String;)Lcom/pymcl/core/auth/SkinServer$Profile;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 221
    .local v0, "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    const/4 v7, 0x0

    .line 150
    .local v7, "$i$a$-let-SkinServer$handle$4":I
    const/4 v8, 0x0

    invoke-static {v1, v0, v8, v6, v5}, Lcom/pymcl/core/auth/SkinServer;->profileJson$default(Lcom/pymcl/core/auth/SkinServer;Lcom/pymcl/core/auth/SkinServer$Profile;ZILjava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v5}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v0    # "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v7    # "$i$a$-let-SkinServer$handle$4":I
    if-nez v6, :cond_25

    :cond_b
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->noContent()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 151
    :cond_c
    const-string v0, "/sessionserver/session/minecraft/join"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->noContent()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 152
    :cond_d
    const-string v0, "/api/profiles/minecraft"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 153
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/auth/SkinServer;

    .line 221
    .local v0, "$this$handle_u24lambda_u247":Lcom/pymcl/core/auth/SkinServer;
    const/4 v7, 0x0

    .line 153
    .local v7, "$i$a$-runCatching-SkinServer$handle$names$1":I
    sget-object v8, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v8, v2}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_11

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 233
    .local v10, "$i$f$mapNotNull":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v8

    .local v13, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 242
    .local v14, "$i$f$mapNotNullTo":I
    move-object v15, v13

    .local v15, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 243
    .local v16, "$i$f$forEach":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_4
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_10

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .local v20, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v20

    .local v21, "element$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 242
    .local v22, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v23, v21

    .local v23, "it":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 153
    .local v24, "$i$a$-mapNotNull-SkinServer$handle$names$1$1":I
    move-object/from16 v5, v23

    .end local v23    # "it":Ljava/lang/Object;
    .local v5, "it":Ljava/lang/Object;
    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_e

    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    goto :goto_5

    :cond_e
    const/4 v6, 0x0

    .line 242
    .end local v5    # "it":Ljava/lang/Object;
    .end local v24    # "$i$a$-mapNotNull-SkinServer$handle$names$1$1":I
    :goto_5
    if-eqz v6, :cond_f

    .line 244
    .local v6, "it$iv$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 242
    .local v5, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v11, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 243
    .end local v5    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v6    # "it$iv$iv":Ljava/lang/Object;
    .end local v21    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_f
    const/4 v5, 0x0

    const/4 v6, 0x2

    .end local v20    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_4

    .line 245
    :cond_10
    nop

    .line 246
    .end local v15    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$forEach":I
    nop

    .end local v11    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapNotNullTo":I
    move-object v5, v11

    check-cast v5, Ljava/util/List;

    .line 233
    nop

    .end local v8    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapNotNull":I
    goto :goto_6

    .line 153
    :cond_11
    const/4 v5, 0x0

    .end local v0    # "$this$handle_u24lambda_u247":Lcom/pymcl/core/auth/SkinServer;
    .end local v7    # "$i$a$-runCatching-SkinServer$handle$names$1":I
    :goto_6
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_7

    :catchall_0
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_7
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    const/4 v0, 0x0

    :cond_12
    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_13

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 154
    .local v0, "names":Ljava/util/List;
    :cond_13
    move-object v5, v0

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 247
    .local v6, "$i$f$mapNotNull":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v5

    .local v8, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 256
    .local v10, "$i$f$mapNotNullTo":I
    move-object v11, v8

    .local v11, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 257
    .local v13, "$i$f$forEach":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_16

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    .local v16, "element$iv$iv":Ljava/lang/Object;
    const/16 v17, 0x0

    .line 256
    .local v17, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v20, v0

    .end local v0    # "names":Ljava/util/List;
    .local v20, "names":Ljava/util/List;
    move-object/from16 v0, v16

    check-cast v0, Ljava/lang/String;

    .local v0, "n":Ljava/lang/String;
    const/16 v21, 0x0

    .line 154
    .local v21, "$i$a$-mapNotNull-SkinServer$handle$5":I
    invoke-direct {v1, v0}, Lcom/pymcl/core/auth/SkinServer;->byName(Ljava/lang/String;)Lcom/pymcl/core/auth/SkinServer$Profile;

    move-result-object v22

    if-eqz v22, :cond_14

    .line 221
    .local v22, "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    const/16 v24, 0x0

    .line 154
    .local v24, "$i$a$-let-SkinServer$handle$5$1":I
    move-object/from16 v26, v0

    const/4 v3, 0x2

    .end local v0    # "n":Ljava/lang/String;
    .local v26, "n":Ljava/lang/String;
    new-array v0, v3, [Lkotlin/Pair;

    const-string v3, "id"

    move-object/from16 v27, v0

    invoke-virtual/range {v22 .. v22}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v19, 0x0

    aput-object v0, v27, v19

    const-string v0, "name"

    invoke-virtual/range {v22 .. v22}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v27, v18

    invoke-static/range {v27 .. v27}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .end local v22    # "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v24    # "$i$a$-let-SkinServer$handle$5$1":I
    goto :goto_9

    .end local v26    # "n":Ljava/lang/String;
    .restart local v0    # "n":Ljava/lang/String;
    :cond_14
    move-object/from16 v26, v0

    .end local v0    # "n":Ljava/lang/String;
    .restart local v26    # "n":Ljava/lang/String;
    const/4 v0, 0x0

    .line 256
    .end local v21    # "$i$a$-mapNotNull-SkinServer$handle$5":I
    .end local v26    # "n":Ljava/lang/String;
    :goto_9
    if-eqz v0, :cond_15

    .line 258
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 256
    .local v3, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 257
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v16    # "element$iv$iv":Ljava/lang/Object;
    .end local v17    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_15
    move-object/from16 v3, p2

    move-object/from16 v0, v20

    .end local v15    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 259
    .end local v20    # "names":Ljava/util/List;
    .local v0, "names":Ljava/util/List;
    :cond_16
    move-object/from16 v20, v0

    .line 260
    .end local v0    # "names":Ljava/util/List;
    .end local v11    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach":I
    .restart local v20    # "names":Ljava/util/List;
    nop

    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapNotNullTo":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 247
    nop

    .end local v5    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNull":I
    check-cast v0, Ljava/util/Collection;

    .line 154
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v0}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v20    # "names":Ljava/util/List;
    goto/16 :goto_e

    .line 156
    :cond_17
    const-string v0, "/api/users/profiles/minecraft/"

    const/4 v3, 0x2

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {v9, v0, v7, v3, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const/16 v0, 0x2f

    invoke-static {v9, v0, v5, v3, v5}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/pymcl/core/auth/SkinServer;->byName(Ljava/lang/String;)Lcom/pymcl/core/auth/SkinServer$Profile;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 221
    .local v0, "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    const/4 v5, 0x0

    .line 156
    .local v5, "$i$a$-let-SkinServer$handle$6":I
    new-array v3, v3, [Lkotlin/Pair;

    const-string v6, "id"

    invoke-virtual {v0}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/16 v19, 0x0

    aput-object v6, v3, v19

    const-string v6, "name"

    invoke-virtual {v0}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v18

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v3}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v0    # "it":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v5    # "$i$a$-let-SkinServer$handle$6":I
    if-nez v6, :cond_25

    :cond_18
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->noContent()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 157
    :cond_19
    const-string v0, "/authserver/authenticate"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x3

    const/4 v5, 0x4

    if-nez v0, :cond_1f

    const-string v0, "/authserver/refresh"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    goto/16 :goto_b

    .line 166
    :cond_1a
    const-string v0, "/authserver/validate"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    const-string v0, "/authserver/invalidate"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    const-string v0, "/authserver/signout"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1b

    goto/16 :goto_a

    .line 167
    :cond_1b
    const-string v0, "/minecraftservices/player/attributes"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    .line 168
    const/4 v6, 0x2

    new-array v0, v6, [Lkotlin/Pair;

    const-string v6, "privileges"

    new-array v5, v5, [Lkotlin/Pair;

    const-string v7, "onlineChat"

    move/from16 v8, v18

    new-array v10, v8, [Lkotlin/Pair;

    const-string v11, "enabled"

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/16 v19, 0x0

    aput-object v11, v10, v19

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v19

    const-string v7, "multiplayerServer"

    new-array v10, v8, [Lkotlin/Pair;

    const-string v11, "enabled"

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v10, v19

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v8

    .line 169
    const-string v7, "multiplayerRealms"

    new-array v10, v8, [Lkotlin/Pair;

    const-string v11, "enabled"

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v10, v19

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/16 v23, 0x2

    aput-object v7, v5, v23

    .line 168
    nop

    .line 169
    const-string v7, "telemetry"

    new-array v10, v8, [Lkotlin/Pair;

    const-string v8, "enabled"

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v10, v19

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v3

    .line 168
    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v19

    .line 170
    const-string v3, "profanityFilterPreferences"

    const/4 v8, 0x1

    new-array v5, v8, [Lkotlin/Pair;

    const-string v6, "profanityFilterOn"

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v5, v19

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v8

    .line 168
    nop

    .line 167
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v0}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 171
    :cond_1c
    const-string v0, "/minecraftservices/publickeys"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1d

    const/4 v3, 0x2

    new-array v0, v3, [Lkotlin/Pair;

    const-string v3, "profilePropertyKeys"

    const/4 v8, 0x1

    new-array v5, v8, [Lkotlin/Pair;

    const-string v6, "publicKey"

    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v7

    iget-object v8, v1, Lcom/pymcl/core/auth/SkinServer;->keyPair:Ljava/security/KeyPair;

    invoke-virtual {v8}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v8

    invoke-interface {v8}, Ljava/security/PublicKey;->getEncoded()[B

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/16 v19, 0x0

    aput-object v6, v5, v19

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v19

    .line 172
    const-string v3, "playerCertificateKeys"

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/List;

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v18, 0x1

    aput-object v3, v0, v18

    .line 171
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v0}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 173
    :cond_1d
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->notFound()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 166
    :cond_1e
    :goto_a
    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer;->noContent()Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    goto/16 :goto_e

    .line 158
    :cond_1f
    :goto_b
    :try_start_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/auth/SkinServer;

    .line 221
    .local v0, "$this$handle_u24lambda_u2410":Lcom/pymcl/core/auth/SkinServer;
    const/4 v6, 0x0

    .line 158
    .local v6, "$i$a$-runCatching-SkinServer$handle$req$1":I
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v7, v2}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .end local v0    # "$this$handle_u24lambda_u2410":Lcom/pymcl/core/auth/SkinServer;
    .end local v6    # "$i$a$-runCatching-SkinServer$handle$req$1":I
    invoke-static {v7}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_c

    :catchall_1
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_c
    const/4 v7, 0x0

    new-array v6, v7, [Lkotlin/Pair;

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_20

    move-object v0, v6

    :cond_20
    check-cast v0, Ljava/util/Map;

    .line 159
    .local v0, "req":Ljava/util/Map;
    const-string v6, "username"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v1, v6}, Lcom/pymcl/core/auth/SkinServer;->byName(Ljava/lang/String;)Lcom/pymcl/core/auth/SkinServer$Profile;

    move-result-object v6

    if-nez v6, :cond_21

    iget-object v6, v1, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v6

    const-string v7, "<get-values>(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/core/auth/SkinServer$Profile;

    if-nez v6, :cond_21

    .line 160
    const/4 v3, 0x2

    new-array v3, v3, [Lkotlin/Pair;

    const-string v5, "error"

    const-string v6, "ForbiddenOperationException"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v19, 0x0

    aput-object v5, v3, v19

    const-string v5, "errorMessage"

    const-string v6, "\u6ca1\u6709\u53ef\u7528\u7684\u89d2\u8272"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/16 v18, 0x1

    aput-object v5, v3, v18

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v5, 0x193

    invoke-direct {v1, v5, v3}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v3

    return-object v3

    .line 161
    .local v6, "prof":Lcom/pymcl/core/auth/SkinServer$Profile;
    :cond_21
    const/4 v7, 0x2

    new-array v8, v7, [Lkotlin/Pair;

    const-string v7, "id"

    invoke-virtual {v6}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/16 v19, 0x0

    aput-object v7, v8, v19

    const-string v7, "name"

    invoke-virtual {v6}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/16 v18, 0x1

    aput-object v7, v8, v18

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    .line 162
    .local v7, "pj":Ljava/util/Map;
    new-array v5, v5, [Lkotlin/Pair;

    const-string v8, "accessToken"

    const-string v10, "accessToken"

    invoke-static {v0, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_22

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "toString(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v25, "-"

    const-string v26, ""

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    move-object/from16 v24, v10

    invoke-static/range {v24 .. v29}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    :cond_22
    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v19, 0x0

    aput-object v8, v5, v19

    .line 163
    const-string v8, "clientToken"

    const-string v10, "clientToken"

    invoke-static {v0, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_23

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "toString(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v25, "-"

    const-string v26, ""

    const/16 v28, 0x4

    const/16 v29, 0x0

    const/16 v27, 0x0

    move-object/from16 v24, v10

    invoke-static/range {v24 .. v29}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    :cond_23
    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v18, 0x1

    aput-object v8, v5, v18

    .line 162
    nop

    .line 164
    const-string v8, "availableProfiles"

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/16 v23, 0x2

    aput-object v8, v5, v23

    .line 162
    nop

    .line 164
    const-string v8, "selectedProfile"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v5, v3

    .line 162
    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/16 v8, 0xc8

    invoke-direct {v1, v8, v3}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .end local v0    # "req":Ljava/util/Map;
    .end local v6    # "prof":Lcom/pymcl/core/auth/SkinServer$Profile;
    .end local v7    # "pj":Ljava/util/Map;
    goto :goto_e

    .line 144
    :cond_24
    const/16 v8, 0xc8

    :goto_d
    invoke-virtual {v1}, Lcom/pymcl/core/auth/SkinServer;->metadata()Ljava/util/Map;

    move-result-object v0

    invoke-direct {v1, v8, v0}, Lcom/pymcl/core/auth/SkinServer;->json(ILjava/lang/Object;)Lcom/pymcl/core/auth/SkinServer$Response;

    move-result-object v6

    .line 143
    :cond_25
    :goto_e
    return-object v6

    .line 138
    .end local v2    # "bodyText":Ljava/lang/String;
    .end local v9    # "p":Ljava/lang/String;
    .end local v12    # "q":Ljava/util/Map;
    :catchall_2
    move-exception v0

    monitor-exit v5

    throw v0
.end method

.method public final metadata()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 108
    const/4 v0, 0x3

    new-array v1, v0, [Lkotlin/Pair;

    const/4 v2, 0x6

    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "serverName"

    iget-object v4, p0, Lcom/pymcl/core/auth/SkinServer;->serverName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "implementationName"

    const-string v5, "PyMCL"

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x1

    .line 109
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    .line 108
    aput-object v3, v2, v5

    const-string v3, "implementationVersion"

    const-string v7, "1.0.1"

    invoke-static {v3, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v7, 0x2

    aput-object v3, v2, v7

    .line 109
    const-string v3, "feature.non_email_login"

    invoke-static {v3, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v2, v0

    .line 108
    nop

    .line 109
    const-string v0, "feature.no_mojang_namespace"

    invoke-static {v0, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v3, 0x4

    aput-object v0, v2, v3

    .line 108
    nop

    .line 110
    new-array v0, v5, [Lkotlin/Pair;

    const-string v3, "homepage"

    invoke-virtual {p0}, Lcom/pymcl/core/auth/SkinServer;->getApiRoot()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v4

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v3, "links"

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v3, 0x5

    aput-object v0, v2, v3

    .line 108
    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const-string v2, "meta"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v4

    .line 111
    const-string v0, "127.0.0.1"

    const-string v2, "localhost"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v2, "skinDomains"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v5

    .line 108
    nop

    .line 112
    sget-object v0, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    iget-object v2, p0, Lcom/pymcl/core/auth/SkinServer;->keyPair:Ljava/security/KeyPair;

    invoke-virtual {v2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v2

    const-string v3, "getPublic(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/pymcl/core/auth/SkinServer$Companion;->pem(Ljava/security/PublicKey;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "signaturePublickey"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v7

    .line 108
    nop

    .line 107
    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 112
    return-object v0
.end method

.method public final prefetched()Ljava/lang/String;
    .locals 6

    .line 105
    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {p0}, Lcom/pymcl/core/auth/SkinServer;->metadata()Ljava/util/Map;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "encodeToString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final profileJson(Lcom/pymcl/core/auth/SkinServer$Profile;Z)Ljava/util/Map;
    .locals 13
    .param p1, "p"    # Lcom/pymcl/core/auth/SkinServer$Profile;
    .param p2, "signed"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/auth/SkinServer$Profile;",
            "Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v1, v0, [Lkotlin/Pair;

    .line 119
    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 120
    .local v1, "tex":Ljava/util/Map;
    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getSkinPng()[B

    move-result-object v2

    const-string v3, "/textures/"

    const-string v4, "url"

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    .line 221
    .local v2, "it":[B
    const/4 v6, 0x0

    .line 120
    .local v6, "$i$a$-let-SkinServer$profileJson$1":I
    new-array v7, v5, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/pymcl/core/auth/SkinServer;->getApiRoot()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v9, v2}, Lcom/pymcl/core/auth/SkinServer$Companion;->digest([B)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v0

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    move-object v8, v7

    .line 221
    .local v8, "s":Ljava/util/Map;
    const/4 v9, 0x0

    .line 120
    .local v9, "$i$a$-also-SkinServer$profileJson$1$1":I
    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getSlim()Z

    move-result v10

    if-eqz v10, :cond_0

    new-array v10, v5, [Lkotlin/Pair;

    const-string v11, "model"

    const-string v12, "slim"

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    aput-object v11, v10, v0

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    const-string v11, "metadata"

    invoke-interface {v8, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v8    # "s":Ljava/util/Map;
    .end local v9    # "$i$a$-also-SkinServer$profileJson$1$1":I
    :cond_0
    const-string v8, "SKIN"

    invoke-interface {v1, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .end local v2    # "it":[B
    .end local v6    # "$i$a$-let-SkinServer$profileJson$1":I
    :cond_1
    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getCapePng()[B

    move-result-object v2

    if-eqz v2, :cond_2

    .line 221
    .restart local v2    # "it":[B
    const/4 v6, 0x0

    .line 121
    .local v6, "$i$a$-let-SkinServer$profileJson$2":I
    new-array v7, v5, [Lkotlin/Pair;

    invoke-virtual {p0}, Lcom/pymcl/core/auth/SkinServer;->getApiRoot()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v9, v2}, Lcom/pymcl/core/auth/SkinServer$Companion;->digest([B)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v7, v0

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "CAPE"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .end local v2    # "it":[B
    .end local v6    # "$i$a$-let-SkinServer$profileJson$2":I
    :cond_2
    invoke-static {}, Ljava/util/Base64;->getEncoder()Ljava/util/Base64$Encoder;

    move-result-object v2

    sget-object v3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    .line 123
    const/4 v4, 0x5

    new-array v4, v4, [Lkotlin/Pair;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "timestamp"

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v4, v0

    const-string v6, "profileId"

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v4, v5

    const-string v6, "profileName"

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/4 v7, 0x2

    aput-object v6, v4, v7

    .line 124
    const-string v6, "signatureRequired"

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    const/4 v8, 0x3

    aput-object v6, v4, v8

    .line 123
    nop

    .line 124
    const-string v6, "textures"

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/4 v10, 0x4

    aput-object v9, v4, v10

    .line 123
    nop

    .line 122
    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v3, v4, v0, v7, v9}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 124
    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    const-string v4, "getBytes(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    invoke-virtual {v2, v3}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    move-result-object v2

    .line 125
    .local v2, "value":Ljava/lang/String;
    new-array v3, v7, [Lkotlin/Pair;

    const-string v4, "name"

    invoke-static {v4, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v0

    const-string v6, "value"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    aput-object v6, v3, v5

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 126
    .local v3, "prop":Ljava/util/Map;
    if-eqz p2, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v2}, Lcom/pymcl/core/auth/SkinServer;->sign(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v9, "signature"

    invoke-interface {v3, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    :cond_3
    new-array v6, v8, [Lkotlin/Pair;

    const-string v8, "id"

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v6, v0

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v6, v5

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v4, "properties"

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v6, v7

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final profiles()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/core/auth/SkinServer$Profile;",
            ">;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final put(Lcom/pymcl/core/auth/SkinServer$Profile;)V
    .locals 4
    .param p1, "p"    # Lcom/pymcl/core/auth/SkinServer$Profile;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getSkinPng()[B

    move-result-object v0

    if-eqz v0, :cond_0

    .line 221
    .local v0, "it":[B
    const/4 v1, 0x0

    .line 74
    .local v1, "$i$a$-let-SkinServer$put$1":I
    iget-object v2, p0, Lcom/pymcl/core/auth/SkinServer;->textures:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v2, Ljava/util/Map;

    sget-object v3, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v3, v0}, Lcom/pymcl/core/auth/SkinServer$Companion;->digest([B)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .end local v0    # "it":[B
    .end local v1    # "$i$a$-let-SkinServer$put$1":I
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/core/auth/SkinServer$Profile;->getCapePng()[B

    move-result-object v0

    if-eqz v0, :cond_1

    .line 221
    .restart local v0    # "it":[B
    const/4 v1, 0x0

    .line 75
    .local v1, "$i$a$-let-SkinServer$put$2":I
    iget-object v2, p0, Lcom/pymcl/core/auth/SkinServer;->textures:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v2, Ljava/util/Map;

    sget-object v3, Lcom/pymcl/core/auth/SkinServer;->Companion:Lcom/pymcl/core/auth/SkinServer$Companion;

    invoke-virtual {v3, v0}, Lcom/pymcl/core/auth/SkinServer$Companion;->digest([B)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .end local v0    # "it":[B
    .end local v1    # "$i$a$-let-SkinServer$put$2":I
    :cond_1
    return-void
.end method

.method public final remove(Ljava/lang/String;)V
    .locals 7
    .param p1, "uuid"    # Ljava/lang/String;

    const-string v0, "uuid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->profiles:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "-"

    const-string v3, ""

    const/4 v4, 0x0

    move-object v1, p1

    .end local p1    # "uuid":Ljava/lang/String;
    .local v1, "uuid":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "toLowerCase(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final declared-synchronized start(I)I
    .locals 3
    .param p1, "port"    # I

    monitor-enter p0

    .line 83
    :try_start_0
    invoke-virtual {p0}, Lcom/pymcl/core/auth/SkinServer;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/pymcl/core/auth/SkinServer;->port:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 84
    .end local p0    # "this":Lcom/pymcl/core/auth/SkinServer;
    :cond_0
    :try_start_1
    new-instance v0, Ljava/net/ServerSocket;

    invoke-direct {v0}, Ljava/net/ServerSocket;-><init>()V

    .line 85
    .local v0, "ss":Ljava/net/ServerSocket;
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/net/ServerSocket;->setReuseAddress(Z)V

    .line 86
    new-instance v1, Ljava/net/InetSocketAddress;

    const-string v2, "127.0.0.1"

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    check-cast v1, Ljava/net/SocketAddress;

    const/16 v2, 0x20

    invoke-virtual {v0, v1, v2}, Ljava/net/ServerSocket;->bind(Ljava/net/SocketAddress;I)V

    .line 87
    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->socket:Ljava/net/ServerSocket;

    invoke-virtual {v0}, Ljava/net/ServerSocket;->getLocalPort()I

    move-result v1

    iput v1, p0, Lcom/pymcl/core/auth/SkinServer;->port:I

    .line 88
    new-instance v1, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 89
    .local v1, "p":Ljava/util/concurrent/ExecutorService;
    iput-object v1, p0, Lcom/pymcl/core/auth/SkinServer;->pool:Ljava/util/concurrent/ExecutorService;

    .line 90
    new-instance v2, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;

    invoke-direct {v2, v0, v1, p0}, Lcom/pymcl/core/auth/SkinServer$$ExternalSyntheticLambda2;-><init>(Ljava/net/ServerSocket;Ljava/util/concurrent/ExecutorService;Lcom/pymcl/core/auth/SkinServer;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 96
    iget v2, p0, Lcom/pymcl/core/auth/SkinServer;->port:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v2

    .line 82
    .end local v0    # "ss":Ljava/net/ServerSocket;
    .end local v1    # "p":Ljava/util/concurrent/ExecutorService;
    .end local p1    # "port":I
    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized stop()V
    .locals 4

    monitor-enter p0

    .line 100
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/core/auth/SkinServer;

    .line 221
    .local v1, "$this$stop_u24lambda_u240":Lcom/pymcl/core/auth/SkinServer;
    const/4 v2, 0x0

    .line 100
    .local v2, "$i$a$-runCatching-SkinServer$stop$1":I
    iget-object v3, v1, Lcom/pymcl/core/auth/SkinServer;->socket:Ljava/net/ServerSocket;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/net/ServerSocket;->close()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    move-object v3, v0

    .end local v1    # "$this$stop_u24lambda_u240":Lcom/pymcl/core/auth/SkinServer;
    .end local v2    # "$i$a$-runCatching-SkinServer$stop$1":I
    :goto_0
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->socket:Ljava/net/ServerSocket;

    .line 101
    iget-object v1, p0, Lcom/pymcl/core/auth/SkinServer;->pool:Ljava/util/concurrent/ExecutorService;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .end local p0    # "this":Lcom/pymcl/core/auth/SkinServer;
    :cond_1
    iput-object v0, p0, Lcom/pymcl/core/auth/SkinServer;->pool:Ljava/util/concurrent/ExecutorService;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 102
    monitor-exit p0

    return-void

    .line 99
    :catchall_1
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0
.end method
