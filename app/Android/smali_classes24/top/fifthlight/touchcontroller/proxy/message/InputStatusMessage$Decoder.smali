.class public final Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;
.super Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;
.source "InputStatusMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Decoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder<",
        "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;",
        "Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;",
        "<init>",
        "()V",
        "decode",
        "payload",
        "Ljava/nio/ByteBuffer;",
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
.field public static final INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;

    invoke-direct {v0}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;-><init>()V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;->INSTANCE:Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 76
    invoke-direct {p0}, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessageDecoder;-><init>()V

    return-void
.end method


# virtual methods
.method public decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;
    .locals 17
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    move-object/from16 v0, p1

    const-string v1, "payload"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    .line 79
    .local v1, "hasData":Z
    :goto_0
    if-nez v1, :cond_1

    .line 80
    new-instance v2, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    return-object v2

    .line 83
    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v4

    const/16 v5, 0x14

    if-lt v4, v5, :cond_4

    .line 90
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v4

    .line 91
    .local v4, "textLength":I
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v5

    add-int/lit8 v6, v4, 0x11

    if-lt v5, v6, :cond_3

    .line 98
    new-array v5, v4, [B

    .line 99
    .local v5, "textArray":[B
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 100
    invoke-static {v5}, Lkotlin/text/StringsKt;->decodeToString([B)Ljava/lang/String;

    move-result-object v6

    .line 102
    .local v6, "text":Ljava/lang/String;
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v7

    .line 103
    .local v7, "compositionStartUtf8":I
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    .line 104
    .local v8, "compositionLengthUtf8":I
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v9

    .line 105
    .local v9, "selectionStartUtf8":I
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v10

    .line 106
    .local v10, "selectionLengthUtf8":I
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v11

    if-eqz v11, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    .line 108
    .local v2, "selectionLeft":Z
    :goto_1
    nop

    .line 109
    nop

    .line 110
    nop

    .line 108
    invoke-static {v6, v7, v8}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->access$convertUtf8RangeToUtf16(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v3

    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    .local v11, "compositionStart":I
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    .line 112
    .local v3, "compositionLength":I
    nop

    .line 113
    nop

    .line 114
    nop

    .line 112
    invoke-static {v6, v9, v10}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessageKt;->access$convertUtf8RangeToUtf16(Ljava/lang/String;II)Lkotlin/Pair;

    move-result-object v12

    invoke-virtual {v12}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v13

    .local v13, "selectionStart":I
    invoke-virtual {v12}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Number;

    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    move-result v12

    .line 117
    .local v12, "selectionLength":I
    new-instance v14, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    .line 118
    new-instance v15, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    .line 119
    nop

    .line 120
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    .line 121
    nop

    .line 122
    nop

    .line 120
    invoke-direct {v0, v11, v3}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 124
    move/from16 v16, v1

    .end local v1    # "hasData":Z
    .local v16, "hasData":Z
    new-instance v1, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;

    .line 125
    nop

    .line 126
    nop

    .line 124
    invoke-direct {v1, v13, v12}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;-><init>(II)V

    .line 128
    nop

    .line 118
    invoke-direct {v15, v6, v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;-><init>(Ljava/lang/String;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Ltop/fifthlight/touchcontroller/proxy/message/input/TextRange;Z)V

    .line 117
    invoke-direct {v14, v15}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;-><init>(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    return-object v14

    .line 92
    .end local v2    # "selectionLeft":Z
    .end local v3    # "compositionLength":I
    .end local v5    # "textArray":[B
    .end local v6    # "text":Ljava/lang/String;
    .end local v7    # "compositionStartUtf8":I
    .end local v8    # "compositionLengthUtf8":I
    .end local v9    # "selectionStartUtf8":I
    .end local v10    # "selectionLengthUtf8":I
    .end local v11    # "compositionStart":I
    .end local v12    # "selectionLength":I
    .end local v13    # "selectionStart":I
    .end local v16    # "hasData":Z
    .restart local v1    # "hasData":Z
    :cond_3
    move/from16 v16, v1

    .end local v1    # "hasData":Z
    .restart local v16    # "hasData":Z
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 93
    add-int/lit8 v1, v4, 0x12

    .line 94
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v2

    .line 92
    invoke-direct {v0, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0

    .line 84
    .end local v4    # "textLength":I
    .end local v16    # "hasData":Z
    .restart local v1    # "hasData":Z
    :cond_4
    move/from16 v16, v1

    .end local v1    # "hasData":Z
    .restart local v16    # "hasData":Z
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;

    .line 85
    nop

    .line 86
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v1

    .line 84
    invoke-direct {v0, v5, v1}, Ltop/fifthlight/touchcontroller/proxy/message/BadMessageLengthException;-><init>(II)V

    throw v0
.end method

.method public bridge synthetic decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;
    .locals 1
    .param p1, "payload"    # Ljava/nio/ByteBuffer;

    .line 76
    invoke-virtual {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage$Decoder;->decode(Ljava/nio/ByteBuffer;)Ltop/fifthlight/touchcontroller/proxy/message/InputStatusMessage;

    move-result-object v0

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/ProxyMessage;

    return-object v0
.end method
