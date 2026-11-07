.class public final Lcom/pymcl/core/instance/SaveImport;
.super Ljava/lang/Object;
.source "SaveImport.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/instance/SaveImport$Limits;,
        Lcom/pymcl/core/instance/SaveImport$Plan;,
        Lcom/pymcl/core/instance/SaveImport$Result;,
        Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveImport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveImport.kt\ncom/pymcl/core/instance/SaveImport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,152:1\n777#2:153\n873#2,2:154\n1960#2,3:156\n1960#2,3:159\n1739#2:162\n1814#2,3:163\n777#2:166\n873#2,2:167\n777#2:170\n873#2,2:171\n1739#2:177\n1814#2,3:178\n1739#2:181\n1814#2,3:182\n1739#2:185\n1814#2,3:186\n1#3:169\n1505#4,2:173\n1505#4,2:175\n*S KotlinDebug\n*F\n+ 1 SaveImport.kt\ncom/pymcl/core/instance/SaveImport\n*L\n39#1:153\n39#1:154,2\n40#1:156,3\n45#1:159,3\n55#1:162\n55#1:163,3\n64#1:166\n64#1:167,2\n86#1:170\n86#1:171,2\n125#1:177\n125#1:178,3\n127#1:181\n127#1:182,3\n128#1:185\n128#1:186,3\n97#1:173,2\n106#1:175,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u00044567B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\n\u001a\u00020\u0008J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0008J\u0018\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0008J\u001c\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u00082\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0014J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00142\u0006\u0010\u0018\u001a\u00020\u0008J\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0006\u0010\r\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u001c*\u0004\u0018\u00010\u00080\u00080\u001b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u0008H\u0002J0\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J.\u0010(\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00082\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020+0*2\u0008\u0008\u0002\u0010,\u001a\u00020-J.\u0010.\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00082\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u0002010\u001b2\u0008\u0008\u0002\u0010,\u001a\u00020-J\u0014\u00102\u001a\u0008\u0012\u0004\u0012\u0002010\u001b2\u0006\u00103\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveImport;",
        "",
        "<init>",
        "()V",
        "ILLEGAL",
        "Lkotlin/text/Regex;",
        "JUNK_SEGMENTS",
        "",
        "",
        "normalize",
        "raw",
        "isJunk",
        "",
        "path",
        "sanitizeName",
        "n",
        "fallback",
        "uniqueName",
        "base",
        "existing",
        "",
        "plan",
        "Lcom/pymcl/core/instance/SaveImport$Plan;",
        "paths",
        "archiveName",
        "relative",
        "existingNames",
        "",
        "kotlin.jvm.PlatformType",
        "savesDir",
        "Ljava/io/File;",
        "safeTarget",
        "staging",
        "rel",
        "finish",
        "Lcom/pymcl/core/instance/SaveImport$Result;",
        "files",
        "",
        "bytes",
        "",
        "importZip",
        "open",
        "Lkotlin/Function0;",
        "Ljava/io/InputStream;",
        "limits",
        "Lcom/pymcl/core/instance/SaveImport$Limits;",
        "importTree",
        "folderName",
        "entries",
        "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
        "entriesOf",
        "dir",
        "Limits",
        "TreeEntry",
        "Plan",
        "Result",
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
.field private static final ILLEGAL:Lkotlin/text/Regex;

.field public static final INSTANCE:Lcom/pymcl/core/instance/SaveImport;

