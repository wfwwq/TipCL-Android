.class public final enum Lcom/pymcl/core/account/AccountType;
.super Ljava/lang/Enum;
.source "Accounts.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/account/AccountType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/core/account/AccountType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/core/account/AccountType;",
        "",
        "id",
        "",
        "userType",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "getUserType",
        "OFFLINE",
        "MICROSOFT",
        "AUTHLIB",
        "NIDE8",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/core/account/AccountType;

.field public static final enum AUTHLIB:Lcom/pymcl/core/account/AccountType;

.field public static final Companion:Lcom/pymcl/core/account/AccountType$Companion;

.field public static final enum MICROSOFT:Lcom/pymcl/core/account/AccountType;

.field public static final enum NIDE8:Lcom/pymcl/core/account/AccountType;

.field public static final enum OFFLINE:Lcom/pymcl/core/account/AccountType;


# instance fields
.field private final id:Ljava/lang/String;

.field private final userType:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/core/account/AccountType;
    .locals 4

    sget-object v0, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    sget-object v1, Lcom/pymcl/core/account/AccountType;->MICROSOFT:Lcom/pymcl/core/account/AccountType;

    sget-object v2, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    sget-object v3, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    filled-new-array {v0, v1, v2, v3}, [Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 24
    new-instance v0, Lcom/pymcl/core/account/AccountType;

    const-string v1, "offline"

    const-string v2, "legacy"

    const-string v3, "OFFLINE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/core/account/AccountType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/account/AccountType;->OFFLINE:Lcom/pymcl/core/account/AccountType;

    new-instance v0, Lcom/pymcl/core/account/AccountType;

    const-string v1, "microsoft"

    const-string v2, "msa"

    const-string v3, "MICROSOFT"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/core/account/AccountType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/account/AccountType;->MICROSOFT:Lcom/pymcl/core/account/AccountType;

    new-instance v0, Lcom/pymcl/core/account/AccountType;

    const-string v1, "AUTHLIB"

    const/4 v2, 0x2

    const-string v3, "authlib"

    const-string v4, "mojang"

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pymcl/core/account/AccountType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/account/AccountType;->AUTHLIB:Lcom/pymcl/core/account/AccountType;

    new-instance v0, Lcom/pymcl/core/account/AccountType;

    const/4 v1, 0x3

    const-string v2, "nide8"

    const-string v3, "NIDE8"

    invoke-direct {v0, v3, v1, v2, v4}, Lcom/pymcl/core/account/AccountType;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/account/AccountType;->NIDE8:Lcom/pymcl/core/account/AccountType;

    invoke-static {}, Lcom/pymcl/core/account/AccountType;->$values()[Lcom/pymcl/core/account/AccountType;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/account/AccountType;->$VALUES:[Lcom/pymcl/core/account/AccountType;

    sget-object v0, Lcom/pymcl/core/account/AccountType;->$VALUES:[Lcom/pymcl/core/account/AccountType;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/account/AccountType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/core/account/AccountType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/account/AccountType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/account/AccountType;->Companion:Lcom/pymcl/core/account/AccountType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "id"    # Ljava/lang/String;
    .param p4, "userType"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/core/account/AccountType;->id:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/core/account/AccountType;->userType:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/core/account/AccountType;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/core/account/AccountType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/core/account/AccountType;
    .locals 1

    const-class v0, Lcom/pymcl/core/account/AccountType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/account/AccountType;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/core/account/AccountType;
    .locals 1

    sget-object v0, Lcom/pymcl/core/account/AccountType;->$VALUES:[Lcom/pymcl/core/account/AccountType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/core/account/AccountType;

    return-object v0
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/pymcl/core/account/AccountType;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserType()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/pymcl/core/account/AccountType;->userType:Ljava/lang/String;

    return-object v0
.end method
