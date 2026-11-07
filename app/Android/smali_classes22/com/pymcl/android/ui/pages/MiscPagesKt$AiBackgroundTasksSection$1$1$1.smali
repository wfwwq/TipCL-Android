.class final Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;
.super Ljava/lang/Object;
.source "MiscPages.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lkotlinx/coroutines/flow/FlowCollector;"
    }
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


# instance fields
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $tasks$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $titles$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/BgTaskInfo;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "e"    # Lcom/pymcl/ai/BgTaskInfo;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/ai/BgTaskInfo;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v1, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Lcom/pymcl/android/data/AiTaskCenter;->merge(Ljava/util/List;Lcom/pymcl/ai/BgTaskInfo;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$4(Landroidx/compose/runtime/MutableState;Ljava/util/List;)V

    sget-object v0, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$tasks$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$3(Landroidx/compose/runtime/MutableState;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$lambda$6(Landroidx/compose/runtime/MutableState;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/pymcl/android/data/AiTaskCenter;->needsChatRefresh(Ljava/util/List;Ljava/util/Map;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->$titles$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->access$AiBackgroundTasksSection$refreshTitles(Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 388
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/pages/MiscPagesKt$AiBackgroundTasksSection$1$1$1;->emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
