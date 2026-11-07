.class public final synthetic Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

.field public final synthetic f$1:Landroid/widget/CheckBox;

.field public final synthetic f$2:Landroid/widget/RadioGroup;

.field public final synthetic f$3:Landroid/widget/RadioButton;

.field public final synthetic f$4:Landroid/widget/RadioButton;

.field public final synthetic f$5:Lcom/pymcl/runtime/input/GamepadModePref;

.field public final synthetic f$6:Lcom/pymcl/runtime/input/GamepadModeController;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

    iput-object p2, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$1:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$2:Landroid/widget/RadioGroup;

    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$3:Landroid/widget/RadioButton;

    iput-object p5, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$4:Landroid/widget/RadioButton;

    iput-object p6, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$5:Lcom/pymcl/runtime/input/GamepadModePref;

    iput-object p7, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$6:Lcom/pymcl/runtime/input/GamepadModeController;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$0:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$1:Landroid/widget/CheckBox;

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$2:Landroid/widget/RadioGroup;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$3:Landroid/widget/RadioButton;

    iget-object v4, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$4:Landroid/widget/RadioButton;

    iget-object v5, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$5:Lcom/pymcl/runtime/input/GamepadModePref;

    iget-object v6, p0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;->f$6:Lcom/pymcl/runtime/input/GamepadModeController;

    move-object v7, p1

    move v8, p2

    move-object v9, p3

    invoke-static/range {v0 .. v9}, Lcom/pymcl/runtime/input/GamepadModeController;->$r8$lambda$HMwd0ARpKQr0C1inEWpHfbdofDo(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
