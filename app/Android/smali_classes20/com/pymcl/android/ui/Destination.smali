.class public final enum Lcom/pymcl/android/ui/Destination;
.super Ljava/lang/Enum;
.source "Destinations.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/Destination$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/Destination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0015\u0008\u0086\u0081\u0002\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/android/ui/Destination;",
        "",
        "route",
        "",
        "title",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getRoute",
        "()Ljava/lang/String;",
        "getTitle",
        "Launch",
        "Versions",
        "Library",
        "Instances",
        "Java",
        "Accounts",
        "Ai",
        "Multiplayer",
        "Servers",
        "Settings",
        "PlayTime",
        "Tasks",
        "Feedback",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/Destination;

.field public static final enum Accounts:Lcom/pymcl/android/ui/Destination;

.field public static final enum Ai:Lcom/pymcl/android/ui/Destination;

.field public static final Companion:Lcom/pymcl/android/ui/Destination$Companion;

.field public static final enum Feedback:Lcom/pymcl/android/ui/Destination;

.field public static final enum Instances:Lcom/pymcl/android/ui/Destination;

.field public static final enum Java:Lcom/pymcl/android/ui/Destination;

.field public static final enum Launch:Lcom/pymcl/android/ui/Destination;

.field public static final enum Library:Lcom/pymcl/android/ui/Destination;

.field public static final enum Multiplayer:Lcom/pymcl/android/ui/Destination;

.field public static final enum PlayTime:Lcom/pymcl/android/ui/Destination;

.field public static final enum Servers:Lcom/pymcl/android/ui/Destination;

.field public static final enum Settings:Lcom/pymcl/android/ui/Destination;

.field public static final enum Tasks:Lcom/pymcl/android/ui/Destination;

.field public static final enum Versions:Lcom/pymcl/android/ui/Destination;

.field private static final start:Lcom/pymcl/android/ui/Destination;


