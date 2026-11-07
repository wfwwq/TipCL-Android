.class public final Lcom/pymcl/core/mods/ContentExport;
.super Ljava/lang/Object;
.source "ContentExport.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/ContentExport$Result;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentExport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentExport.kt\ncom/pymcl/core/mods/ContentExport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,65:1\n777#2:66\n873#2,2:67\n2077#2,2:70\n2079#2:74\n1#3:69\n1505#4,2:72\n*S KotlinDebug\n*F\n+ 1 ContentExport.kt\ncom/pymcl/core/mods/ContentExport\n*L\n19#1:66\n19#1:67,2\n29#1:70,2\n29#1:74\n36#1:72,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cJ@\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u001a\u0008\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u0015J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ContentExport;",
        "",
        "<init>",
        "()V",
        "BAD",
        "Lkotlin/text/Regex;",
        "defaultName",
        "",
        "kind",
        "instance",
        "version",
        "nowMs",
        "",
        "exportZip",
        "Lcom/pymcl/core/mods/ContentExport$Result;",
        "dir",
        "Ljava/io/File;",
        "names",
        "",
        "out",
        "onProgress",
        "Lkotlin/Function2;",
        "",
        "",
        "summary",
        "r",
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
.field private static final BAD:Lkotlin/text/Regex;

.field public static final INSTANCE:Lcom/pymcl/core/mods/ContentExport;


