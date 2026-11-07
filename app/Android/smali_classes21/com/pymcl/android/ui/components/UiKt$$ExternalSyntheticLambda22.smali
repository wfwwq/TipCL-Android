.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:J

.field public final synthetic f$1:F

.field public final synthetic f$2:I

.field public final synthetic f$3:I


# direct methods
.method public synthetic constructor <init>(JFII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$0:J

    iput p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$1:F

    iput p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$2:I

    iput p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$3:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 0
    iget-wide v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$0:J

    iget v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$1:F

    iget v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$2:I

    iget v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda22;->f$3:I

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static/range {v0 .. v6}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$7XeEFY-44er47zCC4ylaQ9HQ51c(JFIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
