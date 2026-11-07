.class public final synthetic Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda55;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:I

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda55;->f$0:I

    iput-object p2, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda55;->f$1:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget v0, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda55;->f$0:I

    iget-object v1, p0, Lcom/pymcl/android/ui/pages/AiPageKt$$ExternalSyntheticLambda55;->f$1:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/pymcl/android/ui/pages/AiPageKt;->$r8$lambda$OXZ5MQHrLsgztPvS4E_E5khzCJk(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
