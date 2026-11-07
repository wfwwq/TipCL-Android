.class public final Lcom/pymcl/runtime/input/GamepadModeLogic;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;,
        Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tJ\u001e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModeLogic;",
        "",
        "<init>",
        "()V",
        "route",
        "Lcom/pymcl/runtime/input/GamepadRoute;",
        "pref",
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        "sessionChoice",
        "Lcom/pymcl/runtime/input/GamepadSessionMode;",
        "sdlCapable",
        "",
        "sdlReady",
        "promptDefault",
        "prefAfterPrompt",
        "old",
        "chosen",
        "remember",
        "next",
        "p",
        "wantsHidApi",
        "KEYCODE_DPAD_UP",
        "",
        "KEYCODE_DPAD_DOWN",
        "KEYCODE_BUTTON_A",
        "KEYCODE_BUTTON_X",
        "KEYCODE_BUTTON_START",
        "promptKey",
        "Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;",
        "keyCode",
        "PromptKey",
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
.field public static final INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

.field public static final KEYCODE_BUTTON_A:I = 0x60

.field public static final KEYCODE_BUTTON_START:I = 0x6c

.field public static final KEYCODE_BUTTON_X:I = 0x63

.field public static final KEYCODE_DPAD_DOWN:I = 0x14

.field public static final KEYCODE_DPAD_UP:I = 0x13


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeLogic;

    invoke-direct {v0}, Lcom/pymcl/runtime/input/GamepadModeLogic;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final next(Lcom/pymcl/runtime/input/GamepadModePref;)Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 2
    .param p1, "p"    # Lcom/pymcl/runtime/input/GamepadModePref;

    const-string v0, "p"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadModePref;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 84
    :pswitch_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;

    goto :goto_0

    .line 83
    :pswitch_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->ASK:Lcom/pymcl/runtime/input/GamepadModePref;

    goto :goto_0

    .line 82
    :pswitch_2
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 85
    :goto_0
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final prefAfterPrompt(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;Z)Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 1
    .param p1, "old"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p2, "chosen"    # Lcom/pymcl/runtime/input/GamepadSessionMode;
    .param p3, "remember"    # Z

    const-string v0, "old"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chosen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    if-nez p3, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    if-ne p2, v0, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;

    :goto_0
    return-object v0
.end method

.method public final promptDefault(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;)Lcom/pymcl/runtime/input/GamepadSessionMode;
    .locals 1
    .param p1, "pref"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p2, "sessionChoice"    # Lcom/pymcl/runtime/input/GamepadSessionMode;

    const-string v0, "pref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    if-nez p2, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    return-object v0
.end method

.method public final promptKey(I)Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
    .locals 2
    .param p1, "keyCode"    # I

    .line 105
    sparse-switch p1, :sswitch_data_0

    .line 110
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    goto :goto_0

    .line 109
    :sswitch_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    goto :goto_0

    .line 108
    :sswitch_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    goto :goto_0

    .line 107
    :sswitch_2
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;

    sget-object v1, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;-><init>(Lcom/pymcl/runtime/input/GamepadSessionMode;)V

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    goto :goto_0

    .line 106
    :sswitch_3
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;

    sget-object v1, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;-><init>(Lcom/pymcl/runtime/input/GamepadSessionMode;)V

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    .line 111
    :goto_0
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_3
        0x14 -> :sswitch_2
        0x60 -> :sswitch_1
        0x63 -> :sswitch_0
        0x6c -> :sswitch_1
    .end sparse-switch
.end method

.method public final route(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;ZZ)Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 3
    .param p1, "pref"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p2, "sessionChoice"    # Lcom/pymcl/runtime/input/GamepadSessionMode;
    .param p3, "sdlCapable"    # Z
    .param p4, "sdlReady"    # Z

    const-string v0, "pref"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    if-nez p3, :cond_0

    if-nez p4, :cond_0

    sget-object v0, Lcom/pymcl/runtime/input/GamepadRoute;->MAPPING:Lcom/pymcl/runtime/input/GamepadRoute;

    return-object v0

    .line 61
    :cond_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadModePref;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 64
    :pswitch_0
    if-nez p2, :cond_1

    sget-object v0, Lcom/pymcl/runtime/input/GamepadRoute;->PROMPT:Lcom/pymcl/runtime/input/GamepadRoute;

    return-object v0

    :cond_1
    move-object v0, p2

    goto :goto_0

    .line 63
    :pswitch_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    goto :goto_0

    .line 62
    :pswitch_2
    sget-object v0, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    .line 61
    :goto_0
    nop

    .line 66
    .local v0, "mode":Lcom/pymcl/runtime/input/GamepadSessionMode;
    sget-object v1, Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadSessionMode;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_1

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 68
    :pswitch_3
    if-eqz p4, :cond_2

    sget-object v1, Lcom/pymcl/runtime/input/GamepadRoute;->DIRECT:Lcom/pymcl/runtime/input/GamepadRoute;

    goto :goto_1

    :cond_2
    sget-object v1, Lcom/pymcl/runtime/input/GamepadRoute;->SWALLOW:Lcom/pymcl/runtime/input/GamepadRoute;

    goto :goto_1

    .line 67
    :pswitch_4
    sget-object v1, Lcom/pymcl/runtime/input/GamepadRoute;->MAPPING:Lcom/pymcl/runtime/input/GamepadRoute;

    .line 66
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final wantsHidApi(Lcom/pymcl/runtime/input/GamepadRoute;)Z
    .locals 1
    .param p1, "route"    # Lcom/pymcl/runtime/input/GamepadRoute;

    const-string v0, "route"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    sget-object v0, Lcom/pymcl/runtime/input/GamepadRoute;->DIRECT:Lcom/pymcl/runtime/input/GamepadRoute;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
