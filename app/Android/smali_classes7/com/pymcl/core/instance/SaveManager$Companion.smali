.class public final Lcom/pymcl/core/instance/SaveManager$Companion;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/SaveManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SaveManager$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,279:1\n1#2:280\n1505#3,2:281\n*S KotlinDebug\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SaveManager$Companion\n*L\n106#1:281,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0010J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "
    }
    d2 = {
        "Lcom/pymcl/core/instance/SaveManager$Companion;",
        "",
        "<init>",
        "()V",
        "ILLEGAL",
        "Lkotlin/text/Regex;",
        "BACKUP_SUFFIX",
        "TRASH_SUFFIX",
        "SKIP",
        "",
        "",
        "stamp",
        "t",
        "",
        "dirSize",
        "f",
        "Ljava/io/File;",
        "validName",
        "",
        "n",
        "readLevel",
        "Lcom/pymcl/core/instance/SaveManager$LevelMeta;",
        "levelDat",
        "readText",
        "maxBytes",
        "",
        "zipDir",
        "",
        "dir",
        "prefix",
        "out",
        "Ljava/io/OutputStream;",
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


# direct methods
.method public static synthetic $r8$lambda$HDXm5Evwf-hJe8xBU7mOpytRd0E(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/SaveManager$Companion;->zipDir$lambda$0$0(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$XeNktUFpSgLaxBMYXyRd-wVv9Ng(Ljava/io/File;Ljava/io/File;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/SaveManager$Companion;->zipDir$lambda$0$1(Ljava/io/File;Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$qt6yx4pgE8mBnRd95RhmR1FJLWw(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/SaveManager$Companion;->dirSize$lambda$0(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wDs5ZuO7Iv-RPoonFFQlfv5_xBU(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/instance/SaveManager$Companion;->dirSize$lambda$1(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method private constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/instance/SaveManager$Companion;-><init>()V

    return-void
.end method

.method private static final dirSize$lambda$0(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final dirSize$lambda$1(Ljava/io/File;)Z
    .locals 1
    .param p0, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public static synthetic readText$default(Lcom/pymcl/core/instance/SaveManager$Companion;Ljava/io/File;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 89
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/high16 p2, 0x80000

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/instance/SaveManager$Companion;->readText(Ljava/io/File;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final zipDir$lambda$0$0(Ljava/io/File;Ljava/io/IOException;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final zipDir$lambda$0$1(Ljava/io/File;Ljava/io/File;)Z
    .locals 2
    .param p0, "$dir"    # Ljava/io/File;
    .param p1, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/pymcl/core/instance/SaveManager;->access$getSKIP$cp()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final dirSize(Ljava/io/File;)J
    .locals 5
    .param p1, "f"    # Ljava/io/File;

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    new-instance v1, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda2;-><init>()V

    invoke-virtual {v0, v1}, Lkotlin/io/FileTreeWalk;->onFail(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    new-instance v1, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda3;

    invoke-direct {v1}, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/io/File;

    .line 280
    nop

    .local v3, "it":Ljava/io/File;
    const/4 v4, 0x0

    .line 76
    .local v4, "$i$a$-sumOfLong-SaveManager$Companion$dirSize$3":I
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v3

    .end local v3    # "it":Ljava/io/File;
    .end local v4    # "$i$a$-sumOfLong-SaveManager$Companion$dirSize$3":I
    add-long/2addr v1, v3

    goto :goto_0

    :cond_1
    move-wide v0, v1

    :goto_1
    return-wide v0
.end method

.method public final readLevel(Ljava/io/File;)Lcom/pymcl/core/instance/SaveManager$LevelMeta;
    .locals 11
    .param p1, "levelDat"    # Ljava/io/File;

    const-string v0, "levelDat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/instance/SaveManager$Companion;

    .local v0, "$this$readLevel_u24lambda_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    const/4 v2, 0x0

    .line 83
    .local v2, "$i$a$-runCatching-SaveManager$Companion$readLevel$1":I
    sget-object v3, Lcom/pymcl/core/instance/LevelNbt;->INSTANCE:Lcom/pymcl/core/instance/LevelNbt;

    invoke-virtual {v3, p1}, Lcom/pymcl/core/instance/LevelNbt;->readFile(Ljava/io/File;)Lcom/pymcl/core/instance/LevelNbt$Root;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/core/instance/LevelNbt$Root;->getTag()Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    move-result-object v3

    const-string v4, "Data"

    invoke-virtual {v3, v4}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->compound(Ljava/lang/String;)Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    move-result-object v3

    if-nez v3, :cond_0

    return-object v1

    .line 84
    .local v3, "data":Lcom/pymcl/core/instance/LevelNbt$NbtCompound;
    :cond_0
    new-instance v4, Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    const-string v5, "LevelName"

    invoke-virtual {v3, v5}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "LastPlayed"

    invoke-virtual {v3, v6}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->long(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "GameType"

    invoke-virtual {v3, v7}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->int(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "hardcore"

    invoke-virtual {v3, v8}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->int(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v8

    const/4 v9, 0x0

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_0

    :cond_1
    move v8, v9

    :goto_0
    if-eqz v8, :cond_2

    const/4 v9, 0x1

    :cond_2
    move v8, v9

    .line 85
    const-string v9, "Version"

    invoke-virtual {v3, v9}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->compound(Ljava/lang/String;)Lcom/pymcl/core/instance/LevelNbt$NbtCompound;

    move-result-object v9

    if-eqz v9, :cond_3

    const-string v10, "Name"

    invoke-virtual {v9, v10}, Lcom/pymcl/core/instance/LevelNbt$NbtCompound;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    goto :goto_1

    :cond_3
    move-object v9, v1

    .line 84
    :goto_1
    invoke-direct/range {v4 .. v9}, Lcom/pymcl/core/instance/SaveManager$LevelMeta;-><init>(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;ZLjava/lang/String;)V

    .line 85
    nop

    .line 82
    .end local v0    # "$this$readLevel_u24lambda_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .end local v2    # "$i$a$-runCatching-SaveManager$Companion$readLevel$1":I
    .end local v3    # "data":Lcom/pymcl/core/instance/LevelNbt$NbtCompound;
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 86
    :goto_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    move-object v1, v0

    :goto_3
    check-cast v1, Lcom/pymcl/core/instance/SaveManager$LevelMeta;

    return-object v1
.end method

.method public final readText(Ljava/io/File;I)Ljava/lang/String;
    .locals 18
    .param p1, "f"    # Ljava/io/File;
    .param p2, "maxBytes"    # I

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v0, "f"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileInputStream;

    .line 90
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v0, Ljava/io/InputStream;

    instance-of v3, v0, Ljava/io/BufferedInputStream;

    if-eqz v3, :cond_0

    check-cast v0, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/BufferedInputStream;

    const/16 v4, 0x2000

    invoke-direct {v3, v0, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    move-object v0, v3

    :goto_0
    move-object v3, v0

    check-cast v3, Ljava/io/InputStream;

    .line 91
    .local v3, "raw":Ljava/io/InputStream;
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v4, "getName(...)"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, ".gz"

    const/4 v5, 0x1

    invoke-static {v0, v4, v5}, Lkotlin/text/StringsKt;->endsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/zip/GZIPInputStream;

    invoke-direct {v0, v3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    check-cast v0, Ljava/io/InputStream;

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    move-object v4, v0

    .line 92
    .local v4, "input":Ljava/io/InputStream;
    move-object v5, v4

    check-cast v5, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v5

    check-cast v0, Ljava/io/InputStream;

    .local v0, "s":Ljava/io/InputStream;
    const/4 v6, 0x0

    .line 93
    .local v6, "$i$a$-use-SaveManager$Companion$readText$1":I
    new-array v7, v2, [B

    .local v7, "ring":[B
    const-wide/16 v8, 0x0

    .local v8, "total":J
    const/4 v10, 0x0

    .local v10, "pos":I
    const/16 v11, 0x4000

    new-array v11, v11, [B

    .line 94
    .local v11, "buf":[B
    :goto_2
    invoke-virtual {v0, v11}, Ljava/io/InputStream;->read([B)I

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .local v12, "n":I
    if-ltz v12, :cond_3

    .line 95
    const/4 v13, 0x0

    .local v13, "i":I
    :goto_3
    if-ge v13, v12, :cond_2

    :try_start_1
    aget-byte v14, v11, v13

    aput-byte v14, v7, v10

    add-int/lit8 v14, v10, 0x1

    rem-int/2addr v14, v2

    move v10, v14

    add-int/lit8 v13, v13, 0x1

    goto :goto_3

    .end local v13    # "i":I
    :cond_2
    int-to-long v13, v12

    add-long/2addr v8, v13

    .end local v12    # "n":I
    goto :goto_2

    .line 96
    :cond_3
    int-to-long v12, v2

    cmp-long v12, v8, v12

    if-gtz v12, :cond_4

    long-to-int v12, v8

    invoke-static {v7, v12}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v12

    const-string v13, "copyOf(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    .line 92
    .end local v0    # "s":Ljava/io/InputStream;
    .end local v6    # "$i$a$-use-SaveManager$Companion$readText$1":I
    .end local v7    # "ring":[B
    .end local v8    # "total":J
    .end local v10    # "pos":I
    .end local v11    # "buf":[B
    :catchall_0
    move-exception v0

    move-object v1, v0

    move-object/from16 v17, v3

    goto :goto_6

    .line 96
    .restart local v0    # "s":Ljava/io/InputStream;
    .restart local v6    # "$i$a$-use-SaveManager$Companion$readText$1":I
    .restart local v7    # "ring":[B
    .restart local v8    # "total":J
    .restart local v10    # "pos":I
    .restart local v11    # "buf":[B
    :cond_4
    :try_start_2
    invoke-static {v7, v10, v2}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v12

    const/4 v13, 0x0

    invoke-static {v7, v13, v10}, Lkotlin/collections/ArraysKt;->copyOfRange([BII)[B

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/collections/ArraysKt;->plus([B[B)[B

    move-result-object v12

    .local v12, "bytes":[B
    :goto_4
    new-instance v13, Ljava/lang/String;

    .line 97
    sget-object v14, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v13, v12, v14}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 98
    .local v13, "text":Ljava/lang/String;
    int-to-long v14, v2

    cmp-long v14, v8, v14

    const/4 v15, 0x0

    if-lez v14, :cond_5

    const/16 v14, 0x400

    move-object/from16 v16, v0

    .end local v0    # "s":Ljava/io/InputStream;
    .local v16, "s":Ljava/io/InputStream;
    int-to-long v0, v14

    div-long v0, v8, v0

    div-int/lit16 v14, v2, 0x400
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const/16 v2, 0xa

    move-object/from16 v17, v3

    .end local v3    # "raw":Ljava/io/InputStream;
    .local v17, "raw":Ljava/io/InputStream;
    const/4 v3, 0x2

    :try_start_3
    invoke-static {v13, v2, v15, v3, v15}, Lkotlin/text/StringsKt;->substringAfter$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "\u2026\uff08\u6587\u4ef6\u5171 "

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " KB\uff0c\u53ea\u663e\u793a\u6700\u540e "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " KB\uff09\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v13, v0

    goto :goto_5

    .line 92
    .end local v6    # "$i$a$-use-SaveManager$Companion$readText$1":I
    .end local v7    # "ring":[B
    .end local v8    # "total":J
    .end local v10    # "pos":I
    .end local v11    # "buf":[B
    .end local v12    # "bytes":[B
    .end local v13    # "text":Ljava/lang/String;
    .end local v16    # "s":Ljava/io/InputStream;
    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_6

    .line 98
    .end local v17    # "raw":Ljava/io/InputStream;
    .restart local v0    # "s":Ljava/io/InputStream;
    .restart local v3    # "raw":Ljava/io/InputStream;
    .restart local v6    # "$i$a$-use-SaveManager$Companion$readText$1":I
    .restart local v7    # "ring":[B
    .restart local v8    # "total":J
    .restart local v10    # "pos":I
    .restart local v11    # "buf":[B
    .restart local v12    # "bytes":[B
    .restart local v13    # "text":Ljava/lang/String;
    :cond_5
    move-object/from16 v16, v0

    move-object/from16 v17, v3

    .line 92
    .end local v0    # "s":Ljava/io/InputStream;
    .end local v3    # "raw":Ljava/io/InputStream;
    .end local v6    # "$i$a$-use-SaveManager$Companion$readText$1":I
    .end local v7    # "ring":[B
    .end local v8    # "total":J
    .end local v10    # "pos":I
    .end local v11    # "buf":[B
    .end local v12    # "bytes":[B
    .end local v13    # "text":Ljava/lang/String;
    .restart local v17    # "raw":Ljava/io/InputStream;
    :goto_5
    const/4 v0, 0x0

    invoke-static {v5, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v13

    .end local v17    # "raw":Ljava/io/InputStream;
    .restart local v3    # "raw":Ljava/io/InputStream;
    :catchall_2
    move-exception v0

    move-object/from16 v17, v3

    move-object v1, v0

    .end local v3    # "raw":Ljava/io/InputStream;
    .end local v4    # "input":Ljava/io/InputStream;
    .end local p1    # "f":Ljava/io/File;
    .end local p2    # "maxBytes":I
    :goto_6
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .restart local v4    # "input":Ljava/io/InputStream;
    .restart local v17    # "raw":Ljava/io/InputStream;
    .restart local p1    # "f":Ljava/io/File;
    .restart local p2    # "maxBytes":I
    :catchall_3
    move-exception v0

    invoke-static {v5, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final stamp(J)Ljava/lang/String;
    .locals 3
    .param p1, "t"    # J

    .line 74
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyyMMdd-HHmmss"

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, p1, p2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "format(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final validName(Ljava/lang/String;)Z
    .locals 2
    .param p1, "n"    # Ljava/lang/String;

    const-string v0, "n"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "."

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ".."

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/pymcl/core/instance/SaveManager;->access$getILLEGAL$cp()Lkotlin/text/Regex;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final zipDir(Ljava/io/File;Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 21
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "prefix"    # Ljava/lang/String;
    .param p3, "out"    # Ljava/io/OutputStream;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "/"

    const-string v0, "dir"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefix"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    new-instance v0, Ljava/util/zip/ZipOutputStream;

    instance-of v5, v3, Ljava/io/BufferedOutputStream;

    if-eqz v5, :cond_0

    move-object v5, v3

    check-cast v5, Ljava/io/BufferedOutputStream;

    goto :goto_0

    :cond_0
    new-instance v5, Ljava/io/BufferedOutputStream;

    const/16 v6, 0x2000

    invoke-direct {v5, v3, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;I)V

    :goto_0
    check-cast v5, Ljava/io/OutputStream;

    invoke-direct {v0, v5}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    check-cast v5, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v5

    check-cast v0, Ljava/util/zip/ZipOutputStream;

    move-object v6, v0

    .local v6, "z":Ljava/util/zip/ZipOutputStream;
    const/4 v7, 0x0

    .line 105
    .local v7, "$i$a$-use-SaveManager$Companion$zipDir$1":I
    new-instance v0, Ljava/util/zip/ZipEntry;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v8}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    invoke-virtual {v6}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 106
    invoke-static {v1}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    new-instance v8, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda0;

    invoke-direct {v8}, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v8}, Lkotlin/io/FileTreeWalk;->onFail(Lkotlin/jvm/functions/Function2;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    new-instance v8, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda1;

    invoke-direct {v8, v1}, Lcom/pymcl/core/instance/SaveManager$Companion$$ExternalSyntheticLambda1;-><init>(Ljava/io/File;)V

    invoke-static {v0, v8}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    move-object v8, v0

    .local v8, "$this$forEach$iv":Lkotlin/sequences/Sequence;
    const/4 v9, 0x0

    .line 281
    .local v9, "$i$f$forEach":I
    invoke-interface {v8}, Lkotlin/sequences/Sequence;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    .local v12, "element$iv":Ljava/lang/Object;
    move-object v0, v12

    check-cast v0, Ljava/io/File;

    move-object v13, v0

    .local v13, "f":Ljava/io/File;
    const/4 v14, 0x0

    .line 107
    .local v14, "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    invoke-static {v13, v1}, Lkotlin/io/FilesKt;->relativeTo(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkotlin/io/FilesKt;->getInvariantSeparatorsPath(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    move-object v15, v0

    .line 108
    .local v15, "rel":Ljava/lang/String;
    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/util/zip/ZipEntry;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v11}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    invoke-virtual {v6}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    move-object/from16 v20, v4

    goto/16 :goto_5

    .line 109
    :cond_1
    sget-object v0, Lcom/pymcl/core/instance/SaveManager;->Companion:Lcom/pymcl/core/instance/SaveManager$Companion;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    sget-object v16, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v16, v0

    .line 280
    .local v16, "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    const/16 v17, 0x0

    .local v17, "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    new-instance v0, Ljava/io/FileInputStream;

    .line 109
    invoke-direct {v0, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v11, v0

    check-cast v11, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    move-object v0, v11

    check-cast v0, Ljava/io/FileInputStream;

    .line 280
    .local v0, "i":Ljava/io/FileInputStream;
    const/16 v18, 0x0

    .line 109
    .local v18, "$i$a$-use-SaveManager$Companion$zipDir$1$3$1$1":I
    move-object/from16 v19, v0

    .end local v0    # "i":Ljava/io/FileInputStream;
    .local v19, "i":Ljava/io/FileInputStream;
    new-instance v0, Ljava/util/zip/ZipEntry;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 280
    move-object v1, v0

    .local v1, "it":Ljava/util/zip/ZipEntry;
    const/16 v20, 0x0

    .line 109
    .local v20, "$i$a$-also-SaveManager$Companion$zipDir$1$3$1$1$1":I
    invoke-virtual {v13}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/zip/ZipEntry;->setTime(J)V

    .end local v1    # "it":Ljava/util/zip/ZipEntry;
    .end local v20    # "$i$a$-also-SaveManager$Companion$zipDir$1$3$1$1$1":I
    invoke-virtual {v6, v0}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    move-object/from16 v0, v19

    check-cast v0, Ljava/io/InputStream;

    move-object v1, v6

    check-cast v1, Ljava/io/OutputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/4 v2, 0x0

    const/4 v3, 0x2

    move-object/from16 v20, v4

    const/4 v4, 0x0

    :try_start_3
    invoke-static {v0, v1, v2, v3, v4}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    invoke-virtual {v6}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .end local v18    # "$i$a$-use-SaveManager$Companion$zipDir$1$3$1$1":I
    .end local v19    # "i":Ljava/io/FileInputStream;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v4, 0x0

    :try_start_4
    invoke-static {v11, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v16    # "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .end local v17    # "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_4

    .restart local v16    # "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .restart local v17    # "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object/from16 v20, v4

    :goto_2
    move-object v1, v0

    .end local v6    # "z":Ljava/util/zip/ZipOutputStream;
    .end local v7    # "$i$a$-use-SaveManager$Companion$zipDir$1":I
    .end local v8    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v9    # "$i$f$forEach":I
    .end local v12    # "element$iv":Ljava/lang/Object;
    .end local v13    # "f":Ljava/io/File;
    .end local v14    # "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    .end local v15    # "rel":Ljava/lang/String;
    .end local v16    # "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .end local v17    # "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "prefix":Ljava/lang/String;
    .end local p3    # "out":Ljava/io/OutputStream;
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .restart local v6    # "z":Ljava/util/zip/ZipOutputStream;
    .restart local v7    # "$i$a$-use-SaveManager$Companion$zipDir$1":I
    .restart local v8    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v9    # "$i$f$forEach":I
    .restart local v12    # "element$iv":Ljava/lang/Object;
    .restart local v13    # "f":Ljava/io/File;
    .restart local v14    # "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    .restart local v15    # "rel":Ljava/lang/String;
    .restart local v16    # "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .restart local v17    # "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "prefix":Ljava/lang/String;
    .restart local p3    # "out":Ljava/io/OutputStream;
    :catchall_2
    move-exception v0

    :try_start_6
    invoke-static {v11, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v6    # "z":Ljava/util/zip/ZipOutputStream;
    .end local v7    # "$i$a$-use-SaveManager$Companion$zipDir$1":I
    .end local v8    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v9    # "$i$f$forEach":I
    .end local v12    # "element$iv":Ljava/lang/Object;
    .end local v13    # "f":Ljava/io/File;
    .end local v14    # "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    .end local v15    # "rel":Ljava/lang/String;
    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "prefix":Ljava/lang/String;
    .end local p3    # "out":Ljava/io/OutputStream;
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .end local v16    # "$this$zipDir_u24lambda_u240_u242_u240":Lcom/pymcl/core/instance/SaveManager$Companion;
    .end local v17    # "$i$a$-runCatching-SaveManager$Companion$zipDir$1$3$1":I
    .restart local v6    # "z":Ljava/util/zip/ZipOutputStream;
    .restart local v7    # "$i$a$-use-SaveManager$Companion$zipDir$1":I
    .restart local v8    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .restart local v9    # "$i$f$forEach":I
    .restart local v12    # "element$iv":Ljava/lang/Object;
    .restart local v13    # "f":Ljava/io/File;
    .restart local v14    # "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    .restart local v15    # "rel":Ljava/lang/String;
    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "prefix":Ljava/lang/String;
    .restart local p3    # "out":Ljava/io/OutputStream;
    :catchall_3
    move-exception v0

    goto :goto_3

    :catchall_4
    move-exception v0

    move-object/from16 v20, v4

    :goto_3
    :try_start_7
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 110
    :goto_5
    nop

    .line 281
    .end local v13    # "f":Ljava/io/File;
    .end local v14    # "$i$a$-forEach-SaveManager$Companion$zipDir$1$3":I
    .end local v15    # "rel":Ljava/lang/String;
    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, v20

    .end local v12    # "element$iv":Ljava/lang/Object;
    goto/16 :goto_1

    .line 282
    :cond_2
    nop

    .line 111
    .end local v8    # "$this$forEach$iv":Lkotlin/sequences/Sequence;
    .end local v9    # "$i$f$forEach":I
    nop

    .end local v6    # "z":Ljava/util/zip/ZipOutputStream;
    .end local v7    # "$i$a$-use-SaveManager$Companion$zipDir$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 104
    const/4 v4, 0x0

    invoke-static {v5, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 112
    return-void

    .line 104
    :catchall_5
    move-exception v0

    move-object v1, v0

    .end local p1    # "dir":Ljava/io/File;
    .end local p2    # "prefix":Ljava/lang/String;
    .end local p3    # "out":Ljava/io/OutputStream;
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .restart local p1    # "dir":Ljava/io/File;
    .restart local p2    # "prefix":Ljava/lang/String;
    .restart local p3    # "out":Ljava/io/OutputStream;
    :catchall_6
    move-exception v0

    invoke-static {v5, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
