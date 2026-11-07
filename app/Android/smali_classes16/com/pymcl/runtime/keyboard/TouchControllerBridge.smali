.class public final Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
.super Ljava/lang/Object;
.source "TouchControllerBridge.kt"

# interfaces
.implements Lcom/pymcl/runtime/keyboard/TextFieldChannel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u000b\"\u0004\u0008\u0010\u0010\rR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/TouchControllerBridge;",
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel;",
        "context",
        "Landroid/content/Context;",
        "client",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;",
        "<init>",
        "(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V",
        "width",
        "",
        "getWidth",
        "()I",
        "setWidth",
        "(I)V",
        "height",
        "getHeight",
        "setHeight",
        "ids",
        "Landroid/util/SparseIntArray;",
        "next",
        "setListener",
        "",
        "l",
        "Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;",
        "pushState",
        "state",
        "Lcom/pymcl/runtime/keyboard/TextFieldState;",
        "onTouch",
        "e",
        "Landroid/view/MotionEvent;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

.field public static final SOCKET:Ljava/lang/String; = "PyMCL"


# instance fields
.field private final client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

.field private height:I

.field private final ids:Landroid/util/SparseIntArray;

.field private next:I

.field private width:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "client"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    .line 45
    const/4 v0, 0x1

    iput v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->width:I

    iput v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->height:I

    .line 46
    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    iput v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->next:I

    .line 48
    nop

    .line 49
    const-class v0, Landroid/os/Vibrator;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    .line 50
    .local v0, "vib":Landroid/os/Vibrator;
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    new-instance v2, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;

    invoke-direct {v2, v0}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$1;-><init>(Landroid/os/Vibrator;)V

    check-cast v2, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;

    invoke-virtual {v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->setVibrationHandler(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$VibrationHandler;)V

    .line 53
    .end local v0    # "vib":Landroid/os/Vibrator;
    nop

    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;-><init>(Landroid/content/Context;Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V

    return-void
.end method

.method private static final onTouch$add(Lcom/pymcl/runtime/keyboard/TouchControllerBridge;Landroid/view/MotionEvent;II)V
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/runtime/keyboard/TouchControllerBridge;
    .param p1, "$e"    # Landroid/view/MotionEvent;
    .param p2, "id"    # I
    .param p3, "i"    # I

    .line 66
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    invoke-virtual {p1, p3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    iget v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->width:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p1, p3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    iget v3, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->height:I

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-virtual {v0, p2, v1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->addPointer(IFF)V

    return-void
.end method


# virtual methods
.method public final getHeight()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->height:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 45
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->width:I

    return v0
.end method

.method public final onTouch(Landroid/view/MotionEvent;)V
    .locals 4
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 72
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .local v0, "i":I
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/util/SparseIntArray;->get(I)I

    move-result v1

    .local v1, "id":I
    if-eqz v1, :cond_0

    iget-object v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->delete(I)V

    iget-object v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    invoke-virtual {v2, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->removePointer(I)V

    goto :goto_1

    .line 69
    .end local v0    # "i":I
    .end local v1    # "id":I
    :pswitch_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .restart local v0    # "i":I
    iget v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->next:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->next:I

    .restart local v1    # "id":I
    iget-object v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v2, v3, v1}, Landroid/util/SparseIntArray;->put(II)V

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->onTouch$add(Lcom/pymcl/runtime/keyboard/TouchControllerBridge;Landroid/view/MotionEvent;II)V

    .end local v0    # "i":I
    .end local v1    # "id":I
    goto :goto_1

    .line 70
    :pswitch_3
    const/4 v0, 0x0

    .restart local v0    # "i":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    invoke-static {p0, p1, v2, v0}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->onTouch$add(Lcom/pymcl/runtime/keyboard/TouchControllerBridge;Landroid/view/MotionEvent;II)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 71
    .end local v0    # "i":I
    :pswitch_4
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->clearPointer()V

    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    goto :goto_1

    .line 68
    :pswitch_5
    iget v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->next:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->next:I

    .local v0, "id":I
    iget-object v1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->ids:Landroid/util/SparseIntArray;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v1, v3, v0}, Landroid/util/SparseIntArray;->put(II)V

    invoke-static {p0, p1, v0, v2}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->onTouch$add(Lcom/pymcl/runtime/keyboard/TouchControllerBridge;Landroid/view/MotionEvent;II)V

    .line 74
    .end local v0    # "id":I
    :cond_0
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public pushState(Lcom/pymcl/runtime/keyboard/TextFieldState;)V
    .locals 2
    .param p1, "state"    # Lcom/pymcl/runtime/keyboard/TextFieldState;

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    sget-object v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->Companion:Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$Companion;->fromState(Lcom/pymcl/runtime/keyboard/TextFieldState;)Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;

    move-result-object v1

    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->updateTextInputState(Ltop/fifthlight/touchcontroller/proxy/message/input/TextInputState;)V

    return-void
.end method

.method public final setHeight(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 45
    iput p1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->height:I

    return-void
.end method

.method public setListener(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V
    .locals 2
    .param p1, "l"    # Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;

    .line 56
    iget-object v0, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1;

    invoke-direct {v1, p1}, Lcom/pymcl/runtime/keyboard/TouchControllerBridge$setListener$1;-><init>(Lcom/pymcl/runtime/keyboard/TextFieldChannel$Listener;)V

    check-cast v1, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;

    :goto_0
    invoke-virtual {v0, v1}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->setInputHandler(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient$InputHandler;)V

    .line 61
    return-void
.end method

.method public final setWidth(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 45
    iput p1, p0, Lcom/pymcl/runtime/keyboard/TouchControllerBridge;->width:I

    return-void
.end method
