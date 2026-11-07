.class public final synthetic Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda22;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/instance/SaveInfo;

.field public final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/instance/SaveInfo;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda22;->f$0:Lcom/pymcl/core/instance/SaveInfo;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda22;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda22;->f$0:Lcom/pymcl/core/instance/SaveInfo;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda22;->f$1:Ljava/util/List;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->$r8$lambda$4NHshqN59svdqPMudh5DKM07MRI(Lcom/pymcl/core/instance/SaveInfo;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
