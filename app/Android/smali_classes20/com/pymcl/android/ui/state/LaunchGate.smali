.class public final Lcom/pymcl/android/ui/state/LaunchGate;
.super Ljava/lang/Object;
.source "LaunchGate.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/state/LaunchGate$Action;,
        Lcom/pymcl/android/ui/state/LaunchGate$Blocked;,
        Lcom/pymcl/android/ui/state/LaunchGate$Input;,
        Lcom/pymcl/android/ui/state/LaunchGate$Reason;,
        Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLaunchGate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LaunchGate.kt\ncom/pymcl/android/ui/state/LaunchGate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,81:1\n1#2:82\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0005\u000e\u000f\u0010\u0011\u0012B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0008\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u000c\u00ca\u0001\u000c\u0008\u0014\u0012\u0008\u0008\u0015\u0012\u0004\u0008\u0003\u0010\u0002\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/LaunchGate;",
        "",
        "<init>",
        "()V",
        "resolveVersion",
        "",
        "versions",
        "",
        "selected",
        "check",
        "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
        "i",
        "Lcom/pymcl/android/ui/state/LaunchGate$Input;",
        "require",
        "Reason",
        "Action",
        "Input",
        "Verdict",
        "Blocked",
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

.field public static final INSTANCE:Lcom/pymcl/android/ui/state/LaunchGate;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/android/ui/state/LaunchGate;

    invoke-direct {v0}, Lcom/pymcl/android/ui/state/LaunchGate;-><init>()V

    sput-object v0, Lcom/pymcl/android/ui/state/LaunchGate;->INSTANCE:Lcom/pymcl/android/ui/state/LaunchGate;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final check(Lcom/pymcl/android/ui/state/LaunchGate$Input;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    .locals 12
    .param p1, "i"    # Lcom/pymcl/android/ui/state/LaunchGate$Input;

    const-string v0, "i"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getGameRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Running:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->Stop:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const-string v3, "\u505c\u6b62"

    const/4 v4, 0x1

    const-string v6, "\u6e38\u620f\u8fd0\u884c\u4e2d"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 62
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getLoading()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Loading:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->None:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u542f\u52a8\u6e38\u620f"

    const/4 v4, 0x0

    const-string v6, "\u6b63\u5728\u8bfb\u53d6\u2026"

    const-string v7, "\u6b63\u5728\u8bfb\u53d6\u5b9e\u4f8b\u4e0e\u8d26\u53f7\uff0c\u8bf7\u7a0d\u5019"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 63
    :cond_1
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getLaunching()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Launching:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->None:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u6b63\u5728\u542f\u52a8\u6e38\u620f"

    const/4 v4, 0x0

    const-string v6, "\u6b63\u5728\u542f\u52a8\u6e38\u620f"

    const-string v7, "\u6b63\u5728\u542f\u52a8\u6e38\u620f\uff0c\u8bf7\u7a0d\u5019"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 64
    :cond_2
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getInstalling()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Installing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->None:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u5904\u7406\u4e2d\u2026"

    const/4 v4, 0x0

    const-string v6, "\u6b63\u5728\u5b89\u88c5"

    const-string v7, "\u8fd9\u4e2a\u5b9e\u4f8b\u6b63\u5728\u5b89\u88c5\u7248\u672c\uff0c\u88c5\u5b8c\u518d\u542f\u52a8"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 65
    :cond_3
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getInstances()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoInstance:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->OpenInstances:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u65b0\u5efa\u5b9e\u4f8b"

    const/4 v4, 0x1

    const-string v6, "\u8fd8\u6ca1\u6709\u5b9e\u4f8b"

    const-string v7, "\u5148\u5230\u300c\u5b9e\u4f8b\u300d\u9875\u65b0\u5efa\u4e00\u4e2a"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 66
    :cond_4
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getSelectedInstance()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getInstances()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getSelectedInstance()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 67
    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->InstanceMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->OpenInstances:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getSelectedInstance()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "\u300c{0}\u300d\u5df2\u88ab\u5220\u9664\u6216\u6539\u540d\uff0c\u8bf7\u91cd\u65b0\u9009\u62e9\u5b9e\u4f8b"

    invoke-static {v3, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u9009\u62e9\u5b9e\u4f8b"

    const/4 v4, 0x1

    const-string v6, "\u5b9e\u4f8b\u4e0d\u5b58\u5728"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 68
    :cond_5
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getVersions()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoVersion:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->DownloadGame:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u4e0b\u8f7d\u6e38\u620f"

    const/4 v4, 0x1

    const-string v6, "\u8fd8\u6ca1\u6709\u53ef\u542f\u52a8\u7684\u7248\u672c \u00b7 \u53bb\u4e0b\u8f7d\u9875\u5b89\u88c5"

    const-string v7, "\u8fd9\u4e2a\u5b9e\u4f8b\u8fd8\u6ca1\u6709\u7248\u672c\uff0c\u5148\u53bb\u300c\u539f\u7248\u6e38\u620f\u300d\u88c5\u4e00\u4e2a"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 69
    :cond_6
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getVersions()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getSelectedVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/pymcl/android/ui/state/LaunchGate;->resolveVersion(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_7

    .line 70
    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v2, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionMissing:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v5, Lcom/pymcl/android/ui/state/LaunchGate$Action;->DownloadGame:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getSelectedVersion()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v3, "\u300c{0}\u300d\u4e0d\u5728\u8fd9\u4e2a\u5b9e\u4f8b\u91cc\uff0c\u5148\u5230\u300c\u539f\u7248\u6e38\u620f\u300d\u5b89\u88c5\u4e00\u4e2a\u7248\u672c"

    invoke-static {v3, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x40

    const/4 v10, 0x0

    const-string v3, "\u4e0b\u8f7d\u6e38\u620f"

    const/4 v4, 0x1

    const-string v6, "\u672a\u9009\u62e9\u7248\u672c"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    .line 69
    :cond_7
    move-object v9, v0

    .line 71
    .local v9, "v":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getIncomplete()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v2, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v3, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->VersionIncomplete:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v6, Lcom/pymcl/android/ui/state/LaunchGate$Action;->Repair:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const-string v0, "\u300c{0}\u300d\u7684\u7248\u672c\u6587\u4ef6\u635f\u574f\u6216\u7f3a\u5c11\u7236\u7248\u672c\uff0c\u5230\u300c\u539f\u7248\u6e38\u620f\u300d\u91cd\u65b0\u5b89\u88c5"

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v4, "\u4fee\u590d\u7248\u672c"

    const/4 v5, 0x1

    const-string v7, "\u7248\u672c\u6587\u4ef6\u4e0d\u5b8c\u6574"

    invoke-direct/range {v2 .. v9}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 72
    :cond_8
    invoke-virtual {p1}, Lcom/pymcl/android/ui/state/LaunchGate$Input;->getHasAccount()Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v2, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v3, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->NoAccount:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v6, Lcom/pymcl/android/ui/state/LaunchGate$Action;->AddAccount:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const-string v7, "\u672a\u767b\u5f55"

    const-string v8, "\u542f\u52a8\u6e38\u620f\u524d\u9700\u8981\u5148\u521b\u5efa\u4e00\u4e2a\u79bb\u7ebf\u7528\u6237\uff08\u65e0\u6b63\u7248\u9a8c\u8bc1\uff09\u3002"

    const-string v4, "\u542f\u52a8\u6e38\u620f"

    const/4 v5, 0x1

    invoke-direct/range {v2 .. v9}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v2

    .line 73
    :cond_9
    new-instance v2, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    sget-object v3, Lcom/pymcl/android/ui/state/LaunchGate$Reason;->Ok:Lcom/pymcl/android/ui/state/LaunchGate$Reason;

    sget-object v6, Lcom/pymcl/android/ui/state/LaunchGate$Action;->Launch:Lcom/pymcl/android/ui/state/LaunchGate$Action;

    const/16 v10, 0x20

    const/4 v11, 0x0

    const-string v4, "\u542f\u52a8\u6e38\u620f"

    const/4 v5, 0x1

    const-string v7, "\u5c31\u7eea"

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Reason;Ljava/lang/String;ZLcom/pymcl/android/ui/state/LaunchGate$Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public final require(Lcom/pymcl/android/ui/state/LaunchGate$Input;)Ljava/lang/String;
    .locals 2
    .param p1, "i"    # Lcom/pymcl/android/ui/state/LaunchGate$Input;

    const-string v0, "i"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/state/LaunchGate;->check(Lcom/pymcl/android/ui/state/LaunchGate$Input;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    move-result-object v0

    .local v0, "v":Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getCanLaunch()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getVersion()Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_0
    new-instance v1, Lcom/pymcl/android/ui/state/LaunchGate$Blocked;

    invoke-direct {v1, v0}, Lcom/pymcl/android/ui/state/LaunchGate$Blocked;-><init>(Lcom/pymcl/android/ui/state/LaunchGate$Verdict;)V

    throw v1
.end method

.method public final resolveVersion(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .param p1, "versions"    # Ljava/util/List;
    .param p2, "selected"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "versions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, p2

    .line 82
    .local v0, "it\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 57
    .local v1, "$i$a$-takeIf-LaunchGate$resolveVersion$1\\1\\57\\0":I
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    .end local v0    # "it\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-takeIf-LaunchGate$resolveVersion$1\\1\\57\\0":I
    if-eqz v0, :cond_1

    move-object v0, p2

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method
