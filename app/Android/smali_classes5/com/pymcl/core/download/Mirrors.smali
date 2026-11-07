.class public final Lcom/pymcl/core/download/Mirrors;
.super Ljava/lang/Object;
.source "Mirrors.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/download/Mirrors$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMirrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mirrors.kt\ncom/pymcl/core/download/Mirrors\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n1#2:78\n1739#3:79\n1814#3,3:80\n*S KotlinDebug\n*F\n+ 1 Mirrors.kt\ncom/pymcl/core/download/Mirrors\n*L\n75#1:79\n75#1:80,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0008\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u000eJ\u0006\u0010\u0019\u001a\u00020\u000eJ\u0006\u0010\u001a\u001a\u00020\u000eJ\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001cJ\u0014\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u001e\u001a\u00020\u0006J\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001cJ\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001cJ\"\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001c2\u0006\u0010\u001e\u001a\u00020\u00062\u000c\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006$"
    }
    d2 = {
        "Lcom/pymcl/core/download/Mirrors;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "downloadMode",
        "Lkotlin/Function0;",
        "",
        "communityMode",
        "clock",
        "",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "probeAt",
        "probeFast",
        "",
        "probeHook",
        "getProbeHook",
        "()Lkotlin/jvm/functions/Function0;",
        "setProbeHook",
        "(Lkotlin/jvm/functions/Function0;)V",
        "mode",
        "communityModeNorm",
        "invalidateProbe",
        "",
        "officialIsFast",
        "fileMirrorFirst",
        "communityMirrorFirst",
        "versionManifestUrls",
        "",
        "candidates",
        "url",
        "modrinthBases",
        "curseforgeBases",
        "github",
        "prefixes",
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
.field public static final BMCL:Ljava/lang/String; = "https://bmclapi2.bangbang93.com"

.field public static final CURSEFORGE:Ljava/lang/String; = "https://api.curseforge.com/v1"

.field public static final CURSEFORGE_MCIM:Ljava/lang/String; = "https://mod.mcimirror.top/curseforge/v1"

.field public static final Companion:Lcom/pymcl/core/download/Mirrors$Companion;

.field private static final FILE_MIRRORS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final MANIFEST_MIRROR:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final MANIFEST_OFFICIAL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MODRINTH:Ljava/lang/String; = "https://api.modrinth.com/v2"

.field public static final MODRINTH_MCIM:Ljava/lang/String; = "https://mod.mcimirror.top/modrinth/v2"

.field public static final PROBE_LIMIT_MS:J = 0xfa0L

.field public static final PROBE_TTL_MS:J = 0x927c0L

.field public static final PROBE_URL:Ljava/lang/String; = "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"


# instance fields
.field private final clock:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final communityMode:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final downloadMode:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final http:Lcom/pymcl/core/net/Http;

.field private volatile probeAt:J

.field private volatile probeFast:Z

.field private probeHook:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$3_dbQWQdTGmfqDZDWcaLFGCJZo8()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/Mirrors;->_init_$lambda$1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$ra2S22Z4hr1800uVinC-7Pq82pk()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/core/download/Mirrors;->_init_$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/pymcl/core/download/Mirrors$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/download/Mirrors$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    .line 20
    nop

    .line 21
    const/16 v0, 0xd

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "https://piston-meta.mojang.com/"

    const-string v2, "https://bmclapi2.bangbang93.com/"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "https://launchermeta.mojang.com/"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v0, v4

    const-string v1, "https://piston-data.mojang.com/"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 22
    const-string v1, "https://resources.download.minecraft.net/"

    const-string v5, "https://bmclapi2.bangbang93.com/assets/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x3

    aput-object v1, v0, v5

    .line 21
    nop

    .line 22
    const-string v1, "https://libraries.minecraft.net/"

    const-string v5, "https://bmclapi2.bangbang93.com/maven/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v6, 0x4

    aput-object v1, v0, v6

    .line 21
    nop

    .line 23
    const-string v1, "https://maven.minecraftforge.net/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v6, 0x5

    aput-object v1, v0, v6

    .line 21
    nop

    .line 23
    const-string v1, "https://files.minecraftforge.net/maven/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v6, 0x6

    aput-object v1, v0, v6

    .line 21
    nop

    .line 24
    const-string v1, "https://maven.neoforged.net/releases/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v6, 0x7

    aput-object v1, v0, v6

    .line 21
    nop

    .line 24
    const-string v1, "https://maven.fabricmc.net/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v6, 0x8

    aput-object v1, v0, v6

    .line 21
    nop

    .line 25
    const-string v1, "https://maven.quiltmc.org/repository/release/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v6, 0x9

    aput-object v1, v0, v6

    .line 21
    nop

    .line 25
    const-string v1, "https://maven.quiltmc.org/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0xa

    aput-object v1, v0, v5

    .line 21
    nop

    .line 26
    const-string v1, "https://meta.fabricmc.net/"

    const-string v5, "https://bmclapi2.bangbang93.com/fabric-meta/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0xb

    aput-object v1, v0, v5

    .line 21
    nop

    .line 26
    const-string v1, "https://meta.quiltmc.org/"

    const-string v5, "https://bmclapi2.bangbang93.com/quilt-meta/"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v5, 0xc

    aput-object v1, v0, v5

    .line 21
    nop

    .line 20
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/download/Mirrors;->FILE_MIRRORS:Ljava/util/List;

    .line 27
    new-array v0, v2, [Ljava/lang/String;

    const-string v1, "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"

    aput-object v1, v0, v3

    const-string v1, "https://launchermeta.mojang.com/mc/game/version_manifest_v2.json"

    aput-object v1, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/download/Mirrors;->MANIFEST_OFFICIAL:Ljava/util/List;

    .line 28
    const-string v0, "https://bmclapi2.bangbang93.com/mc/game/version_manifest_v2.json"

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/download/Mirrors;->MANIFEST_MIRROR:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "downloadMode"    # Lkotlin/jvm/functions/Function0;
    .param p3, "communityMode"    # Lkotlin/jvm/functions/Function0;
    .param p4, "clock"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "downloadMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityMode"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clock"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/pymcl/core/download/Mirrors;->http:Lcom/pymcl/core/net/Http;

    .line 11
    iput-object p2, p0, Lcom/pymcl/core/download/Mirrors;->downloadMode:Lkotlin/jvm/functions/Function0;

    .line 12
    iput-object p3, p0, Lcom/pymcl/core/download/Mirrors;->communityMode:Lkotlin/jvm/functions/Function0;

    .line 13
    iput-object p4, p0, Lcom/pymcl/core/download/Mirrors;->clock:Lkotlin/jvm/functions/Function0;

    .line 45
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/pymcl/core/download/Mirrors;->probeAt:J

    .line 46
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/core/download/Mirrors;->probeFast:Z

    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 9
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 11
    new-instance p2, Lcom/pymcl/core/download/Mirrors$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/pymcl/core/download/Mirrors$$ExternalSyntheticLambda0;-><init>()V

    .line 9
    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 12
    new-instance p3, Lcom/pymcl/core/download/Mirrors$$ExternalSyntheticLambda1;

    invoke-direct {p3}, Lcom/pymcl/core/download/Mirrors$$ExternalSyntheticLambda1;-><init>()V

    .line 9
    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 13
    sget-object p4, Lcom/pymcl/core/download/Mirrors$3;->INSTANCE:Lcom/pymcl/core/download/Mirrors$3;

    check-cast p4, Lkotlin/jvm/functions/Function0;

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/core/download/Mirrors;-><init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 14
    return-void
.end method

.method private static final _init_$lambda$0()Ljava/lang/String;
    .locals 1

    .line 11
    const-string v0, "auto"

    return-object v0
.end method

.method private static final _init_$lambda$1()Ljava/lang/String;
    .locals 1

    .line 12
    const-string v0, "auto"

    return-object v0
.end method

.method public static final synthetic access$getFILE_MIRRORS$cp()Ljava/util/List;
    .locals 1

    .line 9
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->FILE_MIRRORS:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getMANIFEST_MIRROR$cp()Ljava/util/List;
    .locals 1

    .line 9
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->MANIFEST_MIRROR:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getMANIFEST_OFFICIAL$cp()Ljava/util/List;
    .locals 1

    .line 9
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->MANIFEST_OFFICIAL:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final candidates(Ljava/lang/String;)Ljava/util/List;
    .locals 8
    .param p1, "url"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/download/Mirrors$Companion;->rewriteToBmcl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 78
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 68
    .local v1, "$i$a$-let-Mirrors$candidates$1":I
    sget-object v2, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->fileMirrorFirst()Z

    move-result v5

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->mode()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/pymcl/core/download/Mirrors$Companion;->order(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 69
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-Mirrors$candidates$1":I
    :cond_0
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/download/Mirrors$Companion;->rewriteToMcim(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 78
    .restart local v0    # "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 69
    .local v1, "$i$a$-let-Mirrors$candidates$2":I
    sget-object v2, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityMirrorFirst()Z

    move-result v5

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityModeNorm()Ljava/lang/String;

    move-result-object v6

    const-string v7, "official"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v7, ""

    :goto_0
    invoke-virtual {v2, v3, v4, v5, v7}, Lcom/pymcl/core/download/Mirrors$Companion;->order(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 70
    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-Mirrors$candidates$2":I
    :cond_2
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final communityMirrorFirst()Z
    .locals 2

    .line 63
    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityModeNorm()Ljava/lang/String;

    move-result-object v0

    const-string v1, "official"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final communityModeNorm()Ljava/lang/String;
    .locals 6

    .line 51
    iget-object v0, p0, Lcom/pymcl/core/download/Mirrors;->communityMode:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 51
    .local v1, "$i$a$-let-Mirrors$communityModeNorm$1":I
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "auto"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v5, "official"

    aput-object v5, v2, v3

    const/4 v3, 0x2

    const-string v5, "mcim"

    aput-object v5, v2, v3

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v4

    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-Mirrors$communityModeNorm$1":I
    :goto_0
    return-object v0
.end method

.method public final curseforgeBases()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 73
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    const-string v1, "https://api.curseforge.com/v1"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "https://mod.mcimirror.top/curseforge/v1"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityMirrorFirst()Z

    move-result v3

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityModeNorm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/pymcl/core/download/Mirrors$Companion;->order(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final fileMirrorFirst()Z
    .locals 3

    .line 62
    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->mode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bmclapi"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    :goto_0
    goto :goto_1

    :cond_0
    const-string v1, "official"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    :cond_1
    move v2, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->officialIsFast()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :goto_1
    return v2
.end method

.method public final getProbeHook()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/pymcl/core/download/Mirrors;->probeHook:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final github(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 10
    .param p1, "url"    # Ljava/lang/String;
    .param p2, "prefixes"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefixes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, "github.com"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, "githubusercontent.com"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_2

    :cond_1
    :goto_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 79
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

    .line 80
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 81
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    .local v7, "it":Ljava/lang/String;
    const/4 v8, 0x0

    .line 75
    .local v8, "$i$a$-map-Mirrors$github$1":I
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 81
    .end local v7    # "it":Ljava/lang/String;
    .end local v8    # "$i$a$-map-Mirrors$github$1":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 82
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 79
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/util/Collection;

    .line 75
    invoke-static {v2, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final invalidateProbe()V
    .locals 2

    .line 52
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/pymcl/core/download/Mirrors;->probeAt:J

    return-void
.end method

.method public final mode()Ljava/lang/String;
    .locals 6

    .line 50
    iget-object v0, p0, Lcom/pymcl/core/download/Mirrors;->downloadMode:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .local v0, "it":Ljava/lang/String;
    const/4 v1, 0x0

    .line 50
    .local v1, "$i$a$-let-Mirrors$mode$1":I
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "auto"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v5, "official"

    aput-object v5, v2, v3

    const/4 v3, 0x2

    const-string v5, "bmclapi"

    aput-object v5, v2, v3

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v4

    .end local v0    # "it":Ljava/lang/String;
    .end local v1    # "$i$a$-let-Mirrors$mode$1":I
    :goto_0
    return-object v0
.end method

.method public final modrinthBases()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 72
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    const-string v1, "https://api.modrinth.com/v2"

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "https://mod.mcimirror.top/modrinth/v2"

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityMirrorFirst()Z

    move-result v3

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->communityModeNorm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/pymcl/core/download/Mirrors$Companion;->order(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized officialIsFast()Z
    .locals 17

    move-object/from16 v1, p0

    monitor-enter p0

    .line 55
    :try_start_0
    iget-object v0, v1, Lcom/pymcl/core/download/Mirrors;->probeHook:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    .line 78
    .local v0, "it":Lkotlin/jvm/functions/Function0;
    const/4 v2, 0x0

    .line 55
    .local v2, "$i$a$-let-Mirrors$officialIsFast$1":I
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    return v3

    .line 56
    .end local v0    # "it":Lkotlin/jvm/functions/Function0;
    .end local v2    # "$i$a$-let-Mirrors$officialIsFast$1":I
    .end local p0    # "this":Lcom/pymcl/core/download/Mirrors;
    :cond_0
    :try_start_1
    iget-object v0, v1, Lcom/pymcl/core/download/Mirrors;->clock:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    .local v2, "now":J
    iget-wide v4, v1, Lcom/pymcl/core/download/Mirrors;->probeAt:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-ltz v0, :cond_1

    iget-wide v4, v1, Lcom/pymcl/core/download/Mirrors;->probeAt:J

    sub-long v4, v2, v4

    const-wide/32 v6, 0x927c0

    cmp-long v0, v4, v6

    if-gez v0, :cond_1

    iget-boolean v0, v1, Lcom/pymcl/core/download/Mirrors;->probeFast:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return v0

    .line 57
    :cond_1
    :try_start_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 58
    .local v4, "t0":J
    const/4 v6, 0x1

    const/4 v7, 0x0

    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/download/Mirrors;

    .line 78
    .local v0, "$this$officialIsFast_u24lambda_u241":Lcom/pymcl/core/download/Mirrors;
    const/4 v8, 0x0

    .line 58
    .local v8, "$i$a$-runCatching-Mirrors$officialIsFast$2":I
    iget-object v9, v0, Lcom/pymcl/core/download/Mirrors;->http:Lcom/pymcl/core/net/Http;

    const-string v10, "HEAD"

    const-string v11, "https://piston-meta.mojang.com/mc/game/version_manifest_v2.json"

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0xfa0

    invoke-static/range {v9 .. v16}, Lcom/pymcl/core/net/Http;->request$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BIILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v9

    invoke-virtual {v9}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v9

    const/16 v10, 0x190

    if-ge v9, v10, :cond_2

    move v0, v6

    goto :goto_0

    :cond_2
    move v0, v7

    .end local v0    # "$this$officialIsFast_u24lambda_u241":Lcom/pymcl/core/download/Mirrors;
    .end local v8    # "$i$a$-runCatching-Mirrors$officialIsFast$2":I
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    :try_start_4
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    move-object v0, v8

    :cond_3
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v8

    sub-long/2addr v8, v4

    const v0, 0xf4240

    int-to-long v10, v0

    div-long/2addr v8, v10

    const-wide/16 v10, 0xfa0

    cmp-long v0, v8, v10

    if-gez v0, :cond_4

    goto :goto_2

    :cond_4
    move v6, v7

    .line 58
    :goto_2
    iput-boolean v6, v1, Lcom/pymcl/core/download/Mirrors;->probeFast:Z

    .line 60
    iput-wide v2, v1, Lcom/pymcl/core/download/Mirrors;->probeAt:J

    iget-boolean v0, v1, Lcom/pymcl/core/download/Mirrors;->probeFast:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return v0

    .line 54
    .end local v2    # "now":J
    .end local v4    # "t0":J
    :catchall_1
    move-exception v0

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method public final setProbeHook(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 48
    iput-object p1, p0, Lcom/pymcl/core/download/Mirrors;->probeHook:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public final versionManifestUrls()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 65
    sget-object v0, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    sget-object v1, Lcom/pymcl/core/download/Mirrors;->MANIFEST_OFFICIAL:Ljava/util/List;

    sget-object v2, Lcom/pymcl/core/download/Mirrors;->MANIFEST_MIRROR:Ljava/util/List;

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->fileMirrorFirst()Z

    move-result v3

    invoke-virtual {p0}, Lcom/pymcl/core/download/Mirrors;->mode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/pymcl/core/download/Mirrors$Companion;->order(Ljava/util/List;Ljava/util/List;ZLjava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
