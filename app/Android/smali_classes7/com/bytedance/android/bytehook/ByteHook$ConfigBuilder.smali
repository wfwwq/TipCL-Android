.class public final Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;
.super Ljava/lang/Object;
.source "ByteHook.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/android/bytehook/ByteHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ConfigBuilder"
.end annotation


# instance fields
.field private debug:Z

.field private libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

.field private mode:I

.field private recordable:Z


# direct methods
.method static bridge synthetic -$$Nest$fgetdebug(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->debug:Z

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetlibLoader(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Lcom/bytedance/android/bytehook/ILibLoader;
    .locals 0

    iget-object p0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    return-object p0
.end method

.method static bridge synthetic -$$Nest$fgetmode(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)I
    .locals 0

    iget p0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->mode:I

    return p0
.end method

.method static bridge synthetic -$$Nest$fgetrecordable(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->recordable:Z

    return p0
.end method

.method public constructor <init>()V
    .locals 2

    .line 195
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 196
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->debug:Z

    .line 197
    invoke-static {}, Lcom/bytedance/android/bytehook/ByteHook;->-$$Nest$sfgetdefaultLibLoader()Lcom/bytedance/android/bytehook/ILibLoader;

    move-result-object v1

    iput-object v1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    .line 198
    iput v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->mode:I

    .line 199
    iput-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->recordable:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/bytedance/android/bytehook/ByteHook$Config;
    .locals 1

    .line 222
    new-instance v0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;

    invoke-direct {v0, p0}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;-><init>(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)V

    .line 237
    .local v0, "config":Lcom/bytedance/android/bytehook/ByteHook$Config;
    return-object v0
.end method

.method public setDebug(Z)Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;
    .locals 0
    .param p1, "debug"    # Z

    .line 202
    iput-boolean p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->debug:Z

    .line 203
    return-object p0
.end method

.method public setLibLoader(Lcom/bytedance/android/bytehook/ILibLoader;)Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;
    .locals 0
    .param p1, "libLoader"    # Lcom/bytedance/android/bytehook/ILibLoader;

    .line 207
    iput-object p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    .line 208
    return-object p0
.end method

.method public setMode(Lcom/bytedance/android/bytehook/ByteHook$Mode;)Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;
    .locals 1
    .param p1, "mode"    # Lcom/bytedance/android/bytehook/ByteHook$Mode;

    .line 212
    if-nez p1, :cond_0

    sget-object v0, Lcom/bytedance/android/bytehook/ByteHook$Mode;->AUTOMATIC:Lcom/bytedance/android/bytehook/ByteHook$Mode;

    invoke-virtual {v0}, Lcom/bytedance/android/bytehook/ByteHook$Mode;->getValue()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bytedance/android/bytehook/ByteHook$Mode;->getValue()I

    move-result v0

    :goto_0
    iput v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->mode:I

    .line 213
    return-object p0
.end method

.method public setRecordable(Z)Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;
    .locals 0
    .param p1, "recordable"    # Z

    .line 217
    iput-boolean p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->recordable:Z

    .line 218
    return-object p0
.end method
