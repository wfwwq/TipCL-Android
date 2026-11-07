.class public final Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransportKt;
.super Ljava/lang/Object;
.source "UnixSocketTransport.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"
    }
    d2 = {
        "TAG",
        "",
        "UnixSocketTransport",
        "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;",
        "name",
        "proxy-client-android_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "UnixSocketTransport"


# direct methods
.method public static final UnixSocketTransport(Ljava/lang/String;)Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;
    .locals 2
    .param p0, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    new-instance v0, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;

    new-instance v1, Landroid/net/LocalServerSocket;

    invoke-direct {v1, p0}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;-><init>(Landroid/net/LocalServerSocket;)V

    check-cast v0, Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;

    return-object v0
.end method
