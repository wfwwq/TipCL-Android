.class public final synthetic Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda65;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda65;->f$0:Lcom/pymcl/android/ui/state/AppState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda65;->f$0:Lcom/pymcl/android/ui/state/AppState;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/pymcl/android/ui/pages/GamePagesKt;->$r8$lambda$kpj26yEP7P0mB4J3kw9mj_gCHh0(Lcom/pymcl/android/ui/state/AppState;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
