.class public final Lcom/pymcl/runtime/GameSession$Companion;
.super Ljava/lang/Object;
.source "GameSession.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/GameSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSession.kt\ncom/pymcl/runtime/GameSession$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n1739#2:88\n1814#2,3:89\n*S KotlinDebug\n*F\n+ 1 GameSession.kt\ncom/pymcl/runtime/GameSession$Companion\n*L\n67#1:88\n67#1:89,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ$\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00082\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\r0\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/runtime/GameSession$Companion;",
        "",
        "<init>",
        "()V",
        "tail",
        "",
        "",
        "f",
        "Ljava/io/File;",
        "maxLines",
        "",
        "maxBytes",
        "atomic",
        "",
        "target",
        "write",
        "Lkotlin/Function1;",
        "of",
        "Lcom/pymcl/runtime/GameSession;",
        "context",
        "Landroid/content/Context;",
        "PyMCL-Android:runtime_debug"
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
.method private constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$atomic(Lcom/pymcl/runtime/GameSession$Companion;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/GameSession$Companion;
    .param p1, "target"    # Ljava/io/File;
    .param p2, "write"    # Lkotlin/jvm/functions/Function1;

    .line 61
    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/GameSession$Companion;->atomic(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final atomic(Ljava/io/File;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .param p1, "target"    # Ljava/io/File;
    .param p2, "write"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/io/File;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 75
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".tmp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v0, "tmp":Ljava/io/File;
    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 77
    :cond_0
    return-void
.end method


# virtual methods
.method public final of(Landroid/content/Context;)Lcom/pymcl/runtime/GameSession;
    .locals 5
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    invoke-static {p1}, Lcom/pymcl/runtime/RuntimeHost;->init(Landroid/content/Context;)V

    .line 82
    new-instance v0, Lcom/pymcl/runtime/GameSession;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "game_session"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/tungsten/fclauncher/utils/FCLPath;->LOG_DIR:Ljava/lang/String;

    const-string v4, "latest_game.log"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/GameSession;-><init>(Ljava/io/File;Ljava/io/File;)V

    return-object v0
.end method

.method public final tail(Ljava/io/File;II)Ljava/util/List;
    .locals 25
    .param p1, "f"    # Ljava/io/File;
    .param p2, "maxLines"    # I
    .param p3, "maxBytes"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "II)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "f"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 64
    :cond_0
    new-instance v0, Ljava/io/RandomAccessFile;

    const-string v2, "r"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/RandomAccessFile;

    .local v0, "r":Ljava/io/RandomAccessFile;
    const/4 v3, 0x0

    .line 65
    .local v3, "$i$a$-use-GameSession$Companion$tail$1":I
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    move/from16 v6, p3

    .local v4, "len":J
    int-to-long v7, v6

    sub-long v7, v4, v7

    const-wide/16 v9, 0x0

    :try_start_1
    invoke-static {v7, v8, v9, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(JJ)J

    move-result-wide v7

    .line 66
    .local v7, "from":J
    sub-long v11, v4, v7

    long-to-int v11, v11

    new-array v11, v11, [B

    .local v11, "buf":[B
    invoke-virtual {v0, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    invoke-virtual {v0, v11}, Ljava/io/RandomAccessFile;->readFully([B)V

    new-instance v12, Ljava/lang/String;

    .line 67
    sget-object v13, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v12, v11, v13}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object v14, v12

    check-cast v14, Ljava/lang/CharSequence;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v12, 0x1

    :try_start_2
    new-array v15, v12, [C

    const/16 v13, 0xa

    const/16 v20, 0x0

    aput-char v13, v15, v20
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :try_start_3
    invoke-static/range {v14 .. v19}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    .local v14, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 88
    .local v15, "$i$f$map":I
    move-wide/from16 v16, v9

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v14, v13}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v14

    .local v10, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 89
    .local v13, "$i$f$mapTo":I
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 90
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v19

    check-cast v21, Ljava/lang/String;

    move-object/from16 v22, v21

    .local v22, "it":Ljava/lang/String;
    const/16 v21, 0x0

    .line 67
    .local v21, "$i$a$-map-GameSession$Companion$tail$1$lines$1":I
    move-object/from16 v23, v0

    .end local v0    # "r":Ljava/io/RandomAccessFile;
    .local v23, "r":Ljava/io/RandomAccessFile;
    new-array v0, v12, [C

    const/16 v24, 0xd

    aput-char v24, v0, v20

    move-object/from16 v12, v22

    .end local v22    # "it":Ljava/lang/String;
    .local v12, "it":Ljava/lang/String;
    invoke-static {v12, v0}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    .line 90
    .end local v12    # "it":Ljava/lang/String;
    .end local v21    # "$i$a$-map-GameSession$Companion$tail$1$lines$1":I
    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v23

    const/4 v12, 0x1

    goto :goto_0

    .line 91
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    .end local v23    # "r":Ljava/io/RandomAccessFile;
    .restart local v0    # "r":Ljava/io/RandomAccessFile;
    :cond_1
    move-object/from16 v23, v0

    .end local v0    # "r":Ljava/io/RandomAccessFile;
    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapTo":I
    .restart local v23    # "r":Ljava/io/RandomAccessFile;
    move-object v0, v9

    check-cast v0, Ljava/util/List;

    .line 88
    nop

    .line 67
    .end local v14    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$map":I
    nop

    .line 68
    .local v0, "lines":Ljava/util/List;
    cmp-long v9, v7, v16

    if-lez v9, :cond_2

    move-object v9, v0

    check-cast v9, Ljava/lang/Iterable;

    const/4 v10, 0x1

    invoke-static {v9, v10}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v9

    move-object v0, v9

    .line 69
    :cond_2
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_4

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-nez v9, :cond_3

    const/4 v9, 0x1

    goto :goto_1

    :cond_3
    move/from16 v9, v20

    :goto_1
    const/4 v10, 0x1

    if-ne v9, v10, :cond_4

    const/16 v20, 0x1

    :cond_4
    if-eqz v20, :cond_5

    const/4 v10, 0x1

    invoke-static {v0, v10}, Lkotlin/collections/CollectionsKt;->dropLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v9
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v0, v9

    .line 70
    :cond_5
    move/from16 v9, p2

    :try_start_4
    invoke-static {v0, v9}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    .end local v0    # "lines":Ljava/util/List;
    .end local v3    # "$i$a$-use-GameSession$Companion$tail$1":I
    .end local v4    # "len":J
    .end local v7    # "from":J
    .end local v11    # "buf":[B
    .end local v23    # "r":Ljava/io/RandomAccessFile;
    const/4 v0, 0x0

    invoke-static {v2, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v10

    :catchall_0
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    :goto_2
    move/from16 v9, p2

    goto :goto_3

    :catchall_3
    move-exception v0

    move/from16 v9, p2

    move/from16 v6, p3

    :goto_3
    move-object v3, v0

    .end local p1    # "f":Ljava/io/File;
    .end local p2    # "maxLines":I
    .end local p3    # "maxBytes":I
    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .restart local p1    # "f":Ljava/io/File;
    .restart local p2    # "maxLines":I
    .restart local p3    # "maxBytes":I
    :catchall_4
    move-exception v0

    invoke-static {v2, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method
