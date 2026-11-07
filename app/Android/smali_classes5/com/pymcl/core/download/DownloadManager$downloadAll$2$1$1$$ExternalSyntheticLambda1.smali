.class public final synthetic Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lkotlinx/coroutines/Job;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/Job;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1;->f$0:Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1$$ExternalSyntheticLambda1;->f$0:Lkotlinx/coroutines/Job;

    invoke-static {v0}, Lcom/pymcl/core/download/DownloadManager$downloadAll$2$1$1;->$r8$lambda$eLKZdLFvmldnS4iPikdZDTDk9Og(Lkotlinx/coroutines/Job;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
