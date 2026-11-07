.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;
.super Ljava/lang/Object;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiFixWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiFixWindow.kt\ncom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"
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

.field final synthetic $chatId$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $id:Ljava/lang/String;

.field final synthetic $items:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $running$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $x:Lcom/pymcl/android/data/AiUiExtras;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/pymcl/android/data/AiUiExtras;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$id:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "t"    # Lcom/pymcl/ai/BgTaskInfo;
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

    .line 95
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getChatId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$id:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    sget-object v1, Lcom/pymcl/android/data/AiItemReducer;->Companion:Lcom/pymcl/android/data/AiItemReducer$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/android/data/AiItemReducer$Companion;->bgItem(Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/android/ui/state/AiItem$Tool;

    move-result-object v1

    check-cast v1, Lcom/pymcl/android/ui/state/AiItem;

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$upsert(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lcom/pymcl/android/ui/state/AiItem;)V

    .line 97
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$3(Landroidx/compose/runtime/MutableState;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$x:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$id:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, v0

    .line 148
    .local v6, "it\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v0, 0x0

    .line 97
    .local v0, "$i$a$-let-AiFixWindowKt$AiFixWindow$2$1$1$1\\1\\97\\0":I
    invoke-static/range {v1 .. v6}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .line 98
    .end local v0    # "$i$a$-let-AiFixWindowKt$AiFixWindow$2$1$1$1\\1\\97\\0":I
    .end local v6    # "it\\1":Lkotlinx/coroutines/flow/Flow;
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 94
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$2$1$1;->emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
