.class public final synthetic Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/snapshots/SnapshotStateMap;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$0:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$5:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$0:Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda98;->f$5:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->$r8$lambda$dV1yYep37wJ-EZFKBFBXK87YfH0(Lcom/pymcl/android/ui/state/DialogSpec$ExportModpack;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/snapshots/SnapshotStateMap;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
