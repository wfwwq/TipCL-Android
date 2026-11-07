.class public final Lcom/pymcl/android/data/SaveImportData;
.super Ljava/lang/Object;
.source "SaveImportData.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveImportData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveImportData.kt\ncom/pymcl/android/data/SaveImportData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014J2\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014J(\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014R\u0019\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u00ca\u0001\u000c\u0008\u001b\u0012\u0008\u0008\u001c\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/android/data/SaveImportData;",
        "",
        "<init>",
        "()V",
        "ZIP_MIMES",
        "",
        "",
        "getZIP_MIMES",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "displayName",
        "ctx",
        "Landroid/content/Context;",
        "uri",
        "Landroid/net/Uri;",
        "importZip",
        "Lcom/pymcl/core/instance/SaveImport$Result;",
        "savesDir",
        "Ljava/io/File;",
        "cb",
        "Lcom/pymcl/android/data/SaveImportProgress$Cb;",
        "importTree",
        "treeUri",
        "limits",
        "Lcom/pymcl/core/instance/SaveImport$Limits;",
        "importAny",
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

.field public static final INSTANCE:Lcom/pymcl/android/data/SaveImportData;

.field private static final ZIP_MIMES:[Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$GRJ_sBZJEoW0xjKezywc6B7icZ8()Ljava/io/InputStream;
    .locals 1

    invoke-static {}, Lcom/pymcl/android/data/SaveImportData;->importTree$walk$lambda$1$0()Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$MkPcf312dzwqpBI7K2Xtk4cQMlw(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/SaveImportData;->importZip$lambda$0(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$T8VDVIlmjxi3LWfy2HIgt7mZ-gA(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/android/data/SaveImportData;->importTree$walk$lambda$1$1(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/data/SaveImportData;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveImportData;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SaveImportData;->INSTANCE:Lcom/pymcl/android/data/SaveImportData;

    .line 20
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "application/zip"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "application/x-zip-compressed"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "application/x-zip"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "application/octet-stream"

    aput-object v2, v0, v1

    sput-object v0, Lcom/pymcl/android/data/SaveImportData;->ZIP_MIMES:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic importAny$default(Lcom/pymcl/android/data/SaveImportData;Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 0

    .line 64
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const/4 p5, 0x3

    const/4 p6, 0x0

    invoke-direct {p4, p6, p6, p5, p6}, Lcom/pymcl/android/data/SaveImportProgress$Cb;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/SaveImportData;->importAny(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic importTree$default(Lcom/pymcl/android/data/SaveImportData;Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 6

    .line 35
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
    invoke-virtual/range {p0 .. p5}, Lcom/pymcl/android/data/SaveImportData;->importTree(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final importTree$walk(Landroid/net/Uri;Landroid/content/Context;Ljava/util/ArrayList;Lcom/pymcl/core/instance/SaveImport$Limits;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 18
    .param p0, "$treeUri"    # Landroid/net/Uri;
    .param p1, "$ctx"    # Landroid/content/Context;
    .param p2, "out"    # Ljava/util/ArrayList;
    .param p3, "$limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
    .param p4, "docId"    # Ljava/lang/String;
    .param p5, "prefix"    # Ljava/lang/String;
    .param p6, "depth"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/content/Context;",
            "Ljava/util/ArrayList<",
            "Lcom/pymcl/core/instance/SaveImport$TreeEntry;",
            ">;",
            "Lcom/pymcl/core/instance/SaveImport$Limits;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 41
    move-object/from16 v1, p0

    move-object/from16 v8, p5

    move/from16 v9, p6

    const/16 v0, 0x40

    if-gt v9, v0, :cond_7

    .line 42
    move-object/from16 v10, p4

    invoke-static {v1, v10}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    .line 44
    .local v3, "children":Landroid/net/Uri;
    nop

    .line 43
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v0, 0x3

    new-array v4, v0, [Ljava/lang/String;

    const-string v0, "document_id"

    const/4 v11, 0x0

    aput-object v0, v4, v11

    const-string v0, "_display_name"

    const/4 v12, 0x1

    aput-object v0, v4, v12

    .line 44
    const-string v0, "mime_type"

    const/4 v13, 0x2

    aput-object v0, v4, v13

    .line 43
    nop

    .line 44
    nop

    .line 43
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    .line 44
    move-object v14, v3

    .end local v3    # "children":Landroid/net/Uri;
    .local v14, "children":Landroid/net/Uri;
    if-eqz v0, :cond_6

    .line 43
    move-object v15, v0

    check-cast v15, Ljava/io/Closeable;

    .line 44
    :try_start_0
    move-object v0, v15

    check-cast v0, Landroid/database/Cursor;

    .local v0, "c\\1":Landroid/database/Cursor;
    const/4 v2, 0x0

    move/from16 v16, v2

    .line 45
    .local v16, "$i$a$-use-SaveImportData$importTree$walk$1\\1\\44\\0":I
    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 46
    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .local v5, "id\\1":Ljava/lang/String;
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    .local v2, "name\\1":Ljava/lang/String;
    :cond_0
    invoke-interface {v0, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 47
    .local v3, "mime\\1":Ljava/lang/String;
    move-object v4, v8

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_1

    move v4, v12

    goto :goto_1

    :cond_1
    move v4, v11

    :goto_1
    if-eqz v4, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, "/"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v6, v4

    .line 48
    .local v6, "path\\1":Ljava/lang/String;
    :goto_2
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v7

    if-gt v4, v7, :cond_4

    .line 49
    const-string v4, "vnd.android.document/directory"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 50
    move-object/from16 v4, p2

    check-cast v4, Ljava/util/Collection;

    new-instance v7, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    new-instance v13, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda0;

    invoke-direct {v13}, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda0;-><init>()V

    invoke-direct {v7, v6, v12, v13}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 51
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    add-int/lit8 v7, v9, 0x1

    move-object/from16 v4, p3

    move-object v13, v2

    move-object/from16 v17, v3

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .end local v2    # "name\\1":Ljava/lang/String;
    .end local v3    # "mime\\1":Ljava/lang/String;
    .local v13, "name\\1":Ljava/lang/String;
    .local v17, "mime\\1":Ljava/lang/String;
    invoke-static/range {v1 .. v7}, Lcom/pymcl/android/data/SaveImportData;->importTree$walk(Landroid/net/Uri;Landroid/content/Context;Ljava/util/ArrayList;Lcom/pymcl/core/instance/SaveImport$Limits;Ljava/lang/String;Ljava/lang/String;I)V

    const/4 v13, 0x2

    goto :goto_0

    .line 53
    .end local v13    # "name\\1":Ljava/lang/String;
    .end local v17    # "mime\\1":Ljava/lang/String;
    .restart local v2    # "name\\1":Ljava/lang/String;
    .restart local v3    # "mime\\1":Ljava/lang/String;
    :cond_3
    move-object v13, v2

    move-object/from16 v17, v3

    .end local v2    # "name\\1":Ljava/lang/String;
    .end local v3    # "mime\\1":Ljava/lang/String;
    .restart local v13    # "name\\1":Ljava/lang/String;
    .restart local v17    # "mime\\1":Ljava/lang/String;
    invoke-static {v1, v5}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 54
    .local v2, "doc\\1":Landroid/net/Uri;
    move-object/from16 v3, p2

    check-cast v3, Ljava/util/Collection;

    new-instance v4, Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    new-instance v7, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda1;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v12, p1

    :try_start_1
    invoke-direct {v7, v12, v2, v6}, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda1;-><init>(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V

    invoke-direct {v4, v6, v11, v7}, Lcom/pymcl/core/instance/SaveImport$TreeEntry;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x1

    const/4 v13, 0x2

    goto/16 :goto_0

    .line 48
    .end local v13    # "name\\1":Ljava/lang/String;
    .end local v17    # "mime\\1":Ljava/lang/String;
    .local v2, "name\\1":Ljava/lang/String;
    .restart local v3    # "mime\\1":Ljava/lang/String;
    :cond_4
    move-object/from16 v12, p1

    move-object v13, v2

    move-object/from16 v17, v3

    .end local v2    # "name\\1":Ljava/lang/String;
    .end local v3    # "mime\\1":Ljava/lang/String;
    .restart local v13    # "name\\1":Ljava/lang/String;
    .restart local v17    # "mime\\1":Ljava/lang/String;
    new-instance v2, Ljava/io/IOException;

    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/instance/SaveImport$Limits;->getMaxEntries()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u6587\u4ef6\u8fc7\u591a\uff08>"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\uff09"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v14    # "children":Landroid/net/Uri;
    .end local p0    # "$treeUri":Landroid/net/Uri;
    .end local p1    # "$ctx":Landroid/content/Context;
    .end local p2    # "out":Ljava/util/ArrayList;
    .end local p3    # "$limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p4    # "docId":Ljava/lang/String;
    .end local p5    # "prefix":Ljava/lang/String;
    .end local p6    # "depth":I
    throw v2

    .line 57
    .end local v5    # "id\\1":Ljava/lang/String;
    .end local v6    # "path\\1":Ljava/lang/String;
    .end local v13    # "name\\1":Ljava/lang/String;
    .end local v17    # "mime\\1":Ljava/lang/String;
    .restart local v14    # "children":Landroid/net/Uri;
    .restart local p0    # "$treeUri":Landroid/net/Uri;
    .restart local p1    # "$ctx":Landroid/content/Context;
    .restart local p2    # "out":Ljava/util/ArrayList;
    .restart local p3    # "$limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p4    # "docId":Ljava/lang/String;
    .restart local p5    # "prefix":Ljava/lang/String;
    .restart local p6    # "depth":I
    :cond_5
    move-object/from16 v12, p1

    .end local v0    # "c\\1":Landroid/database/Cursor;
    .end local v16    # "$i$a$-use-SaveImportData$importTree$walk$1\\1\\44\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    const/4 v0, 0x0

    invoke-static {v15, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object/from16 v12, p1

    :goto_3
    move-object v2, v0

    .end local v14    # "children":Landroid/net/Uri;
    .end local p0    # "$treeUri":Landroid/net/Uri;
    .end local p1    # "$ctx":Landroid/content/Context;
    .end local p2    # "out":Ljava/util/ArrayList;
    .end local p3    # "$limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .end local p4    # "docId":Ljava/lang/String;
    .end local p5    # "prefix":Ljava/lang/String;
    .end local p6    # "depth":I
    :try_start_2
    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .restart local v14    # "children":Landroid/net/Uri;
    .restart local p0    # "$treeUri":Landroid/net/Uri;
    .restart local p1    # "$ctx":Landroid/content/Context;
    .restart local p2    # "out":Ljava/util/ArrayList;
    .restart local p3    # "$limits":Lcom/pymcl/core/instance/SaveImport$Limits;
    .restart local p4    # "docId":Ljava/lang/String;
    .restart local p5    # "prefix":Ljava/lang/String;
    .restart local p6    # "depth":I
    :catchall_2
    move-exception v0

    invoke-static {v15, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    move-object/from16 v12, p1

    .line 58
    :goto_4
    return-void

    .line 41
    .end local v14    # "children":Landroid/net/Uri;
    :cond_7
    move-object/from16 v12, p1

    move-object/from16 v10, p4

    new-instance v0, Ljava/io/IOException;

    const-string v2, "\u6587\u4ef6\u5939\u5c42\u7ea7\u592a\u6df1"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final importTree$walk$lambda$1$0()Ljava/io/InputStream;
    .locals 2

    .line 50
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u76ee\u5f55"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final importTree$walk$lambda$1$1(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/io/InputStream;
    .locals 3
    .param p0, "$ctx"    # Landroid/content/Context;
    .param p1, "$doc"    # Landroid/net/Uri;
    .param p2, "$path"    # Ljava/lang/String;

    .line 54
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6253\u4e0d\u5f00 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic importZip$default(Lcom/pymcl/android/data/SaveImportData;Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 0

    .line 29
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance p4, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const/4 p5, 0x3

    const/4 p6, 0x0

    invoke-direct {p4, p6, p6, p5, p6}, Lcom/pymcl/android/data/SaveImportProgress$Cb;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/SaveImportData;->importZip(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p0

    return-object p0
.end method

.method private static final importZip$lambda$0(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;
    .locals 2
    .param p0, "$ctx"    # Landroid/content/Context;
    .param p1, "$uri"    # Landroid/net/Uri;

    .line 31
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "\u6253\u4e0d\u5f00\u6240\u9009\u6587\u4ef6"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final displayName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 11
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "uri"    # Landroid/net/Uri;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    const/4 v1, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/SaveImportData;

    move-object v2, v0

    .local v2, "$this$displayName_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveImportData;
    const/4 v3, 0x0

    .line 23
    .local v3, "$i$a$-runCatching-SaveImportData$displayName$1\\1\\22\\0":I
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    const-string v0, "_display_name"

    const/4 v10, 0x0

    aput-object v0, v6, v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v5, p2

    .end local p2    # "uri":Landroid/net/Uri;
    .local v5, "uri":Landroid/net/Uri;
    :try_start_1
    invoke-virtual/range {v4 .. v9}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    if-eqz p2, :cond_1

    check-cast p2, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    move-object v0, p2

    check-cast v0, Landroid/database/Cursor;

    .local v0, "c\\2":Landroid/database/Cursor;
    const/4 v4, 0x0

    .line 24
    .local v4, "$i$a$-use-SaveImportData$displayName$1$1\\2\\23\\1":I
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :cond_0
    move-object v6, v1

    .line 23
    .end local v0    # "c\\2":Landroid/database/Cursor;
    .end local v4    # "$i$a$-use-SaveImportData$displayName$1$1\\2\\23\\1":I
    :goto_0
    :try_start_3
    invoke-static {p2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object v4, v0

    .end local v2    # "$this$displayName_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveImportData;
    .end local v3    # "$i$a$-runCatching-SaveImportData$displayName$1\\1\\22\\0":I
    .end local v5    # "uri":Landroid/net/Uri;
    .end local p1    # "ctx":Landroid/content/Context;
    :try_start_4
    throw v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .restart local v2    # "$this$displayName_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveImportData;
    .restart local v3    # "$i$a$-runCatching-SaveImportData$displayName$1\\1\\22\\0":I
    .restart local v5    # "uri":Landroid/net/Uri;
    .restart local p1    # "ctx":Landroid/content/Context;
    :catchall_1
    move-exception v0

    :try_start_5
    invoke-static {p2, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v5    # "uri":Landroid/net/Uri;
    .end local p1    # "ctx":Landroid/content/Context;
    throw v0

    .restart local v5    # "uri":Landroid/net/Uri;
    .restart local p1    # "ctx":Landroid/content/Context;
    :cond_1
    move-object v6, v1

    .line 25
    :goto_1
    nop

    .line 22
    .end local v2    # "$this$displayName_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveImportData;
    .end local v3    # "$i$a$-runCatching-SaveImportData$displayName$1\\1\\22\\0":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object p2, v0

    goto :goto_2

    .end local v5    # "uri":Landroid/net/Uri;
    .restart local p2    # "uri":Landroid/net/Uri;
    :catchall_3
    move-exception v0

    move-object v5, p2

    move-object p2, v0

    .end local p2    # "uri":Landroid/net/Uri;
    .restart local v5    # "uri":Landroid/net/Uri;
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 26
    :goto_3
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object p2, v1

    :cond_2
    check-cast p2, Ljava/lang/String;

    .line 22
    if-nez p2, :cond_3

    .line 26
    invoke-virtual {v5}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    const/16 v0, 0x2f

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2, v1}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    .line 22
    :cond_3
    move-object v1, p2

    .line 26
    :cond_4
    :goto_4
    return-object v1
.end method

.method public final getZIP_MIMES()[Ljava/lang/String;
    .locals 1

    .line 20
    sget-object v0, Lcom/pymcl/android/data/SaveImportData;->ZIP_MIMES:[Ljava/lang/String;

    return-object v0
.end method

.method public final importAny(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 9
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "savesDir"    # Ljava/io/File;
    .param p3, "uri"    # Landroid/net/Uri;
    .param p4, "cb"    # Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savesDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cb"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-static {p3}, Landroid/provider/DocumentsContract;->isTreeUri(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .end local p1    # "ctx":Landroid/content/Context;
    .end local p2    # "savesDir":Ljava/io/File;
    .end local p3    # "uri":Landroid/net/Uri;
    .end local p4    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .local v2, "ctx":Landroid/content/Context;
    .local v3, "savesDir":Ljava/io/File;
    .local v4, "uri":Landroid/net/Uri;
    .local v6, "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    invoke-static/range {v1 .. v8}, Lcom/pymcl/android/data/SaveImportData;->importTree$default(Lcom/pymcl/android/data/SaveImportData;Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p1

    goto :goto_0

    .end local v2    # "ctx":Landroid/content/Context;
    .end local v3    # "savesDir":Ljava/io/File;
    .end local v4    # "uri":Landroid/net/Uri;
    .end local v6    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .restart local p1    # "ctx":Landroid/content/Context;
    .restart local p2    # "savesDir":Ljava/io/File;
    .restart local p3    # "uri":Landroid/net/Uri;
    .restart local p4    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    :cond_0
    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .end local p1    # "ctx":Landroid/content/Context;
    .end local p2    # "savesDir":Ljava/io/File;
    .end local p3    # "uri":Landroid/net/Uri;
    .end local p4    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .restart local v2    # "ctx":Landroid/content/Context;
    .restart local v3    # "savesDir":Ljava/io/File;
    .restart local v4    # "uri":Landroid/net/Uri;
    .restart local v6    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    invoke-virtual {p0, v2, v3, v4, v6}, Lcom/pymcl/android/data/SaveImportData;->importZip(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final importTree(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 11
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "savesDir"    # Ljava/io/File;
    .param p3, "treeUri"    # Landroid/net/Uri;
    .param p4, "limits"    # Lcom/pymcl/core/instance/SaveImport$Limits;
    .param p5, "cb"    # Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const-string v2, "ctx"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "savesDir"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "treeUri"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "limits"

    move-object v3, p4

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "cb"

    move-object/from16 v8, p5

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-static {p3}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v4

    .line 37
    .local v4, "rootId":Ljava/lang/String;
    invoke-static {p3, v4}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    .line 38
    .local v9, "rootDoc":Landroid/net/Uri;
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, v9}, Lcom/pymcl/android/data/SaveImportData;->displayName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/16 v2, 0x3a

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v4, v2, v5, v6, v5}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v10, 0x2f

    invoke-static {v2, v10, v5, v6, v5}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    .line 78
    const/4 v2, 0x0

    .line 38
    .local v2, "$i$a$-ifEmpty-SaveImportData$importTree$folderName$1\\1\\38\\0":I
    nop

    .end local v2    # "$i$a$-ifEmpty-SaveImportData$importTree$folderName$1\\1\\38\\0":I
    const-string v2, "world"

    :cond_1
    check-cast v2, Ljava/lang/String;

    :cond_2
    move-object v5, v2

    move-object v10, v5

    .line 39
    .local v10, "folderName":Ljava/lang/String;
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .local v2, "out":Ljava/util/ArrayList;
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v5, ""

    const/4 v6, 0x0

    move-object v1, p1

    move-object v0, p3

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/data/SaveImportData;->importTree$walk(Landroid/net/Uri;Landroid/content/Context;Ljava/util/ArrayList;Lcom/pymcl/core/instance/SaveImport$Limits;Ljava/lang/String;Ljava/lang/String;I)V

    .line 60
    move-object v0, v4

    .end local v4    # "rootId":Ljava/lang/String;
    .local v0, "rootId":Ljava/lang/String;
    sget-object v3, Lcom/pymcl/android/data/SaveImportProgress;->INSTANCE:Lcom/pymcl/android/data/SaveImportProgress;

    move-object v6, v2

    check-cast v6, Ljava/util/List;

    move-object v4, p2

    move-object v7, p4

    move-object v5, v10

    .end local v10    # "folderName":Ljava/lang/String;
    .local v5, "folderName":Ljava/lang/String;
    invoke-virtual/range {v3 .. v8}, Lcom/pymcl/android/data/SaveImportProgress;->importTree(Ljava/io/File;Ljava/lang/String;Ljava/util/List;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object v1

    return-object v1
.end method

.method public final importZip(Landroid/content/Context;Ljava/io/File;Landroid/net/Uri;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;
    .locals 9
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "savesDir"    # Ljava/io/File;
    .param p3, "uri"    # Landroid/net/Uri;
    .param p4, "cb"    # Lcom/pymcl/android/data/SaveImportProgress$Cb;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savesDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cb"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-virtual {p0, p1, p3}, Lcom/pymcl/android/data/SaveImportData;->displayName(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "world.zip"

    :cond_0
    move-object v3, v0

    .line 31
    .local v3, "name":Ljava/lang/String;
    sget-object v1, Lcom/pymcl/android/data/SaveImportProgress;->INSTANCE:Lcom/pymcl/android/data/SaveImportProgress;

    new-instance v4, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda2;

    invoke-direct {v4, p1, p3}, Lcom/pymcl/android/data/SaveImportData$$ExternalSyntheticLambda2;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p2

    move-object v6, p4

    .end local p2    # "savesDir":Ljava/io/File;
    .end local p4    # "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    .local v2, "savesDir":Ljava/io/File;
    .local v6, "cb":Lcom/pymcl/android/data/SaveImportProgress$Cb;
    invoke-static/range {v1 .. v8}, Lcom/pymcl/android/data/SaveImportProgress;->importZip$default(Lcom/pymcl/android/data/SaveImportProgress;Ljava/io/File;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/pymcl/core/instance/SaveImport$Limits;Lcom/pymcl/android/data/SaveImportProgress$Cb;ILjava/lang/Object;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p2

    return-object p2
.end method
