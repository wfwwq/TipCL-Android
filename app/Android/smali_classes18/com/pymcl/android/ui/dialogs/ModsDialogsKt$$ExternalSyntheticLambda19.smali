.class public final synthetic Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/InstalledEntry;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/InstalledEntry;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda19;->f$0:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda19;->f$1:Lcom/pymcl/android/ui/state/InstalledEntry;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda19;->f$0:Landroidx/compose/runtime/snapshots/SnapshotStateMap;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda19;->f$1:Lcom/pymcl/android/ui/state/InstalledEntry;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->$r8$lambda$bc3g2hqtPTTe1XVMkMNkWOdLxYE(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Lcom/pymcl/android/ui/state/InstalledEntry;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
