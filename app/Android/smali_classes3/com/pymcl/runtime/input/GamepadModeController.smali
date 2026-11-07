.class public final Lcom/pymcl/runtime/input/GamepadModeController;
.super Ljava/lang/Object;
.source "SdlGamepad.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/GamepadModeController$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSdlGamepad.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdlGamepad.kt\ncom/pymcl/runtime/input/GamepadModeController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0006\u0010\u0016\u001a\u00020\u0008J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadModeController;",
        "",
        "activity",
        "Landroid/app/Activity;",
        "prefs",
        "Lcom/pymcl/runtime/input/LauncherPrefs;",
        "sdlCapable",
        "Lkotlin/Function0;",
        "",
        "onModeChanged",
        "",
        "<init>",
        "(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "value",
        "Lcom/pymcl/runtime/input/GamepadSessionMode;",
        "sessionChoice",
        "getSessionChoice",
        "()Lcom/pymcl/runtime/input/GamepadSessionMode;",
        "dialog",
        "Landroid/app/AlertDialog;",
        "lastPref",
        "Lcom/pymcl/runtime/input/GamepadModePref;",
        "onPrefChangedExternally",
        "route",
        "Lcom/pymcl/runtime/input/GamepadRoute;",
        "cyclePref",
        "menuLabel",
        "",
        "showPrompt",
        "dismiss",
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
.field private final activity:Landroid/app/Activity;

.field private dialog:Landroid/app/AlertDialog;

.field private lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

.field private final onModeChanged:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

.field private final sdlCapable:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;


