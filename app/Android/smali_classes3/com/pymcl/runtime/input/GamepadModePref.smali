.class public final enum Lcom/pymcl/runtime/input/GamepadModePref;
.super Ljava/lang/Enum;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadModePref$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \r2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        "",
        "key",
        "",
        "label",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "getLabel",
        "ASK",
        "MAPPING",
        "DIRECT",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/runtime/input/GamepadModePref;

.field public static final enum ASK:Lcom/pymcl/runtime/input/GamepadModePref;

.field public static final Companion:Lcom/pymcl/runtime/input/GamepadModePref$Companion;

.field public static final enum DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

.field public static final enum MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;


# instance fields
.field private final key:Ljava/lang/String;

.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 3

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->ASK:Lcom/pymcl/runtime/input/GamepadModePref;

    sget-object v1, Lcom/pymcl/runtime/input/GamepadModePref;->MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;

    sget-object v2, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    filled-new-array {v0, v1, v2}, [Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 27
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModePref;

    const-string v1, "ask"

    const-string v2, "\u6bcf\u6b21\u8be2\u95ee"

    const-string v3, "ASK"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/runtime/input/GamepadModePref;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->ASK:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 28
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModePref;

    const-string v1, "mapping"

    const-string v2, "PyMCL \u6620\u5c04\u6a21\u5f0f"

    const-string v3, "MAPPING"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/runtime/input/GamepadModePref;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 29
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModePref;

    const-string v1, "direct"

    const-string v2, "SDL \u76f4\u901a\u6a21\u5f0f"

    const-string v3, "DIRECT"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/runtime/input/GamepadModePref;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-static {}, Lcom/pymcl/runtime/input/GamepadModePref;->$values()[Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->$VALUES:[Lcom/pymcl/runtime/input/GamepadModePref;

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->$VALUES:[Lcom/pymcl/runtime/input/GamepadModePref;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/runtime/input/GamepadModePref$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadModePref$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->Companion:Lcom/pymcl/runtime/input/GamepadModePref$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "key"    # Ljava/lang/String;
    .param p4, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadModePref;->key:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadModePref;->label:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/runtime/input/GamepadModePref;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 1

    const-class v0, Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModePref;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 1

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->$VALUES:[Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/runtime/input/GamepadModePref;

    return-object v0
.end method


# virtual methods
.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModePref;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModePref;->label:Ljava/lang/String;

    return-object v0
.end method
