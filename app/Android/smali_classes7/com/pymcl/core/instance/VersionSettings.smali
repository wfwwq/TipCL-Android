.class public final Lcom/pymcl/core/instance/VersionSettings;
.super Ljava/lang/Object;
.source "Instances.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/instance/VersionSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInstances.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instances.kt\ncom/pymcl/core/instance/VersionSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,96:1\n1#2:97\n2068#3,2:98\n2068#3,2:100\n*S KotlinDebug\n*F\n+ 1 Instances.kt\ncom/pymcl/core/instance/VersionSettings\n*L\n89#1:98,2\n90#1:100,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000eJ\u001c\u0010\u000f\u001a\u00020\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/core/instance/VersionSettings;",
        "",
        "versionDir",
        "Ljava/io/File;",
        "defaultIsolation",
        "",
        "<init>",
        "(Ljava/io/File;Ljava/lang/String;)V",
        "getVersionDir",
        "()Ljava/io/File;",
        "file",
        "getFile",
        "load",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "save",
        "",
        "m",
        "",
        "isolation",
        "gameDir",
        "instanceRoot",
        "applyIsolation",
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
.field public static final Companion:Lcom/pymcl/core/instance/VersionSettings$Companion;

.field private static final SHARED_FOR:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# instance fields
.field private final defaultIsolation:Ljava/lang/String;

