.class public final synthetic Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Landroid/content/Context;

.field public final synthetic f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$5:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(ZLcom/pymcl/android/ui/state/AppState;Ljava/util/List;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$0:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$2:Ljava/util/List;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$5:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$8:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-boolean v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$0:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$2:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$3:Landroid/content/Context;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$5:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda66;->f$8:Landroidx/compose/runtime/MutableState;

    move-object v9, p1

    check-cast v9, Landroidx/compose/foundation/layout/RowScope;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->$r8$lambda$ALWP4Jz77B2CLL-AnA-nRNzf68Q(ZLcom/pymcl/android/ui/state/AppState;Ljava/util/List;Landroid/content/Context;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
