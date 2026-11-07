.class public final Lcom/pymcl/runtime/control/ControlOverlay;
.super Landroid/view/ViewGroup;
.source "ControlOverlay.kt"

# interfaces
.implements Lcom/pymcl/runtime/control/ControlHost;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/control/ControlOverlay$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlOverlay.kt\ncom/pymcl/runtime/control/ControlOverlay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n88#1,2:150\n88#1,2:152\n88#1,2:154\n88#1,2:156\n88#1,2:160\n2068#2,2:158\n1739#2:163\n1814#2,3:164\n777#2:167\n873#2,2:168\n832#2:170\n862#2,2:171\n777#2:173\n873#2,2:174\n1#3:162\n*S KotlinDebug\n*F\n+ 1 ControlOverlay.kt\ncom/pymcl/runtime/control/ControlOverlay\n*L\n65#1:150,2\n66#1:152,2\n70#1:154,2\n75#1:156,2\n82#1:160,2\n77#1:158,2\n136#1:163\n136#1:164,3\n136#1:167\n136#1:168,2\n137#1:170\n137#1:171,2\n139#1:173\n139#1:174,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0001KB;\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020(J\u000e\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0018J\u000e\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u000eJ\u0010\u0010.\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020/H\u0002J\u0008\u00100\u001a\u00020\u000eH\u0002J\u0008\u00101\u001a\u00020\u000eH\u0002J\u001d\u00102\u001a\u00020\u000e2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000e0\u000cH\u0082\u0008J\u0018\u00104\u001a\u00020\u000e2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206H\u0014J0\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u0002062\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u0002062\u0006\u0010=\u001a\u000206H\u0014J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\rH\u0016J\u0008\u0010@\u001a\u00020AH\u0016J\u0008\u0010B\u001a\u00020CH\u0016J\u0010\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u001eH\u0016J\u0010\u0010F\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u001eH\u0016J\u0010\u0010G\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u001eH\u0002J\u0010\u0010I\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020(H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0018@RX\u0096\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00ca\u0001\u0010\u0008M\u0012\u000c\u0008\u0013\u0012\u0008\u0008\u000cJ\u0004\u0008\u0008(N\u00a8\u0006L"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ControlOverlay;",
        "Landroid/view/ViewGroup;",
        "Lcom/pymcl/runtime/control/ControlHost;",
        "context",
        "Landroid/content/Context;",
        "sink",
        "Lcom/pymcl/runtime/input/InputSink;",
        "store",
        "Lcom/pymcl/runtime/control/ControlLayoutStore;",
        "settings",
        "Lcom/pymcl/runtime/input/InputSettings;",
        "actionHandler",
        "Lkotlin/Function1;",
        "Lcom/pymcl/runtime/input/Keys$Action;",
        "",
        "<init>",
        "(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/control/ControlLayoutStore;Lcom/pymcl/runtime/input/InputSettings;Lkotlin/jvm/functions/Function1;)V",
        "getSink",
        "()Lcom/pymcl/runtime/input/InputSink;",
        "value",
        "Lcom/pymcl/runtime/control/ControlLayout;",
        "layout",
        "getLayout",
        "()Lcom/pymcl/runtime/control/ControlLayout;",
        "",
        "editing",
        "getEditing",
        "()Z",
        "grabbed",
        "selectedView",
        "Lcom/pymcl/runtime/control/ControlElementView;",
        "editBar",
        "Landroid/widget/LinearLayout;",
        "onLayoutChanged",
        "getOnLayoutChanged",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnLayoutChanged",
        "(Lkotlin/jvm/functions/Function1;)V",
        "loadLayout",
        "name",
        "",
        "setGrabbed",
        "g",
        "setEditing",
        "e",
        "releaseAll",
        "add",
        "Lcom/pymcl/runtime/control/ControlElement;",
        "rebuild",
        "refreshVisibility",
        "forEachElement",
        "f",
        "onMeasure",
        "wSpec",
        "",
        "hSpec",
        "onLayout",
        "changed",
        "l",
        "t",
        "r",
        "b",
        "onAction",
        "action",
        "lookSensitivity",
        "",
        "longPressMs",
        "",
        "onElementEdited",
        "view",
        "onElementSelected",
        "editProperties",
        "v",
        "toast",
        "s",
        "Companion",
        "PyMCL-Android:runtime_debug",
        "Landroid/annotation/SuppressLint;",
        "ViewConstructor"
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
.field public static final Companion:Lcom/pymcl/runtime/control/ControlOverlay$Companion;

.field private static final MATCH:Landroid/widget/FrameLayout$LayoutParams;


# instance fields
.field private final actionHandler:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final editBar:Landroid/widget/LinearLayout;

.field private editing:Z

.field private grabbed:Z

.field private layout:Lcom/pymcl/runtime/control/ControlLayout;

.field private onLayoutChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/control/ControlLayout;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private selectedView:Lcom/pymcl/runtime/control/ControlElementView;

.field private final settings:Lcom/pymcl/runtime/input/InputSettings;

.field private final sink:Lcom/pymcl/runtime/input/InputSink;

.field private final store:Lcom/pymcl/runtime/control/ControlLayoutStore;


