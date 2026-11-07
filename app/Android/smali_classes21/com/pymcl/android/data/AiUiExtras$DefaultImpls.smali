.class public final Lcom/pymcl/android/data/AiUiExtras$DefaultImpls;
.super Ljava/lang/Object;
.source "AiBridge.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/AiUiExtras;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic answer$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/util/Map;ZILjava/lang/Object;)Z
    .locals 0

    .line 25
    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/AiUiExtras;->answer$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/util/Map;ZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static backgroundTasks(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 52
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$backgroundTasks$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static cancelTask(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "id"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->access$cancelTask$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static clearFinishedTasks(Lcom/pymcl/android/data/AiUiExtras;)Lcom/pymcl/ai/BgClearResult;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 63
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$clearFinishedTasks$jd(Lcom/pymcl/android/data/AiUiExtras;)Lcom/pymcl/ai/BgClearResult;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic confirm$default(Lcom/pymcl/android/data/AiUiExtras;ZZZILjava/lang/Object;)Z
    .locals 0

    .line 24
    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/data/AiUiExtras;->confirm$default(Lcom/pymcl/android/data/AiUiExtras;ZZZILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static describeError(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "e"    # Ljava/lang/Throwable;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->access$describeError$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getBackgroundEvents(Lcom/pymcl/android/data/AiUiExtras;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 51
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$getBackgroundEvents$jd(Lcom/pymcl/android/data/AiUiExtras;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static mcpStatus(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/McpServerStatus;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 59
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$mcpStatus$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static mcpToolNames(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 58
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$mcpToolNames$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic models$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 35
    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/AiUiExtras;->models$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static needsReport(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 55
    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->access$needsReport$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static synthetic needsReport$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Z
    .locals 0

    .line 55
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiUiExtras;->needsReport$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static report(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .param p1, "chatId"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/ai/AiEvent;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 57
    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiUiExtras;->access$report$jd(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic report$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 57
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/data/AiUiExtras;->report$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic send$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 21
    invoke-static/range {p0 .. p5}, Lcom/pymcl/android/data/AiUiExtras;->send$default(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object p0

    return-object p0
.end method

.method public static takeNetNotice(Lcom/pymcl/android/data/AiUiExtras;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/AiUiExtras;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 43
    invoke-static {p0}, Lcom/pymcl/android/data/AiUiExtras;->access$takeNetNotice$jd(Lcom/pymcl/android/data/AiUiExtras;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic testConnection$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 36
    invoke-static {p0, p1, p2, p3, p4}, Lcom/pymcl/android/data/AiUiExtras;->testConnection$default(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/ai/AiSettings;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
