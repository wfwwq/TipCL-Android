.class public final enum Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
.super Ljava/lang/Enum;
.source "ByteHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/android/bytehook/ByteHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecordItem"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bytedance/android/bytehook/ByteHook$RecordItem;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum CALLER_LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum ERRNO:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum NEW_ADDR:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum OP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum STUB:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum SYM_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

.field public static final enum TIMESTAMP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;


# direct methods
.method private static synthetic $values()[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    .locals 8

    .line 173
    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->TIMESTAMP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v1, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->CALLER_LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v2, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->OP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v3, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v4, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->SYM_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v5, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->NEW_ADDR:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v6, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->ERRNO:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    sget-object v7, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->STUB:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    filled-new-array/range {v0 .. v7}, [Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 174
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "TIMESTAMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->TIMESTAMP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 175
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "CALLER_LIB_NAME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->CALLER_LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 176
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "OP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->OP:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 177
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "LIB_NAME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->LIB_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 178
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "SYM_NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->SYM_NAME:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 179
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "NEW_ADDR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->NEW_ADDR:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 180
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "ERRNO"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->ERRNO:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 181
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    const-string v1, "STUB"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->STUB:Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    .line 173
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->$values()[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    move-result-object v0

    sput-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->$VALUES:[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 173
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .line 173
    const-class v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    return-object v0
.end method

.method public static values()[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;
    .locals 1

    .line 173
    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->$VALUES:[Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    invoke-virtual {v0}, [Lcom/bytedance/android/bytehook/ByteHook$RecordItem;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bytedance/android/bytehook/ByteHook$RecordItem;

    return-object v0
.end method
