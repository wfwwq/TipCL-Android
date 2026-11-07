.class public final enum Lcom/pymcl/android/data/AiConfirmOutcome;
.super Ljava/lang/Enum;
.source "AiConfirmOutcome.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/AiConfirmOutcome$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/data/AiConfirmOutcome;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u0000 \u00152\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\tR\u0011\u0010\u0013\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiConfirmOutcome;",
        "",
        "label",
        "",
        "ok",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Z)V",
        "getLabel",
        "()Ljava/lang/String;",
        "getOk",
        "()Z",
        "Allowed",
        "AlwaysInstance",
        "AlwaysGlobal",
        "Denied",
        "Expired",
        "code",
        "getCode",
        "danger",
        "getDanger",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/data/AiConfirmOutcome;

.field public static final enum Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

.field public static final enum AlwaysGlobal:Lcom/pymcl/android/data/AiConfirmOutcome;

.field public static final enum AlwaysInstance:Lcom/pymcl/android/data/AiConfirmOutcome;

.field public static final Companion:Lcom/pymcl/android/data/AiConfirmOutcome$Companion;

.field public static final enum Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

.field private static final EN_ALIASES:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/android/data/AiConfirmOutcome;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum Expired:Lcom/pymcl/android/data/AiConfirmOutcome;


# instance fields
.field private final label:Ljava/lang/String;

.field private final ok:Z


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/data/AiConfirmOutcome;
    .locals 5

    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

    sget-object v1, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysInstance:Lcom/pymcl/android/data/AiConfirmOutcome;

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysGlobal:Lcom/pymcl/android/data/AiConfirmOutcome;

    sget-object v3, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    sget-object v4, Lcom/pymcl/android/data/AiConfirmOutcome;->Expired:Lcom/pymcl/android/data/AiConfirmOutcome;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/pymcl/android/data/AiConfirmOutcome;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 8

    .line 13
    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    const-string v1, "Allowed"

    const/4 v2, 0x0

    const-string v3, "\u5141\u8bb8"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/pymcl/android/data/AiConfirmOutcome;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

    .line 14
    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    const-string v1, "AlwaysInstance"

    const-string v3, "\u59cb\u7ec8\u5141\u8bb8\uff08\u4ec5\u5f53\u524d\u5b9e\u4f8b\uff09"

    invoke-direct {v0, v1, v4, v3, v4}, Lcom/pymcl/android/data/AiConfirmOutcome;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysInstance:Lcom/pymcl/android/data/AiConfirmOutcome;

    .line 15
    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    const-string v1, "\u59cb\u7ec8\u5141\u8bb8\uff08\u6240\u6709\u5b9e\u4f8b\uff09"

    const-string v3, "AlwaysGlobal"

    const/4 v5, 0x2

    invoke-direct {v0, v3, v5, v1, v4}, Lcom/pymcl/android/data/AiConfirmOutcome;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysGlobal:Lcom/pymcl/android/data/AiConfirmOutcome;

    .line 16
    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    const-string v1, "\u62d2\u7edd"

    const-string v3, "Denied"

    const/4 v6, 0x3

    invoke-direct {v0, v3, v6, v1, v2}, Lcom/pymcl/android/data/AiConfirmOutcome;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    .line 18
    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    const-string v1, "\u5df2\u5931\u6548"

    const-string v3, "Expired"

    const/4 v7, 0x4

    invoke-direct {v0, v3, v7, v1, v2}, Lcom/pymcl/android/data/AiConfirmOutcome;-><init>(Ljava/lang/String;ILjava/lang/String;Z)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Expired:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {}, Lcom/pymcl/android/data/AiConfirmOutcome;->$values()[Lcom/pymcl/android/data/AiConfirmOutcome;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->$VALUES:[Lcom/pymcl/android/data/AiConfirmOutcome;

    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->$VALUES:[Lcom/pymcl/android/data/AiConfirmOutcome;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->$ENTRIES:Lkotlin/enums/EnumEntries;

    new-instance v0, Lcom/pymcl/android/data/AiConfirmOutcome$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/data/AiConfirmOutcome$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Companion:Lcom/pymcl/android/data/AiConfirmOutcome$Companion;

    .line 24
    nop

    .line 25
    const/4 v0, 0x7

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "allow"

    sget-object v3, Lcom/pymcl/android/data/AiConfirmOutcome;->Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "allowed"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->Allowed:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    const-string v1, "always allow (this instance only)"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysInstance:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v5

    .line 26
    const-string v1, "always allow (all instances)"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->AlwaysGlobal:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v6

    .line 25
    nop

    .line 26
    const-string v1, "deny"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    .line 25
    nop

    .line 26
    const-string v1, "denied"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 25
    nop

    .line 26
    const-string v1, "expired"

    sget-object v2, Lcom/pymcl/android/data/AiConfirmOutcome;->Expired:Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 25
    nop

    .line 24
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->EN_ALIASES:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "label"    # Ljava/lang/String;
    .param p4, "ok"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/android/data/AiConfirmOutcome;->label:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/pymcl/android/data/AiConfirmOutcome;->ok:Z

    return-void
.end method

.method public static final synthetic access$getEN_ALIASES$cp()Ljava/util/Map;
    .locals 1

    .line 12
    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->EN_ALIASES:Ljava/util/Map;

    return-object v0
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/data/AiConfirmOutcome;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/data/AiConfirmOutcome;
    .locals 1

    const-class v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiConfirmOutcome;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/data/AiConfirmOutcome;
    .locals 1

    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->$VALUES:[Lcom/pymcl/android/data/AiConfirmOutcome;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/data/AiConfirmOutcome;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/pymcl/android/data/AiConfirmOutcome;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getDanger()Z
    .locals 1

    .line 22
    sget-object v0, Lcom/pymcl/android/data/AiConfirmOutcome;->Denied:Lcom/pymcl/android/data/AiConfirmOutcome;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/pymcl/android/data/AiConfirmOutcome;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getOk()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/pymcl/android/data/AiConfirmOutcome;->ok:Z

    return v0
.end method
