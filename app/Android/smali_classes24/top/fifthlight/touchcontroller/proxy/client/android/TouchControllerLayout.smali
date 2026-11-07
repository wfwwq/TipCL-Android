.class public final Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;
.super Landroid/widget/FrameLayout;
.source "TouchControllerLayout.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0014\u0010\u0016\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0014H\u0016R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "client",
        "Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;",
        "getClient",
        "()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;",
        "setClient",
        "(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V",
        "pointerIdMap",
        "Landroid/util/SparseIntArray;",
        "nextPointerId",
        "",
        "getOffsetX",
        "",
        "Landroid/view/MotionEvent;",
        "index",
        "getOffsetY",
        "handleTouchEvent",
        "",
        "event",
        "dispatchTouchEvent",
        "",
        "proxy-client-android_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

.field private nextPointerId:I

.field private final pointerIdMap:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, p1, v0, v1, v0}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 21
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    .line 22
    const/4 v0, 0x1

    iput v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->nextPointerId:I

    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 13
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 14
    const/4 p2, 0x0

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    return-void
.end method

.method private final getOffsetX(Landroid/view/MotionEvent;I)F
    .locals 2
    .param p1, "$this$getOffsetX"    # Landroid/view/MotionEvent;
    .param p2, "index"    # I

    .line 24
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getWidth()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method private final getOffsetY(Landroid/view/MotionEvent;I)F
    .locals 2
    .param p1, "$this$getOffsetY"    # Landroid/view/MotionEvent;
    .param p2, "index"    # I

    .line 25
    invoke-virtual {p1, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    invoke-virtual {p0}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method private final handleTouchEvent(Landroid/view/MotionEvent;)V
    .locals 6
    .param p1, "event"    # Landroid/view/MotionEvent;

    .line 28
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    if-nez v0, :cond_0

    return-void

    .line 29
    .local v0, "client":Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto/16 :goto_1

    .line 57
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v1

    .line 58
    .local v1, "i":I
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    .line 59
    .local v2, "pointerId":I
    if-eqz v2, :cond_1

    .line 60
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseIntArray;->delete(I)V

    .line 61
    invoke-virtual {v0, v2}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->removePointer(I)V

    goto :goto_1

    .line 37
    .end local v1    # "i":I
    .end local v2    # "pointerId":I
    :pswitch_2
    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->nextPointerId:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->nextPointerId:I

    .line 38
    .local v1, "pointerId":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    .line 39
    .local v2, "i":I
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {v3, v4, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 40
    invoke-direct {p0, p1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetX(Landroid/view/MotionEvent;I)F

    move-result v3

    invoke-direct {p0, p1, v2}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetY(Landroid/view/MotionEvent;I)F

    move-result v4

    invoke-virtual {v0, v1, v3, v4}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->addPointer(IFF)V

    .end local v1    # "pointerId":I
    .end local v2    # "i":I
    goto :goto_1

    .line 44
    :pswitch_3
    const/4 v1, 0x0

    .local v1, "i":I
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_1

    .line 45
    iget-object v3, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/util/SparseIntArray;->get(I)I

    move-result v3

    .line 46
    .local v3, "pointerId":I
    invoke-direct {p0, p1, v1}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetX(Landroid/view/MotionEvent;I)F

    move-result v4

    invoke-direct {p0, p1, v1}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetY(Landroid/view/MotionEvent;I)F

    move-result v5

    invoke-virtual {v0, v3, v4, v5}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->addPointer(IFF)V

    .line 44
    .end local v3    # "pointerId":I
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 52
    .end local v1    # "i":I
    :pswitch_4
    invoke-virtual {v0}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->clearPointer()V

    .line 53
    iget-object v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->clear()V

    goto :goto_1

    .line 31
    :pswitch_5
    iget v1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->nextPointerId:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->nextPointerId:I

    .line 32
    .local v1, "pointerId":I
    iget-object v2, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->pointerIdMap:Landroid/util/SparseIntArray;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    invoke-virtual {v2, v4, v1}, Landroid/util/SparseIntArray;->put(II)V

    .line 33
    invoke-direct {p0, p1, v3}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetX(Landroid/view/MotionEvent;I)F

    move-result v2

    invoke-direct {p0, p1, v3}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->getOffsetY(Landroid/view/MotionEvent;I)F

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;->addPointer(IFF)V

    .line 65
    .end local v1    # "pointerId":I
    :cond_1
    :goto_1
    return-void

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


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "event"    # Landroid/view/MotionEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-direct {p0, p1}, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->handleTouchEvent(Landroid/view/MotionEvent;)V

    .line 70
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method public final getClient()Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;
    .locals 1

    .line 19
    iget-object v0, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    return-object v0
.end method

.method public final setClient(Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;)V
    .locals 0
    .param p1, "<set-?>"    # Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    .line 19
    iput-object p1, p0, Ltop/fifthlight/touchcontroller/proxy/client/android/TouchControllerLayout;->client:Ltop/fifthlight/touchcontroller/proxy/client/LauncherProxyClient;

    return-void
.end method
