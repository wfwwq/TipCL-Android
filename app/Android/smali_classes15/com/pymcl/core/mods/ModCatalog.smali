.class public final Lcom/pymcl/core/mods/ModCatalog;
.super Ljava/lang/Object;
.source "ModCatalog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/ModCatalog$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModCatalog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModCatalog.kt\ncom/pymcl/core/mods/ModCatalog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,238:1\n1#2:239\n1#2:254\n1#2:276\n1#2:297\n1#2:311\n1#2:331\n1#2:361\n1#2:375\n1#2:394\n1739#3:240\n1814#3,2:241\n1795#3,10:243\n2068#3:253\n2069#3:255\n1805#3:256\n2068#3,2:257\n1805#3:259\n1816#3:260\n1739#3:261\n1814#3,3:262\n1795#3,10:265\n2068#3:275\n2069#3:277\n1805#3:278\n296#3,2:279\n777#3:281\n873#3,2:282\n296#3,2:284\n1795#3,10:286\n2068#3:296\n2069#3:298\n1805#3:299\n1795#3,10:300\n2068#3:310\n2069#3:312\n1805#3:313\n1739#3:314\n1814#3,3:315\n296#3,2:318\n1795#3,10:320\n2068#3:330\n2069#3:332\n1805#3:333\n1795#3,10:334\n2068#3,2:344\n1805#3:346\n777#3:347\n873#3,2:348\n1795#3,10:350\n2068#3:360\n2069#3:362\n1805#3:363\n1795#3,10:364\n2068#3:374\n2069#3:376\n1805#3:377\n296#3,2:378\n777#3:380\n873#3,2:381\n1795#3,10:383\n2068#3:393\n2069#3:395\n1805#3:396\n1739#3:397\n1814#3,3:398\n1358#3,2:401\n1435#3,4:403\n1373#3,2:411\n1402#3,4:413\n1439#4,2:407\n1505#4,2:409\n*S KotlinDebug\n*F\n+ 1 ModCatalog.kt\ncom/pymcl/core/mods/ModCatalog\n*L\n111#1:254\n125#1:276\n135#1:297\n148#1:311\n162#1:331\n164#1:361\n169#1:375\n173#1:394\n108#1:240\n108#1:241,2\n111#1:243,10\n111#1:253\n111#1:255\n111#1:256\n111#1:257,2\n111#1:259\n108#1:260\n121#1:261\n121#1:262,3\n125#1:265,10\n125#1:275\n125#1:277\n125#1:278\n129#1:279,2\n130#1:281\n130#1:282,2\n130#1:284,2\n135#1:286,10\n135#1:296\n135#1:298\n135#1:299\n148#1:300,10\n148#1:310\n148#1:312\n148#1:313\n154#1:314\n154#1:315,3\n160#1:318,2\n162#1:320,10\n162#1:330\n162#1:332\n162#1:333\n162#1:334,10\n162#1:344,2\n162#1:346\n164#1:347\n164#1:348,2\n164#1:350,10\n164#1:360\n164#1:362\n164#1:363\n169#1:364,10\n169#1:374\n169#1:376\n169#1:377\n172#1:378,2\n173#1:380\n173#1:381,2\n173#1:383,10\n173#1:393\n173#1:395\n173#1:396\n184#1:397\n184#1:398,3\n189#1:401,2\n189#1:403,4\n228#1:411,2\n228#1:413,4\n214#1:407,2\n217#1:409,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u0000 M2\u00020\u0001:\u0001MB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000cH\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00080\u000cH\u0002JC\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00102\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00082\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u0000\u00a2\u0006\u0002\u0008\u0016JD\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001f\u001a\u00020 J:\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001f\u001a\u00020 J:\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00102\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001f\u001a\u00020 2\u0008\u0008\u0002\u0010#\u001a\u00020\u0008J\'\u0010$\u001a\u00020\u00182\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`\'H\u0000\u00a2\u0006\u0002\u0008(J\u0018\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0008J\u0010\u0010*\u001a\u0004\u0018\u00010\u00182\u0006\u0010+\u001a\u00020\u0008J(\u0010,\u001a\u0008\u0012\u0004\u0012\u00020-0\u00102\u0006\u0010+\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u00082\u0008\u0008\u0002\u0010.\u001a\u00020\u0008J)\u0010/\u001a\u0004\u0018\u00010-2\u0018\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`\'H\u0000\u00a2\u0006\u0002\u00081J\'\u00102\u001a\u00020-2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010&j\u0002`\'H\u0000\u00a2\u0006\u0002\u00084J\u0016\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u00082\u0006\u00107\u001a\u00020\u0008J\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u00020-0\u00102\u000c\u00109\u001a\u0008\u0012\u0004\u0012\u00020:0\u0010J \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020 0\u000c2\u000c\u0010<\u001a\u0008\u0012\u0004\u0012\u00020:0\u0010J\u0016\u0010=\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>JR\u0010@\u001a\u00020>2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u00105\u001a\u00020-2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020B2\n\u0008\u0002\u0010C\u001a\u0004\u0018\u00010\u00082\u0016\u0008\u0002\u0010D\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020G\u0018\u00010EH\u0086@\u00a2\u0006\u0002\u0010HJ\u0016\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>J0\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020-0\u000c2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020>0\u00102\u0006\u0010\u001d\u001a\u00020\u00082\u0006\u0010.\u001a\u00020\u0008R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModCatalog;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "mirrors",
        "Lcom/pymcl/core/download/Mirrors;",
        "cfKey",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lkotlin/jvm/functions/Function0;)V",
        "mrHeaders",
        "",
        "cfHeaders",
        "getJson",
        "bases",
        "",
        "path",
        "cf",
        "",
        "method",
        "body",
        "getJson$PyMCL_Android_core",
        "search",
        "Lcom/pymcl/core/mods/ModHit;",
        "kind",
        "Lcom/pymcl/core/mods/ResKind;",
        "query",
        "source",
        "gameVersion",
        "category",
        "limit",
        "",
        "searchModrinth",
        "searchCurseForge",
        "slug",
        "cfHit",
        "m",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "cfHit$PyMCL_Android_core",
        "resolveCfSlug",
        "project",
        "id",
        "files",
        "Lcom/pymcl/core/mods/ModFile;",
        "loader",
        "mrVersion",
        "v",
        "mrVersion$PyMCL_Android_core",
        "cfFile",
        "f",
        "cfFile$PyMCL_Android_core",
        "file",
        "projectId",
        "fileId",
        "cfFiles",
        "fileIds",
        "",
        "cfClasses",
        "modIds",
        "targetDir",
        "Ljava/io/File;",
        "gameDir",
        "install",
        "downloads",
        "Lcom/pymcl/core/download/DownloadManager;",
        "world",
        "onProgress",
        "Lkotlin/Function1;",
        "",
        "",
        "(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "unzipWorld",
        "zip",
        "saves",
        "checkUpdates",
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
.field private static final CF_LOADERS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;


# instance fields
.field private final cfKey:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final http:Lcom/pymcl/core/net/Http;

.field private final mirrors:Lcom/pymcl/core/download/Mirrors;


