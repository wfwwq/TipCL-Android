.class final Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "RuntimeInstaller.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/RuntimeInstaller;->downloadJava(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRuntimeInstaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeInstaller.kt\ncom/pymcl/runtime/RuntimeInstaller$downloadJava$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.runtime.RuntimeInstaller$downloadJava$2"
    f = "RuntimeInstaller.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $major:I

.field label:I

.field final synthetic this$0:Lcom/pymcl/runtime/RuntimeInstaller;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/RuntimeInstaller;ILkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/RuntimeInstaller;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    iput p2, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    const/4 v0, 0x2

    invoke-direct {p0, v0, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;

    iget-object v1, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    iget v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    invoke-direct {v0, v1, v2, p2}, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;-><init>(Lcom/pymcl/runtime/RuntimeInstaller;ILkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 95
    iget v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    iget v1, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    invoke-static {v0, v1}, Lcom/pymcl/runtime/RuntimeInstaller;->access$javaDir(Lcom/pymcl/runtime/RuntimeInstaller;I)Ljava/io/File;

    move-result-object v0

    .line 97
    .local v0, "target":Ljava/io/File;
    invoke-static {v0}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 98
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v2}, Lcom/pymcl/runtime/RuntimeInstaller;->access$getContext$p(Lcom/pymcl/runtime/RuntimeInstaller;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "jre-dl"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v1

    .line 173
    .local v2, "$this$invokeSuspend_u24lambda_u240":Ljava/io/File;
    const/4 v3, 0x0

    .line 98
    .local v3, "$i$a$-apply-RuntimeInstaller$downloadJava$2$tmpDir$1":I
    invoke-static {v2}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 99
    .end local v2    # "$this$invokeSuspend_u24lambda_u240":Ljava/io/File;
    .end local v3    # "$i$a$-apply-RuntimeInstaller$downloadJava$2$tmpDir$1":I
    .local v1, "tmpDir":Ljava/io/File;
    nop

    .line 100
    :try_start_0
    sget-object v2, Lcom/pymcl/runtime/JavaDownloads;->INSTANCE:Lcom/pymcl/runtime/JavaDownloads;

    iget v3, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    iget-object v4, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v4}, Lcom/pymcl/runtime/RuntimeInstaller;->access$getAbi$p(Lcom/pymcl/runtime/RuntimeInstaller;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/pymcl/runtime/JavaDownloads;->archives(ILjava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pymcl/runtime/JavaDownloadFile;

    .line 101
    .local v3, "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    new-instance v5, Ljava/io/File;

    invoke-virtual {v3}, Lcom/pymcl/runtime/JavaDownloadFile;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v1, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 102
    .local v5, "f":Ljava/io/File;
    iget-object v6, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v6, v3, v5}, Lcom/pymcl/runtime/RuntimeInstaller;->access$downloadVerified(Lcom/pymcl/runtime/RuntimeInstaller;Lcom/pymcl/runtime/JavaDownloadFile;Ljava/io/File;)V

    new-instance v6, Ljava/io/FileInputStream;

    .line 103
    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v6, Ljava/io/Closeable;

    iget-object v7, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v8, v6

    check-cast v8, Ljava/io/FileInputStream;

    .line 173
    .local v8, "it":Ljava/io/FileInputStream;
    const/4 v9, 0x0

    .line 103
    .local v9, "$i$a$-use-RuntimeInstaller$downloadJava$2$1":I
    move-object v10, v8

    check-cast v10, Ljava/io/InputStream;

    invoke-static {v7, v10, v0}, Lcom/pymcl/runtime/RuntimeInstaller;->access$untarXz(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/io/InputStream;Ljava/io/File;)V

    .end local v8    # "it":Ljava/io/FileInputStream;
    .end local v9    # "$i$a$-use-RuntimeInstaller$downloadJava$2$1":I
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v6, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 104
    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .line 103
    :catchall_0
    move-exception v2

    .end local v0    # "target":Ljava/io/File;
    .end local v1    # "tmpDir":Ljava/io/File;
    .end local v3    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local v5    # "f":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v0    # "target":Ljava/io/File;
    .restart local v1    # "tmpDir":Ljava/io/File;
    .restart local v3    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .restart local v5    # "f":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v6, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v0    # "target":Ljava/io/File;
    .end local v1    # "tmpDir":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v4

    .line 106
    .end local v3    # "spec":Lcom/pymcl/runtime/JavaDownloadFile;
    .end local v5    # "f":Ljava/io/File;
    .restart local v0    # "target":Ljava/io/File;
    .restart local v1    # "tmpDir":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_0
    sget-object v2, Lcom/pymcl/runtime/JavaDownloads;->INSTANCE:Lcom/pymcl/runtime/JavaDownloads;

    iget v3, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    invoke-virtual {v2, v3}, Lcom/pymcl/runtime/JavaDownloads;->pinnedVersion(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    sget-object v3, Lcom/pymcl/runtime/JavaDownloads;->INSTANCE:Lcom/pymcl/runtime/JavaDownloads;

    iget v5, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    invoke-virtual {v3, v5}, Lcom/pymcl/runtime/JavaDownloads;->versionUrl(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/pymcl/runtime/RuntimeInstaller;->access$httpText(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 107
    .local v2, "version":Ljava/lang/String;
    :cond_1
    new-instance v3, Lcom/pymcl/runtime/Pack200Unpacker;

    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v6}, Lcom/pymcl/runtime/RuntimeInstaller;->access$getContext$p(Lcom/pymcl/runtime/RuntimeInstaller;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    const-string v7, "libunpack200.so"

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v6, 0x2

    invoke-direct {v3, v5, v4, v6, v4}, Lcom/pymcl/runtime/Pack200Unpacker;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v0}, Lcom/pymcl/runtime/Pack200Unpacker;->unpackAll(Ljava/io/File;)Ljava/util/List;

    move-result-object v3

    .line 108
    .local v3, "unpacked":Ljava/util/List;
    move-object v5, v3

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, "PyMCL"

    iget v7, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "jre"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, ": unpack200 \u89e3\u51fa "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, " \u4e2a jar"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 109
    :cond_2
    iget v5, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->$major:I

    const/16 v7, 0x8

    if-ne v5, v7, :cond_4

    new-instance v5, Ljava/io/File;

    const-string v7, "lib/rt.jar"

    invoke-direct {v5, v0, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_3

    goto :goto_1

    :cond_3
    new-instance v4, Ljava/io/IOException;

    const-string v5, "jre8 \u89e3\u5305\u540e\u7f3a\u5c11 lib/rt.jar"

    invoke-direct {v4, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .end local v0    # "target":Ljava/io/File;
    .end local v1    # "tmpDir":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v4

    .line 110
    .restart local v0    # "target":Ljava/io/File;
    .restart local v1    # "tmpDir":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_4
    :goto_1
    iget-object v5, p0, Lcom/pymcl/runtime/RuntimeInstaller$downloadJava$2;->this$0:Lcom/pymcl/runtime/RuntimeInstaller;

    invoke-static {v5, v0}, Lcom/pymcl/runtime/RuntimeInstaller;->access$patchJava(Lcom/pymcl/runtime/RuntimeInstaller;Ljava/io/File;)V

    .line 111
    new-instance v5, Ljava/io/File;

    const-string v7, "version"

    invoke-direct {v5, v0, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v5, v2, v4, v6, v4}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 116
    .end local v2    # "version":Ljava/lang/String;
    .end local v3    # "unpacked":Ljava/util/List;
    invoke-static {v1}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 117
    nop

    .line 118
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 112
    :catchall_2
    move-exception v2

    .line 113
    .local v2, "e":Ljava/lang/Throwable;
    :try_start_5
    invoke-static {v0}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    .line 114
    nop

    .end local v0    # "target":Ljava/io/File;
    .end local v1    # "tmpDir":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 116
    .end local v2    # "e":Ljava/lang/Throwable;
    .restart local v0    # "target":Ljava/io/File;
    .restart local v1    # "tmpDir":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_3
    move-exception v2

    invoke-static {v1}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
