.class public final Lcom/pymcl/android/data/AiItemReducer$Companion;
.super Ljava/lang/Object;
.source "AiBridge.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/data/AiItemReducer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\u0008\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiItemReducer$Companion;",
        "",
        "<init>",
        "()V",
        "isDiscarded",
        "",
        "it",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "pendingText",
        "",
        "titles",
        "",
        "bgItem",
        "Lcom/pymcl/android/ui/state/AiItem$Tool;",
        "t",
        "Lcom/pymcl/ai/BgTaskInfo;",
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
.method private constructor <init>()V
    .locals 0

    .line 166
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/data/AiItemReducer$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final bgItem(Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/android/ui/state/AiItem$Tool;
    .locals 12
    .param p1, "t"    # Lcom/pymcl/ai/BgTaskInfo;

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    new-instance v1, Lcom/pymcl/android/ui/state/AiItem$Tool;

    .line 172
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getCallId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getTool()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getProgress()Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_0
    move-object v5, v0

    .line 173
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getState()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    const-string v7, "running"

    sparse-switch v6, :sswitch_data_0

    :goto_1
    goto :goto_2

    :sswitch_0
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    goto :goto_3

    :sswitch_1
    const-string v6, "cancelled"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    sget-object v0, Lcom/pymcl/android/ui/state/TaskState;->Cancelled:Lcom/pymcl/android/ui/state/TaskState;

    goto :goto_3

    :sswitch_2
    const-string v6, "ok"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    sget-object v0, Lcom/pymcl/android/ui/state/TaskState;->Done:Lcom/pymcl/android/ui/state/TaskState;

    goto :goto_3

    :goto_2
    sget-object v0, Lcom/pymcl/android/ui/state/TaskState;->Failed:Lcom/pymcl/android/ui/state/TaskState;

    :goto_3
    move-object v6, v0

    .line 174
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getState()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    if-eqz v7, :cond_4

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v7, "\u540e\u53f0\uff1a"

    new-array v11, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v7, v11}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v7, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getDetail()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v11, v10, v9, v8}, Lcom/pymcl/ai/AiText;->display$default(Lcom/pymcl/ai/AiText;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_4
    move-object v7, v0

    goto :goto_5

    :cond_4
    const-string v7, "interrupted"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    const-string v7, "\u540e\u53f0\u4efb\u52a1\u88ab\u4e2d\u65ad"

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v0, v7, v8}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_5
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getDetail()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7, v10, v9, v8}, Lcom/pymcl/ai/AiText;->display$default(Lcom/pymcl/ai/AiText;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 171
    :goto_5
    invoke-direct/range {v1 .. v7}, Lcom/pymcl/android/ui/state/AiItem$Tool;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;)V

    .line 175
    return-object v1

    :sswitch_data_0
    .sparse-switch
        0xddc -> :sswitch_2
        0x1c682951 -> :sswitch_1
        0x5c6f15bf -> :sswitch_0
    .end sparse-switch
.end method

.method public final isDiscarded(Lcom/pymcl/android/ui/state/AiItem;)Z
    .locals 3
    .param p1, "it"    # Lcom/pymcl/android/ui/state/AiItem;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    instance-of v0, p1, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AiItem$Assistant;->getText()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AiItem$Assistant;->getStreaming()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/ui/state/AiItem$Assistant;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AiItem$Assistant;->getThinking()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    move v1, v2

    :cond_1
    return v1
.end method

.method public final pendingText(Ljava/util/List;)Ljava/lang/String;
    .locals 11
    .param p1, "titles"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "titles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, p1

    check-cast v2, Ljava/lang/Iterable;

    const-string v3, "\u3001"

    check-cast v3, Ljava/lang/CharSequence;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x50

    invoke-static {v2, v3}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "\u8fd8\u6709 {0} \u4e2a\u540e\u53f0\u4efb\u52a1\u5728\u8fd0\u884c\uff08{1}\uff09\uff0c\u5b8c\u6210\u540e\u52a9\u624b\u4f1a\u56de\u6765\u6c47\u62a5"

    invoke-virtual {v0, v2, v1}, Lcom/pymcl/ai/AiText;->t(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
