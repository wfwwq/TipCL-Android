.class public final Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
.super Ljava/lang/Object;
.source "Loaders.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/loader/LoaderInstaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LiteLoaderBuild"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u001e\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J!\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\tH\u00c6\u0003J\t\u0010 \u001a\u00020\rH\u00c6\u0003Jk\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032 \u0008\u0002\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\rH\u00c6\u0001J\u0014\u0010\"\u001a\u00020\r2\u0008\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010$\u001a\u00020%H\u00d6\u0081\u0004J\n\u0010&\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0011R)\u0010\u0008\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nj\u0002`\u000b0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
        "",
        "mc",
        "",
        "version",
        "file",
        "md5",
        "tweakClass",
        "libraries",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "snapshot",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V",
        "getMc",
        "()Ljava/lang/String;",
        "getVersion",
        "getFile",
        "getMd5",
        "getTweakClass",
        "getLibraries",
        "()Ljava/util/List;",
        "getSnapshot",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final file:Ljava/lang/String;

.field private final libraries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mc:Ljava/lang/String;

.field private final md5:Ljava/lang/String;

.field private final snapshot:Z

.field private final tweakClass:Ljava/lang/String;

.field private final version:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V
    .locals 1
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "file"    # Ljava/lang/String;
    .param p4, "md5"    # Ljava/lang/String;
    .param p5, "tweakClass"    # Ljava/lang/String;
    .param p6, "libraries"    # Ljava/util/List;
    .param p7, "snapshot"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;Z)V"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tweakClass"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "libraries"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    iput-object p2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    iput-object p3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    iput-object p4, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    iput-object p5, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    .line 282
    iput-object p6, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    iput-boolean p7, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    .line 281
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-boolean p7, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;Z)",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tweakClass"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "libraries"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    return v2

    :cond_5
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    return v2

    :cond_6
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    return v2

    :cond_7
    iget-boolean v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    iget-boolean v1, v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    if-eq v3, v1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getFile()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    return-object v0
.end method

.method public final getLibraries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 282
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    return-object v0
.end method

.method public final getMc()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    return-object v0
.end method

.method public final getMd5()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    return-object v0
.end method

.method public final getSnapshot()Z
    .locals 1

    .line 282
    iget-boolean v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    return v0
.end method

.method public final getTweakClass()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    .line 281
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v1, v3

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->mc:Ljava/lang/String;

    iget-object v1, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->version:Ljava/lang/String;

    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->file:Ljava/lang/String;

    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->md5:Ljava/lang/String;

    iget-object v4, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->tweakClass:Ljava/lang/String;

    iget-object v5, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->libraries:Ljava/util/List;

    iget-boolean v6, p0, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->snapshot:Z

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "LiteLoaderBuild(mc="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", version="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", file="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", md5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tweakClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", libraries="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", snapshot="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
