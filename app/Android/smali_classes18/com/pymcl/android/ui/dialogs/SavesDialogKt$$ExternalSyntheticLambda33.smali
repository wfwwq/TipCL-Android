.class public final synthetic Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/instance/SaveManager;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Landroid/content/Context;

.field public final synthetic f$3:Lcom/pymcl/core/instance/SaveInfo;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lcom/pymcl/core/instance/SaveInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$0:Lcom/pymcl/core/instance/SaveManager;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$3:Lcom/pymcl/core/instance/SaveInfo;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$5:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$0:Lcom/pymcl/core/instance/SaveManager;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$2:Landroid/content/Context;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$3:Lcom/pymcl/core/instance/SaveInfo;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda33;->f$5:Landroidx/compose/runtime/MutableIntState;

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->$r8$lambda$GqyDwUen7KWX2JK-S-YmB8iX0-k(Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/android/ui/state/AppState;Landroid/content/Context;Lcom/pymcl/core/instance/SaveInfo;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
