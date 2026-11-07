.class public final Lcom/pymcl/runtime/input/GamepadMapper;
.super Ljava/lang/Object;
.source "Gamepad.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadMapper$Companion;,
        Lcom/pymcl/runtime/input/GamepadMapper$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Gamepad.kt\ncom/pymcl/runtime/input/GamepadMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,107:1\n2068#2,2:108\n2068#2,2:110\n*S KotlinDebug\n*F\n+ 1 Gamepad.kt\ncom/pymcl/runtime/input/GamepadMapper\n*L\n102#1:108,2\n103#1:110,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000f\u0018\u0000 O2\u00020\u0001:\u0001OB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000e\u00107\u001a\u00020%2\u0006\u00108\u001a\u000209J \u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020%2\u0008\u0008\u0002\u0010=\u001a\u00020\"J\u0018\u0010>\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020%H\u0002J\u000e\u0010@\u001a\u00020%2\u0006\u00108\u001a\u00020AJ6\u0010B\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u00052\u0006\u0010D\u001a\u00020\u00052\u0006\u0010E\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00052\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0005J\u0006\u0010I\u001a\u00020\u000bJ\u0010\u0010J\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010K\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020%H\u0002J\u0006\u0010N\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R&\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR*\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\"0!j\u0008\u0012\u0004\u0012\u00020\"`#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\u000fR\u001e\u0010*\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0005@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u000fR(\u0010,\u001a\u00020\u00058FX\u0087\u0004r\u000c\u00080\u0012\u0008\u00081\u0012\u0004\u0008\u0008(2\u00a2\u0006\u000c\u0012\u0004\u0008-\u0010.\u001a\u0004\u0008/\u0010\u000fR(\u00103\u001a\u00020\u00058FX\u0087\u0004r\u000c\u00080\u0012\u0008\u00081\u0012\u0004\u0008\u0008(6\u00a2\u0006\u000c\u0012\u0004\u00084\u0010.\u001a\u0004\u00085\u0010\u000f\u00a8\u0006P"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadMapper;",
        "",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "deadzone",
        "",
        "mapping",
        "Lcom/pymcl/runtime/input/GamepadMapping;",
        "onAction",
        "Lkotlin/Function1;",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "",
        "<init>",
        "(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;)V",
        "getDeadzone",
        "()F",
        "setDeadzone",
        "(F)V",
        "getOnAction",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnAction",
        "(Lkotlin/jvm/functions/Function1;)V",
        "v",
        "getMapping",
        "()Lcom/pymcl/runtime/input/GamepadMapping;",
        "setMapping",
        "(Lcom/pymcl/runtime/input/GamepadMapping;)V",
        "heldButtons",
        "Ljava/util/HashMap;",
        "Lcom/pymcl/runtime/input/GamepadButton;",
        "",
        "Lkotlin/collections/HashMap;",
        "heldKeys",
        "Ljava/util/HashSet;",
        "",
        "Lkotlin/collections/HashSet;",
        "trigL",
        "",
        "trigR",
        "value",
        "lookX",
        "getLookX",
        "lookY",
        "getLookY",
        "rightX",
        "getRightX$annotations",
        "()V",
        "getRightX",
        "Lkotlin/Deprecated;",
        "message",
        "use lookX",
        "rightY",
        "getRightY$annotations",
        "getRightY",
        "use lookY",
        "onKey",
        "e",
        "Landroid/view/KeyEvent;",
        "onButton",
        "keycode",
        "down",
        "repeat",
        "button",
        "b",
        "onMotion",
        "Landroid/view/MotionEvent;",
        "onAxes",
        "lx",
        "ly",
        "rx",
        "ry",
        "lt",
        "rt",
        "tick",
        "dz",
        "setKey",
        "code",
        "on",
        "releaseAll",
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
.field public static final Companion:Lcom/pymcl/runtime/input/GamepadMapper$Companion;

.field public static final STICK_THRESHOLD:F = 0.3f

.field public static final TRIGGER_THRESHOLD:F = 0.5f


# instance fields
.field private deadzone:F

.field private final heldButtons:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/pymcl/runtime/input/GamepadButton;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final heldKeys:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private lookX:F

.field private lookY:F

.field private mapping:Lcom/pymcl/runtime/input/GamepadMapping;

