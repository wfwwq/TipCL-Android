.class final Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;
.super Ljava/lang/Object;
.source "AiNavBadge.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $count$delegate:Landroidx/compose/runtime/MutableIntState;

.field final synthetic $ids:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableIntState;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$ids:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

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

    .line 33
    iget-object v0, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$ids:Lkotlin/jvm/internal/Ref$ObjectRef;

    sget-object v1, Lcom/pymcl/android/data/AiTaskCenter;->INSTANCE:Lcom/pymcl/android/data/AiTaskCenter;

    iget-object v2, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$ids:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Ljava/util/Set;

    invoke-virtual {v1, v2, p1}, Lcom/pymcl/android/data/AiTaskCenter;->applyRunning(Ljava/util/Set;Lcom/pymcl/ai/BgTaskInfo;)Ljava/util/Set;

    move-result-object v1

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v0, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$count$delegate:Landroidx/compose/runtime/MutableIntState;

    iget-object v1, p0, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->$ids:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/AiNavBadgeKt;->access$rememberAiRunningTasks$lambda$3(Landroidx/compose/runtime/MutableIntState;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 33
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/AiNavBadgeKt$rememberAiRunningTasks$1$1$1$1;->emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
