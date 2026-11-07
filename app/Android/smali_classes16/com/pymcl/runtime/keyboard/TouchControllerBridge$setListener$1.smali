.class public final Lcom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1;
.super Ljava/lang/Object;
.source "TouchControllerBridge.kt"

# interfaces
.implements Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->setListener(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTouchControllerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchControllerBridge.kt\ncom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u0016J\u0012\u0010\t\u001a\u00020\u00032\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;",
        "updateState",
        "",
        "textInputState",
        "Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;",
        "updateCursor",
        "cursorRect",
        "Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;",
        "updateArea",
        "inputAreaRect",
        "PyMCL-Android:runtime_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $l:Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V
    .locals 0
    .param p1, "$l"    # Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;

    iput-object p1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1;->$l:Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public updateArea(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V
    .locals 0
    .param p1, "inputAreaRect"    # Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    .line 59
    return-void
.end method

.method public updateCursor(Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;)V
    .locals 0
    .param p1, "cursorRect"    # Ltop/fifthlight/touchcontroller/proxy/message/FloatRect;

    .line 58
    return-void
.end method

.method public updateState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V
    .locals 4
    .param p1, "textInputState"    # Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    .line 57
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1;->$l:Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;

    if-eqz p1, :cond_0

    sget-object v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    .line 77
    move-object v2, p1

    .local v2, "p0":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    const/4 v3, 0x0

    .line 57
    .local v3, "$i$a$-let-TouchControllerBridge$setListener$1$updateState$1":I
    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;->toState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)Lcom/pymcl/runtime/keyboard/TextFieldState;

    move-result-object v1

    .end local v2    # "p0":Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;
    .end local v3    # "$i$a$-let-TouchControllerBridge$setListener$1$updateState$1":I
    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v1}, Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;->onState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V

    return-void
.end method