# direct methods
.method public static synthetic $r8$lambda$EgjTx21RyC7rRMZ3n0XsVoVsWwY(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ContentExport;->exportZip$lambda$1$0$1(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$G_XJ6IylmkRq3KTM6nYNBMDVLRY(Lkotlin/Pair;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ContentExport;->summary$lambda$0(Lkotlin/Pair;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XVyreBM_KV2mFMmOKD-n7iiuV8Q(FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/mods/ContentExport;->exportZip$lambda$0(FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ojr-tQ8lfn_DSWbl7p1KKMtYkK0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/mods/ContentExport;->defaultName$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/core/mods/ContentExport;

    invoke-direct {v0}, Lcom/pymcl/core/mods/ContentExport;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/ContentExport;->INSTANCE:Lcom/pymcl/core/mods/ContentExport;

    .line 15
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "[\\\\/:*?\"<>|\\s]+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/mods/ContentExport;->BAD:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final defaultName$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 4
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    move-object v0, p0

    check-cast v0, Ljava/lang/CharSequence;

    sget-object v1, Lcom/pymcl/core/mods/ContentExport;->BAD:Lkotlin/text/Regex;

    const-string v2, "_"

    invoke-virtual {v1, v0, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x5f

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public static synthetic exportZip$default(Lcom/pymcl/core/mods/ContentExport;Ljava/io/File;Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lcom/pymcl/core/mods/ContentExport$Result;
    .locals 0

    .line 23
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda1;

    invoke-direct {p4}, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda1;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/core/mods/ContentExport;->exportZip(Ljava/io/File;Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function2;)Lcom/pymcl/core/mods/ContentExport$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final exportZip$lambda$0(FLjava/lang/String;)Lkotlin/Unit;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final exportZip$lambda$1$0$1(Ljava/io/File;)Z
    .locals 1
    .param p0, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method private static final summary$lambda$0(Lkotlin/Pair;)Ljava/lang/CharSequence;
    .locals 3
    .param p0, "it"    # Lkotlin/Pair;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\uff1a"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final defaultName(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/String;
    .locals 20
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "nowMs"    # J

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-string v3, "kind"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "instance"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "version"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMdd-HHmmss"

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v4, Ljava/util/Date;

    move-wide/from16 v5, p4

    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v3, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 19
    .local v3, "ts":Ljava/lang/String;
    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/String;

    const/4 v7, 0x0

    aput-object v0, v4, v7

    const/4 v8, 0x1

    aput-object v1, v4, v8

    const/4 v9, 0x2

    aput-object v2, v4, v9

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 66
    .local v9, "$i$f$filter":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination$iv$iv":Ljava/util/Collection;
    move-object v11, v4

    .local v11, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 67
    .local v12, "$i$f$filterTo":I
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :cond_0
    :goto_0
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .local v14, "element$iv$iv":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/lang/String;

    .local v15, "it":Ljava/lang/String;
    const/16 v16, 0x0

    .line 19
    .local v16, "$i$a$-filter-ContentExport$defaultName$1":I
    move-object/from16 v17, v15

    check-cast v17, Ljava/lang/CharSequence;

    invoke-static/range {v17 .. v17}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v17

    .line 67
    .end local v15    # "it":Ljava/lang/String;
    .end local v16    # "$i$a$-filter-ContentExport$defaultName$1":I
    if-nez v17, :cond_0

    invoke-interface {v10, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 68
    .end local v14    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v10    # "destination$iv$iv":Ljava/util/Collection;
    .end local v11    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$filterTo":I
    check-cast v10, Ljava/util/List;

    .line 66
    nop

    .end local v4    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$filter":I
    move-object v11, v10

    check-cast v11, Ljava/lang/Iterable;

    .line 19
    const-string v4, "-"

    move-object v12, v4

    check-cast v12, Ljava/lang/CharSequence;

    new-instance v17, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda2;

    invoke-direct/range {v17 .. v17}, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda2;-><init>()V

    const/16 v18, 0x1e

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v19}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_2

    move v7, v8

    :cond_2
    if-eqz v7, :cond_3

    .line 69
    const/4 v7, 0x0

    .line 19
    .local v7, "$i$a$-ifEmpty-ContentExport$defaultName$3":I
    nop

    .end local v7    # "$i$a$-ifEmpty-ContentExport$defaultName$3":I
    const-string v9, "export"

    :cond_3
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v7, ".zip"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method public final exportZip(Ljava/io/File;Ljava/util/List;Ljava/io/File;Lkotlin/jvm/functions/Function2;)Lcom/pymcl/core/mods/ContentExport$Result;
    .locals 32
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "names"    # Ljava/util/List;
    .param p3, "out"    # Ljava/io/File;
    .param p4, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/pymcl/core/mods/ContentExport$Result;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move-object/from16 v9, p4

    const-string v0, "dir"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "names"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onProgress"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 25
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .local v10, "ok":Ljava/util/List;
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v11, v0

    check-cast v11, Ljava/util/List;

    .line 26
    .local v11, "failed":Ljava/util/List;
    new-instance v3, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ".part"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v0, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 27
    .local v3, "tmp":Ljava/io/File;
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    move-object v12, v0

    .line 28
    .local v12, "used":Ljava/util/HashSet;
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v5, Ljava/io/OutputStream;

    instance-of v6, v5, Ljava/io/BufferedOutputStream;

    if-eqz v6, :cond_1

    check-cast v5, Ljava/io/BufferedOutputStream;

    goto :goto_0

    :cond_1
    new-instance v6, Ljava/io/BufferedOutputStream;

    const/16 v7, 0x2000

    invoke-direct {v6, v5, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    move-object v5, v6

    :goto_0
    check-cast v5, Ljava/io/OutputStream;

    invoke-direct {v0, v5}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    check-cast v5, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v5

    check-cast v0, Ljava/util/zip/ZipOutputStream;

    move-object v6, v0

    .local v6, "zip":Ljava/util/zip/ZipOutputStream;
    const/4 v7, 0x0

    .line 29
    .local v7, "$i$a$-use-ContentExport$exportZip$2":I
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    move-object v8, v0

    .local v8, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 70
    .local v13, "$i$f$forEachIndexed":I
    const/4 v0, 0x0

    .line 71
    .local v0, "index$iv":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_1
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    move/from16 v16, v0

    .end local v0    # "index$iv":I
    .local v16, "index$iv":I
    if-eqz v15, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .local v15, "item$iv":Ljava/lang/Object;
    add-int/lit8 v17, v16, 0x1

    .end local v16    # "index$iv":I
    .local v17, "index$iv":I
    if-gez v16, :cond_2

    :try_start_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 28
    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEachIndexed":I
    .end local v15    # "item$iv":Ljava/lang/Object;
    .end local v17    # "index$iv":I
    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v20, v12

    goto/16 :goto_a

    .line 71
    .restart local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v13    # "$i$f$forEachIndexed":I
    .restart local v15    # "item$iv":Ljava/lang/Object;
    .restart local v17    # "index$iv":I
    :cond_2
    :goto_2
    :try_start_2
    move-object/from16 v18, v15

    check-cast v18, Ljava/lang/String;

    .local v16, "i":I
    move-object/from16 v19, v18

    .local v19, "n":Ljava/lang/String;
    move/from16 v18, v16

    .end local v16    # "i":I
    .local v18, "i":I
    const/16 v16, 0x0

    .line 30
    .local v16, "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    move/from16 v2, v18

    .end local v18    # "i":I
    .local v2, "i":I
    int-to-float v0, v2

    move/from16 v20, v0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v21, v2

    .end local v2    # "i":I
    .local v21, "i":I
    const/4 v2, 0x1

    invoke-static {v0, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    int-to-float v0, v0

    div-float v0, v20, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    move-object/from16 v2, v19

    .end local v19    # "n":Ljava/lang/String;
    .local v2, "n":Ljava/lang/String;
    invoke-interface {v9, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    .line 31
    nop

    .line 32
    :try_start_3
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    const-string v19, ".."
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    move/from16 v22, v7

    .end local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .local v22, "$i$a$-use-ContentExport$exportZip$2":I
    :try_start_4
    move-object/from16 v7, v19

    check-cast v7, Ljava/lang/CharSequence;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    move-object/from16 v19, v8

    .end local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .local v19, "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    const/4 v8, 0x2

    move/from16 v23, v13

    .end local v13    # "$i$f$forEachIndexed":I
    .local v23, "$i$f$forEachIndexed":I
    const/4 v13, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    :try_start_5
    invoke-static {v0, v7, v13, v8, v14}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    if-nez v0, :cond_3

    :try_start_6
    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v7, 0x2f

    invoke-static {v0, v7, v13, v8, v14}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, v2

    check-cast v0, Ljava/lang/CharSequence;

    const/16 v7, 0x5c

    invoke-static {v0, v7, v13, v8, v14}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez v0, :cond_3

    const/16 v20, 0x1

    goto :goto_3

    .line 42
    :catch_0
    move-exception v0

    move-object/from16 v20, v12

    goto/16 :goto_8

    .line 32
    :cond_3
    move/from16 v20, v13

    :goto_3
    if-eqz v20, :cond_a

    .line 33
    :try_start_7
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v7, v0

    .line 34
    .local v7, "f":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v14, v0

    .line 36
    .local v14, "entries":Ljava/util/List;
    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    const-string v8, "/"

    if-eqz v0, :cond_5

    :try_start_8
    invoke-static {v7}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    new-instance v13, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda0;

    invoke-direct {v13}, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v13}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    .local v0, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v13, 0x0

    .line 72
    .local v13, "$i$f$forEach":I
    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v26

    :goto_4
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v27

    if-eqz v27, :cond_4

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v27

    .local v27, "element$iv":Ljava/lang/Object;
    move-object/from16 v28, v27

    check-cast v28, Ljava/io/File;

    move-object/from16 v29, v28

    .local v29, "it":Ljava/io/File;
    const/16 v28, 0x0

    .line 36
    .local v28, "$i$a$-forEach-ContentExport$exportZip$2$1$3":I
    move-object/from16 v30, v0

    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .local v30, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    move-object v0, v14

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v1, v29

    .end local v29    # "it":Ljava/io/File;
    .local v1, "it":Ljava/io/File;
    invoke-static {v1, v7}, Lkotlin/io/FilesKt;->relativeTo(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v29

    move/from16 v31, v13

    .end local v13    # "$i$f$forEach":I
    .local v31, "$i$f$forEach":I
    invoke-static/range {v29 .. v29}, Lkotlin/io/FilesKt;->getInvariantSeparatorsPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v29, v14

    .end local v14    # "entries":Ljava/util/List;
    .local v29, "entries":Ljava/util/List;
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v13

    invoke-interface {v0, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 72
    .end local v1    # "it":Ljava/io/File;
    .end local v28    # "$i$a$-forEach-ContentExport$exportZip$2$1$3":I
    move-object/from16 v1, p1

    move-object/from16 v14, v29

    move-object/from16 v0, v30

    move/from16 v13, v31

    .end local v27    # "element$iv":Ljava/lang/Object;
    goto :goto_4

    .line 73
    .end local v29    # "entries":Ljava/util/List;
    .end local v30    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v31    # "$i$f$forEach":I
    .restart local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v13    # "$i$f$forEach":I
    .restart local v14    # "entries":Ljava/util/List;
    :cond_4
    move-object/from16 v30, v0

    move/from16 v31, v13

    move-object/from16 v29, v14

    .end local v0    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v13    # "$i$f$forEach":I
    .end local v14    # "entries":Ljava/util/List;
    .restart local v29    # "entries":Ljava/util/List;
    goto :goto_5

    .line 37
    .end local v29    # "entries":Ljava/util/List;
    .restart local v14    # "entries":Ljava/util/List;
    :cond_5
    move-object/from16 v29, v14

    .end local v14    # "entries":Ljava/util/List;
    .restart local v29    # "entries":Ljava/util/List;
    :try_start_9
    move-object/from16 v0, v29

    check-cast v0, Ljava/util/Collection;

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 38
    :goto_5
    invoke-interface/range {v29 .. v29}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "name":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    .local v1, "file":Ljava/io/File;
    invoke-virtual {v12, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    .line 39
    new-instance v14, Ljava/util/zip/ZipEntry;

    invoke-direct {v14, v13}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v14}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    new-instance v14, Ljava/io/FileInputStream;

    invoke-direct {v14, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v14, Ljava/io/Closeable;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    :try_start_a
    move-object/from16 v26, v14

    check-cast v26, Ljava/io/FileInputStream;

    .line 69
    .local v26, "it":Ljava/io/FileInputStream;
    const/16 v27, 0x0

    .line 39
    .local v27, "$i$a$-use-ContentExport$exportZip$2$1$4":I
    move-object/from16 v28, v0

    move-object/from16 v0, v26

    check-cast v0, Ljava/io/InputStream;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v30, v1

    .end local v1    # "file":Ljava/io/File;
    .local v30, "file":Ljava/io/File;
    :try_start_b
    move-object v1, v6

    check-cast v1, Ljava/io/OutputStream;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v31, v7

    move-object/from16 v20, v12

    move-object/from16 v25, v13

    const/4 v7, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x0

    .end local v7    # "f":Ljava/io/File;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "name":Ljava/lang/String;
    .local v20, "used":Ljava/util/HashSet;
    .local v25, "name":Ljava/lang/String;
    .local v31, "f":Ljava/io/File;
    :try_start_c
    invoke-static {v0, v1, v12, v7, v13}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    .end local v26    # "it":Ljava/io/FileInputStream;
    .end local v27    # "$i$a$-use-ContentExport$exportZip$2$1$4":I
    :try_start_d
    invoke-static {v14, v13}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v6}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    move-object/from16 v12, v20

    move-object/from16 v0, v28

    move-object/from16 v7, v31

    .end local v25    # "name":Ljava/lang/String;
    .end local v30    # "file":Ljava/io/File;
    goto :goto_6

    .restart local v25    # "name":Ljava/lang/String;
    .restart local v30    # "file":Ljava/io/File;
    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_7

    .end local v20    # "used":Ljava/util/HashSet;
    .end local v25    # "name":Ljava/lang/String;
    .end local v31    # "f":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v13    # "name":Ljava/lang/String;
    :catchall_2
    move-exception v0

    move-object/from16 v31, v7

    move-object/from16 v20, v12

    move-object/from16 v25, v13

    move-object v1, v0

    .end local v7    # "f":Ljava/io/File;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "name":Ljava/lang/String;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v25    # "name":Ljava/lang/String;
    .restart local v31    # "f":Ljava/io/File;
    goto :goto_7

    .end local v20    # "used":Ljava/util/HashSet;
    .end local v25    # "name":Ljava/lang/String;
    .end local v30    # "file":Ljava/io/File;
    .end local v31    # "f":Ljava/io/File;
    .restart local v1    # "file":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v13    # "name":Ljava/lang/String;
    :catchall_3
    move-exception v0

    move-object/from16 v30, v1

    move-object/from16 v31, v7

    move-object/from16 v20, v12

    move-object/from16 v25, v13

    move-object v1, v0

    .end local v1    # "file":Ljava/io/File;
    .end local v2    # "n":Ljava/lang/String;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v7    # "f":Ljava/io/File;
    .end local v10    # "ok":Ljava/util/List;
    .end local v11    # "failed":Ljava/util/List;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "name":Ljava/lang/String;
    .end local v15    # "item$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .end local v17    # "index$iv":I
    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v21    # "i":I
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .end local v29    # "entries":Ljava/util/List;
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "names":Ljava/util/List;
    .end local p3    # "out":Ljava/io/File;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :goto_7
    :try_start_e
    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .restart local v2    # "n":Ljava/lang/String;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v10    # "ok":Ljava/util/List;
    .restart local v11    # "failed":Ljava/util/List;
    .restart local v15    # "item$iv":Ljava/lang/Object;
    .restart local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .restart local v17    # "index$iv":I
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v21    # "i":I
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v23    # "$i$f$forEachIndexed":I
    .restart local v25    # "name":Ljava/lang/String;
    .restart local v29    # "entries":Ljava/util/List;
    .restart local v30    # "file":Ljava/io/File;
    .restart local v31    # "f":Ljava/io/File;
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "names":Ljava/util/List;
    .restart local p3    # "out":Ljava/io/File;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catchall_4
    move-exception v0

    :try_start_f
    invoke-static {v14, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "n":Ljava/lang/String;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v10    # "ok":Ljava/util/List;
    .end local v11    # "failed":Ljava/util/List;
    .end local v15    # "item$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .end local v17    # "index$iv":I
    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v21    # "i":I
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "names":Ljava/util/List;
    .end local p3    # "out":Ljava/io/File;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    throw v0

    .line 38
    .end local v25    # "name":Ljava/lang/String;
    .end local v30    # "file":Ljava/io/File;
    .end local v31    # "f":Ljava/io/File;
    .restart local v1    # "file":Ljava/io/File;
    .restart local v2    # "n":Ljava/lang/String;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v10    # "ok":Ljava/util/List;
    .restart local v11    # "failed":Ljava/util/List;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v13    # "name":Ljava/lang/String;
    .restart local v15    # "item$iv":Ljava/lang/Object;
    .restart local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .restart local v17    # "index$iv":I
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v21    # "i":I
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v23    # "$i$f$forEachIndexed":I
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "names":Ljava/util/List;
    .restart local p3    # "out":Ljava/io/File;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :cond_6
    move-object/from16 v28, v0

    move-object/from16 v30, v1

    move-object/from16 v31, v7

    move-object/from16 v20, v12

    move-object/from16 v25, v13

    const/4 v7, 0x2

    const/4 v12, 0x0

    .end local v1    # "file":Ljava/io/File;
    .end local v7    # "f":Ljava/io/File;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "name":Ljava/lang/String;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v25    # "name":Ljava/lang/String;
    .restart local v30    # "file":Ljava/io/File;
    .restart local v31    # "f":Ljava/io/File;
    move-object/from16 v12, v20

    move-object/from16 v7, v31

    goto/16 :goto_6

    .line 40
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v25    # "name":Ljava/lang/String;
    .end local v30    # "file":Ljava/io/File;
    .end local v31    # "f":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v12    # "used":Ljava/util/HashSet;
    :cond_7
    move-object/from16 v31, v7

    move-object/from16 v20, v12

    .end local v7    # "f":Ljava/io/File;
    .end local v12    # "used":Ljava/util/HashSet;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v31    # "f":Ljava/io/File;
    invoke-virtual/range {v31 .. v31}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface/range {v29 .. v29}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v0, Ljava/util/zip/ZipEntry;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    invoke-virtual {v6}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 41
    :cond_8
    move-object v0, v10

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_9

    .line 34
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v29    # "entries":Ljava/util/List;
    .end local v31    # "f":Ljava/io/File;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v12    # "used":Ljava/util/HashSet;
    :cond_9
    move-object/from16 v31, v7

    move-object/from16 v20, v12

    .end local v7    # "f":Ljava/io/File;
    .end local v12    # "used":Ljava/util/HashSet;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v31    # "f":Ljava/io/File;
    new-instance v0, Ljava/io/FileNotFoundException;

    const-string v1, "\u6587\u4ef6\u4e0d\u5b58\u5728"

    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .end local v2    # "n":Ljava/lang/String;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v10    # "ok":Ljava/util/List;
    .end local v11    # "failed":Ljava/util/List;
    .end local v15    # "item$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .end local v17    # "index$iv":I
    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v21    # "i":I
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "names":Ljava/util/List;
    .end local p3    # "out":Ljava/io/File;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    throw v0

    .line 69
    .end local v31    # "f":Ljava/io/File;
    .restart local v2    # "n":Ljava/lang/String;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v10    # "ok":Ljava/util/List;
    .restart local v11    # "failed":Ljava/util/List;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v15    # "item$iv":Ljava/lang/Object;
    .restart local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .restart local v17    # "index$iv":I
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v21    # "i":I
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v23    # "$i$f$forEachIndexed":I
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "names":Ljava/util/List;
    .restart local p3    # "out":Ljava/io/File;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :cond_a
    move-object/from16 v20, v12

    .end local v12    # "used":Ljava/util/HashSet;
    .restart local v20    # "used":Ljava/util/HashSet;
    const/4 v0, 0x0

    .line 32
    .local v0, "$i$a$-require-ContentExport$exportZip$2$1$1":I
    const-string v1, "\u975e\u6cd5\u6587\u4ef6\u540d"

    .end local v0    # "$i$a$-require-ContentExport$exportZip$2$1$1":I
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .end local v2    # "n":Ljava/lang/String;
    .end local v3    # "tmp":Ljava/io/File;
    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v10    # "ok":Ljava/util/List;
    .end local v11    # "failed":Ljava/util/List;
    .end local v15    # "item$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .end local v17    # "index$iv":I
    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v21    # "i":I
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "names":Ljava/util/List;
    .end local p3    # "out":Ljava/io/File;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 42
    .restart local v2    # "n":Ljava/lang/String;
    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .restart local v10    # "ok":Ljava/util/List;
    .restart local v11    # "failed":Ljava/util/List;
    .restart local v15    # "item$iv":Ljava/lang/Object;
    .restart local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .restart local v17    # "index$iv":I
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v21    # "i":I
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v23    # "$i$f$forEachIndexed":I
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "names":Ljava/util/List;
    .restart local p3    # "out":Ljava/io/File;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catch_1
    move-exception v0

    goto :goto_8

    .end local v20    # "used":Ljava/util/HashSet;
    .restart local v12    # "used":Ljava/util/HashSet;
    :catch_2
    move-exception v0

    move-object/from16 v20, v12

    .end local v12    # "used":Ljava/util/HashSet;
    .restart local v20    # "used":Ljava/util/HashSet;
    goto :goto_8

    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v23    # "$i$f$forEachIndexed":I
    .restart local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "used":Ljava/util/HashSet;
    .local v13, "$i$f$forEachIndexed":I
    :catch_3
    move-exception v0

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    move/from16 v23, v13

    move-object/from16 v24, v14

    .end local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "$i$f$forEachIndexed":I
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v23    # "$i$f$forEachIndexed":I
    goto :goto_8

    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .local v7, "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v13    # "$i$f$forEachIndexed":I
    :catch_4
    move-exception v0

    move/from16 v22, v7

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    move/from16 v23, v13

    move-object/from16 v24, v14

    .end local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "$i$f$forEachIndexed":I
    .local v0, "e":Ljava/lang/Exception;
    .restart local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v23    # "$i$f$forEachIndexed":I
    :goto_8
    :try_start_10
    move-object v1, v11

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_b

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_b
    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 43
    .end local v0    # "e":Ljava/lang/Exception;
    :goto_9
    nop

    .line 71
    .end local v2    # "n":Ljava/lang/String;
    .end local v16    # "$i$a$-forEachIndexed-ContentExport$exportZip$2$1":I
    .end local v21    # "i":I
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v0, v17

    move-object/from16 v8, v19

    move-object/from16 v12, v20

    move/from16 v7, v22

    move/from16 v13, v23

    move-object/from16 v14, v24

    .end local v15    # "item$iv":Ljava/lang/Object;
    goto/16 :goto_1

    .line 74
    .end local v17    # "index$iv":I
    .end local v19    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v20    # "used":Ljava/util/HashSet;
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v23    # "$i$f$forEachIndexed":I
    .restart local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .restart local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .restart local v12    # "used":Ljava/util/HashSet;
    .restart local v13    # "$i$f$forEachIndexed":I
    .local v16, "index$iv":I
    :cond_c
    move/from16 v22, v7

    move-object/from16 v19, v8

    move-object/from16 v20, v12

    move/from16 v23, v13

    .line 44
    .end local v7    # "$i$a$-use-ContentExport$exportZip$2":I
    .end local v8    # "$this$forEachIndexed$iv":Ljava/lang/Iterable;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local v13    # "$i$f$forEachIndexed":I
    .end local v16    # "index$iv":I
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    nop

    .end local v6    # "zip":Ljava/util/zip/ZipOutputStream;
    .end local v22    # "$i$a$-use-ContentExport$exportZip$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    .line 28
    const/4 v13, 0x0

    invoke-static {v5, v13}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 45
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    :cond_d
    invoke-virtual {v3, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 46
    :cond_e
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    new-instance v0, Lcom/pymcl/core/mods/ContentExport$Result;

    invoke-direct {v0, v4, v10, v11}, Lcom/pymcl/core/mods/ContentExport$Result;-><init>(Ljava/io/File;Ljava/util/List;Ljava/util/List;)V

    return-object v0

    .line 28
    :catchall_5
    move-exception v0

    move-object v1, v0

    goto :goto_a

    .end local v20    # "used":Ljava/util/HashSet;
    .restart local v12    # "used":Ljava/util/HashSet;
    :catchall_6
    move-exception v0

    move-object/from16 v20, v12

    move-object v1, v0

    .end local v3    # "tmp":Ljava/io/File;
    .end local v10    # "ok":Ljava/util/List;
    .end local v11    # "failed":Ljava/util/List;
    .end local v12    # "used":Ljava/util/HashSet;
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "names":Ljava/util/List;
    .end local p3    # "out":Ljava/io/File;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :goto_a
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .restart local v3    # "tmp":Ljava/io/File;
    .restart local v10    # "ok":Ljava/util/List;
    .restart local v11    # "failed":Ljava/util/List;
    .restart local v20    # "used":Ljava/util/HashSet;
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "names":Ljava/util/List;
    .restart local p3    # "out":Ljava/io/File;
    .restart local p4    # "onProgress":Lkotlin/jvm/functions/Function2;
    :catchall_7
    move-exception v0

    invoke-static {v5, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final summary(Lcom/pymcl/core/mods/ContentExport$Result;)Ljava/lang/String;
    .locals 12
    .param p1, "r"    # Lcom/pymcl/core/mods/ContentExport$Result;

    const-string v0, "r"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getFailed()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getOk()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getOut()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " \u4e2a \u2192 "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getOk()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getFailed()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ContentExport$Result;->getFailed()Ljava/util/List;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    const-string v2, "\n"

    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    new-instance v9, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda3;

    invoke-direct {v9}, Lcom/pymcl/core/mods/ContentExport$$ExternalSyntheticLambda3;-><init>()V

    const/16 v10, 0x1e

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u6210\u529f "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " \u4e2a\uff0c\u5931\u8d25 "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u4e2a\uff1a\n\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
