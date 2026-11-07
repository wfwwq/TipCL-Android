.class Lorg/libsdl/app/SDLJoystickHandler$RangeComparator;
.super Ljava/lang/Object;
.source "SDLControllerManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/libsdl/app/SDLJoystickHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "RangeComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/view/InputDevice$MotionRange;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Landroid/view/InputDevice$MotionRange;Landroid/view/InputDevice$MotionRange;)I
    .locals 4
    .param p1, "arg0"    # Landroid/view/InputDevice$MotionRange;
    .param p2, "arg1"    # Landroid/view/InputDevice$MotionRange;

    .line 185
    invoke-virtual {p1}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v0

    .line 186
    .local v0, "arg0Axis":I
    invoke-virtual {p2}, Landroid/view/InputDevice$MotionRange;->getAxis()I

    move-result v1

    .line 187
    .local v1, "arg1Axis":I
    const/16 v2, 0x17

    const/16 v3, 0x16

    if-ne v0, v3, :cond_0

    .line 188
    const/16 v0, 0x17

    goto :goto_0

    .line 189
    :cond_0
    if-ne v0, v2, :cond_1

    .line 190
    const/16 v0, 0x16

    .line 192
    :cond_1
    :goto_0
    if-ne v1, v3, :cond_2

    .line 193
    const/16 v1, 0x17

    goto :goto_1

    .line 194
    :cond_2
    if-ne v1, v2, :cond_3

    .line 195
    const/16 v1, 0x16

    .line 213
    :cond_3
    :goto_1
    const/16 v2, 0xe

    const/16 v3, 0xb

    if-ne v0, v3, :cond_4

    .line 214
    const/16 v0, 0xd

    goto :goto_2

    .line 215
    :cond_4
    if-le v0, v3, :cond_5

    if-ge v0, v2, :cond_5

    .line 216
    add-int/lit8 v0, v0, -0x1

    .line 218
    :cond_5
    :goto_2
    if-ne v1, v3, :cond_6

    .line 219
    const/16 v1, 0xd

    goto :goto_3

    .line 220
    :cond_6
    if-le v1, v3, :cond_7

    if-ge v1, v2, :cond_7

    .line 221
    add-int/lit8 v1, v1, -0x1

    .line 224
    :cond_7
    :goto_3
    sub-int v2, v0, v1

    return v2
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 181
    check-cast p1, Landroid/view/InputDevice$MotionRange;

    check-cast p2, Landroid/view/InputDevice$MotionRange;

    invoke-virtual {p0, p1, p2}, Lorg/libsdl/app/SDLJoystickHandler$RangeComparator;->compare(Landroid/view/InputDevice$MotionRange;Landroid/view/InputDevice$MotionRange;)I

    move-result p1

    return p1
.end method
