.class public final Lcom/pymcl/android/data/LaunchConfigLogic;
.super Ljava/lang/Object;
.source "LaunchConfigIO.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/LaunchConfigLogic$Display;,
        Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchConfigIO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchConfigIO.kt\ncom/pymcl/android/data/LaunchConfigLogic\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,175:1\n363#2,7:176\n1#3:183\n635#4,7:184\n*S KotlinDebug\n*F\n+ 1 LaunchConfigIO.kt\ncom/pymcl/android/data/LaunchConfigLogic\n*L\n36#1:176,7\n113#1:184,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0008\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002@AB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u001eJ6\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u000b2\u0008\u0010&\u001a\u0004\u0018\u00010\u00062\u0008\u0010\'\u001a\u0004\u0018\u00010\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020*0)J\u0019\u0010+\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0002\u0010,J4\u0010-\u001a\u00020.2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0016\u00101\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000100J\u0018\u00102\u001a\u0004\u0018\u00010\u00062\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006J\u001c\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0006\u00106\u001a\u00020.J2\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001002\u0006\u00106\u001a\u00020.2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000100J(\u00108\u001a\u0002092\u0006\u0010/\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u00062\u0006\u00106\u001a\u00020.J \u0010>\u001a\u00020.2\u0006\u0010/\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020\u0006J\u0016\u0010?\u001a\u0002092\u0006\u0010;\u001a\u00020<2\u0006\u0010\u001b\u001a\u00020\u000bR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0010R\u000e\u0010\u001f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008C\u0012\u0008\u0008D\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006B"
    }
    d2 = {
        "Lcom/pymcl/android/data/LaunchConfigLogic;",
        "",
        "<init>",
        "()V",
        "JAVA_OPTIONS",
        "",
        "",
        "getJAVA_OPTIONS",
        "()Ljava/util/List;",
        "JAVA_AUTO",
        "MEM_MIN",
        "",
        "MEM_STEP",
        "WIDTH_RANGE",
        "Lkotlin/ranges/IntRange;",
        "getWIDTH_RANGE",
        "()Lkotlin/ranges/IntRange;",
        "HEIGHT_RANGE",
        "getHEIGHT_RANGE",
        "memMax",
        "totalMb",
        "",
        "clampMem",
        "v",
        "max",
        "javaIndex",
        "javaValue",
        "index",
        "current",
        "javaMajorOverride",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "JAVA_NOTE_UNAVAILABLE",
        "JAVA_NOTE_TOO_LOW",
        "JAVA_NOTE_BY_VERSION",
        "JAVA_NOTE_BY_INSTANCE",
        "resolveJava",
        "Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;",
        "auto",
        "versionJava",
        "instanceJava",
        "available",
        "Lkotlin/Function1;",
        "",
        "num",
        "(Ljava/lang/Object;)Ljava/lang/Integer;",
        "effective",
        "Lcom/pymcl/android/data/LaunchConfigLogic$Display;",
        "config",
        "",
        "version",
        "validateRes",
        "w",
        "h",
        "configChanges",
        "d",
        "versionChanges",
        "saveDisplay",
        "",
        "Lcom/pymcl/core/config/ConfigStore;",
        "inst",
        "Lcom/pymcl/core/instance/Instance;",
        "versionId",
        "loadDisplay",
        "saveJava",
        "JavaPick",
        "Display",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I = 0x0

.field private static final HEIGHT_RANGE:Lkotlin/ranges/IntRange;

.field public static final INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

.field public static final JAVA_AUTO:Ljava/lang/String; = "\u81ea\u52a8\u9009\u62e9"

.field public static final JAVA_NOTE_BY_INSTANCE:Ljava/lang/String; = "\u6309\u5b9e\u4f8b\u8bbe\u7f6e\u4f7f\u7528 Java {0}\uff08\u81ea\u52a8\u4e3a Java {1}\uff09"

.field public static final JAVA_NOTE_BY_VERSION:Ljava/lang/String; = "\u6309\u7248\u672c\u8bbe\u7f6e\u4f7f\u7528 Java {0}\uff08\u81ea\u52a8\u4e3a Java {1}\uff09"

.field public static final JAVA_NOTE_TOO_LOW:Ljava/lang/String; = "\u6240\u9009 Java {0} \u4f4e\u4e8e\u8be5\u7248\u672c\u6700\u4f4e\u9700\u6c42 Java {1}\uff0c\u6539\u7528\u81ea\u52a8\u9009\u62e9"

.field public static final JAVA_NOTE_UNAVAILABLE:Ljava/lang/String; = "\u8fd0\u884c\u65f6\u672a\u5185\u7f6e Java {0}\uff0c\u6539\u7528\u81ea\u52a8\u9009\u62e9\uff08Java {1}\uff09"

.field private static final JAVA_OPTIONS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final MEM_MIN:I = 0x200

.field public static final MEM_STEP:I = 0x100

.field private static final WIDTH_RANGE:Lkotlin/ranges/IntRange;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/LaunchConfigLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    .line 19
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "\u81ea\u52a8\u9009\u62e9"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "Java 8"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "Java 17"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "Java 21"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    .line 23
    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0x140

    const/16 v2, 0x1e00

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->WIDTH_RANGE:Lkotlin/ranges/IntRange;

    .line 24
    new-instance v0, Lkotlin/ranges/IntRange;

    const/16 v1, 0xf0

    const/16 v2, 0x10e0

    invoke-direct {v0, v1, v2}, Lkotlin/ranges/IntRange;-><init>(II)V

    sput-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->HEIGHT_RANGE:Lkotlin/ranges/IntRange;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final num(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 2
    .param p1, "v"    # Ljava/lang/Object;

    .line 77
    instance-of v0, p1, Ljava/lang/Number;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    :cond_3
    :goto_2
    return-object v1
.end method


# virtual methods
.method public final clampMem(II)I
    .locals 2
    .param p1, "v"    # I
    .param p2, "max"    # I

    .line 30
    const/16 v0, 0x200

    invoke-static {p1, v0, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v1

    add-int/lit16 v1, v1, 0x80

    div-int/lit16 v1, v1, 0x100

    mul-int/lit16 v1, v1, 0x100

    invoke-static {v1, v0, p2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    return v0
.end method

.method public final configChanges(Lcom/pymcl/android/data/LaunchConfigLogic$Display;)Ljava/util/Map;
    .locals 3
    .param p1, "d"    # Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LaunchConfigLogic$Display;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x3

    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "memory_mb"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getWidth()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "width"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getHeight()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "height"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final effective(Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .locals 8
    .param p1, "config"    # Ljava/util/Map;
    .param p2, "version"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/pymcl/android/data/LaunchConfigLogic$Display;"
        }
    .end annotation

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    const-string v0, "memory_mb"

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    move-object v2, p2

    .line 183
    .local v2, "it\\1":Ljava/util/Map;
    const/4 v3, 0x0

    .line 81
    .local v3, "$i$a$-let-LaunchConfigLogic$effective$vm$1\\1\\81\\0":I
    sget-object v4, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v2

    .end local v2    # "it\\1":Ljava/util/Map;
    .end local v3    # "$i$a$-let-LaunchConfigLogic$effective$vm$1\\1\\81\\0":I
    goto :goto_0

    :cond_0
    move-object v2, v1

    .local v2, "vm":Ljava/lang/Integer;
    :goto_0
    if-eqz p2, :cond_1

    move-object v3, p2

    .line 183
    .local v3, "it\\2":Ljava/util/Map;
    const/4 v4, 0x0

    .line 81
    .local v4, "$i$a$-let-LaunchConfigLogic$effective$vw$1\\2\\81\\0":I
    sget-object v5, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const-string v6, "window_width"

    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v3

    .end local v3    # "it\\2":Ljava/util/Map;
    .end local v4    # "$i$a$-let-LaunchConfigLogic$effective$vw$1\\2\\81\\0":I
    goto :goto_1

    :cond_1
    move-object v3, v1

    .local v3, "vw":Ljava/lang/Integer;
    :goto_1
    if-eqz p2, :cond_2

    move-object v1, p2

    .line 183
    .local v1, "it\\3":Ljava/util/Map;
    const/4 v4, 0x0

    .line 81
    .local v4, "$i$a$-let-LaunchConfigLogic$effective$vh$1\\3\\81\\0":I
    sget-object v5, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const-string v6, "window_height"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v5, v6}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v1

    .line 82
    .end local v4    # "$i$a$-let-LaunchConfigLogic$effective$vh$1\\3\\81\\0":I
    .local v1, "vh":Ljava/lang/Integer;
    :cond_2
    new-instance v4, Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    .line 83
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_4
    const/16 v0, 0x1000

    .line 84
    :goto_2
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_3

    :cond_5
    const-string v5, "width"

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {p0, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_3

    :cond_6
    const/16 v5, 0x356

    .line 85
    :goto_3
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_4

    :cond_7
    const-string v6, "height"

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {p0, v6}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_4

    :cond_8
    const/16 v6, 0x1e0

    .line 86
    :goto_4
    if-nez v2, :cond_a

    if-nez v3, :cond_a

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    const/4 v7, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v7, 0x1

    .line 82
    :goto_6
    invoke-direct {v4, v0, v5, v6, v7}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;-><init>(IIIZ)V

    return-object v4
.end method

.method public final getHEIGHT_RANGE()Lkotlin/ranges/IntRange;
    .locals 1

    .line 24
    sget-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->HEIGHT_RANGE:Lkotlin/ranges/IntRange;

    return-object v0
.end method

.method public final getJAVA_OPTIONS()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 19
    sget-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    return-object v0
.end method

.method public final getWIDTH_RANGE()Lkotlin/ranges/IntRange;
    .locals 1

    .line 23
    sget-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->WIDTH_RANGE:Lkotlin/ranges/IntRange;

    return-object v0
.end method

.method public final javaIndex(Ljava/lang/String;)I
    .locals 11
    .param p1, "v"    # Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-nez v1, :cond_1

    const-string v1, ""

    .line 35
    .local v1, "s":Ljava/lang/String;
    :cond_1
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    if-nez v2, :cond_8

    const-string v2, "\u81ea\u52a8\u9009\u62e9"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    const-string v2, "auto"

    invoke-static {v1, v2, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_3

    goto/16 :goto_4

    .line 36
    :cond_3
    sget-object v2, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    .local v2, "$this$indexOfFirst\\1":Ljava/util/List;
    const/4 v5, 0x0

    .line 176
    .local v5, "$i$f$indexOfFirst\\1\\36":I
    const/4 v6, 0x0

    .line 177
    .local v6, "index\\1":I
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 178
    .local v8, "item\\1":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\2":Ljava/lang/String;
    const/4 v10, 0x0

    .line 36
    .local v10, "$i$a$-indexOfFirst-LaunchConfigLogic$javaIndex$exact$1\\2\\178\\0":I
    invoke-static {v9, v1, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    .line 178
    .end local v9    # "it\\2":Ljava/lang/String;
    .end local v10    # "$i$a$-indexOfFirst-LaunchConfigLogic$javaIndex$exact$1\\2\\178\\0":I
    if-eqz v9, :cond_4

    .line 179
    goto :goto_3

    .line 180
    :cond_4
    nop

    .end local v8    # "item\\1":Ljava/lang/Object;
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 182
    :cond_5
    const/4 v7, -0x1

    move v6, v7

    .line 36
    .end local v2    # "$this$indexOfFirst\\1":Ljava/util/List;
    .end local v5    # "$i$f$indexOfFirst\\1\\36":I
    .end local v6    # "index\\1":I
    :goto_3
    nop

    .line 37
    .local v6, "exact":I
    if-ltz v6, :cond_6

    return v6

    .line 38
    :cond_6
    new-instance v2, Lkotlin/text/Regex;

    const-string v5, "^(?:java\\s*)?(\\d{1,2})$"

    sget-object v7, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-direct {v2, v5, v7}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    move-object v5, v1

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v7, 0x2

    invoke-static {v2, v5, v4, v7, v0}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 39
    .local v0, "major":I
    sget-object v2, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Java "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v2, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    return v2

    .line 38
    .end local v0    # "major":I
    :cond_7
    return v4

    .line 35
    .end local v6    # "exact":I
    :cond_8
    :goto_4
    return v4
.end method

.method public final javaMajorOverride(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3
    .param p1, "v"    # Ljava/lang/String;

    .line 47
    invoke-virtual {p0, p1}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaIndex(Ljava/lang/String;)I

    move-result v0

    .local v0, "i":I
    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "Java "

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v1, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    .end local v0    # "i":I
    :goto_0
    return-object v1
.end method

.method public final javaValue(ILjava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "index"    # I
    .param p2, "current"    # Ljava/lang/String;

    .line 44
    if-eqz p2, :cond_0

    invoke-virtual {p0, p2}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaIndex(Ljava/lang/String;)I

    move-result v0

    if-ne v0, p1, :cond_0

    move-object v0, p2

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->JAVA_OPTIONS:Ljava/util/List;

    const/4 v1, 0x0

    if-ltz p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge p1, v2, :cond_1

    const/4 v1, 0x1

    :cond_1
    if-eqz v1, :cond_2

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_2
    move v0, p1

    .line 183
    .local v0, "it\\1":I
    const/4 v1, 0x0

    .line 44
    .local v1, "$i$a$-getOrElse-LaunchConfigLogic$javaValue$1\\1\\44\\0":I
    const-string v2, "\u81ea\u52a8\u9009\u62e9"

    move-object v0, v2

    .end local v0    # "it\\1":I
    .end local v1    # "$i$a$-getOrElse-LaunchConfigLogic$javaValue$1\\1\\44\\0":I
    :goto_0
    check-cast v0, Ljava/lang/String;

    :goto_1
    return-object v0
.end method

.method public final loadDisplay(Lcom/pymcl/core/config/ConfigStore;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .locals 5
    .param p1, "config"    # Lcom/pymcl/core/config/ConfigStore;
    .param p2, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p3, "versionId"    # Ljava/lang/String;

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move-object v1, p3

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v2, Lcom/pymcl/core/instance/VersionSettings;

    invoke-virtual {p2, p3}, Lcom/pymcl/core/instance/Instance;->versionDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    const/4 v4, 0x2

    invoke-direct {v2, v3, v0, v4, v0}, Lcom/pymcl/core/instance/VersionSettings;-><init>(Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/pymcl/core/instance/VersionSettings;->getFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    .line 120
    .local v0, "vMap":Ljava/util/Map;
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/core/config/ConfigStore;->snapshot()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/pymcl/android/data/LaunchConfigLogic;->effective(Ljava/util/Map;Ljava/util/Map;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v1

    return-object v1
.end method

.method public final memMax(J)I
    .locals 4
    .param p1, "totalMb"    # J

    .line 27
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    const/16 v0, 0x2000

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    int-to-long v0, v0

    mul-long/2addr v0, p1

    const/4 v2, 0x4

    int-to-long v2, v2

    div-long/2addr v0, v2

    const/16 v2, 0x100

    int-to-long v2, v2

    div-long/2addr v0, v2

    mul-long/2addr v0, v2

    long-to-int v0, v0

    const/16 v1, 0x400

    const/16 v2, 0x4000

    invoke-static {v0, v1, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final resolveJava(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;
    .locals 11
    .param p1, "auto"    # I
    .param p2, "versionJava"    # Ljava/lang/String;
    .param p3, "instanceJava"    # Ljava/lang/String;
    .param p4, "available"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;"
        }
    .end annotation

    move-object v6, p4

    const-string v0, "available"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    invoke-virtual {p0, p2}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaMajorOverride(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v7

    .line 66
    .local v7, "fromVersion":Ljava/lang/Integer;
    if-eqz v7, :cond_0

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object v8, p3

    goto :goto_0

    :cond_0
    move-object v8, p3

    invoke-virtual {p0, p3}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaMajorOverride(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    :goto_0
    move v9, v0

    .line 67
    .local v9, "want":I
    if-ne v9, p1, :cond_1

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;-><init>(ILjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    .line 68
    :cond_1
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-nez v0, :cond_2

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    new-array v4, v4, [Ljava/lang/Integer;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v2

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "\u8fd0\u884c\u65f6\u672a\u5185\u7f6e Java {0}\uff0c\u6539\u7528\u81ea\u52a8\u9009\u62e9\uff08Java {1}\uff09"

    invoke-direct {v0, p1, v3, v2}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    .line 69
    :cond_2
    if-ge v9, p1, :cond_3

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    new-array v4, v4, [Ljava/lang/Integer;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v2

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v3, "\u6240\u9009 Java {0} \u4f4e\u4e8e\u8be5\u7248\u672c\u6700\u4f4e\u9700\u6c42 Java {1}\uff0c\u6539\u7528\u81ea\u52a8\u9009\u62e9"

    invoke-direct {v0, p1, v3, v2}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    .line 70
    :cond_3
    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    if-eqz v7, :cond_4

    const-string v5, "\u6309\u7248\u672c\u8bbe\u7f6e\u4f7f\u7528 Java {0}\uff08\u81ea\u52a8\u4e3a Java {1}\uff09"

    goto :goto_1

    :cond_4
    const-string v5, "\u6309\u5b9e\u4f8b\u8bbe\u7f6e\u4f7f\u7528 Java {0}\uff08\u81ea\u52a8\u4e3a Java {1}\uff09"

    :goto_1
    new-array v4, v4, [Ljava/lang/Integer;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v4, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v4, v2

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v9, v5, v2}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    .line 66
    .end local v9    # "want":I
    :cond_5
    new-instance v0, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/LaunchConfigLogic$JavaPick;-><init>(ILjava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final saveDisplay(Lcom/pymcl/core/config/ConfigStore;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lcom/pymcl/android/data/LaunchConfigLogic$Display;)V
    .locals 17
    .param p1, "config"    # Lcom/pymcl/core/config/ConfigStore;
    .param p2, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p3, "versionId"    # Ljava/lang/String;
    .param p4, "d"    # Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "config"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "versionId"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "d"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    const/4 v5, 0x0

    if-eqz v2, :cond_0

    move-object v6, v3

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual/range {p2 .. p3}, Lcom/pymcl/core/instance/Instance;->versionDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v2, v3, v1}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v5

    .line 108
    .local v6, "vs":Lcom/pymcl/core/instance/VersionSettings;
    :goto_0
    if-eqz v6, :cond_1

    move-object v7, v6

    .line 183
    .local v7, "it\\1":Lcom/pymcl/core/instance/VersionSettings;
    const/4 v8, 0x0

    .line 108
    .local v8, "$i$a$-let-LaunchConfigLogic$saveDisplay$vMap$1\\1\\108\\0":I
    sget-object v9, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-virtual {v7}, Lcom/pymcl/core/instance/VersionSettings;->getFile()Ljava/io/File;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v7

    .end local v7    # "it\\1":Lcom/pymcl/core/instance/VersionSettings;
    .end local v8    # "$i$a$-let-LaunchConfigLogic$saveDisplay$vMap$1\\1\\108\\0":I
    goto :goto_1

    :cond_1
    move-object v7, v5

    .line 109
    .local v7, "vMap":Ljava/util/Map;
    :goto_1
    if-eqz v7, :cond_2

    move-object v5, v7

    .line 183
    .local v5, "it\\2":Ljava/util/Map;
    const/4 v8, 0x0

    .line 109
    .local v8, "$i$a$-let-LaunchConfigLogic$saveDisplay$vc$1\\2\\109\\0":I
    sget-object v9, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-virtual {v9, v4, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->versionChanges(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    .end local v5    # "it\\2":Ljava/util/Map;
    .end local v8    # "$i$a$-let-LaunchConfigLogic$saveDisplay$vc$1\\2\\109\\0":I
    :cond_2
    if-nez v5, :cond_3

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v5

    .line 110
    .local v5, "vc":Ljava/util/Map;
    :cond_3
    if-eqz v6, :cond_a

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_a

    .line 111
    invoke-virtual {v6, v5}, Lcom/pymcl/core/instance/VersionSettings;->save(Ljava/util/Map;)V

    .line 113
    invoke-virtual {v0, v4}, Lcom/pymcl/android/data/LaunchConfigLogic;->configChanges(Lcom/pymcl/android/data/LaunchConfigLogic$Display;)Ljava/util/Map;

    move-result-object v8

    .local v8, "$this$filterKeys\\3":Ljava/util/Map;
    const/4 v9, 0x0

    .line 184
    .local v9, "$i$f$filterKeys\\3\\113":I
    new-instance v10, Ljava/util/LinkedHashMap;

    invoke-direct {v10}, Ljava/util/LinkedHashMap;-><init>()V

    .line 185
    .local v10, "result\\3":Ljava/util/LinkedHashMap;
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_4
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 186
    .local v12, "entry\\3":Ljava/util/Map$Entry;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .local v13, "k\\4":Ljava/lang/String;
    const/4 v14, 0x0

    .line 113
    .local v14, "$i$a$-filterKeys-LaunchConfigLogic$saveDisplay$rest$1\\4\\186\\0":I
    const-string v15, "memory_mb"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_5

    invoke-interface {v5, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_7

    :cond_5
    const-string v15, "width"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const-string v15, "window_width"

    invoke-interface {v5, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_7

    :cond_6
    const-string v15, "height"

    invoke-static {v13, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const-string v15, "window_height"

    invoke-interface {v5, v15}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_8

    :cond_7
    const/4 v15, 0x1

    goto :goto_3

    :cond_8
    const/4 v15, 0x0

    .line 186
    .end local v13    # "k\\4":Ljava/lang/String;
    .end local v14    # "$i$a$-filterKeys-LaunchConfigLogic$saveDisplay$rest$1\\4\\186\\0":I
    :goto_3
    if-eqz v15, :cond_4

    .line 187
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v13, v14}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 190
    .end local v12    # "entry\\3":Ljava/util/Map$Entry;
    :cond_9
    move-object v8, v10

    check-cast v8, Ljava/util/Map;

    .line 113
    .end local v8    # "$this$filterKeys\\3":Ljava/util/Map;
    .end local v9    # "$i$f$filterKeys\\3\\113":I
    .end local v10    # "result\\3":Ljava/util/LinkedHashMap;
    nop

    .line 114
    .local v8, "rest":Ljava/util/Map;
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_b

    invoke-virtual {v1, v8}, Lcom/pymcl/core/config/ConfigStore;->update(Ljava/util/Map;)Z

    goto :goto_4

    .line 115
    .end local v8    # "rest":Ljava/util/Map;
    :cond_a
    invoke-virtual {v0, v4}, Lcom/pymcl/android/data/LaunchConfigLogic;->configChanges(Lcom/pymcl/android/data/LaunchConfigLogic$Display;)Ljava/util/Map;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/pymcl/core/config/ConfigStore;->update(Ljava/util/Map;)Z

    .line 116
    :cond_b
    :goto_4
    return-void
.end method

.method public final saveJava(Lcom/pymcl/core/instance/Instance;I)V
    .locals 4
    .param p1, "inst"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "index"    # I

    const-string v0, "inst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->meta()Ljava/util/Map;

    move-result-object v0

    const-string v1, "java"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 125
    .local v0, "cur":Ljava/lang/String;
    :goto_0
    invoke-virtual {p0, p2, v0}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaValue(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 126
    .local v2, "v":Ljava/lang/String;
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p1, v1, v2}, Lcom/pymcl/core/instance/Instance;->setMeta(Ljava/lang/String;Ljava/lang/Object;)V

    .line 127
    :cond_1
    return-void
.end method

.method public final validateRes(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "w"    # Ljava/lang/String;
    .param p2, "h"    # Ljava/lang/String;

    const-string v0, "w"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "h"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    sget-object v0, Lcom/pymcl/android/ui/state/InputRules;->INSTANCE:Lcom/pymcl/android/ui/state/InputRules;

    sget-object v1, Lcom/pymcl/android/data/LaunchConfigLogic;->WIDTH_RANGE:Lkotlin/ranges/IntRange;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lcom/pymcl/android/ui/state/InputRules;->intInRange(Ljava/lang/String;Lkotlin/ranges/IntRange;Z)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 93
    sget-object v0, Lcom/pymcl/android/ui/state/InputRules;->INSTANCE:Lcom/pymcl/android/ui/state/InputRules;

    sget-object v1, Lcom/pymcl/android/data/LaunchConfigLogic;->HEIGHT_RANGE:Lkotlin/ranges/IntRange;

    invoke-virtual {v0, p2, v1, v2}, Lcom/pymcl/android/ui/state/InputRules;->intInRange(Ljava/lang/String;Lkotlin/ranges/IntRange;Z)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final versionChanges(Lcom/pymcl/android/data/LaunchConfigLogic$Display;Ljava/util/Map;)Ljava/util/Map;
    .locals 7
    .param p1, "d"    # Lcom/pymcl/android/data/LaunchConfigLogic$Display;
    .param p2, "version"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/data/LaunchConfigLogic$Display;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    invoke-static {}, Lkotlin/collections/MapsKt;->createMapBuilder()Ljava/util/Map;

    move-result-object v0

    move-object v1, v0

    .local v1, "$this$versionChanges_u24lambda_u240\\1":Ljava/util/Map;
    const/4 v2, 0x0

    .line 100
    .local v2, "$i$a$-buildMap-LaunchConfigLogic$versionChanges$1\\1\\99\\0":I
    sget-object v3, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const-string v4, "memory_mb"

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getMemoryMb()I

    move-result v3

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    :cond_0
    sget-object v3, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const-string v4, "window_width"

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getWidth()I

    move-result v3

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :cond_1
    sget-object v3, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const-string v4, "window_height"

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v3, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->num(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lcom/pymcl/android/data/LaunchConfigLogic$Display;->getHeight()I

    move-result v3

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    :cond_2
    nop

    .line 99
    .end local v1    # "$this$versionChanges_u24lambda_u240\\1":Ljava/util/Map;
    .end local v2    # "$i$a$-buildMap-LaunchConfigLogic$versionChanges$1\\1\\99\\0":I
    invoke-static {v0}, Lkotlin/collections/MapsKt;->build(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 103
    return-object v0
.end method
