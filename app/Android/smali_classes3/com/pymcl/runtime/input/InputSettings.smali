.class public final Lcom/pymcl/runtime/input/InputSettings;
.super Ljava/lang/Object;
.source "InputSettings.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/input/InputSettings$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInputSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputSettings.kt\ncom/pymcl/runtime/input/InputSettings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\'\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u0000 I2\u00020\u0001:\u0001IBu\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0006\u00104\u001a\u00020\u0000J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000208J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0008H\u00c6\u0003J\t\u0010=\u001a\u00020\u0008H\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\u000cH\u00c6\u0003J\t\u0010@\u001a\u00020\u000eH\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0008H\u00c6\u0003Jw\u0010D\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0008H\u00c6\u0001J\u0014\u0010E\u001a\u00020\u00052\u0008\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010G\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010H\u001a\u00020\u000eH\u00d6\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u0015\"\u0004\u0008\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001a\u0010\t\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\"\u0010\u001f\"\u0004\u0008#\u0010!R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010\u0019\"\u0004\u0008%\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\u000cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008*\u0010+\"\u0004\u0008,\u0010-R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008.\u0010\u0019\"\u0004\u0008/\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00080\u0010\u0019\"\u0004\u00081\u0010\u001bR\u001a\u0010\u0011\u001a\u00020\u0008X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u00082\u0010\u001f\"\u0004\u00083\u0010!\u00a8\u0006J"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/InputSettings;",
        "",
        "imeHotkey",
        "",
        "enterOpensIme",
        "",
        "capturePointerHotkey",
        "lookSensitivity",
        "",
        "mouseSensitivity",
        "virtualMouse",
        "longPressMs",
        "",
        "layoutName",
        "",
        "imeNoFullscreen",
        "gamepadEnabled",
        "gamepadDeadzone",
        "<init>",
        "(IZIFFZJLjava/lang/String;ZZF)V",
        "getImeHotkey",
        "()I",
        "setImeHotkey",
        "(I)V",
        "getEnterOpensIme",
        "()Z",
        "setEnterOpensIme",
        "(Z)V",
        "getCapturePointerHotkey",
        "setCapturePointerHotkey",
        "getLookSensitivity",
        "()F",
        "setLookSensitivity",
        "(F)V",
        "getMouseSensitivity",
        "setMouseSensitivity",
        "getVirtualMouse",
        "setVirtualMouse",
        "getLongPressMs",
        "()J",
        "setLongPressMs",
        "(J)V",
        "getLayoutName",
        "()Ljava/lang/String;",
        "setLayoutName",
        "(Ljava/lang/String;)V",
        "getImeNoFullscreen",
        "setImeNoFullscreen",
        "getGamepadEnabled",
        "setGamepadEnabled",
        "getGamepadDeadzone",
        "setGamepadDeadzone",
        "sanitized",
        "save",
        "",
        "file",
        "Ljava/io/File;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "Companion",
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
.field public static final Companion:Lcom/pymcl/runtime/input/InputSettings$Companion;

.field public static final DEFAULT_LAYOUT:Ljava/lang/String; = "default"

.field public static final MAX_DEADZONE:F = 0.9f

.field public static final MAX_LONG_PRESS_MS:J = 0x1388L

.field public static final MAX_SENSITIVITY:F = 10.0f

.field public static final MIN_SENSITIVITY:F = 0.05f

.field private static final gson:Lcom/google/gson/Gson;


# instance fields
.field private capturePointerHotkey:I

.field private enterOpensIme:Z

.field private gamepadDeadzone:F

.field private gamepadEnabled:Z

.field private imeHotkey:I

.field private imeNoFullscreen:Z

.field private layoutName:Ljava/lang/String;

.field private longPressMs:J

.field private lookSensitivity:F

.field private mouseSensitivity:F

