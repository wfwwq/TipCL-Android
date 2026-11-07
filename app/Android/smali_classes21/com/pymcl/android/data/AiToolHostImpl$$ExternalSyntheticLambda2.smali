.class public final synthetic Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/instance/Instance;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/instance/Instance;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/core/instance/Instance;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda2;->f$0:Lcom/pymcl/core/instance/Instance;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/pymcl/android/data/AiToolHostImpl;->$r8$lambda$603MRkcS3C5fMFv0GvGaWAhahnw(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