.field private onAction:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sink:Lcom/pymcl/runtime/input/InputSink;

.field private trigL:Z

.field private trigR:Z


# direct methods
.method public static synthetic $r8$lambda$JyMPh7XUMMH0dYNs-YfDfl7n-kU(Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/input/GamepadMapper;->_init_$lambda$0(Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/input/GamepadMapper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadMapper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadMapper;->Companion:Lcom/pymcl/runtime/input/GamepadMapper$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p2, "deadzone"    # F
    .param p3, "mapping"    # Lcom/pymcl/runtime/input/GamepadMapping;
    .param p4, "onAction"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/input/InputSink;",
            "F",
            "Lcom/pymcl/runtime/input/GamepadMapping;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapping"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAction"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 15
    iput p2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->deadzone:F

    .line 18
    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadMapper;->onAction:Lkotlin/jvm/functions/Function1;

    .line 20
    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldButtons:Ljava/util/HashMap;

    .line 25
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldKeys:Ljava/util/HashSet;

    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 13
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 15
    const p2, 0x3e19999a    # 0.15f

    .line 13
    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 16
    sget-object p3, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    invoke-virtual {p3}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->default()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object p3

    .line 13
    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 18
    new-instance p4, Lcom/pymcl/runtime/input/GamepadMapper$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/pymcl/runtime/input/GamepadMapper$$ExternalSyntheticLambda0;-><init>()V

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/input/GamepadMapper;-><init>(Lcom/pymcl/runtime/input/InputSink;FLcom/pymcl/runtime/input/GamepadMapping;Lkotlin/jvm/functions/Function1;)V

    .line 19
    return-void
.end method

.method private static final _init_$lambda$0(Lcom/pymcl/runtime/input/Keys$Action;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Lcom/pymcl/runtime/input/Keys$Action;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final button(Lcom/pymcl/runtime/input/GamepadButton;Z)V
    .locals 4
    .param p1, "b"    # Lcom/pymcl/runtime/input/GamepadButton;
    .param p2, "down"    # Z

    .line 52
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_3

    .line 53
    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldButtons:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 54
    :cond_0
    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/input/GamepadMapping;->keyFor(Lcom/pymcl/runtime/input/GamepadButton;)Ljava/lang/String;

    move-result-object v2

    .line 55
    .local v2, "name":Ljava/lang/String;
    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldButtons:Ljava/util/HashMap;

    check-cast v3, Ljava/util/Map;

    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    move v1, v0

    :cond_1
    if-eqz v1, :cond_6

    sget-object v1, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {v1, v3, v2, v0}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->onAction:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .end local v2    # "name":Ljava/lang/String;
    :cond_2
    goto :goto_1

    .line 58
    :cond_3
    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldButtons:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v2, :cond_4

    return-void

    .line 59
    .restart local v2    # "name":Ljava/lang/String;
    :cond_4
    move-object v3, v2

    check-cast v3, Ljava/lang/CharSequence;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_5

    goto :goto_0

    :cond_5
    move v0, v1

    :goto_0
    if-eqz v0, :cond_6

    sget-object v0, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-virtual {v0, v3, v2, v1}, Lcom/pymcl/runtime/input/Keys;->dispatch(Lcom/pymcl/runtime/input/InputSink;Ljava/lang/String;Z)Lcom/pymcl/runtime/input/Keys$Action;

    .line 61
    .end local v2    # "name":Ljava/lang/String;
    :cond_6
    :goto_1
    return-void
.end method

.method private final dz(F)F
    .locals 2
    .param p1, "v"    # F

    .line 96
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->deadzone:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move v0, p1

    :goto_0
    return v0
.end method

.method public static synthetic getRightX$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "use lookX"
    .end annotation

    return-void
.end method

.method public static synthetic getRightY$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "use lookY"
    .end annotation

    return-void
.end method

.method public static synthetic onButton$default(Lcom/pymcl/runtime/input/GamepadMapper;IZIILjava/lang/Object;)Z
    .locals 0

    .line 44
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/runtime/input/GamepadMapper;->onButton(IZI)Z

    move-result p0

    return p0
.end method

.method private final setKey(IZ)V
    .locals 2
    .param p1, "code"    # I
    .param p2, "on"    # Z

    .line 98
    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldKeys:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0, p1, v1}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldKeys:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    const/4 v1, 0x0

    goto :goto_0

    .line 99
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final getDeadzone()F
    .locals 1

    .line 15
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->deadzone:F

    return v0
.end method

.method public final getLookX()F
    .locals 1

    .line 28
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    return v0
.end method

.method public final getLookY()F
    .locals 1

    .line 29
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    return v0
.end method

.method public final getMapping()Lcom/pymcl/runtime/input/GamepadMapping;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    return-object v0
.end method

.method public final getOnAction()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->onAction:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getRightX()F
    .locals 1

    .line 30
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    return v0
.end method

.method public final getRightY()F
    .locals 1

    .line 31
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    return v0
.end method

.method public final onAxes(FFFFFF)V
    .locals 16
    .param p1, "lx"    # F
    .param p2, "ly"    # F
    .param p3, "rx"    # F
    .param p4, "ry"    # F
    .param p5, "lt"    # F
    .param p6, "rt"    # F

    .line 76
    move-object/from16 v0, p0

    const/4 v1, 0x0

    .local v1, "moveX":F
    const/4 v2, 0x0

    .local v2, "moveY":F
    const/4 v3, 0x0

    .local v3, "lkX":F
    const/4 v4, 0x0

    .line 77
    .local v4, "lkY":F
    const/4 v5, 0x2

    new-array v5, v5, [Lkotlin/Triple;

    new-instance v6, Lkotlin/Triple;

    iget-object v7, v0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v7}, Lcom/pymcl/runtime/input/GamepadMapping;->getLeftStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v7

    invoke-direct/range {p0 .. p1}, Lcom/pymcl/runtime/input/GamepadMapper;->dz(F)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    move/from16 v9, p2

    invoke-direct {v0, v9}, Lcom/pymcl/runtime/input/GamepadMapper;->dz(F)F

    move-result v10

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-direct {v6, v7, v8, v10}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v7, 0x0

    aput-object v6, v5, v7

    new-instance v6, Lkotlin/Triple;

    iget-object v8, v0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v8}, Lcom/pymcl/runtime/input/GamepadMapping;->getRightStick()Lcom/pymcl/runtime/input/StickMode;

    move-result-object v8

    move/from16 v10, p3

    invoke-direct {v0, v10}, Lcom/pymcl/runtime/input/GamepadMapper;->dz(F)F

    move-result v11

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    move/from16 v12, p4

    invoke-direct {v0, v12}, Lcom/pymcl/runtime/input/GamepadMapper;->dz(F)F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-direct {v6, v8, v11, v13}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v8, 0x1

    aput-object v6, v5, v8

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/Triple;

    invoke-virtual {v6}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/pymcl/runtime/input/StickMode;

    .local v11, "mode":Lcom/pymcl/runtime/input/StickMode;
    invoke-virtual {v6}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Number;

    invoke-virtual {v13}, Ljava/lang/Number;->floatValue()F

    move-result v13

    .local v13, "x":F
    invoke-virtual {v6}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    .line 78
    .local v6, "y":F
    sget-object v14, Lcom/pymcl/runtime/input/GamepadMapper$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v11}, Lcom/pymcl/runtime/input/StickMode;->ordinal()I

    move-result v15

    aget v14, v14, v15

    packed-switch v14, :pswitch_data_0

    new-instance v5, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v5}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v5

    .line 80
    :cond_1
    :pswitch_0
    goto :goto_0

    :pswitch_1
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v14

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpl-float v14, v14, v15

    if-lez v14, :cond_2

    move v3, v13

    :cond_2
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v14

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpl-float v14, v14, v15

    if-lez v14, :cond_1

    move v4, v6

    goto :goto_0

    .line 79
    :pswitch_2
    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v14

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpl-float v14, v14, v15

    if-lez v14, :cond_3

    move v1, v13

    :cond_3
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v14

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpl-float v14, v14, v15

    if-lez v14, :cond_0

    move v2, v6

    goto :goto_0

    .line 84
    .end local v6    # "y":F
    .end local v11    # "mode":Lcom/pymcl/runtime/input/StickMode;
    .end local v13    # "x":F
    :cond_4
    const v5, -0x41666666    # -0.3f

    cmpg-float v6, v2, v5

    if-gez v6, :cond_5

    move v6, v8

    goto :goto_1

    :cond_5
    move v6, v7

    :goto_1
    const/16 v11, 0x11

    invoke-direct {v0, v11, v6}, Lcom/pymcl/runtime/input/GamepadMapper;->setKey(IZ)V

    const v6, 0x3e99999a    # 0.3f

    cmpl-float v11, v2, v6

    if-lez v11, :cond_6

    move v11, v8

    goto :goto_2

    :cond_6
    move v11, v7

    :goto_2
    const/16 v13, 0x1f

    invoke-direct {v0, v13, v11}, Lcom/pymcl/runtime/input/GamepadMapper;->setKey(IZ)V

    .line 85
    cmpg-float v5, v1, v5

    if-gez v5, :cond_7

    move v5, v8

    goto :goto_3

    :cond_7
    move v5, v7

    :goto_3
    const/16 v11, 0x1e

    invoke-direct {v0, v11, v5}, Lcom/pymcl/runtime/input/GamepadMapper;->setKey(IZ)V

    cmpl-float v5, v1, v6

    if-lez v5, :cond_8

    move v5, v8

    goto :goto_4

    :cond_8
    move v5, v7

    :goto_4
    const/16 v6, 0x20

    invoke-direct {v0, v6, v5}, Lcom/pymcl/runtime/input/GamepadMapper;->setKey(IZ)V

    .line 86
    iput v3, v0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    iget-object v5, v0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v5}, Lcom/pymcl/runtime/input/GamepadMapping;->getInvertY()Z

    move-result v5

    if-eqz v5, :cond_9

    neg-float v5, v4

    goto :goto_5

    :cond_9
    move v5, v4

    :goto_5
    iput v5, v0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    .line 88
    const/high16 v5, 0x3f000000    # 0.5f

    cmpl-float v6, p5, v5

    if-lez v6, :cond_a

    move v6, v8

    goto :goto_6

    :cond_a
    move v6, v7

    .local v6, "l":Z
    :goto_6
    cmpl-float v5, p6, v5

    if-lez v5, :cond_b

    move v7, v8

    .line 89
    .local v7, "r":Z
    :cond_b
    iget-boolean v5, v0, Lcom/pymcl/runtime/input/GamepadMapper;->trigL:Z

    if-eq v6, v5, :cond_c

    iput-boolean v6, v0, Lcom/pymcl/runtime/input/GamepadMapper;->trigL:Z

    sget-object v5, Lcom/pymcl/runtime/input/GamepadButton;->LT:Lcom/pymcl/runtime/input/GamepadButton;

    invoke-direct {v0, v5, v6}, Lcom/pymcl/runtime/input/GamepadMapper;->button(Lcom/pymcl/runtime/input/GamepadButton;Z)V

    .line 90
    :cond_c
    iget-boolean v5, v0, Lcom/pymcl/runtime/input/GamepadMapper;->trigR:Z

    if-eq v7, v5, :cond_d

    iput-boolean v7, v0, Lcom/pymcl/runtime/input/GamepadMapper;->trigR:Z

    sget-object v5, Lcom/pymcl/runtime/input/GamepadButton;->RT:Lcom/pymcl/runtime/input/GamepadButton;

    invoke-direct {v0, v5, v7}, Lcom/pymcl/runtime/input/GamepadMapper;->button(Lcom/pymcl/runtime/input/GamepadButton;Z)V

    .line 91
    :cond_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onButton(IZI)Z
    .locals 2
    .param p1, "keycode"    # I
    .param p2, "down"    # Z
    .param p3, "repeat"    # I

    .line 45
    sget-object v0, Lcom/pymcl/runtime/input/GamepadButton;->Companion:Lcom/pymcl/runtime/input/GamepadButton$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/input/GamepadButton$Companion;->ofKeycode(I)Lcom/pymcl/runtime/input/GamepadButton;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 46
    .local v0, "b":Lcom/pymcl/runtime/input/GamepadButton;
    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_1

    if-lez p3, :cond_1

    return v1

    .line 47
    :cond_1
    invoke-direct {p0, v0, p2}, Lcom/pymcl/runtime/input/GamepadMapper;->button(Lcom/pymcl/runtime/input/GamepadButton;Z)V

    .line 48
    return v1
