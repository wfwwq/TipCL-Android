.class public abstract Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadModeLogic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PromptKey"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;,
        Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;,
        Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;,
        Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;",
        "",
        "<init>",
        "()V",
        "Select",
        "Confirm",
        "ToggleRemember",
        "Ignore",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;-><init>()V

    return-void
.end method
