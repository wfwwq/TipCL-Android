.class public final enum Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
.super Ljava/lang/Enum;
.source "PcKeyboardView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/keyboard/StickyModifiers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OFF",
        "ONCE",
        "LOCKED",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

.field public static final enum LOCKED:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

.field public static final enum OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

.field public static final enum ONCE:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    .locals 3

    sget-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    sget-object v1, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ONCE:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    sget-object v2, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->LOCKED:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    filled-new-array {v0, v1, v2}, [Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 39
    new-instance v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    const-string v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->OFF:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    new-instance v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    const-string v1, "ONCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->ONCE:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    new-instance v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    const-string v1, "LOCKED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->LOCKED:Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-static {}, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$values()[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$VALUES:[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    sget-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$VALUES:[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 39
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/keyboard/StickyModifiers$State;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/keyboard/StickyModifiers$State;->$VALUES:[Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/keyboard/StickyModifiers$State;

    return-object v0
.end method
