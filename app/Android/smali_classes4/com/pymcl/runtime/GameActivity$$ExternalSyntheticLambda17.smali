.class public final synthetic Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:Lcom/pymcl/runtime/GameActivity;

.field public final synthetic f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$0:Ljava/util/List;

    iput-object p2, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$1:Lcom/pymcl/runtime/GameActivity;

    iput-object p3, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$0:Ljava/util/List;

    iget-object v1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$1:Lcom/pymcl/runtime/GameActivity;

    iget-object v2, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda17;->f$2:Lcom/pymcl/runtime/keyboard/QuickInputStore;

    invoke-static {v0, v1, v2, p1, p2}, Lcom/pymcl/runtime/GameActivity;->$r8$lambda$c6dpmocwDCLI9GnSj_IJGZkc8Kg(Ljava/util/List;Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/keyboard/QuickInputStore;Landroid/content/DialogInterface;I)V

    return-void
.end method
