.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableIntState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$2:Landroidx/compose/runtime/MutableIntState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda17;->f$2:Landroidx/compose/runtime/MutableIntState;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->$r8$lambda$9uPJjU7I4jts8QMsWLmkWYHPYh0(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
