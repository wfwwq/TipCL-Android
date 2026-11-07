.class public final enum Lcom/pymcl/android/ui/state/LaunchGate$Reason;
.super Ljava/lang/Enum;
.source "LaunchGate.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/state/LaunchGate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Reason"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/state/LaunchGate$Reason;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LaunchGate$Reason;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Ok",
        "Loading",
        "Running",
        "Launching",
        "Installing",
        "NoInstance",
        "InstanceMissing",
        "NoVersion",
        "VersionMissing",
        "VersionIncomplete",
        "NoAccount",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum Installing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum InstanceMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum Launching:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum Loading:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum NoAccount:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum NoInstance:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum NoVersion:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum Ok:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum Running:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum VersionIncomplete:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

.field public static final enum VersionMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .locals 11

    sget-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Ok:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v1, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Loading:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Running:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v3, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Launching:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v4, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Installing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoInstance:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v6, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->InstanceMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v7, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoVersion:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v8, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v9, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionIncomplete:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v10, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoAccount:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    filled-new-array/range {v0 .. v10}, [Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 15
    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "Ok"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Ok:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "Loading"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Loading:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "Running"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Running:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "Launching"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Launching:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "Installing"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Installing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "NoInstance"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoInstance:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "InstanceMissing"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->InstanceMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "NoVersion"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoVersion:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "VersionMissing"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "VersionIncomplete"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionIncomplete:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    const-string v1, "NoAccount"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoAccount:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    invoke-static {}, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$values()[Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$VALUES:[Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$VALUES:[Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$ENTRIES:Lkotlin/enums/EnumEntries;

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

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/state/LaunchGate$Reason;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/state/LaunchGate$Reason;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->$VALUES:[Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    return-object v0
.end method
