.class public final Lcom/pymcl/android/data/AiLang;
.super Ljava/lang/Object;
.source "AiLang.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiLang;",
        "",
        "<init>",
        "()V",
        "installed",
        "",
        "install",
        "",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/pymcl/android/data/AiLang;

.field private static volatile installed:Z


# direct methods
.method public static synthetic $r8$lambda$uSk8wFfm06CfcuaR7dcgiP7i7i0()Z
    .locals 1

    invoke-static {}, Lcom/pymcl/android/data/AiLang;->install$lambda$0()Z

    move-result v0

    return v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/AiLang;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiLang;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/AiLang;->INSTANCE:Lcom/pymcl/android/data/AiLang;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final install$lambda$0()Z
    .locals 2

    .line 11
    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/i18n/I18n;->getLang()Lcom/pymcl/android/ui/i18n/I18n$Lang;

    move-result-object v0

    sget-object v1, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public final install()V
    .locals 2

    .line 10
    sget-boolean v0, Lcom/pymcl/android/data/AiLang;->installed:Z

    if-eqz v0, :cond_0

    return-void

    .line 11
    :cond_0
    sget-object v0, Lcom/pymcl/ai/AiText;->INSTANCE:Lcom/pymcl/ai/AiText;

    new-instance v1, Lcom/pymcl/android/data/AiLang$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/pymcl/android/data/AiLang$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1}, Lcom/pymcl/ai/AiText;->setEnglish(Lkotlin/jvm/functions/Function0;)V

    .line 12
    const/4 v0, 0x1

    sput-boolean v0, Lcom/pymcl/android/data/AiLang;->installed:Z

    .line 13
    return-void
.end method
