.class public final synthetic Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic f$0:[B


# direct methods
.method public synthetic constructor <init>([B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda0;->f$0:[B

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/mods/Murmur2$$ExternalSyntheticLambda0;->f$0:[B

    invoke-static {v0}, Lcom/pymcl/core/mods/Murmur2;->$r8$lambda$7uAzSr1RTHayCyk-yPMQwB3Uehc([B)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
