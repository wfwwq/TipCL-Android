.class public final synthetic Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/pymcl/core/account/Account;


# direct methods
.method public synthetic constructor <init>(Lcom/pymcl/core/account/Account;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/core/account/Account;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/pymcl/core/auth/TokenRevocation$$ExternalSyntheticLambda0;->f$0:Lcom/pymcl/core/account/Account;

    check-cast p1, Lcom/pymcl/core/account/Account;

    invoke-static {v0, p1}, Lcom/pymcl/core/auth/TokenRevocation;->$r8$lambda$EU6kZ2OmEQWR6QYi0xg60HDyQYA(Lcom/pymcl/core/account/Account;Lcom/pymcl/core/account/Account;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
