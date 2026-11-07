.class public final synthetic Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/android/data/AiToolHostImpl;

.field public final synthetic f$1:Lcom/pymcl/core/instance/Instance;

.field public final synthetic f$2:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iput-object p2, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/core/instance/Instance;

    iput-object p3, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$2:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/android/data/AiToolHostImpl;

    iget-object v1, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$1:Lcom/pymcl/core/instance/Instance;

    iget-object v2, p0, Lcom/pymcl/android/data/AiToolHostImpl$$ExternalSyntheticLambda0;->f$2:Ljava/util/Map;

    invoke-static {v0, v1, v2}, Lcom/pymcl/android/data/AiToolHostImpl;->$r8$lambda$uK5_nFztg1uEWOo4JINEnxh4NdY(Lcom/pymcl/android/data/AiToolHostImpl;Lcom/pymcl/core/instance/Instance;Ljava/util/Map;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method