.field private final versionDir:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/pymcl/core/instance/VersionSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/instance/VersionSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/instance/VersionSettings;->Companion:Lcom/pymcl/core/instance/VersionSettings$Companion;

    .line 75
    const/4 v0, 0x2

    new-array v1, v0, [Lkotlin/Pair;

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "mods"

    aput-object v4, v2, v3

    const-string v5, "config"

    const/4 v6, 0x1

    aput-object v5, v2, v6

    const-string v5, "resourcepacks"

    aput-object v5, v2, v0

    const/4 v7, 0x3

    const-string v8, "shaderpacks"

    aput-object v8, v2, v7

    const-string v9, "downloads"

    const/4 v10, 0x4

    aput-object v9, v2, v10

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v9, "saves"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v3

    .line 76
    new-array v2, v10, [Ljava/lang/String;

    aput-object v9, v2, v3

    aput-object v5, v2, v6

    aput-object v8, v2, v0

    const-string v0, "screenshots"

    aput-object v0, v2, v7

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    aput-object v0, v1, v6

    .line 75
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/instance/VersionSettings;->SHARED_FOR:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 1
    .param p1, "versionDir"    # Ljava/io/File;
    .param p2, "defaultIsolation"    # Ljava/lang/String;

    const-string v0, "versionDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultIsolation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/VersionSettings;->versionDir:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/core/instance/VersionSettings;->defaultIsolation:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 69
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "all"

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/core/instance/VersionSettings;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getSHARED_FOR$cp()Ljava/util/Map;
    .locals 1

    .line 69
    sget-object v0, Lcom/pymcl/core/instance/VersionSettings;->SHARED_FOR:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public final applyIsolation(Ljava/io/File;)Ljava/io/File;
    .locals 19
    .param p1, "instanceRoot"    # Ljava/io/File;

    move-object/from16 v0, p1

    const-string v1, "instanceRoot"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/core/instance/VersionSettings;->isolation()Ljava/lang/String;

    move-result-object v1

    .local v1, "iso":Ljava/lang/String;
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v2

    .line 88
    .local v2, "gd":Ljava/io/File;
    move-object/from16 v3, p0

    iget-object v4, v3, Lcom/pymcl/core/instance/VersionSettings;->versionDir:Ljava/io/File;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 89
    const/4 v4, 0x5

    new-array v4, v4, [Ljava/lang/String;

    const-string v5, "mods"

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const-string v5, "config"

    const/4 v7, 0x1

    aput-object v5, v4, v7

    const/4 v5, 0x2

    const-string v8, "saves"

    aput-object v8, v4, v5

    const/4 v5, 0x3

    const-string v8, "resourcepacks"

    aput-object v8, v4, v5

    const/4 v5, 0x4

    const-string v8, "shaderpacks"

    aput-object v8, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 98
    .local v5, "$i$f$forEach":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 89
    .local v11, "$i$a$-forEach-VersionSettings$applyIsolation$1":I
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v2, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->mkdirs()Z

    .line 98
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-forEach-VersionSettings$applyIsolation$1":I
    nop

    .end local v9    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 99
    :cond_0
    nop

    .line 90
    .end local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach":I
    sget-object v4, Lcom/pymcl/core/instance/VersionSettings;->SHARED_FOR:Ljava/util/Map;

    invoke-interface {v4, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_5

    check-cast v4, Ljava/lang/Iterable;

    .restart local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 100
    .restart local v5    # "$i$f$forEach":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .restart local v9    # "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "d":Ljava/lang/String;
    const/4 v11, 0x0

    .line 90
    .local v11, "$i$a$-forEach-VersionSettings$applyIsolation$2":I
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v0, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v13, v12

    .local v13, "src":Ljava/io/File;
    new-instance v14, Ljava/io/File;

    invoke-direct {v14, v2, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 91
    .local v14, "dst":Ljava/io/File;
    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-virtual {v14}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v12

    if-eqz v12, :cond_2

    array-length v12, v12

    if-nez v12, :cond_1

    move v12, v7

    goto :goto_2

    :cond_1
    move v12, v6

    :goto_2
    if-nez v12, :cond_2

    move v12, v7

    goto :goto_3

    :cond_2
    move v12, v6

    :goto_3
    if-nez v12, :cond_3

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Lkotlin/io/FilesKt;->copyRecursively$default(Ljava/io/File;Ljava/io/File;ZLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z

    .line 100
    .end local v10    # "d":Ljava/lang/String;
    .end local v11    # "$i$a$-forEach-VersionSettings$applyIsolation$2":I
    .end local v13    # "src":Ljava/io/File;
    .end local v14    # "dst":Ljava/io/File;
    :cond_3
    nop

    .end local v9    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 101
    :cond_4
    nop

    .line 93
    .end local v4    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach":I
    :cond_5
    return-object v2
.end method

.method public final gameDir(Ljava/io/File;)Ljava/io/File;
    .locals 3
    .param p1, "instanceRoot"    # Ljava/io/File;

    const-string v0, "instanceRoot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "all"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "saves"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "mods"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/core/instance/VersionSettings;->isolation()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/core/instance/VersionSettings;->versionDir:Ljava/io/File;

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    return-object v0
.end method

.method public final getFile()Ljava/io/File;
    .locals 3

    .line 78
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/core/instance/VersionSettings;->versionDir:Ljava/io/File;

    const-string v2, "pymcl.json"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getVersionDir()Ljava/io/File;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/pymcl/core/instance/VersionSettings;->versionDir:Ljava/io/File;

    return-object v0
.end method

.method public final isolation()Ljava/lang/String;
    .locals 2

    .line 82
    invoke-virtual {p0}, Lcom/pymcl/core/instance/VersionSettings;->load()Ljava/util/Map;

    move-result-object v0

    const-string v1, "isolation"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "none"

    if-nez v0, :cond_0

    move-object v0, v1

    .local v0, "v":Ljava/lang/String;
    :cond_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v0

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/pymcl/core/instance/VersionSettings;->defaultIsolation:Ljava/lang/String;

    :goto_2
    return-object v1
.end method

.method public final load()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 79
    sget-object v0, Lcom/pymcl/core/instance/VersionSettings;->Companion:Lcom/pymcl/core/instance/VersionSettings$Companion;

    invoke-virtual {v0}, Lcom/pymcl/core/instance/VersionSettings$Companion;->getDEFAULTS()Ljava/util/Map;

    move-result-object v0

    move-object v1, v0

    .line 97
    .local v1, "it":Ljava/util/Map;
    const/4 v2, 0x0

    .line 79
    .local v2, "$i$a$-also-VersionSettings$load$1":I
    sget-object v3, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/VersionSettings;->getFile()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_0

    const/4 v3, 0x0

    new-array v3, v3, [Lkotlin/Pair;

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    :cond_0
    invoke-interface {v1, v3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .end local v1    # "it":Ljava/util/Map;
    .end local v2    # "$i$a$-also-VersionSettings$load$1":I
    return-object v0
.end method

.method public final save(Ljava/util/Map;)V
    .locals 3
    .param p1, "m"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/VersionSettings;->getFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .local v0, "cur":Ljava/util/Map;
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {p0}, Lcom/pymcl/core/instance/VersionSettings;->getFile()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    return-void
.end method
