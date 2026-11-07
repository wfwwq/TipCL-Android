.class public final Lcom/pymcl/android/data/SettingsLogic;
.super Ljava/lang/Object;
.source "SettingsLogic.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/SettingsLogic$Extras;,
        Lcom/pymcl/android/data/SettingsLogic$Validation;,
        Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsLogic.kt\ncom/pymcl/android/data/SettingsLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,164:1\n1#2:165\n1088#3,2:166\n*S KotlinDebug\n*F\n+ 1 SettingsLogic.kt\ncom/pymcl/android/data/SettingsLogic\n*L\n108#1:166,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\"\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0003BCDB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0006J>\u0010\u0015\u001a\u00020\u00062\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00102\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0014\u0010\u0019\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00100\u001aH\u0002J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u0010J\u001f\u0010&\u001a\u0004\u0018\u00010\u00102\u0006\u0010\'\u001a\u00020\u00062\u0008\u0008\u0002\u0010(\u001a\u00020\u0010\u00a2\u0006\u0002\u0010)J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+J\u000e\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020+J\u000e\u0010-\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u0010/\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00100\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00101\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00102\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00103\u001a\u00020.2\u0006\u0010!\u001a\u00020\"J\u000e\u00104\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"J\u000e\u00105\u001a\u0002062\u0006\u0010!\u001a\u00020\"J\u0016\u00107\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u00108\u001a\u000206J\"\u0010>\u001a\u00020\u00062\u0008\u0010?\u001a\u0004\u0018\u00010\u00062\u0008\u0010@\u001a\u0004\u0018\u00010\u00062\u0006\u0010A\u001a\u00020+R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008R\u000e\u0010\u001b\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0010X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00060=X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008F\u0012\u0008\u0008G\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006E"
    }
    d2 = {
        "Lcom/pymcl/android/data/SettingsLogic;",
        "",
        "<init>",
        "()V",
        "ISOLATION",
        "",
        "",
        "getISOLATION",
        "()Ljava/util/List;",
        "GC",
        "getGC",
        "VISIBILITY",
        "getVISIBILITY",
        "HOMEPAGE",
        "getHOMEPAGE",
        "isolationIndex",
        "",
        "v",
        "gcIndex",
        "visibilityIndex",
        "homepageIndex",
        "keep",
        "current",
        "index",
        "values",
        "toIndex",
        "Lkotlin/Function1;",
        "MIN_MEMORY_MB",
        "MIN_WIDTH",
        "MIN_HEIGHT",
        "MAX_DIM",
        "validate",
        "Lcom/pymcl/android/data/SettingsLogic$Validation;",
        "s",
        "Lcom/pymcl/android/ui/state/UiSettings;",
        "maxMemoryMb",
        "roundMemory",
        "mb",
        "parseIntField",
        "text",
        "maxDigits",
        "(Ljava/lang/String;I)Ljava/lang/Integer;",
        "totalMb",
        "",
        "recommendMemoryMb",
        "flyDurationEnabled",
        "",
        "flyToggleEnabled",
        "cardRadiusEnabled",
        "wallpaperRandomEnabled",
        "wallpaperEffectsEnabled",
        "updateUrlEnabled",
        "factoryAppearance",
        "snap",
        "Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;",
        "restore",
        "w",
        "WALLPAPER_FOLDER_SUPPORTED",
        "FLY_ANIMATION_SUPPORTED",
        "UPDATE_CHECK_SUPPORTED",
        "IMAGE_EXT",
        "",
        "wallpaperFileName",
        "lastSegment",
        "mime",
        "nowMs",
        "Extras",
        "Validation",
        "WallpaperSnap",
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

.field public static final FLY_ANIMATION_SUPPORTED:Z = false

.field private static final GC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final HOMEPAGE:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final IMAGE_EXT:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

.field private static final ISOLATION:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MAX_DIM:I = 0x1e00

.field public static final MIN_HEIGHT:I = 0xf0

.field public static final MIN_MEMORY_MB:I = 0x200

.field public static final MIN_WIDTH:I = 0x140

.field public static final UPDATE_CHECK_SUPPORTED:Z = false

.field private static final VISIBILITY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final WALLPAPER_FOLDER_SUPPORTED:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/pymcl/android/data/SettingsLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/SettingsLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SettingsLogic;->INSTANCE:Lcom/pymcl/android/data/SettingsLogic;

    .line 17
    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "none"

    aput-object v3, v1, v2

    const-string v4, "saves"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v4, "mods"

    const/4 v6, 0x2

    aput-object v4, v1, v6

    const-string v4, "all"

    const/4 v7, 0x3

    aput-object v4, v1, v7

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/pymcl/android/data/SettingsLogic;->ISOLATION:Ljava/util/List;

    .line 18
    new-array v1, v7, [Ljava/lang/String;

    const-string v4, "auto"

    aput-object v4, v1, v2

    const-string v4, "g1_tuned"

    aput-object v4, v1, v5

    aput-object v3, v1, v6

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/pymcl/android/data/SettingsLogic;->GC:Ljava/util/List;

    .line 19
    const/4 v1, 0x5

    new-array v3, v1, [Ljava/lang/String;

    const-string v4, "keep"

    aput-object v4, v3, v2

    const-string v4, "minimize"

    aput-object v4, v3, v5

    const-string v4, "hide"

    aput-object v4, v3, v6

    const-string v4, "hide_reopen"

    aput-object v4, v3, v7

    const-string v4, "close"

    aput-object v4, v3, v0

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sput-object v3, Lcom/pymcl/android/data/SettingsLogic;->VISIBILITY:Ljava/util/List;

    .line 20
    new-array v3, v7, [Ljava/lang/String;

    const-string v4, "news"

    aput-object v4, v3, v2

    const-string v4, "local"

    aput-object v4, v3, v5

    const-string v4, "blank"

    aput-object v4, v3, v6

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sput-object v3, Lcom/pymcl/android/data/SettingsLogic;->HOMEPAGE:Ljava/util/List;

    .line 155
    const/16 v3, 0x8

    new-array v3, v3, [Ljava/lang/String;

    const-string v4, "jpg"

    aput-object v4, v3, v2

    const-string v2, "jpeg"

    aput-object v2, v3, v5

    const-string v2, "png"

    aput-object v2, v3, v6

    const-string v2, "webp"

    aput-object v2, v3, v7

    const-string v2, "bmp"

    aput-object v2, v3, v0

    const-string v0, "gif"

    aput-object v0, v3, v1

    const/4 v0, 0x6

    const-string v1, "heic"

    aput-object v1, v3, v0

    const/4 v0, 0x7

    const-string v1, "heif"

    aput-object v1, v3, v0

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/SettingsLogic;->IMAGE_EXT:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$keep(Lcom/pymcl/android/data/SettingsLogic;Ljava/lang/String;ILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/SettingsLogic;
    .param p1, "current"    # Ljava/lang/String;
    .param p2, "index"    # I
    .param p3, "values"    # Ljava/util/List;
    .param p4, "toIndex"    # Lkotlin/jvm/functions/Function1;

    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/SettingsLogic;->keep(Ljava/lang/String;ILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final keep(Ljava/lang/String;ILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 3
    .param p1, "current"    # Ljava/lang/String;
    .param p2, "index"    # I
    .param p3, "values"    # Ljava/util/List;
    .param p4, "toIndex"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 30
    if-eqz p1, :cond_0

    invoke-interface {p4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_0

    move-object v0, p1

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    if-ltz p2, :cond_1

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-eqz v1, :cond_2

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_2
    move v1, p2

    .line 165
    .local v1, "it\\1":I
    const/4 v2, 0x0

    .line 30
    .local v2, "$i$a$-getOrElse-SettingsLogic$keep$1\\1\\30\\0":I
    invoke-interface {p3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .end local v1    # "it\\1":I
    .end local v2    # "$i$a$-getOrElse-SettingsLogic$keep$1\\1\\30\\0":I
    :goto_1
    check-cast v0, Ljava/lang/String;

    :goto_2
    return-object v0
.end method

.method public static synthetic parseIntField$default(Lcom/pymcl/android/data/SettingsLogic;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    .line 108
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x6

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/SettingsLogic;->parseIntField(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final cardRadiusEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getSquareCards()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final factoryAppearance(Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 60
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    new-instance v2, Lcom/pymcl/android/ui/state/UiSettings;

    const v58, 0x3fffff

    const/16 v59, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, -0x1

    invoke-direct/range {v2 .. v59}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v2

    .line 136
    .local v0, "d":Lcom/pymcl/android/ui/state/UiSettings;
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getDark()Z

    move-result v2

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getAccentIndex()I

    move-result v3

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getBackground()I

    move-result v5

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getSquareCards()Z

    move-result v7

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getCardRadius()I

    move-result v8

    .line 137
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getMotion()Z

    move-result v9

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyAnimation()Z

    move-result v10

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyDurationMs()I

    move-result v11

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getSidebarFrost()Z

    move-result v12

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getNavStyle()I

    move-result v13

    .line 138
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperRandom()Z

    move-result v16

    .line 136
    nop

    .line 138
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperBlur()I

    move-result v18

    .line 136
    const v57, 0x3fffff

    const/16 v58, 0x0

    const/4 v4, 0x0

    const-string v14, ""

    const-string v15, ""

    const/16 v19, 0x19

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v41, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v54, 0x0

    const v56, -0x37fec

    invoke-static/range {v1 .. v58}, Lcom/pymcl/android/ui/state/UiSettings;->copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v2

    return-object v2
.end method

.method public final flyDurationEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMotion()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyAnimation()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final flyToggleEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getMotion()Z

    move-result v0

    return v0
.end method

.method public final gcIndex(Ljava/lang/String;)I
    .locals 1
    .param p1, "v"    # Ljava/lang/String;

    .line 24
    const-string v0, "g1_tuned"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const-string v0, "none"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getGC()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 18
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->GC:Ljava/util/List;

    return-object v0
.end method

.method public final getHOMEPAGE()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 20
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->HOMEPAGE:Ljava/util/List;

    return-object v0
.end method

.method public final getISOLATION()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->ISOLATION:Ljava/util/List;

    return-object v0
.end method

.method public final getVISIBILITY()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 19
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->VISIBILITY:Ljava/util/List;

    return-object v0
.end method

.method public final homepageIndex(Ljava/lang/String;)I
    .locals 1
    .param p1, "v"    # Ljava/lang/String;

    .line 26
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v0, "local"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :sswitch_1
    const-string v0, "blank"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :sswitch_2
    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x2

    goto :goto_2

    :sswitch_3
    const-string v0, "html"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return v0

    :sswitch_data_0
    .sparse-switch
        0x3107ab -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x5979154 -> :sswitch_1
        0x625df6b -> :sswitch_0
    .end sparse-switch
.end method

.method public final isolationIndex(Ljava/lang/String;)I
    .locals 4
    .param p1, "v"    # Ljava/lang/String;

    .line 23
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->ISOLATION:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 165
    .local v1, "it\\1":I
    const/4 v2, 0x0

    .line 23
    .local v2, "$i$a$-takeIf-SettingsLogic$isolationIndex$1\\1\\23\\0":I
    if-ltz v1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .end local v1    # "it\\1":I
    .end local v2    # "$i$a$-takeIf-SettingsLogic$isolationIndex$1\\1\\23\\0":I
    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x3

    :goto_2
    return v0
.end method

.method public final maxMemoryMb(J)I
    .locals 2
    .param p1, "totalMb"    # J

    .line 112
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const/16 v0, 0x2000

    goto :goto_0

    :cond_0
    const/16 v0, 0x600

    int-to-long v0, v0

    sub-long v0, p1, v0

    long-to-int v0, v0

    const/16 v1, 0x400

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/SettingsLogic;->roundMemory(I)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final parseIntField(Ljava/lang/String;I)Ljava/lang/Integer;
    .locals 11
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "maxDigits"    # I

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    .line 165
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 108
    .local v2, "$i$a$-takeIf-SettingsLogic$parseIntField$1\\1\\108\\0":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-lez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    if-eqz v3, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v3, p2, :cond_3

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    .local v3, "$this$all\\2":Ljava/lang/CharSequence;
    const/4 v6, 0x0

    .line 166
    .local v6, "$i$f$all\\2\\108":I
    move v7, v5

    :goto_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-ge v7, v8, :cond_2

    invoke-interface {v3, v7}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    .local v8, "element\\2":C
    move v9, v8

    .local v9, "p0\\3":C
    const/4 v10, 0x0

    .line 108
    .local v10, "$i$a$-all-SettingsLogic$parseIntField$1$1\\3\\166\\1":I
    invoke-static {v9}, Ljava/lang/Character;->isDigit(C)Z

    move-result v9

    .line 166
    .end local v9    # "p0\\3":C
    .end local v10    # "$i$a$-all-SettingsLogic$parseIntField$1$1\\3\\166\\1":I
    if-nez v9, :cond_1

    move v3, v5

    goto :goto_2

    .end local v8    # "element\\2":C
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 167
    :cond_2
    move v3, v4

    .line 108
    .end local v3    # "$this$all\\2":Ljava/lang/CharSequence;
    .end local v6    # "$i$f$all\\2\\108":I
    :goto_2
    if-eqz v3, :cond_3

    goto :goto_3

    :cond_3
    move v4, v5

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-SettingsLogic$parseIntField$1\\1\\108\\0":I
    :goto_3
    const/4 v1, 0x0

    if-eqz v4, :cond_4

    goto :goto_4

    :cond_4
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_5

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method public final recommendMemoryMb(J)I
    .locals 3
    .param p1, "totalMb"    # J

    .line 116
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const/16 v0, 0x800

    return v0

    .line 117
    :cond_0
    const/4 v0, 0x2

    int-to-long v0, v0

    div-long v0, p1, v0

    long-to-int v0, v0

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/SettingsLogic;->roundMemory(I)I

    move-result v0

    const/16 v1, 0x400

    const/16 v2, 0x1000

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    .line 118
    .local v0, "half":I
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/data/SettingsLogic;->maxMemoryMb(J)I

    move-result v1

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    move-result v1

    return v1
.end method

.method public final restore(Lcom/pymcl/android/ui/state/UiSettings;Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;)Lcom/pymcl/android/ui/state/UiSettings;
    .locals 59
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;
    .param p2, "w"    # Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;

    const-string v0, "s"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "w"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {v2}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;->getPath()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;->getFolder()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;->getRandom()Z

    move-result v16

    invoke-virtual {v2}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;->getBlur()I

    move-result v18

    invoke-virtual {v2}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;->getMask()I

    move-result v19

    const v57, 0x3fffff

    const/16 v58, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const v56, -0x37001

    invoke-static/range {v1 .. v58}, Lcom/pymcl/android/ui/state/UiSettings;->copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    return-object v0
.end method

.method public final roundMemory(I)I
    .locals 1
    .param p1, "mb"    # I

    .line 105
    div-int/lit16 v0, p1, 0x100

    mul-int/lit16 v0, v0, 0x100

    return v0
.end method

.method public final snap(Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;
    .locals 7
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    new-instance v1, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperFolder()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperRandom()Z

    move-result v4

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperBlur()I

    move-result v5

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperMask()I

    move-result v6

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/data/SettingsLogic$WallpaperSnap;-><init>(Ljava/lang/String;Ljava/lang/String;ZII)V

    return-object v1
.end method

.method public final updateUrlEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getAutoUpdate()Z

    move-result v0

    return v0
.end method

.method public final validate(Lcom/pymcl/android/ui/state/UiSettings;I)Lcom/pymcl/android/data/SettingsLogic$Validation;
    .locals 60
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;
    .param p2, "maxMemoryMb"    # I

    move/from16 v0, p2

    const-string v1, "s"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 90
    .local v1, "p":Ljava/util/List;
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v3

    const/16 v4, 0x140

    if-lt v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v3

    const/16 v4, 0x1e00

    if-gt v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v3

    const/16 v5, 0xf0

    if-lt v3, v5, :cond_0

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v3

    if-le v3, v4, :cond_1

    .line 91
    :cond_0
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWidth()I

    move-result v4

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getHeight()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u9ed8\u8ba4\u5206\u8fa8\u7387\u5e94\u5728 320\u00d7240 \u5230 7680\u00d77680 \u4e4b\u95f4\uff08\u5f53\u524d "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, "\u00d7"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "\uff09"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    :cond_1
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getMemoryMb()I

    move-result v3

    const/16 v4, 0x200

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-ge v3, v4, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    const-string v4, "\u9ed8\u8ba4\u5185\u5b58\u4e0d\u80fd\u4f4e\u4e8e 512 MB"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 93
    :cond_2
    if-gt v5, v0, :cond_3

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getMemoryMb()I

    move-result v3

    if-ge v0, v3, :cond_3

    move v3, v5

    goto :goto_0

    :cond_3
    move v3, v6

    :goto_0
    if-eqz v3, :cond_4

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getMemoryMb()I

    move-result v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9ed8\u8ba4\u5185\u5b58 "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, " MB \u8d85\u8fc7\u672c\u673a\u53ef\u5206\u914d\u4e0a\u9650 "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, " MB"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 94
    :cond_4
    :goto_1
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getHomepage()I

    move-result v3

    if-ne v3, v5, :cond_5

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getCustomHomepage()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    const-string v4, "\u4e3b\u9875\u9009\u4e86\u300c\u672c\u5730 HTML\u300d\uff0c\u4f46\u6ca1\u586b .html \u6587\u4ef6\u8def\u5f84"

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 96
    :cond_5
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getThreads()I

    move-result v3

    const/16 v4, 0x40

    invoke-static {v3, v5, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v22

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getChunks()I

    move-result v3

    const/16 v4, 0x10

    invoke-static {v3, v5, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v23

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getSpeedLimit()I

    move-result v3

    invoke-static {v3, v6}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v27

    .line 97
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getFlyDurationMs()I

    move-result v3

    const/16 v4, 0xc8

    const/16 v5, 0x4b0

    invoke-static {v3, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v12

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperBlur()I

    move-result v3

    const/16 v4, 0x28

    invoke-static {v3, v6, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v19

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperMask()I

    move-result v3

    const/16 v4, 0x5a

    invoke-static {v3, v6, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v20

    .line 98
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getCardRadius()I

    move-result v3

    const/16 v4, 0x18

    invoke-static {v3, v6, v4}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v9

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getMemoryMb()I

    move-result v3

    move-object/from16 v4, p0

    invoke-virtual {v4, v3}, Lcom/pymcl/android/data/SettingsLogic;->roundMemory(I)I

    move-result v30

    .line 99
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getJvmArgs()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v37

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperPath()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperFolder()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    .line 100
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getUpdateUrl()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v53

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getMsClientId()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v54

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getCustomHomepage()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v51

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/UiSettings;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v28

    .line 95
    nop

    .line 98
    nop

    .line 95
    nop

    .line 97
    nop

    .line 95
    nop

    .line 99
    nop

    .line 95
    nop

    .line 97
    nop

    .line 95
    nop

    .line 96
    nop

    .line 95
    nop

    .line 96
    nop

    .line 100
    nop

    .line 95
    nop

    .line 98
    nop

    .line 95
    nop

    .line 99
    nop

    .line 95
    nop

    .line 100
    nop

    .line 95
    nop

    .line 100
    nop

    .line 95
    const v58, 0x32fffb

    const/16 v59, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const v57, -0xb1b3241

    invoke-static/range {v2 .. v59}, Lcom/pymcl/android/ui/state/UiSettings;->copy$default(Lcom/pymcl/android/ui/state/UiSettings;ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILjava/lang/Object;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v3

    .line 102
    .local v3, "fixed":Lcom/pymcl/android/ui/state/UiSettings;
    new-instance v2, Lcom/pymcl/android/data/SettingsLogic$Validation;

    invoke-direct {v2, v1, v3}, Lcom/pymcl/android/data/SettingsLogic$Validation;-><init>(Ljava/util/List;Lcom/pymcl/android/ui/state/UiSettings;)V

    return-object v2
.end method

.method public final visibilityIndex(Ljava/lang/String;)I
    .locals 5
    .param p1, "v"    # Ljava/lang/String;

    .line 25
    sget-object v0, Lcom/pymcl/android/data/SettingsLogic;->VISIBILITY:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 165
    .local v1, "it\\1":I
    const/4 v2, 0x0

    .line 25
    .local v2, "$i$a$-takeIf-SettingsLogic$visibilityIndex$1\\1\\25\\0":I
    const/4 v3, 0x0

    if-ltz v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v3

    .end local v1    # "it\\1":I
    .end local v2    # "$i$a$-takeIf-SettingsLogic$visibilityIndex$1\\1\\25\\0":I
    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :cond_2
    return v3
.end method

.method public final wallpaperEffectsEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperPath()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperFolder()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final wallpaperFileName(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 9
    .param p1, "lastSegment"    # Ljava/lang/String;
    .param p2, "mime"    # Ljava/lang/String;
    .param p3, "nowMs"    # J

    .line 159
    const-string v0, "toLowerCase(...)"

    const/16 v1, 0x2f

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    invoke-static {p1, v1, v3, v2, v3}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    const/16 v5, 0x2e

    const-string v6, ""

    invoke-static {v4, v5, v6}, Lkotlin/text/StringsKt;->substringAfterLast(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v4, :cond_0

    move-object v5, v4

    .line 165
    .local v5, "it\\1":Ljava/lang/String;
    const/4 v6, 0x0

    .line 159
    .local v6, "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromName$1\\1\\159\\0":I
    sget-object v7, Lcom/pymcl/android/data/SettingsLogic;->IMAGE_EXT:Ljava/util/Set;

    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    .end local v5    # "it\\1":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromName$1\\1\\159\\0":I
    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v4, v3

    .line 160
    .local v4, "fromName":Ljava/lang/String;
    :goto_0
    if-eqz p2, :cond_3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz v5, :cond_3

    move-object v0, v5

    .line 165
    .local v0, "it\\2":Ljava/lang/String;
    const/4 v6, 0x0

    .line 160
    .local v6, "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromMime$1\\2\\160\\0":I
    const-string v7, "image/"

    const/4 v8, 0x0

    invoke-static {v0, v7, v8, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .end local v0    # "it\\2":Ljava/lang/String;
    .end local v6    # "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromMime$1\\2\\160\\0":I
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    if-eqz v5, :cond_3

    invoke-static {v5, v1, v3, v2, v3}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 165
    .local v0, "it\\3":Ljava/lang/String;
    const/4 v1, 0x0

    .line 160
    .local v1, "$i$a$-let-SettingsLogic$wallpaperFileName$fromMime$2\\3\\160\\0":I
    const-string v2, "jpeg"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "jpg"

    move-object v0, v2

    .end local v0    # "it\\3":Ljava/lang/String;
    .end local v1    # "$i$a$-let-SettingsLogic$wallpaperFileName$fromMime$2\\3\\160\\0":I
    :cond_2
    move-object v1, v0

    .line 165
    .local v1, "it\\4":Ljava/lang/String;
    const/4 v2, 0x0

    .line 160
    .local v2, "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromMime$3\\4\\160\\0":I
    sget-object v5, Lcom/pymcl/android/data/SettingsLogic;->IMAGE_EXT:Ljava/util/Set;

    invoke-interface {v5, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    .end local v1    # "it\\4":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-SettingsLogic$wallpaperFileName$fromMime$3\\4\\160\\0":I
    if-eqz v1, :cond_3

    move-object v3, v0

    .line 161
    .local v3, "fromMime":Ljava/lang/String;
    :cond_3
    if-nez v4, :cond_5

    if-nez v3, :cond_4

    const-string v0, "img"

    goto :goto_2

    :cond_4
    move-object v0, v3

    goto :goto_2

    :cond_5
    move-object v0, v4

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "wallpaper-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final wallpaperRandomEnabled(Lcom/pymcl/android/ui/state/UiSettings;)Z
    .locals 1
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/UiSettings;->getWallpaperFolder()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
