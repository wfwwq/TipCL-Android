.class public final synthetic Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Landroid/widget/EditText;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;

.field public final synthetic f$3:Lcom/pymcl/runtime/GameActivity;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$0:Landroid/widget/EditText;

    iput-object p2, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;

    iput-object p4, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$3:Lcom/pymcl/runtime/GameActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$0:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;

    iget-object v3, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda15;->f$3:Lcom/pymcl/runtime/GameActivity;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/pymcl/runtime/GameActivity;->$r8$lambda$5GvVy9YAYJpCFyBswQ7OyynkwN0(Landroid/widget/EditText;Ljava/util/List;Lcom/pymcl/runtime/keyboard/QuickInputStore;Lcom/pymcl/runtime/GameActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method
