.class public final enum Lcom/pymcl/core/loader/LoaderType;
.super Ljava/lang/Enum;
.source "Loaders.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/core/loader/LoaderType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/pymcl/core/loader/LoaderType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "FABRIC",
        "QUILT",
        "FORGE",
        "NEOFORGE",
        "OPTIFINE",
        "LITELOADER",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/core/loader/LoaderType;

.field public static final enum FABRIC:Lcom/pymcl/core/loader/LoaderType;

.field public static final enum FORGE:Lcom/pymcl/core/loader/LoaderType;

.field public static final enum LITELOADER:Lcom/pymcl/core/loader/LoaderType;

.field public static final enum NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

.field public static final enum OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

.field public static final enum QUILT:Lcom/pymcl/core/loader/LoaderType;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/core/loader/LoaderType;
    .locals 6

    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    sget-object v1, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    sget-object v2, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    sget-object v3, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    sget-object v4, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    sget-object v5, Lcom/pymcl/core/loader/LoaderType;->LITELOADER:Lcom/pymcl/core/loader/LoaderType;

    filled-new-array/range {v0 .. v5}, [Lcom/pymcl/core/loader/LoaderType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 13
    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "FABRIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "QUILT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "FORGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "NEOFORGE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "OPTIFINE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    new-instance v0, Lcom/pymcl/core/loader/LoaderType;

    const-string v1, "LITELOADER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/loader/LoaderType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->LITELOADER:Lcom/pymcl/core/loader/LoaderType;

    invoke-static {}, Lcom/pymcl/core/loader/LoaderType;->$values()[Lcom/pymcl/core/loader/LoaderType;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->$VALUES:[Lcom/pymcl/core/loader/LoaderType;

    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->$VALUES:[Lcom/pymcl/core/loader/LoaderType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/loader/LoaderType;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/core/loader/LoaderType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;
    .locals 1

    const-class v0, Lcom/pymcl/core/loader/LoaderType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/loader/LoaderType;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/core/loader/LoaderType;
    .locals 1

    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->$VALUES:[Lcom/pymcl/core/loader/LoaderType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/core/loader/LoaderType;

    return-object v0
.end method
