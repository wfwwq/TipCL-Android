.class public final synthetic Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic f$0:Lorg/libsdl/app/SdlImeController$Source;


# direct methods
.method public synthetic constructor <init>(Lorg/libsdl/app/SdlImeController$Source;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda2;->f$0:Lorg/libsdl/app/SdlImeController$Source;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/libsdl/app/SdlImeController$$ExternalSyntheticLambda2;->f$0:Lorg/libsdl/app/SdlImeController$Source;

    invoke-static {v0}, Lorg/libsdl/app/SdlImeController;->lambda$requestHide$1(Lorg/libsdl/app/SdlImeController$Source;)V

    return-void
.end method
