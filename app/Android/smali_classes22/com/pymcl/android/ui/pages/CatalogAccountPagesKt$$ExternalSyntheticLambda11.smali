.class public final synthetic Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/CatalogKind;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroid/content/Context;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$1:Lcom/pymcl/android/ui/state/CatalogKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$1:Lcom/pymcl/android/ui/state/CatalogKind;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$3:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda11;->f$5:Landroid/content/Context;

    move-object v6, p1

    check-cast v6, Landroid/net/Uri;

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->$r8$lambda$Zwdlm1Sx2QTXGQWwZvxI8-rjIA8(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
