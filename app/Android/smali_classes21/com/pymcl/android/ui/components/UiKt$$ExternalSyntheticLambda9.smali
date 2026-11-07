.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Landroidx/compose/ui/Modifier;

.field public final synthetic f$2:Z

.field public final synthetic f$3:J

.field public final synthetic f$4:I

.field public final synthetic f$5:I

.field public final synthetic f$6:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZJIII)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/ui/Modifier;

    iput-boolean p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$2:Z

    iput-wide p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$3:J

    iput p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$4:I

    iput p7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$5:I

    iput p8, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$6:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$1:Landroidx/compose/ui/Modifier;

    iget-boolean v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$2:Z

    iget-wide v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$3:J

    iget v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$4:I

    iget v6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$5:I

    iget v7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda9;->f$6:I

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$zk2nmIIOJmlxS_gRn-N3QUHgChU(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZJIIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
