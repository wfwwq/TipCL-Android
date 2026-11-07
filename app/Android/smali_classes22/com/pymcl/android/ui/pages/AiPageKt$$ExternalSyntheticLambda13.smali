.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/data/AiUiExtras;

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AiItem$Ask;

.field public final synthetic f$2:Lcom/pymcl/ai/AiEvent$Ask;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:I


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem$Ask;Lcom/pymcl/ai/AiEvent$Ask;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$0:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$1:Lcom/pymcl/android/ui/state/AiItem$Ask;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$2:Lcom/pymcl/ai/AiEvent$Ask;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$3:Lkotlin/jvm/functions/Function1;

    iput p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$4:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$0:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$1:Lcom/pymcl/android/ui/state/AiItem$Ask;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$2:Lcom/pymcl/ai/AiEvent$Ask;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$3:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda13;->f$4:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$FKD_MXXN2dAACx4zmAboXzTqN4U(Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem$Ask;Lcom/pymcl/ai/AiEvent$Ask;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
