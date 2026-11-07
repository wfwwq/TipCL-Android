.class final Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "LauncherUiApi.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/FakeLauncherUiApi;->launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.pymcl.android.ui.state.FakeLauncherUiApi"
    f = "LauncherUiApi.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0xa1
    }
    m = "launchGame"
    n = {
        "instance",
        "version",
        "onLog",
        "onProgress",
        "server",
        "i"
    }
    nl = {
        0xa2
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "I$0"
    }
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/android/ui/state/FakeLauncherUiApi;


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/FakeLauncherUiApi;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/FakeLauncherUiApi;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;->this$0:Lcom/pymcl/android/ui/state/FakeLauncherUiApi;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iput-object p1, p0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;->label:I

    iget-object v1, p0, Lcom/pymcl/android/ui/state/FakeLauncherUiApi$launchGame$1;->this$0:Lcom/pymcl/android/ui/state/FakeLauncherUiApi;

    const/4 v6, 0x0

    move-object v7, p0

    check-cast v7, Lkotlin/coroutines/Continuation;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v1 .. v7}, Lcom/pymcl/android/ui/state/FakeLauncherUiApi;->launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
