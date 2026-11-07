.class public final synthetic Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;

.field public final synthetic f$1:I

.field public final synthetic f$2:Ljava/util/List;

.field public final synthetic f$3:Lcom/pymcl/android/ui/state/DepCandidate;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;ILjava/util/List;Lcom/pymcl/android/ui/state/DepCandidate;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iput p2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$1:I

    iput-object p3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$2:Ljava/util/List;

    iput-object p4, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$3:Lcom/pymcl/android/ui/state/DepCandidate;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$0:Lkotlin/jvm/functions/Function2;

    iget v1, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$1:I

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$2:Ljava/util/List;

    iget-object v3, p0, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2$$ExternalSyntheticLambda0;->f$3:Lcom/pymcl/android/ui/state/DepCandidate;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/pymcl/android/data/RepositoryUiApiExt$installDependencies$2;->$r8$lambda$HEf7t743R10wK2gD0Sv5H99zxHw(Lkotlin/jvm/functions/Function2;ILjava/util/List;Lcom/pymcl/android/ui/state/DepCandidate;F)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
