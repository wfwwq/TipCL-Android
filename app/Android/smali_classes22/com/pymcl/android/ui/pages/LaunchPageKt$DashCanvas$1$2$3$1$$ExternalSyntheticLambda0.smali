.class public final synthetic Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Landroidx/compose/ui/unit/Density;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Ljava/util/List;

.field public final synthetic f$4:Lcom/pymcl/android/ui/pages/DashCardSpec;

.field public final synthetic f$5:F

.field public final synthetic f$6:F


# direct methods
.method public synthetic constructor <init>(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FF)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$0:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/unit/Density;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$3:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$4:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iput p6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$5:F

    iput p7, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$6:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-boolean v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$0:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$1:Landroidx/compose/ui/unit/Density;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$3:Ljava/util/List;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$4:Lcom/pymcl/android/ui/pages/DashCardSpec;

    iget v5, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$5:F

    iget v6, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1$$ExternalSyntheticLambda0;->f$6:F

    move-object v7, p1

    check-cast v7, Landroidx/compose/ui/input/pointer/PointerInputChange;

    move-object v8, p2

    check-cast v8, Landroidx/compose/ui/geometry/Offset;

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/LaunchPageKt$DashCanvas$1$2$3$1;->$r8$lambda$PZbPy79Kro79Mz8vdlNEy5znVcU(ZLandroidx/compose/ui/unit/Density;Lkotlin/jvm/functions/Function1;Ljava/util/List;Lcom/pymcl/android/ui/pages/DashCardSpec;FFLandroidx/compose/ui/input/pointer/PointerInputChange;Landroidx/compose/ui/geometry/Offset;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
