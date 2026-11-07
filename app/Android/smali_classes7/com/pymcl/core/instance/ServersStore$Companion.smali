.class public final Lcom/pymcl/core/instance/ServersStore$Companion;
.super Ljava/lang/Object;
.source "Playtime.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/core/instance/ServersStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPlaytime.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Playtime.kt\ncom/pymcl/core/instance/ServersStore$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/core/instance/ServersStore$Companion;",
        "",
        "<init>",
        "()V",
        "forInstance",
        "Lcom/pymcl/core/instance/ServersStore;",
        "inst",
        "Lcom/pymcl/core/instance/Instance;",
        "versionId",
        "",
        "defaultIsolation",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/core/instance/ServersStore$Companion;-><init>()V

    return-void
.end method

.method public static synthetic forInstance$default(Lcom/pymcl/core/instance/ServersStore$Companion;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/instance/ServersStore;
    .locals 0

    .line 40
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const-string p3, "all"

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/core/instance/ServersStore$Companion;->forInstance(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/instance/ServersStore;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final forInstance(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/instance/ServersStore;
    .locals 5
    .param p1, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "versionId"    # Ljava/lang/String;
    .param p3, "defaultIsolation"    # Ljava/lang/String;

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultIsolation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object v1, p2

    .line 72
    .local v1, "it":Ljava/lang/String;
    const/4 v2, 0x0

    .line 41
    .local v2, "$i$a$-takeIf-ServersStore$Companion$forInstance$vid$1":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    .end local v1    # "it":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-ServersStore$Companion$forInstance$vid$1":I
    if-nez v3, :cond_0

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_4

    .line 42
    :cond_1
    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->meta()Ljava/util/Map;

    move-result-object v1

    const-string v2, "mc_version"

    invoke-static {v1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    move-object v2, v1

    .line 72
    .local v2, "it":Ljava/lang/String;
    const/4 v3, 0x0

    .line 42
    .local v3, "$i$a$-takeIf-ServersStore$Companion$forInstance$vid$2":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-ServersStore$Companion$forInstance$vid$2":I
    if-nez v4, :cond_2

    move-object v0, v1

    .line 41
    :cond_2
    if-nez v0, :cond_3

    .line 43
    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->versions()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    .line 41
    if-nez v1, :cond_4

    .line 43
    const-string v1, ""

    goto :goto_1

    .line 41
    :cond_3
    move-object v1, v0

    :cond_4
    :goto_1
    nop

    .line 44
    .local v1, "vid":Ljava/lang/String;
    move-object v0, v1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    goto :goto_3

    :cond_6
    new-instance v0, Lcom/pymcl/core/instance/VersionSettings;

    invoke-virtual {p1, v1}, Lcom/pymcl/core/instance/Instance;->versionDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-direct {v0, v2, p3}, Lcom/pymcl/core/instance/VersionSettings;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    .line 45
    .local v0, "gameDir":Ljava/io/File;
    :goto_3
    new-instance v2, Lcom/pymcl/core/instance/ServersStore;

    invoke-direct {v2, v0}, Lcom/pymcl/core/instance/ServersStore;-><init>(Ljava/io/File;)V

    return-object v2
.end method
