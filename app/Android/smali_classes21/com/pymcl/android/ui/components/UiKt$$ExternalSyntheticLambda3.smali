.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Ljava/lang/String;F)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$1:Z

    iput-object p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$2:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    iput p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$4:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$0:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$1:Z

    iget-object v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$2:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$3:Ljava/lang/String;

    iget v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda3;->f$4:F

    move-object v5, p1

    check-cast v5, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    move-object v6, p2

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$BXyqBF6oSGVaKD3hgkvw3Zc1kIQ(Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Ljava/lang/String;FLandroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