.end method

.method public final onKey(Landroid/view/KeyEvent;)Z
    .locals 3
    .param p1, "e"    # Landroid/view/KeyEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/pymcl/runtime/input/GamepadMapper;->onButton(IZI)Z

    move-result v0

    return v0
.end method

.method public final onMotion(Landroid/view/MotionEvent;)Z
    .locals 8
    .param p1, "e"    # Landroid/view/MotionEvent;

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    nop

    .line 65
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v2

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v3

    .line 66
    const/16 v1, 0xb

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v4

    const/16 v1, 0xe

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v5

    .line 67
    const/16 v1, 0x11

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    const/16 v6, 0x17

    invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v6

    invoke-static {v1, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    .line 68
    const/16 v1, 0x12

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    const/16 v7, 0x16

    invoke-virtual {p1, v7}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v7

    invoke-static {v1, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    .line 64
    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/pymcl/runtime/input/GamepadMapper;->onAxes(FFFFFF)V

    .line 71
    return v0
.end method

.method public final releaseAll()V
    .locals 8

    .line 102
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldKeys:Ljava/util/HashSet;

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 108
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .local v5, "it":I
    const/4 v6, 0x0

    .line 102
    .local v6, "$i$a$-forEach-GamepadMapper$releaseAll$1":I
    iget-object v7, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    invoke-interface {v7, v5, v4}, Lcom/pymcl/runtime/input/InputSink;->key(IZ)V

    .line 108
    .end local v5    # "it":I
    .end local v6    # "$i$a$-forEach-GamepadMapper$releaseAll$1":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 109
    :cond_0
    nop

    .line 102
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldKeys:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 103
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->heldButtons:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "<get-keys>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .restart local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 110
    .restart local v1    # "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .restart local v3    # "element$iv":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Lcom/pymcl/runtime/input/GamepadButton;

    .local v5, "it":Lcom/pymcl/runtime/input/GamepadButton;
    const/4 v6, 0x0

    .line 103
    .local v6, "$i$a$-forEach-GamepadMapper$releaseAll$2":I
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p0, v5, v4}, Lcom/pymcl/runtime/input/GamepadMapper;->button(Lcom/pymcl/runtime/input/GamepadButton;Z)V

    .line 110
    .end local v5    # "it":Lcom/pymcl/runtime/input/GamepadButton;
    .end local v6    # "$i$a$-forEach-GamepadMapper$releaseAll$2":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_1

    .line 111
    :cond_1
    nop

    .line 104
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    iput-boolean v4, p0, Lcom/pymcl/runtime/input/GamepadMapper;->trigL:Z

    iput-boolean v4, p0, Lcom/pymcl/runtime/input/GamepadMapper;->trigR:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    iput v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    .line 105
    return-void
.end method

.method public final setDeadzone(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 15
    iput p1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->deadzone:F

    return-void
.end method

.method public final setMapping(Lcom/pymcl/runtime/input/GamepadMapping;)V
    .locals 1
    .param p1, "v"    # Lcom/pymcl/runtime/input/GamepadMapping;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual {p0}, Lcom/pymcl/runtime/input/GamepadMapper;->releaseAll()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    return-void
.end method

.method public final setOnAction(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->onAction:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final tick()V
    .locals 4

    .line 94
    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    if-eqz v0, :cond_2

    iget v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-nez v2, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMapper;->sink:Lcom/pymcl/runtime/input/InputSink;

    iget v1, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookX:F

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadMapping;->getLookSpeed()F

    move-result v2

    mul-float/2addr v1, v2

    iget v2, p0, Lcom/pymcl/runtime/input/GamepadMapper;->lookY:F

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadMapper;->mapping:Lcom/pymcl/runtime/input/GamepadMapping;

    invoke-virtual {v3}, Lcom/pymcl/runtime/input/GamepadMapping;->getLookSpeed()F

    move-result v3

    mul-float/2addr v2, v3

    invoke-interface {v0, v1, v2}, Lcom/pymcl/runtime/input/InputSink;->lookDelta(FF)V

    :cond_3
    return-void
.end method
