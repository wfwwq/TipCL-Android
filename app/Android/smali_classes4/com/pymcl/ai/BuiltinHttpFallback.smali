.class public final Lcom/pymcl/ai/BuiltinHttpFallback;
.super Ljava/lang/Object;
.source "AiClient.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0006\u0010\u000c\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ5\u0010\u0012\u001a\u0002H\u0013\"\u0004\u0008\u0000\u0010\u00132\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00130\u0015\u00a2\u0006\u0002\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/pymcl/ai/BuiltinHttpFallback;",
        "",
        "<init>",
        "()V",
        "value",
        "",
        "useHttp",
        "getUseHttp",
        "()Z",
        "notice",
        "",
        "takeNotice",
        "reset",
        "",
        "rewrite",
        "ep",
        "Lcom/pymcl/ai/AiEndpoint;",
        "url",
        "call",
        "T",
        "block",
        "Lkotlin/Function1;",
        "(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
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
.field private volatile notice:Ljava/lang/String;

.field private volatile useHttp:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 6
    .param p1, "ep"    # Lcom/pymcl/ai/AiEndpoint;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "block"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/pymcl/ai/AiEndpoint;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "ep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/ai/BuiltinHttpFallback;->rewrite(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 171
    .local v0, "u":Ljava/lang/String;
    :try_start_0
    invoke-interface {p3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 172
    .local v1, "e":Ljava/io/IOException;
    invoke-virtual {p1}, Lcom/pymcl/ai/AiEndpoint;->getBuiltinHost()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, "https://"

    const/4 v5, 0x0

    invoke-static {v0, v4, v5, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Lcom/pymcl/ai/NetErrors;->INSTANCE:Lcom/pymcl/ai/NetErrors;

    move-object v3, v1

    check-cast v3, Ljava/lang/Throwable;

    invoke-virtual {v2, v3}, Lcom/pymcl/ai/NetErrors;->isTls(Ljava/lang/Throwable;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 173
    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "http://"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 174
    .local v2, "r":Ljava/lang/Object;
    const/4 v3, 0x1

    iput-boolean v3, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->useHttp:Z

    sget-object v3, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v4, "\u5185\u7f6e\u7f51\u5173\u7684\u8bc1\u4e66/HTTPS \u914d\u7f6e\u5f02\u5e38\uff0c\u5df2\u6539\u7528 HTTP \u8fde\u63a5"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->notice:Ljava/lang/String;

    .line 175
    move-object v1, v2

    .line 171
    .end local v1    # "e":Ljava/io/IOException;
    .end local v2    # "r":Ljava/lang/Object;
    :goto_0
    return-object v1

    .line 172
    .restart local v1    # "e":Ljava/io/IOException;
    :cond_0
    throw v1
.end method

.method public final getUseHttp()Z
    .locals 1

    .line 162
    iget-boolean v0, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->useHttp:Z

    return v0
.end method

.method public final reset()V
    .locals 1

    .line 165
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->useHttp:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->notice:Ljava/lang/String;

    return-void
.end method

.method public final rewrite(Lcom/pymcl/ai/AiEndpoint;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "ep"    # Lcom/pymcl/ai/AiEndpoint;
    .param p2, "url"    # Ljava/lang/String;

    const-string v0, "ep"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 167
    invoke-virtual {p1}, Lcom/pymcl/ai/AiEndpoint;->getBuiltinHost()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->useHttp:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "https://"

    const/4 v3, 0x0

    invoke-static {p2, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {p2, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "http://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public final takeNotice()Ljava/lang/String;
    .locals 2

    .line 164
    iget-object v0, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->notice:Ljava/lang/String;

    .local v0, "n":Ljava/lang/String;
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/pymcl/ai/BuiltinHttpFallback;->notice:Ljava/lang/String;

    return-object v0
.end method
