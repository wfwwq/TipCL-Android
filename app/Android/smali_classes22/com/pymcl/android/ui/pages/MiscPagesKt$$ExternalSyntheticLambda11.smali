.class public final synthetic Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Landroidx/compose/runtime/State;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Z

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/ui/platform/ClipboardManager;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/ui/platform/ClipboardManager;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$1:Landroidx/compose/runtime/State;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$4:Z

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$6:Landroidx/compose/ui/platform/ClipboardManager;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$1:Landroidx/compose/runtime/State;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$4:Z

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda11;->f$6:Landroidx/compose/ui/platform/ClipboardManager;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->$r8$lambda$bYUo4wno-1KwOFtt8Ou2JOwrEuY(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Ljava/lang/String;ZLandroidx/compose/runtime/MutableState;Landroidx/compose/ui/platform/ClipboardManager;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
