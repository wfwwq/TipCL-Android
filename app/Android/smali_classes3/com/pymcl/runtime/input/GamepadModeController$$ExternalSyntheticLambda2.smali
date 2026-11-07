.class public final synthetic Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/input/GamepadModePref;

.field public final synthetic f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f$2:Landroid/widget/CheckBox;

.field public final synthetic f$3:Lcom/pymcl/runtime/input/GamepadModeController;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/runtime/input/GamepadModePref;

    iput-object p2, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$2:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$3:Lcom/pymcl/runtime/input/GamepadModeController;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/runtime/input/GamepadModePref;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$1:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$2:Landroid/widget/CheckBox;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;->f$3:Lcom/pymcl/runtime/input/GamepadModeController;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/pymcl/runtime/input/GamepadModeController;->$r8$lambda$jBngqmtPhPL-PVuuvxLtCoX4dsQ(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;I)V

    return-void
.end method