.field private virtualMouse:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/input/InputSettings$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/input/InputSettings$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/input/InputSettings;->Companion:Lcom/pymcl/runtime/input/InputSettings$Companion;

    .line 31
    new-instance v0, Lcom/google/gson/GsonBuilder;

    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->setPrettyPrinting()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/input/InputSettings;->gson:Lcom/google/gson/Gson;

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/pymcl/runtime/input/InputSettings;-><init>(IZIFFZJLjava/lang/String;ZZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IZIFFZJLjava/lang/String;ZZF)V
    .locals 1
    .param p1, "imeHotkey"    # I
    .param p2, "enterOpensIme"    # Z
    .param p3, "capturePointerHotkey"    # I
    .param p4, "lookSensitivity"    # F
    .param p5, "mouseSensitivity"    # F
    .param p6, "virtualMouse"    # Z
    .param p7, "longPressMs"    # J
    .param p9, "layoutName"    # Ljava/lang/String;
    .param p10, "imeNoFullscreen"    # Z
    .param p11, "gamepadEnabled"    # Z
    .param p12, "gamepadDeadzone"    # F

    const-string v0, "layoutName"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    .line 12
    iput-boolean p2, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    .line 14
    iput p3, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    .line 16
    iput p4, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    .line 18
    iput p5, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    .line 20
    iput-boolean p6, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    .line 22
    iput-wide p7, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    .line 24
    iput-object p9, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    .line 26
    iput-boolean p10, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    .line 27
    iput-boolean p11, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    .line 28
    iput p12, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    .line 8
    return-void
.end method

.method public synthetic constructor <init>(IZIFFZJLjava/lang/String;ZZFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    .line 8
    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 10
    const/16 p1, 0x72

    .line 8
    :cond_0
    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 12
    move p2, v2

    .line 8
    :cond_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 14
    const/16 v1, 0x74

    goto :goto_0

    .line 8
    :cond_2
    move v1, p3

    :goto_0
    and-int/lit8 v3, v0, 0x8

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_3

    .line 16
    move v3, v4

    goto :goto_1

    .line 8
    :cond_3
    move v3, p4

    :goto_1
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    .line 18
    goto :goto_2

    .line 8
    :cond_4
    move/from16 v4, p5

    :goto_2
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    .line 20
    goto :goto_3

    .line 8
    :cond_5
    move/from16 v2, p6

    :goto_3
    and-int/lit8 v5, v0, 0x40

    if-eqz v5, :cond_6

    .line 22
    const-wide/16 v5, 0x12c

    goto :goto_4

    .line 8
    :cond_6
    move-wide/from16 v5, p7

    :goto_4
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    .line 24
    const-string v7, "default"

    goto :goto_5

    .line 8
    :cond_7
    move-object/from16 v7, p9

    :goto_5
    and-int/lit16 v8, v0, 0x100

    const/4 v9, 0x1

    if-eqz v8, :cond_8

    .line 26
    move v8, v9

    goto :goto_6

    .line 8
    :cond_8
    move/from16 v8, p10

    :goto_6
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    .line 27
    goto :goto_7

    .line 8
    :cond_9
    move/from16 v9, p11

    :goto_7
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    .line 28
    const v0, 0x3e19999a    # 0.15f

    goto :goto_8

    .line 8
    :cond_a
    move/from16 v0, p12

    :goto_8
    move p3, p1

    move p4, p2

    move/from16 p14, v0

    move/from16 p5, v1

    move/from16 p8, v2

    move/from16 p6, v3

    move/from16 p7, v4

    move-wide/from16 p9, v5

    move-object/from16 p11, v7

    move/from16 p12, v8

    move/from16 p13, v9

    move-object p2, p0

    invoke-direct/range {p2 .. p14}, Lcom/pymcl/runtime/input/InputSettings;-><init>(IZIFFZJLjava/lang/String;ZZF)V

    .line 29
    return-void
.end method

.method public static final synthetic access$getGson$cp()Lcom/google/gson/Gson;
    .locals 1

    .line 8
    sget-object v0, Lcom/pymcl/runtime/input/InputSettings;->gson:Lcom/google/gson/Gson;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/pymcl/runtime/input/InputSettings;IZIFFZJLjava/lang/String;ZZFILjava/lang/Object;)Lcom/pymcl/runtime/input/InputSettings;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget p1, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-boolean p2, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget p3, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-wide p7, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p9, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p10, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p11, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    :cond_9
    and-int/lit16 p13, p13, 0x400

    if-eqz p13, :cond_a

    iget p12, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    :cond_a
    move p13, p11

    move p14, p12

    move-object p11, p9

    move p12, p10

    move-wide p9, p7

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move p3, p1

    move p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/pymcl/runtime/input/InputSettings;->copy(IZIFFZJLjava/lang/String;ZZF)Lcom/pymcl/runtime/input/InputSettings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    return v0
