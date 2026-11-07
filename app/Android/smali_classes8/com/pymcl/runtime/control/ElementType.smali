.class public final enum Lcom/pymcl/runtime/control/ElementType;
.super Ljava/lang/Enum;
.source "ControlLayout.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/control/ElementType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ElementType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BUTTON",
        "DPAD",
        "JOYSTICK",
        "LOOK_AREA",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/control/ElementType;

.field public static final enum BUTTON:Lcom/pymcl/runtime/control/ElementType;

.field public static final enum DPAD:Lcom/pymcl/runtime/control/ElementType;

.field public static final enum JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

.field public static final enum LOOK_AREA:Lcom/pymcl/runtime/control/ElementType;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/control/ElementType;
    .locals 4

    sget-object v0, Lcom/pymcl/runtime/control/ElementType;->BUTTON:Lcom/pymcl/runtime/control/ElementType;

    sget-object v1, Lcom/pymcl/runtime/control/ElementType;->DPAD:Lcom/pymcl/runtime/control/ElementType;

    sget-object v2, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    sget-object v3, Lcom/pymcl/runtime/control/ElementType;->LOOK_AREA:Lcom/pymcl/runtime/control/ElementType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/pymcl/runtime/control/ElementType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 12
    new-instance v0, Lcom/pymcl/runtime/control/ElementType;

    const-string v1, "BUTTON"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/control/ElementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->BUTTON:Lcom/pymcl/runtime/control/ElementType;

    .line 14
    new-instance v0, Lcom/pymcl/runtime/control/ElementType;

    const-string v1, "DPAD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/control/ElementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->DPAD:Lcom/pymcl/runtime/control/ElementType;

    .line 16
    new-instance v0, Lcom/pymcl/runtime/control/ElementType;

    const-string v1, "JOYSTICK"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/control/ElementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    .line 18
    new-instance v0, Lcom/pymcl/runtime/control/ElementType;

    const-string v1, "LOOK_AREA"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/control/ElementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->LOOK_AREA:Lcom/pymcl/runtime/control/ElementType;

    invoke-static {}, Lcom/pymcl/runtime/control/ElementType;->$values()[Lcom/pymcl/runtime/control/ElementType;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->$VALUES:[Lcom/pymcl/runtime/control/ElementType;

    sget-object v0, Lcom/pymcl/runtime/control/ElementType;->$VALUES:[Lcom/pymcl/runtime/control/ElementType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/control/ElementType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/control/ElementType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/control/ElementType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/control/ElementType;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/control/ElementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/control/ElementType;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/control/ElementType;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/control/ElementType;->$VALUES:[Lcom/pymcl/runtime/control/ElementType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/control/ElementType;

    return-object v0
.end method
