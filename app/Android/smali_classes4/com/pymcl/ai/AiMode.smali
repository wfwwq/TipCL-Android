.class public final Lcom/pymcl/ai/AiMode;
.super Ljava/lang/Object;
.source "AiSettings.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/ai/AiMode$Migrated;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiSettings.kt\ncom/pymcl/ai/AiMode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rJ\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/pymcl/ai/AiMode;",
        "",
        "<init>",
        "()V",
        "BUILTIN",
        "",
        "CUSTOM",
        "GATEWAY",
        "UI_ORDER",
        "",
        "getUI_ORDER",
        "()Ljava/util/List;",
        "uiIndex",
        "",
        "mode",
        "fromUi",
        "i",
        "normalize",
        "m",
        "migrate",
        "Lcom/pymcl/ai/AiMode$Migrated;",
        "raw",
        "baseUrl",
        "apiKey",
        "gatewayUrl",
        "Migrated",
        "PyMCL-Android:ai"
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
.field public static final BUILTIN:Ljava/lang/String; = "builtin"

.field public static final CUSTOM:Ljava/lang/String; = "custom"

.field public static final GATEWAY:Ljava/lang/String; = "gateway"

.field public static final INSTANCE:Lcom/pymcl/ai/AiMode;

.field private static final UI_ORDER:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/ai/AiMode;

    invoke-direct {v0}, Lcom/pymcl/ai/AiMode;-><init>()V

    sput-object v0, Lcom/pymcl/ai/AiMode;->INSTANCE:Lcom/pymcl/ai/AiMode;

    .line 67
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "builtin"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "custom"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "gateway"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/ai/AiMode;->UI_ORDER:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromUi(I)Ljava/lang/String;
    .locals 3
    .param p1, "i"    # I

    .line 69
    sget-object v0, Lcom/pymcl/ai/AiMode;->UI_ORDER:Ljava/util/List;

    const/4 v1, 0x0

    if-ltz p1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-eqz v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    move v0, p1

    .line 180
    .local v0, "it":I
    const/4 v1, 0x0

    .line 69
    .local v1, "$i$a$-getOrElse-AiMode$fromUi$1":I
    const-string v2, "builtin"

    move-object v0, v2

    .end local v0    # "it":I
    .end local v1    # "$i$a$-getOrElse-AiMode$fromUi$1":I
    :goto_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getUI_ORDER()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 67
    sget-object v0, Lcom/pymcl/ai/AiMode;->UI_ORDER:Ljava/util/List;

    return-object v0
.end method

.method public final migrate(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/ai/AiMode$Migrated;
    .locals 4
    .param p1, "raw"    # Ljava/lang/String;
    .param p2, "baseUrl"    # Ljava/lang/String;
    .param p3, "apiKey"    # Ljava/lang/String;
    .param p4, "gatewayUrl"    # Ljava/lang/String;

    const-string v0, "raw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiKey"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gatewayUrl"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .local v0, "r":Ljava/lang/String;
    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiMode;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 87
    const-string v2, "builtin"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    invoke-direct {v1, v2, p2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 88
    :cond_0
    const-string v3, "gateway"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 89
    move-object v1, p4

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    invoke-direct {v1, v3, p2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 90
    :cond_1
    const-string v1, "public"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    invoke-direct {v1, v2, p2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 91
    :cond_2
    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    sget-object v2, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v2}, Lcom/pymcl/ai/Builtin;->getGatewayUrl()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, p2, v2}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 93
    :cond_3
    nop

    .line 94
    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v3, "custom"

    if-nez v1, :cond_4

    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    invoke-direct {v1, v3, p2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 95
    :cond_4
    move-object v1, p3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    invoke-direct {v1, v2, p2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 96
    :cond_5
    new-instance v1, Lcom/pymcl/ai/AiMode$Migrated;

    sget-object v2, Lcom/pymcl/ai/Builtin;->INSTANCE:Lcom/pymcl/ai/Builtin;

    invoke-virtual {v2}, Lcom/pymcl/ai/Builtin;->getApiBase()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v3, v2, p4}, Lcom/pymcl/ai/AiMode$Migrated;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :goto_0
    return-object v1
.end method

.method public final normalize(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "m"    # Ljava/lang/String;

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "builtin"

    const-string v3, "gateway"

    sparse-switch v1, :sswitch_data_0

    :goto_0
    goto :goto_1

    :sswitch_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :sswitch_1
    const-string v1, "\u5185\u7f6e"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    goto :goto_2

    .line 71
    :sswitch_2
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :sswitch_3
    const-string v1, "public"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 73
    :cond_1
    move-object v2, v3

    goto :goto_2

    .line 74
    :goto_1
    const-string v2, "custom"

    .line 75
    :goto_2
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3a424d97 -> :sswitch_3
        -0xb45b9bc -> :sswitch_2
        0xa5e89 -> :sswitch_1
        0xdc42c23 -> :sswitch_0
    .end sparse-switch
.end method

.method public final uiIndex(Ljava/lang/String;)I
    .locals 2
    .param p1, "mode"    # Ljava/lang/String;

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    sget-object v0, Lcom/pymcl/ai/AiMode;->UI_ORDER:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/pymcl/ai/AiMode;->normalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    return v0
.end method
