.class public interface abstract Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;
.super Ljava/lang/Object;
.source "LauncherProxyClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "InputHandler"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H&J\u0012\u0010\t\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008H&\u00a8\u0006\u000b"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;",
        "",
        "updateState",
        "",
        "textInputState",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "updateCursor",
        "cursorRect",
        "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;",
        "updateArea",
        "inputAreaRect",
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


# virtual methods
.method public abstract updateArea(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V
.end method

.method public abstract updateCursor(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V
.end method

.method public abstract updateState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V
.end method
