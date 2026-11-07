.class public final Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;
.super Ljava/lang/Object;
.source "Transport.kt"

# interfaces
.implements Lcom/pymcl/ai/AiLineStream;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/ai/UrlConnectionAiHttp;->postStream(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;II)Lcom/pymcl/ai/AiLineStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTransport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transport.kt\ncom/pymcl/ai/UrlConnectionAiHttp$postStream$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/pymcl/ai/UrlConnectionAiHttp$postStream$1",
        "Lcom/pymcl/ai/AiLineStream;",
        "readLine",
        "",
        "close",
        "",
        "PyMCL-Android:ai"
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
.field final synthetic $c:Ljava/net/HttpURLConnection;

.field final synthetic $r:Ljava/io/BufferedReader;


# direct methods
.method constructor <init>(Ljava/io/BufferedReader;Ljava/net/HttpURLConnection;)V
    .locals 0
    .param p1, "$r"    # Ljava/io/BufferedReader;
    .param p2, "$c"    # Ljava/net/HttpURLConnection;

    iput-object p1, p0, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;->$r:Ljava/io/BufferedReader;

    iput-object p2, p0, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;->$c:Ljava/net/HttpURLConnection;

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 3

    .line 53
    iget-object v0, p0, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;->$r:Ljava/io/BufferedReader;

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;

    .line 68
    .local v1, "$this$close_u24lambda_u240":Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;
    const/4 v2, 0x0

    .line 53
    .local v2, "$i$a$-runCatching-UrlConnectionAiHttp$postStream$1$close$1":I
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V

    .end local v1    # "$this$close_u24lambda_u240":Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;
    .end local v2    # "$i$a$-runCatching-UrlConnectionAiHttp$postStream$1$close$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;->$c:Ljava/net/HttpURLConnection;

    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    return-void
.end method

.method public readLine()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/ai/UrlConnectionAiHttp$postStream$1;->$r:Ljava/io/BufferedReader;

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
