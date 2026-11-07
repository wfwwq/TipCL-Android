.class public final Lcom/pymcl/core/config/BuiltinSecrets;
.super Ljava/lang/Object;
.source "ConfigStore.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/pymcl/core/config/BuiltinSecrets;",
        "",
        "<init>",
        "()V",
        "CF",
        "",
        "curseforgeKey",
        "",
        "getCurseforgeKey",
        "()Ljava/lang/String;",
        "curseforgeKey$delegate",
        "Lkotlin/Lazy;",
        "PyMCL-Android:core"
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
.field private static final CF:[I

.field public static final INSTANCE:Lcom/pymcl/core/config/BuiltinSecrets;

.field private static final curseforgeKey$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$MUY5GoM6yQmLs6aXsQqxCbXSHsc()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/pymcl/core/config/BuiltinSecrets;->curseforgeKey_delegate$lambda$0()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/config/BuiltinSecrets;

    invoke-direct {v0}, Lcom/pymcl/core/config/BuiltinSecrets;-><init>()V

    sput-object v0, Lcom/pymcl/core/config/BuiltinSecrets;->INSTANCE:Lcom/pymcl/core/config/BuiltinSecrets;

    .line 7
    const/16 v0, 0x3c

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/pymcl/core/config/BuiltinSecrets;->CF:[I

    .line 8
    new-instance v0, Lcom/pymcl/core/config/BuiltinSecrets$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/core/config/BuiltinSecrets$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/config/BuiltinSecrets;->curseforgeKey$delegate:Lkotlin/Lazy;

    return-void

    :array_0
    .array-data 4
        0x69
        0x7f
        0x2c
        0x69
        0x7c
        0x7d
        0x69
        0x22
        0x75
        0x3d
        0x34
        0x2a
        0x1d
        0x3f
        0x25
        0x3b
        0x6
        0xf
        0x5
        0x38
        0x38
        0x25
        0x78
        0x24
        0x20
        0x1
        0x7f
        0x1a
        0x63
        0x1
        0xe
        0x3
        0xb
        0x25
        0xf
        0x7c
        0x78
        0x37
        0xf
        0x14
        0xc
        0x8
        0x35
        0x15
        0x35
        0x62
        0x19
        0x3c
        0x19
        0x35
        0x62
        0x17
        0x3d
        0x78
        0x3d
        0x35
        0x7f
        0x21
        0x35
        0x38
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final curseforgeKey_delegate$lambda$0()Ljava/lang/String;
    .locals 4

    .line 8
    sget-object v0, Lcom/pymcl/core/config/BuiltinSecrets;->CF:[I

    array-length v0, v0

    new-array v1, v0, [C

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    sget-object v3, Lcom/pymcl/core/config/BuiltinSecrets;->CF:[I

    aget v3, v3, v2

    xor-int/lit8 v3, v3, 0x4d

    int-to-char v3, v3

    aput-char v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    return-object v0
.end method


# virtual methods
.method public final getCurseforgeKey()Ljava/lang/String;
    .locals 1

    .line 8
    sget-object v0, Lcom/pymcl/core/config/BuiltinSecrets;->curseforgeKey$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method
