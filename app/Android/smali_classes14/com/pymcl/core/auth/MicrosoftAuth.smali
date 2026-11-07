.class public final Lcom/pymcl/core/auth/MicrosoftAuth;
.super Ljava/lang/Object;
.source "Auth.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/auth/MicrosoftAuth$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAuth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Auth.kt\ncom/pymcl/core/auth/MicrosoftAuth\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0006\u0010\r\u001a\u00020\u000eJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\t2\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0005H\u0002J*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0005J\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0002J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0018\u001a\u00020\u0006H\u0002J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0012J\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010 j\u0002`!2\u0006\u0010\"\u001a\u00020\u0006H\u0002J*\u0010#\u001a\u00020\u001b2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u00082\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0005J\u000e\u0010\u0017\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/pymcl/core/auth/MicrosoftAuth;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "clientId",
        "Lkotlin/Function0;",
        "",
        "sleeper",
        "Lkotlin/Function1;",
        "",
        "",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "requestDeviceCode",
        "Lcom/pymcl/core/auth/DeviceCode;",
        "sleepInterruptible",
        "ms",
        "cancelled",
        "",
        "pollToken",
        "Lkotlin/Pair;",
        "dc",
        "refreshMs",
        "refresh",
        "xbl",
        "xsts",
        "completeLogin",
        "Lcom/pymcl/core/account/Account;",
        "msAccess",
        "msRefresh",
        "checkEntitlements",
        "jsonOrEmpty",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "t",
        "login",
        "onCode",
        "acc",
        "Companion",
        "PyMCL-Android:core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final CANCEL_SLICE_MS:J = 0xc8L

.field public static final Companion:Lcom/pymcl/core/auth/MicrosoftAuth$Companion;

.field public static final SCOPE:Ljava/lang/String; = "service::user.auth.xboxlive.com::MBI_SSL"

.field private static final XERR:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final clientId:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final http:Lcom/pymcl/core/net/Http;

.field private final sleeper:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$7YboR56grdf4EN6A_-tKeCttT2c(J)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/auth/MicrosoftAuth;->_init_$lambda$1(J)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Scqa7sOiLPYlxp1nElv8PX7sBE4()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/core/auth/MicrosoftAuth;->pollToken$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$YrLJc7gOLxa8z_0TmaIuowwqMMM()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/core/auth/MicrosoftAuth;->login$lambda$0()Z

    move-result v0

    return v0
.end method

