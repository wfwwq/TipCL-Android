.class public final Lcom/pymcl/core/launch/LaunchOptions;
.super Ljava/lang/Object;
.source "LaunchArgs.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u00089\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u00d3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a\u0012\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0007H\u00c6\u0003J\t\u0010=\u001a\u00020\tH\u00c6\u0003J\t\u0010>\u001a\u00020\tH\u00c6\u0003J\t\u0010?\u001a\u00020\tH\u00c6\u0003J\t\u0010@\u001a\u00020\rH\u00c6\u0003J\t\u0010A\u001a\u00020\u000fH\u00c6\u0003J\t\u0010B\u001a\u00020\u000fH\u00c6\u0003J\t\u0010C\u001a\u00020\u000fH\u00c6\u0003J\t\u0010D\u001a\u00020\u000fH\u00c6\u0003J\t\u0010E\u001a\u00020\u000fH\u00c6\u0003J\t\u0010F\u001a\u00020\u000fH\u00c6\u0003J\t\u0010G\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\t\u0010K\u001a\u00020\u001aH\u00c6\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u00db\u0001\u0010N\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001J\u0014\u0010O\u001a\u00020\r2\u0008\u0010P\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010Q\u001a\u00020\tH\u00d6\u0081\u0004J\n\u0010R\u001a\u00020\u000fH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010&R\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010&R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010,R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010,R\u0011\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010,R\u0011\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010,R\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010,R\u0011\u0010\u0015\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010,R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010\"R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010,R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010,R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010,\u00a8\u0006S"
    }
    d2 = {
        "Lcom/pymcl/core/launch/LaunchOptions;",
        "",
        "account",
        "Lcom/pymcl/core/account/Account;",
        "gameDir",
        "Ljava/io/File;",
        "dirs",
        "Lcom/pymcl/core/version/GameDirs;",
        "memoryMb",
        "",
        "width",
        "height",
        "fullscreen",
        "",
        "defaultJvmArgs",
        "",
        "versionJvmArgs",
        "versionGameArgs",
        "server",
        "port",
        "gc",
        "clientId",
        "authlibJar",
        "nide8Jar",
        "authlibPrefetched",
        "env",
        "Lcom/pymcl/core/version/RuleEnv;",
        "offlineSkinApi",
        "offlineSkinPrefetched",
        "<init>",
        "(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V",
        "getAccount",
        "()Lcom/pymcl/core/account/Account;",
        "getGameDir",
        "()Ljava/io/File;",
        "getDirs",
        "()Lcom/pymcl/core/version/GameDirs;",
        "getMemoryMb",
        "()I",
        "getWidth",
        "getHeight",
        "getFullscreen",
        "()Z",
        "getDefaultJvmArgs",
        "()Ljava/lang/String;",
        "getVersionJvmArgs",
        "getVersionGameArgs",
        "getServer",
        "getPort",
        "getGc",
        "getClientId",
        "getAuthlibJar",
        "getNide8Jar",
        "getAuthlibPrefetched",
        "getEnv",
        "()Lcom/pymcl/core/version/RuleEnv;",
        "getOfflineSkinApi",
        "getOfflineSkinPrefetched",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final account:Lcom/pymcl/core/account/Account;

.field private final authlibJar:Ljava/io/File;

.field private final authlibPrefetched:Ljava/lang/String;

.field private final clientId:Ljava/lang/String;

.field private final defaultJvmArgs:Ljava/lang/String;

.field private final dirs:Lcom/pymcl/core/version/GameDirs;

.field private final env:Lcom/pymcl/core/version/RuleEnv;

.field private final fullscreen:Z

.field private final gameDir:Ljava/io/File;

.field private final gc:Ljava/lang/String;

.field private final height:I

.field private final memoryMb:I

.field private final nide8Jar:Ljava/io/File;

.field private final offlineSkinApi:Ljava/lang/String;

.field private final offlineSkinPrefetched:Ljava/lang/String;

.field private final port:Ljava/lang/String;

.field private final server:Ljava/lang/String;

.field private final versionGameArgs:Ljava/lang/String;

.field private final versionJvmArgs:Ljava/lang/String;

.field private final width:I


# direct methods
.method public constructor <init>(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16
    .param p1, "account"    # Lcom/pymcl/core/account/Account;
    .param p2, "gameDir"    # Ljava/io/File;
    .param p3, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p4, "memoryMb"    # I
    .param p5, "width"    # I
    .param p6, "height"    # I
    .param p7, "fullscreen"    # Z
    .param p8, "defaultJvmArgs"    # Ljava/lang/String;
    .param p9, "versionJvmArgs"    # Ljava/lang/String;
    .param p10, "versionGameArgs"    # Ljava/lang/String;
    .param p11, "server"    # Ljava/lang/String;
    .param p12, "port"    # Ljava/lang/String;
    .param p13, "gc"    # Ljava/lang/String;
    .param p14, "clientId"    # Ljava/lang/String;
    .param p15, "authlibJar"    # Ljava/io/File;
    .param p16, "nide8Jar"    # Ljava/io/File;
    .param p17, "authlibPrefetched"    # Ljava/lang/String;
    .param p18, "env"    # Lcom/pymcl/core/version/RuleEnv;
    .param p19, "offlineSkinApi"    # Ljava/lang/String;
    .param p20, "offlineSkinPrefetched"    # Ljava/lang/String;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    move-object/from16 v8, p12

    move-object/from16 v9, p13

    move-object/from16 v10, p14

    move-object/from16 v11, p18

    const-string v12, "account"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "gameDir"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "dirs"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "defaultJvmArgs"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "versionJvmArgs"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "versionGameArgs"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "server"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "port"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "gc"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "clientId"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "env"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    iput-object v2, v0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    iput-object v3, v0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    move/from16 v12, p4

    iput v12, v0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    move/from16 v13, p5

    iput v13, v0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    move/from16 v14, p6

    iput v14, v0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    .line 17
    move/from16 v15, p7

    iput-boolean v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    iput-object v4, v0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    iput-object v5, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    iput-object v6, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    .line 18
    iput-object v7, v0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    iput-object v8, v0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    iput-object v9, v0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    iput-object v10, v0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    .line 19
    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    iput-object v11, v0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    .line 21
    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    move-object/from16 v1, p20

    iput-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 23

    .line 15
    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 16
    const/16 v1, 0x1000

    move v6, v1

    goto :goto_0

    .line 15
    :cond_0
    move/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    .line 16
    const/16 v1, 0x356

    move v7, v1

    goto :goto_1

    .line 15
    :cond_1
    move/from16 v7, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    .line 16
    const/16 v1, 0x1e0

    move v8, v1

    goto :goto_2

    .line 15
    :cond_2
    move/from16 v8, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    .line 17
    const/4 v1, 0x0

    move v9, v1

    goto :goto_3

    .line 15
    :cond_3
    move/from16 v9, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    const-string v2, ""

    if-eqz v1, :cond_4

    .line 17
    move-object v10, v2

    goto :goto_4

    .line 15
    :cond_4
    move-object/from16 v10, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    .line 17
    move-object v11, v2

    goto :goto_5

    .line 15
    :cond_5
    move-object/from16 v11, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    .line 17
    move-object v12, v2

    goto :goto_6

    .line 15
    :cond_6
    move-object/from16 v12, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    .line 18
    move-object v13, v2

    goto :goto_7

    .line 15
    :cond_7
    move-object/from16 v13, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    .line 18
    move-object v14, v2

    goto :goto_8

    .line 15
    :cond_8
    move-object/from16 v14, p12

    :goto_8
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_9

    .line 18
    const-string v1, "auto"

    move-object v15, v1

    goto :goto_9

    .line 15
    :cond_9
    move-object/from16 v15, p13

    :goto_9
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_a

    .line 18
    const-string v1, "00000000402b5328"

    move-object/from16 v16, v1

    goto :goto_a

    .line 15
    :cond_a
    move-object/from16 v16, p14

    :goto_a
    and-int/lit16 v1, v0, 0x4000

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    .line 19
    move-object/from16 v17, v2

    goto :goto_b

    .line 15
    :cond_b
    move-object/from16 v17, p15

    :goto_b
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    .line 19
    move-object/from16 v18, v2

    goto :goto_c

    .line 15
    :cond_c
    move-object/from16 v18, p16

    :goto_c
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    .line 19
    move-object/from16 v19, v2

    goto :goto_d

    .line 15
    :cond_d
    move-object/from16 v19, p17

    :goto_d
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    .line 19
    new-instance v1, Lcom/pymcl/core/version/RuleEnv;

    const/16 v3, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 p4, v1

    move/from16 p9, v3

    move-object/from16 p10, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v20

    move-object/from16 p7, v21

    move-object/from16 p8, v22

    invoke-direct/range {p4 .. p10}, Lcom/pymcl/core/version/RuleEnv;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v1

    goto :goto_e

    .line 15
    :cond_e
    move-object/from16 v20, p18

    :goto_e
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    .line 21
    move-object/from16 v21, v2

    goto :goto_f

    .line 15
    :cond_f
    move-object/from16 v21, p19

    :goto_f
    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_10

    .line 21
    move-object/from16 v22, v2

    goto :goto_10

    .line 15
    :cond_10
    move-object/from16 v22, p20

    :goto_10
    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v2 .. v22}, Lcom/pymcl/core/launch/LaunchOptions;-><init>(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    return-void
.end method

.method public static synthetic copy$default(Lcom/pymcl/core/launch/LaunchOptions;Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/core/launch/LaunchOptions;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget v5, v0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget v6, v0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-boolean v8, v0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p3, v1

    if-eqz v16, :cond_11

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    goto :goto_13

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    :goto_13
    move-object/from16 p17, p2

    move-object/from16 p18, p3

    move-object/from16 p19, p4

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move/from16 p5, v5

    move/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p21}, Lcom/pymcl/core/launch/LaunchOptions;->copy(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/launch/LaunchOptions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Lcom/pymcl/core/account/Account;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    return-object v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    return-object v0
.end method

.method public final component16()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    return-object v0
.end method

.method public final component17()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    return-object v0
.end method

.method public final component18()Lcom/pymcl/core/version/RuleEnv;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    return-object v0
.end method

.method public final component19()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    return-object v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/pymcl/core/version/GameDirs;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    return v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/launch/LaunchOptions;
    .locals 22

    const-string v0, "account"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gameDir"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dirs"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultJvmArgs"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionJvmArgs"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionGameArgs"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "server"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "port"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gc"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientId"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "env"

    move-object/from16 v1, p18

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/pymcl/core/launch/LaunchOptions;

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/pymcl/core/launch/LaunchOptions;-><init>(Lcom/pymcl/core/account/Account;Ljava/io/File;Lcom/pymcl/core/version/GameDirs;IIIZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/lang/String;Lcom/pymcl/core/version/RuleEnv;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/pymcl/core/launch/LaunchOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    move-object v1, p1

    check-cast v1, Lcom/pymcl/core/launch/LaunchOptions;

    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    return v2

    :cond_3
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    return v2

    :cond_4
    iget v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    iget v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    if-eq v3, v4, :cond_5

    return v2

    :cond_5
    iget v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    iget v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    if-eq v3, v4, :cond_6

    return v2

    :cond_6
    iget v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    iget v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    if-eq v3, v4, :cond_7

    return v2

    :cond_7
    iget-boolean v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    iget-boolean v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    if-eq v3, v4, :cond_8

    return v2

    :cond_8
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    return v2

    :cond_9
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    return v2

    :cond_a
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    return v2

    :cond_b
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    return v2

    :cond_c
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    return v2

    :cond_d
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    return v2

    :cond_e
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    return v2

    :cond_f
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    return v2

    :cond_10
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    return v2

    :cond_11
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    return v2

    :cond_12
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    return v2

    :cond_13
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    iget-object v4, v1, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    return v2

    :cond_14
    iget-object v3, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    iget-object v1, v1, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getAccount()Lcom/pymcl/core/account/Account;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    return-object v0
.end method

.method public final getAuthlibJar()Ljava/io/File;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    return-object v0
.end method

.method public final getAuthlibPrefetched()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    return-object v0
.end method

.method public final getClientId()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDefaultJvmArgs()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final getDirs()Lcom/pymcl/core/version/GameDirs;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    return-object v0
.end method

.method public final getEnv()Lcom/pymcl/core/version/RuleEnv;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    return-object v0
.end method

.method public final getFullscreen()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    return v0
.end method

.method public final getGameDir()Ljava/io/File;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    return-object v0
.end method

.method public final getGc()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    return v0
.end method

.method public final getMemoryMb()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    return v0
.end method

.method public final getNide8Jar()Ljava/io/File;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    return-object v0
.end method

.method public final getOfflineSkinApi()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    return-object v0
.end method

.method public final getOfflineSkinPrefetched()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    return-object v0
.end method

.method public final getPort()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    return-object v0
.end method

.method public final getServer()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionGameArgs()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final getVersionJvmArgs()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    return-object v0
.end method

.method public final getWidth()I
    .locals 1

    .line 16
    iget v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    invoke-virtual {v0}, Lcom/pymcl/core/account/Account;->hashCode()I

    move-result v0

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    invoke-virtual {v2}, Lcom/pymcl/core/version/GameDirs;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    invoke-static {v2}, Ljava/lang/Integer;->hashCode(I)I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-boolean v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    invoke-virtual {v2}, Lcom/pymcl/core/version/RuleEnv;->hashCode()I

    move-result v2

    add-int/2addr v1, v2

    mul-int/lit8 v0, v1, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v1, v0, 0x1f

    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    iget-object v2, p0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v1, v3

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/core/launch/LaunchOptions;->account:Lcom/pymcl/core/account/Account;

    iget-object v2, v0, Lcom/pymcl/core/launch/LaunchOptions;->gameDir:Ljava/io/File;

    iget-object v3, v0, Lcom/pymcl/core/launch/LaunchOptions;->dirs:Lcom/pymcl/core/version/GameDirs;

    iget v4, v0, Lcom/pymcl/core/launch/LaunchOptions;->memoryMb:I

    iget v5, v0, Lcom/pymcl/core/launch/LaunchOptions;->width:I

    iget v6, v0, Lcom/pymcl/core/launch/LaunchOptions;->height:I

    iget-boolean v7, v0, Lcom/pymcl/core/launch/LaunchOptions;->fullscreen:Z

    iget-object v8, v0, Lcom/pymcl/core/launch/LaunchOptions;->defaultJvmArgs:Ljava/lang/String;

    iget-object v9, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionJvmArgs:Ljava/lang/String;

    iget-object v10, v0, Lcom/pymcl/core/launch/LaunchOptions;->versionGameArgs:Ljava/lang/String;

    iget-object v11, v0, Lcom/pymcl/core/launch/LaunchOptions;->server:Ljava/lang/String;

    iget-object v12, v0, Lcom/pymcl/core/launch/LaunchOptions;->port:Ljava/lang/String;

    iget-object v13, v0, Lcom/pymcl/core/launch/LaunchOptions;->gc:Ljava/lang/String;

    iget-object v14, v0, Lcom/pymcl/core/launch/LaunchOptions;->clientId:Ljava/lang/String;

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibJar:Ljava/io/File;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->nide8Jar:Ljava/io/File;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->authlibPrefetched:Ljava/lang/String;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->env:Lcom/pymcl/core/version/RuleEnv;

    move-object/from16 v19, v15

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinApi:Ljava/lang/String;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/pymcl/core/launch/LaunchOptions;->offlineSkinPrefetched:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v15

    const-string v15, "LaunchOptions(account="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gameDir="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dirs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", memoryMb="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fullscreen="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", defaultJvmArgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionJvmArgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", versionGameArgs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", server="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", port="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", clientId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authlibJar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", nide8Jar="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", authlibPrefetched="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", env="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offlineSkinApi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", offlineSkinPrefetched="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
