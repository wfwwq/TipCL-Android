.class final Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "ModsDialogs.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->ModsSheet(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec$Mods;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nModsDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,306:1\n2068#2,2:307\n*S KotlinDebug\n*F\n+ 1 ModsDialogs.kt\ncom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1\n*L\n128#1:307,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.pymcl.android.ui.dialogs.ModsDialogsKt$ModsSheet$4$4$1$1"
    f = "ModsDialogs.kt"
    i = {}
    l = {
        0x7f
    }
    m = "invokeSuspend"
    n = {}
    nl = {
        0x80
    }
    s = {}
    v = 0x2
.end annotation


# instance fields
.field final synthetic $busy$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $inst:Ljava/lang/String;

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $updates$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $ver$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method constructor <init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$inst:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$inst:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12
    .param p1, "$result"    # Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 125
    iget v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, p1

    goto :goto_0

    .line 131
    :catchall_0
    move-exception v0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_3

    .line 125
    :pswitch_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 126
    nop

    .line 127
    :try_start_1
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/AppState;->getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;

    move-result-object v1

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$inst:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v5}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v5

    move-object v6, p0

    check-cast v6, Lkotlin/coroutines/Continuation;

    iput v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->label:I

    invoke-interface {v1, v4, v5, v6}, Lcom/pymcl/android/ui/state/LauncherUiApi;->checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_0

    .line 125
    return-object v0

    :cond_0
    :goto_0
    check-cast v1, Ljava/util/Map;

    .line 128
    .local v1, "u":Ljava/util/Map;
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$updates$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$17(Landroidx/compose/runtime/MutableState;Ljava/util/Map;)V

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateMap;->clear()V

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$chosen:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 307
    .local v5, "$i$f$forEach\\1\\128":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\1":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\2":Ljava/lang/String;
    const/4 v9, 0x0

    .line 128
    .local v9, "$i$a$-forEach-ModsDialogsKt$ModsSheet$4$4$1$1$1\\2\\307\\0":I
    move-object v10, v4

    check-cast v10, Ljava/util/Map;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-interface {v10, v8, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v7    # "element\\1":Ljava/lang/Object;
    .end local v8    # "it\\2":Ljava/lang/String;
    .end local v9    # "$i$a$-forEach-ModsDialogsKt$ModsSheet$4$4$1$1$1\\2\\307\\0":I
    goto :goto_1

    .line 308
    :cond_1
    nop

    .line 129
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v5    # "$i$f$forEach\\1\\128":I
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getModWatcher()Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;->getDetails()Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$inst:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$ver$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v4}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$4(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v5, "\u90fd\u662f\u6700\u65b0\u7684"

    const-string v6, "\u6ca1\u6709\u627e\u5230\u53ef\u66f4\u65b0\u7684\u6a21\u7ec4"

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v2, "{0} \u4e2a\u6a21\u7ec4\u6709\u66f4\u65b0"

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v4

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "\u52fe\u4e0a\u8981\u66f4\u65b0\u7684\uff0c\u65e7\u6587\u4ef6\u4f1a\u5728\u65b0\u5305\u6821\u9a8c\u901a\u8fc7\u540e\u624d\u5220\u9664\u3002"

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v4, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "info"

    invoke-virtual {v0, v2, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .end local v1    # "u":Ljava/util/Map;
    :goto_2
    goto :goto_4

    .local v0, "e":Ljava/lang/Exception;
    :goto_3
    :try_start_2
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    const-string v2, "\u68c0\u67e5\u66f4\u65b0\u5931\u8d25"

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_3
    const-string v5, "error"

    invoke-virtual {v1, v2, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v0    # "e":Ljava/lang/Exception;
    :goto_4
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$21(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 132
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 131
    :goto_5
    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$ModsSheet$4$4$1$1;->$busy$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1, v3}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->access$ModsSheet$lambda$21(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
