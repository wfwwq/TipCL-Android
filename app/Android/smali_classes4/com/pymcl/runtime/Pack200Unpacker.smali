.class public final Lcom/pymcl/runtime/Pack200Unpacker;
.super Ljava/lang/Object;
.source "Pack200Unpacker.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/Pack200Unpacker$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPack200Unpacker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pack200Unpacker.kt\ncom/pymcl/runtime/Pack200Unpacker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1739#2:57\n1814#2,3:58\n1#3:61\n*S KotlinDebug\n*F\n+ 1 Pack200Unpacker.kt\ncom/pymcl/runtime/Pack200Unpacker\n*L\n22#1:57\n22#1:58,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012>\u0008\u0002\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0014\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0010\u001a\u00020\u0003J\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000RD\u0010\u0004\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000c0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/runtime/Pack200Unpacker;",
        "",
        "unpackBinary",
        "Ljava/io/File;",
        "exec",
        "Lkotlin/Function2;",
        "",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "cmd",
        "workDir",
        "",
        "<init>",
        "(Ljava/io/File;Lkotlin/jvm/functions/Function2;)V",
        "unpackAll",
        "javaDir",
        "unpackOne",
        "pack",
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
.field public static final BINARY_NAME:Ljava/lang/String; = "libunpack200.so"

.field public static final Companion:Lcom/pymcl/runtime/Pack200Unpacker$Companion;


# instance fields
.field private final exec:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final unpackBinary:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/Pack200Unpacker$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/Pack200Unpacker$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/Pack200Unpacker;->Companion:Lcom/pymcl/runtime/Pack200Unpacker$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1, "unpackBinary"    # Ljava/io/File;
    .param p2, "exec"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;-",
            "Ljava/io/File;",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "unpackBinary"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "exec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/pymcl/runtime/Pack200Unpacker;->unpackBinary:Ljava/io/File;

    .line 15
    iput-object p2, p0, Lcom/pymcl/runtime/Pack200Unpacker;->exec:Lkotlin/jvm/functions/Function2;

    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 13
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 15
    new-instance p2, Lcom/pymcl/runtime/Pack200Unpacker$1;

    sget-object p3, Lcom/pymcl/runtime/Pack200Unpacker;->Companion:Lcom/pymcl/runtime/Pack200Unpacker$Companion;

    invoke-direct {p2, p3}, Lcom/pymcl/runtime/Pack200Unpacker$1;-><init>(Ljava/lang/Object;)V

    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/pymcl/runtime/Pack200Unpacker;-><init>(Ljava/io/File;Lkotlin/jvm/functions/Function2;)V

    .line 16
    return-void
.end method


