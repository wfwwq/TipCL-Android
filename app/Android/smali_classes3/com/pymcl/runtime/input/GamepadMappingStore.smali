.class public final Lcom/pymcl/runtime/input/GamepadMappingStore;
.super Ljava/lang/Object;
.source "GamepadMapping.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGamepadMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GamepadMapping.kt\ncom/pymcl/runtime/input/GamepadMappingStore\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/runtime/input/GamepadMappingStore;",
        "",
        "file",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "getFile",
        "()Ljava/io/File;",
        "load",
        "Lcom/pymcl/runtime/input/GamepadMapping;",
        "save",
        "",
        "m",
        "reset",
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
.field private final file:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "file"    # Ljava/io/File;

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final getFile()Ljava/io/File;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    return-object v0
.end method

.method public final load()Lcom/pymcl/runtime/input/GamepadMapping;
    .locals 6

    .line 111
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/input/GamepadMappingStore;

    .line 125
    .local v0, "$this$load_u24lambda_u240":Lcom/pymcl/runtime/input/GamepadMappingStore;
    const/4 v1, 0x0

    .line 111
    .local v1, "$i$a$-runCatching-GamepadMappingStore$load$1":I
    sget-object v2, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    iget-object v3, v0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v5}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->fromJson(Ljava/lang/String;)Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v2

    .end local v0    # "$this$load_u24lambda_u240":Lcom/pymcl/runtime/input/GamepadMappingStore;
    .end local v1    # "$i$a$-runCatching-GamepadMappingStore$load$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_1

    .line 125
    .local v1, "it":Ljava/lang/Throwable;
    :cond_0
    const/4 v0, 0x0

    .line 111
    .local v0, "$i$a$-getOrElse-GamepadMappingStore$load$2":I
    sget-object v2, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    invoke-virtual {v2}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->default()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v2

    move-object v0, v2

    .end local v0    # "$i$a$-getOrElse-GamepadMappingStore$load$2":I
    .end local v1    # "it":Ljava/lang/Throwable;
    :goto_1
    check-cast v0, Lcom/pymcl/runtime/input/GamepadMapping;

    goto :goto_2

    .line 112
    :cond_1
    sget-object v0, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->default()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public final reset()Lcom/pymcl/runtime/input/GamepadMapping;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    sget-object v0, Lcom/pymcl/runtime/input/GamepadMapping;->Companion:Lcom/pymcl/runtime/input/GamepadMapping$Companion;

    invoke-virtual {v0}, Lcom/pymcl/runtime/input/GamepadMapping$Companion;->default()Lcom/pymcl/runtime/input/GamepadMapping;

    move-result-object v0

    return-object v0
.end method

.method public final save(Lcom/pymcl/runtime/input/GamepadMapping;)V
    .locals 4
    .param p1, "m"    # Lcom/pymcl/runtime/input/GamepadMapping;

    const-string v0, "m"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 116
    :cond_0
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

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

    .line 117
    .local v0, "tmp":Ljava/io/File;
    invoke-virtual {p1}, Lcom/pymcl/runtime/input/GamepadMapping;->toJson()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 118
    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    iget-object v1, p0, Lcom/pymcl/runtime/input/GamepadMappingStore;->file:Ljava/io/File;

    invoke-virtual {v0, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 119
    :cond_1
    return-void
.end method
