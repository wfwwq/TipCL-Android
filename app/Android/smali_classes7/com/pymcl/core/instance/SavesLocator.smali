.class public final Lcom/pymcl/core/instance/SavesLocator;
.super Ljava/lang/Object;
.source "Saves.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSaves.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SavesLocator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,279:1\n1#2:280\n2068#3,2:281\n*S KotlinDebug\n*F\n+ 1 Saves.kt\ncom/pymcl/core/instance/SavesLocator\n*L\n51#1:281,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u001c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/pymcl/core/instance/SavesLocator;",
        "",
        "<init>",
        "()V",
        "gameDir",
        "Ljava/io/File;",
        "instance",
        "Lcom/pymcl/core/instance/Instance;",
        "version",
        "",
        "defaultIsolation",
        "targets",
        "",
        "Lcom/pymcl/core/instance/SaveTarget;",
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
.field public static final INSTANCE:Lcom/pymcl/core/instance/SavesLocator;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/instance/SavesLocator;

    invoke-direct {v0}, Lcom/pymcl/core/instance/SavesLocator;-><init>()V

    sput-object v0, Lcom/pymcl/core/instance/SavesLocator;->INSTANCE:Lcom/pymcl/core/instance/SavesLocator;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .param p1, "instance"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "defaultIsolation"    # Ljava/lang/String;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultIsolation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1, p2}, Lcom/pymcl/core/instance/Instance;->versionDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    move-object v1, p3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    .line 280
    const/4 v1, 0x0

    .line 46
    .local v1, "$i$a$-ifEmpty-SavesLocator$gameDir$1":I
    nop

    .end local v1    # "$i$a$-ifEmpty-SavesLocator$gameDir$1":I
    const-string v1, "all"

    :cond_2
    check-cast v1, Ljava/lang/String;

    new-instance v2, Lcom/pymcl/core/instance/VersionSettings;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/core/instance/VersionSettings;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    :goto_1
    return-object v0
.end method

.method public final targets(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/util/List;
    .locals 11
    .param p1, "instance"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "defaultIsolation"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/instance/Instance;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/SaveTarget;",
            ">;"
        }
    .end annotation

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultIsolation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x1

    new-array v1, v0, [Lcom/pymcl/core/instance/SaveTarget;

    new-instance v2, Lcom/pymcl/core/instance/SaveTarget;

    const-string v3, ""

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/pymcl/core/instance/SaveTarget;-><init>(Ljava/lang/String;Ljava/io/File;)V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .local v1, "out":Ljava/util/List;
    new-array v0, v0, [Ljava/io/File;

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v2

    aput-object v2, v0, v3

    invoke-static {v0}, Lkotlin/collections/SetsKt;->hashSetOf([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    .line 51
    .local v0, "seen":Ljava/util/HashSet;
    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 281
    .local v3, "$i$f$forEach":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Ljava/lang/String;

    .local v6, "v":Ljava/lang/String;
    const/4 v7, 0x0

    .line 51
    .local v7, "$i$a$-forEach-SavesLocator$targets$1":I
    sget-object v8, Lcom/pymcl/core/instance/SavesLocator;->INSTANCE:Lcom/pymcl/core/instance/SavesLocator;

    invoke-virtual {v8, p1, v6, p2}, Lcom/pymcl/core/instance/SavesLocator;->gameDir(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    .line 52
    .local v8, "gd":Ljava/io/File;
    invoke-virtual {v8}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    move-object v9, v1

    check-cast v9, Ljava/util/Collection;

    new-instance v10, Lcom/pymcl/core/instance/SaveTarget;

    invoke-direct {v10, v6, v8}, Lcom/pymcl/core/instance/SaveTarget;-><init>(Ljava/lang/String;Ljava/io/File;)V

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 281
    .end local v6    # "v":Ljava/lang/String;
    .end local v7    # "$i$a$-forEach-SavesLocator$targets$1":I
    .end local v8    # "gd":Ljava/io/File;
    :cond_0
    nop

    .end local v5    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 282
    :cond_1
    nop

    .line 53
    .end local v2    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$forEach":I
    return-object v1
.end method
