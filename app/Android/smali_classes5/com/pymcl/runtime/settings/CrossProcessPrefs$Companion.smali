.class public final Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;
.super Ljava/lang/Object;
.source "CrossProcessPrefs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/runtime/settings/CrossProcessPrefs;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCrossProcessPrefs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossProcessPrefs.kt\ncom/pymcl/runtime/settings/CrossProcessPrefs$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007b\u0002\u0008\u000bJ\u001c\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007b\u0002\u0008\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "instance",
        "Lcom/pymcl/runtime/settings/CrossProcessPrefs;",
        "get",
        "ctx",
        "Landroid/content/Context;",
        "Lkotlin/jvm/JvmStatic;",
        "keyUri",
        "Landroid/net/Uri;",
        "applicationId",
        "key",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Landroid/content/Context;)Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    invoke-static {}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->access$getInstance$cp()Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v0

    if-nez v0, :cond_1

    monitor-enter p0

    .line 71
    const/4 v0, 0x0

    .line 62
    .local v0, "$i$a$-synchronized-CrossProcessPrefs$Companion$get$1":I
    :try_start_0
    invoke-static {}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->access$getInstance$cp()Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;-><init>(Landroid/content/Context;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v1

    .line 71
    .local v2, "it":Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    const/4 v3, 0x0

    .line 62
    .local v3, "$i$a$-also-CrossProcessPrefs$Companion$get$1$1":I
    sget-object v4, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->Companion:Lcom/pymcl/runtime/settings/CrossProcessPrefs$Companion;

    invoke-static {v2}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->access$setInstance$cp(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .end local v0    # "$i$a$-synchronized-CrossProcessPrefs$Companion$get$1":I
    .end local v2    # "it":Lcom/pymcl/runtime/settings/CrossProcessPrefs;
    .end local v3    # "$i$a$-also-CrossProcessPrefs$Companion$get$1$1":I
    :cond_0
    monitor-exit p0

    move-object v0, v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method

.method public final keyUri(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2
    .param p1, "applicationId"    # Ljava/lang/String;
    .param p2, "key"    # Ljava/lang/String;
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "applicationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "content"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    sget-object v1, Lcom/pymcl/runtime/settings/SettingsProtocol;->INSTANCE:Lcom/pymcl/runtime/settings/SettingsProtocol;

    invoke-virtual {v1, p1}, Lcom/pymcl/runtime/settings/SettingsProtocol;->authority(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    .line 67
    const-string v1, "prefs"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
