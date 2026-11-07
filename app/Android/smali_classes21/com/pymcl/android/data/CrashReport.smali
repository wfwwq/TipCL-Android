.class public final Lcom/pymcl/android/data/CrashReport;
.super Ljava/lang/Object;
.source "CrashReport.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrashReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReport.kt\ncom/pymcl/android/data/CrashReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n2068#2,2:63\n1739#2:66\n1814#2,3:67\n777#2:70\n873#2,2:71\n2068#2,2:73\n2198#2,14:78\n2198#2,14:95\n1#3:65\n3938#4:75\n4474#4,2:76\n3938#4:92\n4474#4,2:93\n*S KotlinDebug\n*F\n+ 1 CrashReport.kt\ncom/pymcl/android/data/CrashReport\n*L\n26#1:63,2\n41#1:66\n41#1:67,3\n41#1:70\n41#1:71,2\n41#1:73,2\n42#1:78,14\n43#1:95,14\n42#1:75\n42#1:76,2\n43#1:92\n43#1:93,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J(\u0010\u000c\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005\u00ca\u0001\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/CrashReport;",
        "",
        "<init>",
        "()V",
        "text",
        "",
        "info",
        "Lcom/pymcl/android/ui/state/CrashInfo;",
        "exportZip",
        "Ljava/io/File;",
        "ctx",
        "Landroid/content/Context;",
        "share",
        "",
        "file",
        "title",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/CrashReport;


