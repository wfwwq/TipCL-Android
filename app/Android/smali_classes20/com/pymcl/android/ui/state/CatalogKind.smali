.class public final enum Lcom/pymcl/android/ui/state/CatalogKind;
.super Ljava/lang/Enum;
.source "AppState.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/state/CatalogKind;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B#\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/CatalogKind;",
        "",
        "key",
        "",
        "title",
        "installedFirst",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V",
        "getKey",
        "()Ljava/lang/String;",
        "getTitle",
        "getInstalledFirst",
        "()Z",
        "Mod",
        "Mods",
        "Modpack",
        "Datapack",
        "Resource",
        "Shader",
        "World",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Datapack:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Mod:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Modpack:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Mods:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Resource:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum Shader:Lcom/pymcl/android/ui/state/CatalogKind;

.field public static final enum World:Lcom/pymcl/android/ui/state/CatalogKind;


# instance fields
.field private final installedFirst:Z

.field private final key:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/state/CatalogKind;
    .locals 7

    sget-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->Mod:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Mods:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v2, Lcom/pymcl/android/ui/state/CatalogKind;->Modpack:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v3, Lcom/pymcl/android/ui/state/CatalogKind;->Datapack:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v4, Lcom/pymcl/android/ui/state/CatalogKind;->Resource:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v5, Lcom/pymcl/android/ui/state/CatalogKind;->Shader:Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v6, Lcom/pymcl/android/ui/state/CatalogKind;->World:Lcom/pymcl/android/ui/state/CatalogKind;

    filled-new-array/range {v0 .. v6}, [Lcom/pymcl/android/ui/state/CatalogKind;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 14

    .line 19
    new-instance v0, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v1, "Mod"

    const/4 v2, 0x0

    const-string v3, "mod"

    const-string v4, "Mod"

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->Mod:Lcom/pymcl/android/ui/state/CatalogKind;

    new-instance v1, Lcom/pymcl/android/ui/state/CatalogKind;

    const-string v5, "\u6a21\u7ec4"

    const/4 v6, 0x1

    const-string v2, "Mods"

    const/4 v3, 0x1

    const-string v4, "mods"

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    sput-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Mods:Lcom/pymcl/android/ui/state/CatalogKind;

    new-instance v2, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v3, "Modpack"

    const/4 v4, 0x2

    const-string v5, "modpack"

    const-string v6, "\u6574\u5408\u5305"

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/pymcl/android/ui/state/CatalogKind;->Modpack:Lcom/pymcl/android/ui/state/CatalogKind;

    new-instance v3, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const-string v4, "Datapack"

    const/4 v5, 0x3

    const-string v6, "datapack"

    const-string v7, "\u6570\u636e\u5305"

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v10}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/pymcl/android/ui/state/CatalogKind;->Datapack:Lcom/pymcl/android/ui/state/CatalogKind;

    .line 20
    new-instance v4, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const-string v5, "Resource"

    const/4 v6, 0x4

    const-string v7, "resource"

    const-string v8, "\u8d44\u6e90\u5305"

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lcom/pymcl/android/ui/state/CatalogKind;->Resource:Lcom/pymcl/android/ui/state/CatalogKind;

    new-instance v5, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const-string v6, "Shader"

    const/4 v7, 0x5

    const-string v8, "shader"

    const-string v9, "\u5149\u5f71\u5305"

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lcom/pymcl/android/ui/state/CatalogKind;->Shader:Lcom/pymcl/android/ui/state/CatalogKind;

    new-instance v6, Lcom/pymcl/android/ui/state/CatalogKind;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const-string v7, "World"

    const/4 v8, 0x6

    const-string v9, "world"

    const-string v10, "\u4e16\u754c"

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v13}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lcom/pymcl/android/ui/state/CatalogKind;->World:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-static {}, Lcom/pymcl/android/ui/state/CatalogKind;->$values()[Lcom/pymcl/android/ui/state/CatalogKind;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->$VALUES:[Lcom/pymcl/android/ui/state/CatalogKind;

    sget-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->$VALUES:[Lcom/pymcl/android/ui/state/CatalogKind;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "key"    # Ljava/lang/String;
    .param p4, "title"    # Ljava/lang/String;
    .param p5, "installedFirst"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/android/ui/state/CatalogKind;->key:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/state/CatalogKind;->title:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/pymcl/android/ui/state/CatalogKind;->installedFirst:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    .line 18
    and-int/lit8 p6, p6, 0x4

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/ui/state/CatalogKind;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/state/CatalogKind;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/state/CatalogKind;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/CatalogKind;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/state/CatalogKind;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/state/CatalogKind;->$VALUES:[Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/state/CatalogKind;

    return-object v0
.end method


# virtual methods
.method public final getInstalledFirst()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/CatalogKind;->installedFirst:Z

    return v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/android/ui/state/CatalogKind;->key:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/android/ui/state/CatalogKind;->title:Ljava/lang/String;

    return-object v0
.end method
