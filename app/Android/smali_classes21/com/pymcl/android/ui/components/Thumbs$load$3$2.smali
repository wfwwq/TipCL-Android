.class final Lcom/pymcl/android/ui/components/Thumbs$load$3$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "NetImage.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/components/Thumbs;->load(Landroid/content/Context;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetImage.kt\ncom/pymcl/android/ui/components/Thumbs$load$3$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/Bitmap;",
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
    c = "com.pymcl.android.ui.components.Thumbs$load$3$2"
    f = "NetImage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    nl = {}
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $ctx:Landroid/content/Context;

.field final synthetic $targetPx:I

.field final synthetic $url:Ljava/lang/String;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/components/Thumbs$load$3$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$ctx:Landroid/content/Context;

    iput-object p2, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    iput p3, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$targetPx:I

    const/4 v0, 0x2

    invoke-direct {p0, v0, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4
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

    new-instance v0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;

    iget-object v1, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$ctx:Landroid/content/Context;

    iget-object v2, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    iget v3, p0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$targetPx:I

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;-><init>(Landroid/content/Context;Ljava/lang/String;ILkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17
    .param p1, "$result"    # Ljava/lang/Object;

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->L$0:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    .local v2, "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 61
    iget v0, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    new-instance v0, Ljava/io/File;

    sget-object v3, Lcom/pymcl/android/ui/components/Thumbs;->INSTANCE:Lcom/pymcl/android/ui/components/Thumbs;

    iget-object v4, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$ctx:Landroid/content/Context;

    invoke-virtual {v3, v4}, Lcom/pymcl/android/ui/components/Thumbs;->dir(Landroid/content/Context;)Ljava/io/File;

    move-result-object v3

    sget-object v4, Lcom/pymcl/android/ui/components/Thumbs;->INSTANCE:Lcom/pymcl/android/ui/components/Thumbs;

    iget-object v5, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/pymcl/android/ui/components/Thumbs;->key(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v3, v0

    .line 63
    .local v3, "f":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v5

    const-wide/16 v7, 0x0

    cmp-long v0, v5, v7

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v2

    .local v5, "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v6, 0x0

    .line 64
    .local v6, "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    new-instance v7, Ljava/net/URL;

    invoke-direct {v7, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    const-string v7, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v7, v0

    .line 65
    .local v7, "c\\1":Ljava/net/HttpURLConnection;
    const/16 v0, 0x1f40

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    const/16 v0, 0x3a98

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    const-string v0, "User-Agent"

    const-string v8, "PyMCL/1.0.1"

    invoke-virtual {v7, v0, v8}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 66
    :try_start_1
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v8

    const/16 v9, 0xc8

    const/4 v10, 0x0

    if-gt v9, v8, :cond_1

    const/16 v9, 0x12c

    if-ge v8, v9, :cond_1

    goto :goto_0

    :cond_1
    move v0, v10

    :goto_0
    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ".part"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    .local v8, "tmp\\1":Ljava/io/File;
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljava/io/Closeable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    move-object v0, v9

    check-cast v0, Ljava/io/InputStream;

    move-object v11, v0

    .line 122
    .local v11, "i\\2":Ljava/io/InputStream;
    const/4 v12, 0x0

    .local v12, "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    new-instance v0, Ljava/io/FileOutputStream;

    .line 66
    invoke-direct {v0, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v13, v0

    check-cast v13, Ljava/io/Closeable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    move-object v0, v13

    check-cast v0, Ljava/io/FileOutputStream;

    .line 122
    .local v0, "it\\3":Ljava/io/FileOutputStream;
    const/4 v14, 0x0

    .line 66
    .local v14, "$i$a$-use-Thumbs$load$3$2$1$1$1\\3\\66\\2":I
    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v15, v0

    check-cast v15, Ljava/io/OutputStream;

    move-object/from16 v16, v0

    .end local v0    # "it\\3":Ljava/io/FileOutputStream;
    .local v16, "it\\3":Ljava/io/FileOutputStream;
    const/4 v0, 0x2

    invoke-static {v11, v15, v10, v0, v4}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .end local v14    # "$i$a$-use-Thumbs$load$3$2$1$1$1\\3\\66\\2":I
    .end local v16    # "it\\3":Ljava/io/FileOutputStream;
    :try_start_4
    invoke-static {v13, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v11    # "i\\2":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    :try_start_5
    invoke-static {v9, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-virtual {v8, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_1

    .restart local v11    # "i\\2":Ljava/io/InputStream;
    .restart local v12    # "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    :catchall_0
    move-exception v0

    move-object v10, v0

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "f":Ljava/io/File;
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .end local v8    # "tmp\\1":Ljava/io/File;
    .end local v11    # "i\\2":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    .end local p1    # "$result":Ljava/lang/Object;
    :try_start_6
    throw v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "f":Ljava/io/File;
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .restart local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .restart local v8    # "tmp\\1":Ljava/io/File;
    .restart local v11    # "i\\2":Ljava/io/InputStream;
    .restart local v12    # "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_1
    move-exception v0

    :try_start_7
    invoke-static {v13, v10}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "f":Ljava/io/File;
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .end local v8    # "tmp\\1":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .end local v11    # "i\\2":Ljava/io/InputStream;
    .end local v12    # "$i$a$-use-Thumbs$load$3$2$1$1\\2\\66\\1":I
    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "f":Ljava/io/File;
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .restart local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .restart local v8    # "tmp\\1":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_2
    move-exception v0

    move-object v10, v0

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "f":Ljava/io/File;
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .end local v8    # "tmp\\1":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    :try_start_8
    throw v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "f":Ljava/io/File;
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .restart local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .restart local v8    # "tmp\\1":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_3
    move-exception v0

    :try_start_9
    invoke-static {v9, v10}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "f":Ljava/io/File;
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 67
    .end local v8    # "tmp\\1":Ljava/io/File;
    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "f":Ljava/io/File;
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .restart local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .restart local p1    # "$result":Ljava/lang/Object;
    :cond_2
    :goto_1
    :try_start_a
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 68
    nop

    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 63
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 67
    .restart local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .restart local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .restart local v7    # "c\\1":Ljava/net/HttpURLConnection;
    :catchall_4
    move-exception v0

    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .end local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "f":Ljava/io/File;
    .end local p1    # "$result":Ljava/lang/Object;
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 63
    .end local v5    # "$this$invokeSuspend_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$1\\1\\63\\0":I
    .end local v7    # "c\\1":Ljava/net/HttpURLConnection;
    .restart local v2    # "$this$withContext":Lkotlinx/coroutines/CoroutineScope;
    .restart local v3    # "f":Ljava/io/File;
    .restart local p1    # "$result":Ljava/lang/Object;
    :catchall_5
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_3
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$targetPx:I

    :try_start_b
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v2

    .line 122
    .local v5, "$this$invokeSuspend_u24lambda_u241\\4":Lkotlinx/coroutines/CoroutineScope;
    const/4 v6, 0x0

    .line 69
    .local v6, "$i$a$-runCatching-Thumbs$load$3$2$bmp$1\\4\\69\\0":I
    sget-object v7, Lcom/pymcl/android/ui/components/Thumbs;->INSTANCE:Lcom/pymcl/android/ui/components/Thumbs;

    invoke-static {v7, v3, v0}, Lcom/pymcl/android/ui/components/Thumbs;->access$decode(Lcom/pymcl/android/ui/components/Thumbs;Ljava/io/File;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .end local v5    # "$this$invokeSuspend_u24lambda_u241\\4":Lkotlinx/coroutines/CoroutineScope;
    .end local v6    # "$i$a$-runCatching-Thumbs$load$3$2$bmp$1\\4\\69\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_6

    goto :goto_3

    :catchall_6
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_4

    :cond_4
    move-object v4, v0

    :goto_4
    check-cast v4, Landroid/graphics/Bitmap;

    .line 70
    .local v4, "bmp":Landroid/graphics/Bitmap;
    :cond_5
    if-nez v4, :cond_6

    invoke-static {}, Lcom/pymcl/android/ui/components/Thumbs;->access$getFailed$p()Ljava/util/Set;

    move-result-object v0

    const-string v5, "access$getFailed$p(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    iget-object v5, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v0

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    goto :goto_5

    :cond_6
    invoke-static {}, Lcom/pymcl/android/ui/components/Thumbs;->access$getMem$p()Lcom/pymcl/android/ui/components/Thumbs$mem$1;

    move-result-object v0

    iget-object v5, v1, Lcom/pymcl/android/ui/components/Thumbs$load$3$2;->$url:Ljava/lang/String;

    invoke-virtual {v0, v5, v4}, Lcom/pymcl/android/ui/components/Thumbs$mem$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    :goto_5
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
