.class public final synthetic Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda100;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/List;

.field public final synthetic f$1:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda100;->f$0:Ljava/util/List;

    iput p2, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda100;->f$1:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda100;->f$0:Ljava/util/List;

    iget v1, p0, Lcom/pymcl/android/ui/pages/SettingsPageKt$$ExternalSyntheticLambda100;->f$1:I

    check-cast p1, Lcom/pymcl/android/data/AiSettingsForm;

    invoke-static {v0, v1, p1}, Lcom/pymcl/android/ui/pages/SettingsPageKt;->$r8$lambda$8uVAdmR4KGGbb_6vh2x03NY694A(Ljava/util/List;ILcom/pymcl/android/data/AiSettingsForm;)Lcom/pymcl/android/data/AiSettingsForm;

    move-result-object p1

    return-object p1
.end method