.field private static final JUNK_SEGMENTS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$7hyt0HUgLvpchnWSPntP9BcEgpo(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveImport;->importZip$lambda$0$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$9cOKWrGzJ5pfKpS5QCmFwcQXcfE(Ljava/io/File;Ljava/io/File;)Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/SaveImport;->entriesOf$lambda$1(Ljava/io/File;Ljava/io/File;)Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$HinpE8IqjhkO2eZ0vcBZ-s03CaM(Ljava/io/File;Ljava/io/File;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/SaveImport;->entriesOf$lambda$0(Ljava/io/File;Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$Sd_sGRBMeAdUpB1FHhGcI0UUQKc(Ljava/io/File;)Ljava/io/InputStream;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveImport;->entriesOf$lambda$1$0(Ljava/io/File;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$fX5AQEpA_Ursij7s-eWj6XcbsFo(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveImport;->importZip$lambda$2$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/core/instance/SaveImport;

    invoke-direct {v0}, Lcom/pymcl/core/instance/SaveImport;-><init>()V

    sput-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    .line 28
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[\\\\/:*?\"<>|\\u0000-\\u001f]"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/SaveImport;->ILLEGAL:Lkotlin/text/Regex;

    .line 29
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "__MACOSX"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, ".DS_Store"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "session.lock"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/instance/SaveImport;->JUNK_SEGMENTS:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final entriesOf$lambda$0(Ljava/io/File;Ljava/io/File;)Z
    .locals 1
    .param p0, "$dir"    # Ljava/io/File;
    .param p1, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private static final entriesOf$lambda$1(Ljava/io/File;Ljava/io/File;)Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .locals 4
    .param p0, "$dir"    # Ljava/io/File;
    .param p1, "f"    # Ljava/io/File;

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    new-instance v0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    invoke-static {p1, p0}, Lkotlin/io/FilesKt;->relativeTo(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    invoke-static {v1}, Lkotlin/io/FilesKt;->getInvariantSeparatorsPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v2

    new-instance v3, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda2;

    invoke-direct {v3, p1}, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda2;-><init>(Ljava/io/File;)V

    invoke-direct {v0, v1, v2, v3}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method private static final entriesOf$lambda$1$0(Ljava/io/File;)Ljava/io/InputStream;
    .locals 1
    .param p0, "$f"    # Ljava/io/File;

    new-instance v0, Ljava/io/FileInputStream;

    .line 149
    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v0, Ljava/io/InputStream;

    return-object v0
.end method

.method private final existingNames(Ljava/io/File;)Ljava/util/List;
    .locals 1
    .param p1, "savesDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private final finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 15
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "staging"    # Ljava/io/File;
    .param p3, "plan"    # Lcom/pymcl/core/instance/SaveImport$Plan;
    .param p4, "files"    # I
    .param p5, "bytes"    # J

    .line 85
    move-object/from16 v0, p2

    new-instance v1, Ljava/io/File;

    const-string v2, "level.dat"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 86
    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v1

    invoke-direct/range {p0 .. p1}, Lcom/pymcl/core/instance/SaveImport;->existingNames(Ljava/io/File;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 170
    .local v3, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 171
    .local v6, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 86
    .local v10, "$i$a$-filter-SaveImport$finish$name$1":I
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    const-string v13, "."

    const/4 v14, 0x0

    invoke-static {v9, v13, v14, v11, v12}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    .line 171
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-filter-SaveImport$finish$name$1":I
    if-nez v11, :cond_0

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 172
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo":I
    check-cast v4, Ljava/util/List;

    .line 170
    nop

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    check-cast v4, Ljava/util/Collection;

    .line 86
    invoke-virtual {p0, v1, v4}, Lcom/pymcl/core/instance/SaveImport;->uniqueName(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;

    move-result-object v6

    .line 87
    .local v6, "name":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 88
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

    .line 87
    :cond_2
    new-instance v1, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5bfc\u5165\u5931\u8d25\uff1a\u65e0\u6cd5\u5199\u5165 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    .end local v6    # "name":Ljava/lang/String;
    :cond_3
    move-object/from16 v2, p1

    new-instance v1, Ljava/io/IOException;

    const-string v3, "\u6ca1\u6709\u627e\u5230 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic importTree$default(Lcom/pymcl/core/instance/SaveImport;Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 6

    .line 123
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance v0, Lcom/pymcl/core/instance/SaveImport$Limits;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/instance/SaveImport;->importTree(Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic importZip$default(Lcom/pymcl/core/instance/SaveImport;Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 6

    .line 95
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance v0, Lcom/pymcl/core/instance/SaveImport$Limits;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/instance/SaveImport$Limits;-><init>(IJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/instance/SaveImport;->importZip(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final importZip$lambda$0$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 97
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private static final importZip$lambda$2$0(Ljava/util/zip/ZipInputStream;)Ljava/util/zip/ZipEntry;
    .locals 1
    .param p0, "$z"    # Ljava/util/zip/ZipInputStream;

    .line 106
    invoke-virtual {p0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    return-object v0
.end method

.method private final safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 6
    .param p1, "staging"    # Ljava/io/File;
    .param p2, "rel"    # Ljava/lang/String;

    .line 79
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 80
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

    .line 81
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 80
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

.method public static synthetic sanitizeName$default(Lcom/pymcl/core/instance/SaveImport;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 48
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const-string p2, "world"

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/SaveImport;->sanitizeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final entriesOf(Ljava/io/File;)Ljava/util/List;
    .locals 2
    .param p1, "dir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    invoke-static {p1}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    new-instance v1, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda3;

    invoke-direct {v1, p1}, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda3;-><init>(Ljava/io/File;)V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda4;

    invoke-direct {v1, p1}, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda4;-><init>(Ljava/io/File;)V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .line 150
    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final importTree(Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 29
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "folderName"    # Ljava/lang/String;
    .param p3, "entries"    # Ljava/util/List;
    .param p4, "limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
            ">;",
            "Lcom/pymcl/core/instance/SaveImport$Limits;",
            ")",
            "Lcom/pymcl/core/instance/SaveImport$Result;"
        }
    .end annotation

    move-object/from16 v1, p0

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

    .line 124
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v3

    if-gt v0, v3, :cond_f

    .line 125
    move-object v0, v9

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 177
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 178
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 179
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    .local v13, "it":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    const/4 v14, 0x0

    .line 125
    .local v14, "$i$a$-map-SaveImport$importTree$norm$1":I
    sget-object v15, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v13}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v5}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-static {v5, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    .line 179
    .end local v13    # "it":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v14    # "$i$a$-map-SaveImport$importTree$norm$1":I
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v5, 0xa

    goto :goto_0

    .line 125
    .restart local v13    # "it":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v14    # "$i$a$-map-SaveImport$importTree$norm$1":I
    :cond_0
    new-instance v5, Ljava/io/IOException;

    invoke-virtual {v13}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getPath()Ljava/lang/String;

    move-result-object v11

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v17, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v17, "$this$map$iv":Ljava/lang/Iterable;
    const-string v0, "\u4e0d\u5b89\u5168\u7684\u8def\u5f84: "

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v5

    .line 180
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v13    # "it":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v14    # "$i$a$-map-SaveImport$importTree$norm$1":I
    .end local v17    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v17, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    .restart local v17    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 177
    nop

    .line 125
    .end local v3    # "$i$f$map":I
    .end local v17    # "$this$map$iv":Ljava/lang/Iterable;
    move-object v11, v0

    .line 127
    .local v11, "norm":Ljava/util/List;
    move-object v0, v11

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 181
    .restart local v3    # "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 182
    .local v6, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    const/4 v14, 0x0

    if-eqz v12, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 183
    .restart local v12    # "item$iv$iv":Ljava/lang/Object;
    move-object v15, v12

    check-cast v15, Lkotlin/Pair;

    const/16 v17, 0x0

    .local v17, "$i$a$-map-SaveImport$importTree$wrapped$1":I
    invoke-virtual {v15}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v13, v18

    check-cast v13, Ljava/lang/String;

    .local v13, "p":Ljava/lang/String;
    invoke-virtual {v15}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    .line 127
    .local v15, "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    move-object/from16 v18, v0

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .local v18, "$this$map$iv":Ljava/lang/Iterable;
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move/from16 v20, v3

    const/4 v3, 0x2

    .end local v3    # "$i$f$map":I
    .local v20, "$i$f$map":I
    invoke-static {v0, v8, v14, v3, v14}, Lcom/pymcl/core/instance/SaveImport;->sanitizeName$default(Lcom/pymcl/core/instance/SaveImport;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 183
    .end local v13    # "p":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "$i$a$-map-SaveImport$importTree$wrapped$1":I
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    move/from16 v3, v20

    goto :goto_1

    .line 184
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$map":I
    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$map":I
    :cond_2
    move-object/from16 v18, v0

    move/from16 v20, v3

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    .restart local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v20    # "$i$f$map":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 181
    nop

    .line 127
    .end local v18    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v20    # "$i$f$map":I
    move-object v12, v0

    .line 128
    .local v12, "wrapped":Ljava/util/List;
    move-object v0, v12

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 185
    .restart local v3    # "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .restart local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 186
    .restart local v6    # "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 187
    .local v13, "item$iv$iv":Ljava/lang/Object;
    move-object v15, v13

    check-cast v15, Lkotlin/Pair;

    .local v15, "it":Lkotlin/Pair;
    const/16 v16, 0x0

    .line 128
    .local v16, "$i$a$-map-SaveImport$importTree$plan$1":I
    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v15, v17

    check-cast v15, Ljava/lang/String;

    .line 187
    .end local v15    # "it":Lkotlin/Pair;
    .end local v16    # "$i$a$-map-SaveImport$importTree$plan$1":I
    invoke-interface {v4, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 188
    .end local v13    # "item$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo":I
    check-cast v4, Ljava/util/List;

    .line 185
    nop

    .line 128
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v1, v4, v8}, Lcom/pymcl/core/instance/SaveImport;->plan(Ljava/util/Collection;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveImport$Plan;

    move-result-object v4

    if-eqz v4, :cond_e

    .line 129
    .local v4, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 130
    new-instance v3, Ljava/io/File;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "."

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ".importing"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v3

    .line 169
    .local v0, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 130
    .local v5, "$i$a$-also-SaveImport$importTree$staging$1":I
    invoke-static {v0}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 131
    .end local v0    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-also-SaveImport$importTree$staging$1":I
    .local v3, "staging":Ljava/io/File;
    nop

    .line 132
    const/4 v0, 0x0

    .local v0, "files":I
    :try_start_0
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    move-object v13, v5

    .line 133
    .local v13, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v0

    .end local v0    # "files":I
    .local v6, "files":I
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    if-eqz v0, :cond_b

    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .local v7, "p":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    move-object v15, v0

    .line 134
    .local v15, "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    invoke-virtual {v1, v7}, Lcom/pymcl/core/instance/SaveImport;->isJunk(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 135
    invoke-virtual {v1, v7, v4}, Lcom/pymcl/core/instance/SaveImport;->relative(Ljava/lang/String;Lcom/pymcl/core/instance/SaveImport$Plan;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    move-object/from16 v16, v0

    .line 169
    .local v16, "it":Ljava/lang/String;
    const/16 v17, 0x0

    .line 135
    .local v17, "$i$a$-takeIf-SaveImport$importTree$rel$1":I
    move-object/from16 v18, v16

    check-cast v18, Ljava/lang/CharSequence;

    invoke-interface/range {v18 .. v18}, Ljava/lang/CharSequence;->length()I

    move-result v18

    if-lez v18, :cond_4

    const/16 v18, 0x1

    goto :goto_4

    :cond_4
    const/16 v18, 0x0

    .end local v16    # "it":Ljava/lang/String;
    .end local v17    # "$i$a$-takeIf-SaveImport$importTree$rel$1":I
    :goto_4
    if-eqz v18, :cond_5

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    if-nez v0, :cond_6

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    move/from16 v19, v6

    const/4 v6, 0x0

    goto/16 :goto_8

    :cond_6
    move-object/from16 v16, v0

    .line 136
    .local v16, "rel":Ljava/lang/String;
    move-object/from16 v14, v16

    .end local v16    # "rel":Ljava/lang/String;
    .local v14, "rel":Ljava/lang/String;
    invoke-direct {v1, v3, v14}, Lcom/pymcl/core/instance/SaveImport;->safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v16

    move-object/from16 v17, v16

    .line 137
    .local v17, "out":Ljava/io/File;
    invoke-virtual {v15}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->isDir()Z

    move-result v16
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    if-eqz v16, :cond_7

    :try_start_2
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->mkdirs()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_b

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    move/from16 v19, v6

    const/4 v6, 0x0

    goto/16 :goto_8

    .line 138
    :cond_7
    :try_start_3
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/io/File;->mkdirs()Z

    .line 139
    invoke-virtual {v15}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;->getOpen()Lkotlin/jvm/functions/Function0;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v1, v16

    check-cast v1, Ljava/io/Closeable;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    :try_start_4
    move-object/from16 v16, v1

    check-cast v16, Ljava/io/InputStream;

    move-object/from16 v18, v16

    .line 169
    .local v18, "i":Ljava/io/InputStream;
    const/16 v16, 0x0

    .local v16, "$i$a$-use-SaveImport$importTree$1":I
    new-instance v0, Ljava/io/FileOutputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 139
    move-object/from16 v2, v17

    .end local v17    # "out":Ljava/io/File;
    .local v2, "out":Ljava/io/File;
    :try_start_5
    invoke-direct {v0, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    move-object/from16 v17, v2

    .end local v2    # "out":Ljava/io/File;
    .restart local v17    # "out":Ljava/io/File;
    :try_start_6
    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    :try_start_7
    move-object v0, v2

    check-cast v0, Ljava/io/FileOutputStream;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 169
    .local v0, "o":Ljava/io/FileOutputStream;
    const/16 v21, 0x0

    .line 139
    .local v21, "$i$a$-use-SaveImport$importTree$1$1":I
    move-object/from16 v23, v3

    move-object/from16 v22, v4

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v22, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v23, "staging":Ljava/io/File;
    :try_start_8
    iget-wide v3, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    move-object/from16 v24, v0

    .end local v0    # "o":Ljava/io/FileOutputStream;
    .local v24, "o":Ljava/io/FileOutputStream;
    move-object/from16 v0, v24

    check-cast v0, Ljava/io/OutputStream;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-wide/from16 v25, v3

    move/from16 v19, v6

    move-object/from16 v3, v18

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x2

    .end local v6    # "files":I
    .end local v18    # "i":Ljava/io/InputStream;
    .local v3, "i":Ljava/io/InputStream;
    .local v19, "files":I
    :try_start_9
    invoke-static {v3, v0, v4, v5, v6}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    move-result-wide v27

    add-long v5, v25, v27

    iput-wide v5, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .end local v21    # "$i$a$-use-SaveImport$importTree$1$1":I
    .end local v24    # "o":Ljava/io/FileOutputStream;
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    const/4 v6, 0x0

    :try_start_a
    invoke-static {v2, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v3    # "i":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-SaveImport$importTree$1":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    :try_start_b
    invoke-static {v1, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 140
    iget-wide v1, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_8

    .line 141
    nop

    .end local v7    # "p":Ljava/lang/String;
    .end local v14    # "rel":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "out":Ljava/io/File;
    add-int/lit8 v1, v19, 0x1

    move-object/from16 v2, p1

    move-object v14, v6

    move-object/from16 v5, v18

    move-object/from16 v4, v22

    move-object/from16 v3, v23

    move v6, v1

    move-object/from16 v1, p0

    .end local v19    # "files":I
    .local v1, "files":I
    goto/16 :goto_3

    .line 140
    .end local v1    # "files":I
    .restart local v7    # "p":Ljava/lang/String;
    .restart local v14    # "rel":Ljava/lang/String;
    .restart local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v17    # "out":Ljava/io/File;
    .restart local v19    # "files":I
    :cond_8
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

    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 139
    .restart local v3    # "i":Ljava/io/InputStream;
    .restart local v11    # "norm":Ljava/util/List;
    .restart local v12    # "wrapped":Ljava/util/List;
    .restart local v16    # "$i$a$-use-SaveImport$importTree$1":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_6

    .end local v3    # "i":Ljava/io/InputStream;
    .end local v19    # "files":I
    .restart local v6    # "files":I
    .restart local v18    # "i":Ljava/io/InputStream;
    :catchall_1
    move-exception v0

    move/from16 v19, v6

    move-object/from16 v3, v18

    move-object v4, v0

    .end local v6    # "files":I
    .end local v18    # "i":Ljava/io/InputStream;
    .restart local v3    # "i":Ljava/io/InputStream;
    .restart local v19    # "files":I
    goto :goto_6

    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .local v3, "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    .restart local v18    # "i":Ljava/io/InputStream;
    :catchall_2
    move-exception v0

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move/from16 v19, v6

    move-object/from16 v3, v18

    move-object v4, v0

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .end local v7    # "p":Ljava/lang/String;
    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "rel":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v16    # "$i$a$-use-SaveImport$importTree$1":I
    .end local v17    # "out":Ljava/io/File;
    .end local v18    # "i":Ljava/io/InputStream;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :goto_6
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .local v3, "i":Ljava/io/InputStream;
    .restart local v7    # "p":Ljava/lang/String;
    .restart local v11    # "norm":Ljava/util/List;
    .restart local v12    # "wrapped":Ljava/util/List;
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v14    # "rel":Ljava/lang/String;
    .restart local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v16    # "$i$a$-use-SaveImport$importTree$1":I
    .restart local v17    # "out":Ljava/io/File;
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_3
    move-exception v0

    :try_start_d
    invoke-static {v2, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v7    # "p":Ljava/lang/String;
    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "rel":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "out":Ljava/io/File;
    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    .end local v3    # "i":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-SaveImport$importTree$1":I
    .restart local v7    # "p":Ljava/lang/String;
    .restart local v11    # "norm":Ljava/util/List;
    .restart local v12    # "wrapped":Ljava/util/List;
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v14    # "rel":Ljava/lang/String;
    .restart local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v17    # "out":Ljava/io/File;
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_4
    move-exception v0

    move-object v2, v0

    goto :goto_7

    .end local v17    # "out":Ljava/io/File;
    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v2    # "out":Ljava/io/File;
    .local v3, "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    :catchall_5
    move-exception v0

    move-object/from16 v17, v2

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move/from16 v19, v6

    move-object v2, v0

    .end local v2    # "out":Ljava/io/File;
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .restart local v17    # "out":Ljava/io/File;
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    goto :goto_7

    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    :catchall_6
    move-exception v0

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move/from16 v19, v6

    move-object v2, v0

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .end local v7    # "p":Ljava/lang/String;
    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "rel":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "out":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :goto_7
    :try_start_e
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .restart local v7    # "p":Ljava/lang/String;
    .restart local v11    # "norm":Ljava/util/List;
    .restart local v12    # "wrapped":Ljava/util/List;
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v14    # "rel":Ljava/lang/String;
    .restart local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v17    # "out":Ljava/io/File;
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_7
    move-exception v0

    :try_start_f
    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "folderName":Ljava/lang/String;
    .end local p3    # "entries":Ljava/util/List;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    .line 143
    .end local v7    # "p":Ljava/lang/String;
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v14    # "rel":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .end local v17    # "out":Ljava/io/File;
    .end local v19    # "files":I
    .restart local v11    # "norm":Ljava/util/List;
    .restart local v12    # "wrapped":Ljava/util/List;
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "folderName":Ljava/lang/String;
    .restart local p3    # "entries":Ljava/util/List;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_8
    move-exception v0

    move-object/from16 v4, v22

    move-object/from16 v3, v23

    goto :goto_9

    .line 135
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    .restart local v7    # "p":Ljava/lang/String;
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    :cond_9
    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    move/from16 v19, v6

    move-object v6, v14

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    goto :goto_8

    .line 134
    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    :cond_a
    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    move/from16 v19, v6

    move-object v6, v14

    .line 133
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .end local v7    # "p":Ljava/lang/String;
    .end local v15    # "e":Lcom/pymcl/core/instance/SaveImport$TreeEntry;
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    :goto_8
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v14, v6

    move-object/from16 v5, v18

    move/from16 v6, v19

    move-object/from16 v4, v22

    move-object/from16 v3, v23

    goto/16 :goto_3

    .line 143
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :catchall_9
    move-exception v0

    move-object/from16 v23, v3

    move-object/from16 v22, v4

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    goto :goto_9

    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v6    # "files":I
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    :cond_b
    move-object/from16 v23, v3

    move-object/from16 v22, v4

    move/from16 v19, v6

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v6    # "files":I
    .restart local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    :try_start_10
    iget-wide v6, v13, Lkotlin/jvm/internal/Ref$LongRef;->element:J
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, v19

    move-object/from16 v4, v22

    move-object/from16 v3, v23

    .end local v19    # "files":I
    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .local v5, "files":I
    :try_start_11
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/core/instance/SaveImport;->finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    .line 144
    .end local v5    # "files":I
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {v3}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 143
    .restart local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v19    # "files":I
    :cond_c
    return-object v0

    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v13    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v19    # "files":I
    .restart local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v23    # "staging":Ljava/io/File;
    :catchall_a
    move-exception v0

    move-object/from16 v4, v22

    move-object/from16 v3, v23

    .end local v22    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v23    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    goto :goto_9

    :catchall_b
    move-exception v0

    :goto_9
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v3}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    :cond_d
    throw v0

    .line 128
    .end local v3    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u6240\u9009\u6587\u4ef6\u5939\u91cc\u6ca1\u6709 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 124
    .end local v11    # "norm":Ljava/util/List;
    .end local v12    # "wrapped":Ljava/util/List;
    :cond_f
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

.method public final importZip(Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 33
    .param p1, "savesDir"    # Ljava/io/File;
    .param p2, "archiveName"    # Ljava/lang/String;
    .param p3, "open"    # Lkotlin/jvm/functions/Function0;
    .param p4, "limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
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

    .line 96
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v0

    .local v11, "paths":Ljava/util/ArrayList;
    const/4 v1, 0x0

    .line 97
    .local v1, "count":I
    new-instance v0, Ljava/util/zip/ZipInputStream;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/InputStream;

    instance-of v4, v3, Ljava/io/BufferedInputStream;

    const/16 v5, 0x2000

    if-eqz v4, :cond_0

    check-cast v3, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/io/BufferedInputStream;

    invoke-direct {v4, v3, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v3, v4

    :goto_0
    check-cast v3, Ljava/io/InputStream;

    invoke-direct {v0, v3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v3, v0

    check-cast v3, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v3

    check-cast v0, Ljava/util/zip/ZipInputStream;

    .line 169
    .local v0, "z":Ljava/util/zip/ZipInputStream;
    const/4 v4, 0x0

    .line 97
    .local v4, "$i$a$-use-SaveImport$importZip$1":I
    new-instance v6, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda0;

    invoke-direct {v6, v0}, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda0;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v6}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v6

    .local v6, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v7, 0x0

    .line 173
    .local v7, "$i$f$forEach":I
    invoke-interface {v6}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_e

    move v13, v1

    .end local v1    # "count":I
    .local v13, "count":I
    :goto_1
    :try_start_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_d

    const-string v14, "\u538b\u7f29\u5305\u91cc\u6709\u4e0d\u5b89\u5168\u7684\u8def\u5f84: "

    const-string v15, "getName(...)"

    if-eqz v1, :cond_3

    :try_start_2
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .local v1, "element$iv":Ljava/lang/Object;
    move-object/from16 v16, v1

    check-cast v16, Ljava/util/zip/ZipEntry;

    .local v16, "e":Ljava/util/zip/ZipEntry;
    const/16 v17, 0x0

    .line 98
    .local v17, "$i$a$-forEach-SaveImport$importZip$1$2":I
    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v5

    if-gt v13, v5, :cond_2

    .line 99
    move-object v5, v11

    check-cast v5, Ljava/util/Collection;

    move-object/from16 v19, v0

    .end local v0    # "z":Ljava/util/zip/ZipInputStream;
    .local v19, "z":Ljava/util/zip/ZipInputStream;
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move-object/from16 v20, v1

    .end local v1    # "element$iv":Ljava/lang/Object;
    .local v20, "element$iv":Ljava/lang/Object;
    invoke-virtual/range {v16 .. v16}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v5, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    nop

    .line 173
    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    .end local v17    # "$i$a$-forEach-SaveImport$importZip$1$2":I
    move-object/from16 v0, v19

    const/16 v5, 0x2000

    .end local v20    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 99
    .restart local v16    # "e":Ljava/util/zip/ZipEntry;
    .restart local v17    # "$i$a$-forEach-SaveImport$importZip$1$2":I
    .restart local v20    # "element$iv":Ljava/lang/Object;
    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-virtual/range {v16 .. v16}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v13    # "count":I
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0

    .line 98
    .end local v19    # "z":Ljava/util/zip/ZipInputStream;
    .end local v20    # "element$iv":Ljava/lang/Object;
    .restart local v0    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v1    # "element$iv":Ljava/lang/Object;
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "count":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :cond_2
    move-object/from16 v19, v0

    move-object/from16 v20, v1

    .end local v0    # "z":Ljava/util/zip/ZipInputStream;
    .end local v1    # "element$iv":Ljava/lang/Object;
    .restart local v19    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v20    # "element$iv":Ljava/lang/Object;
    new-instance v0, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u538b\u7f29\u5305\u6761\u76ee\u8fc7\u591a\uff08>"

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, "\uff09"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v13    # "count":I
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0

    .line 174
    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    .end local v17    # "$i$a$-forEach-SaveImport$importZip$1$2":I
    .end local v19    # "z":Ljava/util/zip/ZipInputStream;
    .end local v20    # "element$iv":Ljava/lang/Object;
    .restart local v0    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "count":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :cond_3
    move-object/from16 v19, v0

    .line 100
    .end local v0    # "z":Ljava/util/zip/ZipInputStream;
    .end local v6    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v7    # "$i$f$forEach":I
    .restart local v19    # "z":Ljava/util/zip/ZipInputStream;
    nop

    .end local v4    # "$i$a$-use-SaveImport$importZip$1":I
    .end local v19    # "z":Ljava/util/zip/ZipInputStream;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_d

    .line 97
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 101
    move-object v1, v11

    check-cast v1, Ljava/util/Collection;

    move-object/from16 v3, p0

    invoke-virtual {v3, v1, v8}, Lcom/pymcl/core/instance/SaveImport;->plan(Ljava/util/Collection;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveImport$Plan;

    move-result-object v4

    if-eqz v4, :cond_14

    .line 102
    .local v4, "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 103
    new-instance v1, Ljava/io/File;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/SaveImport$Plan;->getBaseName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "."

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ".importing"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v1

    .line 169
    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 103
    .local v6, "$i$a$-also-SaveImport$importZip$staging$1":I
    invoke-static {v5}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 104
    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-also-SaveImport$importZip$staging$1":I
    .local v1, "staging":Ljava/io/File;
    nop

    .line 105
    :try_start_3
    new-instance v5, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    move-object v12, v5

    .local v12, "files":Lkotlin/jvm/internal/Ref$IntRef;
    new-instance v5, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .local v5, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    const/high16 v6, 0x10000

    new-array v6, v6, [B

    .line 106
    .local v6, "buf":[B
    new-instance v7, Ljava/util/zip/ZipInputStream;

    invoke-interface {v9}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v0, v16

    check-cast v0, Ljava/io/InputStream;

    instance-of v2, v0, Ljava/io/BufferedInputStream;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_c

    if-eqz v2, :cond_4

    :try_start_4
    check-cast v0, Ljava/io/BufferedInputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 118
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    :catchall_0
    move-exception v0

    move-object/from16 v28, v1

    goto/16 :goto_b

    .line 106
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    :cond_4
    :try_start_5
    new-instance v2, Ljava/io/BufferedInputStream;

    const/16 v3, 0x2000

    invoke-direct {v2, v0, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v0, v2

    :goto_2
    check-cast v0, Ljava/io/InputStream;

    invoke-direct {v7, v0}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    check-cast v7, Ljava/io/Closeable;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_c

    :try_start_6
    move-object v0, v7

    check-cast v0, Ljava/util/zip/ZipInputStream;

    move-object v2, v0

    .line 169
    .local v2, "z":Ljava/util/zip/ZipInputStream;
    const/4 v3, 0x0

    .line 106
    .local v3, "$i$a$-use-SaveImport$importZip$2":I
    new-instance v0, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda1;

    invoke-direct {v0, v2}, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda1;-><init>(Ljava/util/zip/ZipInputStream;)V

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->generateSequence(Lkotlin/jvm/functions/Function0;)Lkotlin/sequences/Sequence;

    move-result-object v0

    move-object/from16 v16, v0

    .local v16, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/16 v18, 0x0

    .line 175
    .local v18, "$i$f$forEach":I
    invoke-interface/range {v16 .. v16}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v19
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_9

    if-eqz v19, :cond_11

    :try_start_7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .local v19, "element$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    check-cast v20, Ljava/util/zip/ZipEntry;

    .local v20, "e":Ljava/util/zip/ZipEntry;
    const/16 v21, 0x0

    .line 107
    .local v21, "$i$a$-forEach-SaveImport$importZip$2$2":I
    move-object/from16 v22, v0

    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move/from16 v23, v3

    .end local v3    # "$i$a$-use-SaveImport$importZip$2":I
    .local v23, "$i$a$-use-SaveImport$importZip$2":I
    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lcom/pymcl/core/instance/SaveImport;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    move-object v3, v0

    .line 108
    .local v3, "p":Ljava/lang/String;
    move-object v0, v3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    move/from16 v24, v0

    const/16 v25, 0x1

    if-nez v24, :cond_5

    move/from16 v24, v25

    goto :goto_4

    :cond_5
    const/16 v24, 0x0

    :goto_4
    if-nez v24, :cond_f

    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v0, v3}, Lcom/pymcl/core/instance/SaveImport;->isJunk(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    goto/16 :goto_9

    .line 109
    :cond_6
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v0, v3, v4}, Lcom/pymcl/core/instance/SaveImport;->relative(Ljava/lang/String;Lcom/pymcl/core/instance/SaveImport$Plan;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_e

    move-object/from16 v26, v0

    .line 169
    .local v26, "it":Ljava/lang/String;
    const/16 v27, 0x0

    .line 109
    .local v27, "$i$a$-takeIf-SaveImport$importZip$2$2$rel$1":I
    move-object/from16 v28, v26

    check-cast v28, Ljava/lang/CharSequence;

    invoke-interface/range {v28 .. v28}, Ljava/lang/CharSequence;->length()I

    move-result v28

    if-lez v28, :cond_7

    move/from16 v28, v25

    goto :goto_5

    :cond_7
    const/16 v28, 0x0

    .end local v26    # "it":Ljava/lang/String;
    .end local v27    # "$i$a$-takeIf-SaveImport$importZip$2$2$rel$1":I
    :goto_5
    if-eqz v28, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    if-nez v0, :cond_9

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    move-object/from16 v27, v3

    goto/16 :goto_9

    :cond_9
    move-object/from16 v26, v0

    .line 110
    .local v26, "rel":Ljava/lang/String;
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    move-object/from16 v27, v3

    move-object/from16 v3, v26

    .end local v26    # "rel":Ljava/lang/String;
    .local v3, "rel":Ljava/lang/String;
    .local v27, "p":Ljava/lang/String;
    invoke-direct {v0, v1, v3}, Lcom/pymcl/core/instance/SaveImport;->safeTarget(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object/from16 v26, v0

    .line 111
    .local v26, "out":Ljava/io/File;
    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->isDirectory()Z

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    if-eqz v0, :cond_a

    :try_start_8
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->mkdirs()Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v28, v1

    move-object/from16 v30, v2

    goto/16 :goto_9

    .line 106
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v3    # "rel":Ljava/lang/String;
    .end local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v18    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .end local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v26    # "out":Ljava/io/File;
    .end local v27    # "p":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move-object/from16 v28, v1

    move-object v8, v5

    move-object v9, v6

    move-object v1, v0

    goto/16 :goto_a

    .line 112
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v3    # "rel":Ljava/lang/String;
    .restart local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v18    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .restart local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .restart local v26    # "out":Ljava/io/File;
    .restart local v27    # "p":Ljava/lang/String;
    :cond_a
    :try_start_9
    invoke-virtual/range {v26 .. v26}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    new-instance v0, Ljava/io/FileOutputStream;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 113
    move-object/from16 v28, v1

    move-object/from16 v1, v26

    .end local v26    # "out":Ljava/io/File;
    .local v1, "out":Ljava/io/File;
    .local v28, "staging":Ljava/io/File;
    :try_start_a
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object/from16 v26, v3

    .end local v3    # "rel":Ljava/lang/String;
    .local v26, "rel":Ljava/lang/String;
    move-object v3, v0

    check-cast v3, Ljava/io/Closeable;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :try_start_b
    move-object v0, v3

    check-cast v0, Ljava/io/FileOutputStream;

    .line 169
    .local v0, "o":Ljava/io/FileOutputStream;
    const/16 v29, 0x0

    .line 113
    .local v29, "$i$a$-use-SaveImport$importZip$2$2$1":I
    :goto_7
    invoke-virtual {v2, v6}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v30

    move/from16 v31, v30

    .local v31, "n":I
    if-ltz v31, :cond_c

    .line 114
    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    move-object/from16 v30, v2

    move/from16 v2, v31

    move-wide/from16 v31, v8

    .end local v31    # "n":I
    .local v2, "n":I
    .local v30, "z":Ljava/util/zip/ZipInputStream;
    int-to-long v8, v2

    add-long v8, v31, v8

    :try_start_c
    iput-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iget-wide v8, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v31

    cmp-long v8, v8, v31

    if-gtz v8, :cond_b

    const/4 v8, 0x0

    invoke-virtual {v0, v6, v8, v2}, Ljava/io/FileOutputStream;->write([BII)V

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v2, v30

    .end local v2    # "n":I
    goto :goto_7

    .restart local v2    # "n":I
    :cond_b
    new-instance v8, Ljava/io/IOException;

    invoke-virtual {v10}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxBytes()J

    move-result-wide v14

    const/16 v9, 0x1e

    shr-long/2addr v14, v9

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v24, v0

    .end local v0    # "o":Ljava/io/FileOutputStream;
    .local v24, "o":Ljava/io/FileOutputStream;
    const-string v0, "\u89e3\u538b\u540e\u8d85\u8fc7 "

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v9, " GB\uff0c\u5df2\u4e2d\u6b62"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v1    # "out":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "count":I
    .end local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v18    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .end local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v26    # "rel":Ljava/lang/String;
    .end local v27    # "p":Ljava/lang/String;
    .end local v28    # "staging":Ljava/io/File;
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v8

    .line 113
    .end local v24    # "o":Ljava/io/FileOutputStream;
    .restart local v0    # "o":Ljava/io/FileOutputStream;
    .restart local v1    # "out":Ljava/io/File;
    .local v2, "z":Ljava/util/zip/ZipInputStream;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "count":I
    .restart local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v18    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .restart local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .restart local v26    # "rel":Ljava/lang/String;
    .restart local v27    # "p":Ljava/lang/String;
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v31    # "n":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :cond_c
    move-object/from16 v24, v0

    move-object/from16 v30, v2

    move/from16 v2, v31

    .line 114
    .end local v0    # "o":Ljava/io/FileOutputStream;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v29    # "$i$a$-use-SaveImport$importZip$2$2$1":I
    .end local v31    # "n":I
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 113
    const/4 v0, 0x0

    :try_start_d
    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 115
    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v2

    const-wide/16 v8, 0x0

    cmp-long v0, v2, v8

    if-lez v0, :cond_d

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getTime()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/io/File;->setLastModified(J)Z

    .line 116
    :cond_d
    iget v0, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 117
    goto :goto_9

    .line 113
    :catchall_2
    move-exception v0

    move-object v2, v0

    goto :goto_8

    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    :catchall_3
    move-exception v0

    move-object/from16 v30, v2

    move-object v2, v0

    .end local v1    # "out":Ljava/io/File;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "count":I
    .end local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v18    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .end local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v26    # "rel":Ljava/lang/String;
    .end local v27    # "p":Ljava/lang/String;
    .end local v28    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :goto_8
    :try_start_e
    throw v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .restart local v1    # "out":Ljava/io/File;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "count":I
    .restart local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v18    # "$i$f$forEach":I
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .restart local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .restart local v26    # "rel":Ljava/lang/String;
    .restart local v27    # "p":Ljava/lang/String;
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_4
    move-exception v0

    :try_start_f
    invoke-static {v3, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "count":I
    .end local v28    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0

    .line 109
    .end local v26    # "rel":Ljava/lang/String;
    .end local v27    # "p":Ljava/lang/String;
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .local v1, "staging":Ljava/io/File;
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    .local v3, "p":Ljava/lang/String;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "count":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :cond_e
    move-object/from16 v28, v1

    move-object/from16 v30, v2

    move-object/from16 v27, v3

    .end local v1    # "staging":Ljava/io/File;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v3    # "p":Ljava/lang/String;
    .restart local v27    # "p":Ljava/lang/String;
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    goto :goto_9

    .line 108
    .end local v27    # "p":Ljava/lang/String;
    .end local v28    # "staging":Ljava/io/File;
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v1    # "staging":Ljava/io/File;
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v3    # "p":Ljava/lang/String;
    :cond_f
    move-object/from16 v28, v1

    move-object/from16 v30, v2

    move-object/from16 v27, v3

    .line 175
    .end local v1    # "staging":Ljava/io/File;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v3    # "p":Ljava/lang/String;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    :goto_9
    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move-object/from16 v0, v22

    move/from16 v3, v23

    move-object/from16 v1, v28

    move-object/from16 v2, v30

    .end local v19    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_3

    .line 107
    .end local v28    # "staging":Ljava/io/File;
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v1    # "staging":Ljava/io/File;
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v19    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "e":Ljava/util/zip/ZipEntry;
    .restart local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    :cond_10
    move-object/from16 v28, v1

    move-object/from16 v30, v2

    .end local v1    # "staging":Ljava/io/File;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    new-instance v0, Ljava/io/IOException;

    invoke-virtual/range {v20 .. v20}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "count":I
    .end local v28    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 106
    .end local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v18    # "$i$f$forEach":I
    .end local v19    # "element$iv":Ljava/lang/Object;
    .end local v20    # "e":Ljava/util/zip/ZipEntry;
    .end local v21    # "$i$a$-forEach-SaveImport$importZip$2$2":I
    .end local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "count":I
    .restart local v28    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_5
    move-exception v0

    move-object v1, v0

    move-object v8, v5

    move-object v9, v6

    goto :goto_a

    .end local v28    # "staging":Ljava/io/File;
    .restart local v1    # "staging":Ljava/io/File;
    :catchall_6
    move-exception v0

    move-object/from16 v28, v1

    move-object v1, v0

    move-object v8, v5

    move-object v9, v6

    .end local v1    # "staging":Ljava/io/File;
    .restart local v28    # "staging":Ljava/io/File;
    goto :goto_a

    .line 176
    .end local v28    # "staging":Ljava/io/File;
    .restart local v1    # "staging":Ljava/io/File;
    .restart local v2    # "z":Ljava/util/zip/ZipInputStream;
    .local v3, "$i$a$-use-SaveImport$importZip$2":I
    .restart local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v18    # "$i$f$forEach":I
    :cond_11
    move-object/from16 v28, v1

    move-object/from16 v30, v2

    move/from16 v23, v3

    .line 117
    .end local v1    # "staging":Ljava/io/File;
    .end local v2    # "z":Ljava/util/zip/ZipInputStream;
    .end local v3    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v16    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v18    # "$i$f$forEach":I
    .restart local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .restart local v28    # "staging":Ljava/io/File;
    .restart local v30    # "z":Ljava/util/zip/ZipInputStream;
    nop

    .end local v23    # "$i$a$-use-SaveImport$importZip$2":I
    .end local v30    # "z":Ljava/util/zip/ZipInputStream;
    :try_start_10
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 106
    const/4 v0, 0x0

    :try_start_11
    invoke-static {v7, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 118
    iget v0, v12, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v1, v6

    .end local v6    # "buf":[B
    .local v1, "buf":[B
    iget-wide v6, v5, Lkotlin/jvm/internal/Ref$LongRef;->element:J
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_b

    move-object/from16 v2, p1

    move-object v9, v1

    move-object v8, v5

    move-object/from16 v3, v28

    move-object/from16 v1, p0

    move v5, v0

    .end local v1    # "buf":[B
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v28    # "staging":Ljava/io/File;
    .local v3, "staging":Ljava/io/File;
    .local v8, "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .local v9, "buf":[B
    :try_start_12
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/core/instance/SaveImport;->finish(Ljava/io/File;Ljava/io/File;Lcom/pymcl/core/instance/SaveImport$Plan;IJ)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    .line 119
    .end local v3    # "staging":Ljava/io/File;
    .end local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v9    # "buf":[B
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v28    # "staging":Ljava/io/File;
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static/range {v28 .. v28}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 118
    .restart local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v9    # "buf":[B
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    :cond_12
    return-object v0

    .end local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v9    # "buf":[B
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v28    # "staging":Ljava/io/File;
    .restart local v3    # "staging":Ljava/io/File;
    :catchall_7
    move-exception v0

    move-object/from16 v28, v3

    .end local v3    # "staging":Ljava/io/File;
    .restart local v28    # "staging":Ljava/io/File;
    goto :goto_b

    .line 106
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    :catchall_8
    move-exception v0

    move-object v8, v5

    move-object v9, v6

    move-object v1, v0

    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .restart local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v9    # "buf":[B
    goto :goto_a

    .end local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v9    # "buf":[B
    .end local v28    # "staging":Ljava/io/File;
    .local v1, "staging":Ljava/io/File;
    .restart local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v6    # "buf":[B
    :catchall_9
    move-exception v0

    move-object/from16 v28, v1

    move-object v8, v5

    move-object v9, v6

    move-object v1, v0

    .end local v1    # "staging":Ljava/io/File;
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v5    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v6    # "buf":[B
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .end local v13    # "count":I
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :goto_a
    :try_start_13
    throw v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .restart local v9    # "buf":[B
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v13    # "count":I
    .restart local v28    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_a
    move-exception v0

    :try_start_14
    invoke-static {v7, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local v13    # "count":I
    .end local v28    # "staging":Ljava/io/File;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 118
    .end local v8    # "bytes":Lkotlin/jvm/internal/Ref$LongRef;
    .end local v9    # "buf":[B
    .end local v12    # "files":Lkotlin/jvm/internal/Ref$IntRef;
    .restart local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "count":I
    .restart local v28    # "staging":Ljava/io/File;
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_b
    move-exception v0

    goto :goto_b

    .end local v28    # "staging":Ljava/io/File;
    .restart local v1    # "staging":Ljava/io/File;
    :catchall_c
    move-exception v0

    move-object/from16 v28, v1

    .end local v1    # "staging":Ljava/io/File;
    .restart local v28    # "staging":Ljava/io/File;
    :goto_b
    invoke-virtual/range {v28 .. v28}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static/range {v28 .. v28}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    :cond_13
    throw v0

    .line 101
    .end local v4    # "plan":Lcom/pymcl/core/instance/SaveImport$Plan;
    .end local v28    # "staging":Ljava/io/File;
    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u538b\u7f29\u5305\u91cc\u6ca1\u6709 level.dat\uff0c\u4e0d\u662f Minecraft \u5b58\u6863"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 97
    :catchall_d
    move-exception v0

    move-object v1, v0

    goto :goto_c

    .end local v13    # "count":I
    .local v1, "count":I
    :catchall_e
    move-exception v0

    move v13, v1

    move-object v1, v0

    .end local v1    # "count":I
    .end local v11    # "paths":Ljava/util/ArrayList;
    .end local p1    # "savesDir":Ljava/io/File;
    .end local p2    # "archiveName":Ljava/lang/String;
    .end local p3    # "open":Lkotlin/jvm/functions/Function0;
    .end local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :goto_c
    :try_start_15
    throw v1
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_f

    .restart local v11    # "paths":Ljava/util/ArrayList;
    .restart local v13    # "count":I
    .restart local p1    # "savesDir":Ljava/io/File;
    .restart local p2    # "archiveName":Ljava/lang/String;
    .restart local p3    # "open":Lkotlin/jvm/functions/Function0;
    .restart local p4    # "limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    :catchall_f
    move-exception v0

    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final isJunk(Ljava/lang/String;)Z
    .locals 11
    .param p1, "path"    # Ljava/lang/String;

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    new-array v2, v0, [C

    const/4 v7, 0x0

    const/16 v3, 0x2f

    aput-char v3, v2, v7

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 159
    .local v2, "$i$f$any":I
    instance-of v3, v1, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v7

    goto :goto_2

    .line 160
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "it":Ljava/lang/String;
    const/4 v6, 0x0

    .line 45
    .local v6, "$i$a$-any-SaveImport$isJunk$1":I
    sget-object v8, Lcom/pymcl/core/instance/SaveImport;->JUNK_SEGMENTS:Ljava/util/Set;

    invoke-interface {v8, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-string v10, "._"

    invoke-static {v5, v10, v7, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    goto :goto_0

    :cond_2
    move v5, v7

    goto :goto_1

    :cond_3
    :goto_0
    move v5, v0

    .line 160
    .end local v5    # "it":Ljava/lang/String;
    .end local v6    # "$i$a$-any-SaveImport$isJunk$1":I
    :goto_1
    if-eqz v5, :cond_1

    goto :goto_2

    .line 161
    .end local v4    # "element$iv":Ljava/lang/Object;
    :cond_4
    move v0, v7

    .line 45
    .end local v1    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any":I
    :goto_2
    return v0
.end method

.method public final normalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 18
    .param p1, "raw"    # Ljava/lang/String;

    move-object/from16 v0, p1

    const-string v1, "raw"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v1, v6, v6, v7, v8}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v8

    .line 37
    :cond_0
    const/4 v4, 0x4

    const/4 v5, 0x0

    const/16 v1, 0x5c

    const/16 v2, 0x2f

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 38
    .local v1, "p":Ljava/lang/String;
    const-string v0, "/"

    invoke-static {v1, v0, v6, v7, v8}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    new-instance v2, Lkotlin/text/Regex;

    const-string v3, "^[A-Za-z]:"

    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_4

    .line 39
    :cond_1
    move-object v9, v1

    check-cast v9, Ljava/lang/CharSequence;

    const/4 v2, 0x1

    new-array v10, v2, [C

    const/16 v3, 0x2f

    aput-char v3, v10, v6

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 153
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v3

    .local v7, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 154
    .local v9, "$i$f$filterTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_2
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 39
    .local v13, "$i$a$-filter-SaveImport$normalize$segs$1":I
    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;

    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    move-result v14

    if-lez v14, :cond_3

    move v14, v2

    goto :goto_1

    :cond_3
    move v14, v6

    :goto_1
    if-eqz v14, :cond_4

    const-string v14, "."

    invoke-static {v12, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_4

    move v12, v2

    goto :goto_2

    :cond_4
    move v12, v6

    .line 154
    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-filter-SaveImport$normalize$segs$1":I
    :goto_2
    if-eqz v12, :cond_2

    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 155
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 153
    nop

    .line 39
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    nop

    .line 40
    .local v5, "segs":Ljava/util/List;
    move-object v3, v5

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 156
    .local v4, "$i$f$any":I
    instance-of v7, v3, Ljava/util/Collection;

    if-eqz v7, :cond_6

    move-object v7, v3

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_3

    .line 157
    :cond_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 40
    .local v11, "$i$a$-any-SaveImport$normalize$1":I
    const-string v12, ".."

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    .line 157
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-any-SaveImport$normalize$1":I
    if-eqz v10, :cond_7

    move v6, v2

    goto :goto_3

    .line 158
    .end local v9    # "element$iv":Ljava/lang/Object;
    :cond_8
    nop

    .line 40
    .end local v3    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$any":I
    :goto_3
    if-eqz v6, :cond_9

    return-object v8

    .line 41
    :cond_9
    move-object v9, v5

    check-cast v9, Ljava/lang/Iterable;

    move-object v10, v0

    check-cast v10, Ljava/lang/CharSequence;

    const/16 v16, 0x3e

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v9 .. v17}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 38
    .end local v5    # "segs":Ljava/util/List;
    :cond_a
    :goto_4
    return-object v8
.end method

.method public final plan(Ljava/util/Collection;Ljava/lang/String;)Lcom/pymcl/core/instance/SaveImport$Plan;
    .locals 17
    .param p1, "paths"    # Ljava/util/Collection;
    .param p2, "archiveName"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/pymcl/core/instance/SaveImport$Plan;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "paths"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "archiveName"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 166
    .local v4, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 167
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    const-string v10, "level.dat"

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v14, 0x0

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v15, v9

    check-cast v15, Ljava/lang/String;

    .local v15, "it":Ljava/lang/String;
    const/16 v16, 0x0

    .line 64
    .local v16, "$i$a$-filter-SaveImport$plan$levels$1":I
    sget-object v13, Lcom/pymcl/core/instance/SaveImport;->INSTANCE:Lcom/pymcl/core/instance/SaveImport;

    invoke-virtual {v13, v15}, Lcom/pymcl/core/instance/SaveImport;->isJunk(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_2

    invoke-static {v15, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    const-string v10, "/level.dat"

    invoke-static {v15, v10, v12, v11, v14}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    :cond_1
    const/4 v12, 0x1

    .line 167
    .end local v15    # "it":Ljava/lang/String;
    .end local v16    # "$i$a$-filter-SaveImport$plan$levels$1":I
    :cond_2
    if-eqz v12, :cond_0

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 168
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 166
    nop

    .line 64
    .end local v3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filter":I
    nop

    .line 65
    .local v5, "levels":Ljava/util/List;
    move-object v3, v5

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Lcom/pymcl/core/instance/SaveImport$plan$$inlined$compareBy$1;

    invoke-direct {v4}, Lcom/pymcl/core/instance/SaveImport$plan$$inlined$compareBy$1;-><init>()V

    check-cast v4, Ljava/util/Comparator;

    new-instance v6, Lcom/pymcl/core/instance/SaveImport$plan$$inlined$thenBy$1;

    invoke-direct {v6, v4}, Lcom/pymcl/core/instance/SaveImport$plan$$inlined$thenBy$1;-><init>(Ljava/util/Comparator;)V

    check-cast v6, Ljava/util/Comparator;

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->minWithOrNull(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_4

    return-object v14

    .line 66
    .local v3, "best":Ljava/lang/String;
    :cond_4
    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v3, v10}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    .line 67
    .local v4, "prefix":Ljava/lang/String;
    const/4 v6, 0x1

    new-array v7, v6, [C

    const/16 v8, 0x2f

    aput-char v8, v7, v12

    invoke-static {v4, v7}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8, v14, v11, v14}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 68
    .local v7, "dirName":Ljava/lang/String;
    invoke-static {v2, v8, v14, v11, v14}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 169
    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 68
    .local v9, "$i$a$-let-SaveImport$plan$fallback$1":I
    const-string v10, ".zip"

    invoke-static {v8, v10, v6}, Lkotlin/text/StringsKt;->endsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_5

    const/4 v10, 0x4

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->dropLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    move-object v8, v10

    .line 69
    .end local v9    # "$i$a$-let-SaveImport$plan$fallback$1":I
    .local v8, "fallback":Ljava/lang/String;
    :cond_5
    move-object v9, v7

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_6

    move v12, v6

    :cond_6
    if-eqz v12, :cond_7

    .line 169
    const/4 v6, 0x0

    .line 69
    .local v6, "$i$a$-ifEmpty-SaveImport$plan$1":I
    move-object v9, v8

    .end local v6    # "$i$a$-ifEmpty-SaveImport$plan$1":I
    :cond_7
    check-cast v9, Ljava/lang/String;

    invoke-static {v0, v8, v14, v11, v14}, Lcom/pymcl/core/instance/SaveImport;->sanitizeName$default(Lcom/pymcl/core/instance/SaveImport;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v9, v6}, Lcom/pymcl/core/instance/SaveImport;->sanitizeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lcom/pymcl/core/instance/SaveImport$Plan;

    invoke-direct {v9, v4, v6}, Lcom/pymcl/core/instance/SaveImport$Plan;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v9
.end method

.method public final relative(Ljava/lang/String;Lcom/pymcl/core/instance/SaveImport$Plan;)Ljava/lang/String;
    .locals 4
    .param p1, "path"    # Ljava/lang/String;
    .param p2, "plan"    # Lcom/pymcl/core/instance/SaveImport$Plan;

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "plan"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    invoke-virtual {p2}, Lcom/pymcl/core/instance/SaveImport$Plan;->getRootPrefix()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move-object v3, p1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/pymcl/core/instance/SaveImport$Plan;->getRootPrefix()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/pymcl/core/instance/SaveImport$Plan;->getRootPrefix()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p1, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    :goto_1
    return-object v3
.end method

.method public final sanitizeName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "n"    # Ljava/lang/String;
    .param p2, "fallback"    # Ljava/lang/String;

    const-string v0, "n"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    sget-object v0, Lcom/pymcl/core/instance/SaveImport;->ILLEGAL:Lkotlin/text/Regex;

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const-string v2, "_"

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [C

    const/4 v3, 0x0

    const/16 v4, 0x2e

    aput-char v4, v2, v3

    invoke-static {v0, v2}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 50
    .local v0, "s":Ljava/lang/String;
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-nez v1, :cond_2

    const-string v1, "."

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, ".."

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x78

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    :goto_1
    move-object v1, p2

    :goto_2
    return-object v1
.end method

.method public final uniqueName(Ljava/lang/String;Ljava/util/Collection;)Ljava/lang/String;
    .locals 11
    .param p1, "base"    # Ljava/lang/String;
    .param p2, "existing"    # Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "base"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "existing"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 162
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

    .line 163
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const-string v7, "toLowerCase(...)"

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 164
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 55
    .local v9, "$i$a$-map-SaveImport$uniqueName$taken$1":I
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 164
    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-map-SaveImport$uniqueName$taken$1":I
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 165
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 162
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 55
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toHashSet(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    .line 56
    .local v0, "taken":Ljava/util/HashSet;
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object p1

    .line 57
    :cond_1
    const/4 v1, 0x2

    .line 58
    .local v1, "i":I
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ")"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 59
    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method
