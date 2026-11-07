.class public final Lcom/pymcl/android/data/SaveImportProgress;
.super Ljava/lang/Object;
.source "SaveImportProgress.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/SaveImportProgress$Cancelled;,
        Lcom/pymcl/android/data/SaveImportProgress$Cb;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveImportProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveImportProgress.kt\ncom/pymcl/android/data/SaveImportProgress\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,125:1\n777#2:126\n873#2,2:127\n1739#2:134\n1814#2,3:135\n1739#2:138\n1814#2,3:139\n1739#2:142\n1814#2,3:143\n1#3:129\n1505#4,2:130\n1505#4,2:132\n15101#5,2:146\n*S KotlinDebug\n*F\n+ 1 SaveImportProgress.kt\ncom/pymcl/android/data/SaveImportProgress\n*L\n44#1:126\n44#1:127,2\n88#1:134\n88#1:135,3\n90#1:138\n90#1:139,3\n91#1:142\n91#1:143,3\n56#1:130,2\n66#1:132,2\n119#1:146,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\'(B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008H\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J8\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00082\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001aJ8\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u001e2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001aJ7\u0010 \u001a\u00020!2*\u0010\u001d\u001a\u0016\u0012\u0012\u0008\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020!0#0\"\"\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020!0#\u00a2\u0006\u0002\u0010$J\u000e\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020!\u00ca\u0001\u000c\u0008*\u0012\u0008\u0008+\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/android/data/SaveImportProgress;",
        "",
        "<init>",
        "()V",
        "safeTarget",
        "Ljava/io/File;",
        "staging",
        "rel",
        "",
        "finish",
        "Lcom/pymcl/core/instance/SaveImport$Result;",
        "savesDir",
        "plan",
        "Lcom/pymcl/core/instance/SaveImport$Plan;",
        "files",
        "",
        "bytes",
        "",
        "importZip",
        "archiveName",
        "open",
        "Lkotlin/Function0;",
        "Ljava/io/InputStream;",
        "limits",
        "Lcom/pymcl/core/instance/SaveImport$Limits;",
        "cb",
        "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
        "importTree",
        "folderName",
        "entries",
        "",
        "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
        "zipOf",
        "",
        "",
        "Lkotlin/Pair;",
        "([Lkotlin/Pair;)[B",
        "streamOf",
        "data",
        "Cb",
        "Cancelled",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/SaveImportProgress;


