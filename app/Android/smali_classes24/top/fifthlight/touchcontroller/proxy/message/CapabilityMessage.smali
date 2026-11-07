.class public final Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
.source "CapabilityMessage.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage$Decoder;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCapabilityMessage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapabilityMessage.kt\ntop/fifthlight/touchcontroller/proxy/message/CapabilityMessage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\rH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\rX\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001d"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;",
        "capability",
        "",
        "enabled",
        "",
        "<init>",
        "(Ljava/lang/String;Z)V",
        "getCapability",
        "()Ljava/lang/String;",
        "getEnabled",
        "()Z",
        "type",
        "",
        "getType",
        "()I",
        "encode",
        "",
        "buffer",
        "Ljava/nio/ByteBuffer;",
        "component1",
        "component2",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
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
.field private final capability:Ljava/lang/String;

.field private final enabled:Z

.field private final type:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 3
    .param p1, "capability"    # Ljava/lang/String;
    .param p2, "enabled"    # Z

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 6
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    .line 7
    iput-boolean p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    .line 9
    const/4 v0, 0x5

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->type:I

    .line 11
    nop

    .line 12
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x80

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 13
    nop

    .line 5
    return-void

    .line 54
    :cond_1
    const/4 v0, 0x0

    .line 12
    .local v0, "$i$a$-require-CapabilityMessage$1":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Capability too long: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-CapabilityMessage$1":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;Ljava/lang/String;ZILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->copy(Ljava/lang/String;Z)Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Z)Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    invoke-direct {v0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method public encode(Ljava/nio/ByteBuffer;)V
    .locals 1
    .param p1, "buffer"    # Ljava/nio/ByteBuffer;

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-super {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;->encode(Ljava/nio/ByteBuffer;)V

    .line 17
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 18
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-static {v0}, Lkotlin/text/StringsKt;->encodeToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 19
    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    if-eqz v0, :cond_0

    .line 20
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 24
    :goto_0
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;

    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    iget-object v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    iget-boolean v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    if-eq v3, v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getCapability()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 7
    iget-boolean v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    return v0
.end method

.method public getType()I
    .locals 1

    .line 9
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->type:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CapabilityMessage(capability="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->capability:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/CapabilityMessage;->enabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
