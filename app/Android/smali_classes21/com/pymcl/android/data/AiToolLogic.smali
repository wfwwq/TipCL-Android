.class public final Lcom/pymcl/android/data/AiToolLogic;
.super Ljava/lang/Object;
.source "AiToolLogic.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAiToolLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiToolLogic.kt\ncom/pymcl/android/data/AiToolLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,176:1\n1#2:177\n2198#3,14:178\n296#3,2:192\n296#3,2:200\n296#3,2:202\n777#3:204\n873#3,2:205\n296#3,2:207\n1739#3:209\n1814#3,3:210\n2198#3,14:216\n2198#3,14:233\n1419#3,4:249\n437#4:194\n513#4,5:195\n3938#5:213\n4474#5,2:214\n3938#5:230\n4474#5,2:231\n610#6:247\n559#6:248\n129#7:253\n158#7,3:254\n37#8,2:257\n*S KotlinDebug\n*F\n+ 1 AiToolLogic.kt\ncom/pymcl/android/data/AiToolLogic\n*L\n46#1:178,14\n51#1:192,2\n102#1:200,2\n103#1:202,2\n104#1:204\n104#1:205,2\n120#1:207,2\n130#1:209\n130#1:210,3\n147#1:216,14\n148#1:233,14\n163#1:249,4\n71#1:194\n71#1:195,5\n147#1:213\n147#1:214,2\n148#1:230\n148#1:231,2\n163#1:247\n163#1:248\n163#1:253\n163#1:254,3\n163#1:257,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J(\u0010\u0012\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010\u0014\u001a\u00020\u0006J\u001c\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0017J>\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00172\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006J\"\u0010#\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J\u0010\u0010$\u001a\u00020\u00062\u0008\u0010%\u001a\u0004\u0018\u00010\u0006J \u0010&\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J \u0010\'\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J\'\u0010(\u001a\u0004\u0018\u00010\n2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011\u00a2\u0006\u0002\u0010)J(\u0010+\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u0006\u0010,\u001a\u00020\u0006J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u0006JP\u00101\u001a\u0008\u0012\u0004\u0012\u00020.0\u00172\u0006\u0010\u000e\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u00112\u000c\u00102\u001a\u0008\u0012\u0004\u0012\u00020.032\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020.0\u001dJ\u001e\u00105\u001a\u0004\u0018\u00010\u00062\u000c\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u00107\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u00108\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006J\u0016\u0010;\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006J \u0010<\u001a\u00020\u00062\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J(\u0010=\u001a\u0004\u0018\u00010>2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020>0\u00172\u0006\u0010@\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0006J4\u0010A\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00062\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0017J\u001e\u0010F\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0006J \u0010I\u001a\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010Jj\u0002`K2\u000c\u0010?\u001a\u0008\u0012\u0004\u0012\u00020>0\u0017J&\u0010L\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00172\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0010j\u0002`\u0011J$\u0010M\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u000c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0017J\u0016\u0010P\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020.2\u0006\u0010R\u001a\u00020\nJ\u001c\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010T\u001a\u00020.2\u0006\u0010U\u001a\u00020\u0006J\u0010\u0010V\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u00020.J\u0016\u0010W\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020.2\u0006\u0010X\u001a\u00020\u0006J$\u0010Y\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u0006\u0010Q\u001a\u00020.R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010*\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000c\u0008[\u0012\u0008\u0008\\\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/pymcl/android/data/AiToolLogic;",
        "",
        "<init>",
        "()V",
        "INSTALL_VERBS",
        "",
        "",
        "MOD_ACTION_DONE",
        "ANDROID_JAVA_MAJORS",
        "",
        "",
        "getANDROID_JAVA_MAJORS",
        "()Ljava/util/Set;",
        "describe",
        "name",
        "args",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "instanceArg",
        "a",
        "current",
        "noInstanceMessage",
        "all",
        "",
        "pickVersion",
        "installed",
        "argVersion",
        "metaMc",
        "lastModified",
        "Lkotlin/Function1;",
        "",
        "noVersionMessage",
        "instance",
        "loaderOf",
        "v",
        "loaderArg",
        "kindKey",
        "k",
        "sourceOf",
        "versionQuery",
        "javaMajor",
        "(Ljava/util/Map;)Ljava/lang/Integer;",
        "JAVA_UNSUPPORTED",
        "required",
        "key",
        "configFile",
        "Ljava/io/File;",
        "gd",
        "p",
        "affectedPaths",
        "gameDir",
        "Lkotlin/Function0;",
        "instanceDir",
        "resolveModName",
        "list",
        "noModMessage",
        "modActionNeeded",
        "",
        "filename",
        "modActionMessage",
        "installQuery",
        "pickHit",
        "Lcom/pymcl/core/mods/ModHit;",
        "hits",
        "query",
        "installedMessage",
        "title",
        "out",
        "version",
        "requiredDeps",
        "noFileMessage",
        "mc",
        "loader",
        "searchJson",
        "",
        "Lcom/pymcl/core/util/JArr;",
        "launchNotes",
        "launchMessage",
        "vid",
        "notes",
        "tail",
        "f",
        "n",
        "listConfigs",
        "dir",
        "prefix",
        "latestCrashFile",
        "writeConfig",
        "content",
        "modInfo",
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

.field private static final ANDROID_JAVA_MAJORS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final INSTALL_VERBS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

.field public static final JAVA_UNSUPPORTED:Ljava/lang/String; = "\u5b89\u5353\u7248\u53ea\u63d0\u4f9b Java 8/17/21/25\uff0817/21 \u4e3a\u5185\u7f6e\uff0c8/25 \u6309\u9700\u4e0b\u8f7d\uff09"

