.class public final Lcom/pymcl/android/ui/state/AppStateKt;
.super Ljava/lang/Object;
.source "AppState.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "sampleCrash",
        "Lcom/pymcl/android/ui/state/CrashInfo;",
        "PyMCL-Android:app_debug"
    }
    k = 0x2
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final sampleCrash()Lcom/pymcl/android/ui/state/CrashInfo;
    .locals 12

    .line 335
    new-instance v0, Lcom/pymcl/android/ui/state/CrashInfo;

    .line 336
    nop

    .line 337
    nop

    .line 338
    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "\u5b89\u88c5\u7f3a\u5931\u7684\u4f9d\u8d56"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "\u7981\u7528\u51b2\u7a81\u6a21\u7ec4"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 339
    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[main/ERROR]: Incompatible mods found!"

    aput-object v3, v2, v4

    const-string v3, "net.fabricmc.loader.impl.FormattedException: Mod resolution encountered an incompatible mod set!"

    aput-object v3, v2, v5

    const-string v3, "A potential solution has been determined:"

    aput-object v3, v2, v1

    const/4 v1, 0x3

    const-string v3, "\t - Install fabric-api, version 0.100.0 or later."

    aput-object v3, v2, v1

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 335
    const/16 v10, 0x180

    const/4 v11, 0x0

    const-string v1, "\u9ed8\u8ba4"

    const-string v2, "1.21.1-Fabric 0.16.5"

    const/4 v3, -0x1

    const-string v4, "\u6a21\u7ec4\u7f3a\u5c11\u4f9d\u8d56"

    const-string v5, "Sodium 0.6.13 \u9700\u8981 Fabric API \u2265 0.100\uff0c\u4f46\u5b9e\u4f8b\u91cc\u6ca1\u6709\u627e\u5230\u3002\u88c5\u4e0a\u4f9d\u8d56\u540e\u518d\u542f\u52a8\u3002"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/pymcl/android/ui/state/CrashInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 340
    return-object v0
.end method
