.class public final enum Lcom/pymcl/runtime/input/StickMode;
.super Ljava/lang/Enum;
.source "GamepadMapping.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/input/StickMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/StickMode;",
        "",
        "label",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getLabel",
        "()Ljava/lang/String;",
        "MOVE",
        "LOOK",
        "NONE",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/input/StickMode;

.field public static final enum LOOK:Lcom/pymcl/runtime/input/StickMode;

.field public static final enum MOVE:Lcom/pymcl/runtime/input/StickMode;

.field public static final enum NONE:Lcom/pymcl/runtime/input/StickMode;


# instance fields
.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/input/StickMode;
    .locals 3

    sget-object v0, Lcom/pymcl/runtime/input/StickMode;->MOVE:Lcom/pymcl/runtime/input/StickMode;

    sget-object v1, Lcom/pymcl/runtime/input/StickMode;->LOOK:Lcom/pymcl/runtime/input/StickMode;

    sget-object v2, Lcom/pymcl/runtime/input/StickMode;->NONE:Lcom/pymcl/runtime/input/StickMode;

    filled-new-array {v0, v1, v2}, [Lcom/pymcl/runtime/input/StickMode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 38
    new-instance v0, Lcom/pymcl/runtime/input/StickMode;

    const/4 v1, 0x0

    const-string v2, "\u79fb\u52a8 (WASD)"

    const-string v3, "MOVE"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/StickMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/StickMode;->MOVE:Lcom/pymcl/runtime/input/StickMode;

    new-instance v0, Lcom/pymcl/runtime/input/StickMode;

    const/4 v1, 0x1

    const-string v2, "\u89c6\u89d2"

    const-string v3, "LOOK"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/StickMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/StickMode;->LOOK:Lcom/pymcl/runtime/input/StickMode;

    new-instance v0, Lcom/pymcl/runtime/input/StickMode;

    const/4 v1, 0x2

    const-string v2, "\u4e0d\u4f7f\u7528"

    const-string v3, "NONE"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/runtime/input/StickMode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/StickMode;->NONE:Lcom/pymcl/runtime/input/StickMode;

    invoke-static {}, Lcom/pymcl/runtime/input/StickMode;->$values()[Lcom/pymcl/runtime/input/StickMode;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/StickMode;->$VALUES:[Lcom/pymcl/runtime/input/StickMode;

    sget-object v0, Lcom/pymcl/runtime/input/StickMode;->$VALUES:[Lcom/pymcl/runtime/input/StickMode;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/StickMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/runtime/input/StickMode;->label:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/input/StickMode;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/input/StickMode;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/input/StickMode;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/input/StickMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/input/StickMode;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/input/StickMode;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/input/StickMode;->$VALUES:[Lcom/pymcl/runtime/input/StickMode;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/input/StickMode;

    return-object v0
.end method


# virtual methods
.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/pymcl/runtime/input/StickMode;->label:Ljava/lang/String;

    return-object v0
.end method
