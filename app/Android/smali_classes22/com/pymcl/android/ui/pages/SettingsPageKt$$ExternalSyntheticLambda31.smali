.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/UiSettings;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$3:J

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(ILcom/pymcl/android/ui/state/UiSettings;Lcom/pymcl/android/ui/state/AppState;JLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$0:I

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$1:Lcom/pymcl/android/ui/state/UiSettings;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$2:Lcom/pymcl/android/ui/state/AppState;

    iput-wide p4, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$3:J

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$0:I

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$1:Lcom/pymcl/android/ui/state/UiSettings;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$2:Lcom/pymcl/android/ui/state/AppState;

    iget-wide v3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$3:J

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda31;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->$r8$lambda$zhXDi6M5FjsBPKAo824UbDO2gsk(ILcom/pymcl/android/ui/state/UiSettings;Lcom/pymcl/android/ui/state/AppState;JLandroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
