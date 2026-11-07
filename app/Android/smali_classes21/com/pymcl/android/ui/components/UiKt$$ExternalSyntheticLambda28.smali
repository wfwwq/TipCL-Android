.class public final synthetic Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/ui/theme/PyColors;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Landroidx/compose/runtime/State;

.field public final synthetic f$3:Landroidx/compose/ui/graphics/vector/ImageVector;

.field public final synthetic f$4:Ljava/lang/String;

.field public final synthetic f$5:Ljava/lang/String;

.field public final synthetic f$6:Z


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/ui/theme/PyColors;ZLandroidx/compose/runtime/State;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$0:Lcom/pymcl/android/ui/theme/PyColors;

    iput-boolean p2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$1:Z

    iput-object p3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$2:Landroidx/compose/runtime/State;

    iput-object p4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$3:Landroidx/compose/ui/graphics/vector/ImageVector;

    iput-object p5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$4:Ljava/lang/String;

    iput-object p6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$5:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$6:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$0:Lcom/pymcl/android/ui/theme/PyColors;

    iget-boolean v1, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$1:Z

    iget-object v2, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$2:Landroidx/compose/runtime/State;

    iget-object v3, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$3:Landroidx/compose/ui/graphics/vector/ImageVector;

    iget-object v4, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$4:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$5:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/pymcl/android/ui/components/UiKt$$ExternalSyntheticLambda28;->f$6:Z

    move-object v7, p1

    check-cast v7, Lkotlin/jvm/functions/Function2;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/pymcl/android/ui/components/UiKt;->$r8$lambda$dfK5LqnwDGDNSGjj08FhnOFAmoY(Lcom/pymcl/android/ui/theme/PyColors;ZLandroidx/compose/runtime/State;Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
