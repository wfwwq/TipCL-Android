.class public final synthetic Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:F

.field public final synthetic f$1:F

.field public final synthetic f$2:Lkotlin/jvm/functions/Function3;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function3;


# direct methods
.method public synthetic constructor <init>(FFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$0:F

    iput p2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$1:F

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$2:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$3:Lkotlin/jvm/functions/Function3;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$0:F

    iget v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$1:F

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$2:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda61;->f$3:Lkotlin/jvm/functions/Function3;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    move-object v5, p2

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/GamePagesKt;->$r8$lambda$GODnaDOT7pOmCPojVJCMsQZgM70(FFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
