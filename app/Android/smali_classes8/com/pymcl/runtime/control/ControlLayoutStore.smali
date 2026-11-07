.class public final Lcom/pymcl/runtime/control/ControlLayoutStore;
.super Ljava/lang/Object;
.source "ControlLayoutStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nControlLayoutStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ControlLayoutStore.kt\ncom/pymcl/runtime/control/ControlLayoutStore\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n12746#2:64\n13093#2,3:65\n1#3:68\n*S KotlinDebug\n*F\n+ 1 ControlLayoutStore.kt\ncom/pymcl/runtime/control/ControlLayoutStore\n*L\n19#1:64\n19#1:65,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nJ\u001a\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\nJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/pymcl/runtime/control/ControlLayoutStore;",
        "",
        "dir",
        "Ljava/io/File;",
        "<init>",
        "(Ljava/io/File;)V",
        "getDir",
        "()Ljava/io/File;",
        "fileOf",
        "name",
        "",
        "list",
        "",
        "load",
        "Lcom/pymcl/runtime/control/ControlLayout;",
        "save",
        "",
        "layout",
        "delete",
        "",
        "rename",
        "from",
        "to",
        "import",
        "input",
        "Ljava/io/InputStream;",
        "preferredName",
        "export",
        "out",
        "Ljava/io/OutputStream;",
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
.field public static final Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;


