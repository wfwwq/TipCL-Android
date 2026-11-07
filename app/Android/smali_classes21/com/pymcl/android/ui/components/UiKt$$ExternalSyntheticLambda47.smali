.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Lcom/pymcl/android/ui/components/BtnKind;

.field public final synthetic f$2:Landroidx/compose/ui/graphics/vector/ImageVector;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Z

.field public final synthetic f$5:Landroidx/compose/ui/Modifier;

.field public final synthetic f$6:Z

.field public final synthetic f$7:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$8:I

.field public final synthetic f$9:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/pymcl/android/ui/components/BtnKind;Landroidx/compose/ui/graphics/vector/ImageVector;ZZLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$0:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$1:Lcom/pymcl/android/ui/components/BtnKind;

    iput-object p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$2:Landroidx/compose/ui/graphics/vector/ImageVector;

    iput-boolean p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$3:Z

    iput-boolean p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$4:Z

    iput-object p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$5:Landroidx/compose/ui/Modifier;

    iput-boolean p7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$6:Z

    iput-object p8, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$7:Lkotlin/jvm/functions/Function0;

    iput p9, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$8:I

    iput p10, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$9:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$0:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$1:Lcom/pymcl/android/ui/components/BtnKind;

    iget-object v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$2:Landroidx/compose/ui/graphics/vector/ImageVector;

    iget-boolean v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$3:Z

    iget-boolean v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$4:Z

    iget-object v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$5:Landroidx/compose/ui/Modifier;

    iget-boolean v6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$6:Z

    iget-object v7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$7:Lkotlin/jvm/functions/Function0;

    iget v8, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$8:I

    iget v9, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda47;->f$9:I

    move-object v10, p1

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-static/range {v0 .. v11}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$QBhy3DfwQn_5EtfU6nfPSk2S3lc(Ljava/lang/String;Lcom/pymcl/android/ui/components/BtnKind;Landroidx/compose/ui/graphics/vector/ImageVector;ZZLandroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
