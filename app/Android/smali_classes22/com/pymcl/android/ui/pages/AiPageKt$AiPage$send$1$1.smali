.class final Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$send$1$1;
.super Ljava/lang/Object;
.source "AiPage.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$send$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic $s:Lcom/pymcl/android/ui/pages/AiSession;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/pages/AiSession;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$send$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Lcom/pymcl/android/ui/state/AiItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "it"    # Lcom/pymcl/android/ui/state/AiItem;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AiItem;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 151
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$send$1$1;->$s:Lcom/pymcl/android/ui/pages/AiSession;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/ui/pages/AiSession;->upsert(Lcom/pymcl/android/ui/state/AiItem;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 151
    move-object v0, p1

    check-cast v0, Lcom/pymcl/android/ui/state/AiItem;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/ui/pages/AiPageKt$AiPage$send$1$1;->emit(Lcom/pymcl/android/ui/state/AiItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
