.class public final Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;
.super Landroid/database/ContentObserver;
.source "CrossProcessPrefs.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/pymcl/runtime/settings/CrossProcessPrefs;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/pymcl/runtime/settings/CrossProcessPrefs$observer$1",
        "Landroid/database/ContentObserver;",
        "onChange",
        "",
        "selfChange",
        "",
        "uri",
        "Landroid/net/Uri;",
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
.field final synthetic this$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;


# direct methods
.method constructor <init>(Lcom/pymcl/runtime/settings/CrossProcessPrefs;)V
    .locals 1
    .param p1, "$receiver"    # Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    iput-object p1, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;->this$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    .line 33
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public onChange(Z)V
    .locals 2
    .param p1, "selfChange"    # Z

    .line 34
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;->this$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->getClient()Lcom/pymcl/runtime/settings/SettingsClient;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/settings/SettingsClient;->onRemoteChanged(Ljava/lang/String;)V

    return-void
.end method

.method public onChange(ZLandroid/net/Uri;)V
    .locals 3
    .param p1, "selfChange"    # Z
    .param p2, "uri"    # Landroid/net/Uri;

    .line 35
    iget-object v0, p0, Lcom/pymcl/runtime/settings/CrossProcessPrefs$observer$1;->this$0:Lcom/pymcl/runtime/settings/CrossProcessPrefs;

    invoke-virtual {v0}, Lcom/pymcl/runtime/settings/CrossProcessPrefs;->getClient()Lcom/pymcl/runtime/settings/SettingsClient;

    move-result-object v0

    sget-object v1, Lcom/pymcl/runtime/settings/SettingsProtocol;->INSTANCE:Lcom/pymcl/runtime/settings/SettingsProtocol;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Lcom/pymcl/runtime/settings/SettingsProtocol;->keyFromSegments(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/runtime/settings/SettingsClient;->onRemoteChanged(Ljava/lang/String;)V

    return-void
.end method
