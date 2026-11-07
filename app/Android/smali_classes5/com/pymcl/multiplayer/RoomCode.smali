.class public final Lcom/pymcl/multiplayer/RoomCode;
.super Ljava/lang/Object;
.source "RoomCode.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRoomCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomCode.kt\ncom/pymcl/multiplayer/RoomCode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000c\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u000c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002\u00a2\u0006\u0002\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0008\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/multiplayer/RoomCode;",
        "",
        "<init>",
        "()V",
        "ALPHABET",
        "",
        "WIDTH",
        "",
        "B34",
        "Ljava/math/BigInteger;",
        "kotlin.jvm.PlatformType",
        "B7",
        "lookup",
        "c",
        "",
        "(C)Ljava/lang/Integer;",
        "parse",
        "text",
        "format",
        "value",
        "PyMCL-Android:multiplayer_debug"
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
.field public static final ALPHABET:Ljava/lang/String; = "0123456789ABCDEFGHJKLMNPQRSTUVWXYZ"

.field private static final B34:Ljava/math/BigInteger;

.field private static final B7:Ljava/math/BigInteger;

.field public static final INSTANCE:Lcom/pymcl/multiplayer/RoomCode;

.field private static final WIDTH:I = 0x15


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/multiplayer/RoomCode;

    invoke-direct {v0}, Lcom/pymcl/multiplayer/RoomCode;-><init>()V

    sput-object v0, Lcom/pymcl/multiplayer/RoomCode;->INSTANCE:Lcom/pymcl/multiplayer/RoomCode;

    .line 10
    const-wide/16 v0, 0x22

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/pymcl/multiplayer/RoomCode;->B34:Ljava/math/BigInteger;

    const-wide/16 v0, 0x7

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lcom/pymcl/multiplayer/RoomCode;->B7:Ljava/math/BigInteger;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final lookup(C)Ljava/lang/Integer;
    .locals 9
    .param p1, "c"    # C

    .line 12
    const/4 v0, 0x0

    const/4 v1, 0x1

    sparse-switch p1, :sswitch_data_0

    const-string v2, "0123456789ABCDEFGHJKLMNPQRSTUVWXYZ"

    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v4, p1

    .end local p1    # "c":C
    .local v4, "c":C
    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->indexOf$default(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 41
    .local v2, "it":I
    const/4 v3, 0x0

    .line 12
    .local v3, "$i$a$-takeIf-RoomCode$lookup$1":I
    if-ltz v2, :cond_0

    move v0, v1

    goto :goto_1

    .end local v2    # "it":I
    .end local v3    # "$i$a$-takeIf-RoomCode$lookup$1":I
    .end local v4    # "c":C
    .restart local p1    # "c":C
    :sswitch_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :goto_0
    move v4, p1

    goto :goto_2

    .end local p1    # "c":C
    .restart local v4    # "c":C
    :cond_0
    :goto_1
    if-eqz v0, :cond_1

    move-object v0, p1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_2
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x49 -> :sswitch_1
        0x4f -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final format(Ljava/math/BigInteger;)Ljava/lang/String;
    .locals 7
    .param p1, "value"    # Ljava/math/BigInteger;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    move-object v0, p1

    .local v0, "v":Ljava/math/BigInteger;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "U/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .local v1, "sb":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    .line 34
    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const/16 v3, 0x2d

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    :goto_1
    sget-object v3, Lcom/pymcl/multiplayer/RoomCode;->B34:Ljava/math/BigInteger;

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->divideAndRemainder(Ljava/math/BigInteger;)[Ljava/math/BigInteger;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v4, 0x0

    aget-object v4, v3, v4

    .local v4, "q":Ljava/math/BigInteger;
    const/4 v5, 0x1

    aget-object v3, v3, v5

    .local v3, "r":Ljava/math/BigInteger;
    const-string v5, "0123456789ABCDEFGHJKLMNPQRSTUVWXYZ"

    invoke-virtual {v3}, Ljava/math/BigInteger;->intValue()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v0, v4

    .line 33
    .end local v3    # "r":Ljava/math/BigInteger;
    .end local v4    # "q":Ljava/math/BigInteger;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 37
    .end local v2    # "i":I
    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "toString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x8 -> :sswitch_0
        0xc -> :sswitch_0
    .end sparse-switch
.end method

.method public final parse(Ljava/lang/String;)Ljava/lang/String;
    .locals 11
    .param p1, "text"    # Ljava/lang/String;

    .line 16
    if-nez p1, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toUpperCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .local v0, "s":Ljava/lang/String;
    const/4 v1, 0x0

    .local v1, "i":I
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x15

    if-gt v1, v2, :cond_6

    .line 18
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x55

    if-ne v3, v4, :cond_5

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    goto :goto_5

    .line 19
    :cond_1
    add-int/lit8 v3, v1, 0x2

    add-int/lit8 v4, v1, 0x15

    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "substring(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .local v3, "body":Ljava/lang/String;
    sget-object v4, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .local v4, "v":Ljava/math/BigInteger;
    const/4 v5, 0x0

    .local v5, "ok":Z
    const/4 v5, 0x1

    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    .local v6, "k":I
    :goto_2
    const/4 v7, -0x1

    if-ge v7, v6, :cond_4

    .line 22
    sparse-switch v6, :sswitch_data_0

    .line 23
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-direct {p0, v7}, Lcom/pymcl/multiplayer/RoomCode;->lookup(C)Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_3

    .line 22
    :sswitch_0
    invoke-virtual {v3, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x2d

    if-eq v7, v8, :cond_2

    const/4 v5, 0x0

    goto :goto_4

    .line 24
    .local v7, "d":I
    :goto_3
    sget-object v8, Lcom/pymcl/multiplayer/RoomCode;->B34:Ljava/math/BigInteger;

    invoke-virtual {v4, v8}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v8

    int-to-long v9, v7

    invoke-static {v9, v10}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 21
    .end local v7    # "d":I
    :cond_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_2

    .line 23
    :cond_3
    move-object v7, p0

    check-cast v7, Lcom/pymcl/multiplayer/RoomCode;

    .line 41
    .local v7, "$this$parse_u24lambda_u240":Lcom/pymcl/multiplayer/RoomCode;
    const/4 v8, 0x0

    .line 23
    .local v8, "$i$a$-run-RoomCode$parse$d$1":I
    const/4 v5, 0x0

    .line 26
    .end local v6    # "k":I
    .end local v7    # "$this$parse_u24lambda_u240":Lcom/pymcl/multiplayer/RoomCode;
    .end local v8    # "$i$a$-run-RoomCode$parse$d$1":I
    :cond_4
    :goto_4
    if-eqz v5, :cond_5

    sget-object v6, Lcom/pymcl/multiplayer/RoomCode;->B7:Ljava/math/BigInteger;

    invoke-virtual {v4, v6}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    sget-object v7, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lcom/pymcl/multiplayer/RoomCode;->format(Ljava/math/BigInteger;)Ljava/lang/String;

    move-result-object v2

    return-object v2

    .line 17
    .end local v3    # "body":Ljava/lang/String;
    .end local v4    # "v":Ljava/math/BigInteger;
    .end local v5    # "ok":Z
    :cond_5
    :goto_5
    if-eq v1, v2, :cond_6

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 28
    .end local v1    # "i":I
    :cond_6
    const/4 v1, 0x0

    return-object v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x9 -> :sswitch_0
        0xe -> :sswitch_0
    .end sparse-switch
.end method
