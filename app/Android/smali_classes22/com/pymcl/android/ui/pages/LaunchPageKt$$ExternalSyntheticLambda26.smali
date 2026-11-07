.class public final synthetic Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$1:Landroidx/compose/runtime/MutableIntState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$3:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$1:Landroidx/compose/runtime/MutableIntState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda26;->f$3:Landroid/content/Context;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->$r8$lambda$1O1kFuU3RrXISc7IdWwsMU2qavY(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
