.class public final synthetic Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/CatalogKind;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda15;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda15;->f$1:Lcom/pymcl/android/ui/state/CatalogKind;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda15;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt$$ExternalSyntheticLambda15;->f$1:Lcom/pymcl/android/ui/state/CatalogKind;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/pages/CatalogAccountPagesKt;->$r8$lambda$2SJwbInUZUAfan8cGl6Ikk6d8cc(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
