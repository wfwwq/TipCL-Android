.class public final enum Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
.super Ljava/lang/Enum;
.source "VibrateMessage.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Kind"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
        "",
        "index",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getIndex",
        "()I",
        "UNKNOWN",
        "BLOCK_BROKEN",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

.field public static final enum BLOCK_BROKEN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

.field public static final enum UNKNOWN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;


# instance fields
.field private final index:I


# direct methods
.method private static final synthetic $values()[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
    .locals 2

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->UNKNOWN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->BLOCK_BROKEN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    filled-new-array {v0, v1}, [Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 11
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    const/4 v1, -0x1

    const-string v2, "UNKNOWN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->UNKNOWN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    .line 12
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    const-string v1, "BLOCK_BROKEN"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->BLOCK_BROKEN:Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    invoke-static {}, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$values()[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    move-result-object v0

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "index"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->index:I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;",
            ">;"
        }
    .end annotation

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    const-class v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    .line 13
    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    return-object v0
.end method

.method public static values()[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;
    .locals 1

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 13
    check-cast v0, [Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;

    return-object v0
.end method


# virtual methods
.method public final getIndex()I
    .locals 1

    .line 10
    iget v0, p0, Ltop/fifthlight/touchcontroller/proxy/message/VibrateMessage$Kind;->index:I

    return v0
.end method
