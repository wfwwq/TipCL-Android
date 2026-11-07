.class public final Lcom/pymcl/android/ui/state/AppState$special$$inlined$CoroutineExceptionHandler$1;
.super Lkotlin/coroutines/AbstractCoroutineContextElement;
.source "CoroutineExceptionHandler.kt"

# interfaces
.implements Lkotlinx/coroutines/CoroutineExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/state/AppState;-><init>(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlinx/coroutines/CoroutineScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 AppState.kt\ncom/pymcl/android/ui/state/AppState\n*L\n1#1,49:1\n141#2:50\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t\u00b8\u0006\u0000"
    }
    d2 = {
        "kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1",
        "Lkotlin/coroutines/AbstractCoroutineContextElement;",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "handleException",
        "",
        "context",
        "Lkotlin/coroutines/CoroutineContext;",
        "exception",
        "",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/CoroutineExceptionHandler$Key;Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0
    .param p1, "$super_call_param$1"    # Lkotlinx/coroutines/CoroutineExceptionHandler$Key;

    iput-object p2, p0, Lcom/pymcl/android/ui/state/AppState$special$$inlined$CoroutineExceptionHandler$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    .line 47
    move-object p2, p1

    check-cast p2, Lkotlin/coroutines/CoroutineContext$Key;

    invoke-direct {p0, p2}, Lkotlin/coroutines/AbstractCoroutineContextElement;-><init>(Lkotlin/coroutines/CoroutineContext$Key;)V

    return-void
.end method


# virtual methods
.method public handleException(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V
    .locals 6
    .param p1, "context"    # Lkotlin/coroutines/CoroutineContext;
    .param p2, "exception"    # Ljava/lang/Throwable;

    .line 49
    move-object v0, p2

    .local v0, "e\\1":Ljava/lang/Throwable;
    const/4 v1, 0x0

    .line 50
    .local v1, "$i$a$-CoroutineExceptionHandler-AppState$errors$1\\1\\49\\0":I
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState$special$$inlined$CoroutineExceptionHandler$1;->this$0:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_0
    const-string v4, "error"

    const-string v5, "\u64cd\u4f5c\u5931\u8d25"

    invoke-virtual {v2, v5, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .end local v0    # "e\\1":Ljava/lang/Throwable;
    .end local v1    # "$i$a$-CoroutineExceptionHandler-AppState$errors$1\\1\\49\\0":I
    return-void
.end method
