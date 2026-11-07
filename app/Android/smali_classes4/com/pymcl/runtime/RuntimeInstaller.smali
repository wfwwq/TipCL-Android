.class public final Lcom/pymcl/runtime/RuntimeInstaller;
.super Ljava/lang/Object;
.source "RuntimeInstaller.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRuntimeInstaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeInstaller.kt\ncom/pymcl/runtime/RuntimeInstaller\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,172:1\n1228#2,2:173\n1#3:175\n1#3:187\n1795#4,10:176\n2068#4:186\n2069#4:188\n1805#4:189\n18#5:190\n*S KotlinDebug\n*F\n+ 1 RuntimeInstaller.kt\ncom/pymcl/runtime/RuntimeInstaller\n*L\n21#1:173,2\n47#1:187\n47#1:176,10\n47#1:186\n47#1:188\n47#1:189\n69#1:190\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J$\u0010\u0008\u001a\u00020\t2\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u000bH\u0086@\u00a2\u0006\u0002\u0010\u000cJ\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0010\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0002J\u0018\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001c\u001a\u00020\u0015H\u0002J\u0018\u0010\'\u001a\u00020\t2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"
    }
    d2 = {
        "Lcom/pymcl/runtime/RuntimeInstaller;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "abi",
        "",
        "installAll",
        "",
        "onStage",
        "Lkotlin/Function1;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installPlugins",
        "dnsServers",
        "",
        "isJavaInstalled",
        "",
        "major",
        "",
        "javaDir",
        "Ljava/io/File;",
        "assetText",
        "path",
        "copyComponent",
        "name",
        "copyAssetTree",
        "src",
        "dest",
        "installBundledJava",
        "downloadJava",
        "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "open",
        "Ljava/net/HttpURLConnection;",
        "url",
        "httpText",
        "downloadVerified",
        "spec",
        "Lcom/pymcl/runtime/JavaDownloadFile;",
        "untarXz",
        "input",
        "Ljava/io/InputStream;",
        "target",
        "patchJava",
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


# instance fields
.field private final abi:Ljava/lang/String;

.field private final context:Landroid/content/Context;


# direct methods
.method public static synthetic $r8$lambda$Cz09XK4U3vv_1IW0NPyLHmghYIQ(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/RuntimeInstaller;->installAll$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TJcLCPB8MePJHsykPQX9ek0Nry8(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/RuntimeInstaller;->installPlugins$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    .line 21
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    const-string v1, "SUPPORTED_ABIS"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, [Ljava/lang/Object;

    .local v0, "$this$first$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 173
    .local v1, "$i$f$first":I
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    aget-object v5, v0, v4

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .local v6, "it":Ljava/lang/String;
    const/4 v7, 0x0

    .line 21
    .local v7, "$i$a$-first-RuntimeInstaller$abi$1":I
    const-string v8, "arm64-v8a"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    const-string v8, "x86_64"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    move v8, v3

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v8, 0x1

    .line 173
    .end local v6    # "it":Ljava/lang/String;
    .end local v7    # "$i$a$-first-RuntimeInstaller$abi$1":I
    :goto_2
    if-eqz v8, :cond_2

    .line 21
    .end local v0    # "$this$first$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$first":I
    .end local v5    # "element$iv":Ljava/lang/Object;
    const-string v0, "first(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, v5

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller;->abi:Ljava/lang/String;

    .line 20
    return-void

    .line 173
    .restart local v0    # "$this$first$iv":[Ljava/lang/Object;
    .restart local v1    # "$i$f$first":I
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 174
    :cond_3
    new-instance v2, Ljava/util/NoSuchElementException;

    const-string v3, "Array contains no element matching the predicate."

    invoke-direct {v2, v3}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public static final synthetic access$copyComponent(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "name"    # Ljava/lang/String;

    .line 20
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->copyComponent(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$downloadVerified(Lcom/pymcl/runtime/RuntimeInstaller;Lcom/pymcl/runtime/JavaDownloadFile;Ljava/io/File;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "spec"    # Lcom/pymcl/runtime/JavaDownloadFile;
    .param p2, "dest"    # Ljava/io/File;

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller;->downloadVerified(Lcom/pymcl/runtime/JavaDownloadFile;Ljava/io/File;)V

    return-void
.end method

.method public static final synthetic access$getAbi$p(Lcom/pymcl/runtime/RuntimeInstaller;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;

    .line 20
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller;->abi:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic access$getContext$p(Lcom/pymcl/runtime/RuntimeInstaller;)Landroid/content/Context;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;

    .line 20
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    return-object v0
.end method

.method public static final synthetic access$httpText(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "url"    # Ljava/lang/String;

    .line 20
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->httpText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$installBundledJava(Lcom/pymcl/runtime/RuntimeInstaller;I)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "major"    # I

    .line 20
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->installBundledJava(I)V

    return-void
.end method

.method public static final synthetic access$javaDir(Lcom/pymcl/runtime/RuntimeInstaller;I)Ljava/io/File;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "major"    # I

    .line 20
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->javaDir(I)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$patchJava(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/io/File;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "target"    # Ljava/io/File;

    .line 20
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->patchJava(Ljava/io/File;)V

    return-void
.end method

.method public static final synthetic access$untarXz(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/io/InputStream;Ljava/io/File;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/runtime/RuntimeInstaller;
    .param p1, "input"    # Ljava/io/InputStream;
    .param p2, "target"    # Ljava/io/File;

    .line 20
    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller;->untarXz(Ljava/io/InputStream;Ljava/io/File;)V

    return-void
.end method

.method private final assetText(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "path"    # Ljava/lang/String;

    .line 57
    const/4 v0, 0x0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/runtime/RuntimeInstaller;

    .line 175
    .local v1, "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    const/4 v2, 0x0

    .line 57
    .local v2, "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    iget-object v3, v1, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    check-cast v3, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v4, v3

    check-cast v4, Ljava/io/InputStream;

    .line 175
    .local v4, "it":Ljava/io/InputStream;
    const/4 v5, 0x0

    .line 57
    .local v5, "$i$a$-use-RuntimeInstaller$assetText$1$1":I
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v6

    invoke-static {v6}, Lkotlin/text/StringsKt;->decodeToString([B)Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v4    # "it":Ljava/io/InputStream;
    .end local v5    # "$i$a$-use-RuntimeInstaller$assetText$1$1":I
    :try_start_2
    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v1    # "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v2    # "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .restart local v1    # "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v2    # "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    :catchall_0
    move-exception v4

    .end local v1    # "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v2    # "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    .end local p1    # "path":Ljava/lang/String;
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v1    # "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v2    # "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    .restart local p1    # "path":Ljava/lang/String;
    :catchall_1
    move-exception v5

    :try_start_4
    invoke-static {v3, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "path":Ljava/lang/String;
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v1    # "$this$assetText_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v2    # "$i$a$-runCatching-RuntimeInstaller$assetText$1":I
    .restart local p1    # "path":Ljava/lang/String;
    :catchall_2
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final copyAssetTree(Ljava/lang/String;Ljava/io/File;)V
    .locals 11
    .param p1, "src"    # Ljava/lang/String;
    .param p2, "dest"    # Ljava/io/File;

    .line 69
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .local v0, "$this$orEmpty$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 190
    .local v1, "$i$f$orEmpty":I
    const/4 v2, 0x0

    if-nez v0, :cond_0

    new-array v3, v2, [Ljava/lang/String;

    move-object v0, v3

    .line 69
    .end local v0    # "$this$orEmpty$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$orEmpty":I
    :cond_0
    nop

    .line 70
    .local v0, "children":[Ljava/lang/String;
    array-length v1, v0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    if-eqz v1, :cond_3

    .line 71
    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 72
    :cond_2
    iget-object v1, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v3, v1

    check-cast v3, Ljava/io/InputStream;

    .line 175
    .local v3, "input":Ljava/io/InputStream;
    const/4 v4, 0x0

    .local v4, "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    new-instance v5, Ljava/io/FileOutputStream;

    .line 72
    invoke-direct {v5, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v5, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v6, v5

    check-cast v6, Ljava/io/FileOutputStream;

    .line 175
    .local v6, "it":Ljava/io/FileOutputStream;
    const/4 v7, 0x0

    .line 72
    .local v7, "$i$a$-use-RuntimeInstaller$copyAssetTree$1$1":I
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, v6

    check-cast v8, Ljava/io/OutputStream;

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static {v3, v8, v2, v9, v10}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v6    # "it":Ljava/io/FileOutputStream;
    .end local v7    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1$1":I
    :try_start_2
    invoke-static {v5, v10}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .end local v3    # "input":Ljava/io/InputStream;
    .end local v4    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    invoke-static {v1, v10}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 73
    return-void

    .line 72
    .restart local v3    # "input":Ljava/io/InputStream;
    .restart local v4    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    :catchall_0
    move-exception v2

    .end local v0    # "children":[Ljava/lang/String;
    .end local v3    # "input":Ljava/io/InputStream;
    .end local v4    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    .end local p1    # "src":Ljava/lang/String;
    .end local p2    # "dest":Ljava/io/File;
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v0    # "children":[Ljava/lang/String;
    .restart local v3    # "input":Ljava/io/InputStream;
    .restart local v4    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    .restart local p1    # "src":Ljava/lang/String;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_1
    move-exception v6

    :try_start_4
    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "children":[Ljava/lang/String;
    .end local p1    # "src":Ljava/lang/String;
    .end local p2    # "dest":Ljava/io/File;
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v3    # "input":Ljava/io/InputStream;
    .end local v4    # "$i$a$-use-RuntimeInstaller$copyAssetTree$1":I
    .restart local v0    # "children":[Ljava/lang/String;
    .restart local p1    # "src":Ljava/lang/String;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_2
    move-exception v2

    .end local v0    # "children":[Ljava/lang/String;
    .end local p1    # "src":Ljava/lang/String;
    .end local p2    # "dest":Ljava/io/File;
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .restart local v0    # "children":[Ljava/lang/String;
    .restart local p1    # "src":Ljava/lang/String;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_3
    move-exception v3

    invoke-static {v1, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    .line 75
    :cond_3
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z

    .line 76
    array-length v1, v0

    :goto_1
    if-ge v2, v1, :cond_4

    aget-object v3, v0, v2

    .local v3, "c":Ljava/lang/String;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v4, v5}, Lcom/pymcl/runtime/RuntimeInstaller;->copyAssetTree(Ljava/lang/String;Ljava/io/File;)V

    .end local v3    # "c":Ljava/lang/String;
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 77
    :cond_4
    return-void
.end method

.method private final copyComponent(Ljava/lang/String;)V
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app_runtime/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 61
    .local v0, "src":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->RUNTIME_DIR:Ljava/lang/String;

    invoke-direct {v1, v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .local v1, "dest":Ljava/io/File;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/version"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/pymcl/runtime/RuntimeInstaller;->assetText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 63
    .local v2, "version":Ljava/lang/String;
    if-eqz v2, :cond_2

    new-instance v3, Ljava/io/File;

    const-string v4, "version"

    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v4, v3

    .line 175
    .local v4, "it":Ljava/io/File;
    const/4 v5, 0x0

    .line 63
    .local v5, "$i$a$-takeIf-RuntimeInstaller$copyComponent$1":I
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    .end local v4    # "it":Ljava/io/File;
    .end local v5    # "$i$a$-takeIf-RuntimeInstaller$copyComponent$1":I
    const/4 v5, 0x0

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    if-eqz v3, :cond_1

    const/4 v4, 0x1

    invoke-static {v3, v5, v4, v5}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_1
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    return-void

    .line 64
    :cond_2
    invoke-static {v1}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 65
    invoke-direct {p0, v0, v1}, Lcom/pymcl/runtime/RuntimeInstaller;->copyAssetTree(Ljava/lang/String;Ljava/io/File;)V

    .line 66
    return-void
.end method

.method private final dnsServers()Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 45
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller;

    .local v0, "$this$dnsServers_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    const/4 v1, 0x0

    .line 46
    .local v1, "$i$a$-runCatching-RuntimeInstaller$dnsServers$sys$1":I
    iget-object v2, v0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    const-class v3, Landroid/net/ConnectivityManager;

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 47
    .local v2, "cm":Landroid/net/ConnectivityManager;
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/net/ConnectivityManager;->getLinkProperties(Landroid/net/Network;)Landroid/net/LinkProperties;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/net/LinkProperties;->getDnsServers()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 176
    .local v4, "$i$f$mapNotNull":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 185
    .local v7, "$i$f$mapNotNullTo":I
    move-object v8, v6

    .local v8, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 186
    .local v9, "$i$f$forEach":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .local v11, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v12, v11

    .local v12, "element$iv$iv":Ljava/lang/Object;
    const/4 v13, 0x0

    .line 185
    .local v13, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v14, v12

    check-cast v14, Ljava/net/InetAddress;

    .local v14, "it":Ljava/net/InetAddress;
    const/4 v15, 0x0

    .line 47
    .local v15, "$i$a$-mapNotNull-RuntimeInstaller$dnsServers$sys$1$1":I
    invoke-virtual {v14}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v16

    .line 185
    .end local v14    # "it":Ljava/net/InetAddress;
    .end local v15    # "$i$a$-mapNotNull-RuntimeInstaller$dnsServers$sys$1$1":I
    if-eqz v16, :cond_0

    move-object/from16 v14, v16

    .line 187
    .local v14, "it$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 185
    .local v15, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v5, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 186
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    .end local v13    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v14    # "it$iv$iv":Ljava/lang/Object;
    .end local v15    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_0
    nop

    .end local v11    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 188
    :cond_1
    nop

    .line 189
    .end local v8    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v9    # "$i$f$forEach":I
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapNotNullTo":I
    check-cast v5, Ljava/util/List;

    .line 176
    nop

    .end local v3    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNull":I
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    :goto_1
    nop

    .line 45
    .end local v0    # "$this$dnsServers_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v1    # "$i$a$-runCatching-RuntimeInstaller$dnsServers$sys$1":I
    .end local v2    # "cm":Landroid/net/ConnectivityManager;
    invoke-static {v5}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 48
    :goto_2
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v0, v1

    :cond_3
    check-cast v0, Ljava/util/List;

    .line 45
    nop

    .line 49
    .local v0, "sys":Ljava/util/List;
    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "223.5.5.5"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    const-string v4, "8.8.8.8"

    aput-object v4, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private final downloadVerified(Lcom/pymcl/runtime/JavaDownloadFile;Ljava/io/File;)V
    .locals 16
    .param p1, "spec"    # Lcom/pymcl/runtime/JavaDownloadFile;
    .param p2, "dest"    # Ljava/io/File;

    .line 129
    move-object/from16 v1, p2

    const/4 v0, 0x0

    .line 130
    .local v0, "last":Ljava/lang/Object;
    const/4 v2, 0x0

    move-object v3, v0

    move v4, v2

    .end local v0    # "last":Ljava/lang/Object;
    .local v3, "last":Ljava/lang/Object;
    :goto_0
    const/4 v0, 0x0

    const/4 v5, 0x3

    if-ge v4, v5, :cond_0

    move v5, v4

    .local v5, "it":I
    const/4 v6, 0x0

    .line 131
    .local v6, "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    nop

    .line 132
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 133
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/runtime/JavaDownloadFile;->getUrl()Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    move-object/from16 v8, p0

    :try_start_1
    invoke-direct {v8, v7}, Lcom/pymcl/runtime/RuntimeInstaller;->open(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v7

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v7

    check-cast v7, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_6

    :try_start_2
    move-object v9, v7

    check-cast v9, Ljava/io/InputStream;

    .line 175
    .local v9, "input":Ljava/io/InputStream;
    const/4 v10, 0x0

    .local v10, "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    new-instance v11, Ljava/io/FileOutputStream;

    .line 133
    invoke-direct {v11, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v11, Ljava/io/Closeable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    move-object v12, v11

    check-cast v12, Ljava/io/FileOutputStream;

    .line 175
    .local v12, "it":Ljava/io/FileOutputStream;
    const/4 v13, 0x0

    .line 133
    .local v13, "$i$a$-use-RuntimeInstaller$downloadVerified$1$1$1":I
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v14, v12

    check-cast v14, Ljava/io/OutputStream;

    const/4 v15, 0x2

    invoke-static {v9, v14, v2, v15, v0}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .end local v12    # "it":Ljava/io/FileOutputStream;
    .end local v13    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1$1":I
    :try_start_4
    invoke-static {v11, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .end local v9    # "input":Ljava/io/InputStream;
    .end local v10    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    :try_start_5
    invoke-static {v7, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 134
    sget-object v0, Lcom/pymcl/runtime/JavaDownloads;->INSTANCE:Lcom/pymcl/runtime/JavaDownloads;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    move-object/from16 v12, p1

    :try_start_6
    invoke-virtual {v0, v1, v12}, Lcom/pymcl/runtime/JavaDownloads;->verify(Ljava/io/File;Lcom/pymcl/runtime/JavaDownloadFile;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 135
    return-void

    .line 133
    .restart local v9    # "input":Ljava/io/InputStream;
    .restart local v10    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    :catchall_0
    move-exception v0

    move-object/from16 v12, p1

    move-object v13, v0

    .end local v3    # "last":Ljava/lang/Object;
    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .end local v9    # "input":Ljava/io/InputStream;
    .end local v10    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    .end local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local p2    # "dest":Ljava/io/File;
    :try_start_7
    throw v13
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .restart local v3    # "last":Ljava/lang/Object;
    .restart local v5    # "it":I
    .restart local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .restart local v9    # "input":Ljava/io/InputStream;
    .restart local v10    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    .restart local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_1
    move-exception v0

    :try_start_8
    invoke-static {v11, v13}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v3    # "last":Ljava/lang/Object;
    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .end local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local p2    # "dest":Ljava/io/File;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .end local v9    # "input":Ljava/io/InputStream;
    .end local v10    # "$i$a$-use-RuntimeInstaller$downloadVerified$1$1":I
    .restart local v3    # "last":Ljava/lang/Object;
    .restart local v5    # "it":I
    .restart local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .restart local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_2
    move-exception v0

    goto :goto_1

    :catchall_3
    move-exception v0

    move-object/from16 v12, p1

    :goto_1
    move-object v9, v0

    .end local v3    # "last":Ljava/lang/Object;
    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .end local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local p2    # "dest":Ljava/io/File;
    :try_start_9
    throw v9
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .restart local v3    # "last":Ljava/lang/Object;
    .restart local v5    # "it":I
    .restart local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .restart local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_4
    move-exception v0

    :try_start_a
    invoke-static {v7, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v3    # "last":Ljava/lang/Object;
    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .end local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local p2    # "dest":Ljava/io/File;
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 136
    .restart local v3    # "last":Ljava/lang/Object;
    .restart local v5    # "it":I
    .restart local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    .restart local p1    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .restart local p2    # "dest":Ljava/io/File;
    :catchall_5
    move-exception v0

    goto :goto_3

    :catchall_6
    move-exception v0

    goto :goto_2

    :catchall_7
    move-exception v0

    move-object/from16 v8, p0

    :goto_2
    move-object/from16 v12, p1

    .local v0, "e":Ljava/lang/Throwable;
    :goto_3
    move-object v3, v0

    .line 137
    .end local v0    # "e":Ljava/lang/Throwable;
    nop

    .line 130
    .end local v5    # "it":I
    .end local v6    # "$i$a$-repeat-RuntimeInstaller$downloadVerified$1":I
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 138
    :cond_0
    move-object/from16 v8, p0

    move-object/from16 v12, p1

    new-instance v2, Ljava/io/IOException;

    invoke-virtual {v12}, Lcom/pymcl/runtime/JavaDownloadFile;->getName()Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :cond_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u4e0b\u8f7d "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " \u5931\u8d25\uff1a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private final httpText(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .line 125
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->open(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/InputStream;

    .line 175
    .local v1, "it":Ljava/io/InputStream;
    const/4 v2, 0x0

    .line 125
    .local v2, "$i$a$-use-RuntimeInstaller$httpText$1":I
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v3

    invoke-static {v3}, Lkotlin/text/StringsKt;->decodeToString([B)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v1    # "it":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-RuntimeInstaller$httpText$1":I
    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v3

    :catchall_0
    move-exception v1

    .end local p1    # "url":Ljava/lang/String;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local p1    # "url":Ljava/lang/String;
    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public static synthetic installAll$default(Lcom/pymcl/runtime/RuntimeInstaller;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 23
    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    new-instance p1, Lcom/pymcl/runtime/RuntimeInstaller$$ExternalSyntheticLambda0;

    invoke-direct {p1}, Lcom/pymcl/runtime/RuntimeInstaller$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller;->installAll(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final installAll$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final installBundledJava(I)V
    .locals 10
    .param p1, "major"    # I

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "app_runtime/java/jre"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 81
    .local v0, "base":Ljava/lang/String;
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/version"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/pymcl/runtime/RuntimeInstaller;->assetText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    .line 82
    .local v1, "version":Ljava/lang/String;
    :cond_0
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->javaDir(I)Ljava/io/File;

    move-result-object v2

    .line 83
    .local v2, "target":Ljava/io/File;
    new-instance v3, Ljava/io/File;

    const-string v4, "version"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v3

    .line 175
    .local v5, "it":Ljava/io/File;
    const/4 v6, 0x0

    .line 83
    .local v6, "$i$a$-takeIf-RuntimeInstaller$installBundledJava$1":I
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v5

    .end local v5    # "it":Ljava/io/File;
    .end local v6    # "$i$a$-takeIf-RuntimeInstaller$installBundledJava$1":I
    const/4 v6, 0x0

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_1
    move-object v3, v6

    :goto_0
    if-eqz v3, :cond_2

    const/4 v5, 0x1

    invoke-static {v3, v6, v5, v6}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v6

    :goto_1
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    .line 84
    :cond_3
    invoke-static {v2}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 85
    sget-object v3, Lcom/pymcl/runtime/RuntimeLayout;->INSTANCE:Lcom/pymcl/runtime/RuntimeLayout;

    iget-object v5, p0, Lcom/pymcl/runtime/RuntimeInstaller;->abi:Ljava/lang/String;

    invoke-virtual {v3, p1, v5}, Lcom/pymcl/runtime/RuntimeLayout;->jreArchives(ILjava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "archive":Ljava/lang/String;
    iget-object v7, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v7

    check-cast v7, Ljava/io/Closeable;

    :try_start_0
    move-object v8, v7

    check-cast v8, Ljava/io/InputStream;

    .line 175
    .local v8, "it":Ljava/io/InputStream;
    const/4 v9, 0x0

    .line 85
    .local v9, "$i$a$-use-RuntimeInstaller$installBundledJava$2":I
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v8, v2}, Lcom/pymcl/runtime/RuntimeInstaller;->untarXz(Ljava/io/InputStream;Ljava/io/File;)V

    .end local v8    # "it":Ljava/io/InputStream;
    .end local v9    # "$i$a$-use-RuntimeInstaller$installBundledJava$2":I
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v7, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_2

    :catchall_0
    move-exception v3

    .end local v0    # "base":Ljava/lang/String;
    .end local v1    # "version":Ljava/lang/String;
    .end local v2    # "target":Ljava/io/File;
    .end local v5    # "archive":Ljava/lang/String;
    .end local p1    # "major":I
    :try_start_1
    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "base":Ljava/lang/String;
    .restart local v1    # "version":Ljava/lang/String;
    .restart local v2    # "target":Ljava/io/File;
    .restart local v5    # "archive":Ljava/lang/String;
    .restart local p1    # "major":I
    :catchall_1
    move-exception v4

    invoke-static {v7, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    .line 86
    .end local v5    # "archive":Ljava/lang/String;
    :cond_4
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v4, 0x2

    invoke-static {v3, v1, v6, v4, v6}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 87
    invoke-direct {p0, v2}, Lcom/pymcl/runtime/RuntimeInstaller;->patchJava(Ljava/io/File;)V

    .line 88
    return-void
.end method

.method private static final installPlugins$lambda$1$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nameserver "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final javaDir(I)Ljava/io/File;
    .locals 4
    .param p1, "major"    # I

    .line 54
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jre"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final open(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 4
    .param p1, "url"    # Ljava/lang/String;

    .line 121
    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v1, v0

    .local v1, "$this$open_u24lambda_u240":Ljava/net/HttpURLConnection;
    const/4 v2, 0x0

    .line 122
    .local v2, "$i$a$-apply-RuntimeInstaller$open$1":I
    const/16 v3, 0x4e20

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const v3, 0xea60

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 123
    nop

    .line 121
    .end local v1    # "$this$open_u24lambda_u240":Ljava/net/HttpURLConnection;
    .end local v2    # "$i$a$-apply-RuntimeInstaller$open$1":I
    nop

    .line 123
    return-object v0
.end method

.method private final patchJava(Ljava/io/File;)V
    .locals 13
    .param p1, "target"    # Ljava/io/File;

    .line 161
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    .line 162
    .local v0, "nativeDir":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/tungsten/fclauncher/FCLauncher;->getJavaLibDir(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 163
    .local v1, "libFolder":Ljava/lang/String;
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/tungsten/fclauncher/FCLauncher;->isJDK8(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "/jre"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 164
    :cond_0
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/libfreetype.so.6"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, p1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v2, "ftIn":Ljava/io/File;
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/libfreetype.so"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 165
    .local v3, "ftOut":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-eqz v4, :cond_2

    :cond_1
    invoke-virtual {v2, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 166
    :cond_2
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const-string v6, "libawt_xawt.so"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    const-string v6, "libjsound.so"

    aput-object v6, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_3
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 167
    .local v5, "lib":Ljava/lang/String;
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v6

    .line 168
    .local v7, "src":Ljava/io/File;
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v8, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v9, "/"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v8, p1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    goto :goto_0

    .line 170
    .end local v5    # "lib":Ljava/lang/String;
    .end local v7    # "src":Ljava/io/File;
    :cond_4
    return-void
.end method

.method private final untarXz(Ljava/io/InputStream;Ljava/io/File;)V
    .locals 16
    .param p1, "input"    # Ljava/io/InputStream;
    .param p2, "target"    # Ljava/io/File;

    .line 142
    move-object/from16 v1, p1

    const-string v2, "getCanonicalPath(...)"

    new-instance v0, Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;

    new-instance v3, Lorg/tukaani/xz/XZInputStream;

    instance-of v4, v1, Ljava/io/BufferedInputStream;

    if-eqz v4, :cond_0

    move-object v4, v1

    check-cast v4, Ljava/io/BufferedInputStream;

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/io/BufferedInputStream;

    const/16 v5, 0x2000

    invoke-direct {v4, v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    :goto_0
    check-cast v4, Ljava/io/InputStream;

    invoke-direct {v3, v4}, Lorg/tukaani/xz/XZInputStream;-><init>(Ljava/io/InputStream;)V

    check-cast v3, Ljava/io/InputStream;

    invoke-direct {v0, v3}, Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v3, v0

    check-cast v3, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v3

    check-cast v0, Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;

    move-object v4, v0

    .local v4, "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    const/4 v0, 0x0

    move v5, v0

    .line 143
    .local v5, "$i$a$-use-RuntimeInstaller$untarXz$1":I
    :cond_1
    :goto_1
    nop

    .line 144
    invoke-virtual {v4}, Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;->getNextEntry()Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;

    move-result-object v0

    const/4 v6, 0x0

    if-nez v0, :cond_2

    .line 157
    nop

    .end local v4    # "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    .end local v5    # "$i$a$-use-RuntimeInstaller$untarXz$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 142
    invoke-static {v3, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 158
    return-void

    .line 144
    .restart local v4    # "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    .restart local v5    # "$i$a$-use-RuntimeInstaller$untarXz$1":I
    :cond_2
    move-object v7, v0

    .line 145
    .local v7, "e":Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;
    :try_start_1
    new-instance v0, Ljava/io/File;

    invoke-virtual {v7}, Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;->getName()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    move-object/from16 v9, p2

    :try_start_2
    invoke-direct {v0, v9, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v8, v0

    .line 146
    .local v8, "out":Ljava/io/File;
    invoke-virtual {v8}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    invoke-static {v0, v10, v12, v11, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    nop

    .line 148
    invoke-virtual {v7}, Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;->isSymbolicLink()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_3
    invoke-virtual {v8}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller;

    .line 175
    .local v0, "$this$untarXz_u24lambda_u240_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    const/4 v6, 0x0

    .line 148
    .local v6, "$i$a$-runCatching-RuntimeInstaller$untarXz$1$1":I
    invoke-virtual {v7}, Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;->getLinkName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/system/Os;->symlink(Ljava/lang/String;Ljava/lang/String;)V

    .end local v0    # "$this$untarXz_u24lambda_u240_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v6    # "$i$a$-runCatching-RuntimeInstaller$untarXz$1$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    :try_start_4
    sget-object v6, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    goto :goto_3

    .line 149
    :cond_4
    invoke-virtual {v7}, Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;

    goto :goto_3

    .line 151
    :cond_5
    invoke-virtual {v8}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_6
    new-instance v0, Ljava/io/FileOutputStream;

    .line 152
    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v10, v0

    check-cast v10, Ljava/io/Closeable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    move-object v0, v10

    check-cast v0, Ljava/io/FileOutputStream;

    .line 175
    .local v0, "it":Ljava/io/FileOutputStream;
    const/4 v13, 0x0

    .line 152
    .local v13, "$i$a$-use-RuntimeInstaller$untarXz$1$2":I
    move-object v14, v4

    check-cast v14, Ljava/io/InputStream;

    move-object v15, v0

    check-cast v15, Ljava/io/OutputStream;

    invoke-static {v14, v15, v12, v11, v6}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .end local v0    # "it":Ljava/io/FileOutputStream;
    .end local v13    # "$i$a$-use-RuntimeInstaller$untarXz$1$2":I
    :try_start_6
    invoke-static {v10, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Ljava/io/File;->setExecutable(Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    check-cast v0, Ljava/io/Serializable;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :goto_3
    goto/16 :goto_1

    .line 152
    :catchall_1
    move-exception v0

    move-object v2, v0

    .end local v4    # "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    .end local v5    # "$i$a$-use-RuntimeInstaller$untarXz$1":I
    .end local v7    # "e":Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;
    .end local v8    # "out":Ljava/io/File;
    .end local p1    # "input":Ljava/io/InputStream;
    .end local p2    # "target":Ljava/io/File;
    :try_start_7
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .restart local v4    # "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    .restart local v5    # "$i$a$-use-RuntimeInstaller$untarXz$1":I
    .restart local v7    # "e":Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;
    .restart local v8    # "out":Ljava/io/File;
    .restart local p1    # "input":Ljava/io/InputStream;
    .restart local p2    # "target":Ljava/io/File;
    :catchall_2
    move-exception v0

    :try_start_8
    invoke-static {v10, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "input":Ljava/io/InputStream;
    .end local p2    # "target":Ljava/io/File;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 142
    .end local v4    # "tar":Lorg/apache/commons/compress/archivers/tar/TarArchiveInputStream;
    .end local v5    # "$i$a$-use-RuntimeInstaller$untarXz$1":I
    .end local v7    # "e":Lorg/apache/commons/compress/archivers/tar/TarArchiveEntry;
    .end local v8    # "out":Ljava/io/File;
    .restart local p1    # "input":Ljava/io/InputStream;
    .restart local p2    # "target":Ljava/io/File;
    :catchall_3
    move-exception v0

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object/from16 v9, p2

    :goto_4
    move-object v2, v0

    .end local p1    # "input":Ljava/io/InputStream;
    .end local p2    # "target":Ljava/io/File;
    :try_start_9
    throw v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .restart local p1    # "input":Ljava/io/InputStream;
    .restart local p2    # "target":Ljava/io/File;
    :catchall_5
    move-exception v0

    invoke-static {v3, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method


# virtual methods
.method public final downloadJava(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "major"    # I
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 95
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;ILkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    return-object v0
.end method

.method public final installAll(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "onStage"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 23
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/runtime/RuntimeInstaller$installAll$3;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    return-object v0
.end method

.method public final installPlugins()V
    .locals 17

    .line 36
    const/4 v1, 0x2

    new-array v0, v1, [Lkotlin/Pair;

    const-string v2, "game/MioLaunchWrapper.jar"

    sget-object v3, Lcom/tungsten/fclauncher/utils/FCLPath;->MIO_LAUNCH_WRAPPER:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const-string v2, "game/MioLibPatcher.jar"

    sget-object v4, Lcom/tungsten/fclauncher/utils/FCLPath;->LIB_PATCHER_PATH:Ljava/lang/String;

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v0, v4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "asset":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 37
    .local v6, "dest":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v7, v0

    .line 38
    .local v7, "f":Ljava/io/File;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller;

    move-object v8, v0

    .line 175
    .local v8, "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    const/4 v9, 0x0

    .line 38
    .local v9, "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    iget-object v0, v8, Lcom/pymcl/runtime/RuntimeInstaller;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    move-object v0, v10

    check-cast v0, Ljava/io/InputStream;

    move-object v11, v0

    .line 175
    .local v11, "input":Ljava/io/InputStream;
    const/4 v12, 0x0

    .line 38
    .local v12, "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    invoke-virtual {v7}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v7}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v13, v0

    check-cast v13, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    move-object v0, v13

    check-cast v0, Ljava/io/FileOutputStream;

    .line 175
    .local v0, "it":Ljava/io/FileOutputStream;
    const/4 v14, 0x0

    .line 38
    .local v14, "$i$a$-use-RuntimeInstaller$installPlugins$1$1$1":I
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v15, v0

    check-cast v15, Ljava/io/OutputStream;

    invoke-static {v11, v15, v3, v1, v4}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J

    move-result-wide v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v0    # "it":Ljava/io/FileOutputStream;
    .end local v14    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1$1":I
    :try_start_3
    invoke-static {v13, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .end local v11    # "input":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    :try_start_4
    invoke-static {v10, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_0

    .restart local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    .restart local v11    # "input":Ljava/io/InputStream;
    .restart local v12    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    :catchall_0
    move-exception v0

    move-object v4, v0

    .end local v5    # "asset":Ljava/lang/String;
    .end local v6    # "dest":Ljava/lang/String;
    .end local v7    # "f":Ljava/io/File;
    .end local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    .end local v11    # "input":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    :try_start_5
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .restart local v5    # "asset":Ljava/lang/String;
    .restart local v6    # "dest":Ljava/lang/String;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    .restart local v11    # "input":Ljava/io/InputStream;
    .restart local v12    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {v13, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v5    # "asset":Ljava/lang/String;
    .end local v6    # "dest":Ljava/lang/String;
    .end local v7    # "f":Ljava/io/File;
    .end local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .end local v11    # "input":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-RuntimeInstaller$installPlugins$1$1":I
    .restart local v5    # "asset":Ljava/lang/String;
    .restart local v6    # "dest":Ljava/lang/String;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    :catchall_2
    move-exception v0

    move-object v4, v0

    .end local v5    # "asset":Ljava/lang/String;
    .end local v6    # "dest":Ljava/lang/String;
    .end local v7    # "f":Ljava/io/File;
    .end local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    :try_start_7
    throw v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .restart local v5    # "asset":Ljava/lang/String;
    .restart local v6    # "dest":Ljava/lang/String;
    .restart local v7    # "f":Ljava/io/File;
    .restart local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .restart local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    :catchall_3
    move-exception v0

    :try_start_8
    invoke-static {v10, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v5    # "asset":Ljava/lang/String;
    .end local v6    # "dest":Ljava/lang/String;
    .end local v7    # "f":Ljava/io/File;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .end local v8    # "$this$installPlugins_u24lambda_u240":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v9    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$1":I
    .restart local v5    # "asset":Ljava/lang/String;
    .restart local v6    # "dest":Ljava/lang/String;
    .restart local v7    # "f":Ljava/io/File;
    :catchall_4
    move-exception v0

    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v5    # "asset":Ljava/lang/String;
    .end local v6    # "dest":Ljava/lang/String;
    .end local v7    # "f":Ljava/io/File;
    goto/16 :goto_0

    .line 40
    :cond_1
    new-instance v0, Ljava/io/File;

    sget-object v2, Lcom/tungsten/fclauncher/utils/FCLPath;->JAVA_PATH:Ljava/lang/String;

    const-string v3, "resolv.conf"

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v0

    .line 41
    .local v2, "resolv":Ljava/io/File;
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_3

    :try_start_9
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v0, p0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller;

    .line 175
    .local v0, "$this$installPlugins_u24lambda_u241":Lcom/pymcl/runtime/RuntimeInstaller;
    const/4 v3, 0x0

    .line 41
    .local v3, "$i$a$-runCatching-RuntimeInstaller$installPlugins$2":I
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    :cond_2
    invoke-direct {v0}, Lcom/pymcl/runtime/RuntimeInstaller;->dnsServers()Ljava/util/List;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    const-string v5, ""

    move-object v7, v5

    check-cast v7, Ljava/lang/CharSequence;

    new-instance v12, Lcom/pymcl/runtime/RuntimeInstaller$$ExternalSyntheticLambda1;

    invoke-direct {v12}, Lcom/pymcl/runtime/RuntimeInstaller$$ExternalSyntheticLambda1;-><init>()V

    const/16 v13, 0x1e

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v6 .. v14}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5, v4, v1, v4}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .end local v0    # "$this$installPlugins_u24lambda_u241":Lcom/pymcl/runtime/RuntimeInstaller;
    .end local v3    # "$i$a$-runCatching-RuntimeInstaller$installPlugins$2":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_1

    :catchall_5
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    :cond_3
    :goto_1
    return-void
.end method

.method public final isJavaInstalled(I)Z
    .locals 3
    .param p1, "major"    # I

    .line 52
    new-instance v0, Ljava/io/File;

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/RuntimeInstaller;->javaDir(I)Ljava/io/File;

    move-result-object v1

    const-string v2, "version"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method