# virtual methods
.method public final unpackAll(Ljava/io/File;)Ljava/util/List;
    .locals 10
    .param p1, "javaDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const-string v0, "javaDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    sget-object v0, Lcom/pymcl/runtime/Pack200Unpacker;->Companion:Lcom/pymcl/runtime/Pack200Unpacker$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/Pack200Unpacker$Companion;->findPackFiles(Ljava/io/File;)Ljava/util/List;

    move-result-object v0

    .line 20
    .local v0, "packs":Ljava/util/List;
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    return-object v1

    .line 21
    :cond_0
    iget-object v1, p0, Lcom/pymcl/runtime/Pack200Unpacker;->unpackBinary:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 22
    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 57
    .local v2, "$i$f$map":I
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 58
    .local v5, "$i$f$mapTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 59
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/io/File;

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 22
    .local v9, "$i$a$-map-Pack200Unpacker$unpackAll$1":I
    invoke-virtual {p0, v8}, Lcom/pymcl/runtime/Pack200Unpacker;->unpackOne(Ljava/io/File;)Ljava/io/File;

    move-result-object v8

    .line 59
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-map-Pack200Unpacker$unpackAll$1":I
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 60
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapTo":I
    check-cast v3, Ljava/util/List;

    .line 57
    nop

    .line 22
    .end local v1    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map":I
    return-object v3

    .line 21
    :cond_2
    new-instance v1, Ljava/io/IOException;

    iget-object v2, p0, Lcom/pymcl/runtime/Pack200Unpacker;->unpackBinary:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u627e\u4e0d\u5230 "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "\uff08\u9700 extractNativeLibs=true\uff09"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final unpackOne(Ljava/io/File;)Ljava/io/File;
    .locals 14
    .param p1, "pack"    # Ljava/io/File;

    const-string v0, "pack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    sget-object v0, Lcom/pymcl/runtime/Pack200Unpacker;->Companion:Lcom/pymcl/runtime/Pack200Unpacker$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/Pack200Unpacker$Companion;->jarFor(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 27
    .local v0, "jar":Ljava/io/File;
    const/4 v1, 0x0

    .line 28
    .local v1, "last":Ljava/lang/Object;
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x3

    if-ge v3, v4, :cond_6

    move v5, v3

    .local v5, "attempt":I
    const/4 v6, 0x0

    .line 29
    .local v6, "$i$a$-repeat-Pack200Unpacker$unpackOne$1":I
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 30
    const/4 v7, 0x2

    :try_start_0
    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v8, p0

    check-cast v8, Lcom/pymcl/runtime/Pack200Unpacker;

    .line 61
    .local v8, "$this$unpackOne_u24lambda_u240_u240":Lcom/pymcl/runtime/Pack200Unpacker;
    const/4 v9, 0x0

    .line 30
    .local v9, "$i$a$-runCatching-Pack200Unpacker$unpackOne$1$code$1":I
    iget-object v10, v8, Lcom/pymcl/runtime/Pack200Unpacker;->exec:Lkotlin/jvm/functions/Function2;

    const/4 v11, 0x4

    new-array v11, v11, [Ljava/lang/String;

    iget-object v12, v8, Lcom/pymcl/runtime/Pack200Unpacker;->unpackBinary:Ljava/io/File;

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v2

    const-string v12, "-r"

    const/4 v13, 0x1

    aput-object v12, v11, v13

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v7

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v4

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iget-object v11, v8, Lcom/pymcl/runtime/Pack200Unpacker;->unpackBinary:Ljava/io/File;

    invoke-virtual {v11}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v11

    if-nez v11, :cond_0

    new-instance v11, Ljava/io/File;

    const-string v12, "."

    invoke-direct {v11, v12}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-interface {v10, v4, v11}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .end local v8    # "$this$unpackOne_u24lambda_u240_u240":Lcom/pymcl/runtime/Pack200Unpacker;
    .end local v9    # "$i$a$-runCatching-Pack200Unpacker$unpackOne$1$code$1":I
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v4

    sget-object v8, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    .line 31
    :goto_1
    invoke-static {v4}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_1

    goto :goto_2

    .line 61
    .local v8, "it":Ljava/lang/Throwable;
    :cond_1
    const/4 v4, 0x0

    .line 31
    .local v4, "$i$a$-getOrElse-Pack200Unpacker$unpackOne$1$code$2":I
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v4, -0x1

    .end local v4    # "$i$a$-getOrElse-Pack200Unpacker$unpackOne$1$code$2":I
    .end local v8    # "it":Ljava/lang/Throwable;
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_2
    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    .line 30
    nop

    .line 32
    .local v4, "code":I
    if-nez v4, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v8, v8, v10

    if-lez v8, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object v0

    .line 33
    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "exit="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ", jar="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 34
    :cond_3
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v8

    if-eqz v8, :cond_5

    .line 35
    if-ge v5, v7, :cond_4

    const-wide/16 v7, 0xc8

    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V

    .line 36
    :cond_4
    nop

    .line 28
    .end local v4    # "code":I
    .end local v5    # "attempt":I
    .end local v6    # "$i$a$-repeat-Pack200Unpacker$unpackOne$1":I
    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 37
    :cond_6
    new-instance v2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "unpack200 \u5931\u8d25\uff1a"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\uff08"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "\uff09"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
.end method
