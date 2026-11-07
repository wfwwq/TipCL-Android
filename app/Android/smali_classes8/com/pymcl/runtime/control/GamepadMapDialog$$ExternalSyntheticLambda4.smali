.class public final synthetic Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/control/GamepadMapDialog;

.field public final synthetic f$1:Lcom/pymcl/runtime/input/GamepadButton;

.field public final synthetic f$2:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$0:Lcom/pymcl/runtime/control/GamepadMapDialog;

    iput-object p2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$1:Lcom/pymcl/runtime/input/GamepadButton;

    iput-object p3, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$2:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$0:Lcom/pymcl/runtime/control/GamepadMapDialog;

    iget-object v1, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$1:Lcom/pymcl/runtime/input/GamepadButton;

    iget-object v2, p0, Lcom/pymcl/runtime/control/GamepadMapDialog$$ExternalSyntheticLambda4;->f$2:Ljava/util/List;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/pymcl/runtime/control/GamepadMapDialog;->$r8$lambda$QUArdUQKeNWEJwxysc6QRTlX8ds(Lcom/pymcl/runtime/control/GamepadMapDialog;Lcom/pymcl/runtime/input/GamepadButton;Ljava/util/List;Landroid/content/DialogInterface;I)V

    return-void
.end method
