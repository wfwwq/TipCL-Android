.class public final enum Lcom/pymcl/android/ui/components/BtnKind;
.super Ljava/lang/Enum;
.source "Ui.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/components/BtnKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/android/ui/components/BtnKind;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Primary",
        "Soft",
        "Normal",
        "Ghost",
        "Danger",
        "Icon",
        "Chip",
        "OnBanner",
        "PyMCL-Android:app_debug"
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Chip:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Danger:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Ghost:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Icon:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Normal:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum OnBanner:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Primary:Lcom/pymcl/android/ui/components/BtnKind;

.field public static final enum Soft:Lcom/pymcl/android/ui/components/BtnKind;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/components/BtnKind;
    .locals 8

    sget-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Primary:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v1, Lcom/pymcl/android/ui/components/BtnKind;->Soft:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v2, Lcom/pymcl/android/ui/components/BtnKind;->Normal:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v3, Lcom/pymcl/android/ui/components/BtnKind;->Ghost:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v4, Lcom/pymcl/android/ui/components/BtnKind;->Danger:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v5, Lcom/pymcl/android/ui/components/BtnKind;->Icon:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v6, Lcom/pymcl/android/ui/components/BtnKind;->Chip:Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v7, Lcom/pymcl/android/ui/components/BtnKind;->OnBanner:Lcom/pymcl/android/ui/components/BtnKind;

    filled-new-array/range {v0 .. v7}, [Lcom/pymcl/android/ui/components/BtnKind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 60
    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Primary"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Primary:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Soft"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Soft:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Normal"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Normal:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Ghost"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Ghost:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Danger"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Danger:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Icon"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Icon:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "Chip"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->Chip:Lcom/pymcl/android/ui/components/BtnKind;

    new-instance v0, Lcom/pymcl/android/ui/components/BtnKind;

    const-string v1, "OnBanner"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/BtnKind;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->OnBanner:Lcom/pymcl/android/ui/components/BtnKind;

    invoke-static {}, Lcom/pymcl/android/ui/components/BtnKind;->$values()[Lcom/pymcl/android/ui/components/BtnKind;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->$VALUES:[Lcom/pymcl/android/ui/components/BtnKind;

    sget-object v0, Lcom/pymcl/android/ui/components/BtnKind;->$VALUES:[Lcom/pymcl/android/ui/components/BtnKind;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/components/BtnKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 60
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/components/BtnKind;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/components/BtnKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/components/BtnKind;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/components/BtnKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/components/BtnKind;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/components/BtnKind;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/components/BtnKind;->$VALUES:[Lcom/pymcl/android/ui/components/BtnKind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/components/BtnKind;

    return-object v0
.end method
