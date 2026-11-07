.class public final synthetic Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda25;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/theme/PyMotion;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/theme/PyMotion;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda25;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda25;->f$1:Lcom/pymcl/android/ui/theme/PyMotion;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda25;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda25;->f$1:Lcom/pymcl/android/ui/theme/PyMotion;

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/PyMclAppKt;->$r8$lambda$sMu6_Wh2Q25y1vCJNzPTGaNommM(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/theme/PyMotion;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/ContentTransform;

    move-result-object p1

    return-object p1
.end method
