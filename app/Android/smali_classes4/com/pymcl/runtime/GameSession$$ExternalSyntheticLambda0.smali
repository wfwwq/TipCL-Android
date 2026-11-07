.class public final synthetic Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:J


# direct methods
.method public synthetic constructor <init>(J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda0;->f$0:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-wide v0, p0, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda0;->f$0:J

    check-cast p1, Ljava/io/File;

    invoke-static {v0, v1, p1}, Lcom/pymcl/runtime/GameSession;->$r8$lambda$y5ANgBd28qYYGgCEbrrmbe3ysWc(JLjava/io/File;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
