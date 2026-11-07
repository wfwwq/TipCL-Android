.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda148;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(FI)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda148;->f$0:F

    iput p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda148;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda148;->f$0:F

    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda148;->f$1:I

    check-cast p1, Lcom/pymcl/android/ui/state/UiSettings;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->$r8$lambda$kVGrkdDaO9-75VWthHoL4UK3njo(FILcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p1

    return-object p1
.end method
