.class public final Lcom/pymcl/core/mods/ModpackExport;
.super Ljava/lang/Object;
.source "ModTools.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/ModpackExport$Remote;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/ModpackExport\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n3938#2:289\n4474#2,2:290\n7665#2:297\n1739#3:292\n1814#3,3:293\n2068#3,2:298\n777#3:300\n873#3,2:301\n2068#3,2:303\n2077#3,3:305\n777#3:308\n873#3,2:309\n1358#3,2:311\n1435#3,4:313\n1#4:296\n*S KotlinDebug\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/ModpackExport\n*L\n231#1:289\n231#1:290,2\n245#1:297\n234#1:292\n234#1:293,3\n245#1:298,2\n256#1:300\n256#1:301,2\n256#1:303,2\n261#1:305,3\n283#1:308\n283#1:309,2\n284#1:311,2\n284#1:313,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u00012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0006Jp\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u001e\u0010\u0017\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00110\t2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0006J2\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\n0\u001eH\u0002J\u0098\u0001\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\t2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#2\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00062\u001a\u0008\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0&J6\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#2\u0006\u0010)\u001a\u00020\u00062\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020+0#2\u0006\u0010,\u001a\u00020\rJ \u0010-\u001a\n /*\u0004\u0018\u00010.0.2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020.H\u0002R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ModpackExport;",
        "",
        "<init>",
        "()V",
        "NEVER",
        "",
        "",
        "DEFAULT_ON",
        "candidates",
        "",
        "Lkotlin/Pair;",
        "",
        "gameDir",
        "Ljava/io/File;",
        "versionId",
        "index",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "name",
        "version",
        "mc",
        "loader",
        "Lcom/pymcl/core/loader/LoaderType;",
        "files",
        "summary",
        "walk",
        "",
        "root",
        "rel",
        "out",
        "",
        "export",
        "",
        "include",
        "remote",
        "",
        "Lcom/pymcl/core/mods/ModpackExport$Remote;",
        "onProgress",
        "Lkotlin/Function2;",
        "",
        "remoteFrom",
        "dirRel",
        "idents",
        "Lcom/pymcl/core/mods/ModIdent;",
        "dir",
        "sha",
        "",
        "kotlin.jvm.PlatformType",
        "algo",
        "b",
        "Remote",
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
.field private static final DEFAULT_ON:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

