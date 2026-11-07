.class public final synthetic Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/DialogSpec;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/DialogSpec;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$0:Lcom/pymcl/android/ui/state/DialogSpec;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$0:Lcom/pymcl/android/ui/state/DialogSpec;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda26;->f$2:Landroidx/compose/runtime/MutableState;

    check-cast p1, Landroidx/compose/runtime/DisposableEffectScope;

    invoke-static {v0, v1, v2, p1}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->$r8$lambda$ksezeGrIUpZWS_vkLzh-kLL6ukQ(Lcom/pymcl/android/ui/state/DialogSpec;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/DisposableEffectScope;)Landroidx/compose/runtime/DisposableEffectResult;

    move-result-object p1

    return-object p1
.end method
