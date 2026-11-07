.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Ljava/lang/String;

.field public final synthetic f$2:I

.field public final synthetic f$3:I

.field public final synthetic f$4:Lcom/pymcl/android/ui/theme/PyColors;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;IILcom/pymcl/android/ui/theme/PyColors;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$0:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$1:Ljava/lang/String;

    iput p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$2:I

    iput p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$3:I

    iput-object p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$4:Lcom/pymcl/android/ui/theme/PyColors;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-boolean v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$0:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$1:Ljava/lang/String;

    iget v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$2:I

    iget v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$3:I

    iget-object v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda38;->f$4:Lcom/pymcl/android/ui/theme/PyColors;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$rq803Cw-jKLkS8l-kBTC1-7IuVQ(ZLjava/lang/String;IILcom/pymcl/android/ui/theme/PyColors;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
