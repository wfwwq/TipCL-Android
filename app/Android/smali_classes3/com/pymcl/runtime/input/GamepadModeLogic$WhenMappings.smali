.class public final synthetic Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;
.super Ljava/lang/Object;
.source "GamepadMode.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/input/GamepadModeLogic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Lcom/pymcl/runtime/input/GamepadModePref;->values()[Lcom/pymcl/runtime/input/GamepadModePref;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/pymcl/runtime/input/GamepadModePref;->MAPPING:Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadModePref;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/pymcl/runtime/input/GamepadModePref;->DIRECT:Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-virtual {v3}, Lcom/pymcl/runtime/input/GamepadModePref;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    :try_start_2
    sget-object v3, Lcom/pymcl/runtime/input/GamepadModePref;->ASK:Lcom/pymcl/runtime/input/GamepadModePref;

    invoke-virtual {v3}, Lcom/pymcl/runtime/input/GamepadModePref;->ordinal()I

    move-result v3

    const/4 v4, 0x3

    aput v4, v0, v3
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v3

    :goto_2
    sput-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/pymcl/runtime/input/GamepadSessionMode;->values()[Lcom/pymcl/runtime/input/GamepadSessionMode;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3
    sget-object v3, Lcom/pymcl/runtime/input/GamepadSessionMode;->MAPPING:Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-virtual {v3}, Lcom/pymcl/runtime/input/GamepadSessionMode;->ordinal()I

    move-result v3

    aput v1, v0, v3
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v1

    :goto_3
    :try_start_4
    sget-object v1, Lcom/pymcl/runtime/input/GamepadSessionMode;->DIRECT:Lcom/pymcl/runtime/input/GamepadSessionMode;

    invoke-virtual {v1}, Lcom/pymcl/runtime/input/GamepadSessionMode;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v1

    :goto_4
    sput-object v0, Lcom/pymcl/runtime/input/GamepadModeLogic$WhenMappings;->$EnumSwitchMapping$1:[I

    return-void
.end method
