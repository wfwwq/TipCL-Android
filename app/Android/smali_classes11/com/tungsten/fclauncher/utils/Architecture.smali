.class public Lcom/tungsten/fclauncher/utils/Architecture;
.super Ljava/lang/Object;
.source "Architecture.java"


# static fields
.field public static final ARCH_ARM:I = 0x2

.field public static final ARCH_ARM64:I = 0x1

.field public static final ARCH_X86:I = 0x4

.field public static final ARCH_X86_64:I = 0x8

.field public static final UNSUPPORTED_ARCH:I = -0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static archAsInt(Ljava/lang/String;)I
    .locals 3
    .param p0, "arch"    # Ljava/lang/String;

    .line 77
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, " "

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 78
    const-string v0, "arm64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    const-string v0, "aarch64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 79
    :cond_0
    const-string v0, "arm"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "aarch32"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    .line 80
    :cond_1
    const-string v0, "x86_64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "amd64"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 81
    :cond_2
    const-string v0, "x86"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "i"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "86"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 83
    :cond_3
    const/4 v0, -0x1

    return v0

    .line 81
    :cond_4
    :goto_0
    const/4 v0, 0x4

    return v0

    .line 80
    :cond_5
    :goto_1
    const/16 v0, 0x8

    return v0

    .line 79
    :cond_6
    :goto_2
    const/4 v0, 0x2

    return v0

    .line 78
    :cond_7
    :goto_3
    const/4 v0, 0x1

    return v0
.end method

.method public static archAsString(I)Ljava/lang/String;
    .locals 1
    .param p0, "arch"    # I

    .line 92
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string v0, "arm64"

    return-object v0

    .line 93
    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string v0, "arm"

    return-object v0

    .line 94
    :cond_1
    const/16 v0, 0x8

    if-ne p0, v0, :cond_2

    const-string v0, "x86_64"

    return-object v0

    .line 95
    :cond_2
    const/4 v0, 0x4

    if-ne p0, v0, :cond_3

    const-string v0, "x86"

    return-object v0

    .line 96
    :cond_3
    const-string v0, "UNSUPPORTED_ARCH"

    return-object v0
.end method

.method public static archAsStringAndroid(I)Ljava/lang/String;
    .locals 1
    .param p0, "arch"    # I

    .line 105
    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const-string v0, "arm64-v8a"

    return-object v0

    .line 106
    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const-string v0, "armeabi-v7a"

    return-object v0

    .line 107
    :cond_1
    const/16 v0, 0x8

    if-ne p0, v0, :cond_2

    const-string v0, "x86_64"

    return-object v0

    .line 108
    :cond_2
    const/4 v0, 0x4

    if-ne p0, v0, :cond_3

    const-string v0, "x86"

    return-object v0

    .line 109
    :cond_3
    const-string v0, "UNSUPPORTED_ARCH"

    return-object v0
.end method

.method public static getDeviceArchitecture()I
    .locals 1

    .line 40
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->isx86Device()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 41
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x8

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    return v0

    .line 43
    :cond_1
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    :goto_1
    return v0
.end method

.method public static is32BitsDevice()Z
    .locals 1

    .line 30
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static is64BitsDevice()Z
    .locals 1

    .line 21
    sget-object v0, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    array-length v0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isArmDevice()Z
    .locals 1

    .line 68
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->isx86Device()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static isx86Device()Z
    .locals 7

    .line 54
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Landroid/os/Build;->SUPPORTED_64_BIT_ABIS:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/os/Build;->SUPPORTED_32_BIT_ABIS:[Ljava/lang/String;

    .line 55
    .local v0, "ABI":[Ljava/lang/String;
    :goto_0
    invoke-static {}, Lcom/tungsten/fclauncher/utils/Architecture;->is64BitsDevice()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x8

    goto :goto_1

    :cond_1
    const/4 v1, 0x4

    .line 56
    .local v1, "comparedArch":I
    :goto_1
    array-length v2, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_2
    if-ge v4, v2, :cond_3

    aget-object v5, v0, v4

    .line 57
    .local v5, "str":Ljava/lang/String;
    invoke-static {v5}, Lcom/tungsten/fclauncher/utils/Architecture;->archAsInt(Ljava/lang/String;)I

    move-result v6

    if-ne v6, v1, :cond_2

    const/4 v2, 0x1

    return v2

    .line 56
    .end local v5    # "str":Ljava/lang/String;
    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 59
    :cond_3
    return v3
.end method
