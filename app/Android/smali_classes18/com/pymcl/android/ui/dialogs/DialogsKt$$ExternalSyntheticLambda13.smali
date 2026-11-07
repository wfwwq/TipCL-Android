.class public final synthetic Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/DialogSpec;

.field public final synthetic f$3:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/DialogSpec;Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$1:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$2:Lcom/pymcl/android/ui/state/DialogSpec;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$3:Lcom/pymcl/android/ui/state/AppState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$1:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$2:Lcom/pymcl/android/ui/state/DialogSpec;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda13;->f$3:Lcom/pymcl/android/ui/state/AppState;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/RowScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->$r8$lambda$ev-sWXZRK4ciSI0uA-uIia1YUZM(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/DialogSpec;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
