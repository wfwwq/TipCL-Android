.class public final enum Lcom/pymcl/core/mods/ResKind;
.super Ljava/lang/Enum;
.source "ModCatalog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/mods/ResKind$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/core/mods/ResKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u0000 \u00162\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B+\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000bj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/pymcl/core/mods/ResKind;",
        "",
        "key",
        "",
        "mrType",
        "cfClass",
        "",
        "dir",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V",
        "getKey",
        "()Ljava/lang/String;",
        "getMrType",
        "getCfClass",
        "()I",
        "getDir",
        "MOD",
        "MODPACK",
        "DATAPACK",
        "RESOURCE",
        "SHADER",
        "WORLD",
        "Companion",
        "PyMCL-Android:core"
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

.field private static final synthetic $VALUES:[Lcom/pymcl/core/mods/ResKind;

.field public static final Companion:Lcom/pymcl/core/mods/ResKind$Companion;

.field public static final enum DATAPACK:Lcom/pymcl/core/mods/ResKind;

.field public static final enum MOD:Lcom/pymcl/core/mods/ResKind;

.field public static final enum MODPACK:Lcom/pymcl/core/mods/ResKind;

.field public static final enum RESOURCE:Lcom/pymcl/core/mods/ResKind;

.field public static final enum SHADER:Lcom/pymcl/core/mods/ResKind;

.field public static final enum WORLD:Lcom/pymcl/core/mods/ResKind;


# instance fields
.field private final cfClass:I

.field private final dir:Ljava/lang/String;

.field private final key:Ljava/lang/String;

.field private final mrType:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/core/mods/ResKind;
    .locals 6

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    sget-object v1, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    sget-object v2, Lcom/pymcl/core/mods/ResKind;->DATAPACK:Lcom/pymcl/core/mods/ResKind;

    sget-object v3, Lcom/pymcl/core/mods/ResKind;->RESOURCE:Lcom/pymcl/core/mods/ResKind;

    sget-object v4, Lcom/pymcl/core/mods/ResKind;->SHADER:Lcom/pymcl/core/mods/ResKind;

    sget-object v5, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    filled-new-array/range {v0 .. v5}, [Lcom/pymcl/core/mods/ResKind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    .line 19
    new-instance v0, Lcom/pymcl/core/mods/ResKind;

    const/4 v5, 0x6

    const-string v6, "mods"

    const-string v1, "MOD"

    const/4 v2, 0x0

    const-string v3, "mod"

    const-string v4, "mod"

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/mods/ResKind;->MOD:Lcom/pymcl/core/mods/ResKind;

    new-instance v1, Lcom/pymcl/core/mods/ResKind;

    const/16 v6, 0x1177

    const-string v7, ""

    const-string v2, "MODPACK"

    const/4 v3, 0x1

    const-string v4, "modpack"

    const-string v5, "modpack"

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/pymcl/core/mods/ResKind;->MODPACK:Lcom/pymcl/core/mods/ResKind;

    new-instance v2, Lcom/pymcl/core/mods/ResKind;

    const/16 v7, 0x1b21

    const-string v8, "datapacks"

    const-string v3, "DATAPACK"

    const/4 v4, 0x2

    const-string v5, "datapack"

    const-string v6, "datapack"

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lcom/pymcl/core/mods/ResKind;->DATAPACK:Lcom/pymcl/core/mods/ResKind;

    .line 20
    new-instance v3, Lcom/pymcl/core/mods/ResKind;

    const/16 v8, 0xc

    const-string v9, "resourcepacks"

    const-string v4, "RESOURCE"

    const/4 v5, 0x3

    const-string v6, "resource"

    const-string v7, "resourcepack"

    invoke-direct/range {v3 .. v9}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/pymcl/core/mods/ResKind;->RESOURCE:Lcom/pymcl/core/mods/ResKind;

    new-instance v4, Lcom/pymcl/core/mods/ResKind;

    const/16 v9, 0x1998

    const-string v10, "shaderpacks"

    const-string v5, "SHADER"

    const/4 v6, 0x4

    const-string v7, "shader"

    const-string v8, "shader"

    invoke-direct/range {v4 .. v10}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lcom/pymcl/core/mods/ResKind;->SHADER:Lcom/pymcl/core/mods/ResKind;

    new-instance v5, Lcom/pymcl/core/mods/ResKind;

    const/16 v10, 0x11

    const-string v11, "saves"

    const-string v6, "WORLD"

    const/4 v7, 0x5

    const-string v8, "world"

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/pymcl/core/mods/ResKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/pymcl/core/mods/ResKind;->WORLD:Lcom/pymcl/core/mods/ResKind;

    invoke-static {}, Lcom/pymcl/core/mods/ResKind;->$values()[Lcom/pymcl/core/mods/ResKind;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/mods/ResKind;->$VALUES:[Lcom/pymcl/core/mods/ResKind;

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->$VALUES:[Lcom/pymcl/core/mods/ResKind;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/mods/ResKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/core/mods/ResKind$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/mods/ResKind$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/mods/ResKind;->Companion:Lcom/pymcl/core/mods/ResKind$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "key"    # Ljava/lang/String;
    .param p4, "mrType"    # Ljava/lang/String;
    .param p5, "cfClass"    # I
    .param p6, "dir"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/core/mods/ResKind;->key:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/core/mods/ResKind;->mrType:Ljava/lang/String;

    iput p5, p0, Lcom/pymcl/core/mods/ResKind;->cfClass:I

    iput-object p6, p0, Lcom/pymcl/core/mods/ResKind;->dir:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/core/mods/ResKind;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/core/mods/ResKind;
    .locals 1

    const-class v0, Lcom/pymcl/core/mods/ResKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/mods/ResKind;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/core/mods/ResKind;
    .locals 1

    sget-object v0, Lcom/pymcl/core/mods/ResKind;->$VALUES:[Lcom/pymcl/core/mods/ResKind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/core/mods/ResKind;

    return-object v0
.end method


# virtual methods
.method public final getCfClass()I
    .locals 1

    .line 18
    iget v0, p0, Lcom/pymcl/core/mods/ResKind;->cfClass:I

    return v0
.end method

.method public final getDir()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/mods/ResKind;->dir:Ljava/lang/String;

    return-object v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/mods/ResKind;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getMrType()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/mods/ResKind;->mrType:Ljava/lang/String;

    return-object v0
.end method
