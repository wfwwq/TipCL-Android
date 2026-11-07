.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda49;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/state/AiItem;

.field public final synthetic f$1:Lcom/pymcl/android/ui/theme/PyColors;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/state/AiItem;Lcom/pymcl/android/ui/theme/PyColors;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda49;->f$0:Lcom/pymcl/android/ui/state/AiItem;

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda49;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda49;->f$0:Lcom/pymcl/android/ui/state/AiItem;

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda49;->f$1:Lcom/pymcl/android/ui/theme/PyColors;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$6FVMgvxW2kCube_nOAzp6FTPKtc(Lcom/pymcl/android/ui/state/AiItem;Lcom/pymcl/android/ui/theme/PyColors;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
