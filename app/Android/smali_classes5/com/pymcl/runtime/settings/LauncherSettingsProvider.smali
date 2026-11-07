.class public final Lcom/pymcl/runtime/settings/LauncherSettingsProvider;
.super Landroid/content/ContentProvider;
.source "LauncherSettingsProvider.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLauncherSettingsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LauncherSettingsProvider.kt\ncom/pymcl/runtime/settings/LauncherSettingsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n2068#2,2:66\n1#3:68\n*S KotlinDebug\n*F\n+ 1 LauncherSettingsProvider.kt\ncom/pymcl/runtime/settings/LauncherSettingsProvider\n*L\n27#1:66,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000f\u001a\u00020\u0010H\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016JO\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0010\u0010\u001b\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0014\u0018\u00010\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0014\u0018\u00010\u001c2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0016\u00a2\u0006\u0002\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0016J1\u0010%\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0014\u0018\u00010\u001cH\u0016\u00a2\u0006\u0002\u0010\'J;\u0010(\u001a\u00020&2\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010#\u001a\u0004\u0018\u00010$2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0010\u0010\u001e\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0014\u0018\u00010\u001cH\u0016\u00a2\u0006\u0002\u0010)R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006*"
    }
    d2 = {
        "Lcom/pymcl/runtime/settings/LauncherSettingsProvider;",
        "Landroid/content/ContentProvider;",
        "<init>",
        "()V",
        "prefs",
        "Landroid/content/SharedPreferences;",
        "getPrefs",
        "()Landroid/content/SharedPreferences;",
        "prefs$delegate",
        "Lkotlin/Lazy;",
        "server",
        "Lcom/pymcl/runtime/settings/SettingsServer;",
        "getServer",
        "()Lcom/pymcl/runtime/settings/SettingsServer;",
        "server$delegate",
        "onCreate",
        "",
        "call",
        "Landroid/os/Bundle;",
        "method",
        "",
        "arg",
        "extras",
        "query",
        "Landroid/database/Cursor;",
        "uri",
        "Landroid/net/Uri;",
        "projection",
        "",
        "selection",
        "selectionArgs",
        "sortOrder",
        "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;",
        "getType",
        "insert",
        "values",
        "Landroid/content/ContentValues;",
        "delete",
        "",
        "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I",
        "update",
        "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I",
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


# instance fields
.field private final prefs$delegate:Lkotlin/Lazy;

.field private final server$delegate:Lkotlin/Lazy;


# direct methods
.method public static synthetic $r8$lambda$Bl_CeBiJfY6v0pnFl655TAgZ_Ys(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->prefs_delegate$lambda$0(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$TNN6GMRH-C-UjymjdJPmK4aMP-M(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Lcom/pymcl/runtime/settings/SettingsServer;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->server_delegate$lambda$0(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Lcom/pymcl/runtime/settings/SettingsServer;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    .line 18
    new-instance v0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->prefs$delegate:Lkotlin/Lazy;

    .line 21
    new-instance v0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider$$ExternalSyntheticLambda1;-><init>(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->server$delegate:Lkotlin/Lazy;

    .line 17
    return-void
.end method

.method private final getPrefs()Landroid/content/SharedPreferences;
    .locals 2

    .line 18
    iget-object v0, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->prefs$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "getValue(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/content/SharedPreferences;

    return-object v0
.end method

.method private final getServer()Lcom/pymcl/runtime/settings/SettingsServer;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->server$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/settings/SettingsServer;

    return-object v0
.end method

.method private static final prefs_delegate$lambda$0(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Landroid/content/SharedPreferences;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/runtime/settings/LauncherSettingsProvider;

    .line 19
    invoke-virtual {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v1, "launcher"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method private static final server_delegate$lambda$0(Lcom/pymcl/runtime/settings/LauncherSettingsProvider;)Lcom/pymcl/runtime/settings/SettingsServer;
    .locals 3
    .param p0, "this$0"    # Lcom/pymcl/runtime/settings/LauncherSettingsProvider;

    .line 21
    new-instance v0, Lcom/pymcl/runtime/settings/SettingsServer;

    new-instance v1, Lcom/pymcl/runtime/settings/SharedPrefsStore;

    invoke-direct {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->getPrefs()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/pymcl/runtime/settings/SharedPrefsStore;-><init>(Landroid/content/SharedPreferences;)V

    check-cast v1, Lcom/pymcl/runtime/settings/RawStore;

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/settings/SettingsServer;-><init>(Lcom/pymcl/runtime/settings/RawStore;)V

    return-object v0
.end method


# virtual methods
.method public call(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 9
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "arg"    # Ljava/lang/String;
    .param p3, "extras"    # Landroid/os/Bundle;

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 27
    .local v0, "req":Ljava/util/HashMap;
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 66
    .local v2, "$i$f$forEach":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "k":Ljava/lang/String;
    const/4 v6, 0x0

    .line 27
    .local v6, "$i$a$-forEach-LauncherSettingsProvider$call$1":I
    move-object v7, v0

    check-cast v7, Ljava/util/Map;

    invoke-virtual {p3, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .end local v5    # "k":Ljava/lang/String;
    .end local v6    # "$i$a$-forEach-LauncherSettingsProvider$call$1":I
    nop

    .end local v4    # "element$iv":Ljava/lang/Object;
    goto :goto_0

    .line 67
    :cond_0
    nop

    .line 28
    .end local v1    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    :cond_1
    monitor-enter p0

    .line 68
    const/4 v1, 0x0

    .line 28
    .local v1, "$i$a$-synchronized-LauncherSettingsProvider$call$res$1":I
    :try_start_0
    invoke-direct {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->getServer()Lcom/pymcl/runtime/settings/SettingsServer;

    move-result-object v2

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    invoke-virtual {v2, p1, p2, v3}, Lcom/pymcl/runtime/settings/SettingsServer;->handle(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/pymcl/runtime/settings/SettingsServer$Result;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .end local v1    # "$i$a$-synchronized-LauncherSettingsProvider$call$res$1":I
    monitor-exit p0

    .line 29
    .local v2, "res":Lcom/pymcl/runtime/settings/SettingsServer$Result;
    invoke-virtual {v2}, Lcom/pymcl/runtime/settings/SettingsServer$Result;->getChangedKey()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .local v1, "key":Ljava/lang/String;
    const/4 v3, 0x0

    .line 30
    .local v3, "$i$a$-let-LauncherSettingsProvider$call$2":I
    invoke-virtual {p0}, Lcom/pymcl/runtime/settings/LauncherSettingsProvider;->getContext()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_2

    .line 31
    .local v4, "ctx":Landroid/content/Context;
    :cond_2
    :try_start_1
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    sget-object v6, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "getPackageName(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v7, v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->keyUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 32
    :catchall_0
    move-exception v5

    .local v5, "t":Ljava/lang/Throwable;
    const-string v6, "PyMCL-Settings"

    const-string v7, "notifyChange"

    invoke-static {v6, v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 33
    .end local v5    # "t":Ljava/lang/Throwable;
    :goto_1
    nop

    .line 29
    .end local v1    # "key":Ljava/lang/String;
    .end local v3    # "$i$a$-let-LauncherSettingsProvider$call$2":I
    .end local v4    # "ctx":Landroid/content/Context;
    :cond_3
    :goto_2
    nop

    .line 34
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    move-object v3, v1

    .line 68
    .local v3, "$this$call_u24lambda_u243":Landroid/os/Bundle;
    const/4 v4, 0x0

    .line 34
    .local v4, "$i$a$-apply-LauncherSettingsProvider$call$3":I
    invoke-virtual {v2}, Lcom/pymcl/runtime/settings/SettingsServer$Result;->getResponse()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .local v7, "k":Ljava/lang/String;
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "v":Ljava/lang/String;
    invoke-virtual {v3, v7, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .end local v6    # "v":Ljava/lang/String;
    .end local v7    # "k":Ljava/lang/String;
    goto :goto_3

    .end local v3    # "$this$call_u24lambda_u243":Landroid/os/Bundle;
    .end local v4    # "$i$a$-apply-LauncherSettingsProvider$call$3":I
    :cond_4
    return-object v1

    .line 28
    .end local v2    # "res":Lcom/pymcl/runtime/settings/SettingsServer$Result;
    :catchall_1
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "selection"    # Ljava/lang/String;
    .param p3, "selectionArgs"    # [Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    const/4 v0, 0x0

    return v0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x0

    return-object v0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    const/4 v0, 0x0

    return-object v0
.end method

.method public onCreate()Z
    .locals 1

    .line 23
    const/4 v0, 0x1

    return v0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "projection"    # [Ljava/lang/String;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;
    .param p5, "sortOrder"    # Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    const/4 v0, 0x0

    return-object v0
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 1
    .param p1, "uri"    # Landroid/net/Uri;
    .param p2, "values"    # Landroid/content/ContentValues;
    .param p3, "selection"    # Ljava/lang/String;
    .param p4, "selectionArgs"    # [Ljava/lang/String;

    const-string v0, "uri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    const/4 v0, 0x0

    return v0
.end method
