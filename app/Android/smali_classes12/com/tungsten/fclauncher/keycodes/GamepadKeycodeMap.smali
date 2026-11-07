.class public Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;
.super Ljava/lang/Object;
.source "GamepadKeycodeMap.java"


# static fields
.field public static final KEY_MAP:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final LEFT_JOYSTICK_DOWN:I = 0x7d6

.field public static final LEFT_JOYSTICK_LEFT:I = 0x7d4

.field public static final LEFT_JOYSTICK_RIGHT:I = 0x7d0

.field public static final LEFT_JOYSTICK_UP:I = 0x7d2

.field private static final MOUSE_LEFT:I = 0x3e8

.field private static final MOUSE_MIDDLE:I = 0x3e9

.field private static final MOUSE_RIGHT:I = 0x3ea

.field private static final MOUSE_SCROLL_DOWN:I = 0x3ec

.field private static final MOUSE_SCROLL_UP:I = 0x3eb


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->KEY_MAP:Ljava/util/HashMap;

    .line 26
    const/16 v0, 0x60

    const/16 v1, 0x39

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 27
    const/16 v0, 0x61

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 28
    const/16 v0, 0x63

    const/16 v1, 0x12

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 29
    const/16 v0, 0x64

    const/16 v1, 0x21

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 30
    const/16 v0, 0x66

    const/16 v1, 0x3eb

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 31
    const/16 v0, 0x67

    const/16 v1, 0x3ec

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 32
    const/16 v0, 0x68

    const/16 v1, 0x3e8

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 33
    const/16 v0, 0x69

    const/16 v1, 0x3ea

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 34
    const/16 v0, 0x6a

    const/16 v1, 0x1d

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 35
    const/16 v0, 0x6b

    const/16 v1, 0x2a

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 36
    const/16 v0, 0x6c

    const/4 v2, 0x1

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 37
    const/16 v0, 0x6d

    const/16 v2, 0xf

    invoke-static {v0, v2}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 38
    const/16 v0, 0x13

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 39
    const/16 v0, 0x14

    const/16 v1, 0x18

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 40
    const/16 v0, 0x15

    const/16 v1, 0x24

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 41
    const/16 v0, 0x16

    const/16 v1, 0x25

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 42
    const/16 v0, 0x7d2

    const/16 v1, 0x11

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 43
    const/16 v0, 0x7d6

    const/16 v1, 0x1f

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 44
    const/16 v0, 0x7d4

    const/16 v1, 0x1e

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 45
    const/16 v0, 0x7d0

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->add(II)V

    .line 46
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static add(II)V
    .locals 3
    .param p0, "key"    # I
    .param p1, "value"    # I

    .line 22
    sget-object v0, Lcom/tungsten/fclauncher/keycodes/GamepadKeycodeMap;->KEY_MAP:Ljava/util/HashMap;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    return-void
.end method

.method public static convert(Ljava/util/Map;I)I
    .locals 2
    .param p1, "key"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)I"
        }
    .end annotation

    .line 49
    .local p0, "keyMap":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Integer;>;"
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    move-result-object v0

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method
