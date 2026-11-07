.class public final synthetic Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/account/Account;

.field public final synthetic f$1:J


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/account/Account;J)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/core/account/Account;

    iput-wide p2, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;->f$1:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;->f$0:Lcom/pymcl/core/account/Account;

    iget-wide v1, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda6;->f$1:J

    check-cast p1, Lcom/pymcl/core/account/Account;

    invoke-static {v0, v1, v2, p1}, Lcom/pymcl/core/auth/TokenRevocation;->$r8$lambda$iQr_BFmghyn0Ypv16ke5_Bp_Npk(Lcom/pymcl/core/account/Account;JLcom/pymcl/core/account/Account;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