# instance fields
.field private final route:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/Destination;
    .locals 13

    sget-object v0, Lcom/pymcl/android/ui/Destination;->Launch:Lcom/pymcl/android/ui/Destination;

    sget-object v1, Lcom/pymcl/android/ui/Destination;->Versions:Lcom/pymcl/android/ui/Destination;

    sget-object v2, Lcom/pymcl/android/ui/Destination;->Library:Lcom/pymcl/android/ui/Destination;

    sget-object v3, Lcom/pymcl/android/ui/Destination;->Instances:Lcom/pymcl/android/ui/Destination;

    sget-object v4, Lcom/pymcl/android/ui/Destination;->Java:Lcom/pymcl/android/ui/Destination;

    sget-object v5, Lcom/pymcl/android/ui/Destination;->Accounts:Lcom/pymcl/android/ui/Destination;

    sget-object v6, Lcom/pymcl/android/ui/Destination;->Ai:Lcom/pymcl/android/ui/Destination;

    sget-object v7, Lcom/pymcl/android/ui/Destination;->Multiplayer:Lcom/pymcl/android/ui/Destination;

    sget-object v8, Lcom/pymcl/android/ui/Destination;->Servers:Lcom/pymcl/android/ui/Destination;

    sget-object v9, Lcom/pymcl/android/ui/Destination;->Settings:Lcom/pymcl/android/ui/Destination;

    sget-object v10, Lcom/pymcl/android/ui/Destination;->PlayTime:Lcom/pymcl/android/ui/Destination;

    sget-object v11, Lcom/pymcl/android/ui/Destination;->Tasks:Lcom/pymcl/android/ui/Destination;

    sget-object v12, Lcom/pymcl/android/ui/Destination;->Feedback:Lcom/pymcl/android/ui/Destination;

    filled-new-array/range {v0 .. v12}, [Lcom/pymcl/android/ui/Destination;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 5
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "launch"

    const-string v2, "\u542f\u52a8"

    const-string v3, "Launch"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Launch:Lcom/pymcl/android/ui/Destination;

    .line 6
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "versions"

    const-string v2, "\u7248\u672c"

    const-string v3, "Versions"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Versions:Lcom/pymcl/android/ui/Destination;

    .line 7
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "library"

    const-string v2, "\u8d44\u6e90\u5e93"

    const-string v3, "Library"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Library:Lcom/pymcl/android/ui/Destination;

    .line 8
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "instances"

    const-string v2, "\u5b9e\u4f8b"

    const-string v3, "Instances"

    const/4 v4, 0x3

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Instances:Lcom/pymcl/android/ui/Destination;

    .line 9
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const/4 v1, 0x4

    const-string v2, "java"

    const-string v3, "Java"

    invoke-direct {v0, v3, v1, v2, v3}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Java:Lcom/pymcl/android/ui/Destination;

    .line 10
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "accounts"

    const-string v2, "\u8d26\u53f7"

    const-string v3, "Accounts"

    const/4 v4, 0x5

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Accounts:Lcom/pymcl/android/ui/Destination;

    .line 11
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "ai"

    const-string v2, "AI"

    const-string v3, "Ai"

    const/4 v4, 0x6

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Ai:Lcom/pymcl/android/ui/Destination;

    .line 12
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "multiplayer"

    const-string v2, "\u8054\u673a"

    const-string v3, "Multiplayer"

    const/4 v4, 0x7

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Multiplayer:Lcom/pymcl/android/ui/Destination;

    .line 13
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "servers"

    const-string v2, "\u670d\u52a1\u5668"

    const-string v3, "Servers"

    const/16 v4, 0x8

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Servers:Lcom/pymcl/android/ui/Destination;

    .line 14
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "settings"

    const-string v2, "\u8bbe\u7f6e"

    const-string v3, "Settings"

    const/16 v4, 0x9

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Settings:Lcom/pymcl/android/ui/Destination;

    .line 15
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "playtime"

    const-string v2, "\u6e38\u620f\u65f6\u957f"

    const-string v3, "PlayTime"

    const/16 v4, 0xa

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->PlayTime:Lcom/pymcl/android/ui/Destination;

    .line 16
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "tasks"

    const-string v2, "\u4efb\u52a1"

    const-string v3, "Tasks"

    const/16 v4, 0xb

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Tasks:Lcom/pymcl/android/ui/Destination;

    .line 17
    new-instance v0, Lcom/pymcl/android/ui/Destination;

    const-string v1, "feedback"

    const-string v2, "\u53cd\u9988"

    const-string v3, "Feedback"

    const/16 v4, 0xc

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/Destination;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Feedback:Lcom/pymcl/android/ui/Destination;

    invoke-static {}, Lcom/pymcl/android/ui/Destination;->$values()[Lcom/pymcl/android/ui/Destination;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/Destination;->$VALUES:[Lcom/pymcl/android/ui/Destination;

    sget-object v0, Lcom/pymcl/android/ui/Destination;->$VALUES:[Lcom/pymcl/android/ui/Destination;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/Destination;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/android/ui/Destination$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/ui/Destination$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/ui/Destination;->Companion:Lcom/pymcl/android/ui/Destination$Companion;

    .line 20
    sget-object v0, Lcom/pymcl/android/ui/Destination;->Launch:Lcom/pymcl/android/ui/Destination;

    sput-object v0, Lcom/pymcl/android/ui/Destination;->start:Lcom/pymcl/android/ui/Destination;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "route"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/android/ui/Destination;->route:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/Destination;->title:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getStart$cp()Lcom/pymcl/android/ui/Destination;
    .locals 1

    .line 4
    sget-object v0, Lcom/pymcl/android/ui/Destination;->start:Lcom/pymcl/android/ui/Destination;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/Destination;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/Destination;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/Destination;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/Destination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/Destination;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/Destination;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/Destination;->$VALUES:[Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/Destination;

    return-object v0
.end method


# virtual methods
.method public final getRoute()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/pymcl/android/ui/Destination;->route:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/pymcl/android/ui/Destination;->title:Ljava/lang/String;

    return-object v0
.end method
