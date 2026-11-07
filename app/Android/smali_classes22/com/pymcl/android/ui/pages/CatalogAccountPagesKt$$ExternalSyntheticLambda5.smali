.class public final synthetic Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/CatalogHit;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$3:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$4:Lcom/pymcl/android/ui/state/CatalogKind;

.field public final synthetic f$5:Landroidx/compose/ui/platform/UriHandler;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/CatalogHit;ZLkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Landroidx/compose/ui/platform/UriHandler;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$0:Lcom/pymcl/android/ui/state/CatalogHit;

    iput-boolean p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$1:Z

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$3:Lcom/pymcl/android/ui/state/AppState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$4:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$5:Landroidx/compose/ui/platform/UriHandler;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$0:Lcom/pymcl/android/ui/state/CatalogHit;

    iget-boolean v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$1:Z

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$2:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$3:Lcom/pymcl/android/ui/state/AppState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$4:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda5;->f$5:Landroidx/compose/ui/platform/UriHandler;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/RowScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->$r8$lambda$fOVj2lroBSxSkwQYDFDLirhSVJE(Lcom/pymcl/android/ui/state/CatalogHit;ZLkotlin/jvm/functions/Function0;Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Landroidx/compose/ui/platform/UriHandler;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
