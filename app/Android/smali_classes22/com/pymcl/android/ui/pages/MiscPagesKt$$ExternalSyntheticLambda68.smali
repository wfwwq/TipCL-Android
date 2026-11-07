.class public final synthetic Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/instance/ServerEntry;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Ljava/util/List;

.field public final synthetic f$4:Landroid/content/Context;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/instance/ServerEntry;Lcom/pymcl/android/ui/state/AppState;ZLjava/util/List;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$0:Lcom/pymcl/core/instance/ServerEntry;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-boolean p3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$2:Z

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$3:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$4:Landroid/content/Context;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$5:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$7:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$0:Lcom/pymcl/core/instance/ServerEntry;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-boolean v2, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$2:Z

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$3:Ljava/util/List;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$4:Landroid/content/Context;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$5:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/MiscPagesKt$$ExternalSyntheticLambda68;->f$7:Landroidx/compose/runtime/MutableState;

    move-object v8, p1

    check-cast v8, Landroidx/compose/foundation/layout/RowScope;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    invoke-static/range {v0 .. v10}, Lcom/pymcl/android/ui/pages/MiscPagesKt;->$r8$lambda$oU63iSgWHFeJH5twT08agKme684(Lcom/pymcl/core/instance/ServerEntry;Lcom/pymcl/android/ui/state/AppState;ZLjava/util/List;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
