.class public final synthetic Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/CrashInfo;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Lcom/pymcl/android/data/AiUiExtras;

.field public final synthetic f$5:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$6:Ljava/lang/String;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$0:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$2:Lcom/pymcl/android/ui/state/CrashInfo;

    iput-object p4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$4:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$5:Lcom/pymcl/android/ui/state/AppState;

    iput-object p7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$6:Ljava/lang/String;

    iput-object p8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$8:Landroidx/compose/runtime/MutableState;

    iput-object p10, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$9:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$0:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$1:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$2:Lcom/pymcl/android/ui/state/CrashInfo;

    iget-object v3, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$4:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v5, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$5:Lcom/pymcl/android/ui/state/AppState;

    iget-object v6, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$6:Ljava/lang/String;

    iget-object v7, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$8:Landroidx/compose/runtime/MutableState;

    iget-object v9, p0, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt$$ExternalSyntheticLambda6;->f$9:Landroidx/compose/runtime/MutableState;

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/pymcl/android/ui/dialogs/AiFixWindowKt;->$r8$lambda$ljZPomcoK__hwxTm_97X0vsa2vI(Landroidx/compose/runtime/snapshots/SnapshotStateList;Lkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/CrashInfo;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
