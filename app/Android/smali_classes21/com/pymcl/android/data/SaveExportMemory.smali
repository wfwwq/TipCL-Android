.class public final Lcom/pymcl/android/data/SaveExportMemory;
.super Ljava/lang/Object;
.source "SaveExportMemory.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaveExportMemory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveExportMemory.kt\ncom/pymcl/android/data/SaveExportMemory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,46:1\n1#2:47\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005J\u001a\u0010\u000c\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000e\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u0008J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\u0013\u0012\u0008\u0008\u0014\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/pymcl/android/data/SaveExportMemory;",
        "",
        "<init>",
        "()V",
        "KEY_REMEMBER",
        "",
        "KEY_LAST_URI",
        "REMEMBER_DEFAULT",
        "",
        "initialUri",
        "remember",
        "last",
        "toStore",
        "resultUri",
        "keepLastAfterToggle",
        "on",
        "label",
        "uri",
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
.field public static final $stable:I = 0x0

.field public static final INSTANCE:Lcom/pymcl/android/data/SaveExportMemory;

.field public static final KEY_LAST_URI:Ljava/lang/String; = "saves_export_last_uri"

.field public static final KEY_REMEMBER:Ljava/lang/String; = "saves_remember_export_dir"

.field public static final REMEMBER_DEFAULT:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/SaveExportMemory;

    invoke-direct {v0}, Lcom/pymcl/android/data/SaveExportMemory;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/SaveExportMemory;->INSTANCE:Lcom/pymcl/android/data/SaveExportMemory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final initialUri(ZLjava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "remember"    # Z
    .param p2, "last"    # Ljava/lang/String;

    .line 19
    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    goto :goto_0

    :cond_1
    if-eqz p2, :cond_0

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, v1

    .line 47
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 19
    .local v3, "$i$a$-takeIf-SaveExportMemory$initialUri$1\\1\\19\\0":I
    const-string v4, "content://"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {v2, v4, v6, v5, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v5, 0xa

    if-le v4, v5, :cond_2

    const/4 v6, 0x1

    .end local v2    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-SaveExportMemory$initialUri$1\\1\\19\\0":I
    :cond_2
    if-eqz v6, :cond_0

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public final keepLastAfterToggle(Z)Z
    .locals 0
    .param p1, "on"    # Z

    .line 25
    return p1
.end method

.method public final label(Ljava/lang/String;)Ljava/lang/String;
    .locals 14
    .param p1, "uri"    # Ljava/lang/String;

    .line 33
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    const/4 v3, 0x0

    if-nez v0, :cond_e

    const-string v0, "content://"

    const/4 v4, 0x2

    invoke-static {p1, v0, v2, v4, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_7

    .line 34
    :cond_2
    const-string v0, "/document/"

    const-string v5, ""

    invoke-static {p1, v0, v5}, Lkotlin/text/StringsKt;->substringAfter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v6, 0x3f

    invoke-static {v0, v6, v3, v4, v3}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 35
    .local v7, "seg":Ljava/lang/String;
    move-object v0, v7

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    move v0, v2

    :goto_2
    if-eqz v0, :cond_4

    return-object v3

    .line 36
    :cond_4
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/SaveExportMemory;

    .line 47
    .local v0, "$this$label_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveExportMemory;
    const/4 v6, 0x0

    .line 36
    .local v6, "$i$a$-runCatching-SaveExportMemory$label$docId$1\\1\\36\\0":I
    const-string v8, "+"

    const-string v9, "%2B"

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "UTF-8"

    invoke-static {v8, v9}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .end local v0    # "$this$label_u24lambda_u240\\1":Lcom/pymcl/android/data/SaveExportMemory;
    .end local v6    # "$i$a$-runCatching-SaveExportMemory$label$docId$1\\1\\36\\0":I
    invoke-static {v8}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move-object v0, v3

    :cond_5
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6

    return-object v3

    .line 37
    .local v0, "docId":Ljava/lang/String;
    :cond_6
    move-object v8, v0

    check-cast v8, Ljava/lang/CharSequence;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/16 v9, 0x3a

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v6

    .line 38
    .local v6, "colon":I
    if-gtz v6, :cond_7

    return-object v3

    .line 39
    :cond_7
    invoke-virtual {v0, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    const-string v9, "substring(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v8, "volume":Ljava/lang/String;
    add-int/lit8 v10, v6, 0x1

    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-array v9, v1, [C

    const/16 v11, 0x2f

    aput-char v11, v9, v2

    invoke-static {v10, v9}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v9

    .line 41
    .local v9, "path":Ljava/lang/String;
    move-object v10, v9

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v10, v11, v2, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-static {v9, v11, v3, v4, v3}, Lkotlin/text/StringsKt;->substringBeforeLast$default(Ljava/lang/String;CLjava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 42
    .local v5, "dir":Ljava/lang/String;
    :cond_8
    move-object v3, v5

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_9

    move v4, v1

    goto :goto_4

    :cond_9
    move v4, v2

    :goto_4
    const-string v10, "/"

    if-eqz v4, :cond_a

    .line 47
    const/4 v3, 0x0

    .line 42
    .local v3, "$i$a$-ifEmpty-SaveExportMemory$label$shown$1\\2\\42\\0":I
    move-object v3, v10

    .end local v3    # "$i$a$-ifEmpty-SaveExportMemory$label$shown$1\\2\\42\\0":I
    :cond_a
    check-cast v3, Ljava/lang/String;

    .line 43
    .local v3, "shown":Ljava/lang/String;
    const-string v4, "primary"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move-object v4, v3

    goto :goto_6

    :cond_b
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v10, v1, [C

    aput-char v11, v10, v2

    invoke-static {v4, v10}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_c

    goto :goto_5

    :cond_c
    move v1, v2

    :goto_5
    if-eqz v1, :cond_d

    .line 47
    const/4 v1, 0x0

    .line 43
    .local v1, "$i$a$-ifEmpty-SaveExportMemory$label$1\\3\\43\\0":I
    move-object v4, v8

    .end local v1    # "$i$a$-ifEmpty-SaveExportMemory$label$1\\3\\43\\0":I
    :cond_d
    check-cast v4, Ljava/lang/String;

    :goto_6
    return-object v4

    .line 33
    .end local v0    # "docId":Ljava/lang/String;
    .end local v3    # "shown":Ljava/lang/String;
    .end local v5    # "dir":Ljava/lang/String;
    .end local v6    # "colon":I
    .end local v7    # "seg":Ljava/lang/String;
    .end local v8    # "volume":Ljava/lang/String;
    .end local v9    # "path":Ljava/lang/String;
    :cond_e
    :goto_7
    return-object v3
.end method

.method public final toStore(ZLjava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "remember"    # Z
    .param p2, "resultUri"    # Ljava/lang/String;

    .line 22
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    move-object v1, p2

    .line 47
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 22
    .local v2, "$i$a$-takeIf-SaveExportMemory$toStore$1\\1\\22\\0":I
    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "content://"

    invoke-static {v1, v5, v3, v4, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-SaveExportMemory$toStore$1\\1\\22\\0":I
    if-eqz v1, :cond_0

    move-object v0, p2

    :cond_0
    return-object v0
.end method
