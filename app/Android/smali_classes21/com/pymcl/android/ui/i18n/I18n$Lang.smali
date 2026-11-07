.class public final enum Lcom/pymcl/android/ui/i18n/I18n$Lang;
.super Ljava/lang/Enum;
.source "I18n.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/i18n/I18n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Lang"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/pymcl/android/ui/i18n/I18n$Lang;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008j\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/android/ui/i18n/I18n$Lang;",
        "",
        "code",
        "",
        "label",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getLabel",
        "Zh",
        "En",
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

.field private static final synthetic $VALUES:[Lcom/pymcl/android/ui/i18n/I18n$Lang;

.field public static final enum En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

.field public static final enum Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;


# instance fields
.field private final code:Ljava/lang/String;

.field private final label:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/pymcl/android/ui/i18n/I18n$Lang;
    .locals 2

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    sget-object v1, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    filled-new-array {v0, v1}, [Lcom/pymcl/android/ui/i18n/I18n$Lang;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 16
    new-instance v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;

    const-string v1, "zh_CN"

    const-string v2, "\u7b80\u4f53\u4e2d\u6587"

    const-string v3, "Zh"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/i18n/I18n$Lang;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    new-instance v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;

    const-string v1, "en"

    const-string v2, "English"

    const-string v3, "En"

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/pymcl/android/ui/i18n/I18n$Lang;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    invoke-static {}, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$values()[Lcom/pymcl/android/ui/i18n/I18n$Lang;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$VALUES:[Lcom/pymcl/android/ui/i18n/I18n$Lang;

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$VALUES:[Lcom/pymcl/android/ui/i18n/I18n$Lang;

    check-cast v0, [Ljava/lang/Enum;

    invoke-static {v0}, Lkotlin/enums/EnumEntriesKt;->enumEntries([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "$enum$name"    # Ljava/lang/String;
    .param p2, "$enum$ordinal"    # I
    .param p3, "code"    # Ljava/lang/String;
    .param p4, "label"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->code:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->label:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries<",
            "Lcom/pymcl/android/ui/i18n/I18n$Lang;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$ENTRIES:Lkotlin/enums/EnumEntries;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/pymcl/android/ui/i18n/I18n$Lang;
    .locals 1

    const-class v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;

    return-object v0
.end method

.method public static values()[Lcom/pymcl/android/ui/i18n/I18n$Lang;
    .locals 1

    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->$VALUES:[Lcom/pymcl/android/ui/i18n/I18n$Lang;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/pymcl/android/ui/i18n/I18n$Lang;

    return-object v0
.end method


# virtual methods
.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/pymcl/android/ui/i18n/I18n$Lang;->label:Ljava/lang/String;

    return-object v0
.end method
