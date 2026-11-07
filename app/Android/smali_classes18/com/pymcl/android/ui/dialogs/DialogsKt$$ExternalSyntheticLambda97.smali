.class public final synthetic Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

.field public final synthetic f$2:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

.field public final synthetic f$3:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/AppState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$0:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$1:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$2:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$3:Lcom/pymcl/android/ui/state/AppState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$8:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$9:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$0:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$1:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$2:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$3:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$8:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda97;->f$9:Landroidx/compose/runtime/MutableState;

    move-object v10, p1

    check-cast v10, Landroidx/compose/foundation/layout/RowScope;

    move-object v11, p2

    check-cast v11, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-static/range {v0 .. v12}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->$r8$lambda$RZQcowWIiIh_80eFsmvafYYAjhM(Lkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/AppState;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
