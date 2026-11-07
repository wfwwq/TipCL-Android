.class public final synthetic Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AccountRow;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AccountRow;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$0:Lcom/pymcl/android/ui/state/AccountRow;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$2:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$0:Lcom/pymcl/android/ui/state/AccountRow;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda48;->f$2:Landroidx/compose/runtime/MutableState;

    move-object v3, p1

    check-cast v3, Landroidx/compose/foundation/layout/RowScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->$r8$lambda$GTGmFLi7f_Cv6xX1y3RAhZ0CXHU(Lcom/pymcl/android/ui/state/AccountRow;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