# direct methods
.method public static synthetic $r8$lambda$HMwd0ARpKQr0C1inEWpHfbdofDo(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$lambda$8(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$jBngqmtPhPL-PVuuvxLtCoX4dsQ(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$lambda$7(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$n-vm9QfKf2hfy9Rs7VTqZa48LB4(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$lambda$6(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$sXHqvhc5eE5taSaNynnmFk-h7B0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/pymcl/runtime/input/GamepadModeController;->_init_$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;
    .param p2, "prefs"    # Lcom/pymcl/runtime/input/LauncherPrefs;
    .param p3, "sdlCapable"    # Lkotlin/jvm/functions/Function0;
    .param p4, "onModeChanged"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/pymcl/runtime/input/LauncherPrefs;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdlCapable"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onModeChanged"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    .line 120
    iput-object p2, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    .line 121
    iput-object p3, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sdlCapable:Lkotlin/jvm/functions/Function0;

    .line 123
    iput-object p4, p0, Lcom/pymcl/runtime/input/GamepadModeController;->onModeChanged:Lkotlin/jvm/functions/Function0;

    .line 128
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 118
    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 118
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 123
    new-instance p4, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda0;

    invoke-direct {p4}, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda0;-><init>()V

    .line 118
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/runtime/input/GamepadModeController;-><init>(Landroid/app/Activity;Lcom/pymcl/runtime/input/LauncherPrefs;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 124
    return-void
.end method

.method private static final _init_$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 123
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final showPrompt$confirm(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;)V
    .locals 5
    .param p0, "pref"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p1, "selected"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p2, "remember"    # Landroid/widget/CheckBox;
    .param p3, "this$0"    # Lcom/pymcl/runtime/input/GamepadModeController;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/input/GamepadModePref;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/pymcl/runtime/input/GamepadSessionMode;",
            ">;",
            "Landroid/widget/CheckBox;",
            "Lcom/pymcl/runtime/input/GamepadModeController;",
            ")V"
        }
    .end annotation

    .line 188
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/pymcl/runtime/input/GamepadModeLogic;->prefAfterPrompt(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;Z)Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    .line 189
    .local v0, "newPref":Lcom/pymcl/runtime/input/GamepadModePref;
    if-eq v0, p0, :cond_0

    iget-object v1, p3, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v1, v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->setGamepadMode(Lcom/pymcl/runtime/input/GamepadModePref;)V

    .line 190
    :cond_0
    iput-object v0, p3, Lcom/pymcl/runtime/input/GamepadModeController;->lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 191
    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/runtime/input/GamepadSessionMode;

    iput-object v1, p3, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    .line 192
    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v2, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    if-ne v1, v2, :cond_1

    sget-object v1, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    iget-object v2, p3, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/SdlHid;->requestBluetoothIfNeeded(Landroid/app/Activity;)V

    .line 193
    :cond_1
    iget-object v1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {p2}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "gamepad mode chosen="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " remember="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " pref="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "PyMCL-SDLPad"

    invoke-static {v2, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    iget-object v1, p3, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/app/AlertDialog;->dismiss()V

    :cond_2
    const/4 v1, 0x0

    iput-object v1, p3, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    .line 195
    iget-object v1, p3, Lcom/pymcl/runtime/input/GamepadModeController;->onModeChanged:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 196
    return-void
.end method

.method private static final showPrompt$lambda$6(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;I)V
    .locals 0
    .param p0, "$selected"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p1, "$rbSdl"    # Landroid/widget/RadioButton;
    .param p3, "id"    # I

    .line 186
    invoke-virtual {p1}, Landroid/widget/RadioButton;->getId()I

    move-result p2

    if-ne p3, p2, :cond_0

    sget-object p2, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    :goto_0
    iput-object p2, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    return-void
.end method

.method private static final showPrompt$lambda$7(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;I)V
    .locals 0
    .param p0, "$pref"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p1, "$selected"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p2, "$remember"    # Landroid/widget/CheckBox;
    .param p3, "this$0"    # Lcom/pymcl/runtime/input/GamepadModeController;

    .line 198
    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$confirm(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;)V

    return-void
.end method

.method private static final showPrompt$lambda$8(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p0, "$selected"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p1, "$remember"    # Landroid/widget/CheckBox;
    .param p2, "$group"    # Landroid/widget/RadioGroup;
    .param p3, "$rbSdl"    # Landroid/widget/RadioButton;
    .param p4, "$rbMap"    # Landroid/widget/RadioButton;
    .param p5, "$pref"    # Lcom/pymcl/runtime/input/GamepadModePref;
    .param p6, "this$0"    # Lcom/pymcl/runtime/input/GamepadModeController;
    .param p8, "keyCode"    # I
    .param p9, "ev"    # Landroid/view/KeyEvent;

    .line 202
    sget-object p7, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    invoke-virtual {p7, p8}, Lcom/pymcl/runtime/input/GamepadModeLogic;->promptKey(I)Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;

    move-result-object p7

    .line 203
    .local p7, "k":Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
    instance-of v0, p7, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p9}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    move-object v0, p7

    check-cast v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Select;->getMode()Lcom/pymcl/runtime/input/GamepadSessionMode;

    move-result-object v0

    iput-object v0, p0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {p2, p0, p3, p4}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$sync(Landroid/widget/RadioGroup;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V

    goto :goto_0

    .line 204
    :cond_0
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Confirm;

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p9}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_3

    invoke-static {p5, p0, p1, p6}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$confirm(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;)V

    goto :goto_0

    .line 205
    :cond_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$ToggleRemember;

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p9}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    .line 206
    :cond_2
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey$Ignore;

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    .line 207
    .end local p7    # "k":Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
    :cond_3
    :goto_0
    return v1

    .line 202
    .restart local p7    # "k":Lcom/pymcl/runtime/input/GamepadModeLogic$PromptKey;
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final showPrompt$sync(Landroid/widget/RadioGroup;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V
    .locals 2
    .param p0, "group"    # Landroid/widget/RadioGroup;
    .param p1, "selected"    # Lkotlin/jvm/internal/Ref$ObjectRef;
    .param p2, "rbSdl"    # Landroid/widget/RadioButton;
    .param p3, "rbMap"    # Landroid/widget/RadioButton;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RadioGroup;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Lcom/pymcl/runtime/input/GamepadSessionMode;",
            ">;",
            "Landroid/widget/RadioButton;",
            "Landroid/widget/RadioButton;",
            ")V"
        }
    .end annotation

    .line 184
    iget-object v0, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    sget-object v1, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    if-ne v0, v1, :cond_0

    invoke-virtual {p2}, Landroid/widget/RadioButton;->getId()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/widget/RadioButton;->getId()I

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/RadioGroup;->check(I)V

    return-void
.end method


# virtual methods
.method public final cyclePref()Lcom/pymcl/runtime/input/GamepadModePref;
    .locals 3

    .line 157
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/GamepadModeLogic;->next(Lcom/pymcl/runtime/input/GamepadModePref;)Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    .line 158
    .local v0, "n":Lcom/pymcl/runtime/input/GamepadModePref;
    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v1, v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->setGamepadMode(Lcom/pymcl/runtime/input/GamepadModePref;)V

    .line 159
    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 160
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    .line 161
    sget-object v1, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    if-ne v0, v1, :cond_0

    sget-object v1, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/SdlHid;->requestBluetoothIfNeeded(Landroid/app/Activity;)V

    .line 162
    :cond_0
    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->onModeChanged:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 163
    return-object v0
.end method

.method public final dismiss()V
    .locals 1

    .line 213
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    return-void
.end method

.method public final getSessionChoice()Lcom/pymcl/runtime/input/GamepadSessionMode;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    return-object v0
.end method

.method public final menuLabel()Ljava/lang/String;
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadModePref;->getLabel()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u624b\u67c4\u6a21\u5f0f\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onPrefChangedExternally()Z
    .locals 3

    .line 136
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    .line 137
    .local v0, "now":Lcom/pymcl/runtime/input/GamepadModePref;
    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

    if-ne v0, v1, :cond_0

    const/4 v1, 0x0

    return v1

    .line 138
    :cond_0
    iput-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->lastPref:Lcom/pymcl/runtime/input/GamepadModePref;

    .line 139
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    .line 140
    sget-object v1, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    if-ne v0, v1, :cond_1

    sget-object v1, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/SdlHid;->requestBluetoothIfNeeded(Landroid/app/Activity;)V

    .line 141
    :cond_1
    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->onModeChanged:Lkotlin/jvm/functions/Function0;

    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 142
    const/4 v1, 0x1

    return v1
.end method

.method public final route()Lcom/pymcl/runtime/input/GamepadRoute;
    .locals 5

    .line 146
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sdlCapable:Lkotlin/jvm/functions/Function0;

    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-static {}, Lcom/tungsten/fcl/game/sdl/SdlBridge;->getSdlEnabled()Z

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/pymcl/runtime/input/GamepadModeLogic;->route(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;ZZ)Lcom/pymcl/runtime/input/GamepadRoute;

    move-result-object v0

    .line 147
    .local v0, "r":Lcom/pymcl/runtime/input/GamepadRoute;
    sget-object v1, Lcom/pymcl/runtime/input/GamepadModeController$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadRoute;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 149
    :pswitch_0
    sget-object v1, Lcom/pymcl/runtime/input/SdlHid;->INSTANCE:Lcom/pymcl/runtime/input/SdlHid;

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/input/SdlHid;->ensureAcquired(Landroid/content/Context;)V

    goto :goto_0

    .line 148
    :pswitch_1
    invoke-virtual {p0}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt()V

    .line 152
    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final showPrompt()V
    .locals 14

    .line 169
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    return-void

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_2

    move-object v10, p0

    goto/16 :goto_2

    .line 171
    :cond_2
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->prefs:Lcom/pymcl/runtime/input/LauncherPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/LauncherPrefs;->getGamepadMode()Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v9

    .line 172
    .local v9, "pref":Lcom/pymcl/runtime/input/GamepadModePref;
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v4, "selected":Lkotlin/jvm/internal/Ref$ObjectRef;
    sget-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic;->INSTANCE:Lcom/pymcl/runtime/input/GamepadModeLogic;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-virtual {v0, v9, v3}, Lcom/pymcl/runtime/input/GamepadModeLogic;->promptDefault(Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadSessionMode;)Lcom/pymcl/runtime/input/GamepadSessionMode;

    move-result-object v0

    iput-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 173
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v11, v0, Landroid/util/DisplayMetrics;->density:F

    .line 174
    .local v11, "d":F
    const/16 v0, 0x10

    int-to-float v0, v0

    mul-float/2addr v0, v11

    float-to-int v12, v0

    .line 175
    .local v12, "pad":I
    new-instance v0, Landroid/widget/LinearLayout;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object v3, v0

    .line 216
    .local v3, "$this$showPrompt_u24lambda_u240":Landroid/widget/LinearLayout;
    const/4 v5, 0x0

    .line 175
    .local v5, "$i$a$-apply-GamepadModeController$showPrompt$root$1":I
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    div-int/lit8 v6, v12, 0x2

    invoke-virtual {v3, v12, v6, v12, v2}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .end local v3    # "$this$showPrompt_u24lambda_u240":Landroid/widget/LinearLayout;
    .end local v5    # "$i$a$-apply-GamepadModeController$showPrompt$root$1":I
    move-object v13, v0

    .line 176
    .local v13, "root":Landroid/widget/LinearLayout;
    new-instance v0, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object v3, v0

    .local v3, "$this$showPrompt_u24lambda_u241":Landroid/widget/TextView;
    const/4 v5, 0x0

    .line 177
    .local v5, "$i$a$-apply-GamepadModeController$showPrompt$1":I
    const-string v6, "\u68c0\u6d4b\u5230\u624b\u67c4\u3002\u8bf7\u9009\u62e9\u672c\u5b9e\u4f8b\u7684\u624b\u67c4\u8f93\u5165\u65b9\u5f0f\uff08\u5341\u5b57\u952e\u4e0a/\u4e0b\u9009\u62e9\uff0cA \u6216 Start \u786e\u8ba4\uff0cX \u5207\u6362\u300c\u8bb0\u4f4f\u300d\uff09\uff1a"

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    nop

    .line 176
    .end local v3    # "$this$showPrompt_u24lambda_u241":Landroid/widget/TextView;
    .end local v5    # "$i$a$-apply-GamepadModeController$showPrompt$1":I
    check-cast v0, Landroid/view/View;

    invoke-virtual {v13, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 179
    new-instance v8, Landroid/widget/RadioButton;

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v8, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    move-object v0, v8

    .line 216
    .local v0, "$this$showPrompt_u24lambda_u242":Landroid/widget/RadioButton;
    const/4 v3, 0x0

    .line 179
    .local v3, "$i$a$-apply-GamepadModeController$showPrompt$rbMap$1":I
    const v5, 0x7f0f0001

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setId(I)V

    const-string v5, "PyMCL \u6620\u5c04\u6a21\u5f0f\n\u6309\u300c\u624b\u67c4\u6620\u5c04\u300d\u628a\u6309\u952e\u8f6c\u6210\u952e\u76d8/\u9f20\u6807\uff0c\u6240\u6709\u7248\u672c\u53ef\u7528"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 180
    .end local v0    # "$this$showPrompt_u24lambda_u242":Landroid/widget/RadioButton;
    .end local v3    # "$i$a$-apply-GamepadModeController$showPrompt$rbMap$1":I
    .local v8, "rbMap":Landroid/widget/RadioButton;
    new-instance v7, Landroid/widget/RadioButton;

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v7, v0}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;)V

    move-object v0, v7

    .line 216
    .local v0, "$this$showPrompt_u24lambda_u243":Landroid/widget/RadioButton;
    const/4 v3, 0x0

    .line 180
    .local v3, "$i$a$-apply-GamepadModeController$showPrompt$rbSdl$1":I
    const v5, 0x7f0f0002

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setId(I)V

    const-string v5, "SDL \u76f4\u901a\u6a21\u5f0f\n\u539f\u59cb\u624b\u67c4\u4ea4\u7ed9\u6e38\u620f\uff08MC 26.3+ \u539f\u751f\u624b\u67c4 / Controlify\uff09\uff0c\u4e0d\u4f7f\u7528\u6620\u5c04"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .end local v0    # "$this$showPrompt_u24lambda_u243":Landroid/widget/RadioButton;
    .end local v3    # "$i$a$-apply-GamepadModeController$showPrompt$rbSdl$1":I
    .local v7, "rbSdl":Landroid/widget/RadioButton;
    new-instance v6, Landroid/widget/RadioGroup;

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v6, v0}, Landroid/widget/RadioGroup;-><init>(Landroid/content/Context;)V

    move-object v0, v6

    .line 216
    .local v0, "$this$showPrompt_u24lambda_u244":Landroid/widget/RadioGroup;
    const/4 v3, 0x0

    .line 181
    .local v3, "$i$a$-apply-GamepadModeController$showPrompt$group$1":I
    move-object v5, v8

    check-cast v5, Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    move-object v5, v7

    check-cast v5, Landroid/view/View;

    invoke-virtual {v0, v5}, Landroid/widget/RadioGroup;->addView(Landroid/view/View;)V

    .line 182
    .end local v0    # "$this$showPrompt_u24lambda_u244":Landroid/widget/RadioGroup;
    .end local v3    # "$i$a$-apply-GamepadModeController$showPrompt$group$1":I
    .local v6, "group":Landroid/widget/RadioGroup;
    new-instance v5, Landroid/widget/CheckBox;

    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v0, Landroid/content/Context;

    invoke-direct {v5, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    move-object v0, v5

    .line 216
    .local v0, "$this$showPrompt_u24lambda_u245":Landroid/widget/CheckBox;
    const/4 v3, 0x0

    .line 182
    .local v3, "$i$a$-apply-GamepadModeController$showPrompt$remember$1":I
    const-string v10, "\u8bb0\u4f4f\u9009\u62e9\uff08\u53ef\u5728\u6e38\u620f\u83dc\u5355\u6216\u542f\u52a8\u5668\u8bbe\u7f6e\u4e2d\u66f4\u6539\uff09"

    check-cast v10, Ljava/lang/CharSequence;

    invoke-virtual {v0, v10}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 183
    .end local v0    # "$this$showPrompt_u24lambda_u245":Landroid/widget/CheckBox;
    .end local v3    # "$i$a$-apply-GamepadModeController$showPrompt$remember$1":I
    .local v5, "remember":Landroid/widget/CheckBox;
    move-object v0, v6

    check-cast v0, Landroid/view/View;

    invoke-virtual {v13, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    move-object v0, v5

    check-cast v0, Landroid/view/View;

    invoke-virtual {v13, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 185
    invoke-static {v6, v4, v7, v8}, Lcom/pymcl/runtime/input/GamepadModeController;->showPrompt$sync(Landroid/widget/RadioGroup;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;Landroid/widget/RadioButton;)V

    .line 186
    new-instance v0, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda1;

    invoke-direct {v0, v4, v7}, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/RadioButton;)V

    invoke-virtual {v6, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 197
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadModeController;->activity:Landroid/app/Activity;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v1, "\u624b\u67c4\u8f93\u5165\u6a21\u5f0f"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    move-object v1, v13

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 198
    const-string v1, "\u786e\u5b9a"

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v3, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;

    invoke-direct {v3, v9, v4, v5, p0}, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/runtime/input/GamepadModePref;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Lcom/pymcl/runtime/input/GamepadModeController;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 197
    move-object v1, v0

    .line 199
    .local v1, "dlg":Landroid/app/AlertDialog;
    invoke-virtual {v1, v2}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 201
    new-instance v3, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;

    move-object v10, p0

    invoke-direct/range {v3 .. v10}, Lcom/pymcl/runtime/input/GamepadModeController$$ExternalSyntheticLambda3;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/widget/CheckBox;Landroid/widget/RadioGroup;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Lcom/pymcl/runtime/input/GamepadModePref;Lcom/pymcl/runtime/input/GamepadModeController;)V

    invoke-virtual {v1, v3}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 209
    iput-object v1, v10, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    .line 210
    :try_start_0
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v2, "PyMCL-SDLPad"

    const-string v3, "prompt show"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v2, 0x0

    iput-object v2, v10, Lcom/pymcl/runtime/input/GamepadModeController;->dialog:Landroid/app/AlertDialog;

    sget-object v2, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    iput-object v2, v10, Lcom/pymcl/runtime/input/GamepadModeController;->sessionChoice:Lcom/pymcl/runtime/input/GamepadSessionMode;

    .line 211
    .end local v0    # "t":Ljava/lang/Throwable;
    :goto_1
    return-void

    .line 170
    .end local v1    # "dlg":Landroid/app/AlertDialog;
    .end local v4    # "selected":Lkotlin/jvm/internal/Ref$ObjectRef;
    .end local v5    # "remember":Landroid/widget/CheckBox;
    .end local v6    # "group":Landroid/widget/RadioGroup;
    .end local v7    # "rbSdl":Landroid/widget/RadioButton;
    .end local v8    # "rbMap":Landroid/widget/RadioButton;
    .end local v9    # "pref":Lcom/pymcl/runtime/input/GamepadModePref;
    .end local v11    # "d":F
    .end local v12    # "pad":I
    .end local v13    # "root":Landroid/widget/LinearLayout;
    :cond_3
    move-object v10, p0

    :goto_2
    return-void
.end method
