.class public final enum Lcom/pymcl/runtime/input/GamepadButton;
.super Ljava/lang/Enum;
.source "GamepadMapping.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadButton$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/input/GamepadButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u0008\n\u0002\u0008\u0018\u0008\u0086\u0081\u0002\u0018\u0000 \u001d2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001dB\u001d\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00020\u0005\"\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadButton;",
        "",
        "label",
        "",
        "keycodes",
        "",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;[I)V",
        "getLabel",
        "()Ljava/lang/String;",
        "getKeycodes",
        "()[I",
        "A",
        "B",
        "X",
        "Y",
        "LB",
        "RB",
        "LT",
        "RT",
        "START",
        "SELECT",
        "L3",
        "R3",
        "DPAD_UP",
        "DPAD_DOWN",
        "DPAD_LEFT",
        "DPAD_RIGHT",
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
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum A:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum B:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final Companion:Lcom/pymcl/runtime/input/GamepadButton$Companion;

.field public static final enum DPAD_DOWN:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum DPAD_LEFT:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum DPAD_RIGHT:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum DPAD_UP:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum L3:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum LB:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum LT:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum R3:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum RB:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum RT:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum SELECT:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum START:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum X:Lcom/pymcl/runtime/input/GamepadButton;

.field public static final enum Y:Lcom/pymcl/runtime/input/GamepadButton;


# instance fields
.field private final keycodes:[I

.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/input/GamepadButton;
    .locals 17

    sget-object v1, Lcom/pymcl/runtime/input/GamepadButton;->A:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v2, Lcom/pymcl/runtime/input/GamepadButton;->B:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v3, Lcom/pymcl/runtime/input/GamepadButton;->X:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v4, Lcom/pymcl/runtime/input/GamepadButton;->Y:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v5, Lcom/pymcl/runtime/input/GamepadButton;->LB:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v6, Lcom/pymcl/runtime/input/GamepadButton;->RB:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v7, Lcom/pymcl/runtime/input/GamepadButton;->LT:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v8, Lcom/pymcl/runtime/input/GamepadButton;->RT:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v9, Lcom/pymcl/runtime/input/GamepadButton;->START:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v10, Lcom/pymcl/runtime/input/GamepadButton;->SELECT:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v11, Lcom/pymcl/runtime/input/GamepadButton;->L3:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v12, Lcom/pymcl/runtime/input/GamepadButton;->R3:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v13, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_UP:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v14, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_DOWN:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v15, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_LEFT:Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v16, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_RIGHT:Lcom/pymcl/runtime/input/GamepadButton;

    filled-new-array/range {v1 .. v16}, [Lcom/pymcl/runtime/input/GamepadButton;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 14
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x60

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "A"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v2, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->A:Lcom/pymcl/runtime/input/GamepadButton;

    .line 15
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x61

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "B"

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v2, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->B:Lcom/pymcl/runtime/input/GamepadButton;

    .line 16
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x63

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "X"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v2, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->X:Lcom/pymcl/runtime/input/GamepadButton;

    .line 17
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x64

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "Y"

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3, v2, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->Y:Lcom/pymcl/runtime/input/GamepadButton;

    .line 18
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x66

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "LB"

    const/4 v3, 0x4

    const-string v4, "LB / L1"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->LB:Lcom/pymcl/runtime/input/GamepadButton;

    .line 19
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x67

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "RB"

    const/4 v3, 0x5

    const-string v4, "RB / R1"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->RB:Lcom/pymcl/runtime/input/GamepadButton;

    .line 20
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x68

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "LT"

    const/4 v3, 0x6

    const-string v4, "LT / L2"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->LT:Lcom/pymcl/runtime/input/GamepadButton;

    .line 21
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x69

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "RT"

    const/4 v3, 0x7

    const-string v4, "RT / R2"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->RT:Lcom/pymcl/runtime/input/GamepadButton;

    .line 22
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x6c

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "START"

    const/16 v3, 0x8

    const-string v4, "Start / Menu"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->START:Lcom/pymcl/runtime/input/GamepadButton;

    .line 23
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x6d

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "SELECT"

    const/16 v3, 0x9

    const-string v4, "Select / View"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->SELECT:Lcom/pymcl/runtime/input/GamepadButton;

    .line 24
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x6a

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "L3"

    const/16 v3, 0xa

    const-string v4, "\u5de6\u6447\u6746\u6309\u4e0b L3"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->L3:Lcom/pymcl/runtime/input/GamepadButton;

    .line 25
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x6b

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "R3"

    const/16 v3, 0xb

    const-string v4, "\u53f3\u6447\u6746\u6309\u4e0b R3"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->R3:Lcom/pymcl/runtime/input/GamepadButton;

    .line 26
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x13

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "DPAD_UP"

    const/16 v3, 0xc

    const-string v4, "\u5341\u5b57\u952e \u4e0a"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_UP:Lcom/pymcl/runtime/input/GamepadButton;

    .line 27
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x14

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "DPAD_DOWN"

    const/16 v3, 0xd

    const-string v4, "\u5341\u5b57\u952e \u4e0b"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_DOWN:Lcom/pymcl/runtime/input/GamepadButton;

    .line 28
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x15

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "DPAD_LEFT"

    const/16 v3, 0xe

    const-string v4, "\u5341\u5b57\u952e \u5de6"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_LEFT:Lcom/pymcl/runtime/input/GamepadButton;

    .line 29
    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton;

    const/16 v1, 0x16

    filled-new-array {v1}, [I

    move-result-object v1

    const-string v2, "DPAD_RIGHT"

    const/16 v3, 0xf

    const-string v4, "\u5341\u5b57\u952e \u53f3"

    invoke-direct {v0, v2, v3, v4, v1}, Lcom/pymcl/runtime/input/GamepadButton;-><init>(Ljava/lang/String;ILjava/lang/String;[I)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->DPAD_RIGHT:Lcom/pymcl/runtime/input/GamepadButton;

    invoke-static {}, Lcom/pymcl/runtime/input/GamepadButton;->$values()[Lcom/pymcl/runtime/input/GamepadButton;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->$VALUES:[Lcom/pymcl/runtime/input/GamepadButton;

    sget-object v0, Lcom/pymcl/runtime/input/GamepadButton;->$VALUES:[Lcom/pymcl/runtime/input/GamepadButton;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/runtime/input/GamepadButton$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadButton$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadButton;->Companion:Lcom/pymcl/runtime/input/GamepadButton$Companion;

    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;[I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "keycodes"    # [I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[I)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadButton;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadButton;->keycodes:[I

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/input/GamepadButton;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/input/GamepadButton;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadButton;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/input/GamepadButton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadButton;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/input/GamepadButton;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/input/GamepadButton;->$VALUES:[Lcom/pymcl/runtime/input/GamepadButton;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/input/GamepadButton;

    return-object v0
.end method


# virtual methods
.method public final getKeycodes()[I
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadButton;->keycodes:[I

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadButton;->label:Ljava/lang/String;

    return-object v0
.end method
