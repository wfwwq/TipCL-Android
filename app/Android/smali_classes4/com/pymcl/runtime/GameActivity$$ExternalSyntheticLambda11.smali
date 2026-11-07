.class public final synthetic Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda11;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/runtime/GameActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/runtime/GameActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/runtime/GameActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameActivity$$ExternalSyntheticLambda11;->f$0:Lcom/pymcl/runtime/GameActivity;

    check-cast p1, Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-static {v0, p1}, Lcom/pymcl/runtime/GameActivity;->$r8$lambda$Jr-yErg6flc5GYS-1Vz6COUBbXY(Lcom/pymcl/runtime/GameActivity;Lcom/pymcl/runtime/input/GamepadMapping;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
