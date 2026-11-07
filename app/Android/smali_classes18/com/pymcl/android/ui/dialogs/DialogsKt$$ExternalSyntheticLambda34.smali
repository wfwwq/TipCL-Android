.class public final synthetic Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Z

.field public final synthetic f$1:Lcom/pymcl/android/ui/state/AppState;

.field public final synthetic f$2:Lcom/pymcl/android/ui/state/DialogSpec;


# direct methods
.method public synthetic constructor <init>(ZLcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$0:Z

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iput-object p3, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$2:Lcom/pymcl/android/ui/state/DialogSpec;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-boolean v0, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$0:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$1:Lcom/pymcl/android/ui/state/AppState;

    iget-object v2, p0, Lcom/pymcl/android/ui/dialogs/DialogsKt$$ExternalSyntheticLambda34;->f$2:Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-static {v0, v1, v2}, Lcom/pymcl/android/ui/dialogs/DialogsKt;->$r8$lambda$zPo06Gq0A_5O2B8aFzhC10HAYIg(ZLcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
