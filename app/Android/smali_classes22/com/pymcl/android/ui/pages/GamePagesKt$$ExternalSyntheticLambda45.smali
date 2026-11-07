.class public final synthetic Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/InstanceRow;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstanceRow;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$0:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$2:Lcom/pymcl/android/ui/state/InstanceRow;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$3:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$0:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$2:Lcom/pymcl/android/ui/state/InstanceRow;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda45;->f$3:Landroidx/compose/runtime/MutableState;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/GamePagesKt;->$r8$lambda$-x8rAfsGg96RSvn6Wup8ViYlLFg(Landroidx/compose/runtime/MutableState;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/InstanceRow;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
