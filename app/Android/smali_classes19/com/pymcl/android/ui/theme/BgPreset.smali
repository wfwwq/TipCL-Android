.class public final enum Lcom/pymcl/android/ui/theme/BgPreset;
.super Ljava/lang/Enum;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/theme/BgPreset;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B-\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rj\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/android/ui/theme/BgPreset;",
        "",
        "label",
        "",
        "light",
        "",
        "",
        "darkC",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V",
        "getLabel",
        "()Ljava/lang/String;",
        "getLight",
        "()Ljava/util/List;",
        "getDarkC",
        "Default",
        "Eye",
        "Warm",
        "Mist",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/theme/BgPreset;

.field public static final enum Default:Lcom/pymcl/android/ui/theme/BgPreset;

.field public static final enum Eye:Lcom/pymcl/android/ui/theme/BgPreset;

.field public static final enum Mist:Lcom/pymcl/android/ui/theme/BgPreset;

.field public static final enum Warm:Lcom/pymcl/android/ui/theme/BgPreset;


# instance fields
.field private final darkC:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Ljava/lang/String;

.field private final light:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/theme/BgPreset;
    .locals 4

    sget-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->Default:Lcom/pymcl/android/ui/theme/BgPreset;

    sget-object v1, Lcom/pymcl/android/ui/theme/BgPreset;->Eye:Lcom/pymcl/android/ui/theme/BgPreset;

    sget-object v2, Lcom/pymcl/android/ui/theme/BgPreset;->Warm:Lcom/pymcl/android/ui/theme/BgPreset;

    sget-object v3, Lcom/pymcl/android/ui/theme/BgPreset;->Mist:Lcom/pymcl/android/ui/theme/BgPreset;

    filled-new-array {v0, v1, v2, v3}, [Lcom/pymcl/android/ui/theme/BgPreset;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 17

    .line 87
    new-instance v0, Lcom/pymcl/android/ui/theme/BgPreset;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    const-string v1, "Default"

    const/4 v2, 0x0

    const-string v3, "\u9ed8\u8ba4"

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/theme/BgPreset;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    sput-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->Default:Lcom/pymcl/android/ui/theme/BgPreset;

    .line 88
    new-instance v1, Lcom/pymcl/android/ui/theme/BgPreset;

    const/4 v0, 0x4

    new-array v2, v0, [Ljava/lang/Long;

    const-wide/32 v3, 0xebf4ec

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v7, 0x0

    aput-object v3, v2, v7

    const-wide/32 v3, 0xeff7f0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v8, 0x1

    aput-object v3, v2, v8

    const-wide/32 v3, 0xeaf4eb

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v9, 0x2

    aput-object v3, v2, v9

    const-wide/32 v3, 0xedf6ee

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const/4 v10, 0x3

    aput-object v3, v2, v10

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-array v2, v0, [Ljava/lang/Long;

    const-wide/32 v3, 0x121a15

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v7

    const-wide/32 v11, 0x141d17

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v8

    const-wide/32 v11, 0x16211a

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v2, v9

    aput-object v3, v2, v10

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v2, "Eye"

    const/4 v3, 0x1

    const-string v4, "\u62a4\u773c\u7eff"

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/ui/theme/BgPreset;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    sput-object v1, Lcom/pymcl/android/ui/theme/BgPreset;->Eye:Lcom/pymcl/android/ui/theme/BgPreset;

    .line 89
    new-instance v11, Lcom/pymcl/android/ui/theme/BgPreset;

    new-array v1, v0, [Ljava/lang/Long;

    const-wide/32 v2, 0xf7f3ea

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v7

    const-wide/32 v2, 0xf9f5ed

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v8

    const-wide/32 v2, 0xf6f2e8

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v9

    const-wide/32 v2, 0xf8f4ec

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v10

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    new-array v1, v0, [Ljava/lang/Long;

    const-wide/32 v2, 0x1b1813

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v1, v7

    const-wide/32 v3, 0x1d1a15

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v8

    const-wide/32 v3, 0x201c16

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v1, v9

    aput-object v2, v1, v10

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const-string v12, "Warm"

    const/4 v13, 0x2

    const-string v14, "\u6696\u7c73"

    invoke-direct/range {v11 .. v16}, Lcom/pymcl/android/ui/theme/BgPreset;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    sput-object v11, Lcom/pymcl/android/ui/theme/BgPreset;->Warm:Lcom/pymcl/android/ui/theme/BgPreset;

    .line 90
    new-instance v1, Lcom/pymcl/android/ui/theme/BgPreset;

    new-array v2, v0, [Ljava/lang/Long;

    const-wide/32 v3, 0xedf1f6

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v7

    const-wide/32 v3, 0xf0f4f9

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v8

    const-wide/32 v3, 0xebf0f6

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v9

    const-wide/32 v3, 0xeef2f8

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v2, v10

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-array v0, v0, [Ljava/lang/Long;

    const-wide/32 v2, 0x14181d

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v7

    const-wide/32 v3, 0x161b21

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v0, v8

    const-wide/32 v3, 0x181e25

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    aput-object v3, v0, v9

    aput-object v2, v0, v10

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v2, "Mist"

    const/4 v3, 0x3

    const-string v4, "\u96fe\u84dd"

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/ui/theme/BgPreset;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    sput-object v1, Lcom/pymcl/android/ui/theme/BgPreset;->Mist:Lcom/pymcl/android/ui/theme/BgPreset;

    invoke-static {}, Lcom/pymcl/android/ui/theme/BgPreset;->$values()[Lcom/pymcl/android/ui/theme/BgPreset;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->$VALUES:[Lcom/pymcl/android/ui/theme/BgPreset;

    sget-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->$VALUES:[Lcom/pymcl/android/ui/theme/BgPreset;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "light"    # Ljava/util/List;
    .param p5, "darkC"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 86
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/android/ui/theme/BgPreset;->label:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/theme/BgPreset;->light:Ljava/util/List;

    iput-object p5, p0, Lcom/pymcl/android/ui/theme/BgPreset;->darkC:Ljava/util/List;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/theme/BgPreset;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/theme/BgPreset;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/theme/BgPreset;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/theme/BgPreset;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/theme/BgPreset;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/theme/BgPreset;->$VALUES:[Lcom/pymcl/android/ui/theme/BgPreset;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/theme/BgPreset;

    return-object v0
.end method


# virtual methods
.method public final getDarkC()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/pymcl/android/ui/theme/BgPreset;->darkC:Ljava/util/List;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/pymcl/android/ui/theme/BgPreset;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getLight()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/pymcl/android/ui/theme/BgPreset;->light:Ljava/util/List;

    return-object v0
.end method