# instance fields
.field private final dir:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$n-w7RQCJKViS2ZG1hs8Xzlig0YA(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/control/ControlLayoutStore;->list$lambda$0(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/control/ControlLayoutStore;->Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1
    .param p1, "dir"    # Ljava/io/File;

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    .line 13
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 12
    return-void
.end method

.method private final fileOf(Ljava/lang/String;)Ljava/io/File;
    .locals 4
    .param p1, "name"    # Ljava/lang/String;

    .line 15
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    sget-object v2, Lcom/pymcl/runtime/control/ControlLayoutStore;->Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    invoke-virtual {v2, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".json"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic import$default(Lcom/pymcl/runtime/control/ControlLayoutStore;Ljava/io/InputStream;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 46
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/control/ControlLayoutStore;->import(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final list$lambda$0(Ljava/io/File;)Z
    .locals 5
    .param p0, "f"    # Ljava/io/File;

    .line 18
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "getName(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    const-string v4, ".json"

    invoke-static {v0, v4, v1, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "input_settings.json"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "quick_input.json"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "gamepad_map.json"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method


# virtual methods
.method public final delete(Ljava/lang/String;)Z
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->fileOf(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    return v0
.end method

.method public final export(Ljava/lang/String;Ljava/io/OutputStream;)V
    .locals 4
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "out"    # Ljava/io/OutputStream;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "out"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v1, Ljava/io/OutputStreamWriter;

    invoke-direct {v1, p2, v0}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    check-cast v1, Ljava/io/Writer;

    instance-of v0, v1, Ljava/io/BufferedWriter;

    if-eqz v0, :cond_0

    check-cast v1, Ljava/io/BufferedWriter;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/BufferedWriter;

    const/16 v2, 0x2000

    invoke-direct {v0, v1, v2}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;I)V

    move-object v1, v0

    :goto_0
    check-cast v1, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v1

    check-cast v0, Ljava/io/BufferedWriter;

    .line 68
    .local v0, "it":Ljava/io/BufferedWriter;
    const/4 v2, 0x0

    .line 56
    .local v2, "$i$a$-use-ControlLayoutStore$export$1":I
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->load(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/runtime/control/ControlLayout;->toJson()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/io/BufferedWriter;->write(Ljava/lang/String;)V

    .end local v0    # "it":Ljava/io/BufferedWriter;
    .end local v2    # "$i$a$-use-ControlLayoutStore$export$1":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "out":Ljava/io/OutputStream;
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local p1    # "name":Ljava/lang/String;
    .restart local p2    # "out":Ljava/io/OutputStream;
    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final getDir()Ljava/io/File;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    return-object v0
.end method

.method public final import(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p1, "input"    # Ljava/io/InputStream;
    .param p2, "preferredName"    # Ljava/lang/String;

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    sget-object v0, Lcom/pymcl/runtime/control/ControlLayout;->Companion:Lcom/pymcl/runtime/control/ControlLayout$Companion;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    check-cast v2, Ljava/io/Reader;

    instance-of v1, v2, Ljava/io/BufferedReader;

    if-eqz v1, :cond_0

    check-cast v2, Ljava/io/BufferedReader;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/io/BufferedReader;

    const/16 v3, 0x2000

    invoke-direct {v1, v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    move-object v2, v1

    :goto_0
    check-cast v2, Ljava/io/Reader;

    invoke-static {v2}, Lkotlin/io/TextStreamsKt;->readText(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlLayout$Companion;->fromJson(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    .line 48
    .local v0, "layout":Lcom/pymcl/runtime/control/ControlLayout;
    sget-object v1, Lcom/pymcl/runtime/control/ControlLayoutStore;->Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    if-nez p2, :cond_2

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 68
    const/4 v2, 0x0

    .line 48
    .local v2, "$i$a$-ifBlank-ControlLayoutStore$import$base$1":I
    nop

    .end local v2    # "$i$a$-ifBlank-ControlLayoutStore$import$base$1":I
    const-string v2, "imported"

    :cond_1
    check-cast v2, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v2, p2

    :goto_1
    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 49
    .local v1, "base":Ljava/lang/String;
    move-object v2, v1

    .local v2, "name":Ljava/lang/String;
    const/4 v3, 0x1

    .line 50
    .local v3, "i":I
    :goto_2
    invoke-direct {p0, v2}, Lcom/pymcl/runtime/control/ControlLayoutStore;->fileOf(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_4

    sget-object v4, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-virtual {v4}, Lcom/pymcl/runtime/control/DefaultLayouts;->getBuiltins()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    .line 51
    :cond_3
    invoke-virtual {v0, v2}, Lcom/pymcl/runtime/control/ControlLayout;->setName(Ljava/lang/String;)V

    .line 52
    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlLayoutStore;->save(Lcom/pymcl/runtime/control/ControlLayout;)V

    .line 53
    return-object v2

    .line 50
    :cond_4
    :goto_3
    add-int/lit8 v4, v3, 0x1

    .end local v3    # "i":I
    .local v4, "i":I
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "-"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move v3, v4

    goto :goto_2
.end method

.method public final list()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 19
    nop

    .line 18
    iget-object v0, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    new-instance v1, Lcom/pymcl/runtime/control/ControlLayoutStore$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/pymcl/runtime/control/ControlLayoutStore$$ExternalSyntheticLambda0;-><init>()V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 18
    nop

    .line 19
    nop

    .local v0, "$this$map$iv":[Ljava/lang/Object;
    const/4 v1, 0x0

    .line 64
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    array-length v3, v0

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 65
    .local v4, "$i$f$mapTo":I
    array-length v5, v3

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-object v7, v3, v6

    .line 66
    .local v7, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    .local v8, "it":Ljava/io/File;
    const/4 v9, 0x0

    .line 19
    .local v9, "$i$a$-map-ControlLayoutStore$list$saved$2":I
    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "getName(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, ".json"

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    .line 66
    .end local v8    # "it":Ljava/io/File;
    .end local v9    # "$i$a$-map-ControlLayoutStore$list$saved$2":I
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .end local v7    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 67
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":[Ljava/lang/Object;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 64
    nop

    .end local v0    # "$this$map$iv":[Ljava/lang/Object;
    .end local v1    # "$i$f$map":I
    goto :goto_1

    .line 19
    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    .line 18
    :cond_2
    nop

    .line 20
    .local v2, "saved":Ljava/util/List;
    sget-object v0, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/DefaultLayouts;->getBuiltins()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->sorted(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final load(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->fileOf(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 26
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/runtime/control/ControlLayoutStore;

    .line 68
    .local v1, "$this$load_u24lambda_u240":Lcom/pymcl/runtime/control/ControlLayoutStore;
    const/4 v2, 0x0

    .line 26
    .local v2, "$i$a$-runCatching-ControlLayoutStore$load$1":I
    sget-object v3, Lcom/pymcl/runtime/control/ControlLayout;->Companion:Lcom/pymcl/runtime/control/ControlLayout$Companion;

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v0, v5, v4, v5}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/pymcl/runtime/control/ControlLayout$Companion;->fromJson(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v3

    move-object v4, v3

    .line 68
    .local v4, "it":Lcom/pymcl/runtime/control/ControlLayout;
    const/4 v5, 0x0

    .line 26
    .local v5, "$i$a$-also-ControlLayoutStore$load$1$1":I
    invoke-virtual {v4, p1}, Lcom/pymcl/runtime/control/ControlLayout;->setName(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v4    # "it":Lcom/pymcl/runtime/control/ControlLayout;
    .end local v5    # "$i$a$-also-ControlLayoutStore$load$1$1":I
    return-object v3

    .end local v1    # "$this$load_u24lambda_u240":Lcom/pymcl/runtime/control/ControlLayoutStore;
    .end local v2    # "$i$a$-runCatching-ControlLayoutStore$load$1":I
    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    :cond_0
    sget-object v1, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-virtual {v1}, Lcom/pymcl/runtime/control/DefaultLayouts;->getBuiltins()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function0;

    if-nez v1, :cond_1

    new-instance v1, Lcom/pymcl/runtime/control/ControlLayoutStore$load$2;

    sget-object v2, Lcom/pymcl/runtime/control/DefaultLayouts;->INSTANCE:Lcom/pymcl/runtime/control/DefaultLayouts;

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/control/ControlLayoutStore$load$2;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    :cond_1
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/pymcl/runtime/control/ControlLayout;

    return-object v1
.end method

.method public final rename(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3
    .param p1, "from"    # Ljava/lang/String;
    .param p2, "to"    # Ljava/lang/String;

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->load(Ljava/lang/String;)Lcom/pymcl/runtime/control/ControlLayout;

    move-result-object v0

    .local v0, "l":Lcom/pymcl/runtime/control/ControlLayout;
    sget-object v1, Lcom/pymcl/runtime/control/ControlLayoutStore;->Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    invoke-virtual {v1, p2}, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/control/ControlLayout;->setName(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/runtime/control/ControlLayoutStore;->save(Lcom/pymcl/runtime/control/ControlLayout;)V

    .line 41
    sget-object v1, Lcom/pymcl/runtime/control/ControlLayoutStore;->Companion:Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore$Companion;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/control/ControlLayoutStore;->delete(Ljava/lang/String;)Z

    .line 42
    :cond_0
    const/4 v1, 0x1

    return v1
.end method

.method public final save(Lcom/pymcl/runtime/control/ControlLayout;)V
    .locals 5
    .param p1, "layout"    # Lcom/pymcl/runtime/control/ControlLayout;

    const-string v0, "layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-virtual {p1}, Lcom/pymcl/runtime/control/ControlLayout;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/pymcl/runtime/control/ControlLayoutStore;->fileOf(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 32
    .local v0, "f":Ljava/io/File;
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/pymcl/runtime/control/ControlLayoutStore;->dir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ".tmp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 33
    .local v1, "tmp":Ljava/io/File;
    invoke-virtual {p1}, Lcom/pymcl/runtime/control/ControlLayout;->toJson()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v1, v2, v3, v4, v3}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 34
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 35
    :cond_0
    return-void
.end method
