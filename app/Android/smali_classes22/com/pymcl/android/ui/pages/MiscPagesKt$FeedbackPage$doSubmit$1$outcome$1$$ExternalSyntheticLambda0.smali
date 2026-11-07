.class public final synthetic Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic f$1:Lcom/pymcl/runtime/settings/CrossProcessPrefs;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0;->f$0:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/pages/MiscPagesKt$FeedbackPage$doSubmit$1$outcome$1;->$r8$lambda$HWbErSRmQWF7tVUGWliaVfkhVT0(Lkotlinx/coroutines/CoroutineScope;Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
