.class public final Lcom/pymcl/runtime/settings/CrossProcessPrefs;
.super Ljava/lang/Object;
.source "CrossProcessPrefs.kt"

# interfaces
.implements Lcom/pymcl/runtime/input/PrefIO;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrossProcessPrefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossProcessPrefs.kt\ncom/pymcl/runtime/settings/CrossProcessPrefs\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0012\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0008H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0008H\u0016J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u001bH\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020 J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0019\u001a\u0004\u0018\u00010\"J\u0006\u0010#\u001a\u00020\u001bJ\"\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00180%2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0008\u0012\u0004\u0012\u00020\u00180\'R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs;",
        "Lcom/pymcl/runtime/input/PrefIO;",
        "ctx",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "app",
        "authority",
        "",
        "baseUri",
        "Landroid/net/Uri;",
        "transport",
        "Lcom/pymcl/runtime/settings/SettingsTransport;",
        "client",
        "Lcom/pymcl/runtime/settings/SettingsClient;",
        "getClient",
        "()Lcom/pymcl/runtime/settings/SettingsClient;",
        "observer",
        "com/pymcl/runtime/settings/CrossProcessPrefs$observer$1",
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;",
        "getString",
        "key",
        "def",
        "putString",
        "",
        "value",
        "getBoolean",
        "",
        "putBoolean",
        "getInt",
        "",
        "getLong",
        "",
        "put",
        "",
        "preload",
        "addListener",
        "Lkotlin/Function0;",
        "l",
        "Lkotlin/Function1;",
        "Companion",
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
.field public static final Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

.field private static final TAG:Ljava/lang/String; = "PyMCL-Settings"

.field private static volatile instance:Lcom/pymcl/runtime/settings/CrossProcessPrefs;


# instance fields
.field private final app:Landroid/content/Context;

.field private final authority:Ljava/lang/String;

.field private final baseUri:Landroid/net/Uri;

.field private final client:Lcom/pymcl/runtime/settings/SettingsClient;

.field private final observer:Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;

.field private final transport:Lcom/pymcl/runtime/settings/SettingsTransport;


