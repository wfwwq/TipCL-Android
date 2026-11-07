.class public final Lcom/pymcl/core/mods/LocalModMetaReader;
.super Ljava/lang/Object;
.source "ModTools.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModTools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModTools.kt\ncom/pymcl/core/mods/LocalModMetaReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/core/mods/LocalModMetaReader;",
        "",
        "<init>",
        "()V",
        "read",
        "Lcom/pymcl/core/mods/LocalModMeta;",
        "f",
        "Ljava/io/File;",
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
.field public static final INSTANCE:Lcom/pymcl/core/mods/LocalModMetaReader;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/mods/LocalModMetaReader;

    invoke-direct {v0}, Lcom/pymcl/core/mods/LocalModMetaReader;-><init>()V

    sput-object v0, Lcom/pymcl/core/mods/LocalModMetaReader;->INSTANCE:Lcom/pymcl/core/mods/LocalModMetaReader;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final read$lambda$0$0$3$v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "$t"    # Ljava/lang/String;
    .param p1, "k"    # Ljava/lang/String;

    .line 62
    new-instance v0, Lkotlin/text/Regex;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "(?m)^\\s*"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\\s*=\\s*[\"\']([^\"\']*)[\"\']"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v1, "[[mods]]"

    invoke-static {p0, v1, p0}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method

.method private static final read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "$z"    # Ljava/util/zip/ZipFile;
    .param p1, "n"    # Ljava/lang/String;

    .line 58
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 289
    .local v0, "it":Ljava/util/zip/ZipEntry;
    const/4 v1, 0x0

    .line 58
    .local v1, "$i$a$-let-LocalModMetaReader$read$1$1$text$1":I
    invoke-virtual {p0, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v2

    const-string v3, "getInputStream(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v2

    sget-object v3, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v2, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .end local v0    # "it":Ljava/util/zip/ZipEntry;
    .end local v1    # "$i$a$-let-LocalModMetaReader$read$1$1$text$1":I
    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    return-object v4
.end method


# virtual methods
.method public final read(Ljava/io/File;)Lcom/pymcl/core/mods/LocalModMeta;
    .locals 17
    .param p1, "f"    # Ljava/io/File;

    move-object/from16 v1, p1

    const-string v0, "modId"

    const-string v2, "f"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    const/4 v2, 0x0

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v3, p0

    check-cast v3, Lcom/pymcl/core/mods/LocalModMetaReader;

    .line 289
    .local v3, "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    const/4 v4, 0x0

    .line 57
    .local v4, "$i$a$-runCatching-LocalModMetaReader$read$1":I
    new-instance v5, Ljava/util/zip/ZipFile;

    invoke-direct {v5, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    check-cast v5, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    :try_start_1
    move-object v6, v5

    check-cast v6, Ljava/util/zip/ZipFile;

    .local v6, "z":Ljava/util/zip/ZipFile;
    const/4 v7, 0x0

    .line 59
    .local v7, "$i$a$-use-LocalModMetaReader$read$1$1":I
    const-string v8, "fabric.mod.json"

    invoke-static {v6, v8}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const-string v9, "name"

    const-string v10, "version"

    const-string v11, "id"

    const-string v12, ""

    if-eqz v8, :cond_3

    .line 289
    .local v8, "it":Ljava/lang/String;
    const/4 v0, 0x0

    .line 59
    .local v0, "$i$a$-let-LocalModMetaReader$read$1$1$1":I
    :try_start_2
    sget-object v13, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v13, v8}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    .local v13, "o":Ljava/util/Map;
    new-instance v14, Lcom/pymcl/core/mods/LocalModMeta;

    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_0

    move-object v15, v12

    :cond_0
    invoke-static {v13, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_1

    move-object v9, v12

    :cond_1
    invoke-static {v13, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_0

    :cond_2
    move-object v12, v10

    :goto_0
    invoke-direct {v14, v15, v9, v12}, Lcom/pymcl/core/mods/LocalModMeta;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    .end local v0    # "$i$a$-let-LocalModMetaReader$read$1$1$1":I
    .end local v6    # "z":Ljava/util/zip/ZipFile;
    .end local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    .end local v8    # "it":Ljava/lang/String;
    .end local v13    # "o":Ljava/util/Map;
    :try_start_3
    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_b

    return-object v14

    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object v15, v2

    move-object/from16 v16, v3

    goto/16 :goto_a

    .line 60
    .restart local v6    # "z":Ljava/util/zip/ZipFile;
    .restart local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    :cond_3
    :try_start_4
    const-string v8, "quilt.mod.json"

    invoke-static {v6, v8}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    if-eqz v8, :cond_7

    .line 289
    .restart local v8    # "it":Ljava/lang/String;
    const/4 v0, 0x0

    .line 60
    .local v0, "$i$a$-let-LocalModMetaReader$read$1$1$2":I
    :try_start_5
    sget-object v13, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v13, v8}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    const-string v14, "quilt_loader"

    invoke-static {v13, v14}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    .restart local v13    # "o":Ljava/util/Map;
    new-instance v14, Lcom/pymcl/core/mods/LocalModMeta;

    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_4

    move-object v15, v12

    :cond_4
    const-string v2, "metadata"

    invoke-static {v13, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v2, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_5

    move-object v2, v12

    :cond_5
    invoke-static {v13, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_6

    goto :goto_1

    :cond_6
    move-object v12, v9

    :goto_1
    invoke-direct {v14, v15, v2, v12}, Lcom/pymcl/core/mods/LocalModMeta;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 57
    .end local v0    # "$i$a$-let-LocalModMetaReader$read$1$1$2":I
    .end local v6    # "z":Ljava/util/zip/ZipFile;
    .end local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    .end local v8    # "it":Ljava/lang/String;
    .end local v13    # "o":Ljava/util/Map;
    const/4 v2, 0x0

    :try_start_6
    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    return-object v14

    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .end local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    :catchall_1
    move-exception v0

    const/4 v15, 0x0

    goto/16 :goto_b

    .restart local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    :catchall_2
    move-exception v0

    move-object v1, v0

    move-object/from16 v16, v3

    const/4 v15, 0x0

    goto/16 :goto_a

    .line 61
    .restart local v6    # "z":Ljava/util/zip/ZipFile;
    .restart local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    :cond_7
    :try_start_7
    const-string v2, "META-INF/neoforge.mods.toml"

    invoke-static {v6, v2}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    if-nez v2, :cond_8

    :try_start_8
    const-string v2, "META-INF/mods.toml"

    invoke-static {v6, v2}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :cond_8
    if-eqz v2, :cond_f

    .local v2, "t":Ljava/lang/String;
    const/4 v8, 0x0

    .line 63
    .local v8, "$i$a$-let-LocalModMetaReader$read$1$1$3":I
    :try_start_9
    invoke-static {v2, v10}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$3$v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 64
    .local v9, "ver":Ljava/lang/String;
    move-object v10, v9

    check-cast v10, Ljava/lang/CharSequence;

    const-string v11, "${file.jarVersion}"

    check-cast v11, Ljava/lang/CharSequence;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static {v10, v11, v14, v13, v15}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const-string v10, "META-INF/MANIFEST.MF"

    invoke-static {v6, v10}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_b

    .line 289
    .local v10, "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 64
    .local v15, "$i$a$-let-LocalModMetaReader$read$1$1$3$1":I
    new-instance v11, Lkotlin/text/Regex;

    const-string v13, "(?m)^Implementation-Version:\\s*(\\S+)"

    invoke-direct {v11, v13}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v13, v10

    check-cast v13, Ljava/lang/CharSequence;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    move-object/from16 v16, v3

    const/4 v1, 0x2

    const/4 v3, 0x0

    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .local v16, "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :try_start_a
    invoke-static {v11, v13, v14, v1, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v1

    if-eqz v1, :cond_9

    invoke-interface {v1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_9

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_2

    :cond_9
    const/4 v3, 0x1

    const/4 v1, 0x0

    .end local v10    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-let-LocalModMetaReader$read$1$1$3$1":I
    :goto_2
    if-nez v1, :cond_a

    goto :goto_3

    :cond_a
    move-object v12, v1

    goto :goto_3

    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :cond_b
    move-object/from16 v16, v3

    const/4 v3, 0x1

    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :goto_3
    move-object v9, v12

    goto :goto_4

    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :cond_c
    move-object/from16 v16, v3

    const/4 v3, 0x1

    .line 65
    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :goto_4
    invoke-static {v2, v0}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$3$v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v10, "displayName"

    invoke-static {v2, v10}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$3$v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v11

    if-nez v11, :cond_d

    move v14, v3

    :cond_d
    if-eqz v14, :cond_e

    .line 289
    const/4 v3, 0x0

    .line 65
    .local v3, "$i$a$-ifEmpty-LocalModMetaReader$read$1$1$3$2":I
    invoke-static {v2, v0}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$3$v(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .end local v3    # "$i$a$-ifEmpty-LocalModMetaReader$read$1$1$3$2":I
    :cond_e
    check-cast v10, Ljava/lang/String;

    new-instance v0, Lcom/pymcl/core/mods/LocalModMeta;

    invoke-direct {v0, v1, v10, v9}, Lcom/pymcl/core/mods/LocalModMeta;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 57
    .end local v2    # "t":Ljava/lang/String;
    .end local v6    # "z":Ljava/util/zip/ZipFile;
    .end local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    .end local v8    # "$i$a$-let-LocalModMetaReader$read$1$1$3":I
    .end local v9    # "ver":Ljava/lang/String;
    const/4 v15, 0x0

    :try_start_b
    invoke-static {v5, v15}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    return-object v0

    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .local v3, "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :catchall_3
    move-exception v0

    move-object/from16 v16, v3

    move-object v1, v0

    const/4 v15, 0x0

    goto/16 :goto_a

    .line 66
    .restart local v6    # "z":Ljava/util/zip/ZipFile;
    .restart local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    :cond_f
    move-object/from16 v16, v3

    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :try_start_c
    const-string v0, "mcmod.info"

    invoke-static {v6, v0}, Lcom/pymcl/core/mods/LocalModMetaReader;->read$lambda$0$0$text(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    if-eqz v0, :cond_18

    move-object v1, v0

    .line 289
    .local v1, "t":Ljava/lang/String;
    const/4 v2, 0x0

    .line 66
    .local v2, "$i$a$-let-LocalModMetaReader$read$1$1$4":I
    :try_start_d
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, v16

    .line 289
    .local v0, "$this$read_u24lambda_u240_u240_u244_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    const/4 v3, 0x0

    .line 66
    .local v3, "$i$a$-runCatching-LocalModMetaReader$read$1$1$4$a$1":I
    sget-object v8, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v8, v1}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    .end local v0    # "$this$read_u24lambda_u240_u240_u244_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .end local v3    # "$i$a$-runCatching-LocalModMetaReader$read$1$1$4$a$1":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    goto :goto_5

    :catchall_4
    move-exception v0

    :try_start_e
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    const/4 v0, 0x0

    .line 67
    .local v0, "a":Ljava/lang/Object;
    :cond_10
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    if-nez v3, :cond_12

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_11

    const-string v8, "modList"

    invoke-static {v3, v8}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    goto :goto_6

    :cond_11
    const/4 v3, 0x0

    :cond_12
    :goto_6
    if-eqz v3, :cond_17

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_17

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    if-nez v3, :cond_13

    goto :goto_8

    .line 57
    :cond_13
    nop

    .line 68
    .local v3, "o":Ljava/util/Map;
    new-instance v8, Lcom/pymcl/core/mods/LocalModMeta;

    const-string v11, "modid"

    invoke-static {v3, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_14

    move-object v11, v12

    :cond_14
    invoke-static {v3, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_15

    move-object v9, v12

    :cond_15
    invoke-static {v3, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_16

    goto :goto_7

    :cond_16
    move-object v12, v10

    :goto_7
    invoke-direct {v8, v11, v9, v12}, Lcom/pymcl/core/mods/LocalModMeta;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 57
    .end local v0    # "a":Ljava/lang/Object;
    .end local v1    # "t":Ljava/lang/String;
    .end local v2    # "$i$a$-let-LocalModMetaReader$read$1$1$4":I
    .end local v3    # "o":Ljava/util/Map;
    .end local v6    # "z":Ljava/util/zip/ZipFile;
    .end local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    const/4 v15, 0x0

    :try_start_f
    invoke-static {v5, v15}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v8

    :cond_17
    :goto_8
    const/4 v15, 0x0

    invoke-static {v5, v15}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    return-object v15

    :catchall_5
    move-exception v0

    move-object v1, v0

    const/4 v15, 0x0

    goto :goto_a

    .line 69
    .restart local v6    # "z":Ljava/util/zip/ZipFile;
    .restart local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    :cond_18
    nop

    .line 57
    .end local v6    # "z":Ljava/util/zip/ZipFile;
    .end local v7    # "$i$a$-use-LocalModMetaReader$read$1$1":I
    const/4 v15, 0x0

    :try_start_10
    invoke-static {v5, v15}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 69
    nop

    .line 57
    .end local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    invoke-static {v15}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    goto :goto_c

    .restart local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    .restart local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :catchall_6
    move-exception v0

    const/4 v15, 0x0

    move-object v1, v0

    goto :goto_a

    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .local v3, "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    :catchall_7
    move-exception v0

    move-object/from16 v16, v3

    const/4 v15, 0x0

    goto :goto_9

    :catchall_8
    move-exception v0

    move-object v15, v2

    move-object/from16 v16, v3

    :goto_9
    move-object v1, v0

    .end local v3    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .end local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    .end local p1    # "f":Ljava/io/File;
    :goto_a
    :try_start_11
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_9

    .restart local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    .restart local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local p1    # "f":Ljava/io/File;
    :catchall_9
    move-exception v0

    :try_start_12
    invoke-static {v5, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "f":Ljava/io/File;
    throw v0
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .end local v4    # "$i$a$-runCatching-LocalModMetaReader$read$1":I
    .end local v16    # "$this$read_u24lambda_u240":Lcom/pymcl/core/mods/LocalModMetaReader;
    .restart local p1    # "f":Ljava/io/File;
    :catchall_a
    move-exception v0

    goto :goto_b

    :catchall_b
    move-exception v0

    move-object v15, v2

    :goto_b
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 69
    :goto_c
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    move-object v2, v15

    goto :goto_d

    :cond_19
    move-object v2, v0

    :goto_d
    check-cast v2, Lcom/pymcl/core/mods/LocalModMeta;

    return-object v2
.end method
