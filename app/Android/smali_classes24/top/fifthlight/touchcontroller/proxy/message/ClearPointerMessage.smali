.class public final Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "ClearPointerMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage$Decoder;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\n\u0018\u00002\u00020\u0001:\u0001\u000fB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "<init>",
        "()V",
        "type",
        "",
        "getType",
        "()I",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "toString",
        "",
        "Decoder",
        "TouchController-Proxy-Client"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

.field private static final type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    .line 6
    const/4 v0, 0x3

    sput v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;->type:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 5
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    if-nez v1, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;

    return v0
.end method

.method public getType()I
    .locals 1

    .line 6
    sget v0, Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x2b26a527

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ClearPointerMessage"

    return-object v0
.end method
