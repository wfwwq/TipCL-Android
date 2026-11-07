.class public final Lcom/pymcl/core/auth/OfflineSkins;
.super Ljava/lang/Object;
.source "SkinServer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSkinServer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkinServer.kt\ncom/pymcl/core/auth/OfflineSkins\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,220:1\n1#2:221\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/pymcl/core/auth/OfflineSkins;",
        "",
        "<init>",
        "()V",
        "customFile",
        "Ljava/io/File;",
        "skin",
        "",
        "skinsDir",
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
.field public static final INSTANCE:Lcom/pymcl/core/auth/OfflineSkins;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/auth/OfflineSkins;

    invoke-direct {v0}, Lcom/pymcl/core/auth/OfflineSkins;-><init>()V

    sput-object v0, Lcom/pymcl/core/auth/OfflineSkins;->INSTANCE:Lcom/pymcl/core/auth/OfflineSkins;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 213
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final customFile(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    .locals 4
    .param p1, "skin"    # Ljava/lang/String;
    .param p2, "skinsDir"    # Ljava/io/File;

    const-string v0, "skin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skinsDir"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "default"

    aput-object v3, v0, v2

    const/4 v2, 0x1

    const-string v3, "steve"

    aput-object v3, v0, v2

    const/4 v2, 0x2

    const-string v3, "alex"

    aput-object v3, v0, v2

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 216
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 221
    .local v0, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 216
    .local v2, "$i$a$-let-OfflineSkins$customFile$f$1":I
    invoke-virtual {v0}, Ljava/io/File;->isAbsolute()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v0, v3

    .line 217
    .end local v2    # "$i$a$-let-OfflineSkins$customFile$f$1":I
    .local v0, "f":Ljava/io/File;
    :goto_0
    move-object v2, v0

    .line 221
    .local v2, "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 217
    .local v3, "$i$a$-takeIf-OfflineSkins$customFile$1":I
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v2

    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-takeIf-OfflineSkins$customFile$1":I
    if-eqz v2, :cond_2

    move-object v1, v0

    :cond_2
    return-object v1

    .line 215
    .end local v0    # "f":Ljava/io/File;
    :cond_3
    :goto_1
    return-object v1
.end method
