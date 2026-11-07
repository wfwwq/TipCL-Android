.class public final synthetic Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$10:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$2:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$3:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$4:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$5:Ljava/util/List;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$7:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$8:Landroidx/compose/runtime/MutableIntState;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/runtime/MutableState;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$3:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$4:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$5:Ljava/util/List;

    iput-object p7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$6:Landroidx/compose/runtime/MutableIntState;

    iput-object p8, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$7:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$8:Landroidx/compose/runtime/MutableIntState;

    iput-object p10, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$9:Landroidx/compose/runtime/MutableState;

    iput-object p11, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$10:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$1:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$2:Landroidx/compose/runtime/MutableState;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$3:Landroidx/compose/runtime/MutableState;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$4:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$5:Ljava/util/List;

    iget-object v6, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$6:Landroidx/compose/runtime/MutableIntState;

    iget-object v7, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$7:Landroidx/compose/runtime/MutableState;

    iget-object v8, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$8:Landroidx/compose/runtime/MutableIntState;

    iget-object v9, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$9:Landroidx/compose/runtime/MutableState;

    iget-object v10, p0, Lcom/pymcl/android/ui/pages/GamePagesKt$$ExternalSyntheticLambda4;->f$10:Landroidx/compose/runtime/MutableState;

    move-object v11, p1

    check-cast v11, Landroidx/compose/foundation/layout/ColumnScope;

    move-object/from16 v12, p2

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/pymcl/android/ui/pages/GamePagesKt;->$r8$lambda$FkE0g5nyIzmemso5ms0TzoHowHI(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/util/List;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