.method public static synthetic $r8$lambda$ou0xckUWNYguyAu1RXrQWYzqpkE()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/core/auth/MicrosoftAuth;->_init_$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/pymcl/core/auth/MicrosoftAuth$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/auth/MicrosoftAuth$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/auth/MicrosoftAuth;->Companion:Lcom/pymcl/core/auth/MicrosoftAuth$Companion;

    .line 19
    const/4 v0, 0x6

    new-array v0, v0, [Lkotlin/Pair;

    const-wide v1, 0x8015dc03L

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "\u8be5\u8d26\u53f7\u5df2\u88ab Xbox \u5c01\u7981"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-wide v1, 0x8015dc09L

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "\u8be5\u5fae\u8f6f\u8d26\u53f7\u6ca1\u6709 Xbox \u8d26\u6237\uff0c\u8bf7\u5148\u521b\u5efa"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-wide v1, 0x8015dc0bL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "\u6240\u5728\u5730\u533a\u4e0d\u652f\u6301 Xbox Live"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 20
    const-wide v1, 0x8015dc0cL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "\u9700\u8981\u6210\u4eba\u9a8c\u8bc1\uff08\u97e9\u56fd\uff09"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    .line 19
    nop

    .line 20
    const-wide v3, 0x8015dc0dL

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 19
    nop

    .line 20
    const-wide v1, 0x8015dc0eL

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "\u513f\u7ae5\u8d26\u6237\u9700\u52a0\u5165\u5bb6\u5ead\u7ec4"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 19
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/auth/MicrosoftAuth;->XERR:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "clientId"    # Lkotlin/jvm/functions/Function0;
    .param p3, "sleeper"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/net/Http;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Long;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleeper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    iput-object p2, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->clientId:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->sleeper:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 16
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    new-instance p2, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda1;-><init>()V

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    new-instance p3, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda2;

    invoke-direct {p3}, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda2;-><init>()V

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/auth/MicrosoftAuth;-><init>(Lcom/pymcl/core/net/Http;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0()Ljava/lang/String;
    .locals 1

    .line 16
    const-string v0, "00000000402b5328"

    return-object v0
.end method

.method private static final _init_$lambda$1(J)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # J

    .line 16
    invoke-static {p0, p1}, Ljava/lang/Thread;->sleep(J)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$getXERR$cp()Ljava/util/Map;
    .locals 1

    .line 16
    sget-object v0, Lcom/pymcl/core/auth/MicrosoftAuth;->XERR:Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic completeLogin$default(Lcom/pymcl/core/auth/MicrosoftAuth;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/account/Account;
    .locals 0

    .line 70
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/auth/MicrosoftAuth;->completeLogin(Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/account/Account;

    move-result-object p0

    return-object p0
.end method

.method private final jsonOrEmpty(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .param p1, "t"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 86
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/auth/MicrosoftAuth;

    .line 188
    .local v0, "$this$jsonOrEmpty_u24lambda_u240":Lcom/pymcl/core/auth/MicrosoftAuth;
    const/4 v1, 0x0

    .line 86
    .local v1, "$i$a$-runCatching-MicrosoftAuth$jsonOrEmpty$1":I
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, p1}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .end local v0    # "$this$jsonOrEmpty_u24lambda_u240":Lcom/pymcl/core/auth/MicrosoftAuth;
    .end local v1    # "$i$a$-runCatching-MicrosoftAuth$jsonOrEmpty$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    new-array v1, v1, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    :cond_0
    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public static synthetic login$default(Lcom/pymcl/core/auth/MicrosoftAuth;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/pymcl/core/account/Account;
    .locals 0

    .line 87
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda0;

    invoke-direct {p2}, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda0;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/auth/MicrosoftAuth;->login(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/pymcl/core/account/Account;

    move-result-object p0

    return-object p0
.end method

.method private static final login$lambda$0()Z
    .locals 1

    .line 87
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic pollToken$default(Lcom/pymcl/core/auth/MicrosoftAuth;Lcom/pymcl/core/auth/DeviceCode;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    .line 34
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda3;

    invoke-direct {p2}, Lcom/pymcl/core/auth/MicrosoftAuth$$ExternalSyntheticLambda3;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/core/auth/MicrosoftAuth;->pollToken(Lcom/pymcl/core/auth/DeviceCode;Lkotlin/jvm/functions/Function0;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method private static final pollToken$lambda$0()Z
    .locals 1

    .line 34
    const/4 v0, 0x0

    return v0
.end method

.method private final sleepInterruptible(JLkotlin/jvm/functions/Function0;)V
    .locals 6
    .param p1, "ms"    # J
    .param p3, "cancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 30
    move-wide v0, p1

    .line 31
    .local v0, "left":J
    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_1

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    :cond_0
    const-wide/16 v2, 0xc8

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    .local v2, "step":J
    iget-object v4, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->sleeper:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sub-long/2addr v0, v2

    .end local v2    # "step":J
    goto :goto_0

    .line 32
    :cond_1
    return-void
.end method

.method private final xbl(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "ms"    # Ljava/lang/String;

    .line 56
    const/4 v0, 0x2

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "d="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v1, v4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 57
    .local v3, "ticket":Ljava/lang/String;
    iget-object v5, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v7, 0x3

    new-array v8, v7, [Lkotlin/Pair;

    new-array v7, v7, [Lkotlin/Pair;

    const-string v9, "AuthMethod"

    const-string v10, "RPS"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v2

    const-string v9, "SiteName"

    const-string v10, "user.auth.xboxlive.com"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v4

    const-string v9, "RpsTicket"

    invoke-static {v9, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    aput-object v9, v7, v0

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const-string v9, "Properties"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v8, v2

    const-string v7, "RelyingParty"

    const-string v9, "http://auth.xboxlive.com"

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v8, v4

    const-string v7, "TokenType"

    const-string v9, "JWT"

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v8, v0

    invoke-static {v8}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v6, v7, v2, v0, v8}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "https://user.auth.xboxlive.com/user/authenticate"

    invoke-static/range {v5 .. v10}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v5

    .line 58
    .local v5, "r":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v6

    if-eqz v6, :cond_0

    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "Token"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 60
    .end local v3    # "ticket":Ljava/lang/String;
    .end local v5    # "r":Lcom/pymcl/core/net/HttpResponse;
    :cond_1
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    const-string v1, "Xbox Live \u8ba4\u8bc1\u5931\u8d25"

    const-string v2, "xbl"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method private final xsts(Ljava/lang/String;)Lkotlin/Pair;
    .locals 8
    .param p1, "xbl"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v2, 0x3

    new-array v2, v2, [Lkotlin/Pair;

    const/4 v3, 0x2

    new-array v4, v3, [Lkotlin/Pair;

    const-string v5, "SandboxId"

    const-string v6, "RETAIL"

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-string v7, "UserTokens"

    invoke-static {v7, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v7, 0x1

    aput-object v5, v4, v7

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const-string v5, "Properties"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v6

    const-string v4, "RelyingParty"

    const-string v5, "rp://api.minecraftservices.com/"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v7

    const-string v4, "TokenType"

    const-string v5, "JWT"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v1, v2, v6, v3, v4}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "https://xsts.auth.xboxlive.com/xsts/authorize"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v1

    .line 64
    .local v1, "r":Lcom/pymcl/core/net/HttpResponse;
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/core/auth/MicrosoftAuth;

    .line 188
    .local v0, "$this$xsts_u24lambda_u240":Lcom/pymcl/core/auth/MicrosoftAuth;
    const/4 v2, 0x0

    .line 64
    .local v2, "$i$a$-runCatching-MicrosoftAuth$xsts$o$1":I
    sget-object v3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v1}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .end local v0    # "$this$xsts_u24lambda_u240":Lcom/pymcl/core/auth/MicrosoftAuth;
    .end local v2    # "$i$a$-runCatching-MicrosoftAuth$xsts$o$1":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    new-array v2, v6, [Lkotlin/Pair;

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v2

    :cond_0
    check-cast v0, Ljava/util/Map;

    .line 65
    .local v0, "o":Ljava/util/Map;
    invoke-virtual {v1}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v2

    const/16 v3, 0x191

    if-ne v2, v3, :cond_3

    const-string v2, "XErr"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_1

    :cond_1
    const-wide/16 v2, 0x0

    .local v2, "x":J
    :goto_1
    new-instance v4, Lcom/pymcl/core/auth/AuthException;

    sget-object v5, Lcom/pymcl/core/auth/MicrosoftAuth;->XERR:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-nez v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "XSTS \u8ba4\u8bc1\u5931\u8d25 ("

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ")"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_2
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v4

    .line 66
    .end local v2    # "x":J
    :cond_3
    invoke-virtual {v1}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v2

    if-eqz v2, :cond_5

    .line 67
    const-string v2, "Token"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v3, "DisplayClaims"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    const-string v4, "xui"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    const-string v4, "uhs"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_4

    const-string v3, ""

    :cond_4
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    return-object v2

    .line 66
    :cond_5
    new-instance v2, Lcom/pymcl/core/auth/AuthException;

    invoke-virtual {v1}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "XSTS \u8ba4\u8bc1\u5931\u8d25 HTTP "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "xsts"

    invoke-direct {v2, v3, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final completeLogin(Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/account/Account;
    .locals 21
    .param p1, "msAccess"    # Ljava/lang/String;
    .param p2, "msRefresh"    # Ljava/lang/String;
    .param p3, "checkEntitlements"    # Z

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "msAccess"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "msRefresh"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    invoke-direct/range {p0 .. p1}, Lcom/pymcl/core/auth/MicrosoftAuth;->xbl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/pymcl/core/auth/MicrosoftAuth;->xsts(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "xs":Ljava/lang/String;
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 72
    .local v2, "uhs":Ljava/lang/String;
    iget-object v5, v0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    sget-object v6, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    const/4 v11, 0x1

    new-array v7, v11, [Lkotlin/Pair;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "XBL3.0 x="

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ";"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "identityToken"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    const/4 v12, 0x0

    aput-object v8, v7, v12

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    const/4 v13, 0x2

    const/4 v14, 0x0

    invoke-static {v6, v7, v12, v13, v14}, Lcom/pymcl/core/util/Json;->stringify$default(Lcom/pymcl/core/util/Json;Ljava/lang/Object;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v6, "https://api.minecraftservices.com/authentication/login_with_xbox"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/pymcl/core/net/Http;->postJson$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v5

    .line 74
    .local v5, "lr":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/pymcl/core/auth/MicrosoftAuth;->jsonOrEmpty(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    const-string v7, "access_token"

    invoke-static {v6, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    move-object v8, v6

    .line 188
    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 74
    .local v9, "$i$a$-takeIf-MicrosoftAuth$completeLogin$mc$1":I
    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v8

    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-takeIf-MicrosoftAuth$completeLogin$mc$1":I
    if-eqz v8, :cond_0

    goto :goto_0

    :cond_0
    move-object v6, v14

    :goto_0
    if-nez v6, :cond_1

    goto/16 :goto_4

    .line 75
    .local v6, "mc":Ljava/lang/String;
    :cond_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Bearer "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "Authorization"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    invoke-static {v8}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v17

    .line 76
    .local v17, "bearer":Ljava/util/Map;
    if-eqz p3, :cond_6

    iget-object v15, v0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string v16, "https://api.minecraftservices.com/entitlements/mcstore"

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lcom/pymcl/core/net/Http;->get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v8

    .line 77
    .local v8, "er":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v9

    if-eqz v9, :cond_5

    .line 78
    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Lcom/pymcl/core/auth/MicrosoftAuth;->jsonOrEmpty(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    const-string v10, "items"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    if-eqz v9, :cond_3

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_2

    goto :goto_1

    :cond_2
    move v9, v12

    goto :goto_2

    :cond_3
    :goto_1
    move v9, v11

    :goto_2
    if-nez v9, :cond_4

    goto :goto_3

    :cond_4
    new-instance v7, Lcom/pymcl/core/auth/AuthException;

    const-string v9, "\u8be5\u8d26\u53f7\u672a\u8d2d\u4e70 Minecraft\uff08\u6216 XGP \u5df2\u5230\u671f\uff09"

    const-string v10, "not_owned"

    invoke-direct {v7, v9, v10}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v7

    .line 77
    :cond_5
    new-instance v7, Lcom/pymcl/core/auth/AuthException;

    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "\u67e5\u8be2\u6e38\u620f\u6240\u6709\u6743\u5931\u8d25 HTTP "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "entitlements"

    invoke-direct {v7, v9, v10}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v7

    .line 79
    .end local v8    # "er":Lcom/pymcl/core/net/HttpResponse;
    :cond_6
    :goto_3
    iget-object v15, v0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    const/16 v19, 0x4

    const/16 v20, 0x0

    const-string v16, "https://api.minecraftservices.com/minecraft/profile"

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Lcom/pymcl/core/net/Http;->get$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v8

    .line 80
    .local v8, "pr":Lcom/pymcl/core/net/HttpResponse;
    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v9

    const/16 v10, 0x194

    if-eq v9, v10, :cond_9

    .line 81
    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Lcom/pymcl/core/auth/MicrosoftAuth;->jsonOrEmpty(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    .local v9, "p":Ljava/util/Map;
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    const/16 v10, 0x3e8

    move/from16 v18, v11

    move/from16 v19, v12

    int-to-long v11, v10

    div-long/2addr v15, v11

    .line 82
    .local v15, "now":J
    const-string v10, "id"

    invoke-static {v9, v10}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_8

    move-object v11, v10

    .line 188
    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 82
    .local v12, "$i$a$-takeIf-MicrosoftAuth$completeLogin$pid$1":I
    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getOk()Z

    move-result v11

    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-takeIf-MicrosoftAuth$completeLogin$pid$1":I
    if-eqz v11, :cond_7

    move-object v14, v10

    :cond_7
    if-eqz v14, :cond_8

    .line 83
    .local v14, "pid":Ljava/lang/String;
    new-instance v10, Lcom/pymcl/core/account/Account;

    const/16 v11, 0x8

    new-array v11, v11, [Lkotlin/Pair;

    const-string v12, "type"

    move/from16 v20, v13

    const-string v13, "microsoft"

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v11, v19

    const-string v12, "name"

    invoke-static {v9, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v11, v18

    const-string v12, "uuid"

    invoke-static {v14}, Lcom/pymcl/core/account/AccountsKt;->dashedUuid(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    aput-object v12, v11, v20

    const/4 v12, 0x3

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v11, v12

    const-string v7, "refresh_token"

    invoke-static {v7, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v12, 0x4

    aput-object v7, v11, v12

    .line 84
    const-string v7, "xuid"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v12, 0x5

    aput-object v7, v11, v12

    .line 83
    nop

    .line 84
    const v7, 0x11940

    int-to-long v12, v7

    add-long/2addr v12, v15

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const-string v12, "expires_at"

    invoke-static {v12, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v12, 0x6

    aput-object v7, v11, v12

    .line 83
    nop

    .line 84
    const-string v7, "updated_at"

    invoke-static/range {v15 .. v16}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v12, 0x7

    aput-object v7, v11, v12

    .line 83
    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    invoke-direct {v10, v7}, Lcom/pymcl/core/account/Account;-><init>(Ljava/util/Map;)V

    return-object v10

    .line 82
    .end local v14    # "pid":Ljava/lang/String;
    :cond_8
    new-instance v7, Lcom/pymcl/core/auth/AuthException;

    invoke-virtual {v8}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "\u8bfb\u53d6 Minecraft \u6863\u6848\u5931\u8d25 HTTP "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "profile"

    invoke-direct {v7, v10, v11}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v7

    .line 80
    .end local v9    # "p":Ljava/util/Map;
    .end local v15    # "now":J
    :cond_9
    new-instance v7, Lcom/pymcl/core/auth/AuthException;

    const-string v9, "\u5c1a\u672a\u521b\u5efa Minecraft \u6863\u6848\uff0c\u8bf7\u5148\u5728\u5b98\u7f51\u8bbe\u7f6e\u89d2\u8272\u540d"

    const-string v10, "no_profile"

    invoke-direct {v7, v9, v10}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v7

    .line 74
    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "pr":Lcom/pymcl/core/net/HttpResponse;
    .end local v17    # "bearer":Ljava/util/Map;
    :cond_a
    :goto_4
    new-instance v6, Lcom/pymcl/core/auth/AuthException;

    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v7

    const/16 v8, 0x1ad

    if-ne v7, v8, :cond_b

    const-string v7, "Minecraft \u767b\u5f55\u8bf7\u6c42\u8fc7\u4e8e\u9891\u7e41\uff0c\u8bf7\u7a0d\u540e\u518d\u8bd5"

    goto :goto_5

    :cond_b
    invoke-virtual {v5}, Lcom/pymcl/core/net/HttpResponse;->getCode()I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Minecraft \u767b\u5f55\u5931\u8d25 HTTP "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_5
    const-string v8, "mc"

    invoke-direct {v6, v7, v8}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v6
.end method

.method public final login(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/pymcl/core/account/Account;
    .locals 9
    .param p1, "onCode"    # Lkotlin/jvm/functions/Function1;
    .param p2, "cancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/core/auth/DeviceCode;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/pymcl/core/account/Account;"
        }
    .end annotation

    const-string v0, "onCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancelled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    invoke-virtual {p0}, Lcom/pymcl/core/auth/MicrosoftAuth;->requestDeviceCode()Lcom/pymcl/core/auth/DeviceCode;

    move-result-object v0

    .local v0, "dc":Lcom/pymcl/core/auth/DeviceCode;
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0, p2}, Lcom/pymcl/core/auth/MicrosoftAuth;->pollToken(Lcom/pymcl/core/auth/DeviceCode;Lkotlin/jvm/functions/Function0;)Lkotlin/Pair;

    move-result-object v1

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    .local v4, "a":Ljava/lang/String;
    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ljava/lang/String;

    .local v5, "r":Ljava/lang/String;
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/core/auth/MicrosoftAuth;->completeLogin$default(Lcom/pymcl/core/auth/MicrosoftAuth;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lcom/pymcl/core/account/Account;

    move-result-object v1

    return-object v1
.end method

.method public final pollToken(Lcom/pymcl/core/auth/DeviceCode;Lkotlin/jvm/functions/Function0;)Lkotlin/Pair;
    .locals 17
    .param p1, "dc"    # Lcom/pymcl/core/auth/DeviceCode;
    .param p2, "cancelled"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/auth/DeviceCode;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const-string v0, "dc"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "cancelled"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v3}, Lcom/pymcl/core/auth/DeviceCode;->getInterval()I

    move-result v0

    .local v0, "interval":I
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3}, Lcom/pymcl/core/auth/DeviceCode;->getExpiresIn()I

    move-result v7

    int-to-long v7, v7

    const-wide/16 v9, 0x3e8

    mul-long/2addr v7, v9

    add-long/2addr v5, v7

    move v7, v0

    .line 36
    .end local v0    # "interval":I
    .local v5, "deadline":J
    .local v7, "interval":I
    :cond_0
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    cmp-long v0, v11, v5

    const-string v8, "expired_token"

    if-gez v0, :cond_9

    .line 37
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v11, "\u5df2\u53d6\u6d88"

    if-nez v0, :cond_8

    .line 38
    int-to-long v12, v7

    mul-long/2addr v12, v9

    invoke-direct {v1, v12, v13, v2}, Lcom/pymcl/core/auth/MicrosoftAuth;->sleepInterruptible(JLkotlin/jvm/functions/Function0;)V

    .line 40
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_7

    .line 41
    :try_start_0
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v11, v1, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    const-string v12, "https://login.live.com/oauth20_token.srf"

    const/4 v13, 0x3

    new-array v13, v13, [Lkotlin/Pair;

    const-string v14, "grant_type"

    const-string v15, "urn:ietf:params:oauth:grant-type:device_code"

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    const/4 v15, 0x0

    aput-object v14, v13, v15

    const-string v14, "client_id"

    iget-object v15, v1, Lcom/pymcl/core/auth/MicrosoftAuth;->clientId:Lkotlin/jvm/functions/Function0;

    invoke-interface {v15}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    const/4 v15, 0x1

    aput-object v14, v13, v15

    const-string v14, "device_code"

    invoke-virtual {v3}, Lcom/pymcl/core/auth/DeviceCode;->getDeviceCode()Ljava/lang/String;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    const/4 v15, 0x2

    aput-object v14, v13, v15

    invoke-static {v13}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/pymcl/core/net/Http;->postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v11

    invoke-virtual {v11}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .local v0, "o":Ljava/util/Map;
    const-string v11, "access_token"

    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, ""

    if-eqz v11, :cond_2

    .line 188
    .local v11, "it":Ljava/lang/String;
    const/4 v4, 0x0

    .line 44
    .local v4, "$i$a$-let-MicrosoftAuth$pollToken$2":I
    const-string v8, "refresh_token"

    invoke-static {v0, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1

    goto :goto_1

    :cond_1
    move-object v12, v8

    :goto_1
    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    return-object v8

    .line 45
    .end local v4    # "$i$a$-let-MicrosoftAuth$pollToken$2":I
    .end local v11    # "it":Ljava/lang/String;
    :cond_2
    const-string v11, "error"

    invoke-static {v0, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .local v11, "err":Ljava/lang/String;
    const-string v13, "\u5fae\u8f6f\u767b\u5f55\u5931\u8d25: "

    if-eqz v11, :cond_5

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :sswitch_1
    const-string v4, "authorization_declined"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :sswitch_2
    const-string v8, "slow_down"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v7, v7, 0x5

    goto/16 :goto_0

    :sswitch_3
    const-string v8, "authorization_pending"

    invoke-virtual {v11, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_2

    :sswitch_4
    const-string v4, "bad_verification_code"

    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    .line 46
    :cond_4
    new-instance v4, Lcom/pymcl/core/auth/AuthException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8, v11}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v4

    .line 47
    :cond_5
    :goto_2
    new-instance v4, Lcom/pymcl/core/auth/AuthException;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    if-nez v11, :cond_6

    goto :goto_3

    :cond_6
    move-object v12, v11

    :goto_3
    invoke-direct {v4, v8, v12}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v4

    .line 43
    .end local v0    # "o":Ljava/util/Map;
    .end local v11    # "err":Ljava/lang/String;
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/IndexOutOfBoundsException;
    goto/16 :goto_0

    .end local v0    # "e":Ljava/lang/IndexOutOfBoundsException;
    :catch_1
    move-exception v0

    .local v0, "e":Ljava/lang/IllegalArgumentException;
    goto/16 :goto_0

    .line 42
    .end local v0    # "e":Ljava/lang/IllegalArgumentException;
    :catch_2
    move-exception v0

    .local v0, "e":Ljava/io/IOException;
    goto/16 :goto_0

    .line 40
    .end local v0    # "e":Ljava/io/IOException;
    :cond_7
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    invoke-direct {v0, v11, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 37
    :cond_8
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    invoke-direct {v0, v11, v4}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_9
    new-instance v0, Lcom/pymcl/core/auth/AuthException;

    const-string v4, "\u8bbe\u5907\u7801\u5df2\u8fc7\u671f"

    invoke-direct {v0, v4, v8}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c428829 -> :sswitch_4
        -0x723d782f -> :sswitch_3
        0x2e0b0c20 -> :sswitch_2
        0x39abc534 -> :sswitch_1
        0x6017145f -> :sswitch_0
    .end sparse-switch
.end method

.method public final refresh(Lcom/pymcl/core/account/Account;)Lcom/pymcl/core/account/Account;
    .locals 3
    .param p1, "acc"    # Lcom/pymcl/core/account/Account;

    const-string v0, "acc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    invoke-virtual {p1}, Lcom/pymcl/core/account/Account;->getRefreshToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pymcl/core/auth/MicrosoftAuth;->refreshMs(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v0

    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "a":Ljava/lang/String;
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .local v0, "r":Ljava/lang/String;
    const/4 v2, 0x0

    invoke-virtual {p0, v1, v0, v2}, Lcom/pymcl/core/auth/MicrosoftAuth;->completeLogin(Ljava/lang/String;Ljava/lang/String;Z)Lcom/pymcl/core/account/Account;

    move-result-object v2

    return-object v2
.end method

.method public final refreshMs(Ljava/lang/String;)Lkotlin/Pair;
    .locals 9
    .param p1, "refresh"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "refresh"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v2, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    const/4 v3, 0x4

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "grant_type"

    const-string v8, "refresh_token"

    invoke-static {v4, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    iget-object v4, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->clientId:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    const-string v5, "client_id"

    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const/4 v4, 0x2

    invoke-static {v8, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    aput-object v5, v3, v4

    const-string v4, "scope"

    const-string v5, "service::user.auth.xboxlive.com::MBI_SSL"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x3

    aput-object v4, v3, v5

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "https://login.live.com/oauth20_token.srf"

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lcom/pymcl/core/net/Http;->postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 53
    .local v1, "o":Ljava/util/Map;
    const-string v2, "access_token"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v1, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p1

    :cond_0
    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v2, Lcom/pymcl/core/auth/AuthException;

    const-string v3, "error"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5237\u65b0\u5931\u8d25: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v2
.end method

.method public final requestDeviceCode()Lcom/pymcl/core/auth/DeviceCode;
    .locals 9

    .line 25
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v1, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->http:Lcom/pymcl/core/net/Http;

    const/4 v2, 0x3

    new-array v2, v2, [Lkotlin/Pair;

    iget-object v3, p0, Lcom/pymcl/core/auth/MicrosoftAuth;->clientId:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "client_id"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "scope"

    const-string v4, "service::user.auth.xboxlive.com::MBI_SSL"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, "response_type"

    const-string v7, "device_code"

    invoke-static {v3, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v8, 0x2

    aput-object v3, v2, v8

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "https://login.live.com/oauth20_connect.srf"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/pymcl/core/net/Http;->postForm$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/pymcl/core/net/HttpResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/core/net/HttpResponse;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 26
    .local v0, "o":Ljava/util/Map;
    new-instance v1, Lcom/pymcl/core/auth/DeviceCode;

    invoke-static {v0, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    const-string v3, "user_code"

    invoke-static {v0, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v4, "verification_uri"

    invoke-static {v0, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, "https://www.microsoft.com/link"

    :cond_0
    const-string v5, "expires_in"

    invoke-static {v0, v5}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_0

    :cond_1
    const/16 v5, 0x384

    :goto_0
    const-string v6, "interval"

    invoke-static {v0, v6}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1

    :cond_2
    const/4 v6, 0x5

    :goto_1
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/core/auth/DeviceCode;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V

    return-object v1

    :cond_3
    new-instance v1, Lcom/pymcl/core/auth/AuthException;

    const-string v2, "error"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u83b7\u53d6\u8bbe\u5907\u7801\u5931\u8d25: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v8, v3}, Lcom/pymcl/core/auth/AuthException;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1
.end method
