.class public final synthetic Lcom/pymcl/ai/AiAgent$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Lcom/pymcl/ai/BgTaskInfo;

    invoke-static {p1}, Lcom/pymcl/ai/AiAgent;->$r8$lambda$rRsXYC89diA2v3D9M5p8OsRfEfs(Lcom/pymcl/ai/BgTaskInfo;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
