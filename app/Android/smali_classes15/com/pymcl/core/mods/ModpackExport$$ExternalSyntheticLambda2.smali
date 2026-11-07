.class public final synthetic Lcom/pymcl/core/mods/ModpackExport$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/String;

    invoke-static {p1, p2}, Lcom/pymcl/core/mods/ModpackExport;->$r8$lambda$icq3hU9Pe026Y1CKx8dqfcds5WQ(FLjava/lang/String;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
