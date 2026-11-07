.class public final Lcom/pymcl/runtime/input/LauncherPrefs;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/LauncherPrefs;",
        "",
        "io",
        "Lcom/pymcl/runtime/input/PrefIO;",
        "<init>",
        "(Lcom/pymcl/runtime/input/PrefIO;)V",
        "v",
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        "gamepadMode",
        "getGamepadMode",
        "()Lcom/pymcl/runtime/input/GamepadModePref;",
        "setGamepadMode",
        "(Lcom/pymcl/runtime/input/GamepadModePref;)V",
        "",
        "sdlAutoShowIme",
        "getSdlAutoShowIme",
        "()Z",
        "setSdlAutoShowIme",
        "(Z)V",
        "toggleSdlAutoShowIme",
        "PyMCL-Android:runtime_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final io:Lcom/pymcl/runtime/input/PrefIO;


# direct methods
.method public constructor <init>(Lcom/pymcl/runtime/input/PrefIO;)V
    .locals 1
    .param p1, "io"    # Lcom/pymcl/runtime/input/PrefIO;

    const-string v0, "io"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/LauncherPrefs;->io:Lcom/pymcl/runtime/input/PrefIO;

    return-void
.end method


# virtual methods
.method public final getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 4

    .line 125
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->Companion:Lcom/pymcl/runtime/input/GamepadModePref$Companion;

    iget-object v1, p0, Lcom/pymcl/runtime/input/LauncherPrefs;->io:Lcom/pymcl/runtime/input/PrefIO;

    const-string v2, "gamepad_mode"

    const-string v3, "ask"

    invoke-interface {v1, v2, v3}, Lcom/pymcl/runtime/input/PrefIO;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/GamepadModePref$Companion;->parse(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    return-object v0
.end method

.method public final getSdlAutoShowIme()Z
    .locals 3

    .line 128
    iget-object v0, p0, Lcom/pymcl/runtime/input/LauncherPrefs;->io:Lcom/pymcl/runtime/input/PrefIO;

    const-string v1, "sdl_auto_show_ime"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/pymcl/runtime/input/PrefIO;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final setGamepadMode(Lcom/pymcl/runtime/input/GamepadModePref;)V
    .locals 3
    .param p1, "v"    # Lcom/pymcl/runtime/input/GamepadModePref;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/pymcl/runtime/input/LauncherPrefs;->io:Lcom/pymcl/runtime/input/PrefIO;

    const-string v1, "gamepad_mode"

    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadModePref;->getKey()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/pymcl/runtime/input/PrefIO;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setSdlAutoShowIme(Z)V
    .locals 2
    .param p1, "v"    # Z

    .line 129
    iget-object v0, p0, Lcom/pymcl/runtime/input/LauncherPrefs;->io:Lcom/pymcl/runtime/input/PrefIO;

    const-string v1, "sdl_auto_show_ime"

    invoke-interface {v0, v1, p1}, Lcom/pymcl/runtime/input/PrefIO;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final toggleSdlAutoShowIme()Z
    .locals 1

    .line 130
    invoke-virtual {p0}, Lcom/pymcl/runtime/input/LauncherPrefs;->getSdlAutoShowIme()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .local v0, "n":Z
    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->setSdlAutoShowIme(Z)V

    return v0
.end method
