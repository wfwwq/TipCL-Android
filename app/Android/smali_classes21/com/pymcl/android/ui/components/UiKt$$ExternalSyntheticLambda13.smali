.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$0:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$1:Z

    iput-object p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$2:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$3:Z

    iput-object p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$4:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$5:I

    iput p7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$0:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$1:Z

    iget-object v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$2:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$3:Z

    iget-object v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$4:Lkotlin/jvm/functions/Function1;

    iget v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$5:I

    iget v6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda13;->f$6:I

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v8

    invoke-static/range {v0 .. v8}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$M7n7aa9nqSBA5Qz8fJv6tJAffaU(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
