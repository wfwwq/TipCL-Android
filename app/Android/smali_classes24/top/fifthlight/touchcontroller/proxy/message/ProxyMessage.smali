.class public abstract Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.super Ljava/lang/Object;
.source "ProxyMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000b\u0082\u0001\u000c\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "",
        "<init>",
        "()V",
        "type",
        "",
        "getType",
        "()I",
        "wrapInLargeMessage",
        "",
        "getWrapInLargeMessage",
        "()Z",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "Companion",
        "Ltop/fifthlight/touchcontroller/proxy/message/AddPointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ClearPointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/InitializeMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/InputAreaMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/InputCursorMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/KeyboardShowMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/LargeMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/MoveViewMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/RemovePointerMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;",
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
.field public static final Companion:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>()V

    return-void
.end method


# virtual methods
.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->getType()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 12
    return-void
.end method

.method public abstract getType()I
.end method

.method public getWrapInLargeMessage()Z
    .locals 1

    .line 8
    const/4 v0, 0x0

    return v0
.end method
