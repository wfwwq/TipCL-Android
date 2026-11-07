.class public final Lcom/pymcl/runtime/settings/SettingsClient;
.super Ljava/lang/Object;
.source "SettingsCore.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/settings/SettingsClient$Cached;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSettingsCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsCore.kt\ncom/pymcl/runtime/settings/SettingsClient\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001:\u0001/B\u0019\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007JB\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\n2\u0016\u0008\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0018H\u0002J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001d\u001a\u00020\nJ\u0018\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u001f\u001a\u00020\u0013J\u0010\u0010 \u001a\u00020\u00112\u0008\u0010\u001d\u001a\u0004\u0018\u00010\nJ\"\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00110\"2\u0014\u0010#\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00110\u0010J\u0012\u0010$\u001a\u00020\u00112\u0008\u0010\u001d\u001a\u0004\u0018\u00010\nH\u0002J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\nJ\u0016\u0010&\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\'\u001a\u00020\u0013J\u001a\u0010(\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\n2\u0008\u0010\'\u001a\u0004\u0018\u00010\nJ\u0016\u0010)\u001a\u00020*2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\'\u001a\u00020*J\u0016\u0010+\u001a\u00020,2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\'\u001a\u00020,J\u0016\u0010-\u001a\u00020.2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\'\u001a\u00020.R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0013@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u00060"
    }
    d2 = {
        "Lcom/pymcl/runtime/settings/SettingsClient;",
        "",
        "transport",
        "Lcom/pymcl/runtime/settings/SettingsTransport;",
        "fallback",
        "Lcom/pymcl/runtime/settings/RawStore;",
        "<init>",
        "(Lcom/pymcl/runtime/settings/SettingsTransport;Lcom/pymcl/runtime/settings/RawStore;)V",
        "cache",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "",
        "Lcom/pymcl/runtime/settings/SettingsClient$Cached;",
        "generation",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        "listeners",
        "Ljava/util/concurrent/CopyOnWriteArrayList;",
        "Lkotlin/Function1;",
        "",
        "value",
        "",
        "remoteOk",
        "getRemoteOk",
        "()Z",
        "remote",
        "",
        "method",
        "arg",
        "extras",
        "read",
        "key",
        "write",
        "preload",
        "onRemoteChanged",
        "addListener",
        "Lkotlin/Function0;",
        "l",
        "fire",
        "isCached",
        "getBoolean",
        "def",
        "getString",
        "getInt",
        "",
        "getLong",
        "",
        "getFloat",
        "",
        "Cached",
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
.field private final cache:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lcom/pymcl/runtime/settings/SettingsClient$Cached;",
            ">;"
        }
    .end annotation
.end field

.field private final fallback:Lcom/pymcl/runtime/settings/RawStore;

.field private final generation:Ljava/util/concurrent/atomic/AtomicLong;

.field private final listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field

.field private volatile remoteOk:Z

.field private final transport:Lcom/pymcl/runtime/settings/SettingsTransport;


