.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;
.super Ljava/lang/Object;
.source "AiPage.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nAiPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiPage.kt\ncom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,517:1\n1#2:518\n*E\n"
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

.field final synthetic $chats$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/pages/AiSession;",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
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

    .line 159
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getChatId()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/pages/AiSession;->getActiveChat()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 160
    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    sget-object v1, Lcom/pymcl/android/data/AiItemReducer;->Companion:Lcom/pymcl/android/data/AiItemReducer$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/android/data/AiItemReducer$Companion;->bgItem(Lcom/pymcl/ai/BgTaskInfo;)Lcom/pymcl/android/ui/state/AiItem$Tool;

    move-result-object v1

    check-cast v1, Lcom/pymcl/android/ui/state/AiItem;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/pages/AiSession;->upsert(Lcom/pymcl/android/ui/state/AiItem;)V

    .line 161
    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getRunning()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/pages/AiSession;->getRunning()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    invoke-virtual {p1}, Lcom/pymcl/ai/BgTaskInfo;->getChatId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/pymcl/android/data/AiUiExtras;->report(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->$chats$delegate:Landroidx/compose/runtime/MutableState;

    .line 518
    .local v0, "it\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v5, 0x0

    .line 161
    .local v5, "$i$a$-let-AiPageKt$AiPage$2$1$2$1\\1\\161\\0":I
    invoke-static {v1, v2, v3, v4, v0}, Lcom/pymcl/android/ui/pages/AiPageKt;->access$AiPage$runFlow(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/pages/AiSession;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    .line 162
    .end local v0    # "it\\1":Lkotlinx/coroutines/flow/Flow;
    .end local v5    # "$i$a$-let-AiPageKt$AiPage$2$1$2$1\\1\\161\\0":I
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 158
    move-object v0, p1

    check-cast v0, Lcom/pymcl/ai/BgTaskInfo;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$2$1$2;->emit(Lcom/pymcl/ai/BgTaskInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
