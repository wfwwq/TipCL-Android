.class public final Lcom/mio/plugin/NativeLibPlugin;
.super Ljava/lang/Object;
.source "NativeLibPlugin.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007b\u0002\u0008\u0007J\u0018\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0007b\u0002\u0008\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/mio/plugin/NativeLibPlugin;",
        "",
        "<init>",
        "()V",
        "getPaths",
        "",
        "split",
        "Lkotlin/jvm/JvmStatic;",
        "getJVMEnv",
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
.field public static final INSTANCE:Lcom/mio/plugin/NativeLibPlugin;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mio/plugin/NativeLibPlugin;

    invoke-direct {v0}, Lcom/mio/plugin/NativeLibPlugin;-><init>()V

    sput-object v0, Lcom/mio/plugin/NativeLibPlugin;->INSTANCE:Lcom/mio/plugin/NativeLibPlugin;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final getJVMEnv()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 12
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static final getPaths(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "split"    # Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "split"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    const-string v0, ""

    return-object v0
.end method
