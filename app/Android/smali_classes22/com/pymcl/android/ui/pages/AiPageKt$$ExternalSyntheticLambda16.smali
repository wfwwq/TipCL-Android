.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/data/AiUiExtras;

.field public final synthetic f$2:I

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$1:Lcom/pymcl/android/data/AiUiExtras;

    iput p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$2:I

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$3:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$4:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$1:Lcom/pymcl/android/data/AiUiExtras;

    iget v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$2:I

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$3:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$4:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda16;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$aDFnV7Crw9XPt5sXqz2gr3xVkQ0(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
