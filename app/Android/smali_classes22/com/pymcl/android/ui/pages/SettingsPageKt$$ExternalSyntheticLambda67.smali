.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:I

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Lcom/pymcl/android/ui/state/UiSettings;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$9:J


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;ILandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/UiSettings;Landroidx/compose/runtime/MutableState;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$2:I

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$7:Lcom/pymcl/android/ui/state/UiSettings;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$8:Landroidx/compose/runtime/MutableState;

    iput-wide p10, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$9:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$2:I

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$7:Lcom/pymcl/android/ui/state/UiSettings;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$8:Landroidx/compose/runtime/MutableState;

    iget-wide v9, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda67;->f$9:J

    move-object v11, p1

    check-cast v11, Landroidx/compose/foundation/layout/ColumnScope;

    move-object/from16 v12, p2

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->$r8$lambda$CiTB08NxgjEga1o7jp2Duz6rdzo(Landroid/content/Context;Lcom/pymcl/android/ui/state/AppState;ILandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/UiSettings;Landroidx/compose/runtime/MutableState;JLandroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