.field private static final NEVER:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$6juTRkbP8bgQrcnsXzVnyiH3taw(Ljava/io/File;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ModpackExport;->candidates$lambda$2(Ljava/io/File;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$JE0xCxVDmQEDiZZf1DjjbRXQ7IM(Ljava/io/File;)Ljava/lang/Comparable;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ModpackExport;->candidates$lambda$1(Ljava/io/File;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$icq3hU9Pe026Y1CKx8dqfcds5WQ(FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/mods/ModpackExport;->export$lambda$0(FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lcom/pymcl/core/mods/ModpackExport;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ModpackExport;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    .line 225
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "logs"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "crash-reports"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "versions"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "libraries"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "assets"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "natives"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, ".fabric"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const-string v1, ".mixin.out"

    const/4 v9, 0x7

    aput-object v1, v0, v9

    const-string v1, ".pymcl_tmp"

    const/16 v10, 0x8

    aput-object v1, v0, v10

    const-string v1, "usercache.json"

    const/16 v11, 0x9

    aput-object v1, v0, v11

    .line 226
    const-string v1, "usernamecache.json"

    const/16 v12, 0xa

    aput-object v1, v0, v12

    .line 225
    nop

    .line 226
    const-string v1, "launcher_profiles.json"

    const/16 v13, 0xb

    aput-object v1, v0, v13

    .line 225
    nop

    .line 226
    const-string v1, "pymcl.json"

    const/16 v14, 0xc

    aput-object v1, v0, v14

    .line 225
    nop

    .line 226
    const-string v1, ".pymcl_verified"

    const/16 v15, 0xd

    aput-object v1, v0, v15

    .line 225
    nop

    .line 226
    const-string v1, "debug"

    move/from16 v16, v2

    const/16 v2, 0xe

    aput-object v1, v0, v2

    .line 225
    nop

    .line 226
    const-string v1, ".cache"

    const/16 v17, 0xf

    aput-object v1, v0, v17

    .line 225
    nop

    .line 226
    const-string v1, "downloads"

    const/16 v17, 0x10

    aput-object v1, v0, v17

    .line 225
    nop

    .line 226
    const-string v1, "modrinth.index.json"

    const/16 v17, 0x11

    aput-object v1, v0, v17

    .line 225
    nop

    .line 226
    const-string v1, "manifest.json"

    const/16 v17, 0x12

    aput-object v1, v0, v17

    .line 225
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/mods/ModpackExport;->NEVER:Ljava/util/Set;

    .line 227
    new-array v0, v2, [Ljava/lang/String;

    const-string v1, "mods"

    aput-object v1, v0, v16

    const-string v1, "config"

    aput-object v1, v0, v3

    const-string v1, "defaultconfigs"

    aput-object v1, v0, v4

    const-string v1, "kubejs"

    aput-object v1, v0, v5

    const-string v1, "scripts"

    aput-object v1, v0, v6

    const-string v1, "resourcepacks"

    aput-object v1, v0, v7

    const-string v1, "shaderpacks"

    aput-object v1, v0, v8

    const-string v1, "options.txt"

    aput-object v1, v0, v9

    const-string v1, "optionsof.txt"

    aput-object v1, v0, v10

    .line 228
    const-string v1, "optionsshaders.txt"

    aput-object v1, v0, v11

    .line 227
    nop

    .line 228
    const-string v1, "servers.dat"

    aput-object v1, v0, v12

    .line 227
    nop

    .line 228
    const-string v1, "global_packs"

    aput-object v1, v0, v13

    .line 227
    nop

    .line 228
    const-string v1, "datapacks"

    aput-object v1, v0, v14

    .line 227
    nop

    .line 228
    const-string v1, "resources"

    aput-object v1, v0, v15

    .line 227
    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/mods/ModpackExport;->DEFAULT_ON:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic candidates$default(Lcom/pymcl/core/mods/ModpackExport;Ljava/io/File;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 230
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, ""

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/mods/ModpackExport;->candidates(Ljava/io/File;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final candidates$lambda$1(Ljava/io/File;)Ljava/lang/Comparable;
    .locals 1
    .param p0, "it"    # Ljava/io/File;

    .line 234
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    return-object v0
.end method

.method private static final candidates$lambda$2(Ljava/io/File;)Ljava/lang/Comparable;
    .locals 2
    .param p0, "it"    # Ljava/io/File;

    .line 234
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Comparable;

    return-object v0
.end method

.method public static synthetic export$default(Lcom/pymcl/core/mods/ModpackExport;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlin/Pair;
    .locals 13

    .line 253
    move/from16 v0, p11

    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_0

    .line 254
    const-string v1, ""

    move-object v11, v1

    goto :goto_0

    .line 253
    :cond_0
    move-object/from16 v11, p9

    :goto_0
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_1

    .line 254
    new-instance v0, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda2;-><init>()V

    move-object v12, v0

    goto :goto_1

    .line 253
    :cond_1
    move-object/from16 v12, p10

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    invoke-virtual/range {v2 .. v12}, Lcom/pymcl/core/mods/ModpackExport;->export(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final export$lambda$0(FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 254
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic index$default(Lcom/pymcl/core/mods/ModpackExport;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Ljava/util/Map;
    .locals 7

    .line 236
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const-string p6, ""

    :cond_0
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/core/mods/ModpackExport;->index(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private final sha(Ljava/lang/String;[B)[B
    .locals 1
    .param p1, "algo"    # Ljava/lang/String;
    .param p2, "b"    # [B

    .line 286
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    return-object v0
.end method

.method private final walk(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .param p1, "root"    # Ljava/io/File;
    .param p2, "rel"    # Ljava/lang/String;
    .param p3, "out"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ">;>;)V"
        }
    .end annotation

    .line 244
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 245
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_0

    new-array v1, v2, [Ljava/io/File;

    .local v1, "$this$sortedBy$iv":[Ljava/lang/Object;
    :cond_0
    const/4 v2, 0x0

    .line 297
    .local v2, "$i$f$sortedBy":I
    new-instance v3, Lcom/pymcl/core/mods/ModpackExport$walk$$inlined$sortedBy$1;

    invoke-direct {v3}, Lcom/pymcl/core/mods/ModpackExport$walk$$inlined$sortedBy$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v1, v3}, Lkotlin/collections/ArraysKt;->sortedWith([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    .end local v1    # "$this$sortedBy$iv":[Ljava/lang/Object;
    .end local v2    # "$i$f$sortedBy":I
    check-cast v1, Ljava/lang/Iterable;

    .line 245
    nop

    .local v1, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 298
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/io/File;

    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 245
    .local v6, "$i$a$-forEach-ModpackExport$walk$2":I
    sget-object v7, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, "/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, p1, v8, p3}, Lcom/pymcl/core/mods/ModpackExport;->walk(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V

    .line 298
    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-forEach-ModpackExport$walk$2":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 299
    :cond_1
    nop

    .end local v1    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    goto :goto_1

    .line 246
    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getName(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, ".pymcl"

    invoke-static {v1, v5, v2, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object v1, p3

    check-cast v1, Ljava/util/Collection;

    invoke-static {p2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 247
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final candidates(Ljava/io/File;Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .param p1, "gameDir"    # Ljava/io/File;
    .param p2, "versionId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "gameDir"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "versionId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    new-array v1, v3, [Ljava/io/File;

    .local v1, "$this$filter$iv":[Ljava/lang/Object;
    :cond_0
    const/4 v4, 0x0

    .line 289
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 290
    .local v7, "$i$f$filterTo":I
    array-length v8, v6

    move v9, v3

    :goto_0
    const/4 v11, 0x2

    if-ge v9, v8, :cond_7

    aget-object v12, v6, v9

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "f":Ljava/io/File;
    const/4 v14, 0x0

    .line 231
    .local v14, "$i$a$-filter-ModpackExport$candidates$1":I
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    .line 232
    .local v15, "n":Ljava/lang/String;
    const/16 v16, 0x1

    sget-object v10, Lcom/pymcl/core/mods/ModpackExport;->NEVER:Ljava/util/Set;

    invoke-interface {v10, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v10, "natives"

    move-object/from16 v17, v1

    .end local v1    # "$this$filter$iv":[Ljava/lang/Object;
    .local v17, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    invoke-static {v15, v10, v3, v11, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, ".pymcl"

    invoke-static {v15, v10, v3, v11, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, ".lock"

    invoke-static {v15, v10, v3, v11, v1}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "hs_err_pid"

    invoke-static {v15, v10, v3, v11, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    .line 233
    move-object v10, v0

    check-cast v10, Ljava/lang/CharSequence;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_1

    move/from16 v10, v16

    goto :goto_1

    :cond_1
    move v10, v3

    :goto_1
    if-nez v10, :cond_2

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v1, ".jar"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v10, ".json"

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_2
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ".log"

    const/4 v10, 0x0

    invoke-static {v15, v1, v3, v11, v10}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :cond_3
    move/from16 v10, v16

    goto :goto_2

    .line 232
    .end local v17    # "$this$filter$iv":[Ljava/lang/Object;
    .restart local v1    # "$this$filter$iv":[Ljava/lang/Object;
    :cond_4
    move-object/from16 v17, v1

    .line 233
    .end local v1    # "$this$filter$iv":[Ljava/lang/Object;
    .restart local v17    # "$this$filter$iv":[Ljava/lang/Object;
    :cond_5
    move v10, v3

    .line 290
    .end local v13    # "f":Ljava/io/File;
    .end local v14    # "$i$a$-filter-ModpackExport$candidates$1":I
    .end local v15    # "n":Ljava/lang/String;
    :goto_2
    if-eqz v10, :cond_6

    invoke-interface {v5, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_6
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, v17

    goto/16 :goto_0

    .line 291
    .end local v17    # "$this$filter$iv":[Ljava/lang/Object;
    .restart local v1    # "$this$filter$iv":[Ljava/lang/Object;
    :cond_7
    move-object/from16 v17, v1

    const/16 v16, 0x1

    .end local v1    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v7    # "$i$f$filterTo":I
    .restart local v17    # "$this$filter$iv":[Ljava/lang/Object;
    move-object v1, v5

    check-cast v1, Ljava/util/List;

    .line 289
    nop

    .end local v4    # "$i$f$filter":I
    .end local v17    # "$this$filter$iv":[Ljava/lang/Object;
    check-cast v1, Ljava/lang/Iterable;

    .line 234
    new-array v4, v11, [Lkotlin/jvm/functions/Function1;

    new-instance v5, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda0;

    invoke-direct {v5}, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda0;-><init>()V

    aput-object v5, v4, v3

    new-instance v3, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda1;

    invoke-direct {v3}, Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda1;-><init>()V

    aput-object v3, v4, v16

    invoke-static {v4}, Lkotlin/comparisons/ComparisonsKt;->compareBy([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 292
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 293
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 294
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/io/File;

    .local v9, "it":Ljava/io/File;
    const/4 v10, 0x0

    .line 234
    .local v10, "$i$a$-map-ModpackExport$candidates$4":I
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Lcom/pymcl/core/mods/ModpackExport;->DEFAULT_ON:Ljava/util/Set;

    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 294
    .end local v9    # "it":Ljava/io/File;
    .end local v10    # "$i$a$-map-ModpackExport$candidates$4":I
    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 295
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 292
    nop

    .line 234
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    return-object v4
.end method

.method public final export(Ljava/io/File;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lkotlin/Pair;
    .locals 32
    .param p1, "gameDir"    # Ljava/io/File;
    .param p2, "out"    # Ljava/io/File;
    .param p3, "name"    # Ljava/lang/String;
    .param p4, "version"    # Ljava/lang/String;
    .param p5, "mc"    # Ljava/lang/String;
    .param p6, "loader"    # Lkotlin/Pair;
    .param p7, "include"    # Ljava/util/List;
    .param p8, "remote"    # Ljava/util/Map;
    .param p9, "summary"    # Ljava/lang/String;
    .param p10, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "+",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModpackExport$Remote;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p10

    const-string v0, "required"

    const-string v2, "gameDir"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "out"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "name"

    move-object/from16 v12, p3

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "version"

    move-object/from16 v13, p4

    invoke-static {v13, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mc"

    move-object/from16 v14, p5

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "include"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "remote"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "summary"

    move-object/from16 v4, p9

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onProgress"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    .line 256
    .local v2, "all":Ljava/util/List;
    move-object v5, v8

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 300
    .local v6, "$i$f$filter":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v5

    .local v11, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 301
    .local v15, "$i$f$filterTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    move-object/from16 v18, v0

    if-eqz v17, :cond_3

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .local v0, "element$iv$iv":Ljava/lang/Object;
    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .local v4, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 256
    .local v17, "$i$a$-filter-ModpackExport$export$2":I
    move-object/from16 v22, v4

    check-cast v22, Ljava/lang/CharSequence;

    invoke-static/range {v22 .. v22}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v22

    if-nez v22, :cond_0

    move-object/from16 v22, v5

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v22, "$this$filter$iv":Ljava/lang/Iterable;
    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    const-string v23, ".."

    move/from16 v24, v6

    .end local v6    # "$i$f$filter":I
    .local v24, "$i$f$filter":I
    move-object/from16 v6, v23

    check-cast v6, Ljava/lang/CharSequence;

    move-object/from16 v23, v11

    const/4 v8, 0x0

    const/4 v11, 0x2

    const/4 v12, 0x0

    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .local v23, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    invoke-static {v5, v6, v12, v11, v8}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    sget-object v5, Lcom/pymcl/core/mods/ModpackExport;->NEVER:Ljava/util/Set;

    invoke-interface {v5, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const/16 v20, 0x1

    goto :goto_1

    .end local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v23    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$filter":I
    .restart local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$filter":I
    .restart local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    :cond_0
    move-object/from16 v22, v5

    move/from16 v24, v6

    move-object/from16 v23, v11

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter":I
    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .restart local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v23    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .restart local v24    # "$i$f$filter":I
    :cond_1
    const/16 v20, 0x0

    .line 301
    .end local v4    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-filter-ModpackExport$export$2":I
    :goto_1
    if-eqz v20, :cond_2

    invoke-interface {v7, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v12, p3

    move-object/from16 v8, p7

    move-object/from16 v4, p9

    move-object/from16 v0, v18

    move-object/from16 v5, v22

    move-object/from16 v11, v23

    move/from16 v6, v24

    goto :goto_0

    .line 302
    .end local v0    # "element$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v23    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$filter":I
    .restart local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$filter":I
    .restart local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    :cond_3
    move-object/from16 v22, v5

    move/from16 v24, v6

    move-object/from16 v23, v11

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filter":I
    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$filterTo":I
    .restart local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v24    # "$i$f$filter":I
    move-object v0, v7

    check-cast v0, Ljava/util/List;

    .line 300
    nop

    .end local v22    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v24    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .line 256
    nop

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 303
    .local v4, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .local v6, "element$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 256
    .local v8, "$i$a$-forEach-ModpackExport$export$3":I
    sget-object v11, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    const/4 v12, 0x1

    new-array v15, v12, [C

    const/16 v12, 0x2f

    const/16 v20, 0x0

    aput-char v12, v15, v20

    invoke-static {v7, v15}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v1, v12, v2}, Lcom/pymcl/core/mods/ModpackExport;->walk(Ljava/io/File;Ljava/lang/String;Ljava/util/List;)V

    .line 303
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-forEach-ModpackExport$export$3":I
    nop

    .end local v6    # "element$iv":Ljava/lang/Object;
    goto :goto_2

    .line 304
    :cond_4
    nop

    .line 257
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$forEach":I
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v16, v0

    check-cast v16, Ljava/util/List;

    .local v16, "files":Ljava/util/List;
    const/4 v4, 0x0

    .line 258
    .local v4, "ov":I
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 259
    :cond_5
    new-instance v0, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".part"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v0

    .line 260
    .local v5, "tmp":Ljava/io/File;
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v6, Ljava/io/FileOutputStream;

    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v6, Ljava/io/OutputStream;

    instance-of v7, v6, Ljava/io/BufferedOutputStream;

    if-eqz v7, :cond_6

    check-cast v6, Ljava/io/BufferedOutputStream;

    goto :goto_3

    :cond_6
    new-instance v7, Ljava/io/BufferedOutputStream;

    const/16 v8, 0x2000

    invoke-direct {v7, v6, v8}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v6, v7

    :goto_3
    check-cast v6, Ljava/io/OutputStream;

    invoke-direct {v0, v6}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v6, v0

    check-cast v6, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v6

    check-cast v0, Ljava/util/zip/ZipOutputStream;

    move-object v7, v0

    .local v7, "zip":Ljava/util/zip/ZipOutputStream;
    const/4 v8, 0x0

    .line 261
    .local v8, "$i$a$-use-ModpackExport$export$4":I
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    move-object v11, v0

    .local v11, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 305
    .local v12, "$i$f$forEachIndexed":I
    const/4 v0, 0x0

    .line 306
    .local v0, "index$iv":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    move/from16 v22, v4

    .end local v4    # "ov":I
    .local v22, "ov":I
    :goto_4
    :try_start_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    if-eqz v4, :cond_b

    :try_start_2
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .local v4, "item$iv":Ljava/lang/Object;
    add-int/lit8 v17, v0, 0x1

    .end local v0    # "index$iv":I
    .local v17, "index$iv":I
    if-gez v0, :cond_7

    :try_start_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    .line 260
    .end local v4    # "item$iv":Ljava/lang/Object;
    .end local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v8    # "$i$a$-use-ModpackExport$export$4":I
    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .end local v17    # "index$iv":I
    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v26, v2

    move-object v2, v5

    move/from16 v4, v22

    goto/16 :goto_a

    .line 306
    .restart local v4    # "item$iv":Ljava/lang/Object;
    .restart local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v8    # "$i$a$-use-ModpackExport$export$4":I
    .restart local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "$i$f$forEachIndexed":I
    .restart local v17    # "index$iv":I
    :cond_7
    :goto_5
    :try_start_4
    move-object/from16 v23, v4

    check-cast v23, Lkotlin/Pair;

    move/from16 v24, v0

    .local v24, "i":I
    const/16 v25, 0x0

    .local v25, "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    invoke-virtual/range {v23 .. v23}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v26, v0

    .local v26, "rel":Ljava/lang/String;
    invoke-virtual/range {v23 .. v23}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    move-object/from16 v23, v0

    .line 262
    .local v23, "f":Ljava/io/File;
    move/from16 v1, v24

    .end local v24    # "i":I
    .local v1, "i":I
    int-to-float v0, v1

    move/from16 v24, v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v27, v1

    const/4 v1, 0x1

    .end local v1    # "i":I
    .local v27, "i":I
    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    div-float v0, v24, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object/from16 v1, v26

    .end local v26    # "rel":Ljava/lang/String;
    .local v1, "rel":Ljava/lang/String;
    invoke-interface {v10, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    invoke-interface {v9, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/mods/ModpackExport$Remote;

    move-object/from16 v24, v0

    .line 264
    .local v24, "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    if-eqz v24, :cond_a

    const-string v0, ".disabled"
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object/from16 v26, v2

    move-object/from16 v28, v4

    move/from16 v29, v8

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v8, 0x0

    .end local v2    # "all":Ljava/util/List;
    .end local v4    # "item$iv":Ljava/lang/Object;
    .end local v8    # "$i$a$-use-ModpackExport$export$4":I
    .local v26, "all":Ljava/util/List;
    .local v28, "item$iv":Ljava/lang/Object;
    .local v29, "$i$a$-use-ModpackExport$export$4":I
    :try_start_5
    invoke-static {v1, v0, v8, v4, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 265
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    const-string v2, "SHA-1"

    move-object/from16 v4, v23

    .end local v23    # "f":Ljava/io/File;
    .local v4, "f":Ljava/io/File;
    invoke-virtual {v0, v4, v2}, Lcom/pymcl/core/util/FileUtil;->hash(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "sha1":Ljava/lang/String;
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    const-string v8, "SHA-512"

    invoke-virtual {v2, v4, v8}, Lcom/pymcl/core/util/FileUtil;->hash(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 266
    .local v2, "sha512":Ljava/lang/String;
    move-object/from16 v8, v18

    .local v8, "client":Ljava/lang/String;
    const-string v9, "mods/"

    move-object/from16 v23, v11

    move/from16 v30, v12

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .local v23, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .local v30, "$i$f$forEachIndexed":I
    invoke-static {v1, v9, v13, v12, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object/from16 v9, v18

    goto :goto_6

    :cond_8
    const-string v9, "unsupported"

    .line 267
    .local v9, "server":Ljava/lang/String;
    :goto_6
    move-object/from16 v11, v16

    check-cast v11, Ljava/util/Collection;

    const/4 v12, 0x5

    new-array v12, v12, [Lkotlin/Pair;

    const-string v13, "path"

    invoke-static {v13, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v20, 0x0

    aput-object v13, v12, v20

    const-string v13, "hashes"

    move-object/from16 v31, v12

    const/4 v12, 0x2

    new-array v14, v12, [Lkotlin/Pair;

    const-string v12, "sha1"

    invoke-static {v12, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v20, 0x0

    aput-object v12, v14, v20

    const-string v12, "sha512"

    invoke-static {v12, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v21, 0x1

    aput-object v12, v14, v21

    invoke-static {v14}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    invoke-static {v13, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v31, v21

    const-string v12, "env"

    const/4 v13, 0x2

    new-array v14, v13, [Lkotlin/Pair;

    const-string v13, "client"

    invoke-static {v13, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v20, 0x0

    aput-object v13, v14, v20

    const-string v13, "server"

    invoke-static {v13, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    const/16 v21, 0x1

    aput-object v13, v14, v21

    invoke-static {v14}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/16 v19, 0x2

    aput-object v12, v31, v19

    .line 268
    const-string v12, "downloads"

    invoke-virtual/range {v24 .. v24}, Lcom/pymcl/core/mods/ModpackExport$Remote;->getUrl()Ljava/lang/String;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x3

    aput-object v12, v31, v13

    .line 267
    nop

    .line 268
    const-string v12, "fileSize"

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    const/4 v13, 0x4

    aput-object v12, v31, v13

    .line 267
    invoke-static/range {v31 .. v31}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v13, 0x2

    const/4 v14, 0x0

    goto :goto_8

    .line 264
    .end local v0    # "sha1":Ljava/lang/String;
    .end local v2    # "sha512":Ljava/lang/String;
    .end local v4    # "f":Ljava/io/File;
    .end local v8    # "client":Ljava/lang/String;
    .end local v9    # "server":Ljava/lang/String;
    .end local v30    # "$i$f$forEachIndexed":I
    .restart local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "$i$f$forEachIndexed":I
    .local v23, "f":Ljava/io/File;
    :cond_9
    move/from16 v30, v12

    move-object/from16 v4, v23

    move-object/from16 v23, v11

    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .restart local v4    # "f":Ljava/io/File;
    .local v23, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v30    # "$i$f$forEachIndexed":I
    goto :goto_7

    .end local v26    # "all":Ljava/util/List;
    .end local v28    # "item$iv":Ljava/lang/Object;
    .end local v29    # "$i$a$-use-ModpackExport$export$4":I
    .end local v30    # "$i$f$forEachIndexed":I
    .local v2, "all":Ljava/util/List;
    .local v4, "item$iv":Ljava/lang/Object;
    .local v8, "$i$a$-use-ModpackExport$export$4":I
    .restart local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "$i$f$forEachIndexed":I
    .local v23, "f":Ljava/io/File;
    :cond_a
    move-object/from16 v26, v2

    move-object/from16 v28, v4

    move/from16 v29, v8

    move/from16 v30, v12

    move-object/from16 v4, v23

    move-object/from16 v23, v11

    .line 270
    .end local v2    # "all":Ljava/util/List;
    .end local v8    # "$i$a$-use-ModpackExport$export$4":I
    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .local v4, "f":Ljava/io/File;
    .local v23, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v26    # "all":Ljava/util/List;
    .restart local v28    # "item$iv":Ljava/lang/Object;
    .restart local v29    # "$i$a$-use-ModpackExport$export$4":I
    .restart local v30    # "$i$f$forEachIndexed":I
    :goto_7
    new-instance v0, Ljava/util/zip/ZipEntry;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "overrides/"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    move-object v0, v2

    check-cast v0, Ljava/io/FileInputStream;

    .line 296
    .local v0, "it":Ljava/io/FileInputStream;
    const/4 v8, 0x0

    .line 270
    .local v8, "$i$a$-use-ModpackExport$export$4$1$1":I
    move-object v9, v0

    check-cast v9, Ljava/io/InputStream;

    move-object v11, v7

    check-cast v11, Ljava/io/OutputStream;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v14, 0x0

    invoke-static {v9, v11, v14, v13, v12}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .end local v0    # "it":Ljava/io/FileInputStream;
    .end local v8    # "$i$a$-use-ModpackExport$export$4$1$1":I
    :try_start_7
    invoke-static {v2, v12}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v7}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    add-int/lit8 v22, v22, 0x1

    .line 272
    .end local v24    # "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    :goto_8
    nop

    .line 306
    .end local v1    # "rel":Ljava/lang/String;
    .end local v4    # "f":Ljava/io/File;
    .end local v25    # "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    .end local v27    # "i":I
    move-object/from16 v1, p1

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v9, p8

    move/from16 v0, v17

    move-object/from16 v11, v23

    move-object/from16 v2, v26

    move/from16 v8, v29

    move/from16 v12, v30

    .end local v28    # "item$iv":Ljava/lang/Object;
    goto/16 :goto_4

    .line 270
    .restart local v1    # "rel":Ljava/lang/String;
    .restart local v4    # "f":Ljava/io/File;
    .restart local v24    # "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    .restart local v25    # "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    .restart local v27    # "i":I
    .restart local v28    # "item$iv":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    move-object v8, v0

    .end local v1    # "rel":Ljava/lang/String;
    .end local v4    # "f":Ljava/io/File;
    .end local v5    # "tmp":Ljava/io/File;
    .end local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v16    # "files":Ljava/util/List;
    .end local v17    # "index$iv":I
    .end local v22    # "ov":I
    .end local v23    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v24    # "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    .end local v25    # "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    .end local v26    # "all":Ljava/util/List;
    .end local v27    # "i":I
    .end local v28    # "item$iv":Ljava/lang/Object;
    .end local v29    # "$i$a$-use-ModpackExport$export$4":I
    .end local v30    # "$i$f$forEachIndexed":I
    .end local p1    # "gameDir":Ljava/io/File;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "name":Ljava/lang/String;
    .end local p4    # "version":Ljava/lang/String;
    .end local p5    # "mc":Ljava/lang/String;
    .end local p6    # "loader":Lkotlin/Pair;
    .end local p7    # "include":Ljava/util/List;
    .end local p8    # "remote":Ljava/util/Map;
    .end local p9    # "summary":Ljava/lang/String;
    .end local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    :try_start_8
    throw v8
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .restart local v1    # "rel":Ljava/lang/String;
    .restart local v4    # "f":Ljava/io/File;
    .restart local v5    # "tmp":Ljava/io/File;
    .restart local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v16    # "files":Ljava/util/List;
    .restart local v17    # "index$iv":I
    .restart local v22    # "ov":I
    .restart local v23    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v24    # "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    .restart local v25    # "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    .restart local v26    # "all":Ljava/util/List;
    .restart local v27    # "i":I
    .restart local v28    # "item$iv":Ljava/lang/Object;
    .restart local v29    # "$i$a$-use-ModpackExport$export$4":I
    .restart local v30    # "$i$f$forEachIndexed":I
    .restart local p1    # "gameDir":Ljava/io/File;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "name":Ljava/lang/String;
    .restart local p4    # "version":Ljava/lang/String;
    .restart local p5    # "mc":Ljava/lang/String;
    .restart local p6    # "loader":Lkotlin/Pair;
    .restart local p7    # "include":Ljava/util/List;
    .restart local p8    # "remote":Ljava/util/Map;
    .restart local p9    # "summary":Ljava/lang/String;
    .restart local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catchall_2
    move-exception v0

    :try_start_9
    invoke-static {v2, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v5    # "tmp":Ljava/io/File;
    .end local v16    # "files":Ljava/util/List;
    .end local v22    # "ov":I
    .end local v26    # "all":Ljava/util/List;
    .end local p1    # "gameDir":Ljava/io/File;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "name":Ljava/lang/String;
    .end local p4    # "version":Ljava/lang/String;
    .end local p5    # "mc":Ljava/lang/String;
    .end local p6    # "loader":Lkotlin/Pair;
    .end local p7    # "include":Ljava/util/List;
    .end local p8    # "remote":Ljava/util/Map;
    .end local p9    # "summary":Ljava/lang/String;
    .end local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 260
    .end local v1    # "rel":Ljava/lang/String;
    .end local v4    # "f":Ljava/io/File;
    .end local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v17    # "index$iv":I
    .end local v23    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v24    # "r":Lcom/pymcl/core/mods/ModpackExport$Remote;
    .end local v25    # "$i$a$-forEachIndexed-ModpackExport$export$4$1":I
    .end local v27    # "i":I
    .end local v28    # "item$iv":Ljava/lang/Object;
    .end local v29    # "$i$a$-use-ModpackExport$export$4":I
    .end local v30    # "$i$f$forEachIndexed":I
    .restart local v5    # "tmp":Ljava/io/File;
    .restart local v16    # "files":Ljava/util/List;
    .restart local v22    # "ov":I
    .restart local v26    # "all":Ljava/util/List;
    .restart local p1    # "gameDir":Ljava/io/File;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "name":Ljava/lang/String;
    .restart local p4    # "version":Ljava/lang/String;
    .restart local p5    # "mc":Ljava/lang/String;
    .restart local p6    # "loader":Lkotlin/Pair;
    .restart local p7    # "include":Ljava/util/List;
    .restart local p8    # "remote":Ljava/util/Map;
    .restart local p9    # "summary":Ljava/lang/String;
    .restart local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catchall_3
    move-exception v0

    move-object v1, v0

    move-object v2, v5

    move/from16 v4, v22

    goto/16 :goto_a

    .end local v26    # "all":Ljava/util/List;
    .restart local v2    # "all":Ljava/util/List;
    :catchall_4
    move-exception v0

    move-object/from16 v26, v2

    move-object v1, v0

    move-object v2, v5

    move/from16 v4, v22

    .end local v2    # "all":Ljava/util/List;
    .restart local v26    # "all":Ljava/util/List;
    goto/16 :goto_a

    .line 307
    .end local v26    # "all":Ljava/util/List;
    .local v0, "index$iv":I
    .restart local v2    # "all":Ljava/util/List;
    .restart local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .local v8, "$i$a$-use-ModpackExport$export$4":I
    .restart local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "$i$f$forEachIndexed":I
    :cond_b
    move-object/from16 v26, v2

    move/from16 v29, v8

    move-object/from16 v23, v11

    move/from16 v30, v12

    .line 273
    .end local v0    # "index$iv":I
    .end local v2    # "all":Ljava/util/List;
    .end local v8    # "$i$a$-use-ModpackExport$export$4":I
    .end local v11    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$forEachIndexed":I
    .restart local v26    # "all":Ljava/util/List;
    .restart local v29    # "$i$a$-use-ModpackExport$export$4":I
    :try_start_a
    new-instance v0, Ljava/util/zip/ZipEntry;

    const-string v1, "modrinth.index.json"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 274
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    sget-object v11, Lcom/pymcl/core/mods/ModpackExport;->INSTANCE:Lcom/pymcl/core/mods/ModpackExport;

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v17, p9

    invoke-virtual/range {v11 .. v17}, Lcom/pymcl/core/mods/ModpackExport;->index(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    const/4 v12, 0x1

    invoke-virtual {v0, v1, v12}, Lcom/pymcl/core/util/Json;->stringify(Ljava/lang/Object;Z)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/util/zip/ZipOutputStream;->write([B)V

    invoke-virtual {v7}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 275
    nop

    .end local v7    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v29    # "$i$a$-use-ModpackExport$export$4":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 260
    const/4 v8, 0x0

    invoke-static {v6, v8}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 276
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_c
    invoke-virtual {v5, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_d

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    move-object v2, v5

    .end local v5    # "tmp":Ljava/io/File;
    .local v2, "tmp":Ljava/io/File;
    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_9

    .end local v2    # "tmp":Ljava/io/File;
    .restart local v5    # "tmp":Ljava/io/File;
    :cond_d
    move-object v2, v5

    .line 277
    .end local v5    # "tmp":Ljava/io/File;
    .restart local v2    # "tmp":Ljava/io/File;
    :goto_9
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "getName(...)"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v10, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    .line 260
    .end local v2    # "tmp":Ljava/io/File;
    .restart local v5    # "tmp":Ljava/io/File;
    :catchall_5
    move-exception v0

    move-object v2, v5

    move-object v1, v0

    move/from16 v4, v22

    .end local v5    # "tmp":Ljava/io/File;
    .restart local v2    # "tmp":Ljava/io/File;
    goto :goto_a

    .end local v26    # "all":Ljava/util/List;
    .local v2, "all":Ljava/util/List;
    .restart local v5    # "tmp":Ljava/io/File;
    :catchall_6
    move-exception v0

    move-object/from16 v26, v2

    move-object v2, v5

    move-object v1, v0

    move/from16 v4, v22

    .end local v5    # "tmp":Ljava/io/File;
    .local v2, "tmp":Ljava/io/File;
    .restart local v26    # "all":Ljava/util/List;
    goto :goto_a

    .end local v22    # "ov":I
    .end local v26    # "all":Ljava/util/List;
    .local v2, "all":Ljava/util/List;
    .local v4, "ov":I
    .restart local v5    # "tmp":Ljava/io/File;
    :catchall_7
    move-exception v0

    move-object/from16 v26, v2

    move-object v2, v5

    move-object v1, v0

    .end local v2    # "all":Ljava/util/List;
    .end local v4    # "ov":I
    .end local v5    # "tmp":Ljava/io/File;
    .end local v16    # "files":Ljava/util/List;
    .end local p1    # "gameDir":Ljava/io/File;
    .end local p2    # "out":Ljava/io/File;
    .end local p3    # "name":Ljava/lang/String;
    .end local p4    # "version":Ljava/lang/String;
    .end local p5    # "mc":Ljava/lang/String;
    .end local p6    # "loader":Lkotlin/Pair;
    .end local p7    # "include":Ljava/util/List;
    .end local p8    # "remote":Ljava/util/Map;
    .end local p9    # "summary":Ljava/lang/String;
    .end local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    :goto_a
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .local v2, "tmp":Ljava/io/File;
    .restart local v4    # "ov":I
    .restart local v16    # "files":Ljava/util/List;
    .restart local v26    # "all":Ljava/util/List;
    .restart local p1    # "gameDir":Ljava/io/File;
    .restart local p2    # "out":Ljava/io/File;
    .restart local p3    # "name":Ljava/lang/String;
    .restart local p4    # "version":Ljava/lang/String;
    .restart local p5    # "mc":Ljava/lang/String;
    .restart local p6    # "loader":Lkotlin/Pair;
    .restart local p7    # "include":Ljava/util/List;
    .restart local p8    # "remote":Ljava/util/Map;
    .restart local p9    # "summary":Ljava/lang/String;
    .restart local p10    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catchall_8
    move-exception v0

    invoke-static {v6, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final index(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;
    .locals 17
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "mc"    # Ljava/lang/String;
    .param p4, "loader"    # Lkotlin/Pair;
    .param p5, "files"    # Ljava/util/List;
    .param p6, "summary"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "+",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    const-string v5, "name"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "version"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "mc"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "files"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "summary"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    const/4 v8, 0x1

    new-array v9, v8, [Lkotlin/Pair;

    const-string v10, "minecraft"

    invoke-static {v10, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v11

    const/4 v12, 0x0

    aput-object v11, v9, v12

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    .line 238
    .local v9, "deps":Ljava/util/Map;
    if-eqz p4, :cond_0

    .line 296
    const/4 v11, 0x0

    .local v11, "$i$a$-let-ModpackExport$index$1":I
    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/pymcl/core/loader/LoaderType;

    .local v13, "t":Lcom/pymcl/core/loader/LoaderType;
    invoke-virtual/range {p4 .. p4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .line 238
    .local v14, "v":Ljava/lang/String;
    sget-object v15, Lcom/pymcl/core/mods/LoaderDetect;->INSTANCE:Lcom/pymcl/core/mods/LoaderDetect;

    invoke-virtual {v15, v13}, Lcom/pymcl/core/mods/LoaderDetect;->mrpackKey(Lcom/pymcl/core/loader/LoaderType;)Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_0

    .line 296
    .local v15, "it":Ljava/lang/String;
    const/16 v16, 0x0

    .line 238
    .local v16, "$i$a$-let-ModpackExport$index$1$1":I
    invoke-interface {v9, v15, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .end local v11    # "$i$a$-let-ModpackExport$index$1":I
    .end local v13    # "t":Lcom/pymcl/core/loader/LoaderType;
    .end local v14    # "v":Ljava/lang/String;
    .end local v15    # "it":Ljava/lang/String;
    .end local v16    # "$i$a$-let-ModpackExport$index$1$1":I
    :cond_0
    const/4 v11, 0x7

    new-array v11, v11, [Lkotlin/Pair;

    const-wide/16 v13, 0x1

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    const-string v14, "formatVersion"

    invoke-static {v14, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    aput-object v13, v11, v12

    const-string v13, "game"

    invoke-static {v13, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    aput-object v10, v11, v8

    const-string v10, "versionId"

    invoke-static {v10, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v13, 0x2

    aput-object v10, v11, v13

    const/4 v10, 0x3

    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v11, v10

    move-object v5, v4

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_1

    move v10, v8

    goto :goto_0

    :cond_1
    move v10, v12

    :goto_0
    if-eqz v10, :cond_2

    .line 296
    const/4 v5, 0x0

    .line 239
    .local v5, "$i$a$-ifEmpty-ModpackExport$index$2":I
    nop

    .end local v5    # "$i$a$-ifEmpty-ModpackExport$index$2":I
    const/4 v5, 0x0

    :cond_2
    invoke-static {v7, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v10, 0x4

    aput-object v5, v11, v10

    .line 240
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v5

    invoke-static {v6, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x5

    aput-object v5, v11, v6

    .line 239
    nop

    .line 240
    const-string v5, "dependencies"

    invoke-static {v5, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x6

    aput-object v5, v11, v6

    .line 239
    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v5

    .line 240
    move-object v6, v5

    .line 296
    .local v6, "it":Ljava/util/Map;
    const/4 v10, 0x0

    .line 240
    .local v10, "$i$a$-also-ModpackExport$index$3":I
    move-object v11, v4

    check-cast v11, Ljava/lang/CharSequence;

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    move v8, v12

    :goto_1
    if-eqz v8, :cond_4

    invoke-interface {v6, v7}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .end local v6    # "it":Ljava/util/Map;
    .end local v10    # "$i$a$-also-ModpackExport$index$3":I
    :cond_4
    return-object v5
.end method

.method public final remoteFrom(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/util/Map;
    .locals 17
    .param p1, "dirRel"    # Ljava/lang/String;
    .param p2, "idents"    # Ljava/util/Map;
    .param p3, "dir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModIdent;",
            ">;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/mods/ModpackExport$Remote;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "dirRel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "idents"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "dir"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    invoke-interface {v3}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 308
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 309
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/core/mods/ModIdent;

    .local v10, "it":Lcom/pymcl/core/mods/ModIdent;
    const/4 v11, 0x0

    .line 283
    .local v11, "$i$a$-filter-ModpackExport$remoteFrom$1":I
    invoke-virtual {v10}, Lcom/pymcl/core/mods/ModIdent;->getMrUrl()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    if-eqz v12, :cond_0

    invoke-virtual {v10}, Lcom/pymcl/core/mods/ModIdent;->getMrUrl()Ljava/lang/String;

    move-result-object v12

    const-string v14, "https://cdn.modrinth.com/"

    const/4 v15, 0x2

    move-object/from16 v16, v2

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v16, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    invoke-static {v12, v14, v13, v15, v2}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-virtual {v10}, Lcom/pymcl/core/mods/ModIdent;->getFilename()Ljava/lang/String;

    move-result-object v12

    const-string v14, ".disabled"

    invoke-static {v12, v14, v13, v15, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v13, 0x1

    goto :goto_1

    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_0
    move-object/from16 v16, v2

    .line 309
    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v10    # "it":Lcom/pymcl/core/mods/ModIdent;
    .end local v11    # "$i$a$-filter-ModpackExport$remoteFrom$1":I
    .restart local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_1
    :goto_1
    if-eqz v13, :cond_2

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v2, v16

    goto :goto_0

    .line 310
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_3
    move-object/from16 v16, v2

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    .restart local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 308
    nop

    .end local v4    # "$i$f$filter":I
    .end local v16    # "$this$filter$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/lang/Iterable;

    .line 284
    nop

    .local v2, "$this$associate$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 311
    .local v4, "$i$f$associate":I
    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-static {v5}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v5

    const/16 v6, 0x10

    invoke-static {v5, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v5

    .line 312
    .local v5, "capacity$iv":I
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v6, Ljava/util/Map;

    .local v6, "destination$iv$iv":Ljava/util/Map;
    move-object v7, v2

    .local v7, "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 313
    .local v8, "$i$f$associateTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 314
    .local v10, "element$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/mods/ModIdent;

    .local v11, "it":Lcom/pymcl/core/mods/ModIdent;
    const/4 v12, 0x0

    .line 284
    .local v12, "$i$a$-associate-ModpackExport$remoteFrom$2":I
    invoke-virtual {v11}, Lcom/pymcl/core/mods/ModIdent;->getFilename()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    const-string v15, "/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Lcom/pymcl/core/mods/ModpackExport$Remote;

    invoke-virtual {v11}, Lcom/pymcl/core/mods/ModIdent;->getMrUrl()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v0, Ljava/io/File;

    move-object/from16 v16, v2

    .end local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    .local v16, "$this$associate$iv":Ljava/lang/Iterable;
    invoke-virtual {v11}, Lcom/pymcl/core/mods/ModIdent;->getFilename()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-direct {v14, v15, v0, v1}, Lcom/pymcl/core/mods/ModpackExport$Remote;-><init>(Ljava/lang/String;J)V

    invoke-static {v13, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 314
    .end local v11    # "it":Lcom/pymcl/core/mods/ModIdent;
    .end local v12    # "$i$a$-associate-ModpackExport$remoteFrom$2":I
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v6, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, v16

    goto :goto_2

    .line 316
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "$this$associate$iv":Ljava/lang/Iterable;
    .restart local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    :cond_4
    nop

    .line 312
    .end local v6    # "destination$iv$iv":Ljava/util/Map;
    .end local v7    # "$this$associateTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$associateTo":I
    nop

    .line 284
    .end local v2    # "$this$associate$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$associate":I
    .end local v5    # "capacity$iv":I
    return-object v6
.end method
