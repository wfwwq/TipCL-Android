.class final Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;
.super Ljava/lang/Object;
.source "AiFixWindow.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->AiFixWindow(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CrashInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
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
.field final synthetic $ai:Lcom/pymcl/android/data/AiUiExtras;

.field final synthetic $chatId$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $info:Lcom/pymcl/android/ui/state/CrashInfo;

.field final synthetic $items:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $running$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/pymcl/android/ui/state/AppState;

.field final synthetic $visible:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/snapshots/SnapshotStateList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/AiUiExtras;",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/ui/state/CrashInfo;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/pymcl/android/ui/state/AppState;",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$visible:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 14

    .line 130
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$3(Landroidx/compose/runtime/MutableState;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$state:Lcom/pymcl/android/ui/state/AppState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$running$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$items:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$ai:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$visible:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$chatId$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v7}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$lambda$9(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/pymcl/android/data/AiFixPrompt;->INSTANCE:Lcom/pymcl/android/data/AiFixPrompt;

    iget-object v9, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$AiFixWindow$3$1$3$3$1$2$1$1;->$info:Lcom/pymcl/android/ui/state/CrashInfo;

    const/4 v12, 0x6

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lcom/pymcl/android/data/AiFixPrompt;->hidden$default(Lcom/pymcl/android/data/AiFixPrompt;Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v6, v7, v8}, Lcom/pymcl/android/data/AiUiExtras;->send(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->access$AiFixWindow$runFix(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateList;Landroidx/compose/runtime/MutableState;Lkotlinx/coroutines/flow/Flow;)V

    :cond_0
    return-void
.end method
