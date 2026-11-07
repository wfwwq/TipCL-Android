.class public final synthetic Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/pages/DashCardSpec;

.field public final synthetic f$1:F

.field public final synthetic f$2:F

.field public final synthetic f$3:Landroidx/compose/animation/core/Animatable;

.field public final synthetic f$4:Landroidx/compose/ui/unit/Density;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/animation/core/Animatable;Landroidx/compose/ui/unit/Density;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$0:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iput p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$1:F

    iput p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$2:F

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$3:Landroidx/compose/animation/core/Animatable;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$4:Landroidx/compose/ui/unit/Density;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$0:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iget v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$1:F

    iget v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$2:F

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$3:Landroidx/compose/animation/core/Animatable;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$$ExternalSyntheticLambda21;->f$4:Landroidx/compose/ui/unit/Density;

    move-object v5, p1

    check-cast v5, Landroidx/compose/ui/unit/Density;

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/LaunchPageKt;->$r8$lambda$a7hYltu9TOE3UeVEIzx7_kNJikM(Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/animation/core/Animatable;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/unit/IntOffset;

    move-result-object p1

    return-object p1
.end method