.field private static final MOD_ACTION_DONE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$7_XiGcbncfSJYwBpFQmqQx8_wtk(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiToolLogic;->listConfigs$lambda$0(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$AmpFicxYp-0uwgCl_8k2rex4VSE(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiToolLogic;->modInfo$lambda$0$0$5$0(Lkotlin/text/MatchResult;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$KVQTt3xgqQ6BTzzeDQTu3sQWWOA(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiToolLogic;->listConfigs$lambda$2(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$YkWHWPfwTQDoAaulZUaXDFEpu08(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/AiToolLogic;->tail$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$bVudaLGwvgGLRQ8PK0aVtphUNRw(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/android/data/AiToolLogic;->listConfigs$lambda$1(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/pymcl/android/data/AiToolLogic;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolLogic;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTANCE:Lcom/pymcl/android/data/AiToolLogic;

    .line 14
    const/4 v0, 0x6

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "install_mod"

    const-string v2, "\u5b89\u88c5\u6a21\u7ec4"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "install_modpack"

    const-string v3, "\u5b89\u88c5\u6574\u5408\u5305"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "install_shader"

    const-string v4, "\u5b89\u88c5\u5149\u5f71"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x2

    aput-object v1, v0, v4

    .line 15
    const-string v1, "install_resourcepack"

    const-string v5, "\u5b89\u88c5\u8d44\u6e90\u5305"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v5, 0x3

    aput-object v1, v0, v5

    .line 14
    nop

    .line 15
    const-string v1, "install_datapack"

    const-string v6, "\u5b89\u88c5\u6570\u636e\u5305"

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v6, 0x4

    aput-object v1, v0, v6

    .line 14
    nop

    .line 15
    const-string v1, "install_world"

    const-string v7, "\u5b89\u88c5\u5730\u56fe"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v7, 0x5

    aput-object v1, v0, v7

    .line 14
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiToolLogic;->INSTALL_VERBS:Ljava/util/Map;

    .line 16
    new-array v0, v5, [Lkotlin/Pair;

    const-string v1, "delete_mod"

    const-string v7, "\u5df2\u5220\u9664"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "disable_mod"

    const-string v7, "\u5df2\u7981\u7528"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "enable_mod"

    const-string v7, "\u5df2\u542f\u7528"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiToolLogic;->MOD_ACTION_DONE:Ljava/util/Map;

    .line 17
    new-array v0, v6, [Ljava/lang/Integer;

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    const/16 v1, 0x11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const/16 v1, 0x15

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    const/16 v1, 0x19

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/AiToolLogic;->ANDROID_JAVA_MAJORS:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final listConfigs$lambda$0(Ljava/io/File;)Z
    .locals 1
    .param p0, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-virtual {p0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method private static final listConfigs$lambda$1(Ljava/io/File;Ljava/io/File;)Ljava/lang/String;
    .locals 7
    .param p0, "$dir"    # Ljava/io/File;
    .param p1, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-static {p1, p0}, Lkotlin/io/FilesKt;->relativeTo(Ljava/io/File;Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v0, "getPath(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x5c

    const/16 v3, 0x2f

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final listConfigs$lambda$2(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1
    .param p0, "$prefix"    # Ljava/lang/String;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lkotlin/text/StringsKt;->startsWith(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private static final modInfo$lambda$0$0$5$0(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 2
    .param p0, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final modInfo$lambda$0$0$txt(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p0, "$z"    # Ljava/util/zip/ZipFile;
    .param p1, "n"    # Ljava/lang/String;

    .line 160
    invoke-virtual {p0, p1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 177
    .local v0, "e\\1":Ljava/util/zip/ZipEntry;
    const/4 v2, 0x0

    .line 160
    .local v2, "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    invoke-virtual {p0, v0}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v3

    check-cast v3, Ljava/io/Closeable;

    :try_start_0
    move-object v4, v3

    check-cast v4, Ljava/io/InputStream;

    .line 177
    .local v4, "it\\2":Ljava/io/InputStream;
    const/4 v5, 0x0

    .local v5, "$i$a$-use-AiToolLogic$modInfo$1$1$txt$1$1\\2\\160\\1":I
    new-instance v6, Ljava/lang/String;

    .line 160
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v4}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v7

    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v6, v7, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v4    # "it\\2":Ljava/io/InputStream;
    .end local v5    # "$i$a$-use-AiToolLogic$modInfo$1$1$txt$1$1\\2\\160\\1":I
    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    move-object v1, v6

    .end local v0    # "e\\1":Ljava/util/zip/ZipEntry;
    .end local v2    # "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    goto :goto_0

    .restart local v0    # "e\\1":Ljava/util/zip/ZipEntry;
    .restart local v2    # "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    :catchall_0
    move-exception v1

    .end local v0    # "e\\1":Ljava/util/zip/ZipEntry;
    .end local v2    # "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    .end local p0    # "$z":Ljava/util/zip/ZipFile;
    .end local p1    # "n":Ljava/lang/String;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v0    # "e\\1":Ljava/util/zip/ZipEntry;
    .restart local v2    # "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    .restart local p0    # "$z":Ljava/util/zip/ZipFile;
    .restart local p1    # "n":Ljava/lang/String;
    :catchall_1
    move-exception v4

    invoke-static {v3, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    .end local v0    # "e\\1":Ljava/util/zip/ZipEntry;
    .end local v2    # "$i$a$-let-AiToolLogic$modInfo$1$1$txt$1\\1\\160\\0":I
    :cond_0
    :goto_0
    return-object v1
.end method

.method private static final tail$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-virtual {v0, p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->filterSecrets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method


# virtual methods
.method public final affectedPaths(Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 3
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .param p3, "gameDir"    # Lkotlin/jvm/functions/Function0;
    .param p4, "instanceDir"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/io/File;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "+",
            "Ljava/io/File;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "args"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "gameDir"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "instanceDir"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, ""

    sparse-switch v1, :sswitch_data_0

    :goto_0
    goto/16 :goto_5

    :sswitch_0
    const-string v0, "install_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :sswitch_1
    const-string v0, "enable_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :sswitch_2
    const-string v0, "delete_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :sswitch_3
    const-string v0, "install_shader"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 93
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v2, "shaderpacks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    .line 91
    :sswitch_4
    const-string v0, "install_resourcepack"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 93
    :cond_1
    new-instance v0, Ljava/io/File;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v2, "resourcepacks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_6

    .line 91
    :sswitch_5
    const-string v0, "disable_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 92
    :cond_2
    new-instance v0, Ljava/io/File;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v2, "mods"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_6

    .line 91
    :sswitch_6
    const-string v0, "write_mod_config"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    .line 95
    :cond_3
    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    const-string v1, "path"

    invoke-static {p2, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, v1

    :goto_2
    invoke-virtual {p0, v0, v2}, Lcom/pymcl/android/data/AiToolLogic;->configFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_6

    .line 91
    :sswitch_7
    const-string v0, "install_datapack"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_0

    .line 94
    :cond_5
    new-instance v0, Ljava/io/File;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v2, "datapacks"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_4

    .line 91
    :sswitch_8
    const-string v1, "delete_instance"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto/16 :goto_0

    .line 96
    :cond_6
    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    move-object v2, v0

    :goto_3
    invoke-interface {p4, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_6

    .line 91
    :sswitch_9
    const-string v0, "install_world"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_0

    .line 94
    :cond_8
    new-instance v0, Ljava/io/File;

    invoke-interface {p3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    const-string v2, "saves"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_4
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_6

    .line 97
    :goto_5
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 98
    :goto_6
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4efe3c12 -> :sswitch_9
        -0x22568f57 -> :sswitch_8
        -0x1b086919 -> :sswitch_7
        0x1164ff7f -> :sswitch_6
        0x50af452b -> :sswitch_5
        0x5141e74b -> :sswitch_4
        0x67f8db09 -> :sswitch_3
        0x69328e6e -> :sswitch_2
        0x70dd8246 -> :sswitch_1
        0x7fc8b65e -> :sswitch_0
    .end sparse-switch
.end method

.method public final configFile(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    .locals 7
    .param p1, "gd"    # Ljava/io/File;
    .param p2, "p"    # Ljava/lang/String;

    const-string v0, "gd"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    const/4 v5, 0x4

    const/4 v6, 0x0

    const/16 v2, 0x5c

    const/16 v3, 0x2f

    const/4 v4, 0x0

    move-object v1, p2

    .end local p2    # "p":Ljava/lang/String;
    .local v1, "p":Ljava/lang/String;
    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;CCZILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v2, 0x0

    aput-char v3, v0, v2

    invoke-static {p2, v0}, Lkotlin/text/StringsKt;->trimStart(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object p2

    const-string v0, "config/"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p2, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    .line 82
    .local p2, "rel":Ljava/lang/String;
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/io/File;

    const-string v4, "config"

    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v3, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    move-result-object v0

    .line 83
    .local v0, "f":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    const-string v5, "getPath(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getCanonicalPath(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x2

    invoke-static {v3, v4, v2, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 84
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    return-object v0

    .line 83
    :cond_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "\u53ea\u80fd\u8bbf\u95ee\u5b9e\u4f8b config \u76ee\u5f55\u5185\u7684\u6587\u4ef6"

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final describe(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 9
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "args"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "args"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    const-string v1, "instance"

    invoke-static {p2, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const-string v3, ""

    if-eqz v1, :cond_1

    move-object v4, v1

    .line 177
    .local v4, "it\\1":Ljava/lang/String;
    const/4 v5, 0x0

    .line 21
    .local v5, "$i$a$-takeIf-AiToolLogic$describe$inst$1\\1\\21\\0":I
    move-object v6, v4

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v6}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v6

    .end local v4    # "it\\1":Ljava/lang/String;
    .end local v5    # "$i$a$-takeIf-AiToolLogic$describe$inst$1\\1\\21\\0":I
    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-eqz v1, :cond_1

    .line 177
    .local v1, "it\\2":Ljava/lang/String;
    const/4 v4, 0x0

    .line 21
    .local v4, "$i$a$-let-AiToolLogic$describe$inst$2\\2\\21\\0":I
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\uff08\u5b9e\u4f8b "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\uff09"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .end local v1    # "it\\2":Ljava/lang/String;
    .end local v4    # "$i$a$-let-AiToolLogic$describe$inst$2\\2\\21\\0":I
    if-nez v1, :cond_2

    :cond_1
    move-object v1, v3

    .line 22
    .local v1, "inst":Ljava/lang/String;
    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const-string v5, "version"

    const-string v6, " "

    const-string v7, "filename"

    sparse-switch v4, :sswitch_data_0

    :goto_1
    goto/16 :goto_9

    :sswitch_0
    const-string v4, "install_mod"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_1

    :sswitch_1
    const-string v0, "install_game"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    .line 23
    :cond_3
    invoke-static {p2, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "loader"

    invoke-static {p2, v4}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_8

    .line 177
    move-object v5, v4

    .local v5, "it\\3":Ljava/lang/String;
    const/4 v7, 0x0

    .line 23
    .local v7, "$i$a$-takeIf-AiToolLogic$describe$1\\3\\23\\0":I
    move-object v8, v5

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v8}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "\u65e0"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    const/4 v8, 0x1

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    .end local v5    # "it\\3":Ljava/lang/String;
    .end local v7    # "$i$a$-takeIf-AiToolLogic$describe$1\\3\\23\\0":I
    :goto_2
    if-eqz v8, :cond_5

    move-object v2, v4

    :cond_5
    if-eqz v2, :cond_8

    .line 177
    nop

    .local v2, "it\\4":Ljava/lang/String;
    const/4 v4, 0x0

    .line 23
    .local v4, "$i$a$-let-AiToolLogic$describe$2\\4\\23\\0":I
    const-string v5, "loader_version"

    invoke-static {p2, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_6

    move-object v5, v3

    :cond_6
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, " + "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->trimEnd(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .end local v2    # "it\\4":Ljava/lang/String;
    .end local v4    # "$i$a$-let-AiToolLogic$describe$2\\4\\23\\0":I
    if-nez v5, :cond_7

    goto :goto_3

    :cond_7
    move-object v3, v5

    :cond_8
    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u5b89\u88c5 Minecraft "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    .line 22
    :sswitch_2
    const-string v0, "enable_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_1

    .line 26
    :cond_9
    invoke-static {p2, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u542f\u7528\u6a21\u7ec4 "

    goto :goto_4

    .line 22
    :sswitch_3
    const-string v0, "delete_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_1

    .line 26
    :cond_a
    invoke-static {p2, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5220\u9664\u6a21\u7ec4 "

    goto :goto_4

    .line 22
    :sswitch_4
    const-string v4, "install_shader"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :sswitch_5
    const-string v4, "install_modpack"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :sswitch_6
    const-string v3, "create_instance"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_1

    .line 27
    :cond_b
    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u65b0\u5efa\u5b9e\u4f8b\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u300d"

    goto/16 :goto_7

    .line 22
    :sswitch_7
    const-string v4, "install_resourcepack"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "disable_mod"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_1

    .line 26
    :cond_c
    invoke-static {p2, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u7981\u7528\u6a21\u7ec4 "

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    .line 22
    :sswitch_9
    const-string v0, "write_mod_config"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_1

    .line 28
    :cond_d
    const-string v0, "path"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5199\u5165\u914d\u7f6e "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    goto :goto_5

    .line 22
    :sswitch_a
    const-string v0, "download_java"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_1

    .line 28
    :cond_e
    const-string v0, "major"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u4e0b\u8f7d Java "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    .line 22
    :sswitch_b
    const-string v0, "launch_game"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_1

    .line 29
    :cond_f
    invoke-static {p2, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 177
    .local v0, "it\\5":Ljava/lang/String;
    const/4 v2, 0x0

    .line 29
    .local v2, "$i$a$-let-AiToolLogic$describe$3\\5\\29\\0":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "it\\5":Ljava/lang/String;
    .end local v2    # "$i$a$-let-AiToolLogic$describe$3\\5\\29\\0":I
    if-nez v0, :cond_10

    goto :goto_6

    :cond_10
    move-object v3, v0

    :cond_11
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u542f\u52a8\u6e38\u620f"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_a

    .line 22
    :sswitch_c
    const-string v4, "install_datapack"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    :sswitch_d
    const-string v3, "delete_instance"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto/16 :goto_1

    .line 27
    :cond_12
    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5220\u9664\u6574\u4e2a\u5b9e\u4f8b\u300c"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\u300d\uff08\u4e0d\u53ef\u6062\u590d\uff09"

    :goto_7
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    .line 22
    :sswitch_e
    const-string v4, "install_world"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_13

    goto/16 :goto_1

    .line 25
    :cond_13
    sget-object v2, Lcom/pymcl/android/data/AiToolLogic;->INSTALL_VERBS:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    const-string v0, "slug"

    invoke-static {p2, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_8

    :cond_14
    move-object v3, v0

    :goto_8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    .line 30
    :goto_9
    nop

    .line 22
    :goto_a
    return-object v2

    :sswitch_data_0
    .sparse-switch
        -0x4efe3c12 -> :sswitch_e
        -0x22568f57 -> :sswitch_d
        -0x1b086919 -> :sswitch_c
        -0xdbcc702 -> :sswitch_b
        0x1e1af79 -> :sswitch_a
        0x1164ff7f -> :sswitch_9
        0x50af452b -> :sswitch_8
        0x5141e74b -> :sswitch_7
        0x57b58078 -> :sswitch_6
        0x65deb977 -> :sswitch_5
        0x67f8db09 -> :sswitch_4
        0x69328e6e -> :sswitch_3
        0x70dd8246 -> :sswitch_2
        0x794b2816 -> :sswitch_1
        0x7fc8b65e -> :sswitch_0
    .end sparse-switch
.end method

.method public final getANDROID_JAVA_MAJORS()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->ANDROID_JAVA_MAJORS:Ljava/util/Set;

    return-object v0
.end method

.method public final installQuery(Ljava/util/Map;)Ljava/lang/String;
    .locals 5
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    const-string v0, "id"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v2, v0

    .line 177
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 116
    .local v3, "$i$a$-takeIf-AiToolLogic$installQuery$1\\1\\116\\0":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-AiToolLogic$installQuery$1\\1\\116\\0":I
    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_3

    :cond_1
    const-string v0, "slug"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v2, v0

    .line 177
    .local v2, "it\\2":Ljava/lang/String;
    const/4 v3, 0x0

    .line 116
    .local v3, "$i$a$-takeIf-AiToolLogic$installQuery$2\\2\\116\\0":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    .end local v2    # "it\\2":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-AiToolLogic$installQuery$2\\2\\116\\0":I
    if-nez v4, :cond_2

    move-object v1, v0

    :cond_2
    if-nez v1, :cond_5

    const-string v0, "name"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_3
    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "\u7f3a\u5c11 name"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public final installedMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 16
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "out"    # Ljava/lang/String;
    .param p3, "instance"    # Ljava/lang/String;
    .param p4, "version"    # Ljava/lang/String;
    .param p5, "requiredDeps"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "title"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "out"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "instance"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "version"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "requiredDeps"

    move-object/from16 v5, p5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    move-object/from16 v4, p5

    .line 177
    .local v4, "it\\1":Ljava/util/List;
    const/4 v6, 0x0

    .line 124
    .local v6, "$i$a$-takeIf-AiToolLogic$installedMessage$deps$1\\1\\124\\0":I
    move-object v7, v4

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    .end local v4    # "it\\1":Ljava/util/List;
    .end local v6    # "$i$a$-takeIf-AiToolLogic$installedMessage$deps$1\\1\\124\\0":I
    const/4 v4, 0x0

    if-nez v7, :cond_0

    move-object v6, v5

    goto :goto_0

    :cond_0
    move-object v6, v4

    :goto_0
    if-eqz v6, :cond_1

    .line 177
    .local v6, "it\\2":Ljava/util/List;
    const/4 v4, 0x0

    .line 124
    .local v4, "$i$a$-let-AiToolLogic$installedMessage$deps$2\\2\\124\\0":I
    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    const-string v8, "\u3001"

    check-cast v8, Ljava/lang/CharSequence;

    const/16 v14, 0x3e

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\uff1b\u5fc5\u9700\u524d\u7f6e\uff1a"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "\uff08\u672a\u81ea\u52a8\u5b89\u88c5\uff0c\u53ef\u518d\u8c03\u7528 install_mod\uff09"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .end local v4    # "$i$a$-let-AiToolLogic$installedMessage$deps$2\\2\\124\\0":I
    .end local v6    # "it\\2":Ljava/util/List;
    :cond_1
    if-nez v4, :cond_2

    const-string v4, ""

    .line 125
    .local v4, "deps":Ljava/lang/String;
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u5df2\u5b89\u88c5 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\uff08"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\uff09\u5230\u300c"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "\u300d/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.method public final instanceArg(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "a"    # Ljava/util/Map;
    .param p2, "current"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "current"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    const-string v0, "instance"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    move-object v1, v0

    .line 177
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 35
    .local v2, "$i$a$-takeIf-AiToolLogic$instanceArg$1\\1\\35\\0":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-AiToolLogic$instanceArg$1\\1\\35\\0":I
    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    :cond_1
    move-object v0, p2

    :cond_2
    return-object v0
.end method

.method public final javaMajor(Ljava/util/Map;)Ljava/lang/Integer;
    .locals 11
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Integer;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    const-string v0, "major"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    .local v0, "$this$filter\\1":Ljava/lang/String;
    :cond_0
    const/4 v1, 0x0

    .line 194
    .local v1, "$i$f$filter\\1\\71":I
    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    .local v2, "$this$filterTo\\2":Ljava/lang/CharSequence;
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    check-cast v3, Ljava/lang/Appendable;

    .local v3, "destination\\2":Ljava/lang/Appendable;
    const/4 v4, 0x0

    .line 195
    .local v4, "$i$f$filterTo\\2\\194":I
    const/4 v5, 0x0

    .local v5, "index\\2":I
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_2

    .line 196
    invoke-interface {v2, v5}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    .line 197
    .local v7, "element\\2":C
    move v8, v7

    .local v8, "it\\3":C
    const/4 v9, 0x0

    .line 71
    .local v9, "$i$a$-filter-AiToolLogic$javaMajor$m$1\\3\\197\\0":I
    invoke-static {v8}, Ljava/lang/Character;->isDigit(C)Z

    move-result v10

    .line 197
    .end local v8    # "it\\3":C
    .end local v9    # "$i$a$-filter-AiToolLogic$javaMajor$m$1\\3\\197\\0":I
    if-eqz v10, :cond_1

    invoke-interface {v3, v7}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 195
    .end local v7    # "element\\2":C
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 199
    .end local v5    # "index\\2":I
    :cond_2
    nop

    .end local v2    # "$this$filterTo\\2":Ljava/lang/CharSequence;
    .end local v3    # "destination\\2":Ljava/lang/Appendable;
    .end local v4    # "$i$f$filterTo\\2\\194":I
    move-object v2, v3

    check-cast v2, Ljava/lang/StringBuilder;

    .line 194
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 71
    .end local v0    # "$this$filter\\1":Ljava/lang/String;
    .end local v1    # "$i$f$filter\\1\\71":I
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 72
    .local v0, "m":I
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    .line 177
    .local v2, "it\\4":I
    const/4 v3, 0x0

    .line 72
    .local v3, "$i$a$-takeIf-AiToolLogic$javaMajor$1\\4\\72\\0":I
    sget-object v4, Lcom/pymcl/android/data/AiToolLogic;->ANDROID_JAVA_MAJORS:Ljava/util/Set;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    .end local v2    # "it\\4":I
    .end local v3    # "$i$a$-takeIf-AiToolLogic$javaMajor$1\\4\\72\\0":I
    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    return-object v1

    .line 71
    .end local v0    # "m":I
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "major \u5e94\u4e3a 8/17/21/25"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final kindKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 6
    .param p1, "k"    # Ljava/lang/String;

    .line 57
    const-string v0, "toLowerCase(...)"

    if-eqz p1, :cond_0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "datapack"

    const-string v4, "resource"

    const-string v5, "shader"

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v2, "shaders"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto/16 :goto_1

    :sswitch_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto/16 :goto_1

    :sswitch_2
    const-string v2, "resourcepacks"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_3
    const-string v2, "\u8d44\u6e90\u5305"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_4
    const-string v2, "\u6750\u8d28\u5305"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_5
    const-string v2, "\u6570\u636e\u5305"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :sswitch_6
    const-string v2, "\u5149\u5f71"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_7
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :sswitch_8
    const-string v2, "datapacks"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    :sswitch_9
    const-string v2, "resourcepack"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 58
    :cond_1
    move-object v3, v4

    goto :goto_3

    .line 57
    :sswitch_a
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :sswitch_b
    const-string v2, "shaderpack"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 58
    :cond_2
    move-object v3, v5

    goto :goto_3

    .line 59
    :cond_3
    :goto_1
    if-eqz p1, :cond_5

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    goto :goto_3

    :cond_5
    :goto_2
    const-string v3, "mod"

    .line 60
    :goto_3
    return-object v3

    :sswitch_data_0
    .sparse-switch
        -0x4e1fa082 -> :sswitch_b
        -0x35db881b -> :sswitch_a
        -0x16dc90d9 -> :sswitch_9
        -0x14c1d3f0 -> :sswitch_8
        -0x14543bf2 -> :sswitch_7
        0xa3748 -> :sswitch_6
        0x18926c7 -> :sswitch_5
        0x1953e2d -> :sswitch_4
        0x22002b9 -> :sswitch_3
        0x3b4a762c -> :sswitch_2
        0x6aaf6cc3 -> :sswitch_1
        0x7a6a852e -> :sswitch_0
    .end sparse-switch
.end method

.method public final latestCrashFile(Ljava/io/File;)Ljava/io/File;
    .locals 16
    .param p1, "gd"    # Ljava/io/File;

    move-object/from16 v0, p1

    const-string v1, "gd"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    new-instance v1, Ljava/io/File;

    const-string v2, "crash-reports"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_7

    .local v1, "$this$filter\\1":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 213
    .local v4, "$i$f$filter\\1\\147":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\2":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$filterTo\\2":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 214
    .local v7, "$i$f$filterTo\\2\\213":I
    array-length v8, v6

    move v9, v2

    :goto_0
    if-ge v9, v8, :cond_1

    aget-object v10, v6, v9

    .local v10, "element\\2":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it\\3":Ljava/io/File;
    const/4 v12, 0x0

    .line 147
    .local v12, "$i$a$-filter-AiToolLogic$latestCrashFile$1\\3\\214\\0":I
    invoke-virtual {v11}, Ljava/io/File;->isFile()Z

    move-result v11

    .line 214
    .end local v11    # "it\\3":Ljava/io/File;
    .end local v12    # "$i$a$-filter-AiToolLogic$latestCrashFile$1\\3\\214\\0":I
    if-eqz v11, :cond_0

    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v10    # "element\\2":Ljava/lang/Object;
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 215
    :cond_1
    nop

    .end local v5    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$filterTo\\2":[Ljava/lang/Object;
    .end local v7    # "$i$f$filterTo\\2\\213":I
    check-cast v5, Ljava/util/List;

    .line 213
    nop

    .line 147
    .end local v1    # "$this$filter\\1":[Ljava/lang/Object;
    .end local v4    # "$i$f$filter\\1\\147":I
    move-object v1, v5

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$maxByOrNull\\4":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 216
    .local v4, "$i$f$maxByOrNull\\4\\147":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 217
    .local v5, "iterator\\4":Ljava/util/Iterator;
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_2

    move-object v6, v3

    goto :goto_1

    .line 218
    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 219
    .local v6, "maxElem\\4":Ljava/lang/Object;
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_3

    goto :goto_1

    .line 220
    :cond_3
    move-object v7, v6

    check-cast v7, Ljava/io/File;

    .local v7, "it\\5":Ljava/io/File;
    const/4 v8, 0x0

    .line 147
    .local v8, "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$2\\5\\220\\0":I
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    .line 220
    .end local v7    # "it\\5":Ljava/io/File;
    .end local v8    # "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$2\\5\\220\\0":I
    nop

    .line 222
    .local v7, "maxValue\\4":J
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 223
    .local v9, "e\\4":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/io/File;

    .local v10, "it\\6":Ljava/io/File;
    const/4 v11, 0x0

    .line 147
    .local v11, "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$2\\6\\223\\0":I
    invoke-virtual {v10}, Ljava/io/File;->lastModified()J

    move-result-wide v10

    .line 223
    .end local v10    # "it\\6":Ljava/io/File;
    .end local v11    # "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$2\\6\\223\\0":I
    nop

    .line 224
    .local v10, "v\\4":J
    cmp-long v12, v7, v10

    if-gez v12, :cond_5

    .line 225
    move-object v6, v9

    .line 226
    move-wide v7, v10

    .line 228
    .end local v9    # "e\\4":Ljava/lang/Object;
    .end local v10    # "v\\4":J
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_4

    .line 229
    nop

    .line 147
    .end local v1    # "$this$maxByOrNull\\4":Ljava/lang/Iterable;
    .end local v4    # "$i$f$maxByOrNull\\4\\147":I
    .end local v5    # "iterator\\4":Ljava/util/Iterator;
    .end local v6    # "maxElem\\4":Ljava/lang/Object;
    .end local v7    # "maxValue\\4":J
    :goto_1
    check-cast v6, Ljava/io/File;

    if-nez v6, :cond_6

    goto :goto_2

    :cond_6
    move-object v3, v6

    goto/16 :goto_5

    .line 148
    :cond_7
    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_e

    .local v1, "$this$filter\\7":[Ljava/lang/Object;
    const/4 v4, 0x0

    .line 230
    .local v4, "$i$f$filter\\7\\148":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\8":Ljava/util/Collection;
    move-object v6, v1

    .local v6, "$this$filterTo\\8":[Ljava/lang/Object;
    const/4 v7, 0x0

    .line 231
    .local v7, "$i$f$filterTo\\8\\230":I
    array-length v8, v6

    move v9, v2

    :goto_3
    if-ge v9, v8, :cond_9

    aget-object v10, v6, v9

    .local v10, "element\\8":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "it\\9":Ljava/io/File;
    const/4 v12, 0x0

    .line 148
    .local v12, "$i$a$-filter-AiToolLogic$latestCrashFile$3\\9\\231\\0":I
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v13

    const-string v14, "getName(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "hs_err_pid"

    const/4 v15, 0x2

    invoke-static {v13, v14, v2, v15, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    .line 231
    .end local v11    # "it\\9":Ljava/io/File;
    .end local v12    # "$i$a$-filter-AiToolLogic$latestCrashFile$3\\9\\231\\0":I
    if-eqz v11, :cond_8

    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v10    # "element\\8":Ljava/lang/Object;
    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 232
    :cond_9
    nop

    .end local v5    # "destination\\8":Ljava/util/Collection;
    .end local v6    # "$this$filterTo\\8":[Ljava/lang/Object;
    .end local v7    # "$i$f$filterTo\\8\\230":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 230
    nop

    .line 148
    .end local v1    # "$this$filter\\7":[Ljava/lang/Object;
    .end local v4    # "$i$f$filter\\7\\148":I
    move-object v1, v2

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$maxByOrNull\\10":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 233
    .local v2, "$i$f$maxByOrNull\\10\\148":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 234
    .local v4, "iterator\\10":Ljava/util/Iterator;
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_4

    .line 235
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 236
    .local v3, "maxElem\\10":Ljava/lang/Object;
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_4

    .line 237
    :cond_b
    move-object v5, v3

    check-cast v5, Ljava/io/File;

    .local v5, "it\\11":Ljava/io/File;
    const/4 v6, 0x0

    .line 148
    .local v6, "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$4\\11\\237\\0":I
    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    .line 237
    .end local v5    # "it\\11":Ljava/io/File;
    .end local v6    # "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$4\\11\\237\\0":I
    nop

    .line 239
    .local v5, "maxValue\\10":J
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 240
    .local v7, "e\\10":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/io/File;

    .local v8, "it\\12":Ljava/io/File;
    const/4 v9, 0x0

    .line 148
    .local v9, "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$4\\12\\240\\0":I
    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v8

    .line 240
    .end local v8    # "it\\12":Ljava/io/File;
    .end local v9    # "$i$a$-maxByOrNull-AiToolLogic$latestCrashFile$4\\12\\240\\0":I
    nop

    .line 241
    .local v8, "v\\10":J
    cmp-long v10, v5, v8

    if-gez v10, :cond_d

    .line 242
    move-object v3, v7

    .line 243
    move-wide v5, v8

    .line 245
    .end local v7    # "e\\10":Ljava/lang/Object;
    .end local v8    # "v\\10":J
    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_c

    .line 246
    nop

    .end local v1    # "$this$maxByOrNull\\10":Ljava/lang/Iterable;
    .end local v2    # "$i$f$maxByOrNull\\10\\148":I
    .end local v3    # "maxElem\\10":Ljava/lang/Object;
    .end local v4    # "iterator\\10":Ljava/util/Iterator;
    .end local v5    # "maxValue\\10":J
    :goto_4
    check-cast v3, Ljava/io/File;

    .line 148
    :cond_e
    :goto_5
    return-object v3
.end method

.method public final launchMessage(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 10
    .param p1, "vid"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "notes"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "vid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    move-object v1, p3

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, "\uff1b"

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const-string v0, "\uff08"

    move-object v3, v0

    check-cast v3, Ljava/lang/CharSequence;

    const-string v0, "\uff09"

    move-object v4, v0

    check-cast v4, Ljava/lang/CharSequence;

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 177
    move-object v1, v0

    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 137
    .local v2, "$i$a$-takeIf-AiToolLogic$launchMessage$1\\1\\137\\0":I
    move-object v3, p3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-AiToolLogic$launchMessage$1\\1\\137\\0":I
    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, ""

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u5df2\u542f\u52a8 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\uff08\u5b9e\u4f8b\u300c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d\uff09\uff0c\u6e38\u620f\u7a97\u53e3\u5df2\u6253\u5f00\u3002"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final launchNotes(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "username"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 177
    nop

    .local v1, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 135
    .local v3, "$i$a$-let-AiToolLogic$launchNotes$1\\1\\135\\0":I
    nop

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-let-AiToolLogic$launchNotes$1\\1\\135\\0":I
    const-string v1, "\u5b89\u5353\u7248\u4e0d\u652f\u6301\u4e34\u65f6\u6307\u5b9a\u7528\u6237\u540d\uff0c\u5df2\u7528\u5f53\u524d\u8d26\u53f7"

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const/4 v3, 0x0

    aput-object v1, v0, v3

    const-string v1, "memory_mb"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 177
    nop

    .local v1, "it\\2":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 135
    .local v2, "$i$a$-let-AiToolLogic$launchNotes$2\\2\\135\\0":I
    nop

    .end local v1    # "it\\2":Ljava/lang/Object;
    .end local v2    # "$i$a$-let-AiToolLogic$launchNotes$2\\2\\135\\0":I
    const-string v2, "\u5185\u5b58\u8bf7\u5728\u8bbe\u7f6e\u91cc\u8c03\u6574\uff0c\u672c\u6b21\u672a\u6539"

    :cond_1
    const/4 v1, 0x1

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final listConfigs(Ljava/io/File;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "prefix"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prefix"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    invoke-static {p1}, Lkotlin/io/FilesKt;->walkTopDown(Ljava/io/File;)Lkotlin/io/FileTreeWalk;

    move-result-object v0

    check-cast v0, Lkotlin/sequences/Sequence;

    new-instance v1, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda2;

    invoke-direct {v1}, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda3;

    invoke-direct {v1, p1}, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda3;-><init>(Ljava/io/File;)V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda4;

    invoke-direct {v1, p2}, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda4;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->filter(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    const/16 v1, 0x12c

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->take(Lkotlin/sequences/Sequence;I)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final loaderArg(Ljava/util/Map;)Ljava/lang/String;
    .locals 6
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    const-string v0, "loader"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v2, v0

    .line 177
    .local v2, "it\\1":Ljava/lang/String;
    const/4 v3, 0x0

    .line 54
    .local v3, "$i$a$-takeIf-AiToolLogic$loaderArg$1\\1\\54\\0":I
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "\u65e0"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "vanilla"

    const/4 v5, 0x1

    invoke-static {v2, v4, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "none"

    invoke-static {v2, v4, v5}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .end local v2    # "it\\1":Ljava/lang/String;
    .end local v3    # "$i$a$-takeIf-AiToolLogic$loaderArg$1\\1\\54\\0":I
    :goto_0
    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    return-object v0
.end method

.method public final loaderOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p1, "v"    # Ljava/lang/String;

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .local v0, "s\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 51
    .local v1, "$i$a$-let-AiToolLogic$loaderOf$1\\1\\51\\0":I
    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "neoforge"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    const-string v5, "forge"

    aput-object v5, v2, v3

    const-string v3, "fabric"

    const/4 v5, 0x2

    aput-object v3, v2, v5

    const/4 v3, 0x3

    const-string v6, "quilt"

    aput-object v6, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull\\2":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 192
    .local v3, "$i$f$firstOrNull\\2\\51":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\3":Ljava/lang/String;
    const/4 v10, 0x0

    .line 51
    .local v10, "$i$a$-firstOrNull-AiToolLogic$loaderOf$1$1\\3\\192\\1":I
    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    move-object v12, v9

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v11, v12, v4, v5, v8}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v8

    .line 192
    .end local v9    # "it\\3":Ljava/lang/String;
    .end local v10    # "$i$a$-firstOrNull-AiToolLogic$loaderOf$1$1\\3\\192\\1":I
    if-eqz v8, :cond_0

    move-object v8, v7

    goto :goto_0

    .line 193
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .line 51
    .end local v2    # "$this$firstOrNull\\2":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull\\2\\51":I
    :goto_0
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_2

    const-string v8, ""

    .end local v0    # "s\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolLogic$loaderOf$1\\1\\51\\0":I
    :cond_2
    return-object v8
.end method

.method public final modActionMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    sget-object v0, Lcom/pymcl/android/data/AiToolLogic;->MOD_ACTION_DONE:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final modActionNeeded(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "filename"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filename"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    nop

    .line 109
    const-string v0, "delete_mod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    goto :goto_0

    .line 110
    :cond_0
    const-string v0, "disable_mod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const-string v4, ".disabled"

    const/4 v5, 0x0

    if-eqz v0, :cond_2

    invoke-static {p2, v4, v5, v3, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v1, v5

    goto :goto_0

    .line 111
    :cond_2
    invoke-static {p2, v4, v5, v3, v2}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    .line 112
    :goto_0
    return v1
.end method

.method public final modInfo(Ljava/io/File;)Ljava/util/Map;
    .locals 27
    .param p1, "f"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p1

    const-string v0, "breaks"

    const-string v2, "depends"

    const-string v3, "name"

    const-string v4, "f"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    :try_start_0
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object/from16 v5, p0

    check-cast v5, Lcom/pymcl/android/data/AiToolLogic;

    .local v5, "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    const/4 v6, 0x0

    .line 159
    .local v6, "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    new-instance v7, Ljava/util/zip/ZipFile;

    invoke-direct {v7, v1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    check-cast v7, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    move-object v8, v7

    check-cast v8, Ljava/util/zip/ZipFile;

    .local v8, "z\\2":Ljava/util/zip/ZipFile;
    const/4 v9, 0x0

    .line 161
    .local v9, "$i$a$-use-AiToolLogic$modInfo$1$1\\2\\159\\1":I
    const-string v10, "fabric.mod.json"

    invoke-static {v8, v10}, Lcom/pymcl/android/data/AiToolLogic;->modInfo$lambda$0$0$txt(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const-string v14, "loader"

    const-string v15, "filename"

    const/16 v16, 0x3

    const-string v12, "version"

    const/16 v17, 0x5

    const-string v11, "id"

    const/16 v18, 0x1

    const/16 v19, 0x2

    if-eqz v10, :cond_7

    .line 177
    .local v10, "it\\3":Ljava/lang/String;
    const/16 v20, 0x0

    .line 161
    .local v20, "$i$a$-let-AiToolLogic$modInfo$1$1$1\\3\\161\\2":I
    const/16 v21, 0x4

    :try_start_2
    sget-object v13, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v13, v10}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v13

    .line 162
    .local v13, "o\\3":Ljava/util/Map;
    const/16 v22, 0x0

    const/4 v4, 0x7

    new-array v4, v4, [Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v22

    const-string v1, "fabric"

    invoke-static {v14, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v18

    invoke-static {v13, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v19

    invoke-static {v13, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v16

    invoke-static {v13, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v4, v21

    .line 163
    invoke-static {v13, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_3

    .local v1, "$this$mapValues\\4":Ljava/util/Map;
    const/4 v3, 0x0

    .line 247
    .local v3, "$i$f$mapValues\\4\\163":I
    new-instance v11, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v12

    invoke-static {v12}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v11, Ljava/util/Map;

    .local v11, "destination\\5":Ljava/util/Map;
    move-object v12, v1

    .local v12, "$this$mapValuesTo\\5":Ljava/util/Map;
    const/4 v14, 0x0

    .line 248
    .local v14, "$i$f$mapValuesTo\\5\\247":I
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    move-object/from16 v16, v11

    .local v15, "$this$associateByTo\\6":Ljava/lang/Iterable;
    .local v16, "destination\\6":Ljava/util/Map;
    const/16 v18, 0x0

    .line 249
    .local v18, "$i$f$associateByTo\\6\\248":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v21

    if-eqz v21, :cond_1

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v21

    .line 250
    .local v21, "element\\6":Ljava/lang/Object;
    move-object/from16 v23, v21

    check-cast v23, Ljava/util/Map$Entry;

    .local v23, "it\\7":Ljava/util/Map$Entry;
    const/16 v24, 0x0

    .line 248
    .local v24, "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1\\7\\250\\5":I
    move-object/from16 v25, v1

    .end local v1    # "$this$mapValues\\4":Ljava/util/Map;
    .local v25, "$this$mapValues\\4":Ljava/util/Map;
    invoke-interface/range {v23 .. v23}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 250
    .end local v23    # "it\\7":Ljava/util/Map$Entry;
    .end local v24    # "$i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1\\7\\250\\5":I
    move-object/from16 v23, v21

    check-cast v23, Ljava/util/Map$Entry;

    const/16 v24, 0x0

    .local v24, "$i$a$-mapValues-AiToolLogic$modInfo$1$1$1$1\\8\\250\\3":I
    invoke-interface/range {v23 .. v23}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v23

    .line 163
    .local v23, "x\\8":Ljava/lang/Object;
    if-eqz v23, :cond_0

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v26

    move/from16 v23, v3

    move-object/from16 v3, v26

    goto :goto_1

    :cond_0
    move/from16 v23, v3

    const/4 v3, 0x0

    .line 250
    .end local v3    # "$i$f$mapValues\\4\\163":I
    .end local v24    # "$i$a$-mapValues-AiToolLogic$modInfo$1$1$1$1\\8\\250\\3":I
    .local v23, "$i$f$mapValues\\4\\163":I
    :goto_1
    move-object/from16 v24, v4

    move-object/from16 v4, v16

    .end local v16    # "destination\\6":Ljava/util/Map;
    .local v4, "destination\\6":Ljava/util/Map;
    invoke-interface {v4, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v4

    move/from16 v3, v23

    move-object/from16 v4, v24

    move-object/from16 v1, v25

    goto :goto_0

    .line 252
    .end local v4    # "destination\\6":Ljava/util/Map;
    .end local v21    # "element\\6":Ljava/lang/Object;
    .end local v23    # "$i$f$mapValues\\4\\163":I
    .end local v25    # "$this$mapValues\\4":Ljava/util/Map;
    .restart local v1    # "$this$mapValues\\4":Ljava/util/Map;
    .restart local v3    # "$i$f$mapValues\\4\\163":I
    .restart local v16    # "destination\\6":Ljava/util/Map;
    :cond_1
    move-object/from16 v25, v1

    move/from16 v23, v3

    move-object/from16 v24, v4

    move-object/from16 v4, v16

    .line 248
    .end local v1    # "$this$mapValues\\4":Ljava/util/Map;
    .end local v3    # "$i$f$mapValues\\4\\163":I
    .end local v15    # "$this$associateByTo\\6":Ljava/lang/Iterable;
    .end local v16    # "destination\\6":Ljava/util/Map;
    .end local v18    # "$i$f$associateByTo\\6\\248":I
    .restart local v23    # "$i$f$mapValues\\4\\163":I
    .restart local v25    # "$this$mapValues\\4":Ljava/util/Map;
    nop

    .line 247
    .end local v11    # "destination\\5":Ljava/util/Map;
    .end local v12    # "$this$mapValuesTo\\5":Ljava/util/Map;
    .end local v14    # "$i$f$mapValuesTo\\5\\247":I
    nop

    .line 163
    .end local v23    # "$i$f$mapValues\\4\\163":I
    .end local v25    # "$this$mapValues\\4":Ljava/util/Map;
    nop

    .line 177
    nop

    .local v4, "m\\9":Ljava/util/Map;
    const/4 v1, 0x0

    .line 163
    .local v1, "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    move-object v3, v4

    .local v3, "$this$map\\10":Ljava/util/Map;
    const/4 v11, 0x0

    .line 253
    .local v11, "$i$f$map\\10\\163":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v14

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination\\11":Ljava/util/Collection;
    move-object v14, v3

    .local v14, "$this$mapTo\\11":Ljava/util/Map;
    const/4 v15, 0x0

    .line 254
    .local v15, "$i$f$mapTo\\11\\253":I
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    check-cast v18, Ljava/util/Map$Entry;

    .line 255
    .local v18, "item\\11":Ljava/util/Map$Entry;
    move-object/from16 v19, v18

    .local v19, "it\\12":Ljava/util/Map$Entry;
    const/16 v21, 0x0

    .line 163
    .local v21, "$i$a$-map-AiToolLogic$modInfo$1$1$1$2$1\\12\\255\\9":I
    move/from16 v23, v1

    .end local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    .local v23, "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v3

    .end local v3    # "$this$map\\10":Ljava/util/Map;
    .local v25, "$this$map\\10":Ljava/util/Map;
    invoke-interface/range {v19 .. v19}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 255
    .end local v19    # "it\\12":Ljava/util/Map$Entry;
    .end local v21    # "$i$a$-map-AiToolLogic$modInfo$1$1$1$2$1\\12\\255\\9":I
    invoke-interface {v12, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v1, v23

    move-object/from16 v3, v25

    goto :goto_2

    .line 256
    .end local v18    # "item\\11":Ljava/util/Map$Entry;
    .end local v23    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    .end local v25    # "$this$map\\10":Ljava/util/Map;
    .restart local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    .restart local v3    # "$this$map\\10":Ljava/util/Map;
    :cond_2
    move/from16 v23, v1

    move-object/from16 v25, v3

    .end local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    .end local v3    # "$this$map\\10":Ljava/util/Map;
    .end local v12    # "destination\\11":Ljava/util/Collection;
    .end local v14    # "$this$mapTo\\11":Ljava/util/Map;
    .end local v15    # "$i$f$mapTo\\11\\253":I
    .restart local v23    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    .restart local v25    # "$this$map\\10":Ljava/util/Map;
    move-object v1, v12

    check-cast v1, Ljava/util/List;

    .line 253
    nop

    .end local v11    # "$i$f$map\\10\\163":I
    .end local v25    # "$this$map\\10":Ljava/util/Map;
    check-cast v1, Ljava/util/Collection;

    .line 163
    nop

    .local v1, "$this$toTypedArray\\13":Ljava/util/Collection;
    const/4 v3, 0x0

    .line 257
    .local v3, "$i$f$toTypedArray\\13\\163":I
    move-object v11, v1

    .line 258
    .local v11, "this_\\13":Ljava/util/Collection;
    move/from16 v12, v22

    new-array v14, v12, [Lkotlin/Pair;

    invoke-interface {v11, v14}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v12

    .line 163
    .end local v1    # "$this$toTypedArray\\13":Ljava/util/Collection;
    .end local v3    # "$i$f$toTypedArray\\13\\163":I
    .end local v11    # "this_\\13":Ljava/util/Collection;
    check-cast v12, [Lkotlin/Pair;

    array-length v1, v12

    invoke-static {v12, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .end local v4    # "m\\9":Ljava/util/Map;
    .end local v23    # "$i$a$-let-AiToolLogic$modInfo$1$1$1$2\\9\\163\\3":I
    if-nez v1, :cond_4

    goto :goto_3

    :cond_3
    move-object/from16 v24, v4

    :goto_3
    const/4 v12, 0x0

    new-array v1, v12, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    :cond_4
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v24, v17

    .line 162
    nop

    .line 164
    invoke-static {v13, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Ljava/util/Collection;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_6

    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    :cond_6
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v24, v1

    .line 162
    invoke-static/range {v24 .. v24}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_6

    .line 159
    .end local v8    # "z\\2":Ljava/util/zip/ZipFile;
    .end local v9    # "$i$a$-use-AiToolLogic$modInfo$1$1\\2\\159\\1":I
    .end local v10    # "it\\3":Ljava/lang/String;
    .end local v13    # "o\\3":Ljava/util/Map;
    .end local v20    # "$i$a$-let-AiToolLogic$modInfo$1$1$1\\3\\161\\2":I
    :catchall_0
    move-exception v0

    move-object v1, v0

    const/4 v13, 0x0

    goto/16 :goto_7

    .line 165
    .restart local v8    # "z\\2":Ljava/util/zip/ZipFile;
    .restart local v9    # "$i$a$-use-AiToolLogic$modInfo$1$1\\2\\159\\1":I
    :cond_7
    const/16 v21, 0x4

    :try_start_3
    const-string v0, "quilt.mod.json"

    invoke-static {v8, v0}, Lcom/pymcl/android/data/AiToolLogic;->modInfo$lambda$0$0$txt(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_8

    .line 177
    .local v0, "it\\14":Ljava/lang/String;
    const/4 v1, 0x0

    .line 165
    .local v1, "$i$a$-let-AiToolLogic$modInfo$1$1$2\\14\\165\\2":I
    :try_start_4
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "quilt_loader"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    .line 166
    .local v2, "o\\14":Ljava/util/Map;
    move/from16 v3, v21

    new-array v3, v3, [Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v15, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/16 v22, 0x0

    aput-object v4, v3, v22

    const-string v4, "quilt"

    invoke-static {v14, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v18

    invoke-static {v2, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v11, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v19

    invoke-static {v2, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v12, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v16

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object v0, v3

    goto/16 :goto_6

    .line 167
    .end local v0    # "it\\14":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$2\\14\\165\\2":I
    .end local v2    # "o\\14":Ljava/util/Map;
    :cond_8
    :try_start_5
    const-string v0, "META-INF/neoforge.mods.toml"

    invoke-static {v8, v0}, Lcom/pymcl/android/data/AiToolLogic;->modInfo$lambda$0$0$txt(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-eqz v0, :cond_9

    .line 177
    .local v0, "it\\15":Ljava/lang/String;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-let-AiToolLogic$modInfo$1$1$3\\15\\167\\2":I
    :try_start_6
    const-string v2, "neoforge"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .end local v0    # "it\\15":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$3\\15\\167\\2":I
    if-nez v2, :cond_b

    :cond_9
    :try_start_7
    const-string v0, "META-INF/mods.toml"

    invoke-static {v8, v0}, Lcom/pymcl/android/data/AiToolLogic;->modInfo$lambda$0$0$txt(Ljava/util/zip/ZipFile;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-eqz v0, :cond_a

    .line 177
    .local v0, "it\\16":Ljava/lang/String;
    const/4 v1, 0x0

    .line 167
    .local v1, "$i$a$-let-AiToolLogic$modInfo$1$1$4\\16\\167\\2":I
    :try_start_8
    const-string v2, "forge"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    .end local v0    # "it\\16":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolLogic$modInfo$1$1$4\\16\\167\\2":I
    goto :goto_4

    :cond_a
    const/4 v2, 0x0

    :cond_b
    :goto_4
    if-eqz v2, :cond_d

    const/4 v0, 0x0

    .local v0, "$i$a$-let-AiToolLogic$modInfo$1$1$5\\17\\167\\2":I
    invoke-virtual {v2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .local v1, "t\\17":Ljava/lang/String;
    invoke-virtual {v2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 168
    .local v2, "l\\17":Ljava/lang/String;
    new-instance v3, Lkotlin/text/Regex;

    const-string v4, "modId\\s*=\\s*\"([^\"]+)\""

    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    move/from16 v20, v0

    move/from16 v10, v19

    const/4 v0, 0x0

    const/4 v13, 0x0

    .end local v0    # "$i$a$-let-AiToolLogic$modInfo$1$1$5\\17\\167\\2":I
    .local v20, "$i$a$-let-AiToolLogic$modInfo$1$1$5\\17\\167\\2":I
    invoke-static {v3, v4, v0, v10, v13}, Lkotlin/text/Regex;->findAll$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v3

    new-instance v0, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v3, v0}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    .line 169
    .local v0, "ids\\17":Ljava/util/List;
    new-instance v3, Lkotlin/text/Regex;

    const-string v4, "(?m)^\\s*version\\s*=\\s*\"([^\"]+)\""

    invoke-direct {v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v4, v1

    check-cast v4, Ljava/lang/CharSequence;

    move-object/from16 v23, v0

    const/4 v0, 0x0

    const/4 v10, 0x2

    const/4 v13, 0x0

    .end local v0    # "ids\\17":Ljava/util/List;
    .local v23, "ids\\17":Ljava/util/List;
    invoke-static {v3, v4, v0, v10, v13}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-interface {v3}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_c

    move/from16 v3, v18

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ljava/lang/String;

    goto :goto_5

    :cond_c
    const/4 v13, 0x0

    .line 170
    .local v13, "ver\\17":Ljava/lang/String;
    :goto_5
    move/from16 v0, v17

    new-array v0, v0, [Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v22, 0x0

    aput-object v3, v0, v22

    invoke-static {v14, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v18, 0x1

    aput-object v3, v0, v18

    invoke-static/range {v23 .. v23}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v19, 0x2

    aput-object v3, v0, v19

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    aput-object v3, v0, v16

    const-string v3, "mod_ids"

    move-object/from16 v4, v23

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v21, 0x4

    aput-object v3, v0, v21

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_6

    .line 172
    .end local v1    # "t\\17":Ljava/lang/String;
    .end local v2    # "l\\17":Ljava/lang/String;
    .end local v13    # "ver\\17":Ljava/lang/String;
    .end local v20    # "$i$a$-let-AiToolLogic$modInfo$1$1$5\\17\\167\\2":I
    .end local v23    # "ids\\17":Ljava/util/List;
    :cond_d
    const/4 v10, 0x2

    :try_start_9
    new-array v0, v10, [Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v22, 0x0

    aput-object v1, v0, v22

    const-string v1, "unknown"

    invoke-static {v14, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v18, 0x1

    aput-object v1, v0, v18

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 159
    .end local v8    # "z\\2":Ljava/util/zip/ZipFile;
    .end local v9    # "$i$a$-use-AiToolLogic$modInfo$1$1\\2\\159\\1":I
    :goto_6
    const/4 v13, 0x0

    :try_start_a
    invoke-static {v7, v13}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 173
    nop

    .line 158
    .end local v5    # "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    .end local v6    # "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_9

    .line 159
    .restart local v5    # "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    .restart local v6    # "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    :catchall_1
    move-exception v0

    const/4 v13, 0x0

    move-object v1, v0

    .end local v5    # "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    .end local v6    # "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    .end local p1    # "f":Ljava/io/File;
    :goto_7
    :try_start_b
    throw v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .restart local v5    # "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    .restart local v6    # "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    .restart local p1    # "f":Ljava/io/File;
    :catchall_2
    move-exception v0

    :try_start_c
    invoke-static {v7, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "f":Ljava/io/File;
    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 158
    .end local v5    # "$this$modInfo_u24lambda_u240\\1":Lcom/pymcl/android/data/AiToolLogic;
    .end local v6    # "$i$a$-runCatching-AiToolLogic$modInfo$1\\1\\158\\0":I
    .restart local p1    # "f":Ljava/io/File;
    :catchall_3
    move-exception v0

    goto :goto_8

    :catchall_4
    move-exception v0

    const/4 v13, 0x0

    :goto_8
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 174
    :goto_9
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    move-object v4, v13

    goto :goto_a

    :cond_e
    move-object v4, v0

    :goto_a
    check-cast v4, Ljava/util/Map;

    return-object v4
.end method

.method public final noFileMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loader"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    move-object v0, p3

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, ""

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " \u6ca1\u6709\u9002\u914d "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " \u7684\u7248\u672c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final noInstanceMessage(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "all"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "all"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, "\u3001"

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u6ca1\u6709\u540d\u4e3a\u300c"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u300d\u7684\u5b9e\u4f8b\u3002\u53ef\u7528\u5b9e\u4f8b\uff1a"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final noModMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u627e\u4e0d\u5230\u6a21\u7ec4\u6587\u4ef6\u300c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u300d\uff0c\u5148\u7528 list_mods \u67e5\u770b\u6587\u4ef6\u540d"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final noVersionMessage(Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "instance"    # Ljava/lang/String;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5b9e\u4f8b\u300c"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\u300d\u8fd8\u6ca1\u6709\u5b89\u88c5\u4efb\u4f55\u6e38\u620f\u7248\u672c\uff0c\u5148\u7528 install_game \u5b89\u88c5"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final pickHit(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/mods/ModHit;
    .locals 12
    .param p1, "hits"    # Ljava/util/List;
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModHit;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/pymcl/core/mods/ModHit;"
        }
    .end annotation

    const-string v0, "hits"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 207
    .local v1, "$i$f$firstOrNull\\1\\120":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v6, v3

    check-cast v6, Lcom/pymcl/core/mods/ModHit;

    .local v6, "it\\2":Lcom/pymcl/core/mods/ModHit;
    const/4 v7, 0x0

    .line 120
    .local v7, "$i$a$-firstOrNull-AiToolLogic$pickHit$1\\2\\207\\0":I
    invoke-virtual {v6}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v6}, Lcom/pymcl/core/mods/ModHit;->getSlug()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p2, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v6}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, ":"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-static {v8, v9, v11, v10, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    :cond_1
    move v11, v4

    .line 207
    .end local v6    # "it\\2":Lcom/pymcl/core/mods/ModHit;
    .end local v7    # "$i$a$-firstOrNull-AiToolLogic$pickHit$1\\2\\207\\0":I
    :cond_2
    if-eqz v11, :cond_0

    goto :goto_0

    .line 208
    .end local v3    # "element\\1":Ljava/lang/Object;
    :cond_3
    move-object v3, v5

    .line 120
    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\1\\120":I
    :goto_0
    check-cast v3, Lcom/pymcl/core/mods/ModHit;

    if-nez v3, :cond_6

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\3":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 207
    .local v1, "$i$f$firstOrNull\\3\\120":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\3":Ljava/lang/Object;
    move-object v6, v3

    check-cast v6, Lcom/pymcl/core/mods/ModHit;

    .local v6, "it\\4":Lcom/pymcl/core/mods/ModHit;
    const/4 v7, 0x0

    .line 120
    .local v7, "$i$a$-firstOrNull-AiToolLogic$pickHit$2\\4\\207\\0":I
    invoke-virtual {v6}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p3, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    .line 207
    .end local v6    # "it\\4":Lcom/pymcl/core/mods/ModHit;
    .end local v7    # "$i$a$-firstOrNull-AiToolLogic$pickHit$2\\4\\207\\0":I
    if-eqz v6, :cond_4

    move-object v5, v3

    goto :goto_1

    .line 208
    .end local v3    # "element\\3":Ljava/lang/Object;
    :cond_5
    nop

    .line 120
    .end local v0    # "$this$firstOrNull\\3":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\3\\120":I
    :goto_1
    move-object v3, v5

    check-cast v3, Lcom/pymcl/core/mods/ModHit;

    if-nez v3, :cond_6

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/pymcl/core/mods/ModHit;

    :cond_6
    return-object v3
.end method

.method public final pickVersion(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;
    .locals 8
    .param p1, "installed"    # Ljava/util/List;
    .param p2, "argVersion"    # Ljava/lang/String;
    .param p3, "metaMc"    # Ljava/lang/String;
    .param p4, "lastModified"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "installed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastModified"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x0

    if-eqz p2, :cond_1

    move-object v1, p2

    .line 177
    .local v1, "it\\1":Ljava/lang/String;
    const/4 v2, 0x0

    .line 44
    .local v2, "$i$a$-takeIf-AiToolLogic$pickVersion$1\\1\\44\\0":I
    move-object v3, v1

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    .end local v1    # "it\\1":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-AiToolLogic$pickVersion$1\\1\\44\\0":I
    if-nez v3, :cond_0

    move-object v1, p2

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    .line 177
    .local v1, "it\\2":Ljava/lang/String;
    const/4 v2, 0x0

    .line 44
    .local v2, "$i$a$-let-AiToolLogic$pickVersion$2\\2\\44\\0":I
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    .line 45
    .end local v1    # "it\\2":Ljava/lang/String;
    .end local v2    # "$i$a$-let-AiToolLogic$pickVersion$2\\2\\44\\0":I
    :cond_1
    if-eqz p3, :cond_3

    move-object v1, p3

    .line 177
    .local v1, "it\\3":Ljava/lang/String;
    const/4 v2, 0x0

    .line 45
    .local v2, "$i$a$-takeIf-AiToolLogic$pickVersion$3\\3\\45\\0":I
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    .end local v1    # "it\\3":Ljava/lang/String;
    .end local v2    # "$i$a$-takeIf-AiToolLogic$pickVersion$3\\3\\45\\0":I
    if-eqz v1, :cond_2

    move-object v1, p3

    goto :goto_1

    :cond_2
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_3

    .line 177
    .local v1, "it\\4":Ljava/lang/String;
    const/4 v0, 0x0

    .line 45
    .local v0, "$i$a$-let-AiToolLogic$pickVersion$4\\4\\45\\0":I
    return-object v1

    .line 46
    .end local v0    # "$i$a$-let-AiToolLogic$pickVersion$4\\4\\45\\0":I
    .end local v1    # "it\\4":Ljava/lang/String;
    :cond_3
    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$maxByOrNull\\5":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 178
    .local v2, "$i$f$maxByOrNull\\5\\46":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 179
    .local v3, "iterator\\5":Ljava/util/Iterator;
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    .line 180
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 181
    .local v0, "maxElem\\5":Ljava/lang/Object;
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 182
    :cond_5
    invoke-interface {p4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    .line 184
    .local v4, "maxValue\\5":Ljava/lang/Comparable;
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .line 185
    .local v5, "e\\5":Ljava/lang/Object;
    invoke-interface {p4, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Comparable;

    .line 186
    .local v6, "v\\5":Ljava/lang/Comparable;
    invoke-interface {v4, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v7

    if-gez v7, :cond_7

    .line 187
    move-object v0, v5

    .line 188
    move-object v4, v6

    .line 190
    .end local v5    # "e\\5":Ljava/lang/Object;
    .end local v6    # "v\\5":Ljava/lang/Comparable;
    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_6

    .line 191
    nop

    .end local v0    # "maxElem\\5":Ljava/lang/Object;
    .end local v1    # "$this$maxByOrNull\\5":Ljava/lang/Iterable;
    .end local v2    # "$i$f$maxByOrNull\\5\\46":I
    .end local v3    # "iterator\\5":Ljava/util/Iterator;
    .end local v4    # "maxValue\\5":Ljava/lang/Comparable;
    :goto_2
    check-cast v0, Ljava/lang/String;

    .line 46
    return-object v0
.end method

.method public final required(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "a"    # Ljava/util/Map;
    .param p2, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-static {p1, p2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u7f3a\u5c11 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final resolveModName(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p1, "list"    # Ljava/util/List;
    .param p2, "name"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 200
    .local v1, "$i$f$firstOrNull\\1\\102":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v5, v3

    check-cast v5, Ljava/lang/String;

    .local v5, "it\\2":Ljava/lang/String;
    const/4 v6, 0x0

    .line 102
    .local v6, "$i$a$-firstOrNull-AiToolLogic$resolveModName$1\\2\\200\\0":I
    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 200
    .end local v5    # "it\\2":Ljava/lang/String;
    .end local v6    # "$i$a$-firstOrNull-AiToolLogic$resolveModName$1\\2\\200\\0":I
    if-eqz v5, :cond_0

    goto :goto_0

    .line 201
    .end local v3    # "element\\1":Ljava/lang/Object;
    :cond_1
    move-object v3, v4

    .line 102
    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\1\\102":I
    :goto_0
    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_8

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\3":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 200
    .local v1, "$i$f$firstOrNull\\3\\102":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const-string v5, ".disabled"

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\3":Ljava/lang/Object;
    move-object v6, v3

    check-cast v6, Ljava/lang/String;

    .local v6, "it\\4":Ljava/lang/String;
    const/4 v7, 0x0

    .line 102
    .local v7, "$i$a$-firstOrNull-AiToolLogic$resolveModName$2\\4\\200\\0":I
    move-object v8, v5

    check-cast v8, Ljava/lang/CharSequence;

    invoke-static {v6, v8}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    move-object v9, v5

    check-cast v9, Ljava/lang/CharSequence;

    invoke-static {p2, v9}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 200
    .end local v6    # "it\\4":Ljava/lang/String;
    .end local v7    # "$i$a$-firstOrNull-AiToolLogic$resolveModName$2\\4\\200\\0":I
    if-eqz v6, :cond_2

    goto :goto_1

    .line 201
    .end local v3    # "element\\3":Ljava/lang/Object;
    :cond_3
    move-object v3, v4

    .line 102
    .end local v0    # "$this$firstOrNull\\3":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\3\\102":I
    :goto_1
    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_8

    .line 103
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\5":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 202
    .local v1, "$i$f$firstOrNull\\5\\103":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v6, 0x1

    const-string v7, ".jar"

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\5":Ljava/lang/Object;
    move-object v8, v3

    check-cast v8, Ljava/lang/String;

    .local v8, "it\\6":Ljava/lang/String;
    const/4 v9, 0x0

    .line 103
    .local v9, "$i$a$-firstOrNull-AiToolLogic$resolveModName$3\\6\\202\\0":I
    move-object v10, v5

    check-cast v10, Ljava/lang/CharSequence;

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    move-object v11, v7

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    move-object v11, v7

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {p2, v11}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11, v6}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v8

    .line 202
    .end local v8    # "it\\6":Ljava/lang/String;
    .end local v9    # "$i$a$-firstOrNull-AiToolLogic$resolveModName$3\\6\\202\\0":I
    if-eqz v8, :cond_4

    move-object v4, v3

    goto :goto_2

    .line 203
    .end local v3    # "element\\5":Ljava/lang/Object;
    :cond_5
    nop

    .line 103
    .end local v0    # "$this$firstOrNull\\5":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\5\\103":I
    :goto_2
    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    .line 102
    if-nez v3, :cond_8

    .line 104
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter\\7":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 204
    .local v1, "$i$f$filter\\7\\104":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\8":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$filterTo\\8":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 205
    .local v4, "$i$f$filterTo\\8\\204":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\8":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\9":Ljava/lang/String;
    const/4 v10, 0x0

    .line 104
    .local v10, "$i$a$-filter-AiToolLogic$resolveModName$4\\9\\205\\0":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    move-object v12, v7

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {p2, v12}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v12

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v11, v12, v6}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    .line 205
    .end local v9    # "it\\9":Ljava/lang/String;
    .end local v10    # "$i$a$-filter-AiToolLogic$resolveModName$4\\9\\205\\0":I
    if-eqz v9, :cond_6

    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 206
    .end local v8    # "element\\8":Ljava/lang/Object;
    :cond_7
    nop

    .end local v2    # "destination\\8":Ljava/util/Collection;
    .end local v3    # "$this$filterTo\\8":Ljava/lang/Iterable;
    .end local v4    # "$i$f$filterTo\\8\\204":I
    check-cast v2, Ljava/util/List;

    .line 204
    nop

    .line 104
    .end local v0    # "$this$filter\\7":Ljava/lang/Iterable;
    .end local v1    # "$i$f$filter\\7\\104":I
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->singleOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    :cond_8
    return-object v3
.end method

.method public final searchJson(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .param p1, "hits"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/mods/ModHit;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "hits"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->take(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 209
    .local v2, "$i$f$map\\1\\130":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, v3

    check-cast v1, Ljava/util/Collection;

    .local v1, "destination\\2":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 210
    .local v4, "$i$f$mapTo\\2\\209":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 211
    .local v6, "item\\2":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/mods/ModHit;

    .local v7, "it\\3":Lcom/pymcl/core/mods/ModHit;
    const/4 v8, 0x0

    .line 131
    .local v8, "$i$a$-map-AiToolLogic$searchJson$1\\3\\211\\0":I
    const/4 v9, 0x7

    new-array v9, v9, [Lkotlin/Pair;

    const-string v10, "id"

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    const-string v10, "slug"

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getSlug()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x1

    aput-object v10, v9, v11

    const-string v10, "title"

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x2

    aput-object v10, v9, v11

    const-string v10, "author"

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getAuthor()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x3

    aput-object v10, v9, v11

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getDownloads()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v11, "downloads"

    invoke-static {v11, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x4

    aput-object v10, v9, v11

    const-string v10, "source"

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getSource()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x5

    aput-object v10, v9, v11

    invoke-virtual {v7}, Lcom/pymcl/core/mods/ModHit;->getDesc()Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x78

    invoke-static {v10, v11}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "desc"

    invoke-static {v11, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    const/4 v11, 0x6

    aput-object v10, v9, v11

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v7

    .line 211
    .end local v7    # "it\\3":Lcom/pymcl/core/mods/ModHit;
    .end local v8    # "$i$a$-map-AiToolLogic$searchJson$1\\3\\211\\0":I
    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 212
    .end local v6    # "item\\2":Ljava/lang/Object;
    :cond_0
    nop

    .end local v1    # "destination\\2":Ljava/util/Collection;
    .end local v3    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo\\2\\209":I
    check-cast v1, Ljava/util/List;

    .line 209
    nop

    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map\\1\\130":I
    check-cast v1, Ljava/util/Collection;

    .line 132
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final sourceOf(Ljava/util/Map;)Ljava/lang/String;
    .locals 4
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    const-string v0, "source"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "curseforge"

    const-string v3, "modrinth"

    sparse-switch v1, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v1, "mr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :sswitch_1
    const-string v1, "cf"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :sswitch_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :sswitch_3
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    goto :goto_2

    :cond_2
    :goto_1
    const-string v2, "all"

    :cond_3
    :goto_2
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x242fb7f7 -> :sswitch_3
        -0xc74e9eb -> :sswitch_2
        0xc63 -> :sswitch_1
        0xda5 -> :sswitch_0
    .end sparse-switch
.end method

.method public final tail(Ljava/io/File;I)Ljava/lang/String;
    .locals 10
    .param p1, "f"    # Ljava/io/File;
    .param p2, "n"    # I

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, Lkotlin/io/FilesKt;->readLines$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->takeLast(Ljava/util/List;I)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, "\n"

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v7, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda1;

    invoke-direct {v7}, Lcom/pymcl/android/data/AiToolLogic$$ExternalSyntheticLambda1;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final versionQuery(Ljava/util/Map;)Ljava/lang/String;
    .locals 3
    .param p1, "a"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "a"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    const-string v0, "query"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 177
    .local v0, "it\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 65
    .local v1, "$i$a$-let-AiToolLogic$versionQuery$1\\1\\65\\0":I
    const-string v2, "\u6700\u65b0\u7248"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "latest"

    move-object v0, v2

    .end local v0    # "it\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-let-AiToolLogic$versionQuery$1\\1\\65\\0":I
    :cond_1
    return-object v0
.end method

.method public final writeConfig(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1, "f"    # Ljava/io/File;
    .param p2, "content"    # Ljava/lang/String;

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    const-string v1, ".bak"

    if-eqz v0, :cond_0

    new-instance v3, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v2, p1

    .end local p1    # "f":Ljava/io/File;
    .local v2, "f":Ljava/io/File;
    invoke-static/range {v2 .. v7}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    goto :goto_0

    .end local v2    # "f":Ljava/io/File;
    .restart local p1    # "f":Ljava/io/File;
    :cond_0
    move-object v2, p1

    .line 153
    .end local p1    # "f":Ljava/io/File;
    .restart local v2    # "f":Ljava/io/File;
    :goto_0
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    :cond_1
    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-static {v2, p2, v0, p1, v0}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 154
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\uff08\u539f\u6587\u4ef6\u5907\u4efd\u4e3a "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".bak\uff09"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    const-string v0, ""

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5df2\u5199\u5165 "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
