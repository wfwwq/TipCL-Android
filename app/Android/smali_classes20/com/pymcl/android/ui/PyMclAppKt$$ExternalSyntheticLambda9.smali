.class public final synthetic Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/pymcl/android/ui/theme/PyColors;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/AppState;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/pymcl/android/ui/theme/PyColors;Lcom/pymcl/android/ui/state/AppState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    iput-object p3, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$2:Lcom/pymcl/android/ui/state/AppState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    iget-object v2, p0, Lcom/pymcl/android/ui/PyMclAppKt$$ExternalSyntheticLambda9;->f$2:Lcom/pymcl/android/ui/state/AppState;

    move-object v3, p1

    check-cast v3, Landroidx/compose/animation/AnimatedVisibilityScope;

    move-object v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/PyMclAppKt;->$r8$lambda$4qzvKcM_p8FUJ-FixJMukimA7D4(Ljava/util/List;Lcom/pymcl/android/ui/theme/PyColors;Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
