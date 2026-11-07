.class public final synthetic Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Landroid/widget/EditText;

.field public final synthetic f$1:Lcom/pymcl/runtime/control/ControlOverlay;

.field public final synthetic f$2:Lcom/pymcl/runtime/control/ControlElement;

.field public final synthetic f$3:Landroid/widget/EditText;

.field public final synthetic f$4:Landroid/widget/CheckBox;

.field public final synthetic f$5:Landroid/widget/SeekBar;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$0:Landroid/widget/EditText;

    iput-object p2, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/runtime/control/ControlOverlay;

    iput-object p3, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$2:Lcom/pymcl/runtime/control/ControlElement;

    iput-object p4, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$3:Landroid/widget/EditText;

    iput-object p5, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$4:Landroid/widget/CheckBox;

    iput-object p6, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$5:Landroid/widget/SeekBar;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$0:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/runtime/control/ControlOverlay;

    iget-object v2, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$2:Lcom/pymcl/runtime/control/ControlElement;

    iget-object v3, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$3:Landroid/widget/EditText;

    iget-object v4, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$4:Landroid/widget/CheckBox;

    iget-object v5, p0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;->f$5:Landroid/widget/SeekBar;

    move-object v6, p1

    move v7, p2

    invoke-static/range {v0 .. v7}, Lcom/pymcl/runtime/control/ControlOverlay;->$r8$lambda$p3uDlubgPvgnIIvzN3NuWid4bXI(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;Landroid/content/DialogInterface;I)V

    return-void
.end method