# direct methods
.method public static synthetic $r8$lambda$zwoazSH_JgYsfyLfoo-L65iL_1g(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->transport$lambda$0$0(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 9
    .param p1, "ctx"    # Landroid/content/Context;

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p1

    :cond_0
    iput-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    .line 17
    sget-object v0, Lcom/pymcl/runtime/settings/SettingsProtocol;->INSTANCE:Lcom/pymcl/runtime/settings/SettingsProtocol;

    iget-object v1, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getPackageName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/settings/SettingsProtocol;->authority(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->authority:Ljava/lang/String;

    .line 18
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->authority:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "content://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/prefs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "parse(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->baseUri:Landroid/net/Uri;

    .line 20
    move-object v0, p0

    check-cast v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    .local v0, "$this$transport_u24lambda_u240":Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    const/4 v1, 0x0

    .line 22
    .local v1, "$i$a$-run-CrossProcessPrefs$transport$1":I
    const/4 v2, 0x1

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    iget-object v5, v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->authority:Ljava/lang/String;

    invoke-virtual {v4, v5, v3}, Landroid/content/pm/PackageManager;->resolveContentProvider(Ljava/lang/String;I)Landroid/content/pm/ProviderInfo;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v3

    goto :goto_0

    :catchall_0
    move-exception v4

    move v4, v3

    .line 23
    .local v4, "registered":Z
    :goto_0
    const-string v5, "PyMCL-Settings"

    if-nez v4, :cond_2

    iget-object v6, v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->authority:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "provider "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, " not registered, using local SharedPreferences"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v6, 0x0

    goto :goto_1

    .line 24
    :cond_2
    new-instance v6, Lcom/pymcl/runtime/settings/CrossProcessPrefs$$ExternalSyntheticLambda0;

    invoke-direct {v6, v0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V

    .line 28
    :goto_1
    nop

    .line 20
    .end local v0    # "$this$transport_u24lambda_u240":Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .end local v1    # "$i$a$-run-CrossProcessPrefs$transport$1":I
    .end local v4    # "registered":Z
    iput-object v6, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    .line 31
    new-instance v0, Lcom/pymcl/runtime/settings/SettingsClient;

    iget-object v1, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    new-instance v4, Lcom/pymcl/runtime/settings/SharedPrefsStore;

    iget-object v6, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    const-string v7, "launcher"

    invoke-virtual {v6, v7, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v6, "getSharedPreferences(...)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v3}, Lcom/pymcl/runtime/settings/SharedPrefsStore;-><init>(Landroid/content/SharedPreferences;)V

    check-cast v4, Lcom/pymcl/runtime/settings/RawStore;

    invoke-direct {v0, v1, v4}, Lcom/pymcl/runtime/settings/SettingsClient;-><init>(Lcom/pymcl/runtime/settings/SettingsTransport;Lcom/pymcl/runtime/settings/RawStore;)V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    .line 33
    new-instance v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;

    invoke-direct {v0, p0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;-><init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->observer:Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;

    .line 38
    nop

    .line 39
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    if-eqz v0, :cond_3

    :try_start_1
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->baseUri:Landroid/net/Uri;

    iget-object v3, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->observer:Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;

    check-cast v3, Landroid/database/ContentObserver;

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    .line 40
    :catchall_1
    move-exception v0

    .local v0, "t":Ljava/lang/Throwable;
    const-string v1, "registerContentObserver"

    invoke-static {v5, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 41
    .end local v0    # "t":Ljava/lang/Throwable;
    :cond_3
    :goto_2
    nop

    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static final synthetic access$getInstance$cp()Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .locals 1

    .line 15
    sget-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->instance:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    return-object v0
.end method

.method public static final synthetic access$setInstance$cp(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    .locals 0
    .param p0, "<set-?>"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    .line 15
    sput-object p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->instance:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    return-void
.end method

.method public static final get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .locals 1
    .param p0, "ctx"    # Landroid/content/Context;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-virtual {v0, p0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v0

    .line 62
    return-object v0
.end method

.method public static final keyUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 1
    .param p0, "applicationId"    # Ljava/lang/String;
    .param p1, "key"    # Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;->keyUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 67
    return-object v0
.end method

.method private static final transport$lambda$0$0(Lcom/pymcl/runtime/settings/CrossProcessPrefs;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 8
    .param p0, "$this_run"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "arg"    # Ljava/lang/String;
    .param p3, "extras"    # Ljava/util/Map;

    const-string v0, "method"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    move-object v1, v0

    .line 71
    .local v1, "$this$transport_u24lambda_u240_u240_u240":Landroid/os/Bundle;
    const/4 v2, 0x0

    .line 25
    .local v2, "$i$a$-apply-CrossProcessPrefs$transport$1$1$b$1":I
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .local v5, "k":Ljava/lang/String;
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .local v4, "v":Ljava/lang/String;
    invoke-virtual {v1, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .end local v4    # "v":Ljava/lang/String;
    .end local v5    # "k":Ljava/lang/String;
    goto :goto_0

    .line 26
    .end local v1    # "$this$transport_u24lambda_u240_u240_u240":Landroid/os/Bundle;
    .end local v2    # "$i$a$-apply-CrossProcessPrefs$transport$1$1$b$1":I
    .local v0, "b":Landroid/os/Bundle;
    :cond_0
    iget-object v1, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->app:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->baseUri:Landroid/net/Uri;

    invoke-virtual {v1, v2, p1, p2, v0}, Landroid/content/ContentResolver;->call(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    return-object v1

    .line 27
    .local v1, "r":Landroid/os/Bundle;
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    move-object v3, v2

    .line 71
    .local v3, "$this$transport_u24lambda_u240_u240_u241":Ljava/util/HashMap;
    const/4 v4, 0x0

    .line 27
    .local v4, "$i$a$-apply-CrossProcessPrefs$transport$1$1$1":I
    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .local v6, "k":Ljava/lang/String;
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .end local v3    # "$this$transport_u24lambda_u240_u240_u241":Ljava/util/HashMap;
    .end local v4    # "$i$a$-apply-CrossProcessPrefs$transport$1$1$1":I
    .end local v6    # "k":Ljava/lang/String;
    :cond_2
    check-cast v2, Ljava/util/Map;

    return-object v2
.end method


# virtual methods
.method public final addListener(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
    .locals 1
    .param p1, "l"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->addListener(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method public getBoolean(Ljava/lang/String;Z)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # Z

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/runtime/settings/SettingsClient;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public final getClient()Lcom/pymcl/runtime/settings/SettingsClient;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    return-object v0
.end method

.method public final getInt(Ljava/lang/String;I)I
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # I

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/runtime/settings/SettingsClient;->getInt(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method public final getLong(Ljava/lang/String;J)J
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # J

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2, p3}, Lcom/pymcl/runtime/settings/SettingsClient;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/runtime/settings/SettingsClient;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final preload()Z
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0}, Lcom/pymcl/runtime/settings/SettingsClient;->preload()Z

    move-result v0

    return v0
.end method

.method public final put(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/runtime/settings/SettingsClient;->write(Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public putBoolean(Ljava/lang/String;Z)V
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Z

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/pymcl/runtime/settings/SettingsClient;->write(Ljava/lang/String;Ljava/lang/Object;)Z

    return-void
.end method

.method public putString(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->client:Lcom/pymcl/runtime/settings/SettingsClient;

    invoke-virtual {v0, p1, p2}, Lcom/pymcl/runtime/settings/SettingsClient;->write(Ljava/lang/String;Ljava/lang/Object;)Z

    return-void
.end method
