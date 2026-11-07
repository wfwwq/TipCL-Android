.class public final synthetic Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/core/instance/MediaFile;

.field public final synthetic f$2:Lcom/pymcl/core/instance/SaveManager;

.field public final synthetic f$3:Lcom/pymcl/core/instance/MediaKind;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/core/instance/MediaFile;Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/core/instance/MediaKind;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$1:Lcom/pymcl/core/instance/MediaFile;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$2:Lcom/pymcl/core/instance/SaveManager;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$3:Lcom/pymcl/core/instance/MediaKind;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$5:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$1:Lcom/pymcl/core/instance/MediaFile;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$2:Lcom/pymcl/core/instance/SaveManager;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$3:Lcom/pymcl/core/instance/MediaKind;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda32;->f$5:Landroidx/compose/runtime/MutableIntState;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/RowScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->$r8$lambda$oOaFw-0nmKi715NrE-hQ5w3VwcU(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/core/instance/MediaFile;Lcom/pymcl/core/instance/SaveManager;Lcom/pymcl/core/instance/MediaKind;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
