.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Z

.field public final synthetic f$3:I

.field public final synthetic f$4:Lcom/pymcl/android/ui/theme/PyColors;

.field public final synthetic f$5:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;ZILcom/pymcl/android/ui/theme/PyColors;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$1:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$2:Z

    iput p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$3:I

    iput-object p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$4:Lcom/pymcl/android/ui/theme/PyColors;

    iput-object p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$5:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$1:Lkotlin/jvm/functions/Function1;

    iget-boolean v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$2:Z

    iget v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$3:I

    iget-object v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$4:Lcom/pymcl/android/ui/theme/PyColors;

    iget-object v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda16;->f$5:Landroidx/compose/runtime/MutableState;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v7, p2

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$WC5qRXLprehCGLGA6CKxOVawN1w(Ljava/util/List;Lkotlin/jvm/functions/Function1;ZILcom/pymcl/android/ui/theme/PyColors;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
