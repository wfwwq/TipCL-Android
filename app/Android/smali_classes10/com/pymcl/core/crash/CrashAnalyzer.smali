.class public final Lcom/pymcl/core/crash/CrashAnalyzer;
.super Ljava/lang/Object;
.source "CrashAnalyzer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrashAnalyzer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashAnalyzer.kt\ncom/pymcl/core/crash/CrashAnalyzer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1960#2,3:117\n1739#2:120\n1814#2,3:121\n1960#2,3:124\n777#2:128\n873#2,2:129\n1#3:127\n*S KotlinDebug\n*F\n+ 1 CrashAnalyzer.kt\ncom/pymcl/core/crash/CrashAnalyzer\n*L\n74#1:117,3\n86#1:120\n86#1:121,3\n87#1:124,3\n48#1:128\n48#1:129,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J.\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0014\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R)\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"
    }
    d2 = {
        "Lcom/pymcl/core/crash/CrashAnalyzer;",
        "",
        "<init>",
        "()V",
        "TITLES",
        "",
        "",
        "getTITLES",
        "()Ljava/util/Map;",
        "TABLE",
        "Lkotlin/Pair;",
        "",
        "getTABLE",
        "seek",
        "t",
        "re",
        "all",
        "",
        "opt",
        "",
        "Lkotlin/text/RegexOption;",
        "analyze",
        "Lcom/pymcl/core/crash/CrashReason;",
        "i",
        "Lcom/pymcl/core/crash/CrashInput;",
        "describeExit",
        "code",
        "",
        "SECRET1",
        "Lkotlin/text/Regex;",
        "SECRET2",
        "filterSecrets",
        "s",
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
.field public static final INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

.field private static final SECRET1:Lkotlin/text/Regex;

.field private static final SECRET2:Lkotlin/text/Regex;

.field private static final TABLE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final TITLES:Ljava/util/Map;
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
.method public static synthetic $r8$lambda$MPZWs_T8qtMRi8ybsdqYJHJ1M2k(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/crash/CrashAnalyzer;->all$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/pymcl/core/crash/CrashAnalyzer;

    invoke-direct {v0}, Lcom/pymcl/core/crash/CrashAnalyzer;-><init>()V

    sput-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    .line 13
    const/16 v0, 0x11

    new-array v1, v0, [Lkotlin/Pair;

    const-string v2, "\u5185\u5b58\u4e0d\u8db3"

    const-string v3, "oom"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v4, 0x0

    .line 18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    .line 13
    aput-object v2, v1, v4

    const-string v2, "Java \u7248\u672c\u4e0d\u517c\u5bb9"

    const-string v6, "java_mismatch"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v7, 0x1

    .line 28
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 13
    aput-object v2, v1, v7

    const-string v2, "Java \u7248\u672c\u8fc7\u9ad8"

    const-string v9, "java_too_new"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v10, 0x2

    aput-object v2, v1, v10

    const-string v2, "\u9700\u8981 Java 11"

    const-string v11, "need_java11"

    invoke-static {v11, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v12, 0x3

    aput-object v2, v1, v12

    const-string v2, "mod_certain"

    const-string v13, "Mod \u5bfc\u81f4\u5d29\u6e83"

    invoke-static {v2, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v13, 0x4

    aput-object v2, v1, v13

    .line 14
    const-string v2, "mixin"

    const-string v14, "Mod \u6ce8\u5165\u5931\u8d25"

    invoke-static {v2, v14}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v14, 0x5

    aput-object v2, v1, v14

    .line 13
    nop

    .line 14
    const-string v2, "fabric_solution"

    const-string v15, "Fabric \u62a5\u9519"

    invoke-static {v2, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v15, 0x6

    aput-object v2, v1, v15

    .line 13
    nop

    .line 14
    const-string v2, "fabric_remap"

    move/from16 v16, v0

    const-string v0, "Fabric \u65e0\u6cd5\u751f\u6210\u6e38\u620f jar"

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x7

    aput-object v0, v1, v2

    .line 13
    nop

    .line 14
    const-string v0, "forge_error"

    move/from16 v17, v2

    const-string v2, "Forge \u62a5\u9519"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x8

    aput-object v0, v1, v2

    .line 13
    nop

    .line 14
    const-string v0, "mod_dup"

    move/from16 v18, v2

    const-string v2, "Mod \u91cd\u590d\u5b89\u88c5"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x9

    aput-object v0, v1, v2

    .line 13
    nop

    .line 15
    const-string v0, "mod_missing"

    move/from16 v19, v2

    const-string v2, "\u7f3a\u5c11\u524d\u7f6e Mod"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xa

    aput-object v0, v1, v2

    .line 13
    nop

    .line 15
    const-string v0, "mod_incompat"

    move/from16 v20, v2

    const-string v2, "Mod \u4e0d\u517c\u5bb9"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xb

    aput-object v0, v1, v2

    .line 13
    nop

    .line 15
    const-string v0, "nvidia_av"

    move/from16 v21, v2

    const-string v2, "\u663e\u5361\u9a71\u52a8\u5d29\u6e83"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v22, 0xc

    aput-object v0, v1, v22

    .line 13
    nop

    .line 15
    const-string v0, "intel_av"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v23, 0xd

    aput-object v0, v1, v23

    .line 13
    nop

    .line 15
    const-string v0, "amd_av"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xe

    aput-object v0, v1, v2

    .line 13
    nop

    .line 16
    const-string v0, "pixel_format"

    move/from16 v24, v2

    const-string v2, "\u663e\u5361\u65e0\u6cd5\u8bbe\u7f6e\u50cf\u7d20\u683c\u5f0f"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0xf

    aput-object v0, v1, v2

    .line 13
    nop

    .line 16
    const-string v0, "debug_crash"

    move/from16 v25, v2

    const-string v2, "\u624b\u52a8\u8c03\u8bd5\u5d29\u6e83"

    invoke-static {v0, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/16 v2, 0x10

    aput-object v0, v1, v2

    .line 13
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->TITLES:Ljava/util/Map;

    .line 17
    nop

    .line 18
    const/16 v0, 0x17

    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "\u7531\u4e8e Java \u53c2\u6570\u6709\u8bef\uff0c\u5bfc\u81f4\u6e38\u620f\u65e0\u6cd5\u7ee7\u7eed\u8fd0\u884c\u3002\n\u8bf7\u68c0\u67e5\u542f\u52a8\u8bbe\u7f6e\u91cc\u7684 Java \u865a\u62df\u673a\u53c2\u6570\u548c\u6e38\u620f\u53c2\u6570\u662f\u5426\u6709\u8bef\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "jvm_args"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v4

    .line 19
    const-string v1, "\u7531\u4e8e Mod \u6587\u4ef6\u88ab\u89e3\u538b\u4e86\uff0c\u5bfc\u81f4\u6e38\u620f\u65e0\u6cd5\u7ee7\u7eed\u8fd0\u884c\u3002\n\u76f4\u63a5\u628a\u6574\u4e2a Mod \u6587\u4ef6\u653e\u8fdb mods \u6587\u4ef6\u5939\u5373\u53ef\uff0c\u89e3\u538b\u5c31\u4f1a\u51fa\u9519\u3002\n\n\u8bf7\u5220\u9664 mods \u91cc\u5df2\u88ab\u89e3\u538b\u7684\u6587\u4ef6\u5939\uff0c\u7136\u540e\u518d\u542f\u52a8\u6e38\u620f\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "mod_unzipped"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v7

    .line 18
    nop

    .line 20
    const-string v1, "Minecraft \u5185\u5b58\u4e0d\u8db3\uff0c\u5bfc\u81f4\u5176\u65e0\u6cd5\u7ee7\u7eed\u8fd0\u884c\u3002\n\u8fd9\u5f88\u53ef\u80fd\u662f\u8bbe\u5907\u5185\u5b58\u4e0d\u8db3\u3001\u6e38\u620f\u5206\u914d\u7684\u5185\u5b58\u4e0d\u8db3\uff0c\u6216\u914d\u7f6e\u8981\u6c42\u8fc7\u9ad8\u3002\n\n\u8bf7\u5728\u542f\u52a8\u8bbe\u7f6e\u4e2d\u589e\u52a0\u4e3a\u6e38\u620f\u5206\u914d\u7684\u5185\u5b58\uff0c\u5e76\u5220\u6389\u8fc7\u9ad8\u7684\u6750\u8d28\u3001Mod\u3001\u5149\u5f71\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v10

    .line 18
    nop

    .line 21
    const-string v1, "\u6e38\u620f\u56e0\u4e3a\u4f7f\u7528 OpenJ9 \u800c\u5d29\u6e83\u4e86\u3002\n\u8bf7\u5728\u672c\u5b9e\u4f8b\u7684 Java \u9009\u9879\u4e2d\u6539\u7528\u975e OpenJ9 \u7684 Java\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "openj9"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v12

    .line 18
    nop

    .line 22
    const-string v1, "\u6e38\u620f\u4f3c\u4e4e\u56e0\u4e3a\u4f7f\u7528 JDK\uff0c\u6216 Java \u7248\u672c\u8fc7\u9ad8\u800c\u5d29\u6e83\u4e86\u3002\n\u8bf7\u5728\u672c\u5b9e\u4f8b\u7684 Java \u9009\u9879\u4e2d\u6539\u7528 Java 8\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "jdk"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v13

    .line 18
    nop

    .line 23
    const-string v1, "\u6e38\u620f\u4f3c\u4e4e\u56e0\u4e3a\u4f60\u4f7f\u7528\u7684 Java \u7248\u672c\u8fc7\u9ad8\u800c\u5d29\u6e83\u4e86\u3002\n\u8bf7\u5728\u672c\u5b9e\u4f8b\u7684 Java \u9009\u9879\u4e2d\u6539\u7528\u8f83\u4f4e\u7248\u672c\u7684 Java\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v9, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v14

    .line 18
    nop

    .line 24
    const-string v1, "\u6e38\u620f\u4e0d\u517c\u5bb9\u4f60\u5f53\u524d\u4f7f\u7528\u7684 Java\u3002\n\u8bf7\u5728\u672c\u5b9e\u4f8b\u7684 Java \u9009\u9879\u4e2d\u6539\u7528\u5408\u9002\u7248\u672c\u7684 Java\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v6, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v15

    .line 18
    nop

    .line 25
    const-string v1, "\u7531\u4e8e\u6709 Mod \u7684\u540d\u79f0\u5305\u542b\u7279\u6b8a\u5b57\u7b26\uff0c\u5bfc\u81f4\u6e38\u620f\u5d29\u6e83\u3002\n\u8bf7\u628a\u8be5 Mod \u6587\u4ef6\u540d\u6539\u6210\u53ea\u542b\u82f1\u6587\u3001\u6570\u5b57\u3001\u51cf\u53f7\u3001\u4e0b\u5212\u7ebf\u548c\u5c0f\u6570\u70b9\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "mod_name_chars"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v17

    .line 18
    nop

    .line 26
    const-string v1, "\u7531\u4e8e\u7f3a\u5931 MixinBootstrap\uff0c\u5bfc\u81f4\u6e38\u620f\u5d29\u6e83\u3002\n\u8bf7\u5c1d\u8bd5\u5b89\u88c5 MixinBootstrap\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "mixin_bootstrap"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v18

    .line 18
    nop

    .line 27
    const-string v1, "\u4f60\u5b89\u88c5\u7684\u90e8\u5206 Mod \u9700\u8981\u4f7f\u7528 Java 11 \u542f\u52a8\u3002\n\u8bf7\u5728\u672c\u5b9e\u4f8b\u7684 Java \u9009\u9879\u4e2d\u6539\u7528 Java 11\uff0c\u7136\u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v19

    .line 18
    nop

    .line 28
    const-string v1, "\u4f60\u4f7f\u7528\u7684 OptiFine \u53ef\u80fd\u5bfc\u81f4\u6e38\u620f\u51fa\u95ee\u9898\u3002\n\u8be5\u95ee\u9898\u53ea\u5728\u7279\u5b9a OptiFine \u7248\u672c\u51fa\u73b0\uff0c\u53ef\u4ee5\u6362\u4e00\u4e2a OptiFine \u7248\u672c\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "optifine_world"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v20

    .line 18
    nop

    .line 29
    const-string v1, "\u6750\u8d28\u5206\u8fa8\u7387\u8fc7\u9ad8\uff0c\u6216\u663e\u5361\u914d\u7f6e\u4e0d\u8db3\uff0c\u5bfc\u81f4\u6e38\u620f\u65e0\u6cd5\u7ee7\u7eed\u8fd0\u884c\u3002\n\u5982\u679c\u6b63\u5728\u7528\u9ad8\u6e05\u6750\u8d28\uff0c\u5148\u628a\u5b83\u79fb\u9664\u3002\u5426\u5219\u8bf7\u66f4\u65b0\u663e\u5361\u9a71\u52a8\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "hd_pack"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v21

    .line 18
    nop

    .line 30
    const-string v1, "\u7531\u4e8e Night Config \u5b58\u5728\u95ee\u9898\uff0c\u5bfc\u81f4\u4e86\u6e38\u620f\u5d29\u6e83\u3002\n\u53ef\u4ee5\u5c1d\u8bd5\u5b89\u88c5 Night Config Fixes \u6a21\u7ec4\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "nightconfig"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v22

    .line 18
    nop

    .line 31
    const-string v1, "\u4f60\u4f7f\u7528\u7684\u5149\u5f71\u6216\u6750\u8d28\u5bfc\u81f4\u6e38\u620f\u51fa\u73b0\u4e86\u95ee\u9898\u3002\n\u8bf7\u5c1d\u8bd5\u5220\u9664\u8fd9\u4e9b\u989d\u5916\u8d44\u6e90\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "opengl_1282"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v23

    .line 18
    nop

    .line 32
    const-string v1, "\u5b89\u88c5\u7684 Mod \u8fc7\u591a\uff0c\u8d85\u51fa\u4e86\u6e38\u620f\u7684 ID \u9650\u5236\u3002\n\u8bf7\u5c1d\u8bd5\u5b89\u88c5 JEID \u7b49\u4fee\u590d Mod\uff0c\u6216\u5220\u9664\u90e8\u5206\u5927\u578b Mod\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "mod_id_limit"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v24

    .line 18
    nop

    .line 33
    const-string v1, "\u90e8\u5206\u6587\u4ef6\u6216\u5185\u5bb9\u6821\u9a8c\u5931\u8d25\uff0c\u5bfc\u81f4\u6e38\u620f\u51fa\u95ee\u9898\u3002\n\u8bf7\u5c1d\u8bd5\u5220\u9664\u6e38\u620f\uff08\u5305\u62ec Mod\uff09\u5e76\u91cd\u65b0\u4e0b\u8f7d\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "verify_fail"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v25

    .line 18
    nop

    .line 34
    const-string v1, "\u7531\u4e8e\u5b89\u88c5\u7684 Forge \u6587\u4ef6\u4e22\u5931\uff0c\u6e38\u620f\u65e0\u6cd5\u6b63\u5e38\u8fd0\u884c\u3002\n\u8bf7\u91cd\u65b0\u5b89\u88c5\u4e00\u6b21\u76f8\u540c\u7248\u672c\u7684 Forge\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "forge_incomplete"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x10

    aput-object v1, v0, v2

    .line 18
    nop

    .line 35
    const-string v1, "* \u4e8b\u5b9e\u4e0a\uff0c\u4f60\u7684\u6e38\u620f\u6ca1\u6709\u4efb\u4f55\u95ee\u9898\uff0c\u8fd9\u662f\u4f60\u81ea\u5df1\u89e6\u53d1\u7684\u8c03\u8bd5\u5d29\u6e83\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "debug_crash"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    aput-object v1, v0, v16

    .line 18
    nop

    .line 36
    const-string v1, "\u7531\u4e8e OptiFine \u4e0e\u5f53\u524d\u7248\u672c\u7684 Forge \u4e0d\u517c\u5bb9\uff0c\u5bfc\u81f4\u6e38\u620f\u5d29\u6e83\u3002\n\u8bf7\u5230 OptiFine \u5b98\u7f51\u67e5\u770b\u5b83\u6240\u517c\u5bb9\u7684 Forge \u7248\u672c\uff0c\u5e76\u6309\u5bf9\u5e94\u7248\u672c\u91cd\u88c5\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "optifine_forge"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x12

    aput-object v1, v0, v2

    .line 18
    nop

    .line 37
    const-string v1, "\u65e0\u9700\u540c\u65f6\u5b89\u88c5 OptiFine \u548c Shaders Mod\uff0cOptiFine \u5df2\u7ecf\u96c6\u6210\u4e86\u5149\u5f71\u529f\u80fd\u3002\n\u5220\u6389 Shaders Mod \u540e\u518d\u542f\u52a8\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "shaders_optifine"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x13

    aput-object v1, v0, v2

    .line 18
    nop

    .line 38
    const-string v1, "\u7531\u4e8e\u4f4e\u7248\u672c Forge \u4e0e\u5f53\u524d Java \u4e0d\u517c\u5bb9\uff0c\u5bfc\u81f4\u6e38\u620f\u5d29\u6e83\u3002\n\u8bf7\u5c1d\u8bd5\uff1a\u628a Forge \u66f4\u65b0\u5230 36.2.26 \u6216\u66f4\u9ad8\uff0c\u6216\u6362\u7528\u4f4e\u4e8e 1.8.0.320 \u7684 Java\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "old_forge_new_java"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x14

    aput-object v1, v0, v2

    .line 18
    nop

    .line 39
    const-string v1, "\u5f53\u524d\u7248\u672c\u6587\u4ef6\u5b58\u5728\u5f02\u5e38\uff08\u7248\u672c Json \u91cc\u6709\u591a\u4e2a Forge\uff09\u3002\n\u8bf7\u5c1d\u8bd5\u91cd\u65b0\u5168\u65b0\u5b89\u88c5 Forge\u3002"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "multi_forge_json"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x15

    aput-object v1, v0, v2

    .line 18
    nop

    .line 40
    const-string v1, "\u4f60\u7684\u6e38\u620f\u51fa\u73b0\u4e86\u4e00\u4e9b\u95ee\u9898\uff0c\u4f46\u672a\u80fd\u627e\u5230\u76f8\u5173\u8bb0\u5f55\u6587\u4ef6\uff0c\u56e0\u6b64\u65e0\u6cd5\u7ee7\u7eed\u5206\u6790\u3002"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const-string v2, "no_files"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x16

    aput-object v1, v0, v2

    .line 18
    nop

    .line 17
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->TABLE:Ljava/util/Map;

    .line 112
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)((?:access[_-]?token|session[_-]?token|refresh[_-]?token|client[_-]?secret|authorization)\\s*[:=]\\s*)([^\\s\"\']+)"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->SECRET1:Lkotlin/text/Regex;

    .line 113
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "(?i)(--(?:accessToken|uuid|xuid|clientId)\\s+)\\S+"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->SECRET2:Lkotlin/text/Regex;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final all(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;
    .locals 5
    .param p1, "t"    # Ljava/lang/String;
    .param p2, "re"    # Ljava/lang/String;
    .param p3, "opt"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "Lkotlin/text/RegexOption;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 43
    new-instance v0, Lkotlin/text/Regex;

    invoke-direct {v0, p2, p3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lkotlin/text/Regex;->findAll$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lcom/pymcl/core/crash/CrashAnalyzer$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/pymcl/core/crash/CrashAnalyzer$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic all$default(Lcom/pymcl/core/crash/CrashAnalyzer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 43
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/crash/CrashAnalyzer;->all(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final all$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 1
    .param p0, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V
    .locals 11
    .param p0, "r"    # Ljava/util/LinkedHashMap;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "extra"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/crash/CrashReason;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 48
    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move-object v0, p0

    check-cast v0, Ljava/util/Map;

    move-object v1, p2

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 128
    .local v2, "$i$f$filter":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v4, v1

    .local v4, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 129
    .local v5, "$i$f$filterTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 48
    .local v9, "$i$a$-filter-CrashAnalyzer$analyze$add$1":I
    move-object v10, v8

    check-cast v10, Ljava/lang/CharSequence;

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-lez v10, :cond_1

    const/4 v10, 0x1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    .line 129
    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-filter-CrashAnalyzer$analyze$add$1":I
    :goto_1
    if-eqz v10, :cond_0

    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 130
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_2
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v4    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filterTo":I
    check-cast v3, Ljava/util/List;

    .line 128
    nop

    .line 48
    .end local v1    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter":I
    new-instance v1, Lcom/pymcl/core/crash/CrashReason;

    invoke-direct {v1, p1, v3}, Lcom/pymcl/core/crash/CrashReason;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method private static final analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "r"    # Ljava/util/LinkedHashMap;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "e"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/crash/CrashReason;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 49
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method static synthetic analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    .line 48
    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_0
    invoke-static {p0, p1, p2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    return-void
.end method

.method private final seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "t"    # Ljava/lang/String;
    .param p2, "re"    # Ljava/lang/String;

    .line 42
    new-instance v0, Lkotlin/text/Regex;

    invoke-direct {v0, p2}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lkotlin/text/Regex;->find$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/text/MatchResult;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final analyze(Lcom/pymcl/core/crash/CrashInput;)Ljava/util/List;
    .locals 36
    .param p1, "i"    # Lcom/pymcl/core/crash/CrashInput;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/crash/CrashInput;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/crash/CrashReason;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "i"

    move-object/from16 v6, p1

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-virtual {v6}, Lcom/pymcl/core/crash/CrashInput;->getOutput()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6}, Lcom/pymcl/core/crash/CrashInput;->getLatestLog()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "\n"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .local v1, "text":Ljava/lang/String;
    invoke-virtual {v6}, Lcom/pymcl/core/crash/CrashInput;->getCrashReport()Ljava/lang/String;

    move-result-object v7

    .local v7, "crash":Ljava/lang/String;
    invoke-virtual {v6}, Lcom/pymcl/core/crash/CrashInput;->getHsErr()Ljava/lang/String;

    move-result-object v8

    .line 47
    .local v8, "hs":Ljava/lang/String;
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v9, v2

    .line 50
    .local v9, "r":Ljava/util/LinkedHashMap;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v10, "<get-values>(...)"

    const/4 v11, 0x4

    const/4 v12, 0x0

    if-eqz v2, :cond_0

    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "no_files"

    invoke-static {v9, v2, v12, v11, v12}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    return-object v2

    .line 51
    :cond_0
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-static {v2, v3, v13, v14, v12}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const-string v3, "java_too_new"

    if-eqz v2, :cond_1

    invoke-static {v9, v3, v12, v11, v12}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 54
    :cond_1
    const/16 v2, 0x14

    new-array v2, v2, [Lkotlin/Pair;

    const-string v4, "Unrecognized option:"

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "jvm_args"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v13

    .line 55
    const-string v4, "Found multiple arguments for option fml.forgeVersion, but you asked for only one"

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "multi_forge_json"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v15, 0x1

    aput-object v4, v2, v15

    .line 54
    nop

    .line 56
    const-string v4, "The driver does not appear to support OpenGL"

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "no_opengl"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v14

    .line 54
    nop

    .line 57
    new-array v4, v14, [Ljava/lang/String;

    const-string v5, "java.lang.ClassCastException: java.base/jdk"

    aput-object v5, v4, v13

    const-string v5, "java.lang.ClassCastException: class jdk."

    aput-object v5, v4, v15

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const-string v5, "jdk"

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x3

    aput-object v4, v2, v5

    .line 54
    nop

    .line 58
    new-array v4, v5, [Ljava/lang/String;

    const-string v16, "Open J9 is not supported"

    aput-object v16, v4, v13

    const-string v16, "OpenJ9 is incompatible"

    aput-object v16, v4, v15

    const-string v16, ".J9VMInternals."

    aput-object v16, v4, v14

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move/from16 v16, v15

    const-string v15, "openj9"

    invoke-static {v4, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v2, v11

    .line 54
    nop

    .line 59
    new-array v4, v11, [Ljava/lang/String;

    const-string v15, "java.lang.NoSuchFieldException: ucp"

    aput-object v15, v4, v13

    const-string v15, "because module java.base does not export"

    aput-object v15, v4, v16

    const-string v15, "java.lang.ClassNotFoundException: jdk.nashorn.api.scripting.NashornScriptEngineFactory"

    aput-object v15, v4, v14

    const-string v15, "java.lang.ClassNotFoundException: java.lang.invoke.LambdaMetafactory"

    aput-object v15, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v15, 0x5

    aput-object v3, v2, v15

    .line 54
    nop

    .line 60
    new-array v3, v14, [Ljava/lang/String;

    const-string v4, "The directories below appear to be extracted jar files. Fix this before you continue."

    aput-object v4, v3, v13

    const-string v4, "Extracted mod jars found, loading will NOT continue"

    aput-object v4, v3, v16

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "mod_unzipped"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x6

    aput-object v3, v2, v4

    .line 54
    nop

    .line 61
    const-string v3, "java.lang.ClassNotFoundException: org.spongepowered.asm.launch.MixinTweaker"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "mixin_bootstrap"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x7

    aput-object v3, v2, v4

    .line 54
    nop

    .line 62
    const-string v3, "Couldn\'t set pixel format"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v4, "pixel_format"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v18, 0x8

    aput-object v3, v2, v18

    .line 54
    nop

    .line 63
    new-array v3, v14, [Ljava/lang/String;

    const-string v18, "java.lang.OutOfMemoryError"

    aput-object v18, v3, v13

    const-string v19, "an out of memory error"

    aput-object v19, v3, v16

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move/from16 v19, v15

    const-string v15, "oom"

    invoke-static {v3, v15}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v20, 0x9

    aput-object v3, v2, v20

    .line 54
    nop

    .line 64
    const-string v3, "Shaders Mod detected. Please remove it, OptiFine has built-in support for shaders."

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v11, "shaders_optifine"

    invoke-static {v3, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v11, 0xa

    aput-object v3, v2, v11

    .line 54
    nop

    .line 65
    new-array v3, v14, [Ljava/lang/String;

    const-string v21, "java.lang.NoSuchMethodError: sun.security.util.ManifestEntryVerifier"

    aput-object v21, v3, v13

    const-string v21, "java.lang.NoSuchMethodError: \'void sun.security.util.ManifestEntryVerifier"

    aput-object v21, v3, v16

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v11, "old_forge_new_java"

    invoke-static {v3, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v11, 0xb

    aput-object v3, v2, v11

    .line 54
    nop

    .line 66
    const-string v3, "1282: Invalid operation"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v11, "opengl_1282"

    invoke-static {v3, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v11, 0xc

    aput-object v3, v2, v11

    .line 54
    nop

    .line 67
    const-string v3, "Maybe try a lower resolution resourcepack?"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v11, "hd_pack"

    invoke-static {v3, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v11, 0xd

    aput-object v3, v2, v11

    .line 54
    nop

    .line 68
    const-string v3, "Cannot find launch target fmlclient, unable to launch"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v11, "forge_incomplete"

    invoke-static {v3, v11}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v22, 0xe

    aput-object v3, v2, v22

    .line 54
    nop

    .line 69
    const-string v3, "Invalid module name: \'\' is not a Java identifier"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v12, "mod_name_chars"

    invoke-static {v3, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v12, 0xf

    aput-object v3, v2, v12

    .line 54
    nop

    .line 70
    new-array v3, v5, [Ljava/lang/String;

    const-string v12, "has been compiled by a more recent version of the Java Runtime (class file version 55.0)"

    aput-object v12, v3, v13

    const-string v12, "sun.misc.Unsafe.defineAnonymousClass(Class,byte[],Object[])Class/invokeVirtual"

    aput-object v12, v3, v16

    const-string v12, "The requested compatibility level JAVA_11 could not be set"

    aput-object v12, v3, v14

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v12, "need_java11"

    invoke-static {v3, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v12, 0x10

    aput-object v3, v2, v12

    .line 54
    nop

    .line 71
    new-array v3, v5, [Ljava/lang/String;

    const-string v12, "Unsupported class file major version"

    aput-object v12, v3, v13

    const-string v12, "Unsupported major.minor version"

    aput-object v12, v3, v16

    const-string v12, "Level is not supported by the active JRE or ASM version"

    aput-object v12, v3, v14

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v12, "java_mismatch"

    invoke-static {v3, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v12, 0x11

    aput-object v3, v2, v12

    .line 54
    nop

    .line 72
    const-string v3, "Invalid maximum heap size"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v12, "java32"

    invoke-static {v3, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v23, 0x12

    aput-object v3, v2, v23

    .line 54
    nop

    .line 73
    const-string v3, "Mod resolution failed"

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v23, v4

    const-string v4, "loader_error"

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/16 v24, 0x13

    aput-object v3, v2, v24

    .line 54
    nop

    .line 53
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v24

    .line 74
    .local v24, "simple":Ljava/util/List;
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlin/Pair;

    invoke-virtual {v3}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, Ljava/util/List;

    .local v25, "keys":Ljava/util/List;
    invoke-virtual {v3}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .local v3, "kind":Ljava/lang/String;
    move-object/from16 v5, v25

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$any$iv":Ljava/lang/Iterable;
    const/16 v27, 0x0

    .line 117
    .local v27, "$i$f$any":I
    instance-of v13, v5, Ljava/util/Collection;

    if-eqz v13, :cond_2

    move-object v13, v5

    check-cast v13, Ljava/util/Collection;

    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v13

    if-eqz v13, :cond_2

    move-object/from16 v32, v2

    move-object/from16 v33, v4

    const/4 v2, 0x0

    goto :goto_2

    .line 118
    :cond_2
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    if-eqz v29, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v29

    .local v29, "element$iv":Ljava/lang/Object;
    move-object/from16 v30, v29

    check-cast v30, Ljava/lang/String;

    .local v30, "it":Ljava/lang/String;
    const/16 v31, 0x0

    .line 74
    .local v31, "$i$a$-any-CrashAnalyzer$analyze$1":I
    move-object/from16 v32, v2

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    move-object/from16 v33, v4

    move-object/from16 v4, v30

    check-cast v4, Ljava/lang/CharSequence;

    move-object/from16 v34, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    .end local v5    # "$this$any$iv":Ljava/lang/Iterable;
    .local v34, "$this$any$iv":Ljava/lang/Iterable;
    invoke-static {v2, v4, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    .line 118
    .end local v30    # "it":Ljava/lang/String;
    .end local v31    # "$i$a$-any-CrashAnalyzer$analyze$1":I
    if-eqz v2, :cond_3

    move/from16 v2, v16

    goto :goto_2

    :cond_3
    move-object/from16 v6, p1

    move-object/from16 v2, v32

    move-object/from16 v4, v33

    move-object/from16 v5, v34

    goto :goto_1

    .line 119
    .end local v29    # "element$iv":Ljava/lang/Object;
    .end local v34    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v5    # "$this$any$iv":Ljava/lang/Iterable;
    :cond_4
    move-object/from16 v32, v2

    move-object/from16 v33, v4

    move-object/from16 v34, v5

    .end local v5    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v34    # "$this$any$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 74
    .end local v27    # "$i$f$any":I
    .end local v34    # "$this$any$iv":Ljava/lang/Iterable;
    :goto_2
    if-eqz v2, :cond_5

    const/4 v2, 0x4

    const/4 v6, 0x0

    invoke-static {v9, v3, v6, v2, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    move-object/from16 v6, p1

    move-object/from16 v2, v32

    move-object/from16 v4, v33

    const/4 v5, 0x3

    const/4 v13, 0x0

    .end local v3    # "kind":Ljava/lang/String;
    .end local v25    # "keys":Ljava/util/List;
    goto :goto_0

    .restart local v3    # "kind":Ljava/lang/String;
    .restart local v25    # "keys":Ljava/util/List;
    :cond_5
    const/4 v6, 0x0

    move-object/from16 v6, p1

    move-object/from16 v2, v32

    move-object/from16 v4, v33

    const/4 v5, 0x3

    const/4 v13, 0x0

    goto/16 :goto_0

    .line 75
    .end local v3    # "kind":Ljava/lang/String;
    .end local v25    # "keys":Ljava/util/List;
    :cond_6
    move-object/from16 v33, v4

    const/4 v6, 0x0

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "signer information does not match signer information of other classes in the same package"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "(?<=class \")[^\"]+(?=\"\'s signer information)"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "verify_fail"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    :cond_7
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "ChunkManager$ProxyTicketManager.shouldForceTicks(J)Z"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "OptiFine"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "optifine_world"

    const/4 v3, 0x4

    invoke-static {v9, v2, v6, v3, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 77
    :cond_8
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "com.electronwill.nightconfig.core.io.ParsingException: Not enough data available"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "nightconfig"

    const/4 v3, 0x4

    invoke-static {v9, v2, v6, v3, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 78
    :cond_9
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "error remapping game jars"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "(?<=the jar file ).+?(?= can\'t be written)"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "fabric_remap"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    :cond_a
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Invalid paths argument, contained no existing paths"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "libraries\\net\\minecraftforge\\fmlcore"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "libraries/net/minecraftforge/fmlcore"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    const/4 v3, 0x4

    invoke-static {v9, v11, v6, v3, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 80
    :cond_c
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Could not reserve enough space"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "for 1048576KB object heap"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v3, 0x4

    invoke-static {v9, v12, v6, v3, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    goto :goto_3

    :cond_d
    const/4 v3, 0x4

    invoke-static {v9, v15, v6, v3, v6}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 81
    :cond_e
    :goto_3
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Caught exception from "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const-string v6, "mod_certain"

    if-eqz v2, :cond_f

    const-string v2, "(?<=Caught exception from )[^\\n]+"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v6, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    :cond_f
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Found a duplicate mod"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    const-string v11, "[^\\\\/ ]+\\.jar"

    const-string v12, "mod_dup"

    if-eqz v2, :cond_10

    const-string v2, "Found a duplicate mod[^\\n]+"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v2, v11, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->all(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;

    move-result-object v2

    invoke-static {v9, v12, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    .line 83
    :cond_10
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Found duplicate mods"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_11

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v2, "(?<=Mod ID: \')\\w+?(?=\' from mod files:)"

    const/4 v3, 0x0

    move-object/from16 v35, v23

    move-object/from16 v13, v33

    const/16 v26, 0x3

    invoke-static/range {v0 .. v5}, Lcom/pymcl/core/crash/CrashAnalyzer;->all$default(Lcom/pymcl/core/crash/CrashAnalyzer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->distinct(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    invoke-static {v9, v12, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_4

    :cond_11
    move-object/from16 v35, v23

    move-object/from16 v13, v33

    const/16 v26, 0x3

    .line 84
    :goto_4
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "ModResolutionException: Duplicate"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_12

    const-string v2, "ModResolutionException: Duplicate[^\\n]+"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-static {v3}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-direct {v0, v2, v11, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->all(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;

    move-result-object v2

    invoke-static {v9, v12, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    .line 85
    :cond_12
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Missing or unsupported mandatory dependencies:"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v14, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 86
    sget-object v2, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-static {v2}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    const-string v3, "(?<=Missing or unsupported mandatory dependencies:)(?:[\\n\\r]+\\t.*)+"

    invoke-direct {v0, v1, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->all(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 120
    .local v3, "$i$f$map":I
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v2

    .local v5, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 121
    .local v11, "$i$f$mapTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_5
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 122
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v21, v17

    check-cast v21, Ljava/lang/String;

    .local v21, "it":Ljava/lang/String;
    const/16 v23, 0x0

    .line 86
    .local v23, "$i$a$-map-CrashAnalyzer$analyze$2":I
    move/from16 v25, v14

    move-object/from16 v14, v21

    check-cast v14, Ljava/lang/CharSequence;

    move-object/from16 v27, v2

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .local v27, "$this$map$iv":Ljava/lang/Iterable;
    new-instance v2, Lkotlin/text/Regex;

    move/from16 v29, v3

    .end local v3    # "$i$f$map":I
    .local v29, "$i$f$map":I
    const-string v3, "(?m)^\\s+"

    invoke-direct {v2, v3}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    const-string v3, ""

    invoke-virtual {v2, v14, v3}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 122
    .end local v21    # "it":Ljava/lang/String;
    .end local v23    # "$i$a$-map-CrashAnalyzer$analyze$2":I
    invoke-interface {v4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v14, v25

    move-object/from16 v2, v27

    move/from16 v3, v29

    goto :goto_5

    .line 123
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    .end local v27    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v29    # "$i$f$map":I
    .restart local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$map":I
    :cond_13
    move-object/from16 v27, v2

    move/from16 v29, v3

    move/from16 v25, v14

    .end local v2    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map":I
    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapTo":I
    .restart local v27    # "$this$map$iv":Ljava/lang/Iterable;
    .restart local v29    # "$i$f$map":I
    move-object v2, v4

    check-cast v2, Ljava/util/List;

    .line 120
    nop

    .line 86
    .end local v27    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v29    # "$i$f$map":I
    const-string v3, "mod_missing"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_6

    .line 85
    :cond_14
    move/from16 v25, v14

    .line 87
    :goto_6
    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "Mixin prepare failed "

    const/16 v28, 0x0

    aput-object v3, v2, v28

    const-string v3, "Mixin apply failed "

    aput-object v3, v2, v16

    const-string v3, "MixinApplyError"

    aput-object v3, v2, v25

    const-string v3, "MixinTransformerError"

    aput-object v3, v2, v26

    const-string v3, "mixin.injection.throwables."

    const/16 v20, 0x4

    aput-object v3, v2, v20

    const-string v3, ".json] FAILED during )"

    aput-object v3, v2, v19

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 124
    .local v3, "$i$f$any":I
    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_15

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_15

    const/4 v2, 0x0

    goto :goto_8

    .line 125
    :cond_15
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element$iv":Ljava/lang/Object;
    move-object v11, v5

    check-cast v11, Ljava/lang/String;

    .local v11, "it":Ljava/lang/String;
    const/4 v12, 0x0

    .line 87
    .local v12, "$i$a$-any-CrashAnalyzer$analyze$3":I
    move-object v14, v1

    check-cast v14, Ljava/lang/CharSequence;

    move-object/from16 v17, v2

    .end local v2    # "$this$any$iv":Ljava/lang/Iterable;
    .local v17, "$this$any$iv":Ljava/lang/Iterable;
    move-object v2, v11

    check-cast v2, Ljava/lang/CharSequence;

    move/from16 v19, v3

    move-object/from16 v21, v4

    move-object/from16 v23, v5

    move/from16 v3, v25

    const/4 v4, 0x0

    const/4 v5, 0x0

    .end local v3    # "$i$f$any":I
    .end local v5    # "element$iv":Ljava/lang/Object;
    .local v19, "$i$f$any":I
    .local v23, "element$iv":Ljava/lang/Object;
    invoke-static {v14, v2, v4, v3, v5}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    .line 125
    .end local v11    # "it":Ljava/lang/String;
    .end local v12    # "$i$a$-any-CrashAnalyzer$analyze$3":I
    if-eqz v2, :cond_16

    move/from16 v2, v16

    goto :goto_8

    :cond_16
    move-object/from16 v2, v17

    move/from16 v3, v19

    move-object/from16 v4, v21

    const/16 v25, 0x2

    goto :goto_7

    .line 126
    .end local v17    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$any":I
    .end local v23    # "element$iv":Ljava/lang/Object;
    .restart local v2    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$any":I
    :cond_17
    move-object/from16 v17, v2

    move/from16 v19, v3

    .end local v2    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$any":I
    .restart local v17    # "$this$any$iv":Ljava/lang/Iterable;
    .restart local v19    # "$i$f$any":I
    const/4 v2, 0x0

    .line 87
    .end local v17    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$any":I
    :goto_8
    if-eqz v2, :cond_1a

    .line 88
    const-string v2, "(?<=from mod )[^./ ]+(?=] from)"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_18

    move/from16 v3, v16

    goto :goto_9

    :cond_18
    const/4 v3, 0x0

    :goto_9
    if-eqz v3, :cond_19

    .line 127
    const/4 v2, 0x0

    .line 88
    .local v2, "$i$a$-ifEmpty-CrashAnalyzer$analyze$4":I
    sget-object v3, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    const-string v4, "(?<=for mod )[^./ ]+(?= failed)"

    invoke-direct {v3, v1, v4}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .end local v2    # "$i$a$-ifEmpty-CrashAnalyzer$analyze$4":I
    :cond_19
    check-cast v2, Ljava/lang/String;

    const-string v3, "mixin"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    :cond_1a
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "due to errors, provided by "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1b

    const-string v2, "(?<=due to errors, provided by \')[^\']+"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v6, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_1b
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Failed to create mod instance."

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1e

    const-string v2, "(?<=Failed to create mod instance. ModID: )[^,]+"

    invoke-direct {v0, v1, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_1c

    move/from16 v3, v16

    goto :goto_a

    :cond_1c
    const/4 v3, 0x0

    :goto_a
    if-eqz v3, :cond_1d

    .line 127
    const/4 v2, 0x0

    .line 90
    .local v2, "$i$a$-ifEmpty-CrashAnalyzer$analyze$5":I
    sget-object v3, Lcom/pymcl/core/crash/CrashAnalyzer;->INSTANCE:Lcom/pymcl/core/crash/CrashAnalyzer;

    const-string v4, "(?<=Failed to create mod instance. ModId )[^\\n]+(?= for )"

    invoke-direct {v3, v1, v4}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .end local v2    # "$i$a$-ifEmpty-CrashAnalyzer$analyze$5":I
    :cond_1d
    check-cast v2, Ljava/lang/String;

    const-string v3, "mod_init"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    :cond_1e
    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "The system is out of physical RAM or swap space"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1f

    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Out of Memory Error"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    :cond_1f
    const/4 v3, 0x4

    invoke-static {v9, v15, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 93
    :cond_20
    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "EXCEPTION_ACCESS_VIOLATION"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_22

    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "SIGSEGV"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    goto :goto_b

    :cond_21
    const/4 v11, 0x0

    goto :goto_e

    :cond_22
    :goto_b
    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "# C  [ig"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "# C [ig"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_23

    goto :goto_c

    :cond_23
    const/4 v3, 0x4

    goto :goto_d

    :cond_24
    :goto_c
    const-string v2, "intel_av"

    const/4 v3, 0x4

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    :goto_d
    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v4, "[atio"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v12, 0x0

    invoke-static {v2, v4, v12, v5, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_25

    const-string v2, "amd_av"

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    :cond_25
    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "[nvoglv"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_26

    const-string v2, "nvidia_av"

    const/4 v3, 0x4

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 95
    :cond_26
    :goto_e
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "maximum id range exceeded"

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_27

    const-string v2, "mod_id_limit"

    const/4 v3, 0x4

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    goto :goto_f

    :cond_27
    const/4 v3, 0x4

    .line 96
    :goto_f
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    move-object/from16 v12, v18

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v2, v12, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_28

    invoke-static {v9, v15, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 97
    :cond_28
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v12, "Pixel format not accelerated"

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v2, v12, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_29

    move-object/from16 v2, v35

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 98
    :cond_29
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Manually triggered debug crash"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2a

    const-string v2, "debug_crash"

    const/4 v3, 0x4

    invoke-static {v9, v2, v11, v3, v11}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    .line 99
    :cond_2a
    new-instance v2, Lkotlin/text/Regex;

    const-string v3, "The Mod File [^\\n]+optifine[\\\\/]OptiFine[^\\n]+ has mods that were not found"

    sget-object v4, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    invoke-direct {v2, v3, v4}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    move-object v3, v7

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Lkotlin/text/Regex;->containsMatchIn(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2b

    const-string v2, "optifine_forge"

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-static {v9, v2, v4, v3, v4}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$default(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)V

    goto :goto_10

    :cond_2b
    const/4 v4, 0x0

    .line 100
    :goto_10
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "-- MOD "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v12, 0x0

    invoke-static {v2, v3, v12, v5, v4}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2d

    const-string v2, "(?<=Mod File: ).+"

    invoke-direct {v0, v7, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .local v2, "mf":Ljava/lang/String;
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "toLowerCase(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/CharSequence;

    const-string v4, ".jar"

    check-cast v4, Ljava/lang/CharSequence;

    const/4 v5, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static {v3, v4, v12, v5, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-static {v9, v6, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_2c
    const-string v3, "(?<=Failure message: )[\\w\\W]+?(?=\\tMod)"

    invoke-direct {v0, v7, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    const/16 v33, 0x4

    const/16 v34, 0x0

    const-string v30, "\t"

    const-string v31, " "

    const/16 v32, 0x0

    invoke-static/range {v29 .. v34}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v13, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .end local v2    # "mf":Ljava/lang/String;
    :cond_2d
    :goto_11
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "Multiple entries with same key: "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2e

    const-string v2, "(?<=Multiple entries with same key: )[^=]+"

    invoke-direct {v0, v7, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v6, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_2e
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "\tBlock location: World: "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2f

    const-string v2, "(?<=\\tBlock: Block\\{)[^}]+"

    invoke-direct {v0, v7, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "(?<=\\tBlock location: World: )\\([^)]+\\)"

    invoke-direct {v0, v7, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, " "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "bad_block"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    :cond_2f
    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "\tEntity\'s Exact location: "

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    const-string v2, "(?<=\\tEntity Type: )[^\\n]+(?= \\()"

    invoke-direct {v0, v7, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .local v2, "t":Ljava/lang/String;
    const-string v3, "(?<=\\tEntity\'s Exact location: )[^\\n]+"

    invoke-direct {v0, v7, v3}, Lcom/pymcl/core/crash/CrashAnalyzer;->seek(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .local v3, "l":Ljava/lang/String;
    move-object v4, v2

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-lez v4, :cond_30

    move/from16 v5, v16

    goto :goto_12

    :cond_30
    const/4 v5, 0x0

    :goto_12
    if-eqz v5, :cond_31

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_13

    :cond_31
    move-object v4, v3

    :goto_13
    const-string v5, "bad_entity"

    invoke-static {v9, v5, v4}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .end local v2    # "t":Ljava/lang/String;
    .end local v3    # "l":Ljava/lang/String;
    :cond_32
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_35

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "at net."

    check-cast v3, Ljava/lang/CharSequence;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "INFO]"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v2, v3, v5, v4, v11}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_35

    move-object v2, v8

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_33

    move/from16 v2, v16

    goto :goto_14

    :cond_33
    move v2, v5

    :goto_14
    if-eqz v2, :cond_35

    move-object v2, v7

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_34

    move/from16 v13, v16

    goto :goto_15

    :cond_34
    move v13, v5

    :goto_15
    if-eqz v13, :cond_35

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x64

    if-ge v2, v3, :cond_35

    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "tiny_output"

    invoke-static {v9, v3, v2}, Lcom/pymcl/core/crash/CrashAnalyzer;->analyze$add$1(Ljava/util/LinkedHashMap;Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    :cond_35
    invoke-virtual {v9}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-static {v2, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final describeExit(I)Ljava/lang/String;
    .locals 1
    .param p1, "code"    # I

    .line 109
    sparse-switch p1, :sswitch_data_0

    .line 110
    const/4 v0, 0x0

    goto :goto_0

    .line 109
    :sswitch_0
    const-string v0, "SIGABRT \u8fdb\u7a0b\u4e2d\u6b62\uff08\u5e38\u89c1\u4e8e\u6e32\u67d3\u5668/\u9a71\u52a8\u9519\u8bef\uff09"

    goto :goto_0

    .line 110
    :sswitch_1
    const-string v0, "SIGBUS \u603b\u7ebf\u9519\u8bef"

    goto :goto_0

    :sswitch_2
    const-string v0, "SIGKILL \u88ab\u7cfb\u7edf\u7ed3\u675f\uff08\u901a\u5e38\u4e3a\u5185\u5b58\u4e0d\u8db3\u88ab LMK \u6740\u6b7b\uff09"

    goto :goto_0

    .line 109
    :sswitch_3
    const-string v0, "SIGSEGV \u5185\u5b58\u8bbf\u95ee\u51b2\u7a81\uff08\u6e32\u67d3\u5668\u6216 native \u5e93\u5d29\u6e83\uff09"

    .line 110
    :goto_0
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0xb -> :sswitch_3
        -0x9 -> :sswitch_2
        -0x7 -> :sswitch_1
        -0x6 -> :sswitch_0
        0x86 -> :sswitch_0
        0x87 -> :sswitch_1
        0x89 -> :sswitch_2
        0x8b -> :sswitch_3
    .end sparse-switch
.end method

.method public final filterSecrets(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "s"    # Ljava/lang/String;

    const-string v0, "s"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->SECRET2:Lkotlin/text/Regex;

    sget-object v1, Lcom/pymcl/core/crash/CrashAnalyzer;->SECRET1:Lkotlin/text/Regex;

    move-object v2, p1

    check-cast v2, Ljava/lang/CharSequence;

    const-string v3, "$1***"

    invoke-virtual {v1, v2, v3}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v3}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getTABLE()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    .line 17
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->TABLE:Ljava/util/Map;

    return-object v0
.end method

.method public final getTITLES()Ljava/util/Map;
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

    .line 13
    sget-object v0, Lcom/pymcl/core/crash/CrashAnalyzer;->TITLES:Ljava/util/Map;

    return-object v0
.end method
