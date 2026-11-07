.class final Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "RepositoryUiApiExt.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/data/RepositoryUiApiExt;->setGlobalModEnabled(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.pymcl.android.data.RepositoryUiApiExt"
    f = "RepositoryUiApiExt.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x8a
    }
    m = "setGlobalModEnabled"
    n = {
        "filename",
        "enabled"
    }
    nl = {
        -0x1
    }
    s = {
        "L$0",
        "Z$0"
    }
    v = 0x2
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field Z$0:Z

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/RepositoryUiApiExt;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/RepositoryUiApiExt;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;->result:Ljava/lang/Object;

    iget v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;->label:I

    const/high16 v1, -0x80000000

    or-int/2addr v0, v1

    iput v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;->label:I

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$setGlobalModEnabled$1;->this$0:Lcom/pymcl/android/data/RepositoryUiApiExt;

    const/4 v1, 0x0

    move-object v2, p0

    check-cast v2, Lkotlin/coroutines/Continuation;

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lcom/pymcl/android/data/RepositoryUiApiExt;->setGlobalModEnabled(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
