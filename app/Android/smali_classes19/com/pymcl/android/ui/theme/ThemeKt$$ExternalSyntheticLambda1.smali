.class public final synthetic Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Landroidx/compose/ui/graphics/Color;

.field public final synthetic f$2:Lcom/pymcl/android/ui/theme/BgPreset;

.field public final synthetic f$3:Lcom/pymcl/android/ui/theme/PyShapes;

.field public final synthetic f$4:Lcom/pymcl/android/ui/theme/PyMotion;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$6:I

.field public final synthetic f$7:I


# direct methods
.method public synthetic constructor <init>(ZLandroidx/compose/ui/graphics/Color;Lcom/pymcl/android/ui/theme/BgPreset;Lcom/pymcl/android/ui/theme/PyShapes;Lcom/pymcl/android/ui/theme/PyMotion;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$0:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/graphics/Color;

    iput-object p3, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$2:Lcom/pymcl/android/ui/theme/BgPreset;

    iput-object p4, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$3:Lcom/pymcl/android/ui/theme/PyShapes;

    iput-object p5, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$4:Lcom/pymcl/android/ui/theme/PyMotion;

    iput-object p6, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function2;

    iput p7, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$6:I

    iput p8, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$7:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-boolean v0, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$0:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$1:Landroidx/compose/ui/graphics/Color;

    iget-object v2, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$2:Lcom/pymcl/android/ui/theme/BgPreset;

    iget-object v3, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$3:Lcom/pymcl/android/ui/theme/PyShapes;

    iget-object v4, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$4:Lcom/pymcl/android/ui/theme/PyMotion;

    iget-object v5, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$5:Lkotlin/jvm/functions/Function2;

    iget v6, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$6:I

    iget v7, p0, Lcom/pymcl/android/ui/theme/ThemeKt$$ExternalSyntheticLambda1;->f$7:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/pymcl/android/ui/theme/ThemeKt;->$r8$lambda$_CxqLP96q_G3VsSi1TdGWf1SSMQ(ZLandroidx/compose/ui/graphics/Color;Lcom/pymcl/android/ui/theme/BgPreset;Lcom/pymcl/android/ui/theme/PyShapes;Lcom/pymcl/android/ui/theme/PyMotion;Lkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
