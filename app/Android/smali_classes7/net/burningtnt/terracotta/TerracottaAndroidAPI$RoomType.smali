.class public final enum Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
.super Ljava/lang/Enum;
.source "TerracottaAndroidAPI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/burningtnt/terracotta/TerracottaAndroidAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RoomType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

.field public static final enum PCL2CE:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

.field public static final enum SCAFFOLDING:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

.field public static final enum TERRACOTTA_LEGACY:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;


# direct methods
.method private static synthetic $values()[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    .locals 3

    .line 273
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->TERRACOTTA_LEGACY:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    sget-object v1, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->PCL2CE:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    sget-object v2, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->SCAFFOLDING:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    filled-new-array {v0, v1, v2}, [Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 274
    new-instance v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    const-string v1, "TERRACOTTA_LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->TERRACOTTA_LEGACY:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    new-instance v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    const-string v1, "PCL2CE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->PCL2CE:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    new-instance v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    const-string v1, "SCAFFOLDING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->SCAFFOLDING:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    .line 273
    invoke-static {}, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->$values()[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    move-result-object v0

    sput-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->$VALUES:[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 273
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 273
    const-class v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-object v0
.end method

.method public static values()[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;
    .locals 1

    .line 273
    sget-object v0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->$VALUES:[Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    invoke-virtual {v0}, [Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RoomType;

    return-object v0
.end method
