.class public final Lcom/pymcl/core/loader/UnavailableJavaRunner;
.super Ljava/lang/Object;
.source "Loaders.kt"

# interfaces
.implements Lcom/pymcl/core/loader/JavaProcessRunner;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JX\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\n\u001a\u00020\u000b2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/core/loader/UnavailableJavaRunner;",
        "Lcom/pymcl/core/loader/JavaProcessRunner;",
        "<init>",
        "()V",
        "run",
        "",
        "javaMajor",
        "classpath",
        "",
        "Ljava/io/File;",
        "mainClass",
        "",
        "args",
        "workDir",
        "timeoutSec",
        "",
        "log",
        "Lkotlin/Function1;",
        "",
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
.field public static final INSTANCE:Lcom/pymcl/core/loader/UnavailableJavaRunner;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/loader/UnavailableJavaRunner;

    invoke-direct {v0}, Lcom/pymcl/core/loader/UnavailableJavaRunner;-><init>()V

    sput-object v0, Lcom/pymcl/core/loader/UnavailableJavaRunner;->INSTANCE:Lcom/pymcl/core/loader/UnavailableJavaRunner;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run(ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;)I
    .locals 4
    .param p1, "javaMajor"    # I
    .param p2, "classpath"    # Ljava/util/List;
    .param p3, "mainClass"    # Ljava/lang/String;
    .param p4, "args"    # Ljava/util/List;
    .param p5, "workDir"    # Ljava/io/File;
    .param p6, "timeoutSec"    # J
    .param p8, "log"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            "J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)I"
        }
    .end annotation

    const-string v0, "classpath"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mainClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "args"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workDir"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const/4 v1, 0x0

    const/4 v2, 0x2

    const-string v3, "\u5f53\u524d\u6784\u5efa\u672a\u63a5\u5165 :runtime \u7684 Java \u5b50\u8fdb\u7a0b\u6267\u884c\u5668\uff0c\u65e0\u6cd5\u8fd0\u884c Forge/NeoForge \u5b89\u88c5\u5904\u7406\u5668"

    invoke-direct {v0, v3, v1, v2, v1}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method