# direct methods
.method public static synthetic $r8$lambda$mEkrTAJbJ0kPAoitpyXBFPrCBJ0(Lcom/pymcl/runtime/settings/SettingsClient;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->addListener$lambda$0(Lcom/pymcl/runtime/settings/SettingsClient;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public constructor <init>(Lcom/pymcl/runtime/settings/SettingsTransport;Lcom/pymcl/runtime/settings/RawStore;)V
    .locals 1
    .param p1, "transport"    # Lcom/pymcl/runtime/settings/SettingsTransport;
    .param p2, "fallback"    # Lcom/pymcl/runtime/settings/RawStore;

    const-string v0, "fallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/settings/SettingsClient;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    iput-object p2, p0, Lcom/pymcl/runtime/settings/SettingsClient;->fallback:Lcom/pymcl/runtime/settings/RawStore;

    .line 138
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    .line 140
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    .line 141
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 144
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->remoteOk:Z

    .line 136
    return-void
.end method

.method private static final addListener$lambda$0(Lcom/pymcl/runtime/settings/SettingsClient;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1
    .param p0, "this$0"    # Lcom/pymcl/runtime/settings/SettingsClient;
    .param p1, "$l"    # Lkotlin/jvm/functions/Function1;

    .line 193
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final fire(Ljava/lang/String;)V
    .locals 4
    .param p1, "key"    # Ljava/lang/String;

    .line 195
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function1;

    .local v1, "l":Lkotlin/jvm/functions/Function1;
    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/runtime/settings/SettingsClient;

    .line 207
    .local v2, "$this$fire_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsClient;
    const/4 v3, 0x0

    .line 195
    .local v3, "$i$a$-runCatching-SettingsClient$fire$1":I
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .end local v2    # "$this$fire_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsClient;
    .end local v3    # "$i$a$-runCatching-SettingsClient$fire$1":I
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .end local v1    # "l":Lkotlin/jvm/functions/Function1;
    goto :goto_0

    :cond_0
    return-void
.end method

.method private final remote(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;
    .locals 2
    .param p1, "method"    # Ljava/lang/String;
    .param p2, "arg"    # Ljava/lang/String;
    .param p3, "extras"    # Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 147
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    :goto_0
    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->transport:Lcom/pymcl/runtime/settings/SettingsTransport;

    invoke-interface {v0, p1, p2, p3}, Lcom/pymcl/runtime/settings/SettingsTransport;->call(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    .local v0, "<unused var>":Ljava/lang/Throwable;
    goto :goto_0

    .line 148
    .end local v0    # "<unused var>":Ljava/lang/Throwable;
    .local v1, "r":Ljava/util/Map;
    :goto_1
    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_2
    iput-boolean v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->remoteOk:Z

    .line 149
    return-object v1
.end method

.method static synthetic remote$default(Lcom/pymcl/runtime/settings/SettingsClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/Map;
    .locals 0

    .line 146
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p3

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/runtime/settings/SettingsClient;->remote(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
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

    .line 193
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->listeners:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/pymcl/runtime/settings/SettingsClient$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/runtime/settings/SettingsClient;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final getBoolean(Ljava/lang/String;Z)Z
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # Z

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    return v0
.end method

.method public final getFloat(Ljava/lang/String;F)F
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # F

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 204
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Float;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    return v0
.end method

.method public final getInt(Ljava/lang/String;I)I
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # I

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    return v0
.end method

.method public final getLong(Ljava/lang/String;J)J
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # J

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Long;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Long;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    goto :goto_1

    :cond_1
    move-wide v0, p2

    :goto_1
    return-wide v0
.end method

.method public final getRemoteOk()Z
    .locals 1

    .line 144
    iget-boolean v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->remoteOk:Z

    return v0
.end method

.method public final getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "def"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 201
    invoke-virtual {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    move-object v0, p2

    :cond_1
    return-object v0
.end method

.method public final isCached(Ljava/lang/String;)Z
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final onRemoteChanged(Ljava/lang/String;)V
    .locals 1
    .param p1, "key"    # Ljava/lang/String;

    .line 188
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 189
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    :goto_0
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->fire(Ljava/lang/String;)V

    .line 191
    return-void
.end method

.method public final preload()Z
    .locals 13

    .line 176
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    .line 177
    .local v0, "gen":J
    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v3, "getAll"

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lcom/pymcl/runtime/settings/SettingsClient;->remote$default(Lcom/pymcl/runtime/settings/SettingsClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    .line 178
    .local v3, "r":Ljava/util/Map;
    :cond_0
    iget-object v5, v2, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    cmp-long v5, v5, v0

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    return v6

    .line 179
    :cond_1
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .local v8, "k":Ljava/lang/String;
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .local v7, "enc":Ljava/lang/String;
    const/4 v9, 0x2

    const/4 v10, 0x0

    const-string v11, "k:"

    invoke-static {v8, v11, v4, v9, v10}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 180
    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v8, v11}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v9

    .line 181
    .local v9, "key":Ljava/lang/String;
    iget-object v10, v2, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v11, Lcom/pymcl/runtime/settings/SettingsClient$Cached;

    sget-object v12, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    invoke-virtual {v12, v7}, Lcom/pymcl/runtime/settings/PrefCodec;->decode(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v12

    invoke-direct {v11, v12}, Lcom/pymcl/runtime/settings/SettingsClient$Cached;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v9, v11}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 183
    .end local v7    # "enc":Ljava/lang/String;
    .end local v8    # "k":Ljava/lang/String;
    .end local v9    # "key":Ljava/lang/String;
    :cond_3
    return v6
.end method

.method public final read(Ljava/lang/String;)Ljava/lang/Object;
    .locals 9
    .param p1, "key"    # Ljava/lang/String;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/runtime/settings/SettingsClient$Cached;

    if-eqz v0, :cond_0

    .line 207
    .local v0, "it":Lcom/pymcl/runtime/settings/SettingsClient$Cached;
    const/4 v1, 0x0

    .line 153
    .local v1, "$i$a$-let-SettingsClient$read$1":I
    invoke-virtual {v0}, Lcom/pymcl/runtime/settings/SettingsClient$Cached;->getValue()Ljava/lang/Object;

    move-result-object v2

    return-object v2

    .line 154
    .end local v0    # "it":Lcom/pymcl/runtime/settings/SettingsClient$Cached;
    .end local v1    # "$i$a$-let-SettingsClient$read$1":I
    :cond_0
    iget-object v0, p0, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    .line 155
    .local v1, "gen":J
    const/4 v7, 0x4

    const/4 v8, 0x0

    const-string v4, "get"

    const/4 v6, 0x0

    move-object v3, p0

    move-object v5, p1

    .end local p1    # "key":Ljava/lang/String;
    .local v5, "key":Ljava/lang/String;
    invoke-static/range {v3 .. v8}, Lcom/pymcl/runtime/settings/SettingsClient;->remote$default(Lcom/pymcl/runtime/settings/SettingsClient;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Ljava/util/Map;

    move-result-object p1

    const/4 v4, 0x0

    if-nez p1, :cond_2

    :try_start_0
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object p1, v3

    check-cast p1, Lcom/pymcl/runtime/settings/SettingsClient;

    .line 207
    .local p1, "$this$read_u24lambda_u241":Lcom/pymcl/runtime/settings/SettingsClient;
    const/4 v0, 0x0

    .line 155
    .local v0, "$i$a$-runCatching-SettingsClient$read$r$1":I
    iget-object v6, p1, Lcom/pymcl/runtime/settings/SettingsClient;->fallback:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v6, v5}, Lcom/pymcl/runtime/settings/RawStore;->read(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .end local v0    # "$i$a$-runCatching-SettingsClient$read$r$1":I
    .end local p1    # "$this$read_u24lambda_u241":Lcom/pymcl/runtime/settings/SettingsClient;
    invoke-static {v6}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, p1

    :goto_1
    return-object v4

    .line 156
    .local p1, "r":Ljava/util/Map;
    :cond_2
    const-string v0, "exists"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "1"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    const-string v4, "v"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v0, v4}, Lcom/pymcl/runtime/settings/PrefCodec;->decode(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 157
    .local v4, "v":Ljava/lang/Object;
    :cond_3
    iget-object v0, v3, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v6

    cmp-long v0, v6, v1

    if-nez v0, :cond_4

    iget-object v0, v3, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v0, Ljava/util/Map;

    new-instance v6, Lcom/pymcl/runtime/settings/SettingsClient$Cached;

    invoke-direct {v6, v4}, Lcom/pymcl/runtime/settings/SettingsClient$Cached;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    :cond_4
    return-object v4
.end method

.method public final write(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 7
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/Object;

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    sget-object v0, Lcom/pymcl/runtime/settings/PrefCodec;->INSTANCE:Lcom/pymcl/runtime/settings/PrefCodec;

    invoke-virtual {v0, p2}, Lcom/pymcl/runtime/settings/PrefCodec;->encode(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 164
    .local v0, "enc":Ljava/lang/String;
    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "v"

    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 165
    .local v1, "extras":Ljava/util/Map;
    :goto_0
    const-string v2, "put"

    invoke-direct {p0, v2, p1, v1}, Lcom/pymcl/runtime/settings/SettingsClient;->remote(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 166
    .local v2, "r":Ljava/util/Map;
    if-eqz v2, :cond_1

    const-string v3, "ok"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "1"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 167
    .local v3, "viaProvider":Z
    :goto_1
    iget-object v4, p0, Lcom/pymcl/runtime/settings/SettingsClient;->generation:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 168
    if-eqz v3, :cond_2

    iget-object v4, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    check-cast v4, Ljava/util/Map;

    new-instance v5, Lcom/pymcl/runtime/settings/SettingsClient$Cached;

    invoke-direct {v5, p2}, Lcom/pymcl/runtime/settings/SettingsClient$Cached;-><init>(Ljava/lang/Object;)V

    invoke-interface {v4, p1, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 169
    :cond_2
    iget-object v4, p0, Lcom/pymcl/runtime/settings/SettingsClient;->cache:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v4, p0

    check-cast v4, Lcom/pymcl/runtime/settings/SettingsClient;

    .line 207
    .local v4, "$this$write_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsClient;
    const/4 v5, 0x0

    .line 169
    .local v5, "$i$a$-runCatching-SettingsClient$write$1":I
    iget-object v6, v4, Lcom/pymcl/runtime/settings/SettingsClient;->fallback:Lcom/pymcl/runtime/settings/RawStore;

    invoke-interface {v6, p1, p2}, Lcom/pymcl/runtime/settings/RawStore;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .end local v4    # "$this$write_u24lambda_u240":Lcom/pymcl/runtime/settings/SettingsClient;
    .end local v5    # "$i$a$-runCatching-SettingsClient$write$1":I
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v4

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v4}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_2
    invoke-static {v4}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 170
    :goto_3
    invoke-direct {p0, p1}, Lcom/pymcl/runtime/settings/SettingsClient;->fire(Ljava/lang/String;)V

    .line 171
    return v3
.end method
