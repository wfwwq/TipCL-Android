.class public final Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "VibrateMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Decoder;,
        Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0012"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "kind",
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
        "<init>",
        "(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V",
        "getKind",
        "()Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
        "type",
        "",
        "getType",
        "()I",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "Kind",
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


# instance fields
.field private final kind:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

.field private final type:I


# direct methods
.method public constructor <init>(Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;)V
    .locals 1
    .param p1, "kind"    # Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    const-string v0, "kind"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->kind:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    .line 8
    const/4 v0, 0x4

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->type:I

    .line 5
    return-void
.end method


# virtual methods
.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 17
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->kind:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->getIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 18
    return-void
.end method

.method public final getKind()Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
    .locals 1

    .line 6
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->kind:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    return-object v0
.end method

.method public getType()I
    .locals 1

    .line 8
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;->type:I

    return v0
.end method