.end method

.method public final component4()F
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    return v0
.end method

.method public final component5()F
    .locals 1

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    return v0
.end method

.method public final component7()J
    .locals 2

    iget-wide v0, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    return v0
.end method

.method public final copy(IZIFFZJLjava/lang/String;ZZF)Lcom/pymcl/runtime/input/InputSettings;
    .locals 14

    const-string v0, "layoutName"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/runtime/input/InputSettings;

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-wide/from16 v8, p7

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/pymcl/runtime/input/InputSettings;-><init>(IZIFFZJLjava/lang/String;ZZF)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/runtime/input/InputSettings;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/runtime/input/InputSettings;

    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    iget v4, v1, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    if-eq v3, v4, :cond_2

    return v2

    :cond_2
    iget-boolean v3, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    if-eq v3, v4, :cond_3

    return v2

    :cond_3
    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    iget v4, v1, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    if-eq v3, v4, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    iget v4, v1, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_5

    return v2

    :cond_5
    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    iget v4, v1, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    invoke-static {v3, v4}, Ljava/lang/Float;->compare(FF)I

    move-result v3

    if-eqz v3, :cond_6

    return v2

    :cond_6
    iget-boolean v3, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    iget-wide v5, v1, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    cmp-long v3, v3, v5

    if-eqz v3, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v2

    :cond_9
    iget-boolean v3, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    if-eq v3, v4, :cond_a

    return v2

    :cond_a
    iget-boolean v3, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    iget-boolean v4, v1, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    if-eq v3, v4, :cond_b

    return v2

    :cond_b
    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    iget v1, v1, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    invoke-static {v3, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getCapturePointerHotkey()I
    .locals 1

    .line 14
    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    return v0
.end method

.method public final getEnterOpensIme()Z
    .locals 1

    .line 12
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    return v0
.end method

.method public final getGamepadDeadzone()F
    .locals 1

    .line 28
    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    return v0
.end method

.method public final getGamepadEnabled()Z
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    return v0
.end method

.method public final getImeHotkey()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    return v0
.end method

.method public final getImeNoFullscreen()Z
    .locals 1

    .line 26
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    return v0
.end method

.method public final getLayoutName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLongPressMs()J
    .locals 2

    .line 22
    iget-wide v0, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    return-wide v0
.end method

.method public final getLookSensitivity()F
    .locals 1

    .line 16
    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    return v0
.end method

.method public final getMouseSensitivity()F
    .locals 1

    .line 18
    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    return v0
.end method

.method public final getVirtualMouse()Z
    .locals 1

    .line 20
    iget-boolean v0, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-wide v2, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    invoke-static {v2}, Ljava/lang/Float;->hashCode(F)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public final sanitized()Lcom/pymcl/runtime/input/InputSettings;
    .locals 16

    .line 51
    move-object/from16 v0, p0

    new-instance v1, Lcom/pymcl/runtime/input/InputSettings;

    const/16 v14, 0x7ff

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v15}, Lcom/pymcl/runtime/input/InputSettings;-><init>(IZIFFZJLjava/lang/String;ZZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v15, v1

    .line 53
    .local v15, "d":Lcom/pymcl/runtime/input/InputSettings;
    iget-object v1, v0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v4, v1

    .line 80
    .local v4, "it":Ljava/lang/String;
    const/4 v5, 0x0

    .line 53
    .local v5, "$i$a$-takeIf-InputSettings$sanitized$layout$1":I
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-lez v6, :cond_0

    move v6, v2

    goto :goto_0

    :cond_0
    move v6, v3

    .end local v4    # "it":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-InputSettings$sanitized$layout$1":I
    :goto_0
    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_3

    :cond_2
    const-string v1, "default"

    :cond_3
    move-object v9, v1

    .line 54
    .local v9, "layout":Ljava/lang/String;
    nop

    .line 55
    iget v1, v0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    if-lez v1, :cond_4

    iget v1, v0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    goto :goto_2

    :cond_4
    iget v1, v15, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    .line 54
    :goto_2
    nop

    .line 56
    iget v4, v0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    if-lez v4, :cond_5

    iget v4, v0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    goto :goto_3

    :cond_5
    iget v4, v15, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    .line 57
    :goto_3
    sget-object v5, Lcom/pymcl/runtime/input/InputSettings;->Companion:Lcom/pymcl/runtime/input/InputSettings$Companion;

    iget v6, v0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    iget v7, v15, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    invoke-static {v5, v6, v7}, Lcom/pymcl/runtime/input/InputSettings$Companion;->access$sens(Lcom/pymcl/runtime/input/InputSettings$Companion;FF)F

    move-result v5

    .line 58
    sget-object v6, Lcom/pymcl/runtime/input/InputSettings;->Companion:Lcom/pymcl/runtime/input/InputSettings$Companion;

    iget v7, v0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    iget v8, v15, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    invoke-static {v6, v7, v8}, Lcom/pymcl/runtime/input/InputSettings$Companion;->access$sens(Lcom/pymcl/runtime/input/InputSettings$Companion;FF)F

    move-result v6

    .line 54
    nop

    .line 59
    iget-wide v7, v0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    const-wide/16 v10, 0x0

    cmp-long v7, v7, v10

    if-gtz v7, :cond_6

    iget-wide v7, v15, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    goto :goto_4

    :cond_6
    iget-wide v7, v0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    const-wide/16 v10, 0x1388

    invoke-static {v7, v8, v10, v11}, Lkotlin/ranges/RangesKt;->coerceAtMost(JJ)J

    move-result-wide v7

    .line 60
    :goto_4
    nop

    .line 54
    nop

    .line 61
    iget v10, v0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v10

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v10, v10, v11

    if-gtz v10, :cond_7

    goto :goto_5

    :cond_7
    move v2, v3

    :goto_5
    if-nez v2, :cond_8

    iget v2, v15, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    goto :goto_6

    :cond_8
    iget v2, v0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    const/4 v3, 0x0

    const v10, 0x3f666666    # 0.9f

    invoke-static {v2, v3, v10}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    :goto_6
    move v12, v2

    .line 54
    const/16 v13, 0x322

    const/4 v14, 0x0

    const/4 v2, 0x0

    move v3, v4

    move v4, v5

    move v5, v6

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v0 .. v14}, Lcom/pymcl/runtime/input/InputSettings;->copy$default(Lcom/pymcl/runtime/input/InputSettings;IZIFFZJLjava/lang/String;ZZFILjava/lang/Object;)Lcom/pymcl/runtime/input/InputSettings;

    move-result-object v1

    return-object v1
