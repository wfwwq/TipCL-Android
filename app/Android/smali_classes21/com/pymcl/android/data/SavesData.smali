.class public final Lcom/pymcl/android/data/SavesData;
.super Ljava/lang/Object;
.source "SavesData.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSavesData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavesData.kt\ncom/pymcl/android/data/SavesData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1#2:47\n3938#3:48\n4474#3,2:49\n1221#4:51\n*S KotlinDebug\n*F\n+ 1 SavesData.kt\ncom/pymcl/android/data/SavesData\n*L\n31#1:48\n31#1:49,2\n31#1:51\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bJ\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000bJ\u001c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bJ\u0016\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0012\u00ca\u0001\u000c\u0008\u001d\u0012\u0008\u0008\u001e\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/pymcl/android/data/SavesData;",
        "",
        "<init>",
        "()V",
        "repo",
        "Lcom/pymcl/android/data/LauncherRepository;",
        "ctx",
        "Landroid/content/Context;",
        "inst",
        "Lcom/pymcl/core/instance/Instance;",
        "name",
        "",
        "defaultIsolation",
        "targets",
        "",
        "Lcom/pymcl/core/instance/SaveTarget;",
        "instance",
        "gameDir",
        "Ljava/io/File;",
        "version",
        "manager",
        "Lcom/pymcl/core/instance/SaveManager;",
        "datapackCandidates",
        "share",
        "",
        "f",
        "title",
        "view",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/pymcl/android/data/SavesData;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/SavesData;

    invoke-direct {v0}, Lcom/pymcl/android/data/SavesData;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SavesData;->INSTANCE:Lcom/pymcl/android/data/SavesData;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final defaultIsolation(Landroid/content/Context;)Ljava/lang/String;
    .locals 2
    .param p1, "ctx"    # Landroid/content/Context;

    .line 19
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/SavesData;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    const-string v1, "default_isolation"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final inst(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 3
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;

    .line 18
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/SavesData;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    .line 47
    .local v0, "r\\1":Lcom/pymcl/android/data/LauncherRepository;
    const/4 v1, 0x0

    .line 18
    .local v1, "$i$a$-let-SavesData$inst$1\\1\\18\\0":I
    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->currentInstance()Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    .end local v0    # "r\\1":Lcom/pymcl/android/data/LauncherRepository;
    .end local v1    # "$i$a$-let-SavesData$inst$1\\1\\18\\0":I
    :goto_0
    return-object v2
.end method

.method private final repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;

    .line 17
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final datapackCandidates(Landroid/content/Context;Ljava/io/File;)Ljava/util/List;
    .locals 16
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "gameDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "ctx"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameDir"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/android/data/SavesData;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getCatalog()Lcom/pymcl/core/mods/ModCatalog;

    move-result-object v1

    sget-object v3, Lcom/pymcl/core/mods/ResKind;->DATAPACK:Lcom/pymcl/core/mods/ResKind;

    invoke-virtual {v1, v3, v0}, Lcom/pymcl/core/mods/ModCatalog;->targetDir(Lcom/pymcl/core/mods/ResKind;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    new-array v1, v3, [Ljava/io/File;

    .line 31
    :cond_0
    nop

    .local v1, "$this$filter\\1":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 48
    .local v4, "$i$f$filter\\1\\31":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\2":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$filterTo\\2":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 49
    .local v7, "$i$f$filterTo\\2\\48":I
    array-length v8, v6

    :goto_0
    if-ge v3, v8, :cond_2

    aget-object v9, v6, v3

    .local v9, "element\\2":Ljava/lang/Object;
    move-object v10, v9

    .local v10, "it\\3":Ljava/io/File;
    const/4 v11, 0x0

    .line 31
    .local v11, "$i$a$-filter-SavesData$datapackCandidates$1\\3\\49\\0":I
    sget-object v12, Lcom/pymcl/android/data/SavesFormat;->INSTANCE:Lcom/pymcl/android/data/SavesFormat;

    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "getName(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    move-result v14

    new-instance v15, Ljava/io/File;

    const-string v0, "pack.mcmeta"

    invoke-direct {v15, v10, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/io/File;->isFile()Z

    move-result v0

    invoke-virtual {v12, v13, v14, v0}, Lcom/pymcl/android/data/SavesFormat;->isDatapack(Ljava/lang/String;ZZ)Z

    move-result v0

    .line 49
    .end local v10    # "it\\3":Ljava/io/File;
    .end local v11    # "$i$a$-filter-SavesData$datapackCandidates$1\\3\\49\\0":I
    if-eqz v0, :cond_1

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v9    # "element\\2":Ljava/lang/Object;
    :cond_1
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p2

    goto :goto_0

    .line 50
    :cond_2
    nop

    .end local v5    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$filterTo\\2":[Ljava/lang/Object;
    .end local v7    # "$i$f$filterTo\\2\\48":I
    move-object v0, v5

    check-cast v0, Ljava/util/List;

    .line 48
    nop

    .end local v1    # "$this$filter\\1":[Ljava/lang/Object;
    .end local v4    # "$i$f$filter\\1\\31":I
    check-cast v0, Ljava/lang/Iterable;

    .line 31
    nop

    .local v0, "$this$sortedBy\\4":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 51
    .local v1, "$i$f$sortedBy\\4\\31":I
    new-instance v3, Lcom/pymcl/android/data/SavesData$datapackCandidates$$inlined$sortedBy$1;

    invoke-direct {v3}, Lcom/pymcl/android/data/SavesData$datapackCandidates$$inlined$sortedBy$1;-><init>()V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 31
    .end local v0    # "$this$sortedBy\\4":Ljava/lang/Iterable;
    .end local v1    # "$i$f$sortedBy\\4\\31":I
    return-object v0
.end method

.method public final gameDir(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    sget-object v0, Lcom/pymcl/core/instance/SavesLocator;->INSTANCE:Lcom/pymcl/core/instance/SavesLocator;

    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/SavesData;->inst(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/pymcl/android/data/SavesData;->defaultIsolation(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p3, v2}, Lcom/pymcl/core/instance/SavesLocator;->gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final manager(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveManager;
    .locals 4
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Lcom/pymcl/core/instance/SaveManager;

    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/data/SavesData;->gameDir(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lcom/pymcl/core/instance/SaveManager;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final share(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)V
    .locals 7
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "f"    # Ljava/io/File;
    .param p3, "title"    # Ljava/lang/String;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "f"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 36
    .local v0, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.SEND"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v2, v1

    .line 47
    .local v2, "$this$share_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v3, 0x0

    .line 36
    .local v3, "$i$a$-apply-SavesData$share$i$1\\1\\36\\0":I
    sget-object v4, Lcom/pymcl/android/data/SavesFormat;->INSTANCE:Lcom/pymcl/android/data/SavesFormat;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getName(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/pymcl/android/data/SavesFormat;->mime(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "android.intent.extra.STREAM"

    move-object v5, v0

    check-cast v5, Landroid/os/Parcelable;

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 37
    .end local v2    # "$this$share_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v3    # "$i$a$-apply-SavesData$share$i$1\\1\\36\\0":I
    .local v1, "i":Landroid/content/Intent;
    move-object v2, p3

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v2

    const/high16 v3, 0x10000000

    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 38
    return-void
.end method

.method public final targets(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveTarget;",
            ">;"
        }
    .end annotation

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/pymcl/core/instance/SavesLocator;->INSTANCE:Lcom/pymcl/core/instance/SavesLocator;

    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/SavesData;->inst(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/pymcl/android/data/SavesData;->defaultIsolation(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/core/instance/SavesLocator;->targets(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final view(Landroid/content/Context;Ljava/io/File;)V
    .locals 7
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "f"    # Ljava/io/File;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "f"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, p2}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    .line 42
    .local v0, "uri":Landroid/net/Uri;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v2, v1

    .line 47
    .local v2, "$this$view_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v3, 0x0

    .line 42
    .local v3, "$i$a$-apply-SavesData$view$i$1\\1\\42\\0":I
    sget-object v4, Lcom/pymcl/android/data/SavesFormat;->INSTANCE:Lcom/pymcl/android/data/SavesFormat;

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getName(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/pymcl/android/data/SavesFormat;->mime(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const v4, 0x10000001

    invoke-virtual {v2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 43
    .end local v2    # "$this$view_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v3    # "$i$a$-apply-SavesData$view$i$1\\1\\42\\0":I
    .local v1, "i":Landroid/content/Intent;
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 44
    return-void
.end method
