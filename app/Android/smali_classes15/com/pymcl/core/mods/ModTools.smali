.class public final Lcom/pymcl/core/mods/ModTools;
.super Ljava/lang/Object;
.source "ModTools.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/ModTools$Companion;,
        Lcom/pymcl/core/mods/ModTools$Dep;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/ModTools\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,288:1\n460#2,7:289\n1#3:296\n1#3:318\n1#3:346\n1358#4,2:297\n1435#4,4:299\n1739#4:303\n1814#4,3:304\n1795#4,10:307\n2068#4:317\n2069#4:319\n1805#4:320\n1373#4,2:321\n1402#4,4:323\n1739#4:327\n1814#4,3:328\n1739#4:331\n1814#4,3:332\n1795#4,10:335\n2068#4:345\n2069#4:347\n1805#4:348\n1373#4,2:349\n1402#4,4:351\n296#4,2:355\n1221#4:360\n777#4:361\n873#4,2:362\n296#4,2:364\n777#4:366\n873#4,2:367\n2198#4,14:369\n3938#5:357\n4474#5,2:358\n*S KotlinDebug\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/ModTools\n*L\n107#1:289,7\n132#1:318\n146#1:346\n121#1:297,2\n121#1:299,4\n130#1:303\n130#1:304,3\n132#1:307,10\n132#1:317\n132#1:319\n132#1:320\n135#1:321,2\n135#1:323,4\n138#1:327\n138#1:328,3\n141#1:331\n141#1:332,3\n146#1:335,10\n146#1:345\n146#1:347\n146#1:348\n149#1:349,2\n149#1:351,4\n153#1:355,2\n166#1:360\n176#1:361\n176#1:362,2\n181#1:364,2\n185#1:366\n185#1:367,2\n201#1:369,14\n166#1:357\n166#1:358,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0018\u0000 @2\u00020\u0001:\u0002@AB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0007J\u001a\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u0014H\u0002J\"\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u0014H\u0002J:\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u00142\u0006\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002J\"\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013j\u0002`\u00142\u0006\u0010\u001f\u001a\u00020\u0019H\u0002J*\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190!2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00070#2\u0008\u0008\u0002\u0010$\u001a\u00020%J.\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190!2\u0006\u0010\'\u001a\u00020\u00072\u0008\u0008\u0002\u0010(\u001a\u00020%2\u0008\u0008\u0002\u0010$\u001a\u00020%JR\u0010)\u001a\u0008\u0012\u0004\u0012\u00020*0#2\u0006\u0010+\u001a\u00020\u000c2\u0006\u0010,\u001a\u00020-2\u000c\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000c0/2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u000c0/2\u0006\u00101\u001a\u00020\u000c2\u0006\u00102\u001a\u00020\u000c2\u0008\u0008\u0002\u00103\u001a\u000204JF\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020-0!2\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00070#2\u0006\u00101\u001a\u00020\u000c2\u0006\u00102\u001a\u00020\u000c2\u0014\u0008\u0002\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190!J>\u00107\u001a\u00020\u00072\u0006\u00108\u001a\u00020\u00072\u0006\u00109\u001a\u00020-2\u0006\u0010:\u001a\u00020;2\u0016\u0008\u0002\u0010<\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u0016\u0018\u00010=H\u0086@\u00a2\u0006\u0002\u0010?R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\n\u001a6\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000e0\r0\u000bj\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000e0\r`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModTools;",
        "",
        "catalog",
        "Lcom/pymcl/core/mods/ModCatalog;",
        "mirrors",
        "Lcom/pymcl/core/download/Mirrors;",
        "cacheFile",
        "Ljava/io/File;",
        "<init>",
        "(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;)V",
        "hashMemo",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/collections/HashMap;",
        "hashes",
        "f",
        "loadCache",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "saveCache",
        "",
        "c",
        "fromCache",
        "Lcom/pymcl/core/mods/ModIdent;",
        "e",
        "name",
        "sha1",
        "fp",
        "toCache",
        "i",
        "identify",
        "",
        "files",
        "",
        "useNetwork",
        "",
        "identifyDir",
        "dir",
        "mods",
        "missingDeps",
        "Lcom/pymcl/core/mods/ModTools$Dep;",
        "rootId",
        "root",
        "Lcom/pymcl/core/mods/ModFile;",
        "installedIds",
        "",
        "installedNames",
        "mc",
        "loader",
        "maxDepth",
        "",
        "checkUpdates",
        "idents",
        "applyUpdate",
        "old",
        "newFile",
        "downloads",
        "Lcom/pymcl/core/download/DownloadManager;",
        "onProgress",
        "Lkotlin/Function1;",
        "",
        "(Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
        "Dep",
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
.field public static final Companion:Lcom/pymcl/core/mods/ModTools$Companion;

.field public static final HIT_TTL:J = 0x240c8400L

.field public static final MISS_TTL:J = 0x5265c00L


# instance fields
.field private final cacheFile:Ljava/io/File;

.field private final catalog:Lcom/pymcl/core/mods/ModCatalog;

.field private final hashMemo:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mirrors:Lcom/pymcl/core/download/Mirrors;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/core/mods/ModTools$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/mods/ModTools$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/mods/ModTools;->Companion:Lcom/pymcl/core/mods/ModTools$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;)V
    .locals 1
    .param p1, "catalog"    # Lcom/pymcl/core/mods/ModCatalog;
    .param p2, "mirrors"    # Lcom/pymcl/core/download/Mirrors;
    .param p3, "cacheFile"    # Ljava/io/File;

    const-string v0, "catalog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mirrors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    iput-object p2, p0, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    iput-object p3, p0, Lcom/pymcl/core/mods/ModTools;->cacheFile:Ljava/io/File;

    .line 103
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/core/mods/ModTools;->hashMemo:Ljava/util/HashMap;

    .line 97
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 97
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/mods/ModTools;-><init>(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/download/Mirrors;Ljava/io/File;)V

    return-void
.end method

