.class public final enum Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
.super Ljava/lang/Enum;
.source "PlatformCapability.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
        "",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "TEXT_STATUS",
        "KEYBOARD_SHOW",
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

.field private static final synthetic $VALUES:[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

.field public static final enum KEYBOARD_SHOW:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

.field public static final enum TEXT_STATUS:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    .locals 2

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->TEXT_STATUS:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    sget-object v1, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->KEYBOARD_SHOW:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    filled-new-array {v0, v1}, [Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 9
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    const/4 v1, 0x0

    const-string/jumbo v2, "text_status"

    const-string v3, "TEXT_STATUS"

    invoke-direct {v0, v3, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->TEXT_STATUS:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    .line 16
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    const/4 v1, 0x1

    const-string v2, "keyboard_show"

    const-string v3, "KEYBOARD_SHOW"

    invoke-direct {v0, v3, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->KEYBOARD_SHOW:Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    invoke-static {}, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$values()[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    move-result-object v0

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->id:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;",
            ">;"
        }
    .end annotation

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 17
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    .locals 1
    .param p0, "value"    # Ljava/lang/String;

    const-class v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    .line 17
    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    return-object v0
.end method

.method public static values()[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;
    .locals 1

    sget-object v0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->$VALUES:[Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    .line 17
    check-cast v0, [Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 3
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/PlatformCapability;->id:Ljava/lang/String;

    return-object v0
.end method
