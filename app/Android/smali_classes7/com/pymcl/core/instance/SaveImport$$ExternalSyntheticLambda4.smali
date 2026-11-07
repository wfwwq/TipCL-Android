.class public final synthetic Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/io/File;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda4;->f$0:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/instance/SaveImport$$ExternalSyntheticLambda4;->f$0:Ljava/io/File;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lcom/pymcl/core/instance/SaveImport;->$r8$lambda$9cOKWrGzJ5pfKpS5QCmFwcQXcfE(Ljava/io/File;Ljava/io/File;)Lcom/pymcl/core/instance/SaveImport$TreeEntry;

    move-result-object p1

    return-object p1
.end method
