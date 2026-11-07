.class final Lcom/pymcl/android/ui/state/AppState$reload$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "AppState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;->reload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.android.ui.state.AppState"
    f = "AppState.kt"
    i = {
        0x0,
        0x1,
        0x1,
        0x2,
        0x2,
        0x2
    }
    l = {
        0x98,
        0x9b,
        0x9f
    }
    m = "reload"
    n = {
        "$this$reload_u24lambda_u240\\1",
        "$this$reload_u24lambda_u240\\1",
        "inst\\1",
        "$this$reload_u24lambda_u240\\1",
        "inst\\1",
        "vers\\1"
    }
    nl = {
        0x99,
        0x9c,
        0xa0
    }
    s = {
        "L$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/AppState$reload$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$reload$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState$reload$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState$reload$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/AppState;->reload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
