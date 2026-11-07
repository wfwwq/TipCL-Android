.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/data/SettingsLogic$Validation;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/data/SettingsLogic$Validation;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/SettingsLogic$Validation;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/SettingsLogic$Validation;

    check-cast p1, Lcom/pymcl/android/ui/state/UiSettings;

    invoke-static {v0, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt$SettingsPage$saveAll$2;->$r8$lambda$MJX-mMB4zM80T7zg-1EO2676bkA(Lcom/pymcl/android/data/SettingsLogic$Validation;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p1

    return-object p1
.end method
