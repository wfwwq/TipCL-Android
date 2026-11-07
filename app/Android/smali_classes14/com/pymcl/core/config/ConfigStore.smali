.class public final Lcom/pymcl/core/config/ConfigStore;
.super Ljava/lang/Object;
.source "ConfigStore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/config/ConfigStore$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConfigStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigStore.kt\ncom/pymcl/core/config/ConfigStore\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1939#2,3:111\n1795#2,10:115\n2068#2:125\n2069#2:127\n1805#2:128\n1#3:114\n1#3:126\n*S KotlinDebug\n*F\n+ 1 ConfigStore.kt\ncom/pymcl/core/config/ConfigStore\n*L\n67#1:111,3\n79#1:115,10\n79#1:125\n79#1:127\n79#1:128\n79#1:126\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0010$\n\u0002\u0008\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001a\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\"\u0010\u000b\u001a\u00020\u000c2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tH\u0002J\u0006\u0010\u000e\u001a\u00020\u000cJ\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0008H\u0086\u0002J\u000e\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0008J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0008J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0008J\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00182\u0006\u0010\u0011\u001a\u00020\u0008J\u001c\u0010\u001e\u001a\u00020\u00162\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010 J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00082\u0008\u0010\"\u001a\u0004\u0018\u00010\u0001J\u0006\u0010#\u001a\u00020\u0016J\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007j\u0002`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001b\u00a8\u0006&"
    }
    d2 = {
        "Lcom/pymcl/core/config/ConfigStore;",
        "",
        "paths",
        "Lcom/pymcl/core/config/LauncherPaths;",
        "<init>",
        "(Lcom/pymcl/core/config/LauncherPaths;)V",
        "data",
        "",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "load",
        "migrate",
        "",
        "m",
        "reload",
        "snapshot",
        "get",
        "key",
        "string",
        "int",
        "",
        "bool",
        "",
        "list",
        "",
        "curseforgeKey",
        "getCurseforgeKey",
        "()Ljava/lang/String;",
        "microsoftClientId",
        "getMicrosoftClientId",
        "update",
        "changes",
        "",
        "set",
        "value",
        "save",
        "publicSettings",
        "Companion",
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
.field public static final AI_GATEWAY_DEFAULTS_VER:Ljava/lang/String; = "2026.10-builtin-newapi"

.field public static final Companion:Lcom/pymcl/core/config/ConfigStore$Companion;

.field private static final DEFAULTS:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final ISOLATION_DEFAULTS_VER:Ljava/lang/String; = "2026.09-isolate-all"


# instance fields
.field private volatile data:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final paths:Lcom/pymcl/core/config/LauncherPaths;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/pymcl/core/config/ConfigStore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/config/ConfigStore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/config/ConfigStore;->Companion:Lcom/pymcl/core/config/ConfigStore$Companion;

    .line 16
    nop

    .line 17
    const/16 v0, 0x55

    new-array v0, v0, [Lkotlin/Pair;

    const-string v2, "instances_dir"

    const-string v3, ".minecraft"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v2, v0, v3

    const-string v2, "default_instance"

    const-string v5, ""

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x1

    .line 21
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    .line 17
    aput-object v2, v0, v6

    const-string v2, "java_dir"

    const-string v6, "java"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x2

    aput-object v2, v0, v6

    const-string v2, "shared_libraries"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x3

    aput-object v2, v0, v6

    const-string v2, "shared_assets"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x4

    aput-object v2, v0, v6

    .line 18
    const-wide/16 v8, 0x1000

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "memory_mb"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x5

    aput-object v2, v0, v6

    .line 17
    nop

    .line 18
    const-wide/16 v8, 0x8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "download_threads"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x6

    aput-object v2, v0, v6

    .line 17
    nop

    .line 18
    const-wide/16 v8, 0x4

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "download_segments"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v6, 0x7

    aput-object v2, v0, v6

    .line 17
    nop

    .line 18
    const-wide/16 v8, 0x356

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "width"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x8

    aput-object v2, v0, v6

    .line 17
    nop

    .line 18
    const-wide/16 v8, 0x1e0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v6, "height"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0x9

    aput-object v2, v0, v6

    .line 17
    nop

    .line 19
    const-string v2, "microsoft_client_id"

    const-string v6, "00000000402b5328"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xa

    aput-object v2, v0, v6

    .line 17
    nop

    .line 19
    const-string v2, "curseforge_api_key"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xb

    aput-object v2, v0, v6

    .line 17
    nop

    .line 20
    const-string v2, "https://v6.gh-proxy.org/"

    const-string v6, "https://cdn.gh-proxy.com/"

    const-string v8, "https://gitproxy.mrhjx.cn/"

    const-string v9, "https://ghproxy.vip/"

    const-string v10, "https://gh-proxy.com/"

    filled-new-array {v8, v9, v10, v2, v6}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v6, "github_proxy_prefixes"

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xc

    aput-object v2, v0, v6

    .line 17
    nop

    .line 21
    const-string v2, "force_manifest_refresh"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v6, 0xd

    aput-object v2, v0, v6

    .line 17
    nop

    .line 21
    const-string v2, "download_source"

    const-string v6, "auto"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0xe

    aput-object v2, v0, v8

    .line 17
    nop

    .line 21
    const-string v2, "community_source"

    invoke-static {v2, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0xf

    aput-object v2, v0, v8

    .line 17
    nop

    .line 21
    const-string v2, "use_system_proxy"

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x10

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_mode"

    const-string v8, "custom"

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x11

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_gateway_url"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x12

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_base_url"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x13

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_api_key"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x14

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_model"

    const-string v8, "deepseek-v4-flash"

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x15

    aput-object v2, v0, v8

    .line 17
    nop

    .line 22
    const-string v2, "ai_confirm_writes"

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v8, 0x16

    aput-object v2, v0, v8

    .line 17
    nop

    .line 23
    const-string v2, "ai_permission_mode"

    const-string v8, "default"

    invoke-static {v2, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x17

    aput-object v2, v0, v9

    .line 17
    nop

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    const-string v9, "ai_permission_rules"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x18

    aput-object v2, v0, v9

    .line 17
    nop

    .line 23
    const-string v2, "ai_permission_dont_ask"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x19

    aput-object v2, v0, v9

    .line 17
    nop

    .line 23
    const-wide/32 v9, 0x30d40

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v9, "ai_context_window"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1a

    aput-object v2, v0, v9

    .line 17
    nop

    .line 24
    const-wide/16 v9, 0x2000

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v9, "ai_max_tokens"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1b

    aput-object v2, v0, v9

    .line 17
    nop

    .line 24
    new-array v2, v3, [Lkotlin/Pair;

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v9, "ai_model_caps_overrides"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1c

    aput-object v2, v0, v9

    .line 17
    nop

    .line 25
    const-string v2, "https://terracotta.glavo.site/acebc7d8-1208-47fd-b212-d03ac49e36e0"

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v9, "terracotta_extra_nodes"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1d

    aput-object v2, v0, v9

    .line 17
    nop

    .line 26
    const-string v2, "feedback_url"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1e

    aput-object v2, v0, v9

    .line 17
    nop

    .line 26
    const-string v2, "feedback_heartbeat"

    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x1f

    aput-object v2, v0, v9

    .line 17
    nop

    .line 26
    const-string v2, "feedback_consent"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x20

    aput-object v2, v0, v9

    .line 17
    nop

    .line 26
    const-string v2, "device_id"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x21

    aput-object v2, v0, v9

    .line 17
    nop

    .line 26
    const-string v2, "default_isolation"

    const-string v9, "all"

    invoke-static {v2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x22

    aput-object v2, v0, v9

    .line 17
    nop

    .line 27
    const-string v2, "isolation_defaults"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x23

    aput-object v2, v0, v9

    .line 17
    nop

    .line 27
    const-string v2, "ai_gateway_defaults"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x24

    aput-object v2, v0, v9

    .line 17
    nop

    .line 27
    const-string v2, "default_jvm_args"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x25

    aput-object v2, v0, v9

    .line 17
    nop

    .line 27
    const-string v2, "default_priority"

    const-string v9, "normal"

    invoke-static {v2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x26

    aput-object v2, v0, v9

    .line 17
    nop

    .line 28
    const-string v2, "update_url"

    const-string v9, "https://pymcl.dev/update.json"

    invoke-static {v2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x27

    aput-object v2, v0, v9

    .line 17
    nop

    .line 28
    const-string v2, "theme_color"

    const-string v9, "#2E9B6B"

    invoke-static {v2, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x28

    aput-object v2, v0, v9

    .line 17
    nop

    .line 28
    const-string v2, "ui_dark"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x29

    aput-object v2, v0, v9

    .line 17
    nop

    .line 28
    const-string v2, "ui_background"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2a

    aput-object v2, v0, v9

    .line 17
    nop

    .line 28
    const-string v2, "ui_background_folder"

    invoke-static {v2, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2b

    aput-object v2, v0, v9

    .line 17
    nop

    .line 29
    const-string v2, "ui_background_shuffle"

    invoke-static {v2, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2c

    aput-object v2, v0, v9

    .line 17
    nop

    .line 29
    const-wide/16 v9, 0xa

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v9, "ui_background_interval"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2d

    aput-object v2, v0, v9

    .line 17
    nop

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    const-string v9, "ui_background_history"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2e

    aput-object v2, v0, v9

    .line 17
    nop

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/List;

    const-string v9, "ui_background_folder_history"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x2f

    aput-object v2, v0, v9

    .line 17
    nop

    .line 30
    const-wide/16 v9, 0x55

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v9, "ui_sidebar_opacity"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/16 v9, 0x30

    aput-object v2, v0, v9

    .line 17
    nop

    .line 30
    const-wide/16 v9, 0x0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v9, "ui_background_blur"

    invoke-static {v9, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x31

    aput-object v9, v0, v10

    .line 17
    nop

    .line 30
    const-wide/16 v9, 0x19

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v10, "ui_background_dim"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x32

    aput-object v9, v0, v10

    .line 17
    nop

    .line 30
    const-string v9, "ui_fly_animation"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x33

    aput-object v9, v0, v10

    .line 17
    nop

    .line 30
    const-wide/16 v9, 0x26c

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    const-string v10, "ui_fly_duration_ms"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x34

    aput-object v9, v0, v10

    .line 17
    nop

    .line 30
    const-string v9, "ui_motion"

    invoke-static {v9, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x35

    aput-object v9, v0, v10

    .line 17
    nop

    .line 31
    const-string v9, "ui_layout"

    invoke-static {v9, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x36

    aput-object v9, v0, v10

    .line 17
    nop

    .line 31
    new-array v9, v3, [Lkotlin/Pair;

    invoke-static {v9}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v9

    const-string v10, "ui_layouts"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x37

    aput-object v9, v0, v10

    .line 17
    nop

    .line 31
    const-string v9, "ui_layout_profile"

    invoke-static {v9, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x38

    aput-object v9, v0, v10

    .line 17
    nop

    .line 31
    const-string v9, "ui_launch_dock_corner"

    invoke-static {v9, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x39

    aput-object v9, v0, v10

    .line 17
    nop

    .line 31
    const-string v9, "ui_window_aspect"

    const-string v10, "4:3"

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x3a

    aput-object v9, v0, v10

    .line 17
    nop

    .line 32
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/List;

    const-string v10, "ui_nav_order"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x3b

    aput-object v9, v0, v10

    .line 17
    nop

    .line 32
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/List;

    const-string v10, "ui_nav_hidden"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x3c

    aput-object v9, v0, v10

    .line 17
    nop

    .line 32
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/List;

    const-string v10, "ui_nav_pinned"

    invoke-static {v10, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    const/16 v10, 0x3d

    aput-object v9, v0, v10

    .line 17
    nop

    .line 32
    const-string v9, "ui_nav_groups"

    invoke-static {v9, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v9, 0x3e

    aput-object v1, v0, v9

    .line 17
    nop

    .line 33
    const-string v1, "ui_nav_defaults"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v9, 0x3f

    aput-object v1, v0, v9

    .line 17
    nop

    .line 33
    const-string v1, "ui_nav_style"

    const-string v9, "grouped"

    invoke-static {v1, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v9, 0x40

    aput-object v1, v0, v9

    .line 17
    nop

    .line 33
    new-array v1, v3, [Lkotlin/Pair;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    const-string v3, "ui_section_members"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x41

    aput-object v1, v0, v3

    .line 17
    nop

    .line 33
    const-string v1, "ui_sidebar_width"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x42

    aput-object v1, v0, v3

    .line 17
    nop

    .line 33
    const-string v1, "default_java"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x43

    aput-object v1, v0, v3

    .line 17
    nop

    .line 34
    const-string v1, "global_mods_dir"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x44

    aput-object v1, v0, v3

    .line 17
    nop

    .line 34
    const-string v1, "launcher_visibility"

    const-string v3, "keep"

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x45

    aput-object v1, v0, v3

    .line 17
    nop

    .line 34
    const-string v1, "gc_preset"

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v3, 0x46

    aput-object v1, v0, v3

    .line 17
    nop

    .line 34
    const-string v1, "download_limit_kbps"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x47

    aput-object v1, v0, v2

    .line 17
    nop

    .line 34
    const-string v1, "auto_check_update"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x48

    aput-object v1, v0, v2

    .line 17
    nop

    .line 35
    const-string v1, "custom_homepage"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x49

    aput-object v1, v0, v2

    .line 17
    nop

    .line 35
    const-string v1, "homepage_mode"

    const-string v2, "news"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4a

    aput-object v1, v0, v2

    .line 17
    nop

    .line 35
    const-string v1, "window_mode"

    const-string v2, "window"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4b

    aput-object v1, v0, v2

    .line 17
    nop

    .line 35
    const-string v1, "skip_assets"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4c

    aput-object v1, v0, v2

    .line 17
    nop

    .line 35
    const-string v1, "first_run"

    invoke-static {v1, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4d

    aput-object v1, v0, v2

    .line 17
    nop

    .line 36
    const-string v1, "show_hidden_versions"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4e

    aput-object v1, v0, v2

    .line 17
    nop

    .line 36
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    const-string v2, "catalog_favorites"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x4f

    aput-object v1, v0, v2

    .line 17
    nop

    .line 36
    const-string v1, "offline_skin"

    invoke-static {v1, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x50

    aput-object v1, v0, v2

    .line 17
    nop

    .line 36
    const-string v1, "allow_multi_instance"

    invoke-static {v1, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x51

    aput-object v1, v0, v2

    .line 17
    nop

    .line 37
    const-string v1, "export_dir"

    invoke-static {v1, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x52

    aput-object v1, v0, v2

    .line 17
    nop

    .line 37
    const-string v1, "language"

    const-string v2, "zh_CN"

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x53

    aput-object v1, v0, v2

    .line 17
    nop

    .line 39
    const-string v1, "android_renderer"

    invoke-static {v1, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x54

    aput-object v1, v0, v2

    .line 17
    nop

    .line 16
    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/config/LauncherPaths;)V
    .locals 1
    .param p1, "paths"    # Lcom/pymcl/core/config/LauncherPaths;

    const-string v0, "paths"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    .line 45
    invoke-direct {p0}, Lcom/pymcl/core/config/ConfigStore;->load()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    .line 14
    return-void
.end method

.method public static final synthetic access$getDEFAULTS$cp()Ljava/util/Map;
    .locals 1

    .line 14
    sget-object v0, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    return-object v0
.end method

.method private final load()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 48
    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v1}, Lcom/pymcl/core/config/LauncherPaths;->getConfigFile()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 49
    .local v0, "raw":Ljava/util/Map;
    :cond_0
    sget-object v1, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 50
    .local v1, "m":Ljava/util/Map;
    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 51
    invoke-direct {p0, v1}, Lcom/pymcl/core/config/ConfigStore;->migrate(Ljava/util/Map;)V

    .line 52
    iget-object v2, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    const-string v3, "instances_dir"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, ".minecraft"

    :cond_1
    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/LauncherPaths;->setInstancesDir(Ljava/lang/String;)V

    .line 53
    return-object v1
.end method

.method private final migrate(Ljava/util/Map;)V
    .locals 11
    .param p1, "m"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 57
    const-string v0, "instances_dir"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "instances"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 58
    iget-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v1, v2}, Lcom/pymcl/core/config/LauncherPaths;->resolve(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .local v1, "old":Ljava/io/File;
    iget-object v2, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    const-string v3, ".minecraft"

    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/LauncherPaths;->resolve(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 59
    .local v2, "new":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 60
    :cond_0
    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .end local v1    # "old":Ljava/io/File;
    .end local v2    # "new":Ljava/io/File;
    :cond_1
    const-string v0, "isolation_defaults"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "2026.09-isolate-all"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 63
    const-string v1, "default_isolation"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "none"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "all"

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    :cond_2
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    :cond_3
    const-string v0, "ai_gateway_defaults"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "2026.10-builtin-newapi"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    .line 67
    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/String;

    const-string v3, "ai_gateway_url"

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const-string v3, "ai_base_url"

    const/4 v5, 0x1

    aput-object v3, v1, v5

    const/4 v3, 0x2

    const-string v6, "ai_api_key"

    aput-object v6, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 111
    .local v3, "$i$f$all":I
    instance-of v6, v1, Ljava/util/Collection;

    if-eqz v6, :cond_4

    move-object v6, v1

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    move v4, v5

    goto :goto_2

    .line 112
    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/4 v9, 0x0

    .line 67
    .local v9, "$i$a$-all-ConfigStore$migrate$noAi$1":I
    invoke-static {p1, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    check-cast v10, Ljava/lang/CharSequence;

    if-eqz v10, :cond_7

    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_6

    goto :goto_0

    :cond_6
    move v10, v4

    goto :goto_1

    :cond_7
    :goto_0
    move v10, v5

    .line 112
    .end local v8    # "it":Ljava/lang/String;
    .end local v9    # "$i$a$-all-ConfigStore$migrate$noAi$1":I
    :goto_1
    if-nez v10, :cond_5

    goto :goto_2

    .line 113
    .end local v7    # "element$iv":Ljava/lang/Object;
    :cond_8
    move v4, v5

    .line 67
    .end local v1    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$all":I
    :goto_2
    nop

    .line 68
    .local v4, "noAi":Z
    if-eqz v4, :cond_9

    const-string v1, "ai_mode"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v5, "public"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    const-string v3, "custom"

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_9
    invoke-interface {p1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .end local v4    # "noAi":Z
    :cond_a
    return-void
.end method


# virtual methods
.method public final bool(Ljava/lang/String;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final get(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    iget-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getCurseforgeKey()Ljava/lang/String;
    .locals 2

    .line 82
    const-string v0, "curseforge_api_key"

    invoke-virtual {p0, v0}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 114
    const/4 v0, 0x0

    .line 82
    .local v0, "$i$a$-ifEmpty-ConfigStore$curseforgeKey$1":I
    sget-object v1, Lcom/pymcl/core/config/BuiltinSecrets;->INSTANCE:Lcom/pymcl/core/config/BuiltinSecrets;

    invoke-virtual {v1}, Lcom/pymcl/core/config/BuiltinSecrets;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v0

    .end local v0    # "$i$a$-ifEmpty-ConfigStore$curseforgeKey$1":I
    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final getMicrosoftClientId()Ljava/lang/String;
    .locals 2

    .line 83
    const-string v0, "microsoft_client_id"

    invoke-virtual {p0, v0}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 114
    const/4 v0, 0x0

    .line 83
    .local v0, "$i$a$-ifEmpty-ConfigStore$microsoftClientId$1":I
    nop

    .end local v0    # "$i$a$-ifEmpty-ConfigStore$microsoftClientId$1":I
    const-string v0, "00000000402b5328"

    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final int(Ljava/lang/String;)I
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_0
    sget-object v0, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->int(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final list(Ljava/lang/String;)Ljava/util/List;
    .locals 14
    .param p1, "key"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    iget-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 115
    .local v1, "$i$f$mapNotNull":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 124
    .local v4, "$i$f$mapNotNullTo":I
    move-object v5, v3

    .local v5, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 125
    .local v6, "$i$f$forEach":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "element$iv$iv":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 124
    .local v10, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v11, v9

    .local v11, "it":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 79
    .local v12, "$i$a$-mapNotNull-ConfigStore$list$1":I
    instance-of v13, v11, Ljava/lang/String;

    if-eqz v13, :cond_0

    move-object v13, v11

    check-cast v13, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v13, 0x0

    .line 124
    .end local v11    # "it":Ljava/lang/Object;
    .end local v12    # "$i$a$-mapNotNull-ConfigStore$list$1":I
    :goto_1
    if-eqz v13, :cond_1

    .line 126
    .local v13, "it$iv$iv":Ljava/lang/Object;
    const/4 v11, 0x0

    .line 124
    .local v11, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v2, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 125
    .end local v9    # "element$iv$iv":Ljava/lang/Object;
    .end local v10    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v11    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v13    # "it$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v8    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 127
    :cond_2
    nop

    .line 128
    .end local v5    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEach":I
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNullTo":I
    check-cast v2, Ljava/util/List;

    .line 115
    nop

    .line 79
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull":I
    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_2
    return-object v2
.end method

.method public final publicSettings()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 101
    invoke-virtual {p0}, Lcom/pymcl/core/config/ConfigStore;->snapshot()Ljava/util/Map;

    move-result-object v0

    .line 102
    .local v0, "m":Ljava/util/Map;
    const-string v1, "microsoft_client_id"

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "ms_client_id"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "curseforge_api_key"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "ai_api_key"

    const/4 v4, 0x1

    aput-object v2, v1, v4

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 104
    .local v2, "k":Ljava/lang/String;
    invoke-interface {v0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Ljava/lang/String;

    if-eqz v6, :cond_0

    check-cast v5, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    const-string v6, ""

    if-nez v5, :cond_1

    move-object v5, v6

    .line 105
    .local v5, "v":Ljava/lang/String;
    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "_set"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v8, v5

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v8

    if-lez v8, :cond_2

    move v8, v4

    goto :goto_2

    :cond_2
    move v8, v3

    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-interface {v0, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "_hint"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x8

    if-le v8, v9, :cond_3

    const/4 v6, 0x3

    invoke-static {v5, v6}, Lkotlin/text/StringsKt;->take(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x4

    invoke-static {v5, v8}, Lkotlin/text/StringsKt;->takeLast(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v9, "\u2026"

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_3
    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 107
    .end local v2    # "k":Ljava/lang/String;
    .end local v5    # "v":Ljava/lang/String;
    :cond_4
    return-object v0
.end method

.method public final reload()V
    .locals 1

    .line 73
    invoke-direct {p0}, Lcom/pymcl/core/config/ConfigStore;->load()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    return-void
.end method

.method public final save()Z
    .locals 4

    .line 93
    monitor-enter p0

    const/4 v0, 0x0

    .line 94
    .local v0, "$i$a$-synchronized-ConfigStore$save$1":I
    :try_start_0
    iget-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 95
    .local v1, "out":Ljava/util/Map;
    const-string v2, "curseforge_api_key"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/pymcl/core/config/BuiltinSecrets;->INSTANCE:Lcom/pymcl/core/config/BuiltinSecrets;

    invoke-virtual {v3}, Lcom/pymcl/core/config/BuiltinSecrets;->getCurseforgeKey()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "curseforge_api_key"

    const-string v3, ""

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    :cond_0
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    iget-object v3, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    invoke-virtual {v3}, Lcom/pymcl/core/config/LauncherPaths;->getConfigFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .end local v0    # "$i$a$-synchronized-ConfigStore$save$1":I
    .end local v1    # "out":Ljava/util/Map;
    monitor-exit p0

    .line 97
    return v2

    .line 93
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final set(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/pymcl/core/config/ConfigStore;->update(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method public final snapshot()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 74
    monitor-enter p0

    .line 114
    const/4 v0, 0x0

    .line 74
    .local v0, "$i$a$-synchronized-ConfigStore$snapshot$1":I
    :try_start_0
    iget-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-ConfigStore$snapshot$1":I
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final string(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    iget-object v0, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/pymcl/core/config/ConfigStore;->DEFAULTS:Ljava/util/Map;

    invoke-static {v0, p1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final update(Ljava/util/Map;)Z
    .locals 4
    .param p1, "changes"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "changes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    monitor-enter p0

    const/4 v0, 0x0

    .line 86
    .local v0, "$i$a$-synchronized-ConfigStore$update$1":I
    :try_start_0
    iget-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->deepCopy(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .local v1, "m":Ljava/util/Map;
    invoke-interface {v1, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iput-object v1, p0, Lcom/pymcl/core/config/ConfigStore;->data:Ljava/util/Map;

    .line 87
    const-string v2, "instances_dir"

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/pymcl/core/config/ConfigStore;->paths:Lcom/pymcl/core/config/LauncherPaths;

    const-string v3, "instances_dir"

    invoke-static {v1, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, ".minecraft"

    :cond_0
    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/LauncherPaths;->setInstancesDir(Ljava/lang/String;)V

    .line 88
    :cond_1
    invoke-virtual {p0}, Lcom/pymcl/core/config/ConfigStore;->save()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .end local v0    # "$i$a$-synchronized-ConfigStore$update$1":I
    .end local v1    # "m":Ljava/util/Map;
    monitor-exit p0

    .line 89
    return v2

    .line 85
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
