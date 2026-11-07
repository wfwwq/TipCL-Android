.class public final Lcom/pymcl/android/ui/state/AppViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "AppState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\t\u00ca\u0001\u000c\u0008\u000b\u0012\u0008\u0008\u000c\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/AppViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "application",
        "Landroid/app/Application;",
        "<init>",
        "(Landroid/app/Application;)V",
        "state",
        "Lcom/pymcl/android/ui/state/AppState;",
        "getState",
        "()Lcom/pymcl/android/ui/state/AppState;",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final state:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/ui/state/AppViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 6
    .param p1, "application"    # Landroid/app/Application;

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    invoke-direct {p0, p1}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 329
    new-instance v0, Lcom/pymcl/android/ui/state/AppState;

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi;

    move-object v2, p1

    check-cast v2, Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/pymcl/android/data/RepositoryUiApi;-><init>(Landroid/content/Context;)V

    check-cast v1, Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-object v2, p0

    check-cast v2, Landroidx/lifecycle/ViewModel;

    invoke-static {v2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/AppState;-><init>(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlinx/coroutines/CoroutineScope;)V

    move-object v1, v0

    .local v1, "it\\1":Lcom/pymcl/android/ui/state/AppState;
    const/4 v2, 0x0

    .line 330
    .local v2, "$i$a$-also-AppViewModel$state$1\\1\\329\\0":I
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->loadInitial()Lkotlinx/coroutines/Job;

    .line 331
    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getModWatcher()Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-result-object v3

    sget-object v4, Lcom/pymcl/android/data/LauncherPrefs;->INSTANCE:Lcom/pymcl/android/data/LauncherPrefs;

    move-object v5, p1

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v4, v5}, Lcom/pymcl/android/data/LauncherPrefs;->store(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v4

    move-object v5, p0

    check-cast v5, Landroidx/lifecycle/ViewModel;

    invoke-static {v5}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->attach(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Lkotlinx/coroutines/CoroutineScope;)V

    .line 332
    nop

    .line 329
    .end local v1    # "it\\1":Lcom/pymcl/android/ui/state/AppState;
    .end local v2    # "$i$a$-also-AppViewModel$state$1\\1\\329\\0":I
    iput-object v0, p0, Lcom/pymcl/android/ui/state/AppViewModel;->state:Lcom/pymcl/android/ui/state/AppState;

    .line 328
    return-void
.end method


# virtual methods
.method public final getState()Lcom/pymcl/android/ui/state/AppState;
    .locals 1

    .line 329
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppViewModel;->state:Lcom/pymcl/android/ui/state/AppState;

    return-object v0
.end method
