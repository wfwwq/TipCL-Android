.class public final Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
.super Ljava/lang/Object;
.source "TextRange.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\ntop/fifthlight/touchcontroller/proxy/message/input/TextRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;",
        "",
        "start",
        "",
        "length",
        "<init>",
        "(II)V",
        "(I)V",
        "getStart",
        "()I",
        "getLength",
        "end",
        "getEnd",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "Companion",
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
.field public static final Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

.field private static final EMPTY:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;


# instance fields
.field private final length:I

.field private final start:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->Companion:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange$Companion;

    .line 17
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->EMPTY:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .param p1, "start"    # I

    .line 12
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    return-void
.end method

.method public constructor <init>(II)V
    .locals 3
    .param p1, "start"    # I
    .param p2, "length"    # I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    .line 5
    iput p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    .line 7
    nop

    .line 8
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 9
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    if-ltz v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    if-eqz v1, :cond_2

    .line 10
    nop

    .line 3
    return-void

    .line 24
    :cond_2
    const/4 v0, 0x0

    .line 9
    .local v0, "$i$a$-require-TextRange$2":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Length of TextRange should not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-TextRange$2":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 24
    :cond_3
    const/4 v0, 0x0

    .line 8
    .local v0, "$i$a$-require-TextRange$1":I
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Start of TextRange should not be negative: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-require-TextRange$1":I
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic access$getEMPTY$cp()Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    .line 3
    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->EMPTY:Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    return-object v0
.end method

.method public static synthetic copy$default(Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;IIILjava/lang/Object;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->copy(II)Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    return v0
.end method

.method public final copy(II)Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    invoke-direct {v0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    iget v4, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget v3, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    iget v1, v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    if-eq v3, v1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getEnd()I
    .locals 2

    .line 14
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final getLength()I
    .locals 1

    .line 5
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    return v0
.end method

.method public final getStart()I
    .locals 1

    .line 4
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TextRange(start="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->start:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;->length:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
