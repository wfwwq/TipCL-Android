.class public final synthetic Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/data/LaunchConfigLogic$Display;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/data/LaunchConfigLogic$Display;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    check-cast p1, Lcom/pymcl/android/ui/state/UiSettings;

    invoke-static {v0, p1}, Lcom/pymcl/android/ui/pages/LaunchPageKt$ConfigCard$2$1;->$r8$lambda$XiOug2KpgKFYbwYm4hniv37zC_I(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Lcom/pymcl/android/ui/state/UiSettings;)Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object p1

    return-object p1
.end method
