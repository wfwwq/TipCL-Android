.class public final Lcom/pymcl/ai/ToolMetas;
.super Ljava/lang/Object;
.source "Permission.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/ToolMetas\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1739#2:144\n1814#2,3:145\n1373#2,2:148\n1402#2,4:150\n*S KotlinDebug\n*F\n+ 1 Permission.kt\ncom/pymcl/ai/ToolMetas\n*L\n13#1:144\n13#1:145,3\n26#1:148,2\n26#1:150,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J8\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\r\u001a\u00020\nH\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0008R\u001d\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/pymcl/ai/ToolMetas;",
        "",
        "<init>",
        "()V",
        "m",
        "",
        "Lcom/pymcl/ai/ToolMeta;",
        "names",
        "",
        "ro",
        "",
        "se",
        "risk",
        "lr",
        "ALL",
        "",
        "getALL",
        "()Ljava/util/Map;",
        "of",
        "name",
        "PyMCL-Android:ai"
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
.field private static final ALL:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/ToolMeta;",
            ">;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lcom/pymcl/ai/ToolMetas;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/pymcl/ai/ToolMetas;

    invoke-direct {v0}, Lcom/pymcl/ai/ToolMetas;-><init>()V

    sput-object v0, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    .line 26
    nop

    .line 15
    const/16 v0, 0xb

    new-array v0, v0, [Ljava/util/List;

    sget-object v1, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const-string v2, "ask_user get_launcher_state list_instances list_installed_versions get_java_list dispatch_subagent update_plan"

    const/4 v3, 0x1

    const-string v4, "none"

    const-string v5, "low"

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 16
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const/16 v9, 0x10

    const/4 v10, 0x0

    const-string v4, "search_versions search_mods search_modpacks search_content search_worlds"

    const/4 v5, 0x1

    const-string v6, "network"

    const-string v7, "low"

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 15
    nop

    .line 17
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v4, "list_mods diagnose_launch get_latest_log get_crash_report scan_mod_conflicts inspect_mod list_mod_configs read_mod_config read_artifact"

    const-string v6, "read"

    const-string v7, "low"

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 15
    nop

    .line 18
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v7, "high"

    const/4 v8, 0x1

    const-string v4, "install_game install_modpack"

    const/4 v5, 0x0

    const-string v6, "write_local"

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/ai/ToolMetas;->m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 15
    nop

    .line 19
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v7, "medium"

    const-string v4, "install_mod install_world"

    const-string v6, "write_local"

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/ai/ToolMetas;->m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x4

    aput-object v1, v0, v2

    .line 15
    nop

    .line 20
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v7, "low"

    const-string v4, "install_shader install_resourcepack install_datapack"

    const-string v6, "write_local"

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/ai/ToolMetas;->m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x5

    aput-object v1, v0, v2

    .line 15
    nop

    .line 21
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v4, "create_instance disable_mod enable_mod"

    const-string v6, "write_local"

    const-string v7, "medium"

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    .line 15
    nop

    .line 22
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v7, "medium"

    const/4 v8, 0x1

    const-string v4, "download_java"

    const-string v6, "write_local"

    invoke-direct/range {v3 .. v8}, Lcom/pymcl/ai/ToolMetas;->m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x7

    aput-object v1, v0, v2

    .line 15
    nop

    .line 23
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v4, "write_mod_config"

    const-string v6, "write_local"

    const-string v7, "high"

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    .line 15
    nop

    .line 24
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v4, "delete_instance delete_mod"

    const-string v6, "delete"

    const-string v7, "high"

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 15
    nop

    .line 25
    sget-object v3, Lcom/pymcl/ai/ToolMetas;->INSTANCE:Lcom/pymcl/ai/ToolMetas;

    const-string v4, "launch_game"

    const-string v6, "launch"

    const-string v7, "high"

    invoke-static/range {v3 .. v10}, Lcom/pymcl/ai/ToolMetas;->m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    .line 15
    nop

    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 26
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$associateBy$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 148
    .local v1, "$i$f$associateBy":I
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 149
    .local v2, "capacity$iv":I
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v3, Ljava/util/Map;

    .local v3, "destination$iv$iv":Ljava/util/Map;
    move-object v4, v0

    .local v4, "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 150
    .local v5, "$i$f$associateByTo":I
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 151
    .local v7, "element$iv$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/ai/ToolMeta;

    .local v8, "it":Lcom/pymcl/ai/ToolMeta;
    const/4 v9, 0x0

    .line 26
    .local v9, "$i$a$-associateBy-ToolMetas$ALL$1":I
    invoke-virtual {v8}, Lcom/pymcl/ai/ToolMeta;->getName()Ljava/lang/String;

    move-result-object v8

    .line 151
    .end local v8    # "it":Lcom/pymcl/ai/ToolMeta;
    .end local v9    # "$i$a$-associateBy-ToolMetas$ALL$1":I
    invoke-interface {v3, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 153
    .end local v7    # "element$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .line 149
    .end local v3    # "destination$iv$iv":Ljava/util/Map;
    .end local v4    # "$this$associateByTo$iv$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$associateByTo":I
    nop

    .line 26
    .end local v0    # "$this$associateBy$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$associateBy":I
    .end local v2    # "capacity$iv":I
    sput-object v3, Lcom/pymcl/ai/ToolMetas;->ALL:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 14
    .param p1, "names"    # Ljava/lang/String;
    .param p2, "ro"    # Z
    .param p3, "se"    # Ljava/lang/String;
    .param p4, "risk"    # Ljava/lang/String;
    .param p5, "lr"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Lcom/pymcl/ai/ToolMeta;",
            ">;"
        }
    .end annotation

    .line 13
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x20

    const/4 v3, 0x0

    aput-char v2, v1, v3

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 144
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 145
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 146
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v8, v6

    check-cast v8, Ljava/lang/String;

    .local v8, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 13
    .local v13, "$i$a$-map-ToolMetas$m$1":I
    new-instance v7, Lcom/pymcl/ai/ToolMeta;

    move/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v12, p5

    invoke-direct/range {v7 .. v12}, Lcom/pymcl/ai/ToolMeta;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 146
    .end local v8    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-map-ToolMetas$m$1":I
    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 147
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 144
    nop

    .line 13
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method

.method static synthetic m$default(Lcom/pymcl/ai/ToolMetas;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/util/List;
    .locals 6

    .line 13
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/pymcl/ai/ToolMetas;->m(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getALL()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/pymcl/ai/ToolMeta;",
            ">;"
        }
    .end annotation

    .line 14
    sget-object v0, Lcom/pymcl/ai/ToolMetas;->ALL:Ljava/util/Map;

    return-object v0
.end method

.method public final of(Ljava/lang/String;)Lcom/pymcl/ai/ToolMeta;
    .locals 9
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/pymcl/ai/ToolMetas;->ALL:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/ai/ToolMeta;

    if-nez v0, :cond_0

    new-instance v1, Lcom/pymcl/ai/ToolMeta;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v3, 0x0

    const-string v4, "write_local"

    const-string v5, "high"

    const/4 v6, 0x0

    move-object v2, p1

    .end local p1    # "name":Ljava/lang/String;
    .local v2, "name":Ljava/lang/String;
    invoke-direct/range {v1 .. v8}, Lcom/pymcl/ai/ToolMeta;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v1

    goto :goto_0

    .end local v2    # "name":Ljava/lang/String;
    .restart local p1    # "name":Ljava/lang/String;
    :cond_0
    move-object v2, p1

    .end local p1    # "name":Ljava/lang/String;
    .restart local v2    # "name":Ljava/lang/String;
    :goto_0
    return-object v0
.end method
