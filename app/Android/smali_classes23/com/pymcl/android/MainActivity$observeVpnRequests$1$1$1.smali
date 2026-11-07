.class final Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/pymcl/android/MainActivity$observeVpnRequests$1$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
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
.field final synthetic $$this$repeatOnLifecycle:Lkotlinx/coroutines/CoroutineScope;

.field final synthetic $mp:Lcom/pymcl/multiplayer/MultiplayerController;

.field final synthetic this$0:Lcom/pymcl/android/MainActivity;


# direct methods
.method constructor <init>(Lcom/pymcl/android/MainActivity;Lkotlinx/coroutines/CoroutineScope;Lcom/pymcl/multiplayer/MultiplayerController;)V
    .locals 0

    iput-object p1, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->this$0:Lcom/pymcl/android/MainActivity;

    iput-object p2, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->$$this$repeatOnLifecycle:Lkotlinx/coroutines/CoroutineScope;

    iput-object p3, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->$mp:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "intent"    # Landroid/content/Intent;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 37
    if-nez p1, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 38
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->this$0:Lcom/pymcl/android/MainActivity;

    const-string v1, "android.permission.POST_NOTIFICATIONS"

    invoke-virtual {v0, v1}, Lcom/pymcl/android/MainActivity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 39
    iget-object v0, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->$$this$repeatOnLifecycle:Lkotlinx/coroutines/CoroutineScope;

    iget-object v2, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->this$0:Lcom/pymcl/android/MainActivity;

    :try_start_0
    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 80
    .local v0, "$this$emit_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    const/4 v3, 0x0

    .line 39
    .local v3, "$i$a$-runCatching-MainActivity$observeVpnRequests$1$1$1$1\\1\\39\\0":I
    invoke-static {v2}, Lcom/pymcl/android/MainActivity;->access$getNotifLauncher$p(Lcom/pymcl/android/MainActivity;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .end local v0    # "$this$emit_u24lambda_u240\\1":Lkotlinx/coroutines/CoroutineScope;
    .end local v3    # "$i$a$-runCatching-MainActivity$observeVpnRequests$1$1$1$1\\1\\39\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->$$this$repeatOnLifecycle:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->this$0:Lcom/pymcl/android/MainActivity;

    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 80
    .local v0, "$this$emit_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    const/4 v2, 0x0

    .line 40
    .local v2, "$i$a$-runCatching-MainActivity$observeVpnRequests$1$1$1$2\\2\\40\\0":I
    invoke-static {v1}, Lcom/pymcl/android/MainActivity;->access$getVpnLauncher$p(Lcom/pymcl/android/MainActivity;)Landroidx/activity/result/ActivityResultLauncher;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .end local v0    # "$this$emit_u24lambda_u241\\2":Lkotlinx/coroutines/CoroutineScope;
    .end local v2    # "$i$a$-runCatching-MainActivity$observeVpnRequests$1$1$1$2\\2\\40\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    iget-object v1, p0, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->$mp:Lcom/pymcl/multiplayer/MultiplayerController;

    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 80
    .local v0, "it\\4":Ljava/lang/Throwable;
    const/4 v2, 0x0

    .line 40
    .local v2, "$i$a$-onFailure-MainActivity$observeVpnRequests$1$1$1$3\\4\\40\\0":I
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Lcom/pymcl/multiplayer/MultiplayerController;->onVpnPermissionResult(Z)V

    .line 41
    .end local v0    # "it\\4":Ljava/lang/Throwable;
    .end local v2    # "$i$a$-onFailure-MainActivity$observeVpnRequests$1$1$1$3\\4\\40\\0":I
    :cond_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "value"    # Ljava/lang/Object;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 36
    move-object v0, p1

    check-cast v0, Landroid/content/Intent;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/android/MainActivity$observeVpnRequests$1$1$1;->emit(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