# direct methods
.method public static synthetic $r8$lambda$St0aJ2aZbMiOa8wtkY5i9LIRCu4(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/CrashReport;->text$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$_7_Ry7BrDCw4bZgtu0gvdOcJ_Do(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/CrashReport;->exportZip$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bCYJ3CpE_dEqtMNzKyFxj-lQnGA(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/CrashReport;->exportZip$lambda$1$12$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/CrashReport;

    invoke-direct {v0}, Lcom/pymcl/android/data/CrashReport;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/CrashReport;->INSTANCE:Lcom/pymcl/android/data/CrashReport;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final exportZip$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private static final exportZip$lambda$1$12$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private static final exportZip$lambda$1$put(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p0, "$z"    # Ljava/util/zip/ZipOutputStream;
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "s"    # Ljava/lang/String;

    .line 35
    new-instance v0, Ljava/util/zip/ZipEntry;

    invoke-direct {v0, p1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/util/zip/ZipOutputStream;->write([B)V

    invoke-virtual {p0}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    return-void
.end method

.method private static final text$lambda$1(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final exportZip(Landroid/content/Context;Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/io/File;
    .locals 34
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "info"    # Lcom/pymcl/android/ui/state/CrashInfo;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "\n"

    const-string v0, "ctx"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->rootDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    .line 32
    .local v4, "root":Ljava/io/File;
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyyMMdd-HHmmss"

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {v0, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v5, Ljava/util/Date;

    invoke-direct {v5}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 33
    .local v5, "ts":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "exports/\u9519\u8bef\u62a5\u544a-"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".zip"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v6, v0

    .line 65
    .local v6, "it\\1":Ljava/io/File;
    const/4 v7, 0x0

    .line 33
    .local v7, "$i$a$-also-CrashReport$exportZip$out$1\\1\\33\\0":I
    invoke-virtual {v6}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .end local v6    # "it\\1":Ljava/io/File;
    .end local v7    # "$i$a$-also-CrashReport$exportZip$out$1\\1\\33\\0":I
    :cond_0
    move-object v6, v0

    .line 34
    .local v6, "out":Ljava/io/File;
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v7, Ljava/io/OutputStream;

    invoke-direct {v0, v7}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v7, v0

    check-cast v7, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v7

    check-cast v0, Ljava/util/zip/ZipOutputStream;

    move-object v8, v0

    .local v8, "z\\2":Ljava/util/zip/ZipOutputStream;
    const/4 v9, 0x0

    .line 36
    .local v9, "$i$a$-use-CrashReport$exportZip$1\\2\\34\\0":I
    const-string v0, "\u5206\u6790\u7ed3\u8bba.txt"

    sget-object v10, Lcom/pymcl/android/data/CrashReport;->INSTANCE:Lcom/pymcl/android/data/CrashReport;

    invoke-virtual {v10, v2}, Lcom/pymcl/android/data/CrashReport;->text(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v0, v10}, Lcom/pymcl/android/data/CrashReport;->exportZip$lambda$1$put(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    const-string v0, "\u6e38\u620f\u5d29\u6e83\u524d\u7684\u8f93\u51fa.txt"

    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CrashInfo;->getLogTail()Ljava/util/List;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Ljava/lang/Iterable;

    move-object v12, v3

    check-cast v12, Ljava/lang/CharSequence;

    new-instance v17, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda0;

    invoke-direct/range {v17 .. v17}, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda0;-><init>()V

    const/16 v18, 0x1e

    const/16 v19, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v11 .. v19}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v0, v10}, Lcom/pymcl/android/data/CrashReport;->exportZip$lambda$1$put(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    invoke-virtual {v2}, Lcom/pymcl/android/ui/state/CrashInfo;->getGameDir()Ljava/lang/String;

    move-result-object v0

    move-object v10, v0

    .line 65
    .local v10, "it\\3":Ljava/lang/String;
    const/4 v11, 0x0

    .line 38
    .local v11, "$i$a$-takeIf-CrashReport$exportZip$1$gd$1\\3\\38\\2":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .end local v10    # "it\\3":Ljava/lang/String;
    .end local v11    # "$i$a$-takeIf-CrashReport$exportZip$1$gd$1\\3\\38\\2":I
    if-nez v12, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 65
    .local v0, "p0\\4":Ljava/lang/String;
    const/4 v11, 0x0

    .line 38
    .local v11, "$i$a$-let-CrashReport$exportZip$1$gd$2\\4\\38\\2":I
    :try_start_1
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v0    # "p0\\4":Ljava/lang/String;
    .end local v11    # "$i$a$-let-CrashReport$exportZip$1$gd$2\\4\\38\\2":I
    goto :goto_1

    .line 34
    .end local v8    # "z\\2":Ljava/util/zip/ZipOutputStream;
    .end local v9    # "$i$a$-use-CrashReport$exportZip$1\\2\\34\\0":I
    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v24, v4

    goto/16 :goto_f

    .line 38
    .restart local v8    # "z\\2":Ljava/util/zip/ZipOutputStream;
    .restart local v9    # "$i$a$-use-CrashReport$exportZip$1\\2\\34\\0":I
    :cond_2
    const/4 v12, 0x0

    .line 39
    .local v12, "gd\\2":Ljava/io/File;
    :goto_1
    :try_start_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    move-object v11, v0

    .line 40
    .local v11, "logs\\2":Ljava/util/List;
    if-eqz v12, :cond_15

    .line 41
    const/4 v0, 0x2

    new-array v14, v0, [Ljava/lang/String;

    const-string v15, "logs/latest.log"

    const/16 v16, 0x1

    const/4 v13, 0x0

    aput-object v15, v14, v13

    const-string v15, "logs/debug.log"

    aput-object v15, v14, v16

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$map\\5":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 66
    .local v15, "$i$f$map\\5\\41":I
    new-instance v0, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v14, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .local v0, "destination\\6":Ljava/util/Collection;
    move-object v10, v14

    .local v10, "$this$mapTo\\6":Ljava/lang/Iterable;
    const/16 v19, 0x0

    .line 67
    .local v19, "$i$f$mapTo\\6\\66":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v20

    :goto_2
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->hasNext()Z

    move-result v21
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    if-eqz v21, :cond_3

    :try_start_3
    invoke-interface/range {v20 .. v20}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 68
    .local v21, "item\\6":Ljava/lang/Object;
    move-object/from16 v22, v21

    check-cast v22, Ljava/lang/String;

    move-object/from16 v23, v22

    .local v23, "it\\7":Ljava/lang/String;
    const/16 v22, 0x0

    .line 41
    .local v22, "$i$a$-map-CrashReport$exportZip$1$2\\7\\68\\2":I
    new-instance v13, Ljava/io/File;

    move-object/from16 v1, v23

    .end local v23    # "it\\7":Ljava/lang/String;
    .local v1, "it\\7":Ljava/lang/String;
    invoke-direct {v13, v12, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 68
    .end local v1    # "it\\7":Ljava/lang/String;
    .end local v22    # "$i$a$-map-CrashReport$exportZip$1$2\\7\\68\\2":I
    invoke-interface {v0, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v1, p1

    const/4 v13, 0x0

    goto :goto_2

    .line 69
    .end local v21    # "item\\6":Ljava/lang/Object;
    :cond_3
    nop

    .end local v0    # "destination\\6":Ljava/util/Collection;
    .end local v10    # "$this$mapTo\\6":Ljava/lang/Iterable;
    .end local v19    # "$i$f$mapTo\\6\\66":I
    :try_start_4
    check-cast v0, Ljava/util/List;

    .line 66
    nop

    .end local v14    # "$this$map\\5":Ljava/lang/Iterable;
    .end local v15    # "$i$f$map\\5\\41":I
    check-cast v0, Ljava/lang/Iterable;

    .line 41
    nop

    .local v0, "$this$filter\\8":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 70
    .local v1, "$i$f$filter\\8\\41":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\9":Ljava/util/Collection;
    move-object v13, v0

    .local v13, "$this$filterTo\\9":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 71
    .local v14, "$i$f$filterTo\\9\\70":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v19
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v19, :cond_5

    :try_start_5
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    .local v20, "element\\9":Ljava/lang/Object;
    move-object/from16 v19, v20

    check-cast v19, Ljava/io/File;

    .local v19, "it\\10":Ljava/io/File;
    const/16 v21, 0x0

    .line 41
    .local v21, "$i$a$-filter-CrashReport$exportZip$1$3\\10\\71\\2":I
    invoke-virtual/range {v19 .. v19}, Ljava/io/File;->isFile()Z

    move-result v22

    .line 71
    .end local v19    # "it\\10":Ljava/io/File;
    .end local v21    # "$i$a$-filter-CrashReport$exportZip$1$3\\10\\71\\2":I
    if-eqz v22, :cond_4

    move-object/from16 v19, v0

    move-object/from16 v0, v20

    .end local v20    # "element\\9":Ljava/lang/Object;
    .local v0, "element\\9":Ljava/lang/Object;
    .local v19, "$this$filter\\8":Ljava/lang/Iterable;
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    .end local v19    # "$this$filter\\8":Ljava/lang/Iterable;
    .local v0, "$this$filter\\8":Ljava/lang/Iterable;
    .restart local v20    # "element\\9":Ljava/lang/Object;
    :cond_4
    move-object/from16 v19, v0

    move-object/from16 v0, v20

    .end local v20    # "element\\9":Ljava/lang/Object;
    .local v0, "element\\9":Ljava/lang/Object;
    .restart local v19    # "$this$filter\\8":Ljava/lang/Iterable;
    :goto_4
    move-object/from16 v0, v19

    goto :goto_3

    .line 72
    .end local v19    # "$this$filter\\8":Ljava/lang/Iterable;
    .local v0, "$this$filter\\8":Ljava/lang/Iterable;
    :cond_5
    move-object/from16 v19, v0

    .end local v0    # "$this$filter\\8":Ljava/lang/Iterable;
    .end local v10    # "destination\\9":Ljava/util/Collection;
    .end local v13    # "$this$filterTo\\9":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo\\9\\70":I
    .restart local v19    # "$this$filter\\8":Ljava/lang/Iterable;
    :try_start_6
    move-object v0, v10

    check-cast v0, Ljava/util/List;

    .line 70
    nop

    .end local v1    # "$i$f$filter\\8\\41":I
    .end local v19    # "$this$filter\\8":Ljava/lang/Iterable;
    check-cast v0, Ljava/lang/Iterable;

    .line 41
    nop

    .local v0, "$this$forEach\\11":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 73
    .local v1, "$i$f$forEach\\11\\41":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-eqz v13, :cond_6

    :try_start_7
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element\\11":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Ljava/io/File;

    .local v14, "it\\12":Ljava/io/File;
    const/4 v15, 0x0

    .line 41
    .local v15, "$i$a$-forEach-CrashReport$exportZip$1$4\\12\\73\\2":I
    move-object/from16 v19, v0

    .end local v0    # "$this$forEach\\11":Ljava/lang/Iterable;
    .local v19, "$this$forEach\\11":Ljava/lang/Iterable;
    move-object v0, v11

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 73
    .end local v14    # "it\\12":Ljava/io/File;
    .end local v15    # "$i$a$-forEach-CrashReport$exportZip$1$4\\12\\73\\2":I
    move-object/from16 v0, v19

    .end local v13    # "element\\11":Ljava/lang/Object;
    goto :goto_5

    .line 74
    .end local v19    # "$this$forEach\\11":Ljava/lang/Iterable;
    .restart local v0    # "$this$forEach\\11":Ljava/lang/Iterable;
    :cond_6
    move-object/from16 v19, v0

    .line 42
    .end local v0    # "$this$forEach\\11":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\11\\41":I
    :try_start_8
    new-instance v0, Ljava/io/File;

    const-string v1, "crash-reports"

    invoke-direct {v0, v12, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-eqz v0, :cond_d

    .local v0, "$this$filter\\13":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 75
    .local v1, "$i$f$filter\\13\\42":I
    :try_start_9
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\14":Ljava/util/Collection;
    move-object v13, v0

    .local v13, "$this$filterTo\\14":[Ljava/lang/Object;
    const/4 v14, 0x0

    .line 76
    .local v14, "$i$f$filterTo\\14\\75":I
    array-length v15, v13

    move-object/from16 v19, v0

    const/4 v0, 0x0

    .end local v0    # "$this$filter\\13":[Ljava/lang/Object;
    .local v19, "$this$filter\\13":[Ljava/lang/Object;
    :goto_6
    if-ge v0, v15, :cond_8

    aget-object v20, v13, v0

    move-object/from16 v21, v20

    .local v20, "it\\15":Ljava/io/File;
    .local v21, "element\\14":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 42
    .local v22, "$i$a$-filter-CrashReport$exportZip$1$5\\15\\76\\2":I
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->isFile()Z

    move-result v23

    .line 76
    .end local v20    # "it\\15":Ljava/io/File;
    .end local v22    # "$i$a$-filter-CrashReport$exportZip$1$5\\15\\76\\2":I
    if-eqz v23, :cond_7

    move/from16 v20, v0

    move-object/from16 v0, v21

    .end local v21    # "element\\14":Ljava/lang/Object;
    .local v0, "element\\14":Ljava/lang/Object;
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v0    # "element\\14":Ljava/lang/Object;
    .restart local v21    # "element\\14":Ljava/lang/Object;
    :cond_7
    move/from16 v20, v0

    move-object/from16 v0, v21

    .end local v21    # "element\\14":Ljava/lang/Object;
    :goto_7
    add-int/lit8 v0, v20, 0x1

    goto :goto_6

    .line 77
    :cond_8
    nop

    .end local v10    # "destination\\14":Ljava/util/Collection;
    .end local v13    # "$this$filterTo\\14":[Ljava/lang/Object;
    .end local v14    # "$i$f$filterTo\\14\\75":I
    move-object v0, v10

    check-cast v0, Ljava/util/List;

    .line 75
    nop

    .line 42
    .end local v1    # "$i$f$filter\\13\\42":I
    .end local v19    # "$this$filter\\13":[Ljava/lang/Object;
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$maxByOrNull\\16":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 78
    .local v1, "$i$f$maxByOrNull\\16\\42":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    .line 79
    .local v10, "iterator\\16":Ljava/util/Iterator;
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-nez v13, :cond_9

    const/4 v13, 0x0

    goto :goto_8

    .line 80
    :cond_9
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 81
    .local v13, "maxElem\\16":Ljava/lang/Object;
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_8

    .line 82
    :cond_a
    move-object v14, v13

    check-cast v14, Ljava/io/File;

    .local v14, "it\\17":Ljava/io/File;
    const/4 v15, 0x0

    .line 42
    .local v15, "$i$a$-maxByOrNull-CrashReport$exportZip$1$6\\17\\82\\2":I
    invoke-virtual {v14}, Ljava/io/File;->lastModified()J

    move-result-wide v19

    .line 82
    .end local v14    # "it\\17":Ljava/io/File;
    .end local v15    # "$i$a$-maxByOrNull-CrashReport$exportZip$1$6\\17\\82\\2":I
    nop

    .line 84
    .local v19, "maxValue\\16":J
    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 85
    .local v14, "e\\16":Ljava/lang/Object;
    move-object v15, v14

    check-cast v15, Ljava/io/File;

    .local v15, "it\\18":Ljava/io/File;
    const/16 v21, 0x0

    .line 42
    .local v21, "$i$a$-maxByOrNull-CrashReport$exportZip$1$6\\18\\85\\2":I
    invoke-virtual {v15}, Ljava/io/File;->lastModified()J

    move-result-wide v22

    .line 85
    .end local v15    # "it\\18":Ljava/io/File;
    .end local v21    # "$i$a$-maxByOrNull-CrashReport$exportZip$1$6\\18\\85\\2":I
    nop

    .line 86
    .local v22, "v\\16":J
    cmp-long v15, v19, v22

    if-gez v15, :cond_c

    .line 87
    move-object v13, v14

    .line 88
    move-wide/from16 v19, v22

    .line 90
    .end local v14    # "e\\16":Ljava/lang/Object;
    .end local v22    # "v\\16":J
    :cond_c
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-nez v14, :cond_b

    .line 91
    nop

    .line 42
    .end local v0    # "$this$maxByOrNull\\16":Ljava/lang/Iterable;
    .end local v1    # "$i$f$maxByOrNull\\16\\42":I
    .end local v10    # "iterator\\16":Ljava/util/Iterator;
    .end local v13    # "maxElem\\16":Ljava/lang/Object;
    .end local v19    # "maxValue\\16":J
    :goto_8
    check-cast v13, Ljava/io/File;

    if-eqz v13, :cond_d

    .line 65
    .local v13, "it\\19":Ljava/io/File;
    const/4 v0, 0x0

    .line 42
    .local v0, "$i$a$-let-CrashReport$exportZip$1$7\\19\\42\\2":I
    move-object v1, v11

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 43
    .end local v0    # "$i$a$-let-CrashReport$exportZip$1$7\\19\\42\\2":I
    .end local v13    # "it\\19":Ljava/io/File;
    :cond_d
    :try_start_a
    invoke-virtual {v12}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_14

    .local v0, "$this$filter\\20":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 92
    .local v1, "$i$f$filter\\20\\43":I
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    check-cast v10, Ljava/util/Collection;

    .local v10, "destination\\21":Ljava/util/Collection;
    move-object v13, v0

    .local v13, "$this$filterTo\\21":[Ljava/lang/Object;
    const/4 v14, 0x0

    .line 93
    .local v14, "$i$f$filterTo\\21\\92":I
    array-length v15, v13

    move-object/from16 v19, v0

    const/4 v0, 0x0

    .end local v0    # "$this$filter\\20":[Ljava/lang/Object;
    .local v19, "$this$filter\\20":[Ljava/lang/Object;
    :goto_9
    if-ge v0, v15, :cond_f

    aget-object v20, v13, v0

    move-object/from16 v21, v20

    .local v20, "it\\22":Ljava/io/File;
    .local v21, "element\\21":Ljava/lang/Object;
    const/16 v22, 0x0

    .line 43
    .local v22, "$i$a$-filter-CrashReport$exportZip$1$8\\22\\93\\2":I
    move/from16 v23, v0

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    move/from16 v25, v1

    .end local v1    # "$i$f$filter\\20\\43":I
    .local v25, "$i$f$filter\\20\\43":I
    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hs_err_pid"
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    move-object/from16 v17, v3

    move-object/from16 v24, v4

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    .end local v4    # "root":Ljava/io/File;
    .local v24, "root":Ljava/io/File;
    :try_start_b
    invoke-static {v0, v1, v3, v2, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    .line 93
    .end local v20    # "it\\22":Ljava/io/File;
    .end local v22    # "$i$a$-filter-CrashReport$exportZip$1$8\\22\\93\\2":I
    if-eqz v0, :cond_e

    move-object/from16 v0, v21

    .end local v21    # "element\\21":Ljava/lang/Object;
    .local v0, "element\\21":Ljava/lang/Object;
    invoke-interface {v10, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .end local v0    # "element\\21":Ljava/lang/Object;
    .restart local v21    # "element\\21":Ljava/lang/Object;
    :cond_e
    move-object/from16 v0, v21

    .end local v21    # "element\\21":Ljava/lang/Object;
    :goto_a
    add-int/lit8 v0, v23, 0x1

    move-object/from16 v2, p2

    move-object/from16 v3, v17

    move-object/from16 v4, v24

    move/from16 v1, v25

    goto :goto_9

    .line 94
    .end local v24    # "root":Ljava/io/File;
    .end local v25    # "$i$f$filter\\20\\43":I
    .restart local v1    # "$i$f$filter\\20\\43":I
    .restart local v4    # "root":Ljava/io/File;
    :cond_f
    move/from16 v25, v1

    move-object/from16 v17, v3

    move-object/from16 v24, v4

    .end local v1    # "$i$f$filter\\20\\43":I
    .end local v4    # "root":Ljava/io/File;
    .end local v10    # "destination\\21":Ljava/util/Collection;
    .end local v13    # "$this$filterTo\\21":[Ljava/lang/Object;
    .end local v14    # "$i$f$filterTo\\21\\92":I
    .restart local v24    # "root":Ljava/io/File;
    .restart local v25    # "$i$f$filter\\20\\43":I
    move-object v0, v10

    check-cast v0, Ljava/util/List;

    .line 92
    nop

    .line 43
    .end local v19    # "$this$filter\\20":[Ljava/lang/Object;
    .end local v25    # "$i$f$filter\\20\\43":I
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$maxByOrNull\\23":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 95
    .local v1, "$i$f$maxByOrNull\\23\\43":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 96
    .local v2, "iterator\\23":Ljava/util/Iterator;
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_10

    const/4 v3, 0x0

    goto :goto_b

    .line 97
    :cond_10
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 98
    .local v3, "maxElem\\23":Ljava/lang/Object;
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_b

    .line 99
    :cond_11
    move-object v4, v3

    check-cast v4, Ljava/io/File;

    .local v4, "it\\24":Ljava/io/File;
    const/4 v10, 0x0

    .line 43
    .local v10, "$i$a$-maxByOrNull-CrashReport$exportZip$1$9\\24\\99\\2":I
    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    move-result-wide v13

    .line 99
    .end local v4    # "it\\24":Ljava/io/File;
    .end local v10    # "$i$a$-maxByOrNull-CrashReport$exportZip$1$9\\24\\99\\2":I
    nop

    .line 101
    .local v13, "maxValue\\23":J
    :cond_12
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 102
    .local v4, "e\\23":Ljava/lang/Object;
    move-object v10, v4

    check-cast v10, Ljava/io/File;

    .local v10, "it\\25":Ljava/io/File;
    const/4 v15, 0x0

    .line 43
    .local v15, "$i$a$-maxByOrNull-CrashReport$exportZip$1$9\\25\\102\\2":I
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    move-result-wide v19

    .line 102
    .end local v10    # "it\\25":Ljava/io/File;
    .end local v15    # "$i$a$-maxByOrNull-CrashReport$exportZip$1$9\\25\\102\\2":I
    nop

    .line 103
    .local v19, "v\\23":J
    cmp-long v10, v13, v19

    if-gez v10, :cond_13

    .line 104
    move-object v3, v4

    .line 105
    move-wide/from16 v13, v19

    .line 107
    .end local v4    # "e\\23":Ljava/lang/Object;
    .end local v19    # "v\\23":J
    :cond_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_12

    .line 108
    nop

    .line 43
    .end local v0    # "$this$maxByOrNull\\23":Ljava/lang/Iterable;
    .end local v1    # "$i$f$maxByOrNull\\23\\43":I
    .end local v2    # "iterator\\23":Ljava/util/Iterator;
    .end local v3    # "maxElem\\23":Ljava/lang/Object;
    .end local v13    # "maxValue\\23":J
    :goto_b
    check-cast v3, Ljava/io/File;

    if-eqz v3, :cond_16

    .line 65
    .local v3, "it\\26":Ljava/io/File;
    const/4 v0, 0x0

    .line 43
    .local v0, "$i$a$-let-CrashReport$exportZip$1$10\\26\\43\\2":I
    move-object v1, v11

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v0    # "$i$a$-let-CrashReport$exportZip$1$10\\26\\43\\2":I
    .end local v3    # "it\\26":Ljava/io/File;
    goto :goto_c

    .end local v24    # "root":Ljava/io/File;
    .local v4, "root":Ljava/io/File;
    :cond_14
    move-object/from16 v17, v3

    move-object/from16 v24, v4

    .end local v4    # "root":Ljava/io/File;
    .restart local v24    # "root":Ljava/io/File;
    goto :goto_c

    .line 40
    .end local v24    # "root":Ljava/io/File;
    .restart local v4    # "root":Ljava/io/File;
    :cond_15
    move-object/from16 v17, v3

    move-object/from16 v24, v4

    const/16 v16, 0x1

    .line 45
    .end local v4    # "root":Ljava/io/File;
    .restart local v24    # "root":Ljava/io/File;
    :cond_16
    :goto_c
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    move-object v2, v0

    .local v2, "f\\2":Ljava/io/File;
    sget-object v0, Lcom/pymcl/android/data/CrashReport;->INSTANCE:Lcom/pymcl/android/data/CrashReport;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .local v0, "$this$exportZip_u24lambda_u241_u2412\\27":Lcom/pymcl/android/data/CrashReport;
    const/4 v3, 0x0

    .line 46
    .local v3, "$i$a$-runCatching-CrashReport$exportZip$1$11\\27\\45\\2":I
    move/from16 v4, v16

    const/4 v10, 0x0

    :try_start_d
    invoke-static {v2, v10, v4, v10}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const v10, 0x1e8480

    invoke-static {v13, v10}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v10

    move-object/from16 v25, v10

    check-cast v25, Ljava/lang/Iterable;

    move-object/from16 v26, v17

    check-cast v26, Ljava/lang/CharSequence;

    new-instance v31, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda1;

    invoke-direct/range {v31 .. v31}, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda1;-><init>()V

    const/16 v32, 0x1e

    const/16 v33, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v25 .. v33}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 47
    .local v10, "t\\27":Ljava/lang/String;
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "logs/"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v8, v13, v10}, Lcom/pymcl/android/data/CrashReport;->exportZip$lambda$1$put(Ljava/util/zip/ZipOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    nop

    .end local v0    # "$this$exportZip_u24lambda_u241_u2412\\27":Lcom/pymcl/android/data/CrashReport;
    .end local v3    # "$i$a$-runCatching-CrashReport$exportZip$1$11\\27\\45\\2":I
    .end local v10    # "t\\27":Ljava/lang/String;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 45
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    move/from16 v16, v4

    goto :goto_d

    :catchall_1
    move-exception v0

    goto :goto_e

    :catchall_2
    move-exception v0

    move/from16 v4, v16

    :goto_e
    :try_start_e
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v16, v4

    .end local v2    # "f\\2":Ljava/io/File;
    goto :goto_d

    .line 49
    :cond_17
    nop

    .end local v8    # "z\\2":Ljava/util/zip/ZipOutputStream;
    .end local v9    # "$i$a$-use-CrashReport$exportZip$1\\2\\34\\0":I
    .end local v11    # "logs\\2":Ljava/util/List;
    .end local v12    # "gd\\2":Ljava/io/File;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 34
    const/4 v4, 0x0

    invoke-static {v7, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 50
    return-object v6

    .line 34
    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_f

    .end local v24    # "root":Ljava/io/File;
    .restart local v4    # "root":Ljava/io/File;
    :catchall_4
    move-exception v0

    move-object/from16 v24, v4

    move-object v1, v0

    .end local v4    # "root":Ljava/io/File;
    .end local v5    # "ts":Ljava/lang/String;
    .end local v6    # "out":Ljava/io/File;
    .end local p1    # "ctx":Landroid/content/Context;
    .end local p2    # "info":Lcom/pymcl/android/ui/state/CrashInfo;
    :goto_f
    :try_start_f
    throw v1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .restart local v5    # "ts":Ljava/lang/String;
    .restart local v6    # "out":Ljava/io/File;
    .restart local v24    # "root":Ljava/io/File;
    .restart local p1    # "ctx":Landroid/content/Context;
    .restart local p2    # "info":Lcom/pymcl/android/ui/state/CrashInfo;
    :catchall_5
    move-exception v0

    invoke-static {v7, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final share(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "file"    # Ljava/io/File;
    .param p3, "text"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SEND"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v1, v0

    .local v1, "$this$share_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 55
    .local v2, "$i$a$-apply-CrashReport$share$i$1\\1\\54\\0":I
    if-eqz p2, :cond_0

    const-string v3, "application/zip"

    goto :goto_0

    :cond_0
    const-string v3, "text/plain"

    :goto_0
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    const-string v3, "android.intent.extra.SUBJECT"

    invoke-virtual {v1, v3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const v3, 0xea60

    invoke-static {p3, v3}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "android.intent.extra.TEXT"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 57
    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".provider"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3, p2}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    check-cast v3, Landroid/os/Parcelable;

    const-string v4, "android.intent.extra.STREAM"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 58
    :cond_1
    nop

    .line 54
    .end local v1    # "$this$share_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-CrashReport$share$i$1\\1\\54\\0":I
    nop

    .line 59
    .local v0, "i":Landroid/content/Intent;
    move-object v1, p4

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 60
    return-void
.end method

.method public final text(Lcom/pymcl/android/ui/state/CrashInfo;)Ljava/lang/String;
    .locals 14
    .param p1, "info"    # Lcom/pymcl/android/ui/state/CrashInfo;

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object v1, v0

    .local v1, "$this$text_u24lambda_u240\\1":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .line 21
    .local v2, "$i$a$-buildString-CrashReport$text$1\\1\\20\\0":I
    const-string v3, "PyMCL Android \u5d29\u6e83\u62a5\u544a"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0xa

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getInstance()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getVersion()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getExitCode()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u5b9e\u4f8b\uff1a"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "\u3000\u7248\u672c\uff1a"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "\u3000\u9000\u51fa\u7801\uff1a"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget-object v7, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const-string v8, "SUPPORTED_ABIS"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, [Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/collections/ArraysKt;->firstOrNull([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u8bbe\u5907\uff1a"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v8, " "

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " / Android "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " / "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 24
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getTitle()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u3010\u5206\u6790\u7ed3\u8bba\u3011"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getExplain()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getActions()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getActions()Ljava/util/List;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    const-string v3, "\uff1b"

    move-object v6, v3

    check-cast v6, Ljava/lang/CharSequence;

    const/16 v12, 0x3e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u53ef\u5c1d\u8bd5\uff1a"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    :cond_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v3, "\u3010\u6e38\u620f\u5d29\u6e83\u524d\u7684\u8f93\u51fa\uff08\u672b\u5c3e\uff09\u3011"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/CrashInfo;->getLogTail()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$forEach\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 63
    .local v5, "$i$f$forEach\\2\\26":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\3":Ljava/lang/String;
    const/4 v9, 0x0

    .line 26
    .local v9, "$i$a$-forEach-CrashReport$text$1$1\\3\\63\\1":I
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .end local v8    # "it\\3":Ljava/lang/String;
    .end local v9    # "$i$a$-forEach-CrashReport$text$1$1\\3\\63\\1":I
    nop

    .end local v7    # "element\\2":Ljava/lang/Object;
    goto :goto_0

    .line 64
    :cond_1
    nop

    .line 27
    .end local v3    # "$this$forEach\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach\\2\\26":I
    nop

    .line 20
    .end local v1    # "$this$text_u24lambda_u240\\1":Ljava/lang/StringBuilder;
    .end local v2    # "$i$a$-buildString-CrashReport$text$1\\1\\20\\0":I
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    .line 27
    invoke-static {v0}, Lkotlin/text/StringsKt;->lines(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, "\n"

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v7, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda2;

    invoke-direct {v7}, Lcom/pymcl/android/data/CrashReport$$ExternalSyntheticLambda2;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
