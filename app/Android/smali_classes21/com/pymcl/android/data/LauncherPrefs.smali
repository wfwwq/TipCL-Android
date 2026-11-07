.class public final Lcom/pymcl/android/data/LauncherPrefs;
.super Ljava/lang/Object;
.source "LauncherPrefs.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherPrefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherPrefs.kt\ncom/pymcl/android/data/LauncherPrefs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J \u0010\u001a\u001a\u00020\u001b2\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001dJ$\u0010\u001e\u001a\u00020\u001f2\u001c\u0010 \u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001dJ\u0010\u0010!\u001a\u00020\u001b2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0005J\u0010\u0010#\u001a\u00020\u001f2\u0008\u0010$\u001a\u0004\u0018\u00010\u0005J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008(\u0012\u0008\u0008)\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/pymcl/android/data/LauncherPrefs;",
        "",
        "<init>",
        "()V",
        "NAME",
        "",
        "SDL_AUTO_SHOW_IME",
        "GAMEPAD_MODE",
        "GAMEPAD_MODES",
        "",
        "getGAMEPAD_MODES",
        "()Ljava/util/List;",
        "GAMEPAD_LABELS",
        "getGAMEPAD_LABELS",
        "GAMEPAD_DEFAULT",
        "BG_MOD_CHECK",
        "BG_MOD_CHECK_LAST",
        "SAVES_REMEMBER_EXPORT_DIR",
        "SAVES_EXPORT_LAST_URI",
        "FEEDBACK_CONSENT",
        "FEEDBACK_DEVICE_ID",
        "FEEDBACK_URL",
        "store",
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs;",
        "ctx",
        "Landroid/content/Context;",
        "readAutoIme",
        "",
        "getBool",
        "Lkotlin/Function2;",
        "readGamepadIndex",
        "",
        "getStr",
        "affectsInGameGroup",
        "key",
        "gamepadIndex",
        "v",
        "gamepadValue",
        "index",
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
.field public static final $stable:I = 0x0

.field public static final BG_MOD_CHECK:Ljava/lang/String; = "bg_mod_update_check"

.field public static final BG_MOD_CHECK_LAST:Ljava/lang/String; = "bg_mod_update_last"

.field public static final FEEDBACK_CONSENT:Ljava/lang/String; = "feedback_consent"

.field public static final FEEDBACK_DEVICE_ID:Ljava/lang/String; = "feedback_device_id"

.field public static final FEEDBACK_URL:Ljava/lang/String; = "feedback_url"

.field public static final GAMEPAD_DEFAULT:Ljava/lang/String; = "ask"

.field private static final GAMEPAD_LABELS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final GAMEPAD_MODE:Ljava/lang/String; = "gamepad_mode"

.field private static final GAMEPAD_MODES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/android/data/LauncherPrefs;

.field public static final NAME:Ljava/lang/String; = "launcher"

.field public static final SAVES_EXPORT_LAST_URI:Ljava/lang/String; = "saves_export_last_uri"

.field public static final SAVES_REMEMBER_EXPORT_DIR:Ljava/lang/String; = "saves_remember_export_dir"

.field public static final SDL_AUTO_SHOW_IME:Ljava/lang/String; = "sdl_auto_show_ime"


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/pymcl/android/data/LauncherPrefs;

    invoke-direct {v0}, Lcom/pymcl/android/data/LauncherPrefs;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/LauncherPrefs;->INSTANCE:Lcom/pymcl/android/data/LauncherPrefs;

    .line 13
    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "ask"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "mapping"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    const-string v2, "direct"

    const/4 v5, 0x2

    aput-object v2, v1, v5

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_MODES:Ljava/util/List;

    .line 14
    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "\u6bcf\u6b21\u8be2\u95ee"

    aput-object v1, v0, v3

    const-string v1, "\u6309\u952e\u6620\u5c04\uff08\u624b\u67c4 \u2192 \u952e\u9f20\uff09"

    aput-object v1, v0, v4

    const-string v1, "\u76f4\u901a\uff08\u6e38\u620f\u539f\u751f\u624b\u67c4\u652f\u6301\uff09"

    aput-object v1, v0, v5

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_LABELS:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final affectsInGameGroup(Ljava/lang/String;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .line 42
    if-eqz p1, :cond_1

    const-string v0, "sdl_auto_show_ime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "gamepad_mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final gamepadIndex(Ljava/lang/String;)I
    .locals 3
    .param p1, "v"    # Ljava/lang/String;

    .line 44
    sget-object v0, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_MODES:Ljava/util/List;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->indexOf(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    .line 61
    .local v0, "it\\1":I
    const/4 v1, 0x0

    .line 44
    .local v1, "$i$a$-let-LauncherPrefs$gamepadIndex$1\\1\\44\\0":I
    if-gez v0, :cond_0

    const/4 v2, 0x0

    move v0, v2

    .end local v0    # "it\\1":I
    .end local v1    # "$i$a$-let-LauncherPrefs$gamepadIndex$1\\1\\44\\0":I
    :cond_0
    return v0
.end method

.method public final gamepadValue(I)Ljava/lang/String;
    .locals 3
    .param p1, "index"    # I

    .line 45
    sget-object v0, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_MODES:Ljava/util/List;

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

    .line 61
    .local v0, "it\\1":I
    const/4 v1, 0x0

    .line 45
    .local v1, "$i$a$-getOrElse-LauncherPrefs$gamepadValue$1\\1\\45\\0":I
    const-string v2, "ask"

    move-object v0, v2

    .end local v0    # "it\\1":I
    .end local v1    # "$i$a$-getOrElse-LauncherPrefs$gamepadValue$1\\1\\45\\0":I
    :goto_0
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getGAMEPAD_LABELS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 14
    sget-object v0, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_LABELS:Ljava/util/List;

    return-object v0
.end method

.method public final getGAMEPAD_MODES()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 13
    sget-object v0, Lcom/pymcl/android/data/LauncherPrefs;->GAMEPAD_MODES:Ljava/util/List;

    return-object v0
.end method

.method public final readAutoIme(Lkotlin/jvm/functions/Function2;)Z
    .locals 2
    .param p1, "getBool"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "getBool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "sdl_auto_show_ime"

    invoke-interface {p1, v1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final readGamepadIndex(Lkotlin/jvm/functions/Function2;)I
    .locals 2
    .param p1, "getStr"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    const-string v0, "getStr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const-string v0, "gamepad_mode"

    const-string v1, "ask"

    invoke-interface {p1, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/pymcl/android/data/LauncherPrefs;->gamepadIndex(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public final store(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    sget-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v0

    return-object v0
.end method
