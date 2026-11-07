.class public final synthetic Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/InstalledEntry;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstalledEntry;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$1:Lcom/pymcl/android/ui/state/InstalledEntry;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$3:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$1:Lcom/pymcl/android/ui/state/InstalledEntry;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt$$ExternalSyntheticLambda33;->f$3:Landroidx/compose/runtime/MutableState;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/pymcl/android/ui/dialogs/ModsDialogsKt;->$r8$lambda$bd3_yTY7sWzZSXTDvbk6LQvGXqI(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstalledEntry;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
