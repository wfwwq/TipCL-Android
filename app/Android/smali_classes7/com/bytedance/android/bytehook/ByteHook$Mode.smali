.class public final enum Lcom/bytedance/android/bytehook/ByteHook$Mode;
.super Ljava/lang/Enum;
.source "ByteHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/android/bytehook/ByteHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Mode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bytedance/android/bytehook/ByteHook$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bytedance/android/bytehook/ByteHook$Mode;

.field public static final enum AUTOMATIC:Lcom/bytedance/android/bytehook/ByteHook$Mode;

.field public static final enum MANUAL:Lcom/bytedance/android/bytehook/ByteHook$Mode;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lcom/bytedance/android/bytehook/ByteHook$Mode;
    .locals 2

    .line 158
    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->AUTOMATIC:Lcom/bytedance/android/bytehook/ByteHook$Mode;

    sget-object v1, Lcom/bytedance/android/bytehook/ByteHook$Mode;->MANUAL:Lcom/bytedance/android/bytehook/ByteHook$Mode;

    filled-new-array {v0, v1}, [Lcom/bytedance/android/bytehook/ByteHook$Mode;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 159
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;

    const-string v1, "AUTOMATIC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/bytedance/android/bytehook/ByteHook$Mode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->AUTOMATIC:Lcom/bytedance/android/bytehook/ByteHook$Mode;

    .line 160
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;

    const-string v1, "MANUAL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/bytedance/android/bytehook/ByteHook$Mode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->MANUAL:Lcom/bytedance/android/bytehook/ByteHook$Mode;

    .line 158
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook$Mode;->$values()[Lcom/bytedance/android/bytehook/ByteHook$Mode;

    move-result-object v0

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->$VALUES:[Lcom/bytedance/android/bytehook/ByteHook$Mode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .param p3, "value"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 164
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 165
    iput p3, p0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->value:I

    .line 166
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bytedance/android/bytehook/ByteHook$Mode;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 158
    const-class v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;

    return-object v0
.end method

.method public static values()[Lcom/bytedance/android/bytehook/ByteHook$Mode;
    .locals 1

    .line 158
    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->$VALUES:[Lcom/bytedance/android/bytehook/ByteHook$Mode;

    invoke-virtual {v0}, [Lcom/bytedance/android/bytehook/ByteHook$Mode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bytedance/android/bytehook/ByteHook$Mode;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    .line 169
    iget v0, p0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->value:I

    return v0
.end method
