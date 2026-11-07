.class public final Lcom/pymcl/runtime/input/LauncherPrefKeys;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/LauncherPrefKeys;",
        "",
        "<init>",
        "()V",
        "PREFS_NAME",
        "",
        "SDL_AUTO_SHOW_IME",
        "SDL_AUTO_SHOW_IME_DEFAULT",
        "",
        "GAMEPAD_MODE",
        "GAMEPAD_MODE_DEFAULT",
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


# static fields
.field public static final GAMEPAD_MODE:Ljava/lang/String; = "gamepad_mode"

.field public static final GAMEPAD_MODE_DEFAULT:Ljava/lang/String; = "ask"

.field public static final INSTANCE:Lcom/pymcl/runtime/input/LauncherPrefKeys;

.field public static final PREFS_NAME:Ljava/lang/String; = "launcher"

.field public static final SDL_AUTO_SHOW_IME:Ljava/lang/String; = "sdl_auto_show_ime"

.field public static final SDL_AUTO_SHOW_IME_DEFAULT:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/LauncherPrefKeys;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/LauncherPrefKeys;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/LauncherPrefKeys;->INSTANCE:Lcom/pymcl/runtime/input/LauncherPrefKeys;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
