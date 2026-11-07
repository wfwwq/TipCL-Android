.class public final enum Lcom/pymcl/runtime/input/Keys$Action;
.super Ljava/lang/Enum;
.source "Keys.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/Keys;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/Keys$Action$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "TOGGLE_IME",
        "PC_KEYBOARD",
        "QUICK_INPUT",
        "TOGGLE_CURSOR",
        "EDIT_LAYOUT",
        "MENU",
        "GAME_MENU",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/input/Keys$Action;

.field public static final Companion:Lcom/pymcl/runtime/input/Keys$Action$Companion;

.field public static final enum EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum GAME_MENU:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum MENU:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

.field public static final enum TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/input/Keys$Action;
    .locals 7

    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v1, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v2, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v3, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v4, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v5, Lcom/pymcl/runtime/input/Keys$Action;->MENU:Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v6, Lcom/pymcl/runtime/input/Keys$Action;->GAME_MENU:Lcom/pymcl/runtime/input/Keys$Action;

    filled-new-array/range {v0 .. v6}, [Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 20
    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x0

    const-string v2, "@ime"

    const-string v3, "TOGGLE_IME"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_IME:Lcom/pymcl/runtime/input/Keys$Action;

    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x1

    const-string v2, "@pc_keyboard"

    const-string v3, "PC_KEYBOARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->PC_KEYBOARD:Lcom/pymcl/runtime/input/Keys$Action;

    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x2

    const-string v2, "@quick_input"

    const-string v3, "QUICK_INPUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->QUICK_INPUT:Lcom/pymcl/runtime/input/Keys$Action;

    .line 21
    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x3

    const-string v2, "@virtual_mouse"

    const-string v3, "TOGGLE_CURSOR"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->TOGGLE_CURSOR:Lcom/pymcl/runtime/input/Keys$Action;

    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x4

    const-string v2, "@edit_layout"

    const-string v3, "EDIT_LAYOUT"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x5

    const-string v2, "@menu"

    const-string v3, "MENU"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->MENU:Lcom/pymcl/runtime/input/Keys$Action;

    .line 23
    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action;

    const/4 v1, 0x6

    const-string v2, "@game_menu"

    const-string v3, "GAME_MENU"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/Keys$Action;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->GAME_MENU:Lcom/pymcl/runtime/input/Keys$Action;

    invoke-static {}, Lcom/pymcl/runtime/input/Keys$Action;->$values()[Lcom/pymcl/runtime/input/Keys$Action;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->$VALUES:[Lcom/pymcl/runtime/input/Keys$Action;

    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->$VALUES:[Lcom/pymcl/runtime/input/Keys$Action;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/runtime/input/Keys$Action$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/Keys$Action$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/Keys$Action;->Companion:Lcom/pymcl/runtime/input/Keys$Action$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 19
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/runtime/input/Keys$Action;->id:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/input/Keys$Action;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/input/Keys$Action;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/input/Keys$Action;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/input/Keys$Action;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->$VALUES:[Lcom/pymcl/runtime/input/Keys$Action;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/input/Keys$Action;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/pymcl/runtime/input/Keys$Action;->id:Ljava/lang/String;

    return-object v0
.end method