# direct methods
.method public static synthetic $r8$lambda$5cLauEkVl9osZjskxOQhf2maZ24(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$7(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Bp_nA3oXTMXhN6tgEvKeaU5Fh24(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$6(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LuFUeE4VzvpBFQrQL5Lv6bk9uko(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$9(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ObYsSRUK_EhXSVQnxy9y5wsto8k(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$3(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$R96T2287QuVXLm7wOBck6u3JwI4(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$8(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$U4d6byLvUdkSPWqE80bj7nRgKf0(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$5(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Ukg-NGcxNeCnVABpVybJguxFoB4(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$4(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$a5Dj05NuB9oTnXqGDAJpA88Cu2o(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/control/ControlOverlay;->btn$lambda$0$0(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic $r8$lambda$kbQrTgmzgEvSyIVLqa7bhAzAdeQ(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$2(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$p3uDlubgPvgnIIvzN3NuWid4bXI(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/pymcl/runtime/control/ControlOverlay;->editProperties$lambda$6(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic $r8$lambda$wbUXOmmfy87-Q3LbtFp8xvfSHj4(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$lambda$1(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/control/ControlOverlay;->Companion:Lcom/pymcl/runtime/control/ControlOverlay$Companion;

    .line 147
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    sput-object v0, Lcom/pymcl/runtime/control/ControlOverlay;->MATCH:Landroid/widget/FrameLayout$LayoutParams;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/pymcl/runtime/input/InputSink;Lcom/pymcl/runtime/control/ControlLayoutStore;Lcom/pymcl/runtime/input/InputSettings;Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "sink"    # Lcom/pymcl/runtime/input/InputSink;
    .param p3, "store"    # Lcom/pymcl/runtime/control/ControlLayoutStore;
    .param p4, "settings"    # Lcom/pymcl/runtime/input/InputSettings;
    .param p5, "actionHandler"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/pymcl/runtime/input/InputSink;",
            "Lcom/pymcl/runtime/control/ControlLayoutStore;",
            "Lcom/pymcl/runtime/input/InputSettings;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/input/Keys$Action;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "store"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    nop

    .line 32
    nop

    .line 25
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 28
    iput-object p2, p0, Lcom/pymcl/runtime/control/ControlOverlay;->sink:Lcom/pymcl/runtime/input/InputSink;

    .line 29
    iput-object p3, p0, Lcom/pymcl/runtime/control/ControlOverlay;->store:Lcom/pymcl/runtime/control/ControlLayoutStore;

    .line 30
    iput-object p4, p0, Lcom/pymcl/runtime/control/ControlOverlay;->settings:Lcom/pymcl/runtime/input/InputSettings;

    .line 31
    iput-object p5, p0, Lcom/pymcl/runtime/control/ControlOverlay;->actionHandler:Lkotlin/jvm/functions/Function1;

    .line 33
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->store:Lcom/pymcl/runtime/control/ControlLayoutStore;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/InputSettings;->getLayoutName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->load(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    .line 35
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->grabbed:Z

    .line 37
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    .local v1, "$this$editBar_u24lambda_u240":Landroid/widget/LinearLayout;
    const/4 v2, 0x0

    .line 38
    .local v2, "$i$a$-apply-ControlOverlay$editBar$1":I
    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0xc8

    invoke-static {v4, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    const/16 v3, 0x11

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 39
    nop

    .line 37
    .end local v1    # "$this$editBar_u24lambda_u240":Landroid/widget/LinearLayout;
    .end local v2    # "$i$a$-apply-ControlOverlay$editBar$1":I
    iput-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    .line 42
    nop

    .line 44
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda2;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "+\u6309\u94ae"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 45
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "+\u5341\u5b57\u952e"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 46
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda4;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda4;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "+\u6447\u6746"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 47
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda5;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda5;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "+\u89c6\u89d2\u533a"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 48
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda6;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda6;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "\u5c5e\u6027"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 49
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda7;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda7;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "\u5220\u9664"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 50
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda8;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda8;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "\u91cd\u7f6e"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 51
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda9;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda9;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "\u4fdd\u5b58"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 52
    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda10;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda10;-><init>(Lcom/pymcl/runtime/control/ControlOverlay;)V

    const-string v1, "\u5b8c\u6210"

    invoke-static {p0, p1, v1, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->_init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 53
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    check-cast v0, Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->addView(Landroid/view/View;)V

    .line 54
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 55
    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    .line 56
    nop

    .line 26
    return-void
.end method

.method private static final _init_$btn(Lcom/pymcl/runtime/control/ControlOverlay;Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 5
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;
    .param p1, "$context"    # Landroid/content/Context;
    .param p2, "t"    # Ljava/lang/String;
    .param p3, "f"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/runtime/control/ControlOverlay;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 162
    move-object v2, v1

    .local v2, "$this$btn_u24lambda_u240":Landroid/widget/Button;
    const/4 v3, 0x0

    .line 43
    .local v3, "$i$a$-apply-ControlOverlay$btn$1":I
    move-object v4, p2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setTextSize(F)V

    new-instance v4, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda1;

    invoke-direct {v4, p3}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {v2, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .end local v2    # "$this$btn_u24lambda_u240":Landroid/widget/Button;
    .end local v3    # "$i$a$-apply-ControlOverlay$btn$1":I
    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method private static final _init_$lambda$1(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 17
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 44
    new-instance v0, Lcom/pymcl/runtime/control/ControlElement;

    sget-object v2, Lcom/pymcl/runtime/control/ElementType;->BUTTON:Lcom/pymcl/runtime/control/ElementType;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "KEY_SPACE"

    aput-object v4, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v15, 0x3f61

    const/16 v16, 0x0

    const/4 v1, 0x0

    const-string v3, "\u65b0"

    const v4, 0x3ee66666    # 0.45f

    const v5, 0x3ee66666    # 0.45f

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->add(Lcom/pymcl/runtime/control/ControlElement;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private static final _init_$lambda$2(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 17
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 45
    new-instance v0, Lcom/pymcl/runtime/control/ControlElement;

    sget-object v2, Lcom/pymcl/runtime/control/ElementType;->DPAD:Lcom/pymcl/runtime/control/ElementType;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "KEY_W"

    aput-object v4, v1, v3

    const/4 v3, 0x1

    const-string v4, "KEY_S"

    aput-object v4, v1, v3

    const/4 v3, 0x2

    const-string v4, "KEY_A"

    aput-object v4, v1, v3

    const/4 v3, 0x3

    const-string v4, "KEY_D"

    aput-object v4, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v15, 0x3f05

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3ecccccd    # 0.4f

    const v6, 0x3e4ccccd    # 0.2f

    const v7, 0x3eb33333    # 0.35f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->add(Lcom/pymcl/runtime/control/ControlElement;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private static final _init_$lambda$3(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 17
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 46
    new-instance v0, Lcom/pymcl/runtime/control/ControlElement;

    sget-object v2, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "KEY_W"

    aput-object v4, v1, v3

    const/4 v3, 0x1

    const-string v4, "KEY_S"

    aput-object v4, v1, v3

    const/4 v3, 0x2

    const-string v4, "KEY_A"

    aput-object v4, v1, v3

    const/4 v3, 0x3

    const-string v4, "KEY_D"

    aput-object v4, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v15, 0x2f05

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const v4, 0x3ecccccd    # 0.4f

    const v5, 0x3ecccccd    # 0.4f

    const v6, 0x3e4ccccd    # 0.2f

    const v7, 0x3eb33333    # 0.35f

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "KEY_LEFTCTRL"

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->add(Lcom/pymcl/runtime/control/ControlElement;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private static final _init_$lambda$4(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 17
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 47
    new-instance v0, Lcom/pymcl/runtime/control/ControlElement;

    sget-object v2, Lcom/pymcl/runtime/control/ElementType;->LOOK_AREA:Lcom/pymcl/runtime/control/ElementType;

    const/16 v15, 0x3d85

    const/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const v5, 0x3e99999a    # 0.3f

    const v6, 0x3e99999a    # 0.3f

    const v7, 0x3ecccccd    # 0.4f

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, 0x3e99999a    # 0.3f

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lcom/pymcl/runtime/control/ControlElement;-><init>(Ljava/lang/String;Lcom/pymcl/runtime/control/ElementType;Ljava/lang/String;FFFFLjava/util/List;ZFFLjava/lang/Boolean;Ljava/lang/String;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v0

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->add(Lcom/pymcl/runtime/control/ControlElement;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private static final _init_$lambda$5(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 48
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v0, :cond_0

    .line 162
    .local v0, "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v1, 0x0

    .line 48
    .local v1, "$i$a$-let-ControlOverlay$5$1":I
    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->editProperties(Lcom/pymcl/runtime/control/ControlElementView;)V

    .end local v0    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v1    # "$i$a$-let-ControlOverlay$5$1":I
    goto :goto_0

    :cond_0
    const-string v0, "\u5148\u70b9\u9009\u4e00\u4e2a\u6309\u952e"

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->toast(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$6(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v0, :cond_0

    .line 162
    .local v0, "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v1, 0x0

    .line 49
    .local v1, "$i$a$-let-ControlOverlay$6$1":I
    iget-object v2, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v2}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    .end local v0    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v1    # "$i$a$-let-ControlOverlay$6$1":I
    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$7(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 4
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 50
    sget-object v0, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DefaultLayouts;->getBuiltins()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function0;

    if-nez v0, :cond_0

    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$7$1;

    sget-object v1, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay$7$1;-><init>(Ljava/lang/Object;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    :cond_0
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/control/ControlLayout;

    .line 162
    move-object v1, v0

    .local v1, "it":Lcom/pymcl/runtime/control/ControlLayout;
    const/4 v2, 0x0

    .line 50
    .local v2, "$i$a$-also-ControlOverlay$7$2":I
    iget-object v3, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/pymcl/runtime/control/ControlLayout;->setName(Ljava/lang/String;)V

    .end local v1    # "it":Lcom/pymcl/runtime/control/ControlLayout;
    .end local v2    # "$i$a$-also-ControlOverlay$7$2":I
    iput-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$8(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 51
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->store:Lcom/pymcl/runtime/control/ControlLayoutStore;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->save(Lcom/pymcl/runtime/control/ControlLayout;)V

    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u4fdd\u5b58\u5e03\u5c40 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->toast(Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final _init_$lambda$9(Lcom/pymcl/runtime/control/ControlOverlay;)Lkotlin/Unit;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;

    .line 52
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->store:Lcom/pymcl/runtime/control/ControlLayoutStore;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->save(Lcom/pymcl/runtime/control/ControlLayout;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->setEditing(Z)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static final synthetic access$getMATCH$cp()Landroid/widget/FrameLayout$LayoutParams;
    .locals 1

    .line 25
    sget-object v0, Lcom/pymcl/runtime/control/ControlOverlay;->MATCH:Landroid/widget/FrameLayout$LayoutParams;

    return-object v0
.end method

.method private final add(Lcom/pymcl/runtime/control/ControlElement;)V
    .locals 1
    .param p1, "e"    # Lcom/pymcl/runtime/control/ControlElement;

    .line 72
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    return-void
.end method

.method private static final btn$lambda$0$0(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V
    .locals 0
    .param p0, "$f"    # Lkotlin/jvm/functions/Function0;
    .param p1, "it"    # Landroid/view/View;

    .line 43
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private final editProperties(Lcom/pymcl/runtime/control/ControlElementView;)V
    .locals 17
    .param p1, "v"    # Lcom/pymcl/runtime/control/ControlElementView;

    .line 124
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v3

    .line 125
    .local v3, "e":Lcom/pymcl/runtime/control/ControlElement;
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move-object v1, v0

    .line 162
    .local v1, "$this$editProperties_u24lambda_u240":Landroid/widget/LinearLayout;
    const/4 v2, 0x0

    .line 125
    .local v2, "$i$a$-apply-ControlOverlay$editProperties$box$1":I
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x14

    const/4 v5, 0x0

    const/16 v6, 0x28

    invoke-virtual {v1, v6, v4, v6, v5}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    .end local v1    # "$this$editProperties_u24lambda_u240":Landroid/widget/LinearLayout;
    .end local v2    # "$i$a$-apply-ControlOverlay$editProperties$box$1":I
    move-object v7, v0

    .line 126
    .local v7, "box":Landroid/widget/LinearLayout;
    new-instance v4, Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v4, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    move-object v0, v4

    .line 162
    .local v0, "$this$editProperties_u24lambda_u241":Landroid/widget/EditText;
    const/4 v1, 0x0

    .line 126
    .local v1, "$i$a$-apply-ControlOverlay$editProperties$text$1":I
    const-string v2, "\u663e\u793a\u6587\u5b57"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getText()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .end local v0    # "$this$editProperties_u24lambda_u241":Landroid/widget/EditText;
    .end local v1    # "$i$a$-apply-ControlOverlay$editProperties$text$1":I
    .local v4, "text":Landroid/widget/EditText;
    new-instance v1, Landroid/widget/EditText;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    move-object v0, v1

    .local v0, "$this$editProperties_u24lambda_u242":Landroid/widget/EditText;
    const/4 v2, 0x0

    .line 128
    .local v2, "$i$a$-apply-ControlOverlay$editProperties$keys$1":I
    const-string v5, "\u952e\u540d\uff0c\u9017\u53f7\u5206\u9694\uff08KEY_W, MOUSE_LEFT, @ime \u2026\uff09"

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getKeys()Ljava/util/List;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljava/lang/Iterable;

    const-string v5, ", "

    move-object v9, v5

    check-cast v9, Ljava/lang/CharSequence;

    const/16 v15, 0x3e

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v8 .. v16}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 129
    const/16 v5, 0x1001

    invoke-virtual {v0, v5}, Landroid/widget/EditText;->setInputType(I)V

    .line 130
    nop

    .line 127
    .end local v0    # "$this$editProperties_u24lambda_u242":Landroid/widget/EditText;
    .end local v2    # "$i$a$-apply-ControlOverlay$editProperties$keys$1":I
    nop

    .line 131
    .local v1, "keys":Landroid/widget/EditText;
    new-instance v5, Landroid/widget/CheckBox;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v5, v0}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    move-object v0, v5

    .line 162
    .local v0, "$this$editProperties_u24lambda_u243":Landroid/widget/CheckBox;
    const/4 v2, 0x0

    .line 131
    .local v2, "$i$a$-apply-ControlOverlay$editProperties$toggle$1":I
    const-string v6, "\u5207\u6362\u6a21\u5f0f\uff08\u70b9\u4e00\u4e0b\u6309\u4f4f\uff0c\u518d\u70b9\u677e\u5f00\uff09"

    check-cast v6, Ljava/lang/CharSequence;

    invoke-virtual {v0, v6}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getToggle()Z

    move-result v6

    invoke-virtual {v0, v6}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 132
    .end local v0    # "$this$editProperties_u24lambda_u243":Landroid/widget/CheckBox;
    .end local v2    # "$i$a$-apply-ControlOverlay$editProperties$toggle$1":I
    .local v5, "toggle":Landroid/widget/CheckBox;
    new-instance v6, Landroid/widget/SeekBar;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v6, v0}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    move-object v0, v6

    .line 162
    .local v0, "$this$editProperties_u24lambda_u244":Landroid/widget/SeekBar;
    const/4 v2, 0x0

    .line 132
    .local v2, "$i$a$-apply-ControlOverlay$editProperties$alphaBar$1":I
    const/16 v8, 0x64

    invoke-virtual {v0, v8}, Landroid/widget/SeekBar;->setMax(I)V

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlElement;->getAlpha()F

    move-result v9

    int-to-float v8, v8

    mul-float/2addr v9, v8

    float-to-int v8, v9

    invoke-virtual {v0, v8}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 133
    .end local v0    # "$this$editProperties_u24lambda_u244":Landroid/widget/SeekBar;
    .end local v2    # "$i$a$-apply-ControlOverlay$editProperties$alphaBar$1":I
    .local v6, "alphaBar":Landroid/widget/SeekBar;
    move-object v0, v4

    check-cast v0, Landroid/view/View;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    move-object v0, v1

    check-cast v0, Landroid/view/View;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    move-object v0, v5

    check-cast v0, Landroid/view/View;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 162
    move-object v2, v0

    .local v2, "$this$editProperties_u24lambda_u245":Landroid/widget/TextView;
    const/4 v8, 0x0

    .line 133
    .local v8, "$i$a$-apply-ControlOverlay$editProperties$1":I
    const-string v9, "\u4e0d\u900f\u660e\u5ea6"

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .end local v2    # "$this$editProperties_u24lambda_u245":Landroid/widget/TextView;
    .end local v8    # "$i$a$-apply-ControlOverlay$editProperties$1":I
    check-cast v0, Landroid/view/View;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    move-object v0, v6

    check-cast v0, Landroid/view/View;

    invoke-virtual {v7, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 134
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v2, "\u6309\u952e\u5c5e\u6027"

    check-cast v2, Ljava/lang/CharSequence;

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    move-object v2, v7

    check-cast v2, Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v8

    .line 135
    const-string v0, "\u786e\u5b9a"

    move-object v9, v0

    check-cast v9, Ljava/lang/CharSequence;

    new-instance v0, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/runtime/control/ControlOverlay$$ExternalSyntheticLambda0;-><init>(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;)V

    invoke-virtual {v8, v9, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 142
    const-string v2, "\u53d6\u6d88"

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v8, 0x0

    invoke-virtual {v0, v2, v8}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 143
    return-void
.end method

.method private static final editProperties$lambda$6(Landroid/widget/EditText;Lcom/pymcl/runtime/control/ControlOverlay;Lcom/pymcl/runtime/control/ControlElement;Landroid/widget/EditText;Landroid/widget/CheckBox;Landroid/widget/SeekBar;Landroid/content/DialogInterface;I)V
    .locals 14
    .param p0, "$keys"    # Landroid/widget/EditText;
    .param p1, "this$0"    # Lcom/pymcl/runtime/control/ControlOverlay;
    .param p2, "$e"    # Lcom/pymcl/runtime/control/ControlElement;
    .param p3, "$text"    # Landroid/widget/EditText;
    .param p4, "$toggle"    # Landroid/widget/CheckBox;
    .param p5, "$alphaBar"    # Landroid/widget/SeekBar;

    .line 136
    move-object/from16 v0, p2

    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    const-string v2, "getText(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    new-array v4, v1, [C

    const/4 v2, 0x0

    const/16 v5, 0x2c

    aput-char v5, v4, v2

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .local v3, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 163
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v3

    .local v6, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 164
    .local v7, "$i$f$mapTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 165
    .local v9, "item$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 136
    .local v11, "$i$a$-map-ControlOverlay$editProperties$2$parsed$1":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v12}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v12

    .line 165
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-map-ControlOverlay$editProperties$2$parsed$1":I
    invoke-interface {v5, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 166
    .end local v9    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo":I
    check-cast v5, Ljava/util/List;

    .line 163
    nop

    .end local v3    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$map":I
    check-cast v5, Ljava/lang/Iterable;

    .line 136
    nop

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 167
    .local v3, "$i$f$filter":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v5

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 168
    .local v7, "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_1
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .restart local v10    # "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 136
    .local v11, "$i$a$-filter-ControlOverlay$editProperties$2$parsed$2":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-lez v12, :cond_2

    move v12, v1

    goto :goto_2

    :cond_2
    move v12, v2

    .line 168
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-filter-ControlOverlay$editProperties$2$parsed$2":I
    :goto_2
    if-eqz v12, :cond_1

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 169
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 167
    nop

    .line 136
    .end local v3    # "$i$f$filter":I
    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .line 137
    .local v1, "parsed":Ljava/util/List;
    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filterNot$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 170
    .local v3, "$i$f$filterNot":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .restart local v4    # "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$filterNotTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 171
    .local v6, "$i$f$filterNotTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it":Ljava/lang/String;
    const/4 v10, 0x0

    .line 137
    .local v10, "$i$a$-filterNot-ControlOverlay$editProperties$2$bad$1":I
    sget-object v11, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v11, v9}, Lcom/pymcl/runtime/input/Keys;->isValid(Ljava/lang/String;)Z

    move-result v9

    .line 171
    .end local v9    # "it":Ljava/lang/String;
    .end local v10    # "$i$a$-filterNot-ControlOverlay$editProperties$2$bad$1":I
    if-nez v9, :cond_4

    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 172
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterNotTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterNotTo":I
    check-cast v4, Ljava/util/List;

    .line 170
    nop

    .line 137
    .end local v2    # "$this$filterNot$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filterNot":I
    nop

    .line 138
    .local v4, "bad":Ljava/util/List;
    move-object v2, v4

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6

    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    const/16 v12, 0x3f

    const/4 v13, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5df2\u5ffd\u7565\u65e0\u6548\u952e\u540d\uff1a"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p1, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->toast(Ljava/lang/String;)V

    .line 139
    :cond_6
    invoke-virtual/range {p3 .. p3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlElement;->setText(Ljava/lang/String;)V

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 173
    .local v3, "$i$f$filter":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v6, v2

    .local v6, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 174
    .restart local v7    # "$i$f$filterTo":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_7
    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/lang/String;

    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 139
    .local v11, "$i$a$-filter-ControlOverlay$editProperties$2$1":I
    sget-object v12, Lcom/pymcl/runtime/input/Keys;->INSTANCE:Lcom/pymcl/runtime/input/Keys;

    invoke-virtual {v12, v10}, Lcom/pymcl/runtime/input/Keys;->isValid(Ljava/lang/String;)Z

    move-result v10

    .line 174
    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-filter-ControlOverlay$editProperties$2$1":I
    if-eqz v10, :cond_7

    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 175
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    :cond_8
    nop

    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v6    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filterTo":I
    check-cast v5, Ljava/util/List;

    .line 173
    nop

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    check-cast v5, Ljava/util/Collection;

    .line 139
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlElement;->setKeys(Ljava/util/List;)V

    .line 140
    invoke-virtual/range {p4 .. p4}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlElement;->setToggle(Z)V

    invoke-virtual/range {p5 .. p5}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    div-float/2addr v2, v3

    const v3, 0x3d4ccccd    # 0.05f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v2, v3, v5}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlElement;->setAlpha(F)V

    .line 141
    invoke-direct {p1}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    .line 142
    return-void
.end method

.method private final forEachElement(Lkotlin/jvm/functions/Function1;)V
    .locals 5
    .param p1, "f"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/control/ControlElementView;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 88
    .local v0, "$i$f$forEachElement":I
    const/4 v1, 0x0

    .local v1, "i":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_2

    invoke-virtual {p0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v4, :cond_0

    check-cast v3, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_1

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 89
    .end local v1    # "i":I
    :cond_2
    return-void
.end method

.method private final rebuild()V
    .locals 9

    .line 75
    move-object v0, p0

    .local v0, "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    const/4 v1, 0x0

    .line 156
    .local v1, "$i$f$forEachElement":I
    const/4 v2, 0x0

    .local v2, "i$iv":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v3

    :goto_0
    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v6, :cond_0

    move-object v4, v5

    check-cast v4, Lcom/pymcl/runtime/control/ControlElementView;

    :cond_0
    if-eqz v4, :cond_1

    .local v4, "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v5, 0x0

    .line 75
    .local v5, "$i$a$-forEachElement-ControlOverlay$rebuild$1":I
    invoke-virtual {v4}, Lcom/pymcl/runtime/control/ControlElementView;->releaseAll()V

    .line 156
    .end local v4    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v5    # "$i$a$-forEachElement-ControlOverlay$rebuild$1":I
    nop

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 157
    .end local v2    # "i$iv":I
    :cond_2
    nop

    .line 76
    .end local v0    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    .end local v1    # "$i$f$forEachElement":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .local v0, "i":I
    :goto_1
    const/4 v1, -0x1

    if-ge v1, v0, :cond_4

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    if-eq v1, v2, :cond_3

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->removeViewAt(I)V

    :cond_3
    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    .line 77
    .end local v0    # "i":I
    :cond_4
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlLayout;->getElements()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 158
    .local v1, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Lcom/pymcl/runtime/control/ControlElement;

    .local v5, "it":Lcom/pymcl/runtime/control/ControlElement;
    const/4 v6, 0x0

    .line 77
    .local v6, "$i$a$-forEach-ControlOverlay$rebuild$2":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v7

    const-string v8, "getContext(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p0

    check-cast v8, Lcom/pymcl/runtime/control/ControlHost;

    invoke-static {v7, v5, v8}, Lcom/pymcl/runtime/control/ControlViewsKt;->createElementView(Landroid/content/Context;Lcom/pymcl/runtime/control/ControlElement;Lcom/pymcl/runtime/control/ControlHost;)Lcom/pymcl/runtime/control/ControlElementView;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    invoke-virtual {p0, v7, v8}, Lcom/pymcl/runtime/control/ControlOverlay;->addView(Landroid/view/View;I)V

    .line 158
    .end local v5    # "it":Lcom/pymcl/runtime/control/ControlElement;
    .end local v6    # "$i$a$-forEach-ControlOverlay$rebuild$2":I
    nop

    .end local v3    # "element$iv":Ljava/lang/Object;
    goto :goto_2

    .line 159
    :cond_5
    nop

    .line 78
    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach":I
    iput-object v4, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    .line 79
    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->refreshVisibility()V

    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->requestLayout()V

    .line 80
    return-void
.end method

.method private final refreshVisibility()V
    .locals 8

    .line 82
    move-object v0, p0

    .local v0, "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    const/4 v1, 0x0

    .line 160
    .local v1, "$i$f$forEachElement":I
    const/4 v2, 0x0

    .local v2, "i$iv":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_4

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v5, :cond_0

    check-cast v4, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_3

    .local v4, "v":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v5, 0x0

    .line 83
    .local v5, "$i$a$-forEachElement-ControlOverlay$refreshVisibility$1":I
    invoke-virtual {v4}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/runtime/control/ControlElement;->getShowWhenGrabbed()Ljava/lang/Boolean;

    move-result-object v6

    .line 84
    .local v6, "want":Ljava/lang/Boolean;
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getEditing()Z

    move-result v7

    if-nez v7, :cond_2

    if-eqz v6, :cond_2

    iget-boolean v7, p0, Lcom/pymcl/runtime/control/ControlOverlay;->grabbed:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_2

    :cond_1
    const/16 v7, 0x8

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v7, 0x0

    :goto_3
    invoke-virtual {v4, v7}, Lcom/pymcl/runtime/control/ControlElementView;->setVisibility(I)V

    .line 85
    nop

    .line 160
    .end local v4    # "v":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v5    # "$i$a$-forEachElement-ControlOverlay$refreshVisibility$1":I
    .end local v6    # "want":Ljava/lang/Boolean;
    nop

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 161
    .end local v2    # "i$iv":I
    :cond_4
    nop

    .line 85
    .end local v0    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    .end local v1    # "$i$f$forEachElement":I
    return-void
.end method

.method private final toast(Ljava/lang/String;)V
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .line 145
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getContext()Landroid/content/Context;

    move-result-object v0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method


# virtual methods
.method public getEditing()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editing:Z

    return v0
.end method

.method public final getLayout()Lcom/pymcl/runtime/control/ControlLayout;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    return-object v0
.end method

.method public final getOnLayoutChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/pymcl/runtime/control/ControlLayout;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 40
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->onLayoutChanged:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public getSink()Lcom/pymcl/runtime/input/InputSink;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->sink:Lcom/pymcl/runtime/input/InputSink;

    return-object v0
.end method

.method public final loadLayout(Ljava/lang/String;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->store:Lcom/pymcl/runtime/control/ControlLayoutStore;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->load(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->settings:Lcom/pymcl/runtime/input/InputSettings;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/input/InputSettings;->setLayoutName(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->rebuild()V

    return-void
.end method

.method public longPressMs()J
    .locals 2

    .line 119
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/InputSettings;->getLongPressMs()J

    move-result-wide v0

    return-wide v0
.end method

.method public lookSensitivity()F
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->settings:Lcom/pymcl/runtime/input/InputSettings;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/InputSettings;->getLookSensitivity()F

    move-result v0

    return v0
.end method

.method public onAction(Lcom/pymcl/runtime/input/Keys$Action;)V
    .locals 1
    .param p1, "action"    # Lcom/pymcl/runtime/input/Keys$Action;

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    sget-object v0, Lcom/pymcl/runtime/input/Keys$Action;->EDIT_LAYOUT:Lcom/pymcl/runtime/input/Keys$Action;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlOverlay;->setEditing(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->actionHandler:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public onElementEdited(Lcom/pymcl/runtime/control/ControlElementView;)V
    .locals 1
    .param p1, "view"    # Lcom/pymcl/runtime/control/ControlElementView;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    return-void
.end method

.method public onElementSelected(Lcom/pymcl/runtime/control/ControlElementView;)V
    .locals 2
    .param p1, "view"    # Lcom/pymcl/runtime/control/ControlElementView;

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlElementView;->setEditSelected(Z)V

    :cond_0
    iput-object p1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/pymcl/runtime/control/ControlElementView;->setEditSelected(Z)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 10
    .param p1, "changed"    # Z
    .param p2, "l"    # I
    .param p3, "t"    # I
    .param p4, "r"    # I
    .param p5, "b"    # I

    .line 106
    sub-int v0, p4, p2

    .local v0, "w":I
    sub-int v1, p5, p3

    .line 107
    .local v1, "h":I
    const/4 v2, 0x0

    .local v2, "i":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_1

    .line 108
    invoke-virtual {p0, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 109
    .local v4, "c":Landroid/view/View;
    instance-of v5, v4, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v5, :cond_0

    .line 110
    move-object v5, v4

    check-cast v5, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v5

    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElement;->getX()F

    move-result v5

    int-to-float v6, v0

    mul-float/2addr v5, v6

    float-to-int v5, v5

    .local v5, "x":I
    move-object v6, v4

    check-cast v6, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v6}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v6

    invoke-virtual {v6}, Lcom/pymcl/runtime/control/ControlElement;->getY()F

    move-result v6

    int-to-float v7, v1

    mul-float/2addr v6, v7

    float-to-int v6, v6

    .line 111
    .local v6, "y":I
    move-object v7, v4

    check-cast v7, Lcom/pymcl/runtime/control/ControlElementView;

    move-object v8, v4

    check-cast v8, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElementView;->getMeasuredWidth()I

    move-result v8

    add-int/2addr v8, v5

    move-object v9, v4

    check-cast v9, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v9}, Lcom/pymcl/runtime/control/ControlElementView;->getMeasuredHeight()I

    move-result v9

    add-int/2addr v9, v6

    invoke-virtual {v7, v5, v6, v8, v9}, Lcom/pymcl/runtime/control/ControlElementView;->layout(IIII)V

    .end local v5    # "x":I
    .end local v6    # "y":I
    goto :goto_1

    .line 112
    :cond_0
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    sub-int v5, v1, v5

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 107
    .end local v4    # "c":Landroid/view/View;
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 114
    .end local v2    # "i":I
    :cond_1
    return-void
.end method

.method protected onMeasure(II)V
    .locals 13
    .param p1, "wSpec"    # I
    .param p2, "hSpec"    # I

    .line 92
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .local v0, "w":I
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    .line 93
    .local v1, "h":I
    invoke-virtual {p0, v0, v1}, Lcom/pymcl/runtime/control/ControlOverlay;->setMeasuredDimension(II)V

    .line 94
    const/4 v2, 0x0

    .local v2, "i":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_5

    .line 95
    invoke-virtual {p0, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 96
    .local v4, "c":Landroid/view/View;
    instance-of v5, v4, Lcom/pymcl/runtime/control/ControlElementView;

    const/high16 v6, 0x40000000    # 2.0f

    if-eqz v5, :cond_4

    .line 97
    move-object v5, v4

    check-cast v5, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v5

    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElement;->getW()F

    move-result v5

    int-to-float v7, v0

    mul-float/2addr v5, v7

    move-object v7, v4

    check-cast v7, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v7

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElement;->getH()F

    move-result v7

    int-to-float v8, v1

    mul-float/2addr v7, v8

    invoke-static {v5, v7}, Ljava/lang/Math;->min(FF)F

    move-result v5

    .line 98
    .local v5, "side":F
    move-object v7, v4

    check-cast v7, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v7

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElement;->getType()Lcom/pymcl/runtime/control/ElementType;

    move-result-object v7

    sget-object v8, Lcom/pymcl/runtime/control/ElementType;->DPAD:Lcom/pymcl/runtime/control/ElementType;

    if-eq v7, v8, :cond_1

    move-object v7, v4

    check-cast v7, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v7

    invoke-virtual {v7}, Lcom/pymcl/runtime/control/ControlElement;->getType()Lcom/pymcl/runtime/control/ElementType;

    move-result-object v7

    sget-object v8, Lcom/pymcl/runtime/control/ElementType;->JOYSTICK:Lcom/pymcl/runtime/control/ElementType;

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v7, 0x1

    .line 99
    .local v7, "square":Z
    :goto_2
    if-eqz v7, :cond_2

    move v8, v5

    goto :goto_3

    :cond_2
    move-object v8, v4

    check-cast v8, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v8

    invoke-virtual {v8}, Lcom/pymcl/runtime/control/ControlElement;->getW()F

    move-result v8

    int-to-float v9, v0

    mul-float/2addr v8, v9

    .local v8, "cw":F
    :goto_3
    if-eqz v7, :cond_3

    move v9, v5

    goto :goto_4

    :cond_3
    move-object v9, v4

    check-cast v9, Lcom/pymcl/runtime/control/ControlElementView;

    invoke-virtual {v9}, Lcom/pymcl/runtime/control/ControlElementView;->getElement()Lcom/pymcl/runtime/control/ControlElement;

    move-result-object v9

    invoke-virtual {v9}, Lcom/pymcl/runtime/control/ControlElement;->getH()F

    move-result v9

    int-to-float v10, v1

    mul-float/2addr v9, v10

    .line 100
    .local v9, "ch":F
    :goto_4
    move-object v10, v4

    check-cast v10, Lcom/pymcl/runtime/control/ControlElementView;

    float-to-int v11, v8

    invoke-static {v11, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    float-to-int v12, v9

    invoke-static {v12, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v10, v11, v6}, Lcom/pymcl/runtime/control/ControlElementView;->measure(II)V

    .end local v5    # "side":F
    .end local v7    # "square":Z
    .end local v8    # "cw":F
    .end local v9    # "ch":F
    goto :goto_5

    .line 101
    :cond_4
    invoke-static {v0, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    const/high16 v6, -0x80000000

    invoke-static {v1, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/view/View;->measure(II)V

    .line 94
    .end local v4    # "c":Landroid/view/View;
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    .line 103
    .end local v2    # "i":I
    :cond_5
    return-void
.end method

.method public final releaseAll()V
    .locals 6

    .line 70
    move-object v0, p0

    .local v0, "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    const/4 v1, 0x0

    .line 154
    .local v1, "$i$f$forEachElement":I
    const/4 v2, 0x0

    .local v2, "i$iv":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v3

    :goto_0
    if-ge v2, v3, :cond_2

    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v5, :cond_0

    check-cast v4, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    .local v4, "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v5, 0x0

    .line 70
    .local v5, "$i$a$-forEachElement-ControlOverlay$releaseAll$1":I
    invoke-virtual {v4}, Lcom/pymcl/runtime/control/ControlElementView;->releaseAll()V

    .line 154
    .end local v4    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v5    # "$i$a$-forEachElement-ControlOverlay$releaseAll$1":I
    nop

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 155
    .end local v2    # "i$iv":I
    :cond_2
    nop

    .line 70
    .end local v0    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    .end local v1    # "$i$f$forEachElement":I
    return-void
.end method

.method public final setEditing(Z)V
    .locals 7
    .param p1, "e"    # Z

    .line 63
    iput-boolean p1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editing:Z

    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->editBar:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlElementView;->setEditSelected(Z)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->selectedView:Lcom/pymcl/runtime/control/ControlElementView;

    .line 65
    if-eqz p1, :cond_5

    move-object v1, p0

    .local v1, "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    const/4 v2, 0x0

    .line 150
    .local v2, "$i$f$forEachElement":I
    const/4 v3, 0x0

    .local v3, "i$iv":I
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v4

    :goto_1
    if-ge v3, v4, :cond_4

    invoke-virtual {v1, v3}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v6, :cond_2

    check-cast v5, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_2

    :cond_2
    move-object v5, v0

    :goto_2
    if-eqz v5, :cond_3

    .local v5, "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v6, 0x0

    .line 65
    .local v6, "$i$a$-forEachElement-ControlOverlay$setEditing$1":I
    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElementView;->releaseAll()V

    .line 150
    .end local v5    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v6    # "$i$a$-forEachElement-ControlOverlay$setEditing$1":I
    nop

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 151
    .end local v3    # "i$iv":I
    :cond_4
    nop

    .line 66
    .end local v1    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    .end local v2    # "$i$f$forEachElement":I
    :cond_5
    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->refreshVisibility()V

    move-object v1, p0

    .restart local v1    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    const/4 v2, 0x0

    .line 152
    .restart local v2    # "$i$f$forEachElement":I
    const/4 v3, 0x0

    .restart local v3    # "i$iv":I
    invoke-virtual {v1}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildCount()I

    move-result v4

    :goto_3
    if-ge v3, v4, :cond_8

    invoke-virtual {v1, v3}, Lcom/pymcl/runtime/control/ControlOverlay;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    instance-of v6, v5, Lcom/pymcl/runtime/control/ControlElementView;

    if-eqz v6, :cond_6

    check-cast v5, Lcom/pymcl/runtime/control/ControlElementView;

    goto :goto_4

    :cond_6
    move-object v5, v0

    :goto_4
    if-eqz v5, :cond_7

    .restart local v5    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    const/4 v6, 0x0

    .line 66
    .local v6, "$i$a$-forEachElement-ControlOverlay$setEditing$2":I
    invoke-virtual {v5}, Lcom/pymcl/runtime/control/ControlElementView;->invalidate()V

    .line 152
    .end local v5    # "it":Lcom/pymcl/runtime/control/ControlElementView;
    .end local v6    # "$i$a$-forEachElement-ControlOverlay$setEditing$2":I
    nop

    :cond_7
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 153
    .end local v3    # "i$iv":I
    :cond_8
    nop

    .line 67
    .end local v1    # "this_$iv":Lcom/pymcl/runtime/control/ControlOverlay;
    .end local v2    # "$i$f$forEachElement":I
    if-nez p1, :cond_9

    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlOverlay;->onLayoutChanged:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_9

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->layout:Lcom/pymcl/runtime/control/ControlLayout;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    :cond_9
    return-void
.end method

.method public final setGrabbed(Z)V
    .locals 0
    .param p1, "g"    # Z

    .line 60
    iput-boolean p1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->grabbed:Z

    invoke-direct {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->refreshVisibility()V

    return-void
.end method

.method public final setOnLayoutChanged(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1, "<set-?>"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/runtime/control/ControlLayout;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 40
    iput-object p1, p0, Lcom/pymcl/runtime/control/ControlOverlay;->onLayoutChanged:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1, "ev"    # Landroid/view/MotionEvent;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    if-eqz v0, :cond_check

    const/4 v1, 0x5

    if-ne v0, v1, :cond_super

    :cond_check
    invoke-virtual {p0}, Lcom/pymcl/runtime/control/ControlOverlay;->getEditing()Z

    move-result v1

    if-nez v1, :cond_super

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/pymcl/runtime/control/ControlOverlay;->isPointOnChild(FF)Z

    move-result v0

    if-nez v0, :cond_super

    const/4 v0, 0x0

    return v0

    :cond_super
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    return v0
.end method

.method private isPointOnChild(FF)Z
    .locals 6
    .param p1, "x"    # F
    .param p2, "y"    # F

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_loop
    if-ge v1, v0, :cond_no

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-eqz v3, :cond_vis

    goto/16 :goto_next

    :cond_vis
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, p1, v3

    if-ltz v3, :goto_next

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, p1, v3

    if-lez v3, :cond_x_ok

    goto/16 :goto_next

    :cond_x_ok
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, p2, v3

    if-ltz v3, :goto_next

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, p2, v3

    if-lez v3, :cond_hit

    goto/16 :goto_next

    :cond_hit
    const/4 v0, 0x1

    return v0

    :goto_next
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_loop

    :cond_no
    const/4 v0, 0x0

    return v0
.end method
