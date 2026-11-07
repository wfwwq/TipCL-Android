.class Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;
.super Ljava/lang/Object;
.source "ByteHook.java"

# interfaces
.implements Lcom/bytedance/android/bytehook/ByteHook$Config;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->build()Lcom/bytedance/android/bytehook/ByteHook$Config;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private debug:Z

.field private libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

.field private mode:I

.field private recordable:Z

.field final synthetic this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;


# direct methods
.method constructor <init>(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)V
    .locals 1
    .param p1, "this$0"    # Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    .line 222
    iput-object p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 223
    iget-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->-$$Nest$fgetdebug(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->debug:Z

    .line 224
    iget-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->-$$Nest$fgetlibLoader(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Lcom/bytedance/android/bytehook/ILibLoader;

    move-result-object v0

    iput-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    .line 225
    iget-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->-$$Nest$fgetmode(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)I

    move-result v0

    iput v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->mode:I

    .line 226
    iget-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->this$0:Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;

    invoke-static {v0}, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;->-$$Nest$fgetrecordable(Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->recordable:Z

    return-void
.end method


# virtual methods
.method public getDebug()Z
    .locals 1

    .line 228
    iget-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->debug:Z

    return v0
.end method

.method public getLibLoader()Lcom/bytedance/android/bytehook/ILibLoader;
    .locals 1

    .line 230
    iget-object v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    return-object v0
.end method

.method public getMode()I
    .locals 1

    .line 232
    iget v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->mode:I

    return v0
.end method

.method public getRecordable()Z
    .locals 1

    .line 234
    iget-boolean v0, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->recordable:Z

    return v0
.end method

.method public setDebug(Z)V
    .locals 0
    .param p1, "d"    # Z

    .line 229
    iput-boolean p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->debug:Z

    return-void
.end method

.method public setLibLoader(Lcom/bytedance/android/bytehook/ILibLoader;)V
    .locals 0
    .param p1, "l"    # Lcom/bytedance/android/bytehook/ILibLoader;

    .line 231
    iput-object p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->libLoader:Lcom/bytedance/android/bytehook/ILibLoader;

    return-void
.end method

.method public setMode(I)V
    .locals 0
    .param p1, "m"    # I

    .line 233
    iput p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->mode:I

    return-void
.end method

.method public setRecordable(Z)V
    .locals 0
    .param p1, "r"    # Z

    .line 235
    iput-boolean p1, p0, Lcom/bytedance/android/bytehook/ByteHook$ConfigBuilder$1;->recordable:Z

    return-void
.end method
