.class public interface abstract Lcom/pymcl/android/data/AiUiExtras;
.super Ljava/lang/Object;
.source "AiBridge.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/AiUiExtras$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J.\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH&J\u0008\u0010\u000c\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH&J$\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0003H&J,\u0010\u0013\u001a\u00020\u00032\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00160\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0003H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0007H&J\u000e\u0010\u0019\u001a\u00020\u001aH\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u0016H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tH\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001f\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\"J\u001c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020%0\u00162\u0006\u0010\n\u001a\u00020\tH\u00a6@\u00a2\u0006\u0002\u0010\"J \u0010&\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00162\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(H\u00a6@\u00a2\u0006\u0002\u0010)J&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0+2\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010(H\u00a6@\u00a2\u0006\u0002\u0010)J\u000e\u0010,\u001a\u00020(H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ\u0016\u0010-\u001a\u00020\r2\u0006\u0010\'\u001a\u00020(H\u00a6@\u00a2\u0006\u0002\u0010)J\u0010\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200H\u0016J\n\u00101\u001a\u0004\u0018\u00010\tH\u0016J\u0014\u00102\u001a\u0008\u0012\u0004\u0012\u0002030\u0016H\u00a6@\u00a2\u0006\u0002\u0010\u001bJ.\u00104\u001a\u00020\r2\u0006\u00105\u001a\u00020\t2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u00108J\u0016\u00109\u001a\u00020\r2\u0006\u0010:\u001a\u000203H\u00a6@\u00a2\u0006\u0002\u0010;J\u0008\u0010<\u001a\u00020\tH&J\u000e\u0010A\u001a\u0008\u0012\u0004\u0012\u00020>0\u0016H\u0016J\u0010\u0010B\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\tH\u0016J\u0014\u0010C\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u000e\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0016H\u0016J\u000e\u0010F\u001a\u0008\u0012\u0004\u0012\u00020G0\u0016H\u0016J\u0008\u0010H\u001a\u00020IH\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0002\u0010\u0004R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020>0\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008?\u0010@\u00a8\u0006J\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiUiExtras;",
        "",
        "isRunning",
        "",
        "()Z",
        "send",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/pymcl/ai/AiEvent;",
        "text",
        "",
        "chatId",
        "hidden",
        "stop",
        "",
        "steer",
        "confirm",
        "ok",
        "always",
        "global",
        "answer",
        "answers",
        "",
        "",
        "skipped",
        "pendingCard",
        "rewind",
        "Lcom/pymcl/ai/RewindOutcome;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "chats",
        "Lcom/pymcl/android/ui/state/ChatSummary;",
        "activeChat",
        "newChat",
        "setActive",
        "id",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteChat",
        "history",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "models",
        "st",
        "Lcom/pymcl/ai/AiSettings;",
        "(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "testConnection",
        "Lkotlin/Pair;",
        "settings",
        "saveSettings",
        "describeError",
        "e",
        "",
        "takeNetNotice",
        "rules",
        "Lcom/pymcl/android/ui/state/PermissionRule;",
        "addRule",
        "tool",
        "behavior",
        "content",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "removeRule",
        "rule",
        "(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "usageText",
        "backgroundEvents",
        "Lcom/pymcl/ai/BgTaskInfo;",
        "getBackgroundEvents",
        "()Lkotlinx/coroutines/flow/Flow;",
        "backgroundTasks",
        "cancelTask",
        "needsReport",
        "report",
        "mcpToolNames",
        "mcpStatus",
        "Lcom/pymcl/ai/McpServerStatus;",
        "clearFinishedTasks",
        "Lcom/pymcl/ai/BgClearResult;",
        "PyMCL-Android:app_debug"
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
.method public static synthetic access$backgroundTasks$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->backgroundTasks()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$cancelTask$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "id"    # Ljava/lang/String;

    .line 19
    invoke-super {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->cancelTask(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$clearFinishedTasks$jd(Lcom/pymcl/android/data/AiUiExtras;)Lcom/pymcl/ai/BgClearResult;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->clearFinishedTasks()Lcom/pymcl/ai/BgClearResult;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$describeError$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "e"    # Ljava/lang/Throwable;

    .line 19
    invoke-super {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->describeError(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$getBackgroundEvents$jd(Lcom/pymcl/android/data/AiUiExtras;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->getBackgroundEvents()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$mcpStatus$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->mcpStatus()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$mcpToolNames$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->mcpToolNames()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$needsReport$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "chatId"    # Ljava/lang/String;

    .line 19
    invoke-super {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static synthetic access$report$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "chatId"    # Ljava/lang/String;

    .line 19
    invoke-super {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic access$takeNetNotice$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;

    .line 19
    invoke-super {p0}, Lcom/pymcl/android/data/AiUiExtras;->takeNetNotice()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic answer$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/util/Map;ZILjava/lang/Object;)Z
    .locals 0

    .line 25
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/pymcl/android/data/AiUiExtras;->answer(Ljava/util/Map;Z)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: answer"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic confirm$default(Lcom/pymcl/android/data/AiUiExtras;ZZZILjava/lang/Object;)Z
    .locals 1

    .line 24
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiUiExtras;->confirm(ZZZ)Z

    move-result p0

    return p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: confirm"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic models$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 35
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/pymcl/android/data/AiUiExtras;->models(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: models"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic needsReport$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 0

    .line 55
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->needsReport(Ljava/lang/String;)Z

    move-result p0

    return p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: needsReport"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic report$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 57
    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: report"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic send$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 1

    .line 21
    if-nez p5, :cond_2

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move-object p3, v0

    :cond_1
    invoke-interface {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiUiExtras;->send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: send"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic testConnection$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-interface {p0, p1, p2}, Lcom/pymcl/android/data/AiUiExtras;->testConnection(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: testConnection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract activeChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract addRule(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract answer(Ljava/util/Map;Z)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;Z)Z"
        }
    .end annotation
.end method

.method public backgroundTasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 52
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public cancelTask(Ljava/lang/String;)Z
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x0

    return v0
.end method

.method public abstract chats(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public clearFinishedTasks()Lcom/pymcl/ai/BgClearResult;
    .locals 3

    .line 63
    new-instance v0, Lcom/pymcl/ai/BgClearResult;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/pymcl/ai/BgClearResult;-><init>(Ljava/util/List;II)V

    return-object v0
.end method

.method public abstract confirm(ZZZ)Z
.end method

.method public abstract deleteChat(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public describeError(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1
    .param p1, "e"    # Ljava/lang/Throwable;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getBackgroundEvents()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .line 51
    invoke-static {}, Lkotlinx/coroutines/flow/FlowKt;->emptyFlow()Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public abstract history(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract isRunning()Z
.end method

.method public mcpStatus()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;"
        }
    .end annotation

    .line 59
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public mcpToolNames()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 58
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public abstract models(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public needsReport(Ljava/lang/String;)Z
    .locals 1
    .param p1, "chatId"    # Ljava/lang/String;

    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public abstract newChat(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract pendingCard()Lcom/pymcl/ai/AiEvent;
.end method

.method public abstract removeRule(Lcom/pymcl/android/ui/state/PermissionRule;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation

    .line 57
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract rewind(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/RewindOutcome;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract rules(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract saveSettings(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation
.end method

.method public abstract setActive(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract settings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/ai/AiSettings;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract steer(Ljava/lang/String;)Z
.end method

.method public abstract stop()V
.end method

.method public takeNetNotice()Ljava/lang/String;
    .locals 1

    .line 43
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract testConnection(Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/AiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract usageText()Ljava/lang/String;
.end method
