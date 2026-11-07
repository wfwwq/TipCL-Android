.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$1:Lcom/pymcl/android/data/AiUiExtras;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/AiItem;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Ljava/util/List;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem;Lkotlin/jvm/functions/Function0;Ljava/util/List;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$1:Lcom/pymcl/android/data/AiUiExtras;

    iput-object p3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$2:Lcom/pymcl/android/ui/state/AiItem;

    iput-object p4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$4:Ljava/util/List;

    iput p6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$5:I

    iput p7, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$0:Lcom/pymcl/android/ui/state/AppState;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$1:Lcom/pymcl/android/data/AiUiExtras;

    iget-object v2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$2:Lcom/pymcl/android/ui/state/AiItem;

    iget-object v3, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$4:Ljava/util/List;

    iget v5, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$5:I

    iget v6, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda56;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$6zzQB-pp2pbgo5oAKFlo4JcpEeU(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/data/AiUiExtras;Lcom/pymcl/android/ui/state/AiItem;Lkotlin/jvm/functions/Function0;Ljava/util/List;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
