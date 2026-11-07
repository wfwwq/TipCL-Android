.class final Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;
.super Ljava/lang/Object;
.source "TerracottaAndroidAPI.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/burningtnt/terracotta/TerracottaAndroidAPI;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RuntimeContext"
.end annotation


# instance fields
.field private final logging:Ljava/io/RandomAccessFile;

.field private final vpnServiceCallback:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;


# direct methods
.method static bridge synthetic -$$Nest$fgetlogging(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;)Ljava/io/RandomAccessFile;
    .locals 0

    iget-object p0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->logging:Ljava/io/RandomAccessFile;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetvpnServiceCallback(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;)Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;
    .locals 0

    iget-object p0, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->vpnServiceCallback:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;

    return-object p0
.end method

.method public constructor <init>(Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;Ljava/io/RandomAccessFile;)V
    .locals 0
    .param p1, "vpnServiceCallback"    # Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;
    .param p2, "logging"    # Ljava/io/RandomAccessFile;

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    iput-object p1, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->vpnServiceCallback:Lnet/burningtnt/terracotta/TerracottaAndroidAPI$VpnServiceCallback;

    .line 146
    iput-object p2, p0, Lnet/burningtnt/terracotta/TerracottaAndroidAPI$RuntimeContext;->logging:Ljava/io/RandomAccessFile;

    .line 147
    return-void
.end method