.method public static synthetic applyUpdate$default(Lcom/pymcl/core/mods/ModTools;Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 207
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/mods/ModTools;->applyUpdate(Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic checkUpdates$default(Lcom/pymcl/core/mods/ModTools;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 196
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x2

    const/4 p5, 0x0

    const/4 p6, 0x0

    invoke-static {p0, p1, p6, p4, p5}, Lcom/pymcl/core/mods/ModTools;->identify$default(Lcom/pymcl/core/mods/ModTools;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/Map;

    move-result-object p4

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/mods/ModTools;->checkUpdates(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final fromCache(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;J)Lcom/pymcl/core/mods/ModIdent;
    .locals 13
    .param p1, "e"    # Ljava/util/Map;
    .param p2, "name"    # Ljava/lang/String;
    .param p3, "sha1"    # Ljava/lang/String;
    .param p4, "fp"    # J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "J)",
            "Lcom/pymcl/core/mods/ModIdent;"
        }
    .end annotation

    .line 113
    new-instance v0, Lcom/pymcl/core/mods/ModIdent;

    const-string v1, "mr"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "mrv"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "mru"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 114
    const-string v1, "cf"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    const-string v1, "cff"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v9

    const-string v1, "title"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v10, v2

    goto :goto_0

    :cond_0
    move-object v10, v1

    :goto_0
    const-string v1, "icon"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object v11, v1

    :goto_1
    const-string v1, "ver"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v12, v2

    goto :goto_2

    :cond_2
    move-object v12, v1

    .line 113
    :goto_2
    move-object v1, p2

    move-object/from16 v2, p3

    move-wide/from16 v3, p4

    invoke-direct/range {v0 .. v12}, Lcom/pymcl/core/mods/ModIdent;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    return-object v0
.end method

.method public static synthetic identify$default(Lcom/pymcl/core/mods/ModTools;Ljava/util/List;ZILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 119
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/mods/ModTools;->identify(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic identifyDir$default(Lcom/pymcl/core/mods/ModTools;Ljava/io/File;ZZILjava/lang/Object;)Ljava/util/Map;
    .locals 1

    .line 165
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/mods/ModTools;->identifyDir(Ljava/io/File;ZZ)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final loadCache()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/pymcl/core/mods/ModTools;->cacheFile:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 296
    .local v0, "it":Ljava/io/File;
    const/4 v1, 0x0

    .line 110
    .local v1, "$i$a$-let-ModTools$loadCache$1":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    .end local v0    # "it":Ljava/io/File;
    .end local v1    # "$i$a$-let-ModTools$loadCache$1":I
    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public static synthetic missingDeps$default(Lcom/pymcl/core/mods/ModTools;Ljava/lang/String;Lcom/pymcl/core/mods/ModFile;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Ljava/util/List;
    .locals 9

    .line 174
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    move v8, v0

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lcom/pymcl/core/mods/ModTools;->missingDeps(Ljava/lang/String;Lcom/pymcl/core/mods/ModFile;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final saveCache(Ljava/util/Map;)V
    .locals 5
    .param p1, "c"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/pymcl/core/mods/ModTools;->cacheFile:Ljava/io/File;

    if-eqz v0, :cond_0

    .line 296
    .local v0, "it":Ljava/io/File;
    const/4 v1, 0x0

    .line 111
    .local v1, "$i$a$-let-ModTools$saveCache$1":I
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/core/mods/ModTools;

    .line 296
    .local v2, "$this$saveCache_u24lambda_u240_u240":Lcom/pymcl/core/mods/ModTools;
    const/4 v3, 0x0

    .line 111
    .local v3, "$i$a$-runCatching-ModTools$saveCache$1$1":I
    sget-object v4, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v4, v0, p1}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    move-result v4

    .end local v2    # "$this$saveCache_u24lambda_u240_u240":Lcom/pymcl/core/mods/ModTools;
    .end local v3    # "$i$a$-runCatching-ModTools$saveCache$1$1":I
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .end local v0    # "it":Ljava/io/File;
    .end local v1    # "$i$a$-let-ModTools$saveCache$1":I
    :goto_0
    invoke-static {v2}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    :cond_0
    return-void
.end method

.method private final toCache(Lcom/pymcl/core/mods/ModIdent;)Ljava/util/Map;
    .locals 3
    .param p1, "i"    # Lcom/pymcl/core/mods/ModIdent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ModIdent;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 115
    const/16 v0, 0x9

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "mr"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getMrProject()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "mrv"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getMrVersion()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "mru"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getMrUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "cf"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getCfProject()Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "cff"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getCfFile()Ljava/lang/Long;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 116
    const-string v1, "title"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 115
    nop

    .line 116
    const-string v1, "icon"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getIconUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 115
    nop

    .line 116
    const-string v1, "ver"

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModIdent;->getVersionName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 115
    nop

    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "at"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 115
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 116
    return-object v0
.end method


# virtual methods
.method public final applyUpdate(Ljava/io/File;Lcom/pymcl/core/mods/ModFile;Lcom/pymcl/core/download/DownloadManager;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .param p1, "old"    # Ljava/io/File;
    .param p2, "newFile"    # Lcom/pymcl/core/mods/ModFile;
    .param p3, "downloads"    # Lcom/pymcl/core/download/DownloadManager;
    .param p4, "onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lcom/pymcl/core/mods/ModFile;",
            "Lcom/pymcl/core/download/DownloadManager;",
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

    move-object/from16 v1, p5

    instance-of v2, v1, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;

    iget v3, v2, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;-><init>(Lcom/pymcl/core/mods/ModTools;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v10, v2

    .local v10, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v2, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->result:Ljava/lang/Object;

    .local v2, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v13

    .line 207
    iget v3, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->label:I

    packed-switch v3, :pswitch_data_0

    move-object/from16 v15, p1

    .end local v2    # "$result":Ljava/lang/Object;
    .end local v10    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v2    # "$result":Ljava/lang/Object;
    .restart local v10    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v3, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    .local v3, "dir":Ljava/io/File;
    iget-object v4, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function1;
    .local v4, "onProgress":Lkotlin/jvm/functions/Function1;
    iget-object v5, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$2:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/core/download/DownloadManager;

    .end local p3    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .local v5, "downloads":Lcom/pymcl/core/download/DownloadManager;
    iget-object v6, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/pymcl/core/mods/ModFile;

    .end local p2    # "newFile":Lcom/pymcl/core/mods/ModFile;
    .local v6, "newFile":Lcom/pymcl/core/mods/ModFile;
    iget-object v7, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$0:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    .end local p1    # "old":Ljava/io/File;
    .local v7, "old":Ljava/io/File;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v3

    move-object v15, v7

    move-object v3, v2

    goto :goto_1

    .end local v3    # "dir":Ljava/io/File;
    .end local v4    # "onProgress":Lkotlin/jvm/functions/Function1;
    .end local v5    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .end local v6    # "newFile":Lcom/pymcl/core/mods/ModFile;
    .end local v7    # "old":Ljava/io/File;
    .restart local p1    # "old":Ljava/io/File;
    .restart local p2    # "newFile":Lcom/pymcl/core/mods/ModFile;
    .restart local p3    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function1;
    :pswitch_1
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 208
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v14

    .line 209
    .local v14, "dir":Ljava/io/File;
    iget-object v3, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    sget-object v4, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    invoke-virtual {v14}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v6

    const-string v5, "getParentFile(...)"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    iput-object v15, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$2:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$3:Ljava/lang/Object;

    iput-object v14, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->L$4:Ljava/lang/Object;

    const/4 v5, 0x1

    iput v5, v10, Lcom/pymcl/core/mods/ModTools$applyUpdate$1;->label:I

    const/4 v8, 0x0

    const/16 v11, 0x10

    const/4 v12, 0x0

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move-object/from16 v9, p4

    invoke-static/range {v3 .. v12}, Lcom/pymcl/core/mods/ModCatalog;->install$default(Lcom/pymcl/core/mods/ModCatalog;Lcom/pymcl/core/mods/ResKind;Lcom/pymcl/core/mods/ModFile;Ljava/io/File;Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_1

    .line 207
    return-object v13

    .line 209
    :cond_1
    move-object/from16 v6, p2

    move-object/from16 v5, p3

    move-object/from16 v4, p4

    .line 207
    .end local p1    # "old":Ljava/io/File;
    .end local p2    # "newFile":Lcom/pymcl/core/mods/ModFile;
    .end local p3    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function1;
    .restart local v4    # "onProgress":Lkotlin/jvm/functions/Function1;
    .restart local v5    # "downloads":Lcom/pymcl/core/download/DownloadManager;
    .restart local v6    # "newFile":Lcom/pymcl/core/mods/ModFile;
    .local v15, "old":Ljava/io/File;
    :goto_1
    move-object/from16 v16, v3

    check-cast v16, Ljava/io/File;

    .local v16, "f":Ljava/io/File;
    const/4 v3, 0x0

    .line 210
    .local v3, "$i$a$-let-ModTools$applyUpdate$installed$1":I
    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v7

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    new-instance v7, Ljava/io/File;

    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v14, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v17, v7

    .local v17, "t":Ljava/io/File;
    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->delete()Z

    move-object/from16 v16, v17

    .line 209
    .end local v3    # "$i$a$-let-ModTools$applyUpdate$installed$1":I
    .end local v16    # "f":Ljava/io/File;
    .end local v17    # "t":Ljava/io/File;
    :cond_2
    move-object/from16 v3, v16

    .line 211
    .local v3, "installed":Ljava/io/File;
    move-object v7, v3

    .line 212
    .local v7, "result":Ljava/io/File;
    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "getName(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v13, ".disabled"

    const/4 v0, 0x0

    invoke-static {v8, v13, v0, v11, v12}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v14, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v0, "d":Ljava/io/File;
    invoke-virtual {v3, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v7, v0

    .line 213
    .end local v0    # "d":Ljava/io/File;
    :cond_3
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v0, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    .line 214
    :cond_4
    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final checkUpdates(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 22
    .param p1, "files"    # Ljava/util/List;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;
    .param p4, "idents"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModIdent;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModFile;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v0, "files"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mc"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loader"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idents"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v5, v0

    .line 198
    .local v5, "out":Ljava/util/LinkedHashMap;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .line 296
    .local v0, "$this$checkUpdates_u24lambda_u240":Lcom/pymcl/core/mods/ModTools;
    const/4 v6, 0x0

    .line 198
    .local v6, "$i$a$-runCatching-ModTools$checkUpdates$1":I
    move-object v7, v5

    check-cast v7, Ljava/util/Map;

    iget-object v8, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    invoke-virtual {v8, v1, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->checkUpdates(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .end local v0    # "$this$checkUpdates_u24lambda_u240":Lcom/pymcl/core/mods/ModTools;
    .end local v6    # "$i$a$-runCatching-ModTools$checkUpdates$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    :goto_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/io/File;

    .local v7, "f":Ljava/io/File;
    move-object v0, v5

    check-cast v0, Ljava/util/Map;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 200
    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/mods/ModIdent;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v8, v0

    .local v8, "i":Lcom/pymcl/core/mods/ModIdent;
    invoke-virtual {v8}, Lcom/pymcl/core/mods/ModIdent;->getCfProject()Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    .local v9, "cid":J
    invoke-virtual {v8}, Lcom/pymcl/core/mods/ModIdent;->getMrProject()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 201
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .line 296
    .local v0, "$this$checkUpdates_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    const/4 v12, 0x0

    .line 201
    .local v12, "$i$a$-runCatching-ModTools$checkUpdates$latest$1":I
    iget-object v13, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "cf:"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14, v2, v3}, Lcom/pymcl/core/mods/ModCatalog;->files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 369
    .local v14, "$i$f$maxByOrNull":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    .line 370
    .local v15, "iterator$iv":Ljava/util/Iterator;
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-nez v16, :cond_2

    move-object/from16 v20, v0

    const/16 v16, 0x0

    goto :goto_3

    .line 371
    :cond_2
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    .line 372
    .local v16, "maxElem$iv":Ljava/lang/Object;
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-nez v17, :cond_3

    move-object/from16 v20, v0

    goto :goto_3

    .line 373
    :cond_3
    move-object/from16 v17, v16

    check-cast v17, Lcom/pymcl/core/mods/ModFile;

    .local v17, "it":Lcom/pymcl/core/mods/ModFile;
    const/16 v18, 0x0

    .line 201
    .local v18, "$i$a$-maxByOrNull-ModTools$checkUpdates$latest$1$1":I
    invoke-virtual/range {v17 .. v17}, Lcom/pymcl/core/mods/ModFile;->getDate()Ljava/lang/String;

    move-result-object v19

    .line 373
    .end local v17    # "it":Lcom/pymcl/core/mods/ModFile;
    .end local v18    # "$i$a$-maxByOrNull-ModTools$checkUpdates$latest$1$1":I
    check-cast v19, Ljava/lang/Comparable;

    move-object/from16 v11, v19

    .line 375
    .local v11, "maxValue$iv":Ljava/lang/Comparable;
    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 376
    .local v18, "e$iv":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lcom/pymcl/core/mods/ModFile;

    .local v19, "it":Lcom/pymcl/core/mods/ModFile;
    const/16 v20, 0x0

    .line 201
    .local v20, "$i$a$-maxByOrNull-ModTools$checkUpdates$latest$1$1":I
    invoke-virtual/range {v19 .. v19}, Lcom/pymcl/core/mods/ModFile;->getDate()Ljava/lang/String;

    move-result-object v21

    .line 376
    .end local v19    # "it":Lcom/pymcl/core/mods/ModFile;
    .end local v20    # "$i$a$-maxByOrNull-ModTools$checkUpdates$latest$1$1":I
    check-cast v21, Ljava/lang/Comparable;

    move-object/from16 v19, v21

    .line 377
    .local v19, "v$iv":Ljava/lang/Comparable;
    move-object/from16 v20, v0

    move-object/from16 v0, v19

    .end local v19    # "v$iv":Ljava/lang/Comparable;
    .local v0, "v$iv":Ljava/lang/Comparable;
    .local v20, "$this$checkUpdates_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    invoke-interface {v11, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v19

    if-gez v19, :cond_4

    .line 378
    move-object/from16 v16, v18

    .line 379
    move-object v11, v0

    .line 381
    .end local v0    # "v$iv":Ljava/lang/Comparable;
    .end local v18    # "e$iv":Ljava/lang/Object;
    :cond_4
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 382
    nop

    .end local v11    # "maxValue$iv":Ljava/lang/Comparable;
    .end local v13    # "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$maxByOrNull":I
    .end local v15    # "iterator$iv":Ljava/util/Iterator;
    .end local v16    # "maxElem$iv":Ljava/lang/Object;
    :goto_3
    check-cast v16, Lcom/pymcl/core/mods/ModFile;

    .line 201
    nop

    .end local v12    # "$i$a$-runCatching-ModTools$checkUpdates$latest$1":I
    .end local v20    # "$this$checkUpdates_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    invoke-static/range {v16 .. v16}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    .line 381
    .restart local v11    # "maxValue$iv":Ljava/lang/Comparable;
    .restart local v12    # "$i$a$-runCatching-ModTools$checkUpdates$latest$1":I
    .restart local v13    # "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    .restart local v14    # "$i$f$maxByOrNull":I
    .restart local v15    # "iterator$iv":Ljava/util/Iterator;
    .restart local v16    # "maxElem$iv":Ljava/lang/Object;
    .restart local v20    # "$this$checkUpdates_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    :cond_5
    move-object/from16 v0, v20

    goto :goto_2

    .line 201
    .end local v11    # "maxValue$iv":Ljava/lang/Comparable;
    .end local v12    # "$i$a$-runCatching-ModTools$checkUpdates$latest$1":I
    .end local v13    # "$this$maxByOrNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$maxByOrNull":I
    .end local v15    # "iterator$iv":Ljava/util/Iterator;
    .end local v16    # "maxElem$iv":Ljava/lang/Object;
    .end local v20    # "$this$checkUpdates_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    :catchall_1
    move-exception v0

    sget-object v11, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/4 v0, 0x0

    :cond_6
    check-cast v0, Lcom/pymcl/core/mods/ModFile;

    if-nez v0, :cond_7

    goto/16 :goto_1

    .line 202
    .local v0, "latest":Lcom/pymcl/core/mods/ModFile;
    :cond_7
    invoke-virtual {v0}, Lcom/pymcl/core/mods/ModFile;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8}, Lcom/pymcl/core/mods/ModIdent;->getCfFile()Ljava/lang/Long;

    move-result-object v12

    if-eqz v12, :cond_8

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v12

    goto :goto_5

    :cond_8
    const/4 v12, 0x0

    :goto_5
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    const-string v13, "getName(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v13, ".disabled"

    check-cast v13, Ljava/lang/CharSequence;

    invoke-static {v12, v13}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    move-object v11, v5

    check-cast v11, Ljava/util/Map;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    .line 203
    .end local v0    # "latest":Lcom/pymcl/core/mods/ModFile;
    .end local v7    # "f":Ljava/io/File;
    .end local v8    # "i":Lcom/pymcl/core/mods/ModIdent;
    .end local v9    # "cid":J
    :cond_9
    move-object v0, v5

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final hashes(Ljava/io/File;)Lkotlin/Pair;
    .locals 11
    .param p1, "f"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/pymcl/core/mods/ModTools;->hashMemo:Ljava/util/HashMap;

    monitor-enter v0

    const/4 v1, 0x0

    .line 106
    .local v1, "$i$a$-synchronized-ModTools$hashes$1":I
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v7, "|"

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 107
    .local v2, "key":Ljava/lang/String;
    iget-object v3, p0, Lcom/pymcl/core/mods/ModTools;->hashMemo:Ljava/util/HashMap;

    check-cast v3, Ljava/util/Map;

    move-object v4, v2

    .local v3, "$this$getOrPut$iv":Ljava/util/Map;
    .local v4, "key$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 289
    .local v5, "$i$f$getOrPut":I
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 290
    .local v6, "value$iv":Ljava/lang/Object;
    if-nez v6, :cond_0

    .line 291
    const/4 v7, 0x0

    .line 107
    .local v7, "$i$a$-getOrPut-ModTools$hashes$1$1":I
    sget-object v8, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v8, p1, v10, v9, v10}, Lcom/pymcl/core/util/FileUtil;->hash$default(Lcom/pymcl/core/util/FileUtil;Ljava/io/File;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lcom/pymcl/core/mods/Murmur2;->INSTANCE:Lcom/pymcl/core/mods/Murmur2;

    invoke-virtual {v9, p1}, Lcom/pymcl/core/mods/Murmur2;->hash(Ljava/io/File;)J

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    .line 291
    .end local v7    # "$i$a$-getOrPut-ModTools$hashes$1$1":I
    nop

    .line 292
    .local v8, "answer$iv":Ljava/lang/Object;
    invoke-interface {v3, v4, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    nop

    .end local v8    # "answer$iv":Ljava/lang/Object;
    goto :goto_0

    .line 295
    :cond_0
    move-object v8, v6

    .line 290
    :goto_0
    nop

    .end local v3    # "$this$getOrPut$iv":Ljava/util/Map;
    .end local v4    # "key$iv":Ljava/lang/Object;
    .end local v5    # "$i$f$getOrPut":I
    .end local v6    # "value$iv":Ljava/lang/Object;
    check-cast v8, Lkotlin/Pair;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    nop

    .line 105
    .end local v1    # "$i$a$-synchronized-ModTools$hashes$1":I
    .end local v2    # "key":Ljava/lang/String;
    monitor-exit v0

    .line 108
    return-object v8

    .line 105
    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final identify(Ljava/util/List;Z)Ljava/util/Map;
    .locals 49
    .param p1, "files"    # Ljava/util/List;
    .param p2, "useNetwork"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModIdent;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    const-string v8, "exactMatches"

    const-string v9, "sha1"

    const-string v10, "fingerprints"

    const-string v11, "hashes"

    const-string v12, "data"

    const-string v13, "files"

    invoke-static {v7, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    .local v14, "now":J
    invoke-direct {v1}, Lcom/pymcl/core/mods/ModTools;->loadCache()Ljava/util/Map;

    move-result-object v2

    .line 121
    .local v2, "cache":Ljava/util/Map;
    move-object v0, v7

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 297
    .local v3, "$i$f$associate":I
    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 298
    .local v5, "capacity$iv":I
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v4, Ljava/util/Map;

    .local v4, "destination$iv$iv":Ljava/util/Map;
    move-object/from16 v17, v0

    .local v17, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 299
    .local v18, "$i$f$associateTo":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_0

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .line 300
    .local v20, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v6, v20

    check-cast v6, Ljava/io/File;

    .local v6, "it":Ljava/io/File;
    const/16 v22, 0x0

    .line 121
    .local v22, "$i$a$-associate-ModTools$identify$hs$1":I
    move-object/from16 v23, v0

    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .local v23, "$this$associate$iv":Ljava/lang/Iterable;
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move/from16 v24, v3

    .end local v3    # "$i$f$associate":I
    .local v24, "$i$f$associate":I
    invoke-virtual {v1, v6}, Lcom/pymcl/core/mods/ModTools;->hashes(Ljava/io/File;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 300
    .end local v6    # "it":Ljava/io/File;
    .end local v22    # "$i$a$-associate-ModTools$identify$hs$1":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v4, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v23

    move/from16 v3, v24

    const/16 v6, 0x10

    goto :goto_0

    .line 302
    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .end local v23    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$associate":I
    .restart local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$associate":I
    :cond_0
    move-object/from16 v23, v0

    move/from16 v24, v3

    .line 298
    .end local v0    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$associate":I
    .end local v4    # "destination$iv$iv":Ljava/util/Map;
    .end local v17    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$associateTo":I
    .restart local v23    # "$this$associate$iv":Ljava/lang/Iterable;
    .restart local v24    # "$i$f$associate":I
    nop

    .line 121
    .end local v5    # "capacity$iv":I
    .end local v23    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$associate":I
    move-object/from16 v17, v4

    .line 122
    .local v17, "hs":Ljava/util/Map;
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    move-object/from16 v18, v0

    .line 123
    .local v18, "out":Ljava/util/LinkedHashMap;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v0

    check-cast v19, Ljava/util/List;

    .line 124
    .local v19, "todo":Ljava/util/List;
    invoke-interface/range {v17 .. v17}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v25, v5

    check-cast v25, Ljava/lang/String;

    .local v25, "n":Ljava/lang/String;
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    .local v3, "h":Lkotlin/Pair;
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 125
    .local v5, "e":Ljava/util/Map;
    if-eqz v5, :cond_4

    const/16 v20, 0x1

    const-string v6, "at"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_1

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v22

    goto :goto_2

    :cond_1
    const-wide/16 v22, 0x0

    :goto_2
    sub-long v22, v14, v22

    const-string v6, "mr"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_3

    const-string v6, "cf"

    invoke-static {v5, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_2

    goto :goto_3

    :cond_2
    const-wide/32 v26, 0x5265c00

    goto :goto_4

    :cond_3
    :goto_3
    const-wide/32 v26, 0x240c8400

    :goto_4
    cmp-long v6, v22, v26

    if-gez v6, :cond_4

    move/from16 v6, v20

    goto :goto_5

    :cond_4
    const/4 v6, 0x0

    :goto_5
    move/from16 v20, v6

    .line 126
    .local v20, "fresh":Z
    if-nez v20, :cond_7

    if-eqz v5, :cond_5

    if-nez p2, :cond_5

    move-object/from16 v24, v0

    move-object/from16 v6, v25

    goto :goto_6

    :cond_5
    move-object/from16 v4, v18

    check-cast v4, Ljava/util/Map;

    new-instance v24, Lcom/pymcl/core/mods/ModIdent;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v26, v6

    check-cast v26, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v27

    const/16 v37, 0x7f8

    const/16 v38, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v24 .. v38}, Lcom/pymcl/core/mods/ModIdent;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v24

    move-object/from16 v24, v0

    move-object v0, v6

    move-object/from16 v6, v25

    .end local v25    # "n":Ljava/lang/String;
    .local v6, "n":Ljava/lang/String;
    invoke-interface {v4, v6, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_6

    move-object/from16 v0, v19

    check-cast v0, Ljava/util/Collection;

    invoke-static {v6, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    move-object/from16 v0, v24

    goto/16 :goto_1

    .end local v6    # "n":Ljava/lang/String;
    .restart local v25    # "n":Ljava/lang/String;
    :cond_7
    move-object/from16 v24, v0

    move-object/from16 v6, v25

    .end local v25    # "n":Ljava/lang/String;
    .restart local v6    # "n":Ljava/lang/String;
    :goto_6
    move-object/from16 v0, v18

    check-cast v0, Ljava/util/Map;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Ljava/lang/Number;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Number;->longValue()J

    move-result-wide v22

    move-object v7, v2

    move-object/from16 v16, v3

    move-object v2, v5

    move-object v3, v6

    move-wide/from16 v25, v14

    move-wide/from16 v5, v22

    const/16 v14, 0xa

    const/16 v15, 0x10

    .end local v5    # "e":Ljava/util/Map;
    .end local v6    # "n":Ljava/lang/String;
    .end local v14    # "now":J
    .local v2, "e":Ljava/util/Map;
    .local v3, "n":Ljava/lang/String;
    .local v7, "cache":Ljava/util/Map;
    .local v16, "h":Lkotlin/Pair;
    .local v25, "now":J
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/core/mods/ModTools;->fromCache(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;J)Lcom/pymcl/core/mods/ModIdent;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v7

    move-object/from16 v0, v24

    move-wide/from16 v14, v25

    move-object/from16 v7, p1

    goto/16 :goto_1

    .line 127
    .end local v3    # "n":Ljava/lang/String;
    .end local v7    # "cache":Ljava/util/Map;
    .end local v16    # "h":Lkotlin/Pair;
    .end local v20    # "fresh":Z
    .end local v25    # "now":J
    .local v2, "cache":Ljava/util/Map;
    .restart local v14    # "now":J
    :cond_8
    move-object v7, v2

    move-wide/from16 v25, v14

    const/16 v14, 0xa

    const/16 v15, 0x10

    const/16 v20, 0x1

    .end local v2    # "cache":Ljava/util/Map;
    .end local v14    # "now":J
    .restart local v7    # "cache":Ljava/util/Map;
    .restart local v25    # "now":J
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    move-object/from16 v0, v18

    check-cast v0, Ljava/util/Map;

    return-object v0

    .line 129
    :cond_9
    const/4 v2, 0x2

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .local v0, "$this$identify_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    const/4 v5, 0x0

    .line 130
    .local v5, "$i$a$-runCatching-ModTools$identify$mrVers$1":I
    iget-object v6, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    iget-object v15, v0, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v15}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v28

    const-string v29, "/version_files"

    const-string v31, "POST"

    sget-object v15, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    new-array v3, v2, [Lkotlin/Pair;

    move-object/from16 v24, v19

    check-cast v24, Ljava/lang/Iterable;

    move-object/from16 v27, v24

    .local v27, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v24, 0x0

    .line 303
    .local v24, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v35, v0

    move-object/from16 v4, v27

    const/16 v34, 0x0

    .end local v0    # "$this$identify_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    .end local v27    # "$this$map$iv":Ljava/lang/Iterable;
    .local v4, "$this$map$iv":Ljava/lang/Iterable;
    .local v35, "$this$identify_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    invoke-static {v4, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v0, v4

    .local v0, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v27, 0x0

    .line 304
    .local v27, "$i$f$mapTo":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_7
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v32

    if-eqz v32, :cond_a

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v32

    .line 305
    .local v32, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v36, v32

    check-cast v36, Lkotlin/Pair;

    .local v36, "it":Lkotlin/Pair;
    const/16 v37, 0x0

    .line 130
    .local v37, "$i$a$-map-ModTools$identify$mrVers$1$1":I
    invoke-virtual/range {v36 .. v36}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v38

    check-cast v38, Lkotlin/Pair;

    invoke-virtual/range {v38 .. v38}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v38

    move-object/from16 v14, v38

    check-cast v14, Ljava/lang/String;

    .line 305
    .end local v36    # "it":Lkotlin/Pair;
    .end local v37    # "$i$a$-map-ModTools$identify$mrVers$1$1":I
    invoke-interface {v2, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v14, 0xa

    goto :goto_7

    .line 306
    .end local v32    # "item$iv$iv":Ljava/lang/Object;
    :cond_a
    nop

    .end local v0    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v27    # "$i$f$mapTo":I
    move-object v0, v2

    check-cast v0, Ljava/util/List;

    .line 303
    nop

    .line 130
    .end local v4    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$map":I
    invoke-static {v11, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v3, v34

    const-string v0, "algorithm"

    invoke-static {v0, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v3, v20

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    move/from16 v3, v34

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v15, v0, v3, v2, v4}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v32

    const/16 v30, 0x0

    move-object/from16 v27, v6

    invoke-virtual/range {v27 .. v32}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_b

    const/4 v3, 0x0

    new-array v0, v3, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 129
    .end local v5    # "$i$a$-runCatching-ModTools$identify$mrVers$1":I
    .end local v35    # "$this$identify_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    :cond_b
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_8

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_8
    const/4 v3, 0x0

    new-array v2, v3, [Lkotlin/Pair;

    .line 131
    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object v0, v2

    :cond_c
    check-cast v0, Ljava/util/Map;

    .line 129
    move-object v2, v0

    .line 132
    .local v2, "mrVers":Ljava/util/Map;
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 307
    .local v3, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 316
    .local v6, "$i$f$mapNotNullTo":I
    move-object v14, v5

    .local v14, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 317
    .local v15, "$i$f$forEach":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :goto_9
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    move/from16 v28, v3

    .end local v3    # "$i$f$mapNotNull":I
    .local v28, "$i$f$mapNotNull":I
    const-string v3, "project_id"

    if-eqz v27, :cond_e

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    .local v27, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v29, v27

    .local v29, "element$iv$iv":Ljava/lang/Object;
    const/16 v30, 0x0

    .line 316
    .local v30, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "it":Ljava/lang/Object;
    const/16 v32, 0x0

    .line 132
    .local v32, "$i$a$-mapNotNull-ModTools$identify$mrProjects$1":I
    move-object/from16 v35, v0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v35, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    invoke-static/range {v31 .. v31}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    .end local v31    # "it":Ljava/lang/Object;
    .end local v32    # "$i$a$-mapNotNull-ModTools$identify$mrProjects$1":I
    if-eqz v0, :cond_d

    .line 318
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 316
    .local v3, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 317
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v29    # "element$iv$iv":Ljava/lang/Object;
    .end local v30    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_d
    move/from16 v3, v28

    move-object/from16 v0, v35

    .end local v27    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_9

    .line 319
    .end local v35    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_e
    move-object/from16 v35, v0

    .line 320
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$forEach":I
    .restart local v35    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 307
    nop

    .end local v28    # "$i$f$mapNotNull":I
    .end local v35    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 132
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    .line 133
    .local v4, "mrProjects":Ljava/util/List;
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-string v5, ""

    const-string v6, "id"

    if-eqz v0, :cond_f

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v32, v4

    move-object/from16 v24, v5

    move-object/from16 v29, v7

    goto/16 :goto_f

    :cond_f
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .local v0, "$this$identify_u24lambda_u243":Lcom/pymcl/core/mods/ModTools;
    const/4 v14, 0x0

    .line 134
    .local v14, "$i$a$-runCatching-ModTools$identify$mrInfo$1":I
    iget-object v15, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object/from16 v24, v5

    :try_start_2
    iget-object v5, v0, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v5}, Lcom/pymcl/core/download/Mirrors;->modrinthBases()Ljava/util/List;

    move-result-object v41

    sget-object v5, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    move-object/from16 v27, v0

    .end local v0    # "$this$identify_u24lambda_u243":Lcom/pymcl/core/mods/ModTools;
    .local v27, "$this$identify_u24lambda_u243":Lcom/pymcl/core/mods/ModTools;
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v29, v7

    move/from16 v28, v14

    move-object/from16 v40, v15

    const/4 v7, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x0

    .end local v7    # "cache":Ljava/util/Map;
    .end local v14    # "$i$a$-runCatching-ModTools$identify$mrInfo$1":I
    .local v28, "$i$a$-runCatching-ModTools$identify$mrInfo$1":I
    .local v29, "cache":Ljava/util/Map;
    :try_start_3
    invoke-static {v0, v4, v15, v14, v7}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "/projects?ids="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v42

    const/16 v46, 0x18

    const/16 v47, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    invoke-static/range {v40 .. v47}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core$default(Lcom/pymcl/core/mods/ModCatalog;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 135
    nop

    .local v0, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 321
    .local v5, "$i$f$associateBy":I
    const/16 v14, 0xa

    invoke-static {v0, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-static {v7}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v7

    const/16 v15, 0x10

    invoke-static {v7, v15}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v7

    .line 322
    .local v7, "capacity$iv":I
    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v14, Ljava/util/Map;

    .local v14, "destination$iv$iv":Ljava/util/Map;
    move-object v15, v0

    .local v15, "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    const/16 v30, 0x0

    .line 323
    .local v30, "$i$f$associateByTo":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_a
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v32

    if-eqz v32, :cond_11

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v32

    move-object/from16 v35, v32

    .line 324
    .local v35, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v32, v35

    check-cast v32, Ljava/util/Map;

    move-object/from16 v36, v32

    .local v36, "it":Ljava/util/Map;
    const/16 v32, 0x0

    .line 135
    .local v32, "$i$a$-associateBy-ModTools$identify$mrInfo$1$1":I
    move-object/from16 v37, v0

    move-object/from16 v0, v36

    .end local v36    # "it":Ljava/util/Map;
    .local v0, "it":Ljava/util/Map;
    .local v37, "$this$associateBy$iv":Ljava/lang/Iterable;
    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v36
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v36, :cond_10

    move-object/from16 v0, v24

    goto :goto_b

    :cond_10
    move-object/from16 v0, v36

    .line 324
    .end local v0    # "it":Ljava/util/Map;
    .end local v32    # "$i$a$-associateBy-ModTools$identify$mrInfo$1$1":I
    :goto_b
    move-object/from16 v32, v4

    move-object/from16 v4, v35

    .end local v35    # "element$iv$iv":Ljava/lang/Object;
    .local v4, "element$iv$iv":Ljava/lang/Object;
    .local v32, "mrProjects":Ljava/util/List;
    :try_start_4
    invoke-interface {v14, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v4, v32

    move-object/from16 v0, v37

    goto :goto_a

    .line 326
    .end local v32    # "mrProjects":Ljava/util/List;
    .end local v37    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .local v0, "$this$associateBy$iv":Ljava/lang/Iterable;
    .local v4, "mrProjects":Ljava/util/List;
    :cond_11
    move-object/from16 v37, v0

    move-object/from16 v32, v4

    .line 322
    .end local v0    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .end local v4    # "mrProjects":Ljava/util/List;
    .end local v14    # "destination$iv$iv":Ljava/util/Map;
    .end local v15    # "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    .end local v30    # "$i$f$associateByTo":I
    .restart local v32    # "mrProjects":Ljava/util/List;
    .restart local v37    # "$this$associateBy$iv":Ljava/lang/Iterable;
    nop

    .line 135
    .end local v5    # "$i$f$associateBy":I
    .end local v7    # "capacity$iv":I
    .end local v37    # "$this$associateBy$iv":Ljava/lang/Iterable;
    nop

    .line 133
    .end local v27    # "$this$identify_u24lambda_u243":Lcom/pymcl/core/mods/ModTools;
    .end local v28    # "$i$a$-runCatching-ModTools$identify$mrInfo$1":I
    invoke-static {v14}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_e

    :catchall_1
    move-exception v0

    goto :goto_d

    .end local v32    # "mrProjects":Ljava/util/List;
    .restart local v4    # "mrProjects":Ljava/util/List;
    :catchall_2
    move-exception v0

    move-object/from16 v32, v4

    .end local v4    # "mrProjects":Ljava/util/List;
    .restart local v32    # "mrProjects":Ljava/util/List;
    goto :goto_d

    .end local v29    # "cache":Ljava/util/Map;
    .end local v32    # "mrProjects":Ljava/util/List;
    .restart local v4    # "mrProjects":Ljava/util/List;
    .local v7, "cache":Ljava/util/Map;
    :catchall_3
    move-exception v0

    move-object/from16 v32, v4

    goto :goto_c

    :catchall_4
    move-exception v0

    move-object/from16 v32, v4

    move-object/from16 v24, v5

    :goto_c
    move-object/from16 v29, v7

    .end local v4    # "mrProjects":Ljava/util/List;
    .end local v7    # "cache":Ljava/util/Map;
    .restart local v29    # "cache":Ljava/util/Map;
    .restart local v32    # "mrProjects":Ljava/util/List;
    :goto_d
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 135
    :goto_e
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    move-object v0, v4

    :cond_12
    check-cast v0, Ljava/util/Map;

    .line 133
    :goto_f
    move-object v4, v0

    .line 137
    .local v4, "mrInfo":Ljava/util/Map;
    :try_start_5
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .local v0, "$this$identify_u24lambda_u244":Lcom/pymcl/core/mods/ModTools;
    const/4 v5, 0x0

    .line 138
    .local v5, "$i$a$-runCatching-ModTools$identify$cfMatches$1":I
    iget-object v7, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    iget-object v14, v0, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v14}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v41

    const-string v42, "/fingerprints/432"

    const-string v44, "POST"

    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move-object/from16 v27, v0

    move/from16 v15, v20

    .end local v0    # "$this$identify_u24lambda_u244":Lcom/pymcl/core/mods/ModTools;
    .local v27, "$this$identify_u24lambda_u244":Lcom/pymcl/core/mods/ModTools;
    new-array v0, v15, [Lkotlin/Pair;

    move-object/from16 v15, v19

    check-cast v15, Ljava/lang/Iterable;

    .local v15, "$this$map$iv":Ljava/lang/Iterable;
    const/16 v28, 0x0

    .line 327
    .local v28, "$i$f$map":I
    move-object/from16 v30, v0

    new-instance v0, Ljava/util/ArrayList;

    move/from16 v31, v5

    move-object/from16 v40, v7

    const/16 v5, 0xa

    .end local v5    # "$i$a$-runCatching-ModTools$identify$cfMatches$1":I
    .local v31, "$i$a$-runCatching-ModTools$identify$cfMatches$1":I
    invoke-static {v15, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v15

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 328
    .local v7, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v35

    :goto_10
    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->hasNext()Z

    move-result v36

    if-eqz v36, :cond_13

    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v36

    .line 329
    .local v36, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v37, v36

    check-cast v37, Lkotlin/Pair;

    .local v37, "it":Lkotlin/Pair;
    const/16 v38, 0x0

    .line 138
    .local v38, "$i$a$-map-ModTools$identify$cfMatches$1$1":I
    invoke-virtual/range {v37 .. v37}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Lkotlin/Pair;

    invoke-virtual/range {v43 .. v43}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Ljava/lang/Number;

    invoke-virtual/range {v43 .. v43}, Ljava/lang/Number;->longValue()J

    move-result-wide v45

    move-object/from16 v37, v5

    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v38    # "$i$a$-map-ModTools$identify$cfMatches$1$1":I
    .local v37, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    invoke-static/range {v45 .. v46}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 329
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v37

    goto :goto_10

    .line 330
    .end local v36    # "item$iv$iv":Ljava/lang/Object;
    .end local v37    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_13
    move-object/from16 v37, v5

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v0, Ljava/util/List;

    .line 327
    nop

    .line 138
    .end local v15    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$map":I
    invoke-static {v10, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v15, 0x0

    aput-object v0, v30, v15

    invoke-static/range {v30 .. v30}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v5, 0x2

    const/4 v7, 0x0

    invoke-static {v14, v0, v15, v5, v7}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v45

    const/16 v43, 0x1

    invoke-virtual/range {v40 .. v45}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 139
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 137
    .end local v27    # "$this$identify_u24lambda_u244":Lcom/pymcl/core/mods/ModTools;
    .end local v31    # "$i$a$-runCatching-ModTools$identify$cfMatches$1":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_11

    :catchall_5
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 140
    :goto_11
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_14

    :goto_12
    goto/16 :goto_14

    :cond_14
    :try_start_6
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .local v5, "it":Ljava/lang/Throwable;
    const/4 v0, 0x0

    .line 141
    .local v0, "$i$a$-recoverCatching-ModTools$identify$cfMatches$2":I
    iget-object v7, v1, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    iget-object v14, v1, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v14}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v41

    const-string v42, "/fingerprints"

    const-string v44, "POST"

    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move/from16 v27, v0

    const/4 v15, 0x1

    .end local v0    # "$i$a$-recoverCatching-ModTools$identify$cfMatches$2":I
    .local v27, "$i$a$-recoverCatching-ModTools$identify$cfMatches$2":I
    new-array v0, v15, [Lkotlin/Pair;

    move-object/from16 v15, v19

    check-cast v15, Ljava/lang/Iterable;

    .restart local v15    # "$this$map$iv":Ljava/lang/Iterable;
    const/16 v28, 0x0

    .line 331
    .restart local v28    # "$i$f$map":I
    move-object/from16 v30, v0

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v31, v5

    move-object/from16 v40, v7

    const/16 v5, 0xa

    .end local v5    # "it":Ljava/lang/Throwable;
    .local v31, "it":Ljava/lang/Throwable;
    invoke-static {v15, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v15

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 332
    .restart local v7    # "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v35

    :goto_13
    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->hasNext()Z

    move-result v36

    if-eqz v36, :cond_15

    invoke-interface/range {v35 .. v35}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v36

    .line 333
    .restart local v36    # "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v37, v36

    check-cast v37, Lkotlin/Pair;

    .local v37, "it":Lkotlin/Pair;
    const/16 v38, 0x0

    .line 141
    .local v38, "$i$a$-map-ModTools$identify$cfMatches$2$1":I
    invoke-virtual/range {v37 .. v37}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Lkotlin/Pair;

    invoke-virtual/range {v43 .. v43}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v43

    check-cast v43, Ljava/lang/Number;

    invoke-virtual/range {v43 .. v43}, Ljava/lang/Number;->longValue()J

    move-result-wide v45

    move-object/from16 v37, v5

    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v38    # "$i$a$-map-ModTools$identify$cfMatches$2$1":I
    .local v37, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    invoke-static/range {v45 .. v46}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 333
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v37

    goto :goto_13

    .line 334
    .end local v36    # "item$iv$iv":Ljava/lang/Object;
    .end local v37    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .restart local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    :cond_15
    move-object/from16 v37, v5

    .end local v0    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v0, Ljava/util/List;

    .line 331
    nop

    .line 141
    .end local v15    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$map":I
    invoke-static {v10, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v15, 0x0

    aput-object v0, v30, v15

    invoke-static/range {v30 .. v30}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v5, 0x2

    const/4 v7, 0x0

    invoke-static {v14, v0, v15, v5, v7}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v45

    const/16 v43, 0x1

    invoke-virtual/range {v40 .. v45}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    .line 142
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 140
    .end local v27    # "$i$a$-recoverCatching-ModTools$identify$cfMatches$2":I
    .end local v31    # "it":Ljava/lang/Throwable;
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto/16 :goto_12

    :catchall_6
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto/16 :goto_12

    .line 143
    :goto_14
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_16

    move-object v0, v5

    :cond_16
    check-cast v0, Ljava/util/List;

    .line 137
    move-object v5, v0

    .line 144
    .local v5, "cfMatches":Ljava/util/List;
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    move-object v7, v0

    .line 145
    .local v7, "cfByFp":Ljava/util/HashMap;
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v10, "file"

    if-eqz v8, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    .local v8, "m":Ljava/util/Map;
    invoke-static {v8, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    if-nez v10, :cond_17

    goto :goto_15

    .local v10, "f":Ljava/util/Map;
    :cond_17
    const-string v14, "fileFingerprint"

    invoke-static {v10, v14}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v14

    if-eqz v14, :cond_18

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    .line 296
    .local v14, "it":J
    const/16 v27, 0x0

    .line 145
    .local v27, "$i$a$-let-ModTools$identify$1":I
    move-object/from16 v28, v0

    move-object v0, v7

    check-cast v0, Ljava/util/Map;

    move-object/from16 v30, v5

    .end local v5    # "cfMatches":Ljava/util/List;
    .local v30, "cfMatches":Ljava/util/List;
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v0, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v14    # "it":J
    .end local v27    # "$i$a$-let-ModTools$identify$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_16

    .end local v30    # "cfMatches":Ljava/util/List;
    .restart local v5    # "cfMatches":Ljava/util/List;
    :cond_18
    move-object/from16 v28, v0

    move-object/from16 v30, v5

    .end local v5    # "cfMatches":Ljava/util/List;
    .restart local v30    # "cfMatches":Ljava/util/List;
    :goto_16
    move-object/from16 v0, v28

    move-object/from16 v5, v30

    goto :goto_15

    .line 146
    .end local v8    # "m":Ljava/util/Map;
    .end local v10    # "f":Ljava/util/Map;
    .end local v30    # "cfMatches":Ljava/util/List;
    .restart local v5    # "cfMatches":Ljava/util/List;
    :cond_19
    move-object/from16 v30, v5

    .end local v5    # "cfMatches":Ljava/util/List;
    .restart local v30    # "cfMatches":Ljava/util/List;
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v5, "<get-values>(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 335
    .local v5, "$i$f$mapNotNull":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v0

    .local v14, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 344
    .local v15, "$i$f$mapNotNullTo":I
    move-object/from16 v27, v14

    .local v27, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v28, 0x0

    .line 345
    .local v28, "$i$f$forEach":I
    invoke-interface/range {v27 .. v27}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v31

    :goto_17
    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->hasNext()Z

    move-result v35

    move/from16 v36, v5

    .end local v5    # "$i$f$mapNotNull":I
    .local v36, "$i$f$mapNotNull":I
    const-string v5, "modId"

    if-eqz v35, :cond_1c

    invoke-interface/range {v31 .. v31}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v35

    .local v35, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v37, v35

    .local v37, "element$iv$iv":Ljava/lang/Object;
    const/16 v38, 0x0

    .line 344
    .local v38, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v40, v0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v40, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    move-object/from16 v0, v37

    check-cast v0, Ljava/util/Map;

    .local v0, "it":Ljava/util/Map;
    const/16 v41, 0x0

    .line 146
    .local v41, "$i$a$-mapNotNull-ModTools$identify$cfIds$1":I
    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v42

    if-nez v42, :cond_1a

    move-object/from16 v43, v14

    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .local v43, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    invoke-static {v0, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    invoke-static {v14, v5}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v42

    goto :goto_18

    .end local v43    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .restart local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    :cond_1a
    move-object/from16 v43, v14

    .line 344
    .end local v0    # "it":Ljava/util/Map;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v41    # "$i$a$-mapNotNull-ModTools$identify$cfIds$1":I
    .restart local v43    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    :goto_18
    if-eqz v42, :cond_1b

    move-object/from16 v0, v42

    .line 346
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .line 344
    .local v5, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v8, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 345
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v5    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v37    # "element$iv$iv":Ljava/lang/Object;
    .end local v38    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_1b
    move/from16 v5, v36

    move-object/from16 v0, v40

    move-object/from16 v14, v43

    .end local v35    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_17

    .line 347
    .end local v40    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v43    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    :cond_1c
    move-object/from16 v40, v0

    move-object/from16 v43, v14

    .line 348
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v27    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v28    # "$i$f$forEach":I
    .restart local v40    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v43    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "$i$f$mapNotNullTo":I
    .end local v43    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    move-object v0, v8

    check-cast v0, Ljava/util/List;

    .line 335
    nop

    .end local v36    # "$i$f$mapNotNull":I
    .end local v40    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 146
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v8

    .line 147
    .local v8, "cfIds":Ljava/util/List;
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v28, v8

    goto/16 :goto_1d

    :cond_1d
    :try_start_7
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .local v0, "$this$identify_u24lambda_u248":Lcom/pymcl/core/mods/ModTools;
    const/4 v14, 0x0

    .line 148
    .local v14, "$i$a$-runCatching-ModTools$identify$cfInfo$1":I
    iget-object v15, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    move/from16 v27, v14

    .end local v14    # "$i$a$-runCatching-ModTools$identify$cfInfo$1":I
    .local v27, "$i$a$-runCatching-ModTools$identify$cfInfo$1":I
    iget-object v14, v0, Lcom/pymcl/core/mods/ModTools;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v14}, Lcom/pymcl/core/download/Mirrors;->curseforgeBases()Ljava/util/List;

    move-result-object v41

    const-string v42, "/mods"

    const-string v44, "POST"

    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move-object/from16 v40, v15

    const/4 v15, 0x1

    new-array v15, v15, [Lkotlin/Pair;

    move-object/from16 v20, v0

    .end local v0    # "$this$identify_u24lambda_u248":Lcom/pymcl/core/mods/ModTools;
    .local v20, "$this$identify_u24lambda_u248":Lcom/pymcl/core/mods/ModTools;
    const-string v0, "modIds"

    invoke-static {v0, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    move-object/from16 v28, v8

    const/4 v8, 0x0

    .end local v8    # "cfIds":Ljava/util/List;
    .local v28, "cfIds":Ljava/util/List;
    :try_start_8
    aput-object v0, v15, v8

    invoke-static {v15}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v15, 0x0

    invoke-static {v14, v0, v8, v1, v15}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v45

    const/16 v43, 0x1

    invoke-virtual/range {v40 .. v45}, Lcom/pymcl/core/mods/ModCatalog;->getJson$PyMCL_Android_core(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v12}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 149
    nop

    .local v0, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 349
    .local v1, "$i$f$associateBy":I
    const/16 v14, 0xa

    invoke-static {v0, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v8

    const/16 v12, 0x10

    invoke-static {v8, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v8

    .line 350
    .local v8, "capacity$iv":I
    new-instance v12, Ljava/util/LinkedHashMap;

    invoke-direct {v12, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v12, Ljava/util/Map;

    .local v12, "destination$iv$iv":Ljava/util/Map;
    move-object v14, v0

    .local v14, "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 351
    .local v16, "$i$f$associateByTo":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_19
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v31

    if-eqz v31, :cond_1f

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v33, v31

    .line 352
    .local v33, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v31, v33

    check-cast v31, Ljava/util/Map;

    move-object/from16 v34, v31

    .local v34, "it":Ljava/util/Map;
    const/16 v31, 0x0

    .line 149
    .local v31, "$i$a$-associateBy-ModTools$identify$cfInfo$1$1":I
    move-object/from16 v15, v34

    .end local v34    # "it":Ljava/util/Map;
    .local v15, "it":Ljava/util/Map;
    invoke-static {v15, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v34

    if-eqz v34, :cond_1e

    invoke-virtual/range {v34 .. v34}, Ljava/lang/Long;->longValue()J

    move-result-wide v36

    goto :goto_1a

    :cond_1e
    const-wide/16 v36, 0x0

    .end local v15    # "it":Ljava/util/Map;
    .end local v31    # "$i$a$-associateBy-ModTools$identify$cfInfo$1$1":I
    :goto_1a
    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    .line 352
    move-object/from16 v31, v0

    move-object/from16 v0, v33

    .end local v33    # "element$iv$iv":Ljava/lang/Object;
    .local v0, "element$iv$iv":Ljava/lang/Object;
    .local v31, "$this$associateBy$iv":Ljava/lang/Iterable;
    invoke-interface {v12, v15, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, v31

    const/4 v15, 0x0

    goto :goto_19

    .line 354
    .end local v31    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .local v0, "$this$associateBy$iv":Ljava/lang/Iterable;
    :cond_1f
    move-object/from16 v31, v0

    .line 350
    .end local v0    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .end local v12    # "destination$iv$iv":Ljava/util/Map;
    .end local v14    # "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    .end local v16    # "$i$f$associateByTo":I
    .restart local v31    # "$this$associateBy$iv":Ljava/lang/Iterable;
    nop

    .line 149
    .end local v1    # "$i$f$associateBy":I
    .end local v8    # "capacity$iv":I
    .end local v31    # "$this$associateBy$iv":Ljava/lang/Iterable;
    nop

    .line 147
    .end local v20    # "$this$identify_u24lambda_u248":Lcom/pymcl/core/mods/ModTools;
    .end local v27    # "$i$a$-runCatching-ModTools$identify$cfInfo$1":I
    invoke-static {v12}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_1c

    :catchall_7
    move-exception v0

    goto :goto_1b

    .end local v28    # "cfIds":Ljava/util/List;
    .local v8, "cfIds":Ljava/util/List;
    :catchall_8
    move-exception v0

    move-object/from16 v28, v8

    .end local v8    # "cfIds":Ljava/util/List;
    .restart local v28    # "cfIds":Ljava/util/List;
    :goto_1b
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 149
    :goto_1c
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    move-object v0, v1

    :cond_20
    check-cast v0, Ljava/util/Map;

    .line 147
    :goto_1d
    nop

    .line 150
    .local v0, "cfInfo":Ljava/util/Map;
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_30

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/Pair;

    invoke-virtual {v8}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v37, v12

    check-cast v37, Ljava/lang/String;

    .local v37, "n":Ljava/lang/String;
    invoke-virtual {v8}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/Pair;

    .line 151
    .local v8, "h":Lkotlin/Pair;
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    invoke-static {v2, v12}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v12

    .local v12, "v":Ljava/util/Map;
    invoke-static {v12, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v41

    .local v41, "pid":Ljava/lang/String;
    if-eqz v41, :cond_21

    move-object/from16 v14, v41

    .line 296
    .local v14, "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 151
    .local v15, "$i$a$-let-ModTools$identify$p$1":I
    invoke-interface {v4, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v14, v16

    check-cast v14, Ljava/util/Map;

    .end local v14    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-let-ModTools$identify$p$1":I
    goto :goto_1f

    :cond_21
    const/4 v14, 0x0

    .line 152
    .local v14, "p":Ljava/util/Map;
    :goto_1f
    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v7, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map;

    .local v15, "cm":Ljava/util/Map;
    if-eqz v15, :cond_23

    move-object/from16 v16, v15

    .line 296
    .local v16, "it":Ljava/util/Map;
    const/16 v20, 0x0

    .line 152
    .local v20, "$i$a$-let-ModTools$identify$cid$1":I
    move-object/from16 v21, v1

    move-object/from16 v1, v16

    .end local v16    # "it":Ljava/util/Map;
    .local v1, "it":Ljava/util/Map;
    invoke-static {v1, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v16

    if-nez v16, :cond_22

    move-object/from16 v22, v2

    .end local v2    # "mrVers":Ljava/util/Map;
    .local v22, "mrVers":Ljava/util/Map;
    invoke-static {v1, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2, v5}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_20

    .end local v22    # "mrVers":Ljava/util/Map;
    .restart local v2    # "mrVers":Ljava/util/Map;
    :cond_22
    move-object/from16 v22, v2

    .end local v1    # "it":Ljava/util/Map;
    .end local v2    # "mrVers":Ljava/util/Map;
    .end local v20    # "$i$a$-let-ModTools$identify$cid$1":I
    .restart local v22    # "mrVers":Ljava/util/Map;
    :goto_20
    move-object/from16 v44, v16

    goto :goto_21

    .end local v22    # "mrVers":Ljava/util/Map;
    .restart local v2    # "mrVers":Ljava/util/Map;
    :cond_23
    move-object/from16 v21, v1

    move-object/from16 v22, v2

    .end local v2    # "mrVers":Ljava/util/Map;
    .restart local v22    # "mrVers":Ljava/util/Map;
    const/16 v44, 0x0

    .local v44, "cid":Ljava/lang/Long;
    :goto_21
    if-eqz v44, :cond_24

    move-object/from16 v1, v44

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    .line 296
    .local v1, "it":J
    const/16 v16, 0x0

    .line 152
    .local v16, "$i$a$-let-ModTools$identify$ci$1":I
    move-wide/from16 v33, v1

    .end local v1    # "it":J
    .local v33, "it":J
    invoke-static/range {v33 .. v34}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    .end local v16    # "$i$a$-let-ModTools$identify$ci$1":I
    .end local v33    # "it":J
    goto :goto_22

    :cond_24
    const/4 v1, 0x0

    .line 153
    .local v1, "ci":Ljava/util/Map;
    :goto_22
    invoke-static {v12, v13}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 355
    .local v16, "$i$f$firstOrNull":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_23
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_26

    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v27, v0

    .end local v0    # "cfInfo":Ljava/util/Map;
    .local v23, "element$iv":Ljava/lang/Object;
    .local v27, "cfInfo":Ljava/util/Map;
    move-object/from16 v0, v23

    check-cast v0, Ljava/util/Map;

    .local v0, "it":Ljava/util/Map;
    const/16 v31, 0x0

    .line 153
    .local v31, "$i$a$-firstOrNull-ModTools$identify$vf$1":I
    move-object/from16 v33, v2

    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .local v33, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v34, v0

    .end local v0    # "it":Ljava/util/Map;
    .restart local v34    # "it":Ljava/util/Map;
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    .line 355
    .end local v31    # "$i$a$-firstOrNull-ModTools$identify$vf$1":I
    .end local v34    # "it":Ljava/util/Map;
    if-eqz v0, :cond_25

    goto :goto_24

    :cond_25
    move-object/from16 v0, v27

    move-object/from16 v2, v33

    goto :goto_23

    .line 356
    .end local v23    # "element$iv":Ljava/lang/Object;
    .end local v27    # "cfInfo":Ljava/util/Map;
    .end local v33    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .local v0, "cfInfo":Ljava/util/Map;
    .restart local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :cond_26
    move-object/from16 v27, v0

    move-object/from16 v33, v2

    .end local v0    # "cfInfo":Ljava/util/Map;
    .end local v2    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .restart local v27    # "cfInfo":Ljava/util/Map;
    .restart local v33    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/16 v23, 0x0

    .line 153
    .end local v16    # "$i$f$firstOrNull":I
    .end local v33    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    :goto_24
    move-object/from16 v0, v23

    check-cast v0, Ljava/util/Map;

    .line 154
    .local v0, "vf":Ljava/util/Map;
    new-instance v36, Lcom/pymcl/core/mods/ModIdent;

    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v38, v2

    check-cast v38, Ljava/lang/String;

    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v39

    invoke-static {v12, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v42

    if-eqz v0, :cond_27

    const-string v2, "url"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v43, v2

    goto :goto_25

    :cond_27
    const/16 v43, 0x0

    :goto_25
    if-eqz v15, :cond_28

    invoke-static {v15, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    goto :goto_26

    :cond_28
    const/4 v2, 0x0

    :goto_26
    invoke-static {v2, v6}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v45

    .line 155
    const-string v2, "title"

    invoke-static {v14, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v0

    .end local v0    # "vf":Ljava/util/Map;
    .local v16, "vf":Ljava/util/Map;
    const-string v0, "displayName"

    move-object/from16 v20, v2

    const-string v2, "name"

    if-nez v20, :cond_2b

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    if-nez v20, :cond_2b

    if-eqz v15, :cond_29

    invoke-static {v15, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v20

    move-object/from16 v23, v3

    move-object/from16 v3, v20

    goto :goto_27

    :cond_29
    move-object/from16 v23, v3

    const/4 v3, 0x0

    :goto_27
    invoke-static {v3, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2a

    move-object/from16 v46, v24

    goto :goto_28

    :cond_2a
    move-object/from16 v46, v3

    goto :goto_28

    :cond_2b
    move-object/from16 v23, v3

    move-object/from16 v46, v20

    .line 156
    :goto_28
    const-string v3, "icon_url"

    invoke-static {v14, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2c

    const-string v3, "logo"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    move-object/from16 v20, v1

    .end local v1    # "ci":Ljava/util/Map;
    .local v20, "ci":Ljava/util/Map;
    const-string v1, "thumbnailUrl"

    invoke-static {v3, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2d

    move-object/from16 v47, v24

    goto :goto_29

    .end local v20    # "ci":Ljava/util/Map;
    .restart local v1    # "ci":Ljava/util/Map;
    :cond_2c
    move-object/from16 v20, v1

    .end local v1    # "ci":Ljava/util/Map;
    .restart local v20    # "ci":Ljava/util/Map;
    :cond_2d
    move-object/from16 v47, v3

    .line 157
    :goto_29
    const-string v1, "version_number"

    invoke-static {v12, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2f

    invoke-static {v12, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2f

    if-eqz v15, :cond_2e

    invoke-static {v15, v10}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    goto :goto_2a

    :cond_2e
    const/4 v1, 0x0

    :goto_2a
    invoke-static {v1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2f

    move-object/from16 v48, v24

    goto :goto_2b

    :cond_2f
    move-object/from16 v48, v1

    .line 154
    :goto_2b
    invoke-direct/range {v36 .. v48}, Lcom/pymcl/core/mods/ModIdent;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v37

    .end local v37    # "n":Ljava/lang/String;
    .local v0, "n":Ljava/lang/String;
    move-object/from16 v1, v36

    .line 158
    .local v1, "ident":Lcom/pymcl/core/mods/ModIdent;
    move-object/from16 v2, v18

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v3, p0

    .end local v0    # "n":Ljava/lang/String;
    .restart local v37    # "n":Ljava/lang/String;
    invoke-direct {v3, v1}, Lcom/pymcl/core/mods/ModTools;->toCache(Lcom/pymcl/core/mods/ModIdent;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v31, v1

    move-object/from16 v1, v29

    .end local v29    # "cache":Ljava/util/Map;
    .local v1, "cache":Ljava/util/Map;
    .local v31, "ident":Lcom/pymcl/core/mods/ModIdent;
    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    move-object/from16 v0, v27

    goto/16 :goto_1e

    .line 160
    .end local v1    # "cache":Ljava/util/Map;
    .end local v8    # "h":Lkotlin/Pair;
    .end local v12    # "v":Ljava/util/Map;
    .end local v14    # "p":Ljava/util/Map;
    .end local v15    # "cm":Ljava/util/Map;
    .end local v16    # "vf":Ljava/util/Map;
    .end local v20    # "ci":Ljava/util/Map;
    .end local v22    # "mrVers":Ljava/util/Map;
    .end local v27    # "cfInfo":Ljava/util/Map;
    .end local v31    # "ident":Lcom/pymcl/core/mods/ModIdent;
    .end local v37    # "n":Ljava/lang/String;
    .end local v41    # "pid":Ljava/lang/String;
    .end local v44    # "cid":Ljava/lang/Long;
    .local v0, "cfInfo":Ljava/util/Map;
    .local v2, "mrVers":Ljava/util/Map;
    .restart local v29    # "cache":Ljava/util/Map;
    :cond_30
    move-object/from16 v3, p0

    move-object/from16 v27, v0

    move-object/from16 v1, v29

    .end local v0    # "cfInfo":Ljava/util/Map;
    .end local v29    # "cache":Ljava/util/Map;
    .restart local v1    # "cache":Ljava/util/Map;
    .restart local v27    # "cfInfo":Ljava/util/Map;
    invoke-direct {v3, v1}, Lcom/pymcl/core/mods/ModTools;->saveCache(Ljava/util/Map;)V

    .line 161
    move-object/from16 v0, v18

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final identifyDir(Ljava/io/File;ZZ)Ljava/util/Map;
    .locals 11
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "mods"    # Z
    .param p3, "useNetwork"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "ZZ)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModIdent;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    .local v0, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 357
    .local v1, "$i$f$filter":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 358
    .local v4, "$i$f$filterTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    aget-object v7, v3, v6

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 166
    .local v9, "$i$a$-filter-ModTools$identifyDir$1":I
    sget-object v10, Lcom/pymcl/core/mods/ModTools;->Companion:Lcom/pymcl/core/mods/ModTools$Companion;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    invoke-virtual {v10, v8}, Lcom/pymcl/core/mods/ModTools$Companion;->isModFile(Ljava/io/File;)Z

    move-result v10

    goto :goto_1

    :cond_0
    invoke-virtual {v10, v8}, Lcom/pymcl/core/mods/ModTools$Companion;->isPackFile(Ljava/io/File;)Z

    move-result v10

    .line 358
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-filter-ModTools$identifyDir$1":I
    :goto_1
    if-eqz v10, :cond_1

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 359
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$filterTo":I
    check-cast v2, Ljava/util/List;

    .line 357
    nop

    .line 166
    .end local v0    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$filter":I
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 360
    .local v1, "$i$f$sortedBy":I
    new-instance v2, Lcom/pymcl/core/mods/ModTools$identifyDir$$inlined$sortedBy$1;

    invoke-direct {v2}, Lcom/pymcl/core/mods/ModTools$identifyDir$$inlined$sortedBy$1;-><init>()V

    check-cast v2, Ljava/util/Comparator;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 166
    .end local v0    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedBy":I
    if-nez v0, :cond_4

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_4
    invoke-virtual {p0, v0, p3}, Lcom/pymcl/core/mods/ModTools;->identify(Ljava/util/List;Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final missingDeps(Ljava/lang/String;Lcom/pymcl/core/mods/ModFile;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;I)Ljava/util/List;
    .locals 25
    .param p1, "rootId"    # Ljava/lang/String;
    .param p2, "root"    # Lcom/pymcl/core/mods/ModFile;
    .param p3, "installedIds"    # Ljava/util/Set;
    .param p4, "installedNames"    # Ljava/util/Set;
    .param p5, "mc"    # Ljava/lang/String;
    .param p6, "loader"    # Ljava/lang/String;
    .param p7, "maxDepth"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModFile;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModTools$Dep;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    const-string v6, ""

    const-string v0, "rootId"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "root"

    move-object/from16 v7, p2

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "installedIds"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "installedNames"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mc"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loader"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v8, v0

    check-cast v8, Ljava/util/List;

    .local v8, "out":Ljava/util/List;
    new-instance v0, Ljava/util/HashSet;

    move-object v9, v2

    check-cast v9, Ljava/util/Collection;

    invoke-direct {v0, v9}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    move-object v9, v0

    .local v9, "seen":Ljava/util/HashSet;
    move-object v0, v9

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 176
    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModFile;->getRequiredDeps()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 361
    .local v10, "$i$f$filter":I
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    check-cast v11, Ljava/util/Collection;

    .local v11, "destination$iv$iv":Ljava/util/Collection;
    move-object v12, v0

    .local v12, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 362
    .local v13, "$i$f$filterTo":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v15, "element$iv$iv":Ljava/lang/Object;
    .local v16, "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v15

    check-cast v0, Ljava/lang/String;

    .local v0, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 176
    .local v17, "$i$a$-filter-ModTools$missingDeps$layer$1":I
    invoke-virtual {v9, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v18

    .line 362
    .end local v0    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-filter-ModTools$missingDeps$layer$1":I
    if-nez v18, :cond_0

    invoke-interface {v11, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    move-object/from16 v0, v16

    goto :goto_0

    .line 363
    .end local v15    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v16, v0

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v11    # "destination$iv$iv":Ljava/util/Collection;
    .end local v12    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$filterTo":I
    .restart local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v0, v11

    check-cast v0, Ljava/util/List;

    .line 361
    nop

    .line 176
    .end local v10    # "$i$f$filter":I
    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .local v0, "layer":Ljava/util/List;
    const/4 v10, 0x0

    move v11, v10

    move-object v10, v0

    .line 177
    .end local v0    # "layer":Ljava/util/List;
    .local v10, "layer":Ljava/util/List;
    .local v11, "depth":I
    :goto_1
    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_15

    move/from16 v12, p7

    if-ge v11, v12, :cond_16

    .line 178
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v13, v0

    check-cast v13, Ljava/util/List;

    .line 179
    .local v13, "next":Ljava/util/List;
    move-object v0, v10

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    .line 180
    .local v15, "id":Ljava/lang/String;
    invoke-virtual {v9, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 181
    const/16 v16, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .line 296
    .local v0, "$this$missingDeps_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    const/16 v17, 0x0

    .line 181
    .local v17, "$i$a$-runCatching-ModTools$missingDeps$f$1":I
    iget-object v1, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    invoke-virtual {v1, v15, v4, v5}, Lcom/pymcl/core/mods/ModCatalog;->files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/core/mods/ModFile;

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    invoke-virtual {v1, v15, v4, v6}, Lcom/pymcl/core/mods/ModCatalog;->files(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/16 v18, 0x0

    .line 364
    .local v18, "$i$f$firstOrNull":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :cond_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_3

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    .local v20, "element$iv":Ljava/lang/Object;
    move-object/from16 v21, v20

    check-cast v21, Lcom/pymcl/core/mods/ModFile;

    .local v21, "it":Lcom/pymcl/core/mods/ModFile;
    const/16 v22, 0x0

    .line 181
    .local v22, "$i$a$-firstOrNull-ModTools$missingDeps$f$1$1":I
    invoke-virtual/range {v21 .. v21}, Lcom/pymcl/core/mods/ModFile;->getLoaders()Ljava/util/List;

    move-result-object v23

    invoke-interface/range {v23 .. v23}, Ljava/util/List;->isEmpty()Z

    move-result v23

    .line 364
    .end local v21    # "it":Lcom/pymcl/core/mods/ModFile;
    .end local v22    # "$i$a$-firstOrNull-ModTools$missingDeps$f$1$1":I
    if-eqz v23, :cond_2

    goto :goto_3

    .line 365
    .end local v20    # "element$iv":Ljava/lang/Object;
    :cond_3
    move-object/from16 v20, v16

    .end local v1    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v18    # "$i$f$firstOrNull":I
    :goto_3
    move-object/from16 v1, v20

    check-cast v1, Lcom/pymcl/core/mods/ModFile;

    .line 181
    :cond_4
    nop

    .end local v0    # "$this$missingDeps_u24lambda_u241":Lcom/pymcl/core/mods/ModTools;
    .end local v17    # "$i$a$-runCatching-ModTools$missingDeps$f$1":I
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move-object/from16 v0, v16

    :cond_5
    move-object/from16 v18, v0

    check-cast v18, Lcom/pymcl/core/mods/ModFile;

    if-nez v18, :cond_6

    move-object/from16 v1, p1

    goto :goto_2

    .line 182
    .local v18, "f":Lcom/pymcl/core/mods/ModFile;
    :cond_6
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".disabled"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    move-object/from16 v1, p1

    goto/16 :goto_2

    .line 183
    :cond_7
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/core/mods/ModTools;

    .line 296
    .local v0, "$this$missingDeps_u24lambda_u242":Lcom/pymcl/core/mods/ModTools;
    const/4 v1, 0x0

    .line 183
    .local v1, "$i$a$-runCatching-ModTools$missingDeps$hit$1":I
    move/from16 v17, v1

    .end local v1    # "$i$a$-runCatching-ModTools$missingDeps$hit$1":I
    .local v17, "$i$a$-runCatching-ModTools$missingDeps$hit$1":I
    iget-object v1, v0, Lcom/pymcl/core/mods/ModTools;->catalog:Lcom/pymcl/core/mods/ModCatalog;

    invoke-virtual {v1, v15}, Lcom/pymcl/core/mods/ModCatalog;->project(Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;

    move-result-object v1

    .end local v0    # "$this$missingDeps_u24lambda_u242":Lcom/pymcl/core/mods/ModTools;
    .end local v17    # "$i$a$-runCatching-ModTools$missingDeps$hit$1":I
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    move-object/from16 v0, v16

    :cond_8
    check-cast v0, Lcom/pymcl/core/mods/ModHit;

    .line 184
    .local v0, "hit":Lcom/pymcl/core/mods/ModHit;
    move-object v1, v8

    check-cast v1, Ljava/util/Collection;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_b

    check-cast v17, Ljava/lang/CharSequence;

    invoke-interface/range {v17 .. v17}, Ljava/lang/CharSequence;->length()I

    move-result v19

    if-nez v19, :cond_9

    const/16 v19, 0x1

    goto :goto_6

    :cond_9
    const/16 v19, 0x0

    :goto_6
    if-eqz v19, :cond_a

    .line 296
    const/16 v17, 0x0

    .line 184
    .local v17, "$i$a$-ifEmpty-ModTools$missingDeps$1":I
    nop

    .end local v17    # "$i$a$-ifEmpty-ModTools$missingDeps$1":I
    goto :goto_7

    :cond_a
    move-object/from16 v16, v17

    :goto_7
    check-cast v16, Ljava/lang/String;

    if-nez v16, :cond_c

    :cond_b
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/core/mods/ModFile;->getDisplayName()Ljava/lang/String;

    move-result-object v16

    :cond_c
    move-object/from16 v17, v16

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Lcom/pymcl/core/mods/ModHit;->getIconUrl()Ljava/lang/String;

    move-result-object v16

    if-nez v16, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v19, v16

    goto :goto_9

    :cond_e
    :goto_8
    move-object/from16 v19, v6

    :goto_9
    move-object/from16 v21, v0

    .end local v0    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v21, "hit":Lcom/pymcl/core/mods/ModHit;
    sget-object v0, Lcom/pymcl/core/mods/ModCatalog;->Companion:Lcom/pymcl/core/mods/ModCatalog$Companion;

    invoke-virtual {v0, v15}, Lcom/pymcl/core/mods/ModCatalog$Companion;->isMr(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    const-string v0, "Modrinth"

    goto :goto_a

    :cond_f
    const-string v0, "CurseForge"

    :goto_a
    move-object/from16 v20, v0

    move-object/from16 v16, v15

    .end local v15    # "id":Ljava/lang/String;
    .local v16, "id":Ljava/lang/String;
    new-instance v15, Lcom/pymcl/core/mods/ModTools$Dep;

    invoke-direct/range {v15 .. v20}, Lcom/pymcl/core/mods/ModTools$Dep;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/mods/ModFile;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 185
    move-object v0, v13

    check-cast v0, Ljava/util/Collection;

    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/core/mods/ModFile;->getRequiredDeps()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 366
    .local v15, "$i$f$filter":I
    new-instance v17, Ljava/util/ArrayList;

    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v1

    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v19, "$this$filter$iv":Ljava/lang/Iterable;
    move-object/from16 v1, v17

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 v17, v19

    .local v17, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/16 v20, 0x0

    .line 367
    .local v20, "$i$f$filterTo":I
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v22

    :goto_b
    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_11

    invoke-interface/range {v22 .. v22}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .local v2, "element$iv$iv":Ljava/lang/Object;
    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    .local v3, "it":Ljava/lang/String;
    const/16 v23, 0x0

    .line 185
    .local v23, "$i$a$-filter-ModTools$missingDeps$2":I
    invoke-virtual {v9, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v24

    .line 367
    .end local v3    # "it":Ljava/lang/String;
    .end local v23    # "$i$a$-filter-ModTools$missingDeps$2":I
    if-nez v24, :cond_10

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_10
    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto :goto_b

    .line 368
    .end local v2    # "element$iv$iv":Ljava/lang/Object;
    :cond_11
    nop

    .end local v1    # "destination$iv$iv":Ljava/util/Collection;
    .end local v17    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$filterTo":I
    check-cast v1, Ljava/util/List;

    .line 366
    nop

    .end local v15    # "$i$f$filter":I
    .end local v19    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v1, Ljava/lang/Iterable;

    .line 185
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto/16 :goto_2

    .line 182
    .end local v16    # "id":Ljava/lang/String;
    .end local v21    # "hit":Lcom/pymcl/core/mods/ModHit;
    .local v15, "id":Ljava/lang/String;
    :cond_12
    move-object/from16 v16, v15

    .end local v15    # "id":Ljava/lang/String;
    .restart local v16    # "id":Ljava/lang/String;
    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto/16 :goto_2

    .line 180
    .end local v16    # "id":Ljava/lang/String;
    .end local v18    # "f":Lcom/pymcl/core/mods/ModFile;
    .restart local v15    # "id":Ljava/lang/String;
    :cond_13
    move-object/from16 v16, v15

    .end local v15    # "id":Ljava/lang/String;
    .restart local v16    # "id":Ljava/lang/String;
    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto/16 :goto_2

    .line 187
    .end local v16    # "id":Ljava/lang/String;
    :cond_14
    move-object v10, v13

    .end local v13    # "next":Ljava/util/List;
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    goto/16 :goto_1

    .line 177
    :cond_15
    move/from16 v12, p7

    .line 189
    :cond_16
    return-object v8
.end method
