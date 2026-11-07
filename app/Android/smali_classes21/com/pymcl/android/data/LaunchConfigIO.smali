.class public final Lcom/pymcl/android/data/LaunchConfigIO;
.super Ljava/lang/Object;
.source "LaunchConfigIO.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/LaunchConfigIO$State;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchConfigIO.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchConfigIO.kt\ncom/pymcl/android/data/LaunchConfigIO\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,175:1\n1#2:176\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u001e\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ&\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016\u00ca\u0001\u000c\u0008\u0019\u0012\u0008\u0008\u001a\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/pymcl/android/data/LaunchConfigIO;",
        "",
        "<init>",
        "()V",
        "repo",
        "Lcom/pymcl/android/data/LauncherRepository;",
        "ctx",
        "Landroid/content/Context;",
        "existing",
        "Lcom/pymcl/core/instance/Instance;",
        "name",
        "",
        "load",
        "Lcom/pymcl/android/data/LaunchConfigIO$State;",
        "instance",
        "version",
        "saveDisplay",
        "",
        "d",
        "Lcom/pymcl/android/data/LaunchConfigLogic$Display;",
        "saveJava",
        "index",
        "",
        "State",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/pymcl/android/data/LaunchConfigIO;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/data/LaunchConfigIO;

    invoke-direct {v0}, Lcom/pymcl/android/data/LaunchConfigIO;-><init>()V

    sput-object v0, Lcom/pymcl/android/data/LaunchConfigIO;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigIO;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final existing(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 5
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "name"    # Ljava/lang/String;

    .line 138
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/LaunchConfigIO;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    .line 139
    .local v0, "r":Lcom/pymcl/android/data/LauncherRepository;
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/pymcl/android/data/LaunchConfigIO;

    .line 176
    .local v1, "$this$existing_u24lambda_u240\\1":Lcom/pymcl/android/data/LaunchConfigIO;
    const/4 v2, 0x0

    .line 139
    .local v2, "$i$a$-runCatching-LaunchConfigIO$existing$names$1\\1\\139\\0":I
    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/core/instance/InstanceManager;->list()Ljava/util/List;

    move-result-object v3

    .end local v1    # "$this$existing_u24lambda_u240\\1":Lcom/pymcl/android/data/LaunchConfigIO;
    .end local v2    # "$i$a$-runCatching-LaunchConfigIO$existing$names$1\\1\\139\\0":I
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v2

    :cond_0
    check-cast v1, Ljava/util/List;

    .line 140
    .local v1, "names":Ljava/util/List;
    move-object v2, p2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 176
    const/4 v2, 0x0

    .line 140
    .local v2, "$i$a$-ifBlank-LaunchConfigIO$existing$n$1\\2\\140\\0":I
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-nez v3, :cond_1

    return-object v4

    :cond_1
    move-object v2, v3

    .end local v2    # "$i$a$-ifBlank-LaunchConfigIO$existing$n$1\\2\\140\\0":I
    :cond_2
    check-cast v2, Ljava/lang/String;

    .line 141
    .local v2, "n":Ljava/lang/String;
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v4

    :cond_3
    return-object v4
.end method

.method private final repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 1
    .param p1, "ctx"    # Landroid/content/Context;

    .line 134
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final load(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/android/data/LaunchConfigIO$State;
    .locals 8
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/LaunchConfigIO;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    .local v0, "r":Lcom/pymcl/android/data/LauncherRepository;
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/LaunchConfigIO;->existing(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v1

    .line 146
    .local v1, "inst":Lcom/pymcl/core/instance/Instance;
    new-instance v2, Lcom/pymcl/android/data/LaunchConfigIO$State;

    sget-object v3, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v4

    invoke-virtual {v3, v4, v1, p3}, Lcom/pymcl/android/data/LaunchConfigLogic;->loadDisplay(Lcom/pymcl/core/config/ConfigStore;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    move-result-object v3

    .line 147
    sget-object v4, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/pymcl/core/instance/Instance;->meta()Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_0

    const-string v7, "java"

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_0
    move-object v6, v5

    :goto_0
    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_1

    move-object v5, v6

    check-cast v5, Ljava/lang/String;

    :cond_1
    invoke-virtual {v4, v5}, Lcom/pymcl/android/data/LaunchConfigLogic;->javaIndex(Ljava/lang/String;)I

    move-result v4

    .line 148
    sget-object v5, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    sget-object v6, Lcom/pymcl/android/data/SettingsExtrasIO;->INSTANCE:Lcom/pymcl/android/data/SettingsExtrasIO;

    invoke-virtual {v6, p1}, Lcom/pymcl/android/data/SettingsExtrasIO;->totalMemMb(Landroid/content/Context;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/pymcl/android/data/LaunchConfigLogic;->memMax(J)I

    move-result v5

    .line 146
    invoke-direct {v2, v3, v4, v5}, Lcom/pymcl/android/data/LaunchConfigIO$State;-><init>(Lcom/pymcl/android/data/LaunchConfigLogic$Display;II)V

    return-object v2
.end method

.method public final saveDisplay(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/LaunchConfigLogic$Display;)V
    .locals 3
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "d"    # Lcom/pymcl/android/data/LaunchConfigLogic$Display;

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "d"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    sget-object v0, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-direct {p0, p1}, Lcom/pymcl/android/data/LaunchConfigIO;->repo(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/LaunchConfigIO;->existing(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p3, p4}, Lcom/pymcl/android/data/LaunchConfigLogic;->saveDisplay(Lcom/pymcl/core/config/ConfigStore;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Lcom/pymcl/android/data/LaunchConfigLogic$Display;)V

    return-void
.end method

.method public final saveJava(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3
    .param p1, "ctx"    # Landroid/content/Context;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "index"    # I

    const-string v0, "ctx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instance"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/LaunchConfigIO;->existing(Landroid/content/Context;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 176
    .local v0, "it\\1":Lcom/pymcl/core/instance/Instance;
    const/4 v1, 0x0

    .line 154
    .local v1, "$i$a$-let-LaunchConfigIO$saveJava$1\\1\\154\\0":I
    sget-object v2, Lcom/pymcl/android/data/LaunchConfigLogic;->INSTANCE:Lcom/pymcl/android/data/LaunchConfigLogic;

    invoke-virtual {v2, v0, p3}, Lcom/pymcl/android/data/LaunchConfigLogic;->saveJava(Lcom/pymcl/core/instance/Instance;I)V

    .end local v0    # "it\\1":Lcom/pymcl/core/instance/Instance;
    .end local v1    # "$i$a$-let-LaunchConfigIO$saveJava$1\\1\\154\\0":I
    :cond_0
    return-void
.end method
