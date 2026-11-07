.class public final synthetic Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/data/AiToolHostImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/data/AiToolHostImpl;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/android/data/AiToolHostImpl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda1;->f$0:Lcom/pymcl/android/data/AiToolHostImpl;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->$r8$lambda$QF7IeQIGb9fq2p95hAdnFhMmNcY(Lcom/pymcl/android/data/AiToolHostImpl;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method
