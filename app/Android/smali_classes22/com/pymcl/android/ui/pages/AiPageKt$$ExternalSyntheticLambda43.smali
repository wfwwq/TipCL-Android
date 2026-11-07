.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AiItem;

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/AiItem;Ljava/util/List;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$1:Lcom/pymcl/android/ui/state/AiItem;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$2:Ljava/util/List;

    iput p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$1:Lcom/pymcl/android/ui/state/AiItem;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$2:Ljava/util/List;

    iget v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda43;->f$3:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$eI2r5hLtKl-Fi_DaiMIhotcCOCc(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/AiItem;Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
