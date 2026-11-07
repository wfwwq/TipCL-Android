.class public final Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;
.super Ljava/lang/Object;
.source "TerracottaAndroidAPI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/burningtnt/terracotta/TerracottaAndroidAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Metadata"
.end annotation


# instance fields
.field private final easyTierVersion:Ljava/lang/String;

.field private final terracottaCompileTime:J

.field private final terracottaVersion:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0
    .param p1, "terracottaVersion"    # Ljava/lang/String;
    .param p2, "terracottaCompileTime"    # J
    .param p4, "easyTierVersion"    # Ljava/lang/String;

    .line 104
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    iput-object p1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->terracottaVersion:Ljava/lang/String;

    .line 106
    iput-wide p2, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->terracottaCompileTime:J

    .line 107
    iput-object p4, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->easyTierVersion:Ljava/lang/String;

    .line 108
    return-void
.end method


# virtual methods
.method public getEasyTierVersion()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->easyTierVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTerracottaCompileTime()J
    .locals 2

    .line 121
    iget-wide v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->terracottaCompileTime:J

    return-wide v0
.end method

.method public getTerracottaVersion()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$Metadata;->terracottaVersion:Ljava/lang/String;

    return-object v0
.end method