.end method

.method public final save(Ljava/io/File;)V
    .locals 7
    .param p1, "file"    # Ljava/io/File;

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 68
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/io/File;

    const-string v2, "."

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".tmp"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 69
    .local v0, "tmp":Ljava/io/File;
    sget-object v1, Lcom/pymcl/runtime/input/InputSettings;->gson:Lcom/google/gson/Gson;

    invoke-virtual {p0}, Lcom/pymcl/runtime/input/InputSettings;->sanitized()Lcom/pymcl/runtime/input/InputSettings;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toJson(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 70
    nop

    .line 71
    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v4

    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v5

    new-array v3, v3, [Ljava/nio/file/CopyOption;

    sget-object v6, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    aput-object v6, v3, v1

    sget-object v6, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    aput-object v6, v3, v2

    invoke-static {v4, v5, v3}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_0
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 74
    :catch_0
    move-exception v1

    .line 75
    .local v1, "e":Ljava/lang/Exception;
    invoke-virtual {v0, p1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    throw v1

    .line 72
    .end local v1    # "e":Ljava/lang/Exception;
    :catch_1
    move-exception v3

    .line 73
    .local v3, "e":Ljava/nio/file/AtomicMoveNotSupportedException;
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v4

    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v5

    new-array v2, v2, [Ljava/nio/file/CopyOption;

    sget-object v6, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    aput-object v6, v2, v1

    invoke-static {v4, v5, v2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 77
    .end local v3    # "e":Ljava/nio/file/AtomicMoveNotSupportedException;
    :goto_0
    return-void
.end method

.method public final setCapturePointerHotkey(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 14
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    return-void
.end method

.method public final setEnterOpensIme(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 12
    iput-boolean p1, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    return-void
.end method

.method public final setGamepadDeadzone(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 28
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    return-void
.end method

.method public final setGamepadEnabled(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 27
    iput-boolean p1, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    return-void
.end method

.method public final setImeHotkey(I)V
    .locals 0
    .param p1, "<set-?>"    # I

    .line 10
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    return-void
.end method

.method public final setImeNoFullscreen(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 26
    iput-boolean p1, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    return-void
.end method

.method public final setLayoutName(Ljava/lang/String;)V
    .locals 1
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    return-void
.end method

.method public final setLongPressMs(J)V
    .locals 0
    .param p1, "<set-?>"    # J

    .line 22
    iput-wide p1, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    return-void
.end method

.method public final setLookSensitivity(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 16
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    return-void
.end method

.method public final setMouseSensitivity(F)V
    .locals 0
    .param p1, "<set-?>"    # F

    .line 18
    iput p1, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    return-void
.end method

.method public final setVirtualMouse(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 20
    iput-boolean p1, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget v0, p0, Lcom/pymcl/runtime/input/InputSettings;->imeHotkey:I

    iget-boolean v1, p0, Lcom/pymcl/runtime/input/InputSettings;->enterOpensIme:Z

    iget v2, p0, Lcom/pymcl/runtime/input/InputSettings;->capturePointerHotkey:I

    iget v3, p0, Lcom/pymcl/runtime/input/InputSettings;->lookSensitivity:F

    iget v4, p0, Lcom/pymcl/runtime/input/InputSettings;->mouseSensitivity:F

    iget-boolean v5, p0, Lcom/pymcl/runtime/input/InputSettings;->virtualMouse:Z

    iget-wide v6, p0, Lcom/pymcl/runtime/input/InputSettings;->longPressMs:J

    iget-object v8, p0, Lcom/pymcl/runtime/input/InputSettings;->layoutName:Ljava/lang/String;

    iget-boolean v9, p0, Lcom/pymcl/runtime/input/InputSettings;->imeNoFullscreen:Z

    iget-boolean v10, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadEnabled:Z

    iget v11, p0, Lcom/pymcl/runtime/input/InputSettings;->gamepadDeadzone:F

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "InputSettings(imeHotkey="

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", enterOpensIme="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", capturePointerHotkey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lookSensitivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mouseSensitivity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", virtualMouse="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", longPressMs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", layoutName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imeNoFullscreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gamepadEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gamepadDeadzone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
