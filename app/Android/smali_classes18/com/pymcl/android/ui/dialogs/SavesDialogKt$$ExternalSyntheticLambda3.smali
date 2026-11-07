.class public final synthetic Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda3;->f$1:Landroid/net/Uri;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/pymcl/android/ui/dialogs/SavesDialogKt$$ExternalSyntheticLambda3;->f$1:Landroid/net/Uri;

    check-cast p1, Ljava/io/File;

    check-cast p2, Lcom/pymcl/android/data/SaveImportProgress$Cb;

    invoke-static {v0, v1, p1, p2}, Lcom/pymcl/android/ui/dialogs/SavesDialogKt;->$r8$lambda$s2vYqMN_Ukpt8e-wBvw9wepVd8Y(Landroid/content/Context;Landroid/net/Uri;Ljava/io/File;Lcom/pymcl/android/data/SaveImportProgress$Cb;)Lcom/pymcl/core/instance/SaveImport$Result;

    move-result-object p1

    return-object p1
.end method
