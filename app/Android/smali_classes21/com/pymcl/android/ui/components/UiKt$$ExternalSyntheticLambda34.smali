.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:I

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Z

.field public final synthetic f$4:I

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;ZII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$0:Ljava/util/List;

    iput p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$1:I

    iput-object p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$2:Lkotlin/jvm/functions/Function1;

    iput-boolean p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$3:Z

    iput p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$4:I

    iput p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$0:Ljava/util/List;

    iget v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$1:I

    iget-object v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$2:Lkotlin/jvm/functions/Function1;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$3:Z

    iget v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$4:I

    iget v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda34;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$KA8IMQJ-tk1OKBD3orawJGf8kqo(Ljava/util/List;ILkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
