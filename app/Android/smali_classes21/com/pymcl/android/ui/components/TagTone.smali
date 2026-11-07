.class public final enum Lcom/pymcl/android/ui/components/TagTone;
.super Ljava/lang/Enum;
.source "Ui.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/components/TagTone;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/pymcl/android/ui/components/TagTone;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Accent",
        "Neutral",
        "Warn",
        "Danger",
        "Info",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/components/TagTone;

.field public static final enum Accent:Lcom/pymcl/android/ui/components/TagTone;

.field public static final enum Danger:Lcom/pymcl/android/ui/components/TagTone;

.field public static final enum Info:Lcom/pymcl/android/ui/components/TagTone;

.field public static final enum Neutral:Lcom/pymcl/android/ui/components/TagTone;

.field public static final enum Warn:Lcom/pymcl/android/ui/components/TagTone;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/components/TagTone;
    .locals 5

    sget-object v0, Lcom/pymcl/android/ui/components/TagTone;->Accent:Lcom/pymcl/android/ui/components/TagTone;

    sget-object v1, Lcom/pymcl/android/ui/components/TagTone;->Neutral:Lcom/pymcl/android/ui/components/TagTone;

    sget-object v2, Lcom/pymcl/android/ui/components/TagTone;->Warn:Lcom/pymcl/android/ui/components/TagTone;

    sget-object v3, Lcom/pymcl/android/ui/components/TagTone;->Danger:Lcom/pymcl/android/ui/components/TagTone;

    sget-object v4, Lcom/pymcl/android/ui/components/TagTone;->Info:Lcom/pymcl/android/ui/components/TagTone;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/pymcl/android/ui/components/TagTone;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 168
    new-instance v0, Lcom/pymcl/android/ui/components/TagTone;

    const-string v1, "Accent"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/TagTone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->Accent:Lcom/pymcl/android/ui/components/TagTone;

    new-instance v0, Lcom/pymcl/android/ui/components/TagTone;

    const-string v1, "Neutral"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/TagTone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->Neutral:Lcom/pymcl/android/ui/components/TagTone;

    new-instance v0, Lcom/pymcl/android/ui/components/TagTone;

    const-string v1, "Warn"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/TagTone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->Warn:Lcom/pymcl/android/ui/components/TagTone;

    new-instance v0, Lcom/pymcl/android/ui/components/TagTone;

    const-string v1, "Danger"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/TagTone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->Danger:Lcom/pymcl/android/ui/components/TagTone;

    new-instance v0, Lcom/pymcl/android/ui/components/TagTone;

    const-string v1, "Info"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/components/TagTone;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->Info:Lcom/pymcl/android/ui/components/TagTone;

    invoke-static {}, Lcom/pymcl/android/ui/components/TagTone;->$values()[Lcom/pymcl/android/ui/components/TagTone;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->$VALUES:[Lcom/pymcl/android/ui/components/TagTone;

    sget-object v0, Lcom/pymcl/android/ui/components/TagTone;->$VALUES:[Lcom/pymcl/android/ui/components/TagTone;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/components/TagTone;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 168
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/components/TagTone;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/components/TagTone;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/components/TagTone;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/components/TagTone;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/components/TagTone;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/components/TagTone;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/components/TagTone;->$VALUES:[Lcom/pymcl/android/ui/components/TagTone;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/components/TagTone;

    return-object v0
.end method
