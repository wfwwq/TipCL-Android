.class public final Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;
.super Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Confirm"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 93
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