# direct methods
.method public static synthetic $r8$lambda$Tv5XbEloHZ12E8u8XSKztSZ1dDo(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/SaveImportProgress;->importZip$lambda$2$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$p6cRC_7d-uUB9XbulunAHCgOBv0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/SaveImportProgress;->importZip$lambda$0$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/SaveImportProgress;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveImportProgress;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SaveImportProgress;->INSTANCE:Lcom/pymcl/android/data/SaveImportProgress;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 14
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "staging"    # Ljava/io/File;
    .param p3, "plan"    # Lcom/pymcl/core/instance/SaveImport$Plan;
    .param p4, "files"    # I
    .param p5, "bytes"    # J

    .line 43
    move-object/from16 v0, p2

    new-instance v1, Ljava/io/File;

    const-string v2, "level.dat"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 44
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    :cond_1
    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 126
    .local v2, "$i$f$filter\\1\\44":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 127
    .local v5, "$i$f$filterTo\\2\\126":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\3":Ljava/lang/String;
    const/4 v9, 0x0

    .line 44
    .local v9, "$i$a$-filter-SaveImportProgress$finish$existing$1\\3\\127\\0":I
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const-string v12, "."

    const/4 v13, 0x0

    invoke-static {v8, v12, v13, v10, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    .line 127
    .end local v8    # "it\\3":Ljava/lang/String;
    .end local v9    # "$i$a$-filter-SaveImportProgress$finish$existing$1\\3\\127\\0":I
    if-nez v10, :cond_2

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 128
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_3
    nop

    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v4    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo\\2\\126":I
    check-cast v3, Ljava/util/List;

    .line 126
    nop

    .line 44
    .end local v1    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter\\1\\44":I
    nop

    .line 45
    .local v3, "existing":Ljava/util/List;
    sget-object v1, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v1, v2, v4}, Lcom/pymcl/core/instance/SaveImport;->uniqueName(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v6

    .line 46
    .local v6, "name":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 47
    new-instance v5, Lcom/pymcl/core/instance/SaveImport$Result;

    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v10, v1, 0x1

    move/from16 v7, p4

    move-wide/from16 v8, p5

    invoke-direct/range {v5 .. v10}, Lcom/pymcl/core/instance/SaveImport$Result;-><init>(Ljava/lang/String;IJZ)V

    return-object v5

    .line 46
    :cond_4
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5bfc\u5165\u5931\u8d25\uff1a\u65e0\u6cd5\u5199\u5165 "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 43
    .end local v3    # "existing":Ljava/util/List;
    .end local v6    # "name":Ljava/lang/String;
    :cond_5
    new-instance v1, Ljava/io/IOException;

    const-string v2, "\u6ca1\u6709\u627e\u5230 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic importTree$default(Lcom/pymcl/android/data/SaveImportProgress;Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 6

    .line 86
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    new-instance v0, Lcom/pymcl/core/instance/SaveImport$Limits;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    new-instance p5, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-direct {p5, p7, p7, p6, p7}, Lcom/pymcl/android/data/SaveImportProgress$Cb;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-virtual/range {p0 .. p5}, Lcom/pymcl/android/data/SaveImportProgress;->importTree(Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic importZip$default(Lcom/pymcl/android/data/SaveImportProgress;Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 6

    .line 54
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    new-instance v0, Lcom/pymcl/core/instance/SaveImport$Limits;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    new-instance p5, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const/4 p6, 0x3

    const/4 p7, 0x0

    invoke-direct {p5, p7, p7, p6, p7}, Lcom/pymcl/android/data/SaveImportProgress$Cb;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    invoke-virtual/range {p0 .. p5}, Lcom/pymcl/android/data/SaveImportProgress;->importZip(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final importZip$lambda$0$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 56
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private static final importZip$lambda$2$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 66
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private final safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .param p1, "staging"    # Ljava/io/File;
    .param p2, "rel"    # Ljava/lang/String;

    .line 36
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 37
    .local v0, "out":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getPath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v2, v5, v3, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 38
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 37
    :cond_0
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u538b\u7f29\u5305\u91cc\u6709\u8d8a\u754c\u8def\u5f84: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final importTree(Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 32
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "folderName"    # Ljava/lang/String;
    .param p3, "entries"    # Ljava/util/List;
    .param p4, "limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
    .param p5, "cb"    # Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
            ">;",
            "Lcom/pymcl/core/instance/SaveImport$Limits;",
            "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
            ")",
            "Lcom/pymcl/core/instance/SaveImport$Result;"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    const-string v0, "savesDir"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "folderName"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "entries"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "limits"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cb"

    move-object/from16 v11, p5

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v1

    if-gt v0, v1, :cond_10

    .line 88
    move-object v0, v9

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 134
    .local v1, "$i$f$map\\1\\88":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\2":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 135
    .local v6, "$i$f$mapTo\\2\\134":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 136
    .local v12, "item\\2":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    .local v13, "it\\3":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    const/4 v14, 0x0

    .line 88
    .local v14, "$i$a$-map-SaveImportProgress$importTree$norm$1\\3\\136\\0":I
    sget-object v15, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v13}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getPath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-static {v4, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    .line 136
    .end local v13    # "it\\3":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v14    # "$i$a$-map-SaveImportProgress$importTree$norm$1\\3\\136\\0":I
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v4, 0xa

    goto :goto_0

    .line 88
    .restart local v13    # "it\\3":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v14    # "$i$a$-map-SaveImportProgress$importTree$norm$1\\3\\136\\0":I
    :cond_0
    new-instance v4, Ljava/io/IOException;

    invoke-virtual {v13}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getPath()Ljava/lang/String;

    move-result-object v7

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v0

    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .local v17, "$this$map\\1":Ljava/lang/Iterable;
    const-string v0, "\u4e0d\u5b89\u5168\u7684\u8def\u5f84\uff1a"

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v4

    .line 137
    .end local v12    # "item\\2":Ljava/lang/Object;
    .end local v13    # "it\\3":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v14    # "$i$a$-map-SaveImportProgress$importTree$norm$1\\3\\136\\0":I
    .end local v17    # "$this$map\\1":Ljava/lang/Iterable;
    .restart local v0    # "$this$map\\1":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v17, v0

    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "destination\\2":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\2\\134":I
    .restart local v17    # "$this$map\\1":Ljava/lang/Iterable;
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 134
    nop

    .line 88
    .end local v1    # "$i$f$map\\1\\88":I
    .end local v17    # "$this$map\\1":Ljava/lang/Iterable;
    move-object v12, v0

    .line 90
    .local v12, "norm":Ljava/util/List;
    move-object v0, v12

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 138
    .local v1, "$i$f$map\\4\\90":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination\\5":Ljava/util/Collection;
    move-object v4, v0

    .local v4, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 139
    .local v5, "$i$f$mapTo\\5\\138":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v14, 0x0

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 140
    .local v7, "item\\5":Ljava/lang/Object;
    move-object v15, v7

    check-cast v15, Lkotlin/Pair;

    const/16 v17, 0x0

    .local v17, "$i$a$-map-SaveImportProgress$importTree$wrapped$1\\6\\140\\0":I
    invoke-virtual {v15}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v13, v18

    check-cast v13, Ljava/lang/String;

    .local v13, "p\\6":Ljava/lang/String;
    invoke-virtual {v15}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    .line 90
    .local v15, "e\\6":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    move-object/from16 v18, v0

    .end local v0    # "$this$map\\4":Ljava/lang/Iterable;
    .local v18, "$this$map\\4":Ljava/lang/Iterable;
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move/from16 v19, v1

    const/4 v1, 0x2

    .end local v1    # "$i$f$map\\4\\90":I
    .local v19, "$i$f$map\\4\\90":I
    invoke-static {v0, v8, v14, v1, v14}, Lcom/pymcl/core/instance/SaveImport;->sanitizeName$default(Lcom/pymcl/core/instance/SaveImport;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 140
    .end local v13    # "p\\6":Ljava/lang/String;
    .end local v15    # "e\\6":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "$i$a$-map-SaveImportProgress$importTree$wrapped$1\\6\\140\\0":I
    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    move/from16 v1, v19

    goto :goto_1

    .line 141
    .end local v7    # "item\\5":Ljava/lang/Object;
    .end local v18    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map\\4\\90":I
    .restart local v0    # "$this$map\\4":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$map\\4\\90":I
    :cond_2
    move-object/from16 v18, v0

    move/from16 v19, v1

    .end local v0    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map\\4\\90":I
    .end local v3    # "destination\\5":Ljava/util/Collection;
    .end local v4    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo\\5\\138":I
    .restart local v18    # "$this$map\\4":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$map\\4\\90":I
    move-object v0, v3

    check-cast v0, Ljava/util/List;

    .line 138
    nop

    .line 90
    .end local v18    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v19    # "$i$f$map\\4\\90":I
    move-object v13, v0

    .line 91
    .local v13, "wrapped":Ljava/util/List;
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move-object v1, v13

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\7":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 142
    .local v3, "$i$f$map\\7\\91":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v1, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination\\8":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapTo\\8":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 143
    .local v6, "$i$f$mapTo\\8\\142":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 144
    .local v15, "item\\8":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lkotlin/Pair;

    .local v16, "it\\9":Lkotlin/Pair;
    const/16 v17, 0x0

    .line 91
    .local v17, "$i$a$-map-SaveImportProgress$importTree$plan$1\\9\\144\\0":I
    invoke-virtual/range {v16 .. v16}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v14, v18

    check-cast v14, Ljava/lang/String;

    .line 144
    .end local v16    # "it\\9":Lkotlin/Pair;
    .end local v17    # "$i$a$-map-SaveImportProgress$importTree$plan$1\\9\\144\\0":I
    invoke-interface {v4, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v14, 0x0

    goto :goto_2

    .line 145
    .end local v15    # "item\\8":Ljava/lang/Object;
    :cond_3
    nop

    .end local v4    # "destination\\8":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\8":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\8\\142":I
    check-cast v4, Ljava/util/List;

    .line 142
    nop

    .line 91
    .end local v1    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\7\\91":I
    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v0, v4, v8}, Lcom/pymcl/core/instance/SaveImport;->plan(Ljava/util/Collection;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveImport$Plan;

    move-result-object v4

    if-eqz v4, :cond_f

    .line 92
    .local v4, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 93
    new-instance v3, Ljava/io/File;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "."

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".importing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v3

    .line 129
    .local v0, "it\\10":Ljava/io/File;
    const/4 v1, 0x0

    .line 93
    .local v1, "$i$a$-also-SaveImportProgress$importTree$staging$1\\10\\93\\0":I
    invoke-static {v0}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 94
    .end local v0    # "it\\10":Ljava/io/File;
    .end local v1    # "$i$a$-also-SaveImportProgress$importTree$staging$1\\10\\93\\0":I
    .local v3, "staging":Ljava/io/File;
    nop

    .line 95
    const/4 v0, 0x0

    .local v0, "done":I
    const/4 v1, 0x0

    .local v1, "files":I
    :try_start_0
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    move-object v14, v5

    .local v14, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    move v15, v5

    .line 96
    .local v15, "total":I
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-wide/16 v17, 0x0

    move/from16 v20, v0

    .end local v0    # "done":I
    .local v20, "done":I
    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v7, v6, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v5, v1

    .end local v1    # "files":I
    .local v5, "files":I
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_13

    if-eqz v1, :cond_c

    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "p":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    .line 98
    .local v1, "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->isCancelled()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-interface {v7}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_11

    if-nez v7, :cond_b

    .line 99
    nop

    .line 100
    const/16 v17, 0x1

    :try_start_2
    sget-object v7, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v7, v6}, Lcom/pymcl/core/instance/SaveImport;->isJunk(Ljava/lang/String;)Z

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_f

    if-eqz v7, :cond_4

    .line 108
    add-int/lit8 v20, v20, 0x1

    :try_start_3
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    move-object/from16 v18, v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v21, v1

    .end local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .local v21, "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v8, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v7, v0, v1, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v0, v18

    goto :goto_3

    .line 110
    .end local v5    # "files":I
    .end local v6    # "p":Ljava/lang/String;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    :catchall_0
    move-exception v0

    move-object/from16 v25, v4

    goto/16 :goto_b

    .line 101
    .restart local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v5    # "files":I
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v20    # "done":I
    :cond_4
    move-object/from16 v18, v0

    move-object/from16 v21, v1

    .end local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    :try_start_4
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v0, v6, v4}, Lcom/pymcl/core/instance/SaveImport;->relative(Ljava/lang/String;Lcom/pymcl/core/instance/SaveImport$Plan;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_a

    move-object v1, v0

    .line 129
    .local v1, "it\\11":Ljava/lang/String;
    const/4 v7, 0x0

    .line 101
    .local v7, "$i$a$-takeIf-SaveImportProgress$importTree$rel$1\\11\\101\\0":I
    move-object v8, v1

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_e

    if-lez v8, :cond_5

    move/from16 v8, v17

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    .end local v1    # "it\\11":Ljava/lang/String;
    .end local v7    # "$i$a$-takeIf-SaveImportProgress$importTree$rel$1\\11\\101\\0":I
    :goto_4
    if-eqz v8, :cond_6

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_7

    move-object/from16 v7, p0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    const/4 v5, 0x0

    goto/16 :goto_8

    :cond_7
    move-object v1, v0

    .line 102
    .local v1, "rel":Ljava/lang/String;
    move-object/from16 v7, p0

    :try_start_5
    invoke-direct {v7, v3, v1}, Lcom/pymcl/android/data/SaveImportProgress;->safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v8, v0

    .line 103
    .local v8, "out":Ljava/io/File;
    invoke-virtual/range {v21 .. v21}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->isDir()Z

    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_d

    if-eqz v0, :cond_8

    :try_start_6
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 108
    .end local v1    # "rel":Ljava/lang/String;
    .end local v8    # "out":Ljava/io/File;
    add-int/lit8 v20, v20, 0x1

    :try_start_7
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v22, v1

    .local v22, "rel":Ljava/lang/String;
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .end local v22    # "rel":Ljava/lang/String;
    move-object/from16 v23, v3

    .end local v3    # "staging":Ljava/io/File;
    .local v23, "staging":Ljava/io/File;
    :try_start_8
    iget-wide v2, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v9, v1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .restart local v8    # "out":Ljava/io/File;
    move-object/from16 v2, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v0, v18

    move-object/from16 v3, v23

    .restart local v22    # "rel":Ljava/lang/String;
    goto/16 :goto_3

    .line 110
    .end local v5    # "files":I
    .end local v6    # "p":Ljava/lang/String;
    .end local v8    # "out":Ljava/io/File;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v22    # "rel":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move-object/from16 v25, v4

    move-object/from16 v3, v23

    goto/16 :goto_b

    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    :catchall_2
    move-exception v0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    .end local v3    # "staging":Ljava/io/File;
    .restart local v23    # "staging":Ljava/io/File;
    goto/16 :goto_b

    .line 108
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v5    # "files":I
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    :catchall_3
    move-exception v0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v3    # "staging":Ljava/io/File;
    .restart local v23    # "staging":Ljava/io/File;
    goto/16 :goto_a

    .line 104
    .end local v23    # "staging":Ljava/io/File;
    .restart local v1    # "rel":Ljava/lang/String;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v8    # "out":Ljava/io/File;
    :cond_8
    move-object/from16 v22, v1

    move-object/from16 v23, v3

    .end local v1    # "rel":Ljava/lang/String;
    .end local v3    # "staging":Ljava/io/File;
    .restart local v22    # "rel":Ljava/lang/String;
    .restart local v23    # "staging":Ljava/io/File;
    :try_start_9
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 105
    invoke-virtual/range {v21 .. v21}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getOpen()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/io/Closeable;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_c

    :try_start_a
    move-object v0, v1

    check-cast v0, Ljava/io/InputStream;

    move-object v2, v0

    .line 129
    .local v2, "i\\12":Ljava/io/InputStream;
    const/4 v3, 0x0

    .local v3, "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    new-instance v0, Ljava/io/FileOutputStream;

    .line 105
    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v9, v0

    check-cast v9, Ljava/io/Closeable;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    :try_start_b
    move-object v0, v9

    check-cast v0, Ljava/io/FileOutputStream;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    .line 129
    .local v0, "o\\13":Ljava/io/FileOutputStream;
    const/16 v24, 0x0

    .line 105
    .local v24, "$i$a$-use-SaveImportProgress$importTree$1$1\\13\\105\\12":I
    move/from16 v26, v3

    move-object/from16 v25, v4

    .end local v3    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v25, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v26, "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    :try_start_c
    iget-wide v3, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-object/from16 v27, v0

    .end local v0    # "o\\13":Ljava/io/FileOutputStream;
    .local v27, "o\\13":Ljava/io/FileOutputStream;
    move-object/from16 v0, v27

    check-cast v0, Ljava/io/OutputStream;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    move-wide/from16 v28, v3

    move/from16 v16, v5

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    .end local v5    # "files":I
    .local v16, "files":I
    :try_start_d
    invoke-static {v2, v0, v4, v3, v5}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    move-result-wide v30

    add-long v3, v28, v30

    iput-wide v3, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .end local v24    # "$i$a$-use-SaveImportProgress$importTree$1$1\\13\\105\\12":I
    .end local v27    # "o\\13":Ljava/io/FileOutputStream;
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    const/4 v5, 0x0

    :try_start_e
    invoke-static {v9, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "i\\12":Ljava/io/InputStream;
    .end local v26    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    :try_start_f
    invoke-static {v1, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 106
    iget-wide v1, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    cmp-long v1, v1, v3

    if-gtz v1, :cond_9

    .line 107
    add-int/lit8 v1, v16, 0x1

    .line 108
    .end local v8    # "out":Ljava/io/File;
    .end local v16    # "files":I
    .end local v22    # "rel":Ljava/lang/String;
    .local v1, "files":I
    add-int/lit8 v20, v20, 0x1

    :try_start_10
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v2

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-wide v8, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v2, v3, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move v5, v1

    move-object/from16 v0, v18

    move-object/from16 v3, v23

    move-object/from16 v4, v25

    goto/16 :goto_3

    .line 106
    .end local v1    # "files":I
    .restart local v8    # "out":Ljava/io/File;
    .restart local v16    # "files":I
    .restart local v22    # "rel":Ljava/lang/String;
    :cond_9
    :try_start_11
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v1

    const/16 v3, 0x1e

    shr-long/2addr v1, v3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u8d85\u8fc7 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " GB\uff0c\u5df2\u4e2d\u6b62"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v6    # "p":Ljava/lang/String;
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v16    # "files":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 105
    .restart local v2    # "i\\12":Ljava/io/InputStream;
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v26    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_4
    move-exception v0

    move-object v3, v0

    goto :goto_6

    .end local v16    # "files":I
    .restart local v5    # "files":I
    :catchall_5
    move-exception v0

    move/from16 v16, v5

    move-object v3, v0

    .end local v5    # "files":I
    .restart local v16    # "files":I
    goto :goto_6

    .end local v16    # "files":I
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v26    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .restart local v3    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_6
    move-exception v0

    move/from16 v26, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    move-object v3, v0

    .end local v2    # "i\\12":Ljava/io/InputStream;
    .end local v3    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .end local v6    # "p":Ljava/lang/String;
    .end local v8    # "out":Ljava/io/File;
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v22    # "rel":Ljava/lang/String;
    .end local v23    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :goto_6
    :try_start_12
    throw v3
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .restart local v2    # "i\\12":Ljava/io/InputStream;
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v8    # "out":Ljava/io/File;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v22    # "rel":Ljava/lang/String;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v26    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_7
    move-exception v0

    :try_start_13
    invoke-static {v9, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "p":Ljava/lang/String;
    .end local v8    # "out":Ljava/io/File;
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v16    # "files":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v22    # "rel":Ljava/lang/String;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .end local v2    # "i\\12":Ljava/io/InputStream;
    .end local v26    # "$i$a$-use-SaveImportProgress$importTree$1\\12\\105\\0":I
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v8    # "out":Ljava/io/File;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v22    # "rel":Ljava/lang/String;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_8
    move-exception v0

    move-object v2, v0

    goto :goto_7

    .end local v16    # "files":I
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_9
    move-exception v0

    move-object/from16 v25, v4

    move/from16 v16, v5

    move-object v2, v0

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .end local v6    # "p":Ljava/lang/String;
    .end local v8    # "out":Ljava/io/File;
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v22    # "rel":Ljava/lang/String;
    .end local v23    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :goto_7
    :try_start_14
    throw v2
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    .restart local v6    # "p":Ljava/lang/String;
    .restart local v8    # "out":Ljava/io/File;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v22    # "rel":Ljava/lang/String;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_a
    move-exception v0

    :try_start_15
    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "p":Ljava/lang/String;
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v16    # "files":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_b

    .line 108
    .end local v8    # "out":Ljava/io/File;
    .end local v22    # "rel":Ljava/lang/String;
    .restart local v6    # "p":Ljava/lang/String;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_b
    move-exception v0

    goto :goto_a

    .end local v16    # "files":I
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_c
    move-exception v0

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    goto :goto_a

    .end local v16    # "files":I
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v3, "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_d
    move-exception v0

    goto :goto_9

    .line 101
    :cond_a
    move-object/from16 v7, p0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    const/4 v5, 0x0

    .line 108
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :goto_8
    add-int/lit8 v20, v20, 0x1

    :try_start_16
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-wide v8, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move/from16 v5, v16

    move-object/from16 v0, v18

    move-object/from16 v3, v23

    move-object/from16 v4, v25

    goto/16 :goto_3

    .end local v16    # "files":I
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_e
    move-exception v0

    move-object/from16 v7, p0

    :goto_9
    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    goto :goto_a

    .end local v16    # "files":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v1, "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :catchall_f
    move-exception v0

    move-object/from16 v7, p0

    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :goto_a
    add-int/lit8 v20, v20, 0x1

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v1

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-wide v4, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0

    .line 98
    .end local v16    # "files":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_b
    move-object/from16 v7, p0

    move-object/from16 v21, v1

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v1    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    new-instance v0, Lcom/pymcl/android/data/SaveImportProgress$Cancelled;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveImportProgress$Cancelled;-><init>()V

    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_10

    .line 110
    .end local v6    # "p":Ljava/lang/String;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v16    # "files":I
    .end local v20    # "done":I
    .end local v21    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v12    # "norm":Ljava/util/List;
    .restart local v13    # "wrapped":Ljava/util/List;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_10
    move-exception v0

    move-object/from16 v3, v23

    goto :goto_b

    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :catchall_11
    move-exception v0

    move-object/from16 v7, p0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    goto :goto_b

    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v20    # "done":I
    :cond_c
    move-object/from16 v7, p0

    move-object/from16 v23, v3

    move-object/from16 v25, v4

    move/from16 v16, v5

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .restart local v16    # "files":I
    .restart local v23    # "staging":Ljava/io/File;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :try_start_17
    iget-wide v6, v14, Lkotlin/jvm/internal/Ref$LongRef;->element:J
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, v16

    move-object/from16 v3, v23

    move-object/from16 v4, v25

    .end local v16    # "files":I
    .end local v23    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "files":I
    :try_start_18
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/android/data/SaveImportProgress;->finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object v0
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_13

    .line 111
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "files":I
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v20    # "done":I
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v3}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 110
    .restart local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "total":I
    .restart local v16    # "files":I
    .restart local v20    # "done":I
    :cond_d
    return-object v0

    .end local v3    # "staging":Ljava/io/File;
    .end local v14    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v15    # "total":I
    .end local v16    # "files":I
    .end local v20    # "done":I
    .restart local v23    # "staging":Ljava/io/File;
    :catchall_12
    move-exception v0

    move-object/from16 v3, v23

    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    goto :goto_b

    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :catchall_13
    move-exception v0

    move-object/from16 v25, v4

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :goto_b
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {v3}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    :cond_e
    throw v0

    .line 91
    .end local v3    # "staging":Ljava/io/File;
    .end local v25    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u6240\u9009\u6587\u4ef6\u5939\u91cc\u6ca1\u6709 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 87
    .end local v12    # "norm":Ljava/util/List;
    .end local v13    # "wrapped":Ljava/util/List;
    :cond_10
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6587\u4ef6\u8fc7\u591a\uff08>"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff09"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final importZip(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 37
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "archiveName"    # Ljava/lang/String;
    .param p3, "open"    # Lkotlin/jvm/functions/Function0;
    .param p4, "limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
    .param p5, "cb"    # Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/InputStream;",
            ">;",
            "Lcom/pymcl/core/instance/SaveImport$Limits;",
            "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
            ")",
            "Lcom/pymcl/core/instance/SaveImport$Result;"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    const-string v0, "savesDir"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "archiveName"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "open"

    move-object/from16 v9, p3

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "limits"

    move-object/from16 v10, p4

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cb"

    move-object/from16 v11, p5

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v12, v0

    .line 56
    .local v12, "paths":Ljava/util/ArrayList;
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/InputStream;

    instance-of v3, v1, Ljava/io/BufferedInputStream;

    const/16 v4, 0x2000

    if-eqz v3, :cond_0

    check-cast v1, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v1, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v1, v3

    :goto_0
    check-cast v1, Ljava/io/InputStream;

    invoke-direct {v0, v1}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v1, v0

    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v1

    check-cast v0, Ljava/util/zip/ZipInputStream;

    .line 129
    .local v0, "z\\1":Ljava/util/zip/ZipInputStream;
    const/4 v3, 0x0

    .line 56
    .local v3, "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    new-instance v5, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda0;

    invoke-direct {v5, v0}, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda0;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v5}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v5

    .local v5, "$this$forEach\\2":Lkotlin/sequences/Sequence;
    const/4 v6, 0x0

    .line 130
    .local v6, "$i$f$forEach\\2\\56":I
    invoke-interface {v5}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_12

    const-string v14, "\u538b\u7f29\u5305\u91cc\u6709\u4e0d\u5b89\u5168\u7684\u8def\u5f84: "

    const-string v15, "getName(...)"

    const/16 v16, 0x1

    if-eqz v13, :cond_3

    :try_start_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element\\2":Ljava/lang/Object;
    move-object/from16 v17, v13

    check-cast v17, Ljava/util/zip/ZipEntry;

    .local v17, "e\\3":Ljava/util/zip/ZipEntry;
    const/16 v18, 0x0

    .line 57
    .local v18, "$i$a$-forEach-SaveImportProgress$importZip$1$2\\3\\130\\1":I
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v19

    add-int/lit8 v4, v19, 0x1

    move-object/from16 v19, v0

    .end local v0    # "z\\1":Ljava/util/zip/ZipInputStream;
    .local v19, "z\\1":Ljava/util/zip/ZipInputStream;
    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v0

    if-gt v4, v0, :cond_2

    .line 58
    move-object v0, v12

    check-cast v0, Ljava/util/Collection;

    sget-object v4, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move/from16 v21, v3

    .end local v3    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .local v21, "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    invoke-virtual/range {v17 .. v17}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 59
    nop

    .line 130
    .end local v17    # "e\\3":Ljava/util/zip/ZipEntry;
    .end local v18    # "$i$a$-forEach-SaveImportProgress$importZip$1$2\\3\\130\\1":I
    move-object/from16 v0, v19

    move/from16 v3, v21

    const/16 v4, 0x2000

    .end local v13    # "element\\2":Ljava/lang/Object;
    goto :goto_1

    .line 58
    .restart local v13    # "element\\2":Ljava/lang/Object;
    .restart local v17    # "e\\3":Ljava/util/zip/ZipEntry;
    .restart local v18    # "$i$a$-forEach-SaveImportProgress$importZip$1$2\\3\\130\\1":I
    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-virtual/range {v17 .. v17}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0

    .line 57
    .end local v21    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .restart local v3    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_2
    move/from16 v21, v3

    .end local v3    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .restart local v21    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u538b\u7f29\u5305\u6761\u76ee\u8fc7\u591a\uff08>"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\uff09"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0

    .line 131
    .end local v13    # "element\\2":Ljava/lang/Object;
    .end local v17    # "e\\3":Ljava/util/zip/ZipEntry;
    .end local v18    # "$i$a$-forEach-SaveImportProgress$importZip$1$2\\3\\130\\1":I
    .end local v19    # "z\\1":Ljava/util/zip/ZipInputStream;
    .end local v21    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .restart local v0    # "z\\1":Ljava/util/zip/ZipInputStream;
    .restart local v3    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_3
    move-object/from16 v19, v0

    move/from16 v21, v3

    .line 59
    .end local v0    # "z\\1":Ljava/util/zip/ZipInputStream;
    .end local v3    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    .end local v5    # "$this$forEach\\2":Lkotlin/sequences/Sequence;
    .end local v6    # "$i$f$forEach\\2\\56":I
    .restart local v19    # "z\\1":Ljava/util/zip/ZipInputStream;
    .restart local v21    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    nop

    .end local v19    # "z\\1":Ljava/util/zip/ZipInputStream;
    .end local v21    # "$i$a$-use-SaveImportProgress$importZip$1\\1\\56\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_12

    .line 56
    const/4 v0, 0x0

    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 60
    sget-object v1, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move-object v3, v12

    check-cast v3, Ljava/util/Collection;

    invoke-virtual {v1, v3, v8}, Lcom/pymcl/core/instance/SaveImport;->plan(Ljava/util/Collection;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveImport$Plan;

    move-result-object v4

    if-eqz v4, :cond_15

    .line 61
    .local v4, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 62
    new-instance v3, Ljava/io/File;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, ".importing"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v3

    .line 129
    .local v1, "it\\4":Ljava/io/File;
    const/4 v5, 0x0

    .line 62
    .local v5, "$i$a$-also-SaveImportProgress$importZip$staging$1\\4\\62\\0":I
    invoke-static {v1}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 63
    .end local v1    # "it\\4":Ljava/io/File;
    .end local v5    # "$i$a$-also-SaveImportProgress$importZip$staging$1\\4\\62\\0":I
    .local v3, "staging":Ljava/io/File;
    nop

    .line 64
    :try_start_2
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v13, v1

    .local v13, "done":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v1, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .local v1, "files":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .local v5, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v6

    move/from16 v17, v6

    .local v17, "total":I
    const/high16 v6, 0x10000

    new-array v6, v6, [B

    .line 65
    .local v6, "buf":[B
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v7

    const/16 v19, 0x0

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-wide/16 v21, 0x0

    invoke-static/range {v21 .. v22}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v7, v0, v2, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/InputStream;

    instance-of v7, v2, Ljava/io/BufferedInputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_11

    if-eqz v7, :cond_4

    :try_start_3
    check-cast v2, Ljava/io/BufferedInputStream;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 81
    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    :catchall_0
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    goto/16 :goto_e

    .line 66
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    :cond_4
    :try_start_4
    new-instance v7, Ljava/io/BufferedInputStream;

    const/16 v8, 0x2000

    invoke-direct {v7, v2, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v2, v7

    :goto_2
    check-cast v2, Ljava/io/InputStream;

    invoke-direct {v0, v2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_11

    :try_start_5
    move-object v0, v2

    check-cast v0, Ljava/util/zip/ZipInputStream;

    move-object v7, v0

    .line 129
    .local v7, "z\\5":Ljava/util/zip/ZipInputStream;
    const/4 v8, 0x0

    .line 66
    .local v8, "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    new-instance v0, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda1;

    invoke-direct {v0, v7}, Lcom/pymcl/android/data/SaveImportProgress$$ExternalSyntheticLambda1;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v0

    move-object/from16 v20, v0

    .local v20, "$this$forEach\\6":Lkotlin/sequences/Sequence;
    const/16 v23, 0x0

    .line 132
    .local v23, "$i$f$forEach\\6\\66":I
    invoke-interface/range {v20 .. v20}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v24
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_e

    if-eqz v24, :cond_12

    :try_start_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v24

    .local v24, "element\\6":Ljava/lang/Object;
    move-object/from16 v25, v24

    check-cast v25, Ljava/util/zip/ZipEntry;

    .local v25, "e\\7":Ljava/util/zip/ZipEntry;
    const/16 v26, 0x0

    .line 67
    .local v26, "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->isCancelled()Lkotlin/jvm/functions/Function0;

    move-result-object v27

    invoke-interface/range {v27 .. v27}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Ljava/lang/Boolean;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v27
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_c

    if-nez v27, :cond_11

    .line 68
    nop

    .line 69
    move-object/from16 v27, v0

    :try_start_7
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    move/from16 v28, v8

    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .local v28, "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    :try_start_8
    invoke-virtual/range {v25 .. v25}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    move-object v8, v0

    .line 70
    .local v8, "p\\7":Ljava/lang/String;
    move-object v0, v8

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    move/from16 v0, v16

    goto :goto_4

    :cond_5
    move/from16 v0, v19

    :goto_4
    if-nez v0, :cond_f

    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v0, v8}, Lcom/pymcl/core/instance/SaveImport;->isJunk(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move-object/from16 v33, v8

    move/from16 v7, v19

    goto/16 :goto_a

    .line 71
    :cond_6
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v0, v8, v4}, Lcom/pymcl/core/instance/SaveImport;->relative(Ljava/lang/String;Lcom/pymcl/core/instance/SaveImport$Plan;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    move-object/from16 v29, v0

    .line 129
    .local v29, "it\\8":Ljava/lang/String;
    const/16 v30, 0x0

    .line 71
    .local v30, "$i$a$-takeIf-SaveImportProgress$importZip$2$2$rel$1\\8\\71\\7":I
    move-object/from16 v31, v29

    check-cast v31, Ljava/lang/CharSequence;

    invoke-interface/range {v31 .. v31}, Ljava/lang/CharSequence;->length()I

    move-result v31

    if-lez v31, :cond_7

    move/from16 v31, v16

    goto :goto_5

    :cond_7
    move/from16 v31, v19

    .end local v29    # "it\\8":Ljava/lang/String;
    .end local v30    # "$i$a$-takeIf-SaveImportProgress$importZip$2$2$rel$1\\8\\71\\7":I
    :goto_5
    if-eqz v31, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    if-nez v0, :cond_9

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move-object/from16 v33, v8

    move/from16 v7, v19

    goto/16 :goto_9

    :cond_9
    move-object/from16 v29, v0

    .line 72
    .local v29, "rel\\7":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/android/data/SaveImportProgress;->INSTANCE:Lcom/pymcl/android/data/SaveImportProgress;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    move-object/from16 v30, v4

    move-object/from16 v4, v29

    .end local v29    # "rel\\7":Ljava/lang/String;
    .local v4, "rel\\7":Ljava/lang/String;
    .local v30, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :try_start_9
    invoke-direct {v0, v3, v4}, Lcom/pymcl/android/data/SaveImportProgress;->safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object/from16 v29, v0

    .line 73
    .local v29, "out\\7":Ljava/io/File;
    invoke-virtual/range {v25 .. v25}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    if-eqz v0, :cond_a

    :try_start_a
    invoke-virtual/range {v29 .. v29}, Ljava/io/File;->mkdirs()Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 79
    .end local v4    # "rel\\7":Ljava/lang/String;
    .end local v8    # "p\\7":Ljava/lang/String;
    .end local v29    # "out\\7":Ljava/io/File;
    :try_start_b
    iget v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    move-object/from16 v31, v3

    .end local v3    # "staging":Ljava/io/File;
    .local v31, "staging":Ljava/io/File;
    :try_start_c
    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    move-object/from16 v32, v4

    .local v32, "rel\\7":Ljava/lang/String;
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .end local v32    # "rel\\7":Ljava/lang/String;
    move-object/from16 v33, v8

    .local v33, "p\\7":Ljava/lang/String;
    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .end local v33    # "p\\7":Ljava/lang/String;
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v0, v3, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 73
    .restart local v29    # "out\\7":Ljava/io/File;
    .restart local v32    # "rel\\7":Ljava/lang/String;
    .restart local v33    # "p\\7":Ljava/lang/String;
    move-object/from16 v29, v7

    move/from16 v7, v19

    goto/16 :goto_b

    .line 66
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "out\\7":Ljava/io/File;
    .end local v31    # "staging":Ljava/io/File;
    .end local v32    # "rel\\7":Ljava/lang/String;
    .end local v33    # "p\\7":Ljava/lang/String;
    .restart local v3    # "staging":Ljava/io/File;
    :catchall_1
    move-exception v0

    move-object/from16 v31, v3

    move-object v8, v1

    move-object v9, v5

    move-object v14, v6

    move-object v1, v0

    .end local v3    # "staging":Ljava/io/File;
    .restart local v31    # "staging":Ljava/io/File;
    goto/16 :goto_d

    .line 79
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    :catchall_2
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v29, v7

    .end local v3    # "staging":Ljava/io/File;
    .restart local v31    # "staging":Ljava/io/File;
    goto/16 :goto_c

    .line 74
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "rel\\7":Ljava/lang/String;
    .restart local v8    # "p\\7":Ljava/lang/String;
    .restart local v29    # "out\\7":Ljava/io/File;
    :cond_a
    move-object/from16 v31, v3

    move-object/from16 v32, v4

    move-object/from16 v33, v8

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "rel\\7":Ljava/lang/String;
    .end local v8    # "p\\7":Ljava/lang/String;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local v32    # "rel\\7":Ljava/lang/String;
    .restart local v33    # "p\\7":Ljava/lang/String;
    :try_start_d
    invoke-virtual/range {v29 .. v29}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v0, Ljava/io/FileOutputStream;

    .line 75
    move-object/from16 v3, v29

    .end local v29    # "out\\7":Ljava/io/File;
    .local v3, "out\\7":Ljava/io/File;
    invoke-direct {v0, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    check-cast v4, Ljava/io/Closeable;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_6

    :try_start_e
    move-object v0, v4

    check-cast v0, Ljava/io/FileOutputStream;

    .line 129
    .local v0, "o\\9":Ljava/io/FileOutputStream;
    const/4 v8, 0x0

    .line 75
    .local v8, "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    :goto_7
    invoke-virtual {v7, v6}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v9
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .local v9, "n\\9":I
    if-ltz v9, :cond_c

    .line 76
    move-object/from16 v29, v7

    move/from16 v34, v8

    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    .local v29, "z\\5":Ljava/util/zip/ZipInputStream;
    .local v34, "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    :try_start_f
    iget-wide v7, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-wide/from16 v35, v7

    int-to-long v7, v9

    add-long v7, v35, v7

    iput-wide v7, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iget-wide v7, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v35

    cmp-long v7, v7, v35

    if-gtz v7, :cond_b

    move/from16 v7, v19

    invoke-virtual {v0, v6, v7, v9}, Ljava/io/FileOutputStream;->write([BII)V

    move/from16 v19, v7

    move-object/from16 v7, v29

    move/from16 v8, v34

    .end local v9    # "n\\9":I
    goto :goto_7

    .restart local v9    # "n\\9":I
    :cond_b
    new-instance v7, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v14

    const/16 v8, 0x1e

    shr-long/2addr v14, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v0

    .end local v0    # "o\\9":Ljava/io/FileOutputStream;
    .local v19, "o\\9":Ljava/io/FileOutputStream;
    const-string v0, "\u89e3\u538b\u540e\u8d85\u8fc7 "

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v8, " GB\uff0c\u5df2\u4e2d\u6b62"

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v3    # "out\\7":Ljava/io/File;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local v32    # "rel\\7":Ljava/lang/String;
    .end local v33    # "p\\7":Ljava/lang/String;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v7

    .line 75
    .end local v19    # "o\\9":Ljava/io/FileOutputStream;
    .end local v34    # "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    .restart local v0    # "o\\9":Ljava/io/FileOutputStream;
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v3    # "out\\7":Ljava/io/File;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v8    # "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local v32    # "rel\\7":Ljava/lang/String;
    .restart local v33    # "p\\7":Ljava/lang/String;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_c
    move-object/from16 v29, v7

    move/from16 v34, v8

    move/from16 v7, v19

    move-object/from16 v19, v0

    .line 76
    .end local v0    # "o\\9":Ljava/io/FileOutputStream;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2$2$1\\9\\75\\7":I
    .end local v9    # "n\\9":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 75
    const/4 v0, 0x0

    :try_start_10
    invoke-static {v4, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    invoke-virtual/range {v25 .. v25}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v8

    cmp-long v0, v8, v21

    if-lez v0, :cond_d

    invoke-virtual/range {v25 .. v25}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Ljava/io/File;->setLastModified(J)Z

    .line 78
    :cond_d
    iget v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 79
    .end local v3    # "out\\7":Ljava/io/File;
    .end local v32    # "rel\\7":Ljava/lang/String;
    .end local v33    # "p\\7":Ljava/lang/String;
    :try_start_11
    iget v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v0, v3, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 80
    goto/16 :goto_b

    .line 75
    .restart local v3    # "out\\7":Ljava/io/File;
    .restart local v32    # "rel\\7":Ljava/lang/String;
    .restart local v33    # "p\\7":Ljava/lang/String;
    :catchall_3
    move-exception v0

    move-object v7, v0

    goto :goto_8

    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    :catchall_4
    move-exception v0

    move-object/from16 v29, v7

    move-object v7, v0

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v3    # "out\\7":Ljava/io/File;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local v32    # "rel\\7":Ljava/lang/String;
    .end local v33    # "p\\7":Ljava/lang/String;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :goto_8
    :try_start_12
    throw v7
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v3    # "out\\7":Ljava/io/File;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local v32    # "rel\\7":Ljava/lang/String;
    .restart local v33    # "p\\7":Ljava/lang/String;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_5
    move-exception v0

    :try_start_13
    invoke-static {v4, v7}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_8

    .line 79
    .end local v3    # "out\\7":Ljava/io/File;
    .end local v32    # "rel\\7":Ljava/lang/String;
    .end local v33    # "p\\7":Ljava/lang/String;
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_6
    move-exception v0

    move-object/from16 v29, v7

    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    goto/16 :goto_c

    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v31    # "staging":Ljava/io/File;
    .local v3, "staging":Ljava/io/File;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    :catchall_7
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v29, v7

    .end local v3    # "staging":Ljava/io/File;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v31    # "staging":Ljava/io/File;
    goto/16 :goto_c

    .line 71
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .local v4, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .local v8, "p\\7":Ljava/lang/String;
    :cond_e
    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move-object/from16 v33, v8

    move/from16 v7, v19

    .line 79
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "p\\7":Ljava/lang/String;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    :goto_9
    :try_start_14
    iget v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v0, v3, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .restart local v33    # "p\\7":Ljava/lang/String;
    goto :goto_b

    .line 70
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local v33    # "p\\7":Ljava/lang/String;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v8    # "p\\7":Ljava/lang/String;
    :cond_f
    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move-object/from16 v33, v8

    move/from16 v7, v19

    .line 79
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "p\\7":Ljava/lang/String;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    :goto_a
    iget v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v0

    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v0, v3, v4, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 70
    .restart local v33    # "p\\7":Ljava/lang/String;
    nop

    .line 132
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v33    # "p\\7":Ljava/lang/String;
    :goto_b
    move-object/from16 v9, p3

    move/from16 v19, v7

    move-object/from16 v0, v27

    move/from16 v8, v28

    move-object/from16 v7, v29

    move-object/from16 v4, v30

    move-object/from16 v3, v31

    .end local v24    # "element\\6":Ljava/lang/Object;
    goto/16 :goto_3

    .line 69
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    :cond_10
    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    :try_start_15
    new-instance v0, Ljava/io/IOException;

    invoke-virtual/range {v25 .. v25}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    .line 79
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    .restart local v24    # "element\\6":Ljava/lang/Object;
    .restart local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .restart local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_8
    move-exception v0

    goto :goto_c

    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    :catchall_9
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    goto :goto_c

    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .local v8, "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    :catchall_a
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move/from16 v28, v8

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    :goto_c
    :try_start_16
    iget v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-virtual {v11}, Lcom/pymcl/android/data/SaveImportProgress$Cb;->getOnProgress()Lkotlin/jvm/functions/Function3;

    move-result-object v3

    iget v4, v13, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-interface {v3, v4, v7, v8}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0

    .line 67
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_11
    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move/from16 v28, v8

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    new-instance v0, Lcom/pymcl/android/data/SaveImportProgress$Cancelled;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveImportProgress$Cancelled;-><init>()V

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    .line 66
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .end local v24    # "element\\6":Ljava/lang/Object;
    .end local v25    # "e\\7":Ljava/util/zip/ZipEntry;
    .end local v26    # "$i$a$-forEach-SaveImportProgress$importZip$2$2\\7\\132\\5":I
    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v17    # "total":I
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_b
    move-exception v0

    move-object v8, v1

    move-object v9, v5

    move-object v14, v6

    move-object v1, v0

    goto :goto_d

    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :catchall_c
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object v8, v1

    move-object v9, v5

    move-object v14, v6

    move-object v1, v0

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    goto :goto_d

    .line 133
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .restart local v23    # "$i$f$forEach\\6\\66":I
    :cond_12
    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object/from16 v29, v7

    move/from16 v28, v8

    .line 80
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v7    # "z\\5":Ljava/util/zip/ZipInputStream;
    .end local v8    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v20    # "$this$forEach\\6":Lkotlin/sequences/Sequence;
    .end local v23    # "$i$f$forEach\\6\\66":I
    .restart local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .restart local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    nop

    .end local v28    # "$i$a$-use-SaveImportProgress$importZip$2\\5\\66\\0":I
    .end local v29    # "z\\5":Ljava/util/zip/ZipInputStream;
    :try_start_17
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_d

    .line 66
    const/4 v0, 0x0

    :try_start_18
    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 81
    iget v0, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v2, v6

    .end local v6    # "buf":[B
    .local v2, "buf":[B
    iget-wide v6, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_10

    move-object v8, v1

    move-object v14, v2

    move-object v9, v5

    move-object/from16 v4, v30

    move-object/from16 v3, v31

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v5, v0

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v2    # "buf":[B
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v8, "files":Lkotlin/jvm/internal/Ref$IntRef;
    .local v9, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .local v14, "buf":[B
    :try_start_19
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/android/data/SaveImportProgress;->finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_11

    .line 82
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v14    # "buf":[B
    .end local v17    # "total":I
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    invoke-virtual/range {v31 .. v31}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static/range {v31 .. v31}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 81
    .restart local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v14    # "buf":[B
    .restart local v17    # "total":I
    :cond_13
    return-object v0

    .line 66
    .end local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "buf":[B
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    :catchall_d
    move-exception v0

    move-object v8, v1

    move-object v9, v5

    move-object v14, v6

    move-object v1, v0

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .restart local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v14    # "buf":[B
    goto :goto_d

    .end local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "buf":[B
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    :catchall_e
    move-exception v0

    move-object v8, v1

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    move-object v9, v5

    move-object v14, v6

    move-object v1, v0

    .end local v1    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v17    # "total":I
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :goto_d
    :try_start_1a
    throw v1
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_f

    .restart local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v14    # "buf":[B
    .restart local v17    # "total":I
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_f
    move-exception v0

    :try_start_1b
    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_10

    .line 81
    .end local v8    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v9    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v13    # "done":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v14    # "buf":[B
    .end local v17    # "total":I
    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_10
    move-exception v0

    goto :goto_e

    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :catchall_11
    move-exception v0

    move-object/from16 v31, v3

    move-object/from16 v30, v4

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v31    # "staging":Ljava/io/File;
    :goto_e
    invoke-virtual/range {v31 .. v31}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static/range {v31 .. v31}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    :cond_14
    throw v0

    .line 60
    .end local v30    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v31    # "staging":Ljava/io/File;
    :cond_15
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u538b\u7f29\u5305\u91cc\u6ca1\u6709 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :catchall_12
    move-exception v0

    move-object v2, v0

    .end local v12    # "paths":Ljava/util/ArrayList;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :try_start_1c
    throw v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_13

    .restart local v12    # "paths":Ljava/util/ArrayList;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p5    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :catchall_13
    move-exception v0

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final streamOf([B)Ljava/io/InputStream;
    .locals 1
    .param p1, "data"    # [B

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final varargs zipOf([Lkotlin/Pair;)[B
    .locals 13
    .param p1, "entries"    # [Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "[B>;)[B"
        }
    .end annotation

    const-string v0, "entries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 119
    .local v0, "b":Ljava/io/ByteArrayOutputStream;
    new-instance v1, Ljava/util/zip/ZipOutputStream;

    move-object v2, v0

    check-cast v2, Ljava/io/OutputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v2, v1

    check-cast v2, Ljava/util/zip/ZipOutputStream;

    .line 129
    .local v2, "z\\1":Ljava/util/zip/ZipOutputStream;
    const/4 v3, 0x0

    .line 119
    .local v3, "$i$a$-use-SaveImportProgress$zipOf$1\\1\\119\\0":I
    move-object v4, p1

    .local v4, "$this$forEach\\2":[Ljava/lang/Object;
    const/4 v5, 0x0

    .line 146
    .local v5, "$i$f$forEach\\2\\119":I
    array-length v6, v4

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-object v8, v4, v7

    .local v8, "element\\2":Ljava/lang/Object;
    const/4 v9, 0x0

    .local v9, "$i$a$-forEach-SaveImportProgress$zipOf$1$1\\3\\146\\1":I
    invoke-virtual {v8}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .local v10, "n\\3":Ljava/lang/String;
    invoke-virtual {v8}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [B

    .line 119
    .local v11, "d\\3":[B
    new-instance v12, Ljava/util/zip/ZipEntry;

    invoke-direct {v12, v10}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    invoke-virtual {v2, v11}, Ljava/util/zip/ZipOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 146
    .end local v9    # "$i$a$-forEach-SaveImportProgress$zipOf$1$1\\3\\146\\1":I
    .end local v10    # "n\\3":Ljava/lang/String;
    .end local v11    # "d\\3":[B
    nop

    .end local v8    # "element\\2":Ljava/lang/Object;
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 147
    :cond_0
    nop

    .line 119
    .end local v4    # "$this$forEach\\2":[Ljava/lang/Object;
    .end local v5    # "$i$f$forEach\\2\\119":I
    nop

    .end local v2    # "z\\1":Ljava/util/zip/ZipOutputStream;
    .end local v3    # "$i$a$-use-SaveImportProgress$zipOf$1\\1\\119\\0":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 120
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    const-string v2, "toByteArray(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1

    .line 119
    :catchall_0
    move-exception v2

    .end local v0    # "b":Ljava/io/ByteArrayOutputStream;
    .end local p1    # "entries":[Lkotlin/Pair;
    :try_start_1
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "b":Ljava/io/ByteArrayOutputStream;
    .restart local p1    # "entries":[Lkotlin/Pair;
    :catchall_1
    move-exception v3

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
.end method