# direct methods
.method public static synthetic $r8$lambda$1g7Lr9Ab5MnzabO578Cv8R4u2pY(Ljava/util/zip/ZipEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ModCatalog;->unzipWorld$lambda$0$0(Ljava/util/zip/ZipEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$9V2qB7D8l-4Kdy1QAuvgL4ymono(Lkotlin/jvm/functions/Function1;Lcom/pymcl/core/download/DownloadProgress;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/mods/ModCatalog;->install$lambda$2(Lkotlin/jvm/functions/Function1;Lcom/pymcl/core/download/DownloadProgress;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/pymcl/core/mods/ModCatalog$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/mods/ModCatalog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    .line 41
    const/4 v0, 0x4

    new-array v1, v0, [Lkotlin/Pair;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "forge"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const-string v3, "fabric"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v2

    const/4 v0, 0x5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "quilt"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, v1, v2

    const/4 v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "neoforge"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/mods/ModCatalog;->CF_LOADERS:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "mirrors"    # Lcom/pymcl/core/download/Mirrors;
    .param p3, "cfKey"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Lcom/pymcl/core/download/Mirrors;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mirrors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cfKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/ModCatalog;->http:Lcom/pymcl/core/net/Http;

    iput-object p2, p0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    iput-object p3, p0, Lcom/pymcl/core/mods/ModCatalog;->cfKey:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic access$getCF_LOADERS$cp()Ljava/util/Map;
    .locals 1

    .line 39
    sget-object v0, Lcom/pymcl/core/mods/ModCatalog;->CF_LOADERS:Ljava/util/Map;

    return-object v0
.end method

.method private final cfHeaders()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 68
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    move-object v1, v0

    .line 239
    .local v1, "$this$cfHeaders_u24lambda_u240":Ljava/util/Map;
    const/4 v2, 0x0

    .line 68
    .local v2, "$i$a$-buildMap-ModCatalog$cfHeaders$1":I
    const-string v3, "Accept"

    const-string v4, "application/json"

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "User-Agent"

    const-string v4, "PyMCL/1.0.1"

    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/pymcl/core/mods/ModCatalog;->cfKey:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    .line 239
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 68
    .local v5, "$i$a$-takeIf-ModCatalog$cfHeaders$1$1":I
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-ModCatalog$cfHeaders$1$1":I
    :goto_0
    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    check-cast v3, Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 239
    .local v3, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 68
    .local v4, "$i$a$-let-ModCatalog$cfHeaders$1$2":I
    const-string v5, "x-api-key"

    invoke-interface {v1, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v1    # "$this$cfHeaders_u24lambda_u240":Ljava/util/Map;
    .end local v2    # "$i$a$-buildMap-ModCatalog$cfHeaders$1":I
    .end local v3    # "it":Ljava/lang/String;
    .end local v4    # "$i$a$-let-ModCatalog$cfHeaders$1$2":I
    :cond_2
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic files$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 141
    and-int/lit8 p5, p4, 0x2

    const-string v0, ""

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/mods/ModCatalog;->files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 71
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const-string p4, "GET"

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    const/4 p5, 0x0

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic install$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 199
    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_1

    move-object p6, v0

    :cond_1
    invoke-virtual/range {p0 .. p7}, Lcom/pymcl/core/mods/ModCatalog;->install(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final install$lambda$2(Lkotlin/jvm/functions/Function1;Lcom/pymcl/core/download/DownloadProgress;)Lkotlin/Unit;
    .locals 1
    .param p0, "$onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p1, "p"    # Lcom/pymcl/core/download/DownloadProgress;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    if-eqz p0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/download/DownloadProgress;->getFraction()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final mrHeaders()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 67
    const/4 v0, 0x2

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "Accept"

    const-string v2, "application/json"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "User-Agent"

    const-string v2, "PyMCL/1.0.1"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic search$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;
    .locals 7

    .line 87
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_0

    const-string p3, "all"

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p7, 0x8

    const-string p8, ""

    if-eqz p3, :cond_1

    move-object v4, p8

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, p7, 0x10

    if-eqz p3, :cond_2

    move-object v5, p8

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p3, p7, 0x20

    if-eqz p3, :cond_3

    const/16 p6, 0x1e

    :cond_3
    move v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/core/mods/ModCatalog;->search(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic searchCurseForge$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 116
    and-int/lit8 p7, p6, 0x4

    const-string v0, ""

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    const/16 p4, 0x1e

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p5, v0

    :cond_2
    invoke-virtual/range {p0 .. p5}, Lcom/pymcl/core/mods/ModCatalog;->searchCurseForge(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic searchModrinth$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;
    .locals 1

    .line 101
    and-int/lit8 p7, p6, 0x4

    const-string v0, ""

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    const/16 p5, 0x1e

    :cond_2
    invoke-virtual/range {p0 .. p5}, Lcom/pymcl/core/mods/ModCatalog;->searchModrinth(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final unzipWorld$lambda$0$0(Ljava/util/zip/ZipEntry;)Ljava/lang/String;
    .locals 4
    .param p0, "it"    # Ljava/util/zip/ZipEntry;

    .line 213
    invoke-virtual {p0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/16 v3, 0x2f

    invoke-static {v0, v3, v1, v2, v1}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final cfClasses(Ljava/util/List;)Ljava/util/Map;
    .locals 14
    .param p1, "modIds"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "modIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    goto/16 :goto_4

    :cond_0
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/core/mods/ModCatalog;

    move-object v2, v1

    .local v2, "$this$cfClasses_u24lambda_u240":Lcom/pymcl/core/mods/ModCatalog;
    const/4 v1, 0x0

    .line 188
    .local v1, "$i$a$-runCatching-ModCatalog$cfClasses$1":I
    iget-object v3, v2, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v3}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v3

    const-string v4, "/mods"

    const-string v6, "POST"

    sget-object v5, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v7, 0x1

    new-array v7, v7, [Lkotlin/Pair;

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v8, 0x0

    aput-object v0, v7, v8

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-static {v5, v0, v8, v7, v9}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v5, 0x1

    invoke-virtual/range {v2 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v3, "data"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 189
    nop

    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 401
    .local v3, "$i$f$associate":I
    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v4

    const/16 v5, 0x10

    invoke-static {v4, v5}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v4

    .line 402
    .local v4, "capacity$iv":I
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v5, Ljava/util/Map;

    .local v5, "destination$iv$iv":Ljava/util/Map;
    move-object v6, v0

    .local v6, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 403
    .local v7, "$i$f$associateTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 404
    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/Map;

    .local v10, "it":Ljava/util/Map;
    const/4 v11, 0x0

    .line 189
    .local v11, "$i$a$-associate-ModCatalog$cfClasses$1$1":I
    const-string v12, "id"

    invoke-static {v10, v12}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_1

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    goto :goto_1

    :cond_1
    const-wide/16 v12, 0x0

    :goto_1
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    const-string v13, "classId"

    invoke-static {v10, v13}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v13, :cond_2

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    goto :goto_2

    :cond_2
    const/4 v13, 0x6

    :goto_2
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 404
    .end local v10    # "it":Ljava/util/Map;
    .end local v11    # "$i$a$-associate-ModCatalog$cfClasses$1$1":I
    invoke-virtual {v12}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v12}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v5, v10, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 406
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .line 402
    .end local v5    # "destination$iv$iv":Ljava/util/Map;
    .end local v6    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$associateTo":I
    nop

    .line 189
    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$associate":I
    .end local v4    # "capacity$iv":I
    nop

    .line 187
    .end local v1    # "$i$a$-runCatching-ModCatalog$cfClasses$1":I
    .end local v2    # "$this$cfClasses_u24lambda_u240":Lcom/pymcl/core/mods/ModCatalog;
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 190
    :goto_3
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v0, v1

    :cond_4
    check-cast v0, Ljava/util/Map;

    :goto_4
    return-object v0
.end method

.method public final cfFile$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;
    .locals 34
    .param p1, "f"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/core/mods/ModFile;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "f"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    const-string v1, "id"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    const-wide/16 v4, 0x0

    .local v4, "fid":J
    :goto_0
    const-string v1, "modId"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    const-wide/16 v6, 0x0

    :goto_1
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    .local v10, "pid":Ljava/lang/String;
    const-string v6, "fileName"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, ""

    if-nez v6, :cond_2

    move-object v11, v7

    goto :goto_2

    :cond_2
    move-object v11, v6

    .line 169
    .local v11, "name":Ljava/lang/String;
    :goto_2
    sget-object v6, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    const-string v8, "gameVersions"

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 364
    .local v12, "$i$f$mapNotNull":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v8

    .local v14, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 373
    .local v15, "$i$f$mapNotNullTo":I
    move-object/from16 v16, v14

    .local v16, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 374
    .local v17, "$i$f$forEach":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_5

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    .local v20, "element$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 373
    .local v21, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "it":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 169
    .local v23, "$i$a$-mapNotNull-ModCatalog$cfFile$1":I
    move-object/from16 v2, v22

    .end local v22    # "it":Ljava/lang/Object;
    .local v2, "it":Ljava/lang/Object;
    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    goto :goto_4

    :cond_3
    move-object v3, v9

    .line 373
    .end local v2    # "it":Ljava/lang/Object;
    .end local v23    # "$i$a$-mapNotNull-ModCatalog$cfFile$1":I
    :goto_4
    if-eqz v3, :cond_4

    .line 375
    .local v3, "it$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 373
    .local v2, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 374
    .end local v2    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v3    # "it$iv$iv":Ljava/lang/Object;
    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_4
    nop

    .end local v19    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_3

    .line 376
    :cond_5
    nop

    .line 377
    .end local v16    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$forEach":I
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapNotNullTo":I
    move-object v2, v13

    check-cast v2, Ljava/util/List;

    .line 364
    nop

    .line 169
    .end local v8    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapNotNull":I
    goto :goto_5

    :cond_6
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_5
    invoke-virtual {v6, v2}, Lcom/pymcl/core/mods/ModCatalog$Companion;->splitCfVersions(Ljava/util/List;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ljava/util/List;

    .local v13, "vers":Ljava/util/List;
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ljava/util/List;

    .line 170
    .local v14, "lds":Ljava/util/List;
    const-string v2, "downloadUrl"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    sget-object v3, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v3, v4, v5, v11, v10}, Lcom/pymcl/core/mods/ModCatalog$Companion;->cfCdnUrls(JLjava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v18

    .line 171
    .local v18, "urls":Ljava/util/List;
    move-object v2, v9

    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v9

    const-string v3, "displayName"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_7

    move-object v12, v11

    goto :goto_6

    :cond_7
    move-object v12, v3

    :goto_6
    const-string v3, "fileDate"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_7

    :cond_8
    move-object v7, v3

    :goto_7
    const/16 v3, 0xa

    invoke-static {v7, v3}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v15

    const-string v3, "fileLength"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    move-wide/from16 v16, v6

    goto :goto_8

    :cond_9
    const-wide/16 v16, 0x0

    .line 172
    :goto_8
    const-string v3, "hashes"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 378
    .local v6, "$i$f$firstOrNull":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/16 v19, 0x0

    if-eqz v8, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv":Ljava/lang/Object;
    move-object v2, v8

    check-cast v2, Ljava/util/Map;

    .local v2, "it":Ljava/util/Map;
    const/16 v22, 0x0

    .line 172
    .local v22, "$i$a$-firstOrNull-ModCatalog$cfFile$2":I
    move-object/from16 v23, v3

    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .local v23, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const-string v3, "algo"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_a

    move-object/from16 v24, v2

    const/4 v2, 0x1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v24, v2

    const/4 v2, 0x1

    .end local v2    # "it":Ljava/util/Map;
    .local v24, "it":Ljava/util/Map;
    if-ne v3, v2, :cond_b

    move v3, v2

    goto :goto_b

    :cond_b
    :goto_a
    move/from16 v3, v19

    .line 378
    .end local v22    # "$i$a$-firstOrNull-ModCatalog$cfFile$2":I
    .end local v24    # "it":Ljava/util/Map;
    :goto_b
    if-eqz v3, :cond_c

    goto :goto_c

    :cond_c
    move-object/from16 v3, v23

    const/4 v2, 0x0

    goto :goto_9

    .line 379
    .end local v8    # "element$iv":Ljava/lang/Object;
    .end local v23    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_d
    move-object/from16 v23, v3

    const/4 v2, 0x1

    .end local v3    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v23    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .end local v6    # "$i$f$firstOrNull":I
    .end local v23    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :goto_c
    check-cast v8, Ljava/util/Map;

    .line 172
    const-string v3, "value"

    invoke-static {v8, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 173
    const-string v6, "dependencies"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 380
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v21, v6

    .local v21, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v22, 0x0

    .line 381
    .local v22, "$i$f$filterTo":I
    invoke-interface/range {v21 .. v21}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v23

    :goto_d
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    move-result v24

    if-eqz v24, :cond_11

    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .local v2, "element$iv$iv":Ljava/lang/Object;
    move-object v0, v2

    check-cast v0, Ljava/util/Map;

    .local v0, "it":Ljava/util/Map;
    const/16 v25, 0x0

    .line 173
    .local v25, "$i$a$-filter-ModCatalog$cfFile$3":I
    move-object/from16 v26, v3

    const-string v3, "relationType"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_e

    move-object/from16 v27, v0

    goto :goto_e

    :cond_e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move-object/from16 v27, v0

    .end local v0    # "it":Ljava/util/Map;
    .local v27, "it":Ljava/util/Map;
    const/4 v0, 0x3

    if-ne v3, v0, :cond_f

    const/4 v0, 0x1

    goto :goto_f

    :cond_f
    :goto_e
    move/from16 v0, v19

    .line 381
    .end local v25    # "$i$a$-filter-ModCatalog$cfFile$3":I
    .end local v27    # "it":Ljava/util/Map;
    :goto_f
    if-eqz v0, :cond_10

    invoke-interface {v8, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_10
    move-object/from16 v0, p1

    move-object/from16 v3, v26

    const/4 v2, 0x1

    goto :goto_d

    .line 382
    .end local v2    # "element$iv$iv":Ljava/lang/Object;
    :cond_11
    move-object/from16 v26, v3

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v21    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v22    # "$i$f$filterTo":I
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 380
    nop

    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 173
    nop

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 383
    .local v2, "$i$f$mapNotNull":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 392
    .local v7, "$i$f$mapNotNullTo":I
    move-object v8, v6

    .local v8, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 393
    .local v19, "$i$f$forEach":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_10
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_14

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .local v22, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v23, v22

    .local v23, "element$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 392
    .local v24, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v25, v0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v25, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    move-object/from16 v0, v23

    check-cast v0, Ljava/util/Map;

    .local v0, "it":Ljava/util/Map;
    const/16 v27, 0x0

    .line 173
    .local v27, "$i$a$-mapNotNull-ModCatalog$cfFile$4":I
    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v28

    if-eqz v28, :cond_12

    check-cast v28, Ljava/lang/Number;

    move-object/from16 v30, v0

    move-object/from16 v29, v1

    .end local v0    # "it":Ljava/util/Map;
    .local v30, "it":Ljava/util/Map;
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 239
    .local v0, "m":J
    const/16 v28, 0x0

    .line 173
    .local v28, "$i$a$-let-ModCatalog$cfFile$4$1":I
    move/from16 v31, v2

    .end local v2    # "$i$f$mapNotNull":I
    .local v31, "$i$f$mapNotNull":I
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v32, v4

    .end local v4    # "fid":J
    .local v32, "fid":J
    const-string v4, "cf:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "m":J
    .end local v28    # "$i$a$-let-ModCatalog$cfFile$4$1":I
    goto :goto_11

    .end local v30    # "it":Ljava/util/Map;
    .end local v31    # "$i$f$mapNotNull":I
    .end local v32    # "fid":J
    .local v0, "it":Ljava/util/Map;
    .restart local v2    # "$i$f$mapNotNull":I
    .restart local v4    # "fid":J
    :cond_12
    move-object/from16 v30, v0

    move-object/from16 v29, v1

    move/from16 v31, v2

    move-wide/from16 v32, v4

    .end local v0    # "it":Ljava/util/Map;
    .end local v2    # "$i$f$mapNotNull":I
    .end local v4    # "fid":J
    .restart local v30    # "it":Ljava/util/Map;
    .restart local v31    # "$i$f$mapNotNull":I
    .restart local v32    # "fid":J
    const/4 v0, 0x0

    .line 392
    .end local v27    # "$i$a$-mapNotNull-ModCatalog$cfFile$4":I
    .end local v30    # "it":Ljava/util/Map;
    :goto_11
    if-eqz v0, :cond_13

    .line 394
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 392
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 393
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v23    # "element$iv$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_13
    move-object/from16 v0, v25

    move-object/from16 v1, v29

    move/from16 v2, v31

    move-wide/from16 v4, v32

    .end local v22    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_10

    .line 395
    .end local v25    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v31    # "$i$f$mapNotNull":I
    .end local v32    # "fid":J
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v2    # "$i$f$mapNotNull":I
    .restart local v4    # "fid":J
    :cond_14
    nop

    .line 396
    .end local v8    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$forEach":I
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapNotNullTo":I
    move-object/from16 v20, v3

    check-cast v20, Ljava/util/List;

    .line 383
    nop

    .line 171
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$mapNotNull":I
    new-instance v8, Lcom/pymcl/core/mods/ModFile;

    move-object/from16 v19, v26

    invoke-direct/range {v8 .. v20}, Lcom/pymcl/core/mods/ModFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-object v8
.end method

.method public final cfFiles(Ljava/util/List;)Ljava/util/List;
    .locals 10
    .param p1, "fileIds"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModFile;",
            ">;"
        }
    .end annotation

    const-string v0, "fileIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 183
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    move-object v2, p0

    goto :goto_1

    .line 184
    :cond_0
    iget-object v1, p0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v3

    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v2, 0x1

    new-array v2, v2, [Lkotlin/Pair;

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v4, 0x0

    aput-object v0, v2, v4

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v5, 0x0

    invoke-static {v1, v0, v4, v2, v5}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v4, "/mods/files"

    const/4 v5, 0x1

    const-string v6, "POST"

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "data"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 397
    .local v1, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 398
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 399
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/util/Map;

    .local v8, "it":Ljava/util/Map;
    const/4 v9, 0x0

    .line 184
    .local v9, "$i$a$-map-ModCatalog$cfFiles$1":I
    invoke-virtual {p0, v8}, Lcom/pymcl/core/mods/ModCatalog;->cfFile$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v8

    .line 399
    .end local v8    # "it":Ljava/util/Map;
    .end local v9    # "$i$a$-map-ModCatalog$cfFiles$1":I
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 400
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 397
    move-object v0, v3

    .line 184
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    :goto_1
    return-object v0
.end method

.method public final cfHit$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModHit;
    .locals 22
    .param p1, "m"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/core/mods/ModHit;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "m"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    const-string v1, "id"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide v4, v2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "cf:"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v1, "name"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v6, ""

    if-nez v4, :cond_1

    move-object v4, v6

    :cond_1
    const-string v7, "authors"

    invoke-static {v0, v7}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    invoke-static {v7, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    move-object v7, v6

    .line 125
    :cond_2
    const-string v8, "downloadCount"

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    :cond_3
    move-wide v8, v2

    const-string v2, "summary"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    move-object v10, v6

    goto :goto_1

    :cond_4
    move-object v10, v2

    :goto_1
    const-string v2, "categories"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 265
    .local v3, "$i$f$mapNotNull":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v2

    .local v12, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 274
    .local v13, "$i$f$mapNotNullTo":I
    move-object v14, v12

    .local v14, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 275
    .local v15, "$i$f$forEach":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .local v17, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "element$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 274
    .local v19, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v20, v2

    .end local v2    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v20, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    move-object/from16 v2, v18

    check-cast v2, Ljava/util/Map;

    .local v2, "it":Ljava/util/Map;
    const/16 v21, 0x0

    .line 125
    .local v21, "$i$a$-mapNotNull-ModCatalog$cfHit$1":I
    invoke-static {v2, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 274
    .end local v2    # "it":Ljava/util/Map;
    .end local v21    # "$i$a$-mapNotNull-ModCatalog$cfHit$1":I
    if-eqz v2, :cond_5

    .line 276
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 274
    .local v21, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v11, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 275
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v18    # "element$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v21    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_5
    move-object/from16 v2, v20

    .end local v17    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_2

    .line 277
    .end local v20    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v2, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_6
    move-object/from16 v20, v2

    .line 278
    .end local v2    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$forEach":I
    .restart local v20    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v11    # "destination$iv$iv":Ljava/util/Collection;
    .end local v12    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapNotNullTo":I
    move-object v1, v11

    check-cast v1, Ljava/util/List;

    .line 265
    nop

    .end local v3    # "$i$f$mapNotNull":I
    .end local v20    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    check-cast v1, Ljava/lang/Iterable;

    .line 125
    const/4 v2, 0x3

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v12

    .line 126
    const-string v1, "logo"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "thumbnailUrl"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    move-object v13, v6

    goto :goto_3

    :cond_7
    move-object v13, v1

    :goto_3
    const-string v1, "links"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "websiteUrl"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    move-object v14, v6

    goto :goto_4

    :cond_8
    move-object v14, v1

    :goto_4
    const-string v1, "slug"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    move-object v15, v6

    goto :goto_5

    :cond_9
    move-object v15, v1

    .line 124
    :goto_5
    move-object v6, v4

    new-instance v4, Lcom/pymcl/core/mods/ModHit;

    const-string v11, "CurseForge"

    invoke-direct/range {v4 .. v15}, Lcom/pymcl/core/mods/ModHit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    return-object v4
.end method

.method public final checkUpdates(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 17
    .param p1, "files"    # Ljava/util/List;
    .param p2, "gameVersion"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModFile;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    const-string v1, "files"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameVersion"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loader"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    return-object v1

    .line 228
    :cond_0
    move-object v1, v6

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 411
    .local v2, "$i$f$associateBy":I
    const/16 v3, 0xa

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    .line 412
    .local v3, "capacity$iv":I
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v4, Ljava/util/Map;

    .local v4, "destination$iv$iv":Ljava/util/Map;
    move-object v5, v1

    .local v5, "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 413
    .local v9, "$i$f$associateByTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x0

    const/4 v13, 0x2

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 414
    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v11

    check-cast v14, Ljava/io/File;

    .local v14, "it":Ljava/io/File;
    const/4 v15, 0x0

    .line 228
    .local v15, "$i$a$-associateBy-ModCatalog$checkUpdates$bySha$1":I
    move-object/from16 v16, v1

    .end local v1    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .local v16, "$this$associateBy$iv":Ljava/lang/Iterable;
    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-static {v1, v14, v12, v13, v12}, Lcom/pymcl/core/util/FileUtil;->hash$default(Lcom/pymcl/core/util/FileUtil;Ljava/io/File;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 414
    .end local v14    # "it":Ljava/io/File;
    .end local v15    # "$i$a$-associateBy-ModCatalog$checkUpdates$bySha$1":I
    invoke-interface {v4, v1, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v16

    goto :goto_0

    .line 416
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .restart local v1    # "$this$associateBy$iv":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v16, v1

    .line 412
    .end local v1    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .end local v4    # "destination$iv$iv":Ljava/util/Map;
    .end local v5    # "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$associateByTo":I
    .restart local v16    # "$this$associateBy$iv":Ljava/lang/Iterable;
    nop

    .line 228
    .end local v2    # "$i$f$associateBy":I
    .end local v3    # "capacity$iv":I
    .end local v16    # "$this$associateBy$iv":Ljava/lang/Iterable;
    move-object v9, v4

    .line 229
    .local v9, "bySha":Ljava/util/Map;
    new-array v1, v13, [Lkotlin/Pair;

    invoke-interface {v9}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const-string v3, "hashes"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "algorithm"

    const-string v4, "sha1"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    .line 230
    .local v10, "body":Ljava/util/Map;
    move-object v1, v7

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "game_versions"

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v10, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    :cond_2
    move-object v1, v8

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "loaders"

    invoke-interface {v10, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    :cond_3
    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-static {v2, v10, v3, v13, v12}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "/version_files/update"

    const/4 v3, 0x0

    const-string v4, "POST"

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    return-object v1

    .line 233
    .local v1, "o":Ljava/util/Map;
    :cond_4
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 234
    .local v2, "out":Ljava/util/LinkedHashMap;
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "sha":Ljava/lang/String;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .local v4, "v":Ljava/lang/Object;
    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/io/File;

    if-nez v11, :cond_6

    goto :goto_1

    .local v11, "f":Ljava/io/File;
    :cond_6
    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v12

    if-nez v12, :cond_7

    :goto_2
    goto :goto_1

    :cond_7
    invoke-virtual {v0, v12}, Lcom/pymcl/core/mods/ModCatalog;->mrVersion$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v12

    if-nez v12, :cond_8

    goto :goto_2

    .local v12, "mf":Lcom/pymcl/core/mods/ModFile;
    :cond_8
    invoke-virtual {v12}, Lcom/pymcl/core/mods/ModFile;->getSha1()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_5

    move-object v13, v2

    check-cast v13, Ljava/util/Map;

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v13, v14, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 235
    .end local v4    # "v":Ljava/lang/Object;
    .end local v5    # "sha":Ljava/lang/String;
    .end local v11    # "f":Ljava/io/File;
    .end local v12    # "mf":Lcom/pymcl/core/mods/ModFile;
    :cond_9
    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    return-object v3
.end method

.method public final file(Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/mods/ModFile;
    .locals 11
    .param p1, "projectId"    # Ljava/lang/String;
    .param p2, "fileId"    # Ljava/lang/String;

    const-string v0, "projectId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fileId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    nop

    .line 178
    sget-object v0, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isMr(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v0}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "/version/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v0}, Lcom/pymcl/core/mods/ModCatalog;->mrVersion$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v4, "\u8be5\u7248\u672c\u6ca1\u6709\u6587\u4ef6"

    invoke-direct {v0, v4, v2, v1, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v4, "\u7248\u672c\u4e0d\u5b58\u5728"

    invoke-direct {v0, v4, v2, v1, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 179
    :cond_2
    move-object v3, p0

    iget-object v0, v3, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v0}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v4

    sget-object v0, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "/mods/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "/files/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    const-string v4, "data"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lcom/pymcl/core/mods/ModCatalog;->cfFile$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v0

    .line 180
    :goto_0
    return-object v0

    .line 179
    :cond_3
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v4, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-direct {v0, v4, v2, v1, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public final files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 21
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "gameVersion"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModFile;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    const-string v1, "id"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameVersion"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "loader"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    nop

    .line 142
    sget-object v1, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v1, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isMr(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "toLowerCase(...)"

    if-eqz v1, :cond_5

    .line 143
    sget-object v1, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v1, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "/project/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/version"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 144
    .local v1, "path":Ljava/lang/String;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v3

    check-cast v11, Ljava/util/List;

    .line 145
    .local v11, "q":Ljava/util/List;
    move-object v3, v9

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    const-string v4, "\"]"

    const-string v5, "[\""

    if-nez v3, :cond_0

    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    sget-object v6, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "game_versions="

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 146
    :cond_0
    move-object v3, v10

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    move-object v3, v11

    check-cast v3, Ljava/util/Collection;

    sget-object v6, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "loaders="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    :cond_1
    move-object v2, v11

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    move-object v12, v11

    check-cast v12, Ljava/lang/Iterable;

    const-string v2, "&"

    move-object v13, v2

    check-cast v13, Ljava/lang/CharSequence;

    const/16 v19, 0x3e

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v12 .. v20}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "?"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    move-object v2, v1

    .line 148
    .end local v1    # "path":Ljava/lang/String;
    .local v2, "path":Ljava/lang/String;
    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 300
    .local v3, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 309
    .local v6, "$i$f$mapNotNullTo":I
    move-object v7, v5

    .local v7, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 310
    .local v12, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    .local v15, "element$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 309
    .local v16, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v17, v1

    .end local v1    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v17, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    move-object v1, v15

    check-cast v1, Ljava/util/Map;

    .local v1, "it":Ljava/util/Map;
    const/16 v18, 0x0

    .line 148
    .local v18, "$i$a$-mapNotNull-ModCatalog$files$1":I
    invoke-virtual {v0, v1}, Lcom/pymcl/core/mods/ModCatalog;->mrVersion$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v1

    .line 309
    .end local v1    # "it":Ljava/util/Map;
    .end local v18    # "$i$a$-mapNotNull-ModCatalog$files$1":I
    if-eqz v1, :cond_3

    .line 311
    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/16 v18, 0x0

    .line 309
    .local v18, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 310
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v15    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v18    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_3
    move-object/from16 v1, v17

    .end local v14    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 312
    .end local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_4
    move-object/from16 v17, v1

    .line 313
    .end local v1    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v7    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEach":I
    .restart local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 300
    nop

    .end local v2    # "path":Ljava/lang/String;
    .end local v3    # "$i$f$mapNotNull":I
    .end local v11    # "q":Ljava/util/List;
    .end local v17    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    goto/16 :goto_3

    .line 150
    :cond_5
    sget-object v1, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v1, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isCf(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 151
    const/4 v1, 0x0

    .local v1, "path":Ljava/lang/Object;
    sget-object v3, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v3, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "/mods/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/files?pageSize=50"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 152
    move-object v3, v9

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    sget-object v3, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v3, v9}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "&gameVersion="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 153
    :cond_6
    sget-object v3, Lcom/pymcl/core/mods/ModCatalog;->CF_LOADERS:Ljava/util/Map;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_7

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 239
    .local v2, "it":I
    const/4 v3, 0x0

    .line 153
    .local v3, "$i$a$-let-ModCatalog$files$2":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "&modLoaderType="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v1

    .end local v2    # "it":I
    .end local v3    # "$i$a$-let-ModCatalog$files$2":I
    goto :goto_1

    :cond_7
    move-object v2, v1

    .line 154
    .end local v1    # "path":Ljava/lang/Object;
    .local v2, "path":Ljava/lang/Object;
    :goto_1
    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "data"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 314
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 315
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 316
    .local v11, "item$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/util/Map;

    .local v12, "it":Ljava/util/Map;
    const/4 v13, 0x0

    .line 154
    .local v13, "$i$a$-map-ModCatalog$files$3":I
    invoke-virtual {v0, v12}, Lcom/pymcl/core/mods/ModCatalog;->cfFile$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;

    move-result-object v12

    .line 316
    .end local v12    # "it":Ljava/util/Map;
    .end local v13    # "$i$a$-map-ModCatalog$files$3":I
    invoke-interface {v4, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 317
    .end local v11    # "item$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 314
    move-object v1, v4

    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "path":Ljava/lang/Object;
    .end local v3    # "$i$f$map":I
    goto :goto_3

    .line 156
    :cond_9
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    .line 157
    :goto_3
    return-object v1
.end method

.method public final getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 12
    .param p1, "bases"    # Ljava/util/List;
    .param p2, "path"    # Ljava/lang/String;
    .param p3, "cf"    # Z
    .param p4, "method"    # Ljava/lang/String;
    .param p5, "body"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p5

    const-string v0, "bases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "method"

    move-object/from16 v3, p4

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    const/4 v0, 0x0

    .line 73
    .local v0, "last":Ljava/lang/Exception;
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v9, v0

    .end local v0    # "last":Ljava/lang/Exception;
    .local v9, "last":Ljava/lang/Exception;
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/lang/String;

    .line 74
    .local v10, "b":Ljava/lang/String;
    nop

    .line 75
    if-eqz p3, :cond_0

    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/core/mods/ModCatalog;->cfHeaders()Ljava/util/Map;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lcom/pymcl/core/mods/ModCatalog;->mrHeaders()Ljava/util/Map;

    move-result-object v0

    :goto_1
    move-object v5, v0

    .line 76
    .local v5, "h":Ljava/util/Map;
    if-nez v1, :cond_1

    iget-object v2, p0, Lcom/pymcl/core/mods/ModCatalog;->http:Lcom/pymcl/core/net/Http;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    const/16 v7, 0x3a98

    invoke-interface/range {v2 .. v7}, Lcom/pymcl/core/net/Http;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    move-object v11, v5

    .end local v5    # "h":Ljava/util/Map;
    .local v11, "h":Ljava/util/Map;
    goto :goto_2

    .end local v11    # "h":Ljava/util/Map;
    .restart local v5    # "h":Ljava/util/Map;
    :cond_1
    move-object v11, v5

    .end local v5    # "h":Ljava/util/Map;
    .restart local v11    # "h":Ljava/util/Map;
    iget-object v2, p0, Lcom/pymcl/core/mods/ModCatalog;->http:Lcom/pymcl/core/net/Http;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v0, "Content-Type"

    const-string v3, "application/json"

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v11, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v6

    const-string v0, "getBytes(...)"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x3a98

    move-object/from16 v3, p4

    invoke-interface/range {v2 .. v7}, Lcom/pymcl/core/net/Http;->request(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BI)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v0

    .line 77
    .local v0, "r":Lcom/pymcl/core/net/HttpResponse;
    :goto_2
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    return-object v2

    .line 78
    :cond_2
    new-instance v2, Lcom/pymcl/core/net/HttpException;

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/core/net/HttpException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Exception;

    move-object v9, v2

    .line 79
    invoke-virtual {v0}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v3, 0x194

    if-ne v2, v3, :cond_3

    goto :goto_3

    :cond_3
    move-object/from16 v3, p4

    goto/16 :goto_0

    .line 80
    .end local v0    # "r":Lcom/pymcl/core/net/HttpResponse;
    .end local v11    # "h":Ljava/util/Map;
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    move-object v9, v0

    move-object/from16 v3, p4

    .end local v0    # "e":Ljava/lang/Exception;
    .end local v10    # "b":Ljava/lang/String;
    goto/16 :goto_0

    .line 82
    :cond_4
    :goto_3
    if-eqz v9, :cond_5

    move-object v0, v9

    check-cast v0, Ljava/lang/Throwable;

    goto :goto_4

    :cond_5
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v2, "\u6ca1\u6709\u53ef\u7528\u7684\u63a5\u53e3\u5730\u5740"

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, v2, v4, v3, v4}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v0, Ljava/lang/Throwable;

    :goto_4
    throw v0
.end method

.method public final install(Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "file"    # Lcom/pymcl/core/mods/ModFile;
    .param p3, "gameDir"    # Ljava/io/File;
    .param p4, "downloads"    # Lcom/pymcl/core/download/DownloadManager;
    .param p5, "world"    # Ljava/lang/String;
    .param p6, "onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p7, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ResKind;",
            "Lcom/pymcl/core/mods/ModFile;",
            "Ljava/io/File;",
            "Lcom/pymcl/core/download/DownloadManager;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p7

    instance-of v5, v4, Lcom/pymcl/core/mods/ModCatalog$install$1;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lcom/pymcl/core/mods/ModCatalog$install$1;

    iget v6, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    const/high16 v7, -0x80000000

    and-int/2addr v6, v7

    if-eqz v6, :cond_0

    iget v6, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    sub-int/2addr v6, v7

    iput v6, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v5, Lcom/pymcl/core/mods/ModCatalog$install$1;

    invoke-direct {v5, v0, v4}, Lcom/pymcl/core/mods/ModCatalog$install$1;-><init>(Lcom/pymcl/core/mods/ModCatalog;Lkotlin/coroutines/Continuation;)V

    .local v5, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v6, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->result:Ljava/lang/Object;

    .local v6, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v7

    .line 199
    iget v8, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    packed-switch v8, :pswitch_data_0

    move-object/from16 v10, p4

    move-object/from16 v15, p6

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v6    # "$result":Ljava/lang/Object;
    new-instance v5, Ljava/lang/IllegalStateException;

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v5, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v5

    .restart local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v6    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v7, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$8:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    .local v7, "dest":Ljava/io/File;
    iget-object v8, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$7:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "name":Ljava/lang/String;
    iget-object v9, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$6:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    .local v9, "dir":Ljava/io/File;
    iget-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$5:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/functions/Function1;

    .end local p6    # "onProgress":Lkotlin/jvm/functions/Function1;
    .local v10, "onProgress":Lkotlin/jvm/functions/Function1;
    iget-object v11, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$4:Ljava/lang/Object;

    move-object v3, v11

    check-cast v3, Ljava/lang/String;

    .end local p5    # "world":Ljava/lang/String;
    .local v3, "world":Ljava/lang/String;
    iget-object v11, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$3:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/core/download/DownloadManager;

    .end local p4    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .local v11, "downloads":Lcom/pymcl/core/download/DownloadManager;
    iget-object v12, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$2:Ljava/lang/Object;

    move-object v2, v12

    check-cast v2, Ljava/io/File;

    .end local p3    # "gameDir":Ljava/io/File;
    .local v2, "gameDir":Ljava/io/File;
    iget-object v12, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$1:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/core/mods/ModFile;

    .end local p2    # "file":Lcom/pymcl/core/mods/ModFile;
    .local v12, "file":Lcom/pymcl/core/mods/ModFile;
    iget-object v13, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$0:Ljava/lang/Object;

    move-object v1, v13

    check-cast v1, Lcom/pymcl/core/mods/ResKind;

    .end local p1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .local v1, "kind":Lcom/pymcl/core/mods/ResKind;
    invoke-static {v6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v15, v10

    move-object v10, v11

    goto/16 :goto_7

    .end local v1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .end local v2    # "gameDir":Ljava/io/File;
    .end local v3    # "world":Ljava/lang/String;
    .end local v7    # "dest":Ljava/io/File;
    .end local v8    # "name":Ljava/lang/String;
    .end local v9    # "dir":Ljava/io/File;
    .end local v10    # "onProgress":Lkotlin/jvm/functions/Function1;
    .end local v11    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .end local v12    # "file":Lcom/pymcl/core/mods/ModFile;
    .restart local p1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .restart local p2    # "file":Lcom/pymcl/core/mods/ModFile;
    .restart local p3    # "gameDir":Ljava/io/File;
    .restart local p4    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .restart local p5    # "world":Ljava/lang/String;
    .restart local p6    # "onProgress":Lkotlin/jvm/functions/Function1;
    :pswitch_1
    invoke-static {v6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 200
    sget-object v8, Lcom/pymcl/core/mods/ResKind;->DATAPACK:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v8, :cond_3

    move-object v8, v3

    check-cast v8, Ljava/lang/CharSequence;

    if-eqz v8, :cond_2

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v8, 0x1

    :goto_2
    if-nez v8, :cond_3

    new-instance v8, Ljava/io/File;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "saves/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "/datapacks"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v8, v2, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v8

    .line 201
    .local v8, "dir":Ljava/io/File;
    :goto_3
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 202
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v11

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v12

    const/4 v13, 0x2

    const/4 v14, 0x0

    if-nez v12, :cond_a

    move-object v15, v11

    check-cast v15, Ljava/lang/String;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/16 v16, 0x2f

    const/16 v17, 0x5f

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v21

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v22, 0x5c

    const/16 v23, 0x5f

    const/16 v24, 0x0

    invoke-static/range {v21 .. v26}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 203
    .local v11, "name":Ljava/lang/String;
    sget-object v12, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v12, :cond_4

    new-instance v12, Ljava/io/File;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, ".pymcl_tmp/"

    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v12, v2, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v8, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_4
    move-object/from16 v19, v12

    .line 204
    .local v19, "dest":Ljava/io/File;
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getUrls()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_9

    .line 205
    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getDisplayName()Ljava/lang/String;

    move-result-object v9

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "\u5b89\u88c5 "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getUrls()Ljava/util/List;

    move-result-object v18

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getSha1()Ljava/lang/String;

    move-result-object v20

    invoke-virtual/range {p2 .. p2}, Lcom/pymcl/core/mods/ModFile;->getSize()J

    move-result-wide v12

    invoke-static {v12, v13}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    move-result-wide v21

    .line 239
    nop

    .local v21, "it":J
    const/4 v13, 0x0

    .line 205
    .local v13, "$i$a$-takeIf-ModCatalog$install$2":I
    const-wide/16 v23, 0x0

    cmp-long v15, v21, v23

    if-lez v15, :cond_5

    const/16 v16, 0x1

    goto :goto_5

    :cond_5
    const/16 v16, 0x0

    .end local v13    # "$i$a$-takeIf-ModCatalog$install$2":I
    .end local v21    # "it":J
    :goto_5
    if-eqz v16, :cond_6

    move-object/from16 v21, v12

    goto :goto_6

    :cond_6
    move-object/from16 v21, v14

    :goto_6
    new-instance v17, Lcom/pymcl/core/download/DownloadItem;

    const/16 v22, 0x0

    const/16 v23, 0x10

    const/16 v24, 0x0

    invoke-direct/range {v17 .. v24}, Lcom/pymcl/core/download/DownloadItem;-><init>(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v12, v19

    .end local v19    # "dest":Ljava/io/File;
    .local v12, "dest":Ljava/io/File;
    invoke-static/range {v17 .. v17}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    new-instance v14, Lcom/pymcl/core/mods/ModCatalog$$ExternalSyntheticLambda1;

    move-object/from16 v15, p6

    invoke-direct {v14, v15}, Lcom/pymcl/core/mods/ModCatalog$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object v1, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$1:Ljava/lang/Object;

    iput-object v2, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$2:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$3:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$4:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$5:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$6:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$7:Ljava/lang/Object;

    iput-object v12, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->L$8:Ljava/lang/Object;

    const/4 v10, 0x1

    iput v10, v5, Lcom/pymcl/core/mods/ModCatalog$install$1;->label:I

    move-object/from16 v10, p4

    invoke-virtual {v10, v9, v13, v14, v5}, Lcom/pymcl/core/download/DownloadManager;->downloadAll(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_7

    .line 199
    return-object v7

    .line 205
    :cond_7
    move-object v9, v8

    move-object v8, v11

    move-object v7, v12

    move-object/from16 v12, p2

    .line 206
    .end local v11    # "name":Ljava/lang/String;
    .end local p1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .end local p2    # "file":Lcom/pymcl/core/mods/ModFile;
    .end local p3    # "gameDir":Ljava/io/File;
    .end local p4    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .end local p5    # "world":Ljava/lang/String;
    .end local p6    # "onProgress":Lkotlin/jvm/functions/Function1;
    .restart local v1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .restart local v2    # "gameDir":Ljava/io/File;
    .restart local v3    # "world":Ljava/lang/String;
    .restart local v7    # "dest":Ljava/io/File;
    .local v8, "name":Ljava/lang/String;
    .restart local v9    # "dir":Ljava/io/File;
    .local v10, "downloads":Lcom/pymcl/core/download/DownloadManager;
    .local v12, "file":Lcom/pymcl/core/mods/ModFile;
    .local v15, "onProgress":Lkotlin/jvm/functions/Function1;
    :goto_7
    sget-object v11, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    if-ne v1, v11, :cond_8

    new-instance v11, Ljava/io/File;

    const-string v13, "saves"

    invoke-direct {v11, v2, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v7, v11}, Lcom/pymcl/core/mods/ModCatalog;->unzipWorld(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v11

    .local v11, "out":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    return-object v11

    .line 207
    .end local v11    # "out":Ljava/io/File;
    :cond_8
    return-object v7

    .line 204
    .end local v1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .end local v2    # "gameDir":Ljava/io/File;
    .end local v3    # "world":Ljava/lang/String;
    .end local v7    # "dest":Ljava/io/File;
    .end local v9    # "dir":Ljava/io/File;
    .end local v10    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .end local v12    # "file":Lcom/pymcl/core/mods/ModFile;
    .end local v15    # "onProgress":Lkotlin/jvm/functions/Function1;
    .local v8, "dir":Ljava/io/File;
    .local v11, "name":Ljava/lang/String;
    .restart local v19    # "dest":Ljava/io/File;
    .restart local p1    # "kind":Lcom/pymcl/core/mods/ResKind;
    .restart local p2    # "file":Lcom/pymcl/core/mods/ModFile;
    .restart local p3    # "gameDir":Ljava/io/File;
    .restart local p4    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .restart local p5    # "world":Ljava/lang/String;
    .restart local p6    # "onProgress":Lkotlin/jvm/functions/Function1;
    :cond_9
    new-instance v7, Lcom/pymcl/core/loader/InstallError;

    const-string v9, "\u8be5\u6587\u4ef6\u4e0d\u5141\u8bb8\u7b2c\u4e09\u65b9\u4e0b\u8f7d\uff08\u4f5c\u8005\u5173\u95ed\u4e86\u5206\u53d1\uff09"

    invoke-direct {v7, v9, v14, v13, v14}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v7

    .line 239
    .end local v11    # "name":Ljava/lang/String;
    .end local v19    # "dest":Ljava/io/File;
    :cond_a
    move-object/from16 v10, p4

    move-object/from16 v15, p6

    const/4 v7, 0x0

    .line 202
    .local v7, "$i$a$-ifBlank-ModCatalog$install$name$1":I
    new-instance v9, Lcom/pymcl/core/loader/InstallError;

    const-string v11, "\u6587\u4ef6\u540d\u4e3a\u7a7a"

    invoke-direct {v9, v11, v14, v13, v14}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final mrVersion$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModFile;
    .locals 31
    .param p1, "v"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/core/mods/ModFile;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "v"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    const-string v1, "files"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    .local v1, "fs":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 318
    .local v3, "$i$f$firstOrNull":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v7, v5

    check-cast v7, Ljava/util/Map;

    .local v7, "it":Ljava/util/Map;
    const/4 v8, 0x0

    .line 160
    .local v8, "$i$a$-firstOrNull-ModCatalog$mrVersion$f$1":I
    const-string v9, "primary"

    invoke-static {v7, v9}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v10, 0x1

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 318
    .end local v7    # "it":Ljava/util/Map;
    .end local v8    # "$i$a$-firstOrNull-ModCatalog$mrVersion$f$1":I
    if-eqz v7, :cond_0

    goto :goto_0

    .line 319
    .end local v5    # "element$iv":Ljava/lang/Object;
    :cond_1
    move-object v5, v6

    .line 160
    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/util/Map;

    if-nez v5, :cond_2

    return-object v6

    .line 161
    .local v5, "f":Ljava/util/Map;
    :cond_2
    const-string v2, "id"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_3

    move-object v8, v3

    goto :goto_1

    :cond_3
    move-object v8, v2

    :goto_1
    const-string v2, "project_id"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    move-object v9, v3

    goto :goto_2

    :cond_4
    move-object v9, v4

    :goto_2
    const-string v4, "filename"

    invoke-static {v5, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    move-object v10, v3

    goto :goto_3

    :cond_5
    move-object v10, v4

    :goto_3
    const-string v4, "name"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    const-string v4, "version_number"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    move-object v11, v3

    goto :goto_4

    :cond_6
    move-object v11, v4

    .line 162
    :goto_4
    const-string v4, "game_versions"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_a

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 320
    .local v7, "$i$f$mapNotNull":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v4

    .local v13, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 329
    .local v14, "$i$f$mapNotNullTo":I
    move-object v15, v13

    .local v15, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 330
    .local v16, "$i$f$forEach":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_9

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .local v18, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    .local v19, "element$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .line 329
    .local v20, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v21, v19

    .local v21, "it":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 162
    .local v22, "$i$a$-mapNotNull-ModCatalog$mrVersion$1":I
    move-object/from16 v6, v21

    move-object/from16 v21, v1

    .end local v1    # "fs":Ljava/util/List;
    .local v6, "it":Ljava/lang/Object;
    .local v21, "fs":Ljava/util/List;
    instance-of v1, v6, Ljava/lang/String;

    if-eqz v1, :cond_7

    move-object v1, v6

    check-cast v1, Ljava/lang/String;

    goto :goto_6

    :cond_7
    const/4 v1, 0x0

    .line 329
    .end local v6    # "it":Ljava/lang/Object;
    .end local v22    # "$i$a$-mapNotNull-ModCatalog$mrVersion$1":I
    :goto_6
    if-eqz v1, :cond_8

    .line 331
    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 329
    .local v6, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 330
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v19    # "element$iv$iv":Ljava/lang/Object;
    .end local v20    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_8
    move-object/from16 v1, v21

    const/4 v6, 0x0

    .end local v18    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_5

    .line 332
    .end local v21    # "fs":Ljava/util/List;
    .local v1, "fs":Ljava/util/List;
    :cond_9
    move-object/from16 v21, v1

    .line 333
    .end local v1    # "fs":Ljava/util/List;
    .end local v15    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$forEach":I
    .restart local v21    # "fs":Ljava/util/List;
    nop

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapNotNullTo":I
    move-object v1, v12

    check-cast v1, Ljava/util/List;

    .line 320
    nop

    .line 162
    .end local v4    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapNotNull":I
    goto :goto_7

    .end local v21    # "fs":Ljava/util/List;
    .restart local v1    # "fs":Ljava/util/List;
    :cond_a
    move-object/from16 v21, v1

    .end local v1    # "fs":Ljava/util/List;
    .restart local v21    # "fs":Ljava/util/List;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :goto_7
    move-object v12, v1

    const-string v1, "loaders"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_e

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 334
    .local v4, "$i$f$mapNotNull":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 343
    .local v13, "$i$f$mapNotNullTo":I
    move-object v14, v7

    .local v14, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 344
    .local v15, "$i$f$forEach":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_8
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_d

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .local v17, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v18, v17

    .local v18, "element$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 343
    .local v19, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v20, v18

    .local v20, "it":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 162
    .local v22, "$i$a$-mapNotNull-ModCatalog$mrVersion$2":I
    move-object/from16 v23, v1

    move-object/from16 v1, v20

    move-object/from16 v20, v3

    .end local v20    # "it":Ljava/lang/Object;
    .local v1, "it":Ljava/lang/Object;
    .local v23, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_b

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    goto :goto_9

    :cond_b
    const/4 v3, 0x0

    .line 343
    .end local v1    # "it":Ljava/lang/Object;
    .end local v22    # "$i$a$-mapNotNull-ModCatalog$mrVersion$2":I
    :goto_9
    if-eqz v3, :cond_c

    .line 331
    .local v3, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 343
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 344
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v3    # "it$iv$iv":Ljava/lang/Object;
    .end local v18    # "element$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_c
    move-object/from16 v3, v20

    move-object/from16 v1, v23

    .end local v17    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 345
    .end local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_d
    move-object/from16 v23, v1

    move-object/from16 v20, v3

    .line 346
    .end local v1    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$forEach":I
    .restart local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapNotNullTo":I
    move-object v1, v6

    check-cast v1, Ljava/util/List;

    .line 334
    nop

    .line 162
    .end local v4    # "$i$f$mapNotNull":I
    .end local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    goto :goto_a

    :cond_e
    move-object/from16 v20, v3

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :goto_a
    move-object v13, v1

    .line 163
    const-string v1, "date_published"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_f

    move-object/from16 v3, v20

    goto :goto_b

    :cond_f
    move-object v3, v1

    :goto_b
    const/16 v1, 0xa

    invoke-static {v3, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v14

    const-string v1, "size"

    invoke-static {v5, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_c

    :cond_10
    const-wide/16 v3, 0x0

    :goto_c
    move-wide v15, v3

    const-string v1, "url"

    invoke-static {v5, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-string v1, "hashes"

    invoke-static {v5, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "sha1"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    .line 164
    const-string v1, "dependencies"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 347
    .local v3, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 348
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_d
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_12

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v1

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v0, "element$iv$iv":Ljava/lang/Object;
    .local v20, "$this$filter$iv":Ljava/lang/Iterable;
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    .local v1, "it":Ljava/util/Map;
    const/16 v22, 0x0

    .line 164
    .local v22, "$i$a$-filter-ModCatalog$mrVersion$3":I
    move/from16 v23, v3

    .end local v3    # "$i$f$filter":I
    .local v23, "$i$f$filter":I
    const-string v3, "dependency_type"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v24, v1

    .end local v1    # "it":Ljava/util/Map;
    .local v24, "it":Ljava/util/Map;
    const-string v1, "required"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 348
    .end local v22    # "$i$a$-filter-ModCatalog$mrVersion$3":I
    .end local v24    # "it":Ljava/util/Map;
    if-eqz v1, :cond_11

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_11
    move-object/from16 v0, p1

    move-object/from16 v1, v20

    move/from16 v3, v23

    goto :goto_d

    .line 349
    .end local v0    # "element$iv$iv":Ljava/lang/Object;
    .end local v20    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$filter":I
    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$filter":I
    :cond_12
    move-object/from16 v20, v1

    move/from16 v23, v3

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    .restart local v20    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v23    # "$i$f$filter":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 347
    nop

    .end local v20    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v23    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 164
    nop

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 350
    .local v1, "$i$f$mapNotNull":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 359
    .local v6, "$i$f$mapNotNullTo":I
    move-object v7, v4

    .local v7, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 360
    .local v19, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_e
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_15

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .local v22, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v23, v22

    .local v23, "element$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 359
    .local v24, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v25, v0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v25, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    move-object/from16 v0, v23

    check-cast v0, Ljava/util/Map;

    .local v0, "it":Ljava/util/Map;
    const/16 v26, 0x0

    .line 164
    .local v26, "$i$a$-mapNotNull-ModCatalog$mrVersion$4":I
    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v27

    if-eqz v27, :cond_13

    move-object/from16 v28, v27

    .line 239
    .local v28, "p":Ljava/lang/String;
    const/16 v27, 0x0

    .line 164
    .local v27, "$i$a$-let-ModCatalog$mrVersion$4$1":I
    move-object/from16 v29, v0

    .end local v0    # "it":Ljava/util/Map;
    .local v29, "it":Ljava/util/Map;
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v30, v1

    .end local v1    # "$i$f$mapNotNull":I
    .local v30, "$i$f$mapNotNull":I
    const-string v1, "mr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v28

    .end local v28    # "p":Ljava/lang/String;
    .local v1, "p":Ljava/lang/String;
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v1    # "p":Ljava/lang/String;
    .end local v27    # "$i$a$-let-ModCatalog$mrVersion$4$1":I
    goto :goto_f

    .end local v29    # "it":Ljava/util/Map;
    .end local v30    # "$i$f$mapNotNull":I
    .restart local v0    # "it":Ljava/util/Map;
    .local v1, "$i$f$mapNotNull":I
    :cond_13
    move-object/from16 v29, v0

    move/from16 v30, v1

    .end local v0    # "it":Ljava/util/Map;
    .end local v1    # "$i$f$mapNotNull":I
    .restart local v29    # "it":Ljava/util/Map;
    .restart local v30    # "$i$f$mapNotNull":I
    const/4 v0, 0x0

    .line 359
    .end local v26    # "$i$a$-mapNotNull-ModCatalog$mrVersion$4":I
    .end local v29    # "it":Ljava/util/Map;
    :goto_f
    if-eqz v0, :cond_14

    .line 361
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 359
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 360
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v23    # "element$iv$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_14
    move-object/from16 v0, v25

    move/from16 v1, v30

    .end local v22    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_e

    .line 362
    .end local v25    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v30    # "$i$f$mapNotNull":I
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v1, "$i$f$mapNotNull":I
    :cond_15
    nop

    .line 363
    .end local v7    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$forEach":I
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object/from16 v19, v3

    check-cast v19, Ljava/util/List;

    .line 350
    nop

    .line 161
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull":I
    new-instance v7, Lcom/pymcl/core/mods/ModFile;

    invoke-direct/range {v7 .. v19}, Lcom/pymcl/core/mods/ModFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;JLjava/util/List;Ljava/lang/String;Ljava/util/List;)V

    return-object v7
.end method

.method public final project(Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;
    .locals 25
    .param p1, "id"    # Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v8, p1

    const-string v9, "id"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    nop

    .line 133
    sget-object v1, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v1, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isMr(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v2, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "/project/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_b

    .local v1, "p":Ljava/util/Map;
    const/4 v2, 0x0

    .line 134
    .local v2, "$i$a$-let-ModCatalog$project$1":I
    invoke-static {v1, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    sget-object v3, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v3, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "mr:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const-string v3, "title"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    if-nez v3, :cond_1

    move-object v13, v4

    goto :goto_0

    :cond_1
    move-object v13, v3

    :goto_0
    const-string v3, "downloads"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    goto :goto_1

    :cond_2
    const-wide/16 v5, 0x0

    :goto_1
    move-wide v15, v5

    const-string v3, "description"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    move-object/from16 v17, v4

    goto :goto_2

    :cond_3
    move-object/from16 v17, v3

    .line 135
    :goto_2
    const-string v3, "categories"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_7

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 286
    .local v5, "$i$f$mapNotNull":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 295
    .local v9, "$i$f$mapNotNullTo":I
    move-object v11, v7

    .local v11, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 296
    .local v14, "$i$f$forEach":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_3
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_6

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    .local v20, "element$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 295
    .local v21, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "it":Ljava/lang/Object;
    const/16 v23, 0x0

    .line 135
    .local v23, "$i$a$-mapNotNull-ModCatalog$project$1$1":I
    move/from16 v24, v2

    move-object/from16 v10, v22

    .end local v2    # "$i$a$-let-ModCatalog$project$1":I
    .end local v22    # "it":Ljava/lang/Object;
    .local v10, "it":Ljava/lang/Object;
    .local v24, "$i$a$-let-ModCatalog$project$1":I
    instance-of v2, v10, Ljava/lang/String;

    if-eqz v2, :cond_4

    move-object v2, v10

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    .line 295
    .end local v10    # "it":Ljava/lang/Object;
    .end local v23    # "$i$a$-mapNotNull-ModCatalog$project$1$1":I
    :goto_4
    if-eqz v2, :cond_5

    .line 297
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 295
    .local v10, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 296
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_5
    move/from16 v2, v24

    .end local v19    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_3

    .line 298
    .end local v24    # "$i$a$-let-ModCatalog$project$1":I
    .local v2, "$i$a$-let-ModCatalog$project$1":I
    :cond_6
    move/from16 v24, v2

    .line 299
    .end local v2    # "$i$a$-let-ModCatalog$project$1":I
    .end local v11    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$forEach":I
    .restart local v24    # "$i$a$-let-ModCatalog$project$1":I
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$mapNotNullTo":I
    move-object v2, v6

    check-cast v2, Ljava/util/List;

    .line 286
    nop

    .line 135
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNull":I
    goto :goto_5

    .end local v24    # "$i$a$-let-ModCatalog$project$1":I
    .restart local v2    # "$i$a$-let-ModCatalog$project$1":I
    :cond_7
    move/from16 v24, v2

    .end local v2    # "$i$a$-let-ModCatalog$project$1":I
    .restart local v24    # "$i$a$-let-ModCatalog$project$1":I
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_5
    move-object/from16 v19, v2

    const-string v2, "icon_url"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_8

    move-object/from16 v20, v4

    goto :goto_6

    :cond_8
    move-object/from16 v20, v2

    :goto_6
    const-string v2, "project_type"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_9

    const-string v2, "mod"

    :cond_9
    const-string v3, "slug"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "https://modrinth.com/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, "/"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_a

    move-object/from16 v22, v4

    goto :goto_7

    :cond_a
    move-object/from16 v22, v2

    .line 134
    :goto_7
    new-instance v11, Lcom/pymcl/core/mods/ModHit;

    const-string v14, ""

    const-string v18, "Modrinth"

    invoke-direct/range {v11 .. v22}, Lcom/pymcl/core/mods/ModHit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    nop

    .line 133
    .end local v1    # "p":Ljava/util/Map;
    .end local v24    # "$i$a$-let-ModCatalog$project$1":I
    move-object v10, v11

    goto :goto_8

    :cond_b
    const/4 v10, 0x0

    goto :goto_8

    .line 136
    :cond_c
    sget-object v1, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v1, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isCf(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v2, v8}, Lcom/pymcl/core/mods/ModCatalog$Companion;->raw(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "/mods/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "data"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 239
    .local v1, "it":Ljava/util/Map;
    const/4 v2, 0x0

    .line 136
    .local v2, "$i$a$-let-ModCatalog$project$2":I
    invoke-virtual {v0, v1}, Lcom/pymcl/core/mods/ModCatalog;->cfHit$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v10

    .end local v1    # "it":Ljava/util/Map;
    .end local v2    # "$i$a$-let-ModCatalog$project$2":I
    goto :goto_8

    :cond_d
    const/4 v10, 0x0

    goto :goto_8

    .line 137
    :cond_e
    const/4 v10, 0x0

    .line 138
    :goto_8
    return-object v10
.end method

.method public final resolveCfSlug(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;
    .locals 15
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "slug"    # Ljava/lang/String;

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    const-string v0, "kind"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "slug"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v3, ""

    const/4 v4, 0x0

    const/4 v5, 0x5

    move-object v1, p0

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lcom/pymcl/core/mods/ModCatalog;->searchCurseForge$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v8, v2

    move-object v5, v6

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 279
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v9, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/core/mods/ModHit;

    .local v4, "it":Lcom/pymcl/core/mods/ModHit;
    const/4 v6, 0x0

    .line 129
    .local v6, "$i$a$-firstOrNull-ModCatalog$resolveCfSlug$1":I
    invoke-virtual {v4}, Lcom/pymcl/core/mods/ModHit;->getSlug()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 279
    .end local v4    # "it":Lcom/pymcl/core/mods/ModHit;
    .end local v6    # "$i$a$-firstOrNull-ModCatalog$resolveCfSlug$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 280
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    move-object v3, v9

    .line 129
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/pymcl/core/mods/ModHit;

    if-nez v3, :cond_9

    .line 130
    invoke-static {}, Lcom/pymcl/core/mods/ResKind;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 281
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 282
    .local v4, "$i$f$filterTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v7

    check-cast v10, Lcom/pymcl/core/mods/ResKind;

    .local v10, "it":Lcom/pymcl/core/mods/ResKind;
    const/4 v11, 0x0

    .line 130
    .local v11, "$i$a$-filter-ModCatalog$resolveCfSlug$2":I
    if-eq v10, v8, :cond_3

    const/4 v12, 0x1

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    .line 282
    .end local v10    # "it":Lcom/pymcl/core/mods/ResKind;
    .end local v11    # "$i$a$-filter-ModCatalog$resolveCfSlug$2":I
    :goto_2
    if-eqz v12, :cond_2

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 283
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 281
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter":I
    check-cast v2, Ljava/lang/Iterable;

    .line 130
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/pymcl/core/mods/ResKind;

    .line 239
    .local v1, "k":Lcom/pymcl/core/mods/ResKind;
    const/4 v11, 0x0

    .line 130
    .local v11, "$i$a$-firstNotNullOfOrNull-ModCatalog$resolveCfSlug$3":I
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/mods/ModCatalog;

    .line 239
    .local v0, "$this$resolveCfSlug_u24lambda_u242_u240":Lcom/pymcl/core/mods/ModCatalog;
    const/4 v12, 0x0

    .line 130
    .local v12, "$i$a$-runCatching-ModCatalog$resolveCfSlug$3$1":I
    const-string v2, ""

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->searchCurseForge$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 284
    .local v3, "$i$f$firstOrNull":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/mods/ModHit;

    .local v7, "it":Lcom/pymcl/core/mods/ModHit;
    const/4 v13, 0x0

    .line 130
    .local v13, "$i$a$-firstOrNull-ModCatalog$resolveCfSlug$3$1$1":I
    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getSlug()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    .line 284
    .end local v7    # "it":Lcom/pymcl/core/mods/ModHit;
    .end local v13    # "$i$a$-firstOrNull-ModCatalog$resolveCfSlug$3$1$1":I
    if-eqz v14, :cond_6

    goto :goto_3

    .line 285
    .end local v6    # "element$iv":Ljava/lang/Object;
    :cond_7
    move-object v6, v9

    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull":I
    :goto_3
    check-cast v6, Lcom/pymcl/core/mods/ModHit;

    .line 130
    nop

    .end local v0    # "$this$resolveCfSlug_u24lambda_u242_u240":Lcom/pymcl/core/mods/ModCatalog;
    .end local v12    # "$i$a$-runCatching-ModCatalog$resolveCfSlug$3$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object v0, v9

    :cond_8
    check-cast v0, Lcom/pymcl/core/mods/ModHit;

    .end local v1    # "k":Lcom/pymcl/core/mods/ResKind;
    .end local v11    # "$i$a$-firstNotNullOfOrNull-ModCatalog$resolveCfSlug$3":I
    if-eqz v0, :cond_5

    move-object v9, v0

    goto :goto_5

    .line 129
    :cond_9
    move-object v9, v3

    .line 130
    :cond_a
    :goto_5
    return-object v9
.end method

.method public final search(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 16
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "source"    # Ljava/lang/String;
    .param p4, "gameVersion"    # Ljava/lang/String;
    .param p5, "category"    # Ljava/lang/String;
    .param p6, "limit"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ResKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModHit;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p3

    const-string v0, "kind"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameVersion"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toLowerCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v10, v0

    .line 89
    .local v10, "s":Ljava/lang/String;
    invoke-virtual {v3}, Lcom/pymcl/core/mods/ResKind;->getMrType()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\u5168\u90e8"

    const-string v7, "all"

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v0, :cond_1

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "modrinth"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    move v0, v9

    goto :goto_0

    :cond_1
    move v0, v8

    :goto_0
    move v11, v0

    .line 90
    .local v11, "useMr":Z
    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "curseforge"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    move v8, v9

    :cond_3
    move v12, v8

    .line 91
    .local v12, "useCf":Z
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    .local v13, "errs":Ljava/util/List;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v14, v0

    check-cast v14, Ljava/util/List;

    .local v14, "mr":Ljava/util/List;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v15, v0

    check-cast v15, Ljava/util/List;

    .line 92
    .local v15, "cf":Ljava/util/List;
    if-eqz v11, :cond_4

    :try_start_0
    move-object v0, v14

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v2, p0

    move/from16 v7, p6

    invoke-virtual/range {v2 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->searchModrinth(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v0, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    move-object v2, v13

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_4
    :goto_1
    if-eqz v12, :cond_5

    :try_start_1
    move-object v0, v15

    check-cast v0, Ljava/util/Collection;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-static/range {v2 .. v9}, Lcom/pymcl/core/mods/ModCatalog;->searchCurseForge$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v0, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .restart local v0    # "e":Ljava/lang/Exception;
    move-object v2, v13

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    .end local v0    # "e":Ljava/lang/Exception;
    :cond_5
    :goto_2
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    .line 96
    :cond_7
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    .local v0, "out":Ljava/util/List;
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 97
    .local v2, "n":I
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_4
    if-ge v3, v2, :cond_a

    invoke-static {v14, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pymcl/core/mods/ModHit;

    if-eqz v4, :cond_8

    .line 239
    .local v4, "it":Lcom/pymcl/core/mods/ModHit;
    const/4 v5, 0x0

    .line 97
    .local v5, "$i$a$-let-ModCatalog$search$1":I
    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v4    # "it":Lcom/pymcl/core/mods/ModHit;
    .end local v5    # "$i$a$-let-ModCatalog$search$1":I
    :cond_8
    invoke-static {v15, v3}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/pymcl/core/mods/ModHit;

    if-eqz v4, :cond_9

    .line 239
    .restart local v4    # "it":Lcom/pymcl/core/mods/ModHit;
    const/4 v5, 0x0

    .line 97
    .local v5, "$i$a$-let-ModCatalog$search$2":I
    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v4    # "it":Lcom/pymcl/core/mods/ModHit;
    .end local v5    # "$i$a$-let-ModCatalog$search$2":I
    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 98
    .end local v3    # "i":I
    :cond_a
    return-object v0
.end method

.method public final searchCurseForge(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/util/List;
    .locals 17
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "gameVersion"    # Ljava/lang/String;
    .param p4, "limit"    # I
    .param p5, "slug"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ResKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModHit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    const-string v1, "kind"

    move-object/from16 v11, p1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "query"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameVersion"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "slug"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v11}, Lcom/pymcl/core/mods/ResKind;->getCfClass()I

    move-result v1

    const/16 v2, 0x32

    move/from16 v12, p4

    invoke-static {v12, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v2

    sget-object v3, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v3, v8}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "/mods/search?gameId=432&classId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v4, "&sortField=2&sortOrder=desc&pageSize="

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "&index=0&searchFilter="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 118
    .local v1, "path":Ljava/lang/String;
    move-object v2, v9

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v2, v9}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&gameVersion="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 119
    :cond_0
    move-object v2, v10

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    sget-object v2, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v2, v10}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&slug="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    move-object v2, v1

    .line 120
    .end local v1    # "path":Ljava/lang/String;
    .local v2, "path":Ljava/lang/String;
    iget-object v1, v0, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v1

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    .line 121
    .local v1, "o":Ljava/util/Map;
    const-string v3, "data"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 261
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 262
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 263
    .local v14, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/util/Map;

    .local v15, "it":Ljava/util/Map;
    const/16 v16, 0x0

    .line 121
    .local v16, "$i$a$-map-ModCatalog$searchCurseForge$1":I
    invoke-virtual {v0, v15}, Lcom/pymcl/core/mods/ModCatalog;->cfHit$PyMCL_Android_core(Ljava/util/Map;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v15

    .line 263
    .end local v15    # "it":Ljava/util/Map;
    .end local v16    # "$i$a$-map-ModCatalog$searchCurseForge$1":I
    invoke-interface {v5, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 264
    .end local v14    # "item$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 261
    nop

    .line 121
    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    return-object v5
.end method

.method public final searchModrinth(Lcom/pymcl/core/mods/ResKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 38
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "gameVersion"    # Ljava/lang/String;
    .param p4, "category"    # Ljava/lang/String;
    .param p5, "limit"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ResKind;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModHit;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    const-string v3, "kind"

    move-object/from16 v4, p1

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "query"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "gameVersion"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "category"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    invoke-virtual {v4}, Lcom/pymcl/core/mods/ResKind;->getMrType()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "[\"project_type:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\"]"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    aput-object v5, v3, v7

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 103
    .local v3, "facets":Ljava/util/List;
    move-object v5, v1

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[\"versions:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_0
    move-object v5, v2

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "[\"categories:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 105
    :cond_1
    move-object v5, v0

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    const-string v6, "downloads"

    if-eqz v5, :cond_2

    move-object v5, v6

    goto :goto_0

    :cond_2
    const-string v5, "relevance"

    .line 106
    .local v5, "index":Ljava/lang/String;
    :goto_0
    sget-object v7, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v7, v0}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    move-object v9, v3

    check-cast v9, Ljava/lang/Iterable;

    const-string v10, ","

    check-cast v10, Ljava/lang/CharSequence;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "["

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "]"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "/search?query="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, "&facets="

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "&limit="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    move/from16 v8, p5

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, "&index="

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 107
    .local v11, "path":Ljava/lang/String;
    move-object/from16 v9, p0

    iget-object v7, v9, Lcom/pymcl/core/mods/ModCatalog;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v7}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v10

    const/16 v15, 0x18

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v9 .. v16}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    .line 108
    .local v7, "o":Ljava/util/Map;
    const-string v9, "hits"

    invoke-static {v7, v9}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 240
    .local v10, "$i$f$map":I
    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v9, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v9

    .local v13, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 241
    .local v14, "$i$f$mapTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_14

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 242
    .local v16, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v16

    check-cast v0, Ljava/util/Map;

    .local v0, "h":Ljava/util/Map;
    const/16 v17, 0x0

    .line 109
    .local v17, "$i$a$-map-ModCatalog$searchModrinth$1":I
    const-string v1, "project_type"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    invoke-virtual {v4}, Lcom/pymcl/core/mods/ResKind;->getMrType()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "mod"

    .line 110
    .local v1, "type":Ljava/lang/String;
    :cond_3
    const-string v2, "project_id"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    const-string v19, ""

    move-object/from16 v20, v3

    if-nez v18, :cond_4

    move-object/from16 v3, v19

    goto :goto_2

    :cond_4
    move-object/from16 v3, v18

    .end local v3    # "facets":Ljava/util/List;
    .local v20, "facets":Ljava/util/List;
    :goto_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v18, v5

    .end local v5    # "index":Ljava/lang/String;
    .local v18, "index":Ljava/lang/String;
    const-string v5, "mr:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    const-string v3, "title"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_5

    move-object/from16 v23, v19

    goto :goto_3

    :cond_5
    move-object/from16 v23, v3

    :goto_3
    const-string v3, "author"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    move-object/from16 v24, v19

    goto :goto_4

    :cond_6
    move-object/from16 v24, v3

    :goto_4
    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_5

    :cond_7
    const-wide/16 v3, 0x0

    :goto_5
    move-wide/from16 v25, v3

    const-string v3, "description"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_8

    move-object/from16 v27, v19

    goto :goto_6

    :cond_8
    move-object/from16 v27, v3

    .line 111
    :goto_6
    const-string v3, "display_categories"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_c

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 243
    .local v5, "$i$f$mapNotNull":I
    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    check-cast v21, Ljava/util/Collection;

    .local v21, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v28, v3

    .local v28, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    move-object/from16 v29, v21

    .end local v21    # "destination$iv$iv":Ljava/util/Collection;
    .local v29, "destination$iv$iv":Ljava/util/Collection;
    const/16 v21, 0x0

    .line 252
    .local v21, "$i$f$mapNotNullTo":I
    move-object/from16 v30, v28

    .local v30, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v31, 0x0

    .line 253
    .local v31, "$i$f$forEach":I
    invoke-interface/range {v30 .. v30}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v32

    :goto_7
    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_b

    invoke-interface/range {v32 .. v32}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    .local v33, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v34, v33

    .local v34, "element$iv$iv":Ljava/lang/Object;
    const/16 v35, 0x0

    .line 252
    .local v35, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v36, v34

    .local v36, "it":Ljava/lang/Object;
    const/16 v37, 0x0

    .line 111
    .local v37, "$i$a$-mapNotNull-ModCatalog$searchModrinth$1$1":I
    move-object/from16 v4, v36

    move-object/from16 v36, v3

    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v4, "it":Ljava/lang/Object;
    .local v36, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    instance-of v3, v4, Ljava/lang/String;

    if-eqz v3, :cond_9

    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    goto :goto_8

    :cond_9
    const/4 v3, 0x0

    .line 252
    .end local v4    # "it":Ljava/lang/Object;
    .end local v37    # "$i$a$-mapNotNull-ModCatalog$searchModrinth$1$1":I
    :goto_8
    if-eqz v3, :cond_a

    .line 254
    .local v3, "it$iv$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 252
    .local v4, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    move/from16 v37, v4

    move-object/from16 v4, v29

    .end local v29    # "destination$iv$iv":Ljava/util/Collection;
    .local v4, "destination$iv$iv":Ljava/util/Collection;
    .local v37, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v3    # "it$iv$iv":Ljava/lang/Object;
    .end local v37    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    goto :goto_9

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .restart local v29    # "destination$iv$iv":Ljava/util/Collection;
    :cond_a
    move-object/from16 v4, v29

    .line 253
    .end local v29    # "destination$iv$iv":Ljava/util/Collection;
    .end local v34    # "element$iv$iv":Ljava/lang/Object;
    .end local v35    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    :goto_9
    move-object/from16 v29, v4

    move-object/from16 v3, v36

    .end local v33    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_7

    .line 255
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v36    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v29    # "destination$iv$iv":Ljava/util/Collection;
    :cond_b
    move-object/from16 v36, v3

    move-object/from16 v4, v29

    .line 256
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v29    # "destination$iv$iv":Ljava/util/Collection;
    .end local v30    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v31    # "$i$f$forEach":I
    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    .restart local v36    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v21    # "$i$f$mapNotNullTo":I
    .end local v28    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    move-object v3, v4

    check-cast v3, Ljava/util/List;

    .line 243
    nop

    .line 111
    .end local v5    # "$i$f$mapNotNull":I
    .end local v36    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    goto :goto_c

    :cond_c
    const-string v3, "categories"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_10

    check-cast v3, Ljava/lang/Iterable;

    .restart local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 243
    .local v4, "$i$f$mapNotNull":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v21, v3

    .local v21, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/16 v28, 0x0

    .line 252
    .local v28, "$i$f$mapNotNullTo":I
    move-object/from16 v29, v21

    .local v29, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v30, 0x0

    .line 257
    .local v30, "$i$f$forEach":I
    invoke-interface/range {v29 .. v29}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_a
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v32

    if-eqz v32, :cond_f

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v32

    .local v32, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v33, v32

    .local v33, "element$iv$iv":Ljava/lang/Object;
    const/16 v34, 0x0

    .line 252
    .local v34, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v35, v33

    .local v35, "it":Ljava/lang/Object;
    const/16 v36, 0x0

    .line 111
    .local v36, "$i$a$-mapNotNull-ModCatalog$searchModrinth$1$2":I
    move-object/from16 v37, v3

    move-object/from16 v3, v35

    move/from16 v35, v4

    .end local v4    # "$i$f$mapNotNull":I
    .local v3, "it":Ljava/lang/Object;
    .local v35, "$i$f$mapNotNull":I
    .local v37, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_d

    move-object v4, v3

    check-cast v4, Ljava/lang/String;

    goto :goto_b

    :cond_d
    const/4 v4, 0x0

    .line 252
    .end local v3    # "it":Ljava/lang/Object;
    .end local v36    # "$i$a$-mapNotNull-ModCatalog$searchModrinth$1$2":I
    :goto_b
    if-eqz v4, :cond_e

    .line 254
    .local v4, "it$iv$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 252
    .local v3, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v5, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 257
    .end local v3    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v4    # "it$iv$iv":Ljava/lang/Object;
    .end local v33    # "element$iv$iv":Ljava/lang/Object;
    .end local v34    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_e
    move/from16 v4, v35

    move-object/from16 v3, v37

    .end local v32    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_a

    .line 258
    .end local v35    # "$i$f$mapNotNull":I
    .end local v37    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v4, "$i$f$mapNotNull":I
    :cond_f
    move-object/from16 v37, v3

    move/from16 v35, v4

    .line 259
    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNull":I
    .end local v29    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v30    # "$i$f$forEach":I
    .restart local v35    # "$i$f$mapNotNull":I
    .restart local v37    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v21    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$mapNotNullTo":I
    move-object v3, v5

    check-cast v3, Ljava/util/List;

    .line 243
    move-object/from16 v29, v3

    .end local v35    # "$i$f$mapNotNull":I
    .end local v37    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    goto :goto_d

    .line 111
    :cond_10
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v3

    :goto_c
    move-object/from16 v29, v3

    .line 112
    :goto_d
    const-string v3, "icon_url"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_11

    move-object/from16 v30, v19

    goto :goto_e

    :cond_11
    move-object/from16 v30, v3

    :goto_e
    const-string v3, "slug"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_12

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "https://modrinth.com/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v31

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_13

    move-object/from16 v32, v19

    goto :goto_f

    :cond_13
    move-object/from16 v32, v2

    .line 110
    :goto_f
    new-instance v21, Lcom/pymcl/core/mods/ModHit;

    const-string v28, "Modrinth"

    invoke-direct/range {v21 .. v32}, Lcom/pymcl/core/mods/ModHit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    move-object/from16 v2, v21

    .line 242
    .end local v0    # "h":Ljava/util/Map;
    .end local v1    # "type":Ljava/lang/String;
    .end local v17    # "$i$a$-map-ModCatalog$searchModrinth$1":I
    invoke-interface {v12, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p1

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v5, v18

    move-object/from16 v3, v20

    goto/16 :goto_1

    .line 260
    .end local v16    # "item$iv$iv":Ljava/lang/Object;
    .end local v18    # "index":Ljava/lang/String;
    .end local v20    # "facets":Ljava/util/List;
    .local v3, "facets":Ljava/util/List;
    .local v5, "index":Ljava/lang/String;
    :cond_14
    nop

    .end local v12    # "destination$iv$iv":Ljava/util/Collection;
    .end local v13    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$mapTo":I
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 240
    nop

    .line 108
    .end local v9    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$map":I
    return-object v0
.end method

.method public final targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;
    .locals 2
    .param p1, "kind"    # Lcom/pymcl/core/mods/ResKind;
    .param p2, "gameDir"    # Ljava/io/File;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    invoke-virtual {p1}, Lcom/pymcl/core/mods/ResKind;->getDir()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 239
    const/4 v0, 0x0

    .line 193
    .local v0, "$i$a$-ifEmpty-ModCatalog$targetDir$1":I
    nop

    .end local v0    # "$i$a$-ifEmpty-ModCatalog$targetDir$1":I
    const-string v0, "mods"

    :cond_1
    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1
.end method

.method public final unzipWorld(Ljava/io/File;Ljava/io/File;)Ljava/io/File;
    .locals 25
    .param p1, "zip"    # Ljava/io/File;
    .param p2, "saves"    # Ljava/io/File;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v0, "entries(...)"

    const-string v3, "zip"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "saves"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    new-instance v3, Ljava/util/zip/ZipFile;

    invoke-direct {v3, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    check-cast v3, Ljava/io/Closeable;

    :try_start_0
    move-object v4, v3

    check-cast v4, Ljava/util/zip/ZipFile;

    .local v4, "z":Ljava/util/zip/ZipFile;
    const/4 v5, 0x0

    .line 213
    .local v5, "$i$a$-use-ModCatalog$unzipWorld$1":I
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->iterator(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object v6

    invoke-static {v6}, Lkotlin/sequences/SequencesKt;->asSequence(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;

    move-result-object v6

    new-instance v7, Lcom/pymcl/core/mods/ModCatalog$$ExternalSyntheticLambda0;

    invoke-direct {v7}, Lcom/pymcl/core/mods/ModCatalog$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v6, v7}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v6

    invoke-static {v6}, Lkotlin/sequences/SequencesKt;->toSet(Lkotlin/sequences/Sequence;)Ljava/util/Set;

    move-result-object v6

    .line 214
    .local v6, "tops":Ljava/util/Set;
    invoke-interface {v6}, Ljava/util/Set;->size()I

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    const/4 v8, 0x2

    const-string v9, "getName(...)"

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-ne v7, v11, :cond_2

    :try_start_1
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->iterator(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object v7

    invoke-static {v7}, Lkotlin/sequences/SequencesKt;->asSequence(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;

    move-result-object v7

    .local v7, "$this$any$iv":Lkotlin/sequences/Sequence;
    const/4 v13, 0x0

    .line 407
    .local v13, "$i$f$any":I
    invoke-interface {v7}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Ljava/util/zip/ZipEntry;

    .local v16, "it":Ljava/util/zip/ZipEntry;
    const/16 v17, 0x0

    .line 214
    .local v17, "$i$a$-any-ModCatalog$unzipWorld$1$single$1":I
    invoke-virtual/range {v16 .. v16}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Ljava/lang/CharSequence;

    const/16 v1, 0x2f

    invoke-static {v11, v1, v10, v8, v12}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    .line 407
    .end local v16    # "it":Ljava/util/zip/ZipEntry;
    .end local v17    # "$i$a$-any-ModCatalog$unzipWorld$1$single$1":I
    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    move-object/from16 v1, p1

    const/4 v11, 0x1

    goto :goto_0

    .line 408
    .end local v15    # "element$iv":Ljava/lang/Object;
    :cond_1
    move v1, v10

    .line 214
    .end local v7    # "$this$any$iv":Lkotlin/sequences/Sequence;
    .end local v13    # "$i$f$any":I
    :goto_1
    if-eqz v1, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    move v11, v10

    .line 215
    .local v11, "single":Z
    :goto_2
    const/4 v1, 0x0

    .local v1, "base":Ljava/lang/Object;
    if-eqz v11, :cond_3

    move-object v7, v2

    goto :goto_3

    :cond_3
    new-instance v7, Ljava/io/File;

    invoke-static/range {p1 .. p1}, Lkotlin/io/FilesKt;->getNameWithoutExtension(Ljava/io/File;)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v7, v2, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 216
    .end local v1    # "base":Ljava/lang/Object;
    .local v7, "base":Ljava/lang/Object;
    :goto_3
    if-nez v11, :cond_4

    const/4 v1, 0x1

    .local v1, "i":I
    :goto_4
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v13

    if-eqz v13, :cond_4

    new-instance v13, Ljava/io/File;

    invoke-static/range {p1 .. p1}, Lkotlin/io/FilesKt;->getNameWithoutExtension(Ljava/io/File;)Ljava/lang/String;

    move-result-object v14

    add-int/lit8 v15, v1, 0x1

    .end local v1    # "i":I
    .local v15, "i":I
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v14, "-"

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v7, v13

    move v1, v15

    const/4 v8, 0x2

    goto :goto_4

    .line 217
    .end local v15    # "i":I
    :cond_4
    invoke-virtual {v4}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->iterator(Ljava/util/Enumeration;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->asSequence(Ljava/util/Iterator;)Lkotlin/sequences/Sequence;

    move-result-object v0

    move-object v1, v0

    .local v1, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v8, 0x0

    .line 409
    .local v8, "$i$f$forEach":I
    invoke-interface {v1}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element$iv":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/util/zip/ZipEntry;

    .local v14, "e":Ljava/util/zip/ZipEntry;
    const/4 v15, 0x0

    .line 218
    .local v15, "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    sget-object v10, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v14}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10, v7, v12}, Lcom/pymcl/core/util/FileUtil;->safeChild(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v10

    .line 219
    .local v10, "f":Ljava/io/File;
    invoke-virtual {v14}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-virtual {v10}, Ljava/io/File;->mkdirs()Z

    move-object/from16 v20, v0

    move-object/from16 v21, v1

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v19, v7

    const/4 v5, 0x2

    const/4 v6, 0x0

    goto :goto_6

    :cond_5
    invoke-virtual {v10}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v12

    if-eqz v12, :cond_6

    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    :cond_6
    invoke-virtual {v4, v14}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v12

    check-cast v12, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    :try_start_2
    move-object/from16 v18, v12

    check-cast v18, Ljava/io/InputStream;

    move-object/from16 v19, v18

    .line 239
    .local v19, "i":Ljava/io/InputStream;
    const/16 v18, 0x0

    move-object/from16 v20, v0

    .local v18, "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    new-instance v0, Ljava/io/FileOutputStream;

    .line 219
    invoke-direct {v0, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-object/from16 v21, v1

    .end local v1    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .local v21, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    :try_start_3
    move-object v1, v0

    check-cast v1, Ljava/io/Closeable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    :try_start_4
    move-object v0, v1

    check-cast v0, Ljava/io/FileOutputStream;

    .line 239
    .local v0, "it":Ljava/io/FileOutputStream;
    const/16 v22, 0x0

    .line 219
    .local v22, "$i$a$-use-ModCatalog$unzipWorld$1$1$1$1":I
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v23, v0

    .end local v0    # "it":Ljava/io/FileOutputStream;
    .local v23, "it":Ljava/io/FileOutputStream;
    move-object/from16 v0, v23

    check-cast v0, Ljava/io/OutputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v4, v19

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    .end local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v6    # "tops":Ljava/util/Set;
    .end local v7    # "base":Ljava/lang/Object;
    .local v4, "i":Ljava/io/InputStream;
    .local v16, "$i$a$-use-ModCatalog$unzipWorld$1":I
    .local v17, "tops":Ljava/util/Set;
    .local v19, "base":Ljava/lang/Object;
    .local v24, "z":Ljava/util/zip/ZipFile;
    :try_start_5
    invoke-static {v4, v0, v6, v5, v7}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .end local v22    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1$1":I
    .end local v23    # "it":Ljava/io/FileOutputStream;
    :try_start_6
    invoke-static {v1, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v4    # "i":Ljava/io/InputStream;
    .end local v18    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :try_start_7
    invoke-static {v12, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 220
    :goto_6
    nop

    .line 409
    .end local v10    # "f":Ljava/io/File;
    .end local v14    # "e":Ljava/util/zip/ZipEntry;
    .end local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    move v10, v6

    move/from16 v5, v16

    move-object/from16 v6, v17

    move-object/from16 v7, v19

    move-object/from16 v0, v20

    move-object/from16 v1, v21

    move-object/from16 v4, v24

    const/4 v12, 0x0

    .end local v13    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_5

    .line 219
    .restart local v4    # "i":Ljava/io/InputStream;
    .restart local v10    # "f":Ljava/io/File;
    .restart local v13    # "element$iv":Ljava/lang/Object;
    .restart local v14    # "e":Ljava/util/zip/ZipEntry;
    .restart local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .restart local v18    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    :catchall_0
    move-exception v0

    move-object v5, v0

    goto :goto_7

    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    .local v4, "z":Ljava/util/zip/ZipFile;
    .restart local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v6    # "tops":Ljava/util/Set;
    .restart local v7    # "base":Ljava/lang/Object;
    .local v19, "i":Ljava/io/InputStream;
    :catchall_1
    move-exception v0

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v4, v19

    move-object/from16 v19, v7

    move-object v5, v0

    .end local v4    # "z":Ljava/util/zip/ZipFile;
    .end local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v6    # "tops":Ljava/util/Set;
    .end local v7    # "base":Ljava/lang/Object;
    .end local v8    # "$i$f$forEach":I
    .end local v10    # "f":Ljava/io/File;
    .end local v11    # "single":Z
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "e":Ljava/util/zip/ZipEntry;
    .end local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .end local v18    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    .end local v19    # "i":Ljava/io/InputStream;
    .end local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local p1    # "zip":Ljava/io/File;
    .end local p2    # "saves":Ljava/io/File;
    :goto_7
    :try_start_8
    throw v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .local v4, "i":Ljava/io/InputStream;
    .restart local v8    # "$i$f$forEach":I
    .restart local v10    # "f":Ljava/io/File;
    .restart local v11    # "single":Z
    .restart local v13    # "element$iv":Ljava/lang/Object;
    .restart local v14    # "e":Ljava/util/zip/ZipEntry;
    .restart local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .restart local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v17    # "tops":Ljava/util/Set;
    .restart local v18    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    .local v19, "base":Ljava/lang/Object;
    .restart local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v24    # "z":Ljava/util/zip/ZipFile;
    .restart local p1    # "zip":Ljava/io/File;
    .restart local p2    # "saves":Ljava/io/File;
    :catchall_2
    move-exception v0

    :try_start_9
    invoke-static {v1, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v8    # "$i$f$forEach":I
    .end local v10    # "f":Ljava/io/File;
    .end local v11    # "single":Z
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "e":Ljava/util/zip/ZipEntry;
    .end local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v19    # "base":Ljava/lang/Object;
    .end local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    .end local p1    # "zip":Ljava/io/File;
    .end local p2    # "saves":Ljava/io/File;
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .end local v4    # "i":Ljava/io/InputStream;
    .end local v18    # "$i$a$-use-ModCatalog$unzipWorld$1$1$1":I
    .restart local v8    # "$i$f$forEach":I
    .restart local v10    # "f":Ljava/io/File;
    .restart local v11    # "single":Z
    .restart local v13    # "element$iv":Ljava/lang/Object;
    .restart local v14    # "e":Ljava/util/zip/ZipEntry;
    .restart local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .restart local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v17    # "tops":Ljava/util/Set;
    .restart local v19    # "base":Ljava/lang/Object;
    .restart local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v24    # "z":Ljava/util/zip/ZipFile;
    .restart local p1    # "zip":Ljava/io/File;
    .restart local p2    # "saves":Ljava/io/File;
    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_8

    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v19    # "base":Ljava/lang/Object;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    .local v4, "z":Ljava/util/zip/ZipFile;
    .restart local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v6    # "tops":Ljava/util/Set;
    .restart local v7    # "base":Ljava/lang/Object;
    :catchall_4
    move-exception v0

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v19, v7

    move-object v1, v0

    .end local v4    # "z":Ljava/util/zip/ZipFile;
    .end local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v6    # "tops":Ljava/util/Set;
    .end local v7    # "base":Ljava/lang/Object;
    .restart local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v17    # "tops":Ljava/util/Set;
    .restart local v19    # "base":Ljava/lang/Object;
    .restart local v24    # "z":Ljava/util/zip/ZipFile;
    goto :goto_8

    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v19    # "base":Ljava/lang/Object;
    .end local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    .restart local v1    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v4    # "z":Ljava/util/zip/ZipFile;
    .restart local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v6    # "tops":Ljava/util/Set;
    .restart local v7    # "base":Ljava/lang/Object;
    :catchall_5
    move-exception v0

    move-object/from16 v21, v1

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v19, v7

    move-object v1, v0

    .end local v1    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v4    # "z":Ljava/util/zip/ZipFile;
    .end local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v6    # "tops":Ljava/util/Set;
    .end local v7    # "base":Ljava/lang/Object;
    .end local v8    # "$i$f$forEach":I
    .end local v10    # "f":Ljava/io/File;
    .end local v11    # "single":Z
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "e":Ljava/util/zip/ZipEntry;
    .end local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .end local p1    # "zip":Ljava/io/File;
    .end local p2    # "saves":Ljava/io/File;
    :goto_8
    :try_start_a
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .restart local v8    # "$i$f$forEach":I
    .restart local v10    # "f":Ljava/io/File;
    .restart local v11    # "single":Z
    .restart local v13    # "element$iv":Ljava/lang/Object;
    .restart local v14    # "e":Ljava/util/zip/ZipEntry;
    .restart local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .restart local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v17    # "tops":Ljava/util/Set;
    .restart local v19    # "base":Ljava/lang/Object;
    .restart local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v24    # "z":Ljava/util/zip/ZipFile;
    .restart local p1    # "zip":Ljava/io/File;
    .restart local p2    # "saves":Ljava/io/File;
    :catchall_6
    move-exception v0

    :try_start_b
    invoke-static {v12, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "zip":Ljava/io/File;
    .end local p2    # "saves":Ljava/io/File;
    throw v0

    .line 410
    .end local v10    # "f":Ljava/io/File;
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "e":Ljava/util/zip/ZipEntry;
    .end local v15    # "$i$a$-forEach-ModCatalog$unzipWorld$1$1":I
    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v19    # "base":Ljava/lang/Object;
    .end local v21    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    .restart local v1    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v4    # "z":Ljava/util/zip/ZipFile;
    .restart local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v6    # "tops":Ljava/util/Set;
    .restart local v7    # "base":Ljava/lang/Object;
    .restart local p1    # "zip":Ljava/io/File;
    .restart local p2    # "saves":Ljava/io/File;
    :cond_7
    move-object/from16 v21, v1

    move-object/from16 v24, v4

    move/from16 v16, v5

    move-object/from16 v17, v6

    move-object/from16 v19, v7

    .line 221
    .end local v1    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v4    # "z":Ljava/util/zip/ZipFile;
    .end local v5    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v6    # "tops":Ljava/util/Set;
    .end local v7    # "base":Ljava/lang/Object;
    .end local v8    # "$i$f$forEach":I
    .restart local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .restart local v17    # "tops":Ljava/util/Set;
    .restart local v19    # "base":Ljava/lang/Object;
    .restart local v24    # "z":Ljava/util/zip/ZipFile;
    if-eqz v11, :cond_8

    new-instance v0, Ljava/io/File;

    move-object/from16 v1, v17

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    move-object v7, v0

    goto :goto_9

    :cond_8
    move-object/from16 v7, v19

    .line 212
    .end local v11    # "single":Z
    .end local v16    # "$i$a$-use-ModCatalog$unzipWorld$1":I
    .end local v17    # "tops":Ljava/util/Set;
    .end local v19    # "base":Ljava/lang/Object;
    .end local v24    # "z":Ljava/util/zip/ZipFile;
    :goto_9
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v7

    :catchall_7
    move-exception v0

    move-object v1, v0

    .end local p1    # "zip":Ljava/io/File;
    .end local p2    # "saves":Ljava/io/File;
    :try_start_c
    throw v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .restart local p1    # "zip":Ljava/io/File;
    .restart local p2    # "saves":Ljava/io/File;
    :catchall_8
    move-exception v0

    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
