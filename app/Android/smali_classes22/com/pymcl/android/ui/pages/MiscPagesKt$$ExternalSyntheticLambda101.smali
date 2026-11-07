.class public final synthetic Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/ui/platform/ClipboardManager;

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/runtime/State;Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$0:Landroidx/compose/ui/platform/ClipboardManager;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$2:Lcom/pymcl/android/ui/state/AppState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$0:Landroidx/compose/ui/platform/ClipboardManager;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda101;->f$2:Lcom/pymcl/android/ui/state/AppState;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->$r8$lambda$IGNz-lwSVIsX-S-Bbk02LcudyGM(Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/runtime/State;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
