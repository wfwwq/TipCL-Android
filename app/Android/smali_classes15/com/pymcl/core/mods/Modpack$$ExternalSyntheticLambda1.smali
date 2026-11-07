.class public final synthetic Lcom/pymcl/core/mods/Modpack$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/Modpack$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/mods/Modpack$$ExternalSyntheticLambda1;->f$0:Lkotlin/jvm/functions/Function2;

    check-cast p1, Lcom/pymcl/core/download/DownloadProgress;

    invoke-static {v0, p1}, Lcom/pymcl/core/mods/Modpack;->$r8$lambda$8VqHbn86mwkhPm0_6DKWYXx_bAY(Lkotlin/jvm/functions/Function2;Lcom/pymcl/core/download/DownloadProgress;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
