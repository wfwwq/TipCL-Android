.class public final Lcom/pymcl/runtime/Renderers;
.super Ljava/lang/Object;
.source "Renderers.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRenderers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Renderers.kt\ncom/pymcl/runtime/Renderers\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n296#2,2:14\n*S KotlinDebug\n*F\n+ 1 Renderers.kt\ncom/pymcl/runtime/Renderers\n*L\n11#1:14,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007R\u0017\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/runtime/Renderers;",
        "",
        "<init>",
        "()V",
        "GL4ES",
        "Lcom/mio/data/Renderer;",
        "getGL4ES",
        "()Lcom/mio/data/Renderer;",
        "NG_GL4ES",
        "getNG_GL4ES",
        "ZINK",
        "getZINK",
        "ALL",
        "",
        "getALL",
        "()Ljava/util/List;",
        "byId",
        "id",
        "",
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
.field private static final ALL:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mio/data/Renderer;",
            ">;"
        }
    .end annotation
.end field

.field private static final GL4ES:Lcom/mio/data/Renderer;

.field public static final INSTANCE:Lcom/pymcl/runtime/Renderers;

.field private static final NG_GL4ES:Lcom/mio/data/Renderer;

.field private static final ZINK:Lcom/mio/data/Renderer;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lcom/pymcl/runtime/Renderers;

    invoke-direct {v0}, Lcom/pymcl/runtime/Renderers;-><init>()V

    sput-object v0, Lcom/pymcl/runtime/Renderers;->INSTANCE:Lcom/pymcl/runtime/Renderers;

    .line 7
    new-instance v1, Lcom/mio/data/Renderer;

    const/16 v15, 0x1c00

    const/16 v16, 0x0

    const-string v2, "Holy-GL4ES"

    const-string v3, ""

    const-string v4, "libgl4es_114.so"

    const-string v5, "libEGL.so"

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "f7e985d8-6d4c-f63c-d9f1-06074dab823a"

    const-string v10, ""

    const-string v11, "1.21.4"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v1 .. v16}, Lcom/mio/data/Renderer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/pymcl/runtime/Renderers;->GL4ES:Lcom/mio/data/Renderer;

    .line 8
    new-instance v2, Lcom/mio/data/Renderer;

    const/16 v16, 0x1f00

    const/16 v17, 0x0

    const-string v3, "NG-GL4ES"

    const-string v4, ""

    const-string v5, "libng_gl4es.so"

    const-string v6, "libEGL.so"

    const-string v7, ""

    const/4 v9, 0x0

    const-string v10, "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31"

    const/4 v11, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v2 .. v17}, Lcom/mio/data/Renderer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/pymcl/runtime/Renderers;->NG_GL4ES:Lcom/mio/data/Renderer;

    .line 9
    new-instance v3, Lcom/mio/data/Renderer;

    const/16 v17, 0x1f00

    const/16 v18, 0x0

    const-string v4, "Zink"

    const-string v5, ""

    const-string v6, "libglxshim.so"

    const-string v7, "libEGL_mesa.so"

    const-string v8, ""

    const/4 v10, 0x0

    const-string v11, "18d93f17-ff53-a319-fa61-58709a77bf87"

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v18}, Lcom/mio/data/Renderer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lcom/pymcl/runtime/Renderers;->ZINK:Lcom/mio/data/Renderer;

    .line 10
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mio/data/Renderer;

    const/4 v1, 0x0

    sget-object v2, Lcom/pymcl/runtime/Renderers;->GL4ES:Lcom/mio/data/Renderer;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/pymcl/runtime/Renderers;->NG_GL4ES:Lcom/mio/data/Renderer;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/pymcl/runtime/Renderers;->ZINK:Lcom/mio/data/Renderer;

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/runtime/Renderers;->ALL:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final byId(Ljava/lang/String;)Lcom/mio/data/Renderer;
    .locals 7
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lcom/pymcl/runtime/Renderers;->ALL:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 14
    .local v1, "$i$f$firstOrNull":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element$iv":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/mio/data/Renderer;

    .local v4, "it":Lcom/mio/data/Renderer;
    const/4 v5, 0x0

    .line 11
    .local v5, "$i$a$-firstOrNull-Renderers$byId$1":I
    invoke-virtual {v4}, Lcom/mio/data/Renderer;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 14
    .end local v4    # "it":Lcom/mio/data/Renderer;
    .end local v5    # "$i$a$-firstOrNull-Renderers$byId$1":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 15
    .end local v3    # "element$iv":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .line 11
    .end local v0    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull":I
    :goto_0
    check-cast v3, Lcom/mio/data/Renderer;

    if-nez v3, :cond_2

    sget-object v3, Lcom/pymcl/runtime/Renderers;->GL4ES:Lcom/mio/data/Renderer;

    :cond_2
    return-object v3
.end method

.method public final getALL()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mio/data/Renderer;",
            ">;"
        }
    .end annotation

    .line 10
    sget-object v0, Lcom/pymcl/runtime/Renderers;->ALL:Ljava/util/List;

    return-object v0
.end method

.method public final getGL4ES()Lcom/mio/data/Renderer;
    .locals 1

    .line 7
    sget-object v0, Lcom/pymcl/runtime/Renderers;->GL4ES:Lcom/mio/data/Renderer;

    return-object v0
.end method

.method public final getNG_GL4ES()Lcom/mio/data/Renderer;
    .locals 1

    .line 8
    sget-object v0, Lcom/pymcl/runtime/Renderers;->NG_GL4ES:Lcom/mio/data/Renderer;

    return-object v0
.end method

.method public final getZINK()Lcom/mio/data/Renderer;
    .locals 1

    .line 9
    sget-object v0, Lcom/pymcl/runtime/Renderers;->ZINK:Lcom/mio/data/Renderer;

    return-object v0
.end method
