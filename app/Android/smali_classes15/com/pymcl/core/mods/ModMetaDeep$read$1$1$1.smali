.class final synthetic Lcom/pymcl/core/mods/ModMetaDeep$read$1$1$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "ModConflicts.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/core/mods/ModMetaDeep;->read(Ljava/io/File;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1018
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "[B>;"
    }
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


# instance fields
.field final synthetic $z:Ljava/util/zip/ZipFile;


# direct methods
.method constructor <init>(Ljava/util/zip/ZipFile;)V
    .locals 6

    iput-object p1, p0, Lcom/pymcl/core/mods/ModMetaDeep$read$1$1$1;->$z:Ljava/util/zip/ZipFile;

    const-class v2, Lkotlin/jvm/internal/Intrinsics$Kotlin;

    const-string v4, "read$lambda$0$0$bytes(Ljava/util/zip/ZipFile;Ljava/lang/String;)[B"

    const/4 v5, 0x0

    const/4 v1, 0x1

    const-string v3, "bytes"

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1, "p1"    # Ljava/lang/Object;

    .line 141
    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/pymcl/core/mods/ModMetaDeep$read$1$1$1;->invoke(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Ljava/lang/String;)[B
    .locals 1
    .param p1, "p0"    # Ljava/lang/String;

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    iget-object v0, p0, Lcom/pymcl/core/mods/ModMetaDeep$read$1$1$1;->$z:Ljava/util/zip/ZipFile;

    invoke-static {v0, p1}, Lcom/pymcl/core/mods/ModMetaDeep;->access$read$lambda$0$0$bytes(Ljava/util/zip/ZipFile;Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
