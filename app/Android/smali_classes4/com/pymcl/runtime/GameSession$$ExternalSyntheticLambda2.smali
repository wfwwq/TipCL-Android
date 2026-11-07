.class public final synthetic Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Ljava/util/Properties;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Properties;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda2;->f$0:Ljava/util/Properties;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda2;->f$0:Ljava/util/Properties;

    check-cast p1, Ljava/io/File;

    invoke-static {v0, p1}, Lcom/pymcl/runtime/GameSession;->$r8$lambda$-YsWmRp790dpVVVlr4cVjSuHhuY(Ljava/util/Properties;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
