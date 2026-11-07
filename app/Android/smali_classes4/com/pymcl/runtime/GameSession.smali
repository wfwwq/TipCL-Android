.class public final Lcom/pymcl/runtime/GameSession;
.super Ljava/lang/Object;
.source "GameSession.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/runtime/GameSession$Companion;,
        Lcom/pymcl/runtime/GameSession$Info;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameSession.kt\ncom/pymcl/runtime/GameSession\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,87:1\n1#2:88\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\u0018\u0000 (2\u00020\u0001:\u0002\'(B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u0019J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0008\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0013J \u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u00150$2\u0008\u0008\u0002\u0010%\u001a\u00020\u001c2\u0008\u0008\u0002\u0010&\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0014\u0010\n\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0008R\u0014\u0010\u000e\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0008R\u0014\u0010\u0010\u001a\u00020\u00038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0008\u00a8\u0006)"
    }
    d2 = {
        "Lcom/pymcl/runtime/GameSession;",
        "",
        "dir",
        "Ljava/io/File;",
        "logFile",
        "<init>",
        "(Ljava/io/File;Ljava/io/File;)V",
        "getDir",
        "()Ljava/io/File;",
        "getLogFile",
        "props",
        "getProps",
        "exitFile",
        "getExitFile",
        "endFile",
        "getEndFile",
        "consumedFile",
        "getConsumedFile",
        "begin",
        "",
        "instance",
        "",
        "version",
        "gameDir",
        "startMs",
        "",
        "markExit",
        "code",
        "",
        "endMs",
        "hasExited",
        "",
        "read",
        "Lcom/pymcl/runtime/GameSession$Info;",
        "consume",
        "logTail",
        "",
        "maxLines",
        "maxBytes",
        "Info",
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
.field public static final Companion:Lcom/pymcl/runtime/GameSession$Companion;


# instance fields
.field private final dir:Ljava/io/File;

.field private final logFile:Ljava/io/File;


# direct methods
.method public static synthetic $r8$lambda$-YsWmRp790dpVVVlr4cVjSuHhuY(Ljava/util/Properties;Ljava/io/File;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameSession;->begin$lambda$1(Ljava/util/Properties;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SeJF_5HXPm1Jc30ISRrTj3l0PP8(ILjava/io/File;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/runtime/GameSession;->markExit$lambda$1(ILjava/io/File;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$y5ANgBd28qYYGgCEbrrmbe3ysWc(JLjava/io/File;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/pymcl/runtime/GameSession;->markExit$lambda$0(JLjava/io/File;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/pymcl/runtime/GameSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/runtime/GameSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/io/File;)V
    .locals 1
    .param p1, "dir"    # Ljava/io/File;
    .param p2, "logFile"    # Ljava/io/File;

    const-string v0, "dir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logFile"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    iput-object p2, p0, Lcom/pymcl/runtime/GameSession;->logFile:Ljava/io/File;

    return-void
.end method

.method public static synthetic begin$default(Lcom/pymcl/runtime/GameSession;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/Object;)V
    .locals 6

    .line 29
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    :cond_0
    move-wide v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/runtime/GameSession;->begin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method private static final begin$lambda$1(Ljava/util/Properties;Ljava/io/File;)Lkotlin/Unit;
    .locals 5
    .param p0, "$p"    # Ljava/util/Properties;
    .param p1, "f"    # Ljava/io/File;

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/io/FileOutputStream;

    .line 33
    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/FileOutputStream;

    .line 88
    .local v1, "it":Ljava/io/FileOutputStream;
    const/4 v2, 0x0

    .line 33
    .local v2, "$i$a$-use-GameSession$begin$1$1":I
    move-object v3, v1

    check-cast v3, Ljava/io/OutputStream;

    const-string v4, "PyMCL game session"

    invoke-virtual {p0, v3, v4}, Ljava/util/Properties;->store(Ljava/io/OutputStream;Ljava/lang/String;)V

    .end local v1    # "it":Ljava/io/FileOutputStream;
    .end local v2    # "$i$a$-use-GameSession$begin$1$1":I
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :catchall_0
    move-exception v1

    .end local p0    # "$p":Ljava/util/Properties;
    .end local p1    # "f":Ljava/io/File;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local p0    # "$p":Ljava/util/Properties;
    .restart local p1    # "f":Ljava/io/File;
    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private final getConsumedFile()Ljava/io/File;
    .locals 3

    .line 26
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    const-string v2, "consumed"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getEndFile()Ljava/io/File;
    .locals 3

    .line 25
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    const-string v2, "end"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getExitFile()Ljava/io/File;
    .locals 3

    .line 24
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    const-string v2, "exit"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getProps()Ljava/io/File;
    .locals 3

    .line 23
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    const-string v2, "session.properties"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic logTail$default(Lcom/pymcl/runtime/GameSession;IIILjava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 59
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0xc8

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    const/high16 p2, 0x40000

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/runtime/GameSession;->logTail(II)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic markExit$default(Lcom/pymcl/runtime/GameSession;IJILjava/lang/Object;)V
    .locals 0

    .line 37
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/runtime/GameSession;->markExit(IJ)V

    return-void
.end method

.method private static final markExit$lambda$0(JLjava/io/File;)Lkotlin/Unit;
    .locals 3
    .param p0, "$endMs"    # J
    .param p2, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p2, v0, v1, v2, v1}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final markExit$lambda$1(ILjava/io/File;)Lkotlin/Unit;
    .locals 3
    .param p0, "$code"    # I
    .param p1, "it"    # Ljava/io/File;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final begin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 6
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "gameDir"    # Ljava/lang/String;
    .param p4, "startMs"    # J

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "version"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "gameDir"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iget-object v3, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 31
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getExitFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getEndFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getConsumedFile()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 32
    new-instance v3, Ljava/util/Properties;

    invoke-direct {v3}, Ljava/util/Properties;-><init>()V

    move-object v4, v3

    .line 88
    .local v4, "$this$begin_u24lambda_u240":Ljava/util/Properties;
    const/4 v5, 0x0

    .line 32
    .local v5, "$i$a$-apply-GameSession$begin$p$1":I
    invoke-virtual {v4, v0, p1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v1, p2}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v4, v2, p3}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "start"

    invoke-static {p4, p5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .end local v4    # "$this$begin_u24lambda_u240":Ljava/util/Properties;
    .end local v5    # "$i$a$-apply-GameSession$begin$p$1":I
    .local v3, "p":Ljava/util/Properties;
    sget-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getProps()Ljava/io/File;

    move-result-object v1

    new-instance v2, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda2;

    invoke-direct {v2, v3}, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda2;-><init>(Ljava/util/Properties;)V

    invoke-static {v0, v1, v2}, Lcom/pymcl/runtime/GameSession$Companion;->access$atomic(Lcom/pymcl/runtime/GameSession$Companion;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    .line 34
    return-void
.end method

.method public final consume()V
    .locals 4

    .line 56
    iget-object v0, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getConsumedFile()Ljava/io/File;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    return-void
.end method

.method public final getDir()Ljava/io/File;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    return-object v0
.end method

.method public final getLogFile()Ljava/io/File;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/pymcl/runtime/GameSession;->logFile:Ljava/io/File;

    return-object v0
.end method

.method public final hasExited()Z
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getExitFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    return v0
.end method

.method public final logTail(II)Ljava/util/List;
    .locals 2
    .param p1, "maxLines"    # I
    .param p2, "maxBytes"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 59
    sget-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    iget-object v1, p0, Lcom/pymcl/runtime/GameSession;->logFile:Ljava/io/File;

    invoke-virtual {v0, v1, p1, p2}, Lcom/pymcl/runtime/GameSession$Companion;->tail(Ljava/io/File;II)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final markExit(IJ)V
    .locals 3
    .param p1, "code"    # I
    .param p2, "endMs"    # J

    .line 38
    iget-object v0, p0, Lcom/pymcl/runtime/GameSession;->dir:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 39
    sget-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getEndFile()Ljava/io/File;

    move-result-object v1

    new-instance v2, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda0;

    invoke-direct {v2, p2, p3}, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda0;-><init>(J)V

    invoke-static {v0, v1, v2}, Lcom/pymcl/runtime/GameSession$Companion;->access$atomic(Lcom/pymcl/runtime/GameSession$Companion;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    .line 40
    sget-object v0, Lcom/pymcl/runtime/GameSession;->Companion:Lcom/pymcl/runtime/GameSession$Companion;

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getExitFile()Ljava/io/File;

    move-result-object v1

    new-instance v2, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda1;

    invoke-direct {v2, p1}, Lcom/pymcl/runtime/GameSession$$ExternalSyntheticLambda1;-><init>(I)V

    invoke-static {v0, v1, v2}, Lcom/pymcl/runtime/GameSession$Companion;->access$atomic(Lcom/pymcl/runtime/GameSession$Companion;Ljava/io/File;Lkotlin/jvm/functions/Function1;)V

    .line 41
    return-void
.end method

.method public final read()Lcom/pymcl/runtime/GameSession$Info;
    .locals 12

    .line 47
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getProps()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getConsumedFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    .line 48
    :cond_0
    new-instance v0, Ljava/util/Properties;

    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    move-object v2, v0

    .line 88
    .local v2, "$this$read_u24lambda_u240":Ljava/util/Properties;
    const/4 v3, 0x0

    .local v3, "$i$a$-apply-GameSession$read$p$1":I
    new-instance v4, Ljava/io/FileInputStream;

    .line 48
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getProps()Ljava/io/File;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    check-cast v4, Ljava/io/Closeable;

    :try_start_0
    move-object v5, v4

    check-cast v5, Ljava/io/FileInputStream;

    .line 88
    .local v5, "it":Ljava/io/FileInputStream;
    const/4 v6, 0x0

    .line 48
    .local v6, "$i$a$-use-GameSession$read$p$1$1":I
    move-object v7, v5

    check-cast v7, Ljava/io/InputStream;

    invoke-virtual {v2, v7}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .end local v5    # "it":Ljava/io/FileInputStream;
    .end local v6    # "$i$a$-use-GameSession$read$p$1$1":I
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 49
    .end local v2    # "$this$read_u24lambda_u240":Ljava/util/Properties;
    .end local v3    # "$i$a$-apply-GameSession$read$p$1":I
    .local v0, "p":Ljava/util/Properties;
    const-string v2, "instance"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "getProperty(...)"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "version"

    invoke-virtual {v0, v4, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "gameDir"

    invoke-virtual {v0, v4, v3}, Ljava/util/Properties;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    const-string v2, "start"

    invoke-virtual {v0, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    .line 51
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getExitFile()Ljava/io/File;

    move-result-object v2

    .line 88
    move-object v3, v2

    .local v3, "it":Ljava/io/File;
    const/4 v4, 0x0

    .line 51
    .local v4, "$i$a$-takeIf-GameSession$read$1":I
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    move-result v3

    .end local v3    # "it":Ljava/io/File;
    .end local v4    # "$i$a$-takeIf-GameSession$read$1":I
    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    const/4 v3, 0x1

    if-eqz v2, :cond_2

    invoke-static {v2, v1, v3, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    move-object v10, v2

    goto :goto_1

    :cond_2
    move-object v10, v1

    .line 52
    :goto_1
    invoke-direct {p0}, Lcom/pymcl/runtime/GameSession;->getEndFile()Ljava/io/File;

    move-result-object v2

    .line 88
    move-object v4, v2

    .local v4, "it":Ljava/io/File;
    const/4 v11, 0x0

    .line 52
    .local v11, "$i$a$-takeIf-GameSession$read$2":I
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v4

    .end local v4    # "it":Ljava/io/File;
    .end local v11    # "$i$a$-takeIf-GameSession$read$2":I
    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_4

    invoke-static {v2, v1, v3, v1}, Lkotlin/io/FilesKt;->readText$default(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-static {v2}, Lkotlin/text/StringsKt;->toLongOrNull(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v1

    :cond_4
    move-object v11, v1

    .line 49
    new-instance v4, Lcom/pymcl/runtime/GameSession$Info;

    invoke-direct/range {v4 .. v11}, Lcom/pymcl/runtime/GameSession$Info;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/Long;)V

    return-object v4

    .line 50
    :cond_5
    return-object v1

    .line 48
    .end local v0    # "p":Ljava/util/Properties;
    .restart local v2    # "$this$read_u24lambda_u240":Ljava/util/Properties;
    .local v3, "$i$a$-apply-GameSession$read$p$1":I
    :catchall_0
    move-exception v0

    move-object v1, v0

    .end local v2    # "$this$read_u24lambda_u240":Ljava/util/Properties;
    .end local v3    # "$i$a$-apply-GameSession$read$p$1":I
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v2    # "$this$read_u24lambda_u240":Ljava/util/Properties;
    .restart local v3    # "$i$a$-apply-GameSession$read$p$1":I
    :catchall_1
    move-exception v0

    invoke-static {v4, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .line 47
    .end local v2    # "$this$read_u24lambda_u240":Ljava/util/Properties;
    .end local v3    # "$i$a$-apply-GameSession$read$p$1":I
    :cond_6
    :goto_3
    return-object v1
.end method
