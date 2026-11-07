.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:F

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;FZLkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/String;

    iput p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$2:F

    iput-boolean p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$3:Z

    iput-object p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function2;

    iput p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$5:I

    iput p7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$1:Ljava/lang/String;

    iget v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$2:F

    iget-boolean v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$3:Z

    iget-object v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$4:Lkotlin/jvm/functions/Function2;

    iget v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$5:I

    iget v6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda4;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$T2fr1Y2ecLpaK6QleokXIRaTeLA(Ljava/lang/String;Ljava/lang/String;FZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
