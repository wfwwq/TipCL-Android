.class public final synthetic Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/settings/LauncherSettingsProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/runtime/settings/LauncherSettingsProvider;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/runtime/settings/LauncherSettingsProvider;

    invoke-static {v0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->$r8$lambda$Bl_CeBiJfY6v0pnFl655TAgZ_Ys(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method
