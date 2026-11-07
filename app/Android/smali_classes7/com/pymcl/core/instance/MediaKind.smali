.class public final enum Lcom/pymcl/core/instance/MediaKind;
.super Ljava/lang/Enum;
.source "Saves.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/instance/MediaKind$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/core/instance/MediaKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/core/instance/MediaKind;",
        "",
        "dir",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getDir",
        "()Ljava/lang/String;",
        "SCREENSHOTS",
        "CRASH_REPORTS",
        "LOGS",
        "accepts",
        "",
        "name",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/core/instance/MediaKind;

.field public static final enum CRASH_REPORTS:Lcom/pymcl/core/instance/MediaKind;

.field public static final enum LOGS:Lcom/pymcl/core/instance/MediaKind;

.field public static final enum SCREENSHOTS:Lcom/pymcl/core/instance/MediaKind;


# instance fields
.field private final dir:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/core/instance/MediaKind;
    .locals 3

    sget-object v0, Lcom/pymcl/core/instance/MediaKind;->SCREENSHOTS:Lcom/pymcl/core/instance/MediaKind;

    sget-object v1, Lcom/pymcl/core/instance/MediaKind;->CRASH_REPORTS:Lcom/pymcl/core/instance/MediaKind;

    sget-object v2, Lcom/pymcl/core/instance/MediaKind;->LOGS:Lcom/pymcl/core/instance/MediaKind;

    filled-new-array {v0, v1, v2}, [Lcom/pymcl/core/instance/MediaKind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Lcom/pymcl/core/instance/MediaKind;

    const/4 v1, 0x0

    const-string v2, "screenshots"

    const-string v3, "SCREENSHOTS"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/core/instance/MediaKind;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/MediaKind;->SCREENSHOTS:Lcom/pymcl/core/instance/MediaKind;

    new-instance v0, Lcom/pymcl/core/instance/MediaKind;

    const/4 v1, 0x1

    const-string v2, "crash-reports"

    const-string v3, "CRASH_REPORTS"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/core/instance/MediaKind;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/MediaKind;->CRASH_REPORTS:Lcom/pymcl/core/instance/MediaKind;

    new-instance v0, Lcom/pymcl/core/instance/MediaKind;

    const/4 v1, 0x2

    const-string v2, "logs"

    const-string v3, "LOGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/pymcl/core/instance/MediaKind;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/instance/MediaKind;->LOGS:Lcom/pymcl/core/instance/MediaKind;

    invoke-static {}, Lcom/pymcl/core/instance/MediaKind;->$values()[Lcom/pymcl/core/instance/MediaKind;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/instance/MediaKind;->$VALUES:[Lcom/pymcl/core/instance/MediaKind;

    sget-object v0, Lcom/pymcl/core/instance/MediaKind;->$VALUES:[Lcom/pymcl/core/instance/MediaKind;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/instance/MediaKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "dir"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 31
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/core/instance/MediaKind;->dir:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/core/instance/MediaKind;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/core/instance/MediaKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/core/instance/MediaKind;
    .locals 1

    const-class v0, Lcom/pymcl/core/instance/MediaKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/core/instance/MediaKind;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/core/instance/MediaKind;
    .locals 1

    sget-object v0, Lcom/pymcl/core/instance/MediaKind;->$VALUES:[Lcom/pymcl/core/instance/MediaKind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/core/instance/MediaKind;

    return-object v0
.end method


# virtual methods
.method public final accepts(Ljava/lang/String;)Z
    .locals 8
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v0, "n":Ljava/lang/String;
    sget-object v1, Lcom/pymcl/core/instance/MediaKind$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/pymcl/core/instance/MediaKind;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const-string v2, ".log"

    const-string v3, ".txt"

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 36
    :pswitch_0
    invoke-static {v0, v2, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ".log.gz"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0, v3, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ".gz"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v7

    goto :goto_0

    .line 35
    :pswitch_1
    invoke-static {v0, v3, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0, v2, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    move v4, v7

    goto :goto_0

    .line 34
    :pswitch_2
    const-string v1, ".png"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ".jpg"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ".jpeg"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    const-string v1, ".webp"

    invoke-static {v0, v1, v7, v6, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v4, v7

    .line 33
    :cond_3
    :goto_0
    return v4

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getDir()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/pymcl/core/instance/MediaKind;->dir:Ljava/lang/String;

    return-object v0
.end method
