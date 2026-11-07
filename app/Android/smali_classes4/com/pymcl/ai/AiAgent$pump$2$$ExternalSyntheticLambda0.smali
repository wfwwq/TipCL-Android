.class public final synthetic Lcom/pymcl/ai/AiAgent$pump$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/channels/Channel;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/channels/Channel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/ai/AiAgent$pump$2$$ExternalSyntheticLambda0;->f$0:Lkotlinx/coroutines/channels/Channel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/ai/AiAgent$pump$2$$ExternalSyntheticLambda0;->f$0:Lkotlinx/coroutines/channels/Channel;

    check-cast p1, Lcom/pymcl/ai/AiEvent;

    invoke-static {v0, p1}, Lcom/pymcl/ai/AiAgent$pump$2;->$r8$lambda$XZtkr0lVpGjBDW449H-8WN86OSg(Lkotlinx/coroutines/channels/Channel;Lcom/pymcl/ai/AiEvent;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
