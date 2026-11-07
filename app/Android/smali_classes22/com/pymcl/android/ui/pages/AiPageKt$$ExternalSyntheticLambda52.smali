.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda52;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AiItem;

.field public final synthetic f$1:Lcom/pymcl/android/ui/theme/PyColors;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AiItem;Lcom/pymcl/android/ui/theme/PyColors;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda52;->f$0:Lcom/pymcl/android/ui/state/AiItem;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda52;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda52;->f$0:Lcom/pymcl/android/ui/state/AiItem;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda52;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    check-cast p1, Landroidx/compose/foundation/layout/ColumnScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$RBSLM6ZRduBz00iFDLu5BuYN4MQ(Lcom/pymcl/android/ui/state/AiItem;Lcom/pymcl/android/ui/theme/PyColors;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
